package com.google.android.material.datepicker;

import android.view.View;
import g0.b0;
import g0.m;

public class p implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2382a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2383b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2384c;

    public p(o oVar, int i2, View view, int i3) {
        this.f2382a = i2;
        this.f2383b = view;
        this.f2384c = i3;
    }

    public b0 a(View view, b0 b0Var) {
        int i2 = b0Var.a(7).f4393b;
        if (this.f2382a >= 0) {
            this.f2383b.getLayoutParams().height = this.f2382a + i2;
            View view2 = this.f2383b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f2383b;
        view3.setPadding(view3.getPaddingLeft(), this.f2384c + i2, this.f2383b.getPaddingRight(), this.f2383b.getPaddingBottom());
        return b0Var;
    }
}
