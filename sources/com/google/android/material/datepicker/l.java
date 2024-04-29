package com.google.android.material.datepicker;

import android.view.View;

public class l implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f2357b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f2358c;

    public l(g gVar, w wVar) {
        this.f2358c = gVar;
        this.f2357b = wVar;
    }

    public void onClick(View view) {
        int U0 = this.f2358c.f0().U0() + 1;
        if (U0 < this.f2358c.f2343b0.getAdapter().a()) {
            this.f2358c.h0(this.f2357b.e(U0));
        }
    }
}
