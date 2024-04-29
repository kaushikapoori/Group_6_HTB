package w;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.t;
import g0.e;

public class f extends Activity implements k, e.a {

    /* renamed from: b  reason: collision with root package name */
    public l f4150b = new l(this);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.a(decorView, keyEvent)) {
            return e.b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !e.a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    public boolean h(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t.c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        l lVar = this.f4150b;
        g.c cVar = g.c.CREATED;
        lVar.c("markState");
        lVar.c("setCurrentState");
        lVar.f(cVar);
        super.onSaveInstanceState(bundle);
    }
}
