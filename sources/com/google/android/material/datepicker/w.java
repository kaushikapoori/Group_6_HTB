package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.supermarket.R;
import com.google.android.material.datepicker.g;
import g0.t;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public class w extends RecyclerView.d<a> {

    /* renamed from: c  reason: collision with root package name */
    public final a f2402c;

    /* renamed from: d  reason: collision with root package name */
    public final d<?> f2403d;

    /* renamed from: e  reason: collision with root package name */
    public final g.e f2404e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2405f;

    public static class a extends RecyclerView.z {

        /* renamed from: t  reason: collision with root package name */
        public final TextView f2406t;

        /* renamed from: u  reason: collision with root package name */
        public final MaterialCalendarGridView f2407u;

        public a(LinearLayout linearLayout, boolean z2) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f2406t = textView;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            new t(R.id.tag_accessibility_heading, Boolean.class, 28).e(textView, Boolean.TRUE);
            this.f2407u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z2) {
                textView.setVisibility(8);
            }
        }
    }

    public w(Context context, d<?> dVar, a aVar, g.e eVar) {
        t tVar = aVar.f2302b;
        t tVar2 = aVar.f2303c;
        t tVar3 = aVar.f2305e;
        if (tVar.compareTo(tVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (tVar3.compareTo(tVar2) <= 0) {
            int i2 = u.f2394g;
            int i3 = g.f2341e0;
            this.f2405f = (i2 * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + (o.j0(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
            this.f2402c = aVar;
            this.f2403d = dVar;
            this.f2404e = eVar;
            if (!this.f1699a.a()) {
                this.f1700b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public int a() {
        return this.f2402c.f2307g;
    }

    public long b(int i2) {
        return this.f2402c.f2302b.o(i2).f2387b.getTimeInMillis();
    }

    public void c(RecyclerView.z zVar, int i2) {
        a aVar = (a) zVar;
        t o2 = this.f2402c.f2302b.o(i2);
        aVar.f2406t.setText(o2.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f2407u.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !o2.equals(materialCalendarGridView.getAdapter().f2395b)) {
            u uVar = new u(o2, this.f2403d, this.f2402c);
            materialCalendarGridView.setNumColumns(o2.f2390e);
            materialCalendarGridView.setAdapter((ListAdapter) uVar);
        } else {
            materialCalendarGridView.invalidate();
            u a2 = materialCalendarGridView.getAdapter();
            for (Long longValue : a2.f2397d) {
                a2.f(materialCalendarGridView, longValue.longValue());
            }
            d<?> dVar = a2.f2396c;
            if (dVar != null) {
                for (Long longValue2 : dVar.h()) {
                    a2.f(materialCalendarGridView, longValue2.longValue());
                }
                a2.f2397d = a2.f2396c.h();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new v(this, materialCalendarGridView));
    }

    public RecyclerView.z d(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!o.j0(viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.m(-1, this.f2405f));
        return new a(linearLayout, true);
    }

    public t e(int i2) {
        return this.f2402c.f2302b.o(i2);
    }

    public int f(t tVar) {
        return this.f2402c.f2302b.p(tVar);
    }
}
