package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

public class q extends ImageView {

    /* renamed from: b  reason: collision with root package name */
    public final e f753b;

    /* renamed from: c  reason: collision with root package name */
    public final p f754c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f755d = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        y0.a(context);
        w0.a(this, getContext());
        e eVar = new e(this);
        this.f753b = eVar;
        eVar.d(attributeSet, i2);
        p pVar = new p(this);
        this.f754c = pVar;
        pVar.b(attributeSet, i2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f753b;
        if (eVar != null) {
            eVar.a();
        }
        p pVar = this.f754c;
        if (pVar != null) {
            pVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f753b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f753b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        z0 z0Var;
        p pVar = this.f754c;
        if (pVar == null || (z0Var = pVar.f750b) == null) {
            return null;
        }
        return z0Var.f830a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        z0 z0Var;
        p pVar = this.f754c;
        if (pVar == null || (z0Var = pVar.f750b) == null) {
            return null;
        }
        return z0Var.f831b;
    }

    public boolean hasOverlappingRendering() {
        if (!(!(this.f754c.f749a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f753b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f753b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        p pVar = this.f754c;
        if (pVar != null) {
            pVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        p pVar = this.f754c;
        if (!(pVar == null || drawable == null || this.f755d)) {
            pVar.f752d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        p pVar2 = this.f754c;
        if (pVar2 != null) {
            pVar2.a();
            if (!this.f755d) {
                p pVar3 = this.f754c;
                if (pVar3.f749a.getDrawable() != null) {
                    pVar3.f749a.getDrawable().setLevel(pVar3.f752d);
                }
            }
        }
    }

    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f755d = true;
    }

    public void setImageResource(int i2) {
        p pVar = this.f754c;
        if (pVar != null) {
            pVar.c(i2);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        p pVar = this.f754c;
        if (pVar != null) {
            pVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f753b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f753b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        p pVar = this.f754c;
        if (pVar != null) {
            pVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        p pVar = this.f754c;
        if (pVar != null) {
            pVar.e(mode);
        }
    }
}
