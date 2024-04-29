package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.g;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k.b;
import z.d;

public class l extends g {

    /* renamed from: a  reason: collision with root package name */
    public k.a<j, a> f1580a = new k.a<>();

    /* renamed from: b  reason: collision with root package name */
    public g.c f1581b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<k> f1582c;

    /* renamed from: d  reason: collision with root package name */
    public int f1583d = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1584e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1585f = false;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<g.c> f1586g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1587h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public g.c f1588a;

        /* renamed from: b  reason: collision with root package name */
        public i f1589b;

        public a(j jVar, g.c cVar) {
            i iVar;
            Map<Class<?>, Integer> map = n.f1590a;
            boolean z2 = jVar instanceof i;
            boolean z3 = jVar instanceof e;
            if (z2 && z3) {
                iVar = new FullLifecycleObserverAdapter((e) jVar, (i) jVar);
            } else if (z3) {
                iVar = new FullLifecycleObserverAdapter((e) jVar, (i) null);
            } else if (z2) {
                iVar = (i) jVar;
            } else {
                Class<?> cls = jVar.getClass();
                if (n.c(cls) == 2) {
                    List list = (List) ((HashMap) n.f1591b).get(cls);
                    if (list.size() == 1) {
                        iVar = new SingleGeneratedAdapterObserver(n.a((Constructor) list.get(0), jVar));
                    } else {
                        f[] fVarArr = new f[list.size()];
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            fVarArr[i2] = n.a((Constructor) list.get(i2), jVar);
                        }
                        iVar = new CompositeGeneratedAdaptersObserver(fVarArr);
                    }
                } else {
                    iVar = new ReflectiveGenericLifecycleObserver(jVar);
                }
            }
            this.f1589b = iVar;
            this.f1588a = cVar;
        }

        public void a(k kVar, g.b bVar) {
            g.c a2 = bVar.a();
            this.f1588a = l.e(this.f1588a, a2);
            this.f1589b.g(kVar, bVar);
            this.f1588a = a2;
        }
    }

    public l(k kVar) {
        this.f1582c = new WeakReference<>(kVar);
        this.f1581b = g.c.INITIALIZED;
        this.f1587h = true;
    }

    public static g.c e(g.c cVar, g.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    public void a(j jVar) {
        k kVar;
        c("addObserver");
        g.c cVar = this.f1581b;
        g.c cVar2 = g.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = g.c.INITIALIZED;
        }
        a aVar = new a(jVar, cVar2);
        if (this.f1580a.d(jVar, aVar) == null && (kVar = (k) this.f1582c.get()) != null) {
            boolean z2 = this.f1583d != 0 || this.f1584e;
            g.c b2 = b(jVar);
            this.f1583d++;
            while (aVar.f1588a.compareTo(b2) < 0 && this.f1580a.f3280f.containsKey(jVar)) {
                this.f1586g.add(aVar.f1588a);
                g.b b3 = g.b.b(aVar.f1588a);
                if (b3 != null) {
                    aVar.a(kVar, b3);
                    g();
                    b2 = b(jVar);
                } else {
                    StringBuilder a2 = androidx.activity.result.a.a("no event up from ");
                    a2.append(aVar.f1588a);
                    throw new IllegalStateException(a2.toString());
                }
            }
            if (!z2) {
                h();
            }
            this.f1583d--;
        }
    }

    public final g.c b(j jVar) {
        k.a<j, a> aVar = this.f1580a;
        g.c cVar = null;
        b.c<K, V> cVar2 = aVar.f3280f.containsKey(jVar) ? aVar.f3280f.get(jVar).f3288e : null;
        g.c cVar3 = cVar2 != null ? ((a) cVar2.f3286c).f1588a : null;
        if (!this.f1586g.isEmpty()) {
            ArrayList<g.c> arrayList = this.f1586g;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return e(e(this.f1581b, cVar3), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    public final void c(String str) {
        if (this.f1587h && !j.a.f().b()) {
            throw new IllegalStateException(d.a("Method ", str, " must be called on the main thread"));
        }
    }

    public void d(g.b bVar) {
        c("handleLifecycleEvent");
        f(bVar.a());
    }

    public final void f(g.c cVar) {
        if (this.f1581b != cVar) {
            this.f1581b = cVar;
            if (this.f1584e || this.f1583d != 0) {
                this.f1585f = true;
                return;
            }
            this.f1584e = true;
            h();
            this.f1584e = false;
        }
    }

    public final void g() {
        ArrayList<g.c> arrayList = this.f1586g;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void h() {
        g.c cVar;
        k kVar = (k) this.f1582c.get();
        if (kVar != null) {
            while (true) {
                k.a<j, a> aVar = this.f1580a;
                boolean z2 = true;
                if (!(aVar.f3284e == 0 || (((a) aVar.f3281b.f3286c).f1588a == (cVar = ((a) aVar.f3282c.f3286c).f1588a) && this.f1581b == cVar))) {
                    z2 = false;
                }
                this.f1585f = false;
                if (!z2) {
                    if (this.f1581b.compareTo(((a) aVar.f3281b.f3286c).f1588a) < 0) {
                        k.a<j, a> aVar2 = this.f1580a;
                        b.C0038b bVar = new b.C0038b(aVar2.f3282c, aVar2.f3281b);
                        aVar2.f3283d.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.f1585f) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            a aVar3 = (a) entry.getValue();
                            while (aVar3.f1588a.compareTo(this.f1581b) > 0 && !this.f1585f && this.f1580a.contains((j) entry.getKey())) {
                                int ordinal = aVar3.f1588a.ordinal();
                                g.b bVar2 = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : g.b.ON_PAUSE : g.b.ON_STOP : g.b.ON_DESTROY;
                                if (bVar2 != null) {
                                    this.f1586g.add(bVar2.a());
                                    aVar3.a(kVar, bVar2);
                                    g();
                                } else {
                                    StringBuilder a2 = androidx.activity.result.a.a("no event down from ");
                                    a2.append(aVar3.f1588a);
                                    throw new IllegalStateException(a2.toString());
                                }
                            }
                        }
                    }
                    b.c<K, V> cVar2 = this.f1580a.f3282c;
                    if (!this.f1585f && cVar2 != null && this.f1581b.compareTo(((a) cVar2.f3286c).f1588a) > 0) {
                        b<K, V>.d b2 = this.f1580a.b();
                        while (b2.hasNext() && !this.f1585f) {
                            Map.Entry entry2 = (Map.Entry) b2.next();
                            a aVar4 = (a) entry2.getValue();
                            while (aVar4.f1588a.compareTo(this.f1581b) < 0 && !this.f1585f && this.f1580a.contains((j) entry2.getKey())) {
                                this.f1586g.add(aVar4.f1588a);
                                g.b b3 = g.b.b(aVar4.f1588a);
                                if (b3 != null) {
                                    aVar4.a(kVar, b3);
                                    g();
                                } else {
                                    StringBuilder a3 = androidx.activity.result.a.a("no event up from ");
                                    a3.append(aVar4.f1588a);
                                    throw new IllegalStateException(a3.toString());
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
    }
}
