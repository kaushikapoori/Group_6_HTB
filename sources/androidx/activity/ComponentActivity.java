package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.savedstate.a;
import com.example.supermarket.R;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import w.f;

public class ComponentActivity extends f implements z, androidx.savedstate.c, c, androidx.activity.result.f {

    /* renamed from: c  reason: collision with root package name */
    public final a.a f41c = new a.a();

    /* renamed from: d  reason: collision with root package name */
    public final l f42d;

    /* renamed from: e  reason: collision with root package name */
    public final androidx.savedstate.b f43e;

    /* renamed from: f  reason: collision with root package name */
    public y f44f;

    /* renamed from: g  reason: collision with root package name */
    public final OnBackPressedDispatcher f45g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.activity.result.e f46h;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    public class b extends androidx.activity.result.e {
        public b(ComponentActivity componentActivity) {
        }
    }

    public class c implements a.b {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public Bundle a() {
            Bundle bundle = new Bundle();
            androidx.activity.result.e eVar = ComponentActivity.this.f46h;
            Objects.requireNonNull(eVar);
            bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(eVar.f73c.values()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(eVar.f73c.keySet()));
            bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(eVar.f75e));
            bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) eVar.f78h.clone());
            bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", eVar.f71a);
            return bundle;
        }
    }

    public class d implements a.b {
        public d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void a(Context context) {
            Bundle a2 = ComponentActivity.this.f43e.f2016b.a("android:support:activity-result");
            if (a2 != null) {
                androidx.activity.result.e eVar = ComponentActivity.this.f46h;
                Objects.requireNonNull(eVar);
                ArrayList<Integer> integerArrayList = a2.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                ArrayList<String> stringArrayList = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                if (stringArrayList != null && integerArrayList != null) {
                    eVar.f75e = a2.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    eVar.f71a = (Random) a2.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                    eVar.f78h.putAll(a2.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                    for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                        String str = stringArrayList.get(i2);
                        if (eVar.f73c.containsKey(str)) {
                            Integer remove = eVar.f73c.remove(str);
                            if (!eVar.f78h.containsKey(str)) {
                                eVar.f72b.remove(remove);
                            }
                        }
                        int intValue = integerArrayList.get(i2).intValue();
                        String str2 = stringArrayList.get(i2);
                        eVar.f72b.put(Integer.valueOf(intValue), str2);
                        eVar.f73c.put(str2, Integer.valueOf(intValue));
                    }
                }
            }
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public y f53a;
    }

    public ComponentActivity() {
        l lVar = new l(this);
        this.f42d = lVar;
        androidx.savedstate.b bVar = new androidx.savedstate.b(this);
        this.f43e = bVar;
        this.f45g = new OnBackPressedDispatcher(new a());
        new AtomicInteger();
        this.f46h = new b(this);
        int i2 = Build.VERSION.SDK_INT;
        lVar.a(new i() {
            public void g(k kVar, g.b bVar) {
                if (bVar == g.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        lVar.a(new i() {
            public void g(k kVar, g.b bVar) {
                if (bVar == g.b.ON_DESTROY) {
                    ComponentActivity.this.f41c.f1b = null;
                    if (!ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.f().a();
                    }
                }
            }
        });
        lVar.a(new i() {
            public void g(k kVar, g.b bVar) {
                ComponentActivity.this.l();
                l lVar = ComponentActivity.this.f42d;
                lVar.c("removeObserver");
                lVar.f1580a.e(this);
            }
        });
        if (i2 <= 23) {
            lVar.a(new ImmLeaksCleaner(this));
        }
        bVar.f2016b.b("android:support:activity-result", new c());
        k(new d());
    }

    public g a() {
        return this.f42d;
    }

    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m();
        super.addContentView(view, layoutParams);
    }

    public final OnBackPressedDispatcher c() {
        return this.f45g;
    }

    public final androidx.savedstate.a d() {
        return this.f43e.f2016b;
    }

    public y f() {
        if (getApplication() != null) {
            l();
            return this.f44f;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public final androidx.activity.result.e g() {
        return this.f46h;
    }

    public final void k(a.b bVar) {
        a.a aVar = this.f41c;
        if (aVar.f1b != null) {
            bVar.a(aVar.f1b);
        }
        aVar.f0a.add(bVar);
    }

    public void l() {
        if (this.f44f == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f44f = eVar.f53a;
            }
            if (this.f44f == null) {
                this.f44f = new y();
            }
        }
    }

    public final void m() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (!this.f46h.a(i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        this.f45g.b();
    }

    public void onCreate(Bundle bundle) {
        this.f43e.a(bundle);
        a.a aVar = this.f41c;
        aVar.f1b = this;
        for (a.b a2 : aVar.f0a) {
            a2.a(this);
        }
        super.onCreate(bundle);
        t.c(this);
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (!this.f46h.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
        }
    }

    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        y yVar = this.f44f;
        if (yVar == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            yVar = eVar.f53a;
        }
        if (yVar == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f53a = yVar;
        return eVar2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        l lVar = this.f42d;
        if (lVar instanceof l) {
            g.c cVar = g.c.CREATED;
            lVar.c("setCurrentState");
            lVar.f(cVar);
        }
        super.onSaveInstanceState(bundle);
        this.f43e.b(bundle);
    }

    public void reportFullyDrawn() {
        try {
            if (u0.a.a()) {
                Trace.beginSection("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public void setContentView(int i2) {
        m();
        super.setContentView(i2);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m();
        super.setContentView(view);
    }

    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m();
        super.setContentView(view, layoutParams);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
