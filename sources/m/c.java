package m;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m.g;

public final class c<E> implements Collection<E>, Set<E> {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f3331f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final Object[] f3332g = new Object[0];

    /* renamed from: h  reason: collision with root package name */
    public static Object[] f3333h;

    /* renamed from: i  reason: collision with root package name */
    public static int f3334i;

    /* renamed from: j  reason: collision with root package name */
    public static Object[] f3335j;

    /* renamed from: k  reason: collision with root package name */
    public static int f3336k;

    /* renamed from: b  reason: collision with root package name */
    public int[] f3337b = f3331f;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f3338c = f3332g;

    /* renamed from: d  reason: collision with root package name */
    public int f3339d = 0;

    /* renamed from: e  reason: collision with root package name */
    public g<E, E> f3340e;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                if (f3336k < 10) {
                    objArr[0] = f3335j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f3335j = objArr;
                    f3336k++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (c.class) {
                if (f3334i < 10) {
                    objArr[0] = f3333h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f3333h = objArr;
                    f3334i++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (c.class) {
                Object[] objArr = f3335j;
                if (objArr != null) {
                    this.f3338c = objArr;
                    f3335j = (Object[]) objArr[0];
                    this.f3337b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3336k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (c.class) {
                Object[] objArr2 = f3333h;
                if (objArr2 != null) {
                    this.f3338c = objArr2;
                    f3333h = (Object[]) objArr2[0];
                    this.f3337b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3334i--;
                    return;
                }
            }
        }
        this.f3337b = new int[i2];
        this.f3338c = new Object[i2];
    }

    public boolean add(E e2) {
        int i2;
        int i3;
        if (e2 == null) {
            i3 = e();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            i3 = d(e2, hashCode);
        }
        if (i3 >= 0) {
            return false;
        }
        int i4 = ~i3;
        int i5 = this.f3339d;
        int[] iArr = this.f3337b;
        if (i5 >= iArr.length) {
            int i6 = 4;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f3338c;
            a(i6);
            int[] iArr2 = this.f3337b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3338c, 0, objArr.length);
            }
            b(iArr, objArr, this.f3339d);
        }
        int i7 = this.f3339d;
        if (i4 < i7) {
            int[] iArr3 = this.f3337b;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f3338c;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f3339d - i4);
        }
        this.f3337b[i4] = i2;
        this.f3338c[i4] = e2;
        this.f3339d++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f3339d;
        int[] iArr = this.f3337b;
        boolean z2 = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3338c;
            a(size);
            int i2 = this.f3339d;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f3337b, 0, i2);
                System.arraycopy(objArr, 0, this.f3338c, 0, this.f3339d);
            }
            b(iArr, objArr, this.f3339d);
        }
        for (Object add : collection) {
            z2 |= add(add);
        }
        return z2;
    }

    public int c(Object obj) {
        return obj == null ? e() : d(obj, obj.hashCode());
    }

    public void clear() {
        int i2 = this.f3339d;
        if (i2 != 0) {
            b(this.f3337b, this.f3338c, i2);
            this.f3337b = f3331f;
            this.f3338c = f3332g;
            this.f3339d = 0;
        }
    }

    public boolean contains(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final int d(Object obj, int i2) {
        int i3 = this.f3339d;
        if (i3 == 0) {
            return -1;
        }
        int a2 = d.a(this.f3337b, i3, i2);
        if (a2 < 0 || obj.equals(this.f3338c[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f3337b[i4] == i2) {
            if (obj.equals(this.f3338c[i4])) {
                return i4;
            }
            i4++;
        }
        int i5 = a2 - 1;
        while (i5 >= 0 && this.f3337b[i5] == i2) {
            if (obj.equals(this.f3338c[i5])) {
                return i5;
            }
            i5--;
        }
        return ~i4;
    }

    public final int e() {
        int i2 = this.f3339d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = d.a(this.f3337b, i2, 0);
        if (a2 < 0 || this.f3338c[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f3337b[i3] == 0) {
            if (this.f3338c[i3] == null) {
                return i3;
            }
            i3++;
        }
        int i4 = a2 - 1;
        while (i4 >= 0 && this.f3337b[i4] == 0) {
            if (this.f3338c[i4] == null) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f3339d != set.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f3339d) {
                try {
                    if (!set.contains(this.f3338c[i2])) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E f(int i2) {
        E[] eArr = this.f3338c;
        E e2 = eArr[i2];
        int i3 = this.f3339d;
        if (i3 <= 1) {
            b(this.f3337b, eArr, i3);
            this.f3337b = f3331f;
            this.f3338c = f3332g;
            this.f3339d = 0;
        } else {
            int[] iArr = this.f3337b;
            int i4 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i5 = i3 - 1;
                this.f3339d = i5;
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    System.arraycopy(iArr, i6, iArr, i2, i5 - i2);
                    Object[] objArr = this.f3338c;
                    System.arraycopy(objArr, i6, objArr, i2, this.f3339d - i2);
                }
                this.f3338c[this.f3339d] = null;
            } else {
                if (i3 > 8) {
                    i4 = i3 + (i3 >> 1);
                }
                a(i4);
                this.f3339d--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f3337b, 0, i2);
                    System.arraycopy(eArr, 0, this.f3338c, 0, i2);
                }
                int i7 = this.f3339d;
                if (i2 < i7) {
                    int i8 = i2 + 1;
                    System.arraycopy(iArr, i8, this.f3337b, i2, i7 - i2);
                    System.arraycopy(eArr, i8, this.f3338c, i2, this.f3339d - i2);
                }
            }
        }
        return e2;
    }

    public int hashCode() {
        int[] iArr = this.f3337b;
        int i2 = this.f3339d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.f3339d <= 0;
    }

    public Iterator<E> iterator() {
        if (this.f3340e == null) {
            this.f3340e = new b(this);
        }
        g<E, E> gVar = this.f3340e;
        if (gVar.f3357b == null) {
            gVar.f3357b = new g.c();
        }
        return gVar.f3357b.iterator();
    }

    public boolean remove(Object obj) {
        int c2 = c(obj);
        if (c2 < 0) {
            return false;
        }
        f(c2);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z2 = false;
        for (Object remove : collection) {
            z2 |= remove(remove);
        }
        return z2;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z2 = false;
        for (int i2 = this.f3339d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f3338c[i2])) {
                f(i2);
                z2 = true;
            }
        }
        return z2;
    }

    public int size() {
        return this.f3339d;
    }

    public Object[] toArray() {
        int i2 = this.f3339d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f3338c, 0, objArr, 0, i2);
        return objArr;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f3339d) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f3339d);
        }
        System.arraycopy(this.f3338c, 0, tArr, 0, this.f3339d);
        int length = tArr.length;
        int i2 = this.f3339d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3339d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3339d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3338c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
