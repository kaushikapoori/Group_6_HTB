package a0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Method f2a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f3b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f4c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f5d;

    public static void a(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        Drawable a2;
        int i2 = Build.VERSION.SDK_INT;
        drawable.clearColorFilter();
        if (i2 < 23) {
            if (drawable instanceof InsetDrawable) {
                a2 = ((InsetDrawable) drawable).getDrawable();
            } else if (drawable instanceof c) {
                a2 = ((c) drawable).a();
            } else if ((drawable instanceof DrawableContainer) && (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) != null) {
                int childCount = drawableContainerState.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    Drawable child = drawableContainerState.getChild(i3);
                    if (child != null) {
                        a(child);
                    }
                }
                return;
            } else {
                return;
            }
            a(a2);
        }
    }

    public static int b(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.getLayoutDirection();
        }
        if (!f5d) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f4c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e2);
            }
            f5d = true;
        }
        Method method = f4c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e3);
                f4c = null;
            }
        }
        return 0;
    }

    public static boolean c(Drawable drawable, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return drawable.setLayoutDirection(i2);
        }
        if (!f3b) {
            Class<Drawable> cls = Drawable.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f2a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e2);
            }
            f3b = true;
        }
        Method method = f2a;
        if (method != null) {
            try {
                method.invoke(drawable, new Object[]{Integer.valueOf(i2)});
                return true;
            } catch (Exception e3) {
                Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e3);
                f2a = null;
            }
        }
        return false;
    }

    public static void d(Drawable drawable, int i2) {
        drawable.setTint(i2);
    }

    public static void e(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void f(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static Drawable g(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof b)) ? new e(drawable) : drawable;
    }
}
