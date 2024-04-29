package r1;

import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import c.b;

public class f {
    public static Typeface a(Configuration configuration, Typeface typeface) {
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (i2 = configuration.fontWeightAdjustment) == Integer.MAX_VALUE || i2 == 0) {
            return null;
        }
        return Typeface.create(typeface, b.b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }
}
