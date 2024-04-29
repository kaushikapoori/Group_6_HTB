package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import m.a;

public class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f4077a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f4078b;

    public h(g gVar, a aVar) {
        this.f4078b = gVar;
        this.f4077a = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4077a.remove(animator);
        this.f4078b.f4064n.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.f4078b.f4064n.add(animator);
    }
}
