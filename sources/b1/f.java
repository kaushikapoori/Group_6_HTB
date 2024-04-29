package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

public class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f2032a;

    public f(BottomAppBar bottomAppBar) {
        this.f2032a = bottomAppBar;
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2032a);
        throw null;
    }
}
