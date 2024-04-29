package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import g0.u;
import g0.x;
import java.util.List;
import java.util.WeakHashMap;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a  reason: collision with root package name */
    public int f2662a = 0;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2663b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f2664c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ m1.a f2665d;

        public a(View view, int i2, m1.a aVar) {
            this.f2663b = view;
            this.f2664c = i2;
            this.f2665d = aVar;
        }

        public boolean onPreDraw() {
            this.f2663b.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f2662a == this.f2664c) {
                m1.a aVar = this.f2665d;
                expandableBehavior.t((View) aVar, this.f2663b, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        m1.a aVar = (m1.a) view2;
        if (!s(aVar.a())) {
            return false;
        }
        this.f2662a = aVar.a() ? 1 : 2;
        return t((View) aVar, view, aVar.a(), true);
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i2) {
        m1.a aVar;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (!u.g.c(view)) {
            List<View> d2 = coordinatorLayout.d(view);
            int size = d2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = d2.get(i3);
                if (b(coordinatorLayout, view, view2)) {
                    aVar = (m1.a) view2;
                    break;
                }
                i3++;
            }
            if (aVar != null && s(aVar.a())) {
                int i4 = aVar.a() ? 1 : 2;
                this.f2662a = i4;
                view.getViewTreeObserver().addOnPreDrawListener(new a(view, i4, aVar));
            }
        }
        return false;
    }

    public final boolean s(boolean z2) {
        if (!z2) {
            return this.f2662a == 1;
        }
        int i2 = this.f2662a;
        return i2 == 0 || i2 == 2;
    }

    public abstract boolean t(View view, View view2, boolean z2, boolean z3);
}
