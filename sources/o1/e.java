package o1;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import e0.d;
import g0.u;
import g0.x;
import java.util.Objects;
import java.util.WeakHashMap;
import o1.k;
import r1.a;
import r1.f;

public final class e {
    public a A;
    public CharSequence B;
    public CharSequence C;
    public boolean D;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* renamed from: a  reason: collision with root package name */
    public final View f3525a;

    /* renamed from: a0  reason: collision with root package name */
    public float f3526a0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3527b;

    /* renamed from: b0  reason: collision with root package name */
    public float f3528b0;

    /* renamed from: c  reason: collision with root package name */
    public float f3529c;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f3530c0;

    /* renamed from: d  reason: collision with root package name */
    public float f3531d;

    /* renamed from: d0  reason: collision with root package name */
    public int f3532d0 = k.f3574m;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f3533e;

    /* renamed from: f  reason: collision with root package name */
    public final Rect f3534f;

    /* renamed from: g  reason: collision with root package name */
    public final RectF f3535g;

    /* renamed from: h  reason: collision with root package name */
    public int f3536h = 16;

    /* renamed from: i  reason: collision with root package name */
    public int f3537i = 16;

    /* renamed from: j  reason: collision with root package name */
    public float f3538j = 15.0f;

    /* renamed from: k  reason: collision with root package name */
    public float f3539k = 15.0f;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f3540l;

    /* renamed from: m  reason: collision with root package name */
    public ColorStateList f3541m;

    /* renamed from: n  reason: collision with root package name */
    public float f3542n;

    /* renamed from: o  reason: collision with root package name */
    public float f3543o;

    /* renamed from: p  reason: collision with root package name */
    public float f3544p;

    /* renamed from: q  reason: collision with root package name */
    public float f3545q;

    /* renamed from: r  reason: collision with root package name */
    public float f3546r;

    /* renamed from: s  reason: collision with root package name */
    public float f3547s;

    /* renamed from: t  reason: collision with root package name */
    public Typeface f3548t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f3549u;

    /* renamed from: v  reason: collision with root package name */
    public Typeface f3550v;

    /* renamed from: w  reason: collision with root package name */
    public Typeface f3551w;

    /* renamed from: x  reason: collision with root package name */
    public Typeface f3552x;

    /* renamed from: y  reason: collision with root package name */
    public Typeface f3553y;

    /* renamed from: z  reason: collision with root package name */
    public Typeface f3554z;

