package c1;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import u1.g;

public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f2068a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f2068a = bottomSheetBehavior;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        g gVar = this.f2068a.f2172h;
        if (gVar != null) {
            gVar.r(floatValue);
        }
    }
}
