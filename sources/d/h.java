package d;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.h1;
import androidx.fragment.app.q;
import com.example.supermarket.R;
import h.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m.c;
import w.b;
import w.g;
import x.a;

public class h extends q implements i {

    /* renamed from: n  reason: collision with root package name */
    public j f2702n;

    public h() {
        this.f43e.f2016b.b("androidx:appcompat", new f(this));
        k(new g(this));
    }

    private void m() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        p().c(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(p().d(context));
    }

    public a b(a.C0033a aVar) {
        return null;
    }

    public void closeOptionsMenu() {
        a q2 = q();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a q2 = q();
        return super.dispatchKeyEvent(keyEvent);
    }

    public void e(a aVar) {
    }

    public <T extends View> T findViewById(int i2) {
        return p().e(i2);
    }

    public MenuInflater getMenuInflater() {
        return p().g();
    }

    public Resources getResources() {
        int i2 = h1.f640a;
        return super.getResources();
    }

    public void i(a aVar) {
    }

    public void invalidateOptionsMenu() {
        p().j();
    }

    public void o() {
        p().j();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p().k(configuration);
    }

    public void onContentChanged() {
    }

    public void onDestroy() {
        super.onDestroy();
        p().m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onKeyDown(int r4, android.view.KeyEvent r5) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            if (r0 >= r1) goto L_0x003f
            boolean r0 = r5.isCtrlPressed()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getRepeatCount()
            if (r0 != 0) goto L_0x003f
            int r0 = r5.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003f
            android.view.Window r0 = r3.getWindow()
            if (r0 == 0) goto L_0x003f
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003f
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0.dispatchKeyShortcutEvent(r5)
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x0043:
            boolean r4 = super.onKeyDown(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: d.h.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    public final boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        Intent a2;
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        a q2 = q();
        if (menuItem.getItemId() != 16908332 || q2 == null || (((v) q2).f2807e.j() & 4) == 0 || (a2 = g.a(this)) == null) {
            return false;
        }
        if (shouldUpRecreateTask(a2)) {
            ArrayList arrayList = new ArrayList();
            Intent r2 = r();
            if (r2 == null) {
                r2 = g.a(this);
            }
            if (r2 != null) {
                ComponentName component = r2.getComponent();
                if (component == null) {
                    component = r2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                while (true) {
                    try {
                        Intent b2 = g.b(this, component);
                        if (b2 == null) {
                            break;
                        }
                        arrayList.add(size, b2);
                        component = b2.getComponent();
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e2);
                    }
                }
                arrayList.add(r2);
            }
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                Object obj = x.a.f4298a;
                a.C0059a.a(this, intentArr, (Bundle) null);
                try {
                    int i3 = b.f4130b;
                    finishAffinity();
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            } else {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
        } else {
            navigateUpTo(a2);
            return true;
        }
    }

    public boolean onMenuOpened(int i2, Menu menu) {
        return super.onMenuOpened(i2, menu);
    }

    public void onPanelClosed(int i2, Menu menu) {
        super.onPanelClosed(i2, menu);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        p().n(bundle);
    }

    public void onPostResume() {
        super.onPostResume();
        p().o();
    }

    public void onStart() {
        super.onStart();
        p().q();
    }

    public void onStop() {
        super.onStop();
        p().r();
    }

    public void onTitleChanged(CharSequence charSequence, int i2) {
        super.onTitleChanged(charSequence, i2);
        p().y(charSequence);
    }

    public void openOptionsMenu() {
        a q2 = q();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public j p() {
        if (this.f2702n == null) {
            c<WeakReference<j>> cVar = j.f2703b;
            this.f2702n = new k(this, (Window) null, this, this);
        }
        return this.f2702n;
    }

    public a q() {
        return p().h();
    }

    public Intent r() {
        return g.a(this);
    }

    public void setContentView(int i2) {
        m();
        p().u(i2);
    }

    public void setContentView(View view) {
        m();
        p().v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        p().w(view, layoutParams);
    }

    public void setTheme(int i2) {
        super.setTheme(i2);
        p().x(i2);
    }
}
