package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

public class j extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f2353a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f2354b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f2355c;

    public j(g gVar, w wVar, MaterialButton materialButton) {
        this.f2355c = gVar;
        this.f2353a = wVar;
        this.f2354b = materialButton;
    }

    public void a(RecyclerView recyclerView, int i2) {
        if (i2 == 0) {
            recyclerView.announceForAccessibility(this.f2354b.getText());
        }
    }

    public void b(RecyclerView recyclerView, int i2, int i3) {
        LinearLayoutManager f02 = this.f2355c.f0();
        int U0 = i2 < 0 ? f02.U0() : f02.W0();
        this.f2355c.X = this.f2353a.e(U0);
        this.f2354b.setText(this.f2353a.f2402c.f2302b.o(U0).n());
    }
}
