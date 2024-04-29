package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.appcompat.widget.a0;
import i.f;

public class z extends l0 {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ a0.d f828k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ a0 f829l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, View view, a0.d dVar) {
        super(view);
        this.f829l = a0Var;
        this.f828k = dVar;
    }

    public f b() {
        return this.f828k;
    }

    @SuppressLint({"SyntheticAccessor"})
    public boolean c() {
        if (this.f829l.getInternalPopup().a()) {
            return true;
        }
        this.f829l.b();
        return true;
    }
}
