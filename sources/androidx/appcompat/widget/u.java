package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import e.a;

public class u extends RadioButton {

    /* renamed from: b  reason: collision with root package name */
    public final j f785b;

    /* renamed from: c  reason: collision with root package name */
    public final e f786c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f787d;

    /* renamed from: e  reason: collision with root package name */
    public n f788e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        y0.a(context);
        w0.a(this, getContext());
        j jVar = new j(this);
        this.f785b = jVar;
        jVar.b(attributeSet, i2);
        e eVar = new e(this);
        this.f786c = eVar;
        eVar.d(attributeSet, i2);
        b0 b0Var = new b0(this);
        this.f787d = b0Var;
        b0Var.e(attributeSet, i2);
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    private n getEmojiTextViewHelper() {
        if (this.f788e == null) {
            this.f788e = new n(this);
        }
        return this.f788e;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f786c;
        if (eVar != null) {
            eVar.a();
        }
        b0 b0Var = this.f787d;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f786c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f786c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        j jVar = this.f785b;
        if (jVar != null) {
            return jVar.f651b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        j jVar = this.f785b;
        if (jVar != null) {
            return jVar.f652c;
        }
        return null;
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().f714b.f3506a.b(z2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f786c;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f786c;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setButtonDrawable(int i2) {
        setButtonDrawable(a.b(getContext(), i2));
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        j jVar = this.f785b;
        if (jVar == null) {
            return;
        }
        if (jVar.f655f) {
            jVar.f655f = false;
            return;
        }
        jVar.f655f = true;
        jVar.a();
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().f714b.f3506a.c(z2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f714b.f3506a.a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f786c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f786c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        j jVar = this.f785b;
        if (jVar != null) {
            jVar.f651b = colorStateList;
            jVar.f653d = true;
            jVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        j jVar = this.f785b;
        if (jVar != null) {
            jVar.f652c = mode;
            jVar.f654e = true;
            jVar.a();
        }
    }
}
