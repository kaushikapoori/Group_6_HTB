package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class f implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1884b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f1885c;

    public f(l lVar, ArrayList arrayList) {
        this.f1885c = lVar;
        this.f1884b = arrayList;
    }

    public void run() {
        Iterator it = this.f1884b.iterator();
        while (it.hasNext()) {
            RecyclerView.z zVar = (RecyclerView.z) it.next();
            l lVar = this.f1885c;
            Objects.requireNonNull(lVar);
            View view = zVar.f1788a;
            ViewPropertyAnimator animate = view.animate();
            lVar.f1916o.add(zVar);
            animate.alpha(1.0f).setDuration(lVar.f1703c).setListener(new h(lVar, zVar, view, animate)).start();
        }
        this.f1884b.clear();
        this.f1885c.f1913l.remove(this.f1884b);
    }
}
