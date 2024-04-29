package v0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

public class s extends r {

    /* renamed from: f  reason: collision with root package name */
    public static boolean f4101f = true;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f4102g = true;

    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (f4101f) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f4101f = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (f4102g) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f4102g = false;
            }
        }
    }
}
