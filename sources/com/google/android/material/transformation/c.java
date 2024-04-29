package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import h1.d;

public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f2688a;

    public c(FabTransformationBehavior fabTransformationBehavior, d dVar) {
        this.f2688a = dVar;
    }

    public void onAnimationEnd(Animator animator) {
        d.e revealInfo = this.f2688a.getRevealInfo();
        revealInfo.f3186c = Float.MAX_VALUE;
        this.f2688a.setRevealInfo(revealInfo);
    }
}
