package q;

import p.a;
import p.e;
import q.g;

public class l extends q {
    public l(e eVar) {
        super(eVar);
    }

    public void a(d dVar) {
        a aVar = (a) this.f3774b;
        int i2 = aVar.f3608t0;
        int i3 = 0;
        int i4 = -1;
        for (g gVar : this.f3780h.f3747l) {
            int i5 = gVar.f3742g;
            if (i4 == -1 || i5 < i4) {
                i4 = i5;
            }
            if (i3 < i5) {
                i3 = i5;
            }
        }
        if (i2 == 0 || i2 == 2) {
            this.f3780h.c(i4 + aVar.f3610v0);
        } else {
            this.f3780h.c(i3 + aVar.f3610v0);
        }
    }

    public void d() {
        q qVar;
        e eVar = this.f3774b;
        if (eVar instanceof a) {
            g gVar = this.f3780h;
            gVar.f3737b = true;
            a aVar = (a) eVar;
            int i2 = aVar.f3608t0;
            boolean z2 = aVar.f3609u0;
            int i3 = 0;
            if (i2 == 0) {
                gVar.f3740e = g.a.LEFT;
                while (i3 < aVar.f3708s0) {
                    e eVar2 = aVar.f3707r0[i3];
                    if (z2 || eVar2.f3667i0 != 8) {
                        g gVar2 = eVar2.f3656d.f3780h;
                        gVar2.f3746k.add(this.f3780h);
                        this.f3780h.f3747l.add(gVar2);
                    }
                    i3++;
                }
            } else if (i2 != 1) {
                if (i2 == 2) {
                    gVar.f3740e = g.a.TOP;
                    while (i3 < aVar.f3708s0) {
                        e eVar3 = aVar.f3707r0[i3];
                        if (z2 || eVar3.f3667i0 != 8) {
                            g gVar3 = eVar3.f3658e.f3780h;
                            gVar3.f3746k.add(this.f3780h);
                            this.f3780h.f3747l.add(gVar3);
                        }
                        i3++;
                    }
                } else if (i2 == 3) {
                    gVar.f3740e = g.a.BOTTOM;
                    while (i3 < aVar.f3708s0) {
                        e eVar4 = aVar.f3707r0[i3];
                        if (z2 || eVar4.f3667i0 != 8) {
                            g gVar4 = eVar4.f3658e.f3781i;
                            gVar4.f3746k.add(this.f3780h);
                            this.f3780h.f3747l.add(gVar4);
                        }
                        i3++;
                    }
                } else {
                    return;
                }
                m(this.f3774b.f3658e.f3780h);
                qVar = this.f3774b.f3658e;
                m(qVar.f3781i);
            } else {
                gVar.f3740e = g.a.RIGHT;
                while (i3 < aVar.f3708s0) {
                    e eVar5 = aVar.f3707r0[i3];
                    if (z2 || eVar5.f3667i0 != 8) {
                        g gVar5 = eVar5.f3656d.f3781i;
                        gVar5.f3746k.add(this.f3780h);
                        this.f3780h.f3747l.add(gVar5);
                    }
                    i3++;
                }
            }
            m(this.f3774b.f3656d.f3780h);
            qVar = this.f3774b.f3656d;
            m(qVar.f3781i);
        }
    }

    public void e() {
        e eVar = this.f3774b;
        if (eVar instanceof a) {
            int i2 = ((a) eVar).f3608t0;
            if (i2 == 0 || i2 == 1) {
                eVar.f3651a0 = this.f3780h.f3742g;
            } else {
                eVar.f3653b0 = this.f3780h.f3742g;
            }
        }
    }

    public void f() {
        this.f3775c = null;
        this.f3780h.b();
    }

    public boolean k() {
        return false;
    }

    public final void m(g gVar) {
        this.f3780h.f3746k.add(gVar);
        gVar.f3747l.add(this.f3780h);
    }
}
