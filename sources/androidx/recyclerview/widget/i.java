package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.z f1894a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1895b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1896c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f1897d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f1898e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ l f1899f;

    public i(l lVar, RecyclerView.z zVar, int i2, View view, int i3, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1899f = lVar;
        this.f1894a = zVar;
        this.f1895b = i2;
        this.f1896c = view;
        this.f1897d = i3;
        this.f1898e = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.f1895b != 0) {
            this.f1896c.setTranslationX(0.0f);
        }
        if (this.f1897d != 0) {
            this.f1896c.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.f1898e.setListener((Animator.AnimatorListener) null);
        this.f1899f.c(this.f1894a);
        this.f1899f.f1917p.remove(this.f1894a);
        this.f1899f.k();
    }

    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f1899f);
    }
}
