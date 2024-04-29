package androidx.lifecycle;

import androidx.lifecycle.g;
import d.r;

class CompositeGeneratedAdaptersObserver implements i {

    /* renamed from: a  reason: collision with root package name */
    public final f[] f1538a;

    public CompositeGeneratedAdaptersObserver(f[] fVarArr) {
        this.f1538a = fVarArr;
    }

    public void g(k kVar, g.b bVar) {
        r rVar = new r(1);
        for (f a2 : this.f1538a) {
            a2.a(kVar, bVar, false, rVar);
        }
        for (f a3 : this.f1538a) {
            a3.a(kVar, bVar, true, rVar);
        }
    }
}
