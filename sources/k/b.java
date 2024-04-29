package k;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f3281b;

    /* renamed from: c  reason: collision with root package name */
    public c<K, V> f3282c;

    /* renamed from: d  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f3283d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public int f3284e = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> b(c<K, V> cVar) {
            return cVar.f3288e;
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.f3287d;
        }
    }

    /* renamed from: k.b$b  reason: collision with other inner class name */
    public static class C0038b<K, V> extends e<K, V> {
        public C0038b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> b(c<K, V> cVar) {
            return cVar.f3287d;
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.f3288e;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public final K f3285b;

        /* renamed from: c  reason: collision with root package name */
        public final V f3286c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f3287d;

        /* renamed from: e  reason: collision with root package name */
        public c<K, V> f3288e;

        public c(K k2, V v2) {
            this.f3285b = k2;
            this.f3286c = v2;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f3285b.equals(cVar.f3285b) && this.f3286c.equals(cVar.f3286c);
        }

        public K getKey() {
            return this.f3285b;
        }

        public V getValue() {
            return this.f3286c;
        }

        public int hashCode() {
            return this.f3285b.hashCode() ^ this.f3286c.hashCode();
        }

        public V setValue(V v2) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f3285b + "=" + this.f3286c;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f3289b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3290c = true;

        public d() {
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f3289b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f3288e;
                this.f3289b = cVar3;
                this.f3290c = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (this.f3290c) {
                return b.this.f3281b != null;
            }
            c<K, V> cVar = this.f3289b;
            return (cVar == null || cVar.f3287d == null) ? false : true;
        }

        public Object next() {
            c<K, V> cVar;
            if (this.f3290c) {
                this.f3290c = false;
                cVar = b.this.f3281b;
            } else {
                c<K, V> cVar2 = this.f3289b;
                cVar = cVar2 != null ? cVar2.f3287d : null;
            }
            this.f3289b = cVar;
            return cVar;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f3292b;

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f3293c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f3292b = cVar2;
            this.f3293c = cVar;
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f3292b == cVar && cVar == this.f3293c) {
                this.f3293c = null;
                this.f3292b = null;
            }
            c<K, V> cVar3 = this.f3292b;
            if (cVar3 == cVar) {
                this.f3292b = b(cVar3);
            }
            c<K, V> cVar4 = this.f3293c;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f3292b;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.f3293c = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.f3293c != null;
        }

        public Object next() {
            c<K, V> cVar = this.f3293c;
            c<K, V> cVar2 = this.f3292b;
            this.f3293c = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> a(K k2) {
        c<K, V> cVar = this.f3281b;
        while (cVar != null && !cVar.f3285b.equals(k2)) {
            cVar = cVar.f3287d;
        }
        return cVar;
    }

    public b<K, V>.d b() {
        b<K, V>.d dVar = new d();
        this.f3283d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public c<K, V> c(K k2, V v2) {
        c<K, V> cVar = new c<>(k2, v2);
        this.f3284e++;
        c<K, V> cVar2 = this.f3282c;
        if (cVar2 == null) {
            this.f3281b = cVar;
        } else {
            cVar2.f3287d = cVar;
            cVar.f3288e = cVar2;
        }
        this.f3282c = cVar;
        return cVar;
    }

    public V d(K k2, V v2) {
        c a2 = a(k2);
        if (a2 != null) {
            return a2.f3286c;
        }
        c(k2, v2);
        return null;
    }

    public V e(K k2) {
        c a2 = a(k2);
        if (a2 == null) {
            return null;
        }
        this.f3284e--;
        if (!this.f3283d.isEmpty()) {
            for (f<K, V> a3 : this.f3283d.keySet()) {
                a3.a(a2);
            }
        }
        c<K, V> cVar = a2.f3288e;
        c<K, V> cVar2 = a2.f3287d;
        if (cVar != null) {
            cVar.f3287d = cVar2;
        } else {
            this.f3281b = cVar2;
        }
        c<K, V> cVar3 = a2.f3287d;
        if (cVar3 != null) {
            cVar3.f3288e = cVar;
        } else {
            this.f3282c = cVar;
        }
        a2.f3287d = null;
        a2.f3288e = null;
        return a2.f3286c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((k.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof k.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            k.b r7 = (k.b) r7
            int r1 = r6.f3284e
            int r3 = r7.f3284e
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            k.b$e r3 = (k.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            k.b$e r4 = (k.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            k.b$e r7 = (k.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k.b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Iterator it = iterator();
        int i2 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f3281b, this.f3282c);
        this.f3283d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public String toString() {
        StringBuilder a2 = androidx.activity.result.a.a("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                a2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    a2.append(", ");
                }
            } else {
                a2.append("]");
                return a2.toString();
            }
        }
    }
}
