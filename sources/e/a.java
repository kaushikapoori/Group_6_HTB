package e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.r0;
import java.util.WeakHashMap;
import y.c;
import y.g;

@SuppressLint({"RestrictedAPI"})
public final class a {
    public static ColorStateList a(Context context, int i2) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        g.a aVar;
        Object obj = x.a.f4298a;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        g.b bVar = new g.b(resources, theme);
        synchronized (g.f4341c) {
            SparseArray sparseArray = g.f4340b.get(bVar);
            colorStateList = null;
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = (g.a) sparseArray.get(i2)) == null)) {
                if (aVar.f4343b.equals(resources.getConfiguration())) {
                    colorStateList2 = aVar.f4342a;
                } else {
                    sparseArray.remove(i2);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 != null) {
            return colorStateList2;
        }
        ThreadLocal<TypedValue> threadLocal = g.f4339a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        boolean z2 = true;
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            z2 = false;
        }
        if (!z2) {
            try {
                colorStateList = c.a(resources, resources.getXml(i2), theme);
            } catch (Exception e2) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e2);
            }
        }
        if (colorStateList != null) {
            synchronized (g.f4341c) {
                WeakHashMap<g.b, SparseArray<g.a>> weakHashMap = g.f4340b;
                SparseArray sparseArray2 = weakHashMap.get(bVar);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(bVar, sparseArray2);
                }
                sparseArray2.append(i2, new g.a(colorStateList, bVar.f4344a.getConfiguration()));
            }
            return colorStateList;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColorStateList(i2, theme);
        } else {
            return resources.getColorStateList(i2);
        }
    }

    public static Drawable b(Context context, int i2) {
        return r0.d().f(context, i2);
    }
}
