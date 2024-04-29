package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public class u extends BaseAdapter {

    /* renamed from: g  reason: collision with root package name */
    public static final int f2394g = b0.e().getMaximum(4);

    /* renamed from: b  reason: collision with root package name */
    public final t f2395b;

    /* renamed from: c  reason: collision with root package name */
    public final d<?> f2396c;

    /* renamed from: d  reason: collision with root package name */
    public Collection<Long> f2397d;

    /* renamed from: e  reason: collision with root package name */
    public c f2398e;

    /* renamed from: f  reason: collision with root package name */
    public final a f2399f;

    public u(t tVar, d<?> dVar, a aVar) {
        this.f2395b = tVar;
        this.f2396c = dVar;
        this.f2399f = aVar;
        this.f2397d = dVar.h();
    }

    public int a(int i2) {
        return b() + (i2 - 1);
    }

    public int b() {
        return this.f2395b.m();
    }

    /* renamed from: c */
    public Long getItem(int i2) {
        if (i2 < this.f2395b.m() || i2 > d()) {
            return null;
        }
        t tVar = this.f2395b;
        Calendar b2 = b0.b(tVar.f2387b);
        b2.set(5, (i2 - tVar.m()) + 1);
        return Long.valueOf(b2.getTimeInMillis());
    }

    public int d() {
        return (this.f2395b.m() + this.f2395b.f2391f) - 1;
    }

    public final void e(TextView textView, long j2) {
        b bVar;
        if (textView != null) {
            boolean z2 = false;
            if (this.f2399f.f2304d.i(j2)) {
                textView.setEnabled(true);
                Iterator<Long> it = this.f2396c.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (b0.a(j2) == b0.a(it.next().longValue())) {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    bVar = this.f2398e.f2325b;
                } else {
                    int i2 = (b0.d().getTimeInMillis() > j2 ? 1 : (b0.d().getTimeInMillis() == j2 ? 0 : -1));
                    c cVar = this.f2398e;
                    bVar = i2 == 0 ? cVar.f2326c : cVar.f2324a;
                }
            } else {
                textView.setEnabled(false);
                bVar = this.f2398e.f2330g;
            }
            bVar.b(textView);
        }
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j2) {
        if (t.l(j2).equals(this.f2395b)) {
            Calendar b2 = b0.b(this.f2395b.f2387b);
            b2.setTimeInMillis(j2);
            e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(b2.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j2);
        }
    }

    public int getCount() {
        return b() + this.f2395b.f2391f;
    }

    public long getItemId(int i2) {
        return (long) (i2 / this.f2395b.f2390e);
    }

    /* JADX WARNING: type inference failed for: r10v13, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            android.content.Context r0 = r11.getContext()
            com.google.android.material.datepicker.c r1 = r8.f2398e
            if (r1 != 0) goto L_0x000f
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r8.f2398e = r1
        L_0x000f:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L_0x0027
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r0 = 2131427398(0x7f0b0046, float:1.8476411E38)
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r10 = r8.b()
            int r10 = r9 - r10
            if (r10 < 0) goto L_0x0107
            com.google.android.material.datepicker.t r11 = r8.f2395b
            int r2 = r11.f2391f
            if (r10 < r2) goto L_0x0037
            goto L_0x0107
        L_0x0037:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r11 = r0.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r11 = java.lang.String.format(r11, r4, r3)
            r0.setText(r11)
            com.google.android.material.datepicker.t r11 = r8.f2395b
            java.util.Calendar r11 = r11.f2387b
            java.util.Calendar r11 = com.google.android.material.datepicker.b0.b(r11)
            r3 = 5
            r11.set(r3, r10)
            long r10 = r11.getTimeInMillis()
            com.google.android.material.datepicker.t r4 = r8.f2395b
            int r4 = r4.f2389d
            java.util.Calendar r5 = com.google.android.material.datepicker.b0.d()
            r5.set(r3, r2)
            java.util.Calendar r5 = com.google.android.material.datepicker.b0.b(r5)
            r6 = 2
            r5.get(r6)
            int r6 = r5.get(r2)
            r7 = 7
            r5.getMaximum(r7)
            r5.getActualMaximum(r3)
            r5.getTimeInMillis()
            java.lang.String r3 = "UTC"
            r5 = 24
            if (r4 != r6) goto L_0x00c6
            java.util.Locale r4 = java.util.Locale.getDefault()
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r5) goto L_0x00af
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.a0> r5 = com.google.android.material.datepicker.b0.f2323a
            java.lang.String r5 = "MMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            goto L_0x00fd
        L_0x00af:
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.a0> r3 = com.google.android.material.datepicker.b0.f2323a
            java.text.DateFormat r3 = java.text.DateFormat.getDateInstance(r1, r4)
            java.util.TimeZone r4 = com.google.android.material.datepicker.b0.c()
            r3.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r10)
            java.lang.String r10 = r3.format(r4)
            goto L_0x00fd
        L_0x00c6:
            java.util.Locale r4 = java.util.Locale.getDefault()
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r5) goto L_0x00e7
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.a0> r5 = com.google.android.material.datepicker.b0.f2323a
            java.lang.String r5 = "yMMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            goto L_0x00fd
        L_0x00e7:
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.a0> r3 = com.google.android.material.datepicker.b0.f2323a
            java.text.DateFormat r3 = java.text.DateFormat.getDateInstance(r1, r4)
            java.util.TimeZone r4 = com.google.android.material.datepicker.b0.c()
            r3.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r10)
            java.lang.String r10 = r3.format(r4)
        L_0x00fd:
            r0.setContentDescription(r10)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x010f
        L_0x0107:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        L_0x010f:
            java.lang.Long r9 = r8.getItem(r9)
            if (r9 != 0) goto L_0x0116
            goto L_0x011d
        L_0x0116:
            long r9 = r9.longValue()
            r8.e(r0, r9)
        L_0x011d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.u.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public boolean hasStableIds() {
        return true;
    }
}
