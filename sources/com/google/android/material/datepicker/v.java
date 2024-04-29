package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.g;
import java.util.Iterator;

public class v implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f2400b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ w f2401c;

    public v(w wVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f2401c = wVar;
        this.f2400b = materialCalendarGridView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        u a2 = this.f2400b.getAdapter();
        if (i2 >= a2.b() && i2 <= a2.d()) {
            g.e eVar = this.f2401c.f2404e;
            long longValue = this.f2400b.getAdapter().getItem(i2).longValue();
            g.d dVar = (g.d) eVar;
            if (g.this.W.f2304d.i(longValue)) {
                g.this.V.c(longValue);
                Iterator it = g.this.T.iterator();
                while (it.hasNext()) {
                    ((x) it.next()).a(g.this.V.a());
                }
                g.this.f2343b0.getAdapter().f1699a.b();
                RecyclerView recyclerView = g.this.f2342a0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f1699a.b();
                }
            }
        }
    }
}
