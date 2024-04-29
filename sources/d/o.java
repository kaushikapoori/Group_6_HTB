package d;

import android.view.View;
import g0.u;
import g0.x;
import g0.y;
import g0.z;
import java.util.WeakHashMap;

public class o extends z {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f2766a;

    public o(k kVar) {
        this.f2766a = kVar;
    }

    public void a(View view) {
        this.f2766a.f2720p.setAlpha(1.0f);
        this.f2766a.f2723s.d((y) null);
        this.f2766a.f2723s = null;
    }

    public void b(View view) {
        this.f2766a.f2720p.setVisibility(0);
        if (this.f2766a.f2720p.getParent() instanceof View) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.h.c((View) this.f2766a.f2720p.getParent());
        }
    }
}
