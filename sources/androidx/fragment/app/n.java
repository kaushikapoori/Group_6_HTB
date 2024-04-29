package androidx.fragment.app;

import android.animation.Animator;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.o;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import com.example.supermarket.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import r0.b;

public class n implements ComponentCallbacks, View.OnCreateContextMenuListener, k, z, androidx.savedstate.c {
    public static final Object S = new Object();
    public boolean A;
    public boolean B;
    public boolean C = true;
    public boolean D;
    public ViewGroup E;
    public View F;
    public boolean G;
    public boolean H = true;
    public b I;
    public boolean J;
    public float K;
    public boolean L;
    public g.c M = g.c.RESUMED;
    public l N;
    public v0 O;
    public o<k> P = new o<>();
    public androidx.savedstate.b Q;
    public final ArrayList<d> R;

    /* renamed from: b  reason: collision with root package name */
    public int f1371b = -1;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f1372c;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray<Parcelable> f1373d;

    /* renamed from: e  reason: collision with root package name */
    public Bundle f1374e;

    /* renamed from: f  reason: collision with root package name */
    public String f1375f = UUID.randomUUID().toString();

    /* renamed from: g  reason: collision with root package name */
    public Bundle f1376g;

    /* renamed from: h  reason: collision with root package name */
    public n f1377h;

    /* renamed from: i  reason: collision with root package name */
    public String f1378i = null;

    /* renamed from: j  reason: collision with root package name */
    public int f1379j;

    /* renamed from: k  reason: collision with root package name */
    public Boolean f1380k = null;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1381l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1382m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1383n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1384o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1385p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1386q;

    /* renamed from: r  reason: collision with root package name */
    public int f1387r;

    /* renamed from: s  reason: collision with root package name */
    public b0 f1388s;

    /* renamed from: t  reason: collision with root package name */
    public y<?> f1389t;

    /* renamed from: u  reason: collision with root package name */
    public b0 f1390u = new c0();

    /* renamed from: v  reason: collision with root package name */
    public n f1391v;

    /* renamed from: w  reason: collision with root package name */
    public int f1392w;

    /* renamed from: x  reason: collision with root package name */
    public int f1393x;

    /* renamed from: y  reason: collision with root package name */
    public String f1394y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1395z;

    public class a extends v {
        public a() {
        }

        public View e(int i2) {
            View view = n.this.F;
            if (view != null) {
                return view.findViewById(i2);
            }
            StringBuilder a2 = androidx.activity.result.a.a("Fragment ");
            a2.append(n.this);
            a2.append(" does not have a view");
            throw new IllegalStateException(a2.toString());
        }

        public boolean h() {
            return n.this.F != null;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f1397a;

        /* renamed from: b  reason: collision with root package name */
        public Animator f1398b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1399c;

        /* renamed from: d  reason: collision with root package name */
        public int f1400d;

        /* renamed from: e  reason: collision with root package name */
        public int f1401e;

        /* renamed from: f  reason: collision with root package name */
        public int f1402f;

        /* renamed from: g  reason: collision with root package name */
        public int f1403g;

        /* renamed from: h  reason: collision with root package name */
        public int f1404h;

        /* renamed from: i  reason: collision with root package name */
        public ArrayList<String> f1405i;

        /* renamed from: j  reason: collision with root package name */
        public ArrayList<String> f1406j;

        /* renamed from: k  reason: collision with root package name */
        public Object f1407k;

        /* renamed from: l  reason: collision with root package name */
        public Object f1408l;

        /* renamed from: m  reason: collision with root package name */
        public Object f1409m;

        /* renamed from: n  reason: collision with root package name */
        public float f1410n = 1.0f;

        /* renamed from: o  reason: collision with root package name */
        public View f1411o = null;

        /* renamed from: p  reason: collision with root package name */
        public e f1412p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f1413q;

        public b() {
            Object obj = n.S;
            this.f1407k = obj;
            this.f1408l = obj;
            this.f1409m = obj;
        }
    }

