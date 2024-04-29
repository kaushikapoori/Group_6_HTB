package androidx.fragment.app;

import androidx.fragment.app.b0;
import androidx.fragment.app.q0;
import c0.b;

public class m0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q0.a f1368b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f1369c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f1370d;

    public m0(q0.a aVar, n nVar, b bVar) {
        this.f1368b = aVar;
        this.f1369c = nVar;
        this.f1370d = bVar;
    }

    public void run() {
        ((b0.d) this.f1368b).a(this.f1369c, this.f1370d);
    }
}
