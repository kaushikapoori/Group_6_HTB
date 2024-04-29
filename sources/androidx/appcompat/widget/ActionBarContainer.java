package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c.c;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public class ActionBarContainer extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public boolean f306b;

    /* renamed from: c  reason: collision with root package name */
    public View f307c;

    /* renamed from: d  reason: collision with root package name */
    public View f308d;

    /* renamed from: e  reason: collision with root package name */
    public View f309e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f310f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f311g;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f312h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f313i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f314j;

    /* renamed from: k  reason: collision with root package name */
    public int f315k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.f2038a);
        boolean z2 = false;
        this.f310f = obtainStyledAttributes.getDrawable(0);
        this.f311g = obtainStyledAttributes.getDrawable(2);
        this.f315k = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f313i = true;
            this.f312h = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f313i ? this.f310f == null && this.f311g == null : this.f312h == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f310f;
        if (drawable != null && drawable.isStateful()) {
            this.f310f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f311g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f311g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f312h;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f312h.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f307c;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f310f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f311g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f312h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f308d = findViewById(R.id.action_bar);
        this.f309e = findViewById(R.id.action_context_bar);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f306b || super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z2, i2, i3, i4, i5);
        View view2 = this.f307c;
        boolean z3 = true;
        boolean z4 = false;
        boolean z5 = (view2 == null || view2.getVisibility() == 8) ? false : true;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            int i6 = ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
            view2.layout(i2, (measuredHeight - view2.getMeasuredHeight()) - i6, i4, measuredHeight - i6);
        }
        if (this.f313i) {
            Drawable drawable3 = this.f312h;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f310f != null) {
                if (this.f308d.getVisibility() == 0) {
                    drawable2 = this.f310f;
                    left = this.f308d.getLeft();
                    top = this.f308d.getTop();
                    right = this.f308d.getRight();
                    view = this.f308d;
                } else {
                    View view3 = this.f309e;
                    if (view3 == null || view3.getVisibility() != 0) {
                        this.f310f.setBounds(0, 0, 0, 0);
                        z4 = true;
                    } else {
                        drawable2 = this.f310f;
                        left = this.f309e.getLeft();
                        top = this.f309e.getTop();
                        right = this.f309e.getRight();
                        view = this.f309e;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z4 = true;
            }
            this.f314j = z5;
            if (!z5 || (drawable = this.f311g) == null) {
                z3 = z4;
            } else {
                drawable.setBounds(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            }
        }
        if (z3) {
            invalidate();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f308d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L_0x001c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L_0x001c
            int r0 = r3.f315k
            if (r0 < 0) goto L_0x001c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L_0x001c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f308d
            if (r4 != 0) goto L_0x0024
            return
        L_0x0024:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            android.view.View r0 = r3.f307c
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x006f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L_0x006f
            android.view.View r0 = r3.f308d
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L_0x0047
            android.view.View r0 = r3.f308d
        L_0x0042:
            int r0 = r3.a(r0)
            goto L_0x0053
        L_0x0047:
            android.view.View r0 = r3.f309e
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L_0x0052
            android.view.View r0 = r3.f309e
            goto L_0x0042
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r4 != r1) goto L_0x005a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L_0x005d
        L_0x005a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x005d:
            int r5 = r3.getMeasuredWidth()
            android.view.View r1 = r3.f307c
            int r1 = r3.a(r1)
            int r1 = r1 + r0
            int r4 = java.lang.Math.min(r1, r4)
            r3.setMeasuredDimension(r5, r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f310f;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f310f);
        }
        this.f310f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f308d;
            if (view != null) {
                this.f310f.setBounds(view.getLeft(), this.f308d.getTop(), this.f308d.getRight(), this.f308d.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f313i ? !(this.f310f == null && this.f311g == null) : this.f312h != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f312h;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f312h);
        }
        this.f312h = drawable;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f313i && (drawable2 = this.f312h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f313i ? this.f310f == null && this.f311g == null : this.f312h == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f311g;
        if (drawable3 != null) {
            drawable3.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.f311g);
        }
        this.f311g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f314j && (drawable2 = this.f311g) != null) {
                drawable2.setBounds(this.f307c.getLeft(), this.f307c.getTop(), this.f307c.getRight(), this.f307c.getBottom());
            }
        }
        boolean z2 = true;
        if (!this.f313i ? !(this.f310f == null && this.f311g == null) : this.f312h != null) {
            z2 = false;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(u0 u0Var) {
        View view = this.f307c;
        if (view != null) {
            removeView(view);
        }
        this.f307c = u0Var;
        if (u0Var != null) {
            addView(u0Var);
            ViewGroup.LayoutParams layoutParams = u0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            u0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z2) {
        this.f306b = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f310f;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f311g;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f312h;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i2) {
        if (i2 != 0) {
            return super.startActionModeForChild(view, callback, i2);
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f310f && !this.f313i) || (drawable == this.f311g && this.f314j) || ((drawable == this.f312h && this.f313i) || super.verifyDrawable(drawable));
    }
}
