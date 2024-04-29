package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f2022a;

    public c(BottomAppBar bottomAppBar) {
        this.f2022a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.x(this.f2022a);
        Objects.requireNonNull(this.f2022a);
        this.f2022a.S = null;
    }

    public void onAnimationStart(Animator animator) {
        this.f2022a.W++;
    }
}
