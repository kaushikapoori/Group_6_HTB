package u0;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static long f3904a;

    /* renamed from: b  reason: collision with root package name */
    public static Method f3905b;

    @SuppressLint({"NewApi"})
    public static boolean a() {
        try {
            if (f3905b == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f3905b == null) {
                f3904a = Trace.class.getField("TRACE_TAG_APP").getLong((Object) null);
                f3905b = Trace.class.getMethod("isTagEnabled", new Class[]{Long.TYPE});
            }
            return ((Boolean) f3905b.invoke((Object) null, new Object[]{Long.valueOf(f3904a)})).booleanValue();
        } catch (Exception e2) {
            if (e2 instanceof InvocationTargetException) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
            return false;
        }
    }
}
