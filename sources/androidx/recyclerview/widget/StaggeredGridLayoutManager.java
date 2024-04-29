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
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import h0.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;

public class StaggeredGridLayoutManager extends RecyclerView.l implements RecyclerView.v.b {
    public int A;
    public d B;
    public int C;
    public boolean D;
    public boolean E;
    public e F;
    public final Rect G;
    public final b H;
    public boolean I;
    public int[] J;
    public final Runnable K;

    /* renamed from: p  reason: collision with root package name */
    public int f1806p = -1;

    /* renamed from: q  reason: collision with root package name */
    public f[] f1807q;

    /* renamed from: r  reason: collision with root package name */
    public t f1808r;

    /* renamed from: s  reason: collision with root package name */
    public t f1809s;

    /* renamed from: t  reason: collision with root package name */
    public int f1810t;

    /* renamed from: u  reason: collision with root package name */
    public int f1811u;

    /* renamed from: v  reason: collision with root package name */
    public final o f1812v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1813w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1814x;

    /* renamed from: y  reason: collision with root package name */
    public BitSet f1815y;

    /* renamed from: z  reason: collision with root package name */
    public int f1816z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.K0();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1818a;

        /* renamed from: b  reason: collision with root package name */
        public int f1819b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1820c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1821d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1822e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f1823f;

        public b() {
            b();
        }

        public void a() {
            this.f1819b = this.f1820c ? StaggeredGridLayoutManager.this.f1808r.g() : StaggeredGridLayoutManager.this.f1808r.k();
        }

