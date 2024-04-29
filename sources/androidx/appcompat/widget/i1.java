package androidx.appcompat.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import g0.u;
import g0.x;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class i1 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f649a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            f649a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f649a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f649a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{rect, rect2});
            } catch (Exception e2) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
            }
        }
    }

    public static boolean b(View view) {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        return u.e.d(view) == 1;
    }
}
