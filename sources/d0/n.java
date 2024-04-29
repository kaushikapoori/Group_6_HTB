package d0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public class n implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public String f2871a;

    /* renamed from: b  reason: collision with root package name */
    public int f2872b;

    public static class a extends Thread {

        /* renamed from: b  reason: collision with root package name */
        public final int f2873b;

        public a(Runnable runnable, String str, int i2) {
            super(runnable, str);
            this.f2873b = i2;
        }

        public void run() {
            Process.setThreadPriority(this.f2873b);
            super.run();
        }
    }

    public n(String str, int i2) {
        this.f2871a = str;
        this.f2872b = i2;
    }

    public Thread newThread(Runnable runnable) {
        return new a(runnable, this.f2871a, this.f2872b);
    }
}
