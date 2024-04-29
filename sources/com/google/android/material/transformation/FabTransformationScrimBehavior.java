package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import z0.h;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final h f2680c = new h(75, 150);

    /* renamed from: d  reason: collision with root package name */
    public final h f2681d = new h(0, 150);

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f2682a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2683b;

        public a(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z2, View view) {
            this.f2682a = z2;
            this.f2683b = view;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f2682a) {
                this.f2683b.setVisibility(4);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f2682a) {
                this.f2683b.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public boolean r(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public AnimatorSet u(View view, View view2, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator;
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        h hVar = z2 ? this.f2680c : this.f2681d;
        if (z2) {
            if (!z3) {
                view2.setAlpha(0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f});
        }
        hVar.a(objectAnimator);
        arrayList.add(objectAnimator);
        AnimatorSet animatorSet = new AnimatorSet();
        c.a.g(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z2, view2));
        return animatorSet;
    }
}