    public static class c extends RuntimeException {
        public c(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static abstract class d {
        public abstract void a();
    }

    public interface e {
    }

    public n() {
        new AtomicInteger();
        this.R = new ArrayList<>();
        this.N = new l(this);
        this.Q = new androidx.savedstate.b(this);
    }

    public final String A(int i2) {
        return w().getString(i2);
    }

    public final boolean B() {
        return this.f1387r > 0;
    }

    public boolean C() {
        return false;
    }

    public final boolean D() {
        n nVar = this.f1391v;
        return nVar != null && (nVar.f1382m || nVar.D());
    }

    @Deprecated
    public void E(int i2, int i3, Intent intent) {
        if (b0.M(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    public void F(Context context) {
        this.D = true;
        y<?> yVar = this.f1389t;
        if ((yVar == null ? null : yVar.f1531b) != null) {
            this.D = false;
            this.D = true;
        }
    }

    public void G(Bundle bundle) {
        Parcelable parcelable;
        boolean z2 = true;
        this.D = true;
        if (!(bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null)) {
            this.f1390u.Y(parcelable);
            this.f1390u.m();
        }
        b0 b0Var = this.f1390u;
        if (b0Var.f1230p < 1) {
            z2 = false;
        }
        if (!z2) {
            b0Var.m();
        }
    }

    public View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    public void I() {
        this.D = true;
    }

    public void J() {
        this.D = true;
    }

    public LayoutInflater K(Bundle bundle) {
        y<?> yVar = this.f1389t;
        if (yVar != null) {
            LayoutInflater j2 = yVar.j();
            j2.setFactory2(this.f1390u.f1220f);
            return j2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void L(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.D = true;
        y<?> yVar = this.f1389t;
        if ((yVar == null ? null : yVar.f1531b) != null) {
            this.D = false;
            this.D = true;
        }
    }

    public void M(Bundle bundle) {
    }

    public void N() {
        this.D = true;
    }

    public void O() {
        this.D = true;
    }

    public void P(Bundle bundle) {
        this.D = true;
    }

    public void Q(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1390u.T();
        boolean z2 = true;
        this.f1386q = true;
        this.O = new v0(this, f());
        View H2 = H(layoutInflater, viewGroup, bundle);
        this.F = H2;
        if (H2 != null) {
            this.O.e();
            this.F.setTag(R.id.view_tree_lifecycle_owner, this.O);
            this.F.setTag(R.id.view_tree_view_model_store_owner, this.O);
            this.F.setTag(R.id.view_tree_saved_state_registry_owner, this.O);
            this.P.h(this.O);
            return;
        }
        if (this.O.f1498c == null) {
            z2 = false;
        }
        if (!z2) {
            this.O = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public void R() {
        this.f1390u.w(1);
        if (this.F != null) {
            v0 v0Var = this.O;
            v0Var.e();
            if (v0Var.f1498c.f1581b.compareTo(g.c.CREATED) >= 0) {
                this.O.b(g.b.ON_DESTROY);
            }
        }
        this.f1371b = 1;
        this.D = false;
        I();
        if (this.D) {
            b.C0048b bVar = ((r0.b) r0.a.b(this)).f3814b;
            int g2 = bVar.f3816b.g();
            for (int i2 = 0; i2 < g2; i2++) {
                Objects.requireNonNull(bVar.f3816b.h(i2));
            }
            this.f1386q = false;
            return;
        }
        throw new z0(m.a("Fragment ", this, " did not call through to super.onDestroyView()"));
    }

    public void S() {
        onLowMemory();
        this.f1390u.p();
    }

    public boolean T(Menu menu) {
        if (!this.f1395z) {
            return false | this.f1390u.v(menu);
        }
        return false;
    }

    public final Context U() {
        Context j2 = j();
        if (j2 != null) {
            return j2;
        }
        throw new IllegalStateException(m.a("Fragment ", this, " not attached to a context."));
    }

    public final View V() {
        View view = this.F;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(m.a("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void W(View view) {
        g().f1397a = view;
    }

    public void X(int i2, int i3, int i4, int i5) {
        if (this.I != null || i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
            g().f1400d = i2;
            g().f1401e = i3;
            g().f1402f = i4;
            g().f1403g = i5;
        }
    }

    public void Y(Animator animator) {
        g().f1398b = animator;
    }

    public void Z(Bundle bundle) {
        b0 b0Var = this.f1388s;
        if (b0Var != null) {
            if (b0Var == null ? false : b0Var.Q()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1376g = bundle;
    }

    public g a() {
        return this.N;
    }

    public void a0(View view) {
        g().f1411o = null;
    }

    public v b() {
        return new a();
    }

    public void b0(boolean z2) {
        g().f1413q = z2;
    }

    public void c0(e eVar) {
        g();
        e eVar2 = this.I.f1412p;
        if (eVar != eVar2) {
            if (eVar != null && eVar2 != null) {
                throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
            } else if (eVar != null) {
                ((b0.n) eVar).f1256c++;
            }
        }
    }

    public final androidx.savedstate.a d() {
        return this.Q.f2016b;
    }

    public void d0(boolean z2) {
        if (this.I != null) {
            g().f1399c = z2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0136, code lost:
        r1 = r2.f1378i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(java.lang.String r3, java.io.FileDescriptor r4, java.io.PrintWriter r5, java.lang.String[] r6) {
        /*
            r2 = this;
            r5.print(r3)
            java.lang.String r0 = "mFragmentId=#"
            r5.print(r0)
            int r0 = r2.f1392w
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mContainerId=#"
            r5.print(r0)
            int r0 = r2.f1393x
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r5.print(r0)
            java.lang.String r0 = " mTag="
            r5.print(r0)
            java.lang.String r0 = r2.f1394y
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mState="
            r5.print(r0)
            int r0 = r2.f1371b
            r5.print(r0)
            java.lang.String r0 = " mWho="
            r5.print(r0)
            java.lang.String r0 = r2.f1375f
            r5.print(r0)
            java.lang.String r0 = " mBackStackNesting="
            r5.print(r0)
            int r0 = r2.f1387r
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mAdded="
            r5.print(r0)
            boolean r0 = r2.f1381l
            r5.print(r0)
            java.lang.String r0 = " mRemoving="
            r5.print(r0)
            boolean r0 = r2.f1382m
            r5.print(r0)
            java.lang.String r0 = " mFromLayout="
            r5.print(r0)
            boolean r0 = r2.f1383n
            r5.print(r0)
            java.lang.String r0 = " mInLayout="
            r5.print(r0)
            boolean r0 = r2.f1384o
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mHidden="
            r5.print(r0)
            boolean r0 = r2.f1395z
            r5.print(r0)
            java.lang.String r0 = " mDetached="
            r5.print(r0)
            boolean r0 = r2.A
            r5.print(r0)
            java.lang.String r0 = " mMenuVisible="
            r5.print(r0)
            boolean r0 = r2.C
            r5.print(r0)
            java.lang.String r0 = " mHasMenu="
            r5.print(r0)
            r0 = 0
            r5.println(r0)
            r5.print(r3)
            java.lang.String r0 = "mRetainInstance="
            r5.print(r0)
            boolean r0 = r2.B
            r5.print(r0)
            java.lang.String r0 = " mUserVisibleHint="
            r5.print(r0)
            boolean r0 = r2.H
            r5.println(r0)
            androidx.fragment.app.b0 r0 = r2.f1388s
            if (r0 == 0) goto L_0x00c7
            r5.print(r3)
            java.lang.String r0 = "mFragmentManager="
            r5.print(r0)
            androidx.fragment.app.b0 r0 = r2.f1388s
            r5.println(r0)
        L_0x00c7:
            androidx.fragment.app.y<?> r0 = r2.f1389t
            if (r0 == 0) goto L_0x00d8
            r5.print(r3)
            java.lang.String r0 = "mHost="
            r5.print(r0)
            androidx.fragment.app.y<?> r0 = r2.f1389t
            r5.println(r0)
        L_0x00d8:
            androidx.fragment.app.n r0 = r2.f1391v
            if (r0 == 0) goto L_0x00e9
            r5.print(r3)
            java.lang.String r0 = "mParentFragment="
            r5.print(r0)
            androidx.fragment.app.n r0 = r2.f1391v
            r5.println(r0)
        L_0x00e9:
            android.os.Bundle r0 = r2.f1376g
            if (r0 == 0) goto L_0x00fa
            r5.print(r3)
            java.lang.String r0 = "mArguments="
            r5.print(r0)
            android.os.Bundle r0 = r2.f1376g
            r5.println(r0)
        L_0x00fa:
            android.os.Bundle r0 = r2.f1372c
            if (r0 == 0) goto L_0x010b
            r5.print(r3)
            java.lang.String r0 = "mSavedFragmentState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f1372c
            r5.println(r0)
        L_0x010b:
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f1373d
            if (r0 == 0) goto L_0x011c
            r5.print(r3)
            java.lang.String r0 = "mSavedViewState="
            r5.print(r0)
            android.util.SparseArray<android.os.Parcelable> r0 = r2.f1373d
            r5.println(r0)
        L_0x011c:
            android.os.Bundle r0 = r2.f1374e
            if (r0 == 0) goto L_0x012d
            r5.print(r3)
            java.lang.String r0 = "mSavedViewRegistryState="
            r5.print(r0)
            android.os.Bundle r0 = r2.f1374e
            r5.println(r0)
        L_0x012d:
            androidx.fragment.app.n r0 = r2.f1377h
            if (r0 == 0) goto L_0x0132
            goto L_0x0142
        L_0x0132:
            androidx.fragment.app.b0 r0 = r2.f1388s
            if (r0 == 0) goto L_0x0141
            java.lang.String r1 = r2.f1378i
            if (r1 == 0) goto L_0x0141
            androidx.fragment.app.i0 r0 = r0.f1217c
            androidx.fragment.app.n r0 = r0.d(r1)
            goto L_0x0142
        L_0x0141:
            r0 = 0
        L_0x0142:
            if (r0 == 0) goto L_0x0159
            r5.print(r3)
            java.lang.String r1 = "mTarget="
            r5.print(r1)
            r5.print(r0)
            java.lang.String r0 = " mTargetRequestCode="
            r5.print(r0)
            int r0 = r2.f1379j
            r5.println(r0)
        L_0x0159:
            r5.print(r3)
            java.lang.String r0 = "mPopDirection="
            r5.print(r0)
            boolean r0 = r2.s()
            r5.println(r0)
            int r0 = r2.k()
            if (r0 == 0) goto L_0x017d
            r5.print(r3)
            java.lang.String r0 = "getEnterAnim="
            r5.print(r0)
            int r0 = r2.k()
            r5.println(r0)
        L_0x017d:
            int r0 = r2.n()
            if (r0 == 0) goto L_0x0192
            r5.print(r3)
            java.lang.String r0 = "getExitAnim="
            r5.print(r0)
            int r0 = r2.n()
            r5.println(r0)
        L_0x0192:
            int r0 = r2.t()
            if (r0 == 0) goto L_0x01a7
            r5.print(r3)
            java.lang.String r0 = "getPopEnterAnim="
            r5.print(r0)
            int r0 = r2.t()
            r5.println(r0)
        L_0x01a7:
            int r0 = r2.u()
            if (r0 == 0) goto L_0x01bc
            r5.print(r3)
            java.lang.String r0 = "getPopExitAnim="
            r5.print(r0)
            int r0 = r2.u()
            r5.println(r0)
        L_0x01bc:
            android.view.ViewGroup r0 = r2.E
            if (r0 == 0) goto L_0x01cd
            r5.print(r3)
            java.lang.String r0 = "mContainer="
            r5.print(r0)
            android.view.ViewGroup r0 = r2.E
            r5.println(r0)
        L_0x01cd:
            android.view.View r0 = r2.F
            if (r0 == 0) goto L_0x01de
            r5.print(r3)
            java.lang.String r0 = "mView="
            r5.print(r0)
            android.view.View r0 = r2.F
            r5.println(r0)
        L_0x01de:
            android.view.View r0 = r2.h()
            if (r0 == 0) goto L_0x01f3
            r5.print(r3)
            java.lang.String r0 = "mAnimatingAway="
            r5.print(r0)
            android.view.View r0 = r2.h()
            r5.println(r0)
        L_0x01f3:
            android.content.Context r0 = r2.j()
            if (r0 == 0) goto L_0x0200
            r0.a r0 = r0.a.b(r2)
            r0.a(r3, r4, r5, r6)
        L_0x0200:
            r5.print(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Child "
            r0.append(r1)
            androidx.fragment.app.b0 r1 = r2.f1390u
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.println(r0)
            androidx.fragment.app.b0 r0 = r2.f1390u
            java.lang.String r1 = "  "
            java.lang.String r3 = h.f.a(r3, r1)
            r0.y(r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.e(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public y f() {
        if (this.f1388s == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (q() != 1) {
            e0 e0Var = this.f1388s.J;
            y yVar = e0Var.f1285d.get(this.f1375f);
            if (yVar != null) {
                return yVar;
            }
            y yVar2 = new y();
            e0Var.f1285d.put(this.f1375f, yVar2);
            return yVar2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final b g() {
        if (this.I == null) {
            this.I = new b();
        }
        return this.I;
    }

    public View h() {
        b bVar = this.I;
        if (bVar == null) {
            return null;
        }
        return bVar.f1397a;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final b0 i() {
        if (this.f1389t != null) {
            return this.f1390u;
        }
        throw new IllegalStateException(m.a("Fragment ", this, " has not been attached yet."));
    }

    public Context j() {
        y<?> yVar = this.f1389t;
        if (yVar == null) {
            return null;
        }
        return yVar.f1532c;
    }

    public int k() {
        b bVar = this.I;
        if (bVar == null) {
            return 0;
        }
        return bVar.f1400d;
    }

    public Object l() {
        b bVar = this.I;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public void m() {
        b bVar = this.I;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
        }
    }

    public int n() {
        b bVar = this.I;
        if (bVar == null) {
            return 0;
        }
        return bVar.f1401e;
    }

    public Object o() {
        b bVar = this.I;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.D = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        q qVar;
        y<?> yVar = this.f1389t;
        if (yVar == null) {
            qVar = null;
        } else {
            qVar = (q) yVar.f1531b;
        }
        if (qVar != null) {
            qVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException(m.a("Fragment ", this, " not attached to an activity."));
    }

    public void onLowMemory() {
        this.D = true;
    }

    public void p() {
        b bVar = this.I;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
        }
    }

    public final int q() {
        g.c cVar = this.M;
        return (cVar == g.c.INITIALIZED || this.f1391v == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.f1391v.q());
    }

    public final b0 r() {
        b0 b0Var = this.f1388s;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException(m.a("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean s() {
        b bVar = this.I;
        if (bVar == null) {
            return false;
        }
        return bVar.f1399c;
    }

    public int t() {
        b bVar = this.I;
        if (bVar == null) {
            return 0;
        }
        return bVar.f1402f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f1375f);
        if (this.f1392w != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1392w));
        }
        if (this.f1394y != null) {
            sb.append(" tag=");
            sb.append(this.f1394y);
        }
        sb.append(")");
        return sb.toString();
    }

    public int u() {
        b bVar = this.I;
        if (bVar == null) {
            return 0;
        }
        return bVar.f1403g;
    }

    public Object v() {
        b bVar = this.I;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f1408l;
        if (obj != S) {
            return obj;
        }
        o();
        return null;
    }

    public final Resources w() {
        return U().getResources();
    }

    public Object x() {
        b bVar = this.I;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f1407k;
        if (obj != S) {
            return obj;
        }
        l();
        return null;
    }

    public Object y() {
        b bVar = this.I;
        if (bVar == null) {
            return null;
        }
        Objects.requireNonNull(bVar);
        return null;
    }

    public Object z() {
        b bVar = this.I;
        if (bVar == null) {
            return null;
        }
        Object obj = bVar.f1409m;
        if (obj != S) {
            return obj;
        }
        y();
        return null;
    }
}
