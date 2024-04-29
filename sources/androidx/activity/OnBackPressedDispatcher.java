package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f59a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<b> f60b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements i, a {

        /* renamed from: a  reason: collision with root package name */
        public final g f61a;

        /* renamed from: b  reason: collision with root package name */
        public final b f62b;

        /* renamed from: c  reason: collision with root package name */
        public a f63c;

        public LifecycleOnBackPressedCancellable(g gVar, b bVar) {
            this.f61a = gVar;
            this.f62b = bVar;
            gVar.a(this);
        }

        public void cancel() {
            l lVar = (l) this.f61a;
            lVar.c("removeObserver");
            lVar.f1580a.e(this);
            this.f62b.f68b.remove(this);
            a aVar = this.f63c;
            if (aVar != null) {
                aVar.cancel();
                this.f63c = null;
            }
        }

        public void g(k kVar, g.b bVar) {
            if (bVar == g.b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar2 = this.f62b;
                onBackPressedDispatcher.f60b.add(bVar2);
                a aVar = new a(bVar2);
                bVar2.f68b.add(aVar);
                this.f63c = aVar;
            } else if (bVar == g.b.ON_STOP) {
                a aVar2 = this.f63c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (bVar == g.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    public class a implements a {

        /* renamed from: a  reason: collision with root package name */
        public final b f65a;

        public a(b bVar) {
            this.f65a = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f60b.remove(this.f65a);
            this.f65a.f68b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f59a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(k kVar, b bVar) {
        g a2 = kVar.a();
        if (((l) a2).f1581b != g.c.DESTROYED) {
            bVar.f68b.add(new LifecycleOnBackPressedCancellable(a2, bVar));
        }
    }

    public void b() {
        Iterator<b> descendingIterator = this.f60b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.f67a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f59a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
