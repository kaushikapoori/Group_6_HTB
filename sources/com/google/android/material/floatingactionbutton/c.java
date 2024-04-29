package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f2435a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.g f2436b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f2437c;

    public c(d dVar, boolean z2, d.g gVar) {
        this.f2437c = dVar;
        this.f2435a = z2;
        this.f2436b = gVar;
    }

    public void onAnimationEnd(Animator animator) {
        d dVar = this.f2437c;
        dVar.f2453n = 0;
        dVar.f2447h = null;
        d.g gVar = this.f2436b;
        if (gVar != null) {
            a aVar = (a) gVar;
            aVar.f2429a.b(aVar.f2430b);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f2437c.f2457r.b(0, this.f2435a);
        d dVar = this.f2437c;
        dVar.f2453n = 2;
        dVar.f2447h = animator;
    }
}
