package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.z f1886a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1887b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1888c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l f1889d;

    public g(l lVar, RecyclerView.z zVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1889d = lVar;
        this.f1886a = zVar;
        this.f1887b = viewPropertyAnimator;
        this.f1888c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1887b.setListener((Animator.AnimatorListener) null);
        this.f1888c.setAlpha(1.0f);
        this.f1889d.c(this.f1886a);
        this.f1889d.f1918q.remove(this.f1886a);
        this.f1889d.k();
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f1889d);
    }
}
