package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class z {
    public static int a(RecyclerView.w wVar, t tVar, View view, View view2, RecyclerView.l lVar, boolean z2) {
        if (lVar.x() == 0 || wVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(lVar.Q(view) - lVar.Q(view2)) + 1;
        }
        return Math.min(tVar.l(), tVar.b(view2) - tVar.e(view));
    }

    public static int b(RecyclerView.w wVar, t tVar, View view, View view2, RecyclerView.l lVar, boolean z2, boolean z3) {
        if (lVar.x() == 0 || wVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (wVar.b() - Math.max(lVar.Q(view), lVar.Q(view2))) - 1) : Math.max(0, Math.min(lVar.Q(view), lVar.Q(view2)));
        if (!z2) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(tVar.b(view2) - tVar.e(view))) / ((float) (Math.abs(lVar.Q(view) - lVar.Q(view2)) + 1)))) + ((float) (tVar.k() - tVar.e(view))));
    }

    public static int c(RecyclerView.w wVar, t tVar, View view, View view2, RecyclerView.l lVar, boolean z2) {
        if (lVar.x() == 0 || wVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return wVar.b();
        }
        return (int) ((((float) (tVar.b(view2) - tVar.e(view))) / ((float) (Math.abs(lVar.Q(view) - lVar.Q(view2)) + 1))) * ((float) wVar.b()));
    }
}
