package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public class f0 extends ToggleButton {

    /* renamed from: b  reason: collision with root package name */
    public final e f609b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f610c;

    /* renamed from: d  reason: collision with root package name */
    public n f611d;

    public f0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842827);
        w0.a(this, getContext());
        e eVar = new e(this);
        this.f609b = eVar;
        eVar.d(attributeSet, 16842827);
        b0 b0Var = new b0(this);
        this.f610c = b0Var;
        b0Var.e(attributeSet, 16842827);
        getEmojiTextViewHelper().a(attributeSet, 16842827);
    }

    private n getEmojiTextViewHelper() {
        if (this.f611d == null) {
            this.f611d = new n(this);
        }
        return this.f611d;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f609b;
        if (eVar != null) {
            eVar.a();
        }
        b0 b0Var = this.f610c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f609b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f609b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().f714b.f3506a.b(z2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f609b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f609b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().f714b.f3506a.c(z2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f714b.f3506a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f609b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f609b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
