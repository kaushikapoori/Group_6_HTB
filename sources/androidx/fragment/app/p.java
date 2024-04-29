package androidx.fragment.app;

import a.b;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.z;

public class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f1430a;

    public p(q qVar) {
        this.f1430a = qVar;
    }

    public void a(Context context) {
        y<?> yVar = this.f1430a.f1443i.f1500a;
        yVar.f1534e.b(yVar, yVar, (n) null);
        Bundle a2 = this.f1430a.f43e.f2016b.a("android:support:fragments");
        if (a2 != null) {
            Parcelable parcelable = a2.getParcelable("android:support:fragments");
            y<?> yVar2 = this.f1430a.f1443i.f1500a;
            if (yVar2 instanceof z) {
                yVar2.f1534e.Y(parcelable);
                return;
            }
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
    }
}
