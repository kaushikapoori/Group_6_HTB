package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import c.c;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import g0.z;
import java.util.Objects;

public class d1 implements h0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f567a;

    /* renamed from: b  reason: collision with root package name */
    public int f568b;

    /* renamed from: c  reason: collision with root package name */
    public View f569c;

    /* renamed from: d  reason: collision with root package name */
    public View f570d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f571e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f572f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f573g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f574h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f575i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f576j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f577k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f578l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f579m;

    /* renamed from: n  reason: collision with root package name */
    public c f580n;

    /* renamed from: o  reason: collision with root package name */
    public int f581o = 0;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f582p;

    public class a extends z {

        /* renamed from: a  reason: collision with root package name */
        public boolean f583a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f584b;

        public a(int i2) {
            this.f584b = i2;
        }

        public void a(View view) {
            if (!this.f583a) {
                d1.this.f567a.setVisibility(this.f584b);
            }
        }

        public void b(View view) {
            d1.this.f567a.setVisibility(0);
        }

        public void c(View view) {
            this.f583a = true;
        }
    }

    public d1(Toolbar toolbar, boolean z2) {
        Drawable drawable;
        this.f567a = toolbar;
        this.f575i = toolbar.getTitle();
        this.f576j = toolbar.getSubtitle();
        this.f574h = this.f575i != null;
        this.f573g = toolbar.getNavigationIcon();
        String str = null;
        b1 q2 = b1.q(toolbar.getContext(), (AttributeSet) null, c.f2038a, R.attr.actionBarStyle, 0);
        int i2 = 15;
        this.f582p = q2.g(15);
        if (z2) {
            CharSequence n2 = q2.n(27);
            if (!TextUtils.isEmpty(n2)) {
                this.f574h = true;
                v(n2);
            }
            CharSequence n3 = q2.n(25);
            if (!TextUtils.isEmpty(n3)) {
                this.f576j = n3;
                if ((this.f568b & 8) != 0) {
                    this.f567a.setSubtitle(n3);
                }
            }
            Drawable g2 = q2.g(20);
            if (g2 != null) {
                this.f572f = g2;
                y();
            }
            Drawable g3 = q2.g(17);
            if (g3 != null) {
                this.f571e = g3;
                y();
            }
            if (this.f573g == null && (drawable = this.f582p) != null) {
                this.f573g = drawable;
                x();
            }
            t(q2.j(10, 0));
            int l2 = q2.l(9, 0);
            if (l2 != 0) {
                View inflate = LayoutInflater.from(this.f567a.getContext()).inflate(l2, this.f567a, false);
                View view = this.f570d;
                if (!(view == null || (this.f568b & 16) == 0)) {
                    this.f567a.removeView(view);
                }
                this.f570d = inflate;
                if (!(inflate == null || (this.f568b & 16) == 0)) {
                    this.f567a.addView(inflate);
                }
                t(this.f568b | 16);
            }
            int k2 = q2.k(13, 0);
            if (k2 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f567a.getLayoutParams();
                layoutParams.height = k2;
                this.f567a.setLayoutParams(layoutParams);
            }
            int e2 = q2.e(7, -1);
            int e3 = q2.e(3, -1);
            if (e2 >= 0 || e3 >= 0) {
                Toolbar toolbar2 = this.f567a;
                int max = Math.max(e2, 0);
                int max2 = Math.max(e3, 0);
                toolbar2.d();
                toolbar2.f456u.a(max, max2);
            }
            int l3 = q2.l(28, 0);
            if (l3 != 0) {
                Toolbar toolbar3 = this.f567a;
                Context context = toolbar3.getContext();
                toolbar3.f448m = l3;
                TextView textView = toolbar3.f438c;
                if (textView != null) {
                    textView.setTextAppearance(context, l3);
                }
            }
            int l4 = q2.l(26, 0);
            if (l4 != 0) {
                Toolbar toolbar4 = this.f567a;
                Context context2 = toolbar4.getContext();
                toolbar4.f449n = l4;
                TextView textView2 = toolbar4.f439d;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, l4);
                }
            }
            int l5 = q2.l(22, 0);
            if (l5 != 0) {
                this.f567a.setPopupTheme(l5);
            }
        } else {
            if (this.f567a.getNavigationIcon() != null) {
                this.f582p = this.f567a.getNavigationIcon();
            } else {
                i2 = 11;
            }
            this.f568b = i2;
        }
        q2.f527b.recycle();
        if (R.string.abc_action_bar_up_description != this.f581o) {
            this.f581o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f567a.getNavigationContentDescription())) {
                int i3 = this.f581o;
                this.f577k = i3 != 0 ? s().getString(i3) : str;
                w();
            }
        }
        this.f577k = this.f567a.getNavigationContentDescription();
        this.f567a.setNavigationOnClickListener(new c1(this));
    }

    public boolean a() {
        return this.f567a.w();
    }

    public void b(Menu menu, i.a aVar) {
        g gVar;
        if (this.f580n == null) {
            c cVar = new c(this.f567a.getContext());
            this.f580n = cVar;
            Objects.requireNonNull(cVar);
        }
        c cVar2 = this.f580n;
        cVar2.f163f = aVar;
        Toolbar toolbar = this.f567a;
        e eVar = (e) menu;
        if (eVar != null || toolbar.f437b != null) {
            toolbar.f();
            e eVar2 = toolbar.f437b.f357q;
            if (eVar2 != eVar) {
                if (eVar2 != null) {
                    eVar2.t(toolbar.M);
                    eVar2.t(toolbar.N);
                }
                if (toolbar.N == null) {
                    toolbar.N = new Toolbar.d();
                }
                cVar2.f537r = true;
                if (eVar != null) {
                    eVar.b(cVar2, toolbar.f446k);
                    eVar.b(toolbar.N, toolbar.f446k);
                } else {
                    cVar2.j(toolbar.f446k, (e) null);
                    Toolbar.d dVar = toolbar.N;
                    e eVar3 = dVar.f465b;
                    if (!(eVar3 == null || (gVar = dVar.f466c) == null)) {
                        eVar3.d(gVar);
                    }
                    dVar.f465b = null;
                    cVar2.h(true);
                    toolbar.N.h(true);
                }
                toolbar.f437b.setPopupTheme(toolbar.f447l);
                toolbar.f437b.setPresenter(cVar2);
                toolbar.M = cVar2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f567a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f437b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0022
            androidx.appcompat.widget.c r0 = r0.f361u
            if (r0 == 0) goto L_0x001e
            androidx.appcompat.widget.c$c r3 = r0.f541v
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            r1 = 1
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d1.c():boolean");
    }

    public void collapseActionView() {
        Toolbar.d dVar = this.f567a.N;
        g gVar = dVar == null ? null : dVar.f466c;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void d() {
        this.f579m = true;
    }

    public boolean e() {
        return this.f567a.q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f437b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f() {
        /*
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f567a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r0.f437b
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.f360t
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d1.f():boolean");
    }

    public boolean g() {
        ActionMenuView actionMenuView = this.f567a.f437b;
        if (actionMenuView == null) {
            return false;
        }
        c cVar = actionMenuView.f361u;
        if (cVar != null && cVar.i()) {
            return true;
        }
        return false;
    }

    public CharSequence getTitle() {
        return this.f567a.getTitle();
    }

    public void h() {
        c cVar;
        ActionMenuView actionMenuView = this.f567a.f437b;
        if (actionMenuView != null && (cVar = actionMenuView.f361u) != null) {
            cVar.a();
        }
    }

    public x i(int i2, long j2) {
        x b2 = u.b(this.f567a);
        b2.a(i2 == 0 ? 1.0f : 0.0f);
        b2.c(j2);
        a aVar = new a(i2);
        View view = (View) b2.f3085a.get();
        if (view != null) {
            b2.e(view, aVar);
        }
        return b2;
    }

    public int j() {
        return this.f568b;
    }

    public void k(int i2) {
        this.f567a.setVisibility(i2);
    }

    public void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public boolean m() {
        Toolbar.d dVar = this.f567a.N;
        return (dVar == null || dVar.f466c == null) ? false : true;
    }

    public void n(int i2) {
        this.f572f = i2 != 0 ? e.a.b(s(), i2) : null;
        y();
    }

    public void o(u0 u0Var) {
        Toolbar toolbar;
        View view = this.f569c;
        if (view != null && view.getParent() == (toolbar = this.f567a)) {
            toolbar.removeView(this.f569c);
        }
        this.f569c = null;
    }

    public void p(boolean z2) {
    }

    public void q() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void r(boolean z2) {
        this.f567a.setCollapsible(z2);
    }

    public Context s() {
        return this.f567a.getContext();
    }

    public void setIcon(int i2) {
        this.f571e = i2 != 0 ? e.a.b(s(), i2) : null;
        y();
    }

    public void setIcon(Drawable drawable) {
        this.f571e = drawable;
        y();
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f578l = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f574h) {
            v(charSequence);
        }
    }

    public void t(int i2) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i3 = this.f568b ^ i2;
        this.f568b = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    w();
                }
                x();
            }
            if ((i3 & 3) != 0) {
                y();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.f567a.setTitle(this.f575i);
                    toolbar = this.f567a;
                    charSequence = this.f576j;
                } else {
                    charSequence = null;
                    this.f567a.setTitle((CharSequence) null);
                    toolbar = this.f567a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i3 & 16) != 0 && (view = this.f570d) != null) {
                if ((i2 & 16) != 0) {
                    this.f567a.addView(view);
                } else {
                    this.f567a.removeView(view);
                }
            }
        }
    }

    public int u() {
        return 0;
    }

    public final void v(CharSequence charSequence) {
        this.f575i = charSequence;
        if ((this.f568b & 8) != 0) {
            this.f567a.setTitle(charSequence);
            if (this.f574h) {
                u.v(this.f567a.getRootView(), charSequence);
            }
        }
    }

    public final void w() {
        if ((this.f568b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f577k)) {
            this.f567a.setNavigationContentDescription(this.f581o);
        } else {
            this.f567a.setNavigationContentDescription(this.f577k);
        }
    }

    public final void x() {
        Drawable drawable;
        Toolbar toolbar;
        if ((this.f568b & 4) != 0) {
            toolbar = this.f567a;
            drawable = this.f573g;
            if (drawable == null) {
                drawable = this.f582p;
            }
        } else {
            toolbar = this.f567a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void y() {
        Drawable drawable;
        int i2 = this.f568b;
        if ((i2 & 2) == 0) {
            drawable = null;
        } else if ((i2 & 1) == 0 || (drawable = this.f572f) == null) {
            drawable = this.f571e;
        }
        this.f567a.setLogo(drawable);
    }
}
