package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f1862a;

    /* renamed from: b  reason: collision with root package name */
    public final a f1863b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f1864c = new ArrayList();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f1865a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f1866b;

        public void a(int i2) {
            if (i2 >= 64) {
                a aVar = this.f1866b;
                if (aVar != null) {
                    aVar.a(i2 - 64);
                    return;
                }
                return;
            }
            this.f1865a &= ~(1 << i2);
        }

        public int b(int i2) {
            long j2;
            a aVar = this.f1866b;
            if (aVar == null) {
                if (i2 >= 64) {
                    j2 = this.f1865a;
                }
                j2 = this.f1865a & ((1 << i2) - 1);
            } else {
                if (i2 >= 64) {
                    return Long.bitCount(this.f1865a) + aVar.b(i2 - 64);
                }
                j2 = this.f1865a & ((1 << i2) - 1);
            }
            return Long.bitCount(j2);
        }

        public final void c() {
            if (this.f1866b == null) {
                this.f1866b = new a();
            }
        }

        public boolean d(int i2) {
            if (i2 < 64) {
                return (this.f1865a & (1 << i2)) != 0;
            }
            c();
            return this.f1866b.d(i2 - 64);
        }

        public void e(int i2, boolean z2) {
            if (i2 >= 64) {
                c();
                this.f1866b.e(i2 - 64, z2);
                return;
            }
            long j2 = this.f1865a;
            boolean z3 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i2) - 1;
            this.f1865a = ((j2 & (~j3)) << 1) | (j2 & j3);
            if (z2) {
                h(i2);
            } else {
                a(i2);
            }
            if (z3 || this.f1866b != null) {
                c();
                this.f1866b.e(0, z3);
            }
        }

        public boolean f(int i2) {
            if (i2 >= 64) {
                c();
                return this.f1866b.f(i2 - 64);
            }
            long j2 = 1 << i2;
            long j3 = this.f1865a;
            boolean z2 = (j3 & j2) != 0;
            long j4 = j3 & (~j2);
            this.f1865a = j4;
            long j5 = j2 - 1;
            this.f1865a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
            a aVar = this.f1866b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f1866b.f(0);
            }
            return z2;
        }

        public void g() {
            this.f1865a = 0;
            a aVar = this.f1866b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i2) {
            if (i2 >= 64) {
                c();
                this.f1866b.h(i2 - 64);
                return;
            }
            this.f1865a |= 1 << i2;
        }

        public String toString() {
            if (this.f1866b == null) {
                return Long.toBinaryString(this.f1865a);
            }
            return this.f1866b.toString() + "xx" + Long.toBinaryString(this.f1865a);
        }
    }

    public interface b {
    }

    public c(b bVar) {
        this.f1862a = bVar;
    }

    public void a(View view, int i2, boolean z2) {
        int b2 = i2 < 0 ? ((w) this.f1862a).b() : f(i2);
        this.f1863b.e(b2, z2);
        if (z2) {
            i(view);
        }
        w wVar = (w) this.f1862a;
        wVar.f2001a.addView(view, b2);
        Objects.requireNonNull(wVar.f2001a);
        RecyclerView.K(view);
    }

    public void b(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z2) {
        int b2 = i2 < 0 ? ((w) this.f1862a).b() : f(i2);
        this.f1863b.e(b2, z2);
        if (z2) {
            i(view);
        }
        w wVar = (w) this.f1862a;
        Objects.requireNonNull(wVar);
        RecyclerView.z K = RecyclerView.K(view);
        if (K != null) {
            if (K.n() || K.t()) {
                K.f1797j &= -257;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(K);
                throw new IllegalArgumentException(b.a(wVar.f2001a, sb));
            }
        }
        wVar.f2001a.attachViewToParent(view, b2, layoutParams);
    }

    public void c(int i2) {
        RecyclerView.z K;
        int f2 = f(i2);
        this.f1863b.f(f2);
        w wVar = (w) this.f1862a;
        View childAt = wVar.f2001a.getChildAt(f2);
        if (!(childAt == null || (K = RecyclerView.K(childAt)) == null)) {
            if (!K.n() || K.t()) {
                K.b(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(K);
                throw new IllegalArgumentException(b.a(wVar.f2001a, sb));
            }
        }
        wVar.f2001a.detachViewFromParent(f2);
    }

    public View d(int i2) {
        return ((w) this.f1862a).a(f(i2));
    }

    public int e() {
        return ((w) this.f1862a).b() - this.f1864c.size();
    }

    public final int f(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int b2 = ((w) this.f1862a).b();
        int i3 = i2;
        while (i3 < b2) {
            int b3 = i2 - (i3 - this.f1863b.b(i3));
            if (b3 == 0) {
                while (this.f1863b.d(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += b3;
        }
        return -1;
    }

    public View g(int i2) {
        return ((w) this.f1862a).f2001a.getChildAt(i2);
    }

    public int h() {
        return ((w) this.f1862a).b();
    }

    public final void i(View view) {
        this.f1864c.add(view);
        w wVar = (w) this.f1862a;
        Objects.requireNonNull(wVar);
        RecyclerView.z K = RecyclerView.K(view);
        if (K != null) {
            RecyclerView recyclerView = wVar.f2001a;
            int i2 = K.f1804q;
            if (i2 == -1) {
                View view2 = K.f1788a;
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                i2 = u.d.c(view2);
            }
            K.f1803p = i2;
            recyclerView.f0(K, 4);
        }
    }

    public int j(View view) {
        int indexOfChild = ((w) this.f1862a).f2001a.indexOfChild(view);
        if (indexOfChild != -1 && !this.f1863b.d(indexOfChild)) {
            return indexOfChild - this.f1863b.b(indexOfChild);
        }
        return -1;
    }

    public boolean k(View view) {
        return this.f1864c.contains(view);
    }

    public final boolean l(View view) {
        if (!this.f1864c.remove(view)) {
            return false;
        }
        w wVar = (w) this.f1862a;
        Objects.requireNonNull(wVar);
        RecyclerView.z K = RecyclerView.K(view);
        if (K == null) {
            return true;
        }
        wVar.f2001a.f0(K, K.f1803p);
        K.f1803p = 0;
        return true;
    }

    public String toString() {
        return this.f1863b.toString() + ", hidden list:" + this.f1864c.size();
    }
}
