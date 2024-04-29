package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;

class Fragment$5 implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f1191a;

    public Fragment$5(n nVar) {
        this.f1191a = nVar;
    }

    public void g(k kVar, g.b bVar) {
        View view;
        if (bVar == g.b.ON_STOP && (view = this.f1191a.F) != null) {
            view.cancelPendingInputEvents();
        }
    }
}
