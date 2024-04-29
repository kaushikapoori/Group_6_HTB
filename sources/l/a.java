package l;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;

public class a extends FrameLayout {

    /* renamed from: d  reason: collision with root package name */
    public static final d f3308d = new b();

    /* renamed from: b  reason: collision with root package name */
    public boolean f3309b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3310c;

    public ColorStateList getCardBackgroundColor() {
        ((b) f3308d).a((c) null);
        throw null;
    }

    public float getCardElevation() {
        throw null;
    }

    public int getContentPaddingBottom() {
        throw null;
    }

    public int getContentPaddingLeft() {
        throw null;
    }

    public int getContentPaddingRight() {
        throw null;
    }

    public int getContentPaddingTop() {
        throw null;
    }

    public float getMaxCardElevation() {
        ((b) f3308d).b((c) null);
        throw null;
    }

    public boolean getPreventCornerOverlap() {
        return this.f3310c;
    }

    public float getRadius() {
        ((b) f3308d).c((c) null);
        throw null;
    }

    public boolean getUseCompatPadding() {
        return this.f3309b;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(int i2) {
        ((b) f3308d).d((c) null, ColorStateList.valueOf(i2));
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ((b) f3308d).d((c) null, colorStateList);
        throw null;
    }

    public void setCardElevation(float f2) {
        throw null;
    }

    public void setMaxCardElevation(float f2) {
        ((b) f3308d).e((c) null, f2);
        throw null;
    }

    public void setMinimumHeight(int i2) {
        super.setMinimumHeight(i2);
    }

    public void setMinimumWidth(int i2) {
        super.setMinimumWidth(i2);
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.f3310c) {
            this.f3310c = z2;
            ((b) f3308d).a((c) null);
            throw null;
        }
    }

    public void setRadius(float f2) {
        ((b) f3308d).a((c) null);
        throw null;
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f3309b != z2) {
            this.f3309b = z2;
            ((b) f3308d).a((c) null);
            throw null;
        }
    }
}
