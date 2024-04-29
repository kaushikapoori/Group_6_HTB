package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class r extends t {
    public r(RecyclerView.l lVar) {
        super(lVar, (r) null);
    }

    public int b(View view) {
        return this.f1995a.F(view) + ((RecyclerView.m) view.getLayoutParams()).rightMargin;
    }

    public int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return this.f1995a.E(view) + mVar.leftMargin + mVar.rightMargin;
    }

    public int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return this.f1995a.D(view) + mVar.topMargin + mVar.bottomMargin;
    }

    public int e(View view) {
        return this.f1995a.C(view) - ((RecyclerView.m) view.getLayoutParams()).leftMargin;
    }

    public int f() {
        return this.f1995a.f1723n;
    }

    public int g() {
        RecyclerView.l lVar = this.f1995a;
        return lVar.f1723n - lVar.O();
    }

    public int h() {
        return this.f1995a.O();
    }

    public int i() {
        return this.f1995a.f1721l;
    }

    public int j() {
        return this.f1995a.f1722m;
    }

    public int k() {
        return this.f1995a.N();
    }

    public int l() {
        RecyclerView.l lVar = this.f1995a;
        return (lVar.f1723n - lVar.N()) - this.f1995a.O();
    }

    public int n(View view) {
        this.f1995a.T(view, true, this.f1997c);
        return this.f1997c.right;
    }

    public int o(View view) {
        this.f1995a.T(view, true, this.f1997c);
        return this.f1997c.left;
    }

    public void p(int i2) {
        this.f1995a.X(i2);
    }
}
