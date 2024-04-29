package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b1.c;
import b1.d;
import b1.f;
import b1.g;
import c.b;
import com.example.supermarket.R;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import g0.u;
import g0.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import o1.s;
import z0.j;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: d0  reason: collision with root package name */
    public static final /* synthetic */ int f2153d0 = 0;
    public Integer Q;
    public Animator R;
    public Animator S;
    public int T;
    public int U;
    public boolean V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public int f2154a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f2155b0;

    /* renamed from: c0  reason: collision with root package name */
    public Behavior f2156c0;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        public final Rect f2157e = new Rect();

        /* renamed from: f  reason: collision with root package name */
        public WeakReference<BottomAppBar> f2158f;

        /* renamed from: g  reason: collision with root package name */
        public int f2159g;

        /* renamed from: h  reason: collision with root package name */
        public final View.OnLayoutChangeListener f2160h = new a();

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (((BottomAppBar) Behavior.this.f2158f.get()) == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                Behavior.this.f2157e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                throw null;
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, int i2) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f2158f = new WeakReference<>(bottomAppBar);
            int i3 = BottomAppBar.f2153d0;
            View z2 = bottomAppBar.z();
            if (z2 != null) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                if (!u.g.c(z2)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) z2.getLayoutParams();
                    fVar.f1061d = 49;
                    this.f2159g = fVar.bottomMargin;
                    if (z2 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) z2;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.f2160h);
                        floatingActionButton.d((Animator.AnimatorListener) null);
                        floatingActionButton.e(new f(bottomAppBar));
                        floatingActionButton.f((j<? extends FloatingActionButton>) null);
                    }
                    bottomAppBar.D();
                    throw null;
                }
            }
            coordinatorLayout.r(bottomAppBar, i2);
            this.f2133a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i2 == 2) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class a extends l0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0014a();

        /* renamed from: d  reason: collision with root package name */
        public int f2162d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2163e;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a  reason: collision with other inner class name */
        public class C0014a implements Parcelable.ClassLoaderCreator<a> {
            public Object createFromParcel(Parcel parcel) {
                return new a(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i2) {
                return new a[i2];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2162d = parcel.readInt();
            this.f2163e = parcel.readInt() != 0;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3321b, i2);
            parcel.writeInt(this.f2162d);
            parcel.writeInt(this.f2163e ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return B(this.T);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().f2035d;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private g getTopEdgeTreatment() {
        throw null;
    }

    public static void x(BottomAppBar bottomAppBar) {
        bottomAppBar.W--;
    }

    public int A(ActionMenuView actionMenuView, int i2, boolean z2) {
        if (i2 != 1 || !z2) {
            return 0;
        }
        boolean a2 = s.a(this);
        int measuredWidth = a2 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f2689a & 8388615) == 8388611) {
                measuredWidth = a2 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((a2 ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }

    public final float B(int i2) {
        boolean a2 = s.a(this);
        int i3 = 1;
        if (i2 != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) + 0;
        if (a2) {
            i3 = -1;
        }
        return (float) (measuredWidth * i3);
    }

    public final boolean C() {
        FloatingActionButton y2 = y();
        return y2 != null && y2.k();
    }

    public final void D() {
        getTopEdgeTreatment().f2036e = getFabTranslationX();
        z();
        if (this.f2155b0) {
            boolean C = C();
        }
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    public Behavior getBehavior() {
        if (this.f2156c0 == null) {
            this.f2156c0 = new Behavior();
        }
        return this.f2156c0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().f2035d;
    }

    public int getFabAlignmentMode() {
        return this.T;
    }

    public int getFabAnimationMode() {
        return this.U;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().f2034c;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f2033b;
    }

    public boolean getHideOnScroll() {
        return this.V;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.l(this, (u1.g) null);
        throw null;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            Animator animator = this.S;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.R;
            if (animator2 != null) {
                animator2.cancel();
            }
            D();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.S == null) {
            actionMenuView.setAlpha(1.0f);
            if (!C()) {
                i6 = A(actionMenuView, 0, false);
            } else {
                i6 = A(actionMenuView, this.T, this.f2155b0);
            }
            actionMenuView.setTranslationX((float) i6);
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f3321b);
        this.T = aVar.f2162d;
        this.f2155b0 = aVar.f2163e;
    }

    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f2162d = this.T;
        aVar.f2163e = this.f2155b0;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setCradleVerticalOffset(float f2) {
        if (f2 != getCradleVerticalOffset()) {
            g topEdgeTreatment = getTopEdgeTreatment();
            Objects.requireNonNull(topEdgeTreatment);
            if (f2 >= 0.0f) {
                topEdgeTreatment.f2035d = f2;
                throw null;
            }
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    public void setElevation(float f2) {
        throw null;
    }

    public void setFabAlignmentMode(int i2) {
        int i3;
        this.f2154a0 = 0;
        boolean z2 = this.f2155b0;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (!u.g.c(this)) {
            int i4 = this.f2154a0;
            if (i4 != 0) {
                this.f2154a0 = 0;
                getMenu().clear();
                n(i4);
            }
        } else {
            Animator animator = this.S;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!C()) {
                z2 = false;
                i3 = 0;
            } else {
                i3 = i2;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
                if (Math.abs(actionMenuView.getTranslationX() - ((float) A(actionMenuView, i3, z2))) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                    ofFloat2.addListener(new d(this, actionMenuView, i3, z2));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150);
                    animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.S = animatorSet2;
            animatorSet2.addListener(new c(this));
            this.S.start();
        }
        if (this.T != i2 && u.g.c(this)) {
            Animator animator2 = this.R;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.U == 1) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(y(), "translationX", new float[]{B(i2)});
                ofFloat3.setDuration(300);
                arrayList2.add(ofFloat3);
            } else {
                FloatingActionButton y2 = y();
                if (y2 != null && !y2.j()) {
                    this.W++;
                    y2.i(new b1.b(this, i2), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.R = animatorSet3;
            animatorSet3.addListener(new b1.a(this));
            this.R.start();
        }
        this.T = i2;
    }

    public void setFabAnimationMode(int i2) {
        this.U = i2;
    }

    public void setFabCornerSize(float f2) {
        if (f2 != getTopEdgeTreatment().f2037f) {
            getTopEdgeTreatment().f2037f = f2;
            throw null;
        }
    }

    public void setFabCradleMargin(float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().f2034c = f2;
            throw null;
        }
    }

    public void setFabCradleRoundedCornerRadius(float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().f2033b = f2;
            throw null;
        }
    }

    public void setHideOnScroll(boolean z2) {
        this.V = z2;
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.Q == null)) {
            drawable = a0.a.g(drawable.mutate());
            drawable.setTint(this.Q.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i2) {
        this.Q = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    public final FloatingActionButton y() {
        View z2 = z();
        if (z2 instanceof FloatingActionButton) {
            return (FloatingActionButton) z2;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View z() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.e(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.z():android.view.View");
    }
}
