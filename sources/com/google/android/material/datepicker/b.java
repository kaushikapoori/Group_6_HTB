package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import c.a;
import g0.u;
import g0.x;
import java.util.WeakHashMap;
import r1.c;
import u1.g;
import u1.j;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f2317a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f2318b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f2319c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f2320d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2321e;

    /* renamed from: f  reason: collision with root package name */
    public final j f2322f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, j jVar, Rect rect) {
        a.b(rect.left);
        a.b(rect.top);
        a.b(rect.right);
        a.b(rect.bottom);
        this.f2317a = rect;
        this.f2318b = colorStateList2;
        this.f2319c = colorStateList;
        this.f2320d = colorStateList3;
        this.f2321e = i2;
        this.f2322f = jVar;
    }

    public static b a(Context context, int i2) {
        a.a(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, y0.a.f4378o);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a2 = c.a(context, obtainStyledAttributes, 4);
        ColorStateList a3 = c.a(context, obtainStyledAttributes, 9);
        ColorStateList a4 = c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        j a5 = j.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new u1.a((float) 0)).a();
        obtainStyledAttributes.recycle();
        return new b(a2, a3, a4, dimensionPixelSize, a5, rect);
    }

    public void b(TextView textView) {
        g gVar = new g();
        g gVar2 = new g();
        gVar.setShapeAppearanceModel(this.f2322f);
        gVar2.setShapeAppearanceModel(this.f2322f);
        gVar.q(this.f2319c);
        gVar.t((float) this.f2321e, this.f2320d);
        textView.setTextColor(this.f2318b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f2318b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f2317a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.d.q(textView, insetDrawable);
    }
}
