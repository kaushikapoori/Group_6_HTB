package o0;

import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f3492a;

    /* renamed from: o0.a$a  reason: collision with other inner class name */
    public static class C0045a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final EditText f3493a;

        /* renamed from: b  reason: collision with root package name */
        public final g f3494b;

        public C0045a(EditText editText, boolean z2) {
            this.f3493a = editText;
            g gVar = new g(editText, z2);
            this.f3494b = gVar;
            editText.addTextChangedListener(gVar);
            if (b.f3496b == null) {
                synchronized (b.f3495a) {
                    if (b.f3496b == null) {
                        b.f3496b = new b();
                    }
                }
            }
            editText.setEditableFactory(b.f3496b);
        }

        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return new e(keyListener);
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f3493a, inputConnection, editorInfo);
        }

        public void c(boolean z2) {
            g gVar = this.f3494b;
            if (gVar.f3514e != z2) {
                if (gVar.f3513d != null) {
                    d a2 = d.a();
                    d.e eVar = gVar.f3513d;
                    Objects.requireNonNull(a2);
                    c.a.d(eVar, "initCallback cannot be null");
                    a2.f1126a.writeLock().lock();
                    try {
                        a2.f1127b.remove(eVar);
                    } finally {
                        a2.f1126a.writeLock().unlock();
                    }
                }
                gVar.f3514e = z2;
                if (z2) {
                    g.a(gVar.f3511b, d.a().b());
                }
            }
        }
    }

    public static class b {
        public KeyListener a(KeyListener keyListener) {
            throw null;
        }

        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            throw null;
        }

        public void c(boolean z2) {
            throw null;
        }
    }

    public a(EditText editText, boolean z2) {
        c.a.d(editText, "editText cannot be null");
        this.f3492a = new C0045a(editText, z2);
    }
}
