package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.n;
import androidx.fragment.app.x0;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.savedstate.b;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;

public class h0 {

    /* renamed from: a  reason: collision with root package name */
    public final a0 f1313a;

    /* renamed from: b  reason: collision with root package name */
    public final i0 f1314b;

    /* renamed from: c  reason: collision with root package name */
    public final n f1315c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1316d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f1317e = -1;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1318b;

        public a(h0 h0Var, View view) {
            this.f1318b = view;
        }

        public void onViewAttachedToWindow(View view) {
            this.f1318b.removeOnAttachStateChangeListener(this);
            View view2 = this.f1318b;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.h.c(view2);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public h0(a0 a0Var, i0 i0Var, n nVar) {
        this.f1313a = a0Var;
        this.f1314b = i0Var;
        this.f1315c = nVar;
    }

    public h0(a0 a0Var, i0 i0Var, n nVar, g0 g0Var) {
        this.f1313a = a0Var;
        this.f1314b = i0Var;
        this.f1315c = nVar;
        nVar.f1373d = null;
        nVar.f1374e = null;
        nVar.f1387r = 0;
        nVar.f1384o = false;
        nVar.f1381l = false;
        n nVar2 = nVar.f1377h;
        nVar.f1378i = nVar2 != null ? nVar2.f1375f : null;
        nVar.f1377h = null;
        Bundle bundle = g0Var.f1308n;
        nVar.f1372c = bundle == null ? new Bundle() : bundle;
    }

    public h0(a0 a0Var, i0 i0Var, ClassLoader classLoader, x xVar, g0 g0Var) {
        this.f1313a = a0Var;
        this.f1314b = i0Var;
        n a2 = xVar.a(classLoader, g0Var.f1296b);
        this.f1315c = a2;
        Bundle bundle = g0Var.f1305k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.Z(g0Var.f1305k);
        a2.f1375f = g0Var.f1297c;
        a2.f1383n = g0Var.f1298d;
        a2.f1385p = true;
        a2.f1392w = g0Var.f1299e;
        a2.f1393x = g0Var.f1300f;
        a2.f1394y = g0Var.f1301g;
        a2.B = g0Var.f1302h;
        a2.f1382m = g0Var.f1303i;
        a2.A = g0Var.f1304j;
        a2.f1395z = g0Var.f1306l;
        a2.M = g.c.values()[g0Var.f1307m];
        Bundle bundle2 = g0Var.f1308n;
        a2.f1372c = bundle2 == null ? new Bundle() : bundle2;
        if (b0.M(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public void a() {
        if (b0.M(3)) {
            StringBuilder a2 = androidx.activity.result.a.a("moveto ACTIVITY_CREATED: ");
            a2.append(this.f1315c);
            Log.d("FragmentManager", a2.toString());
        }
        n nVar = this.f1315c;
        Bundle bundle = nVar.f1372c;
        nVar.f1390u.T();
        nVar.f1371b = 3;
        nVar.D = false;
        nVar.D = true;
        if (b0.M(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + nVar);
        }
        View view = nVar.F;
        if (view != null) {
            Bundle bundle2 = nVar.f1372c;
            SparseArray<Parcelable> sparseArray = nVar.f1373d;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                nVar.f1373d = null;
            }
            if (nVar.F != null) {
                v0 v0Var = nVar.O;
                v0Var.f1499d.a(nVar.f1374e);
                nVar.f1374e = null;
            }
            nVar.D = false;
            nVar.P(bundle2);
            if (!nVar.D) {
                throw new z0(m.a("Fragment ", nVar, " did not call through to super.onViewStateRestored()"));
            } else if (nVar.F != null) {
                nVar.O.b(g.b.ON_CREATE);
            }
        }
        nVar.f1372c = null;
        b0 b0Var = nVar.f1390u;
        b0Var.B = false;
        b0Var.C = false;
        b0Var.J.f1288g = false;
        b0Var.w(4);
        a0 a0Var = this.f1313a;
        n nVar2 = this.f1315c;
        a0Var.a(nVar2, nVar2.f1372c, false);
    }

    public void b() {
        View view;
        View view2;
        i0 i0Var = this.f1314b;
        n nVar = this.f1315c;
        Objects.requireNonNull(i0Var);
        ViewGroup viewGroup = nVar.E;
        int i2 = -1;
        if (viewGroup != null) {
            int indexOf = i0Var.f1322a.indexOf(nVar);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= i0Var.f1322a.size()) {
                            break;
                        }
                        n nVar2 = i0Var.f1322a.get(indexOf);
                        if (nVar2.E == viewGroup && (view = nVar2.F) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    n nVar3 = i0Var.f1322a.get(i3);
                    if (nVar3.E == viewGroup && (view2 = nVar3.F) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        n nVar4 = this.f1315c;
        nVar4.E.addView(nVar4.F, i2);
    }

    public void c() {
        if (b0.M(3)) {
            StringBuilder a2 = androidx.activity.result.a.a("moveto ATTACHED: ");
            a2.append(this.f1315c);
            Log.d("FragmentManager", a2.toString());
        }
        n nVar = this.f1315c;
        n nVar2 = nVar.f1377h;
        h0 h0Var = null;
        if (nVar2 != null) {
            h0 h2 = this.f1314b.h(nVar2.f1375f);
            if (h2 != null) {
                n nVar3 = this.f1315c;
                nVar3.f1378i = nVar3.f1377h.f1375f;
                nVar3.f1377h = null;
                h0Var = h2;
            } else {
                StringBuilder a3 = androidx.activity.result.a.a("Fragment ");
                a3.append(this.f1315c);
                a3.append(" declared target fragment ");
                a3.append(this.f1315c.f1377h);
                a3.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(a3.toString());
            }
        } else {
            String str = nVar.f1378i;
            if (str != null && (h0Var = this.f1314b.h(str)) == null) {
                StringBuilder a4 = androidx.activity.result.a.a("Fragment ");
                a4.append(this.f1315c);
                a4.append(" declared target fragment ");
                a4.append(this.f1315c.f1378i);
                a4.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(a4.toString());
            }
        }
        if (h0Var != null) {
            h0Var.k();
        }
        n nVar4 = this.f1315c;
        b0 b0Var = nVar4.f1388s;
        nVar4.f1389t = b0Var.f1231q;
        nVar4.f1391v = b0Var.f1233s;
        this.f1313a.g(nVar4, false);
        n nVar5 = this.f1315c;
        Iterator<n.d> it = nVar5.R.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        nVar5.R.clear();
        nVar5.f1390u.b(nVar5.f1389t, nVar5.b(), nVar5);
        nVar5.f1371b = 0;
        nVar5.D = false;
        nVar5.F(nVar5.f1389t.f1532c);
        if (nVar5.D) {
            b0 b0Var2 = nVar5.f1388s;
            Iterator<f0> it2 = b0Var2.f1229o.iterator();
            while (it2.hasNext()) {
                it2.next().b(b0Var2, nVar5);
            }
            b0 b0Var3 = nVar5.f1390u;
            b0Var3.B = false;
            b0Var3.C = false;
            b0Var3.J.f1288g = false;
            b0Var3.w(0);
            this.f1313a.b(this.f1315c, false);
            return;
        }
        throw new z0(m.a("Fragment ", nVar5, " did not call through to super.onAttach()"));
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [androidx.fragment.app.x0$d$b] */
    /* JADX WARNING: type inference failed for: r8v6, types: [androidx.fragment.app.x0$d$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d() {
        /*
            r13 = this;
            androidx.fragment.app.n r0 = r13.f1315c
            androidx.fragment.app.b0 r1 = r0.f1388s
            if (r1 != 0) goto L_0x0009
            int r0 = r0.f1371b
            return r0
        L_0x0009:
            int r1 = r13.f1317e
            androidx.lifecycle.g$c r0 = r0.M
            int r0 = r0.ordinal()
            r2 = -1
            r3 = 5
            r4 = 3
            r5 = 4
            r6 = 2
            r7 = 1
            if (r0 == r7) goto L_0x002e
            if (r0 == r6) goto L_0x0029
            if (r0 == r4) goto L_0x0024
            if (r0 == r5) goto L_0x0033
            int r1 = java.lang.Math.min(r1, r2)
            goto L_0x0033
        L_0x0024:
            int r1 = java.lang.Math.min(r1, r3)
            goto L_0x0033
        L_0x0029:
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x0033
        L_0x002e:
            r0 = 0
            int r1 = java.lang.Math.min(r1, r0)
        L_0x0033:
            androidx.fragment.app.n r0 = r13.f1315c
            boolean r8 = r0.f1383n
            if (r8 == 0) goto L_0x0063
            boolean r8 = r0.f1384o
            if (r8 == 0) goto L_0x0054
            int r0 = r13.f1317e
            int r1 = java.lang.Math.max(r0, r6)
            androidx.fragment.app.n r0 = r13.f1315c
            android.view.View r0 = r0.F
            if (r0 == 0) goto L_0x0063
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0063
            int r1 = java.lang.Math.min(r1, r6)
            goto L_0x0063
        L_0x0054:
            int r8 = r13.f1317e
            if (r8 >= r5) goto L_0x005f
            int r0 = r0.f1371b
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x0063
        L_0x005f:
            int r1 = java.lang.Math.min(r1, r7)
        L_0x0063:
            androidx.fragment.app.n r0 = r13.f1315c
            boolean r0 = r0.f1381l
            if (r0 != 0) goto L_0x006d
            int r1 = java.lang.Math.min(r1, r7)
        L_0x006d:
            androidx.fragment.app.n r0 = r13.f1315c
            android.view.ViewGroup r8 = r0.E
            r9 = 0
            if (r8 == 0) goto L_0x00bd
            androidx.fragment.app.b0 r0 = r0.r()
            androidx.fragment.app.y0 r0 = r0.K()
            androidx.fragment.app.x0 r0 = androidx.fragment.app.x0.g(r8, r0)
            java.util.Objects.requireNonNull(r0)
            androidx.fragment.app.n r8 = r13.f1315c
            androidx.fragment.app.x0$d r8 = r0.d(r8)
            if (r8 == 0) goto L_0x008e
            androidx.fragment.app.x0$d$b r8 = r8.f1515b
            goto L_0x008f
        L_0x008e:
            r8 = r9
        L_0x008f:
            androidx.fragment.app.n r10 = r13.f1315c
            java.util.ArrayList<androidx.fragment.app.x0$d> r0 = r0.f1506c
            java.util.Iterator r0 = r0.iterator()
        L_0x0097:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00b0
            java.lang.Object r11 = r0.next()
            androidx.fragment.app.x0$d r11 = (androidx.fragment.app.x0.d) r11
            androidx.fragment.app.n r12 = r11.f1516c
            boolean r12 = r12.equals(r10)
            if (r12 == 0) goto L_0x0097
            boolean r12 = r11.f1519f
            if (r12 != 0) goto L_0x0097
            r9 = r11
        L_0x00b0:
            if (r9 == 0) goto L_0x00bc
            if (r8 == 0) goto L_0x00b8
            androidx.fragment.app.x0$d$b r0 = androidx.fragment.app.x0.d.b.NONE
            if (r8 != r0) goto L_0x00bc
        L_0x00b8:
            androidx.fragment.app.x0$d$b r0 = r9.f1515b
            r9 = r0
            goto L_0x00bd
        L_0x00bc:
            r9 = r8
        L_0x00bd:
            androidx.fragment.app.x0$d$b r0 = androidx.fragment.app.x0.d.b.ADDING
            if (r9 != r0) goto L_0x00c7
            r0 = 6
            int r1 = java.lang.Math.min(r1, r0)
            goto L_0x00e5
        L_0x00c7:
            androidx.fragment.app.x0$d$b r0 = androidx.fragment.app.x0.d.b.REMOVING
            if (r9 != r0) goto L_0x00d0
            int r1 = java.lang.Math.max(r1, r4)
            goto L_0x00e5
        L_0x00d0:
            androidx.fragment.app.n r0 = r13.f1315c
            boolean r4 = r0.f1382m
            if (r4 == 0) goto L_0x00e5
            boolean r0 = r0.B()
            if (r0 == 0) goto L_0x00e1
            int r1 = java.lang.Math.min(r1, r7)
            goto L_0x00e5
        L_0x00e1:
            int r1 = java.lang.Math.min(r1, r2)
        L_0x00e5:
            androidx.fragment.app.n r0 = r13.f1315c
            boolean r2 = r0.G
            if (r2 == 0) goto L_0x00f3
            int r0 = r0.f1371b
            if (r0 >= r3) goto L_0x00f3
            int r1 = java.lang.Math.min(r1, r5)
        L_0x00f3:
            boolean r0 = androidx.fragment.app.b0.M(r6)
            if (r0 == 0) goto L_0x0119
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "computeExpectedState() of "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = " for "
            r0.append(r2)
            androidx.fragment.app.n r2 = r13.f1315c
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
        L_0x0119:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h0.d():int");
    }

    public void e() {
        Parcelable parcelable;
        if (b0.M(3)) {
            StringBuilder a2 = androidx.activity.result.a.a("moveto CREATED: ");
            a2.append(this.f1315c);
            Log.d("FragmentManager", a2.toString());
        }
        n nVar = this.f1315c;
        if (!nVar.L) {
            this.f1313a.h(nVar, nVar.f1372c, false);
            n nVar2 = this.f1315c;
            Bundle bundle = nVar2.f1372c;
            nVar2.f1390u.T();
            nVar2.f1371b = 1;
            nVar2.D = false;
            nVar2.N.a(new Fragment$5(nVar2));
            nVar2.Q.a(bundle);
            nVar2.G(bundle);
            nVar2.L = true;
            if (nVar2.D) {
                nVar2.N.d(g.b.ON_CREATE);
                a0 a0Var = this.f1313a;
                n nVar3 = this.f1315c;
                a0Var.c(nVar3, nVar3.f1372c, false);
                return;
            }
            throw new z0(m.a("Fragment ", nVar2, " did not call through to super.onCreate()"));
        }
        Bundle bundle2 = nVar.f1372c;
        if (!(bundle2 == null || (parcelable = bundle2.getParcelable("android:support:fragments")) == null)) {
            nVar.f1390u.Y(parcelable);
            nVar.f1390u.m();
        }
        this.f1315c.f1371b = 1;
    }

    public void f() {
        String str;
        if (!this.f1315c.f1383n) {
            if (b0.M(3)) {
                StringBuilder a2 = androidx.activity.result.a.a("moveto CREATE_VIEW: ");
                a2.append(this.f1315c);
                Log.d("FragmentManager", a2.toString());
            }
            n nVar = this.f1315c;
            LayoutInflater K = nVar.K(nVar.f1372c);
            ViewGroup viewGroup = null;
            n nVar2 = this.f1315c;
            ViewGroup viewGroup2 = nVar2.E;
            if (viewGroup2 != null) {
                viewGroup = viewGroup2;
            } else {
                int i2 = nVar2.f1393x;
                if (i2 != 0) {
                    if (i2 != -1) {
                        viewGroup = (ViewGroup) nVar2.f1388s.f1232r.e(i2);
                        if (viewGroup == null) {
                            n nVar3 = this.f1315c;
                            if (!nVar3.f1385p) {
                                try {
                                    str = nVar3.w().getResourceName(this.f1315c.f1393x);
                                } catch (Resources.NotFoundException unused) {
                                    str = "unknown";
                                }
                                StringBuilder a3 = androidx.activity.result.a.a("No view found for id 0x");
                                a3.append(Integer.toHexString(this.f1315c.f1393x));
                                a3.append(" (");
                                a3.append(str);
                                a3.append(") for fragment ");
                                a3.append(this.f1315c);
                                throw new IllegalArgumentException(a3.toString());
                            }
                        }
                    } else {
                        StringBuilder a4 = androidx.activity.result.a.a("Cannot create fragment ");
                        a4.append(this.f1315c);
                        a4.append(" for a container view with no id");
                        throw new IllegalArgumentException(a4.toString());
                    }
                }
            }
            n nVar4 = this.f1315c;
            nVar4.E = viewGroup;
            nVar4.Q(K, viewGroup, nVar4.f1372c);
            View view = this.f1315c.F;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                n nVar5 = this.f1315c;
                nVar5.F.setTag(R.id.fragment_container_view_tag, nVar5);
                if (viewGroup != null) {
                    b();
                }
                n nVar6 = this.f1315c;
                if (nVar6.f1395z) {
                    nVar6.F.setVisibility(8);
                }
                View view2 = this.f1315c.F;
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                if (u.g.b(view2)) {
                    u.h.c(this.f1315c.F);
                } else {
                    View view3 = this.f1315c.F;
                    view3.addOnAttachStateChangeListener(new a(this, view3));
                }
                this.f1315c.f1390u.w(2);
                a0 a0Var = this.f1313a;
                n nVar7 = this.f1315c;
                a0Var.m(nVar7, nVar7.F, nVar7.f1372c, false);
                int visibility = this.f1315c.F.getVisibility();
                this.f1315c.g().f1410n = this.f1315c.F.getAlpha();
                n nVar8 = this.f1315c;
                if (nVar8.E != null && visibility == 0) {
                    View findFocus = nVar8.F.findFocus();
                    if (findFocus != null) {
                        this.f1315c.g().f1411o = findFocus;
                        if (b0.M(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f1315c);
                        }
                    }
                    this.f1315c.F.setAlpha(0.0f);
                }
            }
            this.f1315c.f1371b = 2;
        }
    }

    public void g() {
        n d2;
        boolean z2;
        if (b0.M(3)) {
            StringBuilder a2 = androidx.activity.result.a.a("movefrom CREATED: ");
            a2.append(this.f1315c);
            Log.d("FragmentManager", a2.toString());
        }
        n nVar = this.f1315c;
        boolean z3 = nVar.f1382m && !nVar.B();
        if (z3 || this.f1314b.f1324c.c(this.f1315c)) {
            y<?> yVar = this.f1315c.f1389t;
            if (yVar instanceof z) {
                z2 = this.f1314b.f1324c.f1287f;
            } else {
                Context context = yVar.f1532c;
                z2 = context instanceof Activity ? !((Activity) context).isChangingConfigurations() : true;
            }
            if (z3 || z2) {
                e0 e0Var = this.f1314b.f1324c;
                n nVar2 = this.f1315c;
                Objects.requireNonNull(e0Var);
                if (b0.M(3)) {
                    Log.d("FragmentManager", "Clearing non-config state for " + nVar2);
                }
                e0 e0Var2 = e0Var.f1284c.get(nVar2.f1375f);
                if (e0Var2 != null) {
                    e0Var2.a();
                    e0Var.f1284c.remove(nVar2.f1375f);
                }
                y yVar2 = e0Var.f1285d.get(nVar2.f1375f);
                if (yVar2 != null) {
                    yVar2.a();
                    e0Var.f1285d.remove(nVar2.f1375f);
                }
            }
            n nVar3 = this.f1315c;
            nVar3.f1390u.o();
            nVar3.N.d(g.b.ON_DESTROY);
            nVar3.f1371b = 0;
            nVar3.D = false;
            nVar3.L = false;
            nVar3.D = true;
            this.f1313a.d(this.f1315c, false);
            Iterator it = ((ArrayList) this.f1314b.f()).iterator();
            while (it.hasNext()) {
                h0 h0Var = (h0) it.next();
                if (h0Var != null) {
                    n nVar4 = h0Var.f1315c;
                    if (this.f1315c.f1375f.equals(nVar4.f1378i)) {
                        nVar4.f1377h = this.f1315c;
                        nVar4.f1378i = null;
                    }
                }
            }
            n nVar5 = this.f1315c;
            String str = nVar5.f1378i;
            if (str != null) {
                nVar5.f1377h = this.f1314b.d(str);
            }
            this.f1314b.k(this);
            return;
        }
        String str2 = this.f1315c.f1378i;
        if (!(str2 == null || (d2 = this.f1314b.d(str2)) == null || !d2.B)) {
            this.f1315c.f1377h = d2;
        }
        this.f1315c.f1371b = 0;
    }

    public void h() {
        View view;
        if (b0.M(3)) {
            StringBuilder a2 = androidx.activity.result.a.a("movefrom CREATE_VIEW: ");
            a2.append(this.f1315c);
            Log.d("FragmentManager", a2.toString());
        }
        n nVar = this.f1315c;
        ViewGroup viewGroup = nVar.E;
        if (!(viewGroup == null || (view = nVar.F) == null)) {
            viewGroup.removeView(view);
        }
        this.f1315c.R();
        this.f1313a.n(this.f1315c, false);
        n nVar2 = this.f1315c;
        nVar2.E = null;
        nVar2.F = null;
        nVar2.O = null;
        nVar2.P.h(null);
        this.f1315c.f1384o = false;
    }

    public void i() {
        if (b0.M(3)) {
            StringBuilder a2 = androidx.activity.result.a.a("movefrom ATTACHED: ");
            a2.append(this.f1315c);
            Log.d("FragmentManager", a2.toString());
        }
        n nVar = this.f1315c;
        nVar.f1371b = -1;
        nVar.D = false;
        nVar.J();
        if (nVar.D) {
            b0 b0Var = nVar.f1390u;
            if (!b0Var.D) {
                b0Var.o();
                nVar.f1390u = new c0();
            }
            this.f1313a.e(this.f1315c, false);
            n nVar2 = this.f1315c;
            nVar2.f1371b = -1;
            nVar2.f1389t = null;
            nVar2.f1391v = null;
            nVar2.f1388s = null;
            if ((nVar2.f1382m && !nVar2.B()) || this.f1314b.f1324c.c(this.f1315c)) {
                if (b0.M(3)) {
                    StringBuilder a3 = androidx.activity.result.a.a("initState called for fragment: ");
                    a3.append(this.f1315c);
                    Log.d("FragmentManager", a3.toString());
                }
                n nVar3 = this.f1315c;
                Objects.requireNonNull(nVar3);
                nVar3.N = new l(nVar3);
                nVar3.Q = new b(nVar3);
                nVar3.f1375f = UUID.randomUUID().toString();
                nVar3.f1381l = false;
                nVar3.f1382m = false;
                nVar3.f1383n = false;
                nVar3.f1384o = false;
                nVar3.f1385p = false;
                nVar3.f1387r = 0;
                nVar3.f1388s = null;
                nVar3.f1390u = new c0();
                nVar3.f1389t = null;
                nVar3.f1392w = 0;
                nVar3.f1393x = 0;
                nVar3.f1394y = null;
                nVar3.f1395z = false;
                nVar3.A = false;
                return;
            }
            return;
        }
        throw new z0(m.a("Fragment ", nVar, " did not call through to super.onDetach()"));
    }

    public void j() {
        n nVar = this.f1315c;
        if (nVar.f1383n && nVar.f1384o && !nVar.f1386q) {
            if (b0.M(3)) {
                StringBuilder a2 = androidx.activity.result.a.a("moveto CREATE_VIEW: ");
                a2.append(this.f1315c);
                Log.d("FragmentManager", a2.toString());
            }
            n nVar2 = this.f1315c;
            nVar2.Q(nVar2.K(nVar2.f1372c), (ViewGroup) null, this.f1315c.f1372c);
            View view = this.f1315c.F;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                n nVar3 = this.f1315c;
                nVar3.F.setTag(R.id.fragment_container_view_tag, nVar3);
                n nVar4 = this.f1315c;
                if (nVar4.f1395z) {
                    nVar4.F.setVisibility(8);
                }
                this.f1315c.f1390u.w(2);
                a0 a0Var = this.f1313a;
                n nVar5 = this.f1315c;
                a0Var.m(nVar5, nVar5.F, nVar5.f1372c, false);
                this.f1315c.f1371b = 2;
            }
        }
    }

    public void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        x0.d.b bVar = x0.d.b.NONE;
        if (!this.f1316d) {
            boolean z2 = false;
            z2 = true;
            try {
                while (true) {
                    int d2 = d();
                    n nVar = this.f1315c;
                    int i2 = nVar.f1371b;
                    if (d2 != i2) {
                        if (d2 <= i2) {
                            switch (i2 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    this.f1315c.f1371b = z2 ? 1 : 0;
                                    break;
                                case 2:
                                    nVar.f1384o = z2;
                                    nVar.f1371b = 2;
                                    break;
                                case 3:
                                    if (b0.M(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f1315c);
                                    }
                                    n nVar2 = this.f1315c;
                                    if (nVar2.F != null && nVar2.f1373d == null) {
                                        o();
                                    }
                                    n nVar3 = this.f1315c;
                                    if (!(nVar3.F == null || (viewGroup2 = nVar3.E) == null)) {
                                        x0 g2 = x0.g(viewGroup2, nVar3.r().K());
                                        Objects.requireNonNull(g2);
                                        if (b0.M(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + this.f1315c);
                                        }
                                        g2.a(x0.d.c.REMOVED, x0.d.b.REMOVING, this);
                                    }
                                    this.f1315c.f1371b = 3;
                                    break;
                                case 4:
                                    q();
                                    break;
                                case 5:
                                    nVar.f1371b = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i2 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(nVar.F == null || (viewGroup3 = nVar.E) == null)) {
                                        x0 g3 = x0.g(viewGroup3, nVar.r().K());
                                        x0.d.c b2 = x0.d.c.b(this.f1315c.F.getVisibility());
                                        Objects.requireNonNull(g3);
                                        if (b0.M(2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + this.f1315c);
                                        }
                                        g3.a(b2, x0.d.b.ADDING, this);
                                    }
                                    this.f1315c.f1371b = 4;
                                    break;
                                case 5:
                                    p();
                                    break;
                                case 6:
                                    nVar.f1371b = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                    } else {
                        if (nVar.J) {
                            if (!(nVar.F == null || (viewGroup = nVar.E) == null)) {
                                x0 g4 = x0.g(viewGroup, nVar.r().K());
                                if (this.f1315c.f1395z) {
                                    Objects.requireNonNull(g4);
                                    if (b0.M(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + this.f1315c);
                                    }
                                    g4.a(x0.d.c.GONE, bVar, this);
                                } else {
                                    Objects.requireNonNull(g4);
                                    if (b0.M(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + this.f1315c);
                                    }
                                    g4.a(x0.d.c.VISIBLE, bVar, this);
                                }
                            }
                            n nVar4 = this.f1315c;
                            b0 b0Var = nVar4.f1388s;
                            if (b0Var != null && nVar4.f1381l && b0Var.N(nVar4)) {
                                b0Var.A = z2;
                            }
                            this.f1315c.J = z2;
                        }
                        this.f1316d = z2;
                        return;
                    }
                }
            } finally {
                this.f1316d = z2;
            }
        } else if (b0.M(2)) {
            StringBuilder a2 = androidx.activity.result.a.a("Ignoring re-entrant call to moveToExpectedState() for ");
            a2.append(this.f1315c);
            Log.v("FragmentManager", a2.toString());
        }
    }

    public void l() {
        if (b0.M(3)) {
            StringBuilder a2 = androidx.activity.result.a.a("movefrom RESUMED: ");
            a2.append(this.f1315c);
            Log.d("FragmentManager", a2.toString());
        }
        n nVar = this.f1315c;
        nVar.f1390u.w(5);
        if (nVar.F != null) {
            nVar.O.b(g.b.ON_PAUSE);
        }
        nVar.N.d(g.b.ON_PAUSE);
        nVar.f1371b = 6;
        nVar.D = false;
        nVar.D = true;
        this.f1313a.f(this.f1315c, false);
    }

    public void m(ClassLoader classLoader) {
        Bundle bundle = this.f1315c.f1372c;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            n nVar = this.f1315c;
            nVar.f1373d = nVar.f1372c.getSparseParcelableArray("android:view_state");
            n nVar2 = this.f1315c;
            nVar2.f1374e = nVar2.f1372c.getBundle("android:view_registry_state");
            n nVar3 = this.f1315c;
            nVar3.f1378i = nVar3.f1372c.getString("android:target_state");
            n nVar4 = this.f1315c;
            if (nVar4.f1378i != null) {
                nVar4.f1379j = nVar4.f1372c.getInt("android:target_req_state", 0);
            }
            n nVar5 = this.f1315c;
            Objects.requireNonNull(nVar5);
            nVar5.H = nVar5.f1372c.getBoolean("android:user_visible_hint", true);
            n nVar6 = this.f1315c;
            if (!nVar6.H) {
                nVar6.G = true;
            }
        }
    }

    public void n() {
        boolean z2;
        if (b0.M(3)) {
            StringBuilder a2 = androidx.activity.result.a.a("moveto RESUMED: ");
            a2.append(this.f1315c);
            Log.d("FragmentManager", a2.toString());
        }
        n nVar = this.f1315c;
        n.b bVar = nVar.I;
        View view = bVar == null ? null : bVar.f1411o;
        if (view != null) {
            if (view != nVar.F) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        z2 = false;
                        break;
                    } else if (parent == this.f1315c.F) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            z2 = true;
            if (z2) {
                boolean requestFocus = view.requestFocus();
                if (b0.M(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("requestFocus: Restoring focused view ");
                    sb.append(view);
                    sb.append(" ");
                    sb.append(requestFocus ? "succeeded" : "failed");
                    sb.append(" on Fragment ");
                    sb.append(this.f1315c);
                    sb.append(" resulting in focused view ");
                    sb.append(this.f1315c.F.findFocus());
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        this.f1315c.a0((View) null);
        n nVar2 = this.f1315c;
        nVar2.f1390u.T();
        nVar2.f1390u.C(true);
        nVar2.f1371b = 7;
        nVar2.D = false;
        nVar2.D = true;
        l lVar = nVar2.N;
        g.b bVar2 = g.b.ON_RESUME;
        lVar.d(bVar2);
        if (nVar2.F != null) {
            nVar2.O.b(bVar2);
        }
        b0 b0Var = nVar2.f1390u;
        b0Var.B = false;
        b0Var.C = false;
        b0Var.J.f1288g = false;
        b0Var.w(7);
        this.f1313a.i(this.f1315c, false);
        n nVar3 = this.f1315c;
        nVar3.f1372c = null;
        nVar3.f1373d = null;
        nVar3.f1374e = null;
    }

    public void o() {
        if (this.f1315c.F != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f1315c.F.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f1315c.f1373d = sparseArray;
            }
            Bundle bundle = new Bundle();
            this.f1315c.O.f1499d.b(bundle);
            if (!bundle.isEmpty()) {
                this.f1315c.f1374e = bundle;
            }
        }
    }

    public void p() {
        if (b0.M(3)) {
            StringBuilder a2 = androidx.activity.result.a.a("moveto STARTED: ");
            a2.append(this.f1315c);
            Log.d("FragmentManager", a2.toString());
        }
        n nVar = this.f1315c;
        nVar.f1390u.T();
        nVar.f1390u.C(true);
        nVar.f1371b = 5;
        nVar.D = false;
        nVar.N();
        if (nVar.D) {
            l lVar = nVar.N;
            g.b bVar = g.b.ON_START;
            lVar.d(bVar);
            if (nVar.F != null) {
                nVar.O.b(bVar);
            }
            b0 b0Var = nVar.f1390u;
            b0Var.B = false;
            b0Var.C = false;
            b0Var.J.f1288g = false;
            b0Var.w(5);
            this.f1313a.k(this.f1315c, false);
            return;
        }
        throw new z0(m.a("Fragment ", nVar, " did not call through to super.onStart()"));
    }

    public void q() {
        if (b0.M(3)) {
            StringBuilder a2 = androidx.activity.result.a.a("movefrom STARTED: ");
            a2.append(this.f1315c);
            Log.d("FragmentManager", a2.toString());
        }
        n nVar = this.f1315c;
        b0 b0Var = nVar.f1390u;
        b0Var.C = true;
        b0Var.J.f1288g = true;
        b0Var.w(4);
        if (nVar.F != null) {
            nVar.O.b(g.b.ON_STOP);
        }
        nVar.N.d(g.b.ON_STOP);
        nVar.f1371b = 4;
        nVar.D = false;
        nVar.O();
        if (nVar.D) {
            this.f1313a.l(this.f1315c, false);
            return;
        }
        throw new z0(m.a("Fragment ", nVar, " did not call through to super.onStop()"));
    }
}
