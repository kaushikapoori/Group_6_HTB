package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import java.util.Objects;

public class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l.a f1900a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1901b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1902c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l f1903d;

    public j(l lVar, l.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1903d = lVar;
        this.f1900a = aVar;
        this.f1901b = viewPropertyAnimator;
        this.f1902c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1901b.setListener((Animator.AnimatorListener) null);
        this.f1902c.setAlpha(1.0f);
        this.f1902c.setTranslationX(0.0f);
        this.f1902c.setTranslationY(0.0f);
        this.f1903d.c(this.f1900a.f1920a);
        this.f1903d.f1919r.remove(this.f1900a.f1920a);
        this.f1903d.k();
    }

    public void onAnimationStart(Animator animator) {
        l lVar = this.f1903d;
        RecyclerView.z zVar = this.f1900a.f1920a;
        Objects.requireNonNull(lVar);
    }
}
