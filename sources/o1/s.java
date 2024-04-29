package o1;

import android.graphics.PorterDuff;
import android.view.View;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public class s {

    public interface a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3603a;

        /* renamed from: b  reason: collision with root package name */
        public int f3604b;

        /* renamed from: c  reason: collision with root package name */
        public int f3605c;

        /* renamed from: d  reason: collision with root package name */
        public int f3606d;

        public b(int i2, int i3, int i4, int i5) {
            this.f3603a = i2;
            this.f3604b = i3;
            this.f3605c = i4;
            this.f3606d = i5;
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        return u.e.d(view) == 1;
    }

    public static PorterDuff.Mode b(int i2, PorterDuff.Mode mode) {
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
