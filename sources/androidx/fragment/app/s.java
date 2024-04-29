package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.b0;
import androidx.fragment.app.q0;
import c0.b;

public class s implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1471a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f1472b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q0.a f1473c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ b f1474d;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            if (s.this.f1472b.h() != null) {
                s.this.f1472b.W((View) null);
                s sVar = s.this;
                ((b0.d) sVar.f1473c).a(sVar.f1472b, sVar.f1474d);
            }
        }
    }

    public s(ViewGroup viewGroup, n nVar, q0.a aVar, b bVar) {
        this.f1471a = viewGroup;
        this.f1472b = nVar;
        this.f1473c = aVar;
        this.f1474d = bVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.f1471a.post(new a());
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
