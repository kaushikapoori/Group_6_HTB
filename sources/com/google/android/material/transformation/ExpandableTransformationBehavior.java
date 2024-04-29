package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b  reason: collision with root package name */
    public AnimatorSet f2667b;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f2667b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean t(View view, View view2, boolean z2, boolean z3) {
        AnimatorSet animatorSet = this.f2667b;
        boolean z4 = animatorSet != null;
        if (z4) {
            animatorSet.cancel();
        }
        AnimatorSet u2 = u(view, view2, z2, z4);
        this.f2667b = u2;
        u2.addListener(new a());
        this.f2667b.start();
        if (!z3) {
            this.f2667b.end();
        }
        return true;
    }

    public abstract AnimatorSet u(View view, View view2, boolean z2, boolean z3);
}
