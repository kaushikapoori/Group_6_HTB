package v0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final w f4098a;

    /* renamed from: b  reason: collision with root package name */
    public static final Property<View, Float> f4099b = new a(Float.class, "translationAlpha");

    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(q.a((View) obj));
        }

        public void set(Object obj, Object obj2) {
            float floatValue = ((Float) obj2).floatValue();
            q.f4098a.e((View) obj, floatValue);
        }
    }

    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            return u.f.a((View) obj);
        }

        public void set(Object obj, Object obj2) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.f.c((View) obj, (Rect) obj2);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f4098a = i2 >= 29 ? new v() : i2 >= 23 ? new u() : i2 >= 22 ? new t() : new s();
        new b(Rect.class, "clipBounds");
    }

    public static float a(View view) {
        return f4098a.b(view);
    }

    public static void b(View view, int i2, int i3, int i4, int i5) {
        f4098a.d(view, i2, i3, i4, i5);
    }
}
