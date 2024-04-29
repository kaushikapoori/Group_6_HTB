package w;

import android.util.Log;
import java.lang.reflect.Method;

public class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f4148b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f4149c;

    public d(Object obj, Object obj2) {
        this.f4148b = obj;
        this.f4149c = obj2;
    }

    public void run() {
        try {
            Method method = c.f4134d;
            if (method != null) {
                method.invoke(this.f4148b, new Object[]{this.f4149c, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            c.f4135e.invoke(this.f4148b, new Object[]{this.f4149c, Boolean.FALSE});
        } catch (RuntimeException e2) {
            if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                throw e2;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
