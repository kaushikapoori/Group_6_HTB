package o0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.d;
import androidx.emoji2.text.h;
import java.util.Objects;

public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f3504a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3505b;

    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f3504a = keyListener;
        this.f3505b = aVar;
    }

    public void clearMetaKeyState(View view, Editable editable, int i2) {
        this.f3504a.clearMetaKeyState(view, editable, i2);
    }

    public int getInputType() {
        return this.f3504a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i2, KeyEvent keyEvent) {
        boolean z2;
        boolean z3;
        Objects.requireNonNull(this.f3505b);
        Object obj = d.f1124j;
        if (i2 != 67) {
            z2 = i2 != 112 ? false : h.a(editable, keyEvent, true);
        } else {
            z2 = h.a(editable, keyEvent, false);
        }
        if (z2) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 || this.f3504a.onKeyDown(view, editable, i2, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f3504a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i2, KeyEvent keyEvent) {
        return this.f3504a.onKeyUp(view, editable, i2, keyEvent);
    }
}
