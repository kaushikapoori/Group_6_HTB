package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

public class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f2018a;

    public a(BottomAppBar bottomAppBar) {
        this.f2018a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.x(this.f2018a);
        this.f2018a.R = null;
    }

    public void onAnimationStart(Animator animator) {
        this.f2018a.W++;
    }
}
