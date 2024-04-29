package androidx.savedstate;

import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;

class SavedStateRegistry$1 implements i {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f2009a;

    public SavedStateRegistry$1(a aVar) {
        this.f2009a = aVar;
    }

    public void g(k kVar, g.b bVar) {
        a aVar;
        boolean z2;
        if (bVar == g.b.ON_START) {
            aVar = this.f2009a;
            z2 = true;
        } else if (bVar == g.b.ON_STOP) {
            aVar = this.f2009a;
            z2 = false;
        } else {
            return;
        }
        aVar.f2014e = z2;
    }
}
