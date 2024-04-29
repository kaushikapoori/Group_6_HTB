package com.google.android.material.datepicker;

import android.view.View;

public class m implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f2359b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f2360c;

    public m(g gVar, w wVar) {
        this.f2360c = gVar;
        this.f2359b = wVar;
    }

    public void onClick(View view) {
        int W0 = this.f2360c.f0().W0() - 1;
        if (W0 >= 0) {
            this.f2360c.h0(this.f2359b.e(W0));
        }
    }
}
