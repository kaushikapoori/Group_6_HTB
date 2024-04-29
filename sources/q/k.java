package q;

import p.e;
import p.g;

public class k extends q {
    public k(e eVar) {
        super(eVar);
        eVar.f3656d.f();
        eVar.f3658e.f();
        this.f3778f = ((g) eVar).f3705v0;
    }

    public void a(d dVar) {
        g gVar = this.f3780h;
        if (gVar.f3738c && !gVar.f3745j) {
            this.f3780h.c((int) ((((float) gVar.f3747l.get(0).f3742g) * ((g) this.f3774b).f3701r0) + 0.5f));
        }
    }

    public void d() {
        q qVar;
        e eVar = this.f3774b;
        g gVar = (g) eVar;
        int i2 = gVar.f3702s0;
        int i3 = gVar.f3703t0;
        if (gVar.f3705v0 == 1) {
            g gVar2 = this.f3780h;
            if (i2 != -1) {
                gVar2.f3747l.add(eVar.V.f3656d.f3780h);
                this.f3774b.V.f3656d.f3780h.f3746k.add(this.f3780h);
                this.f3780h.f3741f = i2;
            } else if (i3 != -1) {
                gVar2.f3747l.add(eVar.V.f3656d.f3781i);
                this.f3774b.V.f3656d.f3781i.f3746k.add(this.f3780h);
                this.f3780h.f3741f = -i3;
            } else {
                gVar2.f3737b = true;
                gVar2.f3747l.add(eVar.V.f3656d.f3781i);
                this.f3774b.V.f3656d.f3781i.f3746k.add(this.f3780h);
            }
            m(this.f3774b.f3656d.f3780h);
            qVar = this.f3774b.f3656d;
        } else {
            g gVar3 = this.f3780h;
            if (i2 != -1) {
                gVar3.f3747l.add(eVar.V.f3658e.f3780h);
                this.f3774b.V.f3658e.f3780h.f3746k.add(this.f3780h);
                this.f3780h.f3741f = i2;
            } else if (i3 != -1) {
                gVar3.f3747l.add(eVar.V.f3658e.f3781i);
                this.f3774b.V.f3658e.f3781i.f3746k.add(this.f3780h);
                this.f3780h.f3741f = -i3;
            } else {
                gVar3.f3737b = true;
                gVar3.f3747l.add(eVar.V.f3658e.f3781i);
                this.f3774b.V.f3658e.f3781i.f3746k.add(this.f3780h);
            }
            m(this.f3774b.f3658e.f3780h);
            qVar = this.f3774b.f3658e;
        }
        m(qVar.f3781i);
    }

    public void e() {
        e eVar = this.f3774b;
        if (((g) eVar).f3705v0 == 1) {
            eVar.f3651a0 = this.f3780h.f3742g;
        } else {
            eVar.f3653b0 = this.f3780h.f3742g;
        }
    }

    public void f() {
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
