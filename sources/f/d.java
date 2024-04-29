package f;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class d extends Drawable implements Drawable.Callback {

    /* renamed from: b  reason: collision with root package name */
    public Drawable f2980b;

    public d(Drawable drawable) {
        Drawable drawable2 = this.f2980b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f2980b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void draw(Canvas canvas) {
        this.f2980b.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.f2980b.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f2980b.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2980b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2980b.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2980b.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2980b.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2980b.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f2980b.getPadding(rect);
    }

    public int[] getState() {
        return this.f2980b.getState();
    }

    public Region getTransparentRegion() {
        return this.f2980b.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f2980b.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.f2980b.isStateful();
    }

    public void jumpToCurrentState() {
        this.f2980b.jumpToCurrentState();
    }

    public void onBoundsChange(Rect rect) {
        this.f2980b.setBounds(rect);
    }

    public boolean onLevelChange(int i2) {
        return this.f2980b.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.f2980b.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z2) {
        this.f2980b.setAutoMirrored(z2);
    }

    public void setChangingConfigurations(int i2) {
        this.f2980b.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2980b.setColorFilter(colorFilter);
    }

    public void setDither(boolean z2) {
        this.f2980b.setDither(z2);
    }

    public void setFilterBitmap(boolean z2) {
        this.f2980b.setFilterBitmap(z2);
    }

    public void setHotspot(float f2, float f3) {
        this.f2980b.setHotspot(f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f2980b.setHotspotBounds(i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        return this.f2980b.setState(iArr);
    }

    public void setTint(int i2) {
        this.f2980b.setTint(i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2980b.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f2980b.setTintMode(mode);
    }

    public boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f2980b.setVisible(z2, z3);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
