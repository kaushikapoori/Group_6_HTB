package o1;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.m0;
import y0.a;

public class h extends m0 {

    /* renamed from: q  reason: collision with root package name */
    public Drawable f3561q;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f3562r;

    /* renamed from: s  reason: collision with root package name */
    public final Rect f3563s;

    /* renamed from: t  reason: collision with root package name */
    public int f3564t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f3565u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f3566v;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public h(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f3562r = new Rect();
        this.f3563s = new Rect();
        this.f3564t = 119;
        this.f3565u = true;
        this.f3566v = false;
        int[] iArr = a.f4373j;
        n.a(context, attributeSet, i2, 0);
        n.b(context, attributeSet, iArr, i2, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        this.f3564t = obtainStyledAttributes.getInt(1, this.f3564t);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f3565u = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f3561q;
        if (drawable != null) {
            if (this.f3566v) {
                this.f3566v = false;
                Rect rect = this.f3562r;
                Rect rect2 = this.f3563s;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f3565u) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f3564t, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @TargetApi(21)
    public void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f3561q;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f3561q;
        if (drawable != null && drawable.isStateful()) {
            this.f3561q.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.f3561q;
    }

    public int getForegroundGravity() {
        return this.f3564t;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3561q;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        this.f3566v = z2 | this.f3566v;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        this.f3566v = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f3561q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.f3561q);
            }
            this.f3561q = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f3564t == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i2) {
        if (this.f3564t != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f3564t = i2;
            if (i2 == 119 && this.f3561q != null) {
                this.f3561q.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3561q;
    }
}
