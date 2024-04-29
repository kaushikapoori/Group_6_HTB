package q;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p.e;
import p.g;
import p.i;
import q.b;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public p.f f3728a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3729b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3730c = true;

    /* renamed from: d  reason: collision with root package name */
    public p.f f3731d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<q> f3732e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b.C0046b f3733f;

    /* renamed from: g  reason: collision with root package name */
    public b.a f3734g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<n> f3735h;

    public f(p.f fVar) {
        new ArrayList();
        this.f3733f = null;
        this.f3734g = new b.a();
        this.f3735h = new ArrayList<>();
        this.f3728a = fVar;
        this.f3731d = fVar;
    }

    public final void a(g gVar, int i2, int i3, g gVar2, ArrayList<n> arrayList, n nVar) {
        q qVar = gVar.f3739d;
        if (qVar.f3775c == null) {
            p.f fVar = this.f3728a;
            if (qVar != fVar.f3656d && qVar != fVar.f3658e) {
                if (nVar == null) {
                    nVar = new n(qVar, i3);
                    arrayList.add(nVar);
                }
                qVar.f3775c = nVar;
                nVar.f3764b.add(qVar);
                for (d next : qVar.f3780h.f3746k) {
                    if (next instanceof g) {
                        a((g) next, i2, 0, gVar2, arrayList, nVar);
                    }
                }
                for (d next2 : qVar.f3781i.f3746k) {
                    if (next2 instanceof g) {
                        a((g) next2, i2, 1, gVar2, arrayList, nVar);
                    }
                }
                if (i2 == 1 && (qVar instanceof o)) {
                    for (d next3 : ((o) qVar).f3765k.f3746k) {
                        if (next3 instanceof g) {
                            a((g) next3, i2, 2, gVar2, arrayList, nVar);
                        }
                    }
                }
                for (g a2 : qVar.f3780h.f3747l) {
                    a(a2, i2, 0, gVar2, arrayList, nVar);
                }
                for (g a3 : qVar.f3781i.f3747l) {
                    a(a3, i2, 1, gVar2, arrayList, nVar);
                }
                if (i2 == 1 && (qVar instanceof o)) {
                    for (g a4 : ((o) qVar).f3765k.f3747l) {
                        a(a4, i2, 2, gVar2, arrayList, nVar);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0187, code lost:
        if (r4[3].f3637f != null) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r2.f3685s == 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0119, code lost:
        if (r8[1].f3637f != null) goto L_0x011d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(p.f r17) {
        /*
            r16 = this;
            r0 = r17
            java.util.ArrayList<p.e> r1 = r0.f3710r0
            java.util.Iterator r1 = r1.iterator()
        L_0x0008:
            boolean r2 = r1.hasNext()
            r3 = 0
            if (r2 == 0) goto L_0x022a
            java.lang.Object r2 = r1.next()
            p.e r2 = (p.e) r2
            int[] r4 = r2.U
            r5 = r4[r3]
            r10 = 1
            r4 = r4[r10]
            int r6 = r2.f3667i0
            r7 = 8
            if (r6 != r7) goto L_0x0024
            goto L_0x0109
        L_0x0024:
            float r6 = r2.f3689w
            r11 = 1065353216(0x3f800000, float:1.0)
            r7 = 3
            r8 = 2
            int r9 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0032
            if (r5 != r7) goto L_0x0032
            r2.f3684r = r8
        L_0x0032:
            float r9 = r2.f3692z
            int r12 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r12 >= 0) goto L_0x003c
            if (r4 != r7) goto L_0x003c
            r2.f3685s = r8
        L_0x003c:
            float r12 = r2.Y
            r13 = 0
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0063
            if (r5 != r7) goto L_0x004c
            if (r4 == r8) goto L_0x0049
            if (r4 != r10) goto L_0x004c
        L_0x0049:
            r2.f3684r = r7
            goto L_0x0063
        L_0x004c:
            if (r4 != r7) goto L_0x0053
            if (r5 == r8) goto L_0x0061
            if (r5 != r10) goto L_0x0053
            goto L_0x0061
        L_0x0053:
            if (r5 != r7) goto L_0x0063
            if (r4 != r7) goto L_0x0063
            int r12 = r2.f3684r
            if (r12 != 0) goto L_0x005d
            r2.f3684r = r7
        L_0x005d:
            int r12 = r2.f3685s
            if (r12 != 0) goto L_0x0063
        L_0x0061:
            r2.f3685s = r7
        L_0x0063:
            if (r5 != r7) goto L_0x0077
            int r12 = r2.f3684r
            if (r12 != r10) goto L_0x0077
            p.d r12 = r2.J
            p.d r12 = r12.f3637f
            if (r12 == 0) goto L_0x0075
            p.d r12 = r2.L
            p.d r12 = r12.f3637f
            if (r12 != 0) goto L_0x0077
        L_0x0075:
            r12 = 2
            goto L_0x0078
        L_0x0077:
            r12 = r5
        L_0x0078:
            if (r4 != r7) goto L_0x008c
            int r5 = r2.f3685s
            if (r5 != r10) goto L_0x008c
            p.d r5 = r2.K
            p.d r5 = r5.f3637f
            if (r5 == 0) goto L_0x008a
            p.d r5 = r2.M
            p.d r5 = r5.f3637f
            if (r5 != 0) goto L_0x008c
        L_0x008a:
            r13 = 2
            goto L_0x008d
        L_0x008c:
            r13 = r4
        L_0x008d:
            q.m r4 = r2.f3656d
            r4.f3776d = r12
            int r5 = r2.f3684r
            r4.f3773a = r5
            q.o r4 = r2.f3658e
            r4.f3776d = r13
            int r14 = r2.f3685s
            r4.f3773a = r14
            r4 = 4
            if (r12 == r4) goto L_0x00a4
            if (r12 == r10) goto L_0x00a4
            if (r12 != r8) goto L_0x00ac
        L_0x00a4:
            if (r13 == r4) goto L_0x01da
            if (r13 == r10) goto L_0x01da
            if (r13 != r8) goto L_0x00ac
            goto L_0x01da
        L_0x00ac:
            r15 = 1056964608(0x3f000000, float:0.5)
            if (r12 != r7) goto L_0x011d
            if (r13 == r8) goto L_0x00b4
            if (r13 != r10) goto L_0x011d
        L_0x00b4:
            if (r5 != r7) goto L_0x00d1
            if (r13 != r8) goto L_0x00c2
            r7 = 0
            r9 = 0
            r8 = 2
            r4 = r16
            r5 = r2
            r6 = r8
            r4.f(r5, r6, r7, r8, r9)
        L_0x00c2:
            int r3 = r2.l()
            float r4 = (float) r3
            float r5 = r2.Y
            float r4 = r4 * r5
            float r4 = r4 + r15
            int r4 = (int) r4
            r9 = r3
            r7 = r4
            r8 = 1
            goto L_0x0103
        L_0x00d1:
            if (r5 != r10) goto L_0x00e7
            r7 = 0
            r9 = 0
            r6 = 2
            r4 = r16
            r5 = r2
            r8 = r13
            r4.f(r5, r6, r7, r8, r9)
            q.m r3 = r2.f3656d
            q.h r3 = r3.f3777e
            int r2 = r2.u()
            goto L_0x01d6
        L_0x00e7:
            if (r5 != r8) goto L_0x010d
            int[] r11 = r0.U
            r8 = r11[r3]
            if (r8 == r10) goto L_0x00f3
            r8 = r11[r3]
            if (r8 != r4) goto L_0x011d
        L_0x00f3:
            int r3 = r17.u()
            float r3 = (float) r3
            float r6 = r6 * r3
            float r6 = r6 + r15
            int r3 = (int) r6
            int r4 = r2.l()
            r7 = r3
            r9 = r4
            r8 = r13
        L_0x0103:
            r6 = 1
            r4 = r16
            r5 = r2
            goto L_0x020f
        L_0x0109:
            r2.f3650a = r10
            goto L_0x0008
        L_0x010d:
            p.d[] r8 = r2.R
            r11 = r8[r3]
            p.d r11 = r11.f3637f
            if (r11 == 0) goto L_0x0189
            r8 = r8[r10]
            p.d r8 = r8.f3637f
            if (r8 != 0) goto L_0x011d
            goto L_0x0189
        L_0x011d:
            if (r13 != r7) goto L_0x018f
            r8 = 2
            if (r12 == r8) goto L_0x0124
            if (r12 != r10) goto L_0x018f
        L_0x0124:
            if (r14 != r7) goto L_0x014d
            if (r12 != r8) goto L_0x0132
            r7 = 0
            r9 = 0
            r8 = 2
            r4 = r16
            r5 = r2
            r6 = r8
            r4.f(r5, r6, r7, r8, r9)
        L_0x0132:
            int r7 = r2.u()
            float r3 = r2.Y
            int r4 = r2.Z
            r5 = -1
            if (r4 != r5) goto L_0x0141
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r4 / r3
        L_0x0141:
            float r4 = (float) r7
            float r4 = r4 * r3
            float r4 = r4 + r15
            int r9 = (int) r4
        L_0x0146:
            r8 = 1
            r4 = r16
            r5 = r2
            r6 = r8
            goto L_0x020f
        L_0x014d:
            if (r14 != r10) goto L_0x015b
            r7 = 0
            r9 = 0
            r8 = 2
            r4 = r16
            r5 = r2
            r6 = r12
            r4.f(r5, r6, r7, r8, r9)
            goto L_0x01ce
        L_0x015b:
            r8 = 2
            if (r14 != r8) goto L_0x017a
            int[] r8 = r0.U
            r11 = r8[r10]
            if (r11 == r10) goto L_0x0168
            r8 = r8[r10]
            if (r8 != r4) goto L_0x018f
        L_0x0168:
            int r3 = r2.u()
            int r4 = r17.l()
            float r4 = (float) r4
            float r9 = r9 * r4
            float r9 = r9 + r15
            int r4 = (int) r9
            r7 = r3
            r9 = r4
            r6 = r12
            goto L_0x0208
        L_0x017a:
            p.d[] r4 = r2.R
            r8 = 2
            r11 = r4[r8]
            p.d r8 = r11.f3637f
            if (r8 == 0) goto L_0x0189
            r4 = r4[r7]
            p.d r4 = r4.f3637f
            if (r4 != 0) goto L_0x018f
        L_0x0189:
            r8 = r13
            r6 = 2
            r7 = 0
            r9 = 0
            goto L_0x020c
        L_0x018f:
            if (r12 != r7) goto L_0x0008
            if (r13 != r7) goto L_0x0008
            if (r5 == r10) goto L_0x01ba
            if (r14 != r10) goto L_0x0198
            goto L_0x01ba
        L_0x0198:
            r4 = 2
            if (r14 != r4) goto L_0x0008
            if (r5 != r4) goto L_0x0008
            int[] r4 = r0.U
            r3 = r4[r3]
            if (r3 != r10) goto L_0x0008
            r3 = r4[r10]
            if (r3 != r10) goto L_0x0008
            int r3 = r17.u()
            float r3 = (float) r3
            float r6 = r6 * r3
            float r6 = r6 + r15
            int r7 = (int) r6
            int r3 = r17.l()
            float r3 = (float) r3
            float r9 = r9 * r3
            float r9 = r9 + r15
            int r9 = (int) r9
            goto L_0x0146
        L_0x01ba:
            r7 = 0
            r9 = 0
            r8 = 2
            r4 = r16
            r5 = r2
            r6 = r8
            r4.f(r5, r6, r7, r8, r9)
            q.m r3 = r2.f3656d
            q.h r3 = r3.f3777e
            int r4 = r2.u()
            r3.f3757m = r4
        L_0x01ce:
            q.o r3 = r2.f3658e
            q.h r3 = r3.f3777e
            int r2 = r2.l()
        L_0x01d6:
            r3.f3757m = r2
            goto L_0x0008
        L_0x01da:
            int r3 = r2.u()
            if (r12 != r4) goto L_0x01f1
            int r3 = r17.u()
            p.d r5 = r2.J
            int r5 = r5.f3638g
            int r3 = r3 - r5
            p.d r5 = r2.L
            int r5 = r5.f3638g
            int r3 = r3 - r5
            r7 = r3
            r6 = 1
            goto L_0x01f3
        L_0x01f1:
            r7 = r3
            r6 = r12
        L_0x01f3:
            int r3 = r2.l()
            if (r13 != r4) goto L_0x020a
            int r3 = r17.l()
            p.d r4 = r2.K
            int r4 = r4.f3638g
            int r3 = r3 - r4
            p.d r4 = r2.M
            int r4 = r4.f3638g
            int r3 = r3 - r4
            r9 = r3
        L_0x0208:
            r8 = 1
            goto L_0x020c
        L_0x020a:
            r9 = r3
            r8 = r13
        L_0x020c:
            r4 = r16
            r5 = r2
        L_0x020f:
            r4.f(r5, r6, r7, r8, r9)
            q.m r3 = r2.f3656d
            q.h r3 = r3.f3777e
            int r4 = r2.u()
            r3.c(r4)
            q.o r3 = r2.f3658e
            q.h r3 = r3.f3777e
            int r4 = r2.l()
            r3.c(r4)
            goto L_0x0109
        L_0x022a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f.b(p.f):boolean");
    }

    public void c() {
        Object obj;
        ArrayList<q> arrayList = this.f3732e;
        arrayList.clear();
        this.f3731d.f3656d.f();
        this.f3731d.f3658e.f();
        arrayList.add(this.f3731d.f3656d);
        arrayList.add(this.f3731d.f3658e);
        Iterator<e> it = this.f3731d.f3710r0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            e next = it.next();
            if (next instanceof g) {
                obj = new k(next);
            } else {
                if (next.A()) {
                    if (next.f3652b == null) {
                        next.f3652b = new c(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f3652b);
                } else {
                    arrayList.add(next.f3656d);
                }
                if (next.B()) {
                    if (next.f3654c == null) {
                        next.f3654c = new c(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.f3654c);
                } else {
                    arrayList.add(next.f3658e);
                }
                if (next instanceof i) {
                    obj = new l(next);
                }
            }
            arrayList.add(obj);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<q> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<q> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            q next2 = it3.next();
            if (next2.f3774b != this.f3731d) {
                next2.d();
            }
        }
        this.f3735h.clear();
        n.f3762c = 0;
        e(this.f3728a.f3656d, 0, this.f3735h);
        e(this.f3728a.f3658e, 1, this.f3735h);
        this.f3729b = false;
    }

    public final int d(p.f fVar, int i2) {
        long j2;
        long j3;
        f fVar2 = this;
        p.f fVar3 = fVar;
        int i3 = i2;
        int size = fVar2.f3735h.size();
        long j4 = 0;
        long j5 = 0;
        int i4 = 0;
        while (i4 < size) {
            n nVar = fVar2.f3735h.get(i4);
            q qVar = nVar.f3763a;
            if (qVar instanceof c) {
                if (((c) qVar).f3778f != i3) {
                    j4 = Math.max(j4, j5);
                    i4++;
                    j5 = 0;
                    fVar2 = this;
                    fVar3 = fVar;
                }
            } else if (i3 == 0) {
                if (!(qVar instanceof m)) {
                    j4 = Math.max(j4, j5);
                    i4++;
                    j5 = 0;
                    fVar2 = this;
                    fVar3 = fVar;
                }
            } else if (!(qVar instanceof o)) {
                j4 = Math.max(j4, j5);
                i4++;
                j5 = 0;
                fVar2 = this;
                fVar3 = fVar;
            }
            g gVar = (i3 == 0 ? fVar3.f3656d : fVar3.f3658e).f3780h;
            g gVar2 = (i3 == 0 ? fVar3.f3656d : fVar3.f3658e).f3781i;
            boolean contains = qVar.f3780h.f3747l.contains(gVar);
            boolean contains2 = nVar.f3763a.f3781i.f3747l.contains(gVar2);
            long j6 = nVar.f3763a.j();
            if (!contains || !contains2) {
                q qVar2 = nVar.f3763a;
                if (contains) {
                    g gVar3 = qVar2.f3780h;
                    j3 = nVar.b(gVar3, (long) gVar3.f3741f);
                    j2 = ((long) nVar.f3763a.f3780h.f3741f) + j6;
                } else if (contains2) {
                    g gVar4 = qVar2.f3781i;
                    long a2 = nVar.a(gVar4, (long) gVar4.f3741f);
                    j2 = ((long) (-nVar.f3763a.f3781i.f3741f)) + j6;
                    j3 = -a2;
                } else {
                    j5 = (qVar2.j() + ((long) qVar2.f3780h.f3741f)) - ((long) nVar.f3763a.f3781i.f3741f);
                    j4 = Math.max(j4, j5);
                    i4++;
                    j5 = 0;
                    fVar2 = this;
                    fVar3 = fVar;
                }
                j5 = Math.max(j3, j2);
                j4 = Math.max(j4, j5);
                i4++;
                j5 = 0;
                fVar2 = this;
                fVar3 = fVar;
            } else {
                long b2 = nVar.b(nVar.f3763a.f3780h, j5);
                long a3 = nVar.a(nVar.f3763a.f3781i, j5);
                long j7 = b2 - j6;
                q qVar3 = nVar.f3763a;
                int i5 = qVar3.f3781i.f3741f;
                if (j7 >= ((long) (-i5))) {
                    j7 += (long) i5;
                }
                long j8 = (long) qVar3.f3780h.f3741f;
                long j9 = ((-a3) - j6) - j8;
                if (j9 >= j8) {
                    j9 -= j8;
                }
                e eVar = qVar3.f3774b;
                Objects.requireNonNull(eVar);
                float f2 = i3 == 0 ? eVar.f3661f0 : i3 == 1 ? eVar.f3663g0 : -1.0f;
                float f3 = (float) (f2 > 0.0f ? (long) ((((float) j7) / (1.0f - f2)) + (((float) j9) / f2)) : 0);
                long a4 = ((long) ((f3 * f2) + 0.5f)) + j6 + ((long) e.a(1.0f, f2, f3, 0.5f));
                q qVar4 = nVar.f3763a;
                j5 = (((long) qVar4.f3780h.f3741f) + a4) - ((long) qVar4.f3781i.f3741f);
                j4 = Math.max(j4, j5);
                i4++;
                j5 = 0;
                fVar2 = this;
                fVar3 = fVar;
            }
        }
        return (int) j4;
    }

    public final void e(q qVar, int i2, ArrayList<n> arrayList) {
        for (d next : qVar.f3780h.f3746k) {
            if (next instanceof g) {
                a((g) next, i2, 0, qVar.f3781i, arrayList, (n) null);
            } else if (next instanceof q) {
                a(((q) next).f3780h, i2, 0, qVar.f3781i, arrayList, (n) null);
            }
        }
        for (d next2 : qVar.f3781i.f3746k) {
            if (next2 instanceof g) {
                a((g) next2, i2, 1, qVar.f3780h, arrayList, (n) null);
            } else if (next2 instanceof q) {
                a(((q) next2).f3781i, i2, 1, qVar.f3780h, arrayList, (n) null);
            }
        }
        if (i2 == 1) {
            for (d next3 : ((o) qVar).f3765k.f3746k) {
                if (next3 instanceof g) {
                    a((g) next3, i2, 2, (g) null, arrayList, (n) null);
                }
            }
        }
    }

    public final void f(e eVar, int i2, int i3, int i4, int i5) {
        b.a aVar = this.f3734g;
        aVar.f3716a = i2;
        aVar.f3717b = i4;
        aVar.f3718c = i3;
        aVar.f3719d = i5;
        ((ConstraintLayout.b) this.f3733f).b(eVar, aVar);
        eVar.S(this.f3734g.f3720e);
        eVar.N(this.f3734g.f3721f);
        b.a aVar2 = this.f3734g;
        eVar.E = aVar2.f3723h;
        eVar.K(aVar2.f3722g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006b, code lost:
        if (r10 == 3) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0085, code lost:
        if (r8 == 3) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        r2.c(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g() {
        /*
            r12 = this;
            p.f r0 = r12.f3728a
            java.util.ArrayList<p.e> r0 = r0.f3710r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a0
            java.lang.Object r1 = r0.next()
            p.e r1 = (p.e) r1
            boolean r2 = r1.f3650a
            if (r2 == 0) goto L_0x0019
            goto L_0x0008
        L_0x0019:
            int[] r2 = r1.U
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f3684r
            int r4 = r1.f3685s
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L_0x0030
            if (r8 != r11) goto L_0x002e
            if (r2 != r9) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r2 = 0
            goto L_0x0031
        L_0x0030:
            r2 = 1
        L_0x0031:
            if (r10 == r5) goto L_0x0037
            if (r10 != r11) goto L_0x0038
            if (r4 != r9) goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            q.m r4 = r1.f3656d
            q.h r4 = r4.f3777e
            boolean r5 = r4.f3745j
            q.o r6 = r1.f3658e
            q.h r6 = r6.f3777e
            boolean r7 = r6.f3745j
            if (r5 == 0) goto L_0x0054
            if (r7 == 0) goto L_0x0054
            int r5 = r4.f3742g
            int r7 = r6.f3742g
            r6 = 1
            r2 = r12
            r3 = r1
            r4 = r6
            r2.f(r3, r4, r5, r6, r7)
            goto L_0x008d
        L_0x0054:
            if (r5 == 0) goto L_0x006e
            if (r3 == 0) goto L_0x006e
            int r5 = r4.f3742g
            int r7 = r6.f3742g
            r4 = 1
            r6 = 2
            r2 = r12
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            q.o r2 = r1.f3658e
            q.h r2 = r2.f3777e
            int r3 = r1.l()
            if (r10 != r11) goto L_0x008a
            goto L_0x0087
        L_0x006e:
            if (r7 == 0) goto L_0x008f
            if (r2 == 0) goto L_0x008f
            int r5 = r4.f3742g
            int r7 = r6.f3742g
            r4 = 2
            r6 = 1
            r2 = r12
            r3 = r1
            r2.f(r3, r4, r5, r6, r7)
            q.m r2 = r1.f3656d
            q.h r2 = r2.f3777e
            int r3 = r1.u()
            if (r8 != r11) goto L_0x008a
        L_0x0087:
            r2.f3757m = r3
            goto L_0x008f
        L_0x008a:
            r2.c(r3)
        L_0x008d:
            r1.f3650a = r9
        L_0x008f:
            boolean r2 = r1.f3650a
            if (r2 == 0) goto L_0x0008
            q.o r2 = r1.f3658e
            q.h r2 = r2.f3766l
            if (r2 == 0) goto L_0x0008
            int r1 = r1.f3655c0
            r2.c(r1)
            goto L_0x0008
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.f.g():void");
    }
}
