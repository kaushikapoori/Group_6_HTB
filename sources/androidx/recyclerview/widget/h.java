package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.z f1890a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1891b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1892c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l f1893d;

    public h(l lVar, RecyclerView.z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1893d = lVar;
        this.f1890a = zVar;
        this.f1891b = view;
        this.f1892c = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.f1891b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.f1892c.setListener((Animator.AnimatorListener) null);
        this.f1893d.c(this.f1890a);
        this.f1893d.f1916o.remove(this.f1890a);
        this.f1893d.k();
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f1893d);
    }
}
