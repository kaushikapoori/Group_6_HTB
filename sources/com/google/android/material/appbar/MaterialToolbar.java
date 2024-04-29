package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c.b;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import o1.n;
import o1.o;
import u1.g;
import x1.a;

public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] V = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer Q;
    public boolean R;
    public boolean S;
    public ImageView.ScaleType T;
    public Boolean U;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, 2131756056), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        int i2 = 0;
        TypedArray d2 = n.d(context2, attributeSet, y0.a.f4384u, R.attr.toolbarStyle, 2131756056, new int[0]);
        if (d2.hasValue(2)) {
            setNavigationIconTint(d2.getColor(2, -1));
        }
        this.R = d2.getBoolean(4, false);
        this.S = d2.getBoolean(3, false);
        int i3 = d2.getInt(1, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = V;
            if (i3 < scaleTypeArr.length) {
                this.T = scaleTypeArr[i3];
            }
        }
        if (d2.hasValue(0)) {
            this.U = Boolean.valueOf(d2.getBoolean(0, false));
        }
        d2.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.q(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i2));
            gVar.f3911b.f3936b = new l1.a(context2);
            gVar.x();
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            gVar.p(u.i.i(this));
            u.d.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.T;
    }

    public Integer getNavigationIconTint() {
        return this.Q;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            b.l(this, (g) background);
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        ImageView imageView2 = null;
        if (this.R || this.S) {
            List<TextView> a2 = o.a(this, getTitle());
            TextView textView = ((ArrayList) a2).isEmpty() ? null : (TextView) Collections.min(a2, o.f3599a);
            List<TextView> a3 = o.a(this, getSubtitle());
            TextView textView2 = ((ArrayList) a3).isEmpty() ? null : (TextView) Collections.max(a3, o.f3599a);
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i7 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i8 = 0; i8 < getChildCount(); i8++) {
                    View childAt = getChildAt(i8);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i7 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i7 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.R && textView != null) {
                    x(textView, pair);
                }
                if (this.S && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i6 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i6);
                if ((childAt2 instanceof ImageView) && (drawable = imageView.getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = (ImageView) childAt2;
                    break;
                }
                i6++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.U;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.T;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        b.k(this, f2);
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.U;
        if (bool == null || bool.booleanValue() != z2) {
            this.U = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.T != scaleType) {
            this.T = scaleType;
            requestLayout();
        }
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

    public void setSubtitleCentered(boolean z2) {
        if (this.S != z2) {
            this.S = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.R != z2) {
            this.R = z2;
            requestLayout();
        }
    }

    public final void x(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i2 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i2;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i2, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i2 += max;
            i3 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i3 - i2, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i2, view.getTop(), i3, view.getBottom());
    }
}
