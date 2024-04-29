package w1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.b;

public class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f4250a;

    public h(b bVar) {
        this.f4250a = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        b bVar = this.f4250a;
        bVar.f4256c.setChecked(bVar.f2596m);
        this.f4250a.f2602s.start();
    }
}
