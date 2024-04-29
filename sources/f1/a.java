package f1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import c.b;
import com.example.supermarket.R;
import o1.n;
import o1.s;
import r1.c;

public class a extends g {

    /* renamed from: i  reason: collision with root package name */
    public static final int[][] f2986i = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f2987f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2988g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2989h;

    public a(Context context, AttributeSet attributeSet) {
        super(x1.a.a(context, attributeSet, R.attr.checkboxStyle, 2131755981), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d2 = n.d(context2, attributeSet, y0.a.f4379p, R.attr.checkboxStyle, 2131755981, new int[0]);
        if (d2.hasValue(0)) {
            setButtonTintList(c.a(context2, d2, 0));
        }
        this.f2988g = d2.getBoolean(2, false);
        this.f2989h = d2.getBoolean(1, true);
        d2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2987f == null) {
            int[][] iArr = f2986i;
            int[] iArr2 = new int[iArr.length];
            int f2 = b.f(this, R.attr.colorControlActivated);
            int f3 = b.f(this, R.attr.colorSurface);
            int f4 = b.f(this, R.attr.colorOnSurface);
            iArr2[0] = b.h(f3, f2, 1.0f);
            iArr2[1] = b.h(f3, f4, 0.54f);
            iArr2[2] = b.h(f3, f4, 0.38f);
            iArr2[3] = b.h(f3, f4, 0.38f);
            this.f2987f = new ColorStateList(iArr, iArr2);
        }
        return this.f2987f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2988g && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void onDraw(Canvas canvas) {
        Drawable a2;
        if (!this.f2989h || !TextUtils.isEmpty(getText()) || (a2 = j0.c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - a2.getIntrinsicWidth()) / 2) * (s.a(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = a2.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f2989h = z2;
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f2988g = z2;
        setButtonTintList(z2 ? getMaterialThemeColorsTintList() : null);
    }
}
