package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.q0;
import com.example.supermarket.R;
import i.d;

public final class k extends d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: c  reason: collision with root package name */
    public final Context f283c;

    /* renamed from: d  reason: collision with root package name */
    public final e f284d;

    /* renamed from: e  reason: collision with root package name */
    public final d f285e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f286f;

    /* renamed from: g  reason: collision with root package name */
    public final int f287g;

    /* renamed from: h  reason: collision with root package name */
    public final int f288h;

    /* renamed from: i  reason: collision with root package name */
    public final int f289i;

    /* renamed from: j  reason: collision with root package name */
    public final q0 f290j;

    /* renamed from: k  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f291k = new a();

    /* renamed from: l  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f292l = new b();

    /* renamed from: m  reason: collision with root package name */
    public PopupWindow.OnDismissListener f293m;

    /* renamed from: n  reason: collision with root package name */
    public View f294n;

    /* renamed from: o  reason: collision with root package name */
    public View f295o;

    /* renamed from: p  reason: collision with root package name */
    public i.a f296p;

    /* renamed from: q  reason: collision with root package name */
    public ViewTreeObserver f297q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f298r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f299s;

    /* renamed from: t  reason: collision with root package name */
    public int f300t;

    /* renamed from: u  reason: collision with root package name */
    public int f301u = 0;

    /* renamed from: v  reason: collision with root package name */
    public boolean f302v;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (k.this.a()) {
                k kVar = k.this;
                if (!kVar.f290j.f742y) {
                    View view = kVar.f295o;
                    if (view == null || !view.isShown()) {
                        k.this.dismiss();
                    } else {
                        k.this.f290j.i();
                    }
                }
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.f297q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.f297q = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.f297q.removeGlobalOnLayoutListener(kVar.f291k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i2, int i3, boolean z2) {
        this.f283c = context;
        this.f284d = eVar;
        this.f286f = z2;
        this.f285e = new d(eVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f288h = i2;
        this.f289i = i3;
        Resources resources = context.getResources();
        this.f287g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f294n = view;
        this.f290j = new q0(context, (AttributeSet) null, i2, i3);
        eVar.b(this, context);
    }

    public boolean a() {
        return !this.f298r && this.f290j.a();
    }

    public void b(e eVar, boolean z2) {
        if (eVar == this.f284d) {
            dismiss();
            i.a aVar = this.f296p;
            if (aVar != null) {
                aVar.b(eVar, z2);
            }
        }
    }

    public void d(i.a aVar) {
        this.f296p = aVar;
    }

    public void dismiss() {
        if (a()) {
            this.f290j.dismiss();
        }
    }

    public ListView e() {
        return this.f290j.f721d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(androidx.appcompat.view.menu.l r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x0078
            androidx.appcompat.view.menu.h r0 = new androidx.appcompat.view.menu.h
            android.content.Context r3 = r9.f283c
            android.view.View r5 = r9.f295o
            boolean r6 = r9.f286f
            int r7 = r9.f288h
            int r8 = r9.f289i
            r2 = r0
            r4 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.i$a r2 = r9.f296p
            r0.d(r2)
            boolean r2 = i.d.u(r10)
            r0.f277h = r2
            i.d r3 = r0.f279j
            if (r3 == 0) goto L_0x002a
            r3.o(r2)
        L_0x002a:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f293m
            r0.f280k = r2
            r2 = 0
            r9.f293m = r2
            androidx.appcompat.view.menu.e r2 = r9.f284d
            r2.c(r1)
            androidx.appcompat.widget.q0 r2 = r9.f290j
            int r3 = r2.f724g
            boolean r4 = r2.f727j
            if (r4 != 0) goto L_0x0040
            r2 = 0
            goto L_0x0042
        L_0x0040:
            int r2 = r2.f725h
        L_0x0042:
            int r4 = r9.f301u
            android.view.View r5 = r9.f294n
            java.util.WeakHashMap<android.view.View, g0.x> r6 = g0.u.f3063a
            int r5 = g0.u.e.d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005c
            android.view.View r4 = r9.f294n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005c:
            boolean r4 = r0.b()
            r5 = 1
            if (r4 == 0) goto L_0x0064
            goto L_0x006d
        L_0x0064:
            android.view.View r4 = r0.f275f
            if (r4 != 0) goto L_0x006a
            r0 = 0
            goto L_0x006e
        L_0x006a:
            r0.e(r3, r2, r5, r5)
        L_0x006d:
            r0 = 1
        L_0x006e:
            if (r0 == 0) goto L_0x0078
            androidx.appcompat.view.menu.i$a r0 = r9.f296p
            if (r0 == 0) goto L_0x0077
            r0.c(r10)
        L_0x0077:
            return r5
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k.f(androidx.appcompat.view.menu.l):boolean");
    }

    public boolean g() {
        return false;
    }

    public void h(boolean z2) {
        this.f299s = false;
        d dVar = this.f285e;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i() {
        /*
            r7 = this;
            boolean r0 = r7.a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000b
        L_0x0008:
            r1 = 1
            goto L_0x00c7
        L_0x000b:
            boolean r0 = r7.f298r
            if (r0 != 0) goto L_0x00c7
            android.view.View r0 = r7.f294n
            if (r0 != 0) goto L_0x0015
            goto L_0x00c7
        L_0x0015:
            r7.f295o = r0
            androidx.appcompat.widget.q0 r0 = r7.f290j
            android.widget.PopupWindow r0 = r0.f743z
            r0.setOnDismissListener(r7)
            androidx.appcompat.widget.q0 r0 = r7.f290j
            r0.f734q = r7
            r0.s(r2)
            android.view.View r0 = r7.f295o
            android.view.ViewTreeObserver r3 = r7.f297q
            if (r3 != 0) goto L_0x002d
            r3 = 1
            goto L_0x002e
        L_0x002d:
            r3 = 0
        L_0x002e:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.f297q = r4
            if (r3 == 0) goto L_0x003b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r3 = r7.f291k
            r4.addOnGlobalLayoutListener(r3)
        L_0x003b:
            android.view.View$OnAttachStateChangeListener r3 = r7.f292l
            r0.addOnAttachStateChangeListener(r3)
            androidx.appcompat.widget.q0 r3 = r7.f290j
            r3.f733p = r0
            int r0 = r7.f301u
            r3.f730m = r0
            boolean r0 = r7.f299s
            r3 = 0
            if (r0 != 0) goto L_0x005b
            androidx.appcompat.view.menu.d r0 = r7.f285e
            android.content.Context r4 = r7.f283c
            int r5 = r7.f287g
            int r0 = i.d.m(r0, r3, r4, r5)
            r7.f300t = r0
            r7.f299s = r2
        L_0x005b:
            androidx.appcompat.widget.q0 r0 = r7.f290j
            int r4 = r7.f300t
            r0.r(r4)
            androidx.appcompat.widget.q0 r0 = r7.f290j
            r4 = 2
            android.widget.PopupWindow r0 = r0.f743z
            r0.setInputMethodMode(r4)
            androidx.appcompat.widget.q0 r0 = r7.f290j
            android.graphics.Rect r4 = r7.f3216b
            java.util.Objects.requireNonNull(r0)
            if (r4 == 0) goto L_0x0079
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r4)
            goto L_0x007a
        L_0x0079:
            r5 = r3
        L_0x007a:
            r0.f741x = r5
            androidx.appcompat.widget.q0 r0 = r7.f290j
            r0.i()
            androidx.appcompat.widget.q0 r0 = r7.f290j
            androidx.appcompat.widget.j0 r0 = r0.f721d
            r0.setOnKeyListener(r7)
            boolean r4 = r7.f302v
            if (r4 == 0) goto L_0x00b9
            androidx.appcompat.view.menu.e r4 = r7.f284d
            java.lang.CharSequence r4 = r4.f228m
            if (r4 == 0) goto L_0x00b9
            android.content.Context r4 = r7.f283c
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131427346(0x7f0b0012, float:1.8476306E38)
            android.view.View r4 = r4.inflate(r5, r0, r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00b3
            androidx.appcompat.view.menu.e r6 = r7.f284d
            java.lang.CharSequence r6 = r6.f228m
            r5.setText(r6)
        L_0x00b3:
            r4.setEnabled(r1)
            r0.addHeaderView(r4, r3, r1)
        L_0x00b9:
            androidx.appcompat.widget.q0 r0 = r7.f290j
            androidx.appcompat.view.menu.d r1 = r7.f285e
            r0.o(r1)
            androidx.appcompat.widget.q0 r0 = r7.f290j
            r0.i()
            goto L_0x0008
        L_0x00c7:
            if (r1 == 0) goto L_0x00ca
            return
        L_0x00ca:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.k.i():void");
    }

    public void l(e eVar) {
    }

    public void n(View view) {
        this.f294n = view;
    }

    public void o(boolean z2) {
        this.f285e.f211d = z2;
    }

    public void onDismiss() {
        this.f298r = true;
        this.f284d.c(true);
        ViewTreeObserver viewTreeObserver = this.f297q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f297q = this.f295o.getViewTreeObserver();
            }
            this.f297q.removeGlobalOnLayoutListener(this.f291k);
            this.f297q = null;
        }
        this.f295o.removeOnAttachStateChangeListener(this.f292l);
        PopupWindow.OnDismissListener onDismissListener = this.f293m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void p(int i2) {
        this.f301u = i2;
    }

    public void q(int i2) {
        this.f290j.f724g = i2;
    }

    public void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f293m = onDismissListener;
    }

    public void s(boolean z2) {
        this.f302v = z2;
    }

    public void t(int i2) {
        q0 q0Var = this.f290j;
        q0Var.f725h = i2;
        q0Var.f727j = true;
    }
}
