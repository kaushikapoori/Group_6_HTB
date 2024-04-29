package q;

import p.e;
import p.f;
import q.b;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public static b.a f3758a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    public static int f3759b;

    /* renamed from: c  reason: collision with root package name */
    public static int f3760c;

    public static boolean a(e eVar) {
        int m2 = eVar.m();
        int t2 = eVar.t();
        e eVar2 = eVar.V;
        f fVar = eVar2 != null ? (f) eVar2 : null;
        if (fVar != null) {
            fVar.m();
        }
        if (fVar != null) {
            fVar.t();
        }
        boolean z2 = m2 == 1 || eVar.D() || m2 == 2 || (m2 == 3 && eVar.f3684r == 0 && eVar.Y == 0.0f && eVar.x(0)) || (m2 == 3 && eVar.f3684r == 1 && eVar.y(0, eVar.u()));
        boolean z3 = t2 == 1 || eVar.E() || t2 == 2 || (t2 == 3 && eVar.f3685s == 0 && eVar.Y == 0.0f && eVar.x(1)) || (t2 == 3 && eVar.f3685s == 1 && eVar.y(1, eVar.l()));
        if (eVar.Y <= 0.0f || (!z2 && !z3)) {
            return z2 && z3;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r5 = r13.L.f3637f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r4 = r4.f3637f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(int r17, p.e r18, q.b.C0046b r19, boolean r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f3674m
            if (r3 == 0) goto L_0x000b
            return
        L_0x000b:
            int r3 = f3759b
            r4 = 1
            int r3 = r3 + r4
            f3759b = r3
            boolean r3 = r0 instanceof p.f
            r5 = 0
            if (r3 != 0) goto L_0x002a
            boolean r3 = r18.C()
            if (r3 == 0) goto L_0x002a
            boolean r3 = a(r18)
            if (r3 == 0) goto L_0x002a
            q.b$a r3 = new q.b$a
            r3.<init>()
            p.f.e0(r0, r1, r3, r5)
        L_0x002a:
            p.d$a r3 = p.d.a.LEFT
            p.d r3 = r0.i(r3)
            p.d$a r6 = p.d.a.RIGHT
            p.d r6 = r0.i(r6)
            int r7 = r3.c()
            int r8 = r6.c()
            java.util.HashSet<p.d> r9 = r3.f3632a
            r10 = 0
            r11 = 8
            r12 = 3
            if (r9 == 0) goto L_0x0113
            boolean r3 = r3.f3634c
            if (r3 == 0) goto L_0x0113
            java.util.Iterator r3 = r9.iterator()
        L_0x004e:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0113
            java.lang.Object r9 = r3.next()
            p.d r9 = (p.d) r9
            p.e r13 = r9.f3635d
            int r14 = r17 + 1
            boolean r15 = a(r13)
            boolean r16 = r13.C()
            if (r16 == 0) goto L_0x0072
            if (r15 == 0) goto L_0x0072
            q.b$a r4 = new q.b$a
            r4.<init>()
            p.f.e0(r13, r1, r4, r5)
        L_0x0072:
            p.d r4 = r13.J
            if (r9 != r4) goto L_0x0080
            p.d r5 = r13.L
            p.d r5 = r5.f3637f
            if (r5 == 0) goto L_0x0080
            boolean r5 = r5.f3634c
            if (r5 != 0) goto L_0x008c
        L_0x0080:
            p.d r5 = r13.L
            if (r9 != r5) goto L_0x008e
            p.d r4 = r4.f3637f
            if (r4 == 0) goto L_0x008e
            boolean r4 = r4.f3634c
            if (r4 == 0) goto L_0x008e
        L_0x008c:
            r4 = 1
            goto L_0x008f
        L_0x008e:
            r4 = 0
        L_0x008f:
            int r5 = r13.m()
            if (r5 != r12) goto L_0x00ca
            if (r15 == 0) goto L_0x0098
            goto L_0x00ca
        L_0x0098:
            int r5 = r13.m()
            if (r5 != r12) goto L_0x010f
            int r5 = r13.f3688v
            if (r5 < 0) goto L_0x010f
            int r5 = r13.f3687u
            if (r5 < 0) goto L_0x010f
            int r5 = r13.f3667i0
            if (r5 == r11) goto L_0x00b4
            int r5 = r13.f3684r
            if (r5 != 0) goto L_0x010f
            float r5 = r13.Y
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x010f
        L_0x00b4:
            boolean r5 = r13.A()
            if (r5 != 0) goto L_0x010f
            boolean r5 = r13.G
            if (r5 != 0) goto L_0x010f
            if (r4 == 0) goto L_0x010f
            boolean r4 = r13.A()
            if (r4 != 0) goto L_0x010f
            d(r14, r0, r1, r13, r2)
            goto L_0x010f
        L_0x00ca:
            boolean r5 = r13.C()
            if (r5 == 0) goto L_0x00d1
            goto L_0x010f
        L_0x00d1:
            p.d r5 = r13.J
            if (r9 != r5) goto L_0x00e9
            p.d r15 = r13.L
            p.d r15 = r15.f3637f
            if (r15 != 0) goto L_0x00e9
            int r4 = r5.d()
            int r4 = r4 + r7
            int r5 = r13.u()
            int r5 = r5 + r4
            r13.L(r4, r5)
            goto L_0x0100
        L_0x00e9:
            p.d r15 = r13.L
            if (r9 != r15) goto L_0x0104
            p.d r5 = r5.f3637f
            if (r5 != 0) goto L_0x0104
            int r4 = r15.d()
            int r4 = r7 - r4
            int r5 = r13.u()
            int r5 = r4 - r5
            r13.L(r5, r4)
        L_0x0100:
            b(r14, r13, r1, r2)
            goto L_0x010f
        L_0x0104:
            if (r4 == 0) goto L_0x010f
            boolean r4 = r13.A()
            if (r4 != 0) goto L_0x010f
            c(r14, r1, r13, r2)
        L_0x010f:
            r4 = 1
            r5 = 0
            goto L_0x004e
        L_0x0113:
            boolean r3 = r0 instanceof p.g
            if (r3 == 0) goto L_0x0118
            return
        L_0x0118:
            java.util.HashSet<p.d> r3 = r6.f3632a
            if (r3 == 0) goto L_0x01ed
            boolean r4 = r6.f3634c
            if (r4 == 0) goto L_0x01ed
            java.util.Iterator r3 = r3.iterator()
        L_0x0124:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01ed
            java.lang.Object r4 = r3.next()
            p.d r4 = (p.d) r4
            p.e r5 = r4.f3635d
            r6 = 1
            int r7 = r17 + 1
            boolean r6 = a(r5)
            boolean r9 = r5.C()
            if (r9 == 0) goto L_0x014b
            if (r6 == 0) goto L_0x014b
            q.b$a r9 = new q.b$a
            r9.<init>()
            r13 = 0
            p.f.e0(r5, r1, r9, r13)
            goto L_0x014c
        L_0x014b:
            r13 = 0
        L_0x014c:
            p.d r9 = r5.J
            if (r4 != r9) goto L_0x015a
            p.d r14 = r5.L
            p.d r14 = r14.f3637f
            if (r14 == 0) goto L_0x015a
            boolean r14 = r14.f3634c
            if (r14 != 0) goto L_0x0166
        L_0x015a:
            p.d r14 = r5.L
            if (r4 != r14) goto L_0x0168
            p.d r9 = r9.f3637f
            if (r9 == 0) goto L_0x0168
            boolean r9 = r9.f3634c
            if (r9 == 0) goto L_0x0168
        L_0x0166:
            r9 = 1
            goto L_0x0169
        L_0x0168:
            r9 = 0
        L_0x0169:
            int r14 = r5.m()
            if (r14 != r12) goto L_0x01a4
            if (r6 == 0) goto L_0x0172
            goto L_0x01a4
        L_0x0172:
            int r4 = r5.m()
            if (r4 != r12) goto L_0x0124
            int r4 = r5.f3688v
            if (r4 < 0) goto L_0x0124
            int r4 = r5.f3687u
            if (r4 < 0) goto L_0x0124
            int r4 = r5.f3667i0
            if (r4 == r11) goto L_0x018e
            int r4 = r5.f3684r
            if (r4 != 0) goto L_0x0124
            float r4 = r5.Y
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x0124
        L_0x018e:
            boolean r4 = r5.A()
            if (r4 != 0) goto L_0x0124
            boolean r4 = r5.G
            if (r4 != 0) goto L_0x0124
            if (r9 == 0) goto L_0x0124
            boolean r4 = r5.A()
            if (r4 != 0) goto L_0x0124
            d(r7, r0, r1, r5, r2)
            goto L_0x0124
        L_0x01a4:
            boolean r6 = r5.C()
            if (r6 == 0) goto L_0x01ac
            goto L_0x0124
        L_0x01ac:
            p.d r6 = r5.J
            if (r4 != r6) goto L_0x01c4
            p.d r14 = r5.L
            p.d r14 = r14.f3637f
            if (r14 != 0) goto L_0x01c4
            int r4 = r6.d()
            int r4 = r4 + r8
            int r6 = r5.u()
            int r6 = r6 + r4
            r5.L(r4, r6)
            goto L_0x01db
        L_0x01c4:
            p.d r14 = r5.L
            if (r4 != r14) goto L_0x01e0
            p.d r4 = r6.f3637f
            if (r4 != 0) goto L_0x01e0
            int r4 = r14.d()
            int r4 = r8 - r4
            int r6 = r5.u()
            int r6 = r4 - r6
            r5.L(r6, r4)
        L_0x01db:
            b(r7, r5, r1, r2)
            goto L_0x0124
        L_0x01e0:
            if (r9 == 0) goto L_0x0124
            boolean r4 = r5.A()
            if (r4 != 0) goto L_0x0124
            c(r7, r1, r5, r2)
            goto L_0x0124
        L_0x01ed:
            r1 = 1
            r0.f3674m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.i.b(int, p.e, q.b$b, boolean):void");
    }

    public static void c(int i2, b.C0046b bVar, e eVar, boolean z2) {
        float f2 = eVar.f3661f0;
        int c2 = eVar.J.f3637f.c();
        int c3 = eVar.L.f3637f.c();
        int d2 = eVar.J.d() + c2;
        int d3 = c3 - eVar.L.d();
        if (c2 == c3) {
            f2 = 0.5f;
        } else {
            c2 = d2;
            c3 = d3;
        }
        int u2 = eVar.u();
        int i3 = (c3 - c2) - u2;
        if (c2 > c3) {
            i3 = (c2 - c3) - u2;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * ((float) i3)) + 0.5f : f2 * ((float) i3))) + c2;
        int i5 = i4 + u2;
        if (c2 > c3) {
            i5 = i4 - u2;
        }
        eVar.L(i4, i5);
        b(i2 + 1, eVar, bVar, z2);
    }

    public static void d(int i2, e eVar, b.C0046b bVar, e eVar2, boolean z2) {
        float f2 = eVar2.f3661f0;
        int d2 = eVar2.J.d() + eVar2.J.f3637f.c();
        int c2 = eVar2.L.f3637f.c() - eVar2.L.d();
        if (c2 >= d2) {
            int u2 = eVar2.u();
            if (eVar2.f3667i0 != 8) {
                int i3 = eVar2.f3684r;
                if (i3 == 2) {
                    if (!(eVar instanceof f)) {
                        eVar = eVar.V;
                    }
                    u2 = (int) (eVar2.f3661f0 * 0.5f * ((float) eVar.u()));
                } else if (i3 == 0) {
                    u2 = c2 - d2;
                }
                u2 = Math.max(eVar2.f3687u, u2);
                int i4 = eVar2.f3688v;
                if (i4 > 0) {
                    u2 = Math.min(i4, u2);
                }
            }
            int i5 = d2 + ((int) ((f2 * ((float) ((c2 - d2) - u2))) + 0.5f));
            eVar2.L(i5, u2 + i5);
            b(i2 + 1, eVar2, bVar, z2);
        }
    }

    public static void e(int i2, b.C0046b bVar, e eVar) {
        float f2 = eVar.f3663g0;
        int c2 = eVar.K.f3637f.c();
        int c3 = eVar.M.f3637f.c();
        int d2 = eVar.K.d() + c2;
        int d3 = c3 - eVar.M.d();
        if (c2 == c3) {
            f2 = 0.5f;
        } else {
            c2 = d2;
            c3 = d3;
        }
        int l2 = eVar.l();
        int i3 = (c3 - c2) - l2;
        if (c2 > c3) {
            i3 = (c2 - c3) - l2;
        }
        int i4 = (int) (i3 > 0 ? (f2 * ((float) i3)) + 0.5f : f2 * ((float) i3));
        int i5 = c2 + i4;
        int i6 = i5 + l2;
        if (c2 > c3) {
            i5 = c2 - i4;
            i6 = i5 - l2;
        }
        eVar.M(i5, i6);
        g(i2 + 1, eVar, bVar);
    }

    public static void f(int i2, e eVar, b.C0046b bVar, e eVar2) {
        float f2 = eVar2.f3663g0;
        int d2 = eVar2.K.d() + eVar2.K.f3637f.c();
        int c2 = eVar2.M.f3637f.c() - eVar2.M.d();
        if (c2 >= d2) {
            int l2 = eVar2.l();
            if (eVar2.f3667i0 != 8) {
                int i3 = eVar2.f3685s;
                if (i3 == 2) {
                    if (!(eVar instanceof f)) {
                        eVar = eVar.V;
                    }
                    l2 = (int) (f2 * 0.5f * ((float) eVar.l()));
                } else if (i3 == 0) {
                    l2 = c2 - d2;
                }
                l2 = Math.max(eVar2.f3690x, l2);
                int i4 = eVar2.f3691y;
                if (i4 > 0) {
                    l2 = Math.min(i4, l2);
                }
            }
            int i5 = d2 + ((int) ((f2 * ((float) ((c2 - d2) - l2))) + 0.5f));
            eVar2.M(i5, l2 + i5);
            g(i2 + 1, eVar2, bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        r3 = r12.M.f3637f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        r3 = r15.f3637f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(int r16, p.e r17, q.b.C0046b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r0.f3676n
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            int r2 = f3760c
            r3 = 1
            int r2 = r2 + r3
            f3760c = r2
            boolean r2 = r0 instanceof p.f
            r4 = 0
            if (r2 != 0) goto L_0x0028
            boolean r2 = r17.C()
            if (r2 == 0) goto L_0x0028
            boolean r2 = a(r17)
            if (r2 == 0) goto L_0x0028
            q.b$a r2 = new q.b$a
            r2.<init>()
            p.f.e0(r0, r1, r2, r4)
        L_0x0028:
            p.d$a r2 = p.d.a.TOP
            p.d r2 = r0.i(r2)
            p.d$a r5 = p.d.a.BOTTOM
            p.d r5 = r0.i(r5)
            int r6 = r2.c()
            int r7 = r5.c()
            java.util.HashSet<p.d> r8 = r2.f3632a
            r9 = 0
            r10 = 8
            r11 = 3
            if (r8 == 0) goto L_0x0110
            boolean r2 = r2.f3634c
            if (r2 == 0) goto L_0x0110
            java.util.Iterator r2 = r8.iterator()
        L_0x004c:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0110
            java.lang.Object r8 = r2.next()
            p.d r8 = (p.d) r8
            p.e r12 = r8.f3635d
            int r13 = r16 + 1
            boolean r14 = a(r12)
            boolean r15 = r12.C()
            if (r15 == 0) goto L_0x0070
            if (r14 == 0) goto L_0x0070
            q.b$a r15 = new q.b$a
            r15.<init>()
            p.f.e0(r12, r1, r15, r4)
        L_0x0070:
            p.d r15 = r12.K
            if (r8 != r15) goto L_0x007e
            p.d r3 = r12.M
            p.d r3 = r3.f3637f
            if (r3 == 0) goto L_0x007e
            boolean r3 = r3.f3634c
            if (r3 != 0) goto L_0x008a
        L_0x007e:
            p.d r3 = r12.M
            if (r8 != r3) goto L_0x008c
            p.d r3 = r15.f3637f
            if (r3 == 0) goto L_0x008c
            boolean r3 = r3.f3634c
            if (r3 == 0) goto L_0x008c
        L_0x008a:
            r3 = 1
            goto L_0x008d
        L_0x008c:
            r3 = 0
        L_0x008d:
            int r15 = r12.t()
            if (r15 != r11) goto L_0x00c8
            if (r14 == 0) goto L_0x0096
            goto L_0x00c8
        L_0x0096:
            int r8 = r12.t()
            if (r8 != r11) goto L_0x010d
            int r8 = r12.f3691y
            if (r8 < 0) goto L_0x010d
            int r8 = r12.f3690x
            if (r8 < 0) goto L_0x010d
            int r8 = r12.f3667i0
            if (r8 == r10) goto L_0x00b2
            int r8 = r12.f3685s
            if (r8 != 0) goto L_0x010d
            float r8 = r12.Y
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x010d
        L_0x00b2:
            boolean r8 = r12.B()
            if (r8 != 0) goto L_0x010d
            boolean r8 = r12.G
            if (r8 != 0) goto L_0x010d
            if (r3 == 0) goto L_0x010d
            boolean r3 = r12.B()
            if (r3 != 0) goto L_0x010d
            f(r13, r0, r1, r12)
            goto L_0x010d
        L_0x00c8:
            boolean r14 = r12.C()
            if (r14 == 0) goto L_0x00cf
            goto L_0x010d
        L_0x00cf:
            p.d r14 = r12.K
            if (r8 != r14) goto L_0x00e7
            p.d r15 = r12.M
            p.d r15 = r15.f3637f
            if (r15 != 0) goto L_0x00e7
            int r3 = r14.d()
            int r3 = r3 + r6
            int r8 = r12.l()
            int r8 = r8 + r3
            r12.M(r3, r8)
            goto L_0x00fe
        L_0x00e7:
            p.d r15 = r12.M
            if (r8 != r15) goto L_0x0102
            p.d r8 = r14.f3637f
            if (r8 != 0) goto L_0x0102
            int r3 = r15.d()
            int r3 = r6 - r3
            int r8 = r12.l()
            int r8 = r3 - r8
            r12.M(r8, r3)
        L_0x00fe:
            g(r13, r12, r1)
            goto L_0x010d
        L_0x0102:
            if (r3 == 0) goto L_0x010d
            boolean r3 = r12.B()
            if (r3 != 0) goto L_0x010d
            e(r13, r1, r12)
        L_0x010d:
            r3 = 1
            goto L_0x004c
        L_0x0110:
            boolean r2 = r0 instanceof p.g
            if (r2 == 0) goto L_0x0115
            return
        L_0x0115:
            java.util.HashSet<p.d> r2 = r5.f3632a
            if (r2 == 0) goto L_0x01e6
            boolean r3 = r5.f3634c
            if (r3 == 0) goto L_0x01e6
            java.util.Iterator r2 = r2.iterator()
        L_0x0121:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01e6
            java.lang.Object r3 = r2.next()
            p.d r3 = (p.d) r3
            p.e r5 = r3.f3635d
            int r6 = r16 + 1
            boolean r8 = a(r5)
            boolean r12 = r5.C()
            if (r12 == 0) goto L_0x0145
            if (r8 == 0) goto L_0x0145
            q.b$a r12 = new q.b$a
            r12.<init>()
            p.f.e0(r5, r1, r12, r4)
        L_0x0145:
            p.d r12 = r5.K
            if (r3 != r12) goto L_0x0153
            p.d r13 = r5.M
            p.d r13 = r13.f3637f
            if (r13 == 0) goto L_0x0153
            boolean r13 = r13.f3634c
            if (r13 != 0) goto L_0x015f
        L_0x0153:
            p.d r13 = r5.M
            if (r3 != r13) goto L_0x0161
            p.d r12 = r12.f3637f
            if (r12 == 0) goto L_0x0161
            boolean r12 = r12.f3634c
            if (r12 == 0) goto L_0x0161
        L_0x015f:
            r12 = 1
            goto L_0x0162
        L_0x0161:
            r12 = 0
        L_0x0162:
            int r13 = r5.t()
            if (r13 != r11) goto L_0x019d
            if (r8 == 0) goto L_0x016b
            goto L_0x019d
        L_0x016b:
            int r3 = r5.t()
            if (r3 != r11) goto L_0x0121
            int r3 = r5.f3691y
            if (r3 < 0) goto L_0x0121
            int r3 = r5.f3690x
            if (r3 < 0) goto L_0x0121
            int r3 = r5.f3667i0
            if (r3 == r10) goto L_0x0187
            int r3 = r5.f3685s
            if (r3 != 0) goto L_0x0121
            float r3 = r5.Y
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0121
        L_0x0187:
            boolean r3 = r5.B()
            if (r3 != 0) goto L_0x0121
            boolean r3 = r5.G
            if (r3 != 0) goto L_0x0121
            if (r12 == 0) goto L_0x0121
            boolean r3 = r5.B()
            if (r3 != 0) goto L_0x0121
            f(r6, r0, r1, r5)
            goto L_0x0121
        L_0x019d:
            boolean r8 = r5.C()
            if (r8 == 0) goto L_0x01a5
            goto L_0x0121
        L_0x01a5:
            p.d r8 = r5.K
            if (r3 != r8) goto L_0x01bd
            p.d r13 = r5.M
            p.d r13 = r13.f3637f
            if (r13 != 0) goto L_0x01bd
            int r3 = r8.d()
            int r3 = r3 + r7
            int r8 = r5.l()
            int r8 = r8 + r3
            r5.M(r3, r8)
            goto L_0x01d4
        L_0x01bd:
            p.d r13 = r5.M
            if (r3 != r13) goto L_0x01d9
            p.d r3 = r8.f3637f
            if (r3 != 0) goto L_0x01d9
            int r3 = r13.d()
            int r3 = r7 - r3
            int r8 = r5.l()
            int r8 = r3 - r8
            r5.M(r8, r3)
        L_0x01d4:
            g(r6, r5, r1)
            goto L_0x0121
        L_0x01d9:
            if (r12 == 0) goto L_0x0121
            boolean r3 = r5.B()
            if (r3 != 0) goto L_0x0121
            e(r6, r1, r5)
            goto L_0x0121
        L_0x01e6:
            p.d$a r2 = p.d.a.BASELINE
            p.d r2 = r0.i(r2)
            java.util.HashSet<p.d> r3 = r2.f3632a
            if (r3 == 0) goto L_0x0263
            boolean r3 = r2.f3634c
            if (r3 == 0) goto L_0x0263
            int r3 = r2.c()
            java.util.HashSet<p.d> r2 = r2.f3632a
            java.util.Iterator r2 = r2.iterator()
        L_0x01fe:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0263
            java.lang.Object r5 = r2.next()
            p.d r5 = (p.d) r5
            p.e r6 = r5.f3635d
            r7 = 1
            int r8 = r16 + 1
            boolean r7 = a(r6)
            boolean r9 = r6.C()
            if (r9 == 0) goto L_0x0223
            if (r7 == 0) goto L_0x0223
            q.b$a r9 = new q.b$a
            r9.<init>()
            p.f.e0(r6, r1, r9, r4)
        L_0x0223:
            int r9 = r6.t()
            if (r9 != r11) goto L_0x022b
            if (r7 == 0) goto L_0x01fe
        L_0x022b:
            boolean r7 = r6.C()
            if (r7 == 0) goto L_0x0232
            goto L_0x01fe
        L_0x0232:
            p.d r7 = r6.N
            if (r5 != r7) goto L_0x01fe
            int r5 = r5.d()
            int r5 = r5 + r3
            boolean r7 = r6.E
            if (r7 != 0) goto L_0x0240
            goto L_0x025c
        L_0x0240:
            int r7 = r6.f3655c0
            int r7 = r5 - r7
            int r9 = r6.X
            int r9 = r9 + r7
            r6.f3653b0 = r7
            p.d r10 = r6.K
            r10.j(r7)
            p.d r7 = r6.M
            r7.j(r9)
            p.d r7 = r6.N
            r7.f3633b = r5
            r5 = 1
            r7.f3634c = r5
            r6.f3672l = r5
        L_0x025c:
            g(r8, r6, r1)     // Catch:{ all -> 0x0260 }
            goto L_0x01fe
        L_0x0260:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x0263:
            r1 = 1
            r0.f3676n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.i.g(int, p.e, q.b$b):void");
    }
}
