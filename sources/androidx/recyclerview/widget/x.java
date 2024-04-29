package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

public class x implements a.C0012a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2002a;

    public x(RecyclerView recyclerView) {
        this.f2002a = recyclerView;
    }

    public void a(a.b bVar) {
        int i2 = bVar.f1853a;
        if (i2 == 1) {
            RecyclerView recyclerView = this.f2002a;
            recyclerView.f1674m.e0(recyclerView, bVar.f1854b, bVar.f1856d);
        } else if (i2 == 2) {
            RecyclerView recyclerView2 = this.f2002a;
            recyclerView2.f1674m.h0(recyclerView2, bVar.f1854b, bVar.f1856d);
        } else if (i2 == 4) {
            RecyclerView recyclerView3 = this.f2002a;
            recyclerView3.f1674m.i0(recyclerView3, bVar.f1854b, bVar.f1856d, bVar.f1855c);
        } else if (i2 == 8) {
            RecyclerView recyclerView4 = this.f2002a;
            recyclerView4.f1674m.g0(recyclerView4, bVar.f1854b, bVar.f1856d, 1);
        }
    }

    public RecyclerView.z b(int i2) {
        RecyclerView recyclerView = this.f2002a;
        int h2 = recyclerView.f1660f.h();
        int i3 = 0;
        RecyclerView.z zVar = null;
        while (true) {
            if (i3 >= h2) {
                break;
            }
            RecyclerView.z K = RecyclerView.K(recyclerView.f1660f.g(i3));
            if (K != null && !K.l() && K.f1790c == i2) {
                if (!recyclerView.f1660f.k(K.f1788a)) {
                    zVar = K;
                    break;
                }
                zVar = K;
            }
            i3++;
        }
        if (zVar != null && !this.f2002a.f1660f.k(zVar.f1788a)) {
            return zVar;
        }
        return null;
    }

    public void c(int i2, int i3, Object obj) {
        int i4;
        int i5;
        RecyclerView recyclerView = this.f2002a;
        int h2 = recyclerView.f1660f.h();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < h2; i7++) {
            View g2 = recyclerView.f1660f.g(i7);
            RecyclerView.z K = RecyclerView.K(g2);
            if (K != null && !K.t() && (i5 = K.f1790c) >= i2 && i5 < i6) {
                K.b(2);
                K.a(obj);
                ((RecyclerView.m) g2.getLayoutParams()).f1733c = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f1654c;
        int size = rVar.f1743c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.z zVar = rVar.f1743c.get(size);
                if (zVar != null && (i4 = zVar.f1790c) >= i2 && i4 < i6) {
                    zVar.b(2);
                    rVar.f(size);
                }
            } else {
                this.f2002a.f1667i0 = true;
                return;
            }
        }
    }

    public void d(int i2, int i3) {
        RecyclerView recyclerView = this.f2002a;
        int h2 = recyclerView.f1660f.h();
        for (int i4 = 0; i4 < h2; i4++) {
            RecyclerView.z K = RecyclerView.K(recyclerView.f1660f.g(i4));
            if (K != null && !K.t() && K.f1790c >= i2) {
                K.p(i3, false);
                recyclerView.f1659e0.f1771f = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f1654c;
        int size = rVar.f1743c.size();
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.z zVar = rVar.f1743c.get(i5);
            if (zVar != null && zVar.f1790c >= i2) {
                zVar.p(i3, true);
            }
        }
        recyclerView.requestLayout();
        this.f2002a.f1665h0 = true;
    }

    public void e(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        RecyclerView recyclerView = this.f2002a;
        int h2 = recyclerView.f1660f.h();
        int i11 = -1;
        if (i2 < i3) {
            i6 = i2;
            i5 = i3;
            i4 = -1;
        } else {
            i5 = i2;
            i6 = i3;
            i4 = 1;
        }
        for (int i12 = 0; i12 < h2; i12++) {
            RecyclerView.z K = RecyclerView.K(recyclerView.f1660f.g(i12));
            if (K != null && (i10 = K.f1790c) >= i6 && i10 <= i5) {
                if (i10 == i2) {
                    K.p(i3 - i2, false);
                } else {
                    K.p(i4, false);
                }
                recyclerView.f1659e0.f1771f = true;
            }
        }
        RecyclerView.r rVar = recyclerView.f1654c;
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i8 = i3;
            i11 = 1;
        }
        int size = rVar.f1743c.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.z zVar = rVar.f1743c.get(i13);
            if (zVar != null && (i9 = zVar.f1790c) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    zVar.p(i3 - i2, false);
                } else {
                    zVar.p(i11, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f2002a.f1665h0 = true;
    }
}
