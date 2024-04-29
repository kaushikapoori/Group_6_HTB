package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c.c;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public boolean f375b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f376c;

    /* renamed from: d  reason: collision with root package name */
    public int f377d = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = c.f2048k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        u.t(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f375b = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f375b);
        }
    }

    private void setStacked(boolean z2) {
        if (this.f376c == z2) {
            return;
        }
        if (!z2 || this.f375b) {
            this.f376c = z2;
            setOrientation(z2 ? 1 : 0);
            setGravity(z2 ? 8388613 : 80);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z2 ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final int a(int i2) {
        int childCount = getChildCount();
        while (i2 < childCount) {
            if (getChildAt(i2).getVisibility() == 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public void onMeasure(int i2, int i3) {
        boolean z2;
        int i4;
        int size = View.MeasureSpec.getSize(i2);
        int i5 = 0;
        if (this.f375b) {
            if (size > this.f377d && this.f376c) {
                setStacked(false);
            }
            this.f377d = size;
        }
        if (this.f376c || View.MeasureSpec.getMode(i2) != 1073741824) {
            i4 = i2;
            z2 = false;
        } else {
            i4 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z2 = true;
        }
        super.onMeasure(i4, i3);
        if (this.f375b && !this.f376c) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z2 = true;
            }
        }
        if (z2) {
            super.onMeasure(i2, i3);
        }
        int a2 = a(0);
        if (a2 >= 0) {
            View childAt = getChildAt(a2);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (this.f376c) {
                int a3 = a(a2 + 1);
                i5 = a3 >= 0 ? getChildAt(a3).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i5 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (u.d.d(this) != i5) {
            setMinimumHeight(i5);
            if (i3 == 0) {
                super.onMeasure(i2, i3);
            }
        }
    }

    public void setAllowStacking(boolean z2) {
        if (this.f375b != z2) {
            this.f375b = z2;
            if (!z2 && this.f376c) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
