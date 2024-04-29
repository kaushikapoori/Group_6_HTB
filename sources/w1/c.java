package w1;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

public class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f4247a;

    public c(a aVar) {
        this.f4247a = aVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4247a.f4256c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
