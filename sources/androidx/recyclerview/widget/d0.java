package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import m.e;
import m.h;

public class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final h<RecyclerView.z, a> f1876a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final e<RecyclerView.z> f1877b = new e<>();

    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static n.e<a> f1878d = new n.e<>(20, 1);

        /* renamed from: a  reason: collision with root package name */
        public int f1879a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.i.c f1880b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.i.c f1881c;

        public static a a() {
            a aVar = (a) f1878d.a();
            return aVar == null ? new a() : aVar;
        }

        public static void b(a aVar) {
            aVar.f1879a = 0;
            aVar.f1880b = null;
            aVar.f1881c = null;
            f1878d.c(aVar);
        }
    }

    public interface b {
    }

    public void a(RecyclerView.z zVar) {
        a orDefault = this.f1876a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f1876a.put(zVar, orDefault);
        }
        orDefault.f1879a |= 1;
    }

    public void b(RecyclerView.z zVar, RecyclerView.i.c cVar) {
        a orDefault = this.f1876a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f1876a.put(zVar, orDefault);
        }
        orDefault.f1881c = cVar;
        orDefault.f1879a |= 8;
    }

    public void c(RecyclerView.z zVar, RecyclerView.i.c cVar) {
        a orDefault = this.f1876a.getOrDefault(zVar, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f1876a.put(zVar, orDefault);
        }
        orDefault.f1880b = cVar;
        orDefault.f1879a |= 4;
    }

    public boolean d(RecyclerView.z zVar) {
        a orDefault = this.f1876a.getOrDefault(zVar, null);
        return (orDefault == null || (orDefault.f1879a & 1) == 0) ? false : true;
    }

    public final RecyclerView.i.c e(RecyclerView.z zVar, int i2) {
        a k2;
        RecyclerView.i.c cVar;
        int e2 = this.f1876a.e(zVar);
        if (e2 >= 0 && (k2 = this.f1876a.k(e2)) != null) {
            int i3 = k2.f1879a;
            if ((i3 & i2) != 0) {
                int i4 = (~i2) & i3;
                k2.f1879a = i4;
                if (i2 == 4) {
                    cVar = k2.f1880b;
                } else if (i2 == 8) {
                    cVar = k2.f1881c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i4 & 12) == 0) {
                    this.f1876a.i(e2);
                    a.b(k2);
                }
                return cVar;
            }
        }
        return null;
    }

    public void f(RecyclerView.z zVar) {
        a orDefault = this.f1876a.getOrDefault(zVar, null);
        if (orDefault != null) {
            orDefault.f1879a &= -2;
        }
    }

    public void g(RecyclerView.z zVar) {
        int h2 = this.f1877b.h() - 1;
        while (true) {
            if (h2 < 0) {
                break;
            } else if (zVar == this.f1877b.i(h2)) {
                e<RecyclerView.z> eVar = this.f1877b;
                Object[] objArr = eVar.f3347d;
                Object obj = objArr[h2];
                Object obj2 = e.f3344f;
                if (obj != obj2) {
                    objArr[h2] = obj2;
                    eVar.f3345b = true;
                }
            } else {
                h2--;
            }
        }
        a remove = this.f1876a.remove(zVar);
        if (remove != null) {
            a.b(remove);
        }
    }
}
