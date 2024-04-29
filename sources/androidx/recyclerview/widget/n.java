package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class n implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public static final ThreadLocal<n> f1962f = new ThreadLocal<>();

    /* renamed from: g  reason: collision with root package name */
    public static Comparator<c> f1963g = new a();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<RecyclerView> f1964b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public long f1965c;

    /* renamed from: d  reason: collision with root package name */
    public long f1966d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<c> f1967e = new ArrayList<>();

    public static class a implements Comparator<c> {
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 == null) goto L_0x0023;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
            if (r0 != false) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r7, java.lang.Object r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.n$c r7 = (androidx.recyclerview.widget.n.c) r7
                androidx.recyclerview.widget.n$c r8 = (androidx.recyclerview.widget.n.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f1975d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x000c
                r3 = 1
                goto L_0x000d
            L_0x000c:
                r3 = 0
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f1975d
                if (r4 != 0) goto L_0x0013
                r4 = 1
                goto L_0x0014
            L_0x0013:
                r4 = 0
            L_0x0014:
                r5 = -1
                if (r3 == r4) goto L_0x001a
                if (r0 != 0) goto L_0x0022
                goto L_0x0023
            L_0x001a:
                boolean r0 = r7.f1972a
                boolean r3 = r8.f1972a
                if (r0 == r3) goto L_0x0025
                if (r0 == 0) goto L_0x0023
            L_0x0022:
                r1 = -1
            L_0x0023:
                r2 = r1
                goto L_0x0036
            L_0x0025:
                int r0 = r8.f1973b
                int r1 = r7.f1973b
                int r0 = r0 - r1
                if (r0 == 0) goto L_0x002e
                r2 = r0
                goto L_0x0036
            L_0x002e:
                int r7 = r7.f1974c
                int r8 = r8.f1974c
                int r7 = r7 - r8
                if (r7 == 0) goto L_0x0036
                r2 = r7
            L_0x0036:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.n.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.l.c {

        /* renamed from: a  reason: collision with root package name */
        public int f1968a;

        /* renamed from: b  reason: collision with root package name */
        public int f1969b;

        /* renamed from: c  reason: collision with root package name */
        public int[] f1970c;

        /* renamed from: d  reason: collision with root package name */
        public int f1971d;

        public void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i3 >= 0) {
                int i4 = this.f1971d * 2;
                int[] iArr = this.f1970c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f1970c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i4 >= iArr.length) {
                    int[] iArr3 = new int[(i4 * 2)];
                    this.f1970c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f1970c;
                iArr4[i4] = i2;
                iArr4[i4 + 1] = i3;
                this.f1971d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public void b(RecyclerView recyclerView, boolean z2) {
            this.f1971d = 0;
            int[] iArr = this.f1970c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.l lVar = recyclerView.f1674m;
            if (recyclerView.f1672l != null && lVar != null && lVar.f1718i) {
                if (z2) {
                    if (!recyclerView.f1658e.g()) {
                        lVar.j(recyclerView.f1672l.a(), this);
                    }
                } else if (!recyclerView.M()) {
                    lVar.i(this.f1968a, this.f1969b, recyclerView.f1659e0, this);
                }
                int i2 = this.f1971d;
                if (i2 > lVar.f1719j) {
                    lVar.f1719j = i2;
                    lVar.f1720k = z2;
                    recyclerView.f1654c.l();
                }
            }
        }

        public boolean c(int i2) {
            if (this.f1970c != null) {
                int i3 = this.f1971d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.f1970c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1972a;

        /* renamed from: b  reason: collision with root package name */
        public int f1973b;

        /* renamed from: c  reason: collision with root package name */
        public int f1974c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f1975d;

        /* renamed from: e  reason: collision with root package name */
        public int f1976e;
    }

    public void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f1965c == 0) {
            this.f1965c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f1657d0;
        bVar.f1968a = i2;
        bVar.f1969b = i3;
    }

    public void b(long j2) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f1964b.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView3 = this.f1964b.get(i3);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f1657d0.b(recyclerView3, false);
                i2 += recyclerView3.f1657d0.f1971d;
            }
        }
        this.f1967e.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView4 = this.f1964b.get(i5);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.f1657d0;
                int abs = Math.abs(bVar.f1969b) + Math.abs(bVar.f1968a);
                for (int i6 = 0; i6 < bVar.f1971d * 2; i6 += 2) {
                    if (i4 >= this.f1967e.size()) {
                        cVar2 = new c();
                        this.f1967e.add(cVar2);
                    } else {
                        cVar2 = this.f1967e.get(i4);
                    }
                    int[] iArr = bVar.f1970c;
                    int i7 = iArr[i6 + 1];
                    cVar2.f1972a = i7 <= abs;
                    cVar2.f1973b = abs;
                    cVar2.f1974c = i7;
                    cVar2.f1975d = recyclerView4;
                    cVar2.f1976e = iArr[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f1967e, f1963g);
        for (int i8 = 0; i8 < this.f1967e.size() && (recyclerView = cVar.f1975d) != null; i8++) {
            RecyclerView.z c2 = c(recyclerView, (cVar = this.f1967e.get(i8)).f1976e, cVar.f1972a ? Long.MAX_VALUE : j2);
            if (!(c2 == null || c2.f1789b == null || !c2.i() || c2.j() || (recyclerView2 = (RecyclerView) c2.f1789b.get()) == null)) {
                if (recyclerView2.A && recyclerView2.f1660f.h() != 0) {
                    recyclerView2.Z();
                }
                b bVar2 = recyclerView2.f1657d0;
                bVar2.b(recyclerView2, true);
                if (bVar2.f1971d != 0) {
                    try {
                        int i9 = c0.c.f2067a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.w wVar = recyclerView2.f1659e0;
                        RecyclerView.d dVar = recyclerView2.f1672l;
                        wVar.f1769d = 1;
                        wVar.f1770e = dVar.a();
                        wVar.f1772g = false;
                        wVar.f1773h = false;
                        wVar.f1774i = false;
                        for (int i10 = 0; i10 < bVar2.f1971d * 2; i10 += 2) {
                            c(recyclerView2, bVar2.f1970c[i10], j2);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i11 = c0.c.f2067a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.f1972a = false;
            cVar.f1973b = 0;
            cVar.f1974c = 0;
            cVar.f1975d = null;
            cVar.f1976e = 0;
        }
    }

    public final RecyclerView.z c(RecyclerView recyclerView, int i2, long j2) {
        boolean z2;
        int h2 = recyclerView.f1660f.h();
        int i3 = 0;
        while (true) {
            if (i3 >= h2) {
                z2 = false;
                break;
            }
            RecyclerView.z K = RecyclerView.K(recyclerView.f1660f.g(i3));
            if (K.f1790c == i2 && !K.j()) {
                z2 = true;
                break;
            }
            i3++;
        }
        if (z2) {
            return null;
        }
        RecyclerView.r rVar = recyclerView.f1654c;
        try {
            recyclerView.S();
            RecyclerView.z j3 = rVar.j(i2, false, j2);
            if (j3 != null) {
                if (!j3.i() || j3.j()) {
                    rVar.a(j3, false);
                } else {
                    rVar.g(j3.f1788a);
                }
            }
            return j3;
        } finally {
            recyclerView.T(false);
        }
    }

    public void run() {
        try {
            int i2 = c0.c.f2067a;
            Trace.beginSection("RV Prefetch");
            if (this.f1964b.isEmpty()) {
                this.f1965c = 0;
                Trace.endSection();
                return;
            }
            int size = this.f1964b.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView recyclerView = this.f1964b.get(i3);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f1965c = 0;
                Trace.endSection();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f1966d);
            this.f1965c = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f1965c = 0;
            int i4 = c0.c.f2067a;
            Trace.endSection();
            throw th;
        }
    }
}
