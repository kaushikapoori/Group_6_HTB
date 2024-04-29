package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class u extends p {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ v f1998q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(v vVar, Context context) {
        super(context);
        this.f1998q = vVar;
    }

    public void c(View view, RecyclerView.w wVar, RecyclerView.v.a aVar) {
        v vVar = this.f1998q;
        int[] a2 = vVar.a(vVar.f1858a.getLayoutManager(), view);
        int i2 = a2[0];
        int i3 = a2[1];
        int ceil = (int) Math.ceil(((double) g(Math.max(Math.abs(i2), Math.abs(i3)))) / 0.3356d);
        if (ceil > 0) {
            aVar.b(i2, i3, ceil, this.f1987j);
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    public int g(int i2) {
        return Math.min(100, super.g(i2));
    }
}
