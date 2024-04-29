package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public final class s extends t {
    public s(RecyclerView.l lVar) {
        super(lVar, (r) null);
    }

    public int b(View view) {
        return this.f1995a.A(view) + ((RecyclerView.m) view.getLayoutParams()).bottomMargin;
    }

    public int c(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return this.f1995a.D(view) + mVar.topMargin + mVar.bottomMargin;
    }

    public int d(View view) {
        RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
        return this.f1995a.E(view) + mVar.leftMargin + mVar.rightMargin;
    }

    public int e(View view) {
        return this.f1995a.G(view) - ((RecyclerView.m) view.getLayoutParams()).topMargin;
    }

    public int f() {
        return this.f1995a.f1724o;
    }

    public int g() {
        RecyclerView.l lVar = this.f1995a;
        return lVar.f1724o - lVar.M();
    }

    public int h() {
        return this.f1995a.M();
    }

    public int i() {
        return this.f1995a.f1722m;
    }

    public int j() {
        return this.f1995a.f1721l;
    }

    public int k() {
        return this.f1995a.P();
    }

    public int l() {
        RecyclerView.l lVar = this.f1995a;
        return (lVar.f1724o - lVar.P()) - this.f1995a.M();
    }

    public int n(View view) {
        this.f1995a.T(view, true, this.f1997c);
        return this.f1997c.bottom;
    }

    public int o(View view) {
        this.f1995a.T(view, true, this.f1997c);
        return this.f1997c.top;
    }

    public void p(int i2) {
        this.f1995a.Y(i2);
    }
}
