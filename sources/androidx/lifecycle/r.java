package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.t;

public class r implements k {

    /* renamed from: j  reason: collision with root package name */
    public static final r f1592j = new r();

    /* renamed from: b  reason: collision with root package name */
    public int f1593b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1594c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1595d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1596e = true;

    /* renamed from: f  reason: collision with root package name */
    public Handler f1597f;

    /* renamed from: g  reason: collision with root package name */
    public final l f1598g = new l(this);

    /* renamed from: h  reason: collision with root package name */
    public Runnable f1599h = new a();

    /* renamed from: i  reason: collision with root package name */
    public t.a f1600i = new b();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            r rVar = r.this;
            if (rVar.f1594c == 0) {
                rVar.f1595d = true;
                rVar.f1598g.d(g.b.ON_PAUSE);
            }
            r rVar2 = r.this;
            if (rVar2.f1593b == 0 && rVar2.f1595d) {
                rVar2.f1598g.d(g.b.ON_STOP);
                rVar2.f1596e = true;
            }
        }
    }

    public class b implements t.a {
        public b() {
        }
    }

    public g a() {
        return this.f1598g;
    }

    public void b() {
        int i2 = this.f1594c + 1;
        this.f1594c = i2;
        if (i2 != 1) {
            return;
        }
        if (this.f1595d) {
            this.f1598g.d(g.b.ON_RESUME);
            this.f1595d = false;
            return;
        }
        this.f1597f.removeCallbacks(this.f1599h);
    }

    public void e() {
        int i2 = this.f1593b + 1;
        this.f1593b = i2;
        if (i2 == 1 && this.f1596e) {
            this.f1598g.d(g.b.ON_START);
            this.f1596e = false;
        }
    }
}
