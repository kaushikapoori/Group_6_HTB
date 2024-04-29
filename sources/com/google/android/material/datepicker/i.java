package com.google.android.material.datepicker;

import android.view.View;
import com.example.supermarket.R;
import g0.a;
import h0.d;

public class i extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f2352d;

    public i(g gVar) {
        this.f2352d = gVar;
    }

    public void d(View view, d dVar) {
        g gVar;
        int i2;
        this.f2994a.onInitializeAccessibilityNodeInfo(view, dVar.f3160a);
        if (this.f2352d.f2345d0.getVisibility() == 0) {
            gVar = this.f2352d;
            i2 = R.string.mtrl_picker_toggle_to_year_selection;
        } else {
            gVar = this.f2352d;
            i2 = R.string.mtrl_picker_toggle_to_day_selection;
        }
        dVar.k(gVar.A(i2));
    }
}
