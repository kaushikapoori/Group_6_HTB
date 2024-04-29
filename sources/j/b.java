package j;

import android.os.Looper;
import androidx.activity.result.d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class b extends d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3230a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f3231b = Executors.newFixedThreadPool(4, new a(this));

    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f3232a = new AtomicInteger(0);

        public a(b bVar) {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", new Object[]{Integer.valueOf(this.f3232a.getAndIncrement())}));
            return thread;
        }
    }

    public b() {
        super(1);
    }

    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
