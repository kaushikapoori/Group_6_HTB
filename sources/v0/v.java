package v0;

import android.graphics.Matrix;
import android.view.View;

public class v extends u {
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    public void d(View view, int i2, int i3, int i4, int i5) {
        view.setLeftTopRightBottom(i2, i3, i4, i5);
    }

    public void e(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    public void f(View view, int i2) {
        view.setTransitionVisibility(i2);
    }

    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
