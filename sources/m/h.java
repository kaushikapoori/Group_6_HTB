package m;

import java.util.ConcurrentModificationException;
import java.util.Map;

public class h<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public static Object[] f3371e;

    /* renamed from: f  reason: collision with root package name */
    public static int f3372f;

    /* renamed from: g  reason: collision with root package name */
    public static Object[] f3373g;

    /* renamed from: h  reason: collision with root package name */
    public static int f3374h;

    /* renamed from: b  reason: collision with root package name */
    public int[] f3375b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f3376c;

    /* renamed from: d  reason: collision with root package name */
    public int f3377d;

    public h() {
        this.f3375b = d.f3341a;
        this.f3376c = d.f3343c;
        this.f3377d = 0;
    }

    public h(int i2) {
        if (i2 == 0) {
            this.f3375b = d.f3341a;
            this.f3376c = d.f3343c;
        } else {
            a(i2);
        }
        this.f3377d = 0;
    }

    private void a(int i2) {
        Class<h> cls = h.class;
        if (i2 == 8) {
            synchronized (cls) {
                Object[] objArr = f3373g;
                if (objArr != null) {
                    this.f3376c = objArr;
                    f3373g = (Object[]) objArr[0];
                    this.f3375b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3374h--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (cls) {
                Object[] objArr2 = f3371e;
                if (objArr2 != null) {
                    this.f3376c = objArr2;
                    f3371e = (Object[]) objArr2[0];
                    this.f3375b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3372f--;
                    return;
                }
            }
        }
        this.f3375b = new int[i2];
        this.f3376c = new Object[(i2 << 1)];
    }

    public static void c(int[] iArr, Object[] objArr, int i2) {
        Class<h> cls = h.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f3374h < 10) {
                    objArr[0] = f3373g;
                    objArr[1] = iArr;
                    for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3373g = objArr;
                    f3374h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f3372f < 10) {
                    objArr[0] = f3371e;
                    objArr[1] = iArr;
                    for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f3371e = objArr;
                    f3372f++;
                }
            }
        }
    }

    public void b(int i2) {
        int i3 = this.f3377d;
        int[] iArr = this.f3375b;
        if (iArr.length < i2) {
            Object[] objArr = this.f3376c;
            a(i2);
            if (this.f3377d > 0) {
                System.arraycopy(iArr, 0, this.f3375b, 0, i3);
                System.arraycopy(objArr, 0, this.f3376c, 0, i3 << 1);
            }
            c(iArr, objArr, i3);
        }
        if (this.f3377d != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i2 = this.f3377d;
        if (i2 > 0) {
            int[] iArr = this.f3375b;
            Object[] objArr = this.f3376c;
            this.f3375b = d.f3341a;
            this.f3376c = d.f3343c;
            this.f3377d = 0;
            c(iArr, objArr, i2);
        }
        if (this.f3377d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public int d(Object obj, int i2) {
        int i3 = this.f3377d;
        if (i3 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f3375b, i3, i2);
            if (a2 < 0 || obj.equals(this.f3376c[a2 << 1])) {
                return a2;
            }
            int i4 = a2 + 1;
            while (i4 < i3 && this.f3375b[i4] == i2) {
                if (obj.equals(this.f3376c[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            int i5 = a2 - 1;
            while (i5 >= 0 && this.f3375b[i5] == i2) {
                if (obj.equals(this.f3376c[i5 << 1])) {
                    return i5;
                }
                i5--;
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f3377d != hVar.f3377d) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f3377d) {
                try {
                    Object h2 = h(i2);
                    Object k2 = k(i2);
                    Object obj2 = hVar.get(h2);
                    if (k2 == null) {
                        if (obj2 != null || !hVar.containsKey(h2)) {
                            return false;
                        }
                    } else if (!k2.equals(obj2)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f3377d != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f3377d) {
                try {
                    Object h3 = h(i3);
                    Object k3 = k(i3);
                    Object obj3 = map.get(h3);
                    if (k3 == null) {
                        if (obj3 != null || !map.containsKey(h3)) {
                            return false;
                        }
                    } else if (!k3.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i2 = this.f3377d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = d.a(this.f3375b, i2, 0);
            if (a2 < 0 || this.f3376c[a2 << 1] == null) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f3375b[i3] == 0) {
                if (this.f3376c[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            int i4 = a2 - 1;
            while (i4 >= 0 && this.f3375b[i4] == 0) {
                if (this.f3376c[i4 << 1] == null) {
                    return i4;
                }
                i4--;
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int g(Object obj) {
        int i2 = this.f3377d * 2;
        Object[] objArr = this.f3376c;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v2) {
        int e2 = e(obj);
        return e2 >= 0 ? this.f3376c[(e2 << 1) + 1] : v2;
    }

    public K h(int i2) {
        return this.f3376c[i2 << 1];
    }

    public int hashCode() {
        int[] iArr = this.f3375b;
        Object[] objArr = this.f3376c;
        int i2 = this.f3377d;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            i5 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return i5;
    }

    public V i(int i2) {
        V[] vArr = this.f3376c;
        int i3 = i2 << 1;
        V v2 = vArr[i3 + 1];
        int i4 = this.f3377d;
        int i5 = 0;
        if (i4 <= 1) {
            c(this.f3375b, vArr, i4);
            this.f3375b = d.f3341a;
            this.f3376c = d.f3343c;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f3375b;
            int i7 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i8 = i2 + 1;
                    int i9 = i6 - i2;
                    System.arraycopy(iArr, i8, iArr, i2, i9);
                    Object[] objArr = this.f3376c;
                    System.arraycopy(objArr, i8 << 1, objArr, i3, i9 << 1);
                }
                Object[] objArr2 = this.f3376c;
                int i10 = i6 << 1;
                objArr2[i10] = null;
                objArr2[i10 + 1] = null;
            } else {
                if (i4 > 8) {
                    i7 = i4 + (i4 >> 1);
                }
                a(i7);
                if (i4 == this.f3377d) {
                    if (i2 > 0) {
                        System.arraycopy(iArr, 0, this.f3375b, 0, i2);
                        System.arraycopy(vArr, 0, this.f3376c, 0, i3);
                    }
                    if (i2 < i6) {
                        int i11 = i2 + 1;
                        int i12 = i6 - i2;
                        System.arraycopy(iArr, i11, this.f3375b, i2, i12);
                        System.arraycopy(vArr, i11 << 1, this.f3376c, i3, i12 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i5 = i6;
        }
        if (i4 == this.f3377d) {
            this.f3377d = i5;
            return v2;
        }
        throw new ConcurrentModificationException();
    }

    public boolean isEmpty() {
        return this.f3377d <= 0;
    }

    public V j(int i2, V v2) {
        int i3 = (i2 << 1) + 1;
        V[] vArr = this.f3376c;
        V v3 = vArr[i3];
        vArr[i3] = v2;
        return v3;
    }

    public V k(int i2) {
        return this.f3376c[(i2 << 1) + 1];
    }

    public V put(K k2, V v2) {
        int i2;
        int i3;
        int i4 = this.f3377d;
        if (k2 == null) {
            i3 = f();
            i2 = 0;
        } else {
            int hashCode = k2.hashCode();
            i2 = hashCode;
            i3 = d(k2, hashCode);
        }
        if (i3 >= 0) {
            int i5 = (i3 << 1) + 1;
            V[] vArr = this.f3376c;
            V v3 = vArr[i5];
            vArr[i5] = v2;
            return v3;
        }
        int i6 = ~i3;
        int[] iArr = this.f3375b;
        if (i4 >= iArr.length) {
            int i7 = 4;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i7 = 8;
            }
            Object[] objArr = this.f3376c;
            a(i7);
            if (i4 == this.f3377d) {
                int[] iArr2 = this.f3375b;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f3376c, 0, objArr.length);
                }
                c(iArr, objArr, i4);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i6 < i4) {
            int[] iArr3 = this.f3375b;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr2 = this.f3376c;
            System.arraycopy(objArr2, i6 << 1, objArr2, i8 << 1, (this.f3377d - i6) << 1);
        }
        int i9 = this.f3377d;
        if (i4 == i9) {
            int[] iArr4 = this.f3375b;
            if (i6 < iArr4.length) {
                iArr4[i6] = i2;
                Object[] objArr3 = this.f3376c;
                int i10 = i6 << 1;
                objArr3[i10] = k2;
                objArr3[i10 + 1] = v2;
                this.f3377d = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k2, V v2) {
        V orDefault = getOrDefault(k2, (Object) null);
        return orDefault == null ? put(k2, v2) : orDefault;
    }

    public V remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return i(e2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        Object k2 = k(e2);
        if (obj2 != k2 && (obj2 == null || !obj2.equals(k2))) {
            return false;
        }
        i(e2);
        return true;
    }

    public V replace(K k2, V v2) {
        int e2 = e(k2);
        if (e2 >= 0) {
            return j(e2, v2);
        }
        return null;
    }

    public boolean replace(K k2, V v2, V v3) {
        int e2 = e(k2);
        if (e2 < 0) {
            return false;
        }
        V k3 = k(e2);
        if (k3 != v2 && (v2 == null || !v2.equals(k3))) {
            return false;
        }
        j(e2, v3);
        return true;
    }

    public int size() {
        return this.f3377d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3377d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3377d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object k2 = k(i2);
            if (k2 != this) {
                sb.append(k2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
