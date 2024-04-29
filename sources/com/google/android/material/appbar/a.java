package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f2123a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f2124b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f2125c;

    public a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f2125c = baseBehavior;
        this.f2123a = coordinatorLayout;
        this.f2124b = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2125c.x(this.f2123a, this.f2124b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
