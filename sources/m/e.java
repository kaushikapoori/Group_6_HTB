package m;

public class e<E> implements Cloneable {

    /* renamed from: f  reason: collision with root package name */
    public static final Object f3344f = new Object();

    /* renamed from: b  reason: collision with root package name */
    public boolean f3345b = false;

    /* renamed from: c  reason: collision with root package name */
    public long[] f3346c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f3347d;

    /* renamed from: e  reason: collision with root package name */
    public int f3348e;

    public e() {
        int f2 = d.f(10);
        this.f3346c = new long[f2];
        this.f3347d = new Object[f2];
    }

    public void a(long j2, E e2) {
        int i2 = this.f3348e;
        if (i2 == 0 || j2 > this.f3346c[i2 - 1]) {
            if (this.f3345b && i2 >= this.f3346c.length) {
                d();
            }
            int i3 = this.f3348e;
            if (i3 >= this.f3346c.length) {
                int f2 = d.f(i3 + 1);
                long[] jArr = new long[f2];
                Object[] objArr = new Object[f2];
                long[] jArr2 = this.f3346c;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f3347d;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f3346c = jArr;
                this.f3347d = objArr;
            }
            this.f3346c[i3] = j2;
            this.f3347d[i3] = e2;
            this.f3348e = i3 + 1;
            return;
        }
        g(j2, e2);
    }

    public void b() {
        int i2 = this.f3348e;
        Object[] objArr = this.f3347d;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        this.f3348e = 0;
        this.f3345b = false;
    }

    /* renamed from: c */
    public e<E> clone() {
        try {
            e<E> eVar = (e) super.clone();
            eVar.f3346c = (long[]) this.f3346c.clone();
            eVar.f3347d = (Object[]) this.f3347d.clone();
            return eVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void d() {
        int i2 = this.f3348e;
        long[] jArr = this.f3346c;
        Object[] objArr = this.f3347d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object obj = objArr[i4];
            if (obj != f3344f) {
                if (i4 != i3) {
                    jArr[i3] = jArr[i4];
                    objArr[i3] = obj;
                    objArr[i4] = null;
                }
                i3++;
            }
        }
        this.f3345b = false;
        this.f3348e = i3;
    }

    public E e(long j2) {
        return f(j2, (Object) null);
    }

    public E f(long j2, E e2) {
        int b2 = d.b(this.f3346c, this.f3348e, j2);
        if (b2 >= 0) {
            E[] eArr = this.f3347d;
            if (eArr[b2] != f3344f) {
                return eArr[b2];
            }
        }
        return e2;
    }

    public void g(long j2, E e2) {
        int b2 = d.b(this.f3346c, this.f3348e, j2);
        if (b2 >= 0) {
            this.f3347d[b2] = e2;
            return;
        }
        int i2 = ~b2;
        int i3 = this.f3348e;
        if (i2 < i3) {
            Object[] objArr = this.f3347d;
            if (objArr[i2] == f3344f) {
                this.f3346c[i2] = j2;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f3345b && i3 >= this.f3346c.length) {
            d();
            i2 = ~d.b(this.f3346c, this.f3348e, j2);
        }
        int i4 = this.f3348e;
        if (i4 >= this.f3346c.length) {
            int f2 = d.f(i4 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f3346c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f3347d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f3346c = jArr;
            this.f3347d = objArr2;
        }
        int i5 = this.f3348e;
        if (i5 - i2 != 0) {
            long[] jArr3 = this.f3346c;
            int i6 = i2 + 1;
            System.arraycopy(jArr3, i2, jArr3, i6, i5 - i2);
            Object[] objArr4 = this.f3347d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f3348e - i2);
        }
        this.f3346c[i2] = j2;
        this.f3347d[i2] = e2;
        this.f3348e++;
    }

    public int h() {
        if (this.f3345b) {
            d();
        }
        return this.f3348e;
    }

    public E i(int i2) {
        if (this.f3345b) {
            d();
        }
        return this.f3347d[i2];
    }

    public String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3348e * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3348e; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            if (this.f3345b) {
                d();
            }
            sb.append(this.f3346c[i2]);
            sb.append('=');
            Object i3 = i(i2);
            if (i3 != this) {
                sb.append(i3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
