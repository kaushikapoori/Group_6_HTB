package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

public class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f2685a;

    public a(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.f2685a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f2685a.invalidate();
    }
}
