package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import g0.u;
import g0.x;
import i.d;
import java.util.WeakHashMap;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f270a;

    /* renamed from: b  reason: collision with root package name */
    public final e f271b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f272c;

    /* renamed from: d  reason: collision with root package name */
    public final int f273d;

    /* renamed from: e  reason: collision with root package name */
    public final int f274e;

    /* renamed from: f  reason: collision with root package name */
    public View f275f;

    /* renamed from: g  reason: collision with root package name */
    public int f276g = 8388611;

    /* renamed from: h  reason: collision with root package name */
    public boolean f277h;

    /* renamed from: i  reason: collision with root package name */
    public i.a f278i;

    /* renamed from: j  reason: collision with root package name */
    public d f279j;

    /* renamed from: k  reason: collision with root package name */
    public PopupWindow.OnDismissListener f280k;

    /* renamed from: l  reason: collision with root package name */
    public final PopupWindow.OnDismissListener f281l = new a();

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        public void onDismiss() {
            h.this.c();
        }
    }

    public h(Context context, e eVar, View view, boolean z2, int i2, int i3) {
        this.f270a = context;
        this.f271b = eVar;
        this.f275f = view;
        this.f272c = z2;
        this.f273d = i2;
        this.f274e = i3;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [androidx.appcompat.view.menu.i, i.d] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i.d a() {
        /*
            r14 = this;
            i.d r0 = r14.f279j
            if (r0 != 0) goto L_0x0079
            android.content.Context r0 = r14.f270a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            r0.getRealSize(r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f270a
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131099670(0x7f060016, float:1.78117E38)
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0047
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f270a
            android.view.View r3 = r14.f275f
            int r4 = r14.f273d
            int r5 = r14.f274e
            boolean r6 = r14.f272c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0059
        L_0x0047:
            androidx.appcompat.view.menu.k r0 = new androidx.appcompat.view.menu.k
            android.content.Context r8 = r14.f270a
            androidx.appcompat.view.menu.e r9 = r14.f271b
            android.view.View r10 = r14.f275f
            int r11 = r14.f273d
            int r12 = r14.f274e
            boolean r13 = r14.f272c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0059:
            androidx.appcompat.view.menu.e r1 = r14.f271b
            r0.l(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f281l
            r0.r(r1)
            android.view.View r1 = r14.f275f
            r0.n(r1)
            androidx.appcompat.view.menu.i$a r1 = r14.f278i
            r0.d(r1)
            boolean r1 = r14.f277h
            r0.o(r1)
            int r1 = r14.f276g
            r0.p(r1)
            r14.f279j = r0
        L_0x0079:
            i.d r0 = r14.f279j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.h.a():i.d");
    }

    public boolean b() {
        d dVar = this.f279j;
        return dVar != null && dVar.a();
    }

    public void c() {
        this.f279j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f280k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(i.a aVar) {
        this.f278i = aVar;
        d dVar = this.f279j;
        if (dVar != null) {
            dVar.d(aVar);
        }
    }

    public final void e(int i2, int i3, boolean z2, boolean z3) {
        d a2 = a();
        a2.s(z3);
        if (z2) {
            int i4 = this.f276g;
            View view = this.f275f;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if ((Gravity.getAbsoluteGravity(i4, u.e.d(view)) & 7) == 5) {
                i2 -= this.f275f.getWidth();
            }
            a2.q(i2);
            a2.t(i3);
            int i5 = (int) ((this.f270a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f3216b = new Rect(i2 - i5, i3 - i5, i2 + i5, i3 + i5);
        }
        a2.i();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f275f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
