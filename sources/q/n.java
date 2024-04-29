package q;

import java.util.ArrayList;

public class n {

    /* renamed from: c  reason: collision with root package name */
    public static int f3762c;

    /* renamed from: a  reason: collision with root package name */
    public q f3763a = null;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<q> f3764b = new ArrayList<>();

    public n(q qVar, int i2) {
        f3762c++;
        this.f3763a = qVar;
    }

    public final long a(g gVar, long j2) {
        q qVar = gVar.f3739d;
        if (qVar instanceof l) {
            return j2;
        }
        int size = gVar.f3746k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = gVar.f3746k.get(i2);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f3739d != qVar) {
                    j3 = Math.min(j3, a(gVar2, ((long) gVar2.f3741f) + j2));
                }
            }
        }
        if (gVar != qVar.f3781i) {
            return j3;
        }
        long j4 = j2 - qVar.j();
        return Math.min(Math.min(j3, a(qVar.f3780h, j4)), j4 - ((long) qVar.f3780h.f3741f));
    }

    public final long b(g gVar, long j2) {
        q qVar = gVar.f3739d;
        if (qVar instanceof l) {
            return j2;
        }
        int size = gVar.f3746k.size();
        long j3 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = gVar.f3746k.get(i2);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f3739d != qVar) {
                    j3 = Math.max(j3, b(gVar2, ((long) gVar2.f3741f) + j2));
                }
            }
        }
        if (gVar != qVar.f3780h) {
            return j3;
        }
        long j4 = j2 + qVar.j();
        return Math.max(Math.max(j3, b(qVar.f3781i, j4)), j4 - ((long) qVar.f3781i.f3741f));
    }
}
