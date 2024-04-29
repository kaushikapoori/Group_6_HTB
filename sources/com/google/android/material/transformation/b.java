package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import h1.d;

public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f2686a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f2687b;

    public b(FabTransformationBehavior fabTransformationBehavior, d dVar, Drawable drawable) {
        this.f2686a = dVar;
        this.f2687b = drawable;
    }

    public void onAnimationEnd(Animator animator) {
        this.f2686a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public void onAnimationStart(Animator animator) {
        this.f2686a.setCircularRevealOverlayDrawable(this.f2687b);
    }
}
