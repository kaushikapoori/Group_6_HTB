package m;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import m.g;

public class a<K, V> extends h<K, V> implements Map<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public g<K, V> f3328i;

    /* renamed from: m.a$a  reason: collision with other inner class name */
    public class C0041a extends g<K, V> {
        public C0041a() {
        }

        public void a() {
            a.this.clear();
        }

        public Object b(int i2, int i3) {
            return a.this.f3376c[(i2 << 1) + i3];
        }

        public Map<K, V> c() {
            return a.this;
        }

        public int d() {
            return a.this.f3377d;
        }

        public int e(Object obj) {
            return a.this.e(obj);
        }

        public int f(Object obj) {
            return a.this.g(obj);
        }

        public void g(K k2, V v2) {
            a.this.put(k2, v2);
        }

        public void h(int i2) {
            a.this.i(i2);
        }

        public V i(int i2, V v2) {
            int i3 = (i2 << 1) + 1;
            V[] vArr = a.this.f3376c;
            V v3 = vArr[i3];
            vArr[i3] = v2;
            return v3;
        }
    }

    public a() {
    }

    public a(int i2) {
        super(i2);
    }

    public a(h hVar) {
        if (hVar != null) {
            int i2 = hVar.f3377d;
            b(this.f3377d + i2);
            if (this.f3377d != 0) {
                for (int i3 = 0; i3 < i2; i3++) {
                    put(hVar.h(i3), hVar.k(i3));
                }
            } else if (i2 > 0) {
                System.arraycopy(hVar.f3375b, 0, this.f3375b, 0, i2);
                System.arraycopy(hVar.f3376c, 0, this.f3376c, 0, i2 << 1);
                this.f3377d = i2;
            }
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        g l2 = l();
        if (l2.f3356a == null) {
            l2.f3356a = new g.b();
        }
        return l2.f3356a;
    }

    public Set<K> keySet() {
        g l2 = l();
        if (l2.f3357b == null) {
            l2.f3357b = new g.c();
        }
        return l2.f3357b;
    }

    public final g<K, V> l() {
        if (this.f3328i == null) {
            this.f3328i = new C0041a();
        }
        return this.f3328i;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f3377d);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        g l2 = l();
        if (l2.f3358c == null) {
            l2.f3358c = new g.e();
        }
        return l2.f3358c;
    }
}
