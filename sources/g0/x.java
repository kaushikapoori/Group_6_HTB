package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import d.v;
import java.lang.ref.WeakReference;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f3085a;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ y f3086a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3087b;

        public a(x xVar, y yVar, View view) {
            this.f3086a = yVar;
            this.f3087b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f3086a.c(this.f3087b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f3086a.a(this.f3087b);
        }

        public void onAnimationStart(Animator animator) {
            this.f3086a.b(this.f3087b);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a0 f3088a;

        public b(x xVar, a0 a0Var, View view) {
            this.f3088a = a0Var;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) v.this.f2806d.getParent()).invalidate();
        }
    }

    public x(View view) {
        this.f3085a = new WeakReference<>(view);
    }

    public x a(float f2) {
        View view = (View) this.f3085a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = (View) this.f3085a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public x c(long j2) {
        View view = (View) this.f3085a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public x d(y yVar) {
        View view = (View) this.f3085a.get();
        if (view != null) {
            e(view, yVar);
        }
        return this;
    }

    public final void e(View view, y yVar) {
        if (yVar != null) {
            view.animate().setListener(new a(this, yVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public x f(a0 a0Var) {
        View view = (View) this.f3085a.get();
        if (view != null) {
            b bVar = null;
            if (a0Var != null) {
                bVar = new b(this, a0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public x g(float f2) {
        View view = (View) this.f3085a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
