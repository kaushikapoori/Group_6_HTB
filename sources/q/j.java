package q;

import java.util.ArrayList;
import p.d;
import p.e;
import p.g;
import p.i;

public class j {
    public static p a(e eVar, int i2, ArrayList<p> arrayList, p pVar) {
        d dVar;
        int i3;
        int i4 = i2 == 0 ? eVar.f3681p0 : eVar.f3683q0;
        int i5 = 0;
        if (i4 != -1 && (pVar == null || i4 != pVar.f3769b)) {
            int i6 = 0;
            while (true) {
                if (i6 >= arrayList.size()) {
                    break;
                }
                p pVar2 = arrayList.get(i6);
                if (pVar2.f3769b == i4) {
                    if (pVar != null) {
                        pVar.d(i2, pVar2);
                        arrayList.remove(pVar);
                    }
                    pVar = pVar2;
                } else {
                    i6++;
                }
            }
        } else if (i4 != -1) {
            return pVar;
        }
        if (pVar == null) {
            if (eVar instanceof i) {
                i iVar = (i) eVar;
                int i7 = 0;
                while (true) {
                    if (i7 >= iVar.f3708s0) {
                        i3 = -1;
                        break;
                    }
                    e eVar2 = iVar.f3707r0[i7];
                    if ((i2 == 0 && (i3 = eVar2.f3681p0) != -1) || (i2 == 1 && (i3 = eVar2.f3683q0) != -1)) {
                        break;
                    }
                    i7++;
                }
                if (i3 != -1) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= arrayList.size()) {
                            break;
                        }
                        p pVar3 = arrayList.get(i8);
                        if (pVar3.f3769b == i3) {
                            pVar = pVar3;
                            break;
                        }
                        i8++;
                    }
                }
            }
            if (pVar == null) {
                pVar = new p(i2);
            }
            arrayList.add(pVar);
        }
        if (pVar.a(eVar)) {
            if (eVar instanceof g) {
                g gVar = (g) eVar;
                d dVar2 = gVar.f3704u0;
                if (gVar.f3705v0 == 0) {
                    i5 = 1;
                }
                dVar2.b(i5, arrayList, pVar);
            }
            if (i2 == 0) {
                eVar.f3681p0 = pVar.f3769b;
                eVar.J.b(i2, arrayList, pVar);
                dVar = eVar.L;
            } else {
                eVar.f3683q0 = pVar.f3769b;
                eVar.K.b(i2, arrayList, pVar);
                eVar.N.b(i2, arrayList, pVar);
                dVar = eVar.M;
            }
            dVar.b(i2, arrayList, pVar);
            eVar.Q.b(i2, arrayList, pVar);
        }
        return pVar;
    }

    public static p b(ArrayList<p> arrayList, int i2) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p pVar = arrayList.get(i3);
            if (i2 == pVar.f3769b) {
                return pVar;
            }
        }
        return null;
    }

    public static boolean c(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }
}
