package m;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;

public class f<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, V> f3349a;

    /* renamed from: b  reason: collision with root package name */
    public int f3350b;

    /* renamed from: c  reason: collision with root package name */
    public int f3351c;

    /* renamed from: d  reason: collision with root package name */
    public int f3352d;

    /* renamed from: e  reason: collision with root package name */
    public int f3353e;

    /* renamed from: f  reason: collision with root package name */
    public int f3354f;

    /* renamed from: g  reason: collision with root package name */
    public int f3355g;

    public f(int i2) {
        if (i2 > 0) {
            this.f3351c = i2;
            this.f3349a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final V a(K k2) {
        Objects.requireNonNull(k2, "key == null");
        synchronized (this) {
            V v2 = this.f3349a.get(k2);
            if (v2 != null) {
                this.f3354f++;
                return v2;
            }
            this.f3355g++;
            return null;
        }
    }

    public final V b(K k2, V v2) {
        V put;
        if (k2 == null || v2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f3352d++;
            this.f3350b++;
            put = this.f3349a.put(k2, v2);
            if (put != null) {
                this.f3350b--;
            }
        }
        c(this.f3351c);
        return put;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(int r3) {
        /*
            r2 = this;
        L_0x0000:
            monitor-enter(r2)
            int r0 = r2.f3350b     // Catch:{ all -> 0x0069 }
            if (r0 < 0) goto L_0x004a
            java.util.LinkedHashMap<K, V> r0 = r2.f3349a     // Catch:{ all -> 0x0069 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0011
            int r0 = r2.f3350b     // Catch:{ all -> 0x0069 }
            if (r0 != 0) goto L_0x004a
        L_0x0011:
            int r0 = r2.f3350b     // Catch:{ all -> 0x0069 }
            if (r0 <= r3) goto L_0x0048
            java.util.LinkedHashMap<K, V> r0 = r2.f3349a     // Catch:{ all -> 0x0069 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0048
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r2.f3349a     // Catch:{ all -> 0x0069 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0069 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0069 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0069 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0069 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0069 }
            r0.getValue()     // Catch:{ all -> 0x0069 }
            java.util.LinkedHashMap<K, V> r0 = r2.f3349a     // Catch:{ all -> 0x0069 }
            r0.remove(r1)     // Catch:{ all -> 0x0069 }
            int r0 = r2.f3350b     // Catch:{ all -> 0x0069 }
            int r0 = r0 + -1
            r2.f3350b = r0     // Catch:{ all -> 0x0069 }
            int r0 = r2.f3353e     // Catch:{ all -> 0x0069 }
            int r0 = r0 + 1
            r2.f3353e = r0     // Catch:{ all -> 0x0069 }
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            goto L_0x0000
        L_0x0048:
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            return
        L_0x004a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0069 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r0.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.Class r1 = r2.getClass()     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0069 }
            r0.append(r1)     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0069 }
            r3.<init>(r0)     // Catch:{ all -> 0x0069 }
            throw r3     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0069 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.c(int):void");
    }

    public final synchronized String toString() {
        int i2;
        int i3;
        i2 = this.f3354f;
        i3 = this.f3355g + i2;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f3351c), Integer.valueOf(this.f3354f), Integer.valueOf(this.f3355g), Integer.valueOf(i3 != 0 ? (i2 * 100) / i3 : 0)});
    }
}
