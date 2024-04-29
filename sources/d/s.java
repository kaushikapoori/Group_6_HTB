package d;

import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static Field f2784a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f2785b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f2786c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f2787d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f2788e;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f2789f;

    /* renamed from: g  reason: collision with root package name */
    public static Field f2790g;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f2791h;

    public static void a(Object obj) {
        if (!f2787d) {
            try {
                f2786c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e2) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e2);
            }
            f2787d = true;
        }
        Class<?> cls = f2786c;
        if (cls != null) {
            if (!f2789f) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f2788e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e3);
                }
                f2789f = true;
            }
            Field field = f2788e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e4);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
