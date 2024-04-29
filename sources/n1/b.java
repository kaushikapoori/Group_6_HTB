package n1;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

public class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f3488b;

    public b(d dVar) {
        this.f3488b = dVar;
    }

    public boolean onPreDraw() {
        d dVar = this.f3488b;
        float rotation = dVar.f2457r.getRotation();
        if (dVar.f2450k == rotation) {
            return true;
        }
        dVar.f2450k = rotation;
        dVar.t();
        return true;
    }
}
