package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.i0;
import com.example.supermarket.R;
import com.google.android.material.internal.CheckableImageButton;
import g0.u;
import g0.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import o1.s;
import u1.j;
import w1.k;
import w1.l;
import w1.m;
import w1.n;
import w1.r;

public class TextInputLayout extends LinearLayout {
    public ColorStateList A;
    public int A0;
    public CharSequence B;
    public int B0;
    public final TextView C;
    public boolean C0;
    public boolean D;
    public final o1.e D0;
    public CharSequence E;
    public boolean E0;
    public boolean F;
    public boolean F0;
    public u1.g G;
    public ValueAnimator G0;
    public u1.g H;
    public boolean H0;
    public u1.g I;
    public boolean I0;
    public j J;
    public boolean K;
    public final int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public final Rect T = new Rect();
    public final Rect U = new Rect();
    public final RectF V = new RectF();
    public Typeface W;

    /* renamed from: a0  reason: collision with root package name */
    public Drawable f2514a0;

    /* renamed from: b  reason: collision with root package name */
    public final FrameLayout f2515b;

    /* renamed from: b0  reason: collision with root package name */
    public int f2516b0;

    /* renamed from: c  reason: collision with root package name */
    public final r f2517c;

    /* renamed from: c0  reason: collision with root package name */
    public final LinkedHashSet<f> f2518c0 = new LinkedHashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public final LinearLayout f2519d;

    /* renamed from: d0  reason: collision with root package name */
    public int f2520d0 = 0;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f2521e;

    /* renamed from: e0  reason: collision with root package name */
    public final SparseArray<k> f2522e0;

    /* renamed from: f  reason: collision with root package name */
    public EditText f2523f;

    /* renamed from: f0  reason: collision with root package name */
    public final CheckableImageButton f2524f0;

    /* renamed from: g  reason: collision with root package name */
    public CharSequence f2525g;

    /* renamed from: g0  reason: collision with root package name */
    public final LinkedHashSet<g> f2526g0;

    /* renamed from: h  reason: collision with root package name */
    public int f2527h = -1;

    /* renamed from: h0  reason: collision with root package name */
    public ColorStateList f2528h0;

    /* renamed from: i  reason: collision with root package name */
    public int f2529i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public PorterDuff.Mode f2530i0;

    /* renamed from: j  reason: collision with root package name */
    public int f2531j = -1;

    /* renamed from: j0  reason: collision with root package name */
    public Drawable f2532j0;

    /* renamed from: k  reason: collision with root package name */
    public int f2533k = -1;

    /* renamed from: k0  reason: collision with root package name */
    public int f2534k0;

    /* renamed from: l  reason: collision with root package name */
    public final m f2535l = new m(this);

    /* renamed from: l0  reason: collision with root package name */
    public Drawable f2536l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2537m;

    /* renamed from: m0  reason: collision with root package name */
    public View.OnLongClickListener f2538m0;

    /* renamed from: n  reason: collision with root package name */
    public int f2539n;

    /* renamed from: n0  reason: collision with root package name */
    public View.OnLongClickListener f2540n0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2541o;

    /* renamed from: o0  reason: collision with root package name */
    public final CheckableImageButton f2542o0;

    /* renamed from: p  reason: collision with root package name */
    public TextView f2543p;

    /* renamed from: p0  reason: collision with root package name */
    public ColorStateList f2544p0;

    /* renamed from: q  reason: collision with root package name */
    public int f2545q;

    /* renamed from: q0  reason: collision with root package name */
    public PorterDuff.Mode f2546q0;

    /* renamed from: r  reason: collision with root package name */
    public int f2547r;

    /* renamed from: r0  reason: collision with root package name */
    public ColorStateList f2548r0;

    /* renamed from: s  reason: collision with root package name */
    public CharSequence f2549s;

    /* renamed from: s0  reason: collision with root package name */
    public ColorStateList f2550s0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2551t;

    /* renamed from: t0  reason: collision with root package name */
    public int f2552t0;

    /* renamed from: u  reason: collision with root package name */
    public TextView f2553u;

    /* renamed from: u0  reason: collision with root package name */
    public int f2554u0;

    /* renamed from: v  reason: collision with root package name */
    public ColorStateList f2555v;

    /* renamed from: v0  reason: collision with root package name */
    public int f2556v0;

    /* renamed from: w  reason: collision with root package name */
    public int f2557w;

    /* renamed from: w0  reason: collision with root package name */
    public ColorStateList f2558w0;

    /* renamed from: x  reason: collision with root package name */
    public v0.c f2559x;

    /* renamed from: x0  reason: collision with root package name */
    public int f2560x0;

    /* renamed from: y  reason: collision with root package name */
    public v0.c f2561y;

    /* renamed from: y0  reason: collision with root package name */
    public int f2562y0;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f2563z;

