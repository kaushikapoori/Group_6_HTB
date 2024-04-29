package k;

import java.util.HashMap;
import k.b;

public class a<K, V> extends b<K, V> {

    /* renamed from: f  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f3280f = new HashMap<>();

    public b.c<K, V> a(K k2) {
        return this.f3280f.get(k2);
    }

    public boolean contains(K k2) {
        return this.f3280f.containsKey(k2);
    }

    public V d(K k2, V v2) {
        b.c cVar = this.f3280f.get(k2);
        if (cVar != null) {
            return cVar.f3286c;
        }
        this.f3280f.put(k2, c(k2, v2));
        return null;
    }

    public V e(K k2) {
        V e2 = super.e(k2);
        this.f3280f.remove(k2);
        return e2;
    }
}
