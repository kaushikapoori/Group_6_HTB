package com.google.android.material.behavior;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g0.u;
import g0.x;
import h0.f;
import java.util.WeakHashMap;

public class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f2152a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f2152a = swipeDismissBehavior;
    }

    public boolean a(View view, f.a aVar) {
        boolean z2 = false;
        if (!this.f2152a.s(view)) {
            return false;
        }
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        boolean z3 = u.e.d(view) == 1;
        int i2 = this.f2152a.f2141d;
        if ((i2 == 0 && z3) || (i2 == 1 && !z3)) {
            z2 = true;
        }
        int width = view.getWidth();
        if (z2) {
            width = -width;
        }
        u.n(view, width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = this.f2152a.f2139b;
        if (bVar != null) {
            ((com.google.android.material.snackbar.a) bVar).a(view);
        }
        return true;
    }
}
