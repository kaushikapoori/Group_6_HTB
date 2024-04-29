package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.example.supermarket.R;
import r1.b;
import y0.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f2324a;

    /* renamed from: b  reason: collision with root package name */
    public final b f2325b;

    /* renamed from: c  reason: collision with root package name */
    public final b f2326c;

    /* renamed from: d  reason: collision with root package name */
    public final b f2327d;

    /* renamed from: e  reason: collision with root package name */
    public final b f2328e;

    /* renamed from: f  reason: collision with root package name */
    public final b f2329f;

    /* renamed from: g  reason: collision with root package name */
    public final b f2330g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f2331h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.c(context, R.attr.materialCalendarStyle, g.class.getCanonicalName()), a.f4377n);
        this.f2324a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f2330g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f2325b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f2326c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a2 = r1.c.a(context, obtainStyledAttributes, 6);
        this.f2327d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f2328e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f2329f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f2331h = paint;
        paint.setColor(a2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
