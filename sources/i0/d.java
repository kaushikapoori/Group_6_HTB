package i0;

import android.content.ClipData;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import g0.c;
import g0.u;

public class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f3222a;

    public d(View view) {
        this.f3222a = view;
    }

    public boolean a(f fVar, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
            try {
                fVar.f3223a.b();
                InputContentInfo inputContentInfo = (InputContentInfo) fVar.f3223a.d();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        ClipData clipData = new ClipData(fVar.f3223a.a(), new ClipData.Item(fVar.f3223a.e()));
        c.b aVar = Build.VERSION.SDK_INT >= 31 ? new c.a(clipData, 2) : new c.C0032c(clipData, 2);
        aVar.b(fVar.f3223a.c());
        aVar.a(bundle);
        if (u.q(this.f3222a, aVar.c()) == null) {
            return true;
        }
        return false;
    }
}
