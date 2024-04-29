package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.y;
import com.example.supermarket.R;
import g0.u;
import h0.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public class RecyclerView extends ViewGroup implements g0.h {

    /* renamed from: v0  reason: collision with root package name */
    public static final int[] f1646v0 = {16843830};

    /* renamed from: w0  reason: collision with root package name */
    public static final boolean f1647w0 = (Build.VERSION.SDK_INT >= 23);

    /* renamed from: x0  reason: collision with root package name */
    public static final boolean f1648x0 = true;

    /* renamed from: y0  reason: collision with root package name */
    public static final Class<?>[] f1649y0;

    /* renamed from: z0  reason: collision with root package name */
    public static final Interpolator f1650z0 = new b();
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public h E;
    public EdgeEffect F;
    public EdgeEffect G;
    public EdgeEffect H;
    public EdgeEffect I;
    public i J;
    public int K;
    public int L;
    public VelocityTracker M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public n S;
    public final int T;
    public final int U;
    public float V;
    public float W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1651a0;

    /* renamed from: b  reason: collision with root package name */
    public final t f1652b;

    /* renamed from: b0  reason: collision with root package name */
    public final y f1653b0;

    /* renamed from: c  reason: collision with root package name */
    public final r f1654c;

    /* renamed from: c0  reason: collision with root package name */
    public n f1655c0;

    /* renamed from: d  reason: collision with root package name */
    public u f1656d;

    /* renamed from: d0  reason: collision with root package name */
    public n.b f1657d0;

    /* renamed from: e  reason: collision with root package name */
    public a f1658e;

    /* renamed from: e0  reason: collision with root package name */
    public final w f1659e0;

    /* renamed from: f  reason: collision with root package name */
    public c f1660f;

    /* renamed from: f0  reason: collision with root package name */
    public p f1661f0;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f1662g;

    /* renamed from: g0  reason: collision with root package name */
    public List<p> f1663g0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1664h;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1665h0;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f1666i;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1667i0;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f1668j;

    /* renamed from: j0  reason: collision with root package name */
    public i.b f1669j0;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f1670k;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f1671k0;

    /* renamed from: l  reason: collision with root package name */
    public d f1672l;

    /* renamed from: l0  reason: collision with root package name */
    public y f1673l0;

    /* renamed from: m  reason: collision with root package name */
    public l f1674m;

    /* renamed from: m0  reason: collision with root package name */
    public g f1675m0;

    /* renamed from: n  reason: collision with root package name */
    public s f1676n;

    /* renamed from: n0  reason: collision with root package name */
    public final int[] f1677n0;

    /* renamed from: o  reason: collision with root package name */
    public final ArrayList<k> f1678o;

    /* renamed from: o0  reason: collision with root package name */
    public g0.i f1679o0;

    /* renamed from: p  reason: collision with root package name */
    public final ArrayList<o> f1680p;

    /* renamed from: p0  reason: collision with root package name */
    public final int[] f1681p0;

    /* renamed from: q  reason: collision with root package name */
    public o f1682q;

    /* renamed from: q0  reason: collision with root package name */
    public final int[] f1683q0;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1684r;

    /* renamed from: r0  reason: collision with root package name */
    public final int[] f1685r0;

    /* renamed from: s  reason: collision with root package name */
    public boolean f1686s;

    /* renamed from: s0  reason: collision with root package name */
    public final List<z> f1687s0;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1688t;

    /* renamed from: t0  reason: collision with root package name */
    public Runnable f1689t0;

    /* renamed from: u  reason: collision with root package name */
    public int f1690u;

    /* renamed from: u0  reason: collision with root package name */
    public final d0.b f1691u0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f1692v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1693w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1694x;

    /* renamed from: y  reason: collision with root package name */
    public int f1695y;

    /* renamed from: z  reason: collision with root package name */
    public final AccessibilityManager f1696z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            i iVar = RecyclerView.this.J;
            if (iVar != null) {
                l lVar = (l) iVar;
                boolean z2 = !lVar.f1909h.isEmpty();
                boolean z3 = !lVar.f1911j.isEmpty();
                boolean z4 = !lVar.f1912k.isEmpty();
                boolean z5 = !lVar.f1910i.isEmpty();
                if (z2 || z3 || z5 || z4) {
                    Iterator<z> it = lVar.f1909h.iterator();
                    while (it.hasNext()) {
                        z next = it.next();
                        View view = next.f1788a;
                        ViewPropertyAnimator animate = view.animate();
                        lVar.f1918q.add(next);
                        animate.setDuration(lVar.f1704d).alpha(0.0f).setListener(new g(lVar, next, animate, view)).start();
                    }
                    lVar.f1909h.clear();
                    if (z3) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.addAll(lVar.f1911j);
                        lVar.f1914m.add(arrayList);
                        lVar.f1911j.clear();
                        d dVar = new d(lVar, arrayList);
                        if (z2) {
                            View view2 = ((l.b) arrayList.get(0)).f1926a.f1788a;
                            long j2 = lVar.f1704d;
                            WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
                            u.d.n(view2, dVar, j2);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z4) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(lVar.f1912k);
                        lVar.f1915n.add(arrayList2);
                        lVar.f1912k.clear();
                        e eVar = new e(lVar, arrayList2);
                        if (z2) {
                            View view3 = ((l.a) arrayList2.get(0)).f1920a.f1788a;
                            long j3 = lVar.f1704d;
                            WeakHashMap<View, g0.x> weakHashMap2 = g0.u.f3063a;
                            u.d.n(view3, eVar, j3);
                        } else {
                            eVar.run();
                        }
                    }
                    if (z5) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(lVar.f1910i);
                        lVar.f1913l.add(arrayList3);
                        lVar.f1910i.clear();
                        f fVar = new f(lVar, arrayList3);
                        if (z2 || z3 || z4) {
                            long j4 = 0;
                            long j5 = z2 ? lVar.f1704d : 0;
                            long j6 = z3 ? lVar.f1705e : 0;
                            if (z4) {
                                j4 = lVar.f1706f;
                            }
                            View view4 = ((z) arrayList3.get(0)).f1788a;
                            WeakHashMap<View, g0.x> weakHashMap3 = g0.u.f3063a;
                            u.d.n(view4, fVar, Math.max(j6, j4) + j5);
                        } else {
                            fVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.f1671k0 = false;
        }
    }

    public static class b implements Interpolator {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public class c implements d0.b {
        public c() {
        }

        public void a(z zVar, i.c cVar, i.c cVar2) {
            boolean z2;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            zVar.s(false);
            a0 a0Var = (a0) recyclerView.J;
            Objects.requireNonNull(a0Var);
            if (cVar == null || ((i2 = cVar.f1707a) == (i3 = cVar2.f1707a) && cVar.f1708b == cVar2.f1708b)) {
                l lVar = (l) a0Var;
                lVar.n(zVar);
                zVar.f1788a.setAlpha(0.0f);
                lVar.f1910i.add(zVar);
                z2 = true;
            } else {
                z2 = a0Var.i(zVar, i2, cVar.f1708b, i3, cVar2.f1708b);
            }
            if (z2) {
                recyclerView.V();
            }
        }

        public void b(z zVar, i.c cVar, i.c cVar2) {
            boolean z2;
            RecyclerView.this.f1654c.k(zVar);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f(zVar);
            zVar.s(false);
            a0 a0Var = (a0) recyclerView.J;
            Objects.requireNonNull(a0Var);
            int i2 = cVar.f1707a;
            int i3 = cVar.f1708b;
            View view = zVar.f1788a;
            int left = cVar2 == null ? view.getLeft() : cVar2.f1707a;
            int top = cVar2 == null ? view.getTop() : cVar2.f1708b;
            if (zVar.l() || (i2 == left && i3 == top)) {
                l lVar = (l) a0Var;
                lVar.n(zVar);
                lVar.f1909h.add(zVar);
                z2 = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z2 = a0Var.i(zVar, i2, i3, left, top);
            }
            if (z2) {
                recyclerView.V();
            }
        }
    }

    public static abstract class d<VH extends z> {

        /* renamed from: a  reason: collision with root package name */
        public final e f1699a = new e();

        /* renamed from: b  reason: collision with root package name */
        public boolean f1700b = false;

        public abstract int a();

        public long b(int i2) {
            return -1;
        }

        public abstract void c(VH vh, int i2);

        public abstract VH d(ViewGroup viewGroup, int i2);
    }

    public static class e extends Observable<f> {
        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((f) this.mObservers.get(size)).a();
            }
        }
    }

    public static abstract class f {
        public void a() {
        }
    }

    public interface g {
        int a(int i2, int i3);
    }

    public static class h {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class i {

        /* renamed from: a  reason: collision with root package name */
        public b f1701a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f1702b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f1703c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f1704d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f1705e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f1706f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f1707a;

            /* renamed from: b  reason: collision with root package name */
            public int f1708b;
        }

        public static int b(z zVar) {
            int i2 = zVar.f1797j & 14;
            if (zVar.j()) {
                return 4;
            }
            if ((i2 & 4) != 0) {
                return i2;
            }
            int i3 = zVar.f1791d;
            RecyclerView recyclerView = zVar.f1805r;
            int H = recyclerView == null ? -1 : recyclerView.H(zVar);
            return (i3 == -1 || H == -1 || i3 == H) ? i2 : i2 | 2048;
        }

        public abstract boolean a(z zVar, z zVar2, c cVar, c cVar2);

        public final void c(z zVar) {
            b bVar = this.f1701a;
            if (bVar != null) {
                j jVar = (j) bVar;
                Objects.requireNonNull(jVar);
                boolean z2 = true;
                zVar.s(true);
                if (zVar.f1795h != null && zVar.f1796i == null) {
                    zVar.f1795h = null;
                }
                zVar.f1796i = null;
                if (!((zVar.f1797j & 16) != 0)) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = zVar.f1788a;
                    recyclerView.h0();
                    c cVar = recyclerView.f1660f;
                    int indexOfChild = ((w) cVar.f1862a).f2001a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        cVar.l(view);
                    } else if (cVar.f1863b.d(indexOfChild)) {
                        cVar.f1863b.f(indexOfChild);
                        cVar.l(view);
                        ((w) cVar.f1862a).c(indexOfChild);
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        z K = RecyclerView.K(view);
                        recyclerView.f1654c.k(K);
                        recyclerView.f1654c.h(K);
                    }
                    recyclerView.j0(!z2);
                    if (!z2 && zVar.n()) {
                        RecyclerView.this.removeDetachedView(zVar.f1788a, false);
                    }
                }
            }
        }

        public final void d() {
            int size = this.f1702b.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f1702b.get(i2).a();
            }
            this.f1702b.clear();
        }

        public abstract void e(z zVar);

        public abstract void f();

        public abstract boolean g();

        public c h(z zVar) {
            c cVar = new c();
            View view = zVar.f1788a;
            cVar.f1707a = view.getLeft();
            cVar.f1708b = view.getTop();
            view.getRight();
            view.getBottom();
            return cVar;
        }
    }

    public class j implements i.b {
        public j() {
        }
    }

    public static abstract class k {
        public void d(Canvas canvas, RecyclerView recyclerView, w wVar) {
        }

        public void e(Canvas canvas, RecyclerView recyclerView, w wVar) {
        }
    }

    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        public c f1710a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f1711b;

        /* renamed from: c  reason: collision with root package name */
        public c0 f1712c;

        /* renamed from: d  reason: collision with root package name */
        public c0 f1713d;

        /* renamed from: e  reason: collision with root package name */
        public v f1714e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1715f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1716g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1717h = true;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1718i = true;

        /* renamed from: j  reason: collision with root package name */
        public int f1719j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1720k;

        /* renamed from: l  reason: collision with root package name */
        public int f1721l;

        /* renamed from: m  reason: collision with root package name */
        public int f1722m;

        /* renamed from: n  reason: collision with root package name */
        public int f1723n;

        /* renamed from: o  reason: collision with root package name */
        public int f1724o;

        public class a implements c0.b {
            public a() {
            }

            public int a() {
                l lVar = l.this;
                return lVar.f1723n - lVar.O();
            }

            public int b() {
                return l.this.N();
            }

            public int c(View view) {
                return l.this.F(view) + ((m) view.getLayoutParams()).rightMargin;
            }

            public int d(View view) {
                return l.this.C(view) - ((m) view.getLayoutParams()).leftMargin;
            }

            public View e(int i2) {
                return l.this.w(i2);
            }
        }

        public class b implements c0.b {
            public b() {
            }

            public int a() {
                l lVar = l.this;
                return lVar.f1724o - lVar.M();
            }

            public int b() {
                return l.this.P();
            }

            public int c(View view) {
                return l.this.A(view) + ((m) view.getLayoutParams()).bottomMargin;
            }

            public int d(View view) {
                return l.this.G(view) - ((m) view.getLayoutParams()).topMargin;
            }

            public View e(int i2) {
                return l.this.w(i2);
            }
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f1727a;

            /* renamed from: b  reason: collision with root package name */
            public int f1728b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f1729c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f1730d;
        }

        public l() {
            a aVar = new a();
            b bVar = new b();
            this.f1712c = new c0(aVar);
            this.f1713d = new c0(bVar);
        }

        public static d R(Context context, AttributeSet attributeSet, int i2, int i3) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s0.a.f3877a, i2, i3);
            dVar.f1727a = obtainStyledAttributes.getInt(0, 1);
            dVar.f1728b = obtainStyledAttributes.getInt(10, 1);
            dVar.f1729c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f1730d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean V(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i2;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i2;
            }
            return true;
        }

        public static int h(int i2, int i3, int i4) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i3, i4) : size : Math.min(size, Math.max(i3, i4));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int y(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.y(int, int, int, int, boolean):int");
        }

        public int A(View view) {
            return view.getBottom() + ((m) view.getLayoutParams()).f1732b.bottom;
        }

        public void A0(Rect rect, int i2, int i3) {
            int O = O() + N() + rect.width();
            int M = M() + P() + rect.height();
            this.f1711b.setMeasuredDimension(h(i2, O, L()), h(i3, M, K()));
        }

        public void B(View view, Rect rect) {
            int[] iArr = RecyclerView.f1646v0;
            m mVar = (m) view.getLayoutParams();
            Rect rect2 = mVar.f1732b;
            rect.set((view.getLeft() - rect2.left) - mVar.leftMargin, (view.getTop() - rect2.top) - mVar.topMargin, view.getRight() + rect2.right + mVar.rightMargin, view.getBottom() + rect2.bottom + mVar.bottomMargin);
        }

        public void B0(int i2, int i3) {
            int x2 = x();
            if (x2 == 0) {
                this.f1711b.o(i2, i3);
                return;
            }
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MAX_VALUE;
            for (int i8 = 0; i8 < x2; i8++) {
                View w2 = w(i8);
                Rect rect = this.f1711b.f1666i;
                B(w2, rect);
                int i9 = rect.left;
                if (i9 < i6) {
                    i6 = i9;
                }
                int i10 = rect.right;
                if (i10 > i4) {
                    i4 = i10;
                }
                int i11 = rect.top;
                if (i11 < i7) {
                    i7 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i5) {
                    i5 = i12;
                }
            }
            this.f1711b.f1666i.set(i6, i7, i4, i5);
            A0(this.f1711b.f1666i, i2, i3);
        }

        public int C(View view) {
            return view.getLeft() - ((m) view.getLayoutParams()).f1732b.left;
        }

        public void C0(RecyclerView recyclerView) {
            int i2;
            if (recyclerView == null) {
                this.f1711b = null;
                this.f1710a = null;
                i2 = 0;
                this.f1723n = 0;
            } else {
                this.f1711b = recyclerView;
                this.f1710a = recyclerView.f1660f;
                this.f1723n = recyclerView.getWidth();
                i2 = recyclerView.getHeight();
            }
            this.f1724o = i2;
            this.f1721l = 1073741824;
            this.f1722m = 1073741824;
        }

        public int D(View view) {
            Rect rect = ((m) view.getLayoutParams()).f1732b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public boolean D0(View view, int i2, int i3, m mVar) {
            return view.isLayoutRequested() || !this.f1717h || !V(view.getWidth(), i2, mVar.width) || !V(view.getHeight(), i3, mVar.height);
        }

        public int E(View view) {
            Rect rect = ((m) view.getLayoutParams()).f1732b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public boolean E0() {
            return false;
        }

        public int F(View view) {
            return view.getRight() + ((m) view.getLayoutParams()).f1732b.right;
        }

        public boolean F0(View view, int i2, int i3, m mVar) {
            return !this.f1717h || !V(view.getMeasuredWidth(), i2, mVar.width) || !V(view.getMeasuredHeight(), i3, mVar.height);
        }

        public int G(View view) {
            return view.getTop() - ((m) view.getLayoutParams()).f1732b.top;
        }

        public void G0(RecyclerView recyclerView, w wVar, int i2) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public View H() {
            View focusedChild;
            RecyclerView recyclerView = this.f1711b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1710a.f1864c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void H0(v vVar) {
            v vVar2 = this.f1714e;
            if (!(vVar2 == null || vVar == vVar2 || !vVar2.f1755e)) {
                vVar2.d();
            }
            this.f1714e = vVar;
            RecyclerView recyclerView = this.f1711b;
            recyclerView.f1653b0.c();
            if (vVar.f1758h) {
                StringBuilder a2 = androidx.activity.result.a.a("An instance of ");
                a2.append(vVar.getClass().getSimpleName());
                a2.append(" was started more than once. Each instance of");
                a2.append(vVar.getClass().getSimpleName());
                a2.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", a2.toString());
            }
            vVar.f1752b = recyclerView;
            vVar.f1753c = this;
            int i2 = vVar.f1751a;
            if (i2 != -1) {
                recyclerView.f1659e0.f1766a = i2;
                vVar.f1755e = true;
                vVar.f1754d = true;
                vVar.f1756f = recyclerView.f1674m.s(i2);
                vVar.f1752b.f1653b0.a();
                vVar.f1758h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public int I() {
            RecyclerView recyclerView = this.f1711b;
            d adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.a();
            }
            return 0;
        }

        public boolean I0() {
            return false;
        }

        public int J() {
            RecyclerView recyclerView = this.f1711b;
            WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
            return u.e.d(recyclerView);
        }

        public int K() {
            RecyclerView recyclerView = this.f1711b;
            WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
            return u.d.d(recyclerView);
        }

        public int L() {
            RecyclerView recyclerView = this.f1711b;
            WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
            return u.d.e(recyclerView);
        }

        public int M() {
            RecyclerView recyclerView = this.f1711b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int N() {
            RecyclerView recyclerView = this.f1711b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int O() {
            RecyclerView recyclerView = this.f1711b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int P() {
            RecyclerView recyclerView = this.f1711b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int Q(View view) {
            return ((m) view.getLayoutParams()).a();
        }

        public int S(r rVar, w wVar) {
            RecyclerView recyclerView = this.f1711b;
            if (recyclerView == null || recyclerView.f1672l == null || !f()) {
                return 1;
            }
            return this.f1711b.f1672l.a();
        }

        public void T(View view, boolean z2, Rect rect) {
            Matrix matrix;
            if (z2) {
                Rect rect2 = ((m) view.getLayoutParams()).f1732b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.f1711b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f1711b.f1670k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean U() {
            return false;
        }

        public void W(View view, int i2, int i3, int i4, int i5) {
            m mVar = (m) view.getLayoutParams();
            Rect rect = mVar.f1732b;
            view.layout(i2 + rect.left + mVar.leftMargin, i3 + rect.top + mVar.topMargin, (i4 - rect.right) - mVar.rightMargin, (i5 - rect.bottom) - mVar.bottomMargin);
        }

        public void X(int i2) {
            RecyclerView recyclerView = this.f1711b;
            if (recyclerView != null) {
                int e2 = recyclerView.f1660f.e();
                for (int i3 = 0; i3 < e2; i3++) {
                    recyclerView.f1660f.d(i3).offsetLeftAndRight(i2);
                }
            }
        }

        public void Y(int i2) {
            RecyclerView recyclerView = this.f1711b;
            if (recyclerView != null) {
                int e2 = recyclerView.f1660f.e();
                for (int i3 = 0; i3 < e2; i3++) {
                    recyclerView.f1660f.d(i3).offsetTopAndBottom(i2);
                }
            }
        }

        public void Z(RecyclerView recyclerView, r rVar) {
        }

        public View a0(View view, int i2, r rVar, w wVar) {
            return null;
        }

        public void b(View view) {
            c(view, -1, false);
        }

        public void b0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1711b;
            r rVar = recyclerView.f1654c;
            w wVar = recyclerView.f1659e0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z2 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f1711b.canScrollVertically(-1) && !this.f1711b.canScrollHorizontally(-1) && !this.f1711b.canScrollHorizontally(1)) {
                    z2 = false;
                }
                accessibilityEvent.setScrollable(z2);
                d dVar = this.f1711b.f1672l;
                if (dVar != null) {
                    accessibilityEvent.setItemCount(dVar.a());
                }
            }
        }

        public final void c(View view, int i2, boolean z2) {
            z K = RecyclerView.K(view);
            if (z2 || K.l()) {
                this.f1711b.f1662g.a(K);
            } else {
                this.f1711b.f1662g.f(K);
            }
            m mVar = (m) view.getLayoutParams();
            if (K.u() || K.m()) {
                if (K.m()) {
                    K.f1801n.k(K);
                } else {
                    K.d();
                }
                this.f1710a.b(view, i2, view.getLayoutParams(), false);
            } else {
                int i3 = -1;
                if (view.getParent() == this.f1711b) {
                    int j2 = this.f1710a.j(view);
                    if (i2 == -1) {
                        i2 = this.f1710a.e();
                    }
                    if (j2 == -1) {
                        StringBuilder a2 = androidx.activity.result.a.a("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        a2.append(this.f1711b.indexOfChild(view));
                        throw new IllegalStateException(b.a(this.f1711b, a2));
                    } else if (j2 != i2) {
                        l lVar = this.f1711b.f1674m;
                        View w2 = lVar.w(j2);
                        if (w2 != null) {
                            lVar.w(j2);
                            lVar.f1710a.c(j2);
                            m mVar2 = (m) w2.getLayoutParams();
                            z K2 = RecyclerView.K(w2);
                            if (K2.l()) {
                                lVar.f1711b.f1662g.a(K2);
                            } else {
                                lVar.f1711b.f1662g.f(K2);
                            }
                            lVar.f1710a.b(w2, i2, mVar2, K2.l());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j2 + lVar.f1711b.toString());
                        }
                    }
                } else {
                    this.f1710a.a(view, i2, false);
                    mVar.f1733c = true;
                    v vVar = this.f1714e;
                    if (vVar != null && vVar.f1755e) {
                        Objects.requireNonNull(vVar.f1752b);
                        z K3 = RecyclerView.K(view);
                        if (K3 != null) {
                            i3 = K3.e();
                        }
                        if (i3 == vVar.f1751a) {
                            vVar.f1756f = view;
                        }
                    }
                }
            }
            if (mVar.f1734d) {
                K.f1788a.invalidate();
                mVar.f1734d = false;
            }
        }

        public void c0(View view, h0.d dVar) {
            z K = RecyclerView.K(view);
            if (K != null && !K.l() && !this.f1710a.k(K.f1788a)) {
                RecyclerView recyclerView = this.f1711b;
                d0(recyclerView.f1654c, recyclerView.f1659e0, view, dVar);
            }
        }

        public void d(String str) {
            RecyclerView recyclerView = this.f1711b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public void d0(r rVar, w wVar, View view, h0.d dVar) {
            dVar.j(d.c.a(f() ? Q(view) : 0, 1, e() ? Q(view) : 0, 1, false, false));
        }

        public boolean e() {
            return false;
        }

        public void e0(RecyclerView recyclerView, int i2, int i3) {
        }

        public boolean f() {
            return false;
        }

        public void f0(RecyclerView recyclerView) {
        }

        public boolean g(m mVar) {
            return mVar != null;
        }

        public void g0(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public void h0(RecyclerView recyclerView, int i2, int i3) {
        }

        public void i(int i2, int i3, w wVar, c cVar) {
        }

        public void i0(RecyclerView recyclerView, int i2, int i3, Object obj) {
        }

        public void j(int i2, c cVar) {
        }

        public void j0(r rVar, w wVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int k(w wVar) {
            return 0;
        }

        public void k0(w wVar) {
        }

        public int l(w wVar) {
            return 0;
        }

        public void l0(Parcelable parcelable) {
        }

        public int m(w wVar) {
            return 0;
        }

        public Parcelable m0() {
            return null;
        }

        public int n(w wVar) {
            return 0;
        }

        public void n0(int i2) {
        }

        public int o(w wVar) {
            return 0;
        }

        public void o0(r rVar) {
            for (int x2 = x() - 1; x2 >= 0; x2--) {
                if (!RecyclerView.K(w(x2)).t()) {
                    r0(x2, rVar);
                }
            }
        }

        public int p(w wVar) {
            return 0;
        }

        public void p0(r rVar) {
            int size = rVar.f1741a.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                View view = rVar.f1741a.get(i2).f1788a;
                z K = RecyclerView.K(view);
                if (!K.t()) {
                    K.s(false);
                    if (K.n()) {
                        this.f1711b.removeDetachedView(view, false);
                    }
                    i iVar = this.f1711b.J;
                    if (iVar != null) {
                        iVar.e(K);
                    }
                    K.s(true);
                    z K2 = RecyclerView.K(view);
                    K2.f1801n = null;
                    K2.f1802o = false;
                    K2.d();
                    rVar.h(K2);
                }
            }
            rVar.f1741a.clear();
            ArrayList<z> arrayList = rVar.f1742b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f1711b.invalidate();
            }
        }

        public void q(r rVar) {
            int x2 = x();
            while (true) {
                x2--;
                if (x2 >= 0) {
                    View w2 = w(x2);
                    z K = RecyclerView.K(w2);
                    if (!K.t()) {
                        if (!K.j() || K.l() || this.f1711b.f1672l.f1700b) {
                            w(x2);
                            this.f1710a.c(x2);
                            rVar.i(w2);
                            this.f1711b.f1662g.f(K);
                        } else {
                            s0(x2);
                            rVar.h(K);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public void q0(View view, r rVar) {
            c cVar = this.f1710a;
            int indexOfChild = ((w) cVar.f1862a).f2001a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (cVar.f1863b.f(indexOfChild)) {
                    cVar.l(view);
                }
                ((w) cVar.f1862a).c(indexOfChild);
            }
            rVar.g(view);
        }

        public View r(View view) {
            View C;
            RecyclerView recyclerView = this.f1711b;
            if (recyclerView == null || (C = recyclerView.C(view)) == null || this.f1710a.f1864c.contains(C)) {
                return null;
            }
            return C;
        }

        public void r0(int i2, r rVar) {
            View w2 = w(i2);
            s0(i2);
            rVar.g(w2);
        }

        public View s(int i2) {
            int x2 = x();
            for (int i3 = 0; i3 < x2; i3++) {
                View w2 = w(i3);
                z K = RecyclerView.K(w2);
                if (K != null && K.e() == i2 && !K.t() && (this.f1711b.f1659e0.f1772g || !K.l())) {
                    return w2;
                }
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r3.f1710a;
            r4 = r0.f(r4);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void s0(int r4) {
            /*
                r3 = this;
                android.view.View r0 = r3.w(r4)
                if (r0 == 0) goto L_0x0029
                androidx.recyclerview.widget.c r0 = r3.f1710a
                int r4 = r0.f(r4)
                androidx.recyclerview.widget.c$b r1 = r0.f1862a
                androidx.recyclerview.widget.w r1 = (androidx.recyclerview.widget.w) r1
                android.view.View r1 = r1.a(r4)
                if (r1 != 0) goto L_0x0017
                goto L_0x0029
            L_0x0017:
                androidx.recyclerview.widget.c$a r2 = r0.f1863b
                boolean r2 = r2.f(r4)
                if (r2 == 0) goto L_0x0022
                r0.l(r1)
            L_0x0022:
                androidx.recyclerview.widget.c$b r0 = r0.f1862a
                androidx.recyclerview.widget.w r0 = (androidx.recyclerview.widget.w) r0
                r0.c(r4)
            L_0x0029:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.s0(int):void");
        }

        public abstract m t();

        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
            if (r1 == false) goto L_0x00bf;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean t0(androidx.recyclerview.widget.RecyclerView r19, android.view.View r20, android.graphics.Rect r21, boolean r22, boolean r23) {
            /*
                r18 = this;
                r0 = r18
                r1 = r21
                r2 = 2
                int[] r2 = new int[r2]
                int r3 = r18.N()
                int r4 = r18.P()
                int r5 = r0.f1723n
                int r6 = r18.O()
                int r5 = r5 - r6
                int r6 = r0.f1724o
                int r7 = r18.M()
                int r6 = r6 - r7
                int r7 = r20.getLeft()
                int r8 = r1.left
                int r7 = r7 + r8
                int r8 = r20.getScrollX()
                int r7 = r7 - r8
                int r8 = r20.getTop()
                int r9 = r1.top
                int r8 = r8 + r9
                int r9 = r20.getScrollY()
                int r8 = r8 - r9
                int r9 = r21.width()
                int r9 = r9 + r7
                int r1 = r21.height()
                int r1 = r1 + r8
                int r7 = r7 - r3
                r3 = 0
                int r10 = java.lang.Math.min(r3, r7)
                int r8 = r8 - r4
                int r4 = java.lang.Math.min(r3, r8)
                int r9 = r9 - r5
                int r5 = java.lang.Math.max(r3, r9)
                int r1 = r1 - r6
                int r1 = java.lang.Math.max(r3, r1)
                int r6 = r18.J()
                r11 = 1
                if (r6 != r11) goto L_0x0063
                if (r5 == 0) goto L_0x005e
                goto L_0x006b
            L_0x005e:
                int r5 = java.lang.Math.max(r10, r9)
                goto L_0x006b
            L_0x0063:
                if (r10 == 0) goto L_0x0066
                goto L_0x006a
            L_0x0066:
                int r10 = java.lang.Math.min(r7, r5)
            L_0x006a:
                r5 = r10
            L_0x006b:
                if (r4 == 0) goto L_0x006e
                goto L_0x0072
            L_0x006e:
                int r4 = java.lang.Math.min(r8, r1)
            L_0x0072:
                r2[r3] = r5
                r2[r11] = r4
                r13 = r2[r3]
                r14 = r2[r11]
                if (r23 == 0) goto L_0x00ba
                android.view.View r1 = r19.getFocusedChild()
                if (r1 != 0) goto L_0x0083
                goto L_0x00b7
            L_0x0083:
                int r2 = r18.N()
                int r4 = r18.P()
                int r5 = r0.f1723n
                int r6 = r18.O()
                int r5 = r5 - r6
                int r6 = r0.f1724o
                int r7 = r18.M()
                int r6 = r6 - r7
                androidx.recyclerview.widget.RecyclerView r7 = r0.f1711b
                android.graphics.Rect r7 = r7.f1666i
                r0.B(r1, r7)
                int r1 = r7.left
                int r1 = r1 - r13
                if (r1 >= r5) goto L_0x00b7
                int r1 = r7.right
                int r1 = r1 - r13
                if (r1 <= r2) goto L_0x00b7
                int r1 = r7.top
                int r1 = r1 - r14
                if (r1 >= r6) goto L_0x00b7
                int r1 = r7.bottom
                int r1 = r1 - r14
                if (r1 > r4) goto L_0x00b5
                goto L_0x00b7
            L_0x00b5:
                r1 = 1
                goto L_0x00b8
            L_0x00b7:
                r1 = 0
            L_0x00b8:
                if (r1 == 0) goto L_0x00bf
            L_0x00ba:
                if (r13 != 0) goto L_0x00c0
                if (r14 == 0) goto L_0x00bf
                goto L_0x00c0
            L_0x00bf:
                return r3
            L_0x00c0:
                if (r22 == 0) goto L_0x00c8
                r1 = r19
                r1.scrollBy(r13, r14)
                goto L_0x00d4
            L_0x00c8:
                r1 = r19
                r17 = 0
                r16 = -2147483648(0xffffffff80000000, float:-0.0)
                r15 = 0
                r12 = r19
                r12.g0(r13, r14, r15, r16, r17)
            L_0x00d4:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.l.t0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public m u(Context context, AttributeSet attributeSet) {
            return new m(context, attributeSet);
        }

        public void u0() {
            RecyclerView recyclerView = this.f1711b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public m v(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof m ? new m((m) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new m((ViewGroup.MarginLayoutParams) layoutParams) : new m(layoutParams);
        }

        public int v0(int i2, r rVar, w wVar) {
            return 0;
        }

        public View w(int i2) {
            c cVar = this.f1710a;
            if (cVar == null) {
                return null;
            }
            return ((w) cVar.f1862a).a(cVar.f(i2));
        }

        public void w0(int i2) {
        }

        public int x() {
            c cVar = this.f1710a;
            if (cVar != null) {
                return cVar.e();
            }
            return 0;
        }

        public int x0(int i2, r rVar, w wVar) {
            return 0;
        }

        public void y0(RecyclerView recyclerView) {
            z0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int z(r rVar, w wVar) {
            RecyclerView recyclerView = this.f1711b;
            if (recyclerView == null || recyclerView.f1672l == null || !e()) {
                return 1;
            }
            return this.f1711b.f1672l.a();
        }

        public void z0(int i2, int i3) {
            this.f1723n = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            this.f1721l = mode;
            if (mode == 0 && !RecyclerView.f1647w0) {
                this.f1723n = 0;
            }
            this.f1724o = View.MeasureSpec.getSize(i3);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.f1722m = mode2;
            if (mode2 == 0 && !RecyclerView.f1647w0) {
                this.f1724o = 0;
            }
        }
    }

    public static class m extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public z f1731a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1732b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f1733c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1734d = false;

        public m(int i2, int i3) {
            super(i2, i3);
        }

        public m(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public m(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public m(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public m(m mVar) {
            super(mVar);
        }

        public int a() {
            return this.f1731a.e();
        }

        public boolean b() {
            return this.f1731a.o();
        }

        public boolean c() {
            return this.f1731a.l();
        }
    }

    public static abstract class n {
    }

    public interface o {
        void a(boolean z2);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class p {
        public void a(RecyclerView recyclerView, int i2) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }
    }

    public static class q {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f1735a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f1736b = 0;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<z> f1737a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f1738b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f1739c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f1740d = 0;
        }

        public final a a(int i2) {
            a aVar = this.f1735a.get(i2);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f1735a.put(i2, aVar2);
            return aVar2;
        }

        public long b(long j2, long j3) {
            if (j2 == 0) {
                return j3;
            }
            return (j3 / 4) + ((j2 / 4) * 3);
        }
    }

    public final class r {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<z> f1741a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<z> f1742b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<z> f1743c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final List<z> f1744d;

        /* renamed from: e  reason: collision with root package name */
        public int f1745e;

        /* renamed from: f  reason: collision with root package name */
        public int f1746f;

        /* renamed from: g  reason: collision with root package name */
        public q f1747g;

        public r() {
            ArrayList<z> arrayList = new ArrayList<>();
            this.f1741a = arrayList;
            this.f1744d = Collections.unmodifiableList(arrayList);
            this.f1745e = 2;
            this.f1746f = 2;
        }

        public void a(z zVar, boolean z2) {
            RecyclerView.k(zVar);
            View view = zVar.f1788a;
            y yVar = RecyclerView.this.f1673l0;
            if (yVar != null) {
                y.a aVar = yVar.f2004e;
                g0.u.u(view, aVar instanceof y.a ? aVar.f2006e.remove(view) : null);
            }
            if (z2) {
                s sVar = RecyclerView.this.f1676n;
                if (sVar != null) {
                    sVar.a(zVar);
                }
                RecyclerView recyclerView = RecyclerView.this;
                d dVar = recyclerView.f1672l;
                if (recyclerView.f1659e0 != null) {
                    recyclerView.f1662g.g(zVar);
                }
            }
            zVar.f1805r = null;
            q d2 = d();
            Objects.requireNonNull(d2);
            int i2 = zVar.f1793f;
            ArrayList<z> arrayList = d2.a(i2).f1737a;
            if (d2.f1735a.get(i2).f1738b > arrayList.size()) {
                zVar.q();
                arrayList.add(zVar);
            }
        }

        public void b() {
            this.f1741a.clear();
            e();
        }

        public int c(int i2) {
            if (i2 < 0 || i2 >= RecyclerView.this.f1659e0.b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i2);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.f1659e0.b());
                throw new IndexOutOfBoundsException(b.a(RecyclerView.this, sb));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f1659e0.f1772g) {
                return i2;
            }
            return recyclerView.f1658e.f(i2, 0);
        }

        public q d() {
            if (this.f1747g == null) {
                this.f1747g = new q();
            }
            return this.f1747g;
        }

        public void e() {
            for (int size = this.f1743c.size() - 1; size >= 0; size--) {
                f(size);
            }
            this.f1743c.clear();
            if (RecyclerView.f1648x0) {
                n.b bVar = RecyclerView.this.f1657d0;
                int[] iArr = bVar.f1970c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f1971d = 0;
            }
        }

        public void f(int i2) {
            a(this.f1743c.get(i2), true);
            this.f1743c.remove(i2);
        }

        public void g(View view) {
            z K = RecyclerView.K(view);
            if (K.n()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (K.m()) {
                K.f1801n.k(K);
            } else if (K.u()) {
                K.d();
            }
            h(K);
            if (RecyclerView.this.J != null && !K.k()) {
                RecyclerView.this.J.e(K);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x009c A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:57:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(androidx.recyclerview.widget.RecyclerView.z r6) {
            /*
                r5 = this;
                boolean r0 = r6.m()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x00cf
                android.view.View r0 = r6.f1788a
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0012
                goto L_0x00cf
            L_0x0012:
                boolean r0 = r6.n()
                if (r0 != 0) goto L_0x00b6
                boolean r0 = r6.t()
                if (r0 != 0) goto L_0x00a4
                int r0 = r6.f1797j
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0030
                android.view.View r0 = r6.f1788a
                java.util.WeakHashMap<android.view.View, g0.x> r3 = g0.u.f3063a
                boolean r0 = g0.u.d.i(r0)
                if (r0 == 0) goto L_0x0030
                r0 = 1
                goto L_0x0031
            L_0x0030:
                r0 = 0
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r3 = r3.f1672l
                boolean r3 = r6.k()
                if (r3 == 0) goto L_0x0091
                int r3 = r5.f1746f
                if (r3 <= 0) goto L_0x008a
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r6.g(r3)
                if (r3 != 0) goto L_0x008a
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r5.f1743c
                int r3 = r3.size()
                int r4 = r5.f1746f
                if (r3 < r4) goto L_0x0058
                if (r3 <= 0) goto L_0x0058
                r5.f(r2)
                int r3 = r3 + -1
            L_0x0058:
                boolean r2 = androidx.recyclerview.widget.RecyclerView.f1648x0
                if (r2 == 0) goto L_0x0083
                if (r3 <= 0) goto L_0x0083
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.n$b r2 = r2.f1657d0
                int r4 = r6.f1790c
                boolean r2 = r2.c(r4)
                if (r2 != 0) goto L_0x0083
            L_0x006a:
                int r3 = r3 + -1
                if (r3 < 0) goto L_0x0082
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r2 = r5.f1743c
                java.lang.Object r2 = r2.get(r3)
                androidx.recyclerview.widget.RecyclerView$z r2 = (androidx.recyclerview.widget.RecyclerView.z) r2
                int r2 = r2.f1790c
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.n$b r4 = r4.f1657d0
                boolean r2 = r4.c(r2)
                if (r2 != 0) goto L_0x006a
            L_0x0082:
                int r3 = r3 + r1
            L_0x0083:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r2 = r5.f1743c
                r2.add(r3, r6)
                r2 = 1
                goto L_0x008b
            L_0x008a:
                r2 = 0
            L_0x008b:
                if (r2 != 0) goto L_0x0092
                r5.a(r6, r1)
                goto L_0x0093
            L_0x0091:
                r2 = 0
            L_0x0092:
                r1 = 0
            L_0x0093:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.d0 r3 = r3.f1662g
                r3.g(r6)
                if (r2 != 0) goto L_0x00a3
                if (r1 != 0) goto L_0x00a3
                if (r0 == 0) goto L_0x00a3
                r0 = 0
                r6.f1805r = r0
            L_0x00a3:
                return
            L_0x00a4:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                java.lang.StringBuilder r0 = androidx.activity.result.a.a(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.recyclerview.widget.b.a(r1, r0)
                r6.<init>(r0)
                throw r6
            L_0x00b6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r6)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r6 = androidx.recyclerview.widget.b.a(r6, r1)
                r0.<init>(r6)
                throw r0
            L_0x00cf:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Scrapped or attached views may not be recycled. isScrap:"
                java.lang.StringBuilder r2 = androidx.activity.result.a.a(r2)
                boolean r3 = r6.m()
                r2.append(r3)
                java.lang.String r3 = " isAttached:"
                r2.append(r3)
                android.view.View r6 = r6.f1788a
                android.view.ViewParent r6 = r6.getParent()
                if (r6 == 0) goto L_0x00ec
                goto L_0x00ed
            L_0x00ec:
                r1 = 0
            L_0x00ed:
                r2.append(r1)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r6 = androidx.recyclerview.widget.b.a(r6, r2)
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r.h(androidx.recyclerview.widget.RecyclerView$z):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void i(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$z r5 = androidx.recyclerview.widget.RecyclerView.K(r5)
                r0 = 12
                boolean r0 = r5.g(r0)
                r1 = 0
                if (r0 != 0) goto L_0x0055
                boolean r0 = r5.o()
                if (r0 == 0) goto L_0x0055
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r0 = r0.J
                r2 = 1
                if (r0 == 0) goto L_0x003f
                java.util.List r3 = r5.f()
                androidx.recyclerview.widget.l r0 = (androidx.recyclerview.widget.l) r0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0039
                boolean r0 = r0.f1857g
                if (r0 == 0) goto L_0x0033
                boolean r0 = r5.j()
                if (r0 == 0) goto L_0x0031
                goto L_0x0033
            L_0x0031:
                r0 = 0
                goto L_0x0034
            L_0x0033:
                r0 = 1
            L_0x0034:
                if (r0 == 0) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r0 = 0
                goto L_0x003a
            L_0x0039:
                r0 = 1
            L_0x003a:
                if (r0 == 0) goto L_0x003d
                goto L_0x003f
            L_0x003d:
                r0 = 0
                goto L_0x0040
            L_0x003f:
                r0 = 1
            L_0x0040:
                if (r0 == 0) goto L_0x0043
                goto L_0x0055
            L_0x0043:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f1742b
                if (r0 != 0) goto L_0x004e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f1742b = r0
            L_0x004e:
                r5.f1801n = r4
                r5.f1802o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f1742b
                goto L_0x0082
            L_0x0055:
                boolean r0 = r5.j()
                if (r0 == 0) goto L_0x007c
                boolean r0 = r5.l()
                if (r0 != 0) goto L_0x007c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r0 = r0.f1672l
                boolean r0 = r0.f1700b
                if (r0 == 0) goto L_0x006a
                goto L_0x007c
            L_0x006a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = androidx.activity.result.a.a(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.recyclerview.widget.b.a(r1, r0)
                r5.<init>(r0)
                throw r5
            L_0x007c:
                r5.f1801n = r4
                r5.f1802o = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r4.f1741a
            L_0x0082:
                r0.add(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r.i(android.view.View):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:102:0x01e6, code lost:
            if (r7.f1793f != 0) goto L_0x01fe;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x02fb, code lost:
            r7 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x044a, code lost:
            if (r7.j() == false) goto L_0x0480;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:238:0x047e, code lost:
            if ((r10 == 0 || r10 + r8 < r19) == false) goto L_0x0480;
         */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x0248  */
        /* JADX WARNING: Removed duplicated region for block: B:176:0x033b  */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x0412  */
        /* JADX WARNING: Removed duplicated region for block: B:220:0x0433  */
        /* JADX WARNING: Removed duplicated region for block: B:221:0x0436  */
        /* JADX WARNING: Removed duplicated region for block: B:274:0x0531  */
        /* JADX WARNING: Removed duplicated region for block: B:275:0x0538  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.z j(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r1 = r16
                r0 = r17
                if (r0 < 0) goto L_0x055a
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r2 = r2.f1659e0
                int r2 = r2.b()
                if (r0 >= r2) goto L_0x055a
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r2 = r2.f1659e0
                boolean r2 = r2.f1772g
                r3 = 32
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x008b
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r2 = r1.f1742b
                if (r2 == 0) goto L_0x0086
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0027
                goto L_0x0086
            L_0x0027:
                r6 = 0
            L_0x0028:
                if (r6 >= r2) goto L_0x0045
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1742b
                java.lang.Object r7 = r7.get(r6)
                androidx.recyclerview.widget.RecyclerView$z r7 = (androidx.recyclerview.widget.RecyclerView.z) r7
                boolean r8 = r7.u()
                if (r8 != 0) goto L_0x0042
                int r8 = r7.e()
                if (r8 != r0) goto L_0x0042
                r7.b(r3)
                goto L_0x0087
            L_0x0042:
                int r6 = r6 + 1
                goto L_0x0028
            L_0x0045:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r7 = r6.f1672l
                boolean r7 = r7.f1700b
                if (r7 == 0) goto L_0x0086
                androidx.recyclerview.widget.a r6 = r6.f1658e
                int r6 = r6.f(r0, r5)
                if (r6 <= 0) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r7 = r7.f1672l
                int r7 = r7.a()
                if (r6 >= r7) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r7 = r7.f1672l
                long r6 = r7.b(r6)
                r8 = 0
            L_0x0068:
                if (r8 >= r2) goto L_0x0086
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1742b
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.z) r9
                boolean r10 = r9.u()
                if (r10 != 0) goto L_0x0083
                long r10 = r9.f1792e
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r12 != 0) goto L_0x0083
                r9.b(r3)
                r7 = r9
                goto L_0x0087
            L_0x0083:
                int r8 = r8 + 1
                goto L_0x0068
            L_0x0086:
                r7 = r4
            L_0x0087:
                if (r7 == 0) goto L_0x008c
                r2 = 1
                goto L_0x008d
            L_0x008b:
                r7 = r4
            L_0x008c:
                r2 = 0
            L_0x008d:
                r6 = -1
                if (r7 != 0) goto L_0x0245
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1741a
                int r7 = r7.size()
                r8 = 0
            L_0x0097:
                if (r8 >= r7) goto L_0x00c9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1741a
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.z) r9
                boolean r10 = r9.u()
                if (r10 != 0) goto L_0x00c6
                int r10 = r9.e()
                if (r10 != r0) goto L_0x00c6
                boolean r10 = r9.j()
                if (r10 != 0) goto L_0x00c6
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r10 = r10.f1659e0
                boolean r10 = r10.f1772g
                if (r10 != 0) goto L_0x00c1
                boolean r10 = r9.l()
                if (r10 != 0) goto L_0x00c6
            L_0x00c1:
                r9.b(r3)
                goto L_0x01b4
            L_0x00c6:
                int r8 = r8 + 1
                goto L_0x0097
            L_0x00c9:
                if (r18 != 0) goto L_0x018a
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c r7 = r7.f1660f
                java.util.List<android.view.View> r8 = r7.f1864c
                int r8 = r8.size()
                r9 = 0
            L_0x00d6:
                if (r9 >= r8) goto L_0x0101
                java.util.List<android.view.View> r10 = r7.f1864c
                java.lang.Object r10 = r10.get(r9)
                android.view.View r10 = (android.view.View) r10
                androidx.recyclerview.widget.c$b r11 = r7.f1862a
                androidx.recyclerview.widget.w r11 = (androidx.recyclerview.widget.w) r11
                java.util.Objects.requireNonNull(r11)
                androidx.recyclerview.widget.RecyclerView$z r11 = androidx.recyclerview.widget.RecyclerView.K(r10)
                int r12 = r11.e()
                if (r12 != r0) goto L_0x00fe
                boolean r12 = r11.j()
                if (r12 != 0) goto L_0x00fe
                boolean r11 = r11.l()
                if (r11 != 0) goto L_0x00fe
                goto L_0x0102
            L_0x00fe:
                int r9 = r9 + 1
                goto L_0x00d6
            L_0x0101:
                r10 = r4
            L_0x0102:
                if (r10 == 0) goto L_0x018a
                androidx.recyclerview.widget.RecyclerView$z r7 = androidx.recyclerview.widget.RecyclerView.K(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c r8 = r8.f1660f
                androidx.recyclerview.widget.c$b r9 = r8.f1862a
                androidx.recyclerview.widget.w r9 = (androidx.recyclerview.widget.w) r9
                androidx.recyclerview.widget.RecyclerView r9 = r9.f2001a
                int r9 = r9.indexOfChild(r10)
                if (r9 < 0) goto L_0x0173
                androidx.recyclerview.widget.c$a r11 = r8.f1863b
                boolean r11 = r11.d(r9)
                if (r11 == 0) goto L_0x015c
                androidx.recyclerview.widget.c$a r11 = r8.f1863b
                r11.a(r9)
                r8.l(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c r8 = r8.f1660f
                int r8 = r8.j(r10)
                if (r8 == r6) goto L_0x0143
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.c r9 = r9.f1660f
                r9.c(r8)
                r1.i(r10)
                r8 = 8224(0x2020, float:1.1524E-41)
                r7.b(r8)
                goto L_0x01ba
            L_0x0143:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = androidx.recyclerview.widget.b.a(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x015c:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0173:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x018a:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1743c
                int r7 = r7.size()
                r8 = 0
            L_0x0191:
                if (r8 >= r7) goto L_0x01b9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1743c
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$z r9 = (androidx.recyclerview.widget.RecyclerView.z) r9
                boolean r10 = r9.j()
                if (r10 != 0) goto L_0x01b6
                int r10 = r9.e()
                if (r10 != r0) goto L_0x01b6
                boolean r10 = r9.h()
                if (r10 != 0) goto L_0x01b6
                if (r18 != 0) goto L_0x01b4
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1743c
                r7.remove(r8)
            L_0x01b4:
                r7 = r9
                goto L_0x01ba
            L_0x01b6:
                int r8 = r8 + 1
                goto L_0x0191
            L_0x01b9:
                r7 = r4
            L_0x01ba:
                if (r7 == 0) goto L_0x0245
                boolean r8 = r7.l()
                if (r8 == 0) goto L_0x01c9
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r8 = r8.f1659e0
                boolean r8 = r8.f1772g
                goto L_0x0201
            L_0x01c9:
                int r8 = r7.f1790c
                if (r8 < 0) goto L_0x022c
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r9 = r9.f1672l
                int r9 = r9.a()
                if (r8 >= r9) goto L_0x022c
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r9 = r8.f1659e0
                boolean r9 = r9.f1772g
                if (r9 != 0) goto L_0x01e9
                androidx.recyclerview.widget.RecyclerView$d r8 = r8.f1672l
                java.util.Objects.requireNonNull(r8)
                int r8 = r7.f1793f
                if (r8 == 0) goto L_0x01e9
                goto L_0x01fe
            L_0x01e9:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r8 = r8.f1672l
                boolean r9 = r8.f1700b
                if (r9 == 0) goto L_0x0200
                long r9 = r7.f1792e
                int r11 = r7.f1790c
                long r11 = r8.b(r11)
                int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x01fe
                goto L_0x0200
            L_0x01fe:
                r8 = 0
                goto L_0x0201
            L_0x0200:
                r8 = 1
            L_0x0201:
                if (r8 != 0) goto L_0x022a
                if (r18 != 0) goto L_0x0228
                r8 = 4
                r7.b(r8)
                boolean r8 = r7.m()
                if (r8 == 0) goto L_0x021c
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r7.f1788a
                r8.removeDetachedView(r9, r5)
                androidx.recyclerview.widget.RecyclerView$r r8 = r7.f1801n
                r8.k(r7)
                goto L_0x0225
            L_0x021c:
                boolean r8 = r7.u()
                if (r8 == 0) goto L_0x0225
                r7.d()
            L_0x0225:
                r1.h(r7)
            L_0x0228:
                r7 = r4
                goto L_0x0245
            L_0x022a:
                r2 = 1
                goto L_0x0245
            L_0x022c:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = androidx.recyclerview.widget.b.a(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x0245:
                r8 = 2
                if (r7 != 0) goto L_0x03f5
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r11 = r11.f1658e
                int r11 = r11.f(r0, r5)
                if (r11 < 0) goto L_0x03c4
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r12 = r12.f1672l
                int r12 = r12.a()
                if (r11 >= r12) goto L_0x03c4
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r12 = r12.f1672l
                java.util.Objects.requireNonNull(r12)
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r12 = r12.f1672l
                boolean r13 = r12.f1700b
                if (r13 == 0) goto L_0x0301
                long r12 = r12.b(r11)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1741a
                int r7 = r7.size()
                int r7 = r7 + r6
            L_0x0276:
                if (r7 < 0) goto L_0x02c9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r14 = r1.f1741a
                java.lang.Object r14 = r14.get(r7)
                androidx.recyclerview.widget.RecyclerView$z r14 = (androidx.recyclerview.widget.RecyclerView.z) r14
                long r9 = r14.f1792e
                int r15 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r15 != 0) goto L_0x02c6
                boolean r9 = r14.u()
                if (r9 != 0) goto L_0x02c6
                int r9 = r14.f1793f
                if (r9 != 0) goto L_0x02a8
                r14.b(r3)
                boolean r3 = r14.l()
                if (r3 == 0) goto L_0x02a6
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f1659e0
                boolean r3 = r3.f1772g
                if (r3 != 0) goto L_0x02a6
                r3 = 14
                r14.r(r8, r3)
            L_0x02a6:
                r7 = r14
                goto L_0x02fc
            L_0x02a8:
                if (r18 != 0) goto L_0x02c6
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1741a
                r9.remove(r7)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r10 = r14.f1788a
                r9.removeDetachedView(r10, r5)
                android.view.View r9 = r14.f1788a
                androidx.recyclerview.widget.RecyclerView$z r9 = androidx.recyclerview.widget.RecyclerView.K(r9)
                r9.f1801n = r4
                r9.f1802o = r5
                r9.d()
                r1.h(r9)
            L_0x02c6:
                int r7 = r7 + -1
                goto L_0x0276
            L_0x02c9:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r1.f1743c
                int r3 = r3.size()
                int r3 = r3 + r6
            L_0x02d0:
                if (r3 < 0) goto L_0x02fb
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r1.f1743c
                java.lang.Object r7 = r7.get(r3)
                androidx.recyclerview.widget.RecyclerView$z r7 = (androidx.recyclerview.widget.RecyclerView.z) r7
                long r9 = r7.f1792e
                int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
                if (r14 != 0) goto L_0x02f8
                boolean r9 = r7.h()
                if (r9 != 0) goto L_0x02f8
                int r9 = r7.f1793f
                if (r9 != 0) goto L_0x02f2
                if (r18 != 0) goto L_0x02fc
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r9 = r1.f1743c
                r9.remove(r3)
                goto L_0x02fc
            L_0x02f2:
                if (r18 != 0) goto L_0x02f8
                r1.f(r3)
                goto L_0x02fb
            L_0x02f8:
                int r3 = r3 + -1
                goto L_0x02d0
            L_0x02fb:
                r7 = r4
            L_0x02fc:
                if (r7 == 0) goto L_0x0301
                r7.f1790c = r11
                r2 = 1
            L_0x0301:
                if (r7 != 0) goto L_0x0341
                androidx.recyclerview.widget.RecyclerView$q r3 = r16.d()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$q$a> r3 = r3.f1735a
                java.lang.Object r3 = r3.get(r5)
                androidx.recyclerview.widget.RecyclerView$q$a r3 = (androidx.recyclerview.widget.RecyclerView.q.a) r3
                if (r3 == 0) goto L_0x0338
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r7 = r3.f1737a
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L_0x0338
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r3 = r3.f1737a
                int r7 = r3.size()
                int r7 = r7 + r6
            L_0x0320:
                if (r7 < 0) goto L_0x0338
                java.lang.Object r6 = r3.get(r7)
                androidx.recyclerview.widget.RecyclerView$z r6 = (androidx.recyclerview.widget.RecyclerView.z) r6
                boolean r6 = r6.h()
                if (r6 != 0) goto L_0x0335
                java.lang.Object r3 = r3.remove(r7)
                androidx.recyclerview.widget.RecyclerView$z r3 = (androidx.recyclerview.widget.RecyclerView.z) r3
                goto L_0x0339
            L_0x0335:
                int r7 = r7 + -1
                goto L_0x0320
            L_0x0338:
                r3 = r4
            L_0x0339:
                if (r3 == 0) goto L_0x0340
                r3.q()
                int[] r6 = androidx.recyclerview.widget.RecyclerView.f1646v0
            L_0x0340:
                r7 = r3
            L_0x0341:
                if (r7 != 0) goto L_0x03f5
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r6 = r3.getNanoTime()
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r19 > r9 ? 1 : (r19 == r9 ? 0 : -1))
                if (r3 == 0) goto L_0x036c
                androidx.recyclerview.widget.RecyclerView$q r3 = r1.f1747g
                androidx.recyclerview.widget.RecyclerView$q$a r3 = r3.a(r5)
                long r9 = r3.f1739c
                r11 = 0
                int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r3 == 0) goto L_0x0368
                long r9 = r9 + r6
                int r3 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
                if (r3 >= 0) goto L_0x0366
                goto L_0x0368
            L_0x0366:
                r3 = 0
                goto L_0x0369
            L_0x0368:
                r3 = 1
            L_0x0369:
                if (r3 != 0) goto L_0x036c
                return r4
            L_0x036c:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r4 = r3.f1672l
                java.util.Objects.requireNonNull(r4)
                java.lang.String r9 = "RV CreateView"
                int r10 = c0.c.f2067a     // Catch:{ all -> 0x03bd }
                android.os.Trace.beginSection(r9)     // Catch:{ all -> 0x03bd }
                androidx.recyclerview.widget.RecyclerView$z r3 = r4.d(r3, r5)     // Catch:{ all -> 0x03bd }
                android.view.View r4 = r3.f1788a     // Catch:{ all -> 0x03bd }
                android.view.ViewParent r4 = r4.getParent()     // Catch:{ all -> 0x03bd }
                if (r4 != 0) goto L_0x03b5
                r3.f1793f = r5     // Catch:{ all -> 0x03bd }
                android.os.Trace.endSection()
                boolean r4 = androidx.recyclerview.widget.RecyclerView.f1648x0
                if (r4 == 0) goto L_0x039e
                android.view.View r4 = r3.f1788a
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.F(r4)
                if (r4 == 0) goto L_0x039e
                java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
                r9.<init>(r4)
                r3.f1789b = r9
            L_0x039e:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                long r9 = r4.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$q r4 = r1.f1747g
                long r9 = r9 - r6
                androidx.recyclerview.widget.RecyclerView$q$a r6 = r4.a(r5)
                long r11 = r6.f1739c
                long r9 = r4.b(r11, r9)
                r6.f1739c = r9
                r7 = r3
                goto L_0x03f5
            L_0x03b5:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03bd }
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch:{ all -> 0x03bd }
                throw r0     // Catch:{ all -> 0x03bd }
            L_0x03bd:
                r0 = move-exception
                int r2 = c0.c.f2067a
                android.os.Trace.endSection()
                throw r0
            L_0x03c4:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Inconsistency detected. Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "(offset:"
                r3.append(r0)
                r3.append(r11)
                java.lang.String r0 = ").state:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f1659e0
                int r0 = r0.b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.recyclerview.widget.b.a(r0, r3)
                r2.<init>(r0)
                throw r2
            L_0x03f5:
                if (r2 == 0) goto L_0x0425
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f1659e0
                boolean r3 = r3.f1772g
                if (r3 != 0) goto L_0x0425
                r3 = 8192(0x2000, float:1.14794E-41)
                boolean r4 = r7.g(r3)
                if (r4 == 0) goto L_0x0425
                r7.r(r5, r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f1659e0
                boolean r3 = r3.f1775j
                if (r3 == 0) goto L_0x0425
                androidx.recyclerview.widget.RecyclerView.i.b(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$i r3 = r3.J
                r7.f()
                androidx.recyclerview.widget.RecyclerView$i$c r3 = r3.h(r7)
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r4.Y(r7, r3)
            L_0x0425:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f1659e0
                boolean r3 = r3.f1772g
                if (r3 == 0) goto L_0x0436
                boolean r3 = r7.i()
                if (r3 == 0) goto L_0x0436
                r7.f1794g = r0
                goto L_0x0480
            L_0x0436:
                boolean r3 = r7.i()
                if (r3 == 0) goto L_0x044c
                int r3 = r7.f1797j
                r3 = r3 & r8
                if (r3 == 0) goto L_0x0443
                r3 = 1
                goto L_0x0444
            L_0x0443:
                r3 = 0
            L_0x0444:
                if (r3 != 0) goto L_0x044c
                boolean r3 = r7.j()
                if (r3 == 0) goto L_0x0480
            L_0x044c:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r3 = r3.f1658e
                int r3 = r3.f(r0, r5)
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                r7.f1805r = r4
                int r6 = r7.f1793f
                long r8 = r4.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r4 == 0) goto L_0x0483
                androidx.recyclerview.widget.RecyclerView$q r4 = r1.f1747g
                androidx.recyclerview.widget.RecyclerView$q$a r4 = r4.a(r6)
                long r10 = r4.f1740d
                r12 = 0
                int r4 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r4 == 0) goto L_0x047d
                long r10 = r10 + r8
                int r4 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
                if (r4 >= 0) goto L_0x047b
                goto L_0x047d
            L_0x047b:
                r4 = 0
                goto L_0x047e
            L_0x047d:
                r4 = 1
            L_0x047e:
                if (r4 != 0) goto L_0x0483
            L_0x0480:
                r0 = 0
                goto L_0x0529
            L_0x0483:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d r4 = r4.f1672l
                java.util.Objects.requireNonNull(r4)
                r7.f1790c = r3
                boolean r6 = r4.f1700b
                if (r6 == 0) goto L_0x0496
                long r10 = r4.b(r3)
                r7.f1792e = r10
            L_0x0496:
                r6 = 519(0x207, float:7.27E-43)
                r10 = 1
                r7.r(r10, r6)
                int r6 = c0.c.f2067a
                java.lang.String r6 = "RV OnBindView"
                android.os.Trace.beginSection(r6)
                r7.f()
                r4.c(r7, r3)
                java.util.List<java.lang.Object> r3 = r7.f1798k
                if (r3 == 0) goto L_0x04b0
                r3.clear()
            L_0x04b0:
                int r3 = r7.f1797j
                r3 = r3 & -1025(0xfffffffffffffbff, float:NaN)
                r7.f1797j = r3
                android.view.View r3 = r7.f1788a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r4 = r3 instanceof androidx.recyclerview.widget.RecyclerView.m
                if (r4 == 0) goto L_0x04c5
                androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
                r4 = 1
                r3.f1733c = r4
            L_0x04c5:
                android.os.Trace.endSection()
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r3 = r3.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$q r6 = r1.f1747g
                int r10 = r7.f1793f
                long r3 = r3 - r8
                androidx.recyclerview.widget.RecyclerView$q$a r8 = r6.a(r10)
                long r9 = r8.f1740d
                long r3 = r6.b(r9, r3)
                r8.f1740d = r3
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.accessibility.AccessibilityManager r3 = r3.f1696z
                if (r3 == 0) goto L_0x04ed
                boolean r3 = r3.isEnabled()
                if (r3 == 0) goto L_0x04ed
                r3 = 1
                goto L_0x04ee
            L_0x04ed:
                r3 = 0
            L_0x04ee:
                if (r3 == 0) goto L_0x051e
                android.view.View r3 = r7.f1788a
                java.util.WeakHashMap<android.view.View, g0.x> r4 = g0.u.f3063a
                int r4 = g0.u.d.c(r3)
                r6 = 1
                if (r4 != 0) goto L_0x04fe
                g0.u.d.s(r3, r6)
            L_0x04fe:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.y r4 = r4.f1673l0
                if (r4 != 0) goto L_0x0505
                goto L_0x051e
            L_0x0505:
                androidx.recyclerview.widget.y$a r4 = r4.f2004e
                boolean r6 = r4 instanceof androidx.recyclerview.widget.y.a
                if (r6 == 0) goto L_0x051b
                java.util.Objects.requireNonNull(r4)
                g0.a r6 = g0.u.g(r3)
                if (r6 == 0) goto L_0x051b
                if (r6 == r4) goto L_0x051b
                java.util.Map<android.view.View, g0.a> r8 = r4.f2006e
                r8.put(r3, r6)
            L_0x051b:
                g0.u.u(r3, r4)
            L_0x051e:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f1659e0
                boolean r3 = r3.f1772g
                if (r3 == 0) goto L_0x0528
                r7.f1794g = r0
            L_0x0528:
                r0 = 1
            L_0x0529:
                android.view.View r3 = r7.f1788a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                if (r3 != 0) goto L_0x0538
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r3 = r3.generateDefaultLayoutParams()
                goto L_0x0546
            L_0x0538:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                boolean r4 = r4.checkLayoutParams(r3)
                if (r4 != 0) goto L_0x054e
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r3 = r4.generateLayoutParams((android.view.ViewGroup.LayoutParams) r3)
            L_0x0546:
                androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
                android.view.View r4 = r7.f1788a
                r4.setLayoutParams(r3)
                goto L_0x0550
            L_0x054e:
                androidx.recyclerview.widget.RecyclerView$m r3 = (androidx.recyclerview.widget.RecyclerView.m) r3
            L_0x0550:
                r3.f1731a = r7
                if (r2 == 0) goto L_0x0557
                if (r0 == 0) goto L_0x0557
                r5 = 1
            L_0x0557:
                r3.f1734d = r5
                return r7
            L_0x055a:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invalid item position "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r4 = "("
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = "). Item count:"
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r0 = r0.f1659e0
                int r0 = r0.b()
                r3.append(r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.recyclerview.widget.b.a(r0, r3)
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r.j(int, boolean, long):androidx.recyclerview.widget.RecyclerView$z");
        }

        public void k(z zVar) {
            (zVar.f1802o ? this.f1742b : this.f1741a).remove(zVar);
            zVar.f1801n = null;
            zVar.f1802o = false;
            zVar.d();
        }

        public void l() {
            l lVar = RecyclerView.this.f1674m;
            this.f1746f = this.f1745e + (lVar != null ? lVar.f1719j : 0);
            for (int size = this.f1743c.size() - 1; size >= 0 && this.f1743c.size() > this.f1746f; size--) {
                f(size);
            }
        }
    }

    public interface s {
        void a(z zVar);
    }

    public class t extends f {
        public t() {
        }

        public void a() {
            RecyclerView.this.i((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f1659e0.f1771f = true;
            recyclerView.X(true);
            if (!RecyclerView.this.f1658e.g()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    public static class u extends l0.a {
        public static final Parcelable.Creator<u> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public Parcelable f1750d;

        public static class a implements Parcelable.ClassLoaderCreator<u> {
            public Object createFromParcel(Parcel parcel) {
                return new u(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i2) {
                return new u[i2];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new u(parcel, classLoader);
            }
        }

        public u(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1750d = parcel.readParcelable(classLoader == null ? l.class.getClassLoader() : classLoader);
        }

        public u(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3321b, i2);
            parcel.writeParcelable(this.f1750d, 0);
        }
    }

    public static abstract class v {

        /* renamed from: a  reason: collision with root package name */
        public int f1751a = -1;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f1752b;

        /* renamed from: c  reason: collision with root package name */
        public l f1753c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1754d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1755e;

        /* renamed from: f  reason: collision with root package name */
        public View f1756f;

        /* renamed from: g  reason: collision with root package name */
        public final a f1757g = new a(0, 0);

        /* renamed from: h  reason: collision with root package name */
        public boolean f1758h;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f1759a;

            /* renamed from: b  reason: collision with root package name */
            public int f1760b;

            /* renamed from: c  reason: collision with root package name */
            public int f1761c;

            /* renamed from: d  reason: collision with root package name */
            public int f1762d = -1;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f1763e;

            /* renamed from: f  reason: collision with root package name */
            public boolean f1764f = false;

            /* renamed from: g  reason: collision with root package name */
            public int f1765g = 0;

            public a(int i2, int i3) {
                this.f1759a = i2;
                this.f1760b = i3;
                this.f1761c = Integer.MIN_VALUE;
                this.f1763e = null;
            }

            public void a(RecyclerView recyclerView) {
                int i2 = this.f1762d;
                if (i2 >= 0) {
                    this.f1762d = -1;
                    recyclerView.P(i2);
                    this.f1764f = false;
                } else if (this.f1764f) {
                    Interpolator interpolator = this.f1763e;
                    if (interpolator == null || this.f1761c >= 1) {
                        int i3 = this.f1761c;
                        if (i3 >= 1) {
                            recyclerView.f1653b0.b(this.f1759a, this.f1760b, i3, interpolator);
                            int i4 = this.f1765g + 1;
                            this.f1765g = i4;
                            if (i4 > 10) {
                                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            this.f1764f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.f1765g = 0;
                }
            }

            public void b(int i2, int i3, int i4, Interpolator interpolator) {
                this.f1759a = i2;
                this.f1760b = i3;
                this.f1761c = i4;
                this.f1763e = interpolator;
                this.f1764f = true;
            }
        }

        public interface b {
            PointF a(int i2);
        }

        public PointF a(int i2) {
            l lVar = this.f1753c;
            if (lVar instanceof b) {
                return ((b) lVar).a(i2);
            }
            StringBuilder a2 = androidx.activity.result.a.a("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            a2.append(b.class.getCanonicalName());
            Log.w("RecyclerView", a2.toString());
            return null;
        }

        public void b(int i2, int i3) {
            PointF a2;
            RecyclerView recyclerView = this.f1752b;
            int i4 = -1;
            if (this.f1751a == -1 || recyclerView == null) {
                d();
            }
            if (this.f1754d && this.f1756f == null && this.f1753c != null && (a2 = a(this.f1751a)) != null) {
                float f2 = a2.x;
                if (!(f2 == 0.0f && a2.y == 0.0f)) {
                    recyclerView.d0((int) Math.signum(f2), (int) Math.signum(a2.y), (int[]) null);
                }
            }
            boolean z2 = false;
            this.f1754d = false;
            View view = this.f1756f;
            if (view != null) {
                Objects.requireNonNull(this.f1752b);
                z K = RecyclerView.K(view);
                if (K != null) {
                    i4 = K.e();
                }
                if (i4 == this.f1751a) {
                    c(this.f1756f, recyclerView.f1659e0, this.f1757g);
                    this.f1757g.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f1756f = null;
                }
            }
            if (this.f1755e) {
                w wVar = recyclerView.f1659e0;
                a aVar = this.f1757g;
                p pVar = (p) this;
                if (pVar.f1752b.f1674m.x() == 0) {
                    pVar.d();
                } else {
                    int i5 = pVar.f1992o;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    pVar.f1992o = i6;
                    int i7 = pVar.f1993p;
                    int i8 = i7 - i3;
                    if (i7 * i8 <= 0) {
                        i8 = 0;
                    }
                    pVar.f1993p = i8;
                    if (i6 == 0 && i8 == 0) {
                        PointF a3 = pVar.a(pVar.f1751a);
                        if (a3 != null) {
                            float f3 = a3.x;
                            if (!(f3 == 0.0f && a3.y == 0.0f)) {
                                float f4 = a3.y;
                                float sqrt = (float) Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
                                float f5 = a3.x / sqrt;
                                a3.x = f5;
                                float f6 = a3.y / sqrt;
                                a3.y = f6;
                                pVar.f1988k = a3;
                                pVar.f1992o = (int) (f5 * 10000.0f);
                                pVar.f1993p = (int) (f6 * 10000.0f);
                                aVar.b((int) (((float) pVar.f1992o) * 1.2f), (int) (((float) pVar.f1993p) * 1.2f), (int) (((float) pVar.g(10000)) * 1.2f), pVar.f1986i);
                            }
                        }
                        aVar.f1762d = pVar.f1751a;
                        pVar.d();
                    }
                }
                a aVar2 = this.f1757g;
                if (aVar2.f1762d >= 0) {
                    z2 = true;
                }
                aVar2.a(recyclerView);
                if (z2 && this.f1755e) {
                    this.f1754d = true;
                    recyclerView.f1653b0.a();
                }
            }
        }

        public abstract void c(View view, w wVar, a aVar);

        public final void d() {
            if (this.f1755e) {
                this.f1755e = false;
                p pVar = (p) this;
                pVar.f1993p = 0;
                pVar.f1992o = 0;
                pVar.f1988k = null;
                this.f1752b.f1659e0.f1766a = -1;
                this.f1756f = null;
                this.f1751a = -1;
                this.f1754d = false;
                l lVar = this.f1753c;
                if (lVar.f1714e == this) {
                    lVar.f1714e = null;
                }
                this.f1753c = null;
                this.f1752b = null;
            }
        }
    }

    public static class w {

        /* renamed from: a  reason: collision with root package name */
        public int f1766a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f1767b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1768c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1769d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f1770e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1771f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1772g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1773h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1774i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f1775j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f1776k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f1777l;

        /* renamed from: m  reason: collision with root package name */
        public long f1778m;

        /* renamed from: n  reason: collision with root package name */
        public int f1779n;

        public void a(int i2) {
            if ((this.f1769d & i2) == 0) {
                StringBuilder a2 = androidx.activity.result.a.a("Layout state should be one of ");
                a2.append(Integer.toBinaryString(i2));
                a2.append(" but it is ");
                a2.append(Integer.toBinaryString(this.f1769d));
                throw new IllegalStateException(a2.toString());
            }
        }

        public int b() {
            return this.f1772g ? this.f1767b - this.f1768c : this.f1770e;
        }

        public String toString() {
            StringBuilder a2 = androidx.activity.result.a.a("State{mTargetPosition=");
            a2.append(this.f1766a);
            a2.append(", mData=");
            a2.append((Object) null);
            a2.append(", mItemCount=");
            a2.append(this.f1770e);
            a2.append(", mIsMeasuring=");
            a2.append(this.f1774i);
            a2.append(", mPreviousLayoutItemCount=");
            a2.append(this.f1767b);
            a2.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            a2.append(this.f1768c);
            a2.append(", mStructureChanged=");
            a2.append(this.f1771f);
            a2.append(", mInPreLayout=");
            a2.append(this.f1772g);
            a2.append(", mRunSimpleAnimations=");
            a2.append(this.f1775j);
            a2.append(", mRunPredictiveAnimations=");
            a2.append(this.f1776k);
            a2.append('}');
            return a2.toString();
        }
    }

    public static abstract class x {
    }

    public class y implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public int f1780b;

        /* renamed from: c  reason: collision with root package name */
        public int f1781c;

        /* renamed from: d  reason: collision with root package name */
        public OverScroller f1782d;

        /* renamed from: e  reason: collision with root package name */
        public Interpolator f1783e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1784f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1785g = false;

        public y() {
            Interpolator interpolator = RecyclerView.f1650z0;
            this.f1783e = interpolator;
            this.f1782d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void a() {
            if (this.f1784f) {
                this.f1785g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
            u.d.m(recyclerView, this);
        }

        public void b(int i2, int i3, int i4, Interpolator interpolator) {
            int i5;
            if (i4 == Integer.MIN_VALUE) {
                int abs = Math.abs(i2);
                int abs2 = Math.abs(i3);
                boolean z2 = abs > abs2;
                int sqrt = (int) Math.sqrt((double) 0);
                int sqrt2 = (int) Math.sqrt((double) ((i3 * i3) + (i2 * i2)));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
                int i6 = width / 2;
                float f2 = (float) width;
                float f3 = (float) i6;
                float sin = (((float) Math.sin((double) ((Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2) - 0.5f) * 0.47123894f))) * f3) + f3;
                if (sqrt > 0) {
                    i5 = Math.round(Math.abs(sin / ((float) sqrt)) * 1000.0f) * 4;
                } else {
                    if (!z2) {
                        abs = abs2;
                    }
                    i5 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
                }
                i4 = Math.min(i5, 2000);
            }
            int i7 = i4;
            if (interpolator == null) {
                interpolator = RecyclerView.f1650z0;
            }
            if (this.f1783e != interpolator) {
                this.f1783e = interpolator;
                this.f1782d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1781c = 0;
            this.f1780b = 0;
            RecyclerView.this.setScrollState(2);
            this.f1782d.startScroll(0, 0, i2, i3, i7);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1782d.computeScrollOffset();
            }
            a();
        }

        public void c() {
            RecyclerView.this.removeCallbacks(this);
            this.f1782d.abortAnimation();
        }

        public void run() {
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f1674m == null) {
                c();
                return;
            }
            this.f1785g = false;
            this.f1784f = true;
            recyclerView.n();
            OverScroller overScroller = this.f1782d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f1780b;
                int i5 = currY - this.f1781c;
                this.f1780b = currX;
                this.f1781c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f1685r0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.t(i4, i5, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.f1685r0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f1672l != null) {
                    int[] iArr3 = recyclerView3.f1685r0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.d0(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f1685r0;
                    i2 = iArr4[0];
                    i3 = iArr4[1];
                    i4 -= i2;
                    i5 -= i3;
                    v vVar = recyclerView4.f1674m.f1714e;
                    if (vVar != null && !vVar.f1754d && vVar.f1755e) {
                        int b2 = recyclerView4.f1659e0.b();
                        if (b2 == 0) {
                            vVar.d();
                        } else {
                            if (vVar.f1751a >= b2) {
                                vVar.f1751a = b2 - 1;
                            }
                            vVar.b(i2, i3);
                        }
                    }
                } else {
                    i3 = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.f1678o.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f1685r0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.u(i2, i3, i4, i5, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f1685r0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (!(i2 == 0 && i3 == 0)) {
                    recyclerView6.v(i2, i3);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                v vVar2 = recyclerView7.f1674m.f1714e;
                if ((vVar2 != null && vVar2.f1754d) || !z2) {
                    a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    n nVar = recyclerView8.f1655c0;
                    if (nVar != null) {
                        nVar.a(recyclerView8, i2, i3);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i8 = i6 < 0 ? -currVelocity : i6 > 0 ? currVelocity : 0;
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView9);
                        if (i8 < 0) {
                            recyclerView9.x();
                            if (recyclerView9.F.isFinished()) {
                                recyclerView9.F.onAbsorb(-i8);
                            }
                        } else if (i8 > 0) {
                            recyclerView9.y();
                            if (recyclerView9.H.isFinished()) {
                                recyclerView9.H.onAbsorb(i8);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.z();
                            if (recyclerView9.G.isFinished()) {
                                recyclerView9.G.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.w();
                            if (recyclerView9.I.isFinished()) {
                                recyclerView9.I.onAbsorb(currVelocity);
                            }
                        }
                        if (!(i8 == 0 && currVelocity == 0)) {
                            WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
                            u.d.k(recyclerView9);
                        }
                    }
                    if (RecyclerView.f1648x0) {
                        n.b bVar = RecyclerView.this.f1657d0;
                        int[] iArr7 = bVar.f1970c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f1971d = 0;
                    }
                }
            }
            v vVar3 = RecyclerView.this.f1674m.f1714e;
            if (vVar3 != null && vVar3.f1754d) {
                vVar3.b(0, 0);
            }
            this.f1784f = false;
            if (this.f1785g) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                WeakHashMap<View, g0.x> weakHashMap2 = g0.u.f3063a;
                u.d.m(recyclerView10, this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.k0(1);
        }
    }

    public static abstract class z {

        /* renamed from: s  reason: collision with root package name */
        public static final List<Object> f1787s = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f1788a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f1789b;

        /* renamed from: c  reason: collision with root package name */
        public int f1790c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f1791d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f1792e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1793f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1794g = -1;

        /* renamed from: h  reason: collision with root package name */
        public z f1795h = null;

        /* renamed from: i  reason: collision with root package name */
        public z f1796i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f1797j;

        /* renamed from: k  reason: collision with root package name */
        public List<Object> f1798k = null;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f1799l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f1800m = 0;

        /* renamed from: n  reason: collision with root package name */
        public r f1801n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1802o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f1803p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f1804q = -1;

        /* renamed from: r  reason: collision with root package name */
        public RecyclerView f1805r;

        public z(View view) {
            if (view != null) {
                this.f1788a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f1797j) == 0) {
                if (this.f1798k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f1798k = arrayList;
                    this.f1799l = Collections.unmodifiableList(arrayList);
                }
                this.f1798k.add(obj);
            }
        }

        public void b(int i2) {
            this.f1797j = i2 | this.f1797j;
        }

        public void c() {
            this.f1791d = -1;
            this.f1794g = -1;
        }

        public void d() {
            this.f1797j &= -33;
        }

        public final int e() {
            int i2 = this.f1794g;
            return i2 == -1 ? this.f1790c : i2;
        }

        public List<Object> f() {
            if ((this.f1797j & 1024) != 0) {
                return f1787s;
            }
            List<Object> list = this.f1798k;
            return (list == null || list.size() == 0) ? f1787s : this.f1799l;
        }

        public boolean g(int i2) {
            return (i2 & this.f1797j) != 0;
        }

        public boolean h() {
            return (this.f1788a.getParent() == null || this.f1788a.getParent() == this.f1805r) ? false : true;
        }

        public boolean i() {
            return (this.f1797j & 1) != 0;
        }

        public boolean j() {
            return (this.f1797j & 4) != 0;
        }

        public final boolean k() {
            if ((this.f1797j & 16) == 0) {
                View view = this.f1788a;
                WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
                if (!u.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public boolean l() {
            return (this.f1797j & 8) != 0;
        }

        public boolean m() {
            return this.f1801n != null;
        }

        public boolean n() {
            return (this.f1797j & 256) != 0;
        }

        public boolean o() {
            return (this.f1797j & 2) != 0;
        }

        public void p(int i2, boolean z2) {
            if (this.f1791d == -1) {
                this.f1791d = this.f1790c;
            }
            if (this.f1794g == -1) {
                this.f1794g = this.f1790c;
            }
            if (z2) {
                this.f1794g += i2;
            }
            this.f1790c += i2;
            if (this.f1788a.getLayoutParams() != null) {
                ((m) this.f1788a.getLayoutParams()).f1733c = true;
            }
        }

        public void q() {
            this.f1797j = 0;
            this.f1790c = -1;
            this.f1791d = -1;
            this.f1792e = -1;
            this.f1794g = -1;
            this.f1800m = 0;
            this.f1795h = null;
            this.f1796i = null;
            List<Object> list = this.f1798k;
            if (list != null) {
                list.clear();
            }
            this.f1797j &= -1025;
            this.f1803p = 0;
            this.f1804q = -1;
            RecyclerView.k(this);
        }

        public void r(int i2, int i3) {
            this.f1797j = (i2 & i3) | (this.f1797j & (~i3));
        }

        public final void s(boolean z2) {
            int i2;
            int i3 = this.f1800m;
            int i4 = z2 ? i3 - 1 : i3 + 1;
            this.f1800m = i4;
            if (i4 < 0) {
                this.f1800m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z2 && i4 == 1) {
                i2 = this.f1797j | 16;
            } else if (z2 && i4 == 0) {
                i2 = this.f1797j & -17;
            } else {
                return;
            }
            this.f1797j = i2;
        }

        public boolean t() {
            return (this.f1797j & 128) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1790c + " id=" + this.f1792e + ", oldPos=" + this.f1791d + ", pLpos:" + this.f1794g);
            if (m()) {
                sb.append(" scrap ");
                sb.append(this.f1802o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (j()) {
                sb.append(" invalid");
            }
            if (!i()) {
                sb.append(" unbound");
            }
            boolean z2 = false;
            if ((this.f1797j & 2) != 0) {
                sb.append(" update");
            }
            if (l()) {
                sb.append(" removed");
            }
            if (t()) {
                sb.append(" ignored");
            }
            if (n()) {
                sb.append(" tmpDetached");
            }
            if (!k()) {
                StringBuilder a2 = androidx.activity.result.a.a(" not recyclable(");
                a2.append(this.f1800m);
                a2.append(")");
                sb.append(a2.toString());
            }
            if ((this.f1797j & 512) != 0 || j()) {
                z2 = true;
            }
            if (z2) {
                sb.append(" undefined adapter position");
            }
            if (this.f1788a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public boolean u() {
            return (this.f1797j & 32) != 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            f1646v0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            f1647w0 = r1
            f1648x0 = r0
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            f1649y0 = r1
            androidx.recyclerview.widget.RecyclerView$b r0 = new androidx.recyclerview.widget.RecyclerView$b
            r0.<init>()
            f1650z0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        int i3;
        char c2;
        StringBuilder sb;
        Object[] objArr;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i4 = i2;
        this.f1652b = new t();
        this.f1654c = new r();
        this.f1662g = new d0();
        this.f1666i = new Rect();
        this.f1668j = new Rect();
        this.f1670k = new RectF();
        this.f1678o = new ArrayList<>();
        this.f1680p = new ArrayList<>();
        this.f1690u = 0;
        this.A = false;
        this.B = false;
        this.C = 0;
        this.D = 0;
        this.E = new h();
        this.J = new l();
        this.K = 0;
        this.L = -1;
        this.V = Float.MIN_VALUE;
        this.W = Float.MIN_VALUE;
        this.f1651a0 = true;
        this.f1653b0 = new y();
        this.f1657d0 = f1648x0 ? new n.b() : null;
        this.f1659e0 = new w();
        this.f1665h0 = false;
        this.f1667i0 = false;
        this.f1669j0 = new j();
        this.f1671k0 = false;
        this.f1677n0 = new int[2];
        this.f1681p0 = new int[2];
        this.f1683q0 = new int[2];
        this.f1685r0 = new int[2];
        this.f1687s0 = new ArrayList();
        this.f1689t0 = new a();
        this.f1691u0 = new c();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.R = viewConfiguration.getScaledTouchSlop();
        Method method = g0.w.f3084a;
        int i5 = Build.VERSION.SDK_INT;
        this.V = i5 >= 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : g0.w.a(viewConfiguration, context2);
        this.W = i5 >= 26 ? viewConfiguration.getScaledVerticalScrollFactor() : g0.w.a(viewConfiguration, context2);
        this.T = viewConfiguration.getScaledMinimumFlingVelocity();
        this.U = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.J.f1701a = this.f1669j0;
        this.f1658e = new a(new x(this));
        this.f1660f = new c(new w(this));
        WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
        if ((i5 >= 26 ? u.k.b(this) : 0) == 0 && i5 >= 26) {
            u.k.l(this, 8);
        }
        if (u.d.c(this) == 0) {
            u.d.s(this, 1);
        }
        this.f1696z = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new y(this));
        int[] iArr = s0.a.f3877a;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i4, 0);
        if (i5 >= 29) {
            i3 = 8;
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        } else {
            i3 = 8;
        }
        String string = obtainStyledAttributes.getString(i3);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1664h = obtainStyledAttributes.getBoolean(1, true);
        if (obtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(6);
            Drawable drawable = obtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(b.a(this, androidx.activity.result.a.a("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c2 = 2;
            new m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
        } else {
            c2 = 2;
        }
        obtainStyledAttributes.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(trim);
                    trim = sb.toString();
                } else if (!trim.contains(".")) {
                    sb = new StringBuilder();
                    sb.append(RecyclerView.class.getPackage().getName());
                    sb.append('.');
                    sb.append(trim);
                    trim = sb.toString();
                }
                String str = trim;
                try {
                    Class<? extends U> asSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(l.class);
                    try {
                        constructor = asSubclass.getConstructor(f1649y0);
                        Object[] objArr2 = new Object[4];
                        objArr2[0] = context2;
                        objArr2[1] = attributeSet2;
                        objArr2[c2] = Integer.valueOf(i2);
                        objArr2[3] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e2) {
                        noSuchMethodException = e2;
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((l) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e3) {
                    e3.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e8);
                }
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        int[] iArr2 = f1646v0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i4, 0);
        if (i6 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
        }
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    public static RecyclerView F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView F2 = F(viewGroup.getChildAt(i2));
            if (F2 != null) {
                return F2;
            }
        }
        return null;
    }

    public static z K(View view) {
        if (view == null) {
            return null;
        }
        return ((m) view.getLayoutParams()).f1731a;
    }

    private g0.i getScrollingChildHelper() {
        if (this.f1679o0 == null) {
            this.f1679o0 = new g0.i(this);
        }
        return this.f1679o0;
    }

    public static void k(z zVar) {
        WeakReference<RecyclerView> weakReference = zVar.f1789b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        zVar.f1789b = null;
                        return;
                    } else if (view != zVar.f1788a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public String A() {
        StringBuilder a2 = androidx.activity.result.a.a(" ");
        a2.append(super.toString());
        a2.append(", adapter:");
        a2.append(this.f1672l);
        a2.append(", layout:");
        a2.append(this.f1674m);
        a2.append(", context:");
        a2.append(getContext());
        return a2.toString();
    }

    public final void B(w wVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f1653b0.f1782d;
            overScroller.getFinalX();
            overScroller.getCurrX();
            Objects.requireNonNull(wVar);
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        Objects.requireNonNull(wVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View C(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C(android.view.View):android.view.View");
    }

    public final boolean D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f1680p.size();
        int i2 = 0;
        while (i2 < size) {
            o oVar = this.f1680p.get(i2);
            if (!oVar.b(this, motionEvent) || action == 3) {
                i2++;
            } else {
                this.f1682q = oVar;
                return true;
            }
        }
        return false;
    }

    public final void E(int[] iArr) {
        int e2 = this.f1660f.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < e2; i4++) {
            z K2 = K(this.f1660f.d(i4));
            if (!K2.t()) {
                int e3 = K2.e();
                if (e3 < i2) {
                    i2 = e3;
                }
                if (e3 > i3) {
                    i3 = e3;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public z G(int i2) {
        z zVar = null;
        if (this.A) {
            return null;
        }
        int h2 = this.f1660f.h();
        for (int i3 = 0; i3 < h2; i3++) {
            z K2 = K(this.f1660f.g(i3));
            if (K2 != null && !K2.l() && H(K2) == i2) {
                if (!this.f1660f.k(K2.f1788a)) {
                    return K2;
                }
                zVar = K2;
            }
        }
        return zVar;
    }

    public int H(z zVar) {
        if (!zVar.g(524) && zVar.i()) {
            a aVar = this.f1658e;
            int i2 = zVar.f1790c;
            int size = aVar.f1849b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a.b bVar = aVar.f1849b.get(i3);
                int i4 = bVar.f1853a;
                if (i4 != 1) {
                    if (i4 == 2) {
                        int i5 = bVar.f1854b;
                        if (i5 <= i2) {
                            int i6 = bVar.f1856d;
                            if (i5 + i6 <= i2) {
                                i2 -= i6;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 == 8) {
                        int i7 = bVar.f1854b;
                        if (i7 == i2) {
                            i2 = bVar.f1856d;
                        } else {
                            if (i7 < i2) {
                                i2--;
                            }
                            if (bVar.f1856d <= i2) {
                                i2++;
                            }
                        }
                    }
                } else if (bVar.f1854b <= i2) {
                    i2 += bVar.f1856d;
                }
            }
            return i2;
        }
        return -1;
    }

    public long I(z zVar) {
        if (this.f1672l.f1700b) {
            return zVar.f1792e;
        }
        return (long) zVar.f1790c;
    }

    public z J(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return K(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public Rect L(View view) {
        m mVar = (m) view.getLayoutParams();
        if (!mVar.f1733c) {
            return mVar.f1732b;
        }
        if (this.f1659e0.f1772g && (mVar.b() || mVar.f1731a.j())) {
            return mVar.f1732b;
        }
        Rect rect = mVar.f1732b;
        rect.set(0, 0, 0, 0);
        int size = this.f1678o.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1666i.set(0, 0, 0, 0);
            Rect rect2 = this.f1666i;
            Objects.requireNonNull(this.f1678o.get(i2));
            ((m) view.getLayoutParams()).a();
            rect2.set(0, 0, 0, 0);
            int i3 = rect.left;
            Rect rect3 = this.f1666i;
            rect.left = i3 + rect3.left;
            rect.top += rect3.top;
            rect.right += rect3.right;
            rect.bottom += rect3.bottom;
        }
        mVar.f1733c = false;
        return rect;
    }

    public boolean M() {
        return !this.f1688t || this.A || this.f1658e.g();
    }

    public void N() {
        this.I = null;
        this.G = null;
        this.H = null;
        this.F = null;
    }

    public boolean O() {
        return this.C > 0;
    }

    public void P(int i2) {
        if (this.f1674m != null) {
            setScrollState(2);
            this.f1674m.w0(i2);
            awakenScrollBars();
        }
    }

    public void Q() {
        int h2 = this.f1660f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((m) this.f1660f.g(i2).getLayoutParams()).f1733c = true;
        }
        r rVar = this.f1654c;
        int size = rVar.f1743c.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = (m) rVar.f1743c.get(i3).f1788a.getLayoutParams();
            if (mVar != null) {
                mVar.f1733c = true;
            }
        }
    }

    public void R(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int h2 = this.f1660f.h();
        for (int i5 = 0; i5 < h2; i5++) {
            z K2 = K(this.f1660f.g(i5));
            if (K2 != null && !K2.t()) {
                int i6 = K2.f1790c;
                if (i6 >= i4) {
                    K2.p(-i3, z2);
                } else if (i6 >= i2) {
                    K2.b(8);
                    K2.p(-i3, z2);
                    K2.f1790c = i2 - 1;
                }
                this.f1659e0.f1771f = true;
            }
        }
        r rVar = this.f1654c;
        int size = rVar.f1743c.size();
        while (true) {
            size--;
            if (size >= 0) {
                z zVar = rVar.f1743c.get(size);
                if (zVar != null) {
                    int i7 = zVar.f1790c;
                    if (i7 >= i4) {
                        zVar.p(-i3, z2);
                    } else if (i7 >= i2) {
                        zVar.b(8);
                        rVar.f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void S() {
        this.C++;
    }

    public void T(boolean z2) {
        int i2;
        boolean z3 = true;
        int i3 = this.C - 1;
        this.C = i3;
        if (i3 < 1) {
            this.C = 0;
            if (z2) {
                int i4 = this.f1695y;
                this.f1695y = 0;
                if (i4 != 0) {
                    AccessibilityManager accessibilityManager = this.f1696z;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z3 = false;
                    }
                    if (z3) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        obtain.setContentChangeTypes(i4);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.f1687s0.size() - 1; size >= 0; size--) {
                    z zVar = this.f1687s0.get(size);
                    if (zVar.f1788a.getParent() == this && !zVar.t() && (i2 = zVar.f1804q) != -1) {
                        View view = zVar.f1788a;
                        WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
                        u.d.s(view, i2);
                        zVar.f1804q = -1;
                    }
                }
                this.f1687s0.clear();
            }
        }
    }

    public final void U(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.L) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.L = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.P = x2;
            this.N = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.Q = y2;
            this.O = y2;
        }
    }

    public void V() {
        if (!this.f1671k0 && this.f1684r) {
            Runnable runnable = this.f1689t0;
            WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
            u.d.m(this, runnable);
            this.f1671k0 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007d, code lost:
        if ((r6.J != null && r6.f1674m.I0()) != false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W() {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.a r0 = r6.f1658e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f1849b
            r0.l(r1)
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r1 = r0.f1850c
            r0.l(r1)
            boolean r0 = r6.B
            if (r0 == 0) goto L_0x0019
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1674m
            r0.f0(r6)
        L_0x0019:
            androidx.recyclerview.widget.RecyclerView$i r0 = r6.J
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0029
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1674m
            boolean r0 = r0.I0()
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x0032
            androidx.recyclerview.widget.a r0 = r6.f1658e
            r0.j()
            goto L_0x0037
        L_0x0032:
            androidx.recyclerview.widget.a r0 = r6.f1658e
            r0.c()
        L_0x0037:
            boolean r0 = r6.f1665h0
            if (r0 != 0) goto L_0x0042
            boolean r0 = r6.f1667i0
            if (r0 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r0 = 0
            goto L_0x0043
        L_0x0042:
            r0 = 1
        L_0x0043:
            androidx.recyclerview.widget.RecyclerView$w r3 = r6.f1659e0
            boolean r4 = r6.f1688t
            if (r4 == 0) goto L_0x0063
            androidx.recyclerview.widget.RecyclerView$i r4 = r6.J
            if (r4 == 0) goto L_0x0063
            boolean r4 = r6.A
            if (r4 != 0) goto L_0x0059
            if (r0 != 0) goto L_0x0059
            androidx.recyclerview.widget.RecyclerView$l r5 = r6.f1674m
            boolean r5 = r5.f1715f
            if (r5 == 0) goto L_0x0063
        L_0x0059:
            if (r4 == 0) goto L_0x0061
            androidx.recyclerview.widget.RecyclerView$d r4 = r6.f1672l
            boolean r4 = r4.f1700b
            if (r4 == 0) goto L_0x0063
        L_0x0061:
            r4 = 1
            goto L_0x0064
        L_0x0063:
            r4 = 0
        L_0x0064:
            r3.f1775j = r4
            if (r4 == 0) goto L_0x0080
            if (r0 == 0) goto L_0x0080
            boolean r0 = r6.A
            if (r0 != 0) goto L_0x0080
            androidx.recyclerview.widget.RecyclerView$i r0 = r6.J
            if (r0 == 0) goto L_0x007c
            androidx.recyclerview.widget.RecyclerView$l r0 = r6.f1674m
            boolean r0 = r0.I0()
            if (r0 == 0) goto L_0x007c
            r0 = 1
            goto L_0x007d
        L_0x007c:
            r0 = 0
        L_0x007d:
            if (r0 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            r3.f1776k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.W():void");
    }

    public void X(boolean z2) {
        this.B = z2 | this.B;
        this.A = true;
        int h2 = this.f1660f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            z K2 = K(this.f1660f.g(i2));
            if (K2 != null && !K2.t()) {
                K2.b(6);
            }
        }
        Q();
        r rVar = this.f1654c;
        int size = rVar.f1743c.size();
        for (int i3 = 0; i3 < size; i3++) {
            z zVar = rVar.f1743c.get(i3);
            if (zVar != null) {
                zVar.b(6);
                zVar.a((Object) null);
            }
        }
        d dVar = RecyclerView.this.f1672l;
        if (dVar == null || !dVar.f1700b) {
            rVar.e();
        }
    }

    public void Y(z zVar, i.c cVar) {
        zVar.r(0, 8192);
        if (this.f1659e0.f1773h && zVar.o() && !zVar.l() && !zVar.t()) {
            this.f1662g.f1877b.g(I(zVar), zVar);
        }
        this.f1662g.c(zVar, cVar);
    }

    public void Z() {
        i iVar = this.J;
        if (iVar != null) {
            iVar.f();
        }
        l lVar = this.f1674m;
        if (lVar != null) {
            lVar.o0(this.f1654c);
            this.f1674m.p0(this.f1654c);
        }
        this.f1654c.b();
    }

    public final void a0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f1666i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof m) {
            m mVar = (m) layoutParams;
            if (!mVar.f1733c) {
                Rect rect = mVar.f1732b;
                Rect rect2 = this.f1666i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f1666i);
            offsetRectIntoDescendantCoords(view, this.f1666i);
        }
        this.f1674m.t0(this, view, this.f1666i, !this.f1688t, view2 == null);
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        l lVar = this.f1674m;
        if (lVar != null) {
            Objects.requireNonNull(lVar);
        }
        super.addFocusables(arrayList, i2, i3);
    }

    public final void b0() {
        VelocityTracker velocityTracker = this.M;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z2 = false;
        k0(0);
        EdgeEffect edgeEffect = this.F;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.G;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.G.isFinished();
        }
        EdgeEffect edgeEffect3 = this.H;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.H.isFinished();
        }
        EdgeEffect edgeEffect4 = this.I;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.I.isFinished();
        }
        if (z2) {
            WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
            u.d.k(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c0(int r18, int r19, android.view.MotionEvent r20) {
        /*
            r17 = this;
            r8 = r17
            r9 = r18
            r10 = r19
            r17.n()
            androidx.recyclerview.widget.RecyclerView$d r0 = r8.f1672l
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x0028
            int[] r0 = r8.f1685r0
            r0[r12] = r12
            r0[r11] = r12
            r8.d0(r9, r10, r0)
            int[] r0 = r8.f1685r0
            r1 = r0[r12]
            r0 = r0[r11]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r13 = r0
            r14 = r1
            r15 = r2
            r16 = r3
            goto L_0x002d
        L_0x0028:
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x002d:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$k> r0 = r8.f1678o
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r17.invalidate()
        L_0x0038:
            int[] r7 = r8.f1685r0
            r7[r12] = r12
            r7[r11] = r12
            int[] r5 = r8.f1681p0
            r6 = 0
            r0 = r17
            r1 = r14
            r2 = r13
            r3 = r15
            r4 = r16
            r0.u(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.f1685r0
            r1 = r0[r12]
            int r15 = r15 - r1
            r1 = r0[r11]
            int r1 = r16 - r1
            r2 = r0[r12]
            if (r2 != 0) goto L_0x005f
            r0 = r0[r11]
            if (r0 == 0) goto L_0x005d
            goto L_0x005f
        L_0x005d:
            r0 = 0
            goto L_0x0060
        L_0x005f:
            r0 = 1
        L_0x0060:
            int r2 = r8.P
            int[] r3 = r8.f1681p0
            r4 = r3[r12]
            int r2 = r2 - r4
            r8.P = r2
            int r2 = r8.Q
            r4 = r3[r11]
            int r2 = r2 - r4
            r8.Q = r2
            int[] r2 = r8.f1683q0
            r4 = r2[r12]
            r5 = r3[r12]
            int r4 = r4 + r5
            r2[r12] = r4
            r4 = r2[r11]
            r3 = r3[r11]
            int r4 = r4 + r3
            r2[r11] = r4
            int r2 = r17.getOverScrollMode()
            r3 = 2
            if (r2 == r3) goto L_0x0120
            if (r20 == 0) goto L_0x011d
            r2 = 8194(0x2002, float:1.1482E-41)
            int r3 = r20.getSource()
            r3 = r3 & r2
            if (r3 != r2) goto L_0x0094
            r2 = 1
            goto L_0x0095
        L_0x0094:
            r2 = 0
        L_0x0095:
            if (r2 != 0) goto L_0x011d
            float r2 = r20.getX()
            float r3 = (float) r15
            float r4 = r20.getY()
            float r1 = (float) r1
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00bd
            r17.x()
            android.widget.EdgeEffect r7 = r8.F
            float r15 = -r3
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r15 = r15 / r11
            int r11 = r17.getHeight()
            float r11 = (float) r11
            float r4 = r4 / r11
            float r4 = r5 - r4
            goto L_0x00d3
        L_0x00bd:
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d8
            r17.y()
            android.widget.EdgeEffect r7 = r8.H
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r15 = r3 / r11
            int r11 = r17.getHeight()
            float r11 = (float) r11
            float r4 = r4 / r11
        L_0x00d3:
            r7.onPull(r15, r4)
            r4 = 1
            goto L_0x00d9
        L_0x00d8:
            r4 = 0
        L_0x00d9:
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00f3
            r17.z()
            android.widget.EdgeEffect r4 = r8.G
            float r5 = -r1
            int r7 = r17.getHeight()
            float r7 = (float) r7
            float r5 = r5 / r7
            int r7 = r17.getWidth()
            float r7 = (float) r7
            float r2 = r2 / r7
            r4.onPull(r5, r2)
            goto L_0x010d
        L_0x00f3:
            int r7 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x010e
            r17.w()
            android.widget.EdgeEffect r4 = r8.I
            int r7 = r17.getHeight()
            float r7 = (float) r7
            float r7 = r1 / r7
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r2 = r2 / r11
            float r5 = r5 - r2
            r4.onPull(r7, r5)
        L_0x010d:
            r4 = 1
        L_0x010e:
            if (r4 != 0) goto L_0x0118
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0118
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x011d
        L_0x0118:
            java.util.WeakHashMap<android.view.View, g0.x> r1 = g0.u.f3063a
            g0.u.d.k(r17)
        L_0x011d:
            r17.m(r18, r19)
        L_0x0120:
            if (r14 != 0) goto L_0x0124
            if (r13 == 0) goto L_0x0127
        L_0x0124:
            r8.v(r14, r13)
        L_0x0127:
            boolean r1 = r17.awakenScrollBars()
            if (r1 != 0) goto L_0x0130
            r17.invalidate()
        L_0x0130:
            if (r0 != 0) goto L_0x0139
            if (r14 != 0) goto L_0x0139
            if (r13 == 0) goto L_0x0137
            goto L_0x0139
        L_0x0137:
            r11 = 0
            goto L_0x013a
        L_0x0139:
            r11 = 1
        L_0x013a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.c0(int, int, android.view.MotionEvent):boolean");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof m) && this.f1674m.g((m) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        l lVar = this.f1674m;
        if (lVar != null && lVar.e()) {
            return this.f1674m.k(this.f1659e0);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        l lVar = this.f1674m;
        if (lVar != null && lVar.e()) {
            return this.f1674m.l(this.f1659e0);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        l lVar = this.f1674m;
        if (lVar != null && lVar.e()) {
            return this.f1674m.m(this.f1659e0);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        l lVar = this.f1674m;
        if (lVar != null && lVar.f()) {
            return this.f1674m.n(this.f1659e0);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        l lVar = this.f1674m;
        if (lVar != null && lVar.f()) {
            return this.f1674m.o(this.f1659e0);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        l lVar = this.f1674m;
        if (lVar != null && lVar.f()) {
            return this.f1674m.p(this.f1659e0);
        }
        return 0;
    }

    public void d0(int i2, int i3, int[] iArr) {
        z zVar;
        h0();
        S();
        int i4 = c0.c.f2067a;
        Trace.beginSection("RV Scroll");
        B(this.f1659e0);
        int v02 = i2 != 0 ? this.f1674m.v0(i2, this.f1654c, this.f1659e0) : 0;
        int x02 = i3 != 0 ? this.f1674m.x0(i3, this.f1654c, this.f1659e0) : 0;
        Trace.endSection();
        int e2 = this.f1660f.e();
        for (int i5 = 0; i5 < e2; i5++) {
            View d2 = this.f1660f.d(i5);
            z J2 = J(d2);
            if (!(J2 == null || (zVar = J2.f1796i) == null)) {
                View view = zVar.f1788a;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        T(true);
        j0(false);
        if (iArr != null) {
            iArr[0] = v02;
            iArr[1] = x02;
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        float f2;
        float f3;
        super.draw(canvas);
        int size = this.f1678o.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.f1678o.get(i2).e(canvas, this, this.f1659e0);
        }
        EdgeEffect edgeEffect = this.F;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f1664h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.F;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f1664h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.G;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.H;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1664h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.H;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.I;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1664h) {
                f3 = (float) (getPaddingRight() + (-getWidth()));
                f2 = (float) (getPaddingBottom() + (-getHeight()));
            } else {
                f3 = (float) (-getWidth());
                f2 = (float) (-getHeight());
            }
            canvas.translate(f3, f2);
            EdgeEffect edgeEffect8 = this.I;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.J == null || this.f1678o.size() <= 0 || !this.J.g()) {
            z4 = z2;
        }
        if (z4) {
            WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
            u.d.k(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void e0(int i2) {
        if (!this.f1693w) {
            l0();
            l lVar = this.f1674m;
            if (lVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            lVar.w0(i2);
            awakenScrollBars();
        }
    }

    public final void f(z zVar) {
        View view = zVar.f1788a;
        boolean z2 = view.getParent() == this;
        this.f1654c.k(J(view));
        if (zVar.n()) {
            this.f1660f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        c cVar = this.f1660f;
        if (!z2) {
            cVar.a(view, -1, true);
            return;
        }
        int indexOfChild = ((w) cVar.f1862a).f2001a.indexOfChild(view);
        if (indexOfChild >= 0) {
            cVar.f1863b.h(indexOfChild);
            cVar.i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public boolean f0(z zVar, int i2) {
        if (O()) {
            zVar.f1804q = i2;
            this.f1687s0.add(zVar);
            return false;
        }
        View view = zVar.f1788a;
        WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
        u.d.s(view, i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0165, code lost:
        if (r3 > 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x017f, code lost:
        if (r6 > 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0182, code lost:
        if (r3 < 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0185, code lost:
        if (r6 < 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x018e, code lost:
        if ((r6 * r1) < 0) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0197, code lost:
        if ((r6 * r1) > 0) goto L_0x019b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1674m
            java.util.Objects.requireNonNull(r0)
            androidx.recyclerview.widget.RecyclerView$d r0 = r13.f1672l
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1674m
            if (r0 == 0) goto L_0x001b
            boolean r0 = r13.O()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r13.f1693w
            if (r0 != 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 33
            r5 = 17
            r6 = 0
            r7 = 2
            if (r0 == 0) goto L_0x008f
            if (r15 == r7) goto L_0x002c
            if (r15 != r2) goto L_0x008f
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1674m
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0043
            if (r15 != r7) goto L_0x0039
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003b
        L_0x0039:
            r0 = 33
        L_0x003b:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 != 0) goto L_0x006f
            androidx.recyclerview.widget.RecyclerView$l r8 = r13.f1674m
            boolean r8 = r8.e()
            if (r8 == 0) goto L_0x006f
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1674m
            int r0 = r0.J()
            if (r0 != r2) goto L_0x0058
            r0 = 1
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r15 != r7) goto L_0x005d
            r8 = 1
            goto L_0x005e
        L_0x005d:
            r8 = 0
        L_0x005e:
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0064
            r0 = 66
            goto L_0x0066
        L_0x0064:
            r0 = 17
        L_0x0066:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x006e
            r0 = 1
            goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            if (r0 == 0) goto L_0x008a
            r13.n()
            android.view.View r0 = r13.C(r14)
            if (r0 != 0) goto L_0x007b
            return r6
        L_0x007b:
            r13.h0()
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1674m
            androidx.recyclerview.widget.RecyclerView$r r8 = r13.f1654c
            androidx.recyclerview.widget.RecyclerView$w r9 = r13.f1659e0
            r0.a0(r14, r15, r8, r9)
            r13.j0(r1)
        L_0x008a:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00b3
        L_0x008f:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00b2
            if (r0 == 0) goto L_0x00b2
            r13.n()
            android.view.View r0 = r13.C(r14)
            if (r0 != 0) goto L_0x00a1
            return r6
        L_0x00a1:
            r13.h0()
            androidx.recyclerview.widget.RecyclerView$l r0 = r13.f1674m
            androidx.recyclerview.widget.RecyclerView$r r3 = r13.f1654c
            androidx.recyclerview.widget.RecyclerView$w r8 = r13.f1659e0
            android.view.View r0 = r0.a0(r14, r15, r3, r8)
            r13.j0(r1)
            goto L_0x00b3
        L_0x00b2:
            r0 = r3
        L_0x00b3:
            if (r0 == 0) goto L_0x00ca
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00ca
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00c6
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00c6:
            r13.a0(r0, r6)
            return r14
        L_0x00ca:
            if (r0 == 0) goto L_0x019b
            if (r0 != r13) goto L_0x00d0
            goto L_0x019b
        L_0x00d0:
            android.view.View r3 = r13.C(r0)
            if (r3 != 0) goto L_0x00d8
            goto L_0x019c
        L_0x00d8:
            if (r14 != 0) goto L_0x00dc
            goto L_0x0199
        L_0x00dc:
            android.view.View r3 = r13.C(r14)
            if (r3 != 0) goto L_0x00e4
            goto L_0x0199
        L_0x00e4:
            android.graphics.Rect r3 = r13.f1666i
            int r6 = r14.getWidth()
            int r8 = r14.getHeight()
            r3.set(r1, r1, r6, r8)
            android.graphics.Rect r3 = r13.f1668j
            int r6 = r0.getWidth()
            int r8 = r0.getHeight()
            r3.set(r1, r1, r6, r8)
            android.graphics.Rect r1 = r13.f1666i
            r13.offsetDescendantRectToMyCoords(r14, r1)
            android.graphics.Rect r1 = r13.f1668j
            r13.offsetDescendantRectToMyCoords(r0, r1)
            androidx.recyclerview.widget.RecyclerView$l r1 = r13.f1674m
            int r1 = r1.J()
            if (r1 != r2) goto L_0x0112
            r1 = -1
            goto L_0x0113
        L_0x0112:
            r1 = 1
        L_0x0113:
            android.graphics.Rect r3 = r13.f1666i
            int r6 = r3.left
            android.graphics.Rect r8 = r13.f1668j
            int r9 = r8.left
            if (r6 < r9) goto L_0x0121
            int r10 = r3.right
            if (r10 > r9) goto L_0x0129
        L_0x0121:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 >= r11) goto L_0x0129
            r6 = 1
            goto L_0x0136
        L_0x0129:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 > r11) goto L_0x0131
            if (r6 < r11) goto L_0x0135
        L_0x0131:
            if (r6 <= r9) goto L_0x0135
            r6 = -1
            goto L_0x0136
        L_0x0135:
            r6 = 0
        L_0x0136:
            int r9 = r3.top
            int r10 = r8.top
            if (r9 < r10) goto L_0x0140
            int r11 = r3.bottom
            if (r11 > r10) goto L_0x0148
        L_0x0140:
            int r11 = r3.bottom
            int r12 = r8.bottom
            if (r11 >= r12) goto L_0x0148
            r3 = 1
            goto L_0x0155
        L_0x0148:
            int r3 = r3.bottom
            int r8 = r8.bottom
            if (r3 > r8) goto L_0x0150
            if (r9 < r8) goto L_0x0154
        L_0x0150:
            if (r9 <= r10) goto L_0x0154
            r3 = -1
            goto L_0x0155
        L_0x0154:
            r3 = 0
        L_0x0155:
            if (r15 == r2) goto L_0x0191
            if (r15 == r7) goto L_0x0188
            if (r15 == r5) goto L_0x0185
            if (r15 == r4) goto L_0x0182
            r1 = 66
            if (r15 == r1) goto L_0x017f
            r1 = 130(0x82, float:1.82E-43)
            if (r15 != r1) goto L_0x0168
            if (r3 <= 0) goto L_0x019b
            goto L_0x0199
        L_0x0168:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid direction: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = androidx.recyclerview.widget.b.a(r13, r0)
            r14.<init>(r15)
            throw r14
        L_0x017f:
            if (r6 <= 0) goto L_0x019b
            goto L_0x0199
        L_0x0182:
            if (r3 >= 0) goto L_0x019b
            goto L_0x0199
        L_0x0185:
            if (r6 >= 0) goto L_0x019b
            goto L_0x0199
        L_0x0188:
            if (r3 > 0) goto L_0x0199
            if (r3 != 0) goto L_0x019b
            int r6 = r6 * r1
            if (r6 < 0) goto L_0x019b
            goto L_0x0199
        L_0x0191:
            if (r3 < 0) goto L_0x0199
            if (r3 != 0) goto L_0x019b
            int r6 = r6 * r1
            if (r6 > 0) goto L_0x019b
        L_0x0199:
            r1 = 1
            goto L_0x019c
        L_0x019b:
            r1 = 0
        L_0x019c:
            if (r1 == 0) goto L_0x019f
            goto L_0x01a3
        L_0x019f:
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x01a3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public void g(k kVar) {
        l lVar = this.f1674m;
        if (lVar != null) {
            lVar.d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f1678o.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f1678o.add(kVar);
        Q();
        requestLayout();
    }

    public void g0(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        l lVar = this.f1674m;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1693w) {
            int i5 = 0;
            if (!lVar.e()) {
                i2 = 0;
            }
            if (!this.f1674m.f()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i4 == Integer.MIN_VALUE || i4 > 0) {
                    if (z2) {
                        if (i2 != 0) {
                            i5 = 1;
                        }
                        if (i3 != 0) {
                            i5 |= 2;
                        }
                        i0(i5, 1);
                    }
                    this.f1653b0.b(i2, i3, i4, interpolator);
                    return;
                }
                scrollBy(i2, i3);
            }
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        l lVar = this.f1674m;
        if (lVar != null) {
            return lVar.t();
        }
        throw new IllegalStateException(b.a(this, androidx.activity.result.a.a("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        l lVar = this.f1674m;
        if (lVar != null) {
            return lVar.u(getContext(), attributeSet);
        }
        throw new IllegalStateException(b.a(this, androidx.activity.result.a.a("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        l lVar = this.f1674m;
        if (lVar != null) {
            return lVar.v(layoutParams);
        }
        throw new IllegalStateException(b.a(this, androidx.activity.result.a.a("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public d getAdapter() {
        return this.f1672l;
    }

    public int getBaseline() {
        l lVar = this.f1674m;
        if (lVar == null) {
            return super.getBaseline();
        }
        Objects.requireNonNull(lVar);
        return -1;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        g gVar = this.f1675m0;
        return gVar == null ? super.getChildDrawingOrder(i2, i3) : gVar.a(i2, i3);
    }

    public boolean getClipToPadding() {
        return this.f1664h;
    }

    public y getCompatAccessibilityDelegate() {
        return this.f1673l0;
    }

    public h getEdgeEffectFactory() {
        return this.E;
    }

    public i getItemAnimator() {
        return this.J;
    }

    public int getItemDecorationCount() {
        return this.f1678o.size();
    }

    public l getLayoutManager() {
        return this.f1674m;
    }

    public int getMaxFlingVelocity() {
        return this.U;
    }

    public int getMinFlingVelocity() {
        return this.T;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f1648x0) {
            return System.nanoTime();
        }
        return 0;
    }

    public n getOnFlingListener() {
        return this.S;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1651a0;
    }

    public q getRecycledViewPool() {
        return this.f1654c.d();
    }

    public int getScrollState() {
        return this.K;
    }

    public void h(p pVar) {
        if (this.f1663g0 == null) {
            this.f1663g0 = new ArrayList();
        }
        this.f1663g0.add(pVar);
    }

    public void h0() {
        int i2 = this.f1690u + 1;
        this.f1690u = i2;
        if (i2 == 1 && !this.f1693w) {
            this.f1692v = false;
        }
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public void i(String str) {
        if (O()) {
            if (str == null) {
                throw new IllegalStateException(b.a(this, androidx.activity.result.a.a("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.D > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(b.a(this, androidx.activity.result.a.a(""))));
        }
    }

    public boolean i0(int i2, int i3) {
        return getScrollingChildHelper().i(i2, i3);
    }

    public boolean isAttachedToWindow() {
        return this.f1684r;
    }

    public final boolean isLayoutSuppressed() {
        return this.f1693w;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f3055d;
    }

    public final void j() {
        b0();
        setScrollState(0);
    }

    public void j0(boolean z2) {
        if (this.f1690u < 1) {
            this.f1690u = 1;
        }
        if (!z2 && !this.f1693w) {
            this.f1692v = false;
        }
        if (this.f1690u == 1) {
            if (z2 && this.f1692v && !this.f1693w && this.f1674m != null && this.f1672l != null) {
                q();
            }
            if (!this.f1693w) {
                this.f1692v = false;
            }
        }
        this.f1690u--;
    }

    public void k0(int i2) {
        getScrollingChildHelper().j(i2);
    }

    public void l() {
        int h2 = this.f1660f.h();
        for (int i2 = 0; i2 < h2; i2++) {
            z K2 = K(this.f1660f.g(i2));
            if (!K2.t()) {
                K2.c();
            }
        }
        r rVar = this.f1654c;
        int size = rVar.f1743c.size();
        for (int i3 = 0; i3 < size; i3++) {
            rVar.f1743c.get(i3).c();
        }
        int size2 = rVar.f1741a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            rVar.f1741a.get(i4).c();
        }
        ArrayList<z> arrayList = rVar.f1742b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                rVar.f1742b.get(i5).c();
            }
        }
    }

    public void l0() {
        v vVar;
        setScrollState(0);
        this.f1653b0.c();
        l lVar = this.f1674m;
        if (lVar != null && (vVar = lVar.f1714e) != null) {
            vVar.d();
        }
    }

    public void m(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.F;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.F.onRelease();
            z2 = this.F.isFinished();
        }
        EdgeEffect edgeEffect2 = this.H;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.H.onRelease();
            z2 |= this.H.isFinished();
        }
        EdgeEffect edgeEffect3 = this.G;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.G.onRelease();
            z2 |= this.G.isFinished();
        }
        EdgeEffect edgeEffect4 = this.I;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.I.onRelease();
            z2 |= this.I.isFinished();
        }
        if (z2) {
            WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
            u.d.k(this);
        }
    }

    public void n() {
        if (!this.f1688t || this.A) {
            int i2 = c0.c.f2067a;
            Trace.beginSection("RV FullInvalidate");
            q();
            Trace.endSection();
        } else if (this.f1658e.g()) {
            Objects.requireNonNull(this.f1658e);
            if (this.f1658e.g()) {
                int i3 = c0.c.f2067a;
                Trace.beginSection("RV FullInvalidate");
                q();
                Trace.endSection();
            }
        }
    }

    public void o(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
        setMeasuredDimension(l.h(i2, paddingRight, u.d.e(this)), l.h(i3, getPaddingBottom() + getPaddingTop(), u.d.d(this)));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.C = 0;
        this.f1684r = true;
        this.f1688t = this.f1688t && !isLayoutRequested();
        l lVar = this.f1674m;
        if (lVar != null) {
            lVar.f1716g = true;
        }
        this.f1671k0 = false;
        if (f1648x0) {
            ThreadLocal<n> threadLocal = n.f1962f;
            n nVar = threadLocal.get();
            this.f1655c0 = nVar;
            if (nVar == null) {
                this.f1655c0 = new n();
                WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
                Display b2 = u.e.b(this);
                float f2 = 60.0f;
                if (!isInEditMode() && b2 != null) {
                    float refreshRate = b2.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                n nVar2 = this.f1655c0;
                nVar2.f1966d = (long) (1.0E9f / f2);
                threadLocal.set(nVar2);
            }
            this.f1655c0.f1964b.add(this);
        }
    }

    public void onDetachedFromWindow() {
        n nVar;
        super.onDetachedFromWindow();
        i iVar = this.J;
        if (iVar != null) {
            iVar.f();
        }
        l0();
        this.f1684r = false;
        l lVar = this.f1674m;
        if (lVar != null) {
            r rVar = this.f1654c;
            lVar.f1716g = false;
            lVar.Z(this, rVar);
        }
        this.f1687s0.clear();
        removeCallbacks(this.f1689t0);
        Objects.requireNonNull(this.f1662g);
        do {
        } while (d0.a.f1878d.a() != null);
        if (f1648x0 && (nVar = this.f1655c0) != null) {
            nVar.f1964b.remove(this);
            this.f1655c0 = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f1678o.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1678o.get(i2).d(canvas, this, this.f1659e0);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.f1674m != null && !this.f1693w && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.f1674m.f() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.f1674m.e()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        c0((int) (f2 * this.V), (int) (f3 * this.W), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.f1674m.f()) {
                        f3 = -axisValue;
                    } else if (this.f1674m.e()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        c0((int) (f2 * this.V), (int) (f3 * this.W), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            c0((int) (f2 * this.V), (int) (f3 * this.W), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.f1693w) {
            return false;
        }
        this.f1682q = null;
        if (D(motionEvent)) {
            j();
            return true;
        }
        l lVar = this.f1674m;
        if (lVar == null) {
            return false;
        }
        boolean e2 = lVar.e();
        boolean f2 = this.f1674m.f();
        if (this.M == null) {
            this.M = VelocityTracker.obtain();
        }
        this.M.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f1694x) {
                this.f1694x = false;
            }
            this.L = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.P = x2;
            this.N = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.Q = y2;
            this.O = y2;
            if (this.K == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                k0(1);
            }
            int[] iArr = this.f1683q0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f2) {
                e2 |= true;
            }
            i0(e2 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.M.clear();
            k0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.L);
            if (findPointerIndex < 0) {
                StringBuilder a2 = androidx.activity.result.a.a("Error processing scroll; pointer index for id ");
                a2.append(this.L);
                a2.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", a2.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.K != 1) {
                int i2 = x3 - this.N;
                int i3 = y3 - this.O;
                if (!e2 || Math.abs(i2) <= this.R) {
                    z2 = false;
                } else {
                    this.P = x3;
                    z2 = true;
                }
                if (f2 && Math.abs(i3) > this.R) {
                    this.Q = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5) {
            this.L = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.P = x4;
            this.N = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.Q = y4;
            this.O = y4;
        } else if (actionMasked == 6) {
            U(motionEvent);
        }
        return this.K == 1;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = c0.c.f2067a;
        Trace.beginSection("RV OnLayout");
        q();
        Trace.endSection();
        this.f1688t = true;
    }

    public void onMeasure(int i2, int i3) {
        l lVar = this.f1674m;
        if (lVar == null) {
            o(i2, i3);
            return;
        }
        boolean z2 = false;
        if (lVar.U()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.f1674m.f1711b.o(i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.f1672l != null) {
                if (this.f1659e0.f1769d == 1) {
                    r();
                }
                this.f1674m.z0(i2, i3);
                this.f1659e0.f1774i = true;
                s();
                this.f1674m.B0(i2, i3);
                if (this.f1674m.E0()) {
                    this.f1674m.z0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f1659e0.f1774i = true;
                    s();
                    this.f1674m.B0(i2, i3);
                }
            }
        } else if (this.f1686s) {
            this.f1674m.f1711b.o(i2, i3);
        } else {
            w wVar = this.f1659e0;
            if (wVar.f1776k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            d dVar = this.f1672l;
            if (dVar != null) {
                wVar.f1770e = dVar.a();
            } else {
                wVar.f1770e = 0;
            }
            h0();
            this.f1674m.f1711b.o(i2, i3);
            j0(false);
            this.f1659e0.f1772g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (O()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof u)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        u uVar = (u) parcelable;
        this.f1656d = uVar;
        super.onRestoreInstanceState(uVar.f3321b);
        l lVar = this.f1674m;
        if (lVar != null && (parcelable2 = this.f1656d.f1750d) != null) {
            lVar.l0(parcelable2);
        }
    }

    public Parcelable onSaveInstanceState() {
        u uVar = new u(super.onSaveInstanceState());
        u uVar2 = this.f1656d;
        if (uVar2 != null) {
            uVar.f1750d = uVar2.f1750d;
        } else {
            l lVar = this.f1674m;
            uVar.f1750d = lVar != null ? lVar.m0() : null;
        }
        return uVar;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            N();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:197:0x031a, code lost:
        if (r0 < r3) goto L_0x031d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            boolean r2 = r0.f1693w
            r3 = 0
            if (r2 != 0) goto L_0x03df
            boolean r2 = r0.f1694x
            if (r2 == 0) goto L_0x000f
            goto L_0x03df
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$o r2 = r0.f1682q
            r4 = 3
            r5 = 0
            r6 = 1
            if (r2 != 0) goto L_0x0023
            int r2 = r21.getAction()
            if (r2 != 0) goto L_0x001e
            r2 = 0
            goto L_0x0031
        L_0x001e:
            boolean r2 = r20.D(r21)
            goto L_0x0031
        L_0x0023:
            r2.c(r0, r1)
            int r2 = r21.getAction()
            if (r2 == r4) goto L_0x002e
            if (r2 != r6) goto L_0x0030
        L_0x002e:
            r0.f1682q = r5
        L_0x0030:
            r2 = 1
        L_0x0031:
            if (r2 == 0) goto L_0x0037
            r20.j()
            return r6
        L_0x0037:
            androidx.recyclerview.widget.RecyclerView$l r2 = r0.f1674m
            if (r2 != 0) goto L_0x003c
            return r3
        L_0x003c:
            boolean r2 = r2.e()
            androidx.recyclerview.widget.RecyclerView$l r7 = r0.f1674m
            boolean r7 = r7.f()
            android.view.VelocityTracker r8 = r0.M
            if (r8 != 0) goto L_0x0050
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            r0.M = r8
        L_0x0050:
            int r8 = r21.getActionMasked()
            int r9 = r21.getActionIndex()
            if (r8 != 0) goto L_0x0060
            int[] r10 = r0.f1683q0
            r10[r6] = r3
            r10[r3] = r3
        L_0x0060:
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r21)
            int[] r11 = r0.f1683q0
            r12 = r11[r3]
            float r12 = (float) r12
            r11 = r11[r6]
            float r11 = (float) r11
            r10.offsetLocation(r12, r11)
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r8 == 0) goto L_0x03a8
            java.lang.String r12 = "RecyclerView"
            r13 = 2
            if (r8 == r6) goto L_0x0189
            if (r8 == r13) goto L_0x00aa
            if (r8 == r4) goto L_0x00a5
            r2 = 5
            if (r8 == r2) goto L_0x0089
            r2 = 6
            if (r8 == r2) goto L_0x0084
            goto L_0x0184
        L_0x0084:
            r20.U(r21)
            goto L_0x0184
        L_0x0089:
            int r2 = r1.getPointerId(r9)
            r0.L = r2
            float r2 = r1.getX(r9)
            float r2 = r2 + r11
            int r2 = (int) r2
            r0.P = r2
            r0.N = r2
            float r1 = r1.getY(r9)
            float r1 = r1 + r11
            int r1 = (int) r1
            r0.Q = r1
            r0.O = r1
            goto L_0x0184
        L_0x00a5:
            r20.j()
            goto L_0x0184
        L_0x00aa:
            int r4 = r0.L
            int r4 = r1.findPointerIndex(r4)
            if (r4 >= 0) goto L_0x00ca
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r1 = androidx.activity.result.a.a(r1)
            int r2 = r0.L
            r1.append(r2)
            java.lang.String r2 = " not found. Did any MotionEvents get skipped?"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r12, r1)
            return r3
        L_0x00ca:
            float r5 = r1.getX(r4)
            float r5 = r5 + r11
            int r5 = (int) r5
            float r4 = r1.getY(r4)
            float r4 = r4 + r11
            int r4 = (int) r4
            int r8 = r0.P
            int r8 = r8 - r5
            int r9 = r0.Q
            int r9 = r9 - r4
            int r11 = r0.K
            if (r11 == r6) goto L_0x010f
            if (r2 == 0) goto L_0x00f5
            int r11 = r0.R
            if (r8 <= 0) goto L_0x00ec
            int r8 = r8 - r11
            int r8 = java.lang.Math.max(r3, r8)
            goto L_0x00f1
        L_0x00ec:
            int r8 = r8 + r11
            int r8 = java.lang.Math.min(r3, r8)
        L_0x00f1:
            if (r8 == 0) goto L_0x00f5
            r11 = 1
            goto L_0x00f6
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r7 == 0) goto L_0x010a
            int r12 = r0.R
            if (r9 <= 0) goto L_0x0102
            int r9 = r9 - r12
            int r9 = java.lang.Math.max(r3, r9)
            goto L_0x0107
        L_0x0102:
            int r9 = r9 + r12
            int r9 = java.lang.Math.min(r3, r9)
        L_0x0107:
            if (r9 == 0) goto L_0x010a
            r11 = 1
        L_0x010a:
            if (r11 == 0) goto L_0x010f
            r0.setScrollState(r6)
        L_0x010f:
            int r11 = r0.K
            if (r11 != r6) goto L_0x0184
            int[] r15 = r0.f1685r0
            r15[r3] = r3
            r15[r6] = r3
            if (r2 == 0) goto L_0x011d
            r13 = r8
            goto L_0x011f
        L_0x011d:
            r11 = 0
            r13 = 0
        L_0x011f:
            if (r7 == 0) goto L_0x0123
            r14 = r9
            goto L_0x0125
        L_0x0123:
            r11 = 0
            r14 = 0
        L_0x0125:
            int[] r11 = r0.f1681p0
            r17 = 0
            g0.i r12 = r20.getScrollingChildHelper()
            r16 = r11
            boolean r11 = r12.c(r13, r14, r15, r16, r17)
            if (r11 == 0) goto L_0x0156
            int[] r11 = r0.f1685r0
            r12 = r11[r3]
            int r8 = r8 - r12
            r11 = r11[r6]
            int r9 = r9 - r11
            int[] r11 = r0.f1683q0
            r12 = r11[r3]
            int[] r13 = r0.f1681p0
            r14 = r13[r3]
            int r12 = r12 + r14
            r11[r3] = r12
            r12 = r11[r6]
            r13 = r13[r6]
            int r12 = r12 + r13
            r11[r6] = r12
            android.view.ViewParent r11 = r20.getParent()
            r11.requestDisallowInterceptTouchEvent(r6)
        L_0x0156:
            int[] r11 = r0.f1681p0
            r3 = r11[r3]
            int r5 = r5 - r3
            r0.P = r5
            r3 = r11[r6]
            int r4 = r4 - r3
            r0.Q = r4
            if (r2 == 0) goto L_0x0166
            r2 = r8
            goto L_0x0167
        L_0x0166:
            r2 = 0
        L_0x0167:
            if (r7 == 0) goto L_0x016b
            r3 = r9
            goto L_0x016c
        L_0x016b:
            r3 = 0
        L_0x016c:
            boolean r1 = r0.c0(r2, r3, r1)
            if (r1 == 0) goto L_0x0179
            android.view.ViewParent r1 = r20.getParent()
            r1.requestDisallowInterceptTouchEvent(r6)
        L_0x0179:
            androidx.recyclerview.widget.n r1 = r0.f1655c0
            if (r1 == 0) goto L_0x0184
            if (r8 != 0) goto L_0x0181
            if (r9 == 0) goto L_0x0184
        L_0x0181:
            r1.a(r0, r8, r9)
        L_0x0184:
            r5 = r0
            r16 = r10
            goto L_0x03cd
        L_0x0189:
            android.view.VelocityTracker r1 = r0.M
            r1.addMovement(r10)
            android.view.VelocityTracker r1 = r0.M
            r4 = 1000(0x3e8, float:1.401E-42)
            int r6 = r0.U
            float r6 = (float) r6
            r1.computeCurrentVelocity(r4, r6)
            r1 = 0
            if (r2 == 0) goto L_0x01a5
            android.view.VelocityTracker r2 = r0.M
            int r4 = r0.L
            float r2 = r2.getXVelocity(r4)
            float r2 = -r2
            goto L_0x01a6
        L_0x01a5:
            r2 = 0
        L_0x01a6:
            if (r7 == 0) goto L_0x01b2
            android.view.VelocityTracker r4 = r0.M
            int r6 = r0.L
            float r4 = r4.getYVelocity(r6)
            float r4 = -r4
            goto L_0x01b3
        L_0x01b2:
            r4 = 0
        L_0x01b3:
            int r6 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x01c1
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x01bc
            goto L_0x01c1
        L_0x01bc:
            r5 = r0
            r16 = r10
            goto L_0x03a0
        L_0x01c1:
            int r1 = (int) r2
            int r2 = (int) r4
            androidx.recyclerview.widget.RecyclerView$l r4 = r0.f1674m
            if (r4 != 0) goto L_0x01cd
            java.lang.String r1 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r12, r1)
            goto L_0x01f6
        L_0x01cd:
            boolean r6 = r0.f1693w
            if (r6 == 0) goto L_0x01d2
            goto L_0x01f6
        L_0x01d2:
            boolean r4 = r4.e()
            androidx.recyclerview.widget.RecyclerView$l r6 = r0.f1674m
            boolean r6 = r6.f()
            if (r4 == 0) goto L_0x01e6
            int r7 = java.lang.Math.abs(r1)
            int r8 = r0.T
            if (r7 >= r8) goto L_0x01e7
        L_0x01e6:
            r1 = 0
        L_0x01e7:
            if (r6 == 0) goto L_0x01f1
            int r7 = java.lang.Math.abs(r2)
            int r8 = r0.T
            if (r7 >= r8) goto L_0x01f2
        L_0x01f1:
            r2 = 0
        L_0x01f2:
            if (r1 != 0) goto L_0x01fb
            if (r2 != 0) goto L_0x01fb
        L_0x01f6:
            r5 = r0
            r16 = r10
            goto L_0x039d
        L_0x01fb:
            float r7 = (float) r1
            float r8 = (float) r2
            boolean r9 = r0.dispatchNestedPreFling(r7, r8)
            if (r9 != 0) goto L_0x0399
            if (r4 != 0) goto L_0x020a
            if (r6 == 0) goto L_0x0208
            goto L_0x020a
        L_0x0208:
            r9 = 0
            goto L_0x020b
        L_0x020a:
            r9 = 1
        L_0x020b:
            r0.dispatchNestedFling(r7, r8, r9)
            androidx.recyclerview.widget.RecyclerView$n r7 = r0.S
            if (r7 == 0) goto L_0x0333
            androidx.recyclerview.widget.b0 r7 = (androidx.recyclerview.widget.b0) r7
            androidx.recyclerview.widget.RecyclerView r8 = r7.f1858a
            androidx.recyclerview.widget.RecyclerView$l r8 = r8.getLayoutManager()
            if (r8 != 0) goto L_0x021d
            goto L_0x0239
        L_0x021d:
            androidx.recyclerview.widget.RecyclerView r11 = r7.f1858a
            androidx.recyclerview.widget.RecyclerView$d r11 = r11.getAdapter()
            if (r11 != 0) goto L_0x0226
            goto L_0x0239
        L_0x0226:
            androidx.recyclerview.widget.RecyclerView r11 = r7.f1858a
            int r11 = r11.getMinFlingVelocity()
            int r12 = java.lang.Math.abs(r2)
            if (r12 > r11) goto L_0x0241
            int r12 = java.lang.Math.abs(r1)
            if (r12 <= r11) goto L_0x0239
            goto L_0x0241
        L_0x0239:
            r21 = r4
            r18 = r6
            r16 = r10
            goto L_0x032c
        L_0x0241:
            boolean r11 = r8 instanceof androidx.recyclerview.widget.RecyclerView.v.b
            if (r11 != 0) goto L_0x0246
            goto L_0x0258
        L_0x0246:
            androidx.recyclerview.widget.v r7 = (androidx.recyclerview.widget.v) r7
            if (r11 != 0) goto L_0x024b
            goto L_0x0256
        L_0x024b:
            androidx.recyclerview.widget.u r5 = new androidx.recyclerview.widget.u
            androidx.recyclerview.widget.RecyclerView r12 = r7.f1858a
            android.content.Context r12 = r12.getContext()
            r5.<init>(r7, r12)
        L_0x0256:
            if (r5 != 0) goto L_0x0260
        L_0x0258:
            r21 = r4
            r18 = r6
            r16 = r10
            goto L_0x0328
        L_0x0260:
            int r3 = r8.I()
            if (r3 != 0) goto L_0x0267
            goto L_0x0280
        L_0x0267:
            boolean r12 = r8.f()
            if (r12 == 0) goto L_0x0272
            androidx.recyclerview.widget.t r12 = r7.f(r8)
            goto L_0x027e
        L_0x0272:
            boolean r12 = r8.e()
            if (r12 == 0) goto L_0x027d
            androidx.recyclerview.widget.t r12 = r7.e(r8)
            goto L_0x027e
        L_0x027d:
            r12 = 0
        L_0x027e:
            if (r12 != 0) goto L_0x0288
        L_0x0280:
            r21 = r4
            r18 = r6
            r16 = r10
            goto L_0x031c
        L_0x0288:
            int r13 = r8.x()
            r14 = 2147483647(0x7fffffff, float:NaN)
            r15 = 0
            r16 = 0
            r17 = -2147483648(0xffffffff80000000, float:-0.0)
            r18 = 0
            r21 = r4
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
            r19 = r16
            r16 = r10
            r10 = r19
        L_0x02a1:
            if (r4 >= r13) goto L_0x02c5
            r17 = r13
            android.view.View r13 = r8.w(r4)
            r18 = r6
            if (r13 != 0) goto L_0x02ae
            goto L_0x02be
        L_0x02ae:
            int r6 = r7.c(r13, r12)
            if (r6 > 0) goto L_0x02b8
            if (r6 <= r0) goto L_0x02b8
            r0 = r6
            r10 = r13
        L_0x02b8:
            if (r6 < 0) goto L_0x02be
            if (r6 >= r14) goto L_0x02be
            r14 = r6
            r15 = r13
        L_0x02be:
            int r4 = r4 + 1
            r13 = r17
            r6 = r18
            goto L_0x02a1
        L_0x02c5:
            r18 = r6
            boolean r0 = r8.e()
            if (r0 == 0) goto L_0x02d0
            if (r1 <= 0) goto L_0x02d4
            goto L_0x02d2
        L_0x02d0:
            if (r2 <= 0) goto L_0x02d4
        L_0x02d2:
            r0 = 1
            goto L_0x02d5
        L_0x02d4:
            r0 = 0
        L_0x02d5:
            if (r0 == 0) goto L_0x02de
            if (r15 == 0) goto L_0x02de
            int r0 = r8.Q(r15)
            goto L_0x031d
        L_0x02de:
            if (r0 != 0) goto L_0x02e7
            if (r10 == 0) goto L_0x02e7
            int r0 = r8.Q(r10)
            goto L_0x031d
        L_0x02e7:
            if (r0 == 0) goto L_0x02ea
            r15 = r10
        L_0x02ea:
            if (r15 != 0) goto L_0x02ed
            goto L_0x031c
        L_0x02ed:
            int r4 = r8.Q(r15)
            int r6 = r8.I()
            if (r11 == 0) goto L_0x0311
            r7 = r8
            androidx.recyclerview.widget.RecyclerView$v$b r7 = (androidx.recyclerview.widget.RecyclerView.v.b) r7
            int r6 = r6 + -1
            android.graphics.PointF r6 = r7.a(r6)
            if (r6 == 0) goto L_0x0311
            float r7 = r6.x
            r10 = 0
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x030f
            float r6 = r6.y
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0311
        L_0x030f:
            r6 = 1
            goto L_0x0312
        L_0x0311:
            r6 = 0
        L_0x0312:
            if (r6 != r0) goto L_0x0316
            r0 = -1
            goto L_0x0317
        L_0x0316:
            r0 = 1
        L_0x0317:
            int r0 = r0 + r4
            if (r0 < 0) goto L_0x031c
            if (r0 < r3) goto L_0x031d
        L_0x031c:
            r0 = -1
        L_0x031d:
            r3 = -1
            if (r0 != r3) goto L_0x0322
            r3 = 0
            goto L_0x0328
        L_0x0322:
            r5.f1751a = r0
            r8.H0(r5)
            r3 = 1
        L_0x0328:
            if (r3 == 0) goto L_0x032c
            r0 = 1
            goto L_0x032d
        L_0x032c:
            r0 = 0
        L_0x032d:
            if (r0 == 0) goto L_0x0339
            r3 = 1
            r5 = r20
            goto L_0x039d
        L_0x0333:
            r21 = r4
            r18 = r6
            r16 = r10
        L_0x0339:
            if (r9 == 0) goto L_0x0396
            if (r18 == 0) goto L_0x0340
            r4 = r21 | 2
            goto L_0x0342
        L_0x0340:
            r4 = r21
        L_0x0342:
            r0 = 1
            r5 = r20
            r5.i0(r4, r0)
            int r0 = r5.U
            int r3 = -r0
            int r0 = java.lang.Math.min(r1, r0)
            int r9 = java.lang.Math.max(r3, r0)
            int r0 = r5.U
            int r1 = -r0
            int r0 = java.lang.Math.min(r2, r0)
            int r10 = java.lang.Math.max(r1, r0)
            androidx.recyclerview.widget.RecyclerView$y r0 = r5.f1653b0
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            r2 = 2
            r1.setScrollState(r2)
            r1 = 0
            r0.f1781c = r1
            r0.f1780b = r1
            android.view.animation.Interpolator r1 = r0.f1783e
            android.view.animation.Interpolator r2 = f1650z0
            if (r1 == r2) goto L_0x0380
            r0.f1783e = r2
            android.widget.OverScroller r1 = new android.widget.OverScroller
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            android.content.Context r3 = r3.getContext()
            r1.<init>(r3, r2)
            r0.f1782d = r1
        L_0x0380:
            android.widget.OverScroller r6 = r0.f1782d
            r7 = 0
            r8 = 0
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 2147483647(0x7fffffff, float:NaN)
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            r14 = 2147483647(0x7fffffff, float:NaN)
            r6.fling(r7, r8, r9, r10, r11, r12, r13, r14)
            r0.a()
            r3 = 1
            goto L_0x039d
        L_0x0396:
            r5 = r20
            goto L_0x039c
        L_0x0399:
            r5 = r0
            r16 = r10
        L_0x039c:
            r3 = 0
        L_0x039d:
            if (r3 != 0) goto L_0x03a3
            r3 = 0
        L_0x03a0:
            r5.setScrollState(r3)
        L_0x03a3:
            r20.b0()
            r0 = 1
            goto L_0x03ce
        L_0x03a8:
            r5 = r0
            r16 = r10
            int r0 = r1.getPointerId(r3)
            r5.L = r0
            float r0 = r21.getX()
            float r0 = r0 + r11
            int r0 = (int) r0
            r5.P = r0
            r5.N = r0
            float r0 = r21.getY()
            float r0 = r0 + r11
            int r0 = (int) r0
            r5.Q = r0
            r5.O = r0
            if (r7 == 0) goto L_0x03c9
            r2 = r2 | 2
        L_0x03c9:
            r0 = 0
            r5.i0(r2, r0)
        L_0x03cd:
            r0 = 0
        L_0x03ce:
            if (r0 != 0) goto L_0x03d8
            android.view.VelocityTracker r0 = r5.M
            r1 = r16
            r0.addMovement(r1)
            goto L_0x03da
        L_0x03d8:
            r1 = r16
        L_0x03da:
            r1.recycle()
            r0 = 1
            return r0
        L_0x03df:
            r5 = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view) {
        z K2 = K(view);
        d dVar = this.f1672l;
        if (dVar != null && K2 != null) {
            Objects.requireNonNull(dVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f5, code lost:
        if (r15.f1660f.k(getFocusedChild()) == false) goto L_0x03b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0354  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q() {
        /*
            r15 = this;
            androidx.recyclerview.widget.RecyclerView$d r0 = r15.f1672l
            java.lang.String r1 = "RecyclerView"
            if (r0 != 0) goto L_0x0009
            java.lang.String r0 = "No adapter attached; skipping layout"
            goto L_0x000f
        L_0x0009:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1674m
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "No layout manager attached; skipping layout"
        L_0x000f:
            android.util.Log.e(r1, r0)
            return
        L_0x0013:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1659e0
            r2 = 0
            r0.f1774i = r2
            int r0 = r0.f1769d
            r3 = 1
            if (r0 != r3) goto L_0x0021
            r15.r()
            goto L_0x0053
        L_0x0021:
            androidx.recyclerview.widget.a r0 = r15.f1658e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r4 = r0.f1850c
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0035
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r0 = r0.f1849b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0035
            r0 = 1
            goto L_0x0036
        L_0x0035:
            r0 = 0
        L_0x0036:
            if (r0 != 0) goto L_0x0053
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1674m
            int r0 = r0.f1723n
            int r4 = r15.getWidth()
            if (r0 != r4) goto L_0x0053
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1674m
            int r0 = r0.f1724o
            int r4 = r15.getHeight()
            if (r0 == r4) goto L_0x004d
            goto L_0x0053
        L_0x004d:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1674m
            r0.y0(r15)
            goto L_0x005b
        L_0x0053:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1674m
            r0.y0(r15)
            r15.s()
        L_0x005b:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1659e0
            r4 = 4
            r0.a(r4)
            r15.h0()
            r15.S()
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1659e0
            r0.f1769d = r3
            boolean r0 = r0.f1775j
            r5 = 0
            if (r0 == 0) goto L_0x0259
            androidx.recyclerview.widget.c r0 = r15.f1660f
            int r0 = r0.e()
            int r0 = r0 - r3
        L_0x0077:
            if (r0 < 0) goto L_0x01a3
            androidx.recyclerview.widget.c r6 = r15.f1660f
            android.view.View r6 = r6.d(r0)
            androidx.recyclerview.widget.RecyclerView$z r6 = K(r6)
            boolean r7 = r6.t()
            if (r7 == 0) goto L_0x008b
            goto L_0x019e
        L_0x008b:
            long r7 = r15.I(r6)
            androidx.recyclerview.widget.RecyclerView$i r9 = r15.J
            java.util.Objects.requireNonNull(r9)
            androidx.recyclerview.widget.RecyclerView$i$c r9 = new androidx.recyclerview.widget.RecyclerView$i$c
            r9.<init>()
            android.view.View r10 = r6.f1788a
            int r11 = r10.getLeft()
            r9.f1707a = r11
            int r11 = r10.getTop()
            r9.f1708b = r11
            r10.getRight()
            r10.getBottom()
            androidx.recyclerview.widget.d0 r10 = r15.f1662g
            m.e<androidx.recyclerview.widget.RecyclerView$z> r10 = r10.f1877b
            java.lang.Object r10 = r10.f(r7, r5)
            androidx.recyclerview.widget.RecyclerView$z r10 = (androidx.recyclerview.widget.RecyclerView.z) r10
            if (r10 == 0) goto L_0x0199
            boolean r11 = r10.t()
            if (r11 != 0) goto L_0x0199
            androidx.recyclerview.widget.d0 r11 = r15.f1662g
            boolean r11 = r11.d(r10)
            androidx.recyclerview.widget.d0 r12 = r15.f1662g
            boolean r12 = r12.d(r6)
            if (r11 == 0) goto L_0x00d1
            if (r10 != r6) goto L_0x00d1
            goto L_0x0199
        L_0x00d1:
            androidx.recyclerview.widget.d0 r13 = r15.f1662g
            androidx.recyclerview.widget.RecyclerView$i$c r4 = r13.e(r10, r4)
            androidx.recyclerview.widget.d0 r13 = r15.f1662g
            r13.b(r6, r9)
            androidx.recyclerview.widget.d0 r9 = r15.f1662g
            r13 = 8
            androidx.recyclerview.widget.RecyclerView$i$c r9 = r9.e(r6, r13)
            if (r4 != 0) goto L_0x016f
            androidx.recyclerview.widget.c r4 = r15.f1660f
            int r4 = r4.e()
            r9 = 0
        L_0x00ed:
            if (r9 >= r4) goto L_0x014b
            androidx.recyclerview.widget.c r11 = r15.f1660f
            android.view.View r11 = r11.d(r9)
            androidx.recyclerview.widget.RecyclerView$z r11 = K(r11)
            if (r11 != r6) goto L_0x00fc
            goto L_0x0148
        L_0x00fc:
            long r12 = r15.I(r11)
            int r14 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r14 != 0) goto L_0x0148
            androidx.recyclerview.widget.RecyclerView$d r0 = r15.f1672l
            java.lang.String r1 = " \n View Holder 2:"
            if (r0 == 0) goto L_0x012b
            boolean r0 = r0.f1700b
            if (r0 == 0) goto L_0x012b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = androidx.recyclerview.widget.b.a(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x012b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = androidx.recyclerview.widget.b.a(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x0148:
            int r9 = r9 + 1
            goto L_0x00ed
        L_0x014b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "
            r4.append(r7)
            r4.append(r10)
            java.lang.String r7 = " cannot be found but it is necessary for "
            r4.append(r7)
            r4.append(r6)
            java.lang.String r6 = r15.A()
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r1, r4)
            goto L_0x019e
        L_0x016f:
            r10.s(r2)
            if (r11 == 0) goto L_0x0177
            r15.f(r10)
        L_0x0177:
            if (r10 == r6) goto L_0x018d
            if (r12 == 0) goto L_0x017e
            r15.f(r6)
        L_0x017e:
            r10.f1795h = r6
            r15.f(r10)
            androidx.recyclerview.widget.RecyclerView$r r7 = r15.f1654c
            r7.k(r10)
            r6.s(r2)
            r6.f1796i = r10
        L_0x018d:
            androidx.recyclerview.widget.RecyclerView$i r7 = r15.J
            boolean r4 = r7.a(r10, r6, r4, r9)
            if (r4 == 0) goto L_0x019e
            r15.V()
            goto L_0x019e
        L_0x0199:
            androidx.recyclerview.widget.d0 r4 = r15.f1662g
            r4.b(r6, r9)
        L_0x019e:
            int r0 = r0 + -1
            r4 = 4
            goto L_0x0077
        L_0x01a3:
            androidx.recyclerview.widget.d0 r0 = r15.f1662g
            androidx.recyclerview.widget.d0$b r1 = r15.f1691u0
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.d0$a> r4 = r0.f1876a
            int r4 = r4.f3377d
        L_0x01ab:
            int r4 = r4 + -1
            if (r4 < 0) goto L_0x0259
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.d0$a> r5 = r0.f1876a
            java.lang.Object r5 = r5.h(r4)
            r7 = r5
            androidx.recyclerview.widget.RecyclerView$z r7 = (androidx.recyclerview.widget.RecyclerView.z) r7
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.d0$a> r5 = r0.f1876a
            java.lang.Object r5 = r5.i(r4)
            androidx.recyclerview.widget.d0$a r5 = (androidx.recyclerview.widget.d0.a) r5
            int r6 = r5.f1879a
            r8 = r6 & 3
            r9 = 3
            if (r8 != r9) goto L_0x01c8
            goto L_0x01d0
        L_0x01c8:
            r8 = r6 & 1
            if (r8 == 0) goto L_0x01e3
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f1880b
            if (r6 != 0) goto L_0x01e0
        L_0x01d0:
            r6 = r1
            androidx.recyclerview.widget.RecyclerView$c r6 = (androidx.recyclerview.widget.RecyclerView.c) r6
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$l r8 = r6.f1674m
            android.view.View r7 = r7.f1788a
            androidx.recyclerview.widget.RecyclerView$r r6 = r6.f1654c
            r8.q0(r7, r6)
            goto L_0x0254
        L_0x01e0:
            androidx.recyclerview.widget.RecyclerView$i$c r8 = r5.f1881c
            goto L_0x023f
        L_0x01e3:
            r8 = r6 & 14
            r9 = 14
            if (r8 != r9) goto L_0x01ea
            goto L_0x024a
        L_0x01ea:
            r8 = r6 & 12
            r9 = 12
            if (r8 != r9) goto L_0x0238
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f1880b
            androidx.recyclerview.widget.RecyclerView$i$c r8 = r5.f1881c
            r12 = r1
            androidx.recyclerview.widget.RecyclerView$c r12 = (androidx.recyclerview.widget.RecyclerView.c) r12
            java.util.Objects.requireNonNull(r12)
            r7.s(r2)
            androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
            boolean r10 = r9.A
            androidx.recyclerview.widget.RecyclerView$i r9 = r9.J
            if (r10 == 0) goto L_0x020c
            boolean r6 = r9.a(r7, r7, r6, r8)
            if (r6 == 0) goto L_0x0254
            goto L_0x0232
        L_0x020c:
            androidx.recyclerview.widget.a0 r9 = (androidx.recyclerview.widget.a0) r9
            java.util.Objects.requireNonNull(r9)
            int r10 = r6.f1707a
            int r11 = r8.f1707a
            if (r10 != r11) goto L_0x0223
            int r13 = r6.f1708b
            int r14 = r8.f1708b
            if (r13 == r14) goto L_0x021e
            goto L_0x0223
        L_0x021e:
            r9.c(r7)
            r6 = 0
            goto L_0x0230
        L_0x0223:
            int r13 = r6.f1708b
            int r14 = r8.f1708b
            r6 = r9
            r8 = r10
            r9 = r13
            r10 = r11
            r11 = r14
            boolean r6 = r6.i(r7, r8, r9, r10, r11)
        L_0x0230:
            if (r6 == 0) goto L_0x0254
        L_0x0232:
            androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
            r6.V()
            goto L_0x0254
        L_0x0238:
            r8 = r6 & 4
            if (r8 == 0) goto L_0x0246
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f1880b
            r8 = 0
        L_0x023f:
            r9 = r1
            androidx.recyclerview.widget.RecyclerView$c r9 = (androidx.recyclerview.widget.RecyclerView.c) r9
            r9.b(r7, r6, r8)
            goto L_0x0254
        L_0x0246:
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0254
        L_0x024a:
            androidx.recyclerview.widget.RecyclerView$i$c r6 = r5.f1880b
            androidx.recyclerview.widget.RecyclerView$i$c r8 = r5.f1881c
            r9 = r1
            androidx.recyclerview.widget.RecyclerView$c r9 = (androidx.recyclerview.widget.RecyclerView.c) r9
            r9.a(r7, r6, r8)
        L_0x0254:
            androidx.recyclerview.widget.d0.a.b(r5)
            goto L_0x01ab
        L_0x0259:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1674m
            androidx.recyclerview.widget.RecyclerView$r r1 = r15.f1654c
            r0.p0(r1)
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1659e0
            int r1 = r0.f1770e
            r0.f1767b = r1
            r15.A = r2
            r15.B = r2
            r0.f1775j = r2
            r0.f1776k = r2
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1674m
            r0.f1715f = r2
            androidx.recyclerview.widget.RecyclerView$r r0 = r15.f1654c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$z> r0 = r0.f1742b
            if (r0 == 0) goto L_0x027b
            r0.clear()
        L_0x027b:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1674m
            boolean r1 = r0.f1720k
            if (r1 == 0) goto L_0x028a
            r0.f1719j = r2
            r0.f1720k = r2
            androidx.recyclerview.widget.RecyclerView$r r0 = r15.f1654c
            r0.l()
        L_0x028a:
            androidx.recyclerview.widget.RecyclerView$l r0 = r15.f1674m
            androidx.recyclerview.widget.RecyclerView$w r1 = r15.f1659e0
            r0.k0(r1)
            r15.T(r3)
            r15.j0(r2)
            androidx.recyclerview.widget.d0 r0 = r15.f1662g
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.d0$a> r1 = r0.f1876a
            r1.clear()
            m.e<androidx.recyclerview.widget.RecyclerView$z> r0 = r0.f1877b
            r0.b()
            int[] r0 = r15.f1677n0
            r1 = r0[r2]
            r4 = r0[r3]
            r15.E(r0)
            int[] r0 = r15.f1677n0
            r5 = r0[r2]
            if (r5 != r1) goto L_0x02b8
            r0 = r0[r3]
            if (r0 == r4) goto L_0x02b7
            goto L_0x02b8
        L_0x02b7:
            r3 = 0
        L_0x02b8:
            if (r3 == 0) goto L_0x02bd
            r15.v(r2, r2)
        L_0x02bd:
            boolean r0 = r15.f1651a0
            r3 = -1
            if (r0 == 0) goto L_0x03b9
            androidx.recyclerview.widget.RecyclerView$d r0 = r15.f1672l
            if (r0 == 0) goto L_0x03b9
            boolean r0 = r15.hasFocus()
            if (r0 == 0) goto L_0x03b9
            int r0 = r15.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r1) goto L_0x03b9
            int r0 = r15.getDescendantFocusability()
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r1) goto L_0x02e5
            boolean r0 = r15.isFocused()
            if (r0 == 0) goto L_0x02e5
            goto L_0x03b9
        L_0x02e5:
            boolean r0 = r15.isFocused()
            if (r0 != 0) goto L_0x02f9
            android.view.View r0 = r15.getFocusedChild()
            androidx.recyclerview.widget.c r1 = r15.f1660f
            boolean r0 = r1.k(r0)
            if (r0 != 0) goto L_0x02f9
            goto L_0x03b9
        L_0x02f9:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1659e0
            long r0 = r0.f1778m
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x033e
            androidx.recyclerview.widget.RecyclerView$d r5 = r15.f1672l
            boolean r5 = r5.f1700b
            if (r5 == 0) goto L_0x033e
            if (r5 != 0) goto L_0x030b
            r0 = 0
            goto L_0x033c
        L_0x030b:
            androidx.recyclerview.widget.c r5 = r15.f1660f
            int r5 = r5.h()
            r6 = 0
            r7 = 0
        L_0x0313:
            if (r6 >= r5) goto L_0x033b
            androidx.recyclerview.widget.c r8 = r15.f1660f
            android.view.View r8 = r8.g(r6)
            androidx.recyclerview.widget.RecyclerView$z r8 = K(r8)
            if (r8 == 0) goto L_0x0338
            boolean r9 = r8.l()
            if (r9 != 0) goto L_0x0338
            long r9 = r8.f1792e
            int r11 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r11 != 0) goto L_0x0338
            androidx.recyclerview.widget.c r7 = r15.f1660f
            android.view.View r9 = r8.f1788a
            boolean r7 = r7.k(r9)
            if (r7 == 0) goto L_0x033f
            r7 = r8
        L_0x0338:
            int r6 = r6 + 1
            goto L_0x0313
        L_0x033b:
            r0 = r7
        L_0x033c:
            r8 = r0
            goto L_0x033f
        L_0x033e:
            r8 = 0
        L_0x033f:
            if (r8 == 0) goto L_0x0357
            androidx.recyclerview.widget.c r0 = r15.f1660f
            android.view.View r1 = r8.f1788a
            boolean r0 = r0.k(r1)
            if (r0 != 0) goto L_0x0357
            android.view.View r0 = r8.f1788a
            boolean r0 = r0.hasFocusable()
            if (r0 != 0) goto L_0x0354
            goto L_0x0357
        L_0x0354:
            android.view.View r0 = r8.f1788a
            goto L_0x039e
        L_0x0357:
            androidx.recyclerview.widget.c r0 = r15.f1660f
            int r0 = r0.e()
            if (r0 <= 0) goto L_0x039d
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1659e0
            int r1 = r0.f1777l
            r5 = -1
            if (r1 == r5) goto L_0x0367
            r2 = r1
        L_0x0367:
            int r0 = r0.b()
            r1 = r2
        L_0x036c:
            if (r1 >= r0) goto L_0x0383
            androidx.recyclerview.widget.RecyclerView$z r5 = r15.G(r1)
            if (r5 != 0) goto L_0x0375
            goto L_0x0383
        L_0x0375:
            android.view.View r6 = r5.f1788a
            boolean r6 = r6.hasFocusable()
            if (r6 == 0) goto L_0x0380
            android.view.View r0 = r5.f1788a
            goto L_0x039e
        L_0x0380:
            int r1 = r1 + 1
            goto L_0x036c
        L_0x0383:
            int r0 = java.lang.Math.min(r0, r2)
        L_0x0387:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x039d
            androidx.recyclerview.widget.RecyclerView$z r1 = r15.G(r0)
            if (r1 != 0) goto L_0x0392
            goto L_0x039d
        L_0x0392:
            android.view.View r2 = r1.f1788a
            boolean r2 = r2.hasFocusable()
            if (r2 == 0) goto L_0x0387
            android.view.View r0 = r1.f1788a
            goto L_0x039e
        L_0x039d:
            r0 = 0
        L_0x039e:
            if (r0 == 0) goto L_0x03b9
            androidx.recyclerview.widget.RecyclerView$w r1 = r15.f1659e0
            int r1 = r1.f1779n
            long r5 = (long) r1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x03b6
            android.view.View r1 = r0.findViewById(r1)
            if (r1 == 0) goto L_0x03b6
            boolean r2 = r1.isFocusable()
            if (r2 == 0) goto L_0x03b6
            r0 = r1
        L_0x03b6:
            r0.requestFocus()
        L_0x03b9:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f1659e0
            r0.f1778m = r3
            r1 = -1
            r0.f1777l = r1
            r0.f1779n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2 A[EDGE_INSN: B:99:0x00a2->B:38:0x00a2 ?: BREAK  
    EDGE_INSN: B:100:0x00a2->B:38:0x00a2 ?: BREAK  
    EDGE_INSN: B:101:0x00a2->B:38:0x00a2 ?: BREAK  ] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r() {
        /*
            r10 = this;
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f1659e0
            r1 = 1
            r0.a(r1)
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f1659e0
            r10.B(r0)
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f1659e0
            r2 = 0
            r0.f1774i = r2
            r10.h0()
            androidx.recyclerview.widget.d0 r0 = r10.f1662g
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.d0$a> r3 = r0.f1876a
            r3.clear()
            m.e<androidx.recyclerview.widget.RecyclerView$z> r0 = r0.f1877b
            r0.b()
            r10.S()
            r10.W()
            boolean r0 = r10.f1651a0
            r3 = 0
            if (r0 == 0) goto L_0x0039
            boolean r0 = r10.hasFocus()
            if (r0 == 0) goto L_0x0039
            androidx.recyclerview.widget.RecyclerView$d r0 = r10.f1672l
            if (r0 == 0) goto L_0x0039
            android.view.View r0 = r10.getFocusedChild()
            goto L_0x003a
        L_0x0039:
            r0 = r3
        L_0x003a:
            if (r0 != 0) goto L_0x003d
            goto L_0x0043
        L_0x003d:
            android.view.View r0 = r10.C(r0)
            if (r0 != 0) goto L_0x0045
        L_0x0043:
            r0 = r3
            goto L_0x0049
        L_0x0045:
            androidx.recyclerview.widget.RecyclerView$z r0 = r10.J(r0)
        L_0x0049:
            r4 = -1
            r6 = -1
            if (r0 != 0) goto L_0x0057
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f1659e0
            r0.f1778m = r4
            r0.f1777l = r6
            r0.f1779n = r6
            goto L_0x00a4
        L_0x0057:
            androidx.recyclerview.widget.RecyclerView$w r7 = r10.f1659e0
            androidx.recyclerview.widget.RecyclerView$d r8 = r10.f1672l
            boolean r8 = r8.f1700b
            if (r8 == 0) goto L_0x0061
            long r4 = r0.f1792e
        L_0x0061:
            r7.f1778m = r4
            boolean r4 = r10.A
            if (r4 == 0) goto L_0x0068
            goto L_0x0075
        L_0x0068:
            boolean r4 = r0.l()
            if (r4 == 0) goto L_0x0071
            int r4 = r0.f1791d
            goto L_0x007b
        L_0x0071:
            androidx.recyclerview.widget.RecyclerView r4 = r0.f1805r
            if (r4 != 0) goto L_0x0077
        L_0x0075:
            r4 = -1
            goto L_0x007b
        L_0x0077:
            int r4 = r4.H(r0)
        L_0x007b:
            r7.f1777l = r4
            androidx.recyclerview.widget.RecyclerView$w r4 = r10.f1659e0
            android.view.View r0 = r0.f1788a
        L_0x0081:
            int r5 = r0.getId()
        L_0x0085:
            boolean r7 = r0.isFocused()
            if (r7 != 0) goto L_0x00a2
            boolean r7 = r0 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x00a2
            boolean r7 = r0.hasFocus()
            if (r7 == 0) goto L_0x00a2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r0 = r0.getFocusedChild()
            int r7 = r0.getId()
            if (r7 == r6) goto L_0x0085
            goto L_0x0081
        L_0x00a2:
            r4.f1779n = r5
        L_0x00a4:
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f1659e0
            boolean r4 = r0.f1775j
            if (r4 == 0) goto L_0x00b0
            boolean r4 = r10.f1667i0
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r0.f1773h = r4
            r10.f1667i0 = r2
            r10.f1665h0 = r2
            boolean r4 = r0.f1776k
            r0.f1772g = r4
            androidx.recyclerview.widget.RecyclerView$d r4 = r10.f1672l
            int r4 = r4.a()
            r0.f1770e = r4
            int[] r0 = r10.f1677n0
            r10.E(r0)
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f1659e0
            boolean r0 = r0.f1775j
            if (r0 == 0) goto L_0x0131
            androidx.recyclerview.widget.c r0 = r10.f1660f
            int r0 = r0.e()
            r4 = 0
        L_0x00d5:
            if (r4 >= r0) goto L_0x0131
            androidx.recyclerview.widget.c r5 = r10.f1660f
            android.view.View r5 = r5.d(r4)
            androidx.recyclerview.widget.RecyclerView$z r5 = K(r5)
            boolean r7 = r5.t()
            if (r7 != 0) goto L_0x012e
            boolean r7 = r5.j()
            if (r7 == 0) goto L_0x00f4
            androidx.recyclerview.widget.RecyclerView$d r7 = r10.f1672l
            boolean r7 = r7.f1700b
            if (r7 != 0) goto L_0x00f4
            goto L_0x012e
        L_0x00f4:
            androidx.recyclerview.widget.RecyclerView$i r7 = r10.J
            androidx.recyclerview.widget.RecyclerView.i.b(r5)
            r5.f()
            androidx.recyclerview.widget.RecyclerView$i$c r7 = r7.h(r5)
            androidx.recyclerview.widget.d0 r8 = r10.f1662g
            r8.c(r5, r7)
            androidx.recyclerview.widget.RecyclerView$w r7 = r10.f1659e0
            boolean r7 = r7.f1773h
            if (r7 == 0) goto L_0x012e
            boolean r7 = r5.o()
            if (r7 == 0) goto L_0x012e
            boolean r7 = r5.l()
            if (r7 != 0) goto L_0x012e
            boolean r7 = r5.t()
            if (r7 != 0) goto L_0x012e
            boolean r7 = r5.j()
            if (r7 != 0) goto L_0x012e
            long r7 = r10.I(r5)
            androidx.recyclerview.widget.d0 r9 = r10.f1662g
            m.e<androidx.recyclerview.widget.RecyclerView$z> r9 = r9.f1877b
            r9.g(r7, r5)
        L_0x012e:
            int r4 = r4 + 1
            goto L_0x00d5
        L_0x0131:
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f1659e0
            boolean r0 = r0.f1776k
            r4 = 2
            if (r0 == 0) goto L_0x01d5
            androidx.recyclerview.widget.c r0 = r10.f1660f
            int r0 = r0.h()
            r5 = 0
        L_0x013f:
            if (r5 >= r0) goto L_0x015c
            androidx.recyclerview.widget.c r7 = r10.f1660f
            android.view.View r7 = r7.g(r5)
            androidx.recyclerview.widget.RecyclerView$z r7 = K(r7)
            boolean r8 = r7.t()
            if (r8 != 0) goto L_0x0159
            int r8 = r7.f1791d
            if (r8 != r6) goto L_0x0159
            int r8 = r7.f1790c
            r7.f1791d = r8
        L_0x0159:
            int r5 = r5 + 1
            goto L_0x013f
        L_0x015c:
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f1659e0
            boolean r5 = r0.f1771f
            r0.f1771f = r2
            androidx.recyclerview.widget.RecyclerView$l r6 = r10.f1674m
            androidx.recyclerview.widget.RecyclerView$r r7 = r10.f1654c
            r6.j0(r7, r0)
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f1659e0
            r0.f1771f = r5
            r0 = 0
        L_0x016e:
            androidx.recyclerview.widget.c r5 = r10.f1660f
            int r5 = r5.e()
            if (r0 >= r5) goto L_0x01d5
            androidx.recyclerview.widget.c r5 = r10.f1660f
            android.view.View r5 = r5.d(r0)
            androidx.recyclerview.widget.RecyclerView$z r5 = K(r5)
            boolean r6 = r5.t()
            if (r6 == 0) goto L_0x0187
            goto L_0x01d2
        L_0x0187:
            androidx.recyclerview.widget.d0 r6 = r10.f1662g
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.d0$a> r6 = r6.f1876a
            java.lang.Object r6 = r6.getOrDefault(r5, r3)
            androidx.recyclerview.widget.d0$a r6 = (androidx.recyclerview.widget.d0.a) r6
            if (r6 == 0) goto L_0x019b
            int r6 = r6.f1879a
            r6 = r6 & 4
            if (r6 == 0) goto L_0x019b
            r6 = 1
            goto L_0x019c
        L_0x019b:
            r6 = 0
        L_0x019c:
            if (r6 != 0) goto L_0x01d2
            androidx.recyclerview.widget.RecyclerView.i.b(r5)
            r6 = 8192(0x2000, float:1.14794E-41)
            boolean r6 = r5.g(r6)
            androidx.recyclerview.widget.RecyclerView$i r7 = r10.J
            r5.f()
            androidx.recyclerview.widget.RecyclerView$i$c r7 = r7.h(r5)
            if (r6 == 0) goto L_0x01b6
            r10.Y(r5, r7)
            goto L_0x01d2
        L_0x01b6:
            androidx.recyclerview.widget.d0 r6 = r10.f1662g
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.d0$a> r8 = r6.f1876a
            java.lang.Object r8 = r8.getOrDefault(r5, r3)
            androidx.recyclerview.widget.d0$a r8 = (androidx.recyclerview.widget.d0.a) r8
            if (r8 != 0) goto L_0x01cb
            androidx.recyclerview.widget.d0$a r8 = androidx.recyclerview.widget.d0.a.a()
            m.h<androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.d0$a> r6 = r6.f1876a
            r6.put(r5, r8)
        L_0x01cb:
            int r5 = r8.f1879a
            r5 = r5 | r4
            r8.f1879a = r5
            r8.f1880b = r7
        L_0x01d2:
            int r0 = r0 + 1
            goto L_0x016e
        L_0x01d5:
            r10.l()
            r10.T(r1)
            r10.j0(r2)
            androidx.recyclerview.widget.RecyclerView$w r0 = r10.f1659e0
            r0.f1769d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r():void");
    }

    public void removeDetachedView(View view, boolean z2) {
        z K2 = K(view);
        if (K2 != null) {
            if (K2.n()) {
                K2.f1797j &= -257;
            } else if (!K2.t()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(K2);
                throw new IllegalArgumentException(b.a(this, sb));
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z2);
    }

    public void requestChildFocus(View view, View view2) {
        v vVar = this.f1674m.f1714e;
        boolean z2 = true;
        if (!(vVar != null && vVar.f1755e) && !O()) {
            z2 = false;
        }
        if (!z2 && view2 != null) {
            a0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.f1674m.t0(this, view, rect, z2, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.f1680p.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f1680p.get(i2).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.f1690u != 0 || this.f1693w) {
            this.f1692v = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        h0();
        S();
        this.f1659e0.a(6);
        this.f1658e.c();
        this.f1659e0.f1770e = this.f1672l.a();
        w wVar = this.f1659e0;
        wVar.f1768c = 0;
        wVar.f1772g = false;
        this.f1674m.j0(this.f1654c, wVar);
        w wVar2 = this.f1659e0;
        wVar2.f1771f = false;
        this.f1656d = null;
        wVar2.f1775j = wVar2.f1775j && this.J != null;
        wVar2.f1769d = 4;
        T(true);
        j0(false);
    }

    public void scrollBy(int i2, int i3) {
        l lVar = this.f1674m;
        if (lVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.f1693w) {
            boolean e2 = lVar.e();
            boolean f2 = this.f1674m.f();
            if (e2 || f2) {
                if (!e2) {
                    i2 = 0;
                }
                if (!f2) {
                    i3 = 0;
                }
                c0(i2, i3, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (O()) {
            int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
            if (contentChangeTypes != 0) {
                i2 = contentChangeTypes;
            }
            this.f1695y |= i2;
            i2 = 1;
        }
        if (i2 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(y yVar) {
        this.f1673l0 = yVar;
        g0.u.u(this, yVar);
    }

    public void setAdapter(d dVar) {
        setLayoutFrozen(false);
        d dVar2 = this.f1672l;
        if (dVar2 != null) {
            dVar2.f1699a.unregisterObserver(this.f1652b);
            Objects.requireNonNull(this.f1672l);
        }
        Z();
        a aVar = this.f1658e;
        aVar.l(aVar.f1849b);
        aVar.l(aVar.f1850c);
        d dVar3 = this.f1672l;
        this.f1672l = dVar;
        if (dVar != null) {
            dVar.f1699a.registerObserver(this.f1652b);
        }
        r rVar = this.f1654c;
        d dVar4 = this.f1672l;
        rVar.b();
        q d2 = rVar.d();
        Objects.requireNonNull(d2);
        if (dVar3 != null) {
            d2.f1736b--;
        }
        if (d2.f1736b == 0) {
            for (int i2 = 0; i2 < d2.f1735a.size(); i2++) {
                d2.f1735a.valueAt(i2).f1737a.clear();
            }
        }
        if (dVar4 != null) {
            d2.f1736b++;
        }
        this.f1659e0.f1771f = true;
        X(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(g gVar) {
        if (gVar != this.f1675m0) {
            this.f1675m0 = gVar;
            setChildrenDrawingOrderEnabled(gVar != null);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.f1664h) {
            N();
        }
        this.f1664h = z2;
        super.setClipToPadding(z2);
        if (this.f1688t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(h hVar) {
        Objects.requireNonNull(hVar);
        this.E = hVar;
        N();
    }

    public void setHasFixedSize(boolean z2) {
        this.f1686s = z2;
    }

    public void setItemAnimator(i iVar) {
        i iVar2 = this.J;
        if (iVar2 != null) {
            iVar2.f();
            this.J.f1701a = null;
        }
        this.J = iVar;
        if (iVar != null) {
            iVar.f1701a = this.f1669j0;
        }
    }

    public void setItemViewCacheSize(int i2) {
        r rVar = this.f1654c;
        rVar.f1745e = i2;
        rVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(l lVar) {
        if (lVar != this.f1674m) {
            l0();
            if (this.f1674m != null) {
                i iVar = this.J;
                if (iVar != null) {
                    iVar.f();
                }
                this.f1674m.o0(this.f1654c);
                this.f1674m.p0(this.f1654c);
                this.f1654c.b();
                if (this.f1684r) {
                    l lVar2 = this.f1674m;
                    r rVar = this.f1654c;
                    lVar2.f1716g = false;
                    lVar2.Z(this, rVar);
                }
                this.f1674m.C0((RecyclerView) null);
                this.f1674m = null;
            } else {
                this.f1654c.b();
            }
            c cVar = this.f1660f;
            c.a aVar = cVar.f1863b;
            aVar.f1865a = 0;
            c.a aVar2 = aVar.f1866b;
            if (aVar2 != null) {
                aVar2.g();
            }
            int size = cVar.f1864c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                w wVar = (w) cVar.f1862a;
                Objects.requireNonNull(wVar);
                z K2 = K(cVar.f1864c.get(size));
                if (K2 != null) {
                    wVar.f2001a.f0(K2, K2.f1803p);
                    K2.f1803p = 0;
                }
                cVar.f1864c.remove(size);
            }
            w wVar2 = (w) cVar.f1862a;
            int b2 = wVar2.b();
            for (int i2 = 0; i2 < b2; i2++) {
                View a2 = wVar2.a(i2);
                wVar2.f2001a.p(a2);
                a2.clearAnimation();
            }
            wVar2.f2001a.removeAllViews();
            this.f1674m = lVar;
            if (lVar != null) {
                if (lVar.f1711b == null) {
                    lVar.C0(this);
                    if (this.f1684r) {
                        this.f1674m.f1716g = true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(lVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(b.a(lVar.f1711b, sb));
                }
            }
            this.f1654c.l();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z2) {
        g0.i scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f3055d) {
            View view = scrollingChildHelper.f3054c;
            WeakHashMap<View, g0.x> weakHashMap = g0.u.f3063a;
            u.i.z(view);
        }
        scrollingChildHelper.f3055d = z2;
    }

    public void setOnFlingListener(n nVar) {
        this.S = nVar;
    }

    @Deprecated
    public void setOnScrollListener(p pVar) {
        this.f1661f0 = pVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.f1651a0 = z2;
    }

    public void setRecycledViewPool(q qVar) {
        r rVar = this.f1654c;
        q qVar2 = rVar.f1747g;
        if (qVar2 != null) {
            qVar2.f1736b--;
        }
        rVar.f1747g = qVar;
        if (qVar != null && RecyclerView.this.getAdapter() != null) {
            rVar.f1747g.f1736b++;
        }
    }

    public void setRecyclerListener(s sVar) {
        this.f1676n = sVar;
    }

    public void setScrollState(int i2) {
        v vVar;
        if (i2 != this.K) {
            this.K = i2;
            if (i2 != 2) {
                this.f1653b0.c();
                l lVar = this.f1674m;
                if (!(lVar == null || (vVar = lVar.f1714e) == null)) {
                    vVar.d();
                }
            }
            l lVar2 = this.f1674m;
            if (lVar2 != null) {
                lVar2.n0(i2);
            }
            p pVar = this.f1661f0;
            if (pVar != null) {
                pVar.a(this, i2);
            }
            List<p> list = this.f1663g0;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        this.f1663g0.get(size).a(this, i2);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i2) {
        int i3;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                i3 = viewConfiguration.getScaledPagingTouchSlop();
                this.R = i3;
            }
        }
        i3 = viewConfiguration.getScaledTouchSlop();
        this.R = i3;
    }

    public void setViewCacheExtension(x xVar) {
        Objects.requireNonNull(this.f1654c);
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().i(i2, 0);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().j(0);
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.f1693w) {
            i("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.f1693w = false;
                if (!(!this.f1692v || this.f1674m == null || this.f1672l == null)) {
                    requestLayout();
                }
                this.f1692v = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f1693w = true;
            this.f1694x = true;
            l0();
        }
    }

    public boolean t(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, (int[]) null, i4);
    }

    public final void u(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().f(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public void v(int i2, int i3) {
        this.D++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        p pVar = this.f1661f0;
        if (pVar != null) {
            pVar.b(this, i2, i3);
        }
        List<p> list = this.f1663g0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.f1663g0.get(size).b(this, i2, i3);
            }
        }
        this.D--;
    }

    public void w() {
        int i2;
        int i3;
        if (this.I == null) {
            EdgeEffect a2 = this.E.a(this);
            this.I = a2;
            if (this.f1664h) {
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            a2.setSize(i3, i2);
        }
    }

    public void x() {
        int i2;
        int i3;
        if (this.F == null) {
            EdgeEffect a2 = this.E.a(this);
            this.F = a2;
            if (this.f1664h) {
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            a2.setSize(i3, i2);
        }
    }

    public void y() {
        int i2;
        int i3;
        if (this.H == null) {
            EdgeEffect a2 = this.E.a(this);
            this.H = a2;
            if (this.f1664h) {
                i3 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i3 = getMeasuredHeight();
                i2 = getMeasuredWidth();
            }
            a2.setSize(i3, i2);
        }
    }

    public void z() {
        int i2;
        int i3;
        if (this.G == null) {
            EdgeEffect a2 = this.E.a(this);
            this.G = a2;
            if (this.f1664h) {
                i3 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i3 = getMeasuredWidth();
                i2 = getMeasuredHeight();
            }
            a2.setSize(i3, i2);
        }
    }
}
