package androidx.fragment.app;

import android.animation.Animator;
import android.view.View;
import c0.b;

public class r implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n f1458a;

    public r(n nVar) {
        this.f1458a = nVar;
    }

    public void a() {
        if (this.f1458a.h() != null) {
            View h2 = this.f1458a.h();
            this.f1458a.W((View) null);
            h2.clearAnimation();
        }
        this.f1458a.Y((Animator) null);
    }
}
