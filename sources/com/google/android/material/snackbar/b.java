package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

public class b {

    /* renamed from: d  reason: collision with root package name */
    public static b f2507d;

    /* renamed from: a  reason: collision with root package name */
    public final Object f2508a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f2509b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: c  reason: collision with root package name */
    public c f2510c;

    public class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b bVar = b.this;
            c cVar = (c) message.obj;
            synchronized (bVar.f2508a) {
                if (bVar.f2510c == cVar || cVar == null) {
                    Objects.requireNonNull(cVar);
                    throw null;
                }
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.b$b  reason: collision with other inner class name */
    public interface C0019b {
    }

    public static class c {
    }

    public static b a() {
        if (f2507d == null) {
            f2507d = new b();
        }
        return f2507d;
    }

    public final boolean b(C0019b bVar) {
        if (this.f2510c == null || bVar == null) {
            return false;
        }
        throw null;
    }
}
