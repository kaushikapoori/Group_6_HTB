package p;

import n.d;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static boolean[] f3709a = new boolean[3];

    public static void a(f fVar, d dVar, e eVar) {
        eVar.f3678o = -1;
        eVar.f3680p = -1;
        if (fVar.U[0] != 2 && eVar.U[0] == 4) {
            int i2 = eVar.J.f3638g;
            int u2 = fVar.u() - eVar.L.f3638g;
            d dVar2 = eVar.J;
            dVar2.f3640i = dVar.l(dVar2);
            d dVar3 = eVar.L;
            dVar3.f3640i = dVar.l(dVar3);
            dVar.e(eVar.J.f3640i, i2);
            dVar.e(eVar.L.f3640i, u2);
            eVar.f3678o = 2;
            eVar.f3651a0 = i2;
            int i3 = u2 - i2;
            eVar.W = i3;
            int i4 = eVar.f3657d0;
            if (i3 < i4) {
                eVar.W = i4;
            }
        }
        if (fVar.U[1] != 2 && eVar.U[1] == 4) {
            int i5 = eVar.K.f3638g;
            int l2 = fVar.l() - eVar.M.f3638g;
            d dVar4 = eVar.K;
            dVar4.f3640i = dVar.l(dVar4);
            d dVar5 = eVar.M;
            dVar5.f3640i = dVar.l(dVar5);
            dVar.e(eVar.K.f3640i, i5);
            dVar.e(eVar.M.f3640i, l2);
            if (eVar.f3655c0 > 0 || eVar.f3667i0 == 8) {
                d dVar6 = eVar.N;
                dVar6.f3640i = dVar.l(dVar6);
                dVar.e(eVar.N.f3640i, eVar.f3655c0 + i5);
            }
            eVar.f3680p = 2;
            eVar.f3653b0 = i5;
            int i6 = l2 - i5;
            eVar.X = i6;
            int i7 = eVar.f3659e0;
            if (i6 < i7) {
                eVar.X = i7;
            }
        }
    }

    public static final boolean b(int i2, int i3) {
        return (i2 & i3) == i3;
    }
}
