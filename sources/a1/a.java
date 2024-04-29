package a1;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Objects;
import u1.g;

public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f18a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f19b;

    public a(AppBarLayout appBarLayout, g gVar) {
        this.f19b = appBarLayout;
        this.f18a = gVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f18a.p(floatValue);
        Drawable drawable = this.f19b.f2104p;
        if (drawable instanceof g) {
            ((g) drawable).p(floatValue);
        }
        Objects.requireNonNull(this.f19b);
        throw null;
    }
}
