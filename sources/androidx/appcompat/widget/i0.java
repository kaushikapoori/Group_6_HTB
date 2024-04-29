package androidx.appcompat.widget;

import a0.c;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build;
import f.d;

public class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f647a = {16842912};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f648b = new int[0];

    static {
        new Rect();
    }

    public static boolean a(Drawable drawable) {
        Drawable drawable2;
        if (drawable instanceof DrawableContainer) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (!(constantState instanceof DrawableContainer.DrawableContainerState)) {
                return true;
            }
            for (Drawable a2 : ((DrawableContainer.DrawableContainerState) constantState).getChildren()) {
                if (!a(a2)) {
                    return false;
                }
            }
            return true;
        }
        if (drawable instanceof c) {
            drawable2 = ((c) drawable).a();
        } else if (drawable instanceof d) {
            return a(((d) drawable).f2980b);
        } else {
            if (!(drawable instanceof ScaleDrawable)) {
                return true;
            }
            drawable2 = ((ScaleDrawable) drawable).getDrawable();
        }
        return a(drawable2);
    }

    public static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i2 = Build.VERSION.SDK_INT;
        if ((i2 == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) || (i2 >= 29 && i2 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name))) {
            c(drawable);
        }
    }

    public static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f647a);
        } else {
            drawable.setState(f648b);
        }
        drawable.setState(state);
    }

    public static PorterDuff.Mode d(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
