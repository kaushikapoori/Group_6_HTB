package q1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.u;
import c.b;
import com.example.supermarket.R;
import o1.n;
import r1.c;

public class a extends u {

    /* renamed from: h  reason: collision with root package name */
    public static final int[][] f3788h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f3789f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3790g;

    public a(Context context, AttributeSet attributeSet) {
        super(x1.a.a(context, attributeSet, R.attr.radioButtonStyle, 2131755982), attributeSet, R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray d2 = n.d(context2, attributeSet, y0.a.f4380q, R.attr.radioButtonStyle, 2131755982, new int[0]);
        if (d2.hasValue(0)) {
            setButtonTintList(c.a(context2, d2, 0));
        }
        this.f3790g = d2.getBoolean(1, false);
        d2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3789f == null) {
            int f2 = b.f(this, R.attr.colorControlActivated);
            int f3 = b.f(this, R.attr.colorOnSurface);
            int f4 = b.f(this, R.attr.colorSurface);
            int[][] iArr = f3788h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = b.h(f4, f2, 1.0f);
            iArr2[1] = b.h(f4, f3, 0.54f);
            iArr2[2] = b.h(f4, f3, 0.38f);
            iArr2[3] = b.h(f4, f3, 0.38f);
            this.f3789f = new ColorStateList(iArr, iArr2);
        }
        return this.f3789f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3790g && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f3790g = z2;
        setButtonTintList(z2 ? getMaterialThemeColorsTintList() : null);
    }
}
