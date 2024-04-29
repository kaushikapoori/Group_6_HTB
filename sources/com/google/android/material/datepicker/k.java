package com.google.android.material.datepicker;

import android.view.View;

public class k implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f2356b;

    public k(g gVar) {
        this.f2356b = gVar;
    }

    public void onClick(View view) {
        g gVar = this.f2356b;
        int i2 = gVar.Y;
        if (i2 == 2) {
            gVar.i0(1);
        } else if (i2 == 1) {
            gVar.i0(2);
        }
    }
}
