package a1;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.b;
import com.google.android.material.appbar.AppBarLayout;
import g0.b0;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public abstract class c extends d<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f30c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f31d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public int f32e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f33f;

    public c() {
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        AppBarLayout w2;
        b0 lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (w2 = ((AppBarLayout.ScrollingViewBehavior) this).w(coordinatorLayout.d(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (size > 0) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (u.d.b(w2) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.b() + lastWindowInsets.e();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.s(view, i2, i3, View.MeasureSpec.makeMeasureSpec((size + w2.getTotalScrollRange()) - w2.getMeasuredHeight(), i6 == -1 ? 1073741824 : Integer.MIN_VALUE), i5);
        return true;
    }

    public void t(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int i3;
        AppBarLayout w2 = ((AppBarLayout.ScrollingViewBehavior) this).w(coordinatorLayout.d(view));
        if (w2 != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.f30c;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, w2.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((w2.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            b0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                if (u.d.b(coordinatorLayout) && !u.d.b(view)) {
                    rect.left = lastWindowInsets.c() + rect.left;
                    rect.right -= lastWindowInsets.d();
                }
            }
            Rect rect2 = this.f31d;
            int i4 = fVar.f1060c;
            Gravity.apply(i4 == 0 ? 8388659 : i4, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
            int v2 = v(w2);
            view.layout(rect2.left, rect2.top - v2, rect2.right, rect2.bottom - v2);
            i3 = rect2.top - w2.getBottom();
        } else {
            coordinatorLayout.r(view, i2);
            i3 = 0;
        }
        this.f32e = i3;
    }

    public final int v(View view) {
        int i2;
        if (this.f33f == 0) {
            return 0;
        }
        float f2 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f1058a;
            int v2 = cVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) cVar).v() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + v2 > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f2 = 1.0f + (((float) v2) / ((float) i2));
            }
        }
        int i3 = this.f33f;
        return b.b((int) (f2 * ((float) i3)), 0, i3);
    }
}
