package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f4079a;

    public i(g gVar) {
        this.f4079a = gVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4079a.m();
        animator.removeListener(this);
    }
}
