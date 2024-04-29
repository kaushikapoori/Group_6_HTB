package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.k;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.example.supermarket.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import o1.f;
import o1.t;
import u1.n;
import z0.g;
import z0.j;

public class FloatingActionButton extends t implements m1.a, n, CoordinatorLayout.b {

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f2413c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f2414d;

    /* renamed from: e  reason: collision with root package name */
    public ColorStateList f2415e;

    /* renamed from: f  reason: collision with root package name */
    public PorterDuff.Mode f2416f;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f2417g;

    /* renamed from: h  reason: collision with root package name */
    public int f2418h;

    /* renamed from: i  reason: collision with root package name */
    public int f2419i;

    /* renamed from: j  reason: collision with root package name */
    public int f2420j;

    /* renamed from: k  reason: collision with root package name */
    public int f2421k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2422l;

    /* renamed from: m  reason: collision with root package name */
    public d f2423m;

    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f2424a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2425b;

        public BaseBehavior() {
            this.f2425b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.f4371h);
            this.f2425b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        public void c(CoordinatorLayout.f fVar) {
            if (fVar.f1065h == 0) {
                fVar.f1065h = 80;
            }
        }

        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1058a instanceof BottomSheetBehavior : false) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, int i2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            List<View> d2 = coordinatorLayout.d(floatingActionButton);
            int size = d2.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = d2.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1058a instanceof BottomSheetBehavior : false) && u(view2, floatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(floatingActionButton, i2);
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            if (this.f2425b && fVar.f1063f == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f2424a == null) {
                this.f2424a = new Rect();
            }
            Rect rect = this.f2424a;
            f.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.i((a) null, false);
                return true;
            }
            floatingActionButton.m((a) null, false);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (!s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.i((a) null, false);
                return true;
            }
            floatingActionButton.m((a) null, false);
            return true;
        }
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    public class b implements t1.b {
        public b() {
        }
    }

    public class c<T extends FloatingActionButton> implements d.f {

        /* renamed from: a  reason: collision with root package name */
        public final j<T> f2427a;

        public c(j<T> jVar) {
            this.f2427a = jVar;
        }

        public void a() {
            this.f2427a.a(FloatingActionButton.this);
        }

        public void b() {
            this.f2427a.b(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).f2427a.equals(this.f2427a);
        }

        public int hashCode() {
            return this.f2427a.hashCode();
        }
    }

    private d getImpl() {
        if (this.f2423m == null) {
            this.f2423m = new n1.c(this, new b());
        }
        return this.f2423m;
    }

    public boolean a() {
        throw null;
    }

    public void d(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.f2455p == null) {
            impl.f2455p = new ArrayList<>();
        }
        impl.f2455p.add((Object) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().k(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.f2454o == null) {
            impl.f2454o = new ArrayList<>();
        }
        impl.f2454o.add(animatorListener);
    }

    public void f(j<? extends FloatingActionButton> jVar) {
        d impl = getImpl();
        c cVar = new c((j) null);
        if (impl.f2456q == null) {
            impl.f2456q = new ArrayList<>();
        }
        impl.f2456q.add(cVar);
    }

    @Deprecated
    public boolean g(Rect rect) {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (!u.g.c(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        throw null;
    }

    public ColorStateList getBackgroundTintList() {
        return this.f2413c;
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f2414d;
    }

    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f2444e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f2445f;
    }

    public Drawable getContentBackground() {
        Objects.requireNonNull(getImpl());
        return null;
    }

    public int getCustomSize() {
        return this.f2419i;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public g getHideMotionSpec() {
        return getImpl().f2449j;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f2417g;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f2417g;
    }

    public u1.j getShapeAppearanceModel() {
        u1.j jVar = getImpl().f2440a;
        Objects.requireNonNull(jVar);
        return jVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f2448i;
    }

    public int getSize() {
        return this.f2418h;
    }

    public int getSizeDimension() {
        return h(this.f2418h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f2415e;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f2416f;
    }

    public boolean getUseCompatPadding() {
        return this.f2422l;
    }

    public final int h(int i2) {
        int i3 = this.f2419i;
        if (i3 != 0) {
            return i3;
        }
        Resources resources = getResources();
        if (i2 == -1) {
            return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
        }
        return resources.getDimensionPixelSize(i2 != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
    }

    public void i(a aVar, boolean z2) {
        d impl = getImpl();
        a aVar2 = aVar == null ? null : new a(this, aVar);
        if (!impl.g()) {
            Animator animator = impl.f2447h;
            if (animator != null) {
                animator.cancel();
            }
            if (impl.r()) {
                g gVar = impl.f2449j;
                AnimatorSet b2 = gVar != null ? impl.b(gVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f);
                b2.addListener(new b(impl, z2, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f2455p;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        b2.addListener(it.next());
                    }
                }
                b2.start();
                return;
            }
            impl.f2457r.b(z2 ? 8 : 4, z2);
            if (aVar2 != null) {
                aVar2.f2429a.a(aVar2.f2430b);
            }
        }
    }

    public boolean j() {
        return getImpl().g();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().i();
    }

    public boolean k() {
        return getImpl().h();
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            ColorStateList colorStateList = this.f2415e;
            if (colorStateList == null) {
                a0.a.a(drawable);
                return;
            }
            int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
            PorterDuff.Mode mode = this.f2416f;
            if (mode == null) {
                mode = PorterDuff.Mode.SRC_IN;
            }
            drawable.mutate().setColorFilter(k.c(colorForState, mode));
        }
    }

    public void m(a aVar, boolean z2) {
        d impl = getImpl();
        a aVar2 = aVar == null ? null : new a(this, aVar);
        if (!impl.h()) {
            Animator animator = impl.f2447h;
            if (animator != null) {
                animator.cancel();
            }
            boolean z3 = impl.f2448i == null;
            if (impl.r()) {
                if (impl.f2457r.getVisibility() != 0) {
                    float f2 = 0.0f;
                    impl.f2457r.setAlpha(0.0f);
                    impl.f2457r.setScaleY(z3 ? 0.4f : 0.0f);
                    impl.f2457r.setScaleX(z3 ? 0.4f : 0.0f);
                    if (z3) {
                        f2 = 0.4f;
                    }
                    impl.o(f2);
                }
                g gVar = impl.f2448i;
                AnimatorSet b2 = gVar != null ? impl.b(gVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f);
                b2.addListener(new c(impl, z2, aVar2));
                ArrayList<Animator.AnimatorListener> arrayList = impl.f2454o;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        b2.addListener(it.next());
                    }
                }
                b2.start();
                return;
            }
            impl.f2457r.b(0, z2);
            impl.f2457r.setAlpha(1.0f);
            impl.f2457r.setScaleY(1.0f);
            impl.f2457r.setScaleX(1.0f);
            impl.o(1.0f);
            if (aVar2 != null) {
                aVar2.f2429a.b(aVar2.f2430b);
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        Objects.requireNonNull(impl);
        if (!(impl instanceof n1.c)) {
            ViewTreeObserver viewTreeObserver = impl.f2457r.getViewTreeObserver();
            if (impl.f2463x == null) {
                impl.f2463x = new n1.b(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f2463x);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f2457r.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = impl.f2463x;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            impl.f2463x = null;
        }
    }

    public void onMeasure(int i2, int i3) {
        this.f2420j = (getSizeDimension() - this.f2421k) / 2;
        getImpl().u();
        throw null;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v1.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v1.a aVar = (v1.a) parcelable;
        super.onRestoreInstanceState(aVar.f3321b);
        Bundle orDefault = aVar.f4128d.getOrDefault("expandableWidgetHelper", null);
        Objects.requireNonNull(orDefault);
        Bundle bundle = orDefault;
        throw null;
    }

    public Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        throw null;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g((Rect) null);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setBackgroundColor(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundResource(int i2) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2413c != colorStateList) {
            this.f2413c = colorStateList;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f2414d != mode) {
            this.f2414d = mode;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setCompatElevation(float f2) {
        d impl = getImpl();
        if (impl.f2443d != f2) {
            impl.f2443d = f2;
            impl.l(f2, impl.f2444e, impl.f2445f);
        }
    }

    public void setCompatElevationResource(int i2) {
        setCompatElevation(getResources().getDimension(i2));
    }

    public void setCompatHoveredFocusedTranslationZ(float f2) {
        d impl = getImpl();
        if (impl.f2444e != f2) {
            impl.f2444e = f2;
            impl.l(impl.f2443d, f2, impl.f2445f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i2) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i2));
    }

    public void setCompatPressedTranslationZ(float f2) {
        d impl = getImpl();
        if (impl.f2445f != f2) {
            impl.f2445f = f2;
            impl.l(impl.f2443d, impl.f2444e, f2);
        }
    }

    public void setCompatPressedTranslationZResource(int i2) {
        setCompatPressedTranslationZ(getResources().getDimension(i2));
    }

    public void setCustomSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        } else if (i2 != this.f2419i) {
            this.f2419i = i2;
            requestLayout();
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        Objects.requireNonNull(getImpl());
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        if (z2 != getImpl().f2441b) {
            getImpl().f2441b = z2;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i2) {
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f2449j = gVar;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(g.b(getContext(), i2));
    }

    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            impl.o(impl.f2451l);
            if (this.f2415e != null) {
                l();
            }
        }
    }

    public void setImageResource(int i2) {
        throw null;
    }

    public void setMaxImageSize(int i2) {
        this.f2421k = i2;
        d impl = getImpl();
        if (impl.f2452m != i2) {
            impl.f2452m = i2;
            impl.o(impl.f2451l);
        }
    }

    public void setRippleColor(int i2) {
        setRippleColor(ColorStateList.valueOf(i2));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f2417g != colorStateList) {
            this.f2417g = colorStateList;
            getImpl().p(this.f2417g);
        }
    }

    public void setScaleX(float f2) {
        super.setScaleX(f2);
        getImpl().m();
    }

    public void setScaleY(float f2) {
        super.setScaleY(f2);
        getImpl().m();
    }

    public void setShadowPaddingEnabled(boolean z2) {
        d impl = getImpl();
        impl.f2442c = z2;
        impl.u();
        throw null;
    }

    public void setShapeAppearanceModel(u1.j jVar) {
        getImpl().f2440a = jVar;
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f2448i = gVar;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(g.b(getContext(), i2));
    }

    public void setSize(int i2) {
        this.f2419i = 0;
        if (i2 != this.f2418h) {
            this.f2418h = i2;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f2415e != colorStateList) {
            this.f2415e = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f2416f != mode) {
            this.f2416f = mode;
            l();
        }
    }

    public void setTranslationX(float f2) {
        super.setTranslationX(f2);
        getImpl().n();
    }

    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        getImpl().n();
    }

    public void setTranslationZ(float f2) {
        super.setTranslationZ(f2);
        getImpl().n();
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f2422l != z2) {
            this.f2422l = z2;
            getImpl().j();
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
    }
}
