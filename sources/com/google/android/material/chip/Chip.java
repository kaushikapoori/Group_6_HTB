package com.google.android.material.chip;

import a0.c;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.result.d;
import androidx.appcompat.widget.g;
import com.example.supermarket.R;
import com.google.android.material.chip.a;
import g0.u;
import g0.x;
import h0.d;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import o1.i;
import u1.g;
import u1.j;
import u1.n;

public class Chip extends g implements a.C0015a, n, i<Chip> {
    public static final int[] A = {16842911};

    /* renamed from: y  reason: collision with root package name */
    public static final Rect f2240y = new Rect();

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f2241z = {16842913};

    /* renamed from: f  reason: collision with root package name */
    public a f2242f;

    /* renamed from: g  reason: collision with root package name */
    public InsetDrawable f2243g;

    /* renamed from: h  reason: collision with root package name */
    public RippleDrawable f2244h;

    /* renamed from: i  reason: collision with root package name */
    public View.OnClickListener f2245i;

    /* renamed from: j  reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f2246j;

    /* renamed from: k  reason: collision with root package name */
    public i.a<Chip> f2247k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2248l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2249m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2250n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2251o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2252p;

    /* renamed from: q  reason: collision with root package name */
    public int f2253q;

    /* renamed from: r  reason: collision with root package name */
    public int f2254r;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f2255s;

    /* renamed from: t  reason: collision with root package name */
    public final b f2256t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2257u;

    /* renamed from: v  reason: collision with root package name */
    public final Rect f2258v = new Rect();

    /* renamed from: w  reason: collision with root package name */
    public final RectF f2259w = new RectF();

    /* renamed from: x  reason: collision with root package name */
    public final d f2260x = new a();

    public class a extends d {
        public a() {
            super(3);
        }

        public void c(int i2) {
        }

