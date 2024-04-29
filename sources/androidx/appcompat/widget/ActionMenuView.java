package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.m0;
import g0.g;
import java.util.Iterator;

public class ActionMenuView extends m0 implements e.b, j {
    public int A;
    public e B;

    /* renamed from: q  reason: collision with root package name */
    public androidx.appcompat.view.menu.e f357q;

    /* renamed from: r  reason: collision with root package name */
    public Context f358r;

    /* renamed from: s  reason: collision with root package name */
    public int f359s = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f360t;

    /* renamed from: u  reason: collision with root package name */
    public c f361u;

    /* renamed from: v  reason: collision with root package name */
    public i.a f362v;

    /* renamed from: w  reason: collision with root package name */
    public e.a f363w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f364x;

    /* renamed from: y  reason: collision with root package name */
    public int f365y;

    /* renamed from: z  reason: collision with root package name */
    public int f366z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements i.a {
        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends m0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f367a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f368b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f369c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f370d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f371e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f372f;

        public c(int i2, int i3) {
            super(i2, i3);
            this.f367a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f367a = cVar.f367a;
        }
    }

    public class d implements e.a {
        public d() {
        }

        public void a(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.f363w;
            if (aVar != null) {
                aVar.a(eVar);
            }
        }

        public boolean b(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            boolean z2;
            boolean z3;
            e eVar2 = ActionMenuView.this.B;
            if (eVar2 != null) {
                Toolbar.a aVar = (Toolbar.a) eVar2;
                Iterator<g> it = Toolbar.this.H.f3051a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().b(menuItem)) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (z2) {
                    z3 = true;
                } else {
                    Toolbar.f fVar = Toolbar.this.J;
                    z3 = fVar != null ? fVar.onMenuItemClick(menuItem) : false;
                }
                if (z3) {
                    return true;
                }
            }
            return false;
        }
    }

    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f366z = (int) (56.0f * f2);
        this.A = (int) (f2 * 4.0f);
        this.f358r = context;
    }

    public static int o(View view, int i2, int i3, int i4, int i5) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z2 = false;
        boolean z3 = actionMenuItemView != null && actionMenuItemView.c();
        int i6 = 2;
        if (i3 <= 0 || (z3 && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i7 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i7++;
            }
            if (!z3 || i7 >= 2) {
                i6 = i7;
            }
        }
        if (!cVar.f367a && z3) {
            z2 = true;
        }
        cVar.f370d = z2;
        cVar.f368b = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i6, 1073741824), makeMeasureSpec);
        return i6;
    }

    public boolean b(androidx.appcompat.view.menu.g gVar) {
        return this.f357q.r(gVar, (i) null, 0);
    }

    public void c(androidx.appcompat.view.menu.e eVar) {
        this.f357q = eVar;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f357q == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f357q = eVar;
            eVar.f220e = new d();
            c cVar = new c(context);
            this.f361u = cVar;
            cVar.f532m = true;
            cVar.f533n = true;
            i.a aVar = this.f362v;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f163f = aVar;
            this.f357q.b(cVar, this.f358r);
            c cVar2 = this.f361u;
            cVar2.f166i = this;
            this.f357q = cVar2.f161d;
        }
        return this.f357q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        c cVar = this.f361u;
        c.d dVar = cVar.f529j;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.f531l) {
            return cVar.f530k;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f359s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public m0.a i(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* renamed from: l */
    public c h() {
        c cVar = new c(-2, -2);
        cVar.gravity = 16;
        return cVar;
    }

    /* renamed from: m */
    public c j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return h();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.gravity <= 0) {
            cVar.gravity = 16;
        }
        return cVar;
    }

    public boolean n(int i2) {
        boolean z2 = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            z2 = false | ((a) childAt).b();
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? z2 : z2 | ((a) childAt2).a();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c cVar = this.f361u;
        if (cVar != null) {
            cVar.h(false);
            if (this.f361u.m()) {
                this.f361u.i();
                this.f361u.n();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f361u;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        if (!this.f364x) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i4 - i2;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean b2 = i1.b(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f367a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b2) {
                        i6 = getPaddingLeft() + cVar.leftMargin;
                        i7 = i6 + measuredWidth;
                    } else {
                        i7 = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i6 = i7 - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i6, i13, i7, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    n(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (b2) {
            int width = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f367a) {
                    int i18 = width - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width = i18 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f367a) {
                int i21 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = measuredWidth4 + cVar3.rightMargin + max + i21;
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        androidx.appcompat.view.menu.e eVar;
        boolean z5 = this.f364x;
        boolean z6 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f364x = z6;
        if (z5 != z6) {
            this.f365y = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (!(!this.f364x || (eVar = this.f357q) == null || size == this.f365y)) {
            this.f365y = size;
            eVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f364x || childCount <= 0) {
            int i8 = i3;
            for (int i9 = 0; i9 < childCount; i9++) {
                c cVar = (c) getChildAt(i9).getLayoutParams();
                cVar.rightMargin = 0;
                cVar.leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i10 = size2 - paddingRight;
        int i11 = this.f366z;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (i12 == 0) {
            setMeasuredDimension(i10, 0);
            return;
        }
        int i14 = (i13 / i12) + i11;
        int childCount2 = getChildCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        boolean z7 = false;
        long j2 = 0;
        while (i19 < childCount2) {
            View childAt = getChildAt(i19);
            int i20 = size3;
            int i21 = i10;
            if (childAt.getVisibility() != 8) {
                boolean z8 = childAt instanceof ActionMenuItemView;
                int i22 = i15 + 1;
                if (z8) {
                    int i23 = this.A;
                    i7 = i22;
                    z4 = false;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    i7 = i22;
                    z4 = false;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f372f = z4;
                cVar2.f369c = z4 ? 1 : 0;
                cVar2.f368b = z4;
                cVar2.f370d = z4;
                cVar2.leftMargin = z4;
                cVar2.rightMargin = z4;
                cVar2.f371e = z8 && ((ActionMenuItemView) childAt).c();
                int o2 = o(childAt, i14, cVar2.f367a ? 1 : i12, childMeasureSpec, paddingBottom);
                i17 = Math.max(i17, o2);
                if (cVar2.f370d) {
                    i18++;
                }
                if (cVar2.f367a) {
                    z7 = true;
                }
                i12 -= o2;
                i16 = Math.max(i16, childAt.getMeasuredHeight());
                if (o2 == 1) {
                    j2 |= (long) (1 << i19);
                }
                i15 = i7;
            }
            i19++;
            size3 = i20;
            i10 = i21;
        }
        int i24 = i10;
        int i25 = size3;
        boolean z9 = z7 && i15 == 2;
        boolean z10 = false;
        while (true) {
            if (i18 <= 0 || i12 <= 0) {
                i4 = i16;
                z2 = z10;
            } else {
                int i26 = Integer.MAX_VALUE;
                int i27 = 0;
                int i28 = 0;
                long j3 = 0;
                while (i27 < childCount2) {
                    int i29 = i16;
                    c cVar3 = (c) getChildAt(i27).getLayoutParams();
                    boolean z11 = z10;
                    if (cVar3.f370d) {
                        int i30 = cVar3.f368b;
                        if (i30 < i26) {
                            j3 = 1 << i27;
                            i26 = i30;
                            i28 = 1;
                        } else if (i30 == i26) {
                            i28++;
                            j3 |= 1 << i27;
                        }
                    }
                    i27++;
                    z10 = z11;
                    i16 = i29;
                }
                i4 = i16;
                z2 = z10;
                j2 |= j3;
                if (i28 > i12) {
                    break;
                }
                int i31 = i26 + 1;
                int i32 = 0;
                while (i32 < childCount2) {
                    View childAt2 = getChildAt(i32);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i33 = i18;
                    long j4 = (long) (1 << i32);
                    if ((j3 & j4) == 0) {
                        if (cVar4.f368b == i31) {
                            j2 |= j4;
                        }
                        z3 = z9;
                    } else {
                        if (!z9 || !cVar4.f371e || i12 != 1) {
                            z3 = z9;
                        } else {
                            int i34 = this.A;
                            z3 = z9;
                            childAt2.setPadding(i34 + i14, 0, i34, 0);
                        }
                        cVar4.f368b++;
                        cVar4.f372f = true;
                        i12--;
                    }
                    i32++;
                    i18 = i33;
                    z9 = z3;
                }
                i16 = i4;
                z10 = true;
            }
        }
        i4 = i16;
        z2 = z10;
        boolean z12 = !z7 && i15 == 1;
        if (i12 > 0 && j2 != 0 && (i12 < i15 - 1 || z12 || i17 > 1)) {
            float bitCount = (float) Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f371e) {
                    bitCount -= 0.5f;
                }
                int i35 = childCount2 - 1;
                if ((j2 & ((long) (1 << i35))) != 0 && !((c) getChildAt(i35).getLayoutParams()).f371e) {
                    bitCount -= 0.5f;
                }
            }
            int i36 = bitCount > 0.0f ? (int) (((float) (i12 * i14)) / bitCount) : 0;
            for (int i37 = 0; i37 < childCount2; i37++) {
                if ((j2 & ((long) (1 << i37))) != 0) {
                    View childAt3 = getChildAt(i37);
                    c cVar5 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.f369c = i36;
                        cVar5.f372f = true;
                        if (i37 == 0 && !cVar5.f371e) {
                            cVar5.leftMargin = (-i36) / 2;
                        }
                    } else if (cVar5.f367a) {
                        cVar5.f369c = i36;
                        cVar5.f372f = true;
                        cVar5.rightMargin = (-i36) / 2;
                    } else {
                        if (i37 != 0) {
                            cVar5.leftMargin = i36 / 2;
                        }
                        if (i37 != childCount2 - 1) {
                            cVar5.rightMargin = i36 / 2;
                        }
                    }
                    z2 = true;
                }
            }
        }
        if (z2) {
            for (int i38 = 0; i38 < childCount2; i38++) {
                View childAt4 = getChildAt(i38);
                c cVar6 = (c) childAt4.getLayoutParams();
                if (cVar6.f372f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f368b * i14) + cVar6.f369c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i6 = i24;
            i5 = i4;
        } else {
            i5 = i25;
            i6 = i24;
        }
        setMeasuredDimension(i6, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f361u.f537r = z2;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        c cVar = this.f361u;
        c.d dVar = cVar.f529j;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.f531l = true;
        cVar.f530k = drawable;
    }

    public void setOverflowReserved(boolean z2) {
        this.f360t = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.f359s != i2) {
            this.f359s = i2;
            if (i2 == 0) {
                this.f358r = getContext();
            } else {
                this.f358r = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(c cVar) {
        this.f361u = cVar;
        cVar.f166i = this;
        this.f357q = cVar.f161d;
    }
}
