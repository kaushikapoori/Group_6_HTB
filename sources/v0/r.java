package v0;

import android.annotation.SuppressLint;
import android.view.View;

public class r extends w {

    /* renamed from: e  reason: collision with root package name */
    public static boolean f4100e = true;

    public void a(View view) {
    }

    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (f4100e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f4100e = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }

    @SuppressLint({"NewApi"})
    public void e(View view, float f2) {
        if (f4100e) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f4100e = false;
            }
        }
        view.setAlpha(f2);
    }
}
