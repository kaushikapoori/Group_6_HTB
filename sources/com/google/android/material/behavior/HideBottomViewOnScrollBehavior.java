package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public int f2133a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f2134b = 2;

    /* renamed from: c  reason: collision with root package name */
    public int f2135c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f2136d;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f2136d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        this.f2133a = v2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v2.getLayoutParams()).bottomMargin;
        return false;
    }

    public void l(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        boolean z2 = true;
        boolean z3 = false;
        if (i3 > 0) {
            if (this.f2134b == 1) {
                z3 = true;
            }
            if (!z3) {
                ViewPropertyAnimator viewPropertyAnimator = this.f2136d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    v2.clearAnimation();
                }
                this.f2134b = 1;
                s(v2, this.f2133a + this.f2135c, 175, z0.a.f4421c);
            }
        } else if (i3 < 0) {
            if (this.f2134b != 2) {
                z2 = false;
            }
            if (!z2) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f2136d;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    v2.clearAnimation();
                }
                this.f2134b = 2;
                s(v2, 0, 225, z0.a.f4422d);
            }
        }
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        return i2 == 2;
    }

    public final void s(V v2, int i2, long j2, TimeInterpolator timeInterpolator) {
        this.f2136d = v2.animate().translationY((float) i2).setInterpolator(timeInterpolator).setDuration(j2).setListener(new a());
    }
}
