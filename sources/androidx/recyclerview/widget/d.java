package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class d implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1874b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f1875c;

    public d(l lVar, ArrayList arrayList) {
        this.f1875c = lVar;
        this.f1874b = arrayList;
    }

    public void run() {
        Iterator it = this.f1874b.iterator();
        while (it.hasNext()) {
            l.b bVar = (l.b) it.next();
            l lVar = this.f1875c;
            RecyclerView.z zVar = bVar.f1926a;
            int i2 = bVar.f1927b;
            int i3 = bVar.f1928c;
            int i4 = bVar.f1929d;
            int i5 = bVar.f1930e;
            Objects.requireNonNull(lVar);
            View view = zVar.f1788a;
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (i6 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i7 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            lVar.f1917p.add(zVar);
            animate.setDuration(lVar.f1705e).setListener(new i(lVar, zVar, i6, view, i7, animate)).start();
        }
        this.f1874b.clear();
        this.f1875c.f1914m.remove(this.f1874b);
    }
}
