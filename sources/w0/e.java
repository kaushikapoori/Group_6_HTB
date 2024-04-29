package w0;

import a0.b;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public abstract class e extends Drawable implements b {

    /* renamed from: b  reason: collision with root package name */
    public Drawable f4176b;

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getState() : super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.setLevel(i2) : super.onLevelChange(i2);
    }

    public void setChangingConfigurations(int i2) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setChangingConfigurations(i2);
        } else {
            super.setChangingConfigurations(i2);
        }
    }

    public void setColorFilter(int i2, PorterDuff.Mode mode) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setColorFilter(i2, mode);
        } else {
            super.setColorFilter(i2, mode);
        }
    }

    public void setFilterBitmap(boolean z2) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setFilterBitmap(z2);
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    public boolean setState(int[] iArr) {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
