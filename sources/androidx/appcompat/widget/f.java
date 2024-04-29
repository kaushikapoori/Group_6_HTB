package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.example.supermarket.R;
import j0.b;
import j0.g;
import j0.i;

public class f extends Button implements b, i {

    /* renamed from: b  reason: collision with root package name */
    public final e f606b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f607c;

    /* renamed from: d  reason: collision with root package name */
    public n f608d;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        y0.a(context);
        w0.a(this, getContext());
        e eVar = new e(this);
        this.f606b = eVar;
        eVar.d(attributeSet, i2);
        b0 b0Var = new b0(this);
        this.f607c = b0Var;
        b0Var.e(attributeSet, i2);
        b0Var.b();
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    private n getEmojiTextViewHelper() {
        if (this.f608d == null) {
            this.f608d = new n(this);
        }
        return this.f608d;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f606b;
        if (eVar != null) {
            eVar.a();
        }
        b0 b0Var = this.f607c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f3262a) {
            return super.getAutoSizeMaxTextSize();
        }
        b0 b0Var = this.f607c;
        if (b0Var != null) {
            return Math.round(b0Var.f517i.f599e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f3262a) {
            return super.getAutoSizeMinTextSize();
        }
        b0 b0Var = this.f607c;
        if (b0Var != null) {
            return Math.round(b0Var.f517i.f598d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f3262a) {
            return super.getAutoSizeStepGranularity();
        }
        b0 b0Var = this.f607c;
        if (b0Var != null) {
            return Math.round(b0Var.f517i.f597c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f3262a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        b0 b0Var = this.f607c;
        return b0Var != null ? b0Var.f517i.f600f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f3262a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        b0 b0Var = this.f607c;
        if (b0Var != null) {
            return b0Var.f517i.f595a;
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f606b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f606b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        z0 z0Var = this.f607c.f516h;
        if (z0Var != null) {
            return z0Var.f830a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        z0 z0Var = this.f607c.f516h;
        if (z0Var != null) {
            return z0Var.f831b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        b0 b0Var = this.f607c;
        if (b0Var != null && !b.f3262a) {
            b0Var.f517i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        b0 b0Var = this.f607c;
        if (b0Var != null && !b.f3262a && b0Var.d()) {
            this.f607c.f517i.a();
        }
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().f714b.f3506a.b(z2);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (b.f3262a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        b0 b0Var = this.f607c;
        if (b0Var != null) {
            b0Var.h(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (b.f3262a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        b0 b0Var = this.f607c;
        if (b0Var != null) {
            b0Var.i(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (b.f3262a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        b0 b0Var = this.f607c;
        if (b0Var != null) {
            b0Var.j(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f606b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f606b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.h(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().f714b.f3506a.c(z2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f714b.f3506a.a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        b0 b0Var = this.f607c;
        if (b0Var != null) {
            b0Var.f509a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f606b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f606b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f607c.k(colorStateList);
        this.f607c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f607c.l(mode);
        this.f607c.b();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        b0 b0Var = this.f607c;
        if (b0Var != null) {
            b0Var.f(context, i2);
        }
    }

    public void setTextSize(int i2, float f2) {
        boolean z2 = b.f3262a;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        b0 b0Var = this.f607c;
        if (b0Var != null && !z2 && !b0Var.d()) {
            b0Var.f517i.f(i2, f2);
        }
    }
}
