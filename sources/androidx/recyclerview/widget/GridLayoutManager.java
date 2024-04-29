package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import h0.d;
import java.util.Objects;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean E = false;
    public int F = -1;
    public int[] G;
    public View[] H;
    public final SparseIntArray I = new SparseIntArray();
    public final SparseIntArray J = new SparseIntArray();
    public c K = new a();
    public final Rect L = new Rect();

    public static final class a extends c {
    }

    public static class b extends RecyclerView.m {

        /* renamed from: e  reason: collision with root package name */
        public int f1607e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1608f = 0;

        public b(int i2, int i3) {
            super(i2, i3);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final SparseIntArray f1609a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f1610b = new SparseIntArray();

        public int a(int i2, int i3) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                i4++;
                if (i4 == i3) {
                    i5++;
                    i4 = 0;
                } else if (i4 > i3) {
                    i5++;
                    i4 = 1;
                }
            }
            return i4 + 1 > i3 ? i5 + 1 : i5;
        }
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z2) {
        super(i3, z2);
        z1(i2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        z1(RecyclerView.l.R(context, attributeSet, i2, i3).f1728b);
    }

    public void A0(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        if (this.G == null) {
            super.A0(rect, i2, i3);
        }
        int O = O() + N();
        int M = M() + P();
        if (this.f1611p == 1) {
            i5 = RecyclerView.l.h(i3, rect.height() + M, K());
            int[] iArr = this.G;
            i4 = RecyclerView.l.h(i2, iArr[iArr.length - 1] + O, L());
        } else {
            i4 = RecyclerView.l.h(i2, rect.width() + O, L());
            int[] iArr2 = this.G;
            i5 = RecyclerView.l.h(i3, iArr2[iArr2.length - 1] + M, K());
        }
        this.f1711b.setMeasuredDimension(i4, i5);
    }

    public final void A1() {
        int i2;
        int i3;
        if (this.f1611p == 1) {
            i3 = this.f1723n - O();
            i2 = N();
        } else {
            i3 = this.f1724o - M();
            i2 = P();
        }
        r1(i3 - i2);
    }

    public boolean I0() {
        return this.f1621z == null && !this.E;
    }

    public void K0(RecyclerView.w wVar, LinearLayoutManager.c cVar, RecyclerView.l.c cVar2) {
        int i2 = this.F;
        for (int i3 = 0; i3 < this.F && cVar.b(wVar) && i2 > 0; i3++) {
            ((n.b) cVar2).a(cVar.f1634d, Math.max(0, cVar.f1637g));
            Objects.requireNonNull(this.K);
            i2--;
            cVar.f1634d += cVar.f1635e;
        }
    }

    public int S(RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.f1611p == 0) {
            return this.F;
        }
        if (wVar.b() < 1) {
            return 0;
        }
        return u1(rVar, wVar, wVar.b() - 1) + 1;
    }

    public View Z0(RecyclerView.r rVar, RecyclerView.w wVar, int i2, int i3, int i4) {
        P0();
        int k2 = this.f1613r.k();
        int g2 = this.f1613r.g();
        int i5 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View w2 = w(i2);
            int Q = Q(w2);
            if (Q >= 0 && Q < i4 && v1(rVar, wVar, Q) == 0) {
                if (((RecyclerView.m) w2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = w2;
                    }
                } else if (this.f1613r.e(w2) < g2 && this.f1613r.b(w2) >= k2) {
                    return w2;
                } else {
                    if (view == null) {
                        view = w2;
                    }
                }
            }
            i2 += i5;
        }
        return view != null ? view : view2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        if (r13 == (r2 > r15)) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00fe, code lost:
        if (r13 == (r2 > r8)) goto L_0x0100;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View a0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.r r25, androidx.recyclerview.widget.RecyclerView.w r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.r(r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.f1607e
            int r5 = r5.f1608f
            int r5 = r5 + r6
            android.view.View r7 = super.a0(r23, r24, r25, r26)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r24
            int r7 = r0.O0(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f1616u
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r22.x()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r22.x()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f1611p
            if (r13 != r9) goto L_0x0051
            boolean r13 = r22.e1()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.u1(r1, r2, r7)
            r10 = r7
            r16 = r12
            r8 = -1
            r9 = 0
            r12 = 0
            r15 = -1
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0144
            r17 = r11
            int r11 = r0.u1(r1, r2, r10)
            android.view.View r1 = r0.w(r10)
            if (r1 != r3) goto L_0x006e
            goto L_0x0144
        L_0x006e:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0085
            if (r11 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x007a
            goto L_0x0144
        L_0x007a:
            r18 = r3
            r21 = r7
            r19 = r9
            r20 = r14
            r14 = 1
            goto L_0x0132
        L_0x0085:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.b) r11
            int r2 = r11.f1607e
            r18 = r3
            int r3 = r11.f1608f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009d
            if (r2 != r6) goto L_0x009d
            if (r3 != r5) goto L_0x009d
            return r1
        L_0x009d:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00ad
        L_0x00a5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b0
            if (r7 != 0) goto L_0x00b0
        L_0x00ad:
            r21 = r7
            goto L_0x00ce
        L_0x00b0:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d5
            if (r7 <= r9) goto L_0x00c5
            goto L_0x00ce
        L_0x00c5:
            if (r7 != r9) goto L_0x0102
            if (r2 <= r15) goto L_0x00cb
            r7 = 1
            goto L_0x00cc
        L_0x00cb:
            r7 = 0
        L_0x00cc:
            if (r13 != r7) goto L_0x0102
        L_0x00ce:
            r19 = r9
            r20 = r14
            r7 = 1
            r14 = 1
            goto L_0x0108
        L_0x00d5:
            if (r4 != 0) goto L_0x0102
            r19 = r9
            androidx.recyclerview.widget.c0 r9 = r0.f1712c
            r20 = r14
            r14 = 24579(0x6003, float:3.4443E-41)
            boolean r9 = r9.b(r1, r14)
            if (r9 == 0) goto L_0x00ef
            androidx.recyclerview.widget.c0 r9 = r0.f1713d
            boolean r9 = r9.b(r1, r14)
            if (r9 == 0) goto L_0x00ef
            r9 = 1
            goto L_0x00f0
        L_0x00ef:
            r9 = 0
        L_0x00f0:
            r14 = 1
            r9 = r9 ^ r14
            if (r9 == 0) goto L_0x0107
            if (r7 <= r12) goto L_0x00f7
            goto L_0x0100
        L_0x00f7:
            if (r7 != r12) goto L_0x0107
            if (r2 <= r8) goto L_0x00fd
            r7 = 1
            goto L_0x00fe
        L_0x00fd:
            r7 = 0
        L_0x00fe:
            if (r13 != r7) goto L_0x0107
        L_0x0100:
            r7 = 1
            goto L_0x0108
        L_0x0102:
            r19 = r9
            r20 = r14
            r14 = 1
        L_0x0107:
            r7 = 0
        L_0x0108:
            if (r7 == 0) goto L_0x0132
            boolean r7 = r1.hasFocusable()
            if (r7 == 0) goto L_0x0121
            int r4 = r11.f1607e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r9 = r3 - r2
            r15 = r4
            r7 = r21
            r4 = r1
            goto L_0x0136
        L_0x0121:
            int r7 = r11.f1607e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r12 = r3 - r2
            r8 = r7
            r9 = r19
            r7 = r1
            goto L_0x0136
        L_0x0132:
            r9 = r19
            r7 = r21
        L_0x0136:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            r14 = r20
            goto L_0x005e
        L_0x0144:
            r21 = r7
            if (r4 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r4 = r21
        L_0x014b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    public void d0(RecyclerView.r rVar, RecyclerView.w wVar, View view, d dVar) {
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            c0(view, dVar);
            return;
        }
        b bVar = (b) layoutParams;
        int u12 = u1(rVar, wVar, bVar.a());
        if (this.f1611p == 0) {
            i5 = bVar.f1607e;
            i4 = bVar.f1608f;
            i2 = 1;
            z3 = false;
            z2 = false;
            i3 = u12;
        } else {
            i4 = 1;
            i3 = bVar.f1607e;
            i2 = bVar.f1608f;
            z3 = false;
            z2 = false;
            i5 = u12;
        }
        dVar.j(d.c.a(i5, i4, i3, i2, z3, z2));
    }

    public void e0(RecyclerView recyclerView, int i2, int i3) {
        this.K.f1609a.clear();
        this.K.f1610b.clear();
    }

    public void f0(RecyclerView recyclerView) {
        this.K.f1609a.clear();
        this.K.f1610b.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x025b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f1(androidx.recyclerview.widget.RecyclerView.r r19, androidx.recyclerview.widget.RecyclerView.w r20, androidx.recyclerview.widget.LinearLayoutManager.c r21, androidx.recyclerview.widget.LinearLayoutManager.b r22) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            androidx.recyclerview.widget.t r3 = r6.f1613r
            int r3 = r3.j()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            int r10 = r18.x()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.G
            int r11 = r6.F
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r18.A1()
        L_0x002c:
            int r11 = r2.f1635e
            if (r11 != r8) goto L_0x0032
            r11 = 1
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            int r12 = r6.F
            if (r11 != 0) goto L_0x0044
            int r12 = r2.f1634d
            int r12 = r6.v1(r0, r1, r12)
            int r13 = r2.f1634d
            int r13 = r6.w1(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = 0
        L_0x0045:
            int r14 = r6.F
            if (r13 >= r14) goto L_0x009d
            boolean r14 = r2.b(r1)
            if (r14 == 0) goto L_0x009d
            if (r12 <= 0) goto L_0x009d
            int r14 = r2.f1634d
            int r15 = r6.w1(r0, r1, r14)
            int r4 = r6.F
            if (r15 > r4) goto L_0x006f
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x005f
            goto L_0x009d
        L_0x005f:
            android.view.View r4 = r2.c(r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x009d
        L_0x0066:
            android.view.View[] r14 = r6.H
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.F
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r13 != 0) goto L_0x00a2
            r7.f1628b = r8
            return
        L_0x00a2:
            if (r11 == 0) goto L_0x00aa
            r14 = r13
            r12 = 0
            r15 = 0
            r16 = 1
            goto L_0x00b0
        L_0x00aa:
            int r12 = r13 + -1
            r14 = -1
            r15 = 0
            r16 = -1
        L_0x00b0:
            if (r12 == r14) goto L_0x00cf
            android.view.View[] r4 = r6.H
            r4 = r4[r12]
            android.view.ViewGroup$LayoutParams r17 = r4.getLayoutParams()
            r8 = r17
            androidx.recyclerview.widget.GridLayoutManager$b r8 = (androidx.recyclerview.widget.GridLayoutManager.b) r8
            int r4 = r6.Q(r4)
            int r4 = r6.w1(r0, r1, r4)
            r8.f1608f = r4
            r8.f1607e = r15
            int r15 = r15 + r4
            int r12 = r12 + r16
            r8 = 1
            goto L_0x00b0
        L_0x00cf:
            r0 = 0
            r1 = 0
            r4 = 0
        L_0x00d2:
            if (r1 >= r13) goto L_0x012c
            android.view.View[] r8 = r6.H
            r8 = r8[r1]
            java.util.List<androidx.recyclerview.widget.RecyclerView$z> r12 = r2.f1641k
            if (r12 != 0) goto L_0x00e6
            if (r11 == 0) goto L_0x00e2
            r6.b(r8)
            goto L_0x00f2
        L_0x00e2:
            r6.c(r8, r5, r5)
            goto L_0x00f2
        L_0x00e6:
            if (r11 == 0) goto L_0x00ee
            r12 = -1
            r14 = 1
            r6.c(r8, r12, r14)
            goto L_0x00f2
        L_0x00ee:
            r14 = 1
            r6.c(r8, r5, r14)
        L_0x00f2:
            android.graphics.Rect r12 = r6.L
            androidx.recyclerview.widget.RecyclerView r14 = r6.f1711b
            if (r14 != 0) goto L_0x00fc
            r12.set(r5, r5, r5, r5)
            goto L_0x0103
        L_0x00fc:
            android.graphics.Rect r14 = r14.L(r8)
            r12.set(r14)
        L_0x0103:
            r6.x1(r8, r3, r5)
            androidx.recyclerview.widget.t r12 = r6.f1613r
            int r12 = r12.c(r8)
            if (r12 <= r4) goto L_0x010f
            r4 = r12
        L_0x010f:
            android.view.ViewGroup$LayoutParams r12 = r8.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r12 = (androidx.recyclerview.widget.GridLayoutManager.b) r12
            r14 = 1065353216(0x3f800000, float:1.0)
            androidx.recyclerview.widget.t r15 = r6.f1613r
            int r8 = r15.d(r8)
            float r8 = (float) r8
            float r8 = r8 * r14
            int r12 = r12.f1608f
            float r12 = (float) r12
            float r8 = r8 / r12
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0129
            r0 = r8
        L_0x0129:
            int r1 = r1 + 1
            goto L_0x00d2
        L_0x012c:
            if (r9 == 0) goto L_0x0158
            int r1 = r6.F
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r0 = java.lang.Math.max(r0, r10)
            r6.r1(r0)
            r0 = 0
            r4 = 0
        L_0x0140:
            if (r0 >= r13) goto L_0x0158
            android.view.View[] r1 = r6.H
            r1 = r1[r0]
            r3 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r6.x1(r1, r3, r8)
            androidx.recyclerview.widget.t r3 = r6.f1613r
            int r1 = r3.c(r1)
            if (r1 <= r4) goto L_0x0155
            r4 = r1
        L_0x0155:
            int r0 = r0 + 1
            goto L_0x0140
        L_0x0158:
            r0 = 0
        L_0x0159:
            if (r0 >= r13) goto L_0x01ba
            android.view.View[] r1 = r6.H
            r1 = r1[r0]
            androidx.recyclerview.widget.t r3 = r6.f1613r
            int r3 = r3.c(r1)
            if (r3 == r4) goto L_0x01b4
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r3 = (androidx.recyclerview.widget.GridLayoutManager.b) r3
            android.graphics.Rect r8 = r3.f1732b
            int r9 = r8.top
            int r10 = r8.bottom
            int r9 = r9 + r10
            int r10 = r3.topMargin
            int r9 = r9 + r10
            int r10 = r3.bottomMargin
            int r9 = r9 + r10
            int r10 = r8.left
            int r8 = r8.right
            int r10 = r10 + r8
            int r8 = r3.leftMargin
            int r10 = r10 + r8
            int r8 = r3.rightMargin
            int r10 = r10 + r8
            int r8 = r3.f1607e
            int r11 = r3.f1608f
            int r8 = r6.t1(r8, r11)
            int r11 = r6.f1611p
            r12 = 1
            if (r11 != r12) goto L_0x01a1
            int r3 = r3.width
            r11 = 1073741824(0x40000000, float:2.0)
            int r3 = androidx.recyclerview.widget.RecyclerView.l.y(r8, r11, r10, r3, r5)
            int r8 = r4 - r9
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r11)
            goto L_0x01b0
        L_0x01a1:
            r11 = 1073741824(0x40000000, float:2.0)
            int r10 = r4 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r3 = r3.height
            int r8 = androidx.recyclerview.widget.RecyclerView.l.y(r8, r11, r9, r3, r5)
            r3 = r10
        L_0x01b0:
            r6.y1(r1, r3, r8, r12)
            goto L_0x01b7
        L_0x01b4:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 1
        L_0x01b7:
            int r0 = r0 + 1
            goto L_0x0159
        L_0x01ba:
            r12 = 1
            r7.f1627a = r4
            int r0 = r6.f1611p
            if (r0 != r12) goto L_0x01d3
            int r0 = r2.f1636f
            r1 = -1
            if (r0 != r1) goto L_0x01cb
            int r0 = r2.f1632b
            int r1 = r0 - r4
            goto L_0x01cf
        L_0x01cb:
            int r1 = r2.f1632b
            int r0 = r4 + r1
        L_0x01cf:
            r2 = r1
            r1 = 0
            r3 = 0
            goto L_0x01e5
        L_0x01d3:
            r1 = -1
            int r0 = r2.f1636f
            if (r0 != r1) goto L_0x01dd
            int r0 = r2.f1632b
            int r1 = r0 - r4
            goto L_0x01e1
        L_0x01dd:
            int r1 = r2.f1632b
            int r0 = r4 + r1
        L_0x01e1:
            r3 = r1
            r2 = 0
            r1 = r0
            r0 = 0
        L_0x01e5:
            r8 = 0
        L_0x01e6:
            if (r8 >= r13) goto L_0x026f
            android.view.View[] r4 = r6.H
            r9 = r4[r8]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r10 = (androidx.recyclerview.widget.GridLayoutManager.b) r10
            int r4 = r6.f1611p
            r5 = 1
            if (r4 != r5) goto L_0x022c
            boolean r1 = r18.e1()
            if (r1 == 0) goto L_0x0215
            int r1 = r18.N()
            int[] r3 = r6.G
            int r4 = r6.F
            int r5 = r10.f1607e
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.t r3 = r6.f1613r
            int r3 = r3.d(r9)
            int r3 = r1 - r3
            goto L_0x023e
        L_0x0215:
            int r1 = r18.N()
            int[] r3 = r6.G
            int r4 = r10.f1607e
            r3 = r3[r4]
            int r1 = r1 + r3
            androidx.recyclerview.widget.t r3 = r6.f1613r
            int r3 = r3.d(r9)
            int r3 = r3 + r1
            r11 = r0
            r15 = r1
            r14 = r2
            r12 = r3
            goto L_0x0242
        L_0x022c:
            int r0 = r18.P()
            int[] r2 = r6.G
            int r4 = r10.f1607e
            r2 = r2[r4]
            int r2 = r2 + r0
            androidx.recyclerview.widget.t r0 = r6.f1613r
            int r0 = r0.d(r9)
            int r0 = r0 + r2
        L_0x023e:
            r11 = r0
            r12 = r1
            r14 = r2
            r15 = r3
        L_0x0242:
            r0 = r18
            r1 = r9
            r2 = r15
            r3 = r14
            r4 = r12
            r5 = r11
            r0.W(r1, r2, r3, r4, r5)
            boolean r0 = r10.c()
            if (r0 != 0) goto L_0x025b
            boolean r0 = r10.b()
            if (r0 == 0) goto L_0x0259
            goto L_0x025b
        L_0x0259:
            r0 = 1
            goto L_0x025e
        L_0x025b:
            r0 = 1
            r7.f1629c = r0
        L_0x025e:
            boolean r1 = r7.f1630d
            boolean r2 = r9.hasFocusable()
            r1 = r1 | r2
            r7.f1630d = r1
            int r8 = r8 + 1
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r15
            goto L_0x01e6
        L_0x026f:
            android.view.View[] r0 = r6.H
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.f1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    public boolean g(RecyclerView.m mVar) {
        return mVar instanceof b;
    }

    public void g0(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.K.f1609a.clear();
        this.K.f1610b.clear();
    }

    public void g1(RecyclerView.r rVar, RecyclerView.w wVar, LinearLayoutManager.a aVar, int i2) {
        A1();
        if (wVar.b() > 0 && !wVar.f1772g) {
            boolean z2 = i2 == 1;
            int v12 = v1(rVar, wVar, aVar.f1623b);
            if (z2) {
                while (v12 > 0) {
                    int i3 = aVar.f1623b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    aVar.f1623b = i4;
                    v12 = v1(rVar, wVar, i4);
                }
            } else {
                int b2 = wVar.b() - 1;
                int i5 = aVar.f1623b;
                while (i5 < b2) {
                    int i6 = i5 + 1;
                    int v13 = v1(rVar, wVar, i6);
                    if (v13 <= v12) {
                        break;
                    }
                    i5 = i6;
                    v12 = v13;
                }
                aVar.f1623b = i5;
            }
        }
        s1();
    }

    public void h0(RecyclerView recyclerView, int i2, int i3) {
        this.K.f1609a.clear();
        this.K.f1610b.clear();
    }

    public void i0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.K.f1609a.clear();
        this.K.f1610b.clear();
    }

    public void j0(RecyclerView.r rVar, RecyclerView.w wVar) {
        if (wVar.f1772g) {
            int x2 = x();
            for (int i2 = 0; i2 < x2; i2++) {
                b bVar = (b) w(i2).getLayoutParams();
                int a2 = bVar.a();
                this.I.put(a2, bVar.f1608f);
                this.J.put(a2, bVar.f1607e);
            }
        }
        super.j0(rVar, wVar);
        this.I.clear();
        this.J.clear();
    }

    public void k0(RecyclerView.w wVar) {
        this.f1621z = null;
        this.f1619x = -1;
        this.f1620y = Integer.MIN_VALUE;
        this.A.d();
        this.E = false;
    }

    public int l(RecyclerView.w wVar) {
        return M0(wVar);
    }

    public int m(RecyclerView.w wVar) {
        return N0(wVar);
    }

    public void n1(boolean z2) {
        if (!z2) {
            d((String) null);
            if (this.f1617v) {
                this.f1617v = false;
                u0();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public int o(RecyclerView.w wVar) {
        return M0(wVar);
    }

    public int p(RecyclerView.w wVar) {
        return N0(wVar);
    }

    public final void r1(int i2) {
        int i3;
        int[] iArr = this.G;
        int i4 = this.F;
        if (!(iArr != null && iArr.length == i4 + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i4 + 1)];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.G = iArr;
    }

    public final void s1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public RecyclerView.m t() {
        return this.f1611p == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    public int t1(int i2, int i3) {
        if (this.f1611p != 1 || !e1()) {
            int[] iArr = this.G;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.G;
        int i4 = this.F;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public RecyclerView.m u(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public final int u1(RecyclerView.r rVar, RecyclerView.w wVar, int i2) {
        if (!wVar.f1772g) {
            return this.K.a(i2, this.F);
        }
        int c2 = rVar.c(i2);
        if (c2 != -1) {
            return this.K.a(c2, this.F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }

    public RecyclerView.m v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    public int v0(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        A1();
        s1();
        if (this.f1611p == 1) {
            return 0;
        }
        return l1(i2, rVar, wVar);
    }

    public final int v1(RecyclerView.r rVar, RecyclerView.w wVar, int i2) {
        if (!wVar.f1772g) {
            c cVar = this.K;
            int i3 = this.F;
            Objects.requireNonNull(cVar);
            return i2 % i3;
        }
        int i4 = this.J.get(i2, -1);
        if (i4 != -1) {
            return i4;
        }
        int c2 = rVar.c(i2);
        if (c2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
            return 0;
        }
        c cVar2 = this.K;
        int i5 = this.F;
        Objects.requireNonNull(cVar2);
        return c2 % i5;
    }

    public final int w1(RecyclerView.r rVar, RecyclerView.w wVar, int i2) {
        if (!wVar.f1772g) {
            Objects.requireNonNull(this.K);
            return 1;
        }
        int i3 = this.I.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        if (rVar.c(i2) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
            return 1;
        }
        Objects.requireNonNull(this.K);
        return 1;
    }

    public int x0(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        A1();
        s1();
        if (this.f1611p == 0) {
            return 0;
        }
        return l1(i2, rVar, wVar);
    }

    public final void x1(View view, int i2, boolean z2) {
        int i3;
        int i4;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f1732b;
        int i5 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i6 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int t12 = t1(bVar.f1607e, bVar.f1608f);
        if (this.f1611p == 1) {
            i3 = RecyclerView.l.y(t12, i2, i6, bVar.width, false);
            i4 = RecyclerView.l.y(this.f1613r.l(), this.f1722m, i5, bVar.height, true);
        } else {
            int y2 = RecyclerView.l.y(t12, i2, i5, bVar.height, false);
            int y3 = RecyclerView.l.y(this.f1613r.l(), this.f1721l, i6, bVar.width, true);
            i4 = y2;
            i3 = y3;
        }
        y1(view, i3, i4, z2);
    }

    public final void y1(View view, int i2, int i3, boolean z2) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        if (z2 ? F0(view, i2, i3, mVar) : D0(view, i2, i3, mVar)) {
            view.measure(i2, i3);
        }
    }

    public int z(RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.f1611p == 1) {
            return this.F;
        }
        if (wVar.b() < 1) {
            return 0;
        }
        return u1(rVar, wVar, wVar.b() - 1) + 1;
    }

    public void z1(int i2) {
        if (i2 != this.F) {
            this.E = true;
            if (i2 >= 1) {
                this.F = i2;
                this.K.f1609a.clear();
                u0();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i2);
        }
    }
}
