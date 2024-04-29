package h;

import android.view.View;
import android.view.animation.Interpolator;
import g0.x;
import g0.y;
import g0.z;
import java.util.ArrayList;
import java.util.Iterator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<x> f3145a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public long f3146b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f3147c;

    /* renamed from: d  reason: collision with root package name */
    public y f3148d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3149e;

    /* renamed from: f  reason: collision with root package name */
    public final z f3150f = new a();

    public class a extends z {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3151a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f3152b = 0;

        public a() {
        }

        public void a(View view) {
            int i2 = this.f3152b + 1;
            this.f3152b = i2;
            if (i2 == h.this.f3145a.size()) {
                y yVar = h.this.f3148d;
                if (yVar != null) {
                    yVar.a((View) null);
                }
                this.f3152b = 0;
                this.f3151a = false;
                h.this.f3149e = false;
            }
        }

        public void b(View view) {
            if (!this.f3151a) {
                this.f3151a = true;
                y yVar = h.this.f3148d;
                if (yVar != null) {
                    yVar.b((View) null);
                }
            }
        }
    }

    public void a() {
        if (this.f3149e) {
            Iterator<x> it = this.f3145a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f3149e = false;
        }
    }

    public void b() {
        View view;
        if (!this.f3149e) {
            Iterator<x> it = this.f3145a.iterator();
            while (it.hasNext()) {
                x next = it.next();
                long j2 = this.f3146b;
                if (j2 >= 0) {
                    next.c(j2);
                }
                Interpolator interpolator = this.f3147c;
                if (!(interpolator == null || (view = (View) next.f3085a.get()) == null)) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.f3148d != null) {
                    next.d(this.f3150f);
                }
                View view2 = (View) next.f3085a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f3149e = true;
        }
    }
}
