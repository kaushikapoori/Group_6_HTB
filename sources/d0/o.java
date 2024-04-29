package d0;

import android.os.Handler;
import java.util.concurrent.Callable;

public class o<T> implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public Callable<T> f2874b;

    /* renamed from: c  reason: collision with root package name */
    public f0.a<T> f2875c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f2876d;

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ f0.a f2877b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f2878c;

        public a(o oVar, f0.a aVar, Object obj) {
            this.f2877b = aVar;
            this.f2878c = obj;
        }

        public void run() {
            this.f2877b.a(this.f2878c);
        }
    }

    public o(Handler handler, Callable<T> callable, f0.a<T> aVar) {
        this.f2874b = callable;
        this.f2875c = aVar;
        this.f2876d = handler;
    }

    public void run() {
        T t2;
        try {
            t2 = this.f2874b.call();
        } catch (Exception unused) {
            t2 = null;
        }
        this.f2876d.post(new a(this, this.f2875c, t2));
    }
}
