package androidx.fragment.app;

import android.view.View;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class t0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1486b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f1487c;

    public t0(s0 s0Var, ArrayList arrayList, Map map) {
        this.f1486b = arrayList;
        this.f1487c = map;
    }

    public void run() {
        String str;
        int size = this.f1486b.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f1486b.get(i2);
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            String k2 = u.i.k(view);
            if (k2 != null) {
                Iterator it = this.f1487c.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = null;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    if (k2.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                u.i.v(view, str);
            }
        }
    }
}
