package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.example.supermarket.R;

public class o extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    public final e f716b;

    /* renamed from: c  reason: collision with root package name */
    public final p f717c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f718d;

    public o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        y0.a(context);
        this.f718d = false;
        w0.a(this, getContext());
        e eVar = new e(this);
        this.f716b = eVar;
        eVar.d(attributeSet, i2);
        p pVar = new p(this);
        this.f717c = pVar;
        pVar.b(attributeSet, i2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f716b;
        if (eVar != null) {
            eVar.a();
        }
        p pVar = this.f717c;
        if (pVar != null) {
            pVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f716b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f716b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        z0 z0Var;
        p pVar = this.f717c;
        if (pVar == null || (z0Var = pVar.f750b) == null) {
            return null;
        }
        return z0Var.f830a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        z0 z0Var;
        p pVar = this.f717c;
        if (pVar == null || (z0Var = pVar.f750b) == null) {
            return null;
        }
        return z0Var.f831b;
    }

    public boolean hasOverlappingRendering() {
        if (!(!(this.f717c.f749a.getBackground() instanceof RippleDrawable)) || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f716b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f716b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        p pVar = this.f717c;
        if (pVar != null) {
            pVar.a();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        p pVar = this.f717c;
        if (!(pVar == null || drawable == null || this.f718d)) {
            pVar.f752d = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        p pVar2 = this.f717c;
        if (pVar2 != null) {
            pVar2.a();
            if (!this.f718d) {
                p pVar3 = this.f717c;
                if (pVar3.f749a.getDrawable() != null) {
                    pVar3.f749a.getDrawable().setLevel(pVar3.f752d);
                }
            }
        }
    }

    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f718d = true;
    }

    public void setImageResource(int i2) {
        this.f717c.c(i2);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        p pVar = this.f717c;
        if (pVar != null) {
            pVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f716b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f716b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        p pVar = this.f717c;
        if (pVar != null) {
            pVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        p pVar = this.f717c;
        if (pVar != null) {
            pVar.e(mode);
        }
    }
}