    public e(View view) {
        this.f3525a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f3534f = new Rect();
        this.f3533e = new Rect();
        this.f3535g = new RectF();
        this.f3531d = 0.5f;
        i(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i2, int i3, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb(Math.round((((float) Color.alpha(i3)) * f2) + (((float) Color.alpha(i2)) * f3)), Math.round((((float) Color.red(i3)) * f2) + (((float) Color.red(i2)) * f3)), Math.round((((float) Color.green(i3)) * f2) + (((float) Color.green(i2)) * f3)), Math.round((((float) Color.blue(i3)) * f2) + (((float) Color.blue(i2)) * f3)));
    }

    public static float h(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return z0.a.a(f2, f3, f4);
    }

    public static boolean l(Rect rect, int i2, int i3, int i4, int i5) {
        return rect.left == i2 && rect.top == i3 && rect.right == i4 && rect.bottom == i5;
    }

    public final boolean b(CharSequence charSequence) {
        View view = this.f3525a;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        boolean z2 = true;
        if (u.e.d(view) != 1) {
            z2 = false;
        }
        return ((d.c) (z2 ? d.f2920d : d.f2919c)).b(charSequence, 0, charSequence.length());
    }

    public final void c(float f2) {
        int i2;
        TextPaint textPaint;
        this.f3535g.left = h((float) this.f3533e.left, (float) this.f3534f.left, f2, this.P);
        this.f3535g.top = h(this.f3542n, this.f3543o, f2, this.P);
        this.f3535g.right = h((float) this.f3533e.right, (float) this.f3534f.right, f2, this.P);
        this.f3535g.bottom = h((float) this.f3533e.bottom, (float) this.f3534f.bottom, f2, this.P);
        this.f3546r = h(this.f3544p, this.f3545q, f2, this.P);
        this.f3547s = h(this.f3542n, this.f3543o, f2, this.P);
        q(f2);
        TimeInterpolator timeInterpolator = z0.a.f4420b;
        this.f3526a0 = 1.0f - h(0.0f, 1.0f, 1.0f - f2, timeInterpolator);
        View view = this.f3525a;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.d.k(view);
        this.f3528b0 = h(1.0f, 0.0f, f2, timeInterpolator);
        u.d.k(this.f3525a);
        ColorStateList colorStateList = this.f3541m;
        ColorStateList colorStateList2 = this.f3540l;
        if (colorStateList != colorStateList2) {
            textPaint = this.N;
            i2 = a(g(colorStateList2), f(), f2);
        } else {
            textPaint = this.N;
            i2 = f();
        }
        textPaint.setColor(i2);
        float f3 = this.V;
        float f4 = this.W;
        if (f3 != f4) {
            this.N.setLetterSpacing(h(f4, f3, f2, timeInterpolator));
        } else {
            this.N.setLetterSpacing(f3);
        }
        this.H = h(0.0f, this.R, f2, (TimeInterpolator) null);
        this.I = h(0.0f, this.S, f2, (TimeInterpolator) null);
        this.J = h(0.0f, this.T, f2, (TimeInterpolator) null);
        int a2 = a(g((ColorStateList) null), g(this.U), f2);
        this.K = a2;
        this.N.setShadowLayer(this.H, this.I, this.J, a2);
        u.d.k(this.f3525a);
    }

    public final void d(float f2, boolean z2) {
        float f3;
        float f4;
        boolean z3;
        StaticLayout staticLayout;
        if (this.B != null) {
            float width = (float) this.f3534f.width();
            float width2 = (float) this.f3533e.width();
            if (Math.abs(f2 - 1.0f) < 1.0E-5f) {
                f4 = this.f3539k;
                f3 = this.V;
                this.F = 1.0f;
                Typeface typeface = this.f3554z;
                Typeface typeface2 = this.f3548t;
                if (typeface != typeface2) {
                    this.f3554z = typeface2;
                    z3 = true;
                } else {
                    z3 = false;
                }
            } else {
                float f5 = this.f3538j;
                float f6 = this.W;
                Typeface typeface3 = this.f3554z;
                Typeface typeface4 = this.f3551w;
                if (typeface3 != typeface4) {
                    this.f3554z = typeface4;
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (Math.abs(f2 - 0.0f) < 1.0E-5f) {
                    this.F = 1.0f;
                } else {
                    this.F = h(this.f3538j, this.f3539k, f2, this.Q) / this.f3538j;
                }
                float f7 = this.f3539k / this.f3538j;
                width = (!z2 && width2 * f7 > width) ? Math.min(width / f7, width2) : width2;
                f4 = f5;
                f3 = f6;
            }
            if (width > 0.0f) {
                z3 = ((this.G > f4 ? 1 : (this.G == f4 ? 0 : -1)) != 0) || ((this.X > f3 ? 1 : (this.X == f3 ? 0 : -1)) != 0) || this.M || z3;
                this.G = f4;
                this.X = f3;
                this.M = false;
            }
            if (this.C == null || z3) {
                this.N.setTextSize(this.G);
                this.N.setTypeface(this.f3554z);
                this.N.setLetterSpacing(this.X);
                this.N.setLinearText(this.F != 1.0f);
                boolean b2 = b(this.B);
                this.D = b2;
                try {
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    k kVar = new k(this.B, this.N, (int) width);
                    kVar.f3589l = TextUtils.TruncateAt.END;
                    kVar.f3588k = b2;
                    kVar.f3582e = alignment;
                    kVar.f3587j = false;
                    kVar.f3583f = 1;
                    kVar.f3584g = 0.0f;
                    kVar.f3585h = 1.0f;
                    kVar.f3586i = this.f3532d0;
                    staticLayout = kVar.a();
                } catch (k.a e2) {
                    Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
                    staticLayout = null;
                }
                Objects.requireNonNull(staticLayout);
                this.Y = staticLayout;
                this.C = staticLayout.getText();
            }
        }
    }

    public float e() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f3539k);
        textPaint.setTypeface(this.f3548t);
        textPaint.setLetterSpacing(this.V);
        return -this.O.ascent();
    }