    /* renamed from: z0  reason: collision with root package name */
    public int f2564z0;

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.z(!textInputLayout.I0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f2537m) {
                textInputLayout2.s(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.f2551t) {
                textInputLayout3.A(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            TextInputLayout.this.f2524f0.performClick();
            TextInputLayout.this.f2524f0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            TextInputLayout.this.f2523f.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.D0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends g0.a {

        /* renamed from: d  reason: collision with root package name */
        public final TextInputLayout f2569d;

        public e(TextInputLayout textInputLayout) {
            this.f2569d = textInputLayout;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
            if (r2 != null) goto L_0x00a6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d(android.view.View r14, h0.d r15) {
            /*
                r13 = this;
                android.view.View$AccessibilityDelegate r0 = r13.f2994a
                android.view.accessibility.AccessibilityNodeInfo r1 = r15.f3160a
                r0.onInitializeAccessibilityNodeInfo(r14, r1)
                com.google.android.material.textfield.TextInputLayout r14 = r13.f2569d
                android.widget.EditText r14 = r14.getEditText()
                if (r14 == 0) goto L_0x0014
                android.text.Editable r14 = r14.getText()
                goto L_0x0015
            L_0x0014:
                r14 = 0
            L_0x0015:
                com.google.android.material.textfield.TextInputLayout r0 = r13.f2569d
                java.lang.CharSequence r0 = r0.getHint()
                com.google.android.material.textfield.TextInputLayout r1 = r13.f2569d
                java.lang.CharSequence r1 = r1.getError()
                com.google.android.material.textfield.TextInputLayout r2 = r13.f2569d
                java.lang.CharSequence r2 = r2.getPlaceholderText()
                com.google.android.material.textfield.TextInputLayout r3 = r13.f2569d
                int r3 = r3.getCounterMaxLength()
                com.google.android.material.textfield.TextInputLayout r4 = r13.f2569d
                java.lang.CharSequence r4 = r4.getCounterOverflowDescription()
                boolean r5 = android.text.TextUtils.isEmpty(r14)
                r6 = 1
                r5 = r5 ^ r6
                boolean r7 = android.text.TextUtils.isEmpty(r0)
                r7 = r7 ^ r6
                com.google.android.material.textfield.TextInputLayout r8 = r13.f2569d
                boolean r8 = r8.C0
                r8 = r8 ^ r6
                boolean r9 = android.text.TextUtils.isEmpty(r1)
                r9 = r9 ^ r6
                if (r9 != 0) goto L_0x0053
                boolean r10 = android.text.TextUtils.isEmpty(r4)
                if (r10 != 0) goto L_0x0051
                goto L_0x0053
            L_0x0051:
                r10 = 0
                goto L_0x0054
            L_0x0053:
                r10 = 1
            L_0x0054:
                if (r7 == 0) goto L_0x005b
                java.lang.String r0 = r0.toString()
                goto L_0x005d
            L_0x005b:
                java.lang.String r0 = ""
            L_0x005d:
                com.google.android.material.textfield.TextInputLayout r7 = r13.f2569d
                w1.r r7 = r7.f2517c
                android.widget.TextView r11 = r7.f4291c
                int r11 = r11.getVisibility()
                if (r11 != 0) goto L_0x0073
                android.widget.TextView r11 = r7.f4291c
                android.view.accessibility.AccessibilityNodeInfo r12 = r15.f3160a
                r12.setLabelFor(r11)
                android.widget.TextView r7 = r7.f4291c
                goto L_0x0075
            L_0x0073:
                com.google.android.material.internal.CheckableImageButton r7 = r7.f4293e
            L_0x0075:
                r15.l(r7)
                java.lang.String r7 = ", "
                if (r5 == 0) goto L_0x0082
                android.view.accessibility.AccessibilityNodeInfo r2 = r15.f3160a
                r2.setText(r14)
                goto L_0x00ab
            L_0x0082:
                boolean r11 = android.text.TextUtils.isEmpty(r0)
                if (r11 != 0) goto L_0x00a4
                android.view.accessibility.AccessibilityNodeInfo r11 = r15.f3160a
                r11.setText(r0)
                if (r8 == 0) goto L_0x00ab
                if (r2 == 0) goto L_0x00ab
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                r8.append(r0)
                r8.append(r7)
                r8.append(r2)
                java.lang.String r2 = r8.toString()
                goto L_0x00a6
            L_0x00a4:
                if (r2 == 0) goto L_0x00ab
            L_0x00a6:
                android.view.accessibility.AccessibilityNodeInfo r8 = r15.f3160a
                r8.setText(r2)
            L_0x00ab:
                boolean r2 = android.text.TextUtils.isEmpty(r0)
                if (r2 != 0) goto L_0x00e2
                int r2 = android.os.Build.VERSION.SDK_INT
                r8 = 26
                if (r2 < r8) goto L_0x00bb
                r15.k(r0)
                goto L_0x00d4
            L_0x00bb:
                if (r5 == 0) goto L_0x00cf
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                r11.append(r14)
                r11.append(r7)
                r11.append(r0)
                java.lang.String r0 = r11.toString()
            L_0x00cf:
                android.view.accessibility.AccessibilityNodeInfo r7 = r15.f3160a
                r7.setText(r0)
            L_0x00d4:
                r0 = r5 ^ 1
                if (r2 < r8) goto L_0x00de
                android.view.accessibility.AccessibilityNodeInfo r2 = r15.f3160a
                r2.setShowingHintText(r0)
                goto L_0x00e2
            L_0x00de:
                r2 = 4
                r15.h(r2, r0)
            L_0x00e2:
                if (r14 == 0) goto L_0x00eb
                int r14 = r14.length()
                if (r14 != r3) goto L_0x00eb
                goto L_0x00ec
            L_0x00eb:
                r3 = -1
            L_0x00ec:
                android.view.accessibility.AccessibilityNodeInfo r14 = r15.f3160a
                r14.setMaxTextLength(r3)
                if (r10 == 0) goto L_0x00fc
                if (r9 == 0) goto L_0x00f6
                goto L_0x00f7
            L_0x00f6:
                r1 = r4
            L_0x00f7:
                android.view.accessibility.AccessibilityNodeInfo r14 = r15.f3160a
                r14.setError(r1)
            L_0x00fc:
                com.google.android.material.textfield.TextInputLayout r14 = r13.f2569d
                w1.m r14 = r14.f2535l
                android.widget.TextView r14 = r14.f4275r
                if (r14 == 0) goto L_0x0109
                android.view.accessibility.AccessibilityNodeInfo r15 = r15.f3160a
                r15.setLabelFor(r14)
            L_0x0109:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.e.d(android.view.View, h0.d):void");
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i2);
    }

    public static class h extends l0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f2570d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2571e;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f2572f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f2573g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f2574h;

        public class a implements Parcelable.ClassLoaderCreator<h> {
            public Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i2) {
                return new h[i2];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2570d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f2571e = parcel.readInt() != 1 ? false : true;
            this.f2572f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f2573g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f2574h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = androidx.activity.result.a.a("TextInputLayout.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" error=");
            a2.append(this.f2570d);
            a2.append(" hint=");
            a2.append(this.f2572f);
            a2.append(" helperText=");
            a2.append(this.f2573g);
            a2.append(" placeholderText=");
            a2.append(this.f2574h);
            a2.append("}");
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3321b, i2);
            TextUtils.writeToParcel(this.f2570d, parcel, i2);
            parcel.writeInt(this.f2571e ? 1 : 0);
            TextUtils.writeToParcel(this.f2572f, parcel, i2);
            TextUtils.writeToParcel(this.f2573g, parcel, i2);
            TextUtils.writeToParcel(this.f2574h, parcel, i2);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r30, android.util.AttributeSet r31) {
        /*
            r29 = this;
            r0 = r29
            r7 = r31
            r8 = 2130904038(0x7f0303e6, float:1.741491E38)
            r9 = 2131755799(0x7f100317, float:1.9142487E38)
            r1 = r30
            android.content.Context r1 = x1.a.a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f2527h = r10
            r0.f2529i = r10
            r0.f2531j = r10
            r0.f2533k = r10
            w1.m r1 = new w1.m
            r1.<init>(r0)
            r0.f2535l = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.T = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.U = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.V = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f2518c0 = r1
            r11 = 0
            r0.f2520d0 = r11
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r0.f2522e0 = r12
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f2526g0 = r1
            o1.e r1 = new o1.e
            r1.<init>(r0)
            r0.D0 = r1
            android.content.Context r13 = r29.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r15 = new android.widget.FrameLayout
            r15.<init>(r13)
            r0.f2515b = r15
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r13)
            r0.f2521e = r6
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r0.f2519d = r5
            androidx.appcompat.widget.d0 r4 = new androidx.appcompat.widget.d0
            r3 = 0
            r4.<init>(r13, r3)
            r0.C = r4
            r2 = 8
            r5.setVisibility(r2)
            r6.setVisibility(r2)
            r4.setVisibility(r2)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r13)
            r3 = 2131427371(0x7f0b002b, float:1.8476356E38)
            android.view.View r17 = r2.inflate(r3, r5, r11)
            r18 = r4
            r4 = r17
            com.google.android.material.internal.CheckableImageButton r4 = (com.google.android.material.internal.CheckableImageButton) r4
            r0.f2542o0 = r4
            android.view.View r2 = r2.inflate(r3, r6, r11)
            r3 = r2
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r0.f2524f0 = r3
            r15.setAddStatesFromChildren(r14)
            r5.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r14 = 8388613(0x800005, float:1.175495E-38)
            r19 = r4
            r4 = -2
            r2.<init>(r4, r10, r14)
            r5.setLayoutParams(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r4, r10)
            r6.setLayoutParams(r2)
            android.animation.TimeInterpolator r2 = z0.a.f4419a
            r1.Q = r2
            r1.k(r11)
            r1.P = r2
            r1.k(r11)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.n(r2)
            int[] r14 = y0.a.B
            r2 = 5
            int[] r1 = new int[r2]
            r1 = {22, 20, 35, 40, 44} // fill-array
            o1.n.a(r13, r7, r8, r9)
            r20 = 2131755799(0x7f100317, float:1.9142487E38)
            r21 = 2130904038(0x7f0303e6, float:1.741491E38)
            r22 = r1
            r1 = r13
            r11 = 5
            r2 = r31
            r30 = r3
            r3 = r14
            r24 = r18
            r25 = r19
            r4 = r21
            r26 = r5
            r5 = r20
            r27 = r6
            r6 = r22
            o1.n.b(r1, r2, r3, r4, r5, r6)
            androidx.appcompat.widget.b1 r1 = new androidx.appcompat.widget.b1
            android.content.res.TypedArray r2 = r13.obtainStyledAttributes(r7, r14, r8, r9)
            r1.<init>(r13, r2)
            w1.r r3 = new w1.r
            r3.<init>(r0, r1)
            r0.f2517c = r3
            r4 = 43
            r5 = 1
            boolean r4 = r1.a(r4, r5)
            r0.D = r4
            r4 = 4
            java.lang.CharSequence r4 = r1.n(r4)
            r0.setHint((java.lang.CharSequence) r4)
            r4 = 42
            boolean r4 = r1.a(r4, r5)
            r0.F0 = r4
            r4 = 37
            boolean r4 = r1.a(r4, r5)
            r0.E0 = r4
            r4 = 6
            boolean r5 = r1.o(r4)
            r6 = 3
            if (r5 == 0) goto L_0x0143
            int r4 = r1.j(r4, r10)
            r0.setMinEms(r4)
            goto L_0x0150
        L_0x0143:
            boolean r4 = r1.o(r6)
            if (r4 == 0) goto L_0x0150
            int r4 = r1.f(r6, r10)
            r0.setMinWidth(r4)
        L_0x0150:
            boolean r4 = r1.o(r11)
            r5 = 2
            if (r4 == 0) goto L_0x015f
            int r4 = r1.j(r11, r10)
            r0.setMaxEms(r4)
            goto L_0x016c
        L_0x015f:
            boolean r4 = r1.o(r5)
            if (r4 == 0) goto L_0x016c
            int r4 = r1.f(r5, r10)
            r0.setMaxWidth(r4)
        L_0x016c:
            u1.j$b r4 = u1.j.b(r13, r7, r8, r9)
            u1.j r4 = r4.a()
            r0.J = r4
            android.content.res.Resources r4 = r13.getResources()
            r7 = 2131100186(0x7f06021a, float:1.7812746E38)
            int r4 = r4.getDimensionPixelOffset(r7)
            r0.L = r4
            r4 = 9
            r7 = 0
            int r4 = r1.e(r4, r7)
            r0.N = r4
            r4 = 16
            android.content.res.Resources r7 = r13.getResources()
            r8 = 2131100187(0x7f06021b, float:1.7812748E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r4 = r1.f(r4, r7)
            r0.P = r4
            r4 = 17
            android.content.res.Resources r7 = r13.getResources()
            r8 = 2131100188(0x7f06021c, float:1.781275E38)
            int r7 = r7.getDimensionPixelSize(r8)
            int r4 = r1.f(r4, r7)
            r0.Q = r4
            int r4 = r0.P
            r0.O = r4
            r4 = 13
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = r1.d(r4, r7)
            r8 = 12
            float r8 = r1.d(r8, r7)
            r9 = 10
            float r9 = r1.d(r9, r7)
            r11 = 11
            float r7 = r1.d(r11, r7)
            u1.j r11 = r0.J
            java.util.Objects.requireNonNull(r11)
            u1.j$b r14 = new u1.j$b
            r14.<init>(r11)
            r11 = 0
            int r16 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r16 < 0) goto L_0x01e2
            r14.f(r4)
        L_0x01e2:
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x01e9
            r14.g(r8)
        L_0x01e9:
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x01f0
            r14.e(r9)
        L_0x01f0:
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 < 0) goto L_0x01f7
            r14.d(r7)
        L_0x01f7:
            u1.j r4 = r14.a()
            r0.J = r4
            r4 = 7
            android.content.res.ColorStateList r4 = r1.c.b(r13, r1, r4)
            if (r4 == 0) goto L_0x025b
            int r7 = r4.getDefaultColor()
            r0.f2560x0 = r7
            r0.S = r7
            boolean r7 = r4.isStateful()
            r8 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r7 == 0) goto L_0x0238
            r7 = 1
            int[] r9 = new int[r7]
            r7 = 0
            r9[r7] = r8
            int r7 = r4.getColorForState(r9, r10)
            r0.f2562y0 = r7
            int[] r7 = new int[r5]
            r7 = {16842908, 16842910} // fill-array
            int r7 = r4.getColorForState(r7, r10)
            r0.f2564z0 = r7
            int[] r7 = new int[r5]
            r7 = {16843623, 16842910} // fill-array
            int r4 = r4.getColorForState(r7, r10)
        L_0x0235:
            r0.A0 = r4
            goto L_0x0266
        L_0x0238:
            int r4 = r0.f2560x0
            r0.f2564z0 = r4
            r4 = 2131034652(0x7f05021c, float:1.7679828E38)
            android.content.res.ColorStateList r4 = e.a.a(r13, r4)
            r7 = 1
            int[] r9 = new int[r7]
            r11 = 0
            r9[r11] = r8
            int r8 = r4.getColorForState(r9, r10)
            r0.f2562y0 = r8
            int[] r8 = new int[r7]
            r7 = 16843623(0x1010367, float:2.3696E-38)
            r8[r11] = r7
            int r4 = r4.getColorForState(r8, r10)
            goto L_0x0235
        L_0x025b:
            r11 = 0
            r0.S = r11
            r0.f2560x0 = r11
            r0.f2562y0 = r11
            r0.f2564z0 = r11
            r0.A0 = r11
        L_0x0266:
            r4 = 1
            boolean r7 = r1.o(r4)
            if (r7 == 0) goto L_0x0275
            android.content.res.ColorStateList r7 = r1.c(r4)
            r0.f2550s0 = r7
            r0.f2548r0 = r7
        L_0x0275:
            r4 = 14
            android.content.res.ColorStateList r7 = r1.c.b(r13, r1, r4)
            r8 = 0
            int r4 = r1.b(r4, r8)
            r0.f2556v0 = r4
            r4 = 2131034675(0x7f050233, float:1.7679874E38)
            int r4 = x.a.a(r13, r4)
            r0.f2552t0 = r4
            r4 = 2131034676(0x7f050234, float:1.7679876E38)
            int r4 = x.a.a(r13, r4)
            r0.B0 = r4
            r4 = 2131034679(0x7f050237, float:1.7679882E38)
            int r4 = x.a.a(r13, r4)
            r0.f2554u0 = r4
            if (r7 == 0) goto L_0x02a2
            r0.setBoxStrokeColorStateList(r7)
        L_0x02a2:
            r4 = 15
            boolean r7 = r1.o(r4)
            if (r7 == 0) goto L_0x02b1
            android.content.res.ColorStateList r4 = r1.c.b(r13, r1, r4)
            r0.setBoxStrokeErrorColor(r4)
        L_0x02b1:
            r4 = 44
            int r7 = r1.l(r4, r10)
            if (r7 == r10) goto L_0x02c2
            r7 = 0
            int r4 = r1.l(r4, r7)
            r0.setHintTextAppearance(r4)
            goto L_0x02c3
        L_0x02c2:
            r7 = 0
        L_0x02c3:
            r4 = 35
            int r4 = r1.l(r4, r7)
            r8 = 30
            java.lang.CharSequence r8 = r1.n(r8)
            r9 = 31
            boolean r9 = r1.a(r9, r7)
            r11 = 2131231168(0x7f0801c0, float:1.807841E38)
            r14 = r25
            r14.setId(r11)
            boolean r11 = r1.c.d(r13)
            if (r11 == 0) goto L_0x02ec
            android.view.ViewGroup$LayoutParams r11 = r14.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r11 = (android.view.ViewGroup.MarginLayoutParams) r11
            r11.setMarginStart(r7)
        L_0x02ec:
            r7 = 33
            boolean r11 = r1.o(r7)
            if (r11 == 0) goto L_0x02fa
            android.content.res.ColorStateList r7 = r1.c.b(r13, r1, r7)
            r0.f2544p0 = r7
        L_0x02fa:
            r7 = 34
            boolean r11 = r1.o(r7)
            if (r11 == 0) goto L_0x030e
            int r7 = r1.j(r7, r10)
            r11 = 0
            android.graphics.PorterDuff$Mode r7 = o1.s.b(r7, r11)
            r0.f2546q0 = r7
            goto L_0x030f
        L_0x030e:
            r11 = 0
        L_0x030f:
            r7 = 32
            boolean r16 = r1.o(r7)
            if (r16 == 0) goto L_0x031e
            android.graphics.drawable.Drawable r7 = r1.g(r7)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r7)
        L_0x031e:
            android.content.res.Resources r7 = r29.getResources()
            r11 = 2131689509(0x7f0f0025, float:1.9008035E38)
            java.lang.CharSequence r7 = r7.getText(r11)
            r14.setContentDescription(r7)
            java.util.WeakHashMap<android.view.View, g0.x> r7 = g0.u.f3063a
            g0.u.d.s(r14, r5)
            r7 = 0
            r14.setClickable(r7)
            r14.setPressable(r7)
            r14.setFocusable(r7)
            r11 = 40
            int r11 = r1.l(r11, r7)
            r6 = 39
            boolean r6 = r1.a(r6, r7)
            r5 = 38
            java.lang.CharSequence r5 = r1.n(r5)
            r10 = 52
            int r10 = r1.l(r10, r7)
            r7 = 51
            java.lang.CharSequence r7 = r1.n(r7)
            r31 = r5
            r5 = 65
            r20 = r9
            r9 = 0
            int r5 = r1.l(r5, r9)
            r9 = 64
            java.lang.CharSequence r9 = r1.n(r9)
            r21 = r9
            r9 = 18
            r22 = r6
            r6 = 0
            boolean r9 = r1.a(r9, r6)
            r6 = 19
            r25 = r9
            r9 = -1
            int r6 = r1.j(r6, r9)
            r0.setCounterMaxLength(r6)
            r6 = 22
            r9 = 0
            int r6 = r1.l(r6, r9)
            r0.f2547r = r6
            r6 = 20
            int r6 = r1.l(r6, r9)
            r0.f2545q = r6
            r6 = 8
            int r6 = r1.j(r6, r9)
            r0.setBoxBackgroundMode(r6)
            boolean r6 = r1.c.d(r13)
            if (r6 == 0) goto L_0x03aa
            android.view.ViewGroup$LayoutParams r6 = r30.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            r6.setMarginStart(r9)
        L_0x03aa:
            r6 = 26
            r23 = r3
            int r3 = r1.l(r6, r9)
            w1.e r6 = new w1.e
            r6.<init>(r0, r3)
            r9 = -1
            r12.append(r9, r6)
            w1.q r6 = new w1.q
            r6.<init>(r0)
            r9 = 0
            r12.append(r9, r6)
            com.google.android.material.textfield.c r6 = new com.google.android.material.textfield.c
            r28 = r15
            if (r3 != 0) goto L_0x03d1
            r15 = 47
            int r15 = r1.l(r15, r9)
            goto L_0x03d2
        L_0x03d1:
            r15 = r3
        L_0x03d2:
            r6.<init>(r0, r15)
            r9 = 1
            r12.append(r9, r6)
            com.google.android.material.textfield.a r6 = new com.google.android.material.textfield.a
            r6.<init>(r0, r3)
            r9 = 2
            r12.append(r9, r6)
            com.google.android.material.textfield.b r6 = new com.google.android.material.textfield.b
            r6.<init>(r0, r3)
            r3 = 3
            r12.append(r3, r6)
            r3 = 48
            boolean r6 = r1.o(r3)
            if (r6 != 0) goto L_0x0415
            r6 = 28
            boolean r9 = r1.o(r6)
            if (r9 == 0) goto L_0x0401
            android.content.res.ColorStateList r6 = r1.c.b(r13, r1, r6)
            r0.f2528h0 = r6
        L_0x0401:
            r6 = 29
            boolean r9 = r1.o(r6)
            if (r9 == 0) goto L_0x0415
            r9 = -1
            int r6 = r1.j(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = o1.s.b(r6, r9)
            r0.f2530i0 = r6
        L_0x0415:
            r6 = 27
            boolean r9 = r1.o(r6)
            if (r9 == 0) goto L_0x043f
            r9 = 0
            int r3 = r1.j(r6, r9)
            r0.setEndIconMode(r3)
            r3 = 25
            boolean r6 = r1.o(r3)
            if (r6 == 0) goto L_0x0434
            java.lang.CharSequence r3 = r1.n(r3)
            r0.setEndIconContentDescription((java.lang.CharSequence) r3)
        L_0x0434:
            r3 = 24
            r6 = 1
            boolean r3 = r1.a(r3, r6)
            r0.setEndIconCheckable(r3)
            goto L_0x0478
        L_0x043f:
            boolean r6 = r1.o(r3)
            if (r6 == 0) goto L_0x0478
            r6 = 49
            boolean r9 = r1.o(r6)
            if (r9 == 0) goto L_0x0453
            android.content.res.ColorStateList r6 = r1.c.b(r13, r1, r6)
            r0.f2528h0 = r6
        L_0x0453:
            r6 = 50
            boolean r9 = r1.o(r6)
            if (r9 == 0) goto L_0x0467
            r9 = -1
            int r6 = r1.j(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = o1.s.b(r6, r9)
            r0.f2530i0 = r6
        L_0x0467:
            r6 = 0
            boolean r3 = r1.a(r3, r6)
            r0.setEndIconMode(r3)
            r3 = 46
            java.lang.CharSequence r3 = r1.n(r3)
            r0.setEndIconContentDescription((java.lang.CharSequence) r3)
        L_0x0478:
            r3 = 2131231175(0x7f0801c7, float:1.8078424E38)
            r6 = r24
            r6.setId(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r9 = 80
            r12 = -2
            r3.<init>(r12, r12, r9)
            r6.setLayoutParams(r3)
            r3 = 1
            g0.u.g.f(r6, r3)
            r0.setErrorContentDescription(r8)
            int r3 = r0.f2545q
            r0.setCounterOverflowTextAppearance(r3)
            r0.setHelperTextTextAppearance(r11)
            r0.setErrorTextAppearance(r4)
            int r3 = r0.f2547r
            r0.setCounterTextAppearance(r3)
            r0.setPlaceholderText(r7)
            r0.setPlaceholderTextAppearance(r10)
            r0.setSuffixTextAppearance(r5)
            r3 = 36
            boolean r4 = r1.o(r3)
            if (r4 == 0) goto L_0x04ba
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setErrorTextColor(r3)
        L_0x04ba:
            r3 = 41
            boolean r4 = r1.o(r3)
            if (r4 == 0) goto L_0x04c9
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHelperTextColor(r3)
        L_0x04c9:
            r3 = 45
            boolean r4 = r1.o(r3)
            if (r4 == 0) goto L_0x04d8
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setHintTextColor(r3)
        L_0x04d8:
            r3 = 23
            boolean r4 = r1.o(r3)
            if (r4 == 0) goto L_0x04e7
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterTextColor(r3)
        L_0x04e7:
            r3 = 21
            boolean r3 = r1.o(r3)
            if (r3 == 0) goto L_0x04f8
            r3 = 21
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setCounterOverflowTextColor(r3)
        L_0x04f8:
            r3 = 53
            boolean r3 = r1.o(r3)
            if (r3 == 0) goto L_0x0509
            r3 = 53
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setPlaceholderTextColor(r3)
        L_0x0509:
            r3 = 66
            boolean r3 = r1.o(r3)
            if (r3 == 0) goto L_0x051a
            r3 = 66
            android.content.res.ColorStateList r3 = r1.c(r3)
            r0.setSuffixTextColor(r3)
        L_0x051a:
            r3 = 1
            r4 = 0
            boolean r1 = r1.a(r4, r3)
            r0.setEnabled(r1)
            r2.recycle()
            r1 = 2
            g0.u.d.s(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0535
            if (r1 < r2) goto L_0x0535
            g0.u.k.l(r0, r3)
        L_0x0535:
            r2 = r30
            r1 = r27
            r1.addView(r2)
            r2 = r26
            r2.addView(r6)
            r2.addView(r14)
            r2.addView(r1)
            r3 = r23
            r1 = r28
            r1.addView(r3)
            r1.addView(r2)
            r0.addView(r1)
            r1 = r22
            r0.setHelperTextEnabled(r1)
            r1 = r20
            r0.setErrorEnabled(r1)
            r1 = r25
            r0.setCounterEnabled(r1)
            r1 = r31
            r0.setHelperText(r1)
            r1 = r21
            r0.setSuffixText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private k getEndIconDelegate() {
        k kVar = this.f2522e0.get(this.f2520d0);
        return kVar != null ? kVar : this.f2522e0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f2542o0.getVisibility() == 0) {
            return this.f2542o0;
        }
        if (!h() || !j()) {
            return null;
        }
        return this.f2524f0;
    }

    public static void n(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                n((ViewGroup) childAt, z2);
            }
        }
    }

    public static void p(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        boolean a2 = u.c.a(checkableImageButton);
        boolean z2 = false;
        int i2 = 1;
        boolean z3 = onLongClickListener != null;
        if (a2 || z3) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(a2);
        checkableImageButton.setPressable(a2);
        checkableImageButton.setLongClickable(z3);
        if (!z2) {
            i2 = 2;
        }
        u.d.s(checkableImageButton, i2);
    }

    private void setEditText(EditText editText) {
        if (this.f2523f == null) {
            if (this.f2520d0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f2523f = editText;
            int i2 = this.f2527h;
            if (i2 != -1) {
                setMinEms(i2);
            } else {
                setMinWidth(this.f2531j);
            }
            int i3 = this.f2529i;
            if (i3 != -1) {
                setMaxEms(i3);
            } else {
                setMaxWidth(this.f2533k);
            }
            l();
            setTextInputAccessibilityDelegate(new e(this));
            this.D0.r(this.f2523f.getTypeface());
            o1.e eVar = this.D0;
            float textSize = this.f2523f.getTextSize();
            if (eVar.f3538j != textSize) {
                eVar.f3538j = textSize;
                eVar.k(false);
            }
            o1.e eVar2 = this.D0;
            float letterSpacing = this.f2523f.getLetterSpacing();
            if (eVar2.W != letterSpacing) {
                eVar2.W = letterSpacing;
                eVar2.k(false);
            }
            int gravity = this.f2523f.getGravity();
            this.D0.n((gravity & -113) | 48);
            o1.e eVar3 = this.D0;
            if (eVar3.f3536h != gravity) {
                eVar3.f3536h = gravity;
                eVar3.k(false);
            }
            this.f2523f.addTextChangedListener(new a());
            if (this.f2548r0 == null) {
                this.f2548r0 = this.f2523f.getHintTextColors();
            }
            if (this.D) {
                if (TextUtils.isEmpty(this.E)) {
                    CharSequence hint = this.f2523f.getHint();
                    this.f2525g = hint;
                    setHint(hint);
                    this.f2523f.setHint((CharSequence) null);
                }
                this.F = true;
            }
            if (this.f2543p != null) {
                s(this.f2523f.getText().length());
            }
            v();
            this.f2535l.b();
            this.f2517c.bringToFront();
            this.f2519d.bringToFront();
            this.f2521e.bringToFront();
            this.f2542o0.bringToFront();
            Iterator it = this.f2518c0.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(this);
            }
            C();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            z(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.E)) {
            this.E = charSequence;
            o1.e eVar = this.D0;
            if (charSequence == null || !TextUtils.equals(eVar.B, charSequence)) {
                eVar.B = charSequence;
                eVar.C = null;
                Bitmap bitmap = eVar.E;
                if (bitmap != null) {
                    bitmap.recycle();
                    eVar.E = null;
                }
                eVar.k(false);
            }
            if (!this.C0) {
                m();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2551t != z2) {
            if (z2) {
                TextView textView = this.f2553u;
                if (textView != null) {
                    this.f2515b.addView(textView);
                    this.f2553u.setVisibility(0);
                }
            } else {
                TextView textView2 = this.f2553u;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                this.f2553u = null;
            }
            this.f2551t = z2;
        }
    }

    public final void A(int i2) {
        if (i2 != 0 || this.C0) {
            i();
        } else if (this.f2553u != null && this.f2551t && !TextUtils.isEmpty(this.f2549s)) {
            this.f2553u.setText(this.f2549s);
            v0.k.a(this.f2515b, this.f2559x);
            this.f2553u.setVisibility(0);
            this.f2553u.bringToFront();
            announceForAccessibility(this.f2549s);
        }
    }

    public final void B(boolean z2, boolean z3) {
        int defaultColor = this.f2558w0.getDefaultColor();
        int colorForState = this.f2558w0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f2558w0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.R = colorForState2;
        } else if (z3) {
            this.R = colorForState;
        } else {
            this.R = defaultColor;
        }
    }

    public final void C() {
        int i2;
        if (this.f2523f != null) {
            if (j() || k()) {
                i2 = 0;
            } else {
                EditText editText = this.f2523f;
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                i2 = u.e.e(editText);
            }
            TextView textView = this.C;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.f2523f.getPaddingTop();
            int paddingBottom = this.f2523f.getPaddingBottom();
            WeakHashMap<View, x> weakHashMap2 = u.f3063a;
            u.e.k(textView, dimensionPixelSize, paddingTop, i2, paddingBottom);
        }
    }

    public final void D() {
        int visibility = this.C.getVisibility();
        boolean z2 = false;
        int i2 = (this.B == null || this.C0) ? 8 : 0;
        if (visibility != i2) {
            k endIconDelegate = getEndIconDelegate();
            if (i2 == 0) {
                z2 = true;
            }
            endIconDelegate.c(z2);
        }
        w();
        this.C.setVisibility(i2);
        u();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.f2523f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void E() {
        /*
            r6 = this;
            u1.g r0 = r6.G
            if (r0 == 0) goto L_0x0119
            int r0 = r6.M
            if (r0 != 0) goto L_0x000a
            goto L_0x0119
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f2523f
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0030
            android.widget.EditText r3 = r6.f2523f
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
        L_0x0030:
            r1 = 1
        L_0x0031:
            boolean r3 = r6.isEnabled()
            if (r3 != 0) goto L_0x003a
            int r3 = r6.B0
            goto L_0x006f
        L_0x003a:
            w1.m r3 = r6.f2535l
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x004e
            android.content.res.ColorStateList r3 = r6.f2558w0
            if (r3 == 0) goto L_0x0047
            goto L_0x005a
        L_0x0047:
            w1.m r3 = r6.f2535l
            int r3 = r3.g()
            goto L_0x006f
        L_0x004e:
            boolean r3 = r6.f2541o
            if (r3 == 0) goto L_0x0063
            android.widget.TextView r3 = r6.f2543p
            if (r3 == 0) goto L_0x0063
            android.content.res.ColorStateList r4 = r6.f2558w0
            if (r4 == 0) goto L_0x005e
        L_0x005a:
            r6.B(r0, r1)
            goto L_0x0071
        L_0x005e:
            int r3 = r3.getCurrentTextColor()
            goto L_0x006f
        L_0x0063:
            if (r0 == 0) goto L_0x0068
            int r3 = r6.f2556v0
            goto L_0x006f
        L_0x0068:
            if (r1 == 0) goto L_0x006d
            int r3 = r6.f2554u0
            goto L_0x006f
        L_0x006d:
            int r3 = r6.f2552t0
        L_0x006f:
            r6.R = r3
        L_0x0071:
            r6.x()
            com.google.android.material.internal.CheckableImageButton r3 = r6.f2542o0
            android.content.res.ColorStateList r4 = r6.f2544p0
            w1.l.c(r6, r3, r4)
            w1.r r3 = r6.f2517c
            com.google.android.material.textfield.TextInputLayout r4 = r3.f4290b
            com.google.android.material.internal.CheckableImageButton r5 = r3.f4293e
            android.content.res.ColorStateList r3 = r3.f4294f
            w1.l.c(r4, r5, r3)
            r6.o()
            w1.k r3 = r6.getEndIconDelegate()
            java.util.Objects.requireNonNull(r3)
            boolean r3 = r3 instanceof com.google.android.material.textfield.b
            if (r3 == 0) goto L_0x00c6
            w1.m r3 = r6.f2535l
            boolean r3 = r3.e()
            if (r3 == 0) goto L_0x00bd
            android.graphics.drawable.Drawable r3 = r6.getEndIconDrawable()
            if (r3 == 0) goto L_0x00bd
            android.graphics.drawable.Drawable r3 = r6.getEndIconDrawable()
            android.graphics.drawable.Drawable r3 = a0.a.g(r3)
            android.graphics.drawable.Drawable r3 = r3.mutate()
            w1.m r4 = r6.f2535l
            int r4 = r4.g()
            r3.setTint(r4)
            com.google.android.material.internal.CheckableImageButton r4 = r6.f2524f0
            r4.setImageDrawable(r3)
            goto L_0x00c6
        L_0x00bd:
            com.google.android.material.internal.CheckableImageButton r3 = r6.f2524f0
            android.content.res.ColorStateList r4 = r6.f2528h0
            android.graphics.PorterDuff$Mode r5 = r6.f2530i0
            w1.l.a(r6, r3, r4, r5)
        L_0x00c6:
            int r3 = r6.M
            r4 = 2
            if (r3 != r4) goto L_0x00f9
            int r3 = r6.O
            if (r0 == 0) goto L_0x00d8
            boolean r4 = r6.isEnabled()
            if (r4 == 0) goto L_0x00d8
            int r4 = r6.Q
            goto L_0x00da
        L_0x00d8:
            int r4 = r6.P
        L_0x00da:
            r6.O = r4
            if (r4 == r3) goto L_0x00f9
            boolean r3 = r6.e()
            if (r3 == 0) goto L_0x00f9
            boolean r3 = r6.C0
            if (r3 != 0) goto L_0x00f9
            boolean r3 = r6.e()
            if (r3 == 0) goto L_0x00f6
            u1.g r3 = r6.G
            w1.f r3 = (w1.f) r3
            r4 = 0
            r3.y(r4, r4, r4, r4)
        L_0x00f6:
            r6.m()
        L_0x00f9:
            int r3 = r6.M
            if (r3 != r2) goto L_0x0116
            boolean r2 = r6.isEnabled()
            if (r2 != 0) goto L_0x0106
            int r0 = r6.f2562y0
            goto L_0x0114
        L_0x0106:
            if (r1 == 0) goto L_0x010d
            if (r0 != 0) goto L_0x010d
            int r0 = r6.A0
            goto L_0x0114
        L_0x010d:
            if (r0 == 0) goto L_0x0112
            int r0 = r6.f2564z0
            goto L_0x0114
        L_0x0112:
            int r0 = r6.f2560x0
        L_0x0114:
            r6.S = r0
        L_0x0116:
            r6.c()
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.E():void");
    }

    public void a(f fVar) {
        this.f2518c0.add(fVar);
        if (this.f2523f != null) {
            fVar.a(this);
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f2515b.addView(view, layoutParams2);
            this.f2515b.setLayoutParams(layoutParams);
            y();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public void b(float f2) {
        if (this.D0.f3529c != f2) {
            if (this.G0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.G0 = valueAnimator;
                valueAnimator.setInterpolator(z0.a.f4420b);
                this.G0.setDuration(167);
                this.G0.addUpdateListener(new d());
            }
            this.G0.setFloatValues(new float[]{this.D0.f3529c, f2});
            this.G0.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r7 = this;
            u1.g r0 = r7.G
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            u1.g$b r1 = r0.f3911b
            u1.j r1 = r1.f3935a
            u1.j r2 = r7.J
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == r2) goto L_0x004a
            r0.setShapeAppearanceModel(r2)
            int r0 = r7.f2520d0
            if (r0 != r3) goto L_0x004a
            int r0 = r7.M
            if (r0 != r4) goto L_0x004a
            android.util.SparseArray<w1.k> r0 = r7.f2522e0
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.textfield.b r0 = (com.google.android.material.textfield.b) r0
            android.widget.EditText r1 = r7.f2523f
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            java.util.Objects.requireNonNull(r0)
            android.text.method.KeyListener r2 = r1.getKeyListener()
            if (r2 == 0) goto L_0x0033
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 != 0) goto L_0x004a
            com.google.android.material.textfield.TextInputLayout r2 = r0.f4254a
            int r2 = r2.getBoxBackgroundMode()
            if (r2 != r4) goto L_0x004a
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.LayerDrawable
            if (r2 != 0) goto L_0x0047
            goto L_0x004a
        L_0x0047:
            r0.i(r1)
        L_0x004a:
            int r0 = r7.M
            r1 = -1
            if (r0 != r4) goto L_0x005e
            int r0 = r7.O
            if (r0 <= r1) goto L_0x0059
            int r0 = r7.R
            if (r0 == 0) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r0 == 0) goto L_0x006b
            u1.g r0 = r7.G
            int r2 = r7.O
            float r2 = (float) r2
            int r4 = r7.R
            r0.s(r2, r4)
        L_0x006b:
            int r0 = r7.S
            int r2 = r7.M
            if (r2 != r6) goto L_0x0082
            r0 = 2130903291(0x7f0300fb, float:1.7413396E38)
            android.content.Context r2 = r7.getContext()
            int r0 = c.b.e(r2, r0, r5)
            int r2 = r7.S
            int r0 = z.a.b(r2, r0)
        L_0x0082:
            r7.S = r0
            u1.g r2 = r7.G
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.q(r0)
            int r0 = r7.f2520d0
            if (r0 != r3) goto L_0x009a
            android.widget.EditText r0 = r7.f2523f
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x009a:
            u1.g r0 = r7.H
            if (r0 == 0) goto L_0x00d0
            u1.g r2 = r7.I
            if (r2 != 0) goto L_0x00a3
            goto L_0x00d0
        L_0x00a3:
            int r2 = r7.O
            if (r2 <= r1) goto L_0x00ac
            int r1 = r7.R
            if (r1 == 0) goto L_0x00ac
            r5 = 1
        L_0x00ac:
            if (r5 == 0) goto L_0x00cd
            android.widget.EditText r1 = r7.f2523f
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L_0x00b9
            int r1 = r7.f2552t0
            goto L_0x00bb
        L_0x00b9:
            int r1 = r7.R
        L_0x00bb:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.q(r1)
            u1.g r0 = r7.I
            int r1 = r7.R
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.q(r1)
        L_0x00cd:
            r7.invalidate()
        L_0x00d0:
            r7.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.c():void");
    }

    public final int d() {
        float e2;
        if (!this.D) {
            return 0;
        }
        int i2 = this.M;
        if (i2 == 0) {
            e2 = this.D0.e();
        } else if (i2 != 2) {
            return 0;
        } else {
            e2 = this.D0.e() / 2.0f;
        }
        return (int) e2;
    }

    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText = this.f2523f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        if (this.f2525g != null) {
            boolean z2 = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.f2523f.setHint(this.f2525g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i2);
            } finally {
                this.f2523f.setHint(hint);
                this.F = z2;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i2);
            onProvideAutofillVirtualStructure(viewStructure, i2);
            viewStructure.setChildCount(this.f2515b.getChildCount());
            for (int i3 = 0; i3 < this.f2515b.getChildCount(); i3++) {
                View childAt = this.f2515b.getChildAt(i3);
                ViewStructure newChild = viewStructure.newChild(i3);
                childAt.dispatchProvideAutofillStructure(newChild, i2);
                if (childAt == this.f2523f) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.I0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.I0 = false;
    }

    public void draw(Canvas canvas) {
        u1.g gVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        if (this.D) {
            o1.e eVar = this.D0;
            Objects.requireNonNull(eVar);
            int save = canvas.save();
            if (eVar.C != null && eVar.f3527b) {
                eVar.N.setTextSize(eVar.G);
                float f2 = eVar.f3546r;
                float f3 = eVar.f3547s;
                float f4 = eVar.F;
                if (f4 != 1.0f) {
                    canvas2.scale(f4, f4, f2, f3);
                }
                if (eVar.s()) {
                    float lineStart = eVar.f3546r - ((float) eVar.Y.getLineStart(0));
                    int alpha = eVar.N.getAlpha();
                    canvas2.translate(lineStart, f3);
                    float f5 = (float) alpha;
                    eVar.N.setAlpha((int) (eVar.f3528b0 * f5));
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 31) {
                        TextPaint textPaint = eVar.N;
                        float f6 = eVar.H;
                        float f7 = eVar.I;
                        float f8 = eVar.J;
                        int i3 = eVar.K;
                        textPaint.setShadowLayer(f6, f7, f8, z.a.e(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    eVar.Y.draw(canvas2);
                    eVar.N.setAlpha((int) (eVar.f3526a0 * f5));
                    if (i2 >= 31) {
                        TextPaint textPaint2 = eVar.N;
                        float f9 = eVar.H;
                        float f10 = eVar.I;
                        float f11 = eVar.J;
                        int i4 = eVar.K;
                        textPaint2.setShadowLayer(f9, f10, f11, z.a.e(i4, (Color.alpha(i4) * textPaint2.getAlpha()) / 255));
                    }
                    int lineBaseline = eVar.Y.getLineBaseline(0);
                    CharSequence charSequence = eVar.f3530c0;
                    float f12 = (float) lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, eVar.N);
                    if (i2 >= 31) {
                        eVar.N.setShadowLayer(eVar.H, eVar.I, eVar.J, eVar.K);
                    }
                    String trim = eVar.f3530c0.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    eVar.N.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(eVar.Y.getLineEnd(0), str.length()), 0.0f, f12, eVar.N);
                } else {
                    canvas2.translate(f2, f3);
                    eVar.Y.draw(canvas2);
                }
                canvas2.restoreToCount(save);
            }
        }
        if (this.I != null && (gVar = this.H) != null) {
            gVar.draw(canvas2);
            if (this.f2523f.isFocused()) {
                Rect bounds = this.I.getBounds();
                Rect bounds2 = this.H.getBounds();
                float f13 = this.D0.f3529c;
                int centerX = bounds2.centerX();
                int i5 = bounds2.left;
                TimeInterpolator timeInterpolator = z0.a.f4419a;
                bounds.left = Math.round(((float) (i5 - centerX)) * f13) + centerX;
                bounds.right = Math.round(f13 * ((float) (bounds2.right - centerX))) + centerX;
                this.I.draw(canvas2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = r2.f3540l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.H0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.H0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            o1.e r2 = r4.D0
            r3 = 0
            if (r2 == 0) goto L_0x0037
            r2.L = r1
            android.content.res.ColorStateList r1 = r2.f3541m
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r2.f3540l
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            r2.k(r3)
            r1 = 1
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            r1 = r1 | r3
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            android.widget.EditText r2 = r4.f2523f
            if (r2 == 0) goto L_0x004f
            java.util.WeakHashMap<android.view.View, g0.x> r2 = g0.u.f3063a
            boolean r2 = g0.u.g.c(r4)
            if (r2 == 0) goto L_0x004b
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = 0
        L_0x004c:
            r4.z(r0, r3)
        L_0x004f:
            r4.v()
            r4.E()
            if (r1 == 0) goto L_0x005a
            r4.invalidate()
        L_0x005a:
            r4.H0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof w1.f);
    }

    public final int f(int i2, boolean z2) {
        int compoundPaddingLeft = this.f2523f.getCompoundPaddingLeft() + i2;
        return (getPrefixText() == null || z2) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public final int g(int i2, boolean z2) {
        int compoundPaddingRight = i2 - this.f2523f.getCompoundPaddingRight();
        return (getPrefixText() == null || !z2) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    public int getBaseline() {
        EditText editText = this.f2523f;
        if (editText == null) {
            return super.getBaseline();
        }
        return d() + getPaddingTop() + editText.getBaseline();
    }

    public u1.g getBoxBackground() {
        int i2 = this.M;
        if (i2 == 1 || i2 == 2) {
            return this.G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.S;
    }

    public int getBoxBackgroundMode() {
        return this.M;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        u1.c cVar;
        if (s.a(this)) {
            cVar = this.J.f3965h;
        } else {
            cVar = this.J.f3964g;
        }
        return cVar.a(this.V);
    }

    public float getBoxCornerRadiusBottomStart() {
        u1.c cVar;
        if (s.a(this)) {
            cVar = this.J.f3964g;
        } else {
            cVar = this.J.f3965h;
        }
        return cVar.a(this.V);
    }

    public float getBoxCornerRadiusTopEnd() {
        u1.c cVar;
        if (s.a(this)) {
            cVar = this.J.f3962e;
        } else {
            cVar = this.J.f3963f;
        }
        return cVar.a(this.V);
    }

    public float getBoxCornerRadiusTopStart() {
        u1.c cVar;
        if (s.a(this)) {
            cVar = this.J.f3963f;
        } else {
            cVar = this.J.f3962e;
        }
        return cVar.a(this.V);
    }

    public int getBoxStrokeColor() {
        return this.f2556v0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2558w0;
    }

    public int getBoxStrokeWidth() {
        return this.P;
    }

    public int getBoxStrokeWidthFocused() {
        return this.Q;
    }

    public int getCounterMaxLength() {
        return this.f2539n;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f2537m || !this.f2541o || (textView = this.f2543p) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2563z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2563z;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2548r0;
    }

    public EditText getEditText() {
        return this.f2523f;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2524f0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2524f0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f2520d0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2524f0;
    }

    public CharSequence getError() {
        m mVar = this.f2535l;
        if (mVar.f4268k) {
            return mVar.f4267j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2535l.f4270m;
    }

    public int getErrorCurrentTextColors() {
        return this.f2535l.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f2542o0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f2535l.g();
    }

    public CharSequence getHelperText() {
        m mVar = this.f2535l;
        if (mVar.f4274q) {
            return mVar.f4273p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f2535l.f4275r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.D0.e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.D0.f();
    }

    public ColorStateList getHintTextColor() {
        return this.f2550s0;
    }

    public int getMaxEms() {
        return this.f2529i;
    }

    public int getMaxWidth() {
        return this.f2533k;
    }

    public int getMinEms() {
        return this.f2527h;
    }

    public int getMinWidth() {
        return this.f2531j;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2524f0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2524f0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2551t) {
            return this.f2549s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2557w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2555v;
    }

    public CharSequence getPrefixText() {
        return this.f2517c.f4292d;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2517c.f4291c.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2517c.f4291c;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2517c.f4293e.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2517c.f4293e.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.C.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.C;
    }

    public Typeface getTypeface() {
        return this.W;
    }

    public final boolean h() {
        return this.f2520d0 != 0;
    }

    public final void i() {
        TextView textView = this.f2553u;
        if (textView != null && this.f2551t) {
            textView.setText((CharSequence) null);
            v0.k.a(this.f2515b, this.f2561y);
            this.f2553u.setVisibility(4);
        }
    }

    public boolean j() {
        return this.f2521e.getVisibility() == 0 && this.f2524f0.getVisibility() == 0;
    }

    public final boolean k() {
        return this.f2542o0.getVisibility() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l() {
        /*
            r6 = this;
            int r0 = r6.M
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0058
            if (r0 == r2) goto L_0x0040
            r3 = 2
            if (r0 != r3) goto L_0x0027
            boolean r0 = r6.D
            if (r0 == 0) goto L_0x001d
            u1.g r0 = r6.G
            boolean r0 = r0 instanceof w1.f
            if (r0 != 0) goto L_0x001d
            w1.f r0 = new w1.f
            u1.j r3 = r6.J
            r0.<init>(r3)
            goto L_0x0024
        L_0x001d:
            u1.g r0 = new u1.g
            u1.j r3 = r6.J
            r0.<init>((u1.j) r3)
        L_0x0024:
            r6.G = r0
            goto L_0x005a
        L_0x0027:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r6.M
            r1.append(r2)
            java.lang.String r2 = " is illegal; only @BoxBackgroundMode constants are supported."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0040:
            u1.g r0 = new u1.g
            u1.j r1 = r6.J
            r0.<init>((u1.j) r1)
            r6.G = r0
            u1.g r0 = new u1.g
            r0.<init>()
            r6.H = r0
            u1.g r0 = new u1.g
            r0.<init>()
            r6.I = r0
            goto L_0x005e
        L_0x0058:
            r6.G = r1
        L_0x005a:
            r6.H = r1
            r6.I = r1
        L_0x005e:
            android.widget.EditText r0 = r6.f2523f
            if (r0 == 0) goto L_0x0072
            u1.g r1 = r6.G
            if (r1 == 0) goto L_0x0072
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L_0x0072
            int r0 = r6.M
            if (r0 == 0) goto L_0x0072
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 == 0) goto L_0x007e
            android.widget.EditText r0 = r6.f2523f
            u1.g r1 = r6.G
            java.util.WeakHashMap<android.view.View, g0.x> r3 = g0.u.f3063a
            g0.u.d.q(r0, r1)
        L_0x007e:
            r6.E()
            int r0 = r6.M
            if (r0 != r2) goto L_0x00ae
            android.content.Context r0 = r6.getContext()
            boolean r0 = r1.c.e(r0)
            if (r0 == 0) goto L_0x0097
            android.content.res.Resources r0 = r6.getResources()
            r1 = 2131099991(0x7f060157, float:1.781235E38)
            goto L_0x00a8
        L_0x0097:
            android.content.Context r0 = r6.getContext()
            boolean r0 = r1.c.d(r0)
            if (r0 == 0) goto L_0x00ae
            android.content.res.Resources r0 = r6.getResources()
            r1 = 2131099990(0x7f060156, float:1.7812349E38)
        L_0x00a8:
            int r0 = r0.getDimensionPixelSize(r1)
            r6.N = r0
        L_0x00ae:
            android.widget.EditText r0 = r6.f2523f
            if (r0 == 0) goto L_0x0113
            int r0 = r6.M
            if (r0 == r2) goto L_0x00b7
            goto L_0x0113
        L_0x00b7:
            android.content.Context r0 = r6.getContext()
            boolean r0 = r1.c.e(r0)
            if (r0 == 0) goto L_0x00e2
            android.widget.EditText r0 = r6.f2523f
            java.util.WeakHashMap<android.view.View, g0.x> r1 = g0.u.f3063a
            int r1 = g0.u.e.f(r0)
            android.content.res.Resources r2 = r6.getResources()
            r3 = 2131099989(0x7f060155, float:1.7812347E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r6.f2523f
            int r3 = g0.u.e.e(r3)
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131099988(0x7f060154, float:1.7812345E38)
            goto L_0x010c
        L_0x00e2:
            android.content.Context r0 = r6.getContext()
            boolean r0 = r1.c.d(r0)
            if (r0 == 0) goto L_0x0113
            android.widget.EditText r0 = r6.f2523f
            java.util.WeakHashMap<android.view.View, g0.x> r1 = g0.u.f3063a
            int r1 = g0.u.e.f(r0)
            android.content.res.Resources r2 = r6.getResources()
            r3 = 2131099987(0x7f060153, float:1.7812343E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.EditText r3 = r6.f2523f
            int r3 = g0.u.e.e(r3)
            android.content.res.Resources r4 = r6.getResources()
            r5 = 2131099986(0x7f060152, float:1.781234E38)
        L_0x010c:
            int r4 = r4.getDimensionPixelSize(r5)
            g0.u.e.k(r0, r1, r2, r3, r4)
        L_0x0113:
            int r0 = r6.M
            if (r0 == 0) goto L_0x011a
            r6.y()
        L_0x011a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r13 = this;
            boolean r0 = r13.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r13.V
            o1.e r1 = r13.D0
            android.widget.EditText r2 = r13.f2523f
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r13.f2523f
            int r3 = r3.getGravity()
            java.lang.CharSequence r4 = r1.B
            boolean r4 = r1.b(r4)
            r1.D = r4
            r5 = 8388613(0x800005, float:1.175495E-38)
            r6 = 1
            r7 = 17
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 5
            if (r3 == r7) goto L_0x004b
            r10 = r3 & 7
            if (r10 != r6) goto L_0x002f
            goto L_0x004b
        L_0x002f:
            r10 = r3 & r5
            if (r10 == r5) goto L_0x003b
            r10 = r3 & 5
            if (r10 != r9) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            if (r4 == 0) goto L_0x003d
            goto L_0x0043
        L_0x003b:
            if (r4 == 0) goto L_0x0043
        L_0x003d:
            android.graphics.Rect r10 = r1.f3534f
            int r10 = r10.left
            float r10 = (float) r10
            goto L_0x0051
        L_0x0043:
            android.graphics.Rect r10 = r1.f3534f
            int r10 = r10.right
            float r10 = (float) r10
            float r11 = r1.Z
            goto L_0x0050
        L_0x004b:
            float r10 = (float) r2
            float r10 = r10 / r8
            float r11 = r1.Z
            float r11 = r11 / r8
        L_0x0050:
            float r10 = r10 - r11
        L_0x0051:
            r0.left = r10
            android.graphics.Rect r11 = r1.f3534f
            int r12 = r11.top
            float r12 = (float) r12
            r0.top = r12
            if (r3 == r7) goto L_0x007b
            r7 = r3 & 7
            if (r7 != r6) goto L_0x0061
            goto L_0x007b
        L_0x0061:
            r2 = r3 & r5
            if (r2 == r5) goto L_0x0071
            r2 = r3 & 5
            if (r2 != r9) goto L_0x006a
            goto L_0x0071
        L_0x006a:
            if (r4 == 0) goto L_0x006d
            goto L_0x0077
        L_0x006d:
            float r2 = r1.Z
            float r2 = r2 + r10
            goto L_0x0081
        L_0x0071:
            if (r4 == 0) goto L_0x0077
            float r2 = r1.Z
            float r2 = r2 + r10
            goto L_0x0081
        L_0x0077:
            int r2 = r11.right
            float r2 = (float) r2
            goto L_0x0081
        L_0x007b:
            float r2 = (float) r2
            float r2 = r2 / r8
            float r3 = r1.Z
            float r3 = r3 / r8
            float r2 = r2 + r3
        L_0x0081:
            r0.right = r2
            float r1 = r1.e()
            float r1 = r1 + r12
            r0.bottom = r1
            float r1 = r0.left
            int r2 = r13.L
            float r2 = (float) r2
            float r1 = r1 - r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 + r2
            r0.right = r1
            int r1 = r13.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r13.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            float r3 = r0.height()
            float r3 = r3 / r8
            float r2 = r2 - r3
            int r3 = r13.O
            float r3 = (float) r3
            float r2 = r2 + r3
            r0.offset(r1, r2)
            u1.g r1 = r13.G
            w1.f r1 = (w1.f) r1
            java.util.Objects.requireNonNull(r1)
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.y(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m():void");
    }

    public void o() {
        l.c(this, this.f2524f0, this.f2528h0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.D0.i(configuration);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            r4 = this;
            super.onLayout(r5, r6, r7, r8, r9)
            android.widget.EditText r5 = r4.f2523f
            if (r5 == 0) goto L_0x018e
            android.graphics.Rect r6 = r4.T
            o1.f.a(r4, r5, r6)
            u1.g r5 = r4.H
            if (r5 == 0) goto L_0x001d
            int r7 = r6.bottom
            int r8 = r4.P
            int r8 = r7 - r8
            int r9 = r6.left
            int r0 = r6.right
            r5.setBounds(r9, r8, r0, r7)
        L_0x001d:
            u1.g r5 = r4.I
            if (r5 == 0) goto L_0x002e
            int r7 = r6.bottom
            int r8 = r4.Q
            int r8 = r7 - r8
            int r9 = r6.left
            int r0 = r6.right
            r5.setBounds(r9, r8, r0, r7)
        L_0x002e:
            boolean r5 = r4.D
            if (r5 == 0) goto L_0x018e
            o1.e r5 = r4.D0
            android.widget.EditText r7 = r4.f2523f
            float r7 = r7.getTextSize()
            float r8 = r5.f3538j
            r9 = 0
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x0046
            r5.f3538j = r7
            r5.k(r9)
        L_0x0046:
            android.widget.EditText r5 = r4.f2523f
            int r5 = r5.getGravity()
            o1.e r7 = r4.D0
            r8 = r5 & -113(0xffffffffffffff8f, float:NaN)
            r8 = r8 | 48
            r7.n(r8)
            o1.e r7 = r4.D0
            int r8 = r7.f3536h
            if (r8 == r5) goto L_0x0060
            r7.f3536h = r5
            r7.k(r9)
        L_0x0060:
            o1.e r5 = r4.D0
            android.widget.EditText r7 = r4.f2523f
            if (r7 == 0) goto L_0x0188
            android.graphics.Rect r7 = r4.U
            boolean r8 = o1.s.a(r4)
            int r0 = r6.bottom
            r7.bottom = r0
            int r0 = r4.M
            r1 = 1
            if (r0 == r1) goto L_0x00a3
            r2 = 2
            if (r0 == r2) goto L_0x0085
            int r0 = r6.left
            int r0 = r4.f(r0, r8)
            r7.left = r0
            int r0 = r4.getPaddingTop()
            goto L_0x00b0
        L_0x0085:
            int r8 = r6.left
            android.widget.EditText r0 = r4.f2523f
            int r0 = r0.getPaddingLeft()
            int r0 = r0 + r8
            r7.left = r0
            int r8 = r6.top
            int r0 = r4.d()
            int r8 = r8 - r0
            r7.top = r8
            int r8 = r6.right
            android.widget.EditText r0 = r4.f2523f
            int r0 = r0.getPaddingRight()
            int r8 = r8 - r0
            goto L_0x00b8
        L_0x00a3:
            int r0 = r6.left
            int r0 = r4.f(r0, r8)
            r7.left = r0
            int r0 = r6.top
            int r2 = r4.N
            int r0 = r0 + r2
        L_0x00b0:
            r7.top = r0
            int r0 = r6.right
            int r8 = r4.g(r0, r8)
        L_0x00b8:
            r7.right = r8
            java.util.Objects.requireNonNull(r5)
            int r8 = r7.left
            int r0 = r7.top
            int r2 = r7.right
            int r7 = r7.bottom
            android.graphics.Rect r3 = r5.f3534f
            boolean r3 = o1.e.l(r3, r8, r0, r2, r7)
            if (r3 != 0) goto L_0x00d7
            android.graphics.Rect r3 = r5.f3534f
            r3.set(r8, r0, r2, r7)
            r5.M = r1
            r5.j()
        L_0x00d7:
            o1.e r5 = r4.D0
            android.widget.EditText r7 = r4.f2523f
            if (r7 == 0) goto L_0x0182
            android.graphics.Rect r7 = r4.U
            android.text.TextPaint r8 = r5.O
            float r0 = r5.f3538j
            r8.setTextSize(r0)
            android.graphics.Typeface r0 = r5.f3551w
            r8.setTypeface(r0)
            float r0 = r5.W
            r8.setLetterSpacing(r0)
            android.text.TextPaint r8 = r5.O
            float r8 = r8.ascent()
            float r8 = -r8
            int r0 = r6.left
            android.widget.EditText r2 = r4.f2523f
            int r2 = r2.getCompoundPaddingLeft()
            int r2 = r2 + r0
            r7.left = r2
            int r0 = r4.M
            if (r0 != r1) goto L_0x0110
            android.widget.EditText r0 = r4.f2523f
            int r0 = r0.getMinLines()
            if (r0 > r1) goto L_0x0110
            r0 = 1
            goto L_0x0111
        L_0x0110:
            r0 = 0
        L_0x0111:
            if (r0 == 0) goto L_0x011f
            int r0 = r6.centerY()
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r8 / r2
            float r0 = r0 - r2
            int r0 = (int) r0
            goto L_0x0128
        L_0x011f:
            int r0 = r6.top
            android.widget.EditText r2 = r4.f2523f
            int r2 = r2.getCompoundPaddingTop()
            int r0 = r0 + r2
        L_0x0128:
            r7.top = r0
            int r0 = r6.right
            android.widget.EditText r2 = r4.f2523f
            int r2 = r2.getCompoundPaddingRight()
            int r0 = r0 - r2
            r7.right = r0
            int r0 = r4.M
            if (r0 != r1) goto L_0x0143
            android.widget.EditText r0 = r4.f2523f
            int r0 = r0.getMinLines()
            if (r0 > r1) goto L_0x0143
            r0 = 1
            goto L_0x0144
        L_0x0143:
            r0 = 0
        L_0x0144:
            if (r0 == 0) goto L_0x014c
            int r6 = r7.top
            float r6 = (float) r6
            float r6 = r6 + r8
            int r6 = (int) r6
            goto L_0x0155
        L_0x014c:
            int r6 = r6.bottom
            android.widget.EditText r8 = r4.f2523f
            int r8 = r8.getCompoundPaddingBottom()
            int r6 = r6 - r8
        L_0x0155:
            r7.bottom = r6
            int r8 = r7.left
            int r0 = r7.top
            int r7 = r7.right
            android.graphics.Rect r2 = r5.f3533e
            boolean r2 = o1.e.l(r2, r8, r0, r7, r6)
            if (r2 != 0) goto L_0x016f
            android.graphics.Rect r2 = r5.f3533e
            r2.set(r8, r0, r7, r6)
            r5.M = r1
            r5.j()
        L_0x016f:
            o1.e r5 = r4.D0
            r5.k(r9)
            boolean r5 = r4.e()
            if (r5 == 0) goto L_0x018e
            boolean r5 = r4.C0
            if (r5 != 0) goto L_0x018e
            r4.m()
            goto L_0x018e
        L_0x0182:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L_0x0188:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        EditText editText;
        int max;
        super.onMeasure(i2, i3);
        boolean z2 = false;
        if (this.f2523f != null && this.f2523f.getMeasuredHeight() < (max = Math.max(this.f2519d.getMeasuredHeight(), this.f2517c.getMeasuredHeight()))) {
            this.f2523f.setMinimumHeight(max);
            z2 = true;
        }
        boolean u2 = u();
        if (z2 || u2) {
            this.f2523f.post(new c());
        }
        if (!(this.f2553u == null || (editText = this.f2523f) == null)) {
            this.f2553u.setGravity(editText.getGravity());
            this.f2553u.setPadding(this.f2523f.getCompoundPaddingLeft(), this.f2523f.getCompoundPaddingTop(), this.f2523f.getCompoundPaddingRight(), this.f2523f.getCompoundPaddingBottom());
        }
        C();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f3321b);
        setError(hVar.f2570d);
        if (hVar.f2571e) {
            this.f2524f0.post(new b());
        }
        setHint(hVar.f2572f);
        setHelperText(hVar.f2573g);
        setPlaceholderText(hVar.f2574h);
        requestLayout();
    }

    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        boolean z2 = false;
        boolean z3 = i2 == 1;
        boolean z4 = this.K;
        if (z3 != z4) {
            if (z3 && !z4) {
                z2 = true;
            }
            float a2 = this.J.f3962e.a(this.V);
            float a3 = this.J.f3963f.a(this.V);
            float a4 = this.J.f3965h.a(this.V);
            float a5 = this.J.f3964g.a(this.V);
            float f2 = z2 ? a2 : a3;
            if (z2) {
                a2 = a3;
            }
            float f3 = z2 ? a4 : a5;
            if (z2) {
                a4 = a5;
            }
            boolean a6 = s.a(this);
            this.K = a6;
            float f4 = a6 ? a2 : f2;
            if (!a6) {
                f2 = a2;
            }
            float f5 = a6 ? a4 : f3;
            if (!a6) {
                f3 = a4;
            }
            u1.g gVar = this.G;
            if (gVar != null && gVar.m() == f4) {
                u1.g gVar2 = this.G;
                if (gVar2.f3911b.f3935a.f3963f.a(gVar2.i()) == f2) {
                    u1.g gVar3 = this.G;
                    if (gVar3.f3911b.f3935a.f3965h.a(gVar3.i()) == f5) {
                        u1.g gVar4 = this.G;
                        if (gVar4.f3911b.f3935a.f3964g.a(gVar4.i()) == f3) {
                            return;
                        }
                    }
                }
            }
            j jVar = this.J;
            Objects.requireNonNull(jVar);
            j.b bVar = new j.b(jVar);
            bVar.f(f4);
            bVar.g(f2);
            bVar.d(f5);
            bVar.e(f3);
            this.J = bVar.a();
            c();
        }
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f2535l.e()) {
            hVar.f2570d = getError();
        }
        hVar.f2571e = h() && this.f2524f0.isChecked();
        hVar.f2572f = getHint();
        hVar.f2573g = getHelperText();
        hVar.f2574h = getPlaceholderText();
        return hVar;
    }

    public void q(TextView textView, int i2) {
        boolean z2 = true;
        try {
            j0.g.f(textView, i2);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            j0.g.f(textView, 2131755396);
            textView.setTextColor(x.a.a(getContext(), R.color.design_error));
        }
    }

    public final void r() {
        if (this.f2543p != null) {
            EditText editText = this.f2523f;
            s(editText == null ? 0 : editText.getText().length());
        }
    }

    public void s(int i2) {
        boolean z2 = this.f2541o;
        int i3 = this.f2539n;
        String str = null;
        if (i3 == -1) {
            this.f2543p.setText(String.valueOf(i2));
            this.f2543p.setContentDescription((CharSequence) null);
            this.f2541o = false;
        } else {
            this.f2541o = i2 > i3;
            Context context = getContext();
            this.f2543p.setContentDescription(context.getString(this.f2541o ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f2539n)}));
            if (z2 != this.f2541o) {
                t();
            }
            e0.a c2 = e0.a.c();
            TextView textView = this.f2543p;
            String string = getContext().getString(R.string.character_counter_pattern, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f2539n)});
            e0.c cVar = c2.f2907c;
            if (string != null) {
                str = c2.d(string, cVar, true).toString();
            }
            textView.setText(str);
        }
        if (this.f2523f != null && z2 != this.f2541o) {
            z(false, false);
            E();
            v();
        }
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.S != i2) {
            this.S = i2;
            this.f2560x0 = i2;
            this.f2564z0 = i2;
            this.A0 = i2;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(x.a.a(getContext(), i2));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2560x0 = defaultColor;
        this.S = defaultColor;
        this.f2562y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2564z0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.A0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.M) {
            this.M = i2;
            if (this.f2523f != null) {
                l();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i2) {
        this.N = i2;
    }

    public void setBoxStrokeColor(int i2) {
        if (this.f2556v0 != i2) {
            this.f2556v0 = i2;
            E();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (colorStateList.isStateful()) {
            this.f2552t0 = colorStateList.getDefaultColor();
            this.B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2554u0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else {
            if (this.f2556v0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            E();
        }
        this.f2556v0 = defaultColor;
        E();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2558w0 != colorStateList) {
            this.f2558w0 = colorStateList;
            E();
        }
    }

    public void setBoxStrokeWidth(int i2) {
        this.P = i2;
        E();
    }

    public void setBoxStrokeWidthFocused(int i2) {
        this.Q = i2;
        E();
    }

    public void setBoxStrokeWidthFocusedResource(int i2) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i2));
    }

    public void setBoxStrokeWidthResource(int i2) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i2));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2537m != z2) {
            if (z2) {
                d0 d0Var = new d0(getContext(), (AttributeSet) null);
                this.f2543p = d0Var;
                d0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.W;
                if (typeface != null) {
                    this.f2543p.setTypeface(typeface);
                }
                this.f2543p.setMaxLines(1);
                this.f2535l.a(this.f2543p, 2);
                ((ViewGroup.MarginLayoutParams) this.f2543p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                t();
                r();
            } else {
                this.f2535l.j(this.f2543p, 2);
                this.f2543p = null;
            }
            this.f2537m = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f2539n != i2) {
            if (i2 <= 0) {
                i2 = -1;
            }
            this.f2539n = i2;
            if (this.f2537m) {
                r();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f2545q != i2) {
            this.f2545q = i2;
            t();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            t();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f2547r != i2) {
            this.f2547r = i2;
            t();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2563z != colorStateList) {
            this.f2563z = colorStateList;
            t();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2548r0 = colorStateList;
        this.f2550s0 = colorStateList;
        if (this.f2523f != null) {
            z(false, false);
        }
    }

    public void setEnabled(boolean z2) {
        n(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f2524f0.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2524f0.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f2524f0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? e.a.b(getContext(), i2) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f2524f0.setImageDrawable(drawable);
        if (drawable != null) {
            l.a(this, this.f2524f0, this.f2528h0, this.f2530i0);
            o();
        }
    }

    public void setEndIconMode(int i2) {
        int i3 = this.f2520d0;
        if (i3 != i2) {
            this.f2520d0 = i2;
            Iterator it = this.f2526g0.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this, i3);
            }
            setEndIconVisible(i2 != 0);
            if (getEndIconDelegate().b(this.M)) {
                getEndIconDelegate().a();
                l.a(this, this.f2524f0, this.f2528h0, this.f2530i0);
                return;
            }
            StringBuilder a2 = androidx.activity.result.a.a("The current box background mode ");
            a2.append(this.M);
            a2.append(" is not supported by the end icon mode ");
            a2.append(i2);
            throw new IllegalStateException(a2.toString());
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f2524f0;
        View.OnLongClickListener onLongClickListener = this.f2538m0;
        checkableImageButton.setOnClickListener(onClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f2538m0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f2524f0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f2528h0 != colorStateList) {
            this.f2528h0 = colorStateList;
            l.a(this, this.f2524f0, colorStateList, this.f2530i0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f2530i0 != mode) {
            this.f2530i0 = mode;
            l.a(this, this.f2524f0, this.f2528h0, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (j() != z2) {
            this.f2524f0.setVisibility(z2 ? 0 : 8);
            w();
            C();
            u();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f2535l.f4268k) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            m mVar = this.f2535l;
            mVar.c();
            mVar.f4267j = charSequence;
            mVar.f4269l.setText(charSequence);
            int i2 = mVar.f4265h;
            if (i2 != 1) {
                mVar.f4266i = 1;
            }
            mVar.l(i2, mVar.f4266i, mVar.k(mVar.f4269l, charSequence));
            return;
        }
        this.f2535l.i();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        m mVar = this.f2535l;
        mVar.f4270m = charSequence;
        TextView textView = mVar.f4269l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        m mVar = this.f2535l;
        if (mVar.f4268k != z2) {
            mVar.c();
            if (z2) {
                d0 d0Var = new d0(mVar.f4258a, (AttributeSet) null);
                mVar.f4269l = d0Var;
                d0Var.setId(R.id.textinput_error);
                mVar.f4269l.setTextAlignment(5);
                Typeface typeface = mVar.f4278u;
                if (typeface != null) {
                    mVar.f4269l.setTypeface(typeface);
                }
                int i2 = mVar.f4271n;
                mVar.f4271n = i2;
                TextView textView = mVar.f4269l;
                if (textView != null) {
                    mVar.f4259b.q(textView, i2);
                }
                ColorStateList colorStateList = mVar.f4272o;
                mVar.f4272o = colorStateList;
                TextView textView2 = mVar.f4269l;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = mVar.f4270m;
                mVar.f4270m = charSequence;
                TextView textView3 = mVar.f4269l;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                mVar.f4269l.setVisibility(4);
                TextView textView4 = mVar.f4269l;
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                u.g.f(textView4, 1);
                mVar.a(mVar.f4269l, 0);
            } else {
                mVar.i();
                mVar.j(mVar.f4269l, 0);
                mVar.f4269l = null;
                mVar.f4259b.v();
                mVar.f4259b.E();
            }
            mVar.f4268k = z2;
        }
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? e.a.b(getContext(), i2) : null);
        l.c(this, this.f2542o0, this.f2544p0);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2542o0.setImageDrawable(drawable);
        x();
        l.a(this, this.f2542o0, this.f2544p0, this.f2546q0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f2542o0;
        View.OnLongClickListener onLongClickListener = this.f2540n0;
        checkableImageButton.setOnClickListener(onClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f2540n0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f2542o0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f2544p0 != colorStateList) {
            this.f2544p0 = colorStateList;
            l.a(this, this.f2542o0, colorStateList, this.f2546q0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f2546q0 != mode) {
            this.f2546q0 = mode;
            l.a(this, this.f2542o0, this.f2544p0, mode);
        }
    }

    public void setErrorTextAppearance(int i2) {
        m mVar = this.f2535l;
        mVar.f4271n = i2;
        TextView textView = mVar.f4269l;
        if (textView != null) {
            mVar.f4259b.q(textView, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        m mVar = this.f2535l;
        mVar.f4272o = colorStateList;
        TextView textView = mVar.f4269l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.E0 != z2) {
            this.E0 = z2;
            z(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f2535l.f4274q) {
                setHelperTextEnabled(true);
            }
            m mVar = this.f2535l;
            mVar.c();
            mVar.f4273p = charSequence;
            mVar.f4275r.setText(charSequence);
            int i2 = mVar.f4265h;
            if (i2 != 2) {
                mVar.f4266i = 2;
            }
            mVar.l(i2, mVar.f4266i, mVar.k(mVar.f4275r, charSequence));
        } else if (this.f2535l.f4274q) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        m mVar = this.f2535l;
        mVar.f4277t = colorStateList;
        TextView textView = mVar.f4275r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z2) {
        m mVar = this.f2535l;
        if (mVar.f4274q != z2) {
            mVar.c();
            if (z2) {
                d0 d0Var = new d0(mVar.f4258a, (AttributeSet) null);
                mVar.f4275r = d0Var;
                d0Var.setId(R.id.textinput_helper_text);
                mVar.f4275r.setTextAlignment(5);
                Typeface typeface = mVar.f4278u;
                if (typeface != null) {
                    mVar.f4275r.setTypeface(typeface);
                }
                mVar.f4275r.setVisibility(4);
                TextView textView = mVar.f4275r;
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                u.g.f(textView, 1);
                int i2 = mVar.f4276s;
                mVar.f4276s = i2;
                TextView textView2 = mVar.f4275r;
                if (textView2 != null) {
                    j0.g.f(textView2, i2);
                }
                ColorStateList colorStateList = mVar.f4277t;
                mVar.f4277t = colorStateList;
                TextView textView3 = mVar.f4275r;
                if (!(textView3 == null || colorStateList == null)) {
                    textView3.setTextColor(colorStateList);
                }
                mVar.a(mVar.f4275r, 1);
                mVar.f4275r.setAccessibilityDelegate(new n(mVar));
            } else {
                mVar.c();
                int i3 = mVar.f4265h;
                if (i3 == 2) {
                    mVar.f4266i = 0;
                }
                mVar.l(i3, mVar.f4266i, mVar.k(mVar.f4275r, ""));
                mVar.j(mVar.f4275r, 1);
                mVar.f4275r = null;
                mVar.f4259b.v();
                mVar.f4259b.E();
            }
            mVar.f4274q = z2;
        }
    }

    public void setHelperTextTextAppearance(int i2) {
        m mVar = this.f2535l;
        mVar.f4276s = i2;
        TextView textView = mVar.f4275r;
        if (textView != null) {
            j0.g.f(textView, i2);
        }
    }

    public void setHint(int i2) {
        setHint(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.F0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.D) {
            this.D = z2;
            if (!z2) {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.f2523f.getHint())) {
                    this.f2523f.setHint(this.E);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f2523f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.f2523f.setHint((CharSequence) null);
                }
                this.F = true;
            }
            if (this.f2523f != null) {
                y();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        o1.e eVar = this.D0;
        r1.d dVar = new r1.d(eVar.f3525a.getContext(), i2);
        ColorStateList colorStateList = dVar.f3829j;
        if (colorStateList != null) {
            eVar.f3541m = colorStateList;
        }
        float f2 = dVar.f3830k;
        if (f2 != 0.0f) {
            eVar.f3539k = f2;
        }
        ColorStateList colorStateList2 = dVar.f3820a;
        if (colorStateList2 != null) {
            eVar.U = colorStateList2;
        }
        eVar.S = dVar.f3824e;
        eVar.T = dVar.f3825f;
        eVar.R = dVar.f3826g;
        eVar.V = dVar.f3828i;
        r1.a aVar = eVar.A;
        if (aVar != null) {
            aVar.f3819c = true;
        }
        o1.d dVar2 = new o1.d(eVar);
        dVar.a();
        eVar.A = new r1.a(dVar2, dVar.f3833n);
        dVar.c(eVar.f3525a.getContext(), eVar.A);
        eVar.k(false);
        this.f2550s0 = this.D0.f3541m;
        if (this.f2523f != null) {
            z(false, false);
            y();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2550s0 != colorStateList) {
            if (this.f2548r0 == null) {
                o1.e eVar = this.D0;
                if (eVar.f3541m != colorStateList) {
                    eVar.f3541m = colorStateList;
                    eVar.k(false);
                }
            }
            this.f2550s0 = colorStateList;
            if (this.f2523f != null) {
                z(false, false);
            }
        }
    }

    public void setMaxEms(int i2) {
        this.f2529i = i2;
        EditText editText = this.f2523f;
        if (editText != null && i2 != -1) {
            editText.setMaxEms(i2);
        }
    }

    public void setMaxWidth(int i2) {
        this.f2533k = i2;
        EditText editText = this.f2523f;
        if (editText != null && i2 != -1) {
            editText.setMaxWidth(i2);
        }
    }

    public void setMaxWidthResource(int i2) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    public void setMinEms(int i2) {
        this.f2527h = i2;
        EditText editText = this.f2523f;
        if (editText != null && i2 != -1) {
            editText.setMinEms(i2);
        }
    }

    public void setMinWidth(int i2) {
        this.f2531j = i2;
        EditText editText = this.f2523f;
        if (editText != null && i2 != -1) {
            editText.setMinWidth(i2);
        }
    }

    public void setMinWidthResource(int i2) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i2));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2524f0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? e.a.b(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2524f0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.f2520d0 != 1) {
            setEndIconMode(1);
        } else if (!z2) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f2528h0 = colorStateList;
        l.a(this, this.f2524f0, colorStateList, this.f2530i0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f2530i0 = mode;
        l.a(this, this.f2524f0, this.f2528h0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2553u == null) {
            d0 d0Var = new d0(getContext(), (AttributeSet) null);
            this.f2553u = d0Var;
            d0Var.setId(R.id.textinput_placeholder);
            TextView textView = this.f2553u;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.d.s(textView, 2);
            v0.c cVar = new v0.c();
            cVar.f4054d = 87;
            TimeInterpolator timeInterpolator = z0.a.f4419a;
            cVar.f4055e = timeInterpolator;
            this.f2559x = cVar;
            cVar.f4053c = 67;
            v0.c cVar2 = new v0.c();
            cVar2.f4054d = 87;
            cVar2.f4055e = timeInterpolator;
            this.f2561y = cVar2;
            setPlaceholderTextAppearance(this.f2557w);
            setPlaceholderTextColor(this.f2555v);
        }
        int i2 = 0;
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2551t) {
                setPlaceholderTextEnabled(true);
            }
            this.f2549s = charSequence;
        }
        EditText editText = this.f2523f;
        if (editText != null) {
            i2 = editText.getText().length();
        }
        A(i2);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.f2557w = i2;
        TextView textView = this.f2553u;
        if (textView != null) {
            j0.g.f(textView, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2555v != colorStateList) {
            this.f2555v = colorStateList;
            TextView textView = this.f2553u;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f2517c.a(charSequence);
    }

    public void setPrefixTextAppearance(int i2) {
        j0.g.f(this.f2517c.f4291c, i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2517c.f4291c.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2517c.f4293e.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        r rVar = this.f2517c;
        if (rVar.f4293e.getContentDescription() != charSequence) {
            rVar.f4293e.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? e.a.b(getContext(), i2) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2517c.c(drawable);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        r rVar = this.f2517c;
        CheckableImageButton checkableImageButton = rVar.f4293e;
        View.OnLongClickListener onLongClickListener = rVar.f4296h;
        checkableImageButton.setOnClickListener(onClickListener);
        l.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r rVar = this.f2517c;
        rVar.f4296h = onLongClickListener;
        CheckableImageButton checkableImageButton = rVar.f4293e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        l.d(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        r rVar = this.f2517c;
        if (rVar.f4294f != colorStateList) {
            rVar.f4294f = colorStateList;
            l.a(rVar.f4290b, rVar.f4293e, colorStateList, rVar.f4295g);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        r rVar = this.f2517c;
        if (rVar.f4295g != mode) {
            rVar.f4295g = mode;
            l.a(rVar.f4290b, rVar.f4293e, rVar.f4294f, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2517c.f(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.B = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.C.setText(charSequence);
        D();
    }

    public void setSuffixTextAppearance(int i2) {
        j0.g.f(this.C, i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.C.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f2523f;
        if (editText != null) {
            u.u(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.W) {
            this.W = typeface;
            this.D0.r(typeface);
            m mVar = this.f2535l;
            if (typeface != mVar.f4278u) {
                mVar.f4278u = typeface;
                TextView textView = mVar.f4269l;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = mVar.f4275r;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f2543p;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f2543p;
        if (textView != null) {
            q(textView, this.f2541o ? this.f2545q : this.f2547r);
            if (!this.f2541o && (colorStateList2 = this.f2563z) != null) {
                this.f2543p.setTextColor(colorStateList2);
            }
            if (this.f2541o && (colorStateList = this.A) != null) {
                this.f2543p.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0110  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean u() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f2523f
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 1
            if (r0 != 0) goto L_0x001d
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x0027
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0027
        L_0x001d:
            w1.r r0 = r10.f2517c
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            r3 = 0
            r4 = 3
            r5 = 2
            if (r0 == 0) goto L_0x0069
            w1.r r0 = r10.f2517c
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f2523f
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.f2514a0
            if (r6 == 0) goto L_0x0042
            int r6 = r10.f2516b0
            if (r6 == r0) goto L_0x004e
        L_0x0042:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f2514a0 = r6
            r10.f2516b0 = r0
            r6.setBounds(r1, r1, r0, r2)
        L_0x004e:
            android.widget.EditText r0 = r10.f2523f
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.f2514a0
            if (r6 == r7) goto L_0x0067
            android.widget.EditText r6 = r10.f2523f
            r8 = r0[r2]
            r9 = r0[r5]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
        L_0x0065:
            r0 = 1
            goto L_0x0081
        L_0x0067:
            r0 = 0
            goto L_0x0081
        L_0x0069:
            android.graphics.drawable.Drawable r0 = r10.f2514a0
            if (r0 == 0) goto L_0x0067
            android.widget.EditText r0 = r10.f2523f
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.f2523f
            r7 = r0[r2]
            r8 = r0[r5]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r3, r7, r8, r0)
            r10.f2514a0 = r3
            goto L_0x0065
        L_0x0081:
            com.google.android.material.internal.CheckableImageButton r6 = r10.f2542o0
            int r6 = r6.getVisibility()
            if (r6 == 0) goto L_0x0099
            boolean r6 = r10.h()
            if (r6 == 0) goto L_0x0095
            boolean r6 = r10.j()
            if (r6 != 0) goto L_0x0099
        L_0x0095:
            java.lang.CharSequence r6 = r10.B
            if (r6 == 0) goto L_0x00a3
        L_0x0099:
            android.widget.LinearLayout r6 = r10.f2519d
            int r6 = r6.getMeasuredWidth()
            if (r6 <= 0) goto L_0x00a3
            r6 = 1
            goto L_0x00a4
        L_0x00a3:
            r6 = 0
        L_0x00a4:
            if (r6 == 0) goto L_0x0110
            android.widget.TextView r3 = r10.C
            int r3 = r3.getMeasuredWidth()
            android.widget.EditText r6 = r10.f2523f
            int r6 = r6.getPaddingRight()
            int r3 = r3 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00c9
            int r7 = r6.getMeasuredWidth()
            int r7 = r7 + r3
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r3 = r3.getMarginStart()
            int r3 = r3 + r7
        L_0x00c9:
            android.widget.EditText r6 = r10.f2523f
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            android.graphics.drawable.Drawable r7 = r10.f2532j0
            if (r7 == 0) goto L_0x00ea
            int r8 = r10.f2534k0
            if (r8 == r3) goto L_0x00ea
            r10.f2534k0 = r3
            r7.setBounds(r1, r1, r3, r2)
            android.widget.EditText r0 = r10.f2523f
            r1 = r6[r1]
            r3 = r6[r2]
            android.graphics.drawable.Drawable r5 = r10.f2532j0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r5, r4)
            goto L_0x0131
        L_0x00ea:
            if (r7 != 0) goto L_0x00f8
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f2532j0 = r7
            r10.f2534k0 = r3
            r7.setBounds(r1, r1, r3, r2)
        L_0x00f8:
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f2532j0
            if (r3 == r7) goto L_0x010e
            r0 = r6[r5]
            r10.f2536l0 = r0
            android.widget.EditText r0 = r10.f2523f
            r1 = r6[r1]
            r3 = r6[r2]
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L_0x0131
        L_0x010e:
            r2 = r0
            goto L_0x0131
        L_0x0110:
            android.graphics.drawable.Drawable r6 = r10.f2532j0
            if (r6 == 0) goto L_0x0132
            android.widget.EditText r6 = r10.f2523f
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r5 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.f2532j0
            if (r5 != r7) goto L_0x012e
            android.widget.EditText r0 = r10.f2523f
            r1 = r6[r1]
            r5 = r6[r2]
            android.graphics.drawable.Drawable r7 = r10.f2536l0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r5, r7, r4)
            goto L_0x012f
        L_0x012e:
            r2 = r0
        L_0x012f:
            r10.f2532j0 = r3
        L_0x0131:
            r0 = r2
        L_0x0132:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.u():boolean");
    }

    public void v() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f2523f;
        if (editText != null && this.M == 0 && (background = editText.getBackground()) != null) {
            if (i0.a(background)) {
                background = background.mutate();
            }
            if (this.f2535l.e()) {
                currentTextColor = this.f2535l.g();
            } else if (!this.f2541o || (textView = this.f2543p) == null) {
                a0.a.a(background);
                this.f2523f.refreshDrawableState();
                return;
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            background.setColorFilter(androidx.appcompat.widget.k.c(currentTextColor, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void w() {
        int i2 = 8;
        this.f2521e.setVisibility((this.f2524f0.getVisibility() != 0 || k()) ? 8 : 0);
        boolean z2 = j() || k() || ((this.B == null || this.C0) ? (char) 8 : 0) == 0;
        LinearLayout linearLayout = this.f2519d;
        if (z2) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.getErrorIconDrawable()
            r1 = 0
            if (r0 == 0) goto L_0x0015
            w1.m r0 = r3.f2535l
            boolean r2 = r0.f4268k
            if (r2 == 0) goto L_0x0015
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            com.google.android.material.internal.CheckableImageButton r2 = r3.f2542o0
            if (r0 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r1 = 8
        L_0x001d:
            r2.setVisibility(r1)
            r3.w()
            r3.C()
            boolean r0 = r3.h()
            if (r0 != 0) goto L_0x002f
            r3.u()
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.x():void");
    }

    public final void y() {
        if (this.M != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f2515b.getLayoutParams();
            int d2 = d();
            if (d2 != layoutParams.topMargin) {
                layoutParams.topMargin = d2;
                this.f2515b.requestLayout();
            }
        }
    }

    public final void z(boolean z2, boolean z3) {
        o1.e eVar;
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f2523f;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f2523f;
        boolean z5 = editText2 != null && editText2.hasFocus();
        boolean e2 = this.f2535l.e();
        ColorStateList colorStateList2 = this.f2548r0;
        if (colorStateList2 != null) {
            o1.e eVar2 = this.D0;
            if (eVar2.f3541m != colorStateList2) {
                eVar2.f3541m = colorStateList2;
                eVar2.k(false);
            }
            o1.e eVar3 = this.D0;
            ColorStateList colorStateList3 = this.f2548r0;
            if (eVar3.f3540l != colorStateList3) {
                eVar3.f3540l = colorStateList3;
                eVar3.k(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f2548r0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.B0) : this.B0;
            this.D0.m(ColorStateList.valueOf(colorForState));
            o1.e eVar4 = this.D0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (eVar4.f3540l != valueOf) {
                eVar4.f3540l = valueOf;
                eVar4.k(false);
            }
        } else if (e2) {
            o1.e eVar5 = this.D0;
            TextView textView2 = this.f2535l.f4269l;
            eVar5.m(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.f2541o && (textView = this.f2543p) != null) {
                eVar = this.D0;
                colorStateList = textView.getTextColors();
            } else if (z5 && (colorStateList = this.f2550s0) != null) {
                eVar = this.D0;
            }
            eVar.m(colorStateList);
        }
        if (z4 || !this.E0 || (isEnabled() && z5)) {
            if (z3 || this.C0) {
                ValueAnimator valueAnimator = this.G0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.G0.cancel();
                }
                if (!z2 || !this.F0) {
                    this.D0.p(1.0f);
                } else {
                    b(1.0f);
                }
                this.C0 = false;
                if (e()) {
                    m();
                }
                EditText editText3 = this.f2523f;
                A(editText3 == null ? 0 : editText3.getText().length());
                r rVar = this.f2517c;
                rVar.f4297i = false;
                rVar.h();
                D();
            }
        } else if (z3 || !this.C0) {
            ValueAnimator valueAnimator2 = this.G0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.G0.cancel();
            }
            if (!z2 || !this.F0) {
                this.D0.p(0.0f);
            } else {
                b(0.0f);
            }
            if (e() && (!((w1.f) this.G).B.isEmpty()) && e()) {
                ((w1.f) this.G).y(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.C0 = true;
            i();
            r rVar2 = this.f2517c;
            rVar2.f4297i = true;
            rVar2.h();
            D();
        }
    }
}
