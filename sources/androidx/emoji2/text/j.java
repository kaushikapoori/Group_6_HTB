package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.emoji2.text.d;
import d0.e;
import d0.k;
import d0.l;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

public class j extends d.c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f1168d = new a();

    public static class a {
    }

    public static class b implements d.g {

        /* renamed from: a  reason: collision with root package name */
        public final Context f1169a;

        /* renamed from: b  reason: collision with root package name */
        public final e f1170b;

        /* renamed from: c  reason: collision with root package name */
        public final a f1171c;

        /* renamed from: d  reason: collision with root package name */
        public final Object f1172d = new Object();

        /* renamed from: e  reason: collision with root package name */
        public Handler f1173e;

        /* renamed from: f  reason: collision with root package name */
        public Executor f1174f;

        /* renamed from: g  reason: collision with root package name */
        public ThreadPoolExecutor f1175g;

        /* renamed from: h  reason: collision with root package name */
        public d.h f1176h;

        /* renamed from: i  reason: collision with root package name */
        public ContentObserver f1177i;

        /* renamed from: j  reason: collision with root package name */
        public Runnable f1178j;

        public b(Context context, e eVar, a aVar) {
            c.a.d(context, "Context cannot be null");
            c.a.d(eVar, "FontRequest cannot be null");
            this.f1169a = context.getApplicationContext();
            this.f1170b = eVar;
            this.f1171c = aVar;
        }

        public void a(d.h hVar) {
            synchronized (this.f1172d) {
                this.f1176h = hVar;
            }
            c();
        }

        public final void b() {
            synchronized (this.f1172d) {
                this.f1176h = null;
                ContentObserver contentObserver = this.f1177i;
                if (contentObserver != null) {
                    a aVar = this.f1171c;
                    Context context = this.f1169a;
                    Objects.requireNonNull(aVar);
                    context.getContentResolver().unregisterContentObserver(contentObserver);
                    this.f1177i = null;
                }
                Handler handler = this.f1173e;
                if (handler != null) {
                    handler.removeCallbacks(this.f1178j);
                }
                this.f1173e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f1175g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f1174f = null;
                this.f1175g = null;
            }
        }

        public void c() {
            synchronized (this.f1172d) {
                if (this.f1176h != null) {
                    if (this.f1174f == null) {
                        ThreadPoolExecutor a2 = b.a("emojiCompat");
                        this.f1175g = a2;
                        this.f1174f = a2;
                    }
                    this.f1174f.execute(new k(this, 0));
                }
            }
        }

        public final l d() {
            try {
                a aVar = this.f1171c;
                Context context = this.f1169a;
                e eVar = this.f1170b;
                Objects.requireNonNull(aVar);
                k a2 = d0.d.a(context, eVar, (CancellationSignal) null);
                if (a2.f2864a == 0) {
                    l[] lVarArr = a2.f2865b;
                    if (lVarArr != null && lVarArr.length != 0) {
                        return lVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                StringBuilder a3 = androidx.activity.result.a.a("fetchFonts failed (");
                a3.append(a2.f2864a);
                a3.append(")");
                throw new RuntimeException(a3.toString());
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("provider not found", e2);
            }
        }
    }

    public j(Context context, e eVar) {
        super(new b(context, eVar, f1168d));
    }
}
