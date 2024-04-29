package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import c.c;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f586a;

    /* renamed from: b  reason: collision with root package name */
    public final k f587b;

    /* renamed from: c  reason: collision with root package name */
    public int f588c = -1;

    /* renamed from: d  reason: collision with root package name */
    public z0 f589d;

    /* renamed from: e  reason: collision with root package name */
    public z0 f590e;

    /* renamed from: f  reason: collision with root package name */
    public z0 f591f;

    public e(View view) {
        this.f586a = view;
        this.f587b = k.a();
    }

    public void a() {
        Drawable background = this.f586a.getBackground();
        if (background != null) {
            int i2 = Build.VERSION.SDK_INT;
            boolean z2 = true;
            if (i2 <= 21 ? i2 == 21 : this.f589d != null) {
                if (this.f591f == null) {
                    this.f591f = new z0();
                }
                z0 z0Var = this.f591f;
                z0Var.f830a = null;
                z0Var.f833d = false;
                z0Var.f831b = null;
                z0Var.f832c = false;
                View view = this.f586a;
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                ColorStateList g2 = u.i.g(view);
                if (g2 != null) {
                    z0Var.f833d = true;
                    z0Var.f830a = g2;
                }
                PorterDuff.Mode h2 = u.i.h(this.f586a);
                if (h2 != null) {
                    z0Var.f832c = true;
                    z0Var.f831b = h2;
                }
                if (z0Var.f833d || z0Var.f832c) {
                    k.f(background, z0Var, this.f586a.getDrawableState());
                } else {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
            }
            z0 z0Var2 = this.f590e;
            if (z0Var2 != null) {
                k.f(background, z0Var2, this.f586a.getDrawableState());
                return;
            }
            z0 z0Var3 = this.f589d;
            if (z0Var3 != null) {
                k.f(background, z0Var3, this.f586a.getDrawableState());
            }
        }
    }

    public ColorStateList b() {
        z0 z0Var = this.f590e;
        if (z0Var != null) {
            return z0Var.f830a;
        }
        return null;
    }

    public PorterDuff.Mode c() {
        z0 z0Var = this.f590e;
        if (z0Var != null) {
            return z0Var.f831b;
        }
        return null;
    }

    public void d(AttributeSet attributeSet, int i2) {
        Context context = this.f586a.getContext();
        int[] iArr = c.f2063z;
        boolean z2 = false;
        b1 q2 = b1.q(context, attributeSet, iArr, i2, 0);
        View view = this.f586a;
        u.t(view, view.getContext(), iArr, attributeSet, q2.f527b, i2, 0);
        try {
            if (q2.o(0)) {
                this.f588c = q2.l(0, -1);
                ColorStateList d2 = this.f587b.d(this.f586a.getContext(), this.f588c);
                if (d2 != null) {
                    g(d2);
                }
            }
            if (q2.o(1)) {
                u.w(this.f586a, q2.c(1));
            }
            if (q2.o(2)) {
                View view2 = this.f586a;
                PorterDuff.Mode d3 = i0.d(q2.j(2, -1), (PorterDuff.Mode) null);
                int i3 = Build.VERSION.SDK_INT;
                u.i.r(view2, d3);
                if (i3 == 21) {
                    Drawable background = view2.getBackground();
                    if (!(u.i.g(view2) == null && u.i.h(view2) == null)) {
                        z2 = true;
                    }
                    if (background != null && z2) {
                        if (background.isStateful()) {
                            background.setState(view2.getDrawableState());
                        }
                        u.d.q(view2, background);
                    }
                }
            }
            q2.f527b.recycle();
        } catch (Throwable th) {
            q2.f527b.recycle();
            throw th;
        }
    }

    public void e() {
        this.f588c = -1;
        g((ColorStateList) null);
        a();
    }

    public void f(int i2) {
        this.f588c = i2;
        k kVar = this.f587b;
        g(kVar != null ? kVar.d(this.f586a.getContext(), i2) : null);
        a();
    }

    public void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f589d == null) {
                this.f589d = new z0();
            }
            z0 z0Var = this.f589d;
            z0Var.f830a = colorStateList;
            z0Var.f833d = true;
        } else {
            this.f589d = null;
        }
        a();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f590e == null) {
            this.f590e = new z0();
        }
        z0 z0Var = this.f590e;
        z0Var.f830a = colorStateList;
        z0Var.f833d = true;
        a();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f590e == null) {
            this.f590e = new z0();
        }
        z0 z0Var = this.f590e;
        z0Var.f831b = mode;
        z0Var.f832c = true;
        a();
    }
}
