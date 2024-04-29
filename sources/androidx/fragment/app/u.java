package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.n;
import com.example.supermarket.R;
import g0.p;

public class u {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f1488a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f1489b;

        public a(Animator animator) {
            this.f1488a = null;
            this.f1489b = animator;
        }

        public a(Animation animation) {
            this.f1488a = animation;
            this.f1489b = null;
        }
    }

    public static class b extends AnimationSet implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final ViewGroup f1490b;

        /* renamed from: c  reason: collision with root package name */
        public final View f1491c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1492d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1493e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1494f = true;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1490b = viewGroup;
            this.f1491c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j2, Transformation transformation) {
            this.f1494f = true;
            if (this.f1492d) {
                return !this.f1493e;
            }
            if (!super.getTransformation(j2, transformation)) {
                this.f1492d = true;
                p.a(this.f1490b, this);
            }
            return true;
        }

        public boolean getTransformation(long j2, Transformation transformation, float f2) {
            this.f1494f = true;
            if (this.f1492d) {
                return !this.f1493e;
            }
            if (!super.getTransformation(j2, transformation, f2)) {
                this.f1492d = true;
                p.a(this.f1490b, this);
            }
            return true;
        }

        public void run() {
            if (this.f1492d || !this.f1494f) {
                this.f1490b.endViewTransition(this.f1491c);
                this.f1493e = true;
                return;
            }
            this.f1494f = false;
            this.f1490b.post(this);
        }
    }

    public static a a(Context context, n nVar, boolean z2, boolean z3) {
        n.b bVar = nVar.I;
        boolean z4 = false;
        int i2 = bVar == null ? 0 : bVar.f1404h;
        int t2 = z3 ? z2 ? nVar.t() : nVar.u() : z2 ? nVar.k() : nVar.n();
        nVar.X(0, 0, 0, 0);
        ViewGroup viewGroup = nVar.E;
        if (!(viewGroup == null || viewGroup.getTag(R.id.visible_removing_fragment_view_tag) == null)) {
            nVar.E.setTag(R.id.visible_removing_fragment_view_tag, (Object) null);
        }
        ViewGroup viewGroup2 = nVar.E;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        if (t2 == 0 && i2 != 0) {
            t2 = i2 != 4097 ? i2 != 4099 ? i2 != 8194 ? -1 : z2 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z2 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z2 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
        }
        if (t2 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(t2));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, t2);
                    if (loadAnimation != null) {
                        return new a(loadAnimation);
                    }
                    z4 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z4) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, t2);
                    if (loadAnimator != null) {
                        return new a(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, t2);
                        if (loadAnimation2 != null) {
                            return new a(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        return null;
    }
}
