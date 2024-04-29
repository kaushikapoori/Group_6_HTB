package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.b;
import g0.u;
import g0.x;
import h0.d;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public m0.c f2138a;

    /* renamed from: b  reason: collision with root package name */
    public b f2139b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2140c;

    /* renamed from: d  reason: collision with root package name */
    public int f2141d = 2;

    /* renamed from: e  reason: collision with root package name */
    public float f2142e = 0.5f;

    /* renamed from: f  reason: collision with root package name */
    public float f2143f = 0.0f;

    /* renamed from: g  reason: collision with root package name */
    public float f2144g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    public final c.C0044c f2145h = new a();

    public class a extends c.C0044c {

        /* renamed from: a  reason: collision with root package name */
        public int f2146a;

        /* renamed from: b  reason: collision with root package name */
        public int f2147b = -1;

        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            if (r5 != false) goto L_0x001e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
            if (r5 != false) goto L_0x0014;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
            r5 = r2.f2146a;
            r3 = r3.getWidth() + r5;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                java.util.WeakHashMap<android.view.View, g0.x> r5 = g0.u.f3063a
                int r5 = g0.u.e.d(r3)
                r0 = 1
                if (r5 != r0) goto L_0x000b
                r5 = 1
                goto L_0x000c
            L_0x000b:
                r5 = 0
            L_0x000c:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.f2141d
                if (r1 != 0) goto L_0x0026
                if (r5 == 0) goto L_0x001e
            L_0x0014:
                int r5 = r2.f2146a
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.f2146a
                goto L_0x0039
            L_0x001e:
                int r5 = r2.f2146a
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L_0x0039
            L_0x0026:
                if (r1 != r0) goto L_0x002b
                if (r5 == 0) goto L_0x0014
                goto L_0x001e
            L_0x002b:
                int r5 = r2.f2146a
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.f2146a
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L_0x0039:
                int r4 = java.lang.Math.max(r5, r4)
                int r3 = java.lang.Math.min(r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int, int):int");
        }

        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        public int c(View view) {
            return view.getWidth();
        }

        public void e(View view, int i2) {
            this.f2147b = i2;
            this.f2146a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public void f(int i2) {
            b bVar = SwipeDismissBehavior.this.f2139b;
            if (bVar != null) {
                com.google.android.material.snackbar.a aVar = (com.google.android.material.snackbar.a) bVar;
                Objects.requireNonNull(aVar);
                if (i2 == 0) {
                    com.google.android.material.snackbar.b a2 = com.google.android.material.snackbar.b.a();
                    Objects.requireNonNull(aVar.f2506a);
                    synchronized (a2.f2508a) {
                        a2.b((b.C0019b) null);
                    }
                } else if (i2 == 1 || i2 == 2) {
                    com.google.android.material.snackbar.b a3 = com.google.android.material.snackbar.b.a();
                    Objects.requireNonNull(aVar.f2506a);
                    synchronized (a3.f2508a) {
                        a3.b((b.C0019b) null);
                    }
                }
            }
        }

        public void g(View view, int i2, int i3, int i4, int i5) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.f2143f) + ((float) this.f2146a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.f2144g) + ((float) this.f2146a);
            float f2 = (float) i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.t(0.0f, 1.0f - ((f2 - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0056, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f2146a) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f2148c.f2142e)) goto L_0x002c;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0085  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f2147b = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x003c
                java.util.WeakHashMap<android.view.View, g0.x> r4 = g0.u.f3063a
                int r4 = g0.u.e.d(r8)
                if (r4 != r2) goto L_0x0018
                r4 = 1
                goto L_0x0019
            L_0x0018:
                r4 = 0
            L_0x0019:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f2141d
                r6 = 2
                if (r5 != r6) goto L_0x0021
                goto L_0x002c
            L_0x0021:
                if (r5 != 0) goto L_0x0030
                if (r4 == 0) goto L_0x002a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002e
                goto L_0x002c
            L_0x002a:
                if (r3 <= 0) goto L_0x002e
            L_0x002c:
                r9 = 1
                goto L_0x0059
            L_0x002e:
                r9 = 0
                goto L_0x0059
            L_0x0030:
                if (r5 != r2) goto L_0x002e
                if (r4 == 0) goto L_0x0037
                if (r3 <= 0) goto L_0x002e
                goto L_0x003b
            L_0x0037:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002e
            L_0x003b:
                goto L_0x002c
            L_0x003c:
                int r9 = r8.getLeft()
                int r0 = r7.f2146a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.f2142e
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L_0x002e
                goto L_0x002c
            L_0x0059:
                if (r9 == 0) goto L_0x0068
                int r9 = r8.getLeft()
                int r0 = r7.f2146a
                if (r9 >= r0) goto L_0x0065
                int r0 = r0 - r10
                goto L_0x0066
            L_0x0065:
                int r0 = r0 + r10
            L_0x0066:
                r1 = 1
                goto L_0x006a
            L_0x0068:
                int r0 = r7.f2146a
            L_0x006a:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                m0.c r9 = r9.f2138a
                int r10 = r8.getTop()
                boolean r9 = r9.t(r0, r10)
                if (r9 == 0) goto L_0x0085
                com.google.android.material.behavior.SwipeDismissBehavior$c r9 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r1)
                java.util.WeakHashMap<android.view.View, g0.x> r10 = g0.u.f3063a
                g0.u.d.m(r8, r9)
                goto L_0x0092
            L_0x0085:
                if (r1 == 0) goto L_0x0092
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = r9.f2139b
                if (r9 == 0) goto L_0x0092
                com.google.android.material.snackbar.a r9 = (com.google.android.material.snackbar.a) r9
                r9.a(r8)
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        public boolean i(View view, int i2) {
            int i3 = this.f2147b;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.s(view);
        }
    }

    public interface b {
    }

    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final View f2149b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f2150c;

        public c(View view, boolean z2) {
            this.f2149b = view;
            this.f2150c = z2;
        }

        public void run() {
            b bVar;
            m0.c cVar = SwipeDismissBehavior.this.f2138a;
            if (cVar != null && cVar.i(true)) {
                View view = this.f2149b;
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                u.d.m(view, this);
            } else if (this.f2150c && (bVar = SwipeDismissBehavior.this.f2139b) != null) {
                ((com.google.android.material.snackbar.a) bVar).a(this.f2149b);
            }
        }
    }

    public static float t(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    public boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        boolean z2 = this.f2140c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z2 = coordinatorLayout.p(v2, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f2140c = z2;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f2140c = false;
        }
        if (!z2) {
            return false;
        }
        if (this.f2138a == null) {
            this.f2138a = new m0.c(coordinatorLayout.getContext(), coordinatorLayout, this.f2145h);
        }
        return this.f2138a.u(motionEvent);
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (u.d.c(v2) == 0) {
            u.d.s(v2, 1);
            u.r(1048576, v2);
            u.m(v2, 0);
            if (s(v2)) {
                u.s(v2, d.a.f3168j, (CharSequence) null, new a(this));
            }
        }
        return false;
    }

    public boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
        m0.c cVar = this.f2138a;
        if (cVar == null) {
            return false;
        }
        cVar.n(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
