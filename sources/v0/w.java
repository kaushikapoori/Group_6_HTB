package v0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class w {

    /* renamed from: a  reason: collision with root package name */
    public static Method f4105a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f4106b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f4107c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f4108d;

    public void a(View view) {
        throw null;
    }

    public float b(View view) {
        throw null;
    }

    public void c(View view) {
        throw null;
    }

    public void d(View view, int i2, int i3, int i4, int i5) {
        if (!f4106b) {
            Class<View> cls = View.class;
            try {
                Class cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("setFrame", new Class[]{cls2, cls2, cls2, cls2});
                f4105a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e2);
            }
            f4106b = true;
        }
        Method method = f4105a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    public void e(View view, float f2) {
        throw null;
    }

    public void f(View view, int i2) {
        if (!f4108d) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f4107c = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f4108d = true;
        }
        Field field = f4107c;
        if (field != null) {
            try {
                f4107c.setInt(view, i2 | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void g(View view, Matrix matrix) {
        throw null;
    }

    public void h(View view, Matrix matrix) {
        throw null;
    }
}
