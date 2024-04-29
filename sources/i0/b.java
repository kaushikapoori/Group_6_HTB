package i0;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import i0.f;

public class b extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f3220a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(InputConnection inputConnection, boolean z2, e eVar) {
        super(inputConnection, z2);
        this.f3220a = eVar;
    }

    public boolean commitContent(InputContentInfo inputContentInfo, int i2, Bundle bundle) {
        e eVar = this.f3220a;
        f fVar = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            fVar = new f(new f.a(inputContentInfo));
        }
        if (((d) eVar).a(fVar, i2, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i2, bundle);
    }
}
