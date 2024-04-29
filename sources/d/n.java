package d;

import android.view.View;
import g0.u;
import g0.x;
import g0.y;
import g0.z;

public class n implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f2764b;

    public class a extends z {
        public a() {
        }

        public void a(View view) {
            n.this.f2764b.f2720p.setAlpha(1.0f);
            n.this.f2764b.f2723s.d((y) null);
            n.this.f2764b.f2723s = null;
        }

        public void b(View view) {
            n.this.f2764b.f2720p.setVisibility(0);
        }
    }

    public n(k kVar) {
        this.f2764b = kVar;
    }

    public void run() {
        k kVar = this.f2764b;
        kVar.f2721q.showAtLocation(kVar.f2720p, 55, 0, 0);
        this.f2764b.I();
        if (this.f2764b.V()) {
            this.f2764b.f2720p.setAlpha(0.0f);
            k kVar2 = this.f2764b;
            x b2 = u.b(kVar2.f2720p);
            b2.a(1.0f);
            kVar2.f2723s = b2;
            x xVar = this.f2764b.f2723s;
            a aVar = new a();
            View view = (View) xVar.f3085a.get();
            if (view != null) {
                xVar.e(view, aVar);
                return;
            }
            return;
        }
        this.f2764b.f2720p.setAlpha(1.0f);
        this.f2764b.f2720p.setVisibility(0);
    }
}
