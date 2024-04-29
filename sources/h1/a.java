package h1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f3179a;

    public a(d dVar) {
        this.f3179a = dVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f3179a.a();
    }

    public void onAnimationStart(Animator animator) {
        this.f3179a.b();
    }
}
