package androidx.fragment.app;

import androidx.fragment.app.b0;
import androidx.fragment.app.q0;
import c0.b;

public class k0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q0.a f1350b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f1351c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f1352d;

    public k0(q0.a aVar, n nVar, b bVar) {
        this.f1350b = aVar;
        this.f1351c = nVar;
        this.f1352d = bVar;
    }

    public void run() {
        ((b0.d) this.f1350b).a(this.f1351c, this.f1352d);
    }
}
