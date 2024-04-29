package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.x0;

public class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1268a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1269b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1270c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x0.d f1271d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ c.b f1272e;

    public d(c cVar, ViewGroup viewGroup, View view, boolean z2, x0.d dVar, c.b bVar) {
        this.f1268a = viewGroup;
        this.f1269b = view;
        this.f1270c = z2;
        this.f1271d = dVar;
        this.f1272e = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1268a.endViewTransition(this.f1269b);
        if (this.f1270c) {
            this.f1271d.f1514a.a(this.f1269b);
        }
        this.f1272e.a();
    }
}
