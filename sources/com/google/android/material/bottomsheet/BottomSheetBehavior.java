package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import h0.d;
import h0.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import m0.c;
import u1.g;
import u1.j;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int A;
    public int B;
    public int C;
    public float D = 0.5f;
    public int E;
    public float F = -1.0f;
    public boolean G;
    public boolean H;
    public boolean I = true;
    public int J = 4;
    public m0.c K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public WeakReference<V> R;
    public WeakReference<View> S;
    public final ArrayList<c> T = new ArrayList<>();
    public VelocityTracker U;
    public int V;
    public int W;
    public boolean X;
    public Map<View, Integer> Y;
    public int Z = -1;

    /* renamed from: a  reason: collision with root package name */
    public int f2164a = 0;

    /* renamed from: a0  reason: collision with root package name */
    public final c.C0044c f2165a0 = new b();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2166b = true;

    /* renamed from: c  reason: collision with root package name */
    public float f2167c;

    /* renamed from: d  reason: collision with root package name */
    public int f2168d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2169e;

    /* renamed from: f  reason: collision with root package name */
    public int f2170f;

    /* renamed from: g  reason: collision with root package name */
    public int f2171g;

    /* renamed from: h  reason: collision with root package name */
    public g f2172h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f2173i;

    /* renamed from: j  reason: collision with root package name */
    public int f2174j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f2175k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f2176l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2177m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2178n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2179o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2180p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2181q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2182r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2183s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2184t;

    /* renamed from: u  reason: collision with root package name */
    public int f2185u;

    /* renamed from: v  reason: collision with root package name */
    public int f2186v;

    /* renamed from: w  reason: collision with root package name */
    public j f2187w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2188x;

    /* renamed from: y  reason: collision with root package name */
    public final BottomSheetBehavior<V>.e f2189y = new e((a) null);

    /* renamed from: z  reason: collision with root package name */
    public ValueAnimator f2190z;

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2191b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2192c;

        public a(View view, int i2) {
            this.f2191b = view;
            this.f2192c = i2;
        }

        public void run() {
            BottomSheetBehavior.this.E(this.f2191b, this.f2192c, false);
        }
    }

    public class b extends c.C0044c {
        public b() {
        }

        public int a(View view, int i2, int i3) {
            return view.getLeft();
        }

        public int b(View view, int i2, int i3) {
            int x2 = BottomSheetBehavior.this.x();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return c.b.b(i2, x2, bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E);
        }

        public int d(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E;
        }

        public void f(int i2) {
            if (i2 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.I) {
                    bottomSheetBehavior.C(1);
                }
            }
        }

        public void g(View view, int i2, int i3, int i4, int i5) {
            BottomSheetBehavior.this.u(i3);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
            if (java.lang.Math.abs(r5.getTop() - r4.f2194a.x()) < java.lang.Math.abs(r5.getTop() - r4.f2194a.C)) goto L_0x00de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
            if (java.lang.Math.abs(r6 - r4.f2194a.C) < java.lang.Math.abs(r6 - r4.f2194a.E)) goto L_0x00f1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cd, code lost:
            if (java.lang.Math.abs(r6 - r7.B) < java.lang.Math.abs(r6 - r4.f2194a.E)) goto L_0x00de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00dc, code lost:
            if (r6 < java.lang.Math.abs(r6 - r7.E)) goto L_0x00de;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ef, code lost:
            if (java.lang.Math.abs(r6 - r1) < java.lang.Math.abs(r6 - r4.f2194a.E)) goto L_0x00f1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
            if (r6 > r4.f2194a.C) goto L_0x00f6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(android.view.View r5, float r6, float r7) {
            /*
                r4 = this;
                r0 = 1
                r1 = 0
                int r2 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r2 >= 0) goto L_0x0022
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f2166b
                if (r6 == 0) goto L_0x000e
                goto L_0x00de
            L_0x000e:
                int r6 = r5.getTop()
                java.lang.System.currentTimeMillis()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                java.util.Objects.requireNonNull(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.C
                if (r6 <= r7) goto L_0x00de
                goto L_0x00f6
            L_0x0022:
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r3 = r2.G
                if (r3 == 0) goto L_0x0080
                boolean r2 = r2.D(r5, r7)
                if (r2 == 0) goto L_0x0080
                float r6 = java.lang.Math.abs(r6)
                float r1 = java.lang.Math.abs(r7)
                int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r6 >= 0) goto L_0x0040
                r6 = 1140457472(0x43fa0000, float:500.0)
                int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
                if (r6 > 0) goto L_0x0056
            L_0x0040:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r7.Q
                int r7 = r7.x()
                int r7 = r7 + r1
                int r7 = r7 / 2
                if (r6 <= r7) goto L_0x0053
                r6 = 1
                goto L_0x0054
            L_0x0053:
                r6 = 0
            L_0x0054:
                if (r6 == 0) goto L_0x0059
            L_0x0056:
                r6 = 5
                goto L_0x00f9
            L_0x0059:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f2166b
                if (r6 == 0) goto L_0x0061
                goto L_0x00de
            L_0x0061:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.x()
                int r6 = r6 - r7
                int r6 = java.lang.Math.abs(r6)
                int r7 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.C
                int r7 = r7 - r1
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x00f6
                goto L_0x00de
            L_0x0080:
                int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r1 == 0) goto L_0x00b2
                float r6 = java.lang.Math.abs(r6)
                float r7 = java.lang.Math.abs(r7)
                int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                if (r6 <= 0) goto L_0x0091
                goto L_0x00b2
            L_0x0091:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r6.f2166b
                if (r6 == 0) goto L_0x0098
                goto L_0x00f8
            L_0x0098:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r7 = r7.C
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.E
                int r6 = r6 - r1
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x00f8
                goto L_0x00f1
            L_0x00b2:
                int r6 = r5.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r1 = r7.f2166b
                if (r1 == 0) goto L_0x00d0
                int r7 = r7.B
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.E
                int r6 = r6 - r1
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x00f8
                goto L_0x00de
            L_0x00d0:
                int r1 = r7.C
                if (r6 >= r1) goto L_0x00e0
                int r7 = r7.E
                int r7 = r6 - r7
                int r7 = java.lang.Math.abs(r7)
                if (r6 >= r7) goto L_0x00f1
            L_0x00de:
                r6 = 3
                goto L_0x00f9
            L_0x00e0:
                int r7 = r6 - r1
                int r7 = java.lang.Math.abs(r7)
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r1 = r1.E
                int r6 = r6 - r1
                int r6 = java.lang.Math.abs(r6)
                if (r7 >= r6) goto L_0x00f8
            L_0x00f1:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                java.util.Objects.requireNonNull(r6)
            L_0x00f6:
                r6 = 6
                goto L_0x00f9
            L_0x00f8:
                r6 = 4
            L_0x00f9:
                com.google.android.material.bottomsheet.BottomSheetBehavior r7 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                java.util.Objects.requireNonNull(r7)
                r7.E(r5, r6, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.h(android.view.View, float, float):void");
        }

        public boolean i(View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.J;
            if (i3 == 1 || bottomSheetBehavior.X) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.V == i2) {
                WeakReference<View> weakReference = bottomSheetBehavior.S;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.R;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    public static abstract class c {
        public abstract void a(View view, float f2);

        public abstract void b(View view, int i2);
    }

    public static class d extends l0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public final int f2195d;

        /* renamed from: e  reason: collision with root package name */
        public int f2196e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2197f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2198g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2199h;

        public class a implements Parcelable.ClassLoaderCreator<d> {
            public Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i2) {
                return new d[i2];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2195d = parcel.readInt();
            this.f2196e = parcel.readInt();
            boolean z2 = false;
            this.f2197f = parcel.readInt() == 1;
            this.f2198g = parcel.readInt() == 1;
            this.f2199h = parcel.readInt() == 1 ? true : z2;
        }

        public d(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f2195d = bottomSheetBehavior.J;
            this.f2196e = bottomSheetBehavior.f2168d;
            this.f2197f = bottomSheetBehavior.f2166b;
            this.f2198g = bottomSheetBehavior.G;
            this.f2199h = bottomSheetBehavior.H;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3321b, i2);
            parcel.writeInt(this.f2195d);
            parcel.writeInt(this.f2196e);
            parcel.writeInt(this.f2197f ? 1 : 0);
            parcel.writeInt(this.f2198g ? 1 : 0);
            parcel.writeInt(this.f2199h ? 1 : 0);
        }
    }

    public class e {

        /* renamed from: a  reason: collision with root package name */
        public int f2200a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2201b;

        /* renamed from: c  reason: collision with root package name */
        public final Runnable f2202c = new a();

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                e eVar = e.this;
                eVar.f2201b = false;
                m0.c cVar = BottomSheetBehavior.this.K;
                if (cVar == null || !cVar.i(true)) {
                    e eVar2 = e.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.J == 2) {
                        bottomSheetBehavior.C(eVar2.f2200a);
                        return;
                    }
                    return;
                }
                e eVar3 = e.this;
                eVar3.a(eVar3.f2200a);
            }
        }

        public e(a aVar) {
        }

        public void a(int i2) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.R;
            if (weakReference != null && weakReference.get() != null) {
                this.f2200a = i2;
                if (!this.f2201b) {
                    Runnable runnable = this.f2202c;
                    WeakHashMap<View, x> weakHashMap = u.f3063a;
                    u.d.m((View) BottomSheetBehavior.this.R.get(), runnable);
                    this.f2201b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        int i3;
        this.f2171g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.f4365b);
        int i4 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f2173i = r1.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(20)) {
            this.f2187w = j.b(context, attributeSet, R.attr.bottomSheetStyle, 2131755791).a();
        }
        if (this.f2187w != null) {
            g gVar = new g(this.f2187w);
            this.f2172h = gVar;
            gVar.f3911b.f3936b = new l1.a(context);
            gVar.x();
            ColorStateList colorStateList = this.f2173i;
            if (colorStateList != null) {
                this.f2172h.q(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f2172h.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f2190z = ofFloat;
        ofFloat.setDuration(500);
        this.f2190z.addUpdateListener(new c1.a(this));
        this.F = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f2174j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f2175k = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i3 = peekValue.data) != -1) {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            A(i3);
        }
        boolean z2 = obtainStyledAttributes.getBoolean(8, false);
        if (this.G != z2) {
            this.G = z2;
            if (!z2 && this.J == 5) {
                B(4);
            }
            F();
        }
        this.f2177m = obtainStyledAttributes.getBoolean(12, false);
        boolean z3 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f2166b != z3) {
            this.f2166b = z3;
            if (this.R != null) {
                s();
            }
            C((!this.f2166b || this.J != 6) ? this.J : i4);
            F();
        }
        this.H = obtainStyledAttributes.getBoolean(11, false);
        this.I = obtainStyledAttributes.getBoolean(4, true);
        this.f2164a = obtainStyledAttributes.getInt(10, 0);
        float f2 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.D = f2;
        if (this.R != null) {
            this.C = (int) ((1.0f - f2) * ((float) this.Q));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            i2 = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (i2 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            i2 = peekValue2.data;
            if (i2 < 0) {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.A = i2;
        this.f2178n = obtainStyledAttributes.getBoolean(16, false);
        this.f2179o = obtainStyledAttributes.getBoolean(17, false);
        this.f2180p = obtainStyledAttributes.getBoolean(18, false);
        this.f2181q = obtainStyledAttributes.getBoolean(19, true);
        this.f2182r = obtainStyledAttributes.getBoolean(13, false);
        this.f2183s = obtainStyledAttributes.getBoolean(14, false);
        this.f2184t = obtainStyledAttributes.getBoolean(15, false);
        obtainStyledAttributes.recycle();
        this.f2167c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.f2169e
            if (r4 != 0) goto L_0x0015
            r3.f2169e = r0
            goto L_0x001f
        L_0x000c:
            boolean r1 = r3.f2169e
            if (r1 != 0) goto L_0x0017
            int r1 = r3.f2168d
            if (r1 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = 0
            goto L_0x001f
        L_0x0017:
            r3.f2169e = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f2168d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.I(r2)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (g0.u.g.b(r4) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L_0x0074
            r1 = 2
            if (r4 != r1) goto L_0x0008
            goto L_0x0074
        L_0x0008:
            boolean r1 = r3.G
            if (r1 != 0) goto L_0x0026
            r1 = 5
            if (r4 != r1) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot set state: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r4)
            return
        L_0x0026:
            r1 = 6
            if (r4 != r1) goto L_0x0037
            boolean r1 = r3.f2166b
            if (r1 == 0) goto L_0x0037
            int r1 = r3.y(r4)
            int r2 = r3.B
            if (r1 > r2) goto L_0x0037
            r1 = 3
            goto L_0x0038
        L_0x0037:
            r1 = r4
        L_0x0038:
            java.lang.ref.WeakReference<V> r2 = r3.R
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0043
            goto L_0x0070
        L_0x0043:
            java.lang.ref.WeakReference<V> r4 = r3.R
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r4, r1)
            android.view.ViewParent r1 = r4.getParent()
            if (r1 == 0) goto L_0x0065
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L_0x0065
            java.util.WeakHashMap<android.view.View, g0.x> r1 = g0.u.f3063a
            boolean r1 = g0.u.g.b(r4)
            if (r1 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 == 0) goto L_0x006c
            r4.post(r2)
            goto L_0x0073
        L_0x006c:
            r2.run()
            goto L_0x0073
        L_0x0070:
            r3.C(r4)
        L_0x0073:
            return
        L_0x0074:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "STATE_"
            java.lang.StringBuilder r2 = androidx.activity.result.a.a(r2)
            if (r4 != r0) goto L_0x0081
            java.lang.String r4 = "DRAGGING"
            goto L_0x0083
        L_0x0081:
            java.lang.String r4 = "SETTLING"
        L_0x0083:
            r2.append(r4)
            java.lang.String r4 = " should not be set externally."
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.B(int):void");
    }

    public void C(int i2) {
        View view;
        if (this.J != i2) {
            this.J = i2;
            if (!(i2 == 4 || i2 == 3 || i2 == 6)) {
                boolean z2 = this.G;
            }
            WeakReference<V> weakReference = this.R;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i2 == 3) {
                    H(true);
                } else if (i2 == 6 || i2 == 5 || i2 == 4) {
                    H(false);
                }
                G(i2);
                for (int i3 = 0; i3 < this.T.size(); i3++) {
                    this.T.get(i3).b(view, i2);
                }
                F();
            }
        }
    }

    public boolean D(View view, float f2) {
        if (this.H) {
            return true;
        }
        if (view.getTop() < this.E) {
            return false;
        }
        return Math.abs(((f2 * 0.1f) + ((float) view.getTop())) - ((float) this.E)) / ((float) t()) > 0.5f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r4 != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        if (r1.t(r4.getLeft(), r0) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            int r0 = r3.y(r5)
            m0.c r1 = r3.K
            r2 = 0
            if (r1 == 0) goto L_0x0033
            if (r6 == 0) goto L_0x0016
            int r4 = r4.getLeft()
            boolean r4 = r1.t(r4, r0)
            if (r4 == 0) goto L_0x0033
            goto L_0x0032
        L_0x0016:
            int r6 = r4.getLeft()
            r1.f3418r = r4
            r4 = -1
            r1.f3403c = r4
            boolean r4 = r1.l(r6, r0, r2, r2)
            if (r4 != 0) goto L_0x0030
            int r6 = r1.f3401a
            if (r6 != 0) goto L_0x0030
            android.view.View r6 = r1.f3418r
            if (r6 == 0) goto L_0x0030
            r6 = 0
            r1.f3418r = r6
        L_0x0030:
            if (r4 == 0) goto L_0x0033
        L_0x0032:
            r2 = 1
        L_0x0033:
            if (r2 == 0) goto L_0x0042
            r4 = 2
            r3.C(r4)
            r3.G(r5)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r4 = r3.f2189y
            r4.a(r5)
            goto L_0x0045
        L_0x0042:
            r3.C(r5)
        L_0x0045:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        View view;
        d.a aVar;
        int i2;
        WeakReference<V> weakReference = this.R;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            u.r(524288, view);
            u.m(view, 0);
            u.r(262144, view);
            u.m(view, 0);
            u.r(1048576, view);
            u.m(view, 0);
            int i3 = this.Z;
            if (i3 != -1) {
                u.r(i3, view);
                u.m(view, 0);
            }
            int i4 = 6;
            if (!this.f2166b && this.J != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                c1.c cVar = new c1.c(this, 6);
                List<d.a> j2 = u.j(view);
                int i5 = 0;
                while (true) {
                    if (i5 >= j2.size()) {
                        int i6 = -1;
                        int i7 = 0;
                        while (true) {
                            int[] iArr = u.f3067e;
                            if (i7 >= iArr.length || i6 != -1) {
                                i2 = i6;
                            } else {
                                int i8 = iArr[i7];
                                boolean z2 = true;
                                for (int i9 = 0; i9 < j2.size(); i9++) {
                                    z2 &= j2.get(i9).a() != i8;
                                }
                                if (z2) {
                                    i6 = i8;
                                }
                                i7++;
                            }
                        }
                        i2 = i6;
                    } else if (TextUtils.equals(string, j2.get(i5).b())) {
                        i2 = j2.get(i5).a();
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i2 != -1) {
                    u.a(view, new d.a((Object) null, i2, string, cVar, (Class<? extends f.a>) null));
                }
                this.Z = i2;
            }
            if (this.G && this.J != 5) {
                z(view, d.a.f3168j, 5);
            }
            int i10 = this.J;
            if (i10 == 3) {
                if (this.f2166b) {
                    i4 = 4;
                }
                aVar = d.a.f3167i;
            } else if (i10 == 4) {
                if (this.f2166b) {
                    i4 = 3;
                }
                aVar = d.a.f3166h;
            } else if (i10 == 6) {
                z(view, d.a.f3167i, 4);
                z(view, d.a.f3166h, 3);
                return;
            } else {
                return;
            }
            z(view, aVar, i4);
        }
    }

    public final void G(int i2) {
        ValueAnimator valueAnimator;
        if (i2 != 2) {
            boolean z2 = i2 == 3;
            if (this.f2188x != z2) {
                this.f2188x = z2;
                if (this.f2172h != null && (valueAnimator = this.f2190z) != null) {
                    if (valueAnimator.isRunning()) {
                        this.f2190z.reverse();
                        return;
                    }
                    float f2 = z2 ? 0.0f : 1.0f;
                    this.f2190z.setFloatValues(new float[]{1.0f - f2, f2});
                    this.f2190z.start();
                }
            }
        }
    }

    public final void H(boolean z2) {
        WeakReference<V> weakReference = this.R;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z2) {
                    if (this.Y == null) {
                        this.Y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (childAt != this.R.get() && z2) {
                        this.Y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z2) {
                    this.Y = null;
                }
            }
        }
    }

    public final void I(boolean z2) {
        View view;
        if (this.R != null) {
            s();
            if (this.J == 4 && (view = (View) this.R.get()) != null) {
                if (z2) {
                    B(4);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    public void c(CoordinatorLayout.f fVar) {
        this.R = null;
        this.K = null;
    }

    public void f() {
        this.R = null;
        this.K = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00d8
            boolean r0 = r9.I
            if (r0 != 0) goto L_0x000e
            goto L_0x00d8
        L_0x000e:
            int r0 = r12.getActionMasked()
            r3 = 0
            r4 = -1
            if (r0 != 0) goto L_0x0021
            r9.V = r4
            android.view.VelocityTracker r5 = r9.U
            if (r5 == 0) goto L_0x0021
            r5.recycle()
            r9.U = r3
        L_0x0021:
            android.view.VelocityTracker r5 = r9.U
            if (r5 != 0) goto L_0x002b
            android.view.VelocityTracker r5 = android.view.VelocityTracker.obtain()
            r9.U = r5
        L_0x002b:
            android.view.VelocityTracker r5 = r9.U
            r5.addMovement(r12)
            r5 = 2
            if (r0 == 0) goto L_0x0044
            if (r0 == r2) goto L_0x0039
            r11 = 3
            if (r0 == r11) goto L_0x0039
            goto L_0x0087
        L_0x0039:
            r9.X = r1
            r9.V = r4
            boolean r11 = r9.L
            if (r11 == 0) goto L_0x0087
            r9.L = r1
            return r1
        L_0x0044:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.W = r7
            int r7 = r9.J
            if (r7 == r5) goto L_0x0076
            java.lang.ref.WeakReference<android.view.View> r7 = r9.S
            if (r7 == 0) goto L_0x005f
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L_0x0060
        L_0x005f:
            r7 = r3
        L_0x0060:
            if (r7 == 0) goto L_0x0076
            int r8 = r9.W
            boolean r7 = r10.p(r7, r6, r8)
            if (r7 == 0) goto L_0x0076
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.V = r7
            r9.X = r2
        L_0x0076:
            int r7 = r9.V
            if (r7 != r4) goto L_0x0084
            int r4 = r9.W
            boolean r11 = r10.p(r11, r6, r4)
            if (r11 != 0) goto L_0x0084
            r11 = 1
            goto L_0x0085
        L_0x0084:
            r11 = 0
        L_0x0085:
            r9.L = r11
        L_0x0087:
            boolean r11 = r9.L
            if (r11 != 0) goto L_0x0096
            m0.c r11 = r9.K
            if (r11 == 0) goto L_0x0096
            boolean r11 = r11.u(r12)
            if (r11 == 0) goto L_0x0096
            return r2
        L_0x0096:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.S
            if (r11 == 0) goto L_0x00a1
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L_0x00a1:
            if (r0 != r5) goto L_0x00d7
            if (r3 == 0) goto L_0x00d7
            boolean r11 = r9.L
            if (r11 != 0) goto L_0x00d7
            int r11 = r9.J
            if (r11 == r2) goto L_0x00d7
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.p(r3, r11, r0)
            if (r10 != 0) goto L_0x00d7
            m0.c r10 = r9.K
            if (r10 == 0) goto L_0x00d7
            int r10 = r9.W
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            m0.c r11 = r9.K
            int r11 = r11.f3402b
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d7
            r1 = 1
        L_0x00d7:
            return r1
        L_0x00d8:
            r9.L = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.g(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:83:0x0164 A[LOOP:0: B:81:0x015c->B:83:0x0164, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r11, V r12, int r13) {
        /*
            r10 = this;
            java.util.WeakHashMap<android.view.View, g0.x> r0 = g0.u.f3063a
            boolean r0 = g0.u.d.b(r11)
            r1 = 1
            if (r0 == 0) goto L_0x0012
            boolean r0 = g0.u.d.b(r12)
            if (r0 != 0) goto L_0x0012
            r12.setFitsSystemWindows(r1)
        L_0x0012:
            java.lang.ref.WeakReference<V> r0 = r10.R
            r2 = 3
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 != 0) goto L_0x00ce
            android.content.res.Resources r0 = r11.getResources()
            r5 = 2131099759(0x7f06006f, float:1.781188E38)
            int r0 = r0.getDimensionPixelSize(r5)
            r10.f2170f = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L_0x0037
            boolean r0 = r10.f2177m
            if (r0 != 0) goto L_0x0037
            boolean r0 = r10.f2169e
            if (r0 != 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            boolean r5 = r10.f2178n
            if (r5 != 0) goto L_0x0053
            boolean r5 = r10.f2179o
            if (r5 != 0) goto L_0x0053
            boolean r5 = r10.f2180p
            if (r5 != 0) goto L_0x0053
            boolean r5 = r10.f2182r
            if (r5 != 0) goto L_0x0053
            boolean r5 = r10.f2183s
            if (r5 != 0) goto L_0x0053
            boolean r5 = r10.f2184t
            if (r5 != 0) goto L_0x0053
            if (r0 != 0) goto L_0x0053
            goto L_0x0087
        L_0x0053:
            c1.b r5 = new c1.b
            r5.<init>(r10, r0)
            o1.s$b r0 = new o1.s$b
            int r6 = g0.u.e.f(r12)
            int r7 = r12.getPaddingTop()
            int r8 = g0.u.e.e(r12)
            int r9 = r12.getPaddingBottom()
            r0.<init>(r6, r7, r8, r9)
            o1.q r6 = new o1.q
            r6.<init>(r5, r0)
            g0.u.i.u(r12, r6)
            boolean r0 = g0.u.g.b(r12)
            if (r0 == 0) goto L_0x007f
            g0.u.h.c(r12)
            goto L_0x0087
        L_0x007f:
            o1.r r0 = new o1.r
            r0.<init>()
            r12.addOnAttachStateChangeListener(r0)
        L_0x0087:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r12)
            r10.R = r0
            u1.g r0 = r10.f2172h
            if (r0 == 0) goto L_0x00bb
            g0.u.d.q(r12, r0)
            u1.g r0 = r10.f2172h
            float r5 = r10.F
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x00a3
            float r5 = g0.u.i.i(r12)
        L_0x00a3:
            r0.p(r5)
            int r0 = r10.J
            if (r0 != r2) goto L_0x00ac
            r0 = 1
            goto L_0x00ad
        L_0x00ac:
            r0 = 0
        L_0x00ad:
            r10.f2188x = r0
            u1.g r5 = r10.f2172h
            if (r0 == 0) goto L_0x00b5
            r0 = 0
            goto L_0x00b7
        L_0x00b5:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x00b7:
            r5.r(r0)
            goto L_0x00c2
        L_0x00bb:
            android.content.res.ColorStateList r0 = r10.f2173i
            if (r0 == 0) goto L_0x00c2
            g0.u.w(r12, r0)
        L_0x00c2:
            r10.F()
            int r0 = g0.u.d.c(r12)
            if (r0 != 0) goto L_0x00ce
            g0.u.d.s(r12, r1)
        L_0x00ce:
            m0.c r0 = r10.K
            if (r0 != 0) goto L_0x00df
            m0.c$c r0 = r10.f2165a0
            m0.c r5 = new m0.c
            android.content.Context r6 = r11.getContext()
            r5.<init>(r6, r11, r0)
            r10.K = r5
        L_0x00df:
            int r0 = r12.getTop()
            r11.r(r12, r13)
            int r13 = r11.getWidth()
            r10.P = r13
            int r11 = r11.getHeight()
            r10.Q = r11
            int r11 = r12.getHeight()
            r10.O = r11
            int r13 = r10.Q
            int r11 = r13 - r11
            int r5 = r10.f2186v
            if (r11 >= r5) goto L_0x010b
            boolean r11 = r10.f2181q
            if (r11 == 0) goto L_0x0107
            r10.O = r13
            goto L_0x010b
        L_0x0107:
            int r11 = r13 - r5
            r10.O = r11
        L_0x010b:
            int r11 = r10.O
            int r13 = r13 - r11
            int r11 = java.lang.Math.max(r4, r13)
            r10.B = r11
            int r11 = r10.Q
            float r11 = (float) r11
            float r13 = r10.D
            float r3 = r3 - r13
            float r3 = r3 * r11
            int r11 = (int) r3
            r10.C = r11
            r10.s()
            int r11 = r10.J
            if (r11 != r2) goto L_0x012b
            int r11 = r10.x()
            goto L_0x0140
        L_0x012b:
            r13 = 6
            if (r11 != r13) goto L_0x0131
            int r11 = r10.C
            goto L_0x0140
        L_0x0131:
            boolean r13 = r10.G
            if (r13 == 0) goto L_0x013b
            r13 = 5
            if (r11 != r13) goto L_0x013b
            int r11 = r10.Q
            goto L_0x0140
        L_0x013b:
            r13 = 4
            if (r11 != r13) goto L_0x0144
            int r11 = r10.E
        L_0x0140:
            g0.u.o(r12, r11)
            goto L_0x0151
        L_0x0144:
            if (r11 == r1) goto L_0x0149
            r13 = 2
            if (r11 != r13) goto L_0x0151
        L_0x0149:
            int r11 = r12.getTop()
            int r0 = r0 - r11
            g0.u.o(r12, r0)
        L_0x0151:
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            android.view.View r12 = r10.v(r12)
            r11.<init>(r12)
            r10.S = r11
        L_0x015c:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$c> r11 = r10.T
            int r11 = r11.size()
            if (r4 >= r11) goto L_0x0172
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$c> r11 = r10.T
            java.lang.Object r11 = r11.get(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior$c r11 = (com.google.android.material.bottomsheet.BottomSheetBehavior.c) r11
            java.util.Objects.requireNonNull(r11)
            int r4 = r4 + 1
            goto L_0x015c
        L_0x0172:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    public boolean i(CoordinatorLayout coordinatorLayout, V v2, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v2.getLayoutParams();
        v2.measure(w(i2, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f2174j, marginLayoutParams.width), w(i4, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, this.f2175k, marginLayoutParams.height));
        return true;
    }

    public boolean j(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.S;
        return (weakReference == null || view != weakReference.get() || this.J == 3) ? false : true;
    }

    public void k(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        if (i4 != 1) {
            WeakReference<View> weakReference = this.S;
            if (view == (weakReference != null ? (View) weakReference.get() : null)) {
                int top = v2.getTop();
                int i6 = top - i3;
                if (i3 <= 0) {
                    if (i3 < 0 && !view.canScrollVertically(-1)) {
                        int i7 = this.E;
                        if (i6 > i7 && !this.G) {
                            iArr[1] = top - i7;
                            u.o(v2, -iArr[1]);
                            i5 = 4;
                        } else if (this.I) {
                            iArr[1] = i3;
                            u.o(v2, -i3);
                            C(1);
                        } else {
                            return;
                        }
                    }
                    u(v2.getTop());
                    this.M = i3;
                    this.N = true;
                } else if (i6 < x()) {
                    iArr[1] = top - x();
                    u.o(v2, -iArr[1]);
                    i5 = 3;
                } else if (this.I) {
                    iArr[1] = i3;
                    u.o(v2, -i3);
                    C(1);
                    u(v2.getTop());
                    this.M = i3;
                    this.N = true;
                } else {
                    return;
                }
                C(i5);
                u(v2.getTop());
                this.M = i3;
                this.N = true;
            }
        }
    }

    public void l(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    public void n(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i2 = this.f2164a;
        if (i2 != 0) {
            if (i2 == -1 || (i2 & 1) == 1) {
                this.f2168d = dVar.f2196e;
            }
            if (i2 == -1 || (i2 & 2) == 2) {
                this.f2166b = dVar.f2197f;
            }
            if (i2 == -1 || (i2 & 4) == 4) {
                this.G = dVar.f2198g;
            }
            if (i2 == -1 || (i2 & 8) == 8) {
                this.H = dVar.f2199h;
            }
        }
        int i3 = dVar.f2195d;
        if (i3 == 1 || i3 == 2) {
            this.J = 4;
        } else {
            this.J = i3;
        }
    }

    public Parcelable o(CoordinatorLayout coordinatorLayout, V v2) {
        return new d((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    public boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
        this.M = 0;
        this.N = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r3.getTop() <= r1.C) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (java.lang.Math.abs(r2 - r1.B) < java.lang.Math.abs(r2 - r1.E)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        if (r2 < java.lang.Math.abs(r2 - r1.E)) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.E)) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        if (java.lang.Math.abs(r2 - r1.C) < java.lang.Math.abs(r2 - r1.E)) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.x()
            r0 = 3
            if (r2 != r5) goto L_0x000f
            r1.C(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r2 = r1.S
            if (r2 == 0) goto L_0x00b4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto L_0x00b4
            boolean r2 = r1.N
            if (r2 != 0) goto L_0x001f
            goto L_0x00b4
        L_0x001f:
            int r2 = r1.M
            if (r2 <= 0) goto L_0x0033
            boolean r2 = r1.f2166b
            if (r2 == 0) goto L_0x0029
            goto L_0x00ae
        L_0x0029:
            int r2 = r3.getTop()
            int r4 = r1.C
            if (r2 <= r4) goto L_0x00ae
            goto L_0x00ab
        L_0x0033:
            boolean r2 = r1.G
            if (r2 == 0) goto L_0x0054
            android.view.VelocityTracker r2 = r1.U
            if (r2 != 0) goto L_0x003d
            r2 = 0
            goto L_0x004c
        L_0x003d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.f2167c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.U
            int r4 = r1.V
            float r2 = r2.getYVelocity(r4)
        L_0x004c:
            boolean r2 = r1.D(r3, r2)
            if (r2 == 0) goto L_0x0054
            r0 = 5
            goto L_0x00ae
        L_0x0054:
            int r2 = r1.M
            if (r2 != 0) goto L_0x0091
            int r2 = r3.getTop()
            boolean r4 = r1.f2166b
            if (r4 == 0) goto L_0x0072
            int r4 = r1.B
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L_0x00ad
            goto L_0x00ae
        L_0x0072:
            int r4 = r1.C
            if (r2 >= r4) goto L_0x0081
            int r4 = r1.E
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto L_0x00ab
            goto L_0x00ae
        L_0x0081:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L_0x00ad
            goto L_0x00ab
        L_0x0091:
            boolean r2 = r1.f2166b
            if (r2 == 0) goto L_0x0096
            goto L_0x00ad
        L_0x0096:
            int r2 = r3.getTop()
            int r4 = r1.C
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.E
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto L_0x00ad
        L_0x00ab:
            r0 = 6
            goto L_0x00ae
        L_0x00ad:
            r0 = 4
        L_0x00ae:
            r2 = 0
            r1.E(r3, r0, r2)
            r1.N = r2
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z2 = false;
        if (!v2.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = this.J;
        if (i2 == 1 && actionMasked == 0) {
            return true;
        }
        m0.c cVar = this.K;
        if (cVar != null && (this.I || i2 == 1)) {
            cVar.n(motionEvent);
        }
        if (actionMasked == 0) {
            this.V = -1;
            VelocityTracker velocityTracker = this.U;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.U = null;
            }
        }
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        if (this.K != null && (this.I || this.J == 1)) {
            z2 = true;
        }
        if (z2 && actionMasked == 2 && !this.L) {
            float abs = Math.abs(((float) this.W) - motionEvent.getY());
            m0.c cVar2 = this.K;
            if (abs > ((float) cVar2.f3402b)) {
                cVar2.b(v2, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.L;
    }

    public final void s() {
        int t2 = t();
        if (this.f2166b) {
            this.E = Math.max(this.Q - t2, this.B);
        } else {
            this.E = this.Q - t2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r3.f2176l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int t() {
        /*
            r3 = this;
            boolean r0 = r3.f2169e
            if (r0 == 0) goto L_0x001d
            int r0 = r3.f2170f
            int r1 = r3.Q
            int r2 = r3.P
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.O
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.f2185u
            int r0 = r0 + r1
            return r0
        L_0x001d:
            boolean r0 = r3.f2177m
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.f2178n
            if (r0 != 0) goto L_0x0033
            int r0 = r3.f2176l
            if (r0 <= 0) goto L_0x0033
            int r1 = r3.f2168d
            int r2 = r3.f2171g
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0033:
            int r0 = r3.f2168d
            int r1 = r3.f2185u
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.t():int");
    }

    public void u(int i2) {
        float f2;
        float f3;
        View view = (View) this.R.get();
        if (view != null && !this.T.isEmpty()) {
            int i3 = this.E;
            if (i2 > i3 || i3 == x()) {
                int i4 = this.E;
                f2 = (float) (i4 - i2);
                f3 = (float) (this.Q - i4);
            } else {
                int i5 = this.E;
                f2 = (float) (i5 - i2);
                f3 = (float) (i5 - x());
            }
            float f4 = f2 / f3;
            for (int i6 = 0; i6 < this.T.size(); i6++) {
                this.T.get(i6).a(view, f4);
            }
        }
    }

    public View v(View view) {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (u.i.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View v2 = v(viewGroup.getChildAt(i2));
            if (v2 != null) {
                return v2;
            }
        }
        return null;
    }

    public final int w(int i2, int i3, int i4, int i5) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i5);
        if (i4 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i4), 1073741824);
        }
        if (size != 0) {
            i4 = Math.min(size, i4);
        }
        return View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
    }

    public int x() {
        if (this.f2166b) {
            return this.B;
        }
        return Math.max(this.A, this.f2181q ? 0 : this.f2186v);
    }

    public final int y(int i2) {
        if (i2 == 3) {
            return x();
        }
        if (i2 == 4) {
            return this.E;
        }
        if (i2 == 5) {
            return this.Q;
        }
        if (i2 == 6) {
            return this.C;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i2);
    }

    public final void z(V v2, d.a aVar, int i2) {
        u.s(v2, aVar, (CharSequence) null, new c1.c(this, i2));
    }
}
