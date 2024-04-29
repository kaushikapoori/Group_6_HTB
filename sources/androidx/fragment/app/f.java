package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.c;

public class f implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1289a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1290b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.b f1291c;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            f fVar = f.this;
            fVar.f1289a.endViewTransition(fVar.f1290b);
            f.this.f1291c.a();
        }
    }

    public f(c cVar, ViewGroup viewGroup, View view, c.b bVar) {
        this.f1289a = viewGroup;
        this.f1290b = view;
        this.f1291c = bVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.f1289a.post(new a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
