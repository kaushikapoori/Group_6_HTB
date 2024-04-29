package d;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.u0;
import com.example.supermarket.R;
import d.a;
import g0.a0;
import g0.u;
import g0.x;
import g0.y;
import g0.z;
import h.a;
import h.g;
import h.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class v extends a implements ActionBarOverlayLayout.d {
    public static final Interpolator A = new DecelerateInterpolator();

    /* renamed from: z  reason: collision with root package name */
    public static final Interpolator f2802z = new AccelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f2803a;

    /* renamed from: b  reason: collision with root package name */
    public Context f2804b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f2805c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f2806d;

    /* renamed from: e  reason: collision with root package name */
    public h0 f2807e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f2808f;

    /* renamed from: g  reason: collision with root package name */
    public View f2809g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2810h;

    /* renamed from: i  reason: collision with root package name */
    public d f2811i;

    /* renamed from: j  reason: collision with root package name */
    public h.a f2812j;

    /* renamed from: k  reason: collision with root package name */
    public a.C0033a f2813k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f2814l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<a.b> f2815m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public boolean f2816n;

    /* renamed from: o  reason: collision with root package name */
    public int f2817o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2818p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2819q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2820r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2821s = true;

    /* renamed from: t  reason: collision with root package name */
    public h f2822t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2823u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2824v;

    /* renamed from: w  reason: collision with root package name */
    public final y f2825w = new a();

    /* renamed from: x  reason: collision with root package name */
    public final y f2826x = new b();

    /* renamed from: y  reason: collision with root package name */
    public final a0 f2827y = new c();

    public class a extends z {
        public a() {
        }

        public void a(View view) {
            View view2;
            v vVar = v.this;
            if (vVar.f2818p && (view2 = vVar.f2809g) != null) {
                view2.setTranslationY(0.0f);
                v.this.f2806d.setTranslationY(0.0f);
            }
            v.this.f2806d.setVisibility(8);
            v.this.f2806d.setTransitioning(false);
            v vVar2 = v.this;
            vVar2.f2822t = null;
            a.C0033a aVar = vVar2.f2813k;
            if (aVar != null) {
                aVar.c(vVar2.f2812j);
                vVar2.f2812j = null;
                vVar2.f2813k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = v.this.f2805c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                u.h.c(actionBarOverlayLayout);
            }
        }
    }

    public class b extends z {
        public b() {
        }

        public void a(View view) {
            v vVar = v.this;
            vVar.f2822t = null;
            vVar.f2806d.requestLayout();
        }
    }

    public class c implements a0 {
        public c() {
        }
    }

    public class d extends h.a implements e.a {

        /* renamed from: d  reason: collision with root package name */
        public final Context f2831d;

        /* renamed from: e  reason: collision with root package name */
        public final e f2832e;

        /* renamed from: f  reason: collision with root package name */
        public a.C0033a f2833f;

        /* renamed from: g  reason: collision with root package name */
        public WeakReference<View> f2834g;

        public d(Context context, a.C0033a aVar) {
            this.f2831d = context;
            this.f2833f = aVar;
            e eVar = new e(context);
            eVar.f227l = 1;
            this.f2832e = eVar;
            eVar.f220e = this;
        }

        public void a(e eVar) {
            if (this.f2833f != null) {
                i();
                androidx.appcompat.widget.c cVar = v.this.f2808f.f479e;
                if (cVar != null) {
                    cVar.n();
                }
            }
        }

        public boolean b(e eVar, MenuItem menuItem) {
            a.C0033a aVar = this.f2833f;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        public void c() {
            v vVar = v.this;
            if (vVar.f2811i == this) {
                if (!(!vVar.f2819q)) {
                    vVar.f2812j = this;
                    vVar.f2813k = this.f2833f;
                } else {
                    this.f2833f.c(this);
                }
                this.f2833f = null;
                v.this.d(false);
                ActionBarContextView actionBarContextView = v.this.f2808f;
                if (actionBarContextView.f318l == null) {
                    actionBarContextView.h();
                }
                v vVar2 = v.this;
                vVar2.f2805c.setHideOnContentScrollEnabled(vVar2.f2824v);
                v.this.f2811i = null;
            }
        }

        public View d() {
            WeakReference<View> weakReference = this.f2834g;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        public Menu e() {
            return this.f2832e;
        }

        public MenuInflater f() {
            return new g(this.f2831d);
        }

        public CharSequence g() {
            return v.this.f2808f.getSubtitle();
        }

        public CharSequence h() {
            return v.this.f2808f.getTitle();
        }

        public void i() {
            if (v.this.f2811i == this) {
                this.f2832e.y();
                try {
                    this.f2833f.a(this, this.f2832e);
                } finally {
                    this.f2832e.x();
                }
            }
        }

        public boolean j() {
            return v.this.f2808f.f326t;
        }

        public void k(View view) {
            v.this.f2808f.setCustomView(view);
            this.f2834g = new WeakReference<>(view);
        }

        public void l(int i2) {
            v.this.f2808f.setSubtitle(v.this.f2803a.getResources().getString(i2));
        }

        public void m(CharSequence charSequence) {
            v.this.f2808f.setSubtitle(charSequence);
        }

        public void n(int i2) {
            v.this.f2808f.setTitle(v.this.f2803a.getResources().getString(i2));
        }

        public void o(CharSequence charSequence) {
            v.this.f2808f.setTitle(charSequence);
        }

        public void p(boolean z2) {
            this.f3092c = z2;
            v.this.f2808f.setTitleOptional(z2);
        }
    }

    public v(Activity activity, boolean z2) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        e(decorView);
        if (!z2) {
            this.f2809g = decorView.findViewById(16908290);
        }
    }

    public v(Dialog dialog) {
        new ArrayList();
        e(dialog.getWindow().getDecorView());
    }

    public void a(boolean z2) {
        if (z2 != this.f2814l) {
            this.f2814l = z2;
            int size = this.f2815m.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f2815m.get(i2).a(z2);
            }
        }
    }

    public Context b() {
        if (this.f2804b == null) {
            TypedValue typedValue = new TypedValue();
            this.f2803a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                this.f2804b = new ContextThemeWrapper(this.f2803a, i2);
            } else {
                this.f2804b = this.f2803a;
            }
        }
        return this.f2804b;
    }

    public void c(boolean z2) {
        if (!this.f2810h) {
            int i2 = z2 ? 4 : 0;
            int j2 = this.f2807e.j();
            this.f2810h = true;
            this.f2807e.t((i2 & 4) | (j2 & -5));
        }
    }

    public void d(boolean z2) {
        x xVar;
        x xVar2;
        if (z2) {
            if (!this.f2820r) {
                this.f2820r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2805c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g(false);
            }
        } else if (this.f2820r) {
            this.f2820r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2805c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g(false);
        }
        ActionBarContainer actionBarContainer = this.f2806d;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (u.g.c(actionBarContainer)) {
            if (z2) {
                xVar = this.f2807e.i(4, 100);
                xVar2 = this.f2808f.e(0, 200);
            } else {
                xVar2 = this.f2807e.i(0, 200);
                xVar = this.f2808f.e(8, 100);
            }
            h hVar = new h();
            hVar.f3145a.add(xVar);
            View view = (View) xVar.f3085a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = (View) xVar2.f3085a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            hVar.f3145a.add(xVar2);
            hVar.b();
        } else if (z2) {
            this.f2807e.k(4);
            this.f2808f.setVisibility(0);
        } else {
            this.f2807e.k(0);
            this.f2808f.setVisibility(8);
        }
    }

    public final void e(View view) {
        h0 h0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f2805c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof h0) {
            h0Var = (h0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            h0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder a2 = androidx.activity.result.a.a("Can't make a decor toolbar out of ");
            a2.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(a2.toString());
        }
        this.f2807e = h0Var;
        this.f2808f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f2806d = actionBarContainer;
        h0 h0Var2 = this.f2807e;
        if (h0Var2 == null || this.f2808f == null || actionBarContainer == null) {
            throw new IllegalStateException(v.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f2803a = h0Var2.s();
        boolean z2 = (this.f2807e.j() & 4) != 0;
        if (z2) {
            this.f2810h = true;
        }
        Context context = this.f2803a;
        this.f2807e.p((context.getApplicationInfo().targetSdkVersion < 14) || z2);
        f(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f2803a.obtainStyledAttributes((AttributeSet) null, c.c.f2038a, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2805c;
            if (actionBarOverlayLayout2.f336i) {
                this.f2824v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2806d;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.i.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void f(boolean z2) {
        this.f2816n = z2;
        if (!z2) {
            this.f2807e.o((u0) null);
            this.f2806d.setTabContainer((u0) null);
        } else {
            this.f2806d.setTabContainer((u0) null);
            this.f2807e.o((u0) null);
        }
        boolean z3 = true;
        boolean z4 = this.f2807e.u() == 2;
        this.f2807e.r(!this.f2816n && z4);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2805c;
        if (this.f2816n || !z4) {
            z3 = false;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z3);
    }

    public final void g(boolean z2) {
        View view;
        View view2;
        View view3;
        if (this.f2820r || !this.f2819q) {
            if (!this.f2821s) {
                this.f2821s = true;
                h hVar = this.f2822t;
                if (hVar != null) {
                    hVar.a();
                }
                this.f2806d.setVisibility(0);
                if (this.f2817o != 0 || (!this.f2823u && !z2)) {
                    this.f2806d.setAlpha(1.0f);
                    this.f2806d.setTranslationY(0.0f);
                    if (this.f2818p && (view2 = this.f2809g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.f2826x.a((View) null);
                } else {
                    this.f2806d.setTranslationY(0.0f);
                    float f2 = (float) (-this.f2806d.getHeight());
                    if (z2) {
                        int[] iArr = {0, 0};
                        this.f2806d.getLocationInWindow(iArr);
                        f2 -= (float) iArr[1];
                    }
                    this.f2806d.setTranslationY(f2);
                    h hVar2 = new h();
                    x b2 = u.b(this.f2806d);
                    b2.g(0.0f);
                    b2.f(this.f2827y);
                    if (!hVar2.f3149e) {
                        hVar2.f3145a.add(b2);
                    }
                    if (this.f2818p && (view3 = this.f2809g) != null) {
                        view3.setTranslationY(f2);
                        x b3 = u.b(this.f2809g);
                        b3.g(0.0f);
                        if (!hVar2.f3149e) {
                            hVar2.f3145a.add(b3);
                        }
                    }
                    Interpolator interpolator = A;
                    boolean z3 = hVar2.f3149e;
                    if (!z3) {
                        hVar2.f3147c = interpolator;
                    }
                    if (!z3) {
                        hVar2.f3146b = 250;
                    }
                    y yVar = this.f2826x;
                    if (!z3) {
                        hVar2.f3148d = yVar;
                    }
                    this.f2822t = hVar2;
                    hVar2.b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2805c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, x> weakHashMap = u.f3063a;
                    u.h.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f2821s) {
            this.f2821s = false;
            h hVar3 = this.f2822t;
            if (hVar3 != null) {
                hVar3.a();
            }
            if (this.f2817o != 0 || (!this.f2823u && !z2)) {
                this.f2825w.a((View) null);
                return;
            }
            this.f2806d.setAlpha(1.0f);
            this.f2806d.setTransitioning(true);
            h hVar4 = new h();
            float f3 = (float) (-this.f2806d.getHeight());
            if (z2) {
                int[] iArr2 = {0, 0};
                this.f2806d.getLocationInWindow(iArr2);
                f3 -= (float) iArr2[1];
            }
            x b4 = u.b(this.f2806d);
            b4.g(f3);
            b4.f(this.f2827y);
            if (!hVar4.f3149e) {
                hVar4.f3145a.add(b4);
            }
            if (this.f2818p && (view = this.f2809g) != null) {
                x b5 = u.b(view);
                b5.g(f3);
                if (!hVar4.f3149e) {
                    hVar4.f3145a.add(b5);
                }
            }
            Interpolator interpolator2 = f2802z;
            boolean z4 = hVar4.f3149e;
            if (!z4) {
                hVar4.f3147c = interpolator2;
            }
            if (!z4) {
                hVar4.f3146b = 250;
            }
            y yVar2 = this.f2825w;
            if (!z4) {
                hVar4.f3148d = yVar2;
            }
            this.f2822t = hVar4;
            hVar4.b();
        }
    }
}
