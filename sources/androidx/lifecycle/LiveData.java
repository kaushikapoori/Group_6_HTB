package androidx.lifecycle;

import android.util.Log;
import android.view.View;
import androidx.fragment.app.b0;
import androidx.fragment.app.l;
import androidx.lifecycle.g;
import java.util.Map;
import java.util.Objects;
import z.d;

public abstract class LiveData<T> {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f1542j = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f1543a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public k.b<p<? super T>, LiveData<T>.b> f1544b = new k.b<>();

    /* renamed from: c  reason: collision with root package name */
    public int f1545c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1546d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f1547e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f1548f;

    /* renamed from: g  reason: collision with root package name */
    public int f1549g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1550h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1551i;

    public class LifecycleBoundObserver extends LiveData<T>.b implements i {

        /* renamed from: e  reason: collision with root package name */
        public final k f1552e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ LiveData f1553f;

        public void g(k kVar, g.b bVar) {
            g.c cVar = ((l) this.f1552e.a()).f1581b;
            if (cVar == g.c.DESTROYED) {
                this.f1553f.g(this.f1554a);
                return;
            }
            g.c cVar2 = null;
            while (cVar2 != cVar) {
                h(j());
                cVar2 = cVar;
                cVar = ((l) this.f1552e.a()).f1581b;
            }
        }

        public void i() {
            l lVar = (l) this.f1552e.a();
            lVar.c("removeObserver");
            lVar.f1580a.e(this);
        }

        public boolean j() {
            return ((l) this.f1552e.a()).f1581b.compareTo(g.c.STARTED) >= 0;
        }
    }

    public class a extends LiveData<T>.b {
        public a(LiveData liveData, p<? super T> pVar) {
            super(pVar);
        }

        public boolean j() {
            return true;
        }
    }

    public abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final p<? super T> f1554a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1555b;

        /* renamed from: c  reason: collision with root package name */
        public int f1556c = -1;

        public b(p<? super T> pVar) {
            this.f1554a = pVar;
        }

        public void h(boolean z2) {
            if (z2 != this.f1555b) {
                this.f1555b = z2;
                LiveData liveData = LiveData.this;
                int i2 = z2 ? 1 : -1;
                int i3 = liveData.f1545c;
                liveData.f1545c = i2 + i3;
                if (!liveData.f1546d) {
                    liveData.f1546d = true;
                    while (true) {
                        try {
                            int i4 = liveData.f1545c;
                            if (i3 == i4) {
                                break;
                            }
                            boolean z3 = i3 == 0 && i4 > 0;
                            boolean z4 = i3 > 0 && i4 == 0;
                            if (z3) {
                                liveData.e();
                            } else if (z4) {
                                liveData.f();
                            }
                            i3 = i4;
                        } finally {
                            liveData.f1546d = false;
                        }
                    }
                }
                if (this.f1555b) {
                    LiveData.this.c(this);
                }
            }
        }

        public void i() {
        }

        public abstract boolean j();
    }

    public LiveData() {
        Object obj = f1542j;
        this.f1548f = obj;
        this.f1547e = obj;
        this.f1549g = -1;
    }

    public static void a(String str) {
        if (!j.a.f().b()) {
            throw new IllegalStateException(d.a("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.b bVar) {
        if (bVar.f1555b) {
            if (!bVar.j()) {
                bVar.h(false);
                return;
            }
            int i2 = bVar.f1556c;
            int i3 = this.f1549g;
            if (i2 < i3) {
                bVar.f1556c = i3;
                p<? super T> pVar = bVar.f1554a;
                Object obj = this.f1547e;
                l.d dVar = (l.d) pVar;
                Objects.requireNonNull(dVar);
                if (((k) obj) != null) {
                    l lVar = l.this;
                    if (lVar.f1353a0) {
                        View V = lVar.V();
                        if (V.getParent() != null) {
                            throw new IllegalStateException("DialogFragment can not be attached to a container view");
                        } else if (l.this.f1357e0 != null) {
                            if (b0.M(3)) {
                                Log.d("FragmentManager", "DialogFragment " + dVar + " setting the content view on " + l.this.f1357e0);
                            }
                            l.this.f1357e0.setContentView(V);
                        }
                    }
                }
            }
        }
    }

    public void c(LiveData<T>.b bVar) {
        if (this.f1550h) {
            this.f1551i = true;
            return;
        }
        this.f1550h = true;
        do {
            this.f1551i = false;
            if (bVar == null) {
                k.b<K, V>.d b2 = this.f1544b.b();
                while (b2.hasNext()) {
                    b((b) ((Map.Entry) b2.next()).getValue());
                    if (this.f1551i) {
                        break;
                    }
                }
            } else {
                b(bVar);
                bVar = null;
            }
        } while (this.f1551i);
        this.f1550h = false;
    }

    public void d(p<? super T> pVar) {
        a("observeForever");
        a aVar = new a(this, pVar);
        b d2 = this.f1544b.d(pVar, aVar);
        if (d2 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (d2 == null) {
            aVar.h(true);
        }
    }

    public void e() {
    }

    public void f() {
    }

    public void g(p<? super T> pVar) {
        a("removeObserver");
        b e2 = this.f1544b.e(pVar);
        if (e2 != null) {
            e2.i();
            e2.h(false);
        }
    }
}