        public void b() {
            this.f1818a = -1;
            this.f1819b = Integer.MIN_VALUE;
            this.f1820c = false;
            this.f1821d = false;
            this.f1822e = false;
            int[] iArr = this.f1823f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.m {

        /* renamed from: e  reason: collision with root package name */
        public f f1825e;

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public int[] f1826a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f1827b;

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0011a();

            /* renamed from: b  reason: collision with root package name */
            public int f1828b;

            /* renamed from: c  reason: collision with root package name */
            public int f1829c;

            /* renamed from: d  reason: collision with root package name */
            public int[] f1830d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f1831e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public static class C0011a implements Parcelable.Creator<a> {
                public Object createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                public Object[] newArray(int i2) {
                    return new a[i2];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f1828b = parcel.readInt();
                this.f1829c = parcel.readInt();
                this.f1831e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1830d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder a2 = androidx.activity.result.a.a("FullSpanItem{mPosition=");
                a2.append(this.f1828b);
                a2.append(", mGapDir=");
                a2.append(this.f1829c);
                a2.append(", mHasUnwantedGapAfter=");
                a2.append(this.f1831e);
                a2.append(", mGapPerSpan=");
                a2.append(Arrays.toString(this.f1830d));
                a2.append('}');
                return a2.toString();
            }

            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.f1828b);
                parcel.writeInt(this.f1829c);
                parcel.writeInt(this.f1831e ? 1 : 0);
                int[] iArr = this.f1830d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f1830d);
            }
        }

        public void a() {
            int[] iArr = this.f1826a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1827b = null;
        }

        public void b(int i2) {
            int[] iArr = this.f1826a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i2, 10) + 1)];
                this.f1826a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int length = iArr.length;
                while (length <= i2) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f1826a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1826a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public a c(int i2) {
            List<a> list = this.f1827b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1827b.get(size);
                if (aVar.f1828b == i2) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f1826a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f1827b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = -1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.c(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f1827b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f1827b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f1827b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f1828b
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = -1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f1827b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f1827b
                r3.remove(r2)
                int r0 = r0.f1828b
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.f1826a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f1826a
                int r5 = r5.length
                return r5
            L_0x0052:
                int[] r2 = r4.f1826a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.d(int):int");
        }

        public void e(int i2, int i3) {
            int[] iArr = this.f1826a;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                b(i4);
                int[] iArr2 = this.f1826a;
                System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
                Arrays.fill(this.f1826a, i2, i4, -1);
                List<a> list = this.f1827b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f1827b.get(size);
                        int i5 = aVar.f1828b;
                        if (i5 >= i2) {
                            aVar.f1828b = i5 + i3;
                        }
                    }
                }
            }
        }

        public void f(int i2, int i3) {
            int[] iArr = this.f1826a;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                b(i4);
                int[] iArr2 = this.f1826a;
                System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
                int[] iArr3 = this.f1826a;
                Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
                List<a> list = this.f1827b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f1827b.get(size);
                        int i5 = aVar.f1828b;
                        if (i5 >= i2) {
                            if (i5 < i4) {
                                this.f1827b.remove(size);
                            } else {
                                aVar.f1828b = i5 - i3;
                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f1832b;

        /* renamed from: c  reason: collision with root package name */
        public int f1833c;

        /* renamed from: d  reason: collision with root package name */
        public int f1834d;

        /* renamed from: e  reason: collision with root package name */
        public int[] f1835e;

        /* renamed from: f  reason: collision with root package name */
        public int f1836f;

        /* renamed from: g  reason: collision with root package name */
        public int[] f1837g;

        /* renamed from: h  reason: collision with root package name */
        public List<d.a> f1838h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1839i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1840j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1841k;

        public static class a implements Parcelable.Creator<e> {
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public Object[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f1832b = parcel.readInt();
            this.f1833c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1834d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1835e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f1836f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f1837g = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z2 = false;
            this.f1839i = parcel.readInt() == 1;
            this.f1840j = parcel.readInt() == 1;
            this.f1841k = parcel.readInt() == 1 ? true : z2;
            this.f1838h = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f1834d = eVar.f1834d;
            this.f1832b = eVar.f1832b;
            this.f1833c = eVar.f1833c;
            this.f1835e = eVar.f1835e;
            this.f1836f = eVar.f1836f;
            this.f1837g = eVar.f1837g;
            this.f1839i = eVar.f1839i;
            this.f1840j = eVar.f1840j;
            this.f1841k = eVar.f1841k;
            this.f1838h = eVar.f1838h;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f1832b);
            parcel.writeInt(this.f1833c);
            parcel.writeInt(this.f1834d);
            if (this.f1834d > 0) {
                parcel.writeIntArray(this.f1835e);
            }
            parcel.writeInt(this.f1836f);
            if (this.f1836f > 0) {
                parcel.writeIntArray(this.f1837g);
            }
            parcel.writeInt(this.f1839i ? 1 : 0);
            parcel.writeInt(this.f1840j ? 1 : 0);
            parcel.writeInt(this.f1841k ? 1 : 0);
            parcel.writeList(this.f1838h);
        }
    }

    public class f {

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f1842a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1843b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f1844c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f1845d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f1846e;

        public f(int i2) {
            this.f1846e = i2;
        }

        public void a(View view) {
            c j2 = j(view);
            j2.f1825e = this;
            this.f1842a.add(view);
            this.f1844c = Integer.MIN_VALUE;
            if (this.f1842a.size() == 1) {
                this.f1843b = Integer.MIN_VALUE;
            }
            if (j2.c() || j2.b()) {
                this.f1845d = StaggeredGridLayoutManager.this.f1808r.c(view) + this.f1845d;
            }
        }

        public void b() {
            ArrayList<View> arrayList = this.f1842a;
            View view = arrayList.get(arrayList.size() - 1);
            c j2 = j(view);
            this.f1844c = StaggeredGridLayoutManager.this.f1808r.b(view);
            Objects.requireNonNull(j2);
        }

        public void c() {
            View view = this.f1842a.get(0);
            c j2 = j(view);
            this.f1843b = StaggeredGridLayoutManager.this.f1808r.e(view);
            Objects.requireNonNull(j2);
        }

        public void d() {
            this.f1842a.clear();
            this.f1843b = Integer.MIN_VALUE;
            this.f1844c = Integer.MIN_VALUE;
            this.f1845d = 0;
        }

        public int e() {
            int i2;
            int i3;
            if (StaggeredGridLayoutManager.this.f1813w) {
                i3 = this.f1842a.size() - 1;
                i2 = -1;
            } else {
                i3 = 0;
                i2 = this.f1842a.size();
            }
            return g(i3, i2, true);
        }

        public int f() {
            int i2;
            int i3;
            if (StaggeredGridLayoutManager.this.f1813w) {
                i3 = 0;
                i2 = this.f1842a.size();
            } else {
                i3 = this.f1842a.size() - 1;
                i2 = -1;
            }
            return g(i3, i2, true);
        }

        public int g(int i2, int i3, boolean z2) {
            int k2 = StaggeredGridLayoutManager.this.f1808r.k();
            int g2 = StaggeredGridLayoutManager.this.f1808r.g();
            int i4 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.f1842a.get(i2);
                int e2 = StaggeredGridLayoutManager.this.f1808r.e(view);
                int b2 = StaggeredGridLayoutManager.this.f1808r.b(view);
                boolean z3 = false;
                boolean z4 = !z2 ? e2 < g2 : e2 <= g2;
                if (!z2 ? b2 > k2 : b2 >= k2) {
                    z3 = true;
                }
                if (z4 && z3 && (e2 < k2 || b2 > g2)) {
                    return StaggeredGridLayoutManager.this.Q(view);
                }
                i2 += i4;
            }
            return -1;
        }

        public int h(int i2) {
            int i3 = this.f1844c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f1842a.size() == 0) {
                return i2;
            }
            b();
            return this.f1844c;
        }

        public View i(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.f1842a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f1842a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f1813w && staggeredGridLayoutManager.Q(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f1813w && staggeredGridLayoutManager2.Q(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f1842a.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.f1842a.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f1813w && staggeredGridLayoutManager3.Q(view3) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f1813w && staggeredGridLayoutManager4.Q(view3) >= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }

        public c j(View view) {
            return (c) view.getLayoutParams();
        }

        public int k(int i2) {
            int i3 = this.f1843b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.f1842a.size() == 0) {
                return i2;
            }
            c();
            return this.f1843b;
        }

        public void l() {
            int size = this.f1842a.size();
            View remove = this.f1842a.remove(size - 1);
            c j2 = j(remove);
            j2.f1825e = null;
            if (j2.c() || j2.b()) {
                this.f1845d -= StaggeredGridLayoutManager.this.f1808r.c(remove);
            }
            if (size == 1) {
                this.f1843b = Integer.MIN_VALUE;
            }
            this.f1844c = Integer.MIN_VALUE;
        }

        public void m() {
            View remove = this.f1842a.remove(0);
            c j2 = j(remove);
            j2.f1825e = null;
            if (this.f1842a.size() == 0) {
                this.f1844c = Integer.MIN_VALUE;
            }
            if (j2.c() || j2.b()) {
                this.f1845d -= StaggeredGridLayoutManager.this.f1808r.c(remove);
            }
            this.f1843b = Integer.MIN_VALUE;
        }

        public void n(View view) {
            c j2 = j(view);
            j2.f1825e = this;
            this.f1842a.add(0, view);
            this.f1843b = Integer.MIN_VALUE;
            if (this.f1842a.size() == 1) {
                this.f1844c = Integer.MIN_VALUE;
            }
            if (j2.c() || j2.b()) {
                this.f1845d = StaggeredGridLayoutManager.this.f1808r.c(view) + this.f1845d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f1813w = false;
        this.f1814x = false;
        this.f1816z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = new d();
        this.C = 2;
        this.G = new Rect();
        this.H = new b();
        this.I = true;
        this.K = new a();
        RecyclerView.l.d R = RecyclerView.l.R(context, attributeSet, i2, i3);
        int i4 = R.f1727a;
        if (i4 == 0 || i4 == 1) {
            d((String) null);
            if (i4 != this.f1810t) {
                this.f1810t = i4;
                t tVar = this.f1808r;
                this.f1808r = this.f1809s;
                this.f1809s = tVar;
                u0();
            }
            int i5 = R.f1728b;
            d((String) null);
            if (i5 != this.f1806p) {
                this.B.a();
                u0();
                this.f1806p = i5;
                this.f1815y = new BitSet(this.f1806p);
                this.f1807q = new f[this.f1806p];
                for (int i6 = 0; i6 < this.f1806p; i6++) {
                    this.f1807q[i6] = new f(i6);
                }
                u0();
            }
            boolean z2 = R.f1729c;
            d((String) null);
            e eVar = this.F;
            if (!(eVar == null || eVar.f1839i == z2)) {
                eVar.f1839i = z2;
            }
            this.f1813w = z2;
            u0();
            this.f1812v = new o();
            this.f1808r = t.a(this, this.f1810t);
            this.f1809s = t.a(this, 1 - this.f1810t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void A0(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        int O = O() + N();
        int M = M() + P();
        if (this.f1810t == 1) {
            i5 = RecyclerView.l.h(i3, rect.height() + M, K());
            i4 = RecyclerView.l.h(i2, (this.f1811u * this.f1806p) + O, L());
        } else {
            i4 = RecyclerView.l.h(i2, rect.width() + O, L());
            i5 = RecyclerView.l.h(i3, (this.f1811u * this.f1806p) + M, K());
        }
        this.f1711b.setMeasuredDimension(i4, i5);
    }

    public void G0(RecyclerView recyclerView, RecyclerView.w wVar, int i2) {
        p pVar = new p(recyclerView.getContext());
        pVar.f1751a = i2;
        H0(pVar);
    }

    public boolean I0() {
        return this.F == null;
    }

    public final int J0(int i2) {
        if (x() == 0) {
            return this.f1814x ? 1 : -1;
        }
        return (i2 < T0()) != this.f1814x ? -1 : 1;
    }

    public boolean K0() {
        int i2;
        if (!(x() == 0 || this.C == 0 || !this.f1716g)) {
            if (this.f1814x) {
                i2 = U0();
                T0();
            } else {
                i2 = T0();
                U0();
            }
            if (i2 == 0 && Y0() != null) {
                this.B.a();
                this.f1715f = true;
                u0();
                return true;
            }
        }
        return false;
    }

    public final int L0(RecyclerView.w wVar) {
        if (x() == 0) {
            return 0;
        }
        return z.a(wVar, this.f1808r, Q0(!this.I), P0(!this.I), this, this.I);
    }

    public final int M0(RecyclerView.w wVar) {
        if (x() == 0) {
            return 0;
        }
        return z.b(wVar, this.f1808r, Q0(!this.I), P0(!this.I), this, this.I, this.f1814x);
    }

    public final int N0(RecyclerView.w wVar) {
        if (x() == 0) {
            return 0;
        }
        return z.c(wVar, this.f1808r, Q0(!this.I), P0(!this.I), this, this.I);
    }

    public final int O0(RecyclerView.r rVar, o oVar, RecyclerView.w wVar) {
        int i2;
        f fVar;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        RecyclerView.r rVar2 = rVar;
        o oVar2 = oVar;
        boolean z4 = false;
        this.f1815y.set(0, this.f1806p, true);
        if (this.f1812v.f1985i) {
            i2 = oVar2.f1981e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i2 = oVar2.f1981e == 1 ? oVar2.f1983g + oVar2.f1978b : oVar2.f1982f - oVar2.f1978b;
        }
        k1(oVar2.f1981e, i2);
        int g2 = this.f1814x ? this.f1808r.g() : this.f1808r.k();
        boolean z5 = false;
        while (true) {
            int i15 = oVar2.f1979c;
            if ((i15 >= 0 && i15 < wVar.b()) && (this.f1812v.f1985i || !this.f1815y.isEmpty())) {
                View view = rVar2.j(oVar2.f1979c, z4, Long.MAX_VALUE).f1788a;
                oVar2.f1979c += oVar2.f1980d;
                c cVar = (c) view.getLayoutParams();
                int a2 = cVar.a();
                int[] iArr = this.B.f1826a;
                int i16 = (iArr == null || a2 >= iArr.length) ? -1 : iArr[a2];
                if (i16 == -1) {
                    if (c1(oVar2.f1981e)) {
                        i14 = this.f1806p - 1;
                        i13 = -1;
                        i12 = -1;
                    } else {
                        i13 = this.f1806p;
                        i14 = 0;
                        i12 = 1;
                    }
                    f fVar2 = null;
                    if (oVar2.f1981e == 1) {
                        int k2 = this.f1808r.k();
                        int i17 = Integer.MAX_VALUE;
                        while (i14 != i13) {
                            f fVar3 = this.f1807q[i14];
                            int h2 = fVar3.h(k2);
                            if (h2 < i17) {
                                fVar2 = fVar3;
                                i17 = h2;
                            }
                            i14 += i12;
                        }
                    } else {
                        int g3 = this.f1808r.g();
                        int i18 = Integer.MIN_VALUE;
                        while (i14 != i13) {
                            f fVar4 = this.f1807q[i14];
                            int k3 = fVar4.k(g3);
                            if (k3 > i18) {
                                fVar2 = fVar4;
                                i18 = k3;
                            }
                            i14 += i12;
                        }
                    }
                    fVar = fVar2;
                    d dVar = this.B;
                    dVar.b(a2);
                    dVar.f1826a[a2] = fVar.f1846e;
                } else {
                    fVar = this.f1807q[i16];
                }
                f fVar5 = fVar;
                cVar.f1825e = fVar5;
                if (oVar2.f1981e == 1) {
                    z2 = false;
                    c(view, -1, false);
                } else {
                    z2 = false;
                    c(view, 0, false);
                }
                if (this.f1810t == 1) {
                    i4 = RecyclerView.l.y(this.f1811u, this.f1721l, z2 ? 1 : 0, cVar.width, z2);
                    i3 = RecyclerView.l.y(this.f1724o, this.f1722m, M() + P(), cVar.height, true);
                    z3 = false;
                } else {
                    i4 = RecyclerView.l.y(this.f1723n, this.f1721l, O() + N(), cVar.width, true);
                    z3 = false;
                    i3 = RecyclerView.l.y(this.f1811u, this.f1722m, 0, cVar.height, false);
                }
                a1(view, i4, i3, z3);
                if (oVar2.f1981e == 1) {
                    i6 = fVar5.h(g2);
                    i5 = this.f1808r.c(view) + i6;
                } else {
                    i5 = fVar5.k(g2);
                    i6 = i5 - this.f1808r.c(view);
                }
                int i19 = oVar2.f1981e;
                f fVar6 = cVar.f1825e;
                if (i19 == 1) {
                    fVar6.a(view);
                } else {
                    fVar6.n(view);
                }
                if (!Z0() || this.f1810t != 1) {
                    i7 = this.f1809s.k() + (fVar5.f1846e * this.f1811u);
                    i8 = this.f1809s.c(view) + i7;
                } else {
                    i8 = this.f1809s.g() - (((this.f1806p - 1) - fVar5.f1846e) * this.f1811u);
                    i7 = i8 - this.f1809s.c(view);
                }
                if (this.f1810t == 1) {
                    i10 = i8;
                    i9 = i5;
                    i11 = i7;
                    i7 = i6;
                } else {
                    i9 = i8;
                    i10 = i5;
                    i11 = i6;
                }
                W(view, i11, i7, i10, i9);
                m1(fVar5, this.f1812v.f1981e, i2);
                e1(rVar2, this.f1812v);
                if (this.f1812v.f1984h && view.hasFocusable()) {
                    this.f1815y.set(fVar5.f1846e, false);
                }
                z5 = true;
                z4 = false;
            }
        }
        if (!z5) {
            e1(rVar2, this.f1812v);
        }
        int k4 = this.f1812v.f1981e == -1 ? this.f1808r.k() - W0(this.f1808r.k()) : V0(this.f1808r.g()) - this.f1808r.g();
        if (k4 > 0) {
            return Math.min(oVar2.f1978b, k4);
        }
        return 0;
    }

    public View P0(boolean z2) {
        int k2 = this.f1808r.k();
        int g2 = this.f1808r.g();
        View view = null;
        for (int x2 = x() - 1; x2 >= 0; x2--) {
            View w2 = w(x2);
            int e2 = this.f1808r.e(w2);
            int b2 = this.f1808r.b(w2);
            if (b2 > k2 && e2 < g2) {
                if (b2 <= g2 || !z2) {
                    return w2;
                }
                if (view == null) {
                    view = w2;
                }
            }
        }
        return view;
    }

    public View Q0(boolean z2) {
        int k2 = this.f1808r.k();
        int g2 = this.f1808r.g();
        int x2 = x();
        View view = null;
        for (int i2 = 0; i2 < x2; i2++) {
            View w2 = w(i2);
            int e2 = this.f1808r.e(w2);
            if (this.f1808r.b(w2) > k2 && e2 < g2) {
                if (e2 >= k2 || !z2) {
                    return w2;
                }
                if (view == null) {
                    view = w2;
                }
            }
        }
        return view;
    }

    public final void R0(RecyclerView.r rVar, RecyclerView.w wVar, boolean z2) {
        int g2;
        int V0 = V0(Integer.MIN_VALUE);
        if (V0 != Integer.MIN_VALUE && (g2 = this.f1808r.g() - V0) > 0) {
            int i2 = g2 - (-i1(-g2, rVar, wVar));
            if (z2 && i2 > 0) {
                this.f1808r.p(i2);
            }
        }
    }

    public int S(RecyclerView.r rVar, RecyclerView.w wVar) {
        return this.f1810t == 0 ? this.f1806p : super.S(rVar, wVar);
    }

    public final void S0(RecyclerView.r rVar, RecyclerView.w wVar, boolean z2) {
        int k2;
        int W0 = W0(Integer.MAX_VALUE);
        if (W0 != Integer.MAX_VALUE && (k2 = W0 - this.f1808r.k()) > 0) {
            int i12 = k2 - i1(k2, rVar, wVar);
            if (z2 && i12 > 0) {
                this.f1808r.p(-i12);
            }
        }
    }

    public int T0() {
        if (x() == 0) {
            return 0;
        }
        return Q(w(0));
    }

    public boolean U() {
        return this.C != 0;
    }

    public int U0() {
        int x2 = x();
        if (x2 == 0) {
            return 0;
        }
        return Q(w(x2 - 1));
    }

    public final int V0(int i2) {
        int h2 = this.f1807q[0].h(i2);
        for (int i3 = 1; i3 < this.f1806p; i3++) {
            int h3 = this.f1807q[i3].h(i2);
            if (h3 > h2) {
                h2 = h3;
            }
        }
        return h2;
    }

    public final int W0(int i2) {
        int k2 = this.f1807q[0].k(i2);
        for (int i3 = 1; i3 < this.f1806p; i3++) {
            int k3 = this.f1807q[i3].k(i2);
            if (k3 < k2) {
                k2 = k3;
            }
        }
        return k2;
    }

    public void X(int i2) {
        super.X(i2);
        for (int i3 = 0; i3 < this.f1806p; i3++) {
            f fVar = this.f1807q[i3];
            int i4 = fVar.f1843b;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f1843b = i4 + i2;
            }
            int i5 = fVar.f1844c;
            if (i5 != Integer.MIN_VALUE) {
                fVar.f1844c = i5 + i2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void X0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f1814x
            if (r0 == 0) goto L_0x0009
            int r0 = r6.U0()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.T0()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.B
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.B
            r7.e(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.f(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.B
            r9.e(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f1814x
            if (r7 == 0) goto L_0x004d
            int r7 = r6.T0()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.U0()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.u0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X0(int, int, int):void");
    }

    public void Y(int i2) {
        super.Y(i2);
        for (int i3 = 0; i3 < this.f1806p; i3++) {
            f fVar = this.f1807q[i3];
            int i4 = fVar.f1843b;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f1843b = i4 + i2;
            }
            int i5 = fVar.f1844c;
            if (i5 != Integer.MIN_VALUE) {
                fVar.f1844c = i5 + i2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c5, code lost:
        if (r10 == r11) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c9, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0090 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View Y0() {
        /*
            r12 = this;
            int r0 = r12.x()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f1806p
            r2.<init>(r3)
            int r3 = r12.f1806p
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f1810t
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.Z0()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f1814x
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00eb
            android.view.View r7 = r12.w(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1825e
            int r9 = r9.f1846e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0098
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1825e
            boolean r10 = r12.f1814x
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x006a
            int r10 = r9.f1844c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.b()
            int r10 = r9.f1844c
        L_0x0056:
            androidx.recyclerview.widget.t r11 = r12.f1808r
            int r11 = r11.g()
            if (r10 >= r11) goto L_0x008d
            java.util.ArrayList<android.view.View> r10 = r9.f1842a
            int r11 = r10.size()
            int r11 = r11 - r1
            java.lang.Object r10 = r10.get(r11)
            goto L_0x0082
        L_0x006a:
            int r10 = r9.f1843b
            if (r10 == r11) goto L_0x006f
            goto L_0x0074
        L_0x006f:
            r9.c()
            int r10 = r9.f1843b
        L_0x0074:
            androidx.recyclerview.widget.t r11 = r12.f1808r
            int r11 = r11.k()
            if (r10 <= r11) goto L_0x008d
            java.util.ArrayList<android.view.View> r10 = r9.f1842a
            java.lang.Object r10 = r10.get(r4)
        L_0x0082:
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.j(r10)
            java.util.Objects.requireNonNull(r9)
            r9 = 1
            goto L_0x008e
        L_0x008d:
            r9 = 0
        L_0x008e:
            if (r9 == 0) goto L_0x0091
            return r7
        L_0x0091:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1825e
            int r9 = r9.f1846e
            r2.clear(r9)
        L_0x0098:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00e8
            android.view.View r9 = r12.w(r9)
            boolean r10 = r12.f1814x
            if (r10 == 0) goto L_0x00b6
            androidx.recyclerview.widget.t r10 = r12.f1808r
            int r10 = r10.b(r7)
            androidx.recyclerview.widget.t r11 = r12.f1808r
            int r11 = r11.b(r9)
            if (r10 >= r11) goto L_0x00b3
            return r7
        L_0x00b3:
            if (r10 != r11) goto L_0x00c9
            goto L_0x00c7
        L_0x00b6:
            androidx.recyclerview.widget.t r10 = r12.f1808r
            int r10 = r10.e(r7)
            androidx.recyclerview.widget.t r11 = r12.f1808r
            int r11 = r11.e(r9)
            if (r10 <= r11) goto L_0x00c5
            return r7
        L_0x00c5:
            if (r10 != r11) goto L_0x00c9
        L_0x00c7:
            r10 = 1
            goto L_0x00ca
        L_0x00c9:
            r10 = 0
        L_0x00ca:
            if (r10 == 0) goto L_0x00e8
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f1825e
            int r8 = r8.f1846e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f1825e
            int r9 = r9.f1846e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00df
            r8 = 1
            goto L_0x00e0
        L_0x00df:
            r8 = 0
        L_0x00e0:
            if (r3 >= 0) goto L_0x00e4
            r9 = 1
            goto L_0x00e5
        L_0x00e4:
            r9 = 0
        L_0x00e5:
            if (r8 == r9) goto L_0x00e8
            return r7
        L_0x00e8:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00eb:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.Y0():android.view.View");
    }

    public void Z(RecyclerView recyclerView, RecyclerView.r rVar) {
        Runnable runnable = this.K;
        RecyclerView recyclerView2 = this.f1711b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i2 = 0; i2 < this.f1806p; i2++) {
            this.f1807q[i2].d();
        }
        recyclerView.requestLayout();
    }

    public boolean Z0() {
        return J() == 1;
    }

    public PointF a(int i2) {
        int J0 = J0(i2);
        PointF pointF = new PointF();
        if (J0 == 0) {
            return null;
        }
        if (this.f1810t == 0) {
            pointF.x = (float) J0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) J0;
        }
        return pointF;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r8.f1810t == 1) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r8.f1810t == 0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        if (Z0() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        if (Z0() == false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View a0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.r r11, androidx.recyclerview.widget.RecyclerView.w r12) {
        /*
            r8 = this;
            int r0 = r8.x()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r9 = r8.r(r9)
            if (r9 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r8.h1()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -1
            r3 = 1
            if (r10 == r3) goto L_0x004f
            r4 = 2
            if (r10 == r4) goto L_0x0043
            r4 = 17
            if (r10 == r4) goto L_0x003b
            r4 = 33
            if (r10 == r4) goto L_0x0036
            r4 = 66
            if (r10 == r4) goto L_0x0031
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x002c
            goto L_0x0040
        L_0x002c:
            int r10 = r8.f1810t
            if (r10 != r3) goto L_0x0040
            goto L_0x005a
        L_0x0031:
            int r10 = r8.f1810t
            if (r10 != 0) goto L_0x0040
            goto L_0x005a
        L_0x0036:
            int r10 = r8.f1810t
            if (r10 != r3) goto L_0x0040
            goto L_0x005c
        L_0x003b:
            int r10 = r8.f1810t
            if (r10 != 0) goto L_0x0040
            goto L_0x005c
        L_0x0040:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x005d
        L_0x0043:
            int r10 = r8.f1810t
            if (r10 != r3) goto L_0x0048
            goto L_0x005a
        L_0x0048:
            boolean r10 = r8.Z0()
            if (r10 == 0) goto L_0x005a
            goto L_0x005c
        L_0x004f:
            int r10 = r8.f1810t
            if (r10 != r3) goto L_0x0054
            goto L_0x005c
        L_0x0054:
            boolean r10 = r8.Z0()
            if (r10 == 0) goto L_0x005c
        L_0x005a:
            r10 = 1
            goto L_0x005d
        L_0x005c:
            r10 = -1
        L_0x005d:
            if (r10 != r0) goto L_0x0060
            return r1
        L_0x0060:
            android.view.ViewGroup$LayoutParams r0 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r0
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r0.f1825e
            if (r10 != r3) goto L_0x0072
            int r4 = r8.U0()
            goto L_0x0076
        L_0x0072:
            int r4 = r8.T0()
        L_0x0076:
            r8.l1(r4, r12)
            r8.j1(r10)
            androidx.recyclerview.widget.o r5 = r8.f1812v
            int r6 = r5.f1980d
            int r6 = r6 + r4
            r5.f1979c = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.t r7 = r8.f1808r
            int r7 = r7.l()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.f1978b = r6
            androidx.recyclerview.widget.o r5 = r8.f1812v
            r5.f1984h = r3
            r6 = 0
            r5.f1977a = r6
            r8.O0(r11, r5, r12)
            boolean r11 = r8.f1814x
            r8.D = r11
            android.view.View r11 = r0.i(r4, r10)
            if (r11 == 0) goto L_0x00a9
            if (r11 == r9) goto L_0x00a9
            return r11
        L_0x00a9:
            boolean r11 = r8.c1(r10)
            if (r11 == 0) goto L_0x00c4
            int r11 = r8.f1806p
            int r11 = r11 - r3
        L_0x00b2:
            if (r11 < 0) goto L_0x00d9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1807q
            r12 = r12[r11]
            android.view.View r12 = r12.i(r4, r10)
            if (r12 == 0) goto L_0x00c1
            if (r12 == r9) goto L_0x00c1
            return r12
        L_0x00c1:
            int r11 = r11 + -1
            goto L_0x00b2
        L_0x00c4:
            r11 = 0
        L_0x00c5:
            int r12 = r8.f1806p
            if (r11 >= r12) goto L_0x00d9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1807q
            r12 = r12[r11]
            android.view.View r12 = r12.i(r4, r10)
            if (r12 == 0) goto L_0x00d6
            if (r12 == r9) goto L_0x00d6
            return r12
        L_0x00d6:
            int r11 = r11 + 1
            goto L_0x00c5
        L_0x00d9:
            boolean r11 = r8.f1813w
            r11 = r11 ^ r3
            if (r10 != r2) goto L_0x00e0
            r12 = 1
            goto L_0x00e1
        L_0x00e0:
            r12 = 0
        L_0x00e1:
            if (r11 != r12) goto L_0x00e5
            r11 = 1
            goto L_0x00e6
        L_0x00e5:
            r11 = 0
        L_0x00e6:
            if (r11 == 0) goto L_0x00ed
            int r12 = r0.e()
            goto L_0x00f1
        L_0x00ed:
            int r12 = r0.f()
        L_0x00f1:
            android.view.View r12 = r8.s(r12)
            if (r12 == 0) goto L_0x00fa
            if (r12 == r9) goto L_0x00fa
            return r12
        L_0x00fa:
            boolean r10 = r8.c1(r10)
            if (r10 == 0) goto L_0x0127
            int r10 = r8.f1806p
            int r10 = r10 - r3
        L_0x0103:
            if (r10 < 0) goto L_0x0148
            int r12 = r0.f1846e
            if (r10 != r12) goto L_0x010a
            goto L_0x0124
        L_0x010a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r8.f1807q
            if (r11 == 0) goto L_0x0115
            r12 = r12[r10]
            int r12 = r12.e()
            goto L_0x011b
        L_0x0115:
            r12 = r12[r10]
            int r12 = r12.f()
        L_0x011b:
            android.view.View r12 = r8.s(r12)
            if (r12 == 0) goto L_0x0124
            if (r12 == r9) goto L_0x0124
            return r12
        L_0x0124:
            int r10 = r10 + -1
            goto L_0x0103
        L_0x0127:
            int r10 = r8.f1806p
            if (r6 >= r10) goto L_0x0148
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r10 = r8.f1807q
            if (r11 == 0) goto L_0x0136
            r10 = r10[r6]
            int r10 = r10.e()
            goto L_0x013c
        L_0x0136:
            r10 = r10[r6]
            int r10 = r10.f()
        L_0x013c:
            android.view.View r10 = r8.s(r10)
            if (r10 == 0) goto L_0x0145
            if (r10 == r9) goto L_0x0145
            return r10
        L_0x0145:
            int r6 = r6 + 1
            goto L_0x0127
        L_0x0148:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    public final void a1(View view, int i2, int i3, boolean z2) {
        Rect rect = this.G;
        RecyclerView recyclerView = this.f1711b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.L(view));
        }
        c cVar = (c) view.getLayoutParams();
        int i4 = cVar.leftMargin;
        Rect rect2 = this.G;
        int n12 = n1(i2, i4 + rect2.left, cVar.rightMargin + rect2.right);
        int i5 = cVar.topMargin;
        Rect rect3 = this.G;
        int n13 = n1(i3, i5 + rect3.top, cVar.bottomMargin + rect3.bottom);
        if (z2 ? F0(view, n12, n13, cVar) : D0(view, n12, n13, cVar)) {
            view.measure(n12, n13);
        }
    }

    public void b0(AccessibilityEvent accessibilityEvent) {
        super.b0(accessibilityEvent);
        if (x() > 0) {
            View Q0 = Q0(false);
            View P0 = P0(false);
            if (Q0 != null && P0 != null) {
                int Q = Q(Q0);
                int Q2 = Q(P0);
                if (Q < Q2) {
                    accessibilityEvent.setFromIndex(Q);
                    accessibilityEvent.setToIndex(Q2);
                    return;
                }
                accessibilityEvent.setFromIndex(Q2);
                accessibilityEvent.setToIndex(Q);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03f3, code lost:
        if (K0() != false) goto L_0x03f7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b1(androidx.recyclerview.widget.RecyclerView.r r12, androidx.recyclerview.widget.RecyclerView.w r13, boolean r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.H
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.F
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.f1816z
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r13.b()
            if (r1 != 0) goto L_0x0018
            r11.o0(r12)
            r0.b()
            return
        L_0x0018:
            boolean r1 = r0.f1822e
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0029
            int r1 = r11.f1816z
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r11.F
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x01e7
            r0.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            if (r6 == 0) goto L_0x00b8
            int r7 = r6.f1834d
            r8 = 0
            if (r7 <= 0) goto L_0x007d
            int r9 = r11.f1806p
            if (r7 != r9) goto L_0x006f
            r6 = 0
        L_0x003f:
            int r7 = r11.f1806p
            if (r6 >= r7) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f1807q
            r7 = r7[r6]
            r7.d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.F
            int[] r9 = r7.f1835e
            r9 = r9[r6]
            if (r9 == r5) goto L_0x0064
            boolean r7 = r7.f1840j
            if (r7 == 0) goto L_0x005d
            androidx.recyclerview.widget.t r7 = r11.f1808r
            int r7 = r7.g()
            goto L_0x0063
        L_0x005d:
            androidx.recyclerview.widget.t r7 = r11.f1808r
            int r7 = r7.k()
        L_0x0063:
            int r9 = r9 + r7
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f1807q
            r7 = r7[r6]
            r7.f1843b = r9
            r7.f1844c = r9
            int r6 = r6 + 1
            goto L_0x003f
        L_0x006f:
            r6.f1835e = r8
            r6.f1834d = r4
            r6.f1836f = r4
            r6.f1837g = r8
            r6.f1838h = r8
            int r7 = r6.f1833c
            r6.f1832b = r7
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            boolean r7 = r6.f1841k
            r11.E = r7
            boolean r6 = r6.f1839i
            r11.d(r8)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r11.F
            if (r7 == 0) goto L_0x0092
            boolean r8 = r7.f1839i
            if (r8 == r6) goto L_0x0092
            r7.f1839i = r6
        L_0x0092:
            r11.f1813w = r6
            r11.u0()
            r11.h1()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            int r7 = r6.f1832b
            if (r7 == r2) goto L_0x00a5
            r11.f1816z = r7
            boolean r7 = r6.f1840j
            goto L_0x00a7
        L_0x00a5:
            boolean r7 = r11.f1814x
        L_0x00a7:
            r0.f1820c = r7
            int r7 = r6.f1836f
            if (r7 <= r3) goto L_0x00bf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r11.B
            int[] r8 = r6.f1837g
            r7.f1826a = r8
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r6 = r6.f1838h
            r7.f1827b = r6
            goto L_0x00bf
        L_0x00b8:
            r11.h1()
            boolean r6 = r11.f1814x
            r0.f1820c = r6
        L_0x00bf:
            boolean r6 = r13.f1772g
            if (r6 != 0) goto L_0x01a8
            int r6 = r11.f1816z
            if (r6 != r2) goto L_0x00c9
            goto L_0x01a8
        L_0x00c9:
            if (r6 < 0) goto L_0x01a4
            int r7 = r13.b()
            if (r6 < r7) goto L_0x00d3
            goto L_0x01a4
        L_0x00d3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            if (r6 == 0) goto L_0x00e8
            int r7 = r6.f1832b
            if (r7 == r2) goto L_0x00e8
            int r6 = r6.f1834d
            if (r6 >= r3) goto L_0x00e0
            goto L_0x00e8
        L_0x00e0:
            r0.f1819b = r5
            int r6 = r11.f1816z
            r0.f1818a = r6
            goto L_0x01a2
        L_0x00e8:
            int r6 = r11.f1816z
            android.view.View r6 = r11.s(r6)
            if (r6 == 0) goto L_0x0170
            boolean r7 = r11.f1814x
            if (r7 == 0) goto L_0x00f9
            int r7 = r11.U0()
            goto L_0x00fd
        L_0x00f9:
            int r7 = r11.T0()
        L_0x00fd:
            r0.f1818a = r7
            int r7 = r11.A
            if (r7 == r5) goto L_0x0128
            boolean r7 = r0.f1820c
            if (r7 == 0) goto L_0x0117
            androidx.recyclerview.widget.t r7 = r11.f1808r
            int r7 = r7.g()
            int r8 = r11.A
            int r7 = r7 - r8
            androidx.recyclerview.widget.t r8 = r11.f1808r
            int r6 = r8.b(r6)
            goto L_0x0126
        L_0x0117:
            androidx.recyclerview.widget.t r7 = r11.f1808r
            int r7 = r7.k()
            int r8 = r11.A
            int r7 = r7 + r8
            androidx.recyclerview.widget.t r8 = r11.f1808r
            int r6 = r8.e(r6)
        L_0x0126:
            int r7 = r7 - r6
            goto L_0x016a
        L_0x0128:
            androidx.recyclerview.widget.t r7 = r11.f1808r
            int r7 = r7.c(r6)
            androidx.recyclerview.widget.t r8 = r11.f1808r
            int r8 = r8.l()
            if (r7 <= r8) goto L_0x0148
            boolean r6 = r0.f1820c
            if (r6 == 0) goto L_0x0141
            androidx.recyclerview.widget.t r6 = r11.f1808r
            int r6 = r6.g()
            goto L_0x0158
        L_0x0141:
            androidx.recyclerview.widget.t r6 = r11.f1808r
            int r6 = r6.k()
            goto L_0x0158
        L_0x0148:
            androidx.recyclerview.widget.t r7 = r11.f1808r
            int r7 = r7.e(r6)
            androidx.recyclerview.widget.t r8 = r11.f1808r
            int r8 = r8.k()
            int r7 = r7 - r8
            if (r7 >= 0) goto L_0x015b
            int r6 = -r7
        L_0x0158:
            r0.f1819b = r6
            goto L_0x01a2
        L_0x015b:
            androidx.recyclerview.widget.t r7 = r11.f1808r
            int r7 = r7.g()
            androidx.recyclerview.widget.t r8 = r11.f1808r
            int r6 = r8.b(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto L_0x016d
        L_0x016a:
            r0.f1819b = r7
            goto L_0x01a2
        L_0x016d:
            r0.f1819b = r5
            goto L_0x01a2
        L_0x0170:
            int r6 = r11.f1816z
            r0.f1818a = r6
            int r7 = r11.A
            if (r7 != r5) goto L_0x0187
            int r6 = r11.J0(r6)
            if (r6 != r3) goto L_0x0180
            r6 = 1
            goto L_0x0181
        L_0x0180:
            r6 = 0
        L_0x0181:
            r0.f1820c = r6
            r0.a()
            goto L_0x01a0
        L_0x0187:
            boolean r6 = r0.f1820c
            if (r6 == 0) goto L_0x0195
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.t r6 = r6.f1808r
            int r6 = r6.g()
            int r6 = r6 - r7
            goto L_0x019e
        L_0x0195:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.t r6 = r6.f1808r
            int r6 = r6.k()
            int r6 = r6 + r7
        L_0x019e:
            r0.f1819b = r6
        L_0x01a0:
            r0.f1821d = r3
        L_0x01a2:
            r6 = 1
            goto L_0x01a9
        L_0x01a4:
            r11.f1816z = r2
            r11.A = r5
        L_0x01a8:
            r6 = 0
        L_0x01a9:
            if (r6 == 0) goto L_0x01ac
            goto L_0x01e5
        L_0x01ac:
            boolean r6 = r11.D
            int r7 = r13.b()
            if (r6 == 0) goto L_0x01c8
            int r6 = r11.x()
        L_0x01b8:
            int r6 = r6 + r2
            if (r6 < 0) goto L_0x01e0
            android.view.View r8 = r11.w(r6)
            int r8 = r11.Q(r8)
            if (r8 < 0) goto L_0x01b8
            if (r8 >= r7) goto L_0x01b8
            goto L_0x01e1
        L_0x01c8:
            int r6 = r11.x()
            r8 = 0
        L_0x01cd:
            if (r8 >= r6) goto L_0x01e0
            android.view.View r9 = r11.w(r8)
            int r9 = r11.Q(r9)
            if (r9 < 0) goto L_0x01dd
            if (r9 >= r7) goto L_0x01dd
            r8 = r9
            goto L_0x01e1
        L_0x01dd:
            int r8 = r8 + 1
            goto L_0x01cd
        L_0x01e0:
            r8 = 0
        L_0x01e1:
            r0.f1818a = r8
            r0.f1819b = r5
        L_0x01e5:
            r0.f1822e = r3
        L_0x01e7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            if (r6 != 0) goto L_0x0204
            int r6 = r11.f1816z
            if (r6 != r2) goto L_0x0204
            boolean r6 = r0.f1820c
            boolean r7 = r11.D
            if (r6 != r7) goto L_0x01fd
            boolean r6 = r11.Z0()
            boolean r7 = r11.E
            if (r6 == r7) goto L_0x0204
        L_0x01fd:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r6 = r11.B
            r6.a()
            r0.f1821d = r3
        L_0x0204:
            int r6 = r11.x()
            if (r6 <= 0) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r6 = r11.F
            if (r6 == 0) goto L_0x0212
            int r6 = r6.f1834d
            if (r6 >= r3) goto L_0x02bc
        L_0x0212:
            boolean r6 = r0.f1821d
            if (r6 == 0) goto L_0x0231
            r1 = 0
        L_0x0217:
            int r6 = r11.f1806p
            if (r1 >= r6) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f1807q
            r6 = r6[r1]
            r6.d()
            int r6 = r0.f1819b
            if (r6 == r5) goto L_0x022e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r11.f1807q
            r7 = r7[r1]
            r7.f1843b = r6
            r7.f1844c = r6
        L_0x022e:
            int r1 = r1 + 1
            goto L_0x0217
        L_0x0231:
            if (r1 != 0) goto L_0x0253
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.H
            int[] r1 = r1.f1823f
            if (r1 != 0) goto L_0x023a
            goto L_0x0253
        L_0x023a:
            r1 = 0
        L_0x023b:
            int r6 = r11.f1806p
            if (r1 >= r6) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f1807q
            r6 = r6[r1]
            r6.d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.H
            int[] r7 = r7.f1823f
            r7 = r7[r1]
            r6.f1843b = r7
            r6.f1844c = r7
            int r1 = r1 + 1
            goto L_0x023b
        L_0x0253:
            r1 = 0
        L_0x0254:
            int r6 = r11.f1806p
            if (r1 >= r6) goto L_0x0294
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f1807q
            r6 = r6[r1]
            boolean r7 = r11.f1814x
            int r8 = r0.f1819b
            if (r7 == 0) goto L_0x0267
            int r9 = r6.h(r5)
            goto L_0x026b
        L_0x0267:
            int r9 = r6.k(r5)
        L_0x026b:
            r6.d()
            if (r9 != r5) goto L_0x0271
            goto L_0x0291
        L_0x0271:
            if (r7 == 0) goto L_0x027d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.t r10 = r10.f1808r
            int r10 = r10.g()
            if (r9 < r10) goto L_0x0291
        L_0x027d:
            if (r7 != 0) goto L_0x028a
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.t r7 = r7.f1808r
            int r7 = r7.k()
            if (r9 <= r7) goto L_0x028a
            goto L_0x0291
        L_0x028a:
            if (r8 == r5) goto L_0x028d
            int r9 = r9 + r8
        L_0x028d:
            r6.f1844c = r9
            r6.f1843b = r9
        L_0x0291:
            int r1 = r1 + 1
            goto L_0x0254
        L_0x0294:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.H
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r11.f1807q
            java.util.Objects.requireNonNull(r1)
            int r7 = r6.length
            int[] r8 = r1.f1823f
            if (r8 == 0) goto L_0x02a3
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02ac
        L_0x02a3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r8.f1807q
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f1823f = r8
        L_0x02ac:
            r8 = 0
        L_0x02ad:
            if (r8 >= r7) goto L_0x02bc
            int[] r9 = r1.f1823f
            r10 = r6[r8]
            int r10 = r10.k(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02ad
        L_0x02bc:
            r11.q(r12)
            androidx.recyclerview.widget.o r1 = r11.f1812v
            r1.f1977a = r4
            androidx.recyclerview.widget.t r1 = r11.f1809s
            int r1 = r1.l()
            int r6 = r11.f1806p
            int r6 = r1 / r6
            r11.f1811u = r6
            androidx.recyclerview.widget.t r6 = r11.f1809s
            int r6 = r6.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r1 = r0.f1818a
            r11.l1(r1, r13)
            boolean r1 = r0.f1820c
            if (r1 == 0) goto L_0x02ed
            r11.j1(r2)
            androidx.recyclerview.widget.o r1 = r11.f1812v
            r11.O0(r12, r1, r13)
            r11.j1(r3)
            goto L_0x02f8
        L_0x02ed:
            r11.j1(r3)
            androidx.recyclerview.widget.o r1 = r11.f1812v
            r11.O0(r12, r1, r13)
            r11.j1(r2)
        L_0x02f8:
            androidx.recyclerview.widget.o r1 = r11.f1812v
            int r2 = r0.f1818a
            int r6 = r1.f1980d
            int r2 = r2 + r6
            r1.f1979c = r2
            r11.O0(r12, r1, r13)
            androidx.recyclerview.widget.t r1 = r11.f1809s
            int r1 = r1.i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x0310
            goto L_0x03b4
        L_0x0310:
            r1 = 0
            int r2 = r11.x()
            r6 = 0
        L_0x0316:
            if (r6 >= r2) goto L_0x0338
            android.view.View r7 = r11.w(r6)
            androidx.recyclerview.widget.t r8 = r11.f1809s
            int r8 = r8.c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0328
            goto L_0x0335
        L_0x0328:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r7
            java.util.Objects.requireNonNull(r7)
            float r1 = java.lang.Math.max(r1, r8)
        L_0x0335:
            int r6 = r6 + 1
            goto L_0x0316
        L_0x0338:
            int r6 = r11.f1811u
            int r7 = r11.f1806p
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            androidx.recyclerview.widget.t r7 = r11.f1809s
            int r7 = r7.i()
            if (r7 != r5) goto L_0x0355
            androidx.recyclerview.widget.t r5 = r11.f1809s
            int r5 = r5.l()
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0355:
            int r5 = r11.f1806p
            int r5 = r1 / r5
            r11.f1811u = r5
            androidx.recyclerview.widget.t r5 = r11.f1809s
            int r5 = r5.i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r1 = r11.f1811u
            if (r1 != r6) goto L_0x0369
            goto L_0x03b4
        L_0x0369:
            r1 = 0
        L_0x036a:
            if (r1 >= r2) goto L_0x03b4
            android.view.View r5 = r11.w(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r7
            java.util.Objects.requireNonNull(r7)
            boolean r8 = r11.Z0()
            if (r8 == 0) goto L_0x039b
            int r8 = r11.f1810t
            if (r8 != r3) goto L_0x039b
            int r8 = r11.f1806p
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f1825e
            int r7 = r7.f1846e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.f1811u
            int r9 = r9 * r10
            int r8 = r8 - r3
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L_0x03b1
        L_0x039b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.f1825e
            int r7 = r7.f1846e
            int r8 = r11.f1811u
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.f1810t
            int r8 = r8 - r7
            if (r9 != r3) goto L_0x03ae
            r5.offsetLeftAndRight(r8)
            goto L_0x03b1
        L_0x03ae:
            r5.offsetTopAndBottom(r8)
        L_0x03b1:
            int r1 = r1 + 1
            goto L_0x036a
        L_0x03b4:
            int r1 = r11.x()
            if (r1 <= 0) goto L_0x03cb
            boolean r1 = r11.f1814x
            if (r1 == 0) goto L_0x03c5
            r11.R0(r12, r13, r3)
            r11.S0(r12, r13, r4)
            goto L_0x03cb
        L_0x03c5:
            r11.S0(r12, r13, r3)
            r11.R0(r12, r13, r4)
        L_0x03cb:
            if (r14 == 0) goto L_0x03f6
            boolean r14 = r13.f1772g
            if (r14 != 0) goto L_0x03f6
            int r14 = r11.C
            if (r14 == 0) goto L_0x03e3
            int r14 = r11.x()
            if (r14 <= 0) goto L_0x03e3
            android.view.View r14 = r11.Y0()
            if (r14 == 0) goto L_0x03e3
            r14 = 1
            goto L_0x03e4
        L_0x03e3:
            r14 = 0
        L_0x03e4:
            if (r14 == 0) goto L_0x03f6
            java.lang.Runnable r14 = r11.K
            androidx.recyclerview.widget.RecyclerView r1 = r11.f1711b
            if (r1 == 0) goto L_0x03ef
            r1.removeCallbacks(r14)
        L_0x03ef:
            boolean r14 = r11.K0()
            if (r14 == 0) goto L_0x03f6
            goto L_0x03f7
        L_0x03f6:
            r3 = 0
        L_0x03f7:
            boolean r14 = r13.f1772g
            if (r14 == 0) goto L_0x0400
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.H
            r14.b()
        L_0x0400:
            boolean r14 = r0.f1820c
            r11.D = r14
            boolean r14 = r11.Z0()
            r11.E = r14
            if (r3 == 0) goto L_0x0414
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.H
            r14.b()
            r11.b1(r12, r13, r4)
        L_0x0414:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.RecyclerView$w, boolean):void");
    }

    public final boolean c1(int i2) {
        if (this.f1810t == 0) {
            return (i2 == -1) != this.f1814x;
        }
        return ((i2 == -1) == this.f1814x) == Z0();
    }

    public void d(String str) {
        RecyclerView recyclerView;
        if (this.F == null && (recyclerView = this.f1711b) != null) {
            recyclerView.i(str);
        }
    }

    public void d0(RecyclerView.r rVar, RecyclerView.w wVar, View view, h0.d dVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            c0(view, dVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f1810t == 0) {
            f fVar = cVar.f1825e;
            i5 = fVar == null ? -1 : fVar.f1846e;
            i4 = 1;
            i3 = -1;
            i2 = -1;
        } else {
            f fVar2 = cVar.f1825e;
            i3 = fVar2 == null ? -1 : fVar2.f1846e;
            i5 = -1;
            i4 = -1;
            i2 = 1;
        }
        dVar.f3160a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) d.c.a(i5, i4, i3, i2, false, false).f3176a);
    }

    public void d1(int i2, RecyclerView.w wVar) {
        int i3;
        int i4;
        if (i2 > 0) {
            i4 = U0();
            i3 = 1;
        } else {
            i4 = T0();
            i3 = -1;
        }
        this.f1812v.f1977a = true;
        l1(i4, wVar);
        j1(i3);
        o oVar = this.f1812v;
        oVar.f1979c = i4 + oVar.f1980d;
        oVar.f1978b = Math.abs(i2);
    }

    public boolean e() {
        return this.f1810t == 0;
    }

    public void e0(RecyclerView recyclerView, int i2, int i3) {
        X0(i2, i3, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r6.f1981e == -1) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e1(androidx.recyclerview.widget.RecyclerView.r r5, androidx.recyclerview.widget.o r6) {
        /*
            r4 = this;
            boolean r0 = r6.f1977a
            if (r0 == 0) goto L_0x007c
            boolean r0 = r6.f1985i
            if (r0 == 0) goto L_0x000a
            goto L_0x007c
        L_0x000a:
            int r0 = r6.f1978b
            r1 = -1
            if (r0 != 0) goto L_0x001f
            int r0 = r6.f1981e
            if (r0 != r1) goto L_0x0019
        L_0x0013:
            int r6 = r6.f1983g
        L_0x0015:
            r4.f1(r5, r6)
            goto L_0x007c
        L_0x0019:
            int r6 = r6.f1982f
        L_0x001b:
            r4.g1(r5, r6)
            goto L_0x007c
        L_0x001f:
            int r0 = r6.f1981e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L_0x0050
            int r0 = r6.f1982f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1807q
            r1 = r1[r2]
            int r1 = r1.k(r0)
        L_0x002f:
            int r2 = r4.f1806p
            if (r3 >= r2) goto L_0x0041
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1807q
            r2 = r2[r3]
            int r2 = r2.k(r0)
            if (r2 <= r1) goto L_0x003e
            r1 = r2
        L_0x003e:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0041:
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0045
            goto L_0x0013
        L_0x0045:
            int r1 = r6.f1983g
            int r6 = r6.f1978b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L_0x0015
        L_0x0050:
            int r0 = r6.f1983g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f1807q
            r1 = r1[r2]
            int r1 = r1.h(r0)
        L_0x005a:
            int r2 = r4.f1806p
            if (r3 >= r2) goto L_0x006c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f1807q
            r2 = r2[r3]
            int r2 = r2.h(r0)
            if (r2 >= r1) goto L_0x0069
            r1 = r2
        L_0x0069:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006c:
            int r0 = r6.f1983g
            int r1 = r1 - r0
            if (r1 >= 0) goto L_0x0072
            goto L_0x0019
        L_0x0072:
            int r0 = r6.f1982f
            int r6 = r6.f1978b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L_0x001b
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.e1(androidx.recyclerview.widget.RecyclerView$r, androidx.recyclerview.widget.o):void");
    }

    public boolean f() {
        return this.f1810t == 1;
    }

    public void f0(RecyclerView recyclerView) {
        this.B.a();
        u0();
    }

    public final void f1(RecyclerView.r rVar, int i2) {
        int x2 = x() - 1;
        while (x2 >= 0) {
            View w2 = w(x2);
            if (this.f1808r.e(w2) >= i2 && this.f1808r.o(w2) >= i2) {
                c cVar = (c) w2.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.f1825e.f1842a.size() != 1) {
                    cVar.f1825e.l();
                    q0(w2, rVar);
                    x2--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public boolean g(RecyclerView.m mVar) {
        return mVar instanceof c;
    }

    public void g0(RecyclerView recyclerView, int i2, int i3, int i4) {
        X0(i2, i3, 8);
    }

    public final void g1(RecyclerView.r rVar, int i2) {
        while (x() > 0) {
            View w2 = w(0);
            if (this.f1808r.b(w2) <= i2 && this.f1808r.n(w2) <= i2) {
                c cVar = (c) w2.getLayoutParams();
                Objects.requireNonNull(cVar);
                if (cVar.f1825e.f1842a.size() != 1) {
                    cVar.f1825e.m();
                    q0(w2, rVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void h0(RecyclerView recyclerView, int i2, int i3) {
        X0(i2, i3, 2);
    }

    public final void h1() {
        this.f1814x = (this.f1810t == 1 || !Z0()) ? this.f1813w : !this.f1813w;
    }

    public void i(int i2, int i3, RecyclerView.w wVar, RecyclerView.l.c cVar) {
        int i4;
        int i5;
        if (this.f1810t != 0) {
            i2 = i3;
        }
        if (x() != 0 && i2 != 0) {
            d1(i2, wVar);
            int[] iArr = this.J;
            if (iArr == null || iArr.length < this.f1806p) {
                this.J = new int[this.f1806p];
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.f1806p; i7++) {
                o oVar = this.f1812v;
                if (oVar.f1980d == -1) {
                    i5 = oVar.f1982f;
                    i4 = this.f1807q[i7].k(i5);
                } else {
                    i5 = this.f1807q[i7].h(oVar.f1983g);
                    i4 = this.f1812v.f1983g;
                }
                int i8 = i5 - i4;
                if (i8 >= 0) {
                    this.J[i6] = i8;
                    i6++;
                }
            }
            Arrays.sort(this.J, 0, i6);
            int i9 = 0;
            while (i9 < i6) {
                int i10 = this.f1812v.f1979c;
                if (i10 >= 0 && i10 < wVar.b()) {
                    ((n.b) cVar).a(this.f1812v.f1979c, this.J[i9]);
                    o oVar2 = this.f1812v;
                    oVar2.f1979c += oVar2.f1980d;
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public void i0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        X0(i2, i3, 4);
    }

    public int i1(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        if (x() == 0 || i2 == 0) {
            return 0;
        }
        d1(i2, wVar);
        int O0 = O0(rVar, this.f1812v, wVar);
        if (this.f1812v.f1978b >= O0) {
            i2 = i2 < 0 ? -O0 : O0;
        }
        this.f1808r.p(-i2);
        this.D = this.f1814x;
        o oVar = this.f1812v;
        oVar.f1978b = 0;
        e1(rVar, oVar);
        return i2;
    }

    public void j0(RecyclerView.r rVar, RecyclerView.w wVar) {
        b1(rVar, wVar, true);
    }

    public final void j1(int i2) {
        o oVar = this.f1812v;
        oVar.f1981e = i2;
        int i3 = 1;
        if (this.f1814x != (i2 == -1)) {
            i3 = -1;
        }
        oVar.f1980d = i3;
    }

    public int k(RecyclerView.w wVar) {
        return L0(wVar);
    }

    public void k0(RecyclerView.w wVar) {
        this.f1816z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.b();
    }

    public final void k1(int i2, int i3) {
        for (int i4 = 0; i4 < this.f1806p; i4++) {
            if (!this.f1807q[i4].f1842a.isEmpty()) {
                m1(this.f1807q[i4], i2, i3);
            }
        }
    }

    public int l(RecyclerView.w wVar) {
        return M0(wVar);
    }

    public void l0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.F = (e) parcelable;
            u0();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l1(int r5, androidx.recyclerview.widget.RecyclerView.w r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.o r0 = r4.f1812v
            r1 = 0
            r0.f1978b = r1
            r0.f1979c = r5
            androidx.recyclerview.widget.RecyclerView$v r0 = r4.f1714e
            r2 = 1
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.f1755e
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x0033
            int r6 = r6.f1766a
            r0 = -1
            if (r6 == r0) goto L_0x0033
            boolean r0 = r4.f1814x
            if (r6 >= r5) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            if (r0 != r5) goto L_0x002a
            androidx.recyclerview.widget.t r5 = r4.f1808r
            int r5 = r5.l()
            goto L_0x0034
        L_0x002a:
            androidx.recyclerview.widget.t r5 = r4.f1808r
            int r5 = r5.l()
            r6 = r5
            r5 = 0
            goto L_0x0035
        L_0x0033:
            r5 = 0
        L_0x0034:
            r6 = 0
        L_0x0035:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f1711b
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.f1664h
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0059
            androidx.recyclerview.widget.o r0 = r4.f1812v
            androidx.recyclerview.widget.t r3 = r4.f1808r
            int r3 = r3.k()
            int r3 = r3 - r6
            r0.f1982f = r3
            androidx.recyclerview.widget.o r6 = r4.f1812v
            androidx.recyclerview.widget.t r0 = r4.f1808r
            int r0 = r0.g()
            int r0 = r0 + r5
            r6.f1983g = r0
            goto L_0x0069
        L_0x0059:
            androidx.recyclerview.widget.o r0 = r4.f1812v
            androidx.recyclerview.widget.t r3 = r4.f1808r
            int r3 = r3.f()
            int r3 = r3 + r5
            r0.f1983g = r3
            androidx.recyclerview.widget.o r5 = r4.f1812v
            int r6 = -r6
            r5.f1982f = r6
        L_0x0069:
            androidx.recyclerview.widget.o r5 = r4.f1812v
            r5.f1984h = r1
            r5.f1977a = r2
            androidx.recyclerview.widget.t r6 = r4.f1808r
            int r6 = r6.i()
            if (r6 != 0) goto L_0x0080
            androidx.recyclerview.widget.t r6 = r4.f1808r
            int r6 = r6.f()
            if (r6 != 0) goto L_0x0080
            r1 = 1
        L_0x0080:
            r5.f1985i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.l1(int, androidx.recyclerview.widget.RecyclerView$w):void");
    }

    public int m(RecyclerView.w wVar) {
        return N0(wVar);
    }

    public Parcelable m0() {
        int i2;
        int i3;
        int[] iArr;
        e eVar = this.F;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f1839i = this.f1813w;
        eVar2.f1840j = this.D;
        eVar2.f1841k = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = dVar.f1826a) == null) {
            eVar2.f1836f = 0;
        } else {
            eVar2.f1837g = iArr;
            eVar2.f1836f = iArr.length;
            eVar2.f1838h = dVar.f1827b;
        }
        int i4 = -1;
        if (x() > 0) {
            eVar2.f1832b = this.D ? U0() : T0();
            View P0 = this.f1814x ? P0(true) : Q0(true);
            if (P0 != null) {
                i4 = Q(P0);
            }
            eVar2.f1833c = i4;
            int i5 = this.f1806p;
            eVar2.f1834d = i5;
            eVar2.f1835e = new int[i5];
            for (int i6 = 0; i6 < this.f1806p; i6++) {
                if (this.D) {
                    i2 = this.f1807q[i6].h(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f1808r.g();
                    } else {
                        eVar2.f1835e[i6] = i2;
                    }
                } else {
                    i2 = this.f1807q[i6].k(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f1808r.k();
                    } else {
                        eVar2.f1835e[i6] = i2;
                    }
                }
                i2 -= i3;
                eVar2.f1835e[i6] = i2;
            }
        } else {
            eVar2.f1832b = -1;
            eVar2.f1833c = -1;
            eVar2.f1834d = 0;
        }
        return eVar2;
    }

    public final void m1(f fVar, int i2, int i3) {
        int i4 = fVar.f1845d;
        if (i2 == -1) {
            int i5 = fVar.f1843b;
            if (i5 == Integer.MIN_VALUE) {
                fVar.c();
                i5 = fVar.f1843b;
            }
            if (i5 + i4 > i3) {
                return;
            }
        } else {
            int i6 = fVar.f1844c;
            if (i6 == Integer.MIN_VALUE) {
                fVar.b();
                i6 = fVar.f1844c;
            }
            if (i6 - i4 < i3) {
                return;
            }
        }
        this.f1815y.set(fVar.f1846e, false);
    }

    public int n(RecyclerView.w wVar) {
        return L0(wVar);
    }

    public void n0(int i2) {
        if (i2 == 0) {
            K0();
        }
    }

    public final int n1(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode) : i2;
    }

    public int o(RecyclerView.w wVar) {
        return M0(wVar);
    }

    public int p(RecyclerView.w wVar) {
        return N0(wVar);
    }

    public RecyclerView.m t() {
        return this.f1810t == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public RecyclerView.m u(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public RecyclerView.m v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public int v0(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        return i1(i2, rVar, wVar);
    }

    public void w0(int i2) {
        e eVar = this.F;
        if (!(eVar == null || eVar.f1832b == i2)) {
            eVar.f1835e = null;
            eVar.f1834d = 0;
            eVar.f1832b = -1;
            eVar.f1833c = -1;
        }
        this.f1816z = i2;
        this.A = Integer.MIN_VALUE;
        u0();
    }

    public int x0(int i2, RecyclerView.r rVar, RecyclerView.w wVar) {
        return i1(i2, rVar, wVar);
    }

    public int z(RecyclerView.r rVar, RecyclerView.w wVar) {
        return this.f1810t == 1 ? this.f1806p : super.z(rVar, wVar);
    }
}
