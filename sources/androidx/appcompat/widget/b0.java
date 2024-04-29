package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import c.c;
import g0.u;
import g0.x;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Objects;
import java.util.WeakHashMap;
import y.g;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f509a;

    /* renamed from: b  reason: collision with root package name */
    public z0 f510b;

    /* renamed from: c  reason: collision with root package name */
    public z0 f511c;

    /* renamed from: d  reason: collision with root package name */
    public z0 f512d;

    /* renamed from: e  reason: collision with root package name */
    public z0 f513e;

    /* renamed from: f  reason: collision with root package name */
    public z0 f514f;

    /* renamed from: g  reason: collision with root package name */
    public z0 f515g;

    /* renamed from: h  reason: collision with root package name */
    public z0 f516h;

    /* renamed from: i  reason: collision with root package name */
    public final e0 f517i;

    /* renamed from: j  reason: collision with root package name */
    public int f518j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f519k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f520l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f521m;

    public class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f522a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f523b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f524c;

        public a(int i2, int i3, WeakReference weakReference) {
            this.f522a = i2;
            this.f523b = i3;
            this.f524c = weakReference;
        }

        public void d(int i2) {
        }

        public void e(Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f522a) != -1) {
                typeface = Typeface.create(typeface, i2, (this.f523b & 2) != 0);
            }
            b0 b0Var = b0.this;
            WeakReference weakReference = this.f524c;
            if (b0Var.f521m) {
                b0Var.f520l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    WeakHashMap<View, x> weakHashMap = u.f3063a;
                    if (u.g.b(textView)) {
                        textView.post(new c0(b0Var, textView, typeface, b0Var.f518j));
                    } else {
                        textView.setTypeface(typeface, b0Var.f518j);
                    }
                }
            }
        }
    }

    public b0(TextView textView) {
        this.f509a = textView;
        this.f517i = new e0(textView);
    }

    public static z0 c(Context context, k kVar, int i2) {
        ColorStateList d2 = kVar.d(context, i2);
        if (d2 == null) {
            return null;
        }
        z0 z0Var = new z0();
        z0Var.f833d = true;
        z0Var.f830a = d2;
        return z0Var;
    }

    public final void a(Drawable drawable, z0 z0Var) {
        if (drawable != null && z0Var != null) {
            k.f(drawable, z0Var, this.f509a.getDrawableState());
        }
    }

    public void b() {
        if (!(this.f510b == null && this.f511c == null && this.f512d == null && this.f513e == null)) {
            Drawable[] compoundDrawables = this.f509a.getCompoundDrawables();
            a(compoundDrawables[0], this.f510b);
            a(compoundDrawables[1], this.f511c);
            a(compoundDrawables[2], this.f512d);
            a(compoundDrawables[3], this.f513e);
        }
        if (this.f514f != null || this.f515g != null) {
            Drawable[] compoundDrawablesRelative = this.f509a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f514f);
            a(compoundDrawablesRelative[2], this.f515g);
        }
    }

    public boolean d() {
        e0 e0Var = this.f517i;
        return e0Var.i() && e0Var.f595a != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x042e  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0468  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0476  */
    /* JADX WARNING: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0118  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(android.util.AttributeSet r28, int r29) {
        /*
            r27 = this;
            r0 = r27
            r8 = r28
            r9 = r29
            android.widget.TextView r1 = r0.f509a
            android.content.Context r10 = r1.getContext()
            androidx.appcompat.widget.k r11 = androidx.appcompat.widget.k.a()
            int[] r3 = c.c.f2045h
            r12 = 0
            androidx.appcompat.widget.b1 r13 = androidx.appcompat.widget.b1.q(r10, r8, r3, r9, r12)
            android.widget.TextView r1 = r0.f509a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r13.f527b
            r7 = 0
            r4 = r28
            r6 = r29
            g0.u.t(r1, r2, r3, r4, r5, r6, r7)
            r14 = -1
            int r1 = r13.l(r12, r14)
            r15 = 3
            boolean r2 = r13.o(r15)
            if (r2 == 0) goto L_0x003d
            int r2 = r13.l(r15, r12)
            androidx.appcompat.widget.z0 r2 = c(r10, r11, r2)
            r0.f510b = r2
        L_0x003d:
            r7 = 1
            boolean r2 = r13.o(r7)
            if (r2 == 0) goto L_0x004e
            int r2 = r13.l(r7, r12)
            androidx.appcompat.widget.z0 r2 = c(r10, r11, r2)
            r0.f511c = r2
        L_0x004e:
            r6 = 4
            boolean r2 = r13.o(r6)
            if (r2 == 0) goto L_0x005f
            int r2 = r13.l(r6, r12)
            androidx.appcompat.widget.z0 r2 = c(r10, r11, r2)
            r0.f512d = r2
        L_0x005f:
            r5 = 2
            boolean r2 = r13.o(r5)
            if (r2 == 0) goto L_0x0070
            int r2 = r13.l(r5, r12)
            androidx.appcompat.widget.z0 r2 = c(r10, r11, r2)
            r0.f513e = r2
        L_0x0070:
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 5
            boolean r3 = r13.o(r4)
            if (r3 == 0) goto L_0x0083
            int r3 = r13.l(r4, r12)
            androidx.appcompat.widget.z0 r3 = c(r10, r11, r3)
            r0.f514f = r3
        L_0x0083:
            r3 = 6
            boolean r16 = r13.o(r3)
            if (r16 == 0) goto L_0x0094
            int r5 = r13.l(r3, r12)
            androidx.appcompat.widget.z0 r5 = c(r10, r11, r5)
            r0.f515g = r5
        L_0x0094:
            android.content.res.TypedArray r5 = r13.f527b
            r5.recycle()
            android.widget.TextView r5 = r0.f509a
            android.text.method.TransformationMethod r5 = r5.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            r13 = 23
            r3 = 14
            if (r1 == r14) goto L_0x011d
            int[] r7 = c.c.f2060w
            androidx.appcompat.widget.b1 r14 = new androidx.appcompat.widget.b1
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r1, r7)
            r14.<init>(r10, r1)
            if (r5 != 0) goto L_0x00c1
            boolean r7 = r14.o(r3)
            if (r7 == 0) goto L_0x00c1
            boolean r7 = r14.a(r3, r12)
            r21 = 1
            goto L_0x00c4
        L_0x00c1:
            r7 = 0
            r21 = 0
        L_0x00c4:
            r0.m(r10, r14)
            if (r2 >= r13) goto L_0x00f0
            boolean r22 = r14.o(r15)
            if (r22 == 0) goto L_0x00d4
            android.content.res.ColorStateList r22 = r14.c(r15)
            goto L_0x00d6
        L_0x00d4:
            r22 = 0
        L_0x00d6:
            boolean r23 = r14.o(r6)
            if (r23 == 0) goto L_0x00e1
            android.content.res.ColorStateList r23 = r14.c(r6)
            goto L_0x00e3
        L_0x00e1:
            r23 = 0
        L_0x00e3:
            boolean r24 = r14.o(r4)
            if (r24 == 0) goto L_0x00f4
            android.content.res.ColorStateList r24 = r14.c(r4)
            r4 = 15
            goto L_0x00f8
        L_0x00f0:
            r22 = 0
            r23 = 0
        L_0x00f4:
            r4 = 15
            r24 = 0
        L_0x00f8:
            boolean r20 = r14.o(r4)
            if (r20 == 0) goto L_0x0105
            java.lang.String r25 = r14.m(r4)
            r4 = 26
            goto L_0x0109
        L_0x0105:
            r4 = 26
            r25 = 0
        L_0x0109:
            if (r2 < r4) goto L_0x0118
            r4 = 13
            boolean r19 = r14.o(r4)
            if (r19 == 0) goto L_0x0118
            java.lang.String r14 = r14.m(r4)
            goto L_0x0119
        L_0x0118:
            r14 = 0
        L_0x0119:
            r1.recycle()
            goto L_0x0129
        L_0x011d:
            r7 = 0
            r14 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
        L_0x0129:
            int[] r1 = c.c.f2060w
            androidx.appcompat.widget.b1 r4 = new androidx.appcompat.widget.b1
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r8, r1, r9, r12)
            r4.<init>(r10, r1)
            if (r5 != 0) goto L_0x0142
            boolean r26 = r4.o(r3)
            if (r26 == 0) goto L_0x0142
            boolean r7 = r4.a(r3, r12)
            r21 = 1
        L_0x0142:
            if (r2 >= r13) goto L_0x0163
            boolean r3 = r4.o(r15)
            if (r3 == 0) goto L_0x014e
            android.content.res.ColorStateList r22 = r4.c(r15)
        L_0x014e:
            boolean r3 = r4.o(r6)
            if (r3 == 0) goto L_0x0158
            android.content.res.ColorStateList r23 = r4.c(r6)
        L_0x0158:
            r13 = 5
            boolean r3 = r4.o(r13)
            if (r3 == 0) goto L_0x0163
            android.content.res.ColorStateList r24 = r4.c(r13)
        L_0x0163:
            r3 = r22
            r6 = r23
            r13 = r24
            r15 = 15
            boolean r23 = r4.o(r15)
            if (r23 == 0) goto L_0x0175
            java.lang.String r25 = r4.m(r15)
        L_0x0175:
            r15 = r25
            r12 = 26
            if (r2 < r12) goto L_0x0188
            r12 = 13
            boolean r19 = r4.o(r12)
            if (r19 == 0) goto L_0x018a
            java.lang.String r14 = r4.m(r12)
            goto L_0x018a
        L_0x0188:
            r12 = 13
        L_0x018a:
            r12 = 28
            if (r2 < r12) goto L_0x01a5
            r12 = 0
            boolean r18 = r4.o(r12)
            if (r18 == 0) goto L_0x01a5
            r24 = r11
            r11 = -1
            int r18 = r4.f(r12, r11)
            if (r18 != 0) goto L_0x01a7
            android.widget.TextView r11 = r0.f509a
            r8 = 0
            r11.setTextSize(r12, r8)
            goto L_0x01a7
        L_0x01a5:
            r24 = r11
        L_0x01a7:
            r0.m(r10, r4)
            r1.recycle()
            if (r3 == 0) goto L_0x01b4
            android.widget.TextView r1 = r0.f509a
            r1.setTextColor(r3)
        L_0x01b4:
            if (r6 == 0) goto L_0x01bb
            android.widget.TextView r1 = r0.f509a
            r1.setHintTextColor(r6)
        L_0x01bb:
            if (r13 == 0) goto L_0x01c2
            android.widget.TextView r1 = r0.f509a
            r1.setLinkTextColor(r13)
        L_0x01c2:
            if (r5 != 0) goto L_0x01cb
            if (r21 == 0) goto L_0x01cb
            android.widget.TextView r1 = r0.f509a
            r1.setAllCaps(r7)
        L_0x01cb:
            android.graphics.Typeface r1 = r0.f520l
            if (r1 == 0) goto L_0x01e1
            int r3 = r0.f519k
            r4 = -1
            if (r3 != r4) goto L_0x01dc
            android.widget.TextView r3 = r0.f509a
            int r4 = r0.f518j
            r3.setTypeface(r1, r4)
            goto L_0x01e1
        L_0x01dc:
            android.widget.TextView r3 = r0.f509a
            r3.setTypeface(r1)
        L_0x01e1:
            if (r14 == 0) goto L_0x01e8
            android.widget.TextView r1 = r0.f509a
            r1.setFontVariationSettings(r14)
        L_0x01e8:
            r8 = 24
            if (r15 == 0) goto L_0x020d
            if (r2 < r8) goto L_0x01f8
            android.widget.TextView r1 = r0.f509a
            android.os.LocaleList r2 = android.os.LocaleList.forLanguageTags(r15)
            r1.setTextLocales(r2)
            goto L_0x020d
        L_0x01f8:
            r1 = 44
            int r1 = r15.indexOf(r1)
            r2 = 0
            java.lang.String r1 = r15.substring(r2, r1)
            android.widget.TextView r3 = r0.f509a
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r1)
            r3.setTextLocale(r1)
            goto L_0x020e
        L_0x020d:
            r2 = 0
        L_0x020e:
            androidx.appcompat.widget.e0 r11 = r0.f517i
            android.content.Context r1 = r11.f604j
            int[] r3 = c.c.f2046i
            r12 = r28
            android.content.res.TypedArray r13 = r1.obtainStyledAttributes(r12, r3, r9, r2)
            android.widget.TextView r1 = r11.f603i
            android.content.Context r2 = r1.getContext()
            r7 = 0
            r14 = 6
            r15 = 5
            r4 = r28
            r6 = 2
            r5 = r13
            r8 = 2
            r14 = 4
            r6 = r29
            r9 = 1
            g0.u.t(r1, r2, r3, r4, r5, r6, r7)
            boolean r1 = r13.hasValue(r15)
            if (r1 == 0) goto L_0x023c
            r1 = 0
            int r2 = r13.getInt(r15, r1)
            r11.f595a = r2
        L_0x023c:
            boolean r1 = r13.hasValue(r14)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == 0) goto L_0x0249
            float r1 = r13.getDimension(r14, r2)
            goto L_0x024b
        L_0x0249:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x024b:
            boolean r3 = r13.hasValue(r8)
            if (r3 == 0) goto L_0x0256
            float r3 = r13.getDimension(r8, r2)
            goto L_0x0258
        L_0x0256:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0258:
            boolean r4 = r13.hasValue(r9)
            if (r4 == 0) goto L_0x0263
            float r4 = r13.getDimension(r9, r2)
            goto L_0x0265
        L_0x0263:
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0265:
            r5 = 3
            boolean r6 = r13.hasValue(r5)
            if (r6 == 0) goto L_0x029c
            r6 = 0
            int r7 = r13.getResourceId(r5, r6)
            if (r7 <= 0) goto L_0x029c
            android.content.res.Resources r5 = r13.getResources()
            android.content.res.TypedArray r5 = r5.obtainTypedArray(r7)
            int r6 = r5.length()
            int[] r7 = new int[r6]
            if (r6 <= 0) goto L_0x0299
            r14 = 0
        L_0x0284:
            if (r14 >= r6) goto L_0x0290
            r15 = -1
            int r17 = r5.getDimensionPixelSize(r14, r15)
            r7[r14] = r17
            int r14 = r14 + 1
            goto L_0x0284
        L_0x0290:
            int[] r6 = r11.b(r7)
            r11.f600f = r6
            r11.h()
        L_0x0299:
            r5.recycle()
        L_0x029c:
            r13.recycle()
            boolean r5 = r11.i()
            if (r5 == 0) goto L_0x02d8
            int r5 = r11.f595a
            if (r5 != r9) goto L_0x02db
            boolean r5 = r11.f601g
            if (r5 != 0) goto L_0x02d4
            android.content.Context r5 = r11.f604j
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r6 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x02c1
            r3 = 1094713344(0x41400000, float:12.0)
            float r3 = android.util.TypedValue.applyDimension(r8, r3, r5)
        L_0x02c1:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x02cb
            r4 = 1121976320(0x42e00000, float:112.0)
            float r4 = android.util.TypedValue.applyDimension(r8, r4, r5)
        L_0x02cb:
            int r5 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x02d1
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x02d1:
            r11.j(r3, r4, r1)
        L_0x02d4:
            r11.g()
            goto L_0x02db
        L_0x02d8:
            r1 = 0
            r11.f595a = r1
        L_0x02db:
            boolean r1 = j0.b.f3262a
            if (r1 == 0) goto L_0x031a
            androidx.appcompat.widget.e0 r1 = r0.f517i
            int r3 = r1.f595a
            if (r3 == 0) goto L_0x031a
            int[] r1 = r1.f600f
            int r3 = r1.length
            if (r3 <= 0) goto L_0x031a
            android.widget.TextView r3 = r0.f509a
            int r3 = r3.getAutoSizeStepGranularity()
            float r3 = (float) r3
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0314
            android.widget.TextView r1 = r0.f509a
            androidx.appcompat.widget.e0 r2 = r0.f517i
            float r2 = r2.f598d
            int r2 = java.lang.Math.round(r2)
            androidx.appcompat.widget.e0 r3 = r0.f517i
            float r3 = r3.f599e
            int r3 = java.lang.Math.round(r3)
            androidx.appcompat.widget.e0 r4 = r0.f517i
            float r4 = r4.f597c
            int r4 = java.lang.Math.round(r4)
            r5 = 0
            r1.setAutoSizeTextTypeUniformWithConfiguration(r2, r3, r4, r5)
            goto L_0x031a
        L_0x0314:
            r5 = 0
            android.widget.TextView r2 = r0.f509a
            r2.setAutoSizeTextTypeUniformWithPresetSizes(r1, r5)
        L_0x031a:
            int[] r1 = c.c.f2046i
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r12, r1)
            r2 = 8
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            if (r2 == r3) goto L_0x0332
            r4 = r24
            android.graphics.drawable.Drawable r7 = r4.b(r10, r2)
            r2 = 13
            goto L_0x0337
        L_0x0332:
            r4 = r24
            r2 = 13
            r7 = 0
        L_0x0337:
            int r2 = r1.getResourceId(r2, r3)
            if (r2 == r3) goto L_0x0342
            android.graphics.drawable.Drawable r2 = r4.b(r10, r2)
            goto L_0x0343
        L_0x0342:
            r2 = 0
        L_0x0343:
            r5 = 9
            int r5 = r1.getResourceId(r5, r3)
            if (r5 == r3) goto L_0x0350
            android.graphics.drawable.Drawable r5 = r4.b(r10, r5)
            goto L_0x0351
        L_0x0350:
            r5 = 0
        L_0x0351:
            r6 = 6
            int r6 = r1.getResourceId(r6, r3)
            if (r6 == r3) goto L_0x035d
            android.graphics.drawable.Drawable r6 = r4.b(r10, r6)
            goto L_0x035e
        L_0x035d:
            r6 = 0
        L_0x035e:
            r11 = 10
            int r11 = r1.getResourceId(r11, r3)
            if (r11 == r3) goto L_0x036b
            android.graphics.drawable.Drawable r11 = r4.b(r10, r11)
            goto L_0x036c
        L_0x036b:
            r11 = 0
        L_0x036c:
            r12 = 7
            int r12 = r1.getResourceId(r12, r3)
            if (r12 == r3) goto L_0x0378
            android.graphics.drawable.Drawable r3 = r4.b(r10, r12)
            goto L_0x0379
        L_0x0378:
            r3 = 0
        L_0x0379:
            if (r11 != 0) goto L_0x03cd
            if (r3 == 0) goto L_0x037e
            goto L_0x03cd
        L_0x037e:
            if (r7 != 0) goto L_0x0386
            if (r2 != 0) goto L_0x0386
            if (r5 != 0) goto L_0x0386
            if (r6 == 0) goto L_0x03ee
        L_0x0386:
            android.widget.TextView r3 = r0.f509a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawablesRelative()
            r4 = 0
            r11 = r3[r4]
            if (r11 != 0) goto L_0x03b7
            r11 = r3[r8]
            if (r11 == 0) goto L_0x0396
            goto L_0x03b7
        L_0x0396:
            android.widget.TextView r3 = r0.f509a
            android.graphics.drawable.Drawable[] r3 = r3.getCompoundDrawables()
            android.widget.TextView r11 = r0.f509a
            if (r7 == 0) goto L_0x03a1
            goto L_0x03a3
        L_0x03a1:
            r7 = r3[r4]
        L_0x03a3:
            if (r2 == 0) goto L_0x03a6
            goto L_0x03a8
        L_0x03a6:
            r2 = r3[r9]
        L_0x03a8:
            if (r5 == 0) goto L_0x03ab
            goto L_0x03ad
        L_0x03ab:
            r5 = r3[r8]
        L_0x03ad:
            if (r6 == 0) goto L_0x03b0
            goto L_0x03b3
        L_0x03b0:
            r4 = 3
            r6 = r3[r4]
        L_0x03b3:
            r11.setCompoundDrawablesWithIntrinsicBounds(r7, r2, r5, r6)
            goto L_0x03ee
        L_0x03b7:
            android.widget.TextView r4 = r0.f509a
            r5 = 0
            r7 = r3[r5]
            if (r2 == 0) goto L_0x03bf
            goto L_0x03c1
        L_0x03bf:
            r2 = r3[r9]
        L_0x03c1:
            r5 = r3[r8]
            if (r6 == 0) goto L_0x03c6
            goto L_0x03c9
        L_0x03c6:
            r6 = 3
            r6 = r3[r6]
        L_0x03c9:
            r4.setCompoundDrawablesRelativeWithIntrinsicBounds(r7, r2, r5, r6)
            goto L_0x03ee
        L_0x03cd:
            android.widget.TextView r4 = r0.f509a
            android.graphics.drawable.Drawable[] r4 = r4.getCompoundDrawablesRelative()
            android.widget.TextView r5 = r0.f509a
            if (r11 == 0) goto L_0x03d8
            goto L_0x03db
        L_0x03d8:
            r7 = 0
            r11 = r4[r7]
        L_0x03db:
            if (r2 == 0) goto L_0x03de
            goto L_0x03e0
        L_0x03de:
            r2 = r4[r9]
        L_0x03e0:
            if (r3 == 0) goto L_0x03e3
            goto L_0x03e5
        L_0x03e3:
            r3 = r4[r8]
        L_0x03e5:
            if (r6 == 0) goto L_0x03e8
            goto L_0x03eb
        L_0x03e8:
            r6 = 3
            r6 = r4[r6]
        L_0x03eb:
            r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r11, r2, r3, r6)
        L_0x03ee:
            r2 = 11
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0426
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x040a
            r3 = 0
            int r3 = r1.getResourceId(r2, r3)
            if (r3 == 0) goto L_0x040a
            android.content.res.ColorStateList r3 = e.a.a(r10, r3)
            if (r3 == 0) goto L_0x040a
            goto L_0x040e
        L_0x040a:
            android.content.res.ColorStateList r3 = r1.getColorStateList(r2)
        L_0x040e:
            android.widget.TextView r2 = r0.f509a
            java.util.Objects.requireNonNull(r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L_0x041d
            r2.setCompoundDrawableTintList(r3)
            goto L_0x0426
        L_0x041d:
            boolean r4 = r2 instanceof j0.i
            if (r4 == 0) goto L_0x0426
            j0.i r2 = (j0.i) r2
            r2.setSupportCompoundDrawablesTintList(r3)
        L_0x0426:
            r2 = 12
            boolean r3 = r1.hasValue(r2)
            if (r3 == 0) goto L_0x0450
            r3 = -1
            int r2 = r1.getInt(r2, r3)
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.i0.d(r2, r3)
            android.widget.TextView r3 = r0.f509a
            java.util.Objects.requireNonNull(r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 24
            if (r4 < r5) goto L_0x0447
            r3.setCompoundDrawableTintMode(r2)
            goto L_0x0450
        L_0x0447:
            boolean r4 = r3 instanceof j0.i
            if (r4 == 0) goto L_0x0450
            j0.i r3 = (j0.i) r3
            r3.setSupportCompoundDrawablesTintMode(r2)
        L_0x0450:
            r2 = 15
            r3 = -1
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r4 = 18
            int r4 = r1.getDimensionPixelSize(r4, r3)
            r5 = 19
            int r5 = r1.getDimensionPixelSize(r5, r3)
            r1.recycle()
            if (r2 == r3) goto L_0x046d
            android.widget.TextView r1 = r0.f509a
            j0.g.b(r1, r2)
        L_0x046d:
            if (r4 == r3) goto L_0x0474
            android.widget.TextView r1 = r0.f509a
            j0.g.c(r1, r4)
        L_0x0474:
            if (r5 == r3) goto L_0x047b
            android.widget.TextView r1 = r0.f509a
            j0.g.d(r1, r5)
        L_0x047b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b0.e(android.util.AttributeSet, int):void");
    }

    public void f(Context context, int i2) {
        String m2;
        ColorStateList c2;
        ColorStateList c3;
        ColorStateList c4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, c.f2060w);
        b1 b1Var = new b1(context, obtainStyledAttributes);
        if (b1Var.o(14)) {
            this.f509a.setAllCaps(b1Var.a(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            if (b1Var.o(3) && (c4 = b1Var.c(3)) != null) {
                this.f509a.setTextColor(c4);
            }
            if (b1Var.o(5) && (c3 = b1Var.c(5)) != null) {
                this.f509a.setLinkTextColor(c3);
            }
            if (b1Var.o(4) && (c2 = b1Var.c(4)) != null) {
                this.f509a.setHintTextColor(c2);
            }
        }
        if (b1Var.o(0) && b1Var.f(0, -1) == 0) {
            this.f509a.setTextSize(0, 0.0f);
        }
        m(context, b1Var);
        if (i3 >= 26 && b1Var.o(13) && (m2 = b1Var.m(13)) != null) {
            this.f509a.setFontVariationSettings(m2);
        }
        obtainStyledAttributes.recycle();
        Typeface typeface = this.f520l;
        if (typeface != null) {
            this.f509a.setTypeface(typeface, this.f518j);
        }
    }

    public void g(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i2 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            Objects.requireNonNull(text);
            if (i2 >= 30) {
                editorInfo.setInitialSurroundingSubText(text, 0);
                return;
            }
            int i3 = editorInfo.initialSelStart;
            int i4 = editorInfo.initialSelEnd;
            int i5 = i3 > i4 ? i4 + 0 : i3 + 0;
            int i6 = i3 > i4 ? i3 - 0 : i4 + 0;
            int length = text.length();
            if (i5 >= 0 && i6 <= length) {
                int i7 = editorInfo.inputType & 4095;
                if (!(i7 == 129 || i7 == 225 || i7 == 18)) {
                    if (length <= 2048) {
                        i0.a.b(editorInfo, text, i5, i6);
                        return;
                    }
                    int i8 = i6 - i5;
                    int i9 = i8 > 1024 ? 0 : i8;
                    int i10 = 2048 - i9;
                    int min = Math.min(text.length() - i6, i10 - Math.min(i5, (int) (((double) i10) * 0.8d)));
                    int min2 = Math.min(i5, i10 - min);
                    int i11 = i5 - min2;
                    if (i0.a.a(text, i11, 0)) {
                        i11++;
                        min2--;
                    }
                    if (i0.a.a(text, (i6 + min) - 1, 1)) {
                        min--;
                    }
                    CharSequence concat = i9 != i8 ? TextUtils.concat(new CharSequence[]{text.subSequence(i11, i11 + min2), text.subSequence(i6, min + i6)}) : text.subSequence(i11, min2 + i9 + min + i11);
                    int i12 = min2 + 0;
                    i0.a.b(editorInfo, concat, i12, i9 + i12);
                    return;
                }
            }
            i0.a.b(editorInfo, (CharSequence) null, 0, 0);
        }
    }

    public void h(int i2, int i3, int i4, int i5) {
        e0 e0Var = this.f517i;
        if (e0Var.i()) {
            DisplayMetrics displayMetrics = e0Var.f604j.getResources().getDisplayMetrics();
            e0Var.j(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (e0Var.g()) {
                e0Var.a();
            }
        }
    }

    public void i(int[] iArr, int i2) {
        e0 e0Var = this.f517i;
        if (e0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = e0Var.f604j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                e0Var.f600f = e0Var.b(iArr2);
                if (!e0Var.h()) {
                    StringBuilder a2 = androidx.activity.result.a.a("None of the preset sizes is valid: ");
                    a2.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(a2.toString());
                }
            } else {
                e0Var.f601g = false;
            }
            if (e0Var.g()) {
                e0Var.a();
            }
        }
    }

    public void j(int i2) {
        e0 e0Var = this.f517i;
        if (!e0Var.i()) {
            return;
        }
        if (i2 == 0) {
            e0Var.f595a = 0;
            e0Var.f598d = -1.0f;
            e0Var.f599e = -1.0f;
            e0Var.f597c = -1.0f;
            e0Var.f600f = new int[0];
            e0Var.f596b = false;
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = e0Var.f604j.getResources().getDisplayMetrics();
            e0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (e0Var.g()) {
                e0Var.a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i2);
        }
    }

    public void k(ColorStateList colorStateList) {
        if (this.f516h == null) {
            this.f516h = new z0();
        }
        z0 z0Var = this.f516h;
        z0Var.f830a = colorStateList;
        z0Var.f833d = colorStateList != null;
        this.f510b = z0Var;
        this.f511c = z0Var;
        this.f512d = z0Var;
        this.f513e = z0Var;
        this.f514f = z0Var;
        this.f515g = z0Var;
    }

    public void l(PorterDuff.Mode mode) {
        if (this.f516h == null) {
            this.f516h = new z0();
        }
        z0 z0Var = this.f516h;
        z0Var.f831b = mode;
        z0Var.f832c = mode != null;
        this.f510b = z0Var;
        this.f511c = z0Var;
        this.f512d = z0Var;
        this.f513e = z0Var;
        this.f514f = z0Var;
        this.f515g = z0Var;
    }

    public final void m(Context context, b1 b1Var) {
        String m2;
        Typeface typeface;
        Typeface typeface2;
        this.f518j = b1Var.j(2, this.f518j);
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i2 >= 28) {
            int j2 = b1Var.j(11, -1);
            this.f519k = j2;
            if (j2 != -1) {
                this.f518j = (this.f518j & 2) | 0;
            }
        }
        int i3 = 10;
        if (b1Var.o(10) || b1Var.o(12)) {
            this.f520l = null;
            if (b1Var.o(12)) {
                i3 = 12;
            }
            int i4 = this.f519k;
            int i5 = this.f518j;
            if (!context.isRestricted()) {
                try {
                    Typeface i6 = b1Var.i(i3, this.f518j, new a(i4, i5, new WeakReference(this.f509a)));
                    if (i6 != null) {
                        if (i2 >= 28 && this.f519k != -1) {
                            i6 = Typeface.create(Typeface.create(i6, 0), this.f519k, (this.f518j & 2) != 0);
                        }
                        this.f520l = i6;
                    }
                    this.f521m = this.f520l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f520l == null && (m2 = b1Var.m(i3)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f519k == -1) {
                    typeface = Typeface.create(m2, this.f518j);
                } else {
                    Typeface create = Typeface.create(m2, 0);
                    int i7 = this.f519k;
                    if ((this.f518j & 2) != 0) {
                        z2 = true;
                    }
                    typeface = Typeface.create(create, i7, z2);
                }
                this.f520l = typeface;
            }
        } else if (b1Var.o(1)) {
            this.f521m = false;
            int j3 = b1Var.j(1, 1);
            if (j3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (j3 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (j3 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f520l = typeface2;
        }
    }
}
