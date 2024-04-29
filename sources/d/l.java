package d;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import g0.b0;
import g0.m;
import g0.u;
import z.b;

public class l implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f2762a;

    public l(k kVar) {
        this.f2762a = kVar;
    }

    public b0 a(View view, b0 b0Var) {
        int e2 = b0Var.e();
        int X = this.f2762a.X(b0Var, (Rect) null);
        if (e2 != X) {
            int c2 = b0Var.c();
            int d2 = b0Var.d();
            int b2 = b0Var.b();
            int i2 = Build.VERSION.SDK_INT;
            b0.e dVar = i2 >= 30 ? new b0.d(b0Var) : i2 >= 29 ? new b0.c(b0Var) : new b0.b(b0Var);
            dVar.d(b.b(c2, X, d2, b2));
            b0Var = dVar.b();
        }
        return u.p(view, b0Var);
    }
}
