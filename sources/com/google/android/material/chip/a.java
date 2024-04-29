package com.google.android.material.chip;

import a0.c;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import o1.l;
import r1.d;
import s1.b;
import u1.g;
import u1.j;

public class a extends g implements Drawable.Callback, l.b {
    public static final int[] J0 = {16842910};
    public static final ShapeDrawable K0 = new ShapeDrawable(new OvalShape());
    public ColorStateList A;
    public PorterDuff.Mode A0 = PorterDuff.Mode.SRC_IN;
    public ColorStateList B;
    public int[] B0;
    public float C;
    public boolean C0;
    public float D = -1.0f;
    public ColorStateList D0;
    public ColorStateList E;
    public WeakReference<C0015a> E0 = new WeakReference<>((Object) null);
    public float F;
    public TextUtils.TruncateAt F0;
    public ColorStateList G;
    public boolean G0;
    public CharSequence H;
    public int H0;
    public boolean I;
    public boolean I0;
    public Drawable J;
    public ColorStateList K;
    public float L;
    public boolean M;
    public boolean N;
    public Drawable O;
    public Drawable P;
    public ColorStateList Q;
    public float R;
    public CharSequence S;
    public boolean T;
    public boolean U;
    public Drawable V;
    public ColorStateList W;
    public z0.g X;
    public z0.g Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f2273a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f2274b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f2275c0;

    /* renamed from: d0  reason: collision with root package name */
    public float f2276d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f2277e0;

    /* renamed from: f0  reason: collision with root package name */
    public float f2278f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f2279g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Context f2280h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Paint f2281i0 = new Paint(1);

    /* renamed from: j0  reason: collision with root package name */
    public final Paint.FontMetrics f2282j0 = new Paint.FontMetrics();

    /* renamed from: k0  reason: collision with root package name */
    public final RectF f2283k0 = new RectF();

    /* renamed from: l0  reason: collision with root package name */
    public final PointF f2284l0 = new PointF();

    /* renamed from: m0  reason: collision with root package name */
    public final Path f2285m0 = new Path();

    /* renamed from: n0  reason: collision with root package name */
    public final l f2286n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f2287o0;

    /* renamed from: p0  reason: collision with root package name */
    public int f2288p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f2289q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f2290r0;

    /* renamed from: s0  reason: collision with root package name */
    public int f2291s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f2292t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f2293u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f2294v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f2295w0 = 255;

    /* renamed from: x0  reason: collision with root package name */
    public ColorFilter f2296x0;

    /* renamed from: y0  reason: collision with root package name */
    public PorterDuffColorFilter f2297y0;

