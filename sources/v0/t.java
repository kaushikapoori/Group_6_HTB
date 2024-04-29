package v0;

import android.annotation.SuppressLint;
import android.view.View;

public class t extends s {

    /* renamed from: h  reason: collision with root package name */
    public static boolean f4103h = true;

    @SuppressLint({"NewApi"})
    public void d(View view, int i2, int i3, int i4, int i5) {
        if (f4103h) {
            try {
                view.setLeftTopRightBottom(i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f4103h = false;
            }
        }
    }
}
