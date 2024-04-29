package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f0.b;
import java.util.Calendar;

public class h extends RecyclerView.k {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f2349a = b0.e();

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f2350b = b0.e();

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f2351c;

    public h(g gVar) {
        this.f2351c = gVar;
    }

    public void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.w wVar) {
        int i2;
        int i3;
        if ((recyclerView.getAdapter() instanceof d0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            d0 d0Var = (d0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (b next : this.f2351c.V.g()) {
                F f2 = next.f2983a;
                if (!(f2 == null || next.f2984b == null)) {
                    this.f2349a.setTimeInMillis(((Long) f2).longValue());
                    this.f2350b.setTimeInMillis(((Long) next.f2984b).longValue());
                    int e2 = d0Var.e(this.f2349a.get(1));
                    int e3 = d0Var.e(this.f2350b.get(1));
                    View s2 = gridLayoutManager.s(e2);
                    View s3 = gridLayoutManager.s(e3);
                    int i4 = gridLayoutManager.F;
                    int i5 = e2 / i4;
                    int i6 = e3 / i4;
                    for (int i7 = i5; i7 <= i6; i7++) {
                        View s4 = gridLayoutManager.s(gridLayoutManager.F * i7);
                        if (s4 != null) {
                            int top = s4.getTop() + this.f2351c.Z.f2327d.f2317a.top;
                            int bottom = s4.getBottom() - this.f2351c.Z.f2327d.f2317a.bottom;
                            if (i7 == i5) {
                                i2 = (s2.getWidth() / 2) + s2.getLeft();
                            } else {
                                i2 = 0;
                            }
                            if (i7 == i6) {
                                i3 = (s3.getWidth() / 2) + s3.getLeft();
                            } else {
                                i3 = recyclerView.getWidth();
                            }
                            canvas.drawRect((float) i2, (float) top, (float) i3, (float) bottom, this.f2351c.Z.f2331h);
                        }
                    }
                }
            }
        }
    }
}
