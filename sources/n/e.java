package n;

public class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3460a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f3461b;

    /* renamed from: c  reason: collision with root package name */
    public int f3462c;

    public e(int i2, int i3) {
        this.f3460a = i3;
        if (i3 != 1) {
            if (i2 > 0) {
                this.f3461b = new Object[i2];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        } else if (i2 > 0) {
            this.f3461b = new Object[i2];
        } else {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    public Object a() {
        switch (this.f3460a) {
            case 0:
                int i2 = this.f3462c;
                if (i2 <= 0) {
                    return null;
                }
                int i3 = i2 - 1;
                Object[] objArr = this.f3461b;
                Object obj = objArr[i3];
                objArr[i3] = null;
                this.f3462c = i3;
                return obj;
            default:
                int i4 = this.f3462c;
                if (i4 <= 0) {
                    return null;
                }
                int i5 = i4 - 1;
                Object[] objArr2 = this.f3461b;
                Object obj2 = objArr2[i5];
                objArr2[i5] = null;
                this.f3462c = i5;
                return obj2;
        }
    }

    public boolean b(T t2) {
        for (int i2 = 0; i2 < this.f3462c; i2++) {
            if (this.f3461b[i2] == t2) {
                return true;
            }
        }
        return false;
    }

    public boolean c(Object obj) {
        switch (this.f3460a) {
            case 0:
                int i2 = this.f3462c;
                Object[] objArr = this.f3461b;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = obj;
                this.f3462c = i2 + 1;
                return true;
            default:
                if (!b(obj)) {
                    int i3 = this.f3462c;
                    Object[] objArr2 = this.f3461b;
                    if (i3 >= objArr2.length) {
                        return false;
                    }
                    objArr2[i3] = obj;
                    this.f3462c = i3 + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!");
        }
    }
}
