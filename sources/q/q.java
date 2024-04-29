package q;

import p.d;
import p.e;

public abstract class q implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f3773a;

    /* renamed from: b  reason: collision with root package name */
    public e f3774b;

    /* renamed from: c  reason: collision with root package name */
    public n f3775c;

    /* renamed from: d  reason: collision with root package name */
    public int f3776d;

    /* renamed from: e  reason: collision with root package name */
    public h f3777e = new h(this);

    /* renamed from: f  reason: collision with root package name */
    public int f3778f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3779g = false;

    /* renamed from: h  reason: collision with root package name */
    public g f3780h = new g(this);

    /* renamed from: i  reason: collision with root package name */
    public g f3781i = new g(this);

    /* renamed from: j  reason: collision with root package name */
    public int f3782j = 1;

    public q(e eVar) {
        this.f3774b = eVar;
    }

    public void a(d dVar) {
    }

    public final void b(g gVar, g gVar2, int i2) {
        gVar.f3747l.add(gVar2);
        gVar.f3741f = i2;
        gVar2.f3746k.add(gVar);
    }

    public final void c(g gVar, g gVar2, int i2, h hVar) {
        gVar.f3747l.add(gVar2);
        gVar.f3747l.add(this.f3777e);
        gVar.f3743h = i2;
        gVar.f3744i = hVar;
        gVar2.f3746k.add(gVar);
        hVar.f3746k.add(gVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i3) {
        int i4;
        if (i3 == 0) {
            e eVar = this.f3774b;
            int i5 = eVar.f3688v;
            i4 = Math.max(eVar.f3687u, i2);
            if (i5 > 0) {
                i4 = Math.min(i5, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        } else {
            e eVar2 = this.f3774b;
            int i6 = eVar2.f3691y;
            int max = Math.max(eVar2.f3690x, i2);
            if (i6 > 0) {
                max = Math.min(i6, i2);
            }
            if (i4 == i2) {
                return i2;
            }
        }
        return i4;
    }

    public final g h(d dVar) {
        q qVar;
        q qVar2;
        d dVar2 = dVar.f3637f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f3635d;
        int ordinal = dVar2.f3636e.ordinal();
        if (ordinal == 1) {
            qVar = eVar.f3656d;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                qVar2 = eVar.f3656d;
            } else if (ordinal == 4) {
                qVar2 = eVar.f3658e;
            } else if (ordinal != 5) {
                return null;
            } else {
                return eVar.f3658e.f3765k;
            }
            return qVar2.f3781i;
        } else {
            qVar = eVar.f3658e;
        }
        return qVar.f3780h;
    }

    public final g i(d dVar, int i2) {
        d dVar2 = dVar.f3637f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f3635d;
        q qVar = i2 == 0 ? eVar.f3656d : eVar.f3658e;
        int ordinal = dVar2.f3636e.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return qVar.f3780h;
        }
        if (ordinal == 3 || ordinal == 4) {
            return qVar.f3781i;
        }
        return null;
    }

    public long j() {
        h hVar = this.f3777e;
        if (hVar.f3745j) {
            return (long) hVar.f3742g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r9.f3773a == 3) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(p.d r13, p.d r14, int r15) {
        /*
            r12 = this;
            q.g r0 = r12.h(r13)
            q.g r1 = r12.h(r14)
            boolean r2 = r0.f3745j
            if (r2 == 0) goto L_0x00ee
            boolean r2 = r1.f3745j
            if (r2 != 0) goto L_0x0012
            goto L_0x00ee
        L_0x0012:
            int r2 = r0.f3742g
            int r13 = r13.d()
            int r13 = r13 + r2
            int r2 = r1.f3742g
            int r14 = r14.d()
            int r2 = r2 - r14
            int r14 = r2 - r13
            q.h r3 = r12.f3777e
            boolean r4 = r3.f3745j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00ab
            int r4 = r12.f3776d
            r6 = 3
            if (r4 != r6) goto L_0x00ab
            int r4 = r12.f3773a
            if (r4 == 0) goto L_0x00a3
            r7 = 1
            if (r4 == r7) goto L_0x0093
            r8 = 2
            if (r4 == r8) goto L_0x0071
            if (r4 == r6) goto L_0x003d
            goto L_0x00ab
        L_0x003d:
            p.e r4 = r12.f3774b
            q.m r8 = r4.f3656d
            int r9 = r8.f3776d
            if (r9 != r6) goto L_0x0054
            int r9 = r8.f3773a
            if (r9 != r6) goto L_0x0054
            q.o r9 = r4.f3658e
            int r10 = r9.f3776d
            if (r10 != r6) goto L_0x0054
            int r9 = r9.f3773a
            if (r9 != r6) goto L_0x0054
            goto L_0x00ab
        L_0x0054:
            if (r15 != 0) goto L_0x0058
            q.o r8 = r4.f3658e
        L_0x0058:
            q.h r6 = r8.f3777e
            boolean r8 = r6.f3745j
            if (r8 == 0) goto L_0x00ab
            float r4 = r4.Y
            if (r15 != r7) goto L_0x0069
            int r6 = r6.f3742g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x00a8
        L_0x0069:
            int r6 = r6.f3742g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
            goto L_0x00a8
        L_0x0071:
            p.e r4 = r12.f3774b
            p.e r6 = r4.V
            if (r6 == 0) goto L_0x00ab
            if (r15 != 0) goto L_0x007c
            q.m r6 = r6.f3656d
            goto L_0x007e
        L_0x007c:
            q.o r6 = r6.f3658e
        L_0x007e:
            q.h r6 = r6.f3777e
            boolean r7 = r6.f3745j
            if (r7 == 0) goto L_0x00ab
            if (r15 != 0) goto L_0x0089
            float r4 = r4.f3689w
            goto L_0x008b
        L_0x0089:
            float r4 = r4.f3692z
        L_0x008b:
            int r6 = r6.f3742g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x00a4
        L_0x0093:
            int r3 = r3.f3757m
            int r3 = r12.g(r3, r15)
            q.h r4 = r12.f3777e
            int r3 = java.lang.Math.min(r3, r14)
            r11 = r4
            r4 = r3
            r3 = r11
            goto L_0x00a8
        L_0x00a3:
            r4 = r14
        L_0x00a4:
            int r4 = r12.g(r4, r15)
        L_0x00a8:
            r3.c(r4)
        L_0x00ab:
            q.h r3 = r12.f3777e
            boolean r4 = r3.f3745j
            if (r4 != 0) goto L_0x00b2
            return
        L_0x00b2:
            int r3 = r3.f3742g
            if (r3 != r14) goto L_0x00c1
            q.g r14 = r12.f3780h
            r14.c(r13)
            q.g r13 = r12.f3781i
            r13.c(r2)
            return
        L_0x00c1:
            p.e r14 = r12.f3774b
            if (r15 != 0) goto L_0x00c8
            float r14 = r14.f3661f0
            goto L_0x00ca
        L_0x00c8:
            float r14 = r14.f3663g0
        L_0x00ca:
            if (r0 != r1) goto L_0x00d2
            int r13 = r0.f3742g
            int r2 = r1.f3742g
            r14 = 1056964608(0x3f000000, float:0.5)
        L_0x00d2:
            int r2 = r2 - r13
            int r2 = r2 - r3
            q.g r15 = r12.f3780h
            float r13 = (float) r13
            float r13 = r13 + r5
            float r0 = (float) r2
            float r0 = r0 * r14
            float r0 = r0 + r13
            int r13 = (int) r0
            r15.c(r13)
            q.g r13 = r12.f3781i
            q.g r14 = r12.f3780h
            int r14 = r14.f3742g
            q.h r15 = r12.f3777e
            int r15 = r15.f3742g
            int r14 = r14 + r15
            r13.c(r14)
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.q.l(p.d, p.d, int):void");
    }
}
