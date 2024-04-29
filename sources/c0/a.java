package c0;

import android.os.Build;

public class a {
    public static boolean a() {
        if (Build.VERSION.SDK_INT < 31) {
            String str = Build.VERSION.CODENAME;
            return !"REL".equals(str) && str.compareTo("S") >= 0;
        }
    }
}
