package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.util.Objects;
import java.util.WeakHashMap;
import u1.g;
import u1.h;
import u1.j;

public class c extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    public final Runnable f2655t;

    /* renamed from: u  reason: collision with root package name */
    public int f2656u;

    /* renamed from: v  reason: collision with root package name */
    public g f2657v;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c.this.s();
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public c(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        g gVar = new g();
        this.f2657v = gVar;
        h hVar = new h(0.5f);
        j jVar = gVar.f3911b.f3935a;
        Objects.requireNonNull(jVar);
        j.b bVar = new j.b(jVar);
        bVar.f3974e = hVar;
        bVar.f3975f = hVar;
        bVar.f3976g = hVar;
        bVar.f3977h = hVar;
        gVar.f3911b.f3935a = bVar.a();
        gVar.invalidateSelf();
        this.f2657v.q(ColorStateList.valueOf(-1));
        g gVar2 = this.f2657v;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.d.q(this, gVar2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.f4385v, i2, 0);
        this.f2656u = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f2655t = new a();
        obtainStyledAttributes.recycle();
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            view.setId(u.e.a());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f2655t);
            handler.post(this.f2655t);
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        s();
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f2655t);
            handler.post(this.f2655t);
        }
    }

    public void s() {
        int childCount = getChildCount();
        int i2 = 1;
        for (int i3 = 0; i3 < childCount; i3++) {
            if ("skip".equals(getChildAt(i3).getTag())) {
                i2++;
            }
        }
        b bVar = new b();
        bVar.c(this);
        float f2 = 0.0f;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int id = childAt.getId();
                int i5 = this.f2656u;
                if (!bVar.f921c.containsKey(Integer.valueOf(id))) {
                    bVar.f921c.put(Integer.valueOf(id), new b.a());
                }
                b.C0005b bVar2 = bVar.f921c.get(Integer.valueOf(id)).f925d;
                bVar2.A = R.id.circle_center;
                bVar2.B = i5;
                bVar2.C = f2;
                f2 = (360.0f / ((float) (childCount - i2))) + f2;
            }
        }
        bVar.b(this, true);
        setConstraintSet((b) null);
        requestLayout();
    }

    public void setBackgroundColor(int i2) {
        this.f2657v.q(ColorStateList.valueOf(i2));
    }
}
