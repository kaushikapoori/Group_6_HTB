package q;

import q.g;

public class h extends g {

    /* renamed from: m  reason: collision with root package name */
    public int f3757m;

    public h(q qVar) {
        super(qVar);
        this.f3740e = qVar instanceof m ? g.a.HORIZONTAL_DIMENSION : g.a.VERTICAL_DIMENSION;
    }

    public void c(int i2) {
        if (!this.f3745j) {
            this.f3745j = true;
            this.f3742g = i2;
            for (d next : this.f3746k) {
                next.a(next);
            }
        }
    }
}
