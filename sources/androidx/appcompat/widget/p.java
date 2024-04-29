package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import c.c;
import e.a;
import g0.u;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f749a;

    /* renamed from: b  reason: collision with root package name */
    public z0 f750b;

    /* renamed from: c  reason: collision with root package name */
    public z0 f751c;

    /* renamed from: d  reason: collision with root package name */
    public int f752d = 0;

    public p(ImageView imageView) {
        this.f749a = imageView;
    }

    public void a() {
        Drawable drawable = this.f749a.getDrawable();
        if (drawable != null) {
            i0.b(drawable);
        }
        if (drawable != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z2 = true;
            if (i2 <= 21 && i2 == 21) {
                if (this.f751c == null) {
                    this.f751c = new z0();
                }
                z0 z0Var = this.f751c;
                z0Var.f830a = null;
                z0Var.f833d = false;
                z0Var.f831b = null;
                z0Var.f832c = false;
                ColorStateList imageTintList = this.f749a.getImageTintList();
                if (imageTintList != null) {
                    z0Var.f833d = true;
                    z0Var.f830a = imageTintList;
                }
                PorterDuff.Mode imageTintMode = this.f749a.getImageTintMode();
                if (imageTintMode != null) {
                    z0Var.f832c = true;
                    z0Var.f831b = imageTintMode;
                }
                if (z0Var.f833d || z0Var.f832c) {
                    k.f(drawable, z0Var, this.f749a.getDrawableState());
                } else {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            z0 z0Var2 = this.f750b;
            if (z0Var2 != null) {
                k.f(drawable, z0Var2, this.f749a.getDrawableState());
            }
        }
    }

    public void b(AttributeSet attributeSet, int i2) {
        Drawable drawable;
        Drawable drawable2;
        int l2;
        Context context = this.f749a.getContext();
        int[] iArr = c.f2043f;
        b1 q2 = b1.q(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.f749a;
        u.t(imageView, imageView.getContext(), iArr, attributeSet, q2.f527b, i2, 0);
        try {
            Drawable drawable3 = this.f749a.getDrawable();
            if (!(drawable3 != null || (l2 = q2.l(1, -1)) == -1 || (drawable3 = a.b(this.f749a.getContext(), l2)) == null)) {
                this.f749a.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                i0.b(drawable3);
            }
            if (q2.o(2)) {
                ImageView imageView2 = this.f749a;
                ColorStateList c2 = q2.c(2);
                int i3 = Build.VERSION.SDK_INT;
                imageView2.setImageTintList(c2);
                if (!(i3 != 21 || (drawable2 = imageView2.getDrawable()) == null || imageView2.getImageTintList() == null)) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView2.getDrawableState());
                    }
                    imageView2.setImageDrawable(drawable2);
                }
            }
            if (q2.o(3)) {
                ImageView imageView3 = this.f749a;
                PorterDuff.Mode d2 = i0.d(q2.j(3, -1), (PorterDuff.Mode) null);
                int i4 = Build.VERSION.SDK_INT;
                imageView3.setImageTintMode(d2);
                if (!(i4 != 21 || (drawable = imageView3.getDrawable()) == null || imageView3.getImageTintList() == null)) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView3.getDrawableState());
                    }
                    imageView3.setImageDrawable(drawable);
                }
            }
            q2.f527b.recycle();
        } catch (Throwable th) {
            q2.f527b.recycle();
            throw th;
        }
    }

    public void c(int i2) {
        if (i2 != 0) {
            Drawable b2 = a.b(this.f749a.getContext(), i2);
            if (b2 != null) {
                i0.b(b2);
            }
            this.f749a.setImageDrawable(b2);
        } else {
            this.f749a.setImageDrawable((Drawable) null);
        }
        a();
    }

    public void d(ColorStateList colorStateList) {
        if (this.f750b == null) {
            this.f750b = new z0();
        }
        z0 z0Var = this.f750b;
        z0Var.f830a = colorStateList;
        z0Var.f833d = true;
        a();
    }

    public void e(PorterDuff.Mode mode) {
        if (this.f750b == null) {
            this.f750b = new z0();
        }
        z0 z0Var = this.f750b;
        z0Var.f831b = mode;
        z0Var.f832c = true;
        a();
    }
}
