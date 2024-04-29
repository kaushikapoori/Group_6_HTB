package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.supermarket.R;
import java.util.Calendar;
import java.util.Locale;

public class d0 extends RecyclerView.d<a> {

    /* renamed from: c  reason: collision with root package name */
    public final g<?> f2334c;

    public static class a extends RecyclerView.z {

        /* renamed from: t  reason: collision with root package name */
        public final TextView f2335t;

        public a(TextView textView) {
            super(textView);
            this.f2335t = textView;
        }
    }

    public d0(g<?> gVar) {
        this.f2334c = gVar;
    }

    public int a() {
        return this.f2334c.W.f2306f;
    }

    public void c(RecyclerView.z zVar, int i2) {
        a aVar = (a) zVar;
        int i3 = this.f2334c.W.f2302b.f2389d + i2;
        String string = aVar.f2335t.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar.f2335t.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i3)}));
        aVar.f2335t.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i3)}));
        c cVar = this.f2334c.Z;
        Calendar d2 = b0.d();
        b bVar = d2.get(1) == i3 ? cVar.f2329f : cVar.f2327d;
        for (Long longValue : this.f2334c.V.h()) {
            d2.setTimeInMillis(longValue.longValue());
            if (d2.get(1) == i3) {
                bVar = cVar.f2328e;
            }
        }
        bVar.b(aVar.f2335t);
        aVar.f2335t.setOnClickListener(new c0(this, i3));
    }

    public RecyclerView.z d(ViewGroup viewGroup, int i2) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    public int e(int i2) {
        return i2 - this.f2334c.W.f2302b.f2389d;
    }
}
