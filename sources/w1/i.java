package w1;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.b;

public class i implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f4251a;

    public i(b bVar) {
        this.f4251a = bVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f4251a.f4256c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
