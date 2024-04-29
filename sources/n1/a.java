package n1;

import android.animation.FloatEvaluator;
import android.animation.TypeEvaluator;
import com.google.android.material.floatingactionbutton.d;

public class a implements TypeEvaluator<Float> {

    /* renamed from: a  reason: collision with root package name */
    public FloatEvaluator f3487a = new FloatEvaluator();

    public a(d dVar) {
    }

    public Object evaluate(float f2, Object obj, Object obj2) {
        float floatValue = this.f3487a.evaluate(f2, (Float) obj, (Float) obj2).floatValue();
        if (floatValue < 0.1f) {
            floatValue = 0.0f;
        }
        return Float.valueOf(floatValue);
    }
}
