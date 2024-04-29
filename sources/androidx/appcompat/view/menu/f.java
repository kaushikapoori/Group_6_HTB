package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.i;

public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, i.a {

    /* renamed from: b  reason: collision with root package name */
    public e f240b;

    /* renamed from: c  reason: collision with root package name */
    public b f241c;

    /* renamed from: d  reason: collision with root package name */
    public c f242d;

    public f(e eVar) {
        this.f240b = eVar;
    }

    public void b(e eVar, boolean z2) {
        b bVar;
        if ((z2 || eVar == this.f240b) && (bVar = this.f241c) != null) {
            bVar.dismiss();
        }
    }

    public boolean c(e eVar) {
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        this.f240b.q(((c.a) this.f242d.a()).getItem(i2), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        c cVar = this.f242d;
        e eVar = this.f240b;
        i.a aVar = cVar.f205f;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
    }

    public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i2 == 82 || i2 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f241c.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f241c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f240b.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f240b.performShortcut(i2, keyEvent, 0);
    }
}
