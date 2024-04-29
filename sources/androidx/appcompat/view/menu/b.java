package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.p0;
import androidx.appcompat.widget.q0;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public final class b extends i.d implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public PopupWindow.OnDismissListener A;
    public boolean B;

    /* renamed from: c  reason: collision with root package name */
    public final Context f167c;

    /* renamed from: d  reason: collision with root package name */
    public final int f168d;

    /* renamed from: e  reason: collision with root package name */
    public final int f169e;

    /* renamed from: f  reason: collision with root package name */
    public final int f170f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f171g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f172h;

    /* renamed from: i  reason: collision with root package name */
    public final List<e> f173i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final List<d> f174j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f175k = new a();

    /* renamed from: l  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f176l = new C0000b();

    /* renamed from: m  reason: collision with root package name */
    public final p0 f177m = new c();

    /* renamed from: n  reason: collision with root package name */
    public int f178n;

    /* renamed from: o  reason: collision with root package name */
    public int f179o;

    /* renamed from: p  reason: collision with root package name */
    public View f180p;

    /* renamed from: q  reason: collision with root package name */
    public View f181q;

    /* renamed from: r  reason: collision with root package name */
    public int f182r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f183s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f184t;

    /* renamed from: u  reason: collision with root package name */
    public int f185u;

    /* renamed from: v  reason: collision with root package name */
    public int f186v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f187w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f188x;

    /* renamed from: y  reason: collision with root package name */
    public i.a f189y;

    /* renamed from: z  reason: collision with root package name */
    public ViewTreeObserver f190z;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (b.this.a() && b.this.f174j.size() > 0 && !b.this.f174j.get(0).f198a.f742y) {
                View view = b.this.f181q;
                if (view == null || !view.isShown()) {
                    b.this.dismiss();
                    return;
                }
                for (d dVar : b.this.f174j) {
                    dVar.f198a.i();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    public class C0000b implements View.OnAttachStateChangeListener {
        public C0000b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f190z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f190z = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f190z.removeGlobalOnLayoutListener(bVar.f175k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements p0 {

        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ d f194b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ MenuItem f195c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ e f196d;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f194b = dVar;
                this.f195c = menuItem;
                this.f196d = eVar;
            }

            public void run() {
                d dVar = this.f194b;
                if (dVar != null) {
                    b.this.B = true;
                    dVar.f199b.c(false);
                    b.this.B = false;
                }
                if (this.f195c.isEnabled() && this.f195c.hasSubMenu()) {
                    this.f196d.q(this.f195c, 4);
                }
            }
        }

        public c() {
        }

        public void g(e eVar, MenuItem menuItem) {
            d dVar = null;
            b.this.f172h.removeCallbacksAndMessages((Object) null);
            int size = b.this.f174j.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (eVar == b.this.f174j.get(i2).f199b) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                int i3 = i2 + 1;
                if (i3 < b.this.f174j.size()) {
                    dVar = b.this.f174j.get(i3);
                }
                b.this.f172h.postAtTime(new a(dVar, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
            }
        }

        public void k(e eVar, MenuItem menuItem) {
            b.this.f172h.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final q0 f198a;

        /* renamed from: b  reason: collision with root package name */
        public final e f199b;

        /* renamed from: c  reason: collision with root package name */
        public final int f200c;

        public d(q0 q0Var, e eVar, int i2) {
            this.f198a = q0Var;
            this.f199b = eVar;
            this.f200c = i2;
        }
    }

    public b(Context context, View view, int i2, int i3, boolean z2) {
        int i4 = 0;
        this.f178n = 0;
        this.f179o = 0;
        this.f167c = context;
        this.f180p = view;
        this.f169e = i2;
        this.f170f = i3;
        this.f171g = z2;
        this.f187w = false;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        this.f182r = u.e.d(view) != 1 ? 1 : i4;
        Resources resources = context.getResources();
        this.f168d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f172h = new Handler();
    }

    public boolean a() {
        return this.f174j.size() > 0 && this.f174j.get(0).f198a.a();
    }

    public void b(e eVar, boolean z2) {
        int i2;
        int size = this.f174j.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (eVar == this.f174j.get(i3).f199b) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int i4 = i3 + 1;
            if (i4 < this.f174j.size()) {
                this.f174j.get(i4).f199b.c(false);
            }
            d remove = this.f174j.remove(i3);
            remove.f199b.t(this);
            if (this.B) {
                q0 q0Var = remove.f198a;
                Objects.requireNonNull(q0Var);
                if (Build.VERSION.SDK_INT >= 23) {
                    q0Var.f743z.setExitTransition((Transition) null);
                }
                remove.f198a.f743z.setAnimationStyle(0);
            }
            remove.f198a.dismiss();
            int size2 = this.f174j.size();
            if (size2 > 0) {
                i2 = this.f174j.get(size2 - 1).f200c;
            } else {
                View view = this.f180p;
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                i2 = u.e.d(view) == 1 ? 0 : 1;
            }
            this.f182r = i2;
            if (size2 == 0) {
                dismiss();
                i.a aVar = this.f189y;
                if (aVar != null) {
                    aVar.b(eVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f190z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f190z.removeGlobalOnLayoutListener(this.f175k);
                    }
                    this.f190z = null;
                }
                this.f181q.removeOnAttachStateChangeListener(this.f176l);
                this.A.onDismiss();
            } else if (z2) {
                this.f174j.get(0).f199b.c(false);
            }
        }
    }

    public void d(i.a aVar) {
        this.f189y = aVar;
    }

    public void dismiss() {
        int size = this.f174j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f174j.toArray(new d[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                d dVar = dVarArr[i2];
                if (dVar.f198a.a()) {
                    dVar.f198a.dismiss();
                }
            }
        }
    }

    public ListView e() {
        if (this.f174j.isEmpty()) {
            return null;
        }
        List<d> list = this.f174j;
        return list.get(list.size() - 1).f198a.f721d;
    }

    public boolean f(l lVar) {
        for (d next : this.f174j) {
            if (lVar == next.f199b) {
                next.f198a.f721d.requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        lVar.b(this, this.f167c);
        if (a()) {
            v(lVar);
        } else {
            this.f173i.add(lVar);
        }
        i.a aVar = this.f189y;
        if (aVar != null) {
            aVar.c(lVar);
        }
        return true;
    }

    public boolean g() {
        return false;
    }

    public void h(boolean z2) {
        for (d dVar : this.f174j) {
            ListAdapter adapter = dVar.f198a.f721d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((d) adapter).notifyDataSetChanged();
        }
    }

    public void i() {
        if (!a()) {
            for (e v2 : this.f173i) {
                v(v2);
            }
            this.f173i.clear();
            View view = this.f180p;
            this.f181q = view;
            if (view != null) {
                boolean z2 = this.f190z == null;
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f190z = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f175k);
                }
                this.f181q.addOnAttachStateChangeListener(this.f176l);
            }
        }
    }

    public void l(e eVar) {
        eVar.b(this, this.f167c);
        if (a()) {
            v(eVar);
        } else {
            this.f173i.add(eVar);
        }
    }

    public void n(View view) {
        if (this.f180p != view) {
            this.f180p = view;
            int i2 = this.f178n;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            this.f179o = Gravity.getAbsoluteGravity(i2, u.e.d(view));
        }
    }

    public void o(boolean z2) {
        this.f187w = z2;
    }

    public void onDismiss() {
        d dVar;
        int size = this.f174j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                dVar = null;
                break;
            }
            dVar = this.f174j.get(i2);
            if (!dVar.f198a.a()) {
                break;
            }
            i2++;
        }
        if (dVar != null) {
            dVar.f199b.c(false);
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
        if (this.f178n != i2) {
            this.f178n = i2;
            View view = this.f180p;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            this.f179o = Gravity.getAbsoluteGravity(i2, u.e.d(view));
        }
    }

    public void q(int i2) {
        this.f183s = true;
        this.f185u = i2;
    }

    public void r(PopupWindow.OnDismissListener onDismissListener) {
        this.A = onDismissListener;
    }

    public void s(boolean z2) {
        this.f188x = z2;
    }

    public void t(int i2) {
        this.f184t = true;
        this.f186v = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0148, code lost:
        if (((r10.getWidth() + r12[0]) + r4) > r11.right) goto L_0x0152;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014e, code lost:
        if ((r12[0] - r4) < 0) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0152, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01b5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(androidx.appcompat.view.menu.e r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f167c
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.d r3 = new androidx.appcompat.view.menu.d
            boolean r4 = r0.f171g
            r5 = 2131427339(0x7f0b000b, float:1.8476291E38)
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.a()
            r5 = 1
            if (r4 != 0) goto L_0x0022
            boolean r4 = r0.f187w
            if (r4 == 0) goto L_0x0022
            r3.f211d = r5
            goto L_0x002e
        L_0x0022:
            boolean r4 = r16.a()
            if (r4 == 0) goto L_0x002e
            boolean r4 = i.d.u(r17)
            r3.f211d = r4
        L_0x002e:
            android.content.Context r4 = r0.f167c
            int r6 = r0.f168d
            r7 = 0
            int r4 = i.d.m(r3, r7, r4, r6)
            androidx.appcompat.widget.q0 r6 = new androidx.appcompat.widget.q0
            android.content.Context r8 = r0.f167c
            int r9 = r0.f169e
            int r10 = r0.f170f
            r6.<init>(r8, r7, r9, r10)
            androidx.appcompat.widget.p0 r8 = r0.f177m
            r6.D = r8
            r6.f734q = r0
            android.widget.PopupWindow r8 = r6.f743z
            r8.setOnDismissListener(r0)
            android.view.View r8 = r0.f180p
            r6.f733p = r8
            int r8 = r0.f179o
            r6.f730m = r8
            r6.s(r5)
            android.widget.PopupWindow r8 = r6.f743z
            r9 = 2
            r8.setInputMethodMode(r9)
            r6.o(r3)
            r6.r(r4)
            int r3 = r0.f179o
            r6.f730m = r3
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r0.f174j
            int r3 = r3.size()
            r8 = 0
            if (r3 <= 0) goto L_0x00e6
            java.util.List<androidx.appcompat.view.menu.b$d> r3 = r0.f174j
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            androidx.appcompat.view.menu.b$d r3 = (androidx.appcompat.view.menu.b.d) r3
            androidx.appcompat.view.menu.e r10 = r3.f199b
            int r11 = r10.size()
            r12 = 0
        L_0x0085:
            if (r12 >= r11) goto L_0x009b
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x0098
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x0098
            goto L_0x009c
        L_0x0098:
            int r12 = r12 + 1
            goto L_0x0085
        L_0x009b:
            r13 = r7
        L_0x009c:
            if (r13 != 0) goto L_0x009f
            goto L_0x00e8
        L_0x009f:
            androidx.appcompat.widget.q0 r10 = r3.f198a
            androidx.appcompat.widget.j0 r10 = r10.f721d
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00b8
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            androidx.appcompat.view.menu.d r11 = (androidx.appcompat.view.menu.d) r11
            goto L_0x00bb
        L_0x00b8:
            androidx.appcompat.view.menu.d r11 = (androidx.appcompat.view.menu.d) r11
            r12 = 0
        L_0x00bb:
            int r14 = r11.getCount()
            r15 = 0
        L_0x00c0:
            r9 = -1
            if (r15 >= r14) goto L_0x00ce
            androidx.appcompat.view.menu.g r7 = r11.getItem(r15)
            if (r13 != r7) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            int r15 = r15 + 1
            r7 = 0
            goto L_0x00c0
        L_0x00ce:
            r15 = -1
        L_0x00cf:
            if (r15 != r9) goto L_0x00d2
            goto L_0x00e7
        L_0x00d2:
            int r15 = r15 + r12
            int r7 = r10.getFirstVisiblePosition()
            int r15 = r15 - r7
            if (r15 < 0) goto L_0x00e7
            int r7 = r10.getChildCount()
            if (r15 < r7) goto L_0x00e1
            goto L_0x00e7
        L_0x00e1:
            android.view.View r7 = r10.getChildAt(r15)
            goto L_0x00e8
        L_0x00e6:
            r3 = 0
        L_0x00e7:
            r7 = 0
        L_0x00e8:
            if (r7 == 0) goto L_0x01b5
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r9 > r10) goto L_0x0108
            java.lang.reflect.Method r9 = androidx.appcompat.widget.q0.E
            if (r9 == 0) goto L_0x010d
            android.widget.PopupWindow r10 = r6.f743z     // Catch:{ Exception -> 0x0100 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0100 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0100 }
            r11[r8] = r12     // Catch:{ Exception -> 0x0100 }
            r9.invoke(r10, r11)     // Catch:{ Exception -> 0x0100 }
            goto L_0x010d
        L_0x0100:
            java.lang.String r9 = "MenuPopupWindow"
            java.lang.String r10 = "Could not invoke setTouchModal() on PopupWindow. Oh well."
            android.util.Log.i(r9, r10)
            goto L_0x010d
        L_0x0108:
            android.widget.PopupWindow r9 = r6.f743z
            r9.setTouchModal(r8)
        L_0x010d:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r9 < r10) goto L_0x0119
            android.widget.PopupWindow r10 = r6.f743z
            r11 = 0
            r10.setEnterTransition(r11)
        L_0x0119:
            java.util.List<androidx.appcompat.view.menu.b$d> r10 = r0.f174j
            int r11 = r10.size()
            int r11 = r11 - r5
            java.lang.Object r10 = r10.get(r11)
            androidx.appcompat.view.menu.b$d r10 = (androidx.appcompat.view.menu.b.d) r10
            androidx.appcompat.widget.q0 r10 = r10.f198a
            androidx.appcompat.widget.j0 r10 = r10.f721d
            r11 = 2
            int[] r12 = new int[r11]
            r10.getLocationOnScreen(r12)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.view.View r13 = r0.f181q
            r13.getWindowVisibleDisplayFrame(r11)
            int r13 = r0.f182r
            if (r13 != r5) goto L_0x014b
            r12 = r12[r8]
            int r10 = r10.getWidth()
            int r10 = r10 + r12
            int r10 = r10 + r4
            int r11 = r11.right
            if (r10 <= r11) goto L_0x0150
            goto L_0x0152
        L_0x014b:
            r10 = r12[r8]
            int r10 = r10 - r4
            if (r10 >= 0) goto L_0x0152
        L_0x0150:
            r10 = 1
            goto L_0x0153
        L_0x0152:
            r10 = 0
        L_0x0153:
            if (r10 != r5) goto L_0x0157
            r11 = 1
            goto L_0x0158
        L_0x0157:
            r11 = 0
        L_0x0158:
            r0.f182r = r10
            r10 = 26
            r12 = 5
            if (r9 < r10) goto L_0x0164
            r6.f733p = r7
            r9 = 0
            r13 = 0
            goto L_0x0195
        L_0x0164:
            r9 = 2
            int[] r10 = new int[r9]
            android.view.View r13 = r0.f180p
            r13.getLocationOnScreen(r10)
            int[] r9 = new int[r9]
            r7.getLocationOnScreen(r9)
            int r13 = r0.f179o
            r13 = r13 & 7
            if (r13 != r12) goto L_0x018b
            r13 = r10[r8]
            android.view.View r14 = r0.f180p
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r10[r8] = r14
            r13 = r9[r8]
            int r14 = r7.getWidth()
            int r14 = r14 + r13
            r9[r8] = r14
        L_0x018b:
            r13 = r9[r8]
            r14 = r10[r8]
            int r13 = r13 - r14
            r9 = r9[r5]
            r10 = r10[r5]
            int r9 = r9 - r10
        L_0x0195:
            int r10 = r0.f179o
            r10 = r10 & r12
            if (r10 != r12) goto L_0x01a2
            if (r11 == 0) goto L_0x019d
            goto L_0x01a8
        L_0x019d:
            int r4 = r7.getWidth()
            goto L_0x01aa
        L_0x01a2:
            if (r11 == 0) goto L_0x01aa
            int r4 = r7.getWidth()
        L_0x01a8:
            int r13 = r13 + r4
            goto L_0x01ab
        L_0x01aa:
            int r13 = r13 - r4
        L_0x01ab:
            r6.f724g = r13
            r6.f729l = r5
            r6.f728k = r5
            r6.m(r9)
            goto L_0x01d3
        L_0x01b5:
            boolean r4 = r0.f183s
            if (r4 == 0) goto L_0x01bd
            int r4 = r0.f185u
            r6.f724g = r4
        L_0x01bd:
            boolean r4 = r0.f184t
            if (r4 == 0) goto L_0x01c6
            int r4 = r0.f186v
            r6.m(r4)
        L_0x01c6:
            android.graphics.Rect r4 = r0.f3216b
            if (r4 == 0) goto L_0x01d0
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>(r4)
            goto L_0x01d1
        L_0x01d0:
            r11 = 0
        L_0x01d1:
            r6.f741x = r11
        L_0x01d3:
            androidx.appcompat.view.menu.b$d r4 = new androidx.appcompat.view.menu.b$d
            int r5 = r0.f182r
            r4.<init>(r6, r1, r5)
            java.util.List<androidx.appcompat.view.menu.b$d> r5 = r0.f174j
            r5.add(r4)
            r6.i()
            androidx.appcompat.widget.j0 r4 = r6.f721d
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x0212
            boolean r3 = r0.f188x
            if (r3 == 0) goto L_0x0212
            java.lang.CharSequence r3 = r1.f228m
            if (r3 == 0) goto L_0x0212
            r3 = 2131427346(0x7f0b0012, float:1.8476306E38)
            android.view.View r2 = r2.inflate(r3, r4, r8)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r8)
            java.lang.CharSequence r1 = r1.f228m
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r8)
            r6.i()
        L_0x0212:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.b.v(androidx.appcompat.view.menu.e):void");
    }
}
