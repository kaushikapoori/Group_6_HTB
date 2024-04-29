package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public class c extends y {

    public class a extends j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f4037a;

        public a(c cVar, View view) {
            this.f4037a = view;
        }

        public void d(g gVar) {
            View view = this.f4037a;
            w wVar = q.f4098a;
            wVar.e(view, 1.0f);
            wVar.a(this.f4037a);
            gVar.v(this);
        }
    }

    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f4038a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4039b = false;

        public b(View view) {
            this.f4038a = view;
        }

        public void onAnimationEnd(Animator animator) {
            q.f4098a.e(this.f4038a, 1.0f);
            if (this.f4039b) {
                this.f4038a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f4038a;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (u.d.h(view) && this.f4038a.getLayerType() == 0) {
                this.f4039b = true;
                this.f4038a.setLayerType(2, (Paint) null);
            }
        }
    }

    public c() {
    }

    public c(int i2) {
        if ((i2 & -4) == 0) {
            this.f4114y = i2;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public Animator J(ViewGroup viewGroup, View view, o oVar, o oVar2) {
        q.f4098a.c(view);
        Float f2 = (Float) oVar.f4094a.get("android:fade:transitionAlpha");
        return K(view, f2 != null ? f2.floatValue() : 1.0f, 0.0f);
    }

    public final Animator K(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        q.f4098a.e(view, f2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, q.f4099b, new float[]{f3});
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    public void g(o oVar) {
        H(oVar);
        oVar.f4094a.put("android:fade:transitionAlpha", Float.valueOf(q.a(oVar.f4095b)));
    }
}
