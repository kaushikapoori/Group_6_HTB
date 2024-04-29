package androidx.fragment.app;

import android.view.View;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

public class u0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1495b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f1496c;

    public u0(s0 s0Var, ArrayList arrayList, Map map) {
        this.f1495b = arrayList;
        this.f1496c = map;
    }

    public void run() {
        int size = this.f1495b.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f1495b.get(i2);
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.i.v(view, (String) this.f1496c.get(u.i.k(view)));
        }
    }
}
