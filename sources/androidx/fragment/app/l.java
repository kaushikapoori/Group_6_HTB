package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import androidx.fragment.app.j0;
import androidx.fragment.app.n;
import androidx.lifecycle.k;
import androidx.lifecycle.p;
import com.example.supermarket.R;

public class l extends n implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler T;
    public Runnable U = new a();
    public DialogInterface.OnCancelListener V = new b();
    public DialogInterface.OnDismissListener W = new c();
    public int X = 0;
    public int Y = 0;
    public boolean Z = true;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1353a0 = true;

    /* renamed from: b0  reason: collision with root package name */
    public int f1354b0 = -1;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1355c0;

    /* renamed from: d0  reason: collision with root package name */
    public p<k> f1356d0 = new d();

    /* renamed from: e0  reason: collision with root package name */
    public Dialog f1357e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f1358f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f1359g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1360h0 = false;

    public class a implements Runnable {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            l lVar = l.this;
            lVar.W.onDismiss(lVar.f1357e0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            l lVar = l.this;
            Dialog dialog = lVar.f1357e0;
            if (dialog != null) {
                lVar.onCancel(dialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            l lVar = l.this;
            Dialog dialog = lVar.f1357e0;
            if (dialog != null) {
                lVar.onDismiss(dialog);
            }
        }
    }

    public class d implements p<k> {
        public d() {
        }
    }

    public class e extends v {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v f1365a;

        public e(v vVar) {
            this.f1365a = vVar;
        }

        public View e(int i2) {
            if (this.f1365a.h()) {
                return this.f1365a.e(i2);
            }
            Dialog dialog = l.this.f1357e0;
            if (dialog != null) {
                return dialog.findViewById(i2);
            }
            return null;
        }

        public boolean h() {
            return this.f1365a.h() || l.this.f1360h0;
        }
    }

    public void F(Context context) {
        super.F(context);
        this.P.d(this.f1356d0);
        this.f1359g0 = false;
    }

    public void G(Bundle bundle) {
        super.G(bundle);
        this.T = new Handler();
        this.f1353a0 = this.f1393x == 0;
        if (bundle != null) {
            this.X = bundle.getInt("android:style", 0);
            this.Y = bundle.getInt("android:theme", 0);
            this.Z = bundle.getBoolean("android:cancelable", true);
            this.f1353a0 = bundle.getBoolean("android:showsDialog", this.f1353a0);
            this.f1354b0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void I() {
        this.D = true;
        Dialog dialog = this.f1357e0;
        if (dialog != null) {
            this.f1358f0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f1357e0.dismiss();
            if (!this.f1359g0) {
                onDismiss(this.f1357e0);
            }
            this.f1357e0 = null;
            this.f1360h0 = false;
        }
    }

    public void J() {
        this.D = true;
        if (!this.f1359g0) {
            this.f1359g0 = true;
        }
        this.P.g(this.f1356d0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0046 A[Catch:{ all -> 0x006b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.LayoutInflater K(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r0 = super.K(r8)
            boolean r1 = r7.f1353a0
            java.lang.String r2 = "FragmentManager"
            r3 = 2
            if (r1 == 0) goto L_0x009b
            boolean r4 = r7.f1355c0
            if (r4 == 0) goto L_0x0011
            goto L_0x009b
        L_0x0011:
            if (r1 != 0) goto L_0x0014
            goto L_0x006f
        L_0x0014:
            boolean r1 = r7.f1360h0
            if (r1 != 0) goto L_0x006f
            r1 = 0
            r4 = 1
            r7.f1355c0 = r4     // Catch:{ all -> 0x006b }
            android.app.Dialog r8 = r7.f0(r8)     // Catch:{ all -> 0x006b }
            r7.f1357e0 = r8     // Catch:{ all -> 0x006b }
            boolean r5 = r7.f1353a0     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x0065
            int r5 = r7.X     // Catch:{ all -> 0x006b }
            if (r5 == r4) goto L_0x003b
            if (r5 == r3) goto L_0x003b
            r6 = 3
            if (r5 == r6) goto L_0x0030
            goto L_0x003e
        L_0x0030:
            android.view.Window r5 = r8.getWindow()     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x003b
            r6 = 24
            r5.addFlags(r6)     // Catch:{ all -> 0x006b }
        L_0x003b:
            r8.requestWindowFeature(r4)     // Catch:{ all -> 0x006b }
        L_0x003e:
            android.content.Context r8 = r7.j()     // Catch:{ all -> 0x006b }
            boolean r5 = r8 instanceof android.app.Activity     // Catch:{ all -> 0x006b }
            if (r5 == 0) goto L_0x004d
            android.app.Dialog r5 = r7.f1357e0     // Catch:{ all -> 0x006b }
            android.app.Activity r8 = (android.app.Activity) r8     // Catch:{ all -> 0x006b }
            r5.setOwnerActivity(r8)     // Catch:{ all -> 0x006b }
        L_0x004d:
            android.app.Dialog r8 = r7.f1357e0     // Catch:{ all -> 0x006b }
            boolean r5 = r7.Z     // Catch:{ all -> 0x006b }
            r8.setCancelable(r5)     // Catch:{ all -> 0x006b }
            android.app.Dialog r8 = r7.f1357e0     // Catch:{ all -> 0x006b }
            android.content.DialogInterface$OnCancelListener r5 = r7.V     // Catch:{ all -> 0x006b }
            r8.setOnCancelListener(r5)     // Catch:{ all -> 0x006b }
            android.app.Dialog r8 = r7.f1357e0     // Catch:{ all -> 0x006b }
            android.content.DialogInterface$OnDismissListener r5 = r7.W     // Catch:{ all -> 0x006b }
            r8.setOnDismissListener(r5)     // Catch:{ all -> 0x006b }
            r7.f1360h0 = r4     // Catch:{ all -> 0x006b }
            goto L_0x0068
        L_0x0065:
            r8 = 0
            r7.f1357e0 = r8     // Catch:{ all -> 0x006b }
        L_0x0068:
            r7.f1355c0 = r1
            goto L_0x006f
        L_0x006b:
            r8 = move-exception
            r7.f1355c0 = r1
            throw r8
        L_0x006f:
            boolean r8 = androidx.fragment.app.b0.M(r3)
            if (r8 == 0) goto L_0x008e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "get layout inflater for DialogFragment "
            r8.append(r1)
            r8.append(r7)
            java.lang.String r1 = " from dialog context"
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r2, r8)
        L_0x008e:
            android.app.Dialog r8 = r7.f1357e0
            if (r8 == 0) goto L_0x009a
            android.content.Context r8 = r8.getContext()
            android.view.LayoutInflater r0 = r0.cloneInContext(r8)
        L_0x009a:
            return r0
        L_0x009b:
            boolean r8 = androidx.fragment.app.b0.M(r3)
            if (r8 == 0) goto L_0x00d2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "getting layout inflater for DialogFragment "
            r8.append(r1)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            boolean r1 = r7.f1353a0
            if (r1 != 0) goto L_0x00be
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "mShowsDialog = false: "
            goto L_0x00c5
        L_0x00be:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "mCreatingDialog = true: "
        L_0x00c5:
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            android.util.Log.d(r2, r8)
        L_0x00d2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.l.K(android.os.Bundle):android.view.LayoutInflater");
    }

    public void M(Bundle bundle) {
        Dialog dialog = this.f1357e0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i2 = this.X;
        if (i2 != 0) {
            bundle.putInt("android:style", i2);
        }
        int i3 = this.Y;
        if (i3 != 0) {
            bundle.putInt("android:theme", i3);
        }
        boolean z2 = this.Z;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1353a0;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i4 = this.f1354b0;
        if (i4 != -1) {
            bundle.putInt("android:backStackId", i4);
        }
    }

    public void N() {
        this.D = true;
        Dialog dialog = this.f1357e0;
        if (dialog != null) {
            this.f1358f0 = false;
            dialog.show();
            View decorView = this.f1357e0.getWindow().getDecorView();
            decorView.setTag(R.id.view_tree_lifecycle_owner, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
    }

    public void O() {
        this.D = true;
        Dialog dialog = this.f1357e0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public void P(Bundle bundle) {
        Bundle bundle2;
        this.D = true;
        if (this.f1357e0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1357e0.onRestoreInstanceState(bundle2);
        }
    }

    public void Q(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.Q(layoutInflater, viewGroup, bundle);
        if (this.F == null && this.f1357e0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f1357e0.onRestoreInstanceState(bundle2);
        }
    }

    public v b() {
        return new e(new n.a());
    }

    public final void e0(boolean z2, boolean z3) {
        if (!this.f1359g0) {
            this.f1359g0 = true;
            Dialog dialog = this.f1357e0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f1357e0.dismiss();
                if (!z3) {
                    if (Looper.myLooper() == this.T.getLooper()) {
                        onDismiss(this.f1357e0);
                    } else {
                        this.T.post(this.U);
                    }
                }
            }
            this.f1358f0 = true;
            if (this.f1354b0 >= 0) {
                b0 r2 = r();
                int i2 = this.f1354b0;
                if (i2 >= 0) {
                    r2.A(new b0.m((String) null, i2, 1), false);
                    this.f1354b0 = -1;
                    return;
                }
                throw new IllegalArgumentException("Bad id: " + i2);
            }
            a aVar = new a(r());
            b0 b0Var = this.f1388s;
            if (b0Var == null || b0Var == aVar.f1196p) {
                aVar.b(new j0.a(3, this));
                if (z2) {
                    aVar.d(true);
                } else {
                    aVar.d(false);
                }
            } else {
                StringBuilder a2 = androidx.activity.result.a.a("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
                a2.append(toString());
                a2.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(a2.toString());
            }
        }
    }

    public Dialog f0(Bundle bundle) {
        if (b0.M(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(U(), this.Y);
    }

    public final Dialog g0() {
        Dialog dialog = this.f1357e0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f1358f0) {
            if (b0.M(3)) {
                Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
            }
            e0(true, true);
        }
    }
}
