package w1;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

public class d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f4248a;

    public d(a aVar) {
        this.f4248a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f4248a.f4256c.setScaleX(floatValue);
        this.f4248a.f4256c.setScaleY(floatValue);
    }
}
