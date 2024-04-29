package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1882b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f1883c;

    public e(l lVar, ArrayList arrayList) {
        this.f1883c = lVar;
        this.f1882b = arrayList;
    }

    public void run() {
        Iterator it = this.f1882b.iterator();
        while (it.hasNext()) {
            l.a aVar = (l.a) it.next();
            l lVar = this.f1883c;
            Objects.requireNonNull(lVar);
            RecyclerView.z zVar = aVar.f1920a;
            View view = null;
            View view2 = zVar == null ? null : zVar.f1788a;
            RecyclerView.z zVar2 = aVar.f1921b;
            if (zVar2 != null) {
                view = zVar2.f1788a;
            }
            if (view2 != null) {
                ViewPropertyAnimator duration = view2.animate().setDuration(lVar.f1706f);
                lVar.f1919r.add(aVar.f1920a);
                duration.translationX((float) (aVar.f1924e - aVar.f1922c));
                duration.translationY((float) (aVar.f1925f - aVar.f1923d));
                duration.alpha(0.0f).setListener(new j(lVar, aVar, duration, view2)).start();
            }
            if (view != null) {
                ViewPropertyAnimator animate = view.animate();
                lVar.f1919r.add(aVar.f1921b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(lVar.f1706f).alpha(1.0f).setListener(new k(lVar, aVar, animate, view)).start();
            }
        }
        this.f1882b.clear();
        this.f1883c.f1915n.remove(this.f1882b);
    }
}
