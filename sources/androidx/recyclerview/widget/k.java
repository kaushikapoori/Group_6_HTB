package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import java.util.Objects;

public class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l.a f1904a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1905b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1906c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ l f1907d;

    public k(l lVar, l.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1907d = lVar;
        this.f1904a = aVar;
        this.f1905b = viewPropertyAnimator;
        this.f1906c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1905b.setListener((Animator.AnimatorListener) null);
        this.f1906c.setAlpha(1.0f);
        this.f1906c.setTranslationX(0.0f);
        this.f1906c.setTranslationY(0.0f);
        this.f1907d.c(this.f1904a.f1921b);
        this.f1907d.f1919r.remove(this.f1904a.f1921b);
        this.f1907d.k();
    }

    public void onAnimationStart(Animator animator) {
        l lVar = this.f1907d;
        RecyclerView.z zVar = this.f1904a.f1921b;
        Objects.requireNonNull(lVar);
    }
}
