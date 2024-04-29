package l;

import android.graphics.drawable.Drawable;

public class f extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public static final double f3319a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f2, float f3, boolean z2) {
        if (!z2) {
            return f2;
        }
        return (float) (((1.0d - f3319a) * ((double) f3)) + ((double) f2));
    }

    public static float b(float f2, float f3, boolean z2) {
        float f4 = f2 * 1.5f;
        if (!z2) {
            return f4;
        }
        return (float) (((1.0d - f3319a) * ((double) f3)) + ((double) f4));
    }
}
