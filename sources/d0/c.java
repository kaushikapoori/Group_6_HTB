package d0;

import android.os.Handler;
import d0.j;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final m f2840a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2841b;

    public c(m mVar, Handler handler) {
        this.f2840a = mVar;
        this.f2841b = handler;
    }

    public void a(j.a aVar) {
        int i2 = aVar.f2863b;
        if (i2 == 0) {
            this.f2841b.post(new a(this, this.f2840a, aVar.f2862a));
            return;
        }
        this.f2841b.post(new b(this, this.f2840a, i2));
    }
}
