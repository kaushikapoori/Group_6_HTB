package androidx.fragment.app;

import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.savedstate.a;
import androidx.savedstate.b;
import androidx.savedstate.c;

public class v0 implements c, z {

    /* renamed from: b  reason: collision with root package name */
    public final y f1497b;

    /* renamed from: c  reason: collision with root package name */
    public l f1498c = null;

    /* renamed from: d  reason: collision with root package name */
    public b f1499d = null;

    public v0(n nVar, y yVar) {
        this.f1497b = yVar;
    }

    public g a() {
        e();
        return this.f1498c;
    }

    public void b(g.b bVar) {
        l lVar = this.f1498c;
        lVar.c("handleLifecycleEvent");
        lVar.f(bVar.a());
    }

    public a d() {
        e();
        return this.f1499d.f2016b;
    }

    public void e() {
        if (this.f1498c == null) {
            this.f1498c = new l(this);
            this.f1499d = new b(this);
        }
    }

    public y f() {
        e();
        return this.f1497b;
    }
}
