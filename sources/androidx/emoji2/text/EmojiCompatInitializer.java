package androidx.emoji2.text;

import android.content.Context;
import android.os.Trace;
import androidx.emoji2.text.d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.g;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements t0.b<Boolean> {

    public static class a extends d.c {
        public a(Context context) {
            super(new b(context));
            this.f1140b = 1;
        }
    }

    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1122a;

        public b(Context context) {
            this.f1122a = context.getApplicationContext();
        }

        public void a(d.h hVar) {
            ThreadPoolExecutor a2 = b.a("EmojiCompatInitializer");
            a2.execute(new e(this, hVar, a2));
        }
    }

    public static class c implements Runnable {
        public void run() {
            try {
                int i2 = c0.c.f2067a;
                Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                if (d.c()) {
                    d.a().e();
                }
                Trace.endSection();
            } catch (Throwable th) {
                int i3 = c0.c.f2067a;
                Trace.endSection();
                throw th;
            }
        }
    }

    public List<Class<? extends t0.b<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    public /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    public Boolean c(Context context) {
        a aVar = new a(context);
        if (d.f1125k == null) {
            synchronized (d.f1124j) {
                if (d.f1125k == null) {
                    d.f1125k = new d(aVar);
                }
            }
        }
        t0.a b2 = t0.a.b(context);
        Objects.requireNonNull(b2);
        final g a2 = ((k) b2.a(ProcessLifecycleInitializer.class, new HashSet())).a();
        a2.a(new androidx.lifecycle.c() {
            public void a(k kVar) {
                Objects.requireNonNull(EmojiCompatInitializer.this);
                b.b().postDelayed(new c(), 500);
                l lVar = (l) a2;
                lVar.c("removeObserver");
                lVar.f1580a.e(this);
            }

            public /* synthetic */ void b(k kVar) {
                androidx.lifecycle.b.c(this, kVar);
            }

            public /* synthetic */ void c(k kVar) {
                androidx.lifecycle.b.b(this, kVar);
            }

            public /* synthetic */ void d(k kVar) {
                androidx.lifecycle.b.e(this, kVar);
            }

            public /* synthetic */ void e(k kVar) {
                androidx.lifecycle.b.a(this, kVar);
            }

            public /* synthetic */ void f(k kVar) {
                androidx.lifecycle.b.d(this, kVar);
            }
        });
        return Boolean.TRUE;
    }
}
