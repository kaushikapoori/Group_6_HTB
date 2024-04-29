package z0;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

public class d extends Property<Drawable, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final Property<Drawable, Integer> f4426a = new d();

    public d() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    public Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    public void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
