package v0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

public class u extends t {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f4104i = true;

    @SuppressLint({"NewApi"})
    public void f(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i2);
        } else if (f4104i) {
            try {
                view.setTransitionVisibility(i2);
            } catch (NoSuchMethodError unused) {
                f4104i = false;
            }
        }
    }
}
