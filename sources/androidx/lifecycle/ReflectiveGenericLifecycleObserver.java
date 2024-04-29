package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.g;

@Deprecated
class ReflectiveGenericLifecycleObserver implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1558a;

    /* renamed from: b  reason: collision with root package name */
    public final a.C0010a f1559b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1558a = obj;
        this.f1559b = a.f1564c.b(obj.getClass());
    }

    public void g(k kVar, g.b bVar) {
        a.C0010a aVar = this.f1559b;
        Object obj = this.f1558a;
        a.C0010a.a(aVar.f1567a.get(bVar), kVar, bVar, obj);
        a.C0010a.a(aVar.f1567a.get(g.b.ON_ANY), kVar, bVar, obj);
    }
}
