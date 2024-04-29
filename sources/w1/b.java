package w1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.a;

public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f4246a;

    public b(a aVar) {
        this.f4246a = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4246a.f4254a.setEndIconVisible(false);
    }
}
