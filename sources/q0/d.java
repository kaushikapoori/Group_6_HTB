package q0;

import android.view.animation.Interpolator;
import q.e;

public abstract class d implements Interpolator {

    /* renamed from: a  reason: collision with root package name */
    public final float[] f3786a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3787b;

    public d(float[] fArr) {
        this.f3786a = fArr;
        this.f3787b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f3786a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f2), fArr.length - 2);
        float f3 = this.f3787b;
        float f4 = (f2 - (((float) min) * f3)) / f3;
        float[] fArr2 = this.f3786a;
        return e.a(fArr2[min + 1], fArr2[min], f4, fArr2[min]);
    }
}
