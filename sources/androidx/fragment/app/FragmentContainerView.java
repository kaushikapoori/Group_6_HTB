package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.example.supermarket.R;
import g0.b0;
import g0.u;
import h.f;
import java.util.ArrayList;
import java.util.Iterator;
import p0.a;
import z.d;

public final class FragmentContainerView extends FrameLayout {

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<View> f1192b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<View> f1193c;

    /* renamed from: d  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1194d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1195e = true;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3712b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
            }
        }
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.f1193c;
        if (arrayList != null && arrayList.contains(view)) {
            if (this.f1192b == null) {
                this.f1192b = new ArrayList<>();
            }
            this.f1192b.add(view);
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof n ? (n) tag : null) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof n ? (n) tag : null) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z2);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        b0 j2 = b0.j(windowInsets, (View) null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1194d;
        b0 i2 = onApplyWindowInsetsListener != null ? b0.i(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : u.p(this, j2);
        if (!i2.g()) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                u.e(getChildAt(i3), i2);
            }
        }
        return windowInsets;
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.f1195e && this.f1192b != null) {
            for (int i2 = 0; i2 < this.f1192b.size(); i2++) {
                super.drawChild(canvas, this.f1192b.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f1195e || (arrayList = this.f1192b) == null || arrayList.size() <= 0 || !this.f1192b.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1193c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1192b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1195e = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public void removeDetachedView(View view, boolean z2) {
        if (z2) {
            a(view);
        }
        super.removeDetachedView(view, z2);
    }

    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    public void setDrawDisappearingViewsLast(boolean z2) {
        this.f1195e = z2;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1194d = onApplyWindowInsetsListener;
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1193c == null) {
                this.f1193c = new ArrayList<>();
            }
            this.f1193c.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, b0 b0Var) {
        super(context, attributeSet);
        View view;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f3712b);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        n H = b0Var.H(id);
        if (classAttribute != null && H == null) {
            if (id <= 0) {
                throw new IllegalStateException(d.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? f.a(" with tag ", string) : ""));
            }
            n a2 = b0Var.J().a(context.getClassLoader(), classAttribute);
            a2.L(context, attributeSet, (Bundle) null);
            a aVar = new a(b0Var);
            aVar.f1340o = true;
            a2.E = this;
            aVar.e(getId(), a2, string, 1);
            if (!aVar.f1332g) {
                aVar.f1196p.D(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = ((ArrayList) b0Var.f1217c.f()).iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            n nVar = h0Var.f1315c;
            if (nVar.f1393x == getId() && (view = nVar.F) != null && view.getParent() == null) {
                nVar.E = this;
                h0Var.b();
            }
        }
    }
}
