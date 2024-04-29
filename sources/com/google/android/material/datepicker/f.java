package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

public class f extends BaseAdapter {

    /* renamed from: e  reason: collision with root package name */
    public static final int f2337e = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f2338b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2339c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2340d;

    public f() {
        Calendar e2 = b0.e();
        this.f2338b = e2;
        this.f2339c = e2.getMaximum(7);
        this.f2340d = e2.getFirstDayOfWeek();
    }

    public int getCount() {
        return this.f2339c;
    }

    public Object getItem(int i2) {
        int i3 = this.f2339c;
        if (i2 >= i3) {
            return null;
        }
        int i4 = i2 + this.f2340d;
        if (i4 > i3) {
            i4 -= i3;
        }
        return Integer.valueOf(i4);
    }

    public long getItemId(int i2) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0018
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131427399(0x7f0b0047, float:1.8476413E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0018:
            java.util.Calendar r7 = r5.f2338b
            int r2 = r5.f2340d
            int r6 = r6 + r2
            int r2 = r5.f2339c
            if (r6 <= r2) goto L_0x0022
            int r6 = r6 - r2
        L_0x0022:
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f2338b
            int r3 = f2337e
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            r7 = 2131689564(0x7f0f005c, float:1.9008147E38)
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f2338b
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
