package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.l implements RecyclerView.v.b {
    public final a A = new a();
    public final b B = new b();
    public int C = 2;
    public int[] D = new int[2];

    /* renamed from: p  reason: collision with root package name */
    public int f1611p = 1;

    /* renamed from: q  reason: collision with root package name */
    public c f1612q;

    /* renamed from: r  reason: collision with root package name */
    public t f1613r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1614s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1615t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1616u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1617v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1618w = true;

    /* renamed from: x  reason: collision with root package name */
    public int f1619x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f1620y = Integer.MIN_VALUE;

    /* renamed from: z  reason: collision with root package name */
    public d f1621z = null;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public t f1622a;

        /* renamed from: b  reason: collision with root package name */
        public int f1623b;

        /* renamed from: c  reason: collision with root package name */
        public int f1624c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1625d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1626e;

        public a() {
            d();
        }

        public void a() {
            this.f1624c = this.f1625d ? this.f1622a.g() : this.f1622a.k();
        }

        public void b(View view, int i2) {
            if (this.f1625d) {
                this.f1624c = this.f1622a.m() + this.f1622a.b(view);
            } else {
                this.f1624c = this.f1622a.e(view);
            }
            this.f1623b = i2;
        }

        public void c(View view, int i2) {
            int i3;
            int m2 = this.f1622a.m();
            if (m2 >= 0) {
                b(view, i2);
                return;
            }
            this.f1623b = i2;
            if (this.f1625d) {
                int g2 = (this.f1622a.g() - m2) - this.f1622a.b(view);
                this.f1624c = this.f1622a.g() - g2;
                if (g2 > 0) {
                    int c2 = this.f1624c - this.f1622a.c(view);
                    int k2 = this.f1622a.k();
                    int min = c2 - (Math.min(this.f1622a.e(view) - k2, 0) + k2);
                    if (min < 0) {
                        i3 = Math.min(g2, -min) + this.f1624c;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                int e2 = this.f1622a.e(view);
                int k3 = e2 - this.f1622a.k();
                this.f1624c = e2;
                if (k3 > 0) {
                    int g3 = (this.f1622a.g() - Math.min(0, (this.f1622a.g() - m2) - this.f1622a.b(view))) - (this.f1622a.c(view) + e2);
                    if (g3 < 0) {
                        i3 = this.f1624c - Math.min(k3, -g3);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1624c = i3;
        }

        public void d() {
            this.f1623b = -1;
            this.f1624c = Integer.MIN_VALUE;
            this.f1625d = false;
            this.f1626e = false;
        }

        public String toString() {
            StringBuilder a2 = androidx.activity.result.a.a("AnchorInfo{mPosition=");
            a2.append(this.f1623b);
            a2.append(", mCoordinate=");
            a2.append(this.f1624c);
            a2.append(", mLayoutFromEnd=");
            a2.append(this.f1625d);
            a2.append(", mValid=");
            a2.append(this.f1626e);
            a2.append('}');
            return a2.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1627a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1628b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1629c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1630d;
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1631a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f1632b;

        /* renamed from: c  reason: collision with root package name */
        public int f1633c;

        /* renamed from: d  reason: collision with root package name */
        public int f1634d;

        /* renamed from: e  reason: collision with root package name */
        public int f1635e;

        /* renamed from: f  reason: collision with root package name */
        public int f1636f;

        /* renamed from: g  reason: collision with root package name */
        public int f1637g;

        /* renamed from: h  reason: collision with root package name */
        public int f1638h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f1639i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f1640j;

        /* renamed from: k  reason: collision with root package name */
        public List<RecyclerView.z> f1641k = null;

        /* renamed from: l  reason: collision with root package name */
        public boolean f1642l;

        public void a(View view) {
            int i2;
            int a2;
            int size = this.f1641k.size();
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            for (int i4 = 0; i4 < size; i4++) {
                View view3 = this.f1641k.get(i4).f1788a;
                RecyclerView.m mVar = (RecyclerView.m) view3.getLayoutParams();
                if (view3 != view && !mVar.c() && (a2 = (mVar.a() - this.f1634d) * this.f1635e) >= 0 && a2 < i3) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i3 = a2;
                }
            }
            if (view2 == null) {
                i2 = -1;
            } else {
                i2 = ((RecyclerView.m) view2.getLayoutParams()).a();
            }
            this.f1634d = i2;
        }

        public boolean b(RecyclerView.w wVar) {
            int i2 = this.f1634d;
            return i2 >= 0 && i2 < wVar.b();
        }

        public View c(RecyclerView.r rVar) {
            List<RecyclerView.z> list = this.f1641k;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    View view = this.f1641k.get(i2).f1788a;
                    RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
                    if (!mVar.c() && this.f1634d == mVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = rVar.j(this.f1634d, false, Long.MAX_VALUE).f1788a;
            this.f1634d += this.f1635e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f1643b;

        /* renamed from: c  reason: collision with root package name */
        public int f1644c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1645d;

        public static class a implements Parcelable.Creator<d> {
            public Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public Object[] newArray(int i2) {
                return new d[i2];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f1643b = parcel.readInt();
            this.f1644c = parcel.readInt();
            this.f1645d = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f1643b = dVar.f1643b;
            this.f1644c = dVar.f1644c;
            this.f1645d = dVar.f1645d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean j() {
            return this.f1643b >= 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1643b);
            parcel.writeInt(this.f1644c);
            parcel.writeInt(this.f1645d ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i2, boolean z2) {
        m1(i2);
        d((String) null);
        if (z2 != this.f1615t) {
            this.f1615t = z2;
            u0();
        }
    }

    public boolean E0() {
        boolean z2;
        if (!(this.f1722m == 1073741824 || this.f1721l == 1073741824)) {
            int x2 = x();
            int i2 = 0;
            while (true) {
                if (i2 >= x2) {
                    z2 = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = w(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public void G0(RecyclerView recyclerView, RecyclerView.w wVar, int i2) {
        p pVar = new p(recyclerView.getContext());
        pVar.f1751a = i2;
        H0(pVar);
    }

    public boolean I0() {
        return this.f1621z == null && this.f1614s == this.f1617v;
    }

    public void J0(RecyclerView.w wVar, int[] iArr) {
        int i2;
        int l2 = wVar.f1766a != -1 ? this.f1613r.l() : 0;
        if (this.f1612q.f1636f == -1) {
            i2 = 0;
        } else {
            i2 = l2;
            l2 = 0;
        }
        iArr[0] = l2;
        iArr[1] = i2;
    }

    public void K0(RecyclerView.w wVar, c cVar, RecyclerView.l.c cVar2) {
        int i2 = cVar.f1634d;
        if (i2 >= 0 && i2 < wVar.b()) {
            ((n.b) cVar2).a(i2, Math.max(0, cVar.f1637g));
        }
    }

    public final int L0(RecyclerView.w wVar) {
        if (x() == 0) {
            return 0;
        }
        P0();
        t tVar = this.f1613r;
        View T0 = T0(!this.f1618w, true);
        return z.a(wVar, tVar, T0, S0(!this.f1618w, true), this, this.f1618w);
    }

    public final int M0(RecyclerView.w wVar) {
        if (x() == 0) {
            return 0;
        }
        P0();
        t tVar = this.f1613r;
        View T0 = T0(!this.f1618w, true);
        return z.b(wVar, tVar, T0, S0(!this.f1618w, true), this, this.f1618w, this.f1616u);
    }

    public final int N0(RecyclerView.w wVar) {
        if (x() == 0) {
            return 0;
        }
        P0();
        t tVar = this.f1613r;
        View T0 = T0(!this.f1618w, true);
        return z.c(wVar, tVar, T0, S0(!this.f1618w, true), this, this.f1618w);
    }

    public int O0(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 17 ? i2 != 33 ? i2 != 66 ? (i2 == 130 && this.f1611p == 1) ? 1 : Integer.MIN_VALUE : this.f1611p == 0 ? 1 : Integer.MIN_VALUE : this.f1611p == 1 ? -1 : Integer.MIN_VALUE : this.f1611p == 0 ? -1 : Integer.MIN_VALUE : (this.f1611p != 1 && e1()) ? -1 : 1 : (this.f1611p != 1 && e1()) ? 1 : -1;
    }

    public void P0() {
        if (this.f1612q == null) {
            this.f1612q = new c();
        }
    }

    public int Q0(RecyclerView.r rVar, c cVar, RecyclerView.w wVar, boolean z2) {
        int i2 = cVar.f1633c;
        int i3 = cVar.f1637g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.f1637g = i3 + i2;
            }
            h1(rVar, cVar);
        }
        int i4 = cVar.f1633c + cVar.f1638h;
        b bVar = this.B;
        while (true) {
            if ((!cVar.f1642l && i4 <= 0) || !cVar.b(wVar)) {
                break;
            }
            bVar.f1627a = 0;
            bVar.f1628b = false;
            bVar.f1629c = false;
            bVar.f1630d = false;
            f1(rVar, wVar, cVar, bVar);
            if (!bVar.f1628b) {
                int i5 = cVar.f1632b;
                int i6 = bVar.f1627a;
                cVar.f1632b = (cVar.f1636f * i6) + i5;
                if (!bVar.f1629c || cVar.f1641k != null || !wVar.f1772g) {
                    cVar.f1633c -= i6;
                    i4 -= i6;
                }
                int i7 = cVar.f1637g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    cVar.f1637g = i8;
                    int i9 = cVar.f1633c;
                    if (i9 < 0) {
                        cVar.f1637g = i8 + i9;
                    }
                    h1(rVar, cVar);
                }
                if (z2 && bVar.f1630d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.f1633c;
    }

    public final View R0(RecyclerView.r rVar, RecyclerView.w wVar) {
        return Z0(rVar, wVar, 0, x(), wVar.b());
    }

    public View S0(boolean z2, boolean z3) {
        int x2;
        int i2;
        if (this.f1616u) {
            x2 = 0;
            i2 = x();
        } else {
            x2 = x() - 1;
            i2 = -1;
        }
        return Y0(x2, i2, z2, z3);
    }

    public View T0(boolean z2, boolean z3) {
        int i2;
        int x2;
        if (this.f1616u) {
            i2 = x() - 1;
            x2 = -1;
        } else {
            i2 = 0;
            x2 = x();
        }
        return Y0(i2, x2, z2, z3);
    }

    public boolean U() {
        return true;
    }

    public int U0() {
        View Y0 = Y0(0, x(), false, true);
        if (Y0 == null) {
            return -1;
        }
        return Q(Y0);
    }

    public final View V0(RecyclerView.r rVar, RecyclerView.w wVar) {
        return Z0(rVar, wVar, x() - 1, -1, wVar.b());
    }

    public int W0() {
        View Y0 = Y0(x() - 1, -1, false, true);
        if (Y0 == null) {
            return -1;
        }
        return Q(Y0);
    }

    public View X0(int i2, int i3) {
        int i4;
        int i5;
        P0();
        if ((i3 > i2 ? 1 : i3 < i2 ? (char) 65535 : 0) == 0) {
            return w(i2);
        }
        if (this.f1613r.e(w(i2)) < this.f1613r.k()) {
            i5 = 16644;
            i4 = 16388;
        } else {
            i5 = 4161;
            i4 = 4097;
        }
        return (this.f1611p == 0 ? this.f1712c : this.f1713d).a(i2, i3, i5, i4);
    }

    public View Y0(int i2, int i3, boolean z2, boolean z3) {
        P0();
        int i4 = 320;
        int i5 = z2 ? 24579 : 320;
        if (!z3) {
            i4 = 0;
        }
        return (this.f1611p == 0 ? this.f1712c : this.f1713d).a(i2, i3, i5, i4);
    }

    public void Z(RecyclerView recyclerView, RecyclerView.r rVar) {
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
            if (Q >= 0 && Q < i4) {
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

    public PointF a(int i2) {
        if (x() == 0) {
            return null;
        }
        boolean z2 = false;
        int i3 = 1;
        if (i2 < Q(w(0))) {
            z2 = true;
        }
        if (z2 != this.f1616u) {
            i3 = -1;
        }
        return this.f1611p == 0 ? new PointF((float) i3, 0.0f) : new PointF(0.0f, (float) i3);
    }

    public View a0(View view, int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        int O0;
        View view2;
        k1();
        if (x() == 0 || (O0 = O0(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        P0();
        o1(O0, (int) (((float) this.f1613r.l()) * 0.33333334f), false, wVar);
        c cVar = this.f1612q;
        cVar.f1637g = Integer.MIN_VALUE;
        cVar.f1631a = false;
        Q0(rVar, cVar, wVar, true);
        if (O0 == -1) {
            if (this.f1616u) {
                view2 = X0(x() - 1, -1);
            } else {
                view2 = X0(0, x());
            }
        } else if (this.f1616u) {
            view2 = X0(0, x());
        } else {
            view2 = X0(x() - 1, -1);
        }
        View d12 = O0 == -1 ? d1() : c1();
        if (!d12.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return d12;
    }

    public final int a1(int i2, RecyclerView.r rVar, RecyclerView.w wVar, boolean z2) {
        int g2;
        int g3 = this.f1613r.g() - i2;
        if (g3 <= 0) {
            return 0;
        }
        int i3 = -l1(-g3, rVar, wVar);
        int i4 = i2 + i3;
        if (!z2 || (g2 = this.f1613r.g() - i4) <= 0) {
            return i3;
        }
        this.f1613r.p(g2);
        return g2 + i3;
    }

    public void b0(AccessibilityEvent accessibilityEvent) {
        super.b0(accessibilityEvent);
        if (x() > 0) {
            accessibilityEvent.setFromIndex(U0());
            accessibilityEvent.setToIndex(W0());
        }
    }

    public final int b1(int i2, RecyclerView.r rVar, RecyclerView.w wVar, boolean z2) {
        int k2;
        int k3 = i2 - this.f1613r.k();
        if (k3 <= 0) {
            return 0;
        }
        int i3 = -l1(k3, rVar, wVar);
        int i4 = i2 + i3;
        if (!z2 || (k2 = i4 - this.f1613r.k()) <= 0) {
            return i3;
        }
        this.f1613r.p(-k2);
        return i3 - k2;
    }

    public final View c1() {
        return w(this.f1616u ? 0 : x() - 1);
    }

    public void d(String str) {
        RecyclerView recyclerView;
        if (this.f1621z == null && (recyclerView = this.f1711b) != null) {
            recyclerView.i(str);
        }
    }

    public final View d1() {
        return w(this.f1616u ? x() - 1 : 0);
    }

    public boolean e() {
        return this.f1611p == 0;
    }

    public boolean e1() {
        return J() == 1;
    }

    public boolean f() {
        return this.f1611p == 1;
    }

    public void f1(RecyclerView.r rVar, RecyclerView.w wVar, c cVar, b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View c2 = cVar.c(rVar);
        if (c2 == null) {
            bVar.f1628b = true;
            return;
        }
        RecyclerView.m mVar = (RecyclerView.m) c2.getLayoutParams();
        if (cVar.f1641k == null) {
            if (this.f1616u == (cVar.f1636f == -1)) {
                c(c2, -1, false);
            } else {
                c(c2, 0, false);
            }
        } else {
            if (this.f1616u == (cVar.f1636f == -1)) {
                c(c2, -1, true);
            } else {
                c(c2, 0, true);
            }
        }
        RecyclerView.m mVar2 = (RecyclerView.m) c2.getLayoutParams();
        Rect L = this.f1711b.L(c2);
        int y2 = RecyclerView.l.y(this.f1723n, this.f1721l, O() + N() + mVar2.leftMargin + mVar2.rightMargin + L.left + L.right + 0, mVar2.width, e());
        int y3 = RecyclerView.l.y(this.f1724o, this.f1722m, M() + P() + mVar2.topMargin + mVar2.bottomMargin + L.top + L.bottom + 0, mVar2.height, f());
        if (D0(c2, y2, y3, mVar2)) {
            c2.measure(y2, y3);
        }
        bVar.f1627a = this.f1613r.c(c2);
        if (this.f1611p == 1) {
            if (e1()) {
                i6 = this.f1723n - O();
                i5 = i6 - this.f1613r.d(c2);
            } else {
                i5 = N();
                i6 = this.f1613r.d(c2) + i5;
            }
            int i7 = cVar.f1636f;
            int i8 = cVar.f1632b;
            if (i7 == -1) {
                i2 = i8;
                i3 = i6;
                i4 = i8 - bVar.f1627a;
            } else {
                i4 = i8;
                i3 = i6;
                i2 = bVar.f1627a + i8;
            }
        } else {
            int P = P();
            int d2 = this.f1613r.d(c2) + P;
            int i9 = cVar.f1636f;
            int i10 = cVar.f1632b;
            if (i9 == -1) {
                i3 = i10;
                i4 = P;
                i2 = d2;
                i5 = i10 - bVar.f1627a;
            } else {
                i4 = P;
                i3 = bVar.f1627a + i10;
                i2 = d2;
                i5 = i10;
            }
        }
        W(c2, i5, i4, i3, i2);
        if (mVar.c() || mVar.b()) {
            bVar.f1629c = true;
        }
        bVar.f1630d = c2.hasFocusable();
    }

    public void g1(RecyclerView.r rVar, RecyclerView.w wVar, a aVar, int i2) {
    }

    public final void h1(RecyclerView.r rVar, c cVar) {
        if (cVar.f1631a && !cVar.f1642l) {
            int i2 = cVar.f1637g;
            int i3 = cVar.f1639i;
            if (cVar.f1636f == -1) {
                int x2 = x();
                if (i2 >= 0) {
                    int f2 = (this.f1613r.f() - i2) + i3;
                    if (this.f1616u) {
                        for (int i4 = 0; i4 < x2; i4++) {
                            View w2 = w(i4);
                            if (this.f1613r.e(w2) < f2 || this.f1613r.o(w2) < f2) {
                                i1(rVar, 0, i4);
                                return;
                            }
                        }
                        return;
                    }
                    int i5 = x2 - 1;
                    for (int i6 = i5; i6 >= 0; i6--) {
                        View w3 = w(i6);
                        if (this.f1613r.e(w3) < f2 || this.f1613r.o(w3) < f2) {
                            i1(rVar, i5, i6);
                            return;
                        }
                    }
                }
            } else if (i2 >= 0) {
                int i7 = i2 - i3;
                int x3 = x();
                if (this.f1616u) {
                    int i8 = x3 - 1;
                    for (int i9 = i8; i9 >= 0; i9--) {
                        View w4 = w(i9);
                        if (this.f1613r.b(w4) > i7 || this.f1613r.n(w4) > i7) {
                            i1(rVar, i8, i9);
                            return;
                        }
                    }
                    return;
                }
                for (int i10 = 0; i10 < x3; i10++) {
                    View w5 = w(i10);
                    if (this.f1613r.b(w5) > i7 || this.f1613r.n(w5) > i7) {
                        i1(rVar, 0, i10);
                        return;
                    }
                }
            }
        }
    }

    public void i(int i2, int i3, RecyclerView.w wVar, RecyclerView.l.c cVar) {
        if (this.f1611p != 0) {
            i2 = i3;
        }
        if (x() != 0 && i2 != 0) {
            P0();
            o1(i2 > 0 ? 1 : -1, Math.abs(i2), true, wVar);
            K0(wVar, this.f1612q, cVar);
        }
    }

    public final void i1(RecyclerView.r rVar, int i2, int i3) {
        if (i2 != i3) {
            if (i3 > i2) {
                for (int i4 = i3 - 1; i4 >= i2; i4--) {
                    r0(i4, rVar);
                }
                return;
            }
            while (i2 > i3) {
                r0(i2, rVar);
                i2--;
            }
        }
    }

    public void j(int i2, RecyclerView.l.c cVar) {
        boolean z2;
        int i3;
        d dVar = this.f1621z;
        int i4 = -1;
        if (dVar == null || !dVar.j()) {
            k1();
            z2 = this.f1616u;
            i3 = this.f1619x;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            d dVar2 = this.f1621z;
            z2 = dVar2.f1645d;
            i3 = dVar2.f1643b;
        }
        if (!z2) {
            i4 = 1;
        }
        for (int i5 = 0; i5 < this.C && i3 >= 0 && i3 < i2; i5++) {
            ((n.b) cVar).a(i3, 0);
            i3 += i4;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j0(androidx.recyclerview.widget.RecyclerView.r r17, androidx.recyclerview.widget.RecyclerView.w r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f1621z
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.f1619x
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r18.b()
            if (r3 != 0) goto L_0x0019
            r16.o0(r17)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f1621z
            if (r3 == 0) goto L_0x0029
            boolean r3 = r3.j()
            if (r3 == 0) goto L_0x0029
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.f1621z
            int r3 = r3.f1643b
            r0.f1619x = r3
        L_0x0029:
            r16.P0()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            r5 = 0
            r3.f1631a = r5
            r16.k1()
            android.view.View r3 = r16.H()
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.A
            boolean r7 = r6.f1626e
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 1
            if (r7 == 0) goto L_0x0073
            int r7 = r0.f1619x
            if (r7 != r4) goto L_0x0073
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f1621z
            if (r7 == 0) goto L_0x004a
            goto L_0x0073
        L_0x004a:
            if (r3 == 0) goto L_0x0236
            androidx.recyclerview.widget.t r6 = r0.f1613r
            int r6 = r6.e(r3)
            androidx.recyclerview.widget.t r7 = r0.f1613r
            int r7 = r7.g()
            if (r6 >= r7) goto L_0x0068
            androidx.recyclerview.widget.t r6 = r0.f1613r
            int r6 = r6.b(r3)
            androidx.recyclerview.widget.t r7 = r0.f1613r
            int r7 = r7.k()
            if (r6 > r7) goto L_0x0236
        L_0x0068:
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.A
            int r7 = r0.Q(r3)
            r6.c(r3, r7)
            goto L_0x0236
        L_0x0073:
            r6.d()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            boolean r6 = r0.f1616u
            boolean r7 = r0.f1617v
            r6 = r6 ^ r7
            r3.f1625d = r6
            boolean r6 = r2.f1772g
            if (r6 != 0) goto L_0x0170
            int r6 = r0.f1619x
            if (r6 != r4) goto L_0x0089
            goto L_0x0170
        L_0x0089:
            if (r6 < 0) goto L_0x016c
            int r7 = r18.b()
            if (r6 < r7) goto L_0x0093
            goto L_0x016c
        L_0x0093:
            int r6 = r0.f1619x
            r3.f1623b = r6
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f1621z
            if (r6 == 0) goto L_0x00c1
            boolean r6 = r6.j()
            if (r6 == 0) goto L_0x00c1
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.f1621z
            boolean r6 = r6.f1645d
            r3.f1625d = r6
            if (r6 == 0) goto L_0x00b5
            androidx.recyclerview.widget.t r6 = r0.f1613r
            int r6 = r6.g()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f1621z
            int r7 = r7.f1644c
            goto L_0x015d
        L_0x00b5:
            androidx.recyclerview.widget.t r6 = r0.f1613r
            int r6 = r6.k()
            androidx.recyclerview.widget.LinearLayoutManager$d r7 = r0.f1621z
            int r7 = r7.f1644c
            goto L_0x0167
        L_0x00c1:
            int r6 = r0.f1620y
            if (r6 != r8) goto L_0x014f
            int r6 = r0.f1619x
            android.view.View r6 = r0.s(r6)
            if (r6 == 0) goto L_0x012d
            androidx.recyclerview.widget.t r7 = r0.f1613r
            int r7 = r7.c(r6)
            androidx.recyclerview.widget.t r10 = r0.f1613r
            int r10 = r10.l()
            if (r7 <= r10) goto L_0x00dd
            goto L_0x014b
        L_0x00dd:
            androidx.recyclerview.widget.t r7 = r0.f1613r
            int r7 = r7.e(r6)
            androidx.recyclerview.widget.t r10 = r0.f1613r
            int r10 = r10.k()
            int r7 = r7 - r10
            if (r7 >= 0) goto L_0x00f8
            androidx.recyclerview.widget.t r6 = r0.f1613r
            int r6 = r6.k()
            r3.f1624c = r6
            r3.f1625d = r5
            goto L_0x016a
        L_0x00f8:
            androidx.recyclerview.widget.t r7 = r0.f1613r
            int r7 = r7.g()
            androidx.recyclerview.widget.t r10 = r0.f1613r
            int r10 = r10.b(r6)
            int r7 = r7 - r10
            if (r7 >= 0) goto L_0x0112
            androidx.recyclerview.widget.t r6 = r0.f1613r
            int r6 = r6.g()
            r3.f1624c = r6
            r3.f1625d = r9
            goto L_0x016a
        L_0x0112:
            boolean r7 = r3.f1625d
            if (r7 == 0) goto L_0x0124
            androidx.recyclerview.widget.t r7 = r0.f1613r
            int r6 = r7.b(r6)
            androidx.recyclerview.widget.t r7 = r0.f1613r
            int r7 = r7.m()
            int r7 = r7 + r6
            goto L_0x012a
        L_0x0124:
            androidx.recyclerview.widget.t r7 = r0.f1613r
            int r7 = r7.e(r6)
        L_0x012a:
            r3.f1624c = r7
            goto L_0x016a
        L_0x012d:
            int r6 = r16.x()
            if (r6 <= 0) goto L_0x014b
            android.view.View r6 = r0.w(r5)
            int r6 = r0.Q(r6)
            int r7 = r0.f1619x
            if (r7 >= r6) goto L_0x0141
            r6 = 1
            goto L_0x0142
        L_0x0141:
            r6 = 0
        L_0x0142:
            boolean r7 = r0.f1616u
            if (r6 != r7) goto L_0x0148
            r6 = 1
            goto L_0x0149
        L_0x0148:
            r6 = 0
        L_0x0149:
            r3.f1625d = r6
        L_0x014b:
            r3.a()
            goto L_0x016a
        L_0x014f:
            boolean r6 = r0.f1616u
            r3.f1625d = r6
            if (r6 == 0) goto L_0x015f
            androidx.recyclerview.widget.t r6 = r0.f1613r
            int r6 = r6.g()
            int r7 = r0.f1620y
        L_0x015d:
            int r6 = r6 - r7
            goto L_0x0168
        L_0x015f:
            androidx.recyclerview.widget.t r6 = r0.f1613r
            int r6 = r6.k()
            int r7 = r0.f1620y
        L_0x0167:
            int r6 = r6 + r7
        L_0x0168:
            r3.f1624c = r6
        L_0x016a:
            r6 = 1
            goto L_0x0171
        L_0x016c:
            r0.f1619x = r4
            r0.f1620y = r8
        L_0x0170:
            r6 = 0
        L_0x0171:
            if (r6 == 0) goto L_0x0175
            goto L_0x0232
        L_0x0175:
            int r6 = r16.x()
            if (r6 != 0) goto L_0x017d
            goto L_0x021e
        L_0x017d:
            android.view.View r6 = r16.H()
            if (r6 == 0) goto L_0x01ad
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$m r7 = (androidx.recyclerview.widget.RecyclerView.m) r7
            boolean r10 = r7.c()
            if (r10 != 0) goto L_0x01a1
            int r10 = r7.a()
            if (r10 < 0) goto L_0x01a1
            int r7 = r7.a()
            int r10 = r18.b()
            if (r7 >= r10) goto L_0x01a1
            r7 = 1
            goto L_0x01a2
        L_0x01a1:
            r7 = 0
        L_0x01a2:
            if (r7 == 0) goto L_0x01ad
            int r7 = r0.Q(r6)
            r3.c(r6, r7)
            goto L_0x021c
        L_0x01ad:
            boolean r6 = r0.f1614s
            boolean r7 = r0.f1617v
            if (r6 == r7) goto L_0x01b5
            goto L_0x021e
        L_0x01b5:
            boolean r6 = r3.f1625d
            if (r6 == 0) goto L_0x01c7
            boolean r6 = r0.f1616u
            if (r6 == 0) goto L_0x01c2
            android.view.View r6 = r16.R0(r17, r18)
            goto L_0x01d4
        L_0x01c2:
            android.view.View r6 = r16.V0(r17, r18)
            goto L_0x01d4
        L_0x01c7:
            boolean r6 = r0.f1616u
            if (r6 == 0) goto L_0x01d0
            android.view.View r6 = r16.V0(r17, r18)
            goto L_0x01d4
        L_0x01d0:
            android.view.View r6 = r16.R0(r17, r18)
        L_0x01d4:
            if (r6 == 0) goto L_0x021e
            int r7 = r0.Q(r6)
            r3.b(r6, r7)
            boolean r7 = r2.f1772g
            if (r7 != 0) goto L_0x021c
            boolean r7 = r16.I0()
            if (r7 == 0) goto L_0x021c
            androidx.recyclerview.widget.t r7 = r0.f1613r
            int r7 = r7.e(r6)
            androidx.recyclerview.widget.t r10 = r0.f1613r
            int r10 = r10.g()
            if (r7 >= r10) goto L_0x0206
            androidx.recyclerview.widget.t r7 = r0.f1613r
            int r6 = r7.b(r6)
            androidx.recyclerview.widget.t r7 = r0.f1613r
            int r7 = r7.k()
            if (r6 >= r7) goto L_0x0204
            goto L_0x0206
        L_0x0204:
            r6 = 0
            goto L_0x0207
        L_0x0206:
            r6 = 1
        L_0x0207:
            if (r6 == 0) goto L_0x021c
            boolean r6 = r3.f1625d
            if (r6 == 0) goto L_0x0214
            androidx.recyclerview.widget.t r6 = r0.f1613r
            int r6 = r6.g()
            goto L_0x021a
        L_0x0214:
            androidx.recyclerview.widget.t r6 = r0.f1613r
            int r6 = r6.k()
        L_0x021a:
            r3.f1624c = r6
        L_0x021c:
            r6 = 1
            goto L_0x021f
        L_0x021e:
            r6 = 0
        L_0x021f:
            if (r6 == 0) goto L_0x0222
            goto L_0x0232
        L_0x0222:
            r3.a()
            boolean r6 = r0.f1617v
            if (r6 == 0) goto L_0x022f
            int r6 = r18.b()
            int r6 = r6 + r4
            goto L_0x0230
        L_0x022f:
            r6 = 0
        L_0x0230:
            r3.f1623b = r6
        L_0x0232:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            r3.f1626e = r9
        L_0x0236:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            int r6 = r3.f1640j
            if (r6 < 0) goto L_0x023e
            r6 = 1
            goto L_0x023f
        L_0x023e:
            r6 = -1
        L_0x023f:
            r3.f1636f = r6
            int[] r3 = r0.D
            r3[r5] = r5
            r3[r9] = r5
            r0.J0(r2, r3)
            int[] r3 = r0.D
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.t r6 = r0.f1613r
            int r6 = r6.k()
            int r6 = r6 + r3
            int[] r3 = r0.D
            r3 = r3[r9]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.t r7 = r0.f1613r
            int r7 = r7.h()
            int r7 = r7 + r3
            boolean r3 = r2.f1772g
            if (r3 == 0) goto L_0x02a3
            int r3 = r0.f1619x
            if (r3 == r4) goto L_0x02a3
            int r10 = r0.f1620y
            if (r10 == r8) goto L_0x02a3
            android.view.View r3 = r0.s(r3)
            if (r3 == 0) goto L_0x02a3
            boolean r8 = r0.f1616u
            if (r8 == 0) goto L_0x028e
            androidx.recyclerview.widget.t r8 = r0.f1613r
            int r8 = r8.g()
            androidx.recyclerview.widget.t r10 = r0.f1613r
            int r3 = r10.b(r3)
            int r8 = r8 - r3
            int r3 = r0.f1620y
            goto L_0x029d
        L_0x028e:
            androidx.recyclerview.widget.t r8 = r0.f1613r
            int r3 = r8.e(r3)
            androidx.recyclerview.widget.t r8 = r0.f1613r
            int r8 = r8.k()
            int r3 = r3 - r8
            int r8 = r0.f1620y
        L_0x029d:
            int r8 = r8 - r3
            if (r8 <= 0) goto L_0x02a2
            int r6 = r6 + r8
            goto L_0x02a3
        L_0x02a2:
            int r7 = r7 - r8
        L_0x02a3:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            boolean r8 = r3.f1625d
            if (r8 == 0) goto L_0x02ae
            boolean r8 = r0.f1616u
            if (r8 == 0) goto L_0x02b2
            goto L_0x02b4
        L_0x02ae:
            boolean r8 = r0.f1616u
            if (r8 == 0) goto L_0x02b4
        L_0x02b2:
            r8 = -1
            goto L_0x02b5
        L_0x02b4:
            r8 = 1
        L_0x02b5:
            r0.g1(r1, r2, r3, r8)
            r16.q(r17)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            boolean r8 = r16.j1()
            r3.f1642l = r8
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            java.util.Objects.requireNonNull(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            r3.f1639i = r5
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            boolean r8 = r3.f1625d
            if (r8 == 0) goto L_0x0319
            int r8 = r3.f1623b
            int r3 = r3.f1624c
            r0.q1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            r3.f1638h = r6
            r0.Q0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            int r6 = r3.f1632b
            int r8 = r3.f1634d
            int r3 = r3.f1633c
            if (r3 <= 0) goto L_0x02eb
            int r7 = r7 + r3
        L_0x02eb:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            int r10 = r3.f1623b
            int r3 = r3.f1624c
            r0.p1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            r3.f1638h = r7
            int r7 = r3.f1634d
            int r10 = r3.f1635e
            int r7 = r7 + r10
            r3.f1634d = r7
            r0.Q0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            int r7 = r3.f1632b
            int r3 = r3.f1633c
            if (r3 <= 0) goto L_0x035f
            r0.q1(r8, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.f1612q
            r6.f1638h = r3
            r0.Q0(r1, r6, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            int r6 = r3.f1632b
            goto L_0x035f
        L_0x0319:
            int r8 = r3.f1623b
            int r3 = r3.f1624c
            r0.p1(r8, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            r3.f1638h = r7
            r0.Q0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            int r7 = r3.f1632b
            int r8 = r3.f1634d
            int r3 = r3.f1633c
            if (r3 <= 0) goto L_0x0332
            int r6 = r6 + r3
        L_0x0332:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.A
            int r10 = r3.f1623b
            int r3 = r3.f1624c
            r0.q1(r10, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            r3.f1638h = r6
            int r6 = r3.f1634d
            int r10 = r3.f1635e
            int r6 = r6 + r10
            r3.f1634d = r6
            r0.Q0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            int r6 = r3.f1632b
            int r3 = r3.f1633c
            if (r3 <= 0) goto L_0x035f
            r0.p1(r8, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.f1612q
            r7.f1638h = r3
            r0.Q0(r1, r7, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f1612q
            int r7 = r3.f1632b
        L_0x035f:
            int r3 = r16.x()
            if (r3 <= 0) goto L_0x0383
            boolean r3 = r0.f1616u
            boolean r8 = r0.f1617v
            r3 = r3 ^ r8
            if (r3 == 0) goto L_0x0377
            int r3 = r0.a1(r7, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.b1(r6, r1, r2, r5)
            goto L_0x0381
        L_0x0377:
            int r3 = r0.b1(r6, r1, r2, r9)
            int r6 = r6 + r3
            int r7 = r7 + r3
            int r3 = r0.a1(r7, r1, r2, r5)
        L_0x0381:
            int r6 = r6 + r3
            int r7 = r7 + r3
        L_0x0383:
            boolean r3 = r2.f1776k
            if (r3 == 0) goto L_0x0419
            int r3 = r16.x()
            if (r3 == 0) goto L_0x0419
            boolean r3 = r2.f1772g
            if (r3 != 0) goto L_0x0419
            boolean r3 = r16.I0()
            if (r3 != 0) goto L_0x0399
            goto L_0x0419
        L_0x0399:
            java.util.List<androidx.recyclerview.widget.RecyclerView$z> r3 = r1.f1744d
            int r8 = r3.size()
            android.view.View r10 = r0.w(r5)
            int r10 = r0.Q(r10)
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x03aa:
            if (r11 >= r8) goto L_0x03da
            java.lang.Object r14 = r3.get(r11)
            androidx.recyclerview.widget.RecyclerView$z r14 = (androidx.recyclerview.widget.RecyclerView.z) r14
            boolean r15 = r14.l()
            if (r15 == 0) goto L_0x03b9
            goto L_0x03d6
        L_0x03b9:
            int r15 = r14.e()
            if (r15 >= r10) goto L_0x03c1
            r15 = 1
            goto L_0x03c2
        L_0x03c1:
            r15 = 0
        L_0x03c2:
            boolean r9 = r0.f1616u
            if (r15 == r9) goto L_0x03c8
            r9 = -1
            goto L_0x03c9
        L_0x03c8:
            r9 = 1
        L_0x03c9:
            androidx.recyclerview.widget.t r15 = r0.f1613r
            android.view.View r14 = r14.f1788a
            int r14 = r15.c(r14)
            if (r9 != r4) goto L_0x03d5
            int r12 = r12 + r14
            goto L_0x03d6
        L_0x03d5:
            int r13 = r13 + r14
        L_0x03d6:
            int r11 = r11 + 1
            r9 = 1
            goto L_0x03aa
        L_0x03da:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f1612q
            r4.f1641k = r3
            r3 = 0
            if (r12 <= 0) goto L_0x03fa
            android.view.View r4 = r16.d1()
            int r4 = r0.Q(r4)
            r0.q1(r4, r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f1612q
            r4.f1638h = r12
            r4.f1633c = r5
            r4.a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f1612q
            r0.Q0(r1, r4, r2, r5)
        L_0x03fa:
            if (r13 <= 0) goto L_0x0415
            android.view.View r4 = r16.c1()
            int r4 = r0.Q(r4)
            r0.p1(r4, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f1612q
            r4.f1638h = r13
            r4.f1633c = r5
            r4.a(r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f1612q
            r0.Q0(r1, r4, r2, r5)
        L_0x0415:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f1612q
            r1.f1641k = r3
        L_0x0419:
            boolean r1 = r2.f1772g
            if (r1 != 0) goto L_0x0426
            androidx.recyclerview.widget.t r1 = r0.f1613r
            int r2 = r1.l()
            r1.f1996b = r2
            goto L_0x042b
        L_0x0426:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.A
            r1.d()
        L_0x042b:
            boolean r1 = r0.f1617v
            r0.f1614s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.j0(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    public boolean j1() {
        return this.f1613r.i() == 0 && this.f1613r.f() == 0;
    }

    public int k(RecyclerView.w wVar) {
        return L0(wVar);
    }

    public void k0(RecyclerView.w wVar) {
        this.f1621z = null;
        this.f1619x = -1;
        this.f1620y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void k1() {
        this.f1616u = (this.f1611p == 1 || !e1()) ? this.f1615t : !this.f1615t;
    }

    public int l(RecyclerView.w wVar) {
        return M0(wVar);
    }

    public void l0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.f1621z = (d) parcelable;
            u0();
        }
    }

    public int l1(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (x() == 0 || i2 == 0) {
            return 0;
        }
        P0();
        this.f1612q.f1631a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int abs = Math.abs(i2);
        o1(i3, abs, true, wVar);
        c cVar = this.f1612q;
        int Q0 = Q0(rVar, cVar, wVar, false) + cVar.f1637g;
        if (Q0 < 0) {
            return 0;
        }
        if (abs > Q0) {
            i2 = i3 * Q0;
        }
        this.f1613r.p(-i2);
        this.f1612q.f1640j = i2;
        return i2;
    }

    public int m(RecyclerView.w wVar) {
        return N0(wVar);
    }

    public Parcelable m0() {
        d dVar = this.f1621z;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (x() > 0) {
            P0();
            boolean z2 = this.f1614s ^ this.f1616u;
            dVar2.f1645d = z2;
            if (z2) {
                View c12 = c1();
                dVar2.f1644c = this.f1613r.g() - this.f1613r.b(c12);
                dVar2.f1643b = Q(c12);
            } else {
                View d12 = d1();
                dVar2.f1643b = Q(d12);
                dVar2.f1644c = this.f1613r.e(d12) - this.f1613r.k();
            }
        } else {
            dVar2.f1643b = -1;
        }
        return dVar2;
    }

    public void m1(int i2) {
        if (i2 == 0 || i2 == 1) {
            d((String) null);
            if (i2 != this.f1611p || this.f1613r == null) {
                t a2 = t.a(this, i2);
                this.f1613r = a2;
                this.A.f1622a = a2;
                this.f1611p = i2;
                u0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i2);
    }

    public int n(RecyclerView.w wVar) {
        return L0(wVar);
    }

    public void n1(boolean z2) {
        d((String) null);
        if (this.f1617v != z2) {
            this.f1617v = z2;
            u0();
        }
    }

    public int o(RecyclerView.w wVar) {
        return M0(wVar);
    }

    public final void o1(int i2, int i3, boolean z2, RecyclerView.w wVar) {
        int i4;
        this.f1612q.f1642l = j1();
        this.f1612q.f1636f = i2;
        int[] iArr = this.D;
        boolean z3 = false;
        iArr[0] = 0;
        int i5 = 1;
        iArr[1] = 0;
        J0(wVar, iArr);
        int max = Math.max(0, this.D[0]);
        int max2 = Math.max(0, this.D[1]);
        if (i2 == 1) {
            z3 = true;
        }
        c cVar = this.f1612q;
        int i6 = z3 ? max2 : max;
        cVar.f1638h = i6;
        if (!z3) {
            max = max2;
        }
        cVar.f1639i = max;
        if (z3) {
            cVar.f1638h = this.f1613r.h() + i6;
            View c12 = c1();
            c cVar2 = this.f1612q;
            if (this.f1616u) {
                i5 = -1;
            }
            cVar2.f1635e = i5;
            int Q = Q(c12);
            c cVar3 = this.f1612q;
            cVar2.f1634d = Q + cVar3.f1635e;
            cVar3.f1632b = this.f1613r.b(c12);
            i4 = this.f1613r.b(c12) - this.f1613r.g();
        } else {
            View d12 = d1();
            c cVar4 = this.f1612q;
            cVar4.f1638h = this.f1613r.k() + cVar4.f1638h;
            c cVar5 = this.f1612q;
            if (!this.f1616u) {
                i5 = -1;
            }
            cVar5.f1635e = i5;
            int Q2 = Q(d12);
            c cVar6 = this.f1612q;
            cVar5.f1634d = Q2 + cVar6.f1635e;
            cVar6.f1632b = this.f1613r.e(d12);
            i4 = (-this.f1613r.e(d12)) + this.f1613r.k();
        }
        c cVar7 = this.f1612q;
        cVar7.f1633c = i3;
        if (z2) {
            cVar7.f1633c = i3 - i4;
        }
        cVar7.f1637g = i4;
    }

    public int p(RecyclerView.w wVar) {
        return N0(wVar);
    }

    public final void p1(int i2, int i3) {
        this.f1612q.f1633c = this.f1613r.g() - i3;
        c cVar = this.f1612q;
        cVar.f1635e = this.f1616u ? -1 : 1;
        cVar.f1634d = i2;
        cVar.f1636f = 1;
        cVar.f1632b = i3;
        cVar.f1637g = Integer.MIN_VALUE;
    }

    public final void q1(int i2, int i3) {
        this.f1612q.f1633c = i3 - this.f1613r.k();
        c cVar = this.f1612q;
        cVar.f1634d = i2;
        cVar.f1635e = this.f1616u ? 1 : -1;
        cVar.f1636f = -1;
        cVar.f1632b = i3;
        cVar.f1637g = Integer.MIN_VALUE;
    }

    public View s(int i2) {
        int x2 = x();
        if (x2 == 0) {
            return null;
        }
        int Q = i2 - Q(w(0));
        if (Q >= 0 && Q < x2) {
            View w2 = w(Q);
            if (Q(w2) == i2) {
                return w2;
            }
        }
        return super.s(i2);
    }

    public RecyclerView.m t() {
        return new RecyclerView.m(-2, -2);
    }

    public int v0(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.f1611p == 1) {
            return 0;
        }
        return l1(i2, rVar, wVar);
    }

    public void w0(int i2) {
        this.f1619x = i2;
        this.f1620y = Integer.MIN_VALUE;
        d dVar = this.f1621z;
        if (dVar != null) {
            dVar.f1643b = -1;
        }
        u0();
    }

    public int x0(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (this.f1611p == 0) {
            return 0;
        }
        return l1(i2, rVar, wVar);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.l.d R = RecyclerView.l.R(context, attributeSet, i2, i3);
        m1(R.f1727a);
        boolean z2 = R.f1729c;
        d((String) null);
        if (z2 != this.f1615t) {
            this.f1615t = z2;
            u0();
        }
        n1(R.f1730d);
    }
}
