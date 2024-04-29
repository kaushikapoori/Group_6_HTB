package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import g0.u;
import g0.x;
import java.util.List;
import java.util.WeakHashMap;
import o1.f;
import z0.g;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f2408u = 0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2409t;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f2410a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2411b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2412c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f2411b = false;
            this.f2412c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.f4370g);
            this.f2411b = obtainStyledAttributes.getBoolean(0, false);
            this.f2412c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        public /* bridge */ /* synthetic */ boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        public void c(CoordinatorLayout.f fVar) {
            if (fVar.f1065h == 0) {
                fVar.f1065h = 80;
            }
        }

        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1058a instanceof BottomSheetBehavior : false) {
                    u(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, int i2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> d2 = coordinatorLayout.d(extendedFloatingActionButton);
            int size = d2.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = d2.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1058a instanceof BottomSheetBehavior : false) && u(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(extendedFloatingActionButton, i2);
            return true;
        }

        public final boolean s(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f2411b || this.f2412c) && fVar.f1063f == view.getId()) {
                return true;
            }
            return false;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!s(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f2410a == null) {
                this.f2410a = new Rect();
            }
            Rect rect = this.f2410a;
            f.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                int i2 = ExtendedFloatingActionButton.f2408u;
                throw null;
            }
            int i3 = ExtendedFloatingActionButton.f2408u;
            throw null;
        }

        public final boolean u(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!s(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                int i2 = ExtendedFloatingActionButton.f2408u;
                throw null;
            }
            int i3 = ExtendedFloatingActionButton.f2408u;
            throw null;
        }
    }

    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public class b extends Property<View, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public class c extends Property<View, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            return Float.valueOf((float) u.e.f((View) obj));
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            int intValue = ((Float) obj2).intValue();
            int paddingTop = view.getPaddingTop();
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.e.k(view, intValue, paddingTop, u.e.e(view), view.getPaddingBottom());
        }
    }

    public class d extends Property<View, Float> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            return Float.valueOf((float) u.e.e((View) obj));
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.e.k(view, u.e.f(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
        }
    }

    static {
        Class<Float> cls = Float.class;
        new a(cls, "width");
        new b(cls, "height");
        new c(cls, "paddingStart");
        new d(cls, "paddingEnd");
    }

    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z2) {
        this.f2409t = z2;
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(g.b(getContext(), i2));
    }

    public void setExtended(boolean z2) {
        if (z2) {
            throw null;
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(g.b(getContext(), i2));
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(g.b(getContext(), i2));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(g.b(getContext(), i2));
    }

    public void setTextColor(int i2) {
        super.setTextColor(i2);
        getTextColors();
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
