package m;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public abstract class g<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public g<K, V>.b f3356a;

    /* renamed from: b  reason: collision with root package name */
    public g<K, V>.c f3357b;

    /* renamed from: c  reason: collision with root package name */
    public g<K, V>.e f3358c;

    public final class a<T> implements Iterator<T> {

        /* renamed from: b  reason: collision with root package name */
        public final int f3359b;

        /* renamed from: c  reason: collision with root package name */
        public int f3360c;

        /* renamed from: d  reason: collision with root package name */
        public int f3361d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3362e = false;

        public a(int i2) {
            this.f3359b = i2;
            this.f3360c = g.this.d();
        }

        public boolean hasNext() {
            return this.f3361d < this.f3360c;
        }

        public T next() {
            if (hasNext()) {
                T b2 = g.this.b(this.f3361d, this.f3359b);
                this.f3361d++;
                this.f3362e = true;
                return b2;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f3362e) {
                int i2 = this.f3361d - 1;
                this.f3361d = i2;
                this.f3360c--;
                this.f3362e = false;
                g.this.h(i2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d2 = g.this.d();
            for (Map.Entry entry : collection) {
                g.this.g(entry.getKey(), entry.getValue());
            }
            return d2 != g.this.d();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e2 = g.this.e(entry.getKey());
            if (e2 < 0) {
                return false;
            }
            return d.c(g.this.b(e2, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return g.j(this, obj);
        }

        public int hashCode() {
            int i2 = 0;
            for (int d2 = g.this.d() - 1; d2 >= 0; d2--) {
                Object b2 = g.this.b(d2, 0);
                Object b3 = g.this.b(d2, 1);
                i2 += (b2 == null ? 0 : b2.hashCode()) ^ (b3 == null ? 0 : b3.hashCode());
            }
            return i2;
        }

        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return g.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c implements Set<K> {
        public c() {
        }

        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            return g.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Map c2 = g.this.c();
            for (Object containsKey : collection) {
                if (!c2.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return g.j(this, obj);
        }

        public int hashCode() {
            int i2 = 0;
            for (int d2 = g.this.d() - 1; d2 >= 0; d2--) {
                Object b2 = g.this.b(d2, 0);
                i2 += b2 == null ? 0 : b2.hashCode();
            }
            return i2;
        }

        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e2 = g.this.e(obj);
            if (e2 < 0) {
                return false;
            }
            g.this.h(e2);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            Map c2 = g.this.c();
            int size = c2.size();
            for (Object remove : collection) {
                c2.remove(remove);
            }
            return size != c2.size();
        }

        public boolean retainAll(Collection<?> collection) {
            return g.k(g.this.c(), collection);
        }

        public int size() {
            return g.this.d();
        }

        public Object[] toArray() {
            return g.this.l(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return g.this.m(tArr, 0);
        }
    }

    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        public int f3366b;

        /* renamed from: c  reason: collision with root package name */
        public int f3367c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3368d = false;

        public d() {
            this.f3366b = g.this.d() - 1;
            this.f3367c = -1;
        }

        public boolean equals(Object obj) {
            if (!this.f3368d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                return d.c(entry.getKey(), g.this.b(this.f3367c, 0)) && d.c(entry.getValue(), g.this.b(this.f3367c, 1));
            }
        }

        public K getKey() {
            if (this.f3368d) {
                return g.this.b(this.f3367c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f3368d) {
                return g.this.b(this.f3367c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f3367c < this.f3366b;
        }

        public int hashCode() {
            if (this.f3368d) {
                int i2 = 0;
                Object b2 = g.this.b(this.f3367c, 0);
                Object b3 = g.this.b(this.f3367c, 1);
                int hashCode = b2 == null ? 0 : b2.hashCode();
                if (b3 != null) {
                    i2 = b3.hashCode();
                }
                return hashCode ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object next() {
            if (hasNext()) {
                this.f3367c++;
                this.f3368d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f3368d) {
                g.this.h(this.f3367c);
                this.f3367c--;
                this.f3366b--;
                this.f3368d = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v2) {
            if (this.f3368d) {
                return g.this.i(this.f3367c, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class e implements Collection<V> {
        public e() {
        }

        public boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            g.this.a();
        }

        public boolean contains(Object obj) {
            return g.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return g.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f2 = g.this.f(obj);
            if (f2 < 0) {
                return false;
            }
            g.this.h(f2);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d2 = g.this.d();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < d2) {
                if (collection.contains(g.this.b(i2, 1))) {
                    g.this.h(i2);
                    i2--;
                    d2--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        public boolean retainAll(Collection<?> collection) {
            int d2 = g.this.d();
            int i2 = 0;
            boolean z2 = false;
            while (i2 < d2) {
                if (!collection.contains(g.this.b(i2, 1))) {
                    g.this.h(i2);
                    i2--;
                    d2--;
                    z2 = true;
                }
                i2++;
            }
            return z2;
        }

        public int size() {
            return g.this.d();
        }

        public Object[] toArray() {
            return g.this.l(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return g.this.m(tArr, 1);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i2, int i3);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k2, V v2);

    public abstract void h(int i2);

    public abstract V i(int i2, V v2);

    public Object[] l(int i2) {
        int d2 = d();
        Object[] objArr = new Object[d2];
        for (int i3 = 0; i3 < d2; i3++) {
            objArr[i3] = b(i3, i2);
        }
        return objArr;
    }

    public <T> T[] m(T[] tArr, int i2) {
        int d2 = d();
        if (tArr.length < d2) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d2);
        }
        for (int i3 = 0; i3 < d2; i3++) {
            tArr[i3] = b(i3, i2);
        }
        if (tArr.length > d2) {
            tArr[d2] = null;
        }
        return tArr;
    }
}
