package a0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class d extends Drawable implements Drawable.Callback, c, b {

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f6h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    public int f7b;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f8c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9d;

    /* renamed from: e  reason: collision with root package name */
    public f f10e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f12g;

    public d(f fVar, Resources resources) {
        Drawable.ConstantState constantState;
        this.f10e = fVar;
        if (fVar != null && (constantState = fVar.f15b) != null) {
            b(constantState.newDrawable(resources));
        }
    }

    public final Drawable a() {
        return this.f12g;
    }

    public final void b(Drawable drawable) {
        Drawable drawable2 = this.f12g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f12g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            f fVar = this.f10e;
            if (fVar != null) {
                fVar.f15b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public boolean c() {
        throw null;
    }

    public final boolean d(int[] iArr) {
        if (!c()) {
            return false;
        }
        f fVar = this.f10e;
        ColorStateList colorStateList = fVar.f16c;
        PorterDuff.Mode mode = fVar.f17d;
        if (colorStateList == null || mode == null) {
            this.f9d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f9d && colorForState == this.f7b && mode == this.f8c)) {
                setColorFilter(colorForState, mode);
                this.f7b = colorForState;
                this.f8c = mode;
                this.f9d = true;
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        this.f12g.draw(canvas);
    }

    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        f fVar = this.f10e;
        return changingConfigurations | (fVar != null ? fVar.getChangingConfigurations() : 0) | this.f12g.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        f fVar = this.f10e;
        if (fVar == null) {
            return null;
        }
        if (!(fVar.f15b != null)) {
            return null;
        }
        fVar.f14a = getChangingConfigurations();
        return this.f10e;
    }

    public Drawable getCurrent() {
        return this.f12g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f12g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f12g.getIntrinsicWidth();
    }

    public int getLayoutDirection() {
        return a.b(this.f12g);
    }

    public int getMinimumHeight() {
        return this.f12g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f12g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f12g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.f12g.getPadding(rect);
    }

    public int[] getState() {
        return this.f12g.getState();
    }

    public Region getTransparentRegion() {
        return this.f12g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return this.f12g.isAutoMirrored();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f10e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x000d
            a0.f r0 = r1.f10e
            if (r0 == 0) goto L_0x000d
            android.content.res.ColorStateList r0 = r0.f16c
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001e
        L_0x0016:
            android.graphics.drawable.Drawable r0 = r1.f12g
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0020
        L_0x001e:
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.d.isStateful():boolean");
    }

    public void jumpToCurrentState() {
        this.f12g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f11f && super.mutate() == this) {
            this.f10e = new f(this.f10e);
            Drawable drawable = this.f12g;
            if (drawable != null) {
                drawable.mutate();
            }
            f fVar = this.f10e;
            if (fVar != null) {
                Drawable drawable2 = this.f12g;
                fVar.f15b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f11f = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f12g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        return a.c(this.f12g, i2);
    }

    public boolean onLevelChange(int i2) {
        return this.f12g.setLevel(i2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    public void setAlpha(int i2) {
        this.f12g.setAlpha(i2);
    }

    public void setAutoMirrored(boolean z2) {
        this.f12g.setAutoMirrored(z2);
    }

    public void setChangingConfigurations(int i2) {
        this.f12g.setChangingConfigurations(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f12g.setColorFilter(colorFilter);
    }

    public void setDither(boolean z2) {
        this.f12g.setDither(z2);
    }

    public void setFilterBitmap(boolean z2) {
        this.f12g.setFilterBitmap(z2);
    }

    public boolean setState(int[] iArr) {
        return d(iArr) || this.f12g.setState(iArr);
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        throw null;
    }

    public boolean setVisible(boolean z2, boolean z3) {
        return super.setVisible(z2, z3) || this.f12g.setVisible(z2, z3);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public d(Drawable drawable) {
        this.f10e = new f(this.f10e);
        b(drawable);
    }
}
