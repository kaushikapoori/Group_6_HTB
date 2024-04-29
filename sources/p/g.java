package p;

import n.b;
import n.d;
import n.h;
import p.d;

public class g extends e {

    /* renamed from: r0  reason: collision with root package name */
    public float f3701r0 = -1.0f;

    /* renamed from: s0  reason: collision with root package name */
    public int f3702s0 = -1;

    /* renamed from: t0  reason: collision with root package name */
    public int f3703t0 = -1;

    /* renamed from: u0  reason: collision with root package name */
    public d f3704u0 = this.K;

    /* renamed from: v0  reason: collision with root package name */
    public int f3705v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f3706w0;

    public g() {
        this.f3705v0 = 0;
        this.S.clear();
        this.S.add(this.f3704u0);
        int length = this.R.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.R[i2] = this.f3704u0;
        }
    }

    public boolean D() {
        return this.f3706w0;
    }

    public boolean E() {
        return this.f3706w0;
    }

    public void U(d dVar, boolean z2) {
        if (this.V != null) {
            int o2 = dVar.o(this.f3704u0);
            if (this.f3705v0 == 1) {
                this.f3651a0 = o2;
                this.f3653b0 = 0;
                N(this.V.l());
                S(0);
                return;
            }
            this.f3651a0 = 0;
            this.f3653b0 = o2;
            S(this.V.u());
            N(0);
        }
    }

    public void V(int i2) {
        d dVar = this.f3704u0;
        dVar.f3633b = i2;
        dVar.f3634c = true;
        this.f3706w0 = true;
    }

    public void W(int i2) {
        if (this.f3705v0 != i2) {
            this.f3705v0 = i2;
            this.S.clear();
            this.f3704u0 = this.f3705v0 == 1 ? this.J : this.K;
            this.S.add(this.f3704u0);
            int length = this.R.length;
            for (int i3 = 0; i3 < length; i3++) {
                this.R[i3] = this.f3704u0;
            }
        }
    }

    public void d(d dVar, boolean z2) {
        h hVar;
        h hVar2;
        h hVar3;
        f fVar = (f) this.V;
        if (fVar != null) {
            d i2 = fVar.i(d.a.LEFT);
            d i3 = fVar.i(d.a.RIGHT);
            e eVar = this.V;
            boolean z3 = true;
            boolean z4 = eVar != null && eVar.U[0] == 2;
            if (this.f3705v0 == 0) {
                i2 = fVar.i(d.a.TOP);
                i3 = fVar.i(d.a.BOTTOM);
                e eVar2 = this.V;
                if (eVar2 == null || eVar2.U[1] != 2) {
                    z3 = false;
                }
                z4 = z3;
            }
            if (this.f3706w0) {
                d dVar2 = this.f3704u0;
                if (dVar2.f3634c) {
                    h l2 = dVar.l(dVar2);
                    dVar.e(l2, this.f3704u0.c());
                    if (this.f3702s0 != -1) {
                        if (z4) {
                            hVar3 = dVar.l(i3);
                        }
                        this.f3706w0 = false;
                        return;
                    }
                    if (this.f3703t0 != -1 && z4) {
                        h l3 = dVar.l(i3);
                        dVar.f(l2, dVar.l(i2), 0, 5);
                        hVar3 = l3;
                    }
                    this.f3706w0 = false;
                    return;
                    dVar.f(hVar3, l2, 0, 5);
                    this.f3706w0 = false;
                    return;
                }
            }
            if (this.f3702s0 != -1) {
                hVar = dVar.l(this.f3704u0);
                dVar.d(hVar, dVar.l(i2), this.f3702s0, 8);
                if (z4) {
                    hVar2 = dVar.l(i3);
                } else {
                    return;
                }
            } else if (this.f3703t0 != -1) {
                hVar = dVar.l(this.f3704u0);
                h l4 = dVar.l(i3);
                dVar.d(hVar, l4, -this.f3703t0, 8);
                if (z4) {
                    dVar.f(hVar, dVar.l(i2), 0, 5);
                    hVar2 = l4;
                } else {
                    return;
                }
            } else if (this.f3701r0 != -1.0f) {
                h l5 = dVar.l(this.f3704u0);
                h l6 = dVar.l(i3);
                float f2 = this.f3701r0;
                b m2 = dVar.m();
                m2.f3436d.e(l5, -1.0f);
                m2.f3436d.e(l6, f2);
                dVar.c(m2);
                return;
            } else {
                return;
            }
            dVar.f(hVar2, hVar, 0, 5);
        }
    }

    public boolean e() {
        return true;
    }

    public d i(d.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f3705v0 == 0) {
                return this.f3704u0;
            }
            return null;
        }
        if (this.f3705v0 == 1) {
            return this.f3704u0;
        }
        return null;
    }
}
