package com.google.android.material.datepicker;

import android.view.View;

public class q implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f2385b;

    public q(o oVar) {
        this.f2385b = oVar;
    }

    public void onClick(View view) {
        o oVar = this.f2385b;
        oVar.C0.setEnabled(oVar.h0().b());
        this.f2385b.A0.toggle();
        o oVar2 = this.f2385b;
        oVar2.n0(oVar2.A0);
        this.f2385b.l0();
    }
}
