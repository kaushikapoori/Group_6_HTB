package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.l f1995a;

    /* renamed from: b  reason: collision with root package name */
    public int f1996b = Integer.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1997c = new Rect();

    public t(RecyclerView.l lVar, r rVar) {
        this.f1995a = lVar;
    }

    public static t a(RecyclerView.l lVar, int i2) {
        if (i2 == 0) {
            return new r(lVar);
        }
        if (i2 == 1) {
            return new s(lVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public int m() {
        if (Integer.MIN_VALUE == this.f1996b) {
            return 0;
        }
        return l() - this.f1996b;
    }

    public abstract int n(View view);

    public abstract int o(View view);

    public abstract void p(int i2);
}
