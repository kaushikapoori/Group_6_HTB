package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.example.supermarket.R;
import g0.h;
import g0.u;
import g0.x;
import h0.d;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import u1.g;

public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {

    /* renamed from: b  reason: collision with root package name */
    public int f2090b;

    /* renamed from: c  reason: collision with root package name */
    public int f2091c;

    /* renamed from: d  reason: collision with root package name */
    public int f2092d;

    /* renamed from: e  reason: collision with root package name */
    public int f2093e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2094f;

    /* renamed from: g  reason: collision with root package name */
    public int f2095g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2096h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2097i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2098j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2099k;

    /* renamed from: l  reason: collision with root package name */
    public int f2100l;

    /* renamed from: m  reason: collision with root package name */
    public WeakReference<View> f2101m;

    /* renamed from: n  reason: collision with root package name */
    public ValueAnimator f2102n;

    /* renamed from: o  reason: collision with root package name */
    public int[] f2103o;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f2104p;

    /* renamed from: q  reason: collision with root package name */
    public Behavior f2105q;

    public static class BaseBehavior<T extends AppBarLayout> extends a1.b<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f2106j;

        /* renamed from: k  reason: collision with root package name */
        public int f2107k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f2108l;

        /* renamed from: m  reason: collision with root package name */
        public b f2109m;

        /* renamed from: n  reason: collision with root package name */
        public WeakReference<View> f2110n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f2111o;

        public class a extends g0.a {
            public a() {
            }

            public void d(View view, d dVar) {
                this.f2994a.onInitializeAccessibilityNodeInfo(view, dVar.f3160a);
                dVar.f3160a.setScrollable(BaseBehavior.this.f2111o);
                dVar.f3160a.setClassName(ScrollView.class.getName());
            }
        }

        public static class b extends l0.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: d  reason: collision with root package name */
            public boolean f2113d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f2114e;

            /* renamed from: f  reason: collision with root package name */
            public int f2115f;

            /* renamed from: g  reason: collision with root package name */
            public float f2116g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f2117h;

            public class a implements Parcelable.ClassLoaderCreator<b> {
                public Object createFromParcel(Parcel parcel) {
                    return new b(parcel, (ClassLoader) null);
                }

                public Object[] newArray(int i2) {
                    return new b[i2];
                }

                public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z2 = true;
                this.f2113d = parcel.readByte() != 0;
                this.f2114e = parcel.readByte() != 0;
                this.f2115f = parcel.readInt();
                this.f2116g = parcel.readFloat();
                this.f2117h = parcel.readByte() == 0 ? false : z2;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeParcelable(this.f3321b, i2);
                parcel.writeByte(this.f2113d ? (byte) 1 : 0);
                parcel.writeByte(this.f2114e ? (byte) 1 : 0);
                parcel.writeInt(this.f2115f);
                parcel.writeFloat(this.f2116g);
                parcel.writeByte(this.f2117h ? (byte) 1 : 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static boolean A(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        public final View B(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt instanceof h) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public void C(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2, int[] iArr) {
            int i3;
            int i4;
            if (i2 != 0) {
                if (i2 < 0) {
                    int i5 = -appBarLayout.getTotalScrollRange();
                    i4 = i5;
                    i3 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i4 = -appBarLayout.getUpNestedPreScrollRange();
                    i3 = 0;
                }
                if (i4 != i3) {
                    iArr[1] = w(coordinatorLayout, appBarLayout, i2, i4, i3);
                }
            }
            if (appBarLayout.f2099k) {
                appBarLayout.d(appBarLayout.e(view));
            }
        }

        public b D(Parcelable parcelable, T t2) {
            int s2 = s();
            int childCount = t2.getChildCount();
            boolean z2 = false;
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = t2.getChildAt(i2);
                int bottom = childAt.getBottom() + s2;
                if (childAt.getTop() + s2 > 0 || bottom < 0) {
                    i2++;
                } else {
                    if (parcelable == null) {
                        parcelable = l0.a.f3320c;
                    }
                    b bVar = new b(parcelable);
                    boolean z3 = s2 == 0;
                    bVar.f2114e = z3;
                    bVar.f2113d = !z3 && (-s2) >= t2.getTotalScrollRange();
                    bVar.f2115f = i2;
                    WeakHashMap<View, x> weakHashMap = u.f3063a;
                    if (bottom == t2.getTopInset() + u.d.d(childAt)) {
                        z2 = true;
                    }
                    bVar.f2117h = z2;
                    bVar.f2116g = ((float) bottom) / ((float) childAt.getHeight());
                    return bVar;
                }
            }
            return null;
        }

        public final void E(CoordinatorLayout coordinatorLayout, T t2) {
            int paddingTop = t2.getPaddingTop() + t2.getTopInset();
            int v2 = v() - paddingTop;
            int childCount = t2.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    i2 = -1;
                    break;
                }
                View childAt = t2.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (A(cVar.f2120a, 32)) {
                    top -= cVar.topMargin;
                    bottom += cVar.bottomMargin;
                }
                int i3 = -v2;
                if (top <= i3 && bottom >= i3) {
                    break;
                }
                i2++;
            }
            if (i2 >= 0) {
                View childAt2 = t2.getChildAt(i2);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i4 = cVar2.f2120a;
                if ((i4 & 17) == 17) {
                    int i5 = -childAt2.getTop();
                    int i6 = -childAt2.getBottom();
                    if (i2 == 0) {
                        WeakHashMap<View, x> weakHashMap = u.f3063a;
                        if (u.d.b(t2) && u.d.b(childAt2)) {
                            i5 -= t2.getTopInset();
                        }
                    }
                    if (A(i4, 2)) {
                        WeakHashMap<View, x> weakHashMap2 = u.f3063a;
                        i6 += u.d.d(childAt2);
                    } else if (A(i4, 5)) {
                        WeakHashMap<View, x> weakHashMap3 = u.f3063a;
                        int d2 = u.d.d(childAt2) + i6;
                        if (v2 < d2) {
                            i5 = d2;
                        } else {
                            i6 = d2;
                        }
                    }
                    if (A(i4, 32)) {
                        i5 += cVar2.topMargin;
                        i6 -= cVar2.bottomMargin;
                    }
                    if (v2 < (i6 + i5) / 2) {
                        i5 = i6;
                    }
                    z(coordinatorLayout, t2, c.b.b(i5 + paddingTop, -t2.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void F(CoordinatorLayout coordinatorLayout, T t2) {
            View view;
            boolean z2;
            boolean z3;
            u.r(d.a.f3164f.a(), coordinatorLayout);
            boolean z4 = false;
            u.m(coordinatorLayout, 0);
            u.r(d.a.f3165g.a(), coordinatorLayout);
            u.m(coordinatorLayout, 0);
            if (t2.getTotalScrollRange() != 0) {
                int childCount = coordinatorLayout.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        view = null;
                        break;
                    }
                    View childAt = coordinatorLayout.getChildAt(i2);
                    if (((CoordinatorLayout.f) childAt.getLayoutParams()).f1058a instanceof ScrollingViewBehavior) {
                        view = childAt;
                        break;
                    }
                    i2++;
                }
                if (view != null) {
                    int childCount2 = t2.getChildCount();
                    int i3 = 0;
                    while (true) {
                        z2 = true;
                        if (i3 >= childCount2) {
                            z3 = false;
                            break;
                        } else if (((c) t2.getChildAt(i3).getLayoutParams()).f2120a != 0) {
                            z3 = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (z3) {
                        if (!(u.h(coordinatorLayout) != null)) {
                            u.u(coordinatorLayout, new a());
                        }
                        if (v() != (-t2.getTotalScrollRange())) {
                            u.s(coordinatorLayout, d.a.f3164f, (CharSequence) null, new c(this, t2, false));
                            z4 = true;
                        }
                        if (v() != 0) {
                            if (view.canScrollVertically(-1)) {
                                int i4 = -t2.getDownNestedPreScrollRange();
                                if (i4 != 0) {
                                    u.s(coordinatorLayout, d.a.f3165g, (CharSequence) null, new b(this, coordinatorLayout, t2, view, i4));
                                }
                            } else {
                                u.s(coordinatorLayout, d.a.f3165g, (CharSequence) null, new c(this, t2, true));
                            }
                            this.f2111o = z2;
                        }
                        z2 = z4;
                        this.f2111o = z2;
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void G(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = 0
            L_0x000a:
                if (r3 >= r1) goto L_0x0020
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L_0x001d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L_0x001d
                goto L_0x0021
            L_0x001d:
                int r3 = r3 + 1
                goto L_0x000a
            L_0x0020:
                r4 = 0
            L_0x0021:
                r0 = 1
                if (r4 == 0) goto L_0x005d
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.f2120a
                r3 = r1 & 1
                if (r3 == 0) goto L_0x005d
                java.util.WeakHashMap<android.view.View, g0.x> r3 = g0.u.f3063a
                int r3 = g0.u.d.d(r4)
                if (r10 <= 0) goto L_0x004a
                r10 = r1 & 12
                if (r10 == 0) goto L_0x004a
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005d
                goto L_0x005b
            L_0x004a:
                r10 = r1 & 2
                if (r10 == 0) goto L_0x005d
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L_0x005d
            L_0x005b:
                r9 = 1
                goto L_0x005e
            L_0x005d:
                r9 = 0
            L_0x005e:
                boolean r10 = r8.f2099k
                if (r10 == 0) goto L_0x006a
                android.view.View r9 = r6.B(r7)
                boolean r9 = r8.e(r9)
            L_0x006a:
                boolean r9 = r8.d(r9)
                if (r11 != 0) goto L_0x009c
                if (r9 == 0) goto L_0x009f
                java.util.List r7 = r7.e(r8)
                int r9 = r7.size()
                r10 = 0
            L_0x007b:
                if (r10 >= r9) goto L_0x009a
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f1058a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L_0x0097
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f33f
                if (r7 == 0) goto L_0x009a
                r2 = 1
                goto L_0x009a
            L_0x0097:
                int r10 = r10 + 1
                goto L_0x007b
            L_0x009a:
                if (r2 == 0) goto L_0x009f
            L_0x009c:
                r8.jumpDrawablesToCurrentState()
            L_0x009f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.G(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r8, android.view.View r9, int r10) {
            /*
                r7 = this;
                com.google.android.material.appbar.AppBarLayout r9 = (com.google.android.material.appbar.AppBarLayout) r9
                super.h(r8, r9, r10)
                int r10 = r9.getPendingAction()
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$b r0 = r7.f2109m
                r6 = 1
                r1 = 0
                if (r0 == 0) goto L_0x0053
                r2 = r10 & 8
                if (r2 != 0) goto L_0x0053
                boolean r10 = r0.f2113d
                if (r10 == 0) goto L_0x001d
                int r10 = r9.getTotalScrollRange()
                int r10 = -r10
                goto L_0x006c
            L_0x001d:
                boolean r10 = r0.f2114e
                if (r10 == 0) goto L_0x0022
                goto L_0x0079
            L_0x0022:
                int r10 = r0.f2115f
                android.view.View r10 = r9.getChildAt(r10)
                int r0 = r10.getBottom()
                int r0 = -r0
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$b r2 = r7.f2109m
                boolean r2 = r2.f2117h
                if (r2 == 0) goto L_0x003e
                int r10 = g0.u.d.d(r10)
                int r2 = r9.getTopInset()
                int r2 = r2 + r10
                int r2 = r2 + r0
                goto L_0x004f
            L_0x003e:
                int r10 = r10.getHeight()
                float r10 = (float) r10
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$b r2 = r7.f2109m
                float r2 = r2.f2116g
                float r10 = r10 * r2
                int r10 = java.lang.Math.round(r10)
                int r2 = r10 + r0
            L_0x004f:
                r7.x(r8, r9, r2)
                goto L_0x007c
            L_0x0053:
                if (r10 == 0) goto L_0x007c
                r0 = r10 & 4
                if (r0 == 0) goto L_0x005b
                r0 = 1
                goto L_0x005c
            L_0x005b:
                r0 = 0
            L_0x005c:
                r2 = r10 & 2
                r3 = 0
                if (r2 == 0) goto L_0x0070
                int r10 = r9.getUpNestedPreScrollRange()
                int r10 = -r10
                if (r0 == 0) goto L_0x006c
                r7.z(r8, r9, r10, r3)
                goto L_0x007c
            L_0x006c:
                r7.x(r8, r9, r10)
                goto L_0x007c
            L_0x0070:
                r10 = r10 & r6
                if (r10 == 0) goto L_0x007c
                if (r0 == 0) goto L_0x0079
                r7.z(r8, r9, r1, r3)
                goto L_0x007c
            L_0x0079:
                r7.x(r8, r9, r1)
            L_0x007c:
                r9.f2095g = r1
                r10 = 0
                r7.f2109m = r10
                int r10 = r7.s()
                int r0 = r9.getTotalScrollRange()
                int r0 = -r0
                int r10 = c.b.b(r10, r0, r1)
                r7.u(r10)
                int r3 = r7.s()
                r4 = 0
                r5 = 1
                r0 = r7
                r1 = r8
                r2 = r9
                r0.G(r1, r2, r3, r4, r5)
                int r10 = r7.s()
                r9.f2090b = r10
                boolean r10 = r9.willNotDraw()
                if (r10 != 0) goto L_0x00ae
                java.util.WeakHashMap<android.view.View, g0.x> r10 = g0.u.f3063a
                g0.u.d.k(r9)
            L_0x00ae:
                r7.F(r8, r9)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((CoordinatorLayout.f) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.s(appBarLayout, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }

        public /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i4) {
            C(coordinatorLayout, (AppBarLayout) view, view2, i3, iArr);
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i5 < 0) {
                iArr[1] = w(coordinatorLayout, appBarLayout, i5, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i5 == 0) {
                F(coordinatorLayout, appBarLayout);
            }
        }

        public void n(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof b) {
                this.f2109m = (b) parcelable;
            } else {
                this.f2109m = null;
            }
        }

        public Parcelable o(CoordinatorLayout coordinatorLayout, View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            b D = D(absSavedState, (AppBarLayout) view);
            return D == null ? absSavedState : D;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
            if (((r3.getTotalScrollRange() != 0) && r2.getHeight() - r4.getHeight() <= r3.getHeight()) != false) goto L_0x002d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r1 = this;
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                r5 = r6 & 2
                r6 = 1
                r0 = 0
                if (r5 == 0) goto L_0x002c
                boolean r5 = r3.f2099k
                if (r5 != 0) goto L_0x002d
                int r5 = r3.getTotalScrollRange()
                if (r5 == 0) goto L_0x0014
                r5 = 1
                goto L_0x0015
            L_0x0014:
                r5 = 0
            L_0x0015:
                if (r5 == 0) goto L_0x0028
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L_0x0028
                r2 = 1
                goto L_0x0029
            L_0x0028:
                r2 = 0
            L_0x0029:
                if (r2 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r6 = 0
            L_0x002d:
                if (r6 == 0) goto L_0x0036
                android.animation.ValueAnimator r2 = r1.f2108l
                if (r2 == 0) goto L_0x0036
                r2.cancel()
            L_0x0036:
                r2 = 0
                r1.f2110n = r2
                r1.f2107k = r7
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f2107k == 0 || i2 == 1) {
                E(coordinatorLayout, appBarLayout);
                if (appBarLayout.f2099k) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.f2110n = new WeakReference<>(view2);
        }

        public int v() {
            return s() + this.f2106j;
        }

        public int y(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4) {
            int i5;
            List list;
            int i6;
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            int i7 = i3;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int v2 = v();
            int i8 = 0;
            if (i7 == 0 || v2 < i7 || v2 > i4) {
                this.f2106j = 0;
            } else {
                int b2 = c.b.b(i2, i3, i4);
                if (v2 != b2) {
                    if (appBarLayout.f2094f) {
                        int abs = Math.abs(b2);
                        int childCount = appBarLayout.getChildCount();
                        int i9 = 0;
                        while (true) {
                            if (i9 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i9);
                            c cVar = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.f2122c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i9++;
                            } else if (interpolator != null) {
                                int i10 = cVar.f2120a;
                                if ((i10 & 1) != 0) {
                                    i6 = childAt.getHeight() + cVar.topMargin + cVar.bottomMargin + 0;
                                    if ((i10 & 2) != 0) {
                                        WeakHashMap<View, x> weakHashMap = u.f3063a;
                                        i6 -= u.d.d(childAt);
                                    }
                                } else {
                                    i6 = 0;
                                }
                                WeakHashMap<View, x> weakHashMap2 = u.f3063a;
                                if (u.d.b(childAt)) {
                                    i6 -= appBarLayout.getTopInset();
                                }
                                if (i6 > 0) {
                                    float f2 = (float) i6;
                                    i5 = (childAt.getTop() + Math.round(interpolator.getInterpolation(((float) (abs - childAt.getTop())) / f2) * f2)) * Integer.signum(b2);
                                }
                            }
                        }
                    }
                    i5 = b2;
                    boolean u2 = u(i5);
                    int i11 = v2 - b2;
                    this.f2106j = b2 - i5;
                    if (u2) {
                        for (int i12 = 0; i12 < appBarLayout.getChildCount(); i12++) {
                            c cVar2 = (c) appBarLayout.getChildAt(i12).getLayoutParams();
                            a aVar = cVar2.f2121b;
                            if (!(aVar == null || (cVar2.f2120a & 1) == 0)) {
                                View childAt2 = appBarLayout.getChildAt(i12);
                                b bVar = (b) aVar;
                                Rect rect = bVar.f2118a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = ((float) bVar.f2118a.top) - Math.abs((float) s());
                                float f3 = 0.0f;
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / ((float) bVar.f2118a.height()));
                                    if (abs3 >= 0.0f) {
                                        f3 = abs3 > 1.0f ? 1.0f : abs3;
                                    }
                                    float f4 = 1.0f - f3;
                                    float height = (-abs2) - ((((float) bVar.f2118a.height()) * 0.3f) * (1.0f - (f4 * f4)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(bVar.f2119b);
                                    bVar.f2119b.offset(0, (int) (-height));
                                    Rect rect2 = bVar.f2119b;
                                    WeakHashMap<View, x> weakHashMap3 = u.f3063a;
                                    u.f.c(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, x> weakHashMap4 = u.f3063a;
                                    u.f.c(childAt2, (Rect) null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!u2 && appBarLayout.f2094f && (list = (List) ((m.h) coordinatorLayout2.f1038c.f3439b).getOrDefault(appBarLayout, null)) != null && !list.isEmpty()) {
                        while (i8 < list.size()) {
                            View view2 = (View) list.get(i8);
                            CoordinatorLayout.c cVar3 = ((CoordinatorLayout.f) view2.getLayoutParams()).f1058a;
                            if (cVar3 != null) {
                                cVar3.d(coordinatorLayout2, view2, appBarLayout);
                            }
                            i8++;
                        }
                    }
                    appBarLayout.f2090b = s();
                    if (!appBarLayout.willNotDraw()) {
                        WeakHashMap<View, x> weakHashMap5 = u.f3063a;
                        u.d.k(appBarLayout);
                    }
                    G(coordinatorLayout, appBarLayout, b2, b2 < v2 ? -1 : 1, false);
                    i8 = i11;
                }
            }
            F(coordinatorLayout2, appBarLayout);
            return i8;
        }

        public final void z(CoordinatorLayout coordinatorLayout, T t2, int i2, float f2) {
            int abs = Math.abs(v() - i2);
            float abs2 = Math.abs(f2);
            int round = abs2 > 0.0f ? Math.round((((float) abs) / abs2) * 1000.0f) * 3 : (int) (((((float) abs) / ((float) t2.getHeight())) + 1.0f) * 150.0f);
            int v2 = v();
            if (v2 == i2) {
                ValueAnimator valueAnimator = this.f2108l;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2108l.cancel();
                    return;
                }
                return;
            }
            ValueAnimator valueAnimator2 = this.f2108l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f2108l = valueAnimator3;
                valueAnimator3.setInterpolator(z0.a.f4423e);
                this.f2108l.addUpdateListener(new a(this, coordinatorLayout, t2));
            } else {
                valueAnimator2.cancel();
            }
            this.f2108l.setDuration((long) Math.min(round, 600));
            this.f2108l.setIntValues(new int[]{v2, i2});
            this.f2108l.start();
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends a1.c {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.f4386w);
            this.f33f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f1058a;
            if (cVar instanceof BaseBehavior) {
                u.o(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f2106j) + this.f32e) - v(view2));
            }
            if (!(view2 instanceof AppBarLayout)) {
                return false;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (!appBarLayout.f2099k) {
                return false;
            }
            appBarLayout.d(appBarLayout.e(view));
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                u.r(d.a.f3164f.a(), coordinatorLayout);
                u.m(coordinatorLayout, 0);
                u.r(d.a.f3165g.a(), coordinatorLayout);
                u.m(coordinatorLayout, 0);
                u.u(coordinatorLayout, (g0.a) null);
            }
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z2) {
            AppBarLayout w2 = w(coordinatorLayout.d(view));
            if (w2 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f30c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    w2.c(false, !z2);
                    return true;
                }
            }
            return false;
        }

        public AppBarLayout w(List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    public static abstract class a {
    }

    public static class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f2118a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f2119b = new Rect();
    }

    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2120a = 1;

        /* renamed from: b  reason: collision with root package name */
        public a f2121b;

        /* renamed from: c  reason: collision with root package name */
        public Interpolator f2122c;

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.f4364a);
            this.f2120a = obtainStyledAttributes.getInt(1, 0);
            this.f2121b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f2122c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: a */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new c((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void b() {
        Behavior behavior = this.f2105q;
        BaseBehavior.b D = (behavior == null || this.f2091c == -1 || this.f2095g != 0) ? null : behavior.D(l0.a.f3320c, this);
        this.f2091c = -1;
        this.f2092d = -1;
        this.f2093e = -1;
        if (D != null) {
            Behavior behavior2 = this.f2105q;
            if (behavior2.f2109m == null) {
                behavior2.f2109m = D;
            }
        }
    }

    public void c(boolean z2, boolean z3) {
        this.f2095g = (z2 ? 1 : 2) | (z3 ? 4 : 0) | 8;
        requestLayout();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public boolean d(boolean z2) {
        if (!(!this.f2096h) || this.f2098j == z2) {
            return false;
        }
        this.f2098j = z2;
        refreshDrawableState();
        if (!this.f2099k || !(getBackground() instanceof g)) {
            return true;
        }
        g gVar = (g) getBackground();
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        float f2 = z2 ? 0.0f : dimension;
        if (!z2) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f2102n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f2, dimension});
        this.f2102n = ofFloat;
        ofFloat.setDuration((long) getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.f2102n.setInterpolator(z0.a.f4419a);
        this.f2102n.addUpdateListener(new a1.a(this, gVar));
        this.f2102n.start();
        return true;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2104p != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, (float) (-this.f2090b));
            this.f2104p.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2104p;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e(android.view.View r5) {
        /*
            r4 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f2101m
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x0031
            int r0 = r4.f2100l
            if (r0 == r2) goto L_0x0031
            if (r5 == 0) goto L_0x0011
            android.view.View r0 = r5.findViewById(r0)
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 != 0) goto L_0x0028
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0028
            android.view.ViewParent r0 = r4.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r3 = r4.f2100l
            android.view.View r0 = r0.findViewById(r3)
        L_0x0028:
            if (r0 == 0) goto L_0x0031
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r4.f2101m = r3
        L_0x0031:
            java.lang.ref.WeakReference<android.view.View> r0 = r4.f2101m
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.view.View r1 = (android.view.View) r1
        L_0x003c:
            if (r1 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r5 = r1
        L_0x0040:
            if (r5 == 0) goto L_0x0050
            boolean r0 = r5.canScrollVertically(r2)
            if (r0 != 0) goto L_0x004e
            int r5 = r5.getScrollY()
            if (r5 <= 0) goto L_0x0050
        L_0x004e:
            r5 = 1
            goto L_0x0051
        L_0x0050:
            r5 = 0
        L_0x0051:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.e(android.view.View):boolean");
    }

    public final boolean f() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        if (childAt.getVisibility() == 8) {
            return false;
        }
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        return !u.d.b(childAt);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f2105q = behavior;
        return behavior;
    }

    public int getDownNestedPreScrollRange() {
        int i2;
        int i3 = this.f2092d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = cVar.f2120a;
            if ((i5 & 5) == 5) {
                int i6 = cVar.topMargin + cVar.bottomMargin;
                if ((i5 & 8) != 0) {
                    WeakHashMap<View, x> weakHashMap = u.f3063a;
                    i2 = i6 + u.d.d(childAt);
                } else if ((i5 & 2) != 0) {
                    WeakHashMap<View, x> weakHashMap2 = u.f3063a;
                    i2 = i6 + (measuredHeight - u.d.d(childAt));
                } else {
                    i2 = i6 + measuredHeight;
                }
                if (childCount == 0) {
                    WeakHashMap<View, x> weakHashMap3 = u.f3063a;
                    if (u.d.b(childAt)) {
                        i2 = Math.min(i2, measuredHeight - getTopInset());
                    }
                }
                i4 += i2;
            } else if (i4 > 0) {
                break;
            }
        }
        int max = Math.max(0, i4);
        this.f2092d = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i2 = this.f2093e;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = cVar.topMargin + cVar.bottomMargin + childAt.getMeasuredHeight();
            int i5 = cVar.f2120a;
            if ((i5 & 1) == 0) {
                break;
            }
            i4 += measuredHeight;
            if ((i5 & 2) != 0) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                i4 -= u.d.d(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f2093e = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.f2100l;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        int d2 = u.d.d(this);
        if (d2 == 0) {
            int childCount = getChildCount();
            d2 = childCount >= 1 ? u.d.d(getChildAt(childCount - 1)) : 0;
            if (d2 == 0) {
                return getHeight() / 3;
            }
        }
        return (d2 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f2095g;
    }

    public Drawable getStatusBarForeground() {
        return this.f2104p;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f2091c;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = cVar.f2120a;
            if ((i5 & 1) == 0) {
                break;
            }
            int i6 = measuredHeight + cVar.topMargin + cVar.bottomMargin + i4;
            if (i3 == 0) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                if (u.d.b(childAt)) {
                    i6 -= getTopInset();
                }
            }
            i4 = i6;
            if ((i5 & 2) != 0) {
                WeakHashMap<View, x> weakHashMap2 = u.f3063a;
                i4 -= u.d.d(childAt);
                break;
            }
            i3++;
        }
        int max = Math.max(0, i4);
        this.f2091c = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof g) {
            c.b.l(this, (g) background);
        }
    }

    public int[] onCreateDrawableState(int i2) {
        if (this.f2103o == null) {
            this.f2103o = new int[4];
        }
        int[] iArr = this.f2103o;
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z2 = this.f2097i;
        iArr[0] = z2 ? R.attr.state_liftable : -2130903926;
        iArr[1] = (!z2 || !this.f2098j) ? -2130903927 : R.attr.state_lifted;
        iArr[2] = z2 ? R.attr.state_collapsible : -2130903924;
        iArr[3] = (!z2 || !this.f2098j) ? -2130903923 : R.attr.state_collapsed;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.f2101m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2101m = null;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        super.onLayout(z2, i2, i3, i4, i5);
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        boolean z4 = true;
        if (u.d.b(this) && f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                u.o(getChildAt(childCount), topInset);
            }
        }
        b();
        this.f2094f = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            } else if (((c) getChildAt(i6).getLayoutParams()).f2122c != null) {
                this.f2094f = true;
                break;
            } else {
                i6++;
            }
        }
        Drawable drawable = this.f2104p;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.f2096h) {
            if (!this.f2099k) {
                int childCount3 = getChildCount();
                int i7 = 0;
                while (true) {
                    if (i7 >= childCount3) {
                        z3 = false;
                        break;
                    }
                    int i8 = ((c) getChildAt(i7).getLayoutParams()).f2120a;
                    if ((i8 & 1) == 1 && (i8 & 10) != 0) {
                        z3 = true;
                        break;
                    }
                    i7++;
                }
                if (!z3) {
                    z4 = false;
                }
            }
            if (this.f2097i != z4) {
                this.f2097i = z4;
                refreshDrawableState();
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (u.d.b(this) && f()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = c.b.b(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i3));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        c.b.k(this, f2);
    }

    public void setExpanded(boolean z2) {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        c(z2, u.g.c(this));
    }

    public void setLiftOnScroll(boolean z2) {
        this.f2099k = z2;
    }

    public void setLiftOnScrollTargetViewId(int i2) {
        this.f2100l = i2;
        WeakReference<View> weakReference = this.f2101m;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f2101m = null;
    }

    public void setLiftableOverrideEnabled(boolean z2) {
        this.f2096h = z2;
    }

    public void setOrientation(int i2) {
        if (i2 == 1) {
            super.setOrientation(i2);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.f2104p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2104p = drawable3;
            boolean z2 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2104p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f2104p;
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                a0.a.c(drawable4, u.e.d(this));
                this.f2104p.setVisible(getVisibility() == 0, false);
                this.f2104p.setCallback(this);
            }
            if (this.f2104p != null && getTopInset() > 0) {
                z2 = true;
            }
            setWillNotDraw(!z2);
            WeakHashMap<View, x> weakHashMap2 = u.f3063a;
            u.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(int i2) {
        setStatusBarForeground(e.a.b(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = (long) integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.state_liftable, -2130903927}, ObjectAnimator.ofFloat(this, "elevation", new float[]{0.0f}).setDuration(j2));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(this, "elevation", new float[]{f2}).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", new float[]{0.0f}).setDuration(0));
        setStateListAnimator(stateListAnimator);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f2104p;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2104p;
    }

    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m13generateDefaultLayoutParams() {
        return new c(-1, -2);
    }

    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    public LinearLayout.LayoutParams m14generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
