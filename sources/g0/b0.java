package g0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import g0.u;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

public class b0 {

    /* renamed from: b  reason: collision with root package name */
    public static final b0 f2998b = (Build.VERSION.SDK_INT >= 30 ? j.f3026q : k.f3027b);

    /* renamed from: a  reason: collision with root package name */
    public final k f2999a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f3000a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f3001b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f3002c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f3003d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3000a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3001b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3002c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                StringBuilder a2 = androidx.activity.result.a.a("Failed to get visible insets from AttachInfo ");
                a2.append(e2.getMessage());
                Log.w("WindowInsetsCompat", a2.toString(), e2);
            }
        }
    }

    public static class b extends e {

        /* renamed from: d  reason: collision with root package name */
        public static Field f3004d = null;

        /* renamed from: e  reason: collision with root package name */
        public static boolean f3005e = false;

        /* renamed from: f  reason: collision with root package name */
        public static Constructor<WindowInsets> f3006f = null;

        /* renamed from: g  reason: collision with root package name */
        public static boolean f3007g = false;

        /* renamed from: b  reason: collision with root package name */
        public WindowInsets f3008b;

        /* renamed from: c  reason: collision with root package name */
        public z.b f3009c;

        public b() {
            this.f3008b = e();
        }

        public b(b0 b0Var) {
            super(b0Var);
            this.f3008b = b0Var.h();
        }

        public static WindowInsets e() {
            if (!f3005e) {
                try {
                    f3004d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f3005e = true;
            }
            Field field = f3004d;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f3007g) {
                try {
                    f3006f = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f3007g = true;
            }
            Constructor<WindowInsets> constructor = f3006f;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        public b0 b() {
            a();
            b0 i2 = b0.i(this.f3008b);
            i2.f2999a.o((z.b[]) null);
            i2.f2999a.q(this.f3009c);
            return i2;
        }

        public void c(z.b bVar) {
            this.f3009c = bVar;
        }

        public void d(z.b bVar) {
            WindowInsets windowInsets = this.f3008b;
            if (windowInsets != null) {
                this.f3008b = windowInsets.replaceSystemWindowInsets(bVar.f4392a, bVar.f4393b, bVar.f4394c, bVar.f4395d);
            }
        }
    }

    public static class c extends e {

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsets.Builder f3010b;

        public c() {
            this.f3010b = new WindowInsets.Builder();
        }

        public c(b0 b0Var) {
            super(b0Var);
            WindowInsets.Builder builder;
            WindowInsets h2 = b0Var.h();
            if (h2 == null) {
                builder = new WindowInsets.Builder();
            }
            this.f3010b = builder;
        }

        public b0 b() {
            a();
            b0 i2 = b0.i(this.f3010b.build());
            i2.f2999a.o((z.b[]) null);
            return i2;
        }

        public void c(z.b bVar) {
            this.f3010b.setStableInsets(bVar.d());
        }

        public void d(z.b bVar) {
            this.f3010b.setSystemWindowInsets(bVar.d());
        }
    }

    public static class d extends c {
        public d() {
        }

        public d(b0 b0Var) {
            super(b0Var);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final b0 f3011a;

        public e() {
            this(new b0((b0) null));
        }

        public e(b0 b0Var) {
            this.f3011a = b0Var;
        }

        public final void a() {
        }

        public b0 b() {
            throw null;
        }

        public void c(z.b bVar) {
            throw null;
        }

        public void d(z.b bVar) {
            throw null;
        }
    }

    public static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f3012h = false;

        /* renamed from: i  reason: collision with root package name */
        public static Method f3013i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f3014j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f3015k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f3016l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f3017c;

        /* renamed from: d  reason: collision with root package name */
        public z.b[] f3018d;

        /* renamed from: e  reason: collision with root package name */
        public z.b f3019e = null;

        /* renamed from: f  reason: collision with root package name */
        public b0 f3020f;

        /* renamed from: g  reason: collision with root package name */
        public z.b f3021g;

        public f(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var);
            this.f3017c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        public static void v() {
            try {
                f3013i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3014j = cls;
                f3015k = cls.getDeclaredField("mVisibleInsets");
                f3016l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3015k.setAccessible(true);
                f3016l.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                StringBuilder a2 = androidx.activity.result.a.a("Failed to get visible insets. (Reflection error). ");
                a2.append(e2.getMessage());
                Log.e("WindowInsetsCompat", a2.toString(), e2);
            }
            f3012h = true;
        }

        public void d(View view) {
            z.b u2 = u(view);
            if (u2 == null) {
                u2 = z.b.f4391e;
            }
            w(u2);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f3021g, ((f) obj).f3021g);
        }

        public z.b f(int i2) {
            return r(i2, false);
        }

        public final z.b j() {
            if (this.f3019e == null) {
                this.f3019e = z.b.b(this.f3017c.getSystemWindowInsetLeft(), this.f3017c.getSystemWindowInsetTop(), this.f3017c.getSystemWindowInsetRight(), this.f3017c.getSystemWindowInsetBottom());
            }
            return this.f3019e;
        }

        public b0 l(int i2, int i3, int i4, int i5) {
            b0 i6 = b0.i(this.f3017c);
            int i7 = Build.VERSION.SDK_INT;
            e dVar = i7 >= 30 ? new d(i6) : i7 >= 29 ? new c(i6) : new b(i6);
            dVar.d(b0.f(j(), i2, i3, i4, i5));
            dVar.c(b0.f(h(), i2, i3, i4, i5));
            return dVar.b();
        }

        public boolean n() {
            return this.f3017c.isRound();
        }

        public void o(z.b[] bVarArr) {
            this.f3018d = bVarArr;
        }

        public void p(b0 b0Var) {
            this.f3020f = b0Var;
        }

        @SuppressLint({"WrongConstant"})
        public final z.b r(int i2, boolean z2) {
            z.b bVar = z.b.f4391e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    bVar = z.b.a(bVar, s(i3, z2));
                }
            }
            return bVar;
        }

        public z.b s(int i2, boolean z2) {
            int i3;
            d dVar;
            int i4 = 0;
            if (i2 == 1) {
                return z2 ? z.b.b(0, Math.max(t().f4393b, j().f4393b), 0, 0) : z.b.b(0, j().f4393b, 0, 0);
            }
            z.b bVar = null;
            if (i2 != 2) {
                if (i2 == 8) {
                    z.b[] bVarArr = this.f3018d;
                    if (bVarArr != null) {
                        bVar = bVarArr[l.a(8)];
                    }
                    if (bVar != null) {
                        return bVar;
                    }
                    z.b j2 = j();
                    z.b t2 = t();
                    int i5 = j2.f4395d;
                    if (i5 > t2.f4395d) {
                        return z.b.b(0, 0, 0, i5);
                    }
                    z.b bVar2 = this.f3021g;
                    return (bVar2 == null || bVar2.equals(z.b.f4391e) || (i3 = this.f3021g.f4395d) <= t2.f4395d) ? z.b.f4391e : z.b.b(0, 0, 0, i3);
                } else if (i2 == 16) {
                    return i();
                } else {
                    if (i2 == 32) {
                        return g();
                    }
                    if (i2 == 64) {
                        return k();
                    }
                    if (i2 != 128) {
                        return z.b.f4391e;
                    }
                    b0 b0Var = this.f3020f;
                    if (b0Var != null) {
                        dVar = b0Var.f2999a.e();
                    } else {
                        dVar = e();
                    }
                    if (dVar == null) {
                        return z.b.f4391e;
                    }
                    int i6 = Build.VERSION.SDK_INT;
                    int safeInsetLeft = i6 >= 28 ? ((DisplayCutout) dVar.f3046a).getSafeInsetLeft() : 0;
                    int safeInsetTop = i6 >= 28 ? ((DisplayCutout) dVar.f3046a).getSafeInsetTop() : 0;
                    int safeInsetRight = i6 >= 28 ? ((DisplayCutout) dVar.f3046a).getSafeInsetRight() : 0;
                    if (i6 >= 28) {
                        i4 = ((DisplayCutout) dVar.f3046a).getSafeInsetBottom();
                    }
                    return z.b.b(safeInsetLeft, safeInsetTop, safeInsetRight, i4);
                }
            } else if (z2) {
                z.b t3 = t();
                z.b h2 = h();
                return z.b.b(Math.max(t3.f4392a, h2.f4392a), 0, Math.max(t3.f4394c, h2.f4394c), Math.max(t3.f4395d, h2.f4395d));
            } else {
                z.b j3 = j();
                b0 b0Var2 = this.f3020f;
                if (b0Var2 != null) {
                    bVar = b0Var2.f2999a.h();
                }
                int i7 = j3.f4395d;
                if (bVar != null) {
                    i7 = Math.min(i7, bVar.f4395d);
                }
                return z.b.b(j3.f4392a, 0, j3.f4394c, i7);
            }
        }

        public final z.b t() {
            b0 b0Var = this.f3020f;
            if (b0Var != null) {
                return b0Var.f2999a.h();
            }
            return z.b.f4391e;
        }

        public final z.b u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f3012h) {
                    v();
                }
                Method method = f3013i;
                if (!(method == null || f3014j == null || f3015k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f3015k.get(f3016l.get(invoke));
                        if (rect != null) {
                            return z.b.b(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e2) {
                        StringBuilder a2 = androidx.activity.result.a.a("Failed to get visible insets. (Reflection error). ");
                        a2.append(e2.getMessage());
                        Log.e("WindowInsetsCompat", a2.toString(), e2);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        public void w(z.b bVar) {
            this.f3021g = bVar;
        }
    }

    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public z.b f3022m = null;

        public g(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        public b0 b() {
            return b0.i(this.f3017c.consumeStableInsets());
        }

        public b0 c() {
            return b0.i(this.f3017c.consumeSystemWindowInsets());
        }

        public final z.b h() {
            if (this.f3022m == null) {
                this.f3022m = z.b.b(this.f3017c.getStableInsetLeft(), this.f3017c.getStableInsetTop(), this.f3017c.getStableInsetRight(), this.f3017c.getStableInsetBottom());
            }
            return this.f3022m;
        }

        public boolean m() {
            return this.f3017c.isConsumed();
        }

        public void q(z.b bVar) {
            this.f3022m = bVar;
        }
    }

    public static class h extends g {
        public h(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        public b0 a() {
            return b0.i(this.f3017c.consumeDisplayCutout());
        }

        public d e() {
            DisplayCutout displayCutout = this.f3017c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new d(displayCutout);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f3017c, hVar.f3017c) && Objects.equals(this.f3021g, hVar.f3021g);
        }

        public int hashCode() {
            return this.f3017c.hashCode();
        }
    }

    public static class i extends h {

        /* renamed from: n  reason: collision with root package name */
        public z.b f3023n = null;

        /* renamed from: o  reason: collision with root package name */
        public z.b f3024o = null;

        /* renamed from: p  reason: collision with root package name */
        public z.b f3025p = null;

        public i(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        public z.b g() {
            if (this.f3024o == null) {
                this.f3024o = z.b.c(this.f3017c.getMandatorySystemGestureInsets());
            }
            return this.f3024o;
        }

        public z.b i() {
            if (this.f3023n == null) {
                this.f3023n = z.b.c(this.f3017c.getSystemGestureInsets());
            }
            return this.f3023n;
        }

        public z.b k() {
            if (this.f3025p == null) {
                this.f3025p = z.b.c(this.f3017c.getTappableElementInsets());
            }
            return this.f3025p;
        }

        public b0 l(int i2, int i3, int i4, int i5) {
            return b0.i(this.f3017c.inset(i2, i3, i4, i5));
        }

        public void q(z.b bVar) {
        }
    }

    public static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        public static final b0 f3026q = b0.i(WindowInsets.CONSUMED);

        public j(b0 b0Var, WindowInsets windowInsets) {
            super(b0Var, windowInsets);
        }

        public final void d(View view) {
        }

        public z.b f(int i2) {
            return z.b.c(this.f3017c.getInsets(m.a(i2)));
        }
    }

    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final b0 f3027b;

        /* renamed from: a  reason: collision with root package name */
        public final b0 f3028a;

        static {
            int i2 = Build.VERSION.SDK_INT;
            f3027b = (i2 >= 30 ? new d() : i2 >= 29 ? new c() : new b()).b().f2999a.a().f2999a.b().f2999a.c();
        }

        public k(b0 b0Var) {
            this.f3028a = b0Var;
        }

        public b0 a() {
            return this.f3028a;
        }

        public b0 b() {
            return this.f3028a;
        }

        public b0 c() {
            return this.f3028a;
        }

        public void d(View view) {
        }

        public d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (n() != kVar.n() || m() != kVar.m() || !Objects.equals(j(), kVar.j()) || !Objects.equals(h(), kVar.h()) || !Objects.equals(e(), kVar.e())) {
                return false;
            }
            return true;
        }

        public z.b f(int i2) {
            return z.b.f4391e;
        }

        public z.b g() {
            return j();
        }

        public z.b h() {
            return z.b.f4391e;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e()});
        }

        public z.b i() {
            return j();
        }

        public z.b j() {
            return z.b.f4391e;
        }

        public z.b k() {
            return j();
        }

        public b0 l(int i2, int i3, int i4, int i5) {
            return f3027b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(z.b[] bVarArr) {
        }

        public void p(b0 b0Var) {
        }

        public void q(z.b bVar) {
        }
    }

    public static final class l {
        public static int a(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 4;
            }
            if (i2 == 32) {
                return 5;
            }
            if (i2 == 64) {
                return 6;
            }
            if (i2 == 128) {
                return 7;
            }
            if (i2 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i2);
        }
    }

    public static final class m {
        public static int a(int i2) {
            int i3;
            int i4 = 0;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i2 & i5) != 0) {
                    if (i5 == 1) {
                        i3 = WindowInsets.Type.statusBars();
                    } else if (i5 == 2) {
                        i3 = WindowInsets.Type.navigationBars();
                    } else if (i5 == 4) {
                        i3 = WindowInsets.Type.captionBar();
                    } else if (i5 == 8) {
                        i3 = WindowInsets.Type.ime();
                    } else if (i5 == 16) {
                        i3 = WindowInsets.Type.systemGestures();
                    } else if (i5 == 32) {
                        i3 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i5 == 64) {
                        i3 = WindowInsets.Type.tappableElement();
                    } else if (i5 == 128) {
                        i3 = WindowInsets.Type.displayCutout();
                    }
                    i4 |= i3;
                }
            }
            return i4;
        }
    }

    public b0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        this.f2999a = i2 >= 30 ? new j(this, windowInsets) : i2 >= 29 ? new i(this, windowInsets) : i2 >= 28 ? new h(this, windowInsets) : new g(this, windowInsets);
    }

    public b0(b0 b0Var) {
        this.f2999a = new k(this);
    }

    public static z.b f(z.b bVar, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, bVar.f4392a - i2);
        int max2 = Math.max(0, bVar.f4393b - i3);
        int max3 = Math.max(0, bVar.f4394c - i4);
        int max4 = Math.max(0, bVar.f4395d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? bVar : z.b.b(max, max2, max3, max4);
    }

    public static b0 i(WindowInsets windowInsets) {
        return j(windowInsets, (View) null);
    }

    public static b0 j(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        b0 b0Var = new b0(windowInsets);
        if (view != null) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (u.g.b(view)) {
                b0Var.f2999a.p(Build.VERSION.SDK_INT >= 23 ? u.j.a(view) : u.i.j(view));
                b0Var.f2999a.d(view.getRootView());
            }
        }
        return b0Var;
    }

    public z.b a(int i2) {
        return this.f2999a.f(i2);
    }

    @Deprecated
    public int b() {
        return this.f2999a.j().f4395d;
    }

    @Deprecated
    public int c() {
        return this.f2999a.j().f4392a;
    }

    @Deprecated
    public int d() {
        return this.f2999a.j().f4394c;
    }

    @Deprecated
    public int e() {
        return this.f2999a.j().f4393b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        return Objects.equals(this.f2999a, ((b0) obj).f2999a);
    }

    public boolean g() {
        return this.f2999a.m();
    }

    public WindowInsets h() {
        k kVar = this.f2999a;
        if (kVar instanceof f) {
            return ((f) kVar).f3017c;
        }
        return null;
    }

    public int hashCode() {
        k kVar = this.f2999a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}
