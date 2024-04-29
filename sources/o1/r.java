package o1;

import android.view.View;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public class r implements View.OnAttachStateChangeListener {
    public void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.h.c(view);
    }

    public void onViewDetachedFromWindow(View view) {
    }
}
