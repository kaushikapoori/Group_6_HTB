package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2431a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f2432b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.g f2433c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f2434d;

    public b(d dVar, boolean z2, d.g gVar) {
        this.f2434d = dVar;
        this.f2432b = z2;
        this.f2433c = gVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f2431a = true;
    }

    public void onAnimationEnd(Animator animator) {
        d dVar = this.f2434d;
        dVar.f2453n = 0;
        dVar.f2447h = null;
        if (!this.f2431a) {
            FloatingActionButton floatingActionButton = dVar.f2457r;
            boolean z2 = this.f2432b;
            floatingActionButton.b(z2 ? 8 : 4, z2);
            d.g gVar = this.f2433c;
            if (gVar != null) {
                a aVar = (a) gVar;
                aVar.f2429a.a(aVar.f2430b);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f2434d.f2457r.b(0, this.f2432b);
        d dVar = this.f2434d;
        dVar.f2453n = 1;
        dVar.f2447h = animator;
        this.f2431a = false;
    }
}
