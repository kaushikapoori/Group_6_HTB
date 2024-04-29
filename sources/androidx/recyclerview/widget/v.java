package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class v extends b0 {

    /* renamed from: c  reason: collision with root package name */
    public t f1999c;

    /* renamed from: d  reason: collision with root package name */
    public t f2000d;

    public int[] a(RecyclerView.l lVar, View view) {
        int[] iArr = new int[2];
        if (lVar.e()) {
            iArr[0] = c(view, e(lVar));
        } else {
            iArr[0] = 0;
        }
        if (lVar.f()) {
            iArr[1] = c(view, f(lVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final int c(View view, t tVar) {
        return ((tVar.c(view) / 2) + tVar.e(view)) - ((tVar.l() / 2) + tVar.k());
    }

    public final View d(RecyclerView.l lVar, t tVar) {
        int x2 = lVar.x();
        View view = null;
        if (x2 == 0) {
            return null;
        }
        int l2 = (tVar.l() / 2) + tVar.k();
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < x2; i3++) {
            View w2 = lVar.w(i3);
            int abs = Math.abs(((tVar.c(w2) / 2) + tVar.e(w2)) - l2);
            if (abs < i2) {
                view = w2;
                i2 = abs;
            }
        }
        return view;
    }

    public final t e(RecyclerView.l lVar) {
        t tVar = this.f2000d;
        if (tVar == null || tVar.f1995a != lVar) {
            this.f2000d = new r(lVar);
        }
        return this.f2000d;
    }

    public final t f(RecyclerView.l lVar) {
        t tVar = this.f1999c;
        if (tVar == null || tVar.f1995a != lVar) {
            this.f1999c = new s(lVar);
        }
        return this.f1999c;
    }
}