        public void d(Typeface typeface, boolean z2) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            a aVar = chip.f2242f;
            if (aVar.G0) {
                charSequence = aVar.H;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends m0.a {
        public b(Chip chip) {
            super(chip);
        }

        public void m(List<Integer> list) {
            boolean z2 = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.f2240y;
            if (chip.e()) {
                Chip chip2 = Chip.this;
                a aVar = chip2.f2242f;
                if (aVar != null && aVar.N) {
                    z2 = true;
                }
                if (z2 && chip2.f2245i != null) {
                    list.add(1);
                }
            }
        }

        public boolean p(int i2, int i3, Bundle bundle) {
            if (i3 != 16) {
                return false;
            }
            if (i2 == 0) {
                return Chip.this.performClick();
            }
            if (i2 == 1) {
                return Chip.this.g();
            }
            return false;
        }

        public void q(int i2, h0.d dVar) {
            CharSequence charSequence = "";
            if (i2 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim();
                }
                dVar.f3160a.setContentDescription(closeIconContentDescription);
                dVar.f3160a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                dVar.a(d.a.f3163e);
                dVar.f3160a.setEnabled(Chip.this.isEnabled());
                return;
            }
            dVar.f3160a.setContentDescription(charSequence);
            dVar.f3160a.setBoundsInParent(Chip.f2240y);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011c, code lost:
        r4 = r1.getResourceId(0, 0);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0305  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0355  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = 2131755971(0x7f1003c3, float:1.9142836E38)
            r9 = 2130903223(0x7f0300b7, float:1.7413258E38)
            r1 = r18
            android.content.Context r1 = x1.a.a(r1, r7, r9, r8)
            r0.<init>(r1, r7, r9)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f2258v = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f2259w = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.f2260x = r1
            android.content.Context r10 = r17.getContext()
            r11 = 1
            r12 = 8388627(0x800013, float:1.175497E-38)
            if (r7 != 0) goto L_0x0033
            goto L_0x0093
        L_0x0033:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Chip"
            if (r2 == 0) goto L_0x0044
            java.lang.String r2 = "Do not set the background; Chip manages its own background drawable."
            android.util.Log.w(r3, r2)
        L_0x0044:
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0385
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x037d
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r4 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x0377
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x0371
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r11)
            if (r2 == 0) goto L_0x0369
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0369
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0369
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r11)
            if (r2 != r11) goto L_0x0369
            java.lang.String r2 = "gravity"
            int r1 = r7.getAttributeIntValue(r1, r2, r12)
            if (r1 == r12) goto L_0x0093
            java.lang.String r1 = "Chip text must be vertically center and start aligned"
            android.util.Log.w(r3, r1)
        L_0x0093:
            com.google.android.material.chip.a r13 = new com.google.android.material.chip.a
            r13.<init>(r10, r7, r9, r8)
            android.content.Context r1 = r13.f2280h0
            int[] r14 = y0.a.f4366c
            r15 = 0
            int[] r6 = new int[r15]
            r5 = 2131755971(0x7f1003c3, float:1.9142836E38)
            r4 = 2130903223(0x7f0300b7, float:1.7413258E38)
            r2 = r19
            r3 = r14
            android.content.res.TypedArray r1 = o1.n.d(r1, r2, r3, r4, r5, r6)
            r6 = 37
            boolean r2 = r1.hasValue(r6)
            r13.I0 = r2
            android.content.Context r2 = r13.f2280h0
            r3 = 24
            android.content.res.ColorStateList r2 = r1.c.a(r2, r1, r3)
            android.content.res.ColorStateList r3 = r13.A
            if (r3 == r2) goto L_0x00c9
            r13.A = r2
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        L_0x00c9:
            android.content.Context r2 = r13.f2280h0
            r3 = 11
            android.content.res.ColorStateList r2 = r1.c.a(r2, r1, r3)
            r13.P(r2)
            r2 = 19
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            r13.W(r2)
            r2 = 12
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x00ed
            float r2 = r1.getDimension(r2, r3)
            r13.Q(r2)
        L_0x00ed:
            android.content.Context r2 = r13.f2280h0
            r4 = 22
            android.content.res.ColorStateList r2 = r1.c.a(r2, r1, r4)
            r13.Y(r2)
            r5 = 23
            float r2 = r1.getDimension(r5, r3)
            r13.Z(r2)
            android.content.Context r2 = r13.f2280h0
            r4 = 36
            android.content.res.ColorStateList r2 = r1.c.a(r2, r1, r4)
            r13.j0(r2)
            r2 = 5
            java.lang.CharSequence r2 = r1.getText(r2)
            r13.k0(r2)
            android.content.Context r2 = r13.f2280h0
            boolean r4 = r1.hasValue(r15)
            if (r4 == 0) goto L_0x0128
            int r4 = r1.getResourceId(r15, r15)
            if (r4 == 0) goto L_0x0128
            r1.d r6 = new r1.d
            r6.<init>(r2, r4)
            goto L_0x0129
        L_0x0128:
            r6 = 0
        L_0x0129:
            float r2 = r6.f3830k
            float r2 = r1.getDimension(r11, r2)
            r6.f3830k = r2
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 2
            if (r4 >= r5) goto L_0x013e
            android.content.Context r5 = r13.f2280h0
            android.content.res.ColorStateList r5 = r1.c.a(r5, r1, r2)
            r6.f3829j = r5
        L_0x013e:
            r13.l0(r6)
            r5 = 3
            int r6 = r1.getInt(r5, r15)
            if (r6 == r11) goto L_0x0153
            if (r6 == r2) goto L_0x0150
            if (r6 == r5) goto L_0x014d
            goto L_0x0157
        L_0x014d:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.END
            goto L_0x0155
        L_0x0150:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.MIDDLE
            goto L_0x0155
        L_0x0153:
            android.text.TextUtils$TruncateAt r5 = android.text.TextUtils.TruncateAt.START
        L_0x0155:
            r13.F0 = r5
        L_0x0157:
            r5 = 18
            boolean r5 = r1.getBoolean(r5, r15)
            r13.V(r5)
            java.lang.String r5 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x017d
            java.lang.String r6 = "chipIconEnabled"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 == 0) goto L_0x017d
            java.lang.String r6 = "chipIconVisible"
            java.lang.String r6 = r7.getAttributeValue(r5, r6)
            if (r6 != 0) goto L_0x017d
            r6 = 15
            boolean r6 = r1.getBoolean(r6, r15)
            r13.V(r6)
        L_0x017d:
            android.content.Context r6 = r13.f2280h0
            r2 = 14
            android.graphics.drawable.Drawable r2 = r1.c.c(r6, r1, r2)
            r13.S(r2)
            r2 = 17
            boolean r6 = r1.hasValue(r2)
            if (r6 == 0) goto L_0x0199
            android.content.Context r6 = r13.f2280h0
            android.content.res.ColorStateList r2 = r1.c.a(r6, r1, r2)
            r13.U(r2)
        L_0x0199:
            r2 = 16
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.getDimension(r2, r6)
            r13.T(r2)
            r2 = 31
            boolean r2 = r1.getBoolean(r2, r15)
            r13.g0(r2)
            if (r7 == 0) goto L_0x01c8
            java.lang.String r2 = "closeIconEnabled"
            java.lang.String r2 = r7.getAttributeValue(r5, r2)
            if (r2 == 0) goto L_0x01c8
            java.lang.String r2 = "closeIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r5, r2)
            if (r2 != 0) goto L_0x01c8
            r2 = 26
            boolean r2 = r1.getBoolean(r2, r15)
            r13.g0(r2)
        L_0x01c8:
            android.content.Context r2 = r13.f2280h0
            r6 = 25
            android.graphics.drawable.Drawable r2 = r1.c.c(r2, r1, r6)
            r13.a0(r2)
            android.content.Context r2 = r13.f2280h0
            r6 = 30
            android.content.res.ColorStateList r2 = r1.c.a(r2, r1, r6)
            r13.f0(r2)
            r2 = 28
            float r2 = r1.getDimension(r2, r3)
            r13.c0(r2)
            r2 = 6
            boolean r2 = r1.getBoolean(r2, r15)
            r13.L(r2)
            r2 = 10
            boolean r2 = r1.getBoolean(r2, r15)
            r13.O(r2)
            if (r7 == 0) goto L_0x0213
            java.lang.String r2 = "checkedIconEnabled"
            java.lang.String r2 = r7.getAttributeValue(r5, r2)
            if (r2 == 0) goto L_0x0213
            java.lang.String r2 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r5, r2)
            if (r2 != 0) goto L_0x0213
            r2 = 8
            boolean r2 = r1.getBoolean(r2, r15)
            r13.O(r2)
        L_0x0213:
            android.content.Context r2 = r13.f2280h0
            r5 = 7
            android.graphics.drawable.Drawable r2 = r1.c.c(r2, r1, r5)
            r13.M(r2)
            r2 = 9
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x022e
            android.content.Context r5 = r13.f2280h0
            android.content.res.ColorStateList r2 = r1.c.a(r5, r1, r2)
            r13.N(r2)
        L_0x022e:
            android.content.Context r2 = r13.f2280h0
            r5 = 39
            z0.g r2 = z0.g.a(r2, r1, r5)
            r13.X = r2
            android.content.Context r2 = r13.f2280h0
            r5 = 33
            z0.g r2 = z0.g.a(r2, r1, r5)
            r13.Y = r2
            r2 = 21
            float r2 = r1.getDimension(r2, r3)
            r13.X(r2)
            r2 = 35
            float r2 = r1.getDimension(r2, r3)
            r13.i0(r2)
            r2 = 34
            float r2 = r1.getDimension(r2, r3)
            r13.h0(r2)
            r2 = 41
            float r2 = r1.getDimension(r2, r3)
            r13.n0(r2)
            r2 = 40
            float r2 = r1.getDimension(r2, r3)
            r13.m0(r2)
            r2 = 29
            float r2 = r1.getDimension(r2, r3)
            r13.d0(r2)
            r2 = 27
            float r2 = r1.getDimension(r2, r3)
            r13.b0(r2)
            r2 = 13
            float r2 = r1.getDimension(r2, r3)
            r13.R(r2)
            r2 = 4
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r13.H0 = r2
            r1.recycle()
            int[] r6 = new int[r15]
            o1.n.a(r10, r7, r9, r8)
            r5 = 2131755971(0x7f1003c3, float:1.9142836E38)
            r16 = 2130903223(0x7f0300b7, float:1.7413258E38)
            r1 = r10
            r3 = 2
            r2 = r19
            r12 = 2
            r3 = r14
            r12 = r4
            r4 = r16
            o1.n.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r7, r14, r9, r8)
            r2 = 32
            boolean r2 = r1.getBoolean(r2, r15)
            r0.f2252p = r2
            android.content.Context r2 = r17.getContext()
            r3 = 48
            android.content.res.Resources r2 = r2.getResources()
            float r3 = (float) r3
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = android.util.TypedValue.applyDimension(r11, r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            r3 = 20
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f2254r = r2
            r1.recycle()
            r0.setChipDrawable(r13)
            float r1 = g0.u.i.i(r17)
            r13.p(r1)
            int[] r6 = new int[r15]
            o1.n.a(r10, r7, r9, r8)
            r4 = 2130903223(0x7f0300b7, float:1.7413258E38)
            r1 = r10
            r2 = r19
            r3 = r14
            o1.n.b(r1, r2, r3, r4, r5, r6)
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r7, r14, r9, r8)
            r2 = 23
            if (r12 >= r2) goto L_0x030d
            r2 = 2
            android.content.res.ColorStateList r2 = r1.c.a(r10, r1, r2)
            r0.setTextColor(r2)
        L_0x030d:
            r2 = 37
            boolean r2 = r1.hasValue(r2)
            r1.recycle()
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>(r0)
            r0.f2256t = r1
            r17.i()
            if (r2 != 0) goto L_0x032a
            g1.b r1 = new g1.b
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x032a:
            boolean r1 = r0.f2248l
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r13.H
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r13.F0
            r0.setEllipsize(r1)
            r17.l()
            com.google.android.material.chip.a r1 = r0.f2242f
            boolean r1 = r1.G0
            if (r1 != 0) goto L_0x0348
            r0.setLines(r11)
            r0.setHorizontallyScrolling(r11)
        L_0x0348:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r17.k()
            boolean r1 = r0.f2252p
            if (r1 == 0) goto L_0x035a
            int r1 = r0.f2254r
            r0.setMinHeight(r1)
        L_0x035a:
            int r1 = g0.u.e.d(r17)
            r0.f2253q = r1
            g1.a r1 = new g1.a
            r1.<init>(r0)
            super.setOnCheckedChangeListener(r1)
            return
        L_0x0369:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x0371:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x0377:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r4)
            throw r1
        L_0x037d:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x0385:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f2259w.setEmpty();
        if (e() && this.f2245i != null) {
            a aVar = this.f2242f;
            aVar.C(aVar.getBounds(), this.f2259w);
        }
        return this.f2259w;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f2258v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f2258v;
    }

    private r1.d getTextAppearance() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.f2286n0.f3595f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f2250n != z2) {
            this.f2250n = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f2249m != z2) {
            this.f2249m = z2;
            refreshDrawableState();
        }
    }

    public void a() {
        d(this.f2254r);
        requestLayout();
        invalidateOutline();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (r0.right == r7) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(int r10) {
        /*
            r9 = this;
            r9.f2254r = r10
            boolean r0 = r9.f2252p
            r1 = 0
            if (r0 != 0) goto L_0x0015
            android.graphics.drawable.InsetDrawable r10 = r9.f2243g
            if (r10 == 0) goto L_0x000f
            r9.h()
            goto L_0x0014
        L_0x000f:
            int[] r10 = s1.b.f3881a
            r9.j()
        L_0x0014:
            return r1
        L_0x0015:
            com.google.android.material.chip.a r0 = r9.f2242f
            float r0 = r0.C
            int r0 = (int) r0
            int r0 = r10 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.a r2 = r9.f2242f
            int r2 = r2.getIntrinsicWidth()
            int r2 = r10 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L_0x003e
            if (r0 > 0) goto L_0x003e
            android.graphics.drawable.InsetDrawable r10 = r9.f2243g
            if (r10 == 0) goto L_0x0038
            r9.h()
            goto L_0x003d
        L_0x0038:
            int[] r10 = s1.b.f3881a
            r9.j()
        L_0x003d:
            return r1
        L_0x003e:
            if (r2 <= 0) goto L_0x0044
            int r2 = r2 / 2
            r7 = r2
            goto L_0x0045
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r0 <= 0) goto L_0x004b
            int r1 = r0 / 2
            r8 = r1
            goto L_0x004c
        L_0x004b:
            r8 = 0
        L_0x004c:
            android.graphics.drawable.InsetDrawable r0 = r9.f2243g
            r1 = 1
            if (r0 == 0) goto L_0x0071
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r2 = r9.f2243g
            r2.getPadding(r0)
            int r2 = r0.top
            if (r2 != r8) goto L_0x0071
            int r2 = r0.bottom
            if (r2 != r8) goto L_0x0071
            int r2 = r0.left
            if (r2 != r7) goto L_0x0071
            int r0 = r0.right
            if (r0 != r7) goto L_0x0071
        L_0x006b:
            int[] r10 = s1.b.f3881a
            r9.j()
            return r1
        L_0x0071:
            int r0 = r9.getMinHeight()
            if (r0 == r10) goto L_0x007a
            r9.setMinHeight(r10)
        L_0x007a:
            int r0 = r9.getMinWidth()
            if (r0 == r10) goto L_0x0083
            r9.setMinWidth(r10)
        L_0x0083:
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            com.google.android.material.chip.a r4 = r9.f2242f
            r3 = r10
            r5 = r7
            r6 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f2243g = r10
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.d(int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchHoverEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f2257u
            if (r0 != 0) goto L_0x0009
            boolean r10 = super.dispatchHoverEvent(r10)
            return r10
        L_0x0009:
            com.google.android.material.chip.Chip$b r0 = r9.f2256t
            android.view.accessibility.AccessibilityManager r1 = r0.f3389h
            boolean r1 = r1.isEnabled()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0074
            android.view.accessibility.AccessibilityManager r1 = r0.f3389h
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L_0x001e
            goto L_0x0074
        L_0x001e:
            int r1 = r10.getAction()
            r4 = 7
            r5 = 256(0x100, float:3.59E-43)
            r6 = 128(0x80, float:1.794E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r4) goto L_0x0044
            r4 = 9
            if (r1 == r4) goto L_0x0044
            r4 = 10
            if (r1 == r4) goto L_0x0034
            goto L_0x0074
        L_0x0034:
            int r1 = r0.f3394m
            if (r1 == r7) goto L_0x0074
            if (r1 != r7) goto L_0x003b
            goto L_0x0072
        L_0x003b:
            r0.f3394m = r7
            r0.s(r7, r6)
            r0.s(r1, r5)
            goto L_0x0072
        L_0x0044:
            float r1 = r10.getX()
            float r4 = r10.getY()
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            boolean r8 = r8.e()
            if (r8 == 0) goto L_0x0062
            com.google.android.material.chip.Chip r8 = com.google.android.material.chip.Chip.this
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r4)
            if (r1 == 0) goto L_0x0062
            r1 = 1
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            int r4 = r0.f3394m
            if (r4 != r1) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            r0.f3394m = r1
            r0.s(r1, r6)
            r0.s(r4, r5)
        L_0x0070:
            if (r1 == r7) goto L_0x0074
        L_0x0072:
            r0 = 1
            goto L_0x0075
        L_0x0074:
            r0 = 0
        L_0x0075:
            if (r0 != 0) goto L_0x007d
            boolean r10 = super.dispatchHoverEvent(r10)
            if (r10 == 0) goto L_0x007e
        L_0x007d:
            r2 = 1
        L_0x007e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f2257u) {
            return super.dispatchKeyEvent(keyEvent);
        }
        b bVar = this.f2256t;
        Objects.requireNonNull(bVar);
        int i2 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i3 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i3 = 33;
                                } else if (keyCode == 21) {
                                    i3 = 17;
                                } else if (keyCode != 22) {
                                    i3 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i4 = 0;
                                while (i2 < repeatCount && bVar.n(i3, (Rect) null)) {
                                    i2++;
                                    i4 = 1;
                                }
                                i2 = i4;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i5 = bVar.f3393l;
                    if (i5 != Integer.MIN_VALUE) {
                        bVar.p(i5, 16, (Bundle) null);
                    }
                    i2 = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i2 = bVar.n(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i2 = bVar.n(1, (Rect) null);
            }
        }
        if (i2 == 0 || this.f2256t.f3393l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        a aVar = this.f2242f;
        int i2 = 0;
        if (aVar != null && a.I(aVar.O)) {
            a aVar2 = this.f2242f;
            int isEnabled = isEnabled();
            if (this.f2251o) {
                isEnabled++;
            }
            if (this.f2250n) {
                isEnabled++;
            }
            if (this.f2249m) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i2 = 1;
            }
            if (this.f2251o) {
                iArr[i2] = 16842908;
                i2++;
            }
            if (this.f2250n) {
                iArr[i2] = 16843623;
                i2++;
            }
            if (this.f2249m) {
                iArr[i2] = 16842919;
                i2++;
            }
            if (isChecked()) {
                iArr[i2] = 16842913;
            }
            i2 = aVar2.e0(iArr);
        }
        if (i2 != 0) {
            invalidate();
        }
    }

    public final boolean e() {
        a aVar = this.f2242f;
        return (aVar == null || aVar.F() == null) ? false : true;
    }

    public boolean f() {
        a aVar = this.f2242f;
        return aVar != null && aVar.T;
    }

    public boolean g() {
        boolean z2 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f2245i;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z2 = true;
        }
        if (this.f2257u) {
            this.f2256t.s(1, 1);
        }
        return z2;
    }

    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f2255s)) {
            return this.f2255s;
        }
        if (!f()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return (!(parent instanceof ChipGroup) || !((ChipGroup) parent).f2266i.f3521d) ? "android.widget.CompoundButton" : "android.widget.RadioButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f2243g;
        return insetDrawable == null ? this.f2242f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.V;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.W;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.B;
        }
        return null;
    }

    public float getChipCornerRadius() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return Math.max(0.0f, aVar.E());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f2242f;
    }

    public float getChipEndPadding() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.f2279g0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        a aVar = this.f2242f;
        if (aVar == null || (drawable = aVar.J) == null) {
            return null;
        }
        return drawable instanceof c ? ((c) drawable).a() : drawable;
    }

    public float getChipIconSize() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.L;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.K;
        }
        return null;
    }

    public float getChipMinHeight() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.C;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.Z;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.E;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.F;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.F();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.S;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.f2278f0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.R;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.f2277e0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.Q;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.F0;
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f2257u) {
            b bVar = this.f2256t;
            if (bVar.f3393l == 1 || bVar.f3392k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public z0.g getHideMotionSpec() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.Y;
        }
        return null;
    }

    public float getIconEndPadding() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.f2274b0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.f2273a0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.G;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        return this.f2242f.f3911b.f3935a;
    }

    public z0.g getShowMotionSpec() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.X;
        }
        return null;
    }

    public float getTextEndPadding() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.f2276d0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        a aVar = this.f2242f;
        if (aVar != null) {
            return aVar.f2275c0;
        }
        return 0.0f;
    }

    public final void h() {
        if (this.f2243g != null) {
            this.f2243g = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            int[] iArr = s1.b.f3881a;
            j();
        }
    }

    public final void i() {
        if (e()) {
            a aVar = this.f2242f;
            if ((aVar != null && aVar.N) && this.f2245i != null) {
                u.u(this, this.f2256t);
                this.f2257u = true;
                return;
            }
        }
        u.u(this, (g0.a) null);
        this.f2257u = false;
    }

    public final void j() {
        this.f2244h = new RippleDrawable(s1.b.a(this.f2242f.G), getBackgroundDrawable(), (Drawable) null);
        this.f2242f.o0(false);
        RippleDrawable rippleDrawable = this.f2244h;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.d.q(this, rippleDrawable);
        k();
    }

    public final void k() {
        a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f2242f) != null) {
            int D = (int) (aVar.D() + aVar.f2279g0 + aVar.f2276d0);
            a aVar2 = this.f2242f;
            int A2 = (int) (aVar2.A() + aVar2.Z + aVar2.f2275c0);
            if (this.f2243g != null) {
                Rect rect = new Rect();
                this.f2243g.getPadding(rect);
                A2 += rect.left;
                D += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.e.k(this, A2, paddingTop, D, paddingBottom);
        }
    }

    public final void l() {
        TextPaint paint = getPaint();
        a aVar = this.f2242f;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        r1.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.f2260x);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.b.l(this, this.f2242f);
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f2241z);
        }
        if (f()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, A);
        }
        return onCreateDrawableState;
    }

    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.f2257u) {
            b bVar = this.f2256t;
            int i3 = bVar.f3393l;
            if (i3 != Integer.MIN_VALUE) {
                bVar.k(i3);
            }
            if (z2) {
                bVar.n(i2, rect);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z2 = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z2 = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z2);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f3559d) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        i4 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i3) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i3)) == this) {
                            break;
                        }
                        i4++;
                    }
                    i3++;
                }
                i2 = i4;
            } else {
                i2 = -1;
            }
            Object tag = getTag(R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) d.c.a(!(tag instanceof Integer) ? -1 : ((Integer) tag).intValue(), 1, i2, 1, false, isChecked()).f3176a);
        }
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.f2253q != i2) {
            this.f2253q = i2;
            k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0049 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f2249m
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f2249m
            if (r0 == 0) goto L_0x0034
            r5.g()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f2255s = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2244h) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f2244h) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.L(z2);
        }
    }

    public void setCheckableResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.L(aVar.f2280h0.getResources().getBoolean(i2));
        }
    }

    public void setChecked(boolean z2) {
        a aVar = this.f2242f;
        if (aVar == null) {
            this.f2248l = z2;
        } else if (aVar.T) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.M(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.M(e.a.b(aVar.f2280h0, i2));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.N(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.N(e.a.a(aVar.f2280h0, i2));
        }
    }

    public void setCheckedIconVisible(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.O(aVar.f2280h0.getResources().getBoolean(i2));
        }
    }

    public void setCheckedIconVisible(boolean z2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.O(z2);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        a aVar = this.f2242f;
        if (aVar != null && aVar.B != colorStateList) {
            aVar.B = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.P(e.a.a(aVar.f2280h0, i2));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.Q(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.Q(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    public void setChipDrawable(a aVar) {
        a aVar2 = this.f2242f;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.E0 = new WeakReference<>((Object) null);
            }
            this.f2242f = aVar;
            aVar.G0 = false;
            Objects.requireNonNull(aVar);
            aVar.E0 = new WeakReference<>(this);
            d(this.f2254r);
        }
    }

    public void setChipEndPadding(float f2) {
        a aVar = this.f2242f;
        if (aVar != null && aVar.f2279g0 != f2) {
            aVar.f2279g0 = f2;
            aVar.invalidateSelf();
            aVar.J();
        }
    }

    public void setChipEndPaddingResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.R(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    public void setChipIcon(Drawable drawable) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.S(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.S(e.a.b(aVar.f2280h0, i2));
        }
    }

    public void setChipIconSize(float f2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.T(f2);
        }
    }

    public void setChipIconSizeResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.T(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.U(colorStateList);
        }
    }

    public void setChipIconTintResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.U(e.a.a(aVar.f2280h0, i2));
        }
    }

    public void setChipIconVisible(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.V(aVar.f2280h0.getResources().getBoolean(i2));
        }
    }

    public void setChipIconVisible(boolean z2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.V(z2);
        }
    }

    public void setChipMinHeight(float f2) {
        a aVar = this.f2242f;
        if (aVar != null && aVar.C != f2) {
            aVar.C = f2;
            aVar.invalidateSelf();
            aVar.J();
        }
    }

    public void setChipMinHeightResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.W(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    public void setChipStartPadding(float f2) {
        a aVar = this.f2242f;
        if (aVar != null && aVar.Z != f2) {
            aVar.Z = f2;
            aVar.invalidateSelf();
            aVar.J();
        }
    }

    public void setChipStartPaddingResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.X(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.Y(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.Y(e.a.a(aVar.f2280h0, i2));
        }
    }

    public void setChipStrokeWidth(float f2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.Z(f2);
        }
    }

    public void setChipStrokeWidthResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.Z(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i2) {
        setText(getResources().getString(i2));
    }

    public void setCloseIcon(Drawable drawable) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.a0(drawable);
        }
        i();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        a aVar = this.f2242f;
        if (aVar != null && aVar.S != charSequence) {
            e0.a c2 = e0.a.c();
            aVar.S = c2.d(charSequence, c2.f2907c, true);
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i2) {
        setCloseIconVisible(i2);
    }

    public void setCloseIconEndPadding(float f2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.b0(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.b0(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.a0(e.a.b(aVar.f2280h0, i2));
        }
        i();
    }

    public void setCloseIconSize(float f2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.c0(f2);
        }
    }

    public void setCloseIconSizeResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.c0(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.d0(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.d0(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.f0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.f0(e.a.a(aVar.f2280h0, i2));
        }
    }

    public void setCloseIconVisible(int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    public void setCloseIconVisible(boolean z2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.g0(z2);
        }
        i();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i4 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i4, i5);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        a aVar = this.f2242f;
        if (aVar != null) {
            g.b bVar = aVar.f3911b;
            if (bVar.f3949o != f2) {
                bVar.f3949o = f2;
                aVar.x();
            }
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f2242f != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                a aVar = this.f2242f;
                if (aVar != null) {
                    aVar.F0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f2252p = z2;
        d(this.f2254r);
    }

    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    public void setHideMotionSpec(z0.g gVar) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.Y = gVar;
        }
    }

    public void setHideMotionSpecResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.Y = z0.g.b(aVar.f2280h0, i2);
        }
    }

    public void setIconEndPadding(float f2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.h0(f2);
        }
    }

    public void setIconEndPaddingResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.h0(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    public void setIconStartPadding(float f2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.i0(f2);
        }
    }

    public void setIconStartPaddingResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.i0(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    public void setInternalOnCheckedChangeListener(i.a<Chip> aVar) {
        this.f2247k = aVar;
    }

    public void setLayoutDirection(int i2) {
        if (this.f2242f != null) {
            super.setLayoutDirection(i2);
        }
    }

    public void setLines(int i2) {
        if (i2 <= 1) {
            super.setLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i2) {
        if (i2 <= 1) {
            super.setMaxLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i2) {
        super.setMaxWidth(i2);
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.H0 = i2;
        }
    }

    public void setMinLines(int i2) {
        if (i2 <= 1) {
            super.setMinLines(i2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f2246j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f2245i = onClickListener;
        i();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.j0(colorStateList);
        }
        if (!this.f2242f.C0) {
            j();
        }
    }

    public void setRippleColorResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.j0(e.a.a(aVar.f2280h0, i2));
            if (!this.f2242f.C0) {
                j();
            }
        }
    }

    public void setShapeAppearanceModel(j jVar) {
        a aVar = this.f2242f;
        aVar.f3911b.f3935a = jVar;
        aVar.invalidateSelf();
    }

    public void setShowMotionSpec(z0.g gVar) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.X = gVar;
        }
    }

    public void setShowMotionSpecResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.X = z0.g.b(aVar.f2280h0, i2);
        }
    }

    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        a aVar = this.f2242f;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(aVar.G0 ? null : charSequence, bufferType);
            a aVar2 = this.f2242f;
            if (aVar2 != null) {
                aVar2.k0(charSequence);
            }
        }
    }

    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.l0(new r1.d(aVar.f2280h0, i2));
        }
        l();
    }

    public void setTextAppearance(r1.d dVar) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.l0(dVar);
        }
        l();
    }

    public void setTextAppearanceResource(int i2) {
        setTextAppearance(getContext(), i2);
    }

    public void setTextEndPadding(float f2) {
        a aVar = this.f2242f;
        if (aVar != null && aVar.f2276d0 != f2) {
            aVar.f2276d0 = f2;
            aVar.invalidateSelf();
            aVar.J();
        }
    }

    public void setTextEndPaddingResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.m0(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    public void setTextStartPadding(float f2) {
        a aVar = this.f2242f;
        if (aVar != null && aVar.f2275c0 != f2) {
            aVar.f2275c0 = f2;
            aVar.invalidateSelf();
            aVar.J();
        }
    }

    public void setTextStartPaddingResource(int i2) {
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.n0(aVar.f2280h0.getResources().getDimension(i2));
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        a aVar = this.f2242f;
        if (aVar != null) {
            aVar.l0(new r1.d(aVar.f2280h0, i2));
        }
        l();
    }
}