    /* renamed from: z0  reason: collision with root package name */
    public ColorStateList f2298z0;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    public interface C0015a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(j.b(context, attributeSet, i2, i3).a());
        this.f3911b.f3936b = new l1.a(context);
        x();
        this.f2280h0 = context;
        l lVar = new l(this);
        this.f2286n0 = lVar;
        this.H = "";
        lVar.f3590a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = J0;
        setState(iArr);
        e0(iArr);
        this.G0 = true;
        int[] iArr2 = b.f3881a;
        K0.setTint(-1);
    }

    public static boolean H(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean I(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public float A() {
        if (!q0() && !p0()) {
            return 0.0f;
        }
        return G() + this.f2273a0 + this.f2274b0;
    }

    public final void B(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (r0()) {
            float f2 = this.f2279g0 + this.f2278f0;
            if (a0.a.b(this) == 0) {
                float f3 = ((float) rect.right) - f2;
                rectF.right = f3;
                rectF.left = f3 - this.R;
            } else {
                float f4 = ((float) rect.left) + f2;
                rectF.left = f4;
                rectF.right = f4 + this.R;
            }
            float exactCenterY = rect.exactCenterY();
            float f5 = this.R;
            float f6 = exactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    public final void C(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (r0()) {
            float f2 = this.f2279g0 + this.f2278f0 + this.R + this.f2277e0 + this.f2276d0;
            if (a0.a.b(this) == 0) {
                float f3 = (float) rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i2 = rect.left;
                rectF.left = (float) i2;
                rectF.right = ((float) i2) + f2;
            }
            rectF.top = (float) rect.top;
            rectF.bottom = (float) rect.bottom;
        }
    }

    public float D() {
        if (r0()) {
            return this.f2277e0 + this.R + this.f2278f0;
        }
        return 0.0f;
    }

    public float E() {
        return this.I0 ? m() : this.D;
    }

    public Drawable F() {
        Drawable drawable = this.O;
        if (drawable != null) {
            return drawable instanceof c ? ((c) drawable).a() : drawable;
        }
        return null;
    }

    public final float G() {
        Drawable drawable = this.f2293u0 ? this.V : this.J;
        float f2 = this.L;
        return (f2 > 0.0f || drawable == null) ? f2 : (float) drawable.getIntrinsicWidth();
    }

    public void J() {
        C0015a aVar = (C0015a) this.E0.get();
        if (aVar != null) {
            aVar.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean K(int[] r9, int[] r10) {
        /*
            r8 = this;
            boolean r0 = super.onStateChange(r9)
            android.content.res.ColorStateList r1 = r8.A
            r2 = 0
            if (r1 == 0) goto L_0x0010
            int r3 = r8.f2287o0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r1 = r8.e(r1)
            int r3 = r8.f2287o0
            r4 = 1
            if (r3 == r1) goto L_0x001d
            r8.f2287o0 = r1
            r0 = 1
        L_0x001d:
            android.content.res.ColorStateList r3 = r8.B
            if (r3 == 0) goto L_0x0028
            int r5 = r8.f2288p0
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x0029
        L_0x0028:
            r3 = 0
        L_0x0029:
            int r3 = r8.e(r3)
            int r5 = r8.f2288p0
            if (r5 == r3) goto L_0x0034
            r8.f2288p0 = r3
            r0 = 1
        L_0x0034:
            int r1 = z.a.b(r3, r1)
            int r3 = r8.f2289q0
            if (r3 == r1) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x003e:
            r3 = 0
        L_0x003f:
            u1.g$b r5 = r8.f3911b
            android.content.res.ColorStateList r5 = r5.f3938d
            if (r5 != 0) goto L_0x0047
            r5 = 1
            goto L_0x0048
        L_0x0047:
            r5 = 0
        L_0x0048:
            r3 = r3 | r5
            if (r3 == 0) goto L_0x0055
            r8.f2289q0 = r1
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r1)
            r8.q(r0)
            r0 = 1
        L_0x0055:
            android.content.res.ColorStateList r1 = r8.E
            if (r1 == 0) goto L_0x0060
            int r3 = r8.f2290r0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0061
        L_0x0060:
            r1 = 0
        L_0x0061:
            int r3 = r8.f2290r0
            if (r3 == r1) goto L_0x0068
            r8.f2290r0 = r1
            r0 = 1
        L_0x0068:
            android.content.res.ColorStateList r1 = r8.D0
            if (r1 == 0) goto L_0x007b
            boolean r1 = s1.b.b(r9)
            if (r1 == 0) goto L_0x007b
            android.content.res.ColorStateList r1 = r8.D0
            int r3 = r8.f2291s0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            int r3 = r8.f2291s0
            if (r3 == r1) goto L_0x0087
            r8.f2291s0 = r1
            boolean r1 = r8.C0
            if (r1 == 0) goto L_0x0087
            r0 = 1
        L_0x0087:
            o1.l r1 = r8.f2286n0
            r1.d r1 = r1.f3595f
            if (r1 == 0) goto L_0x0098
            android.content.res.ColorStateList r1 = r1.f3829j
            if (r1 == 0) goto L_0x0098
            int r3 = r8.f2292t0
            int r1 = r1.getColorForState(r9, r3)
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            int r3 = r8.f2292t0
            if (r3 == r1) goto L_0x00a0
            r8.f2292t0 = r1
            r0 = 1
        L_0x00a0:
            int[] r1 = r8.getState()
            r3 = 16842912(0x10100a0, float:2.3694006E-38)
            if (r1 != 0) goto L_0x00ab
        L_0x00a9:
            r1 = 0
            goto L_0x00b8
        L_0x00ab:
            int r5 = r1.length
            r6 = 0
        L_0x00ad:
            if (r6 >= r5) goto L_0x00a9
            r7 = r1[r6]
            if (r7 != r3) goto L_0x00b5
            r1 = 1
            goto L_0x00b8
        L_0x00b5:
            int r6 = r6 + 1
            goto L_0x00ad
        L_0x00b8:
            if (r1 == 0) goto L_0x00c0
            boolean r1 = r8.T
            if (r1 == 0) goto L_0x00c0
            r1 = 1
            goto L_0x00c1
        L_0x00c0:
            r1 = 0
        L_0x00c1:
            boolean r3 = r8.f2293u0
            if (r3 == r1) goto L_0x00db
            android.graphics.drawable.Drawable r3 = r8.V
            if (r3 == 0) goto L_0x00db
            float r0 = r8.A()
            r8.f2293u0 = r1
            float r1 = r8.A()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00da
            r0 = 1
            r1 = 1
            goto L_0x00dc
        L_0x00da:
            r0 = 1
        L_0x00db:
            r1 = 0
        L_0x00dc:
            android.content.res.ColorStateList r3 = r8.f2298z0
            if (r3 == 0) goto L_0x00e7
            int r5 = r8.f2294v0
            int r3 = r3.getColorForState(r9, r5)
            goto L_0x00e8
        L_0x00e7:
            r3 = 0
        L_0x00e8:
            int r5 = r8.f2294v0
            if (r5 == r3) goto L_0x00f9
            r8.f2294v0 = r3
            android.content.res.ColorStateList r0 = r8.f2298z0
            android.graphics.PorterDuff$Mode r3 = r8.A0
            android.graphics.PorterDuffColorFilter r0 = k1.a.a(r8, r0, r3)
            r8.f2297y0 = r0
            goto L_0x00fa
        L_0x00f9:
            r4 = r0
        L_0x00fa:
            android.graphics.drawable.Drawable r0 = r8.J
            boolean r0 = I(r0)
            if (r0 == 0) goto L_0x0109
            android.graphics.drawable.Drawable r0 = r8.J
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0109:
            android.graphics.drawable.Drawable r0 = r8.V
            boolean r0 = I(r0)
            if (r0 == 0) goto L_0x0118
            android.graphics.drawable.Drawable r0 = r8.V
            boolean r0 = r0.setState(r9)
            r4 = r4 | r0
        L_0x0118:
            android.graphics.drawable.Drawable r0 = r8.O
            boolean r0 = I(r0)
            if (r0 == 0) goto L_0x0135
            int r0 = r9.length
            int r3 = r10.length
            int r0 = r0 + r3
            int[] r0 = new int[r0]
            int r3 = r9.length
            java.lang.System.arraycopy(r9, r2, r0, r2, r3)
            int r9 = r9.length
            int r3 = r10.length
            java.lang.System.arraycopy(r10, r2, r0, r9, r3)
            android.graphics.drawable.Drawable r9 = r8.O
            boolean r9 = r9.setState(r0)
            r4 = r4 | r9
        L_0x0135:
            int[] r9 = s1.b.f3881a
            android.graphics.drawable.Drawable r9 = r8.P
            boolean r9 = I(r9)
            if (r9 == 0) goto L_0x0146
            android.graphics.drawable.Drawable r9 = r8.P
            boolean r9 = r9.setState(r10)
            r4 = r4 | r9
        L_0x0146:
            if (r4 == 0) goto L_0x014b
            r8.invalidateSelf()
        L_0x014b:
            if (r1 == 0) goto L_0x0150
            r8.J()
        L_0x0150:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.K(int[], int[]):boolean");
    }

    public void L(boolean z2) {
        if (this.T != z2) {
            this.T = z2;
            float A2 = A();
            if (!z2 && this.f2293u0) {
                this.f2293u0 = false;
            }
            float A3 = A();
            invalidateSelf();
            if (A2 != A3) {
                J();
            }
        }
    }

    public void M(Drawable drawable) {
        if (this.V != drawable) {
            float A2 = A();
            this.V = drawable;
            float A3 = A();
            s0(this.V);
            y(this.V);
            invalidateSelf();
            if (A2 != A3) {
                J();
            }
        }
    }

    public void N(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            if (this.U && this.V != null && this.T) {
                this.V.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void O(boolean z2) {
        if (this.U != z2) {
            boolean p02 = p0();
            this.U = z2;
            boolean p03 = p0();
            if (p02 != p03) {
                if (p03) {
                    y(this.V);
                } else {
                    s0(this.V);
                }
                invalidateSelf();
                J();
            }
        }
    }

    public void P(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            onStateChange(getState());
        }
    }

    @Deprecated
    public void Q(float f2) {
        if (this.D != f2) {
            this.D = f2;
            this.f3911b.f3935a = this.f3911b.f3935a.e(f2);
            invalidateSelf();
        }
    }

    public void R(float f2) {
        if (this.f2279g0 != f2) {
            this.f2279g0 = f2;
            invalidateSelf();
            J();
        }
    }

    public void S(Drawable drawable) {
        Drawable drawable2 = this.J;
        Drawable drawable3 = null;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (drawable2 instanceof c) {
            drawable2 = ((c) drawable2).a();
        }
        if (drawable2 != drawable) {
            float A2 = A();
            if (drawable != null) {
                drawable3 = a0.a.g(drawable).mutate();
            }
            this.J = drawable3;
            float A3 = A();
            s0(drawable2);
            if (q0()) {
                y(this.J);
            }
            invalidateSelf();
            if (A2 != A3) {
                J();
            }
        }
    }

    public void T(float f2) {
        if (this.L != f2) {
            float A2 = A();
            this.L = f2;
            float A3 = A();
            invalidateSelf();
            if (A2 != A3) {
                J();
            }
        }
    }

    public void U(ColorStateList colorStateList) {
        this.M = true;
        if (this.K != colorStateList) {
            this.K = colorStateList;
            if (q0()) {
                this.J.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void V(boolean z2) {
        if (this.I != z2) {
            boolean q02 = q0();
            this.I = z2;
            boolean q03 = q0();
            if (q02 != q03) {
                if (q03) {
                    y(this.J);
                } else {
                    s0(this.J);
                }
                invalidateSelf();
                J();
            }
        }
    }

    public void W(float f2) {
        if (this.C != f2) {
            this.C = f2;
            invalidateSelf();
            J();
        }
    }

    public void X(float f2) {
        if (this.Z != f2) {
            this.Z = f2;
            invalidateSelf();
            J();
        }
    }

    public void Y(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            if (this.I0) {
                u(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void Z(float f2) {
        if (this.F != f2) {
            this.F = f2;
            this.f2281i0.setStrokeWidth(f2);
            if (this.I0) {
                this.f3911b.f3946l = f2;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public void a() {
        J();
        invalidateSelf();
    }

    public void a0(Drawable drawable) {
        Drawable F2 = F();
        if (F2 != drawable) {
            float D2 = D();
            this.O = drawable != null ? a0.a.g(drawable).mutate() : null;
            int[] iArr = b.f3881a;
            this.P = new RippleDrawable(b.a(this.G), this.O, K0);
            float D3 = D();
            s0(F2);
            if (r0()) {
                y(this.O);
            }
            invalidateSelf();
            if (D2 != D3) {
                J();
            }
        }
    }

    public void b0(float f2) {
        if (this.f2278f0 != f2) {
            this.f2278f0 = f2;
            invalidateSelf();
            if (r0()) {
                J();
            }
        }
    }

    public void c0(float f2) {
        if (this.R != f2) {
            this.R = f2;
            invalidateSelf();
            if (r0()) {
                J();
            }
        }
    }

    public void d0(float f2) {
        if (this.f2277e0 != f2) {
            this.f2277e0 = f2;
            invalidateSelf();
            if (r0()) {
                J();
            }
        }
    }

    public void draw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        float f2;
        Canvas canvas2 = canvas;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i2 = this.f2295w0) != 0) {
            if (i2 < 255) {
                float f3 = (float) bounds.left;
                float f4 = (float) bounds.top;
                float f5 = (float) bounds.right;
                float f6 = (float) bounds.bottom;
                i3 = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f3, f4, f5, f6, i2) : canvas.saveLayerAlpha(f3, f4, f5, f6, i2, 31);
            } else {
                i3 = 0;
            }
            if (!this.I0) {
                this.f2281i0.setColor(this.f2287o0);
                this.f2281i0.setStyle(Paint.Style.FILL);
                this.f2283k0.set(bounds);
                canvas2.drawRoundRect(this.f2283k0, E(), E(), this.f2281i0);
            }
            if (!this.I0) {
                this.f2281i0.setColor(this.f2288p0);
                this.f2281i0.setStyle(Paint.Style.FILL);
                Paint paint = this.f2281i0;
                ColorFilter colorFilter = this.f2296x0;
                if (colorFilter == null) {
                    colorFilter = this.f2297y0;
                }
                paint.setColorFilter(colorFilter);
                this.f2283k0.set(bounds);
                canvas2.drawRoundRect(this.f2283k0, E(), E(), this.f2281i0);
            }
            if (this.I0) {
                super.draw(canvas);
            }
            if (this.F > 0.0f && !this.I0) {
                this.f2281i0.setColor(this.f2290r0);
                this.f2281i0.setStyle(Paint.Style.STROKE);
                if (!this.I0) {
                    Paint paint2 = this.f2281i0;
                    ColorFilter colorFilter2 = this.f2296x0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.f2297y0;
                    }
                    paint2.setColorFilter(colorFilter2);
                }
                RectF rectF = this.f2283k0;
                float f7 = this.F / 2.0f;
                rectF.set(((float) bounds.left) + f7, ((float) bounds.top) + f7, ((float) bounds.right) - f7, ((float) bounds.bottom) - f7);
                float f8 = this.D - (this.F / 2.0f);
                canvas2.drawRoundRect(this.f2283k0, f8, f8, this.f2281i0);
            }
            this.f2281i0.setColor(this.f2291s0);
            this.f2281i0.setStyle(Paint.Style.FILL);
            this.f2283k0.set(bounds);
            if (!this.I0) {
                canvas2.drawRoundRect(this.f2283k0, E(), E(), this.f2281i0);
                i4 = 0;
            } else {
                c(new RectF(bounds), this.f2285m0);
                i4 = 0;
                g(canvas, this.f2281i0, this.f2285m0, this.f3911b.f3935a, i());
            }
            if (q0()) {
                z(bounds, this.f2283k0);
                RectF rectF2 = this.f2283k0;
                float f9 = rectF2.left;
                float f10 = rectF2.top;
                canvas2.translate(f9, f10);
                this.J.setBounds(i4, i4, (int) this.f2283k0.width(), (int) this.f2283k0.height());
                this.J.draw(canvas2);
                canvas2.translate(-f9, -f10);
            }
            if (p0()) {
                z(bounds, this.f2283k0);
                RectF rectF3 = this.f2283k0;
                float f11 = rectF3.left;
                float f12 = rectF3.top;
                canvas2.translate(f11, f12);
                this.V.setBounds(i4, i4, (int) this.f2283k0.width(), (int) this.f2283k0.height());
                this.V.draw(canvas2);
                canvas2.translate(-f11, -f12);
            }
            if (!this.G0 || this.H == null) {
                i7 = i3;
                i6 = 255;
                i5 = 0;
            } else {
                PointF pointF = this.f2284l0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                if (this.H != null) {
                    float A2 = A() + this.Z + this.f2275c0;
                    if (a0.a.b(this) == 0) {
                        pointF.x = ((float) bounds.left) + A2;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = ((float) bounds.right) - A2;
                        align = Paint.Align.RIGHT;
                    }
                    this.f2286n0.f3590a.getFontMetrics(this.f2282j0);
                    Paint.FontMetrics fontMetrics = this.f2282j0;
                    pointF.y = ((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                RectF rectF4 = this.f2283k0;
                rectF4.setEmpty();
                if (this.H != null) {
                    float A3 = A() + this.Z + this.f2275c0;
                    float D2 = D() + this.f2279g0 + this.f2276d0;
                    if (a0.a.b(this) == 0) {
                        rectF4.left = ((float) bounds.left) + A3;
                        f2 = ((float) bounds.right) - D2;
                    } else {
                        rectF4.left = ((float) bounds.left) + D2;
                        f2 = ((float) bounds.right) - A3;
                    }
                    rectF4.right = f2;
                    rectF4.top = (float) bounds.top;
                    rectF4.bottom = (float) bounds.bottom;
                }
                l lVar = this.f2286n0;
                if (lVar.f3595f != null) {
                    lVar.f3590a.drawableState = getState();
                    l lVar2 = this.f2286n0;
                    lVar2.f3595f.e(this.f2280h0, lVar2.f3590a, lVar2.f3591b);
                }
                this.f2286n0.f3590a.setTextAlign(align);
                boolean z2 = Math.round(this.f2286n0.a(this.H.toString())) > Math.round(this.f2283k0.width());
                if (z2) {
                    i8 = canvas.save();
                    canvas2.clipRect(this.f2283k0);
                } else {
                    i8 = 0;
                }
                CharSequence charSequence = this.H;
                if (z2 && this.F0 != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f2286n0.f3590a, this.f2283k0.width(), this.F0);
                }
                CharSequence charSequence2 = charSequence;
                int length = charSequence2.length();
                PointF pointF2 = this.f2284l0;
                i5 = 0;
                float f13 = pointF2.x;
                i6 = 255;
                float f14 = pointF2.y;
                i7 = i3;
                canvas.drawText(charSequence2, 0, length, f13, f14, this.f2286n0.f3590a);
                if (z2) {
                    canvas2.restoreToCount(i8);
                }
            }
            if (r0()) {
                B(bounds, this.f2283k0);
                RectF rectF5 = this.f2283k0;
                float f15 = rectF5.left;
                float f16 = rectF5.top;
                canvas2.translate(f15, f16);
                this.O.setBounds(i5, i5, (int) this.f2283k0.width(), (int) this.f2283k0.height());
                int[] iArr = b.f3881a;
                this.P.setBounds(this.O.getBounds());
                this.P.jumpToCurrentState();
                this.P.draw(canvas2);
                canvas2.translate(-f15, -f16);
            }
            if (this.f2295w0 < i6) {
                canvas2.restoreToCount(i7);
            }
        }
    }

    public boolean e0(int[] iArr) {
        if (Arrays.equals(this.B0, iArr)) {
            return false;
        }
        this.B0 = iArr;
        if (r0()) {
            return K(getState(), iArr);
        }
        return false;
    }

    public void f0(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            if (r0()) {
                this.O.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void g0(boolean z2) {
        if (this.N != z2) {
            boolean r02 = r0();
            this.N = z2;
            boolean r03 = r0();
            if (r02 != r03) {
                if (r03) {
                    y(this.O);
                } else {
                    s0(this.O);
                }
                invalidateSelf();
                J();
            }
        }
    }

    public int getAlpha() {
        return this.f2295w0;
    }

    public ColorFilter getColorFilter() {
        return this.f2296x0;
    }

    public int getIntrinsicHeight() {
        return (int) this.C;
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(D() + this.f2286n0.a(this.H.toString()) + A() + this.Z + this.f2275c0 + this.f2276d0 + this.f2279g0), this.H0);
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.I0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.D);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.C, this.D);
        }
        outline.setAlpha(((float) this.f2295w0) / 255.0f);
    }

    public void h0(float f2) {
        if (this.f2274b0 != f2) {
            float A2 = A();
            this.f2274b0 = f2;
            float A3 = A();
            invalidateSelf();
            if (A2 != A3) {
                J();
            }
        }
    }

    public void i0(float f2) {
        if (this.f2273a0 != f2) {
            float A2 = A();
            this.f2273a0 = f2;
            float A3 = A();
            invalidateSelf();
            if (A2 != A3) {
                J();
            }
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        r0 = r0.f3829j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r3 = this;
            android.content.res.ColorStateList r0 = r3.A
            boolean r0 = H(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.B
            boolean r0 = H(r0)
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.E
            boolean r0 = H(r0)
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.C0
            if (r0 == 0) goto L_0x0026
            android.content.res.ColorStateList r0 = r3.D0
            boolean r0 = H(r0)
            if (r0 != 0) goto L_0x0066
        L_0x0026:
            o1.l r0 = r3.f2286n0
            r1.d r0 = r0.f3595f
            if (r0 == 0) goto L_0x0038
            android.content.res.ColorStateList r0 = r0.f3829j
            if (r0 == 0) goto L_0x0038
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.U
            if (r0 == 0) goto L_0x0049
            android.graphics.drawable.Drawable r0 = r3.V
            if (r0 == 0) goto L_0x0049
            boolean r0 = r3.T
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r3.J
            boolean r0 = I(r0)
            if (r0 != 0) goto L_0x0066
            android.graphics.drawable.Drawable r0 = r3.V
            boolean r0 = I(r0)
            if (r0 != 0) goto L_0x0066
            android.content.res.ColorStateList r0 = r3.f2298z0
            boolean r0 = H(r0)
            if (r0 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.a.isStateful():boolean");
    }

    public void j0(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            this.D0 = this.C0 ? b.a(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public void k0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.H, charSequence)) {
            this.H = charSequence;
            this.f2286n0.f3593d = true;
            invalidateSelf();
            J();
        }
    }

    public void l0(d dVar) {
        l lVar = this.f2286n0;
        Context context = this.f2280h0;
        if (lVar.f3595f != dVar) {
            lVar.f3595f = dVar;
            if (dVar != null) {
                dVar.f(context, lVar.f3590a, lVar.f3591b);
                l.b bVar = (l.b) lVar.f3594e.get();
                if (bVar != null) {
                    lVar.f3590a.drawableState = bVar.getState();
                }
                dVar.e(context, lVar.f3590a, lVar.f3591b);
                lVar.f3593d = true;
            }
            l.b bVar2 = (l.b) lVar.f3594e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void m0(float f2) {
        if (this.f2276d0 != f2) {
            this.f2276d0 = f2;
            invalidateSelf();
            J();
        }
    }

    public void n0(float f2) {
        if (this.f2275c0 != f2) {
            this.f2275c0 = f2;
            invalidateSelf();
            J();
        }
    }

    public void o0(boolean z2) {
        if (this.C0 != z2) {
            this.C0 = z2;
            this.D0 = z2 ? b.a(this.G) : null;
            onStateChange(getState());
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i2);
        if (q0()) {
            onLayoutDirectionChanged |= a0.a.c(this.J, i2);
        }
        if (p0()) {
            onLayoutDirectionChanged |= a0.a.c(this.V, i2);
        }
        if (r0()) {
            onLayoutDirectionChanged |= a0.a.c(this.O, i2);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    public boolean onLevelChange(int i2) {
        boolean onLevelChange = super.onLevelChange(i2);
        if (q0()) {
            onLevelChange |= this.J.setLevel(i2);
        }
        if (p0()) {
            onLevelChange |= this.V.setLevel(i2);
        }
        if (r0()) {
            onLevelChange |= this.O.setLevel(i2);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public boolean onStateChange(int[] iArr) {
        if (this.I0) {
            super.onStateChange(iArr);
        }
        return K(iArr, this.B0);
    }

    public final boolean p0() {
        return this.U && this.V != null && this.f2293u0;
    }

    public final boolean q0() {
        return this.I && this.J != null;
    }

    public final boolean r0() {
        return this.N && this.O != null;
    }

    public final void s0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (this.f2295w0 != i2) {
            this.f2295w0 = i2;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f2296x0 != colorFilter) {
            this.f2296x0 = colorFilter;
            invalidateSelf();
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.f2298z0 != colorStateList) {
            this.f2298z0 = colorStateList;
            onStateChange(getState());
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        if (this.A0 != mode) {
            this.A0 = mode;
            this.f2297y0 = k1.a.a(this, this.f2298z0, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (q0()) {
            visible |= this.J.setVisible(z2, z3);
        }
        if (p0()) {
            visible |= this.V.setVisible(z2, z3);
        }
        if (r0()) {
            visible |= this.O.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void y(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(this);
            a0.a.c(drawable, a0.a.b(this));
            drawable.setLevel(getLevel());
            drawable.setVisible(isVisible(), false);
            if (drawable == this.O) {
                if (drawable.isStateful()) {
                    drawable.setState(this.B0);
                }
                drawable.setTintList(this.Q);
                return;
            }
            Drawable drawable2 = this.J;
            if (drawable == drawable2 && this.M) {
                drawable2.setTintList(this.K);
            }
            if (drawable.isStateful()) {
                drawable.setState(getState());
            }
        }
    }

    public final void z(Rect rect, RectF rectF) {
        float f2;
        rectF.setEmpty();
        if (q0() || p0()) {
            float f3 = this.Z + this.f2273a0;
            float G2 = G();
            if (a0.a.b(this) == 0) {
                float f4 = ((float) rect.left) + f3;
                rectF.left = f4;
                rectF.right = f4 + G2;
            } else {
                float f5 = ((float) rect.right) - f3;
                rectF.right = f5;
                rectF.left = f5 - G2;
            }
            Drawable drawable = this.f2293u0 ? this.V : this.J;
            float f6 = this.L;
            if (f6 <= 0.0f && drawable != null) {
                f6 = (float) Math.ceil((double) TypedValue.applyDimension(1, (float) 24, this.f2280h0.getResources().getDisplayMetrics()));
                if (((float) drawable.getIntrinsicHeight()) <= f6) {
                    f2 = (float) drawable.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f2 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f2;
                }
            }
            f2 = f6;
            float exactCenterY2 = rect.exactCenterY() - (f2 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f2;
        }
    }
}
