package a0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

public class e extends d {

    /* renamed from: i  reason: collision with root package name */
    public static Method f13i;

    public e(f fVar, Resources resources) {
        super(fVar, resources);
        e();
    }

    public e(Drawable drawable) {
        super(drawable);
        e();
    }

    public boolean c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f12g;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    public final void e() {
        if (f13i == null) {
            try {
                f13i = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e2);
            }
        }
    }

    public Rect getDirtyBounds() {
        return this.f12g.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.f12g.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f12g;
        if (!(drawable == null || (method = f13i) == null)) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e2) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e2);
            }
        }
        return false;
    }

    public void setHotspot(float f2, float f3) {
        this.f12g.setHotspot(f2, f3);
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        this.f12g.setHotspotBounds(i2, i3, i4, i5);
    }

    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public void setTint(int i2) {
        if (c()) {
            super.setTint(i2);
        } else {
            this.f12g.setTint(i2);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            this.f10e.f16c = colorStateList;
            d(getState());
            return;
        }
        this.f12g.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (c()) {
            this.f10e.f17d = mode;
            d(getState());
            return;
        }
        this.f12g.setTintMode(mode);
    }
}
