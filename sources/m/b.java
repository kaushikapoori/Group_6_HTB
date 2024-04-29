package m;

import java.util.Map;

public class b extends g<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f3330d;

    public b(c cVar) {
        this.f3330d = cVar;
    }

    public void a() {
        this.f3330d.clear();
    }

    public Object b(int i2, int i3) {
        return this.f3330d.f3338c[i2];
    }

    public Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    public int d() {
        return this.f3330d.f3339d;
    }

    public int e(Object obj) {
        return this.f3330d.c(obj);
    }

    public int f(Object obj) {
        return this.f3330d.c(obj);
    }

    public void g(Object obj, Object obj2) {
        this.f3330d.add(obj);
    }

    public void h(int i2) {
        this.f3330d.f(i2);
    }

    public Object i(int i2, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
