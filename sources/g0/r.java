package g0;

import android.view.View;
import g0.u;

public class r extends u.b<Boolean> {
    public r(int i2, Class cls, int i3) {
        super(i2, cls, i3);
    }

    public Object b(View view) {
        return Boolean.valueOf(u.l.d(view));
    }

    public void c(View view, Object obj) {
        u.l.i(view, ((Boolean) obj).booleanValue());
    }

    public boolean f(Object obj, Object obj2) {
        return !a((Boolean) obj, (Boolean) obj2);
    }
}
