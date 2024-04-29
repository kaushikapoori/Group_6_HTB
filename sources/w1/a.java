package w1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.a f4245a;

    public a(com.google.android.material.textfield.a aVar) {
        this.f4245a = aVar;
    }

    public void onAnimationStart(Animator animator) {
        this.f4245a.f4254a.setEndIconVisible(true);
    }
}
