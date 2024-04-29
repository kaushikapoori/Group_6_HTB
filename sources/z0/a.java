package z0;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import q.e;
import q0.b;
import q0.c;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeInterpolator f4419a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f4420b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final TimeInterpolator f4421c = new q0.a();

    /* renamed from: d  reason: collision with root package name */
    public static final TimeInterpolator f4422d = new c();

    /* renamed from: e  reason: collision with root package name */
    public static final TimeInterpolator f4423e = new DecelerateInterpolator();

    public static float a(float f2, float f3, float f4) {
        return e.a(f3, f2, f4, f2);
    }

    public static float b(float f2, float f3, float f4, float f5, float f6) {
        return f6 < f4 ? f2 : f6 > f5 ? f3 : a(f2, f3, (f6 - f4) / (f5 - f4));
    }
}
