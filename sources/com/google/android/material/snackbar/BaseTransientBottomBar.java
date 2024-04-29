package com.google.android.material.snackbar;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.example.supermarket.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.b;
import g0.u;
import g0.x;
import java.util.Objects;
import java.util.WeakHashMap;
import o1.s;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f2490a = 0;

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: i  reason: collision with root package name */
        public final b f2491i = new b(this);

        public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            Objects.requireNonNull(this.f2491i);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    b a2 = b.a();
                    synchronized (a2.f2508a) {
                        a2.b((b.C0019b) null);
                    }
                }
            } else if (coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                b a3 = b.a();
                synchronized (a3.f2508a) {
                    a3.b((b.C0019b) null);
                }
            }
            return super.g(coordinatorLayout, view, motionEvent);
        }

        public boolean s(View view) {
            Objects.requireNonNull(this.f2491i);
            return view instanceof c;
        }
    }

    public class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                Objects.requireNonNull((BaseTransientBottomBar) message.obj);
                throw null;
            } else if (i2 != 1) {
                return false;
            } else {
                Objects.requireNonNull((BaseTransientBottomBar) message.obj);
                throw null;
            }
        }
    }

    public static class b {
        public b(SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.f2143f = SwipeDismissBehavior.t(0.0f, 0.1f, 1.0f);
            swipeDismissBehavior.f2144g = SwipeDismissBehavior.t(0.0f, 0.6f, 1.0f);
            swipeDismissBehavior.f2141d = 0;
        }
    }

    public static class c extends FrameLayout {

        /* renamed from: l  reason: collision with root package name */
        public static final View.OnTouchListener f2492l = new a();

        /* renamed from: b  reason: collision with root package name */
        public BaseTransientBottomBar<?> f2493b;

        /* renamed from: c  reason: collision with root package name */
        public int f2494c;

        /* renamed from: d  reason: collision with root package name */
        public final float f2495d;

        /* renamed from: e  reason: collision with root package name */
        public final float f2496e;

        /* renamed from: f  reason: collision with root package name */
        public final int f2497f;

        /* renamed from: g  reason: collision with root package name */
        public final int f2498g;

        /* renamed from: h  reason: collision with root package name */
        public ColorStateList f2499h;

        /* renamed from: i  reason: collision with root package name */
        public PorterDuff.Mode f2500i;

        /* renamed from: j  reason: collision with root package name */
        public Rect f2501j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2502k;

        public class a implements View.OnTouchListener {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(x1.a.a(context, attributeSet, 0, 0), attributeSet);
            Drawable drawable;
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, y0.a.f4388y);
            if (obtainStyledAttributes.hasValue(6)) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                u.i.s(this, (float) obtainStyledAttributes.getDimensionPixelSize(6, 0));
            }
            this.f2494c = obtainStyledAttributes.getInt(2, 0);
            this.f2495d = obtainStyledAttributes.getFloat(3, 1.0f);
            setBackgroundTintList(r1.c.a(context2, obtainStyledAttributes, 4));
            setBackgroundTintMode(s.b(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
            this.f2496e = obtainStyledAttributes.getFloat(1, 1.0f);
            this.f2497f = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            this.f2498g = obtainStyledAttributes.getDimensionPixelSize(7, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f2492l);
            setFocusable(true);
            if (getBackground() == null) {
                float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(c.b.h(c.b.f(this, R.attr.colorSurface), c.b.f(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
                if (this.f2499h != null) {
                    drawable = a0.a.g(gradientDrawable);
                    drawable.setTintList(this.f2499h);
                } else {
                    drawable = a0.a.g(gradientDrawable);
                }
                WeakHashMap<View, x> weakHashMap2 = u.f3063a;
                u.d.q(this, drawable);
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.f2493b = baseTransientBottomBar;
        }

        public float getActionTextColorAlpha() {
            return this.f2496e;
        }

        public int getAnimationMode() {
            return this.f2494c;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f2495d;
        }

        public int getMaxInlineActionWidth() {
            return this.f2498g;
        }

        public int getMaxWidth() {
            return this.f2497f;
        }

        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f2493b;
            if (baseTransientBottomBar != null) {
                Objects.requireNonNull(baseTransientBottomBar);
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
            }
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.h.c(this);
        }

        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar<?> baseTransientBottomBar = this.f2493b;
            if (baseTransientBottomBar != null) {
                Objects.requireNonNull(baseTransientBottomBar);
                b a2 = b.a();
                synchronized (a2.f2508a) {
                    a2.b((b.C0019b) null);
                }
            }
        }

        public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
            super.onLayout(z2, i2, i3, i4, i5);
        }

        public void onMeasure(int i2, int i3) {
            int i4;
            super.onMeasure(i2, i3);
            if (this.f2497f > 0 && getMeasuredWidth() > (i4 = this.f2497f)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
            }
        }

        public void setAnimationMode(int i2) {
            this.f2494c = i2;
        }

        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        public void setBackgroundDrawable(Drawable drawable) {
            if (!(drawable == null || this.f2499h == null)) {
                drawable = a0.a.g(drawable.mutate());
                drawable.setTintList(this.f2499h);
                drawable.setTintMode(this.f2500i);
            }
            super.setBackgroundDrawable(drawable);
        }

        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f2499h = colorStateList;
            if (getBackground() != null) {
                Drawable g2 = a0.a.g(getBackground().mutate());
                g2.setTintList(colorStateList);
                g2.setTintMode(this.f2500i);
                if (g2 != getBackground()) {
                    super.setBackgroundDrawable(g2);
                }
            }
        }

        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f2500i = mode;
            if (getBackground() != null) {
                Drawable g2 = a0.a.g(getBackground().mutate());
                g2.setTintMode(mode);
                if (g2 != getBackground()) {
                    super.setBackgroundDrawable(g2);
                }
            }
        }

        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f2502k && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.f2501j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                BaseTransientBottomBar<?> baseTransientBottomBar = this.f2493b;
                if (baseTransientBottomBar != null) {
                    int i2 = BaseTransientBottomBar.f2490a;
                    Objects.requireNonNull(baseTransientBottomBar);
                    throw null;
                }
            }
        }

        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f2492l);
            super.setOnClickListener(onClickListener);
        }
    }

    static {
        new Handler(Looper.getMainLooper(), new a());
    }
}
