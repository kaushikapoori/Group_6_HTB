package f0;

import n.e;

public class c<T> extends e {

    /* renamed from: d  reason: collision with root package name */
    public final Object f2985d = new Object();

    public c(int i2) {
        super(i2, 1);
    }

    public T a() {
        T a2;
        synchronized (this.f2985d) {
            a2 = super.a();
        }
        return a2;
    }

    public boolean c(T t2) {
        boolean c2;
        synchronized (this.f2985d) {
            c2 = super.c(t2);
        }
        return c2;
    }
}
