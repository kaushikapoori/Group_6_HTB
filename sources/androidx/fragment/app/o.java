package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.g;
import androidx.savedstate.a;

public class o implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f1422a;

    public o(q qVar) {
        this.f1422a = qVar;
    }

    public Bundle a() {
        Bundle bundle = new Bundle();
        do {
        } while (q.n(this.f1422a.f1443i.f1500a.f1534e, g.c.CREATED));
        this.f1422a.f1444j.d(g.b.ON_STOP);
        Parcelable Z = this.f1422a.f1443i.f1500a.f1534e.Z();
        if (Z != null) {
            bundle.putParcelable("android:support:fragments", Z);
        }
        return bundle;
    }
}
