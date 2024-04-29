package q;

import androidx.activity.result.a;
import p.e;
import q.g;

public class o extends q {

    /* renamed from: k  reason: collision with root package name */
    public g f3765k;

    /* renamed from: l  reason: collision with root package name */
    public h f3766l = null;

    public o(e eVar) {
        super(eVar);
        g gVar = new g(this);
        this.f3765k = gVar;
        this.f3780h.f3740e = g.a.TOP;
        this.f3781i.f3740e = g.a.BOTTOM;
        gVar.f3740e = g.a.BASELINE;
        this.f3778f = 1;
    }

    public void a(d dVar) {
        int i2;
        float f2;
        if (n.g.a(this.f3782j) != 3) {
            h hVar = this.f3777e;
            if (hVar.f3738c && !hVar.f3745j && this.f3776d == 3) {
                e eVar = this.f3774b;
                int i3 = eVar.f3685s;
                if (i3 == 2) {
                    e eVar2 = eVar.V;
                    if (eVar2 != null) {
                        h hVar2 = eVar2.f3658e.f3777e;
                        if (hVar2.f3745j) {
                            f2 = ((float) hVar2.f3742g) * eVar.f3692z;
                        }
                    }
                } else if (i3 == 3) {
                    h hVar3 = eVar.f3656d.f3777e;
                    if (hVar3.f3745j) {
                        int i4 = eVar.Z;
                        if (i4 != -1) {
                            if (i4 == 0) {
                                f2 = ((float) hVar3.f3742g) * eVar.Y;
                            } else if (i4 != 1) {
                                i2 = 0;
                                hVar.c(i2);
                            }
                        }
                        f2 = ((float) hVar3.f3742g) / eVar.Y;
                    }
                }
                i2 = (int) (f2 + 0.5f);
                hVar.c(i2);
            }
            g gVar = this.f3780h;
            if (gVar.f3738c) {
                g gVar2 = this.f3781i;
                if (gVar2.f3738c) {
                    if (!gVar.f3745j || !gVar2.f3745j || !this.f3777e.f3745j) {
                        if (!this.f3777e.f3745j && this.f3776d == 3) {
                            e eVar3 = this.f3774b;
                            if (eVar3.f3684r == 0 && !eVar3.B()) {
                                int i5 = this.f3780h.f3747l.get(0).f3742g;
                                g gVar3 = this.f3780h;
                                int i6 = i5 + gVar3.f3741f;
                                int i7 = this.f3781i.f3747l.get(0).f3742g + this.f3781i.f3741f;
                                gVar3.c(i6);
                                this.f3781i.c(i7);
                                this.f3777e.c(i7 - i6);
                                return;
                            }
                        }
                        if (!this.f3777e.f3745j && this.f3776d == 3 && this.f3773a == 1 && this.f3780h.f3747l.size() > 0 && this.f3781i.f3747l.size() > 0) {
                            int i8 = (this.f3781i.f3747l.get(0).f3742g + this.f3781i.f3741f) - (this.f3780h.f3747l.get(0).f3742g + this.f3780h.f3741f);
                            h hVar4 = this.f3777e;
                            int i9 = hVar4.f3757m;
                            if (i8 < i9) {
                                hVar4.c(i8);
                            } else {
                                hVar4.c(i9);
                            }
                        }
                        if (this.f3777e.f3745j && this.f3780h.f3747l.size() > 0 && this.f3781i.f3747l.size() > 0) {
                            g gVar4 = this.f3780h.f3747l.get(0);
                            g gVar5 = this.f3781i.f3747l.get(0);
                            int i10 = gVar4.f3742g;
                            g gVar6 = this.f3780h;
                            int i11 = gVar6.f3741f + i10;
                            int i12 = gVar5.f3742g;
                            int i13 = this.f3781i.f3741f + i12;
                            float f3 = this.f3774b.f3663g0;
                            if (gVar4 == gVar5) {
                                f3 = 0.5f;
                            } else {
                                i10 = i11;
                                i12 = i13;
                            }
                            gVar6.c((int) ((((float) ((i12 - i10) - this.f3777e.f3742g)) * f3) + ((float) i10) + 0.5f));
                            this.f3781i.c(this.f3780h.f3742g + this.f3777e.f3742g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        e eVar4 = this.f3774b;
        l(eVar4.K, eVar4.M, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x030d, code lost:
        if (r9.f3774b.E != false) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0360, code lost:
        if (r0.f3776d == 3) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0399, code lost:
        if (r9.f3774b.E != false) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x040e, code lost:
        if (r0.f3776d == 3) goto L_0x0410;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r9 = this;
            p.e r0 = r9.f3774b
            boolean r1 = r0.f3650a
            if (r1 == 0) goto L_0x000f
            q.h r1 = r9.f3777e
            int r0 = r0.l()
            r1.c(r0)
        L_0x000f:
            q.h r0 = r9.f3777e
            boolean r0 = r0.f3745j
            r1 = 3
            r2 = 1
            r3 = 4
            if (r0 != 0) goto L_0x008e
            p.e r0 = r9.f3774b
            int r0 = r0.t()
            r9.f3776d = r0
            p.e r0 = r9.f3774b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x002d
            q.a r0 = new q.a
            r0.<init>(r9)
            r9.f3766l = r0
        L_0x002d:
            int r0 = r9.f3776d
            if (r0 == r1) goto L_0x00c2
            if (r0 != r3) goto L_0x007e
            p.e r0 = r9.f3774b
            p.e r0 = r0.V
            if (r0 == 0) goto L_0x007e
            int r4 = r0.t()
            if (r4 != r2) goto L_0x007e
            int r1 = r0.l()
            p.e r2 = r9.f3774b
            p.d r2 = r2.K
            int r2 = r2.d()
            int r1 = r1 - r2
            p.e r2 = r9.f3774b
            p.d r2 = r2.M
            int r2 = r2.d()
            int r1 = r1 - r2
            q.g r2 = r9.f3780h
            q.o r3 = r0.f3658e
            q.g r3 = r3.f3780h
            p.e r4 = r9.f3774b
            p.d r4 = r4.K
            int r4 = r4.d()
            r9.b(r2, r3, r4)
            q.g r2 = r9.f3781i
            q.o r0 = r0.f3658e
            q.g r0 = r0.f3781i
            p.e r3 = r9.f3774b
            p.d r3 = r3.M
            int r3 = r3.d()
            int r3 = -r3
            r9.b(r2, r0, r3)
            q.h r0 = r9.f3777e
            r0.c(r1)
            return
        L_0x007e:
            int r0 = r9.f3776d
            if (r0 != r2) goto L_0x00c2
            q.h r0 = r9.f3777e
            p.e r4 = r9.f3774b
            int r4 = r4.l()
            r0.c(r4)
            goto L_0x00c2
        L_0x008e:
            int r0 = r9.f3776d
            if (r0 != r3) goto L_0x00c2
            p.e r0 = r9.f3774b
            p.e r0 = r0.V
            if (r0 == 0) goto L_0x00c2
            int r4 = r0.t()
            if (r4 != r2) goto L_0x00c2
            q.g r1 = r9.f3780h
            q.o r2 = r0.f3658e
            q.g r2 = r2.f3780h
            p.e r3 = r9.f3774b
            p.d r3 = r3.K
            int r3 = r3.d()
            r9.b(r1, r2, r3)
            q.g r1 = r9.f3781i
            q.o r0 = r0.f3658e
            q.g r0 = r0.f3781i
            p.e r2 = r9.f3774b
            p.d r2 = r2.M
            int r2 = r2.d()
            int r2 = -r2
            r9.b(r1, r0, r2)
            return
        L_0x00c2:
            q.h r0 = r9.f3777e
            boolean r4 = r0.f3745j
            r5 = 0
            r6 = 2
            if (r4 == 0) goto L_0x0243
            p.e r7 = r9.f3774b
            boolean r8 = r7.f3650a
            if (r8 == 0) goto L_0x0243
            p.d[] r0 = r7.R
            r4 = r0[r6]
            p.d r4 = r4.f3637f
            if (r4 == 0) goto L_0x015a
            r4 = r0[r1]
            p.d r4 = r4.f3637f
            if (r4 == 0) goto L_0x015a
            boolean r0 = r7.B()
            if (r0 == 0) goto L_0x0102
            q.g r0 = r9.f3780h
            p.e r2 = r9.f3774b
            p.d[] r2 = r2.R
            r2 = r2[r6]
            int r2 = r2.d()
            r0.f3741f = r2
            q.g r0 = r9.f3781i
            p.e r2 = r9.f3774b
            p.d[] r2 = r2.R
            r1 = r2[r1]
            int r1 = r1.d()
            int r1 = -r1
            r0.f3741f = r1
            goto L_0x0153
        L_0x0102:
            p.e r0 = r9.f3774b
            p.d[] r0 = r0.R
            r0 = r0[r6]
            q.g r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0126
            q.g r3 = r9.f3780h
            p.e r4 = r9.f3774b
            p.d[] r4 = r4.R
            r4 = r4[r6]
            int r4 = r4.d()
            java.util.List<q.g> r5 = r3.f3747l
            r5.add(r0)
            r3.f3741f = r4
            java.util.List<q.d> r0 = r0.f3746k
            r0.add(r3)
        L_0x0126:
            p.e r0 = r9.f3774b
            p.d[] r0 = r0.R
            r0 = r0[r1]
            q.g r0 = r9.h(r0)
            if (r0 == 0) goto L_0x014b
            q.g r3 = r9.f3781i
            p.e r4 = r9.f3774b
            p.d[] r4 = r4.R
            r1 = r4[r1]
            int r1 = r1.d()
            int r1 = -r1
            java.util.List<q.g> r4 = r3.f3747l
            r4.add(r0)
            r3.f3741f = r1
            java.util.List<q.d> r0 = r0.f3746k
            r0.add(r3)
        L_0x014b:
            q.g r0 = r9.f3780h
            r0.f3737b = r2
            q.g r0 = r9.f3781i
            r0.f3737b = r2
        L_0x0153:
            p.e r0 = r9.f3774b
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x0438
            goto L_0x0191
        L_0x015a:
            r2 = r0[r6]
            p.d r2 = r2.f3637f
            if (r2 == 0) goto L_0x0197
            r0 = r0[r6]
            q.g r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0438
            q.g r1 = r9.f3780h
            p.e r2 = r9.f3774b
            p.d[] r2 = r2.R
            r2 = r2[r6]
            int r2 = r2.d()
            java.util.List<q.g> r3 = r1.f3747l
            r3.add(r0)
            r1.f3741f = r2
            java.util.List<q.d> r0 = r0.f3746k
            r0.add(r1)
            q.g r0 = r9.f3781i
            q.g r1 = r9.f3780h
            q.h r2 = r9.f3777e
            int r2 = r2.f3742g
            r9.b(r0, r1, r2)
            p.e r0 = r9.f3774b
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x0438
        L_0x0191:
            q.g r1 = r9.f3765k
            q.g r2 = r9.f3780h
            goto L_0x023c
        L_0x0197:
            r2 = r0[r1]
            p.d r2 = r2.f3637f
            if (r2 == 0) goto L_0x01d1
            r0 = r0[r1]
            q.g r0 = r9.h(r0)
            if (r0 == 0) goto L_0x01ca
            q.g r2 = r9.f3781i
            p.e r3 = r9.f3774b
            p.d[] r3 = r3.R
            r1 = r3[r1]
            int r1 = r1.d()
            int r1 = -r1
            java.util.List<q.g> r3 = r2.f3747l
            r3.add(r0)
            r2.f3741f = r1
            java.util.List<q.d> r0 = r0.f3746k
            r0.add(r2)
            q.g r0 = r9.f3780h
            q.g r1 = r9.f3781i
            q.h r2 = r9.f3777e
            int r2 = r2.f3742g
            int r2 = -r2
            r9.b(r0, r1, r2)
        L_0x01ca:
            p.e r0 = r9.f3774b
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x0438
            goto L_0x0191
        L_0x01d1:
            r1 = r0[r3]
            p.d r1 = r1.f3637f
            if (r1 == 0) goto L_0x0206
            r0 = r0[r3]
            q.g r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0438
            q.g r1 = r9.f3765k
            java.util.List<q.g> r2 = r1.f3747l
            r2.add(r0)
            r1.f3741f = r5
            java.util.List<q.d> r0 = r0.f3746k
            r0.add(r1)
            q.g r0 = r9.f3780h
            q.g r1 = r9.f3765k
            p.e r2 = r9.f3774b
            int r2 = r2.f3655c0
            int r2 = -r2
            r9.b(r0, r1, r2)
            q.g r0 = r9.f3781i
            q.g r1 = r9.f3780h
            q.h r2 = r9.f3777e
            int r2 = r2.f3742g
            r9.b(r0, r1, r2)
            goto L_0x0438
        L_0x0206:
            boolean r0 = r7 instanceof p.h
            if (r0 != 0) goto L_0x0438
            p.e r0 = r7.V
            if (r0 == 0) goto L_0x0438
            p.d$a r0 = p.d.a.CENTER
            p.d r0 = r7.i(r0)
            p.d r0 = r0.f3637f
            if (r0 != 0) goto L_0x0438
            p.e r0 = r9.f3774b
            p.e r1 = r0.V
            q.o r1 = r1.f3658e
            q.g r1 = r1.f3780h
            q.g r2 = r9.f3780h
            int r0 = r0.w()
            r9.b(r2, r1, r0)
            q.g r0 = r9.f3781i
            q.g r1 = r9.f3780h
            q.h r2 = r9.f3777e
            int r2 = r2.f3742g
            r9.b(r0, r1, r2)
            p.e r0 = r9.f3774b
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x0438
            goto L_0x0191
        L_0x023c:
            int r0 = r0.f3655c0
            r9.b(r1, r2, r0)
            goto L_0x0438
        L_0x0243:
            if (r4 != 0) goto L_0x0297
            int r4 = r9.f3776d
            if (r4 != r1) goto L_0x0297
            p.e r4 = r9.f3774b
            int r7 = r4.f3685s
            if (r7 == r6) goto L_0x026d
            if (r7 == r1) goto L_0x0252
            goto L_0x02a3
        L_0x0252:
            boolean r0 = r4.B()
            if (r0 != 0) goto L_0x02a3
            p.e r0 = r9.f3774b
            int r4 = r0.f3684r
            if (r4 != r1) goto L_0x025f
            goto L_0x02a3
        L_0x025f:
            q.m r0 = r0.f3656d
            q.h r0 = r0.f3777e
            q.h r4 = r9.f3777e
            java.util.List<q.g> r4 = r4.f3747l
            r4.add(r0)
            java.util.List<q.d> r0 = r0.f3746k
            goto L_0x027d
        L_0x026d:
            p.e r4 = r4.V
            if (r4 != 0) goto L_0x0272
            goto L_0x02a3
        L_0x0272:
            q.o r4 = r4.f3658e
            q.h r4 = r4.f3777e
            java.util.List<q.g> r0 = r0.f3747l
            r0.add(r4)
            java.util.List<q.d> r0 = r4.f3746k
        L_0x027d:
            q.h r4 = r9.f3777e
            r0.add(r4)
            q.h r0 = r9.f3777e
            r0.f3737b = r2
            java.util.List<q.d> r0 = r0.f3746k
            q.g r4 = r9.f3780h
            r0.add(r4)
            q.h r0 = r9.f3777e
            java.util.List<q.d> r0 = r0.f3746k
            q.g r4 = r9.f3781i
            r0.add(r4)
            goto L_0x02a3
        L_0x0297:
            java.util.List<q.d> r4 = r0.f3746k
            r4.add(r9)
            boolean r0 = r0.f3745j
            if (r0 == 0) goto L_0x02a3
            r9.a(r9)
        L_0x02a3:
            p.e r0 = r9.f3774b
            p.d[] r4 = r0.R
            r7 = r4[r6]
            p.d r7 = r7.f3637f
            if (r7 == 0) goto L_0x0311
            r7 = r4[r1]
            p.d r7 = r7.f3637f
            if (r7 == 0) goto L_0x0311
            boolean r0 = r0.B()
            if (r0 == 0) goto L_0x02d7
            q.g r0 = r9.f3780h
            p.e r3 = r9.f3774b
            p.d[] r3 = r3.R
            r3 = r3[r6]
            int r3 = r3.d()
            r0.f3741f = r3
            q.g r0 = r9.f3781i
            p.e r3 = r9.f3774b
            p.d[] r3 = r3.R
            r1 = r3[r1]
            int r1 = r1.d()
            int r1 = -r1
            r0.f3741f = r1
            goto L_0x0309
        L_0x02d7:
            p.e r0 = r9.f3774b
            p.d[] r0 = r0.R
            r0 = r0[r6]
            q.g r0 = r9.h(r0)
            p.e r4 = r9.f3774b
            p.d[] r4 = r4.R
            r1 = r4[r1]
            q.g r1 = r9.h(r1)
            if (r0 == 0) goto L_0x02f9
            java.util.List<q.d> r4 = r0.f3746k
            r4.add(r9)
            boolean r0 = r0.f3745j
            if (r0 == 0) goto L_0x02f9
            r9.a(r9)
        L_0x02f9:
            if (r1 == 0) goto L_0x0307
            java.util.List<q.d> r0 = r1.f3746k
            r0.add(r9)
            boolean r0 = r1.f3745j
            if (r0 == 0) goto L_0x0307
            r9.a(r9)
        L_0x0307:
            r9.f3782j = r3
        L_0x0309:
            p.e r0 = r9.f3774b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x042a
            goto L_0x039b
        L_0x0311:
            r7 = r4[r6]
            p.d r7 = r7.f3637f
            r8 = 0
            if (r7 == 0) goto L_0x0364
            r0 = r4[r6]
            q.g r0 = r9.h(r0)
            if (r0 == 0) goto L_0x042a
            q.g r3 = r9.f3780h
            p.e r4 = r9.f3774b
            p.d[] r4 = r4.R
            r4 = r4[r6]
            int r4 = r4.d()
            java.util.List<q.g> r5 = r3.f3747l
            r5.add(r0)
            r3.f3741f = r4
            java.util.List<q.d> r0 = r0.f3746k
            r0.add(r3)
            q.g r0 = r9.f3781i
            q.g r3 = r9.f3780h
            q.h r4 = r9.f3777e
            r9.c(r0, r3, r2, r4)
            p.e r0 = r9.f3774b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0350
            q.g r0 = r9.f3765k
            q.g r3 = r9.f3780h
            q.h r4 = r9.f3766l
            r9.c(r0, r3, r2, r4)
        L_0x0350:
            int r0 = r9.f3776d
            if (r0 != r1) goto L_0x042a
            p.e r0 = r9.f3774b
            float r3 = r0.Y
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x042a
            q.m r0 = r0.f3656d
            int r3 = r0.f3776d
            if (r3 != r1) goto L_0x042a
            goto L_0x0410
        L_0x0364:
            r6 = r4[r1]
            p.d r6 = r6.f3637f
            r7 = -1
            if (r6 == 0) goto L_0x03a2
            r0 = r4[r1]
            q.g r0 = r9.h(r0)
            if (r0 == 0) goto L_0x042a
            q.g r3 = r9.f3781i
            p.e r4 = r9.f3774b
            p.d[] r4 = r4.R
            r1 = r4[r1]
            int r1 = r1.d()
            int r1 = -r1
            java.util.List<q.g> r4 = r3.f3747l
            r4.add(r0)
            r3.f3741f = r1
            java.util.List<q.d> r0 = r0.f3746k
            r0.add(r3)
            q.g r0 = r9.f3780h
            q.g r1 = r9.f3781i
            q.h r3 = r9.f3777e
            r9.c(r0, r1, r7, r3)
            p.e r0 = r9.f3774b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x042a
        L_0x039b:
            q.g r0 = r9.f3765k
            q.g r1 = r9.f3780h
            q.h r3 = r9.f3766l
            goto L_0x03cd
        L_0x03a2:
            r6 = r4[r3]
            p.d r6 = r6.f3637f
            if (r6 == 0) goto L_0x03d1
            r0 = r4[r3]
            q.g r0 = r9.h(r0)
            if (r0 == 0) goto L_0x042a
            q.g r1 = r9.f3765k
            java.util.List<q.g> r3 = r1.f3747l
            r3.add(r0)
            r1.f3741f = r5
            java.util.List<q.d> r0 = r0.f3746k
            r0.add(r1)
            q.g r0 = r9.f3780h
            q.g r1 = r9.f3765k
            q.h r3 = r9.f3766l
            r9.c(r0, r1, r7, r3)
            q.g r0 = r9.f3781i
            q.g r1 = r9.f3780h
            q.h r3 = r9.f3777e
        L_0x03cd:
            r9.c(r0, r1, r2, r3)
            goto L_0x042a
        L_0x03d1:
            boolean r3 = r0 instanceof p.h
            if (r3 != 0) goto L_0x042a
            p.e r3 = r0.V
            if (r3 == 0) goto L_0x042a
            q.o r3 = r3.f3658e
            q.g r3 = r3.f3780h
            q.g r4 = r9.f3780h
            int r0 = r0.w()
            r9.b(r4, r3, r0)
            q.g r0 = r9.f3781i
            q.g r3 = r9.f3780h
            q.h r4 = r9.f3777e
            r9.c(r0, r3, r2, r4)
            p.e r0 = r9.f3774b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x03fe
            q.g r0 = r9.f3765k
            q.g r3 = r9.f3780h
            q.h r4 = r9.f3766l
            r9.c(r0, r3, r2, r4)
        L_0x03fe:
            int r0 = r9.f3776d
            if (r0 != r1) goto L_0x042a
            p.e r0 = r9.f3774b
            float r3 = r0.Y
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x042a
            q.m r0 = r0.f3656d
            int r3 = r0.f3776d
            if (r3 != r1) goto L_0x042a
        L_0x0410:
            q.h r0 = r0.f3777e
            java.util.List<q.d> r0 = r0.f3746k
            q.h r1 = r9.f3777e
            r0.add(r1)
            q.h r0 = r9.f3777e
            java.util.List<q.g> r0 = r0.f3747l
            p.e r1 = r9.f3774b
            q.m r1 = r1.f3656d
            q.h r1 = r1.f3777e
            r0.add(r1)
            q.h r0 = r9.f3777e
            r0.f3736a = r9
        L_0x042a:
            q.h r0 = r9.f3777e
            java.util.List<q.g> r0 = r0.f3747l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0438
            q.h r0 = r9.f3777e
            r0.f3738c = r2
        L_0x0438:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.o.d():void");
    }

    public void e() {
        g gVar = this.f3780h;
        if (gVar.f3745j) {
            this.f3774b.f3653b0 = gVar.f3742g;
        }
    }

    public void f() {
        this.f3775c = null;
        this.f3780h.b();
        this.f3781i.b();
        this.f3765k.b();
        this.f3777e.b();
        this.f3779g = false;
    }

    public boolean k() {
        return this.f3776d != 3 || this.f3774b.f3685s == 0;
    }

    public void m() {
        this.f3779g = false;
        this.f3780h.b();
        this.f3780h.f3745j = false;
        this.f3781i.b();
        this.f3781i.f3745j = false;
        this.f3765k.b();
        this.f3765k.f3745j = false;
        this.f3777e.f3745j = false;
    }

    public String toString() {
        StringBuilder a2 = a.a("VerticalRun ");
        a2.append(this.f3774b.f3669j0);
        return a2.toString();
    }
}
