package d;

import android.app.Activity;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.r0;
import com.example.supermarket.R;
import g0.b0;
import g0.u;
import g0.x;
import g0.y;
import g0.z;
import h.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public class k extends j implements e.a, LayoutInflater.Factory2 {
    public static final m.h<String, Integer> Z = new m.h<>();

    /* renamed from: a0  reason: collision with root package name */
    public static final int[] f2705a0 = {16842836};

    /* renamed from: b0  reason: collision with root package name */
    public static final boolean f2706b0 = (!"robolectric".equals(Build.FINGERPRINT));

    /* renamed from: c0  reason: collision with root package name */
    public static final boolean f2707c0 = true;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public i[] F;
    public i G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public Configuration L;
    public int M = -100;
    public int N;
    public boolean O;
    public boolean P;
    public f Q;
    public f R;
    public boolean S;
    public int T;
    public final Runnable U = new a();
    public boolean V;
    public Rect W;
    public Rect X;
    public q Y;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2708d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f2709e;

    /* renamed from: f  reason: collision with root package name */
    public Window f2710f;

    /* renamed from: g  reason: collision with root package name */
    public d f2711g;

    /* renamed from: h  reason: collision with root package name */
    public final i f2712h;

    /* renamed from: i  reason: collision with root package name */
    public a f2713i;

    /* renamed from: j  reason: collision with root package name */
    public MenuInflater f2714j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f2715k;

    /* renamed from: l  reason: collision with root package name */
    public g0 f2716l;

    /* renamed from: m  reason: collision with root package name */
    public b f2717m;

    /* renamed from: n  reason: collision with root package name */
    public j f2718n;

    /* renamed from: o  reason: collision with root package name */
    public h.a f2719o;

    /* renamed from: p  reason: collision with root package name */
    public ActionBarContextView f2720p;

    /* renamed from: q  reason: collision with root package name */
    public PopupWindow f2721q;

    /* renamed from: r  reason: collision with root package name */
    public Runnable f2722r;

    /* renamed from: s  reason: collision with root package name */
    public x f2723s = null;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2724t;

    /* renamed from: u  reason: collision with root package name */
    public ViewGroup f2725u;

    /* renamed from: v  reason: collision with root package name */
    public TextView f2726v;

    /* renamed from: w  reason: collision with root package name */
    public View f2727w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2728x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2729y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f2730z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            k kVar = k.this;
            if ((kVar.T & 1) != 0) {
                kVar.H(0);
            }
            k kVar2 = k.this;
            if ((kVar2.T & 4096) != 0) {
                kVar2.H(108);
            }
            k kVar3 = k.this;
            kVar3.S = false;
            kVar3.T = 0;
        }
    }

    public final class b implements i.a {
        public b() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
            k.this.D(eVar);
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback O = k.this.O();
            if (O == null) {
                return true;
            }
            O.onMenuOpened(108, eVar);
            return true;
        }
    }

    public class c implements a.C0033a {

        /* renamed from: a  reason: collision with root package name */
        public a.C0033a f2733a;

        public class a extends z {
            public a() {
            }

            public void a(View view) {
                k.this.f2720p.setVisibility(8);
                k kVar = k.this;
                PopupWindow popupWindow = kVar.f2721q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (kVar.f2720p.getParent() instanceof View) {
                    WeakHashMap<View, x> weakHashMap = u.f3063a;
                    u.h.c((View) k.this.f2720p.getParent());
                }
                k.this.f2720p.h();
                k.this.f2723s.d((y) null);
                k kVar2 = k.this;
                kVar2.f2723s = null;
                ViewGroup viewGroup = kVar2.f2725u;
                WeakHashMap<View, x> weakHashMap2 = u.f3063a;
                u.h.c(viewGroup);
            }
        }

        public c(a.C0033a aVar) {
            this.f2733a = aVar;
        }

        public boolean a(h.a aVar, Menu menu) {
            ViewGroup viewGroup = k.this.f2725u;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.h.c(viewGroup);
            return this.f2733a.a(aVar, menu);
        }

        public boolean b(h.a aVar, MenuItem menuItem) {
            return this.f2733a.b(aVar, menuItem);
        }

        public void c(h.a aVar) {
            this.f2733a.c(aVar);
            k kVar = k.this;
            if (kVar.f2721q != null) {
                kVar.f2710f.getDecorView().removeCallbacks(k.this.f2722r);
            }
            k kVar2 = k.this;
            if (kVar2.f2720p != null) {
                kVar2.I();
                k kVar3 = k.this;
                x b2 = u.b(kVar3.f2720p);
                b2.a(0.0f);
                kVar3.f2723s = b2;
                x xVar = k.this.f2723s;
                a aVar2 = new a();
                View view = (View) xVar.f3085a.get();
                if (view != null) {
                    xVar.e(view, aVar2);
                }
            }
            k kVar4 = k.this;
            i iVar = kVar4.f2712h;
            if (iVar != null) {
                iVar.i(kVar4.f2719o);
            }
            k kVar5 = k.this;
            kVar5.f2719o = null;
            ViewGroup viewGroup = kVar5.f2725u;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.h.c(viewGroup);
        }

        public boolean d(h.a aVar, Menu menu) {
            return this.f2733a.d(aVar, menu);
        }
    }

    public class e extends f {

        /* renamed from: c  reason: collision with root package name */
        public final PowerManager f2737c;

        public e(Context context) {
            super();
            this.f2737c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        public int c() {
            return this.f2737c.isPowerSaveMode() ? 2 : 1;
        }

        public void d() {
            k.this.z();
        }
    }

    public abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public BroadcastReceiver f2739a;

        public class a extends BroadcastReceiver {
            public a() {
            }

            public void onReceive(Context context, Intent intent) {
                f.this.d();
            }
        }

        public f() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f2739a;
            if (broadcastReceiver != null) {
                try {
                    k.this.f2709e.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f2739a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter b2 = b();
            if (b2 != null && b2.countActions() != 0) {
                if (this.f2739a == null) {
                    this.f2739a = new a();
                }
                k.this.f2709e.registerReceiver(this.f2739a, b2);
            }
        }
    }

    public class g extends f {

        /* renamed from: c  reason: collision with root package name */
        public final u f2742c;

        public g(u uVar) {
            super();
            this.f2742c = uVar;
        }

        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:47:0x00ec A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int c() {
            /*
                r22 = this;
                r0 = r22
                d.u r1 = r0.f2742c
                d.u$a r2 = r1.f2799c
                long r3 = r2.f2801b
                long r5 = java.lang.System.currentTimeMillis()
                r7 = 0
                r8 = 1
                int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r9 <= 0) goto L_0x0014
                r3 = 1
                goto L_0x0015
            L_0x0014:
                r3 = 0
            L_0x0015:
                if (r3 == 0) goto L_0x001b
            L_0x0017:
                boolean r1 = r2.f2800a
                goto L_0x00ea
            L_0x001b:
                android.content.Context r3 = r1.f2797a
                java.lang.String r4 = "android.permission.ACCESS_COARSE_LOCATION"
                int r3 = c.a.e(r3, r4)
                r4 = 0
                if (r3 != 0) goto L_0x002d
                java.lang.String r3 = "network"
                android.location.Location r3 = r1.a(r3)
                goto L_0x002e
            L_0x002d:
                r3 = r4
            L_0x002e:
                android.content.Context r5 = r1.f2797a
                java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
                int r5 = c.a.e(r5, r6)
                if (r5 != 0) goto L_0x003e
                java.lang.String r4 = "gps"
                android.location.Location r4 = r1.a(r4)
            L_0x003e:
                if (r4 == 0) goto L_0x004f
                if (r3 == 0) goto L_0x004f
                long r5 = r4.getTime()
                long r9 = r3.getTime()
                int r11 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r11 <= 0) goto L_0x0052
                goto L_0x0051
            L_0x004f:
                if (r4 == 0) goto L_0x0052
            L_0x0051:
                r3 = r4
            L_0x0052:
                if (r3 == 0) goto L_0x00d0
                d.u$a r1 = r1.f2799c
                long r4 = java.lang.System.currentTimeMillis()
                d.t r6 = d.t.f2792d
                if (r6 != 0) goto L_0x0065
                d.t r6 = new d.t
                r6.<init>()
                d.t.f2792d = r6
            L_0x0065:
                d.t r6 = d.t.f2792d
                r16 = 86400000(0x5265c00, double:4.2687272E-316)
                long r10 = r4 - r16
                double r12 = r3.getLatitude()
                double r14 = r3.getLongitude()
                r9 = r6
                r9.a(r10, r12, r14)
                double r12 = r3.getLatitude()
                double r14 = r3.getLongitude()
                r10 = r4
                r9.a(r10, r12, r14)
                int r9 = r6.f2795c
                if (r9 != r8) goto L_0x0089
                r7 = 1
            L_0x0089:
                long r14 = r6.f2794b
                long r12 = r6.f2793a
                long r10 = r4 + r16
                double r16 = r3.getLatitude()
                double r18 = r3.getLongitude()
                r9 = r6
                r20 = r12
                r12 = r16
                r16 = r14
                r14 = r18
                r9.a(r10, r12, r14)
                long r9 = r6.f2794b
                r11 = 0
                r13 = -1
                int r3 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
                if (r3 == 0) goto L_0x00c6
                int r3 = (r20 > r13 ? 1 : (r20 == r13 ? 0 : -1))
                if (r3 != 0) goto L_0x00b2
                goto L_0x00c6
            L_0x00b2:
                int r3 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
                if (r3 <= 0) goto L_0x00b8
                long r9 = r9 + r11
                goto L_0x00c1
            L_0x00b8:
                int r3 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
                if (r3 <= 0) goto L_0x00bf
                long r9 = r20 + r11
                goto L_0x00c1
            L_0x00bf:
                long r9 = r16 + r11
            L_0x00c1:
                r3 = 60000(0xea60, double:2.9644E-319)
                long r9 = r9 + r3
                goto L_0x00ca
            L_0x00c6:
                r9 = 43200000(0x2932e00, double:2.1343636E-316)
                long r9 = r9 + r4
            L_0x00ca:
                r1.f2800a = r7
                r1.f2801b = r9
                goto L_0x0017
            L_0x00d0:
                java.lang.String r1 = "TwilightManager"
                java.lang.String r2 = "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values."
                android.util.Log.i(r1, r2)
                java.util.Calendar r1 = java.util.Calendar.getInstance()
                r2 = 11
                int r1 = r1.get(r2)
                r2 = 6
                if (r1 < r2) goto L_0x00e8
                r2 = 22
                if (r1 < r2) goto L_0x00e9
            L_0x00e8:
                r7 = 1
            L_0x00e9:
                r1 = r7
            L_0x00ea:
                if (r1 == 0) goto L_0x00ed
                r8 = 2
            L_0x00ed:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: d.k.g.c():int");
        }

        public void d() {
            k.this.z();
        }
    }

    public class h extends ContentFrameLayout {
        public h(Context context) {
            super(context, (AttributeSet) null);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return k.this.G(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x2 = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                if (x2 < -5 || y2 < -5 || x2 > getWidth() + 5 || y2 > getHeight() + 5) {
                    k kVar = k.this;
                    kVar.E(kVar.N(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        public void setBackgroundResource(int i2) {
            setBackgroundDrawable(e.a.b(getContext(), i2));
        }
    }

    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public int f2745a;

        /* renamed from: b  reason: collision with root package name */
        public int f2746b;

        /* renamed from: c  reason: collision with root package name */
        public int f2747c;

        /* renamed from: d  reason: collision with root package name */
        public int f2748d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f2749e;

        /* renamed from: f  reason: collision with root package name */
        public View f2750f;

        /* renamed from: g  reason: collision with root package name */
        public View f2751g;

        /* renamed from: h  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f2752h;

        /* renamed from: i  reason: collision with root package name */
        public androidx.appcompat.view.menu.c f2753i;

        /* renamed from: j  reason: collision with root package name */
        public Context f2754j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f2755k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2756l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2757m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f2758n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f2759o;

        /* renamed from: p  reason: collision with root package name */
        public Bundle f2760p;

        public i(int i2) {
            this.f2745a = i2;
        }

        public void a(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f2752h;
            if (eVar != eVar2) {
                if (eVar2 != null) {
                    eVar2.t(this.f2753i);
                }
                this.f2752h = eVar;
                if (eVar != null && (cVar = this.f2753i) != null) {
                    eVar.b(cVar, eVar.f216a);
                }
            }
        }
    }

    public final class j implements i.a {
        public j() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
            androidx.appcompat.view.menu.e k2 = eVar.k();
            boolean z3 = k2 != eVar;
            k kVar = k.this;
            if (z3) {
                eVar = k2;
            }
            i L = kVar.L(eVar);
            if (L == null) {
                return;
            }
            if (z3) {
                k.this.C(L.f2745a, L, k2);
                k.this.E(L, true);
                return;
            }
            k.this.E(L, z2);
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback O;
            if (eVar != eVar.k()) {
                return true;
            }
            k kVar = k.this;
            if (!kVar.f2730z || (O = kVar.O()) == null || k.this.K) {
                return true;
            }
            O.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(android.content.Context r4, android.view.Window r5, d.i r6, java.lang.Object r7) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.f2723s = r0
            r1 = -100
            r3.M = r1
            d.k$a r2 = new d.k$a
            r2.<init>()
            r3.U = r2
            r3.f2709e = r4
            r3.f2712h = r6
            r3.f2708d = r7
            boolean r6 = r7 instanceof android.app.Dialog
            if (r6 == 0) goto L_0x003c
        L_0x001b:
            if (r4 == 0) goto L_0x002f
            boolean r6 = r4 instanceof d.h
            if (r6 == 0) goto L_0x0024
            d.h r4 = (d.h) r4
            goto L_0x0030
        L_0x0024:
            boolean r6 = r4 instanceof android.content.ContextWrapper
            if (r6 == 0) goto L_0x002f
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            goto L_0x001b
        L_0x002f:
            r4 = r0
        L_0x0030:
            if (r4 == 0) goto L_0x003c
            d.j r4 = r4.p()
            int r4 = r4.f()
            r3.M = r4
        L_0x003c:
            int r4 = r3.M
            if (r4 != r1) goto L_0x0067
            m.h<java.lang.String, java.lang.Integer> r4 = Z
            java.lang.Object r6 = r3.f2708d
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.Object r6 = r4.getOrDefault(r6, r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0067
            int r6 = r6.intValue()
            r3.M = r6
            java.lang.Object r6 = r3.f2708d
            java.lang.Class r6 = r6.getClass()
            java.lang.String r6 = r6.getName()
            r4.remove(r6)
        L_0x0067:
            if (r5 == 0) goto L_0x006c
            r3.B(r5)
        L_0x006c:
            androidx.appcompat.widget.k.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.k.<init>(android.content.Context, android.view.Window, d.i, java.lang.Object):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.Map} */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01f9, code lost:
        if (r1 != false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0202, code lost:
        if (r12.K == false) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00cc, code lost:
        if (w.c.b(r13) == false) goto L_0x00ce;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d6 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A(boolean r13) {
        /*
            r12 = this;
            boolean r0 = r12.K
            r1 = 0
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r12.M
            r2 = -100
            if (r0 == r2) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = -100
        L_0x000f:
            android.content.Context r2 = r12.f2709e
            int r2 = r12.R(r2, r0)
            android.content.Context r3 = r12.f2709e
            r4 = 0
            android.content.res.Configuration r2 = r12.F(r3, r2, r4)
            boolean r3 = r12.P
            r5 = 24
            r6 = 1
            if (r3 != 0) goto L_0x006b
            java.lang.Object r3 = r12.f2708d
            boolean r3 = r3 instanceof android.app.Activity
            if (r3 == 0) goto L_0x006b
            android.content.Context r3 = r12.f2709e
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            if (r3 != 0) goto L_0x0033
            r3 = 0
            goto L_0x006f
        L_0x0033:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x0061 }
            r8 = 29
            if (r7 < r8) goto L_0x003c
            r7 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x0042
        L_0x003c:
            if (r7 < r5) goto L_0x0041
            r7 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x0042
        L_0x0041:
            r7 = 0
        L_0x0042:
            android.content.ComponentName r8 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0061 }
            android.content.Context r9 = r12.f2709e     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.Object r10 = r12.f2708d     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.Class r10 = r10.getClass()     // Catch:{ NameNotFoundException -> 0x0061 }
            r8.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x0061 }
            android.content.pm.ActivityInfo r3 = r3.getActivityInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x0061 }
            if (r3 == 0) goto L_0x005d
            int r3 = r3.configChanges     // Catch:{ NameNotFoundException -> 0x0061 }
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x005d
            r3 = 1
            goto L_0x005e
        L_0x005d:
            r3 = 0
        L_0x005e:
            r12.O = r3     // Catch:{ NameNotFoundException -> 0x0061 }
            goto L_0x006b
        L_0x0061:
            r3 = move-exception
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r8 = "Exception while getting ActivityInfo"
            android.util.Log.d(r7, r8, r3)
            r12.O = r1
        L_0x006b:
            r12.P = r6
            boolean r3 = r12.O
        L_0x006f:
            android.content.res.Configuration r7 = r12.L
            if (r7 != 0) goto L_0x007d
            android.content.Context r7 = r12.f2709e
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
        L_0x007d:
            int r7 = r7.uiMode
            r7 = r7 & 48
            int r2 = r2.uiMode
            r2 = r2 & 48
            r8 = 28
            r9 = 23
            if (r7 == r2) goto L_0x00d3
            if (r13 == 0) goto L_0x00d3
            if (r3 != 0) goto L_0x00d3
            boolean r13 = r12.I
            if (r13 == 0) goto L_0x00d3
            boolean r13 = f2706b0
            if (r13 != 0) goto L_0x009b
            boolean r13 = r12.J
            if (r13 == 0) goto L_0x00d3
        L_0x009b:
            java.lang.Object r13 = r12.f2708d
            boolean r10 = r13 instanceof android.app.Activity
            if (r10 == 0) goto L_0x00d3
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r13 = r13.isChild()
            if (r13 != 0) goto L_0x00d3
            java.lang.Object r13 = r12.f2708d
            android.app.Activity r13 = (android.app.Activity) r13
            int r10 = w.b.f4130b
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r8) goto L_0x00b4
            goto L_0x00ce
        L_0x00b4:
            if (r10 > r9) goto L_0x00c8
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r11 = r13.getMainLooper()
            r10.<init>(r11)
            w.a r11 = new w.a
            r11.<init>(r13)
            r10.post(r11)
            goto L_0x00d1
        L_0x00c8:
            boolean r10 = w.c.b(r13)
            if (r10 != 0) goto L_0x00d1
        L_0x00ce:
            r13.recreate()
        L_0x00d1:
            r13 = 1
            goto L_0x00d4
        L_0x00d3:
            r13 = 0
        L_0x00d4:
            if (r13 != 0) goto L_0x0208
            if (r7 == r2) goto L_0x0208
            android.content.Context r13 = r12.f2709e
            android.content.res.Resources r13 = r13.getResources()
            android.content.res.Configuration r7 = new android.content.res.Configuration
            android.content.res.Configuration r10 = r13.getConfiguration()
            r7.<init>(r10)
            android.content.res.Configuration r10 = r13.getConfiguration()
            int r10 = r10.uiMode
            r10 = r10 & -49
            r2 = r2 | r10
            r7.uiMode = r2
            r13.updateConfiguration(r7, r4)
            int r2 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r2 >= r10) goto L_0x01bf
            if (r2 < r8) goto L_0x00ff
            goto L_0x01bf
        L_0x00ff:
            java.lang.String r8 = "mDrawableCache"
            java.lang.String r10 = "ResourcesFlusher"
            if (r2 < r5) goto L_0x0164
            boolean r2 = d.s.f2791h
            if (r2 != 0) goto L_0x011f
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r5 = "mResourcesImpl"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r5)     // Catch:{ NoSuchFieldException -> 0x0117 }
            d.s.f2790g = r2     // Catch:{ NoSuchFieldException -> 0x0117 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0117 }
            goto L_0x011d
        L_0x0117:
            r2 = move-exception
            java.lang.String r5 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r10, r5, r2)
        L_0x011d:
            d.s.f2791h = r6
        L_0x011f:
            java.lang.reflect.Field r2 = d.s.f2790g
            if (r2 != 0) goto L_0x0125
            goto L_0x01bf
        L_0x0125:
            java.lang.Object r13 = r2.get(r13)     // Catch:{ IllegalAccessException -> 0x012a }
            goto L_0x0131
        L_0x012a:
            r13 = move-exception
            java.lang.String r2 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r10, r2, r13)
            r13 = r4
        L_0x0131:
            if (r13 != 0) goto L_0x0135
            goto L_0x01bf
        L_0x0135:
            boolean r2 = d.s.f2785b
            if (r2 != 0) goto L_0x014f
            java.lang.Class r2 = r13.getClass()     // Catch:{ NoSuchFieldException -> 0x0147 }
            java.lang.reflect.Field r2 = r2.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x0147 }
            d.s.f2784a = r2     // Catch:{ NoSuchFieldException -> 0x0147 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x0147 }
            goto L_0x014d
        L_0x0147:
            r2 = move-exception
            java.lang.String r5 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r10, r5, r2)
        L_0x014d:
            d.s.f2785b = r6
        L_0x014f:
            java.lang.reflect.Field r2 = d.s.f2784a
            if (r2 == 0) goto L_0x015e
            java.lang.Object r4 = r2.get(r13)     // Catch:{ IllegalAccessException -> 0x0158 }
            goto L_0x015e
        L_0x0158:
            r13 = move-exception
            java.lang.String r2 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r10, r2, r13)
        L_0x015e:
            if (r4 == 0) goto L_0x01bf
            d.s.a(r4)
            goto L_0x01bf
        L_0x0164:
            java.lang.String r5 = "Could not retrieve Resources#mDrawableCache field"
            java.lang.String r11 = "Could not retrieve value from Resources#mDrawableCache"
            if (r2 < r9) goto L_0x0194
            boolean r2 = d.s.f2785b
            if (r2 != 0) goto L_0x0180
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.reflect.Field r2 = r2.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x017a }
            d.s.f2784a = r2     // Catch:{ NoSuchFieldException -> 0x017a }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x017a }
            goto L_0x017e
        L_0x017a:
            r2 = move-exception
            android.util.Log.e(r10, r5, r2)
        L_0x017e:
            d.s.f2785b = r6
        L_0x0180:
            java.lang.reflect.Field r2 = d.s.f2784a
            if (r2 == 0) goto L_0x018d
            java.lang.Object r4 = r2.get(r13)     // Catch:{ IllegalAccessException -> 0x0189 }
            goto L_0x018d
        L_0x0189:
            r13 = move-exception
            android.util.Log.e(r10, r11, r13)
        L_0x018d:
            if (r4 != 0) goto L_0x0190
            goto L_0x01bf
        L_0x0190:
            d.s.a(r4)
            goto L_0x01bf
        L_0x0194:
            boolean r2 = d.s.f2785b
            if (r2 != 0) goto L_0x01aa
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.reflect.Field r2 = r2.getDeclaredField(r8)     // Catch:{ NoSuchFieldException -> 0x01a4 }
            d.s.f2784a = r2     // Catch:{ NoSuchFieldException -> 0x01a4 }
            r2.setAccessible(r6)     // Catch:{ NoSuchFieldException -> 0x01a4 }
            goto L_0x01a8
        L_0x01a4:
            r2 = move-exception
            android.util.Log.e(r10, r5, r2)
        L_0x01a8:
            d.s.f2785b = r6
        L_0x01aa:
            java.lang.reflect.Field r2 = d.s.f2784a
            if (r2 == 0) goto L_0x01bf
            java.lang.Object r13 = r2.get(r13)     // Catch:{ IllegalAccessException -> 0x01b6 }
            java.util.Map r13 = (java.util.Map) r13     // Catch:{ IllegalAccessException -> 0x01b6 }
            r4 = r13
            goto L_0x01ba
        L_0x01b6:
            r13 = move-exception
            android.util.Log.e(r10, r11, r13)
        L_0x01ba:
            if (r4 == 0) goto L_0x01bf
            r4.clear()
        L_0x01bf:
            int r13 = r12.N
            if (r13 == 0) goto L_0x01d7
            android.content.Context r2 = r12.f2709e
            r2.setTheme(r13)
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r9) goto L_0x01d7
            android.content.Context r13 = r12.f2709e
            android.content.res.Resources$Theme r13 = r13.getTheme()
            int r2 = r12.N
            r13.applyStyle(r2, r6)
        L_0x01d7:
            if (r3 == 0) goto L_0x0209
            java.lang.Object r13 = r12.f2708d
            boolean r2 = r13 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0209
            android.app.Activity r13 = (android.app.Activity) r13
            boolean r2 = r13 instanceof androidx.lifecycle.k
            if (r2 == 0) goto L_0x01fc
            r2 = r13
            androidx.lifecycle.k r2 = (androidx.lifecycle.k) r2
            androidx.lifecycle.g r2 = r2.a()
            androidx.lifecycle.l r2 = (androidx.lifecycle.l) r2
            androidx.lifecycle.g$c r2 = r2.f1581b
            androidx.lifecycle.g$c r3 = androidx.lifecycle.g.c.CREATED
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto L_0x01f9
            r1 = 1
        L_0x01f9:
            if (r1 == 0) goto L_0x0209
            goto L_0x0204
        L_0x01fc:
            boolean r1 = r12.J
            if (r1 == 0) goto L_0x0209
            boolean r1 = r12.K
            if (r1 != 0) goto L_0x0209
        L_0x0204:
            r13.onConfigurationChanged(r7)
            goto L_0x0209
        L_0x0208:
            r6 = r13
        L_0x0209:
            if (r6 == 0) goto L_0x0216
            java.lang.Object r13 = r12.f2708d
            boolean r1 = r13 instanceof d.h
            if (r1 == 0) goto L_0x0216
            d.h r13 = (d.h) r13
            java.util.Objects.requireNonNull(r13)
        L_0x0216:
            if (r0 != 0) goto L_0x0222
            android.content.Context r13 = r12.f2709e
            d.k$f r13 = r12.M(r13)
            r13.e()
            goto L_0x0229
        L_0x0222:
            d.k$f r13 = r12.Q
            if (r13 == 0) goto L_0x0229
            r13.a()
        L_0x0229:
            r13 = 3
            if (r0 != r13) goto L_0x023f
            android.content.Context r13 = r12.f2709e
            d.k$f r0 = r12.R
            if (r0 != 0) goto L_0x0239
            d.k$e r0 = new d.k$e
            r0.<init>(r13)
            r12.R = r0
        L_0x0239:
            d.k$f r13 = r12.R
            r13.e()
            goto L_0x0246
        L_0x023f:
            d.k$f r13 = r12.R
            if (r13 == 0) goto L_0x0246
            r13.a()
        L_0x0246:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d.k.A(boolean):boolean");
    }

    public final void B(Window window) {
        if (this.f2710f == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof d)) {
                d dVar = new d(callback);
                this.f2711g = dVar;
                window.setCallback(dVar);
                b1 p2 = b1.p(this.f2709e, (AttributeSet) null, f2705a0);
                Drawable h2 = p2.h(0);
                if (h2 != null) {
                    window.setBackgroundDrawable(h2);
                }
                p2.f527b.recycle();
                this.f2710f = window;
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public void C(int i2, i iVar, Menu menu) {
        if (menu == null) {
            menu = iVar.f2752h;
        }
        if (iVar.f2757m && !this.K) {
            this.f2711g.f3154b.onPanelClosed(i2, menu);
        }
    }

    public void D(androidx.appcompat.view.menu.e eVar) {
        if (!this.E) {
            this.E = true;
            this.f2716l.j();
            Window.Callback O2 = O();
            if (O2 != null && !this.K) {
                O2.onPanelClosed(108, eVar);
            }
            this.E = false;
        }
    }

    public void E(i iVar, boolean z2) {
        ViewGroup viewGroup;
        g0 g0Var;
        if (!z2 || iVar.f2745a != 0 || (g0Var = this.f2716l) == null || !g0Var.e()) {
            WindowManager windowManager = (WindowManager) this.f2709e.getSystemService("window");
            if (!(windowManager == null || !iVar.f2757m || (viewGroup = iVar.f2749e) == null)) {
                windowManager.removeView(viewGroup);
                if (z2) {
                    C(iVar.f2745a, iVar, (Menu) null);
                }
            }
            iVar.f2755k = false;
            iVar.f2756l = false;
            iVar.f2757m = false;
            iVar.f2750f = null;
            iVar.f2758n = true;
            if (this.G == iVar) {
                this.G = null;
                return;
            }
            return;
        }
        D(iVar.f2752h);
    }

    public final Configuration F(Context context, int i2, Configuration configuration) {
        int i3 = i2 != 1 ? i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & -49);
        return configuration2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0123, code lost:
        if (r7 != false) goto L_0x0125;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean G(android.view.KeyEvent r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2708d
            boolean r1 = r0 instanceof g0.e.a
            r2 = 1
            if (r1 != 0) goto L_0x000b
            boolean r0 = r0 instanceof d.p
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r6.f2710f
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = g0.e.a(r0, r7)
            if (r0 == 0) goto L_0x001a
            return r2
        L_0x001a:
            int r0 = r7.getKeyCode()
            r1 = 82
            if (r0 != r1) goto L_0x002d
            d.k$d r0 = r6.f2711g
            android.view.Window$Callback r0 = r0.f3154b
            boolean r0 = r0.dispatchKeyEvent(r7)
            if (r0 == 0) goto L_0x002d
            return r2
        L_0x002d:
            int r0 = r7.getKeyCode()
            int r3 = r7.getAction()
            r4 = 0
            if (r3 != 0) goto L_0x003a
            r3 = 1
            goto L_0x003b
        L_0x003a:
            r3 = 0
        L_0x003b:
            r5 = 4
            if (r3 == 0) goto L_0x0065
            if (r0 == r5) goto L_0x0056
            if (r0 == r1) goto L_0x0043
            goto L_0x0062
        L_0x0043:
            int r0 = r7.getRepeatCount()
            if (r0 != 0) goto L_0x012a
            d.k$i r0 = r6.N(r4)
            boolean r1 = r0.f2757m
            if (r1 != 0) goto L_0x012a
            r6.U(r0, r7)
            goto L_0x012a
        L_0x0056:
            int r7 = r7.getFlags()
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            r6.H = r2
        L_0x0062:
            r2 = 0
            goto L_0x012a
        L_0x0065:
            if (r0 == r5) goto L_0x00ee
            if (r0 == r1) goto L_0x006a
            goto L_0x0062
        L_0x006a:
            h.a r0 = r6.f2719o
            if (r0 == 0) goto L_0x0070
            goto L_0x012a
        L_0x0070:
            d.k$i r0 = r6.N(r4)
            androidx.appcompat.widget.g0 r1 = r6.f2716l
            if (r1 == 0) goto L_0x00aa
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x00aa
            android.content.Context r1 = r6.f2709e
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            boolean r1 = r1.hasPermanentMenuKey()
            if (r1 != 0) goto L_0x00aa
            androidx.appcompat.widget.g0 r1 = r6.f2716l
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x00a3
            boolean r1 = r6.K
            if (r1 != 0) goto L_0x00ca
            boolean r7 = r6.U(r0, r7)
            if (r7 == 0) goto L_0x00ca
            androidx.appcompat.widget.g0 r7 = r6.f2716l
            boolean r7 = r7.a()
            goto L_0x00d0
        L_0x00a3:
            androidx.appcompat.widget.g0 r7 = r6.f2716l
            boolean r7 = r7.g()
            goto L_0x00d0
        L_0x00aa:
            boolean r1 = r0.f2757m
            if (r1 != 0) goto L_0x00cc
            boolean r3 = r0.f2756l
            if (r3 == 0) goto L_0x00b3
            goto L_0x00cc
        L_0x00b3:
            boolean r1 = r0.f2755k
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r0.f2759o
            if (r1 == 0) goto L_0x00c2
            r0.f2755k = r4
            boolean r1 = r6.U(r0, r7)
            goto L_0x00c3
        L_0x00c2:
            r1 = 1
        L_0x00c3:
            if (r1 == 0) goto L_0x00ca
            r6.S(r0, r7)
            r7 = 1
            goto L_0x00d0
        L_0x00ca:
            r7 = 0
            goto L_0x00d0
        L_0x00cc:
            r6.E(r0, r2)
            r7 = r1
        L_0x00d0:
            if (r7 == 0) goto L_0x012a
            android.content.Context r7 = r6.f2709e
            android.content.Context r7 = r7.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r7 = r7.getSystemService(r0)
            android.media.AudioManager r7 = (android.media.AudioManager) r7
            if (r7 == 0) goto L_0x00e6
            r7.playSoundEffect(r4)
            goto L_0x012a
        L_0x00e6:
            java.lang.String r7 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r7, r0)
            goto L_0x012a
        L_0x00ee:
            boolean r7 = r6.H
            r6.H = r4
            d.k$i r0 = r6.N(r4)
            boolean r1 = r0.f2757m
            if (r1 == 0) goto L_0x0100
            if (r7 != 0) goto L_0x012a
            r6.E(r0, r2)
            goto L_0x012a
        L_0x0100:
            h.a r7 = r6.f2719o
            if (r7 == 0) goto L_0x0108
            r7.c()
            goto L_0x0125
        L_0x0108:
            r6.P()
            d.a r7 = r6.f2713i
            if (r7 == 0) goto L_0x0127
            d.v r7 = (d.v) r7
            androidx.appcompat.widget.h0 r0 = r7.f2807e
            if (r0 == 0) goto L_0x0122
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0122
            androidx.appcompat.widget.h0 r7 = r7.f2807e
            r7.collapseActionView()
            r7 = 1
            goto L_0x0123
        L_0x0122:
            r7 = 0
        L_0x0123:
            if (r7 == 0) goto L_0x0127
        L_0x0125:
            r7 = 1
            goto L_0x0128
        L_0x0127:
            r7 = 0
        L_0x0128:
            if (r7 == 0) goto L_0x0062
        L_0x012a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d.k.G(android.view.KeyEvent):boolean");
    }

    public void H(int i2) {
        i N2 = N(i2);
        if (N2.f2752h != null) {
            Bundle bundle = new Bundle();
            N2.f2752h.v(bundle);
            if (bundle.size() > 0) {
                N2.f2760p = bundle;
            }
            N2.f2752h.y();
            N2.f2752h.clear();
        }
        N2.f2759o = true;
        N2.f2758n = true;
        if ((i2 == 108 || i2 == 0) && this.f2716l != null) {
            i N3 = N(0);
            N3.f2755k = false;
            U(N3, (KeyEvent) null);
        }
    }

    public void I() {
        x xVar = this.f2723s;
        if (xVar != null) {
            xVar.b();
        }
    }

    public final void J() {
        ViewGroup viewGroup;
        if (!this.f2724t) {
            TypedArray obtainStyledAttributes = this.f2709e.obtainStyledAttributes(c.c.f2047j);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    t(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    t(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    t(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    t(10);
                }
                this.C = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                K();
                this.f2710f.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.f2709e);
                if (this.D) {
                    viewGroup = (ViewGroup) from.inflate(this.B ? R.layout.abc_screen_simple_overlay_action_mode : R.layout.abc_screen_simple, (ViewGroup) null);
                } else if (this.C) {
                    viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                    this.A = false;
                    this.f2730z = false;
                } else if (this.f2730z) {
                    TypedValue typedValue = new TypedValue();
                    this.f2709e.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new h.c(this.f2709e, typedValue.resourceId) : this.f2709e).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                    g0 g0Var = (g0) viewGroup.findViewById(R.id.decor_content_parent);
                    this.f2716l = g0Var;
                    g0Var.setWindowCallback(O());
                    if (this.A) {
                        this.f2716l.h(109);
                    }
                    if (this.f2728x) {
                        this.f2716l.h(2);
                    }
                    if (this.f2729y) {
                        this.f2716l.h(5);
                    }
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    l lVar = new l(this);
                    WeakHashMap<View, x> weakHashMap = u.f3063a;
                    u.i.u(viewGroup, lVar);
                    if (this.f2716l == null) {
                        this.f2726v = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    Method method = i1.f649a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.f2710f.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground((Drawable) null);
                        }
                    }
                    this.f2710f.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new m(this));
                    this.f2725u = viewGroup;
                    Object obj = this.f2708d;
                    CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2715k;
                    if (!TextUtils.isEmpty(title)) {
                        g0 g0Var2 = this.f2716l;
                        if (g0Var2 != null) {
                            g0Var2.setWindowTitle(title);
                        } else {
                            a aVar = this.f2713i;
                            if (aVar != null) {
                                ((v) aVar).f2807e.setWindowTitle(title);
                            } else {
                                TextView textView = this.f2726v;
                                if (textView != null) {
                                    textView.setText(title);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2725u.findViewById(16908290);
                    View decorView = this.f2710f.getDecorView();
                    contentFrameLayout2.f384h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap<View, x> weakHashMap2 = u.f3063a;
                    if (u.g.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.f2709e.obtainStyledAttributes(c.c.f2047j);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.f2724t = true;
                    i N2 = N(0);
                    if (!this.K && N2.f2752h == null) {
                        Q(108);
                        return;
                    }
                    return;
                }
                StringBuilder a2 = androidx.activity.result.a.a("AppCompat does not support the current theme features: { windowActionBar: ");
                a2.append(this.f2730z);
                a2.append(", windowActionBarOverlay: ");
                a2.append(this.A);
                a2.append(", android:windowIsFloating: ");
                a2.append(this.C);
                a2.append(", windowActionModeOverlay: ");
                a2.append(this.B);
                a2.append(", windowNoTitle: ");
                a2.append(this.D);
                a2.append(" }");
                throw new IllegalArgumentException(a2.toString());
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void K() {
        if (this.f2710f == null) {
            Object obj = this.f2708d;
            if (obj instanceof Activity) {
                B(((Activity) obj).getWindow());
            }
        }
        if (this.f2710f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public i L(Menu menu) {
        i[] iVarArr = this.F;
        int length = iVarArr != null ? iVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            i iVar = iVarArr[i2];
            if (iVar != null && iVar.f2752h == menu) {
                return iVar;
            }
        }
        return null;
    }

    public final f M(Context context) {
        if (this.Q == null) {
            if (u.f2796d == null) {
                Context applicationContext = context.getApplicationContext();
                u.f2796d = new u(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Q = new g(u.f2796d);
        }
        return this.Q;
    }

    public i N(int i2) {
        i[] iVarArr = this.F;
        if (iVarArr == null || iVarArr.length <= i2) {
            i[] iVarArr2 = new i[(i2 + 1)];
            if (iVarArr != null) {
                System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
            }
            this.F = iVarArr2;
            iVarArr = iVarArr2;
        }
        i iVar = iVarArr[i2];
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(i2);
        iVarArr[i2] = iVar2;
        return iVar2;
    }

    public final Window.Callback O() {
        return this.f2710f.getCallback();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P() {
        /*
            r3 = this;
            r3.J()
            boolean r0 = r3.f2730z
            if (r0 == 0) goto L_0x0037
            d.a r0 = r3.f2713i
            if (r0 == 0) goto L_0x000c
            goto L_0x0037
        L_0x000c:
            java.lang.Object r0 = r3.f2708d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x0020
            d.v r0 = new d.v
            java.lang.Object r1 = r3.f2708d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.A
            r0.<init>(r1, r2)
        L_0x001d:
            r3.f2713i = r0
            goto L_0x002e
        L_0x0020:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L_0x002e
            d.v r0 = new d.v
            java.lang.Object r1 = r3.f2708d
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L_0x001d
        L_0x002e:
            d.a r0 = r3.f2713i
            if (r0 == 0) goto L_0x0037
            boolean r1 = r3.V
            r0.c(r1)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.k.P():void");
    }

    public final void Q(int i2) {
        this.T = (1 << i2) | this.T;
        if (!this.S) {
            View decorView = this.f2710f.getDecorView();
            Runnable runnable = this.U;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.d.m(decorView, runnable);
            this.S = true;
        }
    }

    public int R(Context context, int i2) {
        f M2;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (!(i2 == 1 || i2 == 2)) {
                    if (i2 == 3) {
                        if (this.R == null) {
                            this.R = new e(context);
                        }
                        M2 = this.R;
                    } else {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                M2 = M(context);
            }
            return M2.c();
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0154, code lost:
        if (r14 != null) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(d.k.i r13, android.view.KeyEvent r14) {
        /*
            r12 = this;
            boolean r0 = r13.f2757m
            if (r0 != 0) goto L_0x01d5
            boolean r0 = r12.K
            if (r0 == 0) goto L_0x000a
            goto L_0x01d5
        L_0x000a:
            int r0 = r13.f2745a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0027
            android.content.Context r0 = r12.f2709e
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r0 = r0 & 15
            r3 = 4
            if (r0 != r3) goto L_0x0023
            r0 = 1
            goto L_0x0024
        L_0x0023:
            r0 = 0
        L_0x0024:
            if (r0 == 0) goto L_0x0027
            return
        L_0x0027:
            android.view.Window$Callback r0 = r12.O()
            if (r0 == 0) goto L_0x003b
            int r3 = r13.f2745a
            androidx.appcompat.view.menu.e r4 = r13.f2752h
            boolean r0 = r0.onMenuOpened(r3, r4)
            if (r0 != 0) goto L_0x003b
            r12.E(r13, r1)
            return
        L_0x003b:
            android.content.Context r0 = r12.f2709e
            java.lang.String r3 = "window"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            if (r0 != 0) goto L_0x0048
            return
        L_0x0048:
            boolean r14 = r12.U(r13, r14)
            if (r14 != 0) goto L_0x004f
            return
        L_0x004f:
            android.view.ViewGroup r14 = r13.f2749e
            r3 = -2
            r4 = -1
            if (r14 == 0) goto L_0x006b
            boolean r5 = r13.f2758n
            if (r5 == 0) goto L_0x005a
            goto L_0x006b
        L_0x005a:
            android.view.View r14 = r13.f2751g
            if (r14 == 0) goto L_0x01b2
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 == 0) goto L_0x01b2
            int r14 = r14.width
            if (r14 != r4) goto L_0x01b2
            r5 = -1
            goto L_0x01b3
        L_0x006b:
            if (r14 != 0) goto L_0x00e3
            r12.P()
            d.a r14 = r12.f2713i
            if (r14 == 0) goto L_0x0079
            android.content.Context r14 = r14.b()
            goto L_0x007a
        L_0x0079:
            r14 = 0
        L_0x007a:
            if (r14 != 0) goto L_0x007e
            android.content.Context r14 = r12.f2709e
        L_0x007e:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources r5 = r14.getResources()
            android.content.res.Resources$Theme r5 = r5.newTheme()
            android.content.res.Resources$Theme r6 = r14.getTheme()
            r5.setTo(r6)
            r6 = 2130903044(0x7f030004, float:1.7412895E38)
            r5.resolveAttribute(r6, r4, r1)
            int r6 = r4.resourceId
            if (r6 == 0) goto L_0x009f
            r5.applyStyle(r6, r1)
        L_0x009f:
            r6 = 2130903809(0x7f030301, float:1.7414446E38)
            r5.resolveAttribute(r6, r4, r1)
            int r4 = r4.resourceId
            if (r4 == 0) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            r4 = 2131755513(0x7f1001f9, float:1.9141907E38)
        L_0x00ad:
            r5.applyStyle(r4, r1)
            h.c r4 = new h.c
            r4.<init>(r14, r2)
            android.content.res.Resources$Theme r14 = r4.getTheme()
            r14.setTo(r5)
            r13.f2754j = r4
            int[] r14 = c.c.f2047j
            android.content.res.TypedArray r14 = r4.obtainStyledAttributes(r14)
            r4 = 86
            int r4 = r14.getResourceId(r4, r2)
            r13.f2746b = r4
            int r4 = r14.getResourceId(r1, r2)
            r13.f2748d = r4
            r14.recycle()
            d.k$h r14 = new d.k$h
            android.content.Context r4 = r13.f2754j
            r14.<init>(r4)
            r13.f2749e = r14
            r14 = 81
            r13.f2747c = r14
            goto L_0x00f2
        L_0x00e3:
            boolean r4 = r13.f2758n
            if (r4 == 0) goto L_0x00f2
            int r14 = r14.getChildCount()
            if (r14 <= 0) goto L_0x00f2
            android.view.ViewGroup r14 = r13.f2749e
            r14.removeAllViews()
        L_0x00f2:
            android.view.View r14 = r13.f2751g
            if (r14 == 0) goto L_0x00f9
            r13.f2750f = r14
            goto L_0x0156
        L_0x00f9:
            androidx.appcompat.view.menu.e r14 = r13.f2752h
            if (r14 != 0) goto L_0x00fe
            goto L_0x0158
        L_0x00fe:
            d.k$j r14 = r12.f2718n
            if (r14 != 0) goto L_0x0109
            d.k$j r14 = new d.k$j
            r14.<init>()
            r12.f2718n = r14
        L_0x0109:
            d.k$j r14 = r12.f2718n
            androidx.appcompat.view.menu.c r4 = r13.f2753i
            if (r4 != 0) goto L_0x0124
            androidx.appcompat.view.menu.c r4 = new androidx.appcompat.view.menu.c
            android.content.Context r5 = r13.f2754j
            r6 = 2131427344(0x7f0b0010, float:1.8476302E38)
            r4.<init>(r5, r6)
            r13.f2753i = r4
            r4.f205f = r14
            androidx.appcompat.view.menu.e r14 = r13.f2752h
            android.content.Context r5 = r14.f216a
            r14.b(r4, r5)
        L_0x0124:
            androidx.appcompat.view.menu.c r14 = r13.f2753i
            android.view.ViewGroup r4 = r13.f2749e
            androidx.appcompat.view.menu.ExpandedMenuView r5 = r14.f204e
            if (r5 != 0) goto L_0x0150
            android.view.LayoutInflater r5 = r14.f202c
            r6 = 2131427341(0x7f0b000d, float:1.8476296E38)
            android.view.View r4 = r5.inflate(r6, r4, r2)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = (androidx.appcompat.view.menu.ExpandedMenuView) r4
            r14.f204e = r4
            androidx.appcompat.view.menu.c$a r4 = r14.f206g
            if (r4 != 0) goto L_0x0144
            androidx.appcompat.view.menu.c$a r4 = new androidx.appcompat.view.menu.c$a
            r4.<init>()
            r14.f206g = r4
        L_0x0144:
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f204e
            androidx.appcompat.view.menu.c$a r5 = r14.f206g
            r4.setAdapter(r5)
            androidx.appcompat.view.menu.ExpandedMenuView r4 = r14.f204e
            r4.setOnItemClickListener(r14)
        L_0x0150:
            androidx.appcompat.view.menu.ExpandedMenuView r14 = r14.f204e
            r13.f2750f = r14
            if (r14 == 0) goto L_0x0158
        L_0x0156:
            r14 = 1
            goto L_0x0159
        L_0x0158:
            r14 = 0
        L_0x0159:
            if (r14 == 0) goto L_0x01d3
            android.view.View r14 = r13.f2750f
            if (r14 != 0) goto L_0x0160
            goto L_0x0175
        L_0x0160:
            android.view.View r14 = r13.f2751g
            if (r14 == 0) goto L_0x0165
            goto L_0x0173
        L_0x0165:
            androidx.appcompat.view.menu.c r14 = r13.f2753i
            android.widget.ListAdapter r14 = r14.a()
            androidx.appcompat.view.menu.c$a r14 = (androidx.appcompat.view.menu.c.a) r14
            int r14 = r14.getCount()
            if (r14 <= 0) goto L_0x0175
        L_0x0173:
            r14 = 1
            goto L_0x0176
        L_0x0175:
            r14 = 0
        L_0x0176:
            if (r14 != 0) goto L_0x0179
            goto L_0x01d3
        L_0x0179:
            android.view.View r14 = r13.f2750f
            android.view.ViewGroup$LayoutParams r14 = r14.getLayoutParams()
            if (r14 != 0) goto L_0x0186
            android.view.ViewGroup$LayoutParams r14 = new android.view.ViewGroup$LayoutParams
            r14.<init>(r3, r3)
        L_0x0186:
            int r4 = r13.f2746b
            android.view.ViewGroup r5 = r13.f2749e
            r5.setBackgroundResource(r4)
            android.view.View r4 = r13.f2750f
            android.view.ViewParent r4 = r4.getParent()
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x019e
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            android.view.View r5 = r13.f2750f
            r4.removeView(r5)
        L_0x019e:
            android.view.ViewGroup r4 = r13.f2749e
            android.view.View r5 = r13.f2750f
            r4.addView(r5, r14)
            android.view.View r14 = r13.f2750f
            boolean r14 = r14.hasFocus()
            if (r14 != 0) goto L_0x01b2
            android.view.View r14 = r13.f2750f
            r14.requestFocus()
        L_0x01b2:
            r5 = -2
        L_0x01b3:
            r13.f2756l = r2
            android.view.WindowManager$LayoutParams r14 = new android.view.WindowManager$LayoutParams
            r6 = -2
            r7 = 0
            r8 = 0
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 8519680(0x820000, float:1.1938615E-38)
            r11 = -3
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            int r2 = r13.f2747c
            r14.gravity = r2
            int r2 = r13.f2748d
            r14.windowAnimations = r2
            android.view.ViewGroup r2 = r13.f2749e
            r0.addView(r2, r14)
            r13.f2757m = r1
            return
        L_0x01d3:
            r13.f2758n = r1
        L_0x01d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.k.S(d.k$i, android.view.KeyEvent):void");
    }

    public final boolean T(i iVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.e eVar;
        boolean z2 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((iVar.f2755k || U(iVar, keyEvent)) && (eVar = iVar.f2752h) != null) {
            z2 = eVar.performShortcut(i2, keyEvent, i3);
        }
        if (z2 && (i3 & 1) == 0 && this.f2716l == null) {
            E(iVar, true);
        }
        return z2;
    }

    public final boolean U(i iVar, KeyEvent keyEvent) {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        Resources.Theme theme;
        g0 g0Var4;
        if (this.K) {
            return false;
        }
        if (iVar.f2755k) {
            return true;
        }
        i iVar2 = this.G;
        if (!(iVar2 == null || iVar2 == iVar)) {
            E(iVar2, false);
        }
        Window.Callback O2 = O();
        if (O2 != null) {
            iVar.f2751g = O2.onCreatePanelView(iVar.f2745a);
        }
        int i2 = iVar.f2745a;
        boolean z2 = i2 == 0 || i2 == 108;
        if (z2 && (g0Var4 = this.f2716l) != null) {
            g0Var4.d();
        }
        if (iVar.f2751g == null) {
            androidx.appcompat.view.menu.e eVar = iVar.f2752h;
            if (eVar == null || iVar.f2759o) {
                if (eVar == null) {
                    Context context = this.f2709e;
                    int i3 = iVar.f2745a;
                    if ((i3 == 0 || i3 == 108) && this.f2716l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            h.c cVar = new h.c(context, 0);
                            cVar.getTheme().setTo(theme);
                            context = cVar;
                        }
                    }
                    androidx.appcompat.view.menu.e eVar2 = new androidx.appcompat.view.menu.e(context);
                    eVar2.f220e = this;
                    iVar.a(eVar2);
                    if (iVar.f2752h == null) {
                        return false;
                    }
                }
                if (z2 && (g0Var3 = this.f2716l) != null) {
                    if (this.f2717m == null) {
                        this.f2717m = new b();
                    }
                    g0Var3.b(iVar.f2752h, this.f2717m);
                }
                iVar.f2752h.y();
                if (!O2.onCreatePanelMenu(iVar.f2745a, iVar.f2752h)) {
                    iVar.a((androidx.appcompat.view.menu.e) null);
                    if (z2 && (g0Var2 = this.f2716l) != null) {
                        g0Var2.b((Menu) null, this.f2717m);
                    }
                    return false;
                }
                iVar.f2759o = false;
            }
            iVar.f2752h.y();
            Bundle bundle = iVar.f2760p;
            if (bundle != null) {
                iVar.f2752h.u(bundle);
                iVar.f2760p = null;
            }
            if (!O2.onPreparePanel(0, iVar.f2751g, iVar.f2752h)) {
                if (z2 && (g0Var = this.f2716l) != null) {
                    g0Var.b((Menu) null, this.f2717m);
                }
                iVar.f2752h.x();
                return false;
            }
            iVar.f2752h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            iVar.f2752h.x();
        }
        iVar.f2755k = true;
        iVar.f2756l = false;
        this.G = iVar;
        return true;
    }

    public final boolean V() {
        ViewGroup viewGroup;
        if (this.f2724t && (viewGroup = this.f2725u) != null) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (u.g.c(viewGroup)) {
                return true;
            }
        }
        return false;
    }

    public final void W() {
        if (this.f2724t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int X(b0 b0Var, Rect rect) {
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        Context context;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i4;
        int e2 = b0Var.e();
        ActionBarContextView actionBarContextView = this.f2720p;
        int i5 = 8;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f2720p.getLayoutParams();
            boolean z4 = true;
            if (this.f2720p.isShown()) {
                if (this.W == null) {
                    this.W = new Rect();
                    this.X = new Rect();
                }
                Rect rect2 = this.W;
                Rect rect3 = this.X;
                rect2.set(b0Var.c(), b0Var.e(), b0Var.d(), b0Var.b());
                i1.a(this.f2725u, rect2, rect3);
                int i6 = rect2.top;
                int i7 = rect2.left;
                int i8 = rect2.right;
                ViewGroup viewGroup = this.f2725u;
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                b0 a2 = Build.VERSION.SDK_INT >= 23 ? u.j.a(viewGroup) : u.i.j(viewGroup);
                if (a2 == null) {
                    i2 = 0;
                } else {
                    i2 = a2.c();
                }
                int d2 = a2 == null ? 0 : a2.d();
                if (marginLayoutParams2.topMargin == i6 && marginLayoutParams2.leftMargin == i7 && marginLayoutParams2.rightMargin == i8) {
                    z3 = false;
                } else {
                    marginLayoutParams2.topMargin = i6;
                    marginLayoutParams2.leftMargin = i7;
                    marginLayoutParams2.rightMargin = i8;
                    z3 = true;
                }
                if (i6 <= 0 || this.f2727w != null) {
                    View view = this.f2727w;
                    if (!(view == null || ((marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams()).height == (i4 = marginLayoutParams2.topMargin) && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == d2))) {
                        marginLayoutParams.height = i4;
                        marginLayoutParams.leftMargin = i2;
                        marginLayoutParams.rightMargin = d2;
                        this.f2727w.setLayoutParams(marginLayoutParams);
                    }
                } else {
                    View view2 = new View(this.f2709e);
                    this.f2727w = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams2.topMargin, 51);
                    layoutParams.leftMargin = i2;
                    layoutParams.rightMargin = d2;
                    this.f2725u.addView(this.f2727w, -1, layoutParams);
                }
                View view3 = this.f2727w;
                z2 = view3 != null;
                if (z2 && view3.getVisibility() != 0) {
                    View view4 = this.f2727w;
                    if ((u.d.g(view4) & 8192) == 0) {
                        z4 = false;
                    }
                    if (z4) {
                        context = this.f2709e;
                        i3 = R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = this.f2709e;
                        i3 = R.color.abc_decor_view_status_guard;
                    }
                    view4.setBackgroundColor(x.a.a(context, i3));
                }
                if (!this.B && z2) {
                    e2 = 0;
                }
                z4 = z3;
            } else {
                if (marginLayoutParams2.topMargin != 0) {
                    marginLayoutParams2.topMargin = 0;
                } else {
                    z4 = false;
                }
                z2 = false;
            }
            if (z4) {
                this.f2720p.setLayoutParams(marginLayoutParams2);
            }
        }
        View view5 = this.f2727w;
        if (view5 != null) {
            if (z2) {
                i5 = 0;
            }
            view5.setVisibility(i5);
        }
        return e2;
    }

    public void a(androidx.appcompat.view.menu.e eVar) {
        g0 g0Var = this.f2716l;
        if (g0Var == null || !g0Var.f() || (ViewConfiguration.get(this.f2709e).hasPermanentMenuKey() && !this.f2716l.c())) {
            i N2 = N(0);
            N2.f2758n = true;
            E(N2, false);
            S(N2, (KeyEvent) null);
            return;
        }
        Window.Callback O2 = O();
        if (this.f2716l.e()) {
            this.f2716l.g();
            if (!this.K) {
                O2.onPanelClosed(108, N(0).f2752h);
            }
        } else if (O2 != null && !this.K) {
            if (this.S && (1 & this.T) != 0) {
                this.f2710f.getDecorView().removeCallbacks(this.U);
                this.U.run();
            }
            i N3 = N(0);
            androidx.appcompat.view.menu.e eVar2 = N3.f2752h;
            if (eVar2 != null && !N3.f2759o && O2.onPreparePanel(0, N3.f2751g, eVar2)) {
                O2.onMenuOpened(108, N3.f2752h);
                this.f2716l.a();
            }
        }
    }

    public boolean b(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        i L2;
        Window.Callback O2 = O();
        if (O2 == null || this.K || (L2 = L(eVar.k())) == null) {
            return false;
        }
        return O2.onMenuItemSelected(L2.f2745a, menuItem);
    }

    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ((ViewGroup) this.f2725u.findViewById(16908290)).addView(view, layoutParams);
        this.f2711g.f3154b.onContentChanged();
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Context d(android.content.Context r10) {
        /*
            r9 = this;
            r0 = 1
            r9.I = r0
            int r1 = r9.M
            r2 = -100
            if (r1 == r2) goto L_0x000a
            goto L_0x000c
        L_0x000a:
            r1 = -100
        L_0x000c:
            int r1 = r9.R(r10, r1)
            boolean r2 = f2707c0
            r3 = 0
            if (r2 == 0) goto L_0x0025
            boolean r2 = r10 instanceof android.view.ContextThemeWrapper
            if (r2 == 0) goto L_0x0025
            android.content.res.Configuration r2 = r9.F(r10, r1, r3)
            r4 = r10
            android.view.ContextThemeWrapper r4 = (android.view.ContextThemeWrapper) r4     // Catch:{ IllegalStateException -> 0x0024 }
            r4.applyOverrideConfiguration(r2)     // Catch:{ IllegalStateException -> 0x0024 }
            return r10
        L_0x0024:
        L_0x0025:
            boolean r2 = r10 instanceof h.c
            if (r2 == 0) goto L_0x0035
            android.content.res.Configuration r2 = r9.F(r10, r1, r3)
            r4 = r10
            h.c r4 = (h.c) r4     // Catch:{ IllegalStateException -> 0x0034 }
            r4.a(r2)     // Catch:{ IllegalStateException -> 0x0034 }
            return r10
        L_0x0034:
        L_0x0035:
            boolean r2 = f2706b0
            if (r2 != 0) goto L_0x003a
            return r10
        L_0x003a:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.content.res.Configuration r4 = new android.content.res.Configuration
            r4.<init>()
            r5 = -1
            r4.uiMode = r5
            r5 = 0
            r4.fontScale = r5
            android.content.Context r4 = r10.createConfigurationContext(r4)
            android.content.res.Resources r4 = r4.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            android.content.res.Resources r6 = r10.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r7 = r6.uiMode
            r4.uiMode = r7
            boolean r7 = r4.equals(r6)
            if (r7 != 0) goto L_0x0183
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>()
            r7.fontScale = r5
            int r5 = r4.diff(r6)
            if (r5 != 0) goto L_0x0074
            goto L_0x0184
        L_0x0074:
            float r5 = r4.fontScale
            float r8 = r6.fontScale
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x007e
            r7.fontScale = r8
        L_0x007e:
            int r5 = r4.mcc
            int r8 = r6.mcc
            if (r5 == r8) goto L_0x0086
            r7.mcc = r8
        L_0x0086:
            int r5 = r4.mnc
            int r8 = r6.mnc
            if (r5 == r8) goto L_0x008e
            r7.mnc = r8
        L_0x008e:
            r5 = 24
            if (r2 < r5) goto L_0x00a8
            android.os.LocaleList r5 = r4.getLocales()
            android.os.LocaleList r8 = r6.getLocales()
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x00b6
            r7.setLocales(r8)
            java.util.Locale r5 = r6.locale
            r7.locale = r5
            goto L_0x00b6
        L_0x00a8:
            java.util.Locale r5 = r4.locale
            java.util.Locale r8 = r6.locale
            boolean r5 = java.util.Objects.equals(r5, r8)
            if (r5 != 0) goto L_0x00b6
            java.util.Locale r5 = r6.locale
            r7.locale = r5
        L_0x00b6:
            int r5 = r4.touchscreen
            int r8 = r6.touchscreen
            if (r5 == r8) goto L_0x00be
            r7.touchscreen = r8
        L_0x00be:
            int r5 = r4.keyboard
            int r8 = r6.keyboard
            if (r5 == r8) goto L_0x00c6
            r7.keyboard = r8
        L_0x00c6:
            int r5 = r4.keyboardHidden
            int r8 = r6.keyboardHidden
            if (r5 == r8) goto L_0x00ce
            r7.keyboardHidden = r8
        L_0x00ce:
            int r5 = r4.navigation
            int r8 = r6.navigation
            if (r5 == r8) goto L_0x00d6
            r7.navigation = r8
        L_0x00d6:
            int r5 = r4.navigationHidden
            int r8 = r6.navigationHidden
            if (r5 == r8) goto L_0x00de
            r7.navigationHidden = r8
        L_0x00de:
            int r5 = r4.orientation
            int r8 = r6.orientation
            if (r5 == r8) goto L_0x00e6
            r7.orientation = r8
        L_0x00e6:
            int r5 = r4.screenLayout
            r5 = r5 & 15
            int r8 = r6.screenLayout
            r8 = r8 & 15
            if (r5 == r8) goto L_0x00f5
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x00f5:
            int r5 = r4.screenLayout
            r5 = r5 & 192(0xc0, float:2.69E-43)
            int r8 = r6.screenLayout
            r8 = r8 & 192(0xc0, float:2.69E-43)
            if (r5 == r8) goto L_0x0104
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x0104:
            int r5 = r4.screenLayout
            r5 = r5 & 48
            int r8 = r6.screenLayout
            r8 = r8 & 48
            if (r5 == r8) goto L_0x0113
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x0113:
            int r5 = r4.screenLayout
            r5 = r5 & 768(0x300, float:1.076E-42)
            int r8 = r6.screenLayout
            r8 = r8 & 768(0x300, float:1.076E-42)
            if (r5 == r8) goto L_0x0122
            int r5 = r7.screenLayout
            r5 = r5 | r8
            r7.screenLayout = r5
        L_0x0122:
            r5 = 26
            if (r2 < r5) goto L_0x0144
            int r2 = r4.colorMode
            r2 = r2 & 3
            int r5 = r6.colorMode
            r5 = r5 & 3
            if (r2 == r5) goto L_0x0135
            int r2 = r7.colorMode
            r2 = r2 | r5
            r7.colorMode = r2
        L_0x0135:
            int r2 = r4.colorMode
            r2 = r2 & 12
            int r5 = r6.colorMode
            r5 = r5 & 12
            if (r2 == r5) goto L_0x0144
            int r2 = r7.colorMode
            r2 = r2 | r5
            r7.colorMode = r2
        L_0x0144:
            int r2 = r4.uiMode
            r2 = r2 & 15
            int r5 = r6.uiMode
            r5 = r5 & 15
            if (r2 == r5) goto L_0x0153
            int r2 = r7.uiMode
            r2 = r2 | r5
            r7.uiMode = r2
        L_0x0153:
            int r2 = r4.uiMode
            r2 = r2 & 48
            int r5 = r6.uiMode
            r5 = r5 & 48
            if (r2 == r5) goto L_0x0162
            int r2 = r7.uiMode
            r2 = r2 | r5
            r7.uiMode = r2
        L_0x0162:
            int r2 = r4.screenWidthDp
            int r5 = r6.screenWidthDp
            if (r2 == r5) goto L_0x016a
            r7.screenWidthDp = r5
        L_0x016a:
            int r2 = r4.screenHeightDp
            int r5 = r6.screenHeightDp
            if (r2 == r5) goto L_0x0172
            r7.screenHeightDp = r5
        L_0x0172:
            int r2 = r4.smallestScreenWidthDp
            int r5 = r6.smallestScreenWidthDp
            if (r2 == r5) goto L_0x017a
            r7.smallestScreenWidthDp = r5
        L_0x017a:
            int r2 = r4.densityDpi
            int r4 = r6.densityDpi
            if (r2 == r4) goto L_0x0184
            r7.densityDpi = r4
            goto L_0x0184
        L_0x0183:
            r7 = r3
        L_0x0184:
            android.content.res.Configuration r1 = r9.F(r10, r1, r7)
            h.c r2 = new h.c
            r4 = 2131755525(0x7f100205, float:1.9141932E38)
            r2.<init>(r10, r4)
            r2.a(r1)
            r1 = 0
            android.content.res.Resources$Theme r10 = r10.getTheme()     // Catch:{ NullPointerException -> 0x019c }
            if (r10 == 0) goto L_0x019c
            r10 = 1
            goto L_0x019d
        L_0x019c:
            r10 = 0
        L_0x019d:
            if (r10 == 0) goto L_0x01ed
            android.content.res.Resources$Theme r10 = r2.getTheme()
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r4 < r5) goto L_0x01ad
            r10.rebase()
            goto L_0x01ed
        L_0x01ad:
            r5 = 23
            if (r4 < r5) goto L_0x01ed
            java.lang.Object r4 = y.h.f4350a
            monitor-enter(r4)
            boolean r5 = y.h.f4352c     // Catch:{ all -> 0x01ea }
            if (r5 != 0) goto L_0x01d2
            java.lang.Class<android.content.res.Resources$Theme> r5 = android.content.res.Resources.Theme.class
            java.lang.String r6 = "rebase"
            java.lang.Class[] r7 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x01c8 }
            java.lang.reflect.Method r5 = r5.getDeclaredMethod(r6, r7)     // Catch:{ NoSuchMethodException -> 0x01c8 }
            y.h.f4351b = r5     // Catch:{ NoSuchMethodException -> 0x01c8 }
            r5.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x01c8 }
            goto L_0x01d0
        L_0x01c8:
            r5 = move-exception
            java.lang.String r6 = "ResourcesCompat"
            java.lang.String r7 = "Failed to retrieve rebase() method"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x01ea }
        L_0x01d0:
            y.h.f4352c = r0     // Catch:{ all -> 0x01ea }
        L_0x01d2:
            java.lang.reflect.Method r0 = y.h.f4351b     // Catch:{ all -> 0x01ea }
            if (r0 == 0) goto L_0x01e8
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ IllegalAccessException -> 0x01de, InvocationTargetException -> 0x01dc }
            r0.invoke(r10, r1)     // Catch:{ IllegalAccessException -> 0x01de, InvocationTargetException -> 0x01dc }
            goto L_0x01e8
        L_0x01dc:
            r10 = move-exception
            goto L_0x01df
        L_0x01de:
            r10 = move-exception
        L_0x01df:
            java.lang.String r0 = "ResourcesCompat"
            java.lang.String r1 = "Failed to invoke rebase() method via reflection"
            android.util.Log.i(r0, r1, r10)     // Catch:{ all -> 0x01ea }
            y.h.f4351b = r3     // Catch:{ all -> 0x01ea }
        L_0x01e8:
            monitor-exit(r4)     // Catch:{ all -> 0x01ea }
            goto L_0x01ed
        L_0x01ea:
            r10 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01ea }
            throw r10
        L_0x01ed:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d.k.d(android.content.Context):android.content.Context");
    }

    public <T extends View> T e(int i2) {
        J();
        return this.f2710f.findViewById(i2);
    }

    public int f() {
        return this.M;
    }

    public MenuInflater g() {
        if (this.f2714j == null) {
            P();
            a aVar = this.f2713i;
            this.f2714j = new h.g(aVar != null ? aVar.b() : this.f2709e);
        }
        return this.f2714j;
    }

    public a h() {
        P();
        return this.f2713i;
    }

    public void i() {
        LayoutInflater from = LayoutInflater.from(this.f2709e);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof k)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void j() {
        if (this.f2713i != null) {
            P();
            Objects.requireNonNull(this.f2713i);
            Q(0);
        }
    }

    public void k(Configuration configuration) {
        if (this.f2730z && this.f2724t) {
            P();
            a aVar = this.f2713i;
            if (aVar != null) {
                v vVar = (v) aVar;
                vVar.f(vVar.f2803a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        androidx.appcompat.widget.k a2 = androidx.appcompat.widget.k.a();
        Context context = this.f2709e;
        synchronized (a2) {
            r0 r0Var = a2.f673a;
            synchronized (r0Var) {
                m.e eVar = r0Var.f770d.get(context);
                if (eVar != null) {
                    eVar.b();
                }
            }
        }
        this.L = new Configuration(this.f2709e.getResources().getConfiguration());
        A(false);
    }

    public void l(Bundle bundle) {
        this.I = true;
        A(false);
        K();
        Object obj = this.f2708d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                str = w.g.c(activity, activity.getComponentName());
            } catch (PackageManager.NameNotFoundException e2) {
                throw new IllegalArgumentException(e2);
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a aVar = this.f2713i;
                if (aVar == null) {
                    this.V = true;
                } else {
                    aVar.c(true);
                }
            }
            synchronized (j.f2704c) {
                j.s(this);
                j.f2703b.add(new WeakReference(this));
            }
        }
        this.L = new Configuration(this.f2709e.getResources().getConfiguration());
        this.J = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2708d
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = d.j.f2704c
            monitor-enter(r0)
            d.j.s(r3)     // Catch:{ all -> 0x000e }
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            goto L_0x0011
        L_0x000e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r1
        L_0x0011:
            boolean r0 = r3.S
            if (r0 == 0) goto L_0x0020
            android.view.Window r0 = r3.f2710f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.U
            r0.removeCallbacks(r1)
        L_0x0020:
            r0 = 1
            r3.K = r0
            int r0 = r3.M
            r1 = -100
            if (r0 == r1) goto L_0x004d
            java.lang.Object r0 = r3.f2708d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L_0x004d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L_0x004d
            m.h<java.lang.String, java.lang.Integer> r0 = Z
            java.lang.Object r1 = r3.f2708d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.M
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L_0x005c
        L_0x004d:
            m.h<java.lang.String, java.lang.Integer> r0 = Z
            java.lang.Object r1 = r3.f2708d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L_0x005c:
            d.a r0 = r3.f2713i
            if (r0 == 0) goto L_0x0063
            java.util.Objects.requireNonNull(r0)
        L_0x0063:
            d.k$f r0 = r3.Q
            if (r0 == 0) goto L_0x006a
            r0.a()
        L_0x006a:
            d.k$f r0 = r3.R
            if (r0 == 0) goto L_0x0071
            r0.a()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.k.m():void");
    }

    public void n(Bundle bundle) {
        J();
    }

    public void o() {
        P();
        a aVar = this.f2713i;
        if (aVar != null) {
            ((v) aVar).f2823u = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: androidx.appcompat.widget.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: androidx.appcompat.widget.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v76, resolved type: androidx.appcompat.widget.r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v78, resolved type: androidx.appcompat.widget.d0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: androidx.appcompat.widget.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: androidx.appcompat.widget.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v81, resolved type: androidx.appcompat.widget.a0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v82, resolved type: androidx.appcompat.widget.u} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v83, resolved type: androidx.appcompat.widget.f0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v84, resolved type: androidx.appcompat.widget.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v85, resolved type: androidx.appcompat.widget.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v86, resolved type: androidx.appcompat.widget.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v87, resolved type: androidx.appcompat.widget.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v88, resolved type: androidx.appcompat.widget.f} */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r9v15, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v8, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v24 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0114, code lost:
        if (r9.equals("ImageButton") == false) goto L_0x0143;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r7 = this;
            d.q r8 = r7.Y
            r0 = 0
            if (r8 != 0) goto L_0x0059
            android.content.Context r8 = r7.f2709e
            int[] r1 = c.c.f2047j
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r1)
            r1 = 116(0x74, float:1.63E-43)
            java.lang.String r8 = r8.getString(r1)
            if (r8 != 0) goto L_0x001b
            d.q r8 = new d.q
            r8.<init>()
            goto L_0x0057
        L_0x001b:
            android.content.Context r1 = r7.f2709e     // Catch:{ all -> 0x0036 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x0036 }
            java.lang.Class r1 = r1.loadClass(r8)     // Catch:{ all -> 0x0036 }
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x0036 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r2)     // Catch:{ all -> 0x0036 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0036 }
            java.lang.Object r1 = r1.newInstance(r2)     // Catch:{ all -> 0x0036 }
            d.q r1 = (d.q) r1     // Catch:{ all -> 0x0036 }
            r7.Y = r1     // Catch:{ all -> 0x0036 }
            goto L_0x0059
        L_0x0036:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to instantiate custom view inflater "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = ". Falling back to default."
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            java.lang.String r2 = "AppCompatDelegate"
            android.util.Log.i(r2, r8, r1)
            d.q r8 = new d.q
            r8.<init>()
        L_0x0057:
            r7.Y = r8
        L_0x0059:
            d.q r8 = r7.Y
            int r1 = androidx.appcompat.widget.h1.f640a
            java.util.Objects.requireNonNull(r8)
            r1 = 4
            int[] r2 = c.c.f2062y
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r11, r2, r0, r0)
            int r3 = r2.getResourceId(r1, r0)
            if (r3 == 0) goto L_0x0074
            java.lang.String r4 = "AppCompatViewInflater"
            java.lang.String r5 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r4, r5)
        L_0x0074:
            r2.recycle()
            if (r3 == 0) goto L_0x008a
            boolean r2 = r10 instanceof h.c
            if (r2 == 0) goto L_0x0084
            r2 = r10
            h.c r2 = (h.c) r2
            int r2 = r2.f3093a
            if (r2 == r3) goto L_0x008a
        L_0x0084:
            h.c r2 = new h.c
            r2.<init>(r10, r3)
            goto L_0x008b
        L_0x008a:
            r2 = r10
        L_0x008b:
            java.util.Objects.requireNonNull(r9)
            int r3 = r9.hashCode()
            r4 = -1
            r5 = 1
            switch(r3) {
                case -1946472170: goto L_0x0138;
                case -1455429095: goto L_0x012d;
                case -1346021293: goto L_0x0122;
                case -938935918: goto L_0x0117;
                case -937446323: goto L_0x010e;
                case -658531749: goto L_0x0103;
                case -339785223: goto L_0x00f8;
                case 776382189: goto L_0x00ed;
                case 799298502: goto L_0x00df;
                case 1125864064: goto L_0x00d1;
                case 1413872058: goto L_0x00c3;
                case 1601505219: goto L_0x00b5;
                case 1666676343: goto L_0x00a7;
                case 2001146706: goto L_0x0099;
                default: goto L_0x0097;
            }
        L_0x0097:
            goto L_0x0143
        L_0x0099:
            java.lang.String r1 = "Button"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00a3
            goto L_0x0143
        L_0x00a3:
            r1 = 13
            goto L_0x0144
        L_0x00a7:
            java.lang.String r1 = "EditText"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00b1
            goto L_0x0143
        L_0x00b1:
            r1 = 12
            goto L_0x0144
        L_0x00b5:
            java.lang.String r1 = "CheckBox"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00bf
            goto L_0x0143
        L_0x00bf:
            r1 = 11
            goto L_0x0144
        L_0x00c3:
            java.lang.String r1 = "AutoCompleteTextView"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00cd
            goto L_0x0143
        L_0x00cd:
            r1 = 10
            goto L_0x0144
        L_0x00d1:
            java.lang.String r1 = "ImageView"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00db
            goto L_0x0143
        L_0x00db:
            r1 = 9
            goto L_0x0144
        L_0x00df:
            java.lang.String r1 = "ToggleButton"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00e9
            goto L_0x0143
        L_0x00e9:
            r1 = 8
            goto L_0x0144
        L_0x00ed:
            java.lang.String r1 = "RadioButton"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x00f6
            goto L_0x0143
        L_0x00f6:
            r1 = 7
            goto L_0x0144
        L_0x00f8:
            java.lang.String r1 = "Spinner"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0101
            goto L_0x0143
        L_0x0101:
            r1 = 6
            goto L_0x0144
        L_0x0103:
            java.lang.String r1 = "SeekBar"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x010c
            goto L_0x0143
        L_0x010c:
            r1 = 5
            goto L_0x0144
        L_0x010e:
            java.lang.String r3 = "ImageButton"
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L_0x0144
            goto L_0x0143
        L_0x0117:
            java.lang.String r1 = "TextView"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0120
            goto L_0x0143
        L_0x0120:
            r1 = 3
            goto L_0x0144
        L_0x0122:
            java.lang.String r1 = "MultiAutoCompleteTextView"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x012b
            goto L_0x0143
        L_0x012b:
            r1 = 2
            goto L_0x0144
        L_0x012d:
            java.lang.String r1 = "CheckedTextView"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0136
            goto L_0x0143
        L_0x0136:
            r1 = 1
            goto L_0x0144
        L_0x0138:
            java.lang.String r1 = "RatingBar"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L_0x0141
            goto L_0x0143
        L_0x0141:
            r1 = 0
            goto L_0x0144
        L_0x0143:
            r1 = -1
        L_0x0144:
            r3 = 0
            switch(r1) {
                case 0: goto L_0x0199;
                case 1: goto L_0x0193;
                case 2: goto L_0x018d;
                case 3: goto L_0x0185;
                case 4: goto L_0x017f;
                case 5: goto L_0x0179;
                case 6: goto L_0x0170;
                case 7: goto L_0x016b;
                case 8: goto L_0x0165;
                case 9: goto L_0x015f;
                case 10: goto L_0x015a;
                case 11: goto L_0x0155;
                case 12: goto L_0x014f;
                case 13: goto L_0x014a;
                default: goto L_0x0148;
            }
        L_0x0148:
            r1 = r3
            goto L_0x019e
        L_0x014a:
            androidx.appcompat.widget.f r1 = r8.b(r2, r11)
            goto L_0x0189
        L_0x014f:
            androidx.appcompat.widget.l r1 = new androidx.appcompat.widget.l
            r1.<init>(r2, r11)
            goto L_0x019e
        L_0x0155:
            androidx.appcompat.widget.g r1 = r8.c(r2, r11)
            goto L_0x0189
        L_0x015a:
            androidx.appcompat.widget.d r1 = r8.a(r2, r11)
            goto L_0x0189
        L_0x015f:
            androidx.appcompat.widget.q r1 = new androidx.appcompat.widget.q
            r1.<init>(r2, r11, r0)
            goto L_0x019e
        L_0x0165:
            androidx.appcompat.widget.f0 r1 = new androidx.appcompat.widget.f0
            r1.<init>(r2, r11)
            goto L_0x019e
        L_0x016b:
            androidx.appcompat.widget.u r1 = r8.d(r2, r11)
            goto L_0x0189
        L_0x0170:
            androidx.appcompat.widget.a0 r1 = new androidx.appcompat.widget.a0
            r6 = 2130903907(0x7f030363, float:1.7414645E38)
            r1.<init>(r2, r11, r6)
            goto L_0x019e
        L_0x0179:
            androidx.appcompat.widget.x r1 = new androidx.appcompat.widget.x
            r1.<init>(r2, r11)
            goto L_0x019e
        L_0x017f:
            androidx.appcompat.widget.o r1 = new androidx.appcompat.widget.o
            r1.<init>(r2, r11)
            goto L_0x019e
        L_0x0185:
            androidx.appcompat.widget.d0 r1 = r8.e(r2, r11)
        L_0x0189:
            r8.g(r1, r9)
            goto L_0x019e
        L_0x018d:
            androidx.appcompat.widget.r r1 = new androidx.appcompat.widget.r
            r1.<init>(r2, r11)
            goto L_0x019e
        L_0x0193:
            androidx.appcompat.widget.h r1 = new androidx.appcompat.widget.h
            r1.<init>(r2, r11)
            goto L_0x019e
        L_0x0199:
            androidx.appcompat.widget.v r1 = new androidx.appcompat.widget.v
            r1.<init>(r2, r11)
        L_0x019e:
            if (r1 != 0) goto L_0x01f9
            if (r10 == r2) goto L_0x01f9
            java.lang.String r10 = "view"
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x01b0
            java.lang.String r9 = "class"
            java.lang.String r9 = r11.getAttributeValue(r3, r9)
        L_0x01b0:
            java.lang.Object[] r10 = r8.f2777a     // Catch:{ Exception -> 0x01f2, all -> 0x01ea }
            r10[r0] = r2     // Catch:{ Exception -> 0x01f2, all -> 0x01ea }
            r10[r5] = r11     // Catch:{ Exception -> 0x01f2, all -> 0x01ea }
            r10 = 46
            int r10 = r9.indexOf(r10)     // Catch:{ Exception -> 0x01f2, all -> 0x01ea }
            if (r4 != r10) goto L_0x01de
            r10 = 0
        L_0x01bf:
            java.lang.String[] r1 = d.q.f2775g     // Catch:{ Exception -> 0x01f2, all -> 0x01ea }
            int r4 = r1.length     // Catch:{ Exception -> 0x01f2, all -> 0x01ea }
            if (r10 >= r4) goto L_0x01d7
            r1 = r1[r10]     // Catch:{ Exception -> 0x01f2, all -> 0x01ea }
            android.view.View r1 = r8.f(r2, r9, r1)     // Catch:{ Exception -> 0x01f2, all -> 0x01ea }
            if (r1 == 0) goto L_0x01d4
            java.lang.Object[] r8 = r8.f2777a
            r8[r0] = r3
            r8[r5] = r3
            r3 = r1
            goto L_0x01f8
        L_0x01d4:
            int r10 = r10 + 1
            goto L_0x01bf
        L_0x01d7:
            java.lang.Object[] r8 = r8.f2777a
            r8[r0] = r3
            r8[r5] = r3
            goto L_0x01f8
        L_0x01de:
            android.view.View r9 = r8.f(r2, r9, r3)     // Catch:{ Exception -> 0x01f2, all -> 0x01ea }
            java.lang.Object[] r8 = r8.f2777a
            r8[r0] = r3
            r8[r5] = r3
            r3 = r9
            goto L_0x01f8
        L_0x01ea:
            r9 = move-exception
            java.lang.Object[] r8 = r8.f2777a
            r8[r0] = r3
            r8[r5] = r3
            throw r9
        L_0x01f2:
            java.lang.Object[] r8 = r8.f2777a
            r8[r0] = r3
            r8[r5] = r3
        L_0x01f8:
            r1 = r3
        L_0x01f9:
            if (r1 == 0) goto L_0x028a
            android.content.Context r8 = r1.getContext()
            boolean r9 = r8 instanceof android.content.ContextWrapper
            if (r9 == 0) goto L_0x0223
            java.util.WeakHashMap<android.view.View, g0.x> r9 = g0.u.f3063a
            boolean r9 = g0.u.c.a(r1)
            if (r9 != 0) goto L_0x020c
            goto L_0x0223
        L_0x020c:
            int[] r9 = d.q.f2771c
            android.content.res.TypedArray r8 = r8.obtainStyledAttributes(r11, r9)
            java.lang.String r9 = r8.getString(r0)
            if (r9 == 0) goto L_0x0220
            d.q$a r10 = new d.q$a
            r10.<init>(r1, r9)
            r1.setOnClickListener(r10)
        L_0x0220:
            r8.recycle()
        L_0x0223:
            java.lang.Class<java.lang.Boolean> r8 = java.lang.Boolean.class
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 <= r10) goto L_0x022c
            goto L_0x028a
        L_0x022c:
            int[] r9 = d.q.f2772d
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r11, r9)
            boolean r3 = r9.hasValue(r0)
            if (r3 == 0) goto L_0x024d
            boolean r3 = r9.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, g0.x> r4 = g0.u.f3063a
            g0.t r4 = new g0.t
            r5 = 2131231143(0x7f0801a7, float:1.8078359E38)
            r4.<init>(r5, r8, r10)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r4.e(r1, r3)
        L_0x024d:
            r9.recycle()
            int[] r9 = d.q.f2773e
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r11, r9)
            boolean r3 = r9.hasValue(r0)
            if (r3 == 0) goto L_0x0263
            java.lang.String r3 = r9.getString(r0)
            g0.u.v(r1, r3)
        L_0x0263:
            r9.recycle()
            int[] r9 = d.q.f2774f
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r11, r9)
            boolean r11 = r9.hasValue(r0)
            if (r11 == 0) goto L_0x0287
            boolean r11 = r9.getBoolean(r0, r0)
            java.util.WeakHashMap<android.view.View, g0.x> r0 = g0.u.f3063a
            g0.r r0 = new g0.r
            r2 = 2131231148(0x7f0801ac, float:1.8078369E38)
            r0.<init>(r2, r8, r10)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r11)
            r0.e(r1, r8)
        L_0x0287:
            r9.recycle()
        L_0x028a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d.k.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    public void p(Bundle bundle) {
    }

    public void q() {
        z();
    }

    public void r() {
        P();
        a aVar = this.f2713i;
        if (aVar != null) {
            v vVar = (v) aVar;
            vVar.f2823u = false;
            h.h hVar = vVar.f2822t;
            if (hVar != null) {
                hVar.a();
            }
        }
    }

    public boolean t(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.D && i2 == 108) {
            return false;
        }
        if (this.f2730z && i2 == 1) {
            this.f2730z = false;
        }
        if (i2 == 1) {
            W();
            this.D = true;
            return true;
        } else if (i2 == 2) {
            W();
            this.f2728x = true;
            return true;
        } else if (i2 == 5) {
            W();
            this.f2729y = true;
            return true;
        } else if (i2 == 10) {
            W();
            this.B = true;
            return true;
        } else if (i2 == 108) {
            W();
            this.f2730z = true;
            return true;
        } else if (i2 != 109) {
            return this.f2710f.requestFeature(i2);
        } else {
            W();
            this.A = true;
            return true;
        }
    }

    public void u(int i2) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.f2725u.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2709e).inflate(i2, viewGroup);
        this.f2711g.f3154b.onContentChanged();
    }

    public void v(View view) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.f2725u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2711g.f3154b.onContentChanged();
    }

    public void w(View view, ViewGroup.LayoutParams layoutParams) {
        J();
        ViewGroup viewGroup = (ViewGroup) this.f2725u.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2711g.f3154b.onContentChanged();
    }

    public void x(int i2) {
        this.N = i2;
    }

    public final void y(CharSequence charSequence) {
        this.f2715k = charSequence;
        g0 g0Var = this.f2716l;
        if (g0Var != null) {
            g0Var.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.f2713i;
        if (aVar != null) {
            ((v) aVar).f2807e.setWindowTitle(charSequence);
            return;
        }
        TextView textView = this.f2726v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean z() {
        return A(true);
    }

    public class d extends h.i {
        public d(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final android.view.ActionMode a(android.view.ActionMode.Callback r10) {
            /*
                r9 = this;
                h.e$a r0 = new h.e$a
                d.k r1 = d.k.this
                android.content.Context r1 = r1.f2709e
                r0.<init>(r1, r10)
                d.k r10 = d.k.this
                java.util.Objects.requireNonNull(r10)
                h.a r1 = r10.f2719o
                if (r1 == 0) goto L_0x0015
                r1.c()
            L_0x0015:
                d.k$c r1 = new d.k$c
                r1.<init>(r0)
                r10.P()
                d.a r2 = r10.f2713i
                r3 = 1
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x0078
                d.v r2 = (d.v) r2
                d.v$d r6 = r2.f2811i
                if (r6 == 0) goto L_0x002d
                r6.c()
            L_0x002d:
                androidx.appcompat.widget.ActionBarOverlayLayout r6 = r2.f2805c
                r6.setHideOnContentScrollEnabled(r4)
                androidx.appcompat.widget.ActionBarContextView r6 = r2.f2808f
                r6.h()
                d.v$d r6 = new d.v$d
                androidx.appcompat.widget.ActionBarContextView r7 = r2.f2808f
                android.content.Context r7 = r7.getContext()
                r6.<init>(r7, r1)
                androidx.appcompat.view.menu.e r7 = r6.f2832e
                r7.y()
                h.a$a r7 = r6.f2833f     // Catch:{ all -> 0x0071 }
                androidx.appcompat.view.menu.e r8 = r6.f2832e     // Catch:{ all -> 0x0071 }
                boolean r7 = r7.d(r6, r8)     // Catch:{ all -> 0x0071 }
                androidx.appcompat.view.menu.e r8 = r6.f2832e
                r8.x()
                if (r7 == 0) goto L_0x0064
                r2.f2811i = r6
                r6.i()
                androidx.appcompat.widget.ActionBarContextView r7 = r2.f2808f
                r7.f(r6)
                r2.d(r3)
                goto L_0x0065
            L_0x0064:
                r6 = r5
            L_0x0065:
                r10.f2719o = r6
                if (r6 == 0) goto L_0x0078
                d.i r2 = r10.f2712h
                if (r2 == 0) goto L_0x0078
                r2.e(r6)
                goto L_0x0078
            L_0x0071:
                r10 = move-exception
                androidx.appcompat.view.menu.e r0 = r6.f2832e
                r0.x()
                throw r10
            L_0x0078:
                h.a r2 = r10.f2719o
                if (r2 != 0) goto L_0x01f3
                r10.I()
                h.a r2 = r10.f2719o
                if (r2 == 0) goto L_0x0086
                r2.c()
            L_0x0086:
                d.i r2 = r10.f2712h
                if (r2 == 0) goto L_0x0093
                boolean r6 = r10.K
                if (r6 != 0) goto L_0x0093
                h.a r2 = r2.b(r1)     // Catch:{ AbstractMethodError -> 0x0093 }
                goto L_0x0094
            L_0x0093:
                r2 = r5
            L_0x0094:
                if (r2 == 0) goto L_0x009a
                r10.f2719o = r2
                goto L_0x01e4
            L_0x009a:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f2720p
                if (r2 != 0) goto L_0x0154
                boolean r2 = r10.C
                if (r2 == 0) goto L_0x0127
                android.util.TypedValue r2 = new android.util.TypedValue
                r2.<init>()
                android.content.Context r6 = r10.f2709e
                android.content.res.Resources$Theme r6 = r6.getTheme()
                r7 = 2130903051(0x7f03000b, float:1.741291E38)
                r6.resolveAttribute(r7, r2, r3)
                int r7 = r2.resourceId
                if (r7 == 0) goto L_0x00d8
                android.content.Context r7 = r10.f2709e
                android.content.res.Resources r7 = r7.getResources()
                android.content.res.Resources$Theme r7 = r7.newTheme()
                r7.setTo(r6)
                int r6 = r2.resourceId
                r7.applyStyle(r6, r3)
                h.c r6 = new h.c
                android.content.Context r8 = r10.f2709e
                r6.<init>(r8, r4)
                android.content.res.Resources$Theme r8 = r6.getTheme()
                r8.setTo(r7)
                goto L_0x00da
            L_0x00d8:
                android.content.Context r6 = r10.f2709e
            L_0x00da:
                androidx.appcompat.widget.ActionBarContextView r7 = new androidx.appcompat.widget.ActionBarContextView
                r7.<init>(r6, r5)
                r10.f2720p = r7
                android.widget.PopupWindow r7 = new android.widget.PopupWindow
                r8 = 2130903066(0x7f03001a, float:1.741294E38)
                r7.<init>(r6, r5, r8)
                r10.f2721q = r7
                r8 = 2
                j0.f.b(r7, r8)
                android.widget.PopupWindow r7 = r10.f2721q
                androidx.appcompat.widget.ActionBarContextView r8 = r10.f2720p
                r7.setContentView(r8)
                android.widget.PopupWindow r7 = r10.f2721q
                r8 = -1
                r7.setWidth(r8)
                android.content.res.Resources$Theme r7 = r6.getTheme()
                r8 = 2130903045(0x7f030005, float:1.7412897E38)
                r7.resolveAttribute(r8, r2, r3)
                int r2 = r2.data
                android.content.res.Resources r6 = r6.getResources()
                android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
                int r2 = android.util.TypedValue.complexToDimensionPixelSize(r2, r6)
                androidx.appcompat.widget.ActionBarContextView r6 = r10.f2720p
                r6.setContentHeight(r2)
                android.widget.PopupWindow r2 = r10.f2721q
                r6 = -2
                r2.setHeight(r6)
                d.n r2 = new d.n
                r2.<init>(r10)
                r10.f2722r = r2
                goto L_0x0154
            L_0x0127:
                android.view.ViewGroup r2 = r10.f2725u
                r6 = 2131230785(0x7f080041, float:1.8077633E38)
                android.view.View r2 = r2.findViewById(r6)
                androidx.appcompat.widget.ViewStubCompat r2 = (androidx.appcompat.widget.ViewStubCompat) r2
                if (r2 == 0) goto L_0x0154
                r10.P()
                d.a r6 = r10.f2713i
                if (r6 == 0) goto L_0x0140
                android.content.Context r6 = r6.b()
                goto L_0x0141
            L_0x0140:
                r6 = r5
            L_0x0141:
                if (r6 != 0) goto L_0x0145
                android.content.Context r6 = r10.f2709e
            L_0x0145:
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                r2.setLayoutInflater(r6)
                android.view.View r2 = r2.a()
                androidx.appcompat.widget.ActionBarContextView r2 = (androidx.appcompat.widget.ActionBarContextView) r2
                r10.f2720p = r2
            L_0x0154:
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f2720p
                if (r2 == 0) goto L_0x01e4
                r10.I()
                androidx.appcompat.widget.ActionBarContextView r2 = r10.f2720p
                r2.h()
                h.d r2 = new h.d
                androidx.appcompat.widget.ActionBarContextView r6 = r10.f2720p
                android.content.Context r6 = r6.getContext()
                androidx.appcompat.widget.ActionBarContextView r7 = r10.f2720p
                android.widget.PopupWindow r8 = r10.f2721q
                if (r8 != 0) goto L_0x016f
                goto L_0x0170
            L_0x016f:
                r3 = 0
            L_0x0170:
                r2.<init>(r6, r7, r1, r3)
                androidx.appcompat.view.menu.e r3 = r2.f3103i
                boolean r1 = r1.d(r2, r3)
                if (r1 == 0) goto L_0x01e2
                r2.i()
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f2720p
                r1.f(r2)
                r10.f2719o = r2
                boolean r1 = r10.V()
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r1 == 0) goto L_0x01b1
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f2720p
                r3 = 0
                r1.setAlpha(r3)
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f2720p
                g0.x r1 = g0.u.b(r1)
                r1.a(r2)
                r10.f2723s = r1
                d.o r2 = new d.o
                r2.<init>(r10)
                java.lang.ref.WeakReference<android.view.View> r3 = r1.f3085a
                java.lang.Object r3 = r3.get()
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01d2
                r1.e(r3, r2)
                goto L_0x01d2
            L_0x01b1:
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f2720p
                r1.setAlpha(r2)
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f2720p
                r1.setVisibility(r4)
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f2720p
                android.view.ViewParent r1 = r1.getParent()
                boolean r1 = r1 instanceof android.view.View
                if (r1 == 0) goto L_0x01d2
                androidx.appcompat.widget.ActionBarContextView r1 = r10.f2720p
                android.view.ViewParent r1 = r1.getParent()
                android.view.View r1 = (android.view.View) r1
                java.util.WeakHashMap<android.view.View, g0.x> r2 = g0.u.f3063a
                g0.u.h.c(r1)
            L_0x01d2:
                android.widget.PopupWindow r1 = r10.f2721q
                if (r1 == 0) goto L_0x01e4
                android.view.Window r1 = r10.f2710f
                android.view.View r1 = r1.getDecorView()
                java.lang.Runnable r2 = r10.f2722r
                r1.post(r2)
                goto L_0x01e4
            L_0x01e2:
                r10.f2719o = r5
            L_0x01e4:
                h.a r1 = r10.f2719o
                if (r1 == 0) goto L_0x01ef
                d.i r2 = r10.f2712h
                if (r2 == 0) goto L_0x01ef
                r2.e(r1)
            L_0x01ef:
                h.a r1 = r10.f2719o
                r10.f2719o = r1
            L_0x01f3:
                h.a r10 = r10.f2719o
                if (r10 == 0) goto L_0x01fc
                android.view.ActionMode r10 = r0.e(r10)
                return r10
            L_0x01fc:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: d.k.d.a(android.view.ActionMode$Callback):android.view.ActionMode");
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return k.this.G(keyEvent) || this.f3154b.dispatchKeyEvent(keyEvent);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
            if (r3 != false) goto L_0x006b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
            if (r7 != false) goto L_0x006b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0071 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
            /*
                r6 = this;
                android.view.Window$Callback r0 = r6.f3154b
                boolean r0 = r0.dispatchKeyShortcutEvent(r7)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0072
                d.k r0 = d.k.this
                int r3 = r7.getKeyCode()
                r0.P()
                d.a r4 = r0.f2713i
                if (r4 == 0) goto L_0x003f
                d.v r4 = (d.v) r4
                d.v$d r4 = r4.f2811i
                if (r4 != 0) goto L_0x001e
                goto L_0x003b
            L_0x001e:
                androidx.appcompat.view.menu.e r4 = r4.f2832e
                if (r4 == 0) goto L_0x003b
                int r5 = r7.getDeviceId()
                android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
                int r5 = r5.getKeyboardType()
                if (r5 == r1) goto L_0x0032
                r5 = 1
                goto L_0x0033
            L_0x0032:
                r5 = 0
            L_0x0033:
                r4.setQwertyMode(r5)
                boolean r3 = r4.performShortcut(r3, r7, r2)
                goto L_0x003c
            L_0x003b:
                r3 = 0
            L_0x003c:
                if (r3 == 0) goto L_0x003f
                goto L_0x006b
            L_0x003f:
                d.k$i r3 = r0.G
                if (r3 == 0) goto L_0x0054
                int r4 = r7.getKeyCode()
                boolean r3 = r0.T(r3, r4, r7, r1)
                if (r3 == 0) goto L_0x0054
                d.k$i r7 = r0.G
                if (r7 == 0) goto L_0x006b
                r7.f2756l = r1
                goto L_0x006b
            L_0x0054:
                d.k$i r3 = r0.G
                if (r3 != 0) goto L_0x006d
                d.k$i r3 = r0.N(r2)
                r0.U(r3, r7)
                int r4 = r7.getKeyCode()
                boolean r7 = r0.T(r3, r4, r7, r1)
                r3.f2755k = r2
                if (r7 == 0) goto L_0x006d
            L_0x006b:
                r7 = 1
                goto L_0x006e
            L_0x006d:
                r7 = 0
            L_0x006e:
                if (r7 == 0) goto L_0x0071
                goto L_0x0072
            L_0x0071:
                r1 = 0
            L_0x0072:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d.k.d.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i2, Menu menu) {
            if (i2 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return this.f3154b.onCreatePanelMenu(i2, menu);
            }
            return false;
        }

        public View onCreatePanelView(int i2) {
            return this.f3154b.onCreatePanelView(i2);
        }

        public boolean onMenuOpened(int i2, Menu menu) {
            this.f3154b.onMenuOpened(i2, menu);
            k kVar = k.this;
            Objects.requireNonNull(kVar);
            if (i2 == 108) {
                kVar.P();
                a aVar = kVar.f2713i;
                if (aVar != null) {
                    aVar.a(true);
                }
            }
            return true;
        }

        public void onPanelClosed(int i2, Menu menu) {
            this.f3154b.onPanelClosed(i2, menu);
            k kVar = k.this;
            Objects.requireNonNull(kVar);
            if (i2 == 108) {
                kVar.P();
                a aVar = kVar.f2713i;
                if (aVar != null) {
                    aVar.a(false);
                }
            } else if (i2 == 0) {
                i N = kVar.N(i2);
                if (N.f2757m) {
                    kVar.E(N, false);
                }
            }
        }

        public boolean onPreparePanel(int i2, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i2 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f239x = true;
            }
            boolean onPreparePanel = this.f3154b.onPreparePanel(i2, view, menu);
            if (eVar != null) {
                eVar.f239x = false;
            }
            return onPreparePanel;
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i2) {
            androidx.appcompat.view.menu.e eVar = k.this.N(0).f2752h;
            if (eVar != null) {
                this.f3154b.onProvideKeyboardShortcuts(list, eVar, i2);
            } else {
                this.f3154b.onProvideKeyboardShortcuts(list, menu, i2);
            }
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            Objects.requireNonNull(k.this);
            return a(callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i2) {
            Objects.requireNonNull(k.this);
            if (i2 != 0) {
                return this.f3154b.onWindowStartingActionMode(callback, i2);
            }
            return a(callback);
        }
    }
}
