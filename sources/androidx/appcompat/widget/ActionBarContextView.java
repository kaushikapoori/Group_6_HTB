package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.supermarket.R;
import g0.u;

public class ActionBarContextView extends a {

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f316j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f317k;

    /* renamed from: l  reason: collision with root package name */
    public View f318l;

    /* renamed from: m  reason: collision with root package name */
    public View f319m;

    /* renamed from: n  reason: collision with root package name */
    public View f320n;

    /* renamed from: o  reason: collision with root package name */
    public LinearLayout f321o;

    /* renamed from: p  reason: collision with root package name */
    public TextView f322p;

    /* renamed from: q  reason: collision with root package name */
    public TextView f323q;

    /* renamed from: r  reason: collision with root package name */
    public int f324r;

    /* renamed from: s  reason: collision with root package name */
    public int f325s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f326t;

    /* renamed from: u  reason: collision with root package name */
    public int f327u;

    public class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h.a f328b;

        public a(ActionBarContextView actionBarContextView, h.a aVar) {
            this.f328b = aVar;
        }

        public void onClick(View view) {
            this.f328b.c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
        r0 = r5.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarContextView(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903070(0x7f03001e, float:1.7412948E38)
            r3.<init>(r4, r5, r0)
            int[] r1 = c.c.f2041d
            r2 = 0
            android.content.res.TypedArray r5 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r0 = r5.hasValue(r2)
            if (r0 == 0) goto L_0x001e
            int r0 = r5.getResourceId(r2, r2)
            if (r0 == 0) goto L_0x001e
            android.graphics.drawable.Drawable r4 = e.a.b(r4, r0)
            goto L_0x0022
        L_0x001e:
            android.graphics.drawable.Drawable r4 = r5.getDrawable(r2)
        L_0x0022:
            java.util.WeakHashMap<android.view.View, g0.x> r0 = g0.u.f3063a
            g0.u.d.q(r3, r4)
            r4 = 5
            int r4 = r5.getResourceId(r4, r2)
            r3.f324r = r4
            r4 = 4
            int r4 = r5.getResourceId(r4, r2)
            r3.f325s = r4
            r4 = 3
            int r4 = r5.getLayoutDimension(r4, r2)
            r3.f480f = r4
            r4 = 2
            r0 = 2131427333(0x7f0b0005, float:1.847628E38)
            int r4 = r5.getResourceId(r4, r0)
            r3.f327u = r4
            r5.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f(h.a r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.f318l
            r1 = 0
            if (r0 != 0) goto L_0x0016
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r6.f327u
            android.view.View r0 = r0.inflate(r2, r6, r1)
            r6.f318l = r0
            goto L_0x001e
        L_0x0016:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0021
            android.view.View r0 = r6.f318l
        L_0x001e:
            r6.addView(r0)
        L_0x0021:
            android.view.View r0 = r6.f318l
            r2 = 2131230786(0x7f080042, float:1.8077635E38)
            android.view.View r0 = r0.findViewById(r2)
            r6.f319m = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6, r7)
            r0.setOnClickListener(r2)
            android.view.Menu r7 = r7.e()
            androidx.appcompat.view.menu.e r7 = (androidx.appcompat.view.menu.e) r7
            androidx.appcompat.widget.c r0 = r6.f479e
            if (r0 == 0) goto L_0x0041
            r0.a()
        L_0x0041:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r2 = r6.getContext()
            r0.<init>(r2)
            r6.f479e = r0
            r2 = 1
            r0.f532m = r2
            r0.f533n = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r3 = -2
            r4 = -1
            r0.<init>(r3, r4)
            androidx.appcompat.widget.c r3 = r6.f479e
            android.content.Context r4 = r6.f477c
            r7.b(r3, r4)
            androidx.appcompat.widget.c r7 = r6.f479e
            androidx.appcompat.view.menu.j r3 = r7.f166i
            if (r3 != 0) goto L_0x0079
            android.view.LayoutInflater r4 = r7.f162e
            int r5 = r7.f164g
            android.view.View r1 = r4.inflate(r5, r6, r1)
            androidx.appcompat.view.menu.j r1 = (androidx.appcompat.view.menu.j) r1
            r7.f166i = r1
            androidx.appcompat.view.menu.e r4 = r7.f161d
            r1.c(r4)
            r7.h(r2)
        L_0x0079:
            androidx.appcompat.view.menu.j r1 = r7.f166i
            if (r3 == r1) goto L_0x0083
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r7)
        L_0x0083:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r6.f478d = r1
            r7 = 0
            java.util.WeakHashMap<android.view.View, g0.x> r2 = g0.u.f3063a
            g0.u.d.q(r1, r7)
            androidx.appcompat.widget.ActionMenuView r7 = r6.f478d
            r6.addView(r7, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.f(h.a):void");
    }

    public final void g() {
        if (this.f321o == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f321o = linearLayout;
            this.f322p = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f323q = (TextView) this.f321o.findViewById(R.id.action_bar_subtitle);
            if (this.f324r != 0) {
                this.f322p.setTextAppearance(getContext(), this.f324r);
            }
            if (this.f325s != 0) {
                this.f323q.setTextAppearance(getContext(), this.f325s);
            }
        }
        this.f322p.setText(this.f316j);
        this.f323q.setText(this.f317k);
        boolean z2 = !TextUtils.isEmpty(this.f316j);
        boolean z3 = !TextUtils.isEmpty(this.f317k);
        int i2 = 0;
        this.f323q.setVisibility(z3 ? 0 : 8);
        LinearLayout linearLayout2 = this.f321o;
        if (!z2 && !z3) {
            i2 = 8;
        }
        linearLayout2.setVisibility(i2);
        if (this.f321o.getParent() == null) {
            addView(this.f321o);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f317k;
    }

    public CharSequence getTitle() {
        return this.f316j;
    }

    public void h() {
        removeAllViews();
        this.f320n = null;
        this.f478d = null;
        this.f479e = null;
        View view = this.f319m;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f479e;
        if (cVar != null) {
            cVar.i();
            this.f479e.l();
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean b2 = i1.b(this);
        int paddingRight = b2 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f318l;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f318l.getLayoutParams();
            int i6 = b2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = b2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = b2 ? paddingRight - i6 : paddingRight + i6;
            int d2 = i8 + d(this.f318l, i8, paddingTop, paddingTop2, b2);
            paddingRight = b2 ? d2 - i7 : d2 + i7;
        }
        int i9 = paddingRight;
        LinearLayout linearLayout = this.f321o;
        if (!(linearLayout == null || this.f320n != null || linearLayout.getVisibility() == 8)) {
            i9 += d(this.f321o, i9, paddingTop, paddingTop2, b2);
        }
        int i10 = i9;
        View view2 = this.f320n;
        if (view2 != null) {
            d(view2, i10, paddingTop, paddingTop2, b2);
        }
        int paddingLeft = b2 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f478d;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b2);
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4 = 1073741824;
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i3) != 0) {
            int size = View.MeasureSpec.getSize(i2);
            int i5 = this.f480f;
            if (i5 <= 0) {
                i5 = View.MeasureSpec.getSize(i3);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i6 = i5 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
            View view = this.f318l;
            if (view != null) {
                int c2 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f318l.getLayoutParams();
                paddingLeft = c2 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f478d;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f478d, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f321o;
            if (linearLayout != null && this.f320n == null) {
                if (this.f326t) {
                    this.f321o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f321o.getMeasuredWidth();
                    boolean z2 = measuredWidth <= paddingLeft;
                    if (z2) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f321o.setVisibility(z2 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f320n;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i7 = layoutParams.width;
                int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i7 >= 0) {
                    paddingLeft = Math.min(i7, paddingLeft);
                }
                int i9 = layoutParams.height;
                if (i9 == -2) {
                    i4 = Integer.MIN_VALUE;
                }
                if (i9 >= 0) {
                    i6 = Math.min(i9, i6);
                }
                this.f320n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i4));
            }
            if (this.f480f <= 0) {
                int childCount = getChildCount();
                i5 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i5) {
                        i5 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i5);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i2) {
        this.f480f = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f320n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f320n = view;
        if (!(view == null || (linearLayout = this.f321o) == null)) {
            removeView(linearLayout);
            this.f321o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f317k = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f316j = charSequence;
        g();
        u.v(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f326t) {
            requestLayout();
        }
        this.f326t = z2;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i2) {
        super.setVisibility(i2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
