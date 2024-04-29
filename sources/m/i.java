package m;

public class i<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f3378e = new Object();

    /* renamed from: b  reason: collision with root package name */
    public int[] f3379b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f3380c;

    /* renamed from: d  reason: collision with root package name */
    public int f3381d;

    public i() {
        int e2 = d.e(10);
        this.f3379b = new int[e2];
        this.f3380c = new Object[e2];
    }

    public void a(int i2, E e2) {
        int i3 = this.f3381d;
        if (i3 == 0 || i2 > this.f3379b[i3 - 1]) {
            if (i3 >= this.f3379b.length) {
                int e3 = d.e(i3 + 1);
                int[] iArr = new int[e3];
                Object[] objArr = new Object[e3];
                int[] iArr2 = this.f3379b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f3380c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3379b = iArr;
                this.f3380c = objArr;
            }
            this.f3379b[i3] = i2;
            this.f3380c[i3] = e2;
            this.f3381d = i3 + 1;
            return;
        }
        f(i2, e2);
    }

    /* renamed from: b */
    public i<E> clone() {
        try {
            i<E> iVar = (i) super.clone();
            iVar.f3379b = (int[]) this.f3379b.clone();
            iVar.f3380c = (Object[]) this.f3380c.clone();
            return iVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E c(int i2) {
        return d(i2, (Object) null);
    }

    public E d(int i2, E e2) {
        int a2 = d.a(this.f3379b, this.f3381d, i2);
        if (a2 >= 0) {
            E[] eArr = this.f3380c;
            if (eArr[a2] != f3378e) {
                return eArr[a2];
            }
        }
        return e2;
    }

    public int e(int i2) {
        return this.f3379b[i2];
    }

    public void f(int i2, E e2) {
        int a2 = d.a(this.f3379b, this.f3381d, i2);
        if (a2 >= 0) {
            this.f3380c[a2] = e2;
            return;
        }
        int i3 = ~a2;
        int i4 = this.f3381d;
        if (i3 < i4) {
            Object[] objArr = this.f3380c;
            if (objArr[i3] == f3378e) {
                this.f3379b[i3] = i2;
                objArr[i3] = e2;
                return;
            }
        }
        if (i4 >= this.f3379b.length) {
            int e3 = d.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f3379b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f3380c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3379b = iArr;
            this.f3380c = objArr2;
        }
        int i5 = this.f3381d - i3;
        if (i5 != 0) {
            int[] iArr3 = this.f3379b;
            int i6 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i6, i5);
            Object[] objArr4 = this.f3380c;
            System.arraycopy(objArr4, i3, objArr4, i6, this.f3381d - i3);
        }
        this.f3379b[i3] = i2;
        this.f3380c[i3] = e2;
        this.f3381d++;
    }

    public int g() {
        return this.f3381d;
    }

    public E h(int i2) {
        return this.f3380c[i2];
    }

    public String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3381d * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3381d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            Object h2 = h(i2);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
