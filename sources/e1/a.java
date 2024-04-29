package e1;

import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import com.example.supermarket.R;
import u1.j;
import u1.n;

public class a extends l.a implements Checkable, n {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2925f = {R.attr.state_dragged};

    /* renamed from: e  reason: collision with root package name */
    public boolean f2926e;

    /* renamed from: e1.a$a  reason: collision with other inner class name */
    public interface C0028a {
    }

    private RectF getBoundsAsRectF() {
        new RectF();
        throw null;
    }

    public ColorStateList getCardBackgroundColor() {
        throw null;
    }

    public ColorStateList getCardForegroundColor() {
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        throw null;
    }

    public int getCheckedIconGravity() {
        throw null;
    }

    public int getCheckedIconMargin() {
        throw null;
    }

    public int getCheckedIconSize() {
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
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

    public float getProgress() {
        throw null;
    }

    public float getRadius() {
        throw null;
    }

    public ColorStateList getRippleColor() {
        throw null;
    }

    public j getShapeAppearanceModel() {
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        throw null;
    }

    public int getStrokeWidth() {
        throw null;
    }

    public boolean isChecked() {
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (this.f2926e) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f2925f);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(false);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(false);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(false);
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        getMeasuredWidth();
        getMeasuredHeight();
        throw null;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setCardBackgroundColor(int i2) {
        ColorStateList.valueOf(i2);
        throw null;
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        throw null;
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setCheckable(boolean z2) {
        throw null;
    }

    public void setChecked(boolean z2) {
    }

    public void setCheckedIcon(Drawable drawable) {
        throw null;
    }

    public void setCheckedIconGravity(int i2) {
        throw null;
    }

    public void setCheckedIconMargin(int i2) {
        throw null;
    }

    public void setCheckedIconMarginResource(int i2) {
        if (i2 != -1) {
            getResources().getDimensionPixelSize(i2);
            throw null;
        }
    }

    public void setCheckedIconResource(int i2) {
        e.a.b(getContext(), i2);
        throw null;
    }

    public void setCheckedIconSize(int i2) {
        throw null;
    }

    public void setCheckedIconSizeResource(int i2) {
        if (i2 != 0) {
            getResources().getDimensionPixelSize(i2);
            throw null;
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        throw null;
    }

    public void setClickable(boolean z2) {
        super.setClickable(z2);
    }

    public void setDragged(boolean z2) {
        if (this.f2926e != z2) {
            this.f2926e = z2;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT <= 26) {
                invalidate();
                return;
            }
            throw null;
        }
    }

    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        throw null;
    }

    public void setOnCheckedChangeListener(C0028a aVar) {
    }

    public void setPreventCornerOverlap(boolean z2) {
        super.setPreventCornerOverlap(z2);
        throw null;
    }

    public void setProgress(float f2) {
        throw null;
    }

    public void setRadius(float f2) {
        super.setRadius(f2);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setRippleColorResource(int i2) {
        e.a.a(getContext(), i2);
        throw null;
    }

    public void setShapeAppearanceModel(j jVar) {
        setClipToOutline(jVar.d(getBoundsAsRectF()));
        throw null;
    }

    public void setStrokeColor(int i2) {
        setStrokeColor(ColorStateList.valueOf(i2));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        throw null;
    }

    public void setStrokeWidth(int i2) {
        throw null;
    }

    public void setUseCompatPadding(boolean z2) {
        super.setUseCompatPadding(z2);
        throw null;
    }

    public void toggle() {
    }
}
