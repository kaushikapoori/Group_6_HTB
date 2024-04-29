package j;

import androidx.activity.result.d;

public class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f3228b;

    /* renamed from: a  reason: collision with root package name */
    public d f3229a = new b();

    public a() {
        super(1);
    }

    public static a f() {
        if (f3228b != null) {
            return f3228b;
        }
        synchronized (a.class) {
            if (f3228b == null) {
                f3228b = new a();
            }
        }
        return f3228b;
    }

    public boolean b() {
        return this.f3229a.b();
    }
}