    public int f() {
        return g(this.f3541m);
    }

    public final int g(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public void i(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f3550v;
            if (typeface != null) {
                this.f3549u = f.a(configuration, typeface);
            }
            Typeface typeface2 = this.f3553y;
            if (typeface2 != null) {
                this.f3552x = f.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f3549u;
            if (typeface3 == null) {
                typeface3 = this.f3550v;
            }
            this.f3548t = typeface3;
            Typeface typeface4 = this.f3552x;
            if (typeface4 == null) {
                typeface4 = this.f3553y;
            }
            this.f3551w = typeface4;
            k(true);
        }
    }

    public void j() {
        this.f3527b = this.f3534f.width() > 0 && this.f3534f.height() > 0 && this.f3533e.width() > 0 && this.f3533e.height() > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(boolean r11) {
        /*
            r10 = this;
            android.view.View r0 = r10.f3525a
            int r0 = r0.getHeight()
            if (r0 <= 0) goto L_0x0010
            android.view.View r0 = r10.f3525a
            int r0 = r0.getWidth()
            if (r0 > 0) goto L_0x0012
        L_0x0010:
            if (r11 == 0) goto L_0x012e
        L_0x0012:
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.d(r0, r11)
            java.lang.CharSequence r0 = r10.C
            if (r0 == 0) goto L_0x002e
            android.text.StaticLayout r1 = r10.Y
            if (r1 == 0) goto L_0x002e
            android.text.TextPaint r2 = r10.N
            int r1 = r1.getWidth()
            float r1 = (float) r1
            android.text.TextUtils$TruncateAt r3 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r0 = android.text.TextUtils.ellipsize(r0, r2, r1, r3)
            r10.f3530c0 = r0
        L_0x002e:
            java.lang.CharSequence r0 = r10.f3530c0
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0041
            android.text.TextPaint r3 = r10.N
            int r4 = r0.length()
            float r0 = r3.measureText(r0, r1, r4)
            r10.Z = r0
            goto L_0x0043
        L_0x0041:
            r10.Z = r2
        L_0x0043:
            int r0 = r10.f3537i
            boolean r3 = r10.D
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r3 = r0 & 112(0x70, float:1.57E-43)
            r4 = 80
            r5 = 48
            r6 = 1073741824(0x40000000, float:2.0)
            if (r3 == r5) goto L_0x007d
            if (r3 == r4) goto L_0x006e
            android.text.TextPaint r3 = r10.N
            float r3 = r3.descent()
            android.text.TextPaint r7 = r10.N
            float r7 = r7.ascent()
            float r3 = r3 - r7
            float r3 = r3 / r6
            android.graphics.Rect r7 = r10.f3534f
            int r7 = r7.centerY()
            float r7 = (float) r7
            float r7 = r7 - r3
            goto L_0x007a
        L_0x006e:
            android.graphics.Rect r3 = r10.f3534f
            int r3 = r3.bottom
            float r3 = (float) r3
            android.text.TextPaint r7 = r10.N
            float r7 = r7.ascent()
            float r7 = r7 + r3
        L_0x007a:
            r10.f3543o = r7
            goto L_0x0084
        L_0x007d:
            android.graphics.Rect r3 = r10.f3534f
            int r3 = r3.top
            float r3 = (float) r3
            r10.f3543o = r3
        L_0x0084:
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r0 = r0 & r3
            r7 = 5
            r8 = 1
            if (r0 == r8) goto L_0x009c
            if (r0 == r7) goto L_0x0094
            android.graphics.Rect r0 = r10.f3534f
            int r0 = r0.left
            float r0 = (float) r0
            goto L_0x00a7
        L_0x0094:
            android.graphics.Rect r0 = r10.f3534f
            int r0 = r0.right
            float r0 = (float) r0
            float r9 = r10.Z
            goto L_0x00a6
        L_0x009c:
            android.graphics.Rect r0 = r10.f3534f
            int r0 = r0.centerX()
            float r0 = (float) r0
            float r9 = r10.Z
            float r9 = r9 / r6
        L_0x00a6:
            float r0 = r0 - r9
        L_0x00a7:
            r10.f3545q = r0
            r10.d(r2, r11)
            android.text.StaticLayout r11 = r10.Y
            if (r11 == 0) goto L_0x00b6
            int r11 = r11.getHeight()
            float r11 = (float) r11
            goto L_0x00b7
        L_0x00b6:
            r11 = 0
        L_0x00b7:
            android.text.StaticLayout r0 = r10.Y
            java.lang.CharSequence r0 = r10.C
            if (r0 == 0) goto L_0x00c7
            android.text.TextPaint r2 = r10.N
            int r9 = r0.length()
            float r2 = r2.measureText(r0, r1, r9)
        L_0x00c7:
            android.text.StaticLayout r0 = r10.Y
            if (r0 == 0) goto L_0x00ce
            r0.getLineCount()
        L_0x00ce:
            int r0 = r10.f3536h
            boolean r1 = r10.D
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r1)
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 == r5) goto L_0x00f6
            if (r1 == r4) goto L_0x00e8
            float r11 = r11 / r6
            android.graphics.Rect r1 = r10.f3533e
            int r1 = r1.centerY()
            float r1 = (float) r1
            float r1 = r1 - r11
            r10.f3542n = r1
            goto L_0x00fd
        L_0x00e8:
            android.graphics.Rect r1 = r10.f3533e
            int r1 = r1.bottom
            float r1 = (float) r1
            float r1 = r1 - r11
            android.text.TextPaint r11 = r10.N
            float r11 = r11.descent()
            float r11 = r11 + r1
            goto L_0x00fb
        L_0x00f6:
            android.graphics.Rect r11 = r10.f3533e
            int r11 = r11.top
            float r11 = (float) r11
        L_0x00fb:
            r10.f3542n = r11
        L_0x00fd:
            r11 = r0 & r3
            if (r11 == r8) goto L_0x010f
            if (r11 == r7) goto L_0x0109
            android.graphics.Rect r11 = r10.f3533e
            int r11 = r11.left
            float r11 = (float) r11
            goto L_0x0118
        L_0x0109:
            android.graphics.Rect r11 = r10.f3533e
            int r11 = r11.right
            float r11 = (float) r11
            goto L_0x0117
        L_0x010f:
            android.graphics.Rect r11 = r10.f3533e
            int r11 = r11.centerX()
            float r11 = (float) r11
            float r2 = r2 / r6
        L_0x0117:
            float r11 = r11 - r2
        L_0x0118:
            r10.f3544p = r11
            android.graphics.Bitmap r11 = r10.E
            if (r11 == 0) goto L_0x0124
            r11.recycle()
            r11 = 0
            r10.E = r11
        L_0x0124:
            float r11 = r10.f3529c
            r10.q(r11)
            float r11 = r10.f3529c
            r10.c(r11)
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.e.k(boolean):void");
    }

    public void m(ColorStateList colorStateList) {
        if (this.f3541m != colorStateList) {
            this.f3541m = colorStateList;
            k(false);
        }
    }

    public void n(int i2) {
        if (this.f3537i != i2) {
            this.f3537i = i2;
            k(false);
        }
    }

    public final boolean o(Typeface typeface) {
        a aVar = this.A;
        if (aVar != null) {
            aVar.f3819c = true;
        }
        if (this.f3550v == typeface) {
            return false;
        }
        this.f3550v = typeface;
        Typeface a2 = f.a(this.f3525a.getContext().getResources().getConfiguration(), typeface);
        this.f3549u = a2;
        if (a2 == null) {
            a2 = this.f3550v;
        }
        this.f3548t = a2;
        return true;
    }

    public void p(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (f2 != this.f3529c) {
            this.f3529c = f2;
            c(f2);
        }
    }

    public final void q(float f2) {
        d(f2, false);
        View view = this.f3525a;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.d.k(view);
    }

    public void r(Typeface typeface) {
        boolean z2;
        boolean o2 = o(typeface);
        if (this.f3553y != typeface) {
            this.f3553y = typeface;
            Typeface a2 = f.a(this.f3525a.getContext().getResources().getConfiguration(), typeface);
            this.f3552x = a2;
            if (a2 == null) {
                a2 = this.f3553y;
            }
            this.f3551w = a2;
            z2 = true;
        } else {
            z2 = false;
        }
        if (o2 || z2) {
            k(false);
        }
    }

    public final boolean s() {
        return false;
    }
}
