package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import androidx.fragment.app.n;
import androidx.fragment.app.q0;
import c0.b;

public class t extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1481a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1482b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f1483c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q0.a f1484d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b f1485e;

    public t(ViewGroup viewGroup, View view, n nVar, q0.a aVar, b bVar) {
        this.f1481a = viewGroup;
        this.f1482b = view;
        this.f1483c = nVar;
        this.f1484d = aVar;
        this.f1485e = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1481a.endViewTransition(this.f1482b);
        n nVar = this.f1483c;
        n.b bVar = nVar.I;
        Animator animator2 = bVar == null ? null : bVar.f1398b;
        nVar.Y((Animator) null);
        if (animator2 != null && this.f1481a.indexOfChild(this.f1482b) < 0) {
            ((b0.d) this.f1484d).a(this.f1483c, this.f1485e);
        }
    }
}
