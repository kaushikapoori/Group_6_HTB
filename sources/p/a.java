package p;

import h.f;
import n.b;
import n.h;
import p.d;

public class a extends i {

    /* renamed from: t0  reason: collision with root package name */
    public int f3608t0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f3609u0 = true;

    /* renamed from: v0  reason: collision with root package name */
    public int f3610v0 = 0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f3611w0 = false;

    public boolean D() {
        return this.f3611w0;
    }

    public boolean E() {
        return this.f3611w0;
    }

    public boolean W() {
        int i2;
        d i3;
        d i4;
        d i5;
        int i6;
        int i7;
        d.a aVar = d.a.BOTTOM;
        d.a aVar2 = d.a.TOP;
        d.a aVar3 = d.a.RIGHT;
        d.a aVar4 = d.a.LEFT;
        int i8 = 0;
        boolean z2 = true;
        while (true) {
            i2 = this.f3708s0;
            if (i8 >= i2) {
                break;
            }
            e eVar = this.f3707r0[i8];
            if ((this.f3609u0 || eVar.e()) && ((((i6 = this.f3608t0) == 0 || i6 == 1) && !eVar.D()) || (((i7 = this.f3608t0) == 2 || i7 == 3) && !eVar.E()))) {
                z2 = false;
            }
            i8++;
        }
        if (!z2 || i2 <= 0) {
            return false;
        }
        int i9 = 0;
        boolean z3 = false;
        for (int i10 = 0; i10 < this.f3708s0; i10++) {
            e eVar2 = this.f3707r0[i10];
            if (this.f3609u0 || eVar2.e()) {
                if (!z3) {
                    int i11 = this.f3608t0;
                    if (i11 == 0) {
                        i5 = eVar2.i(aVar4);
                    } else if (i11 == 1) {
                        i5 = eVar2.i(aVar3);
                    } else if (i11 == 2) {
                        i5 = eVar2.i(aVar2);
                    } else {
                        if (i11 == 3) {
                            i5 = eVar2.i(aVar);
                        }
                        z3 = true;
                    }
                    i9 = i5.c();
                    z3 = true;
                }
                int i12 = this.f3608t0;
                if (i12 == 0) {
                    i4 = eVar2.i(aVar4);
                } else {
                    if (i12 == 1) {
                        i3 = eVar2.i(aVar3);
                    } else if (i12 == 2) {
                        i4 = eVar2.i(aVar2);
                    } else if (i12 == 3) {
                        i3 = eVar2.i(aVar);
                    }
                    i9 = Math.max(i9, i3.c());
                }
                i9 = Math.min(i9, i4.c());
            }
        }
        int i13 = i9 + this.f3610v0;
        int i14 = this.f3608t0;
        if (i14 == 0 || i14 == 1) {
            L(i13, i13);
        } else {
            M(i13, i13);
        }
        this.f3611w0 = true;
        return true;
    }

    public int X() {
        int i2 = this.f3608t0;
        if (i2 == 0 || i2 == 1) {
            return 0;
        }
        return (i2 == 2 || i2 == 3) ? 1 : -1;
    }

