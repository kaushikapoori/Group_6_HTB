package com.google.android.material.datepicker;

import android.view.View;

public class c0 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2332b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d0 f2333c;

    public c0(d0 d0Var, int i2) {
        this.f2333c = d0Var;
        this.f2332b = i2;
    }

    public void onClick(View view) {
        t k2 = t.k(this.f2332b, this.f2333c.f2334c.X.f2388c);
        a aVar = this.f2333c.f2334c.W;
        if (k2.compareTo(aVar.f2302b) < 0) {
            k2 = aVar.f2302b;
        } else if (k2.compareTo(aVar.f2303c) > 0) {
            k2 = aVar.f2303c;
        }
        this.f2333c.f2334c.h0(k2);
        this.f2333c.f2334c.i0(1);
    }
}
