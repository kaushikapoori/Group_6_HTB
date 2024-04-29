package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.c;
import androidx.activity.result.e;
import androidx.activity.result.f;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;

public class q extends ComponentActivity {

    /* renamed from: i  reason: collision with root package name */
    public final w f1443i;

    /* renamed from: j  reason: collision with root package name */
    public final l f1444j = new l(this);

    /* renamed from: k  reason: collision with root package name */
    public boolean f1445k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1446l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1447m = true;

    public class a extends y<q> implements z, c, f, f0 {
        public a() {
            super(q.this);
        }

        public g a() {
            return q.this.f1444j;
        }

        public void b(b0 b0Var, n nVar) {
            Objects.requireNonNull(q.this);
        }

        public OnBackPressedDispatcher c() {
            return q.this.f45g;
        }

        public View e(int i2) {
            return q.this.findViewById(i2);
        }

        public y f() {
            return q.this.f();
        }

        public e g() {
            return q.this.f46h;
        }

        public boolean h() {
            Window window = q.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        public Object i() {
            return q.this;
        }

        public LayoutInflater j() {
            return q.this.getLayoutInflater().cloneInContext(q.this);
        }

        public boolean k(n nVar) {
            return !q.this.isFinishing();
        }

        public void l() {
            q.this.o();
        }
    }

    public q() {
        a aVar = new a();
        c.a.d(aVar, "callbacks == null");
        this.f1443i = new w(aVar);
        this.f43e.f2016b.b("android:support:fragments", new o(this));
        k(new p(this));
    }

    public static boolean n(b0 b0Var, g.c cVar) {
        g.c cVar2 = g.c.STARTED;
        boolean z2 = false;
        for (n next : b0Var.f1217c.i()) {
            if (next != null) {
                y<?> yVar = next.f1389t;
                if ((yVar == null ? null : yVar.i()) != null) {
                    z2 |= n(next.i(), cVar);
                }
                v0 v0Var = next.O;
                if (v0Var != null) {
                    v0Var.e();
                    if (v0Var.f1498c.f1581b.compareTo(cVar2) >= 0) {
                        l lVar = next.O.f1498c;
                        lVar.c("setCurrentState");
                        lVar.f(cVar);
                        z2 = true;
                    }
                }
                if (next.N.f1581b.compareTo(cVar2) >= 0) {
                    l lVar2 = next.N;
                    lVar2.c("setCurrentState");
                    lVar2.f(cVar);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f1445k);
        printWriter.print(" mResumed=");
        printWriter.print(this.f1446l);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1447m);
        if (getApplication() != null) {
            r0.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f1443i.f1500a.f1534e.y(str, fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void o() {
        invalidateOptionsMenu();
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        this.f1443i.a();
        super.onActivityResult(i2, i3, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f1443i.a();
        super.onConfigurationChanged(configuration);
        this.f1443i.f1500a.f1534e.k(configuration);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1444j.d(g.b.ON_CREATE);
        this.f1443i.f1500a.f1534e.m();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu);
        w wVar = this.f1443i;
        return onCreatePanelMenu | wVar.f1500a.f1534e.n(menu, getMenuInflater());
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1443i.f1500a.f1534e.f1220f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f1443i.f1500a.f1534e.o();
        this.f1444j.d(g.b.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.f1443i.f1500a.f1534e.p();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.f1443i.f1500a.f1534e.r(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.f1443i.f1500a.f1534e.l(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z2) {
        this.f1443i.f1500a.f1534e.q(z2);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.f1443i.a();
        super.onNewIntent(intent);
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.f1443i.f1500a.f1534e.s(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    public void onPause() {
        super.onPause();
        this.f1446l = false;
        this.f1443i.f1500a.f1534e.w(5);
        this.f1444j.d(g.b.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z2) {
        this.f1443i.f1500a.f1534e.u(z2);
    }

    public void onPostResume() {
        super.onPostResume();
        this.f1444j.d(g.b.ON_RESUME);
        b0 b0Var = this.f1443i.f1500a.f1534e;
        b0Var.B = false;
        b0Var.C = false;
        b0Var.J.f1288g = false;
        b0Var.w(7);
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return super.onPreparePanel(0, view, menu) | this.f1443i.f1500a.f1534e.v(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.f1443i.a();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    public void onResume() {
        this.f1443i.a();
        super.onResume();
        this.f1446l = true;
        this.f1443i.f1500a.f1534e.C(true);
    }

    public void onStart() {
        this.f1443i.a();
        super.onStart();
        this.f1447m = false;
        if (!this.f1445k) {
            this.f1445k = true;
            b0 b0Var = this.f1443i.f1500a.f1534e;
            b0Var.B = false;
            b0Var.C = false;
            b0Var.J.f1288g = false;
            b0Var.w(4);
        }
        this.f1443i.f1500a.f1534e.C(true);
        this.f1444j.d(g.b.ON_START);
        b0 b0Var2 = this.f1443i.f1500a.f1534e;
        b0Var2.B = false;
        b0Var2.C = false;
        b0Var2.J.f1288g = false;
        b0Var2.w(5);
    }

    public void onStateNotSaved() {
        this.f1443i.a();
    }

    public void onStop() {
        super.onStop();
        this.f1447m = true;
        do {
        } while (n(this.f1443i.f1500a.f1534e, g.c.CREATED));
        b0 b0Var = this.f1443i.f1500a.f1534e;
        b0Var.C = true;
        b0Var.J.f1288g = true;
        b0Var.w(4);
        this.f1444j.d(g.b.ON_STOP);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.f1443i.f1500a.f1534e.f1220f.onCreateView((View) null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