    public void d(n.d dVar, boolean z2) {
        d[] dVarArr;
        boolean z3;
        h hVar;
        d dVar2;
        int i2;
        int i3;
        int i4;
        h hVar2;
        int i5;
        d[] dVarArr2 = this.R;
        dVarArr2[0] = this.J;
        dVarArr2[2] = this.K;
        dVarArr2[1] = this.L;
        dVarArr2[3] = this.M;
        int i6 = 0;
        while (true) {
            dVarArr = this.R;
            if (i6 >= dVarArr.length) {
                break;
            }
            dVarArr[i6].f3640i = dVar.l(dVarArr[i6]);
            i6++;
        }
        int i7 = this.f3608t0;
        if (i7 >= 0 && i7 < 4) {
            d dVar3 = dVarArr[i7];
            if (!this.f3611w0) {
                W();
            }
            if (this.f3611w0) {
                this.f3611w0 = false;
                int i8 = this.f3608t0;
                if (i8 == 0 || i8 == 1) {
                    dVar.e(this.J.f3640i, this.f3651a0);
                    hVar2 = this.L.f3640i;
                    i5 = this.f3651a0;
                } else if (i8 == 2 || i8 == 3) {
                    dVar.e(this.K.f3640i, this.f3653b0);
                    hVar2 = this.M.f3640i;
                    i5 = this.f3653b0;
                } else {
                    return;
                }
                dVar.e(hVar2, i5);
                return;
            }
            int i9 = 0;
            while (true) {
                if (i9 >= this.f3708s0) {
                    z3 = false;
                    break;
                }
                e eVar = this.f3707r0[i9];
                if ((this.f3609u0 || eVar.e()) && ((((i3 = this.f3608t0) == 0 || i3 == 1) && eVar.m() == 3 && eVar.J.f3637f != null && eVar.L.f3637f != null) || (((i4 = this.f3608t0) == 2 || i4 == 3) && eVar.t() == 3 && eVar.K.f3637f != null && eVar.M.f3637f != null))) {
                    z3 = true;
                } else {
                    i9++;
                }
            }
            z3 = true;
            boolean z4 = this.J.e() || this.L.e();
            boolean z5 = this.K.e() || this.M.e();
            boolean z6 = !z3 && (((i2 = this.f3608t0) == 0 && z4) || ((i2 == 2 && z5) || ((i2 == 1 && z4) || (i2 == 3 && z5))));
            int i10 = 5;
            if (!z6) {
                i10 = 4;
            }
            for (int i11 = 0; i11 < this.f3708s0; i11++) {
                e eVar2 = this.f3707r0[i11];
                if (this.f3609u0 || eVar2.e()) {
                    h l2 = dVar.l(eVar2.R[this.f3608t0]);
                    d[] dVarArr3 = eVar2.R;
                    int i12 = this.f3608t0;
                    dVarArr3[i12].f3640i = l2;
                    int i13 = (dVarArr3[i12].f3637f == null || dVarArr3[i12].f3637f.f3635d != this) ? 0 : dVarArr3[i12].f3638g + 0;
                    if (i12 == 0 || i12 == 2) {
                        b m2 = dVar.m();
                        h n2 = dVar.n();
                        n2.f3473e = 0;
                        m2.f(dVar3.f3640i, l2, n2, this.f3610v0 - i13);
                        dVar.c(m2);
                    } else {
                        b m3 = dVar.m();
                        h n3 = dVar.n();
                        n3.f3473e = 0;
                        m3.e(dVar3.f3640i, l2, n3, this.f3610v0 + i13);
                        dVar.c(m3);
                    }
                    dVar.d(dVar3.f3640i, l2, this.f3610v0 + i13, i10);
                }
            }
            int i14 = this.f3608t0;
            if (i14 == 0) {
                dVar.d(this.L.f3640i, this.J.f3640i, 0, 8);
                dVar.d(this.J.f3640i, this.V.L.f3640i, 0, 4);
                hVar = this.J.f3640i;
                dVar2 = this.V.J;
            } else if (i14 == 1) {
                dVar.d(this.J.f3640i, this.L.f3640i, 0, 8);
                dVar.d(this.J.f3640i, this.V.J.f3640i, 0, 4);
                hVar = this.J.f3640i;
                dVar2 = this.V.L;
            } else if (i14 == 2) {
                dVar.d(this.M.f3640i, this.K.f3640i, 0, 8);
                dVar.d(this.K.f3640i, this.V.M.f3640i, 0, 4);
                hVar = this.K.f3640i;
                dVar2 = this.V.K;
            } else if (i14 == 3) {
                dVar.d(this.K.f3640i, this.M.f3640i, 0, 8);
                dVar.d(this.K.f3640i, this.V.K.f3640i, 0, 4);
                hVar = this.K.f3640i;
                dVar2 = this.V.M;
            } else {
                return;
            }
            dVar.d(hVar, dVar2.f3640i, 0, 0);
        }
    }

    public boolean e() {
        return true;
    }

    public String toString() {
        StringBuilder a2 = androidx.activity.result.a.a("[Barrier] ");
        a2.append(this.f3669j0);
        a2.append(" {");
        String sb = a2.toString();
        for (int i2 = 0; i2 < this.f3708s0; i2++) {
            e eVar = this.f3707r0[i2];
            if (i2 > 0) {
                sb = f.a(sb, ", ");
            }
            StringBuilder a3 = androidx.activity.result.a.a(sb);
            a3.append(eVar.f3669j0);
            sb = a3.toString();
        }
        return f.a(sb, "}");
    }
}
