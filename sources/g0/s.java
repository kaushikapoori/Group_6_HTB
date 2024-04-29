package g0;

import android.text.TextUtils;
import android.view.View;
import g0.u;

public class s extends u.b<CharSequence> {
    public s(int i2, Class cls, int i3, int i4) {
        super(i2, cls, i3, i4);
    }

    public Object b(View view) {
        return u.l.b(view);
    }

    public void c(View view, Object obj) {
        u.l.h(view, (CharSequence) obj);
    }

    public boolean f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
