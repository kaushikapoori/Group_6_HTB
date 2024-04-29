package d0;

import y.g;
import z.f;

public class b implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f2838b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2839c;

    public b(c cVar, m mVar, int i2) {
        this.f2838b = mVar;
        this.f2839c = i2;
    }

    public void run() {
        m mVar = this.f2838b;
        int i2 = this.f2839c;
        g.c cVar = ((f.a) mVar).f4401a;
        if (cVar != null) {
            cVar.d(i2);
        }
    }
}
