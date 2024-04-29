package p;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import n.d;
import q.b;

public class f extends l {
    public int A0 = 0;
    public int B0 = 0;
    public c[] C0 = new c[4];
    public c[] D0 = new c[4];
    public int E0 = 257;
    public boolean F0 = false;
    public boolean G0 = false;
    public WeakReference<d> H0 = null;
    public WeakReference<d> I0 = null;
    public WeakReference<d> J0 = null;
    public WeakReference<d> K0 = null;
    public HashSet<e> L0 = new HashSet<>();
    public b.a M0 = new b.a();

    /* renamed from: s0  reason: collision with root package name */
    public b f3693s0 = new b(this);

    /* renamed from: t0  reason: collision with root package name */
    public q.f f3694t0 = new q.f(this);

    /* renamed from: u0  reason: collision with root package name */
    public int f3695u0;

    /* renamed from: v0  reason: collision with root package name */
    public b.C0046b f3696v0 = null;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f3697w0 = false;

    /* renamed from: x0  reason: collision with root package name */
    public d f3698x0 = new d();

    /* renamed from: y0  reason: collision with root package name */
    public int f3699y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f3700z0;

    public static boolean e0(e eVar, b.C0046b bVar, b.a aVar, int i2) {
        int i3;
        int i4;
        if (bVar == null) {
            return false;
        }
        if (eVar.f3667i0 == 8 || (eVar instanceof g) || (eVar instanceof a)) {
            aVar.f3720e = 0;
            aVar.f3721f = 0;
            return false;
        }
        aVar.f3716a = eVar.m();
        aVar.f3717b = eVar.t();
        aVar.f3718c = eVar.u();
        aVar.f3719d = eVar.l();
        aVar.f3724i = false;
        aVar.f3725j = i2;
        boolean z2 = aVar.f3716a == 3;
        boolean z3 = aVar.f3717b == 3;
        boolean z4 = z2 && eVar.Y > 0.0f;
        boolean z5 = z3 && eVar.Y > 0.0f;
        if (z2 && eVar.x(0) && eVar.f3684r == 0 && !z4) {
            aVar.f3716a = 2;
            if (z3 && eVar.f3685s == 0) {
                aVar.f3716a = 1;
            }
            z2 = false;
        }
        if (z3 && eVar.x(1) && eVar.f3685s == 0 && !z5) {
            aVar.f3717b = 2;
            if (z2 && eVar.f3684r == 0) {
                aVar.f3717b = 1;
            }
            z3 = false;
        }
        if (eVar.D()) {
            aVar.f3716a = 1;
            z2 = false;
        }
        if (eVar.E()) {
            aVar.f3717b = 1;
            z3 = false;
        }
        if (z4) {
            if (eVar.f3686t[0] == 4) {
                aVar.f3716a = 1;
            } else if (!z3) {
                if (aVar.f3717b == 1) {
                    i4 = aVar.f3719d;
                } else {
                    aVar.f3716a = 2;
                    ((ConstraintLayout.b) bVar).b(eVar, aVar);
                    i4 = aVar.f3721f;
                }
                aVar.f3716a = 1;
                aVar.f3718c = (int) (eVar.Y * ((float) i4));
            }
        }
        if (z5) {
            if (eVar.f3686t[1] == 4) {
                aVar.f3717b = 1;
            } else if (!z2) {
                if (aVar.f3716a == 1) {
                    i3 = aVar.f3718c;
                } else {
                    aVar.f3717b = 2;
                    ((ConstraintLayout.b) bVar).b(eVar, aVar);
                    i3 = aVar.f3720e;
                }
                aVar.f3717b = 1;
                aVar.f3719d = eVar.Z == -1 ? (int) (((float) i3) / eVar.Y) : (int) (eVar.Y * ((float) i3));
            }
        }
        ((ConstraintLayout.b) bVar).b(eVar, aVar);
        eVar.S(aVar.f3720e);
        eVar.N(aVar.f3721f);
        eVar.E = aVar.f3723h;
        eVar.K(aVar.f3722g);
        aVar.f3725j = 0;
        return aVar.f3724i;
    }

    public void F() {
        this.f3698x0.u();
        this.f3699y0 = 0;
        this.f3700z0 = 0;
        super.F();
    }

    public void T(boolean z2, boolean z3) {
        super.T(z2, z3);
        int size = this.f3710r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3710r0.get(i2).T(z2, z3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v64, resolved type: p.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v65, resolved type: p.a} */
    /* JADX WARNING: type inference failed for: r6v4, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x05c0, code lost:
        r0 = false;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x058b  */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x05e8  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:372:0x0628  */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x064d  */
    /* JADX WARNING: Removed duplicated region for block: B:385:0x0658  */
    /* JADX WARNING: Removed duplicated region for block: B:391:0x0675  */
    /* JADX WARNING: Removed duplicated region for block: B:433:0x0772  */
    /* JADX WARNING: Removed duplicated region for block: B:445:0x07b9  */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x07e6 A[LOOP:32: B:455:0x07e4->B:456:0x07e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x084e  */
    /* JADX WARNING: Removed duplicated region for block: B:469:0x085c  */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x086f  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x087a  */
    /* JADX WARNING: Removed duplicated region for block: B:475:0x087e  */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x08b8  */
    /* JADX WARNING: Removed duplicated region for block: B:490:0x08be  */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x08cb  */
    /* JADX WARNING: Removed duplicated region for block: B:582:0x08c0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void V() {
        /*
            r26 = this;
            r1 = r26
            r2 = 0
            r1.f3651a0 = r2
            r1.f3653b0 = r2
            r1.F0 = r2
            r1.G0 = r2
            java.util.ArrayList<p.e> r0 = r1.f3710r0
            int r3 = r0.size()
            int r0 = r26.u()
            int r0 = java.lang.Math.max(r2, r0)
            int r4 = r26.l()
            int r4 = java.lang.Math.max(r2, r4)
            int[] r5 = r1.U
            r6 = 1
            r7 = r5[r6]
            r5 = r5[r2]
            int r8 = r1.f3695u0
            r9 = -1
            if (r8 != 0) goto L_0x0239
            int r8 = r1.E0
            boolean r8 = p.j.b(r8, r6)
            if (r8 == 0) goto L_0x0239
            q.b$b r8 = r1.f3696v0
            int r11 = r26.m()
            int r12 = r26.t()
            q.i.f3759b = r2
            q.i.f3760c = r2
            r26.G()
            java.util.ArrayList<p.e> r13 = r1.f3710r0
            int r14 = r13.size()
            r15 = 0
        L_0x004d:
            if (r15 >= r14) goto L_0x005b
            java.lang.Object r16 = r13.get(r15)
            p.e r16 = (p.e) r16
            r16.G()
            int r15 = r15 + 1
            goto L_0x004d
        L_0x005b:
            boolean r15 = r1.f3697w0
            if (r11 != r6) goto L_0x0067
            int r11 = r26.u()
            r1.L(r2, r11)
            goto L_0x006f
        L_0x0067:
            p.d r11 = r1.J
            r11.f3633b = r2
            r11.f3634c = r6
            r1.f3651a0 = r2
        L_0x006f:
            r11 = 0
            r16 = 0
            r17 = 0
        L_0x0074:
            r18 = 1056964608(0x3f000000, float:0.5)
            if (r11 >= r14) goto L_0x00cc
            java.lang.Object r19 = r13.get(r11)
            r10 = r19
            p.e r10 = (p.e) r10
            boolean r2 = r10 instanceof p.g
            if (r2 == 0) goto L_0x00b9
            p.g r10 = (p.g) r10
            int r2 = r10.f3705v0
            if (r2 != r6) goto L_0x00c7
            int r2 = r10.f3702s0
            if (r2 == r9) goto L_0x008f
            goto L_0x00b3
        L_0x008f:
            int r2 = r10.f3703t0
            if (r2 == r9) goto L_0x00a1
            boolean r2 = r26.D()
            if (r2 == 0) goto L_0x00a1
            int r2 = r26.u()
            int r9 = r10.f3703t0
            int r2 = r2 - r9
            goto L_0x00b3
        L_0x00a1:
            boolean r2 = r26.D()
            if (r2 == 0) goto L_0x00b6
            float r2 = r10.f3701r0
            int r9 = r26.u()
            float r9 = (float) r9
            float r2 = r2 * r9
            float r2 = r2 + r18
            int r2 = (int) r2
        L_0x00b3:
            r10.V(r2)
        L_0x00b6:
            r16 = 1
            goto L_0x00c7
        L_0x00b9:
            boolean r2 = r10 instanceof p.a
            if (r2 == 0) goto L_0x00c7
            p.a r10 = (p.a) r10
            int r2 = r10.X()
            if (r2 != 0) goto L_0x00c7
            r17 = 1
        L_0x00c7:
            int r11 = r11 + 1
            r2 = 0
            r9 = -1
            goto L_0x0074
        L_0x00cc:
            if (r16 == 0) goto L_0x00ea
            r2 = 0
        L_0x00cf:
            if (r2 >= r14) goto L_0x00ea
            java.lang.Object r9 = r13.get(r2)
            p.e r9 = (p.e) r9
            boolean r10 = r9 instanceof p.g
            if (r10 == 0) goto L_0x00e6
            p.g r9 = (p.g) r9
            int r10 = r9.f3705v0
            if (r10 != r6) goto L_0x00e6
            r10 = 0
            q.i.b(r10, r9, r8, r15)
            goto L_0x00e7
        L_0x00e6:
            r10 = 0
        L_0x00e7:
            int r2 = r2 + 1
            goto L_0x00cf
        L_0x00ea:
            r10 = 0
            q.i.b(r10, r1, r8, r15)
            if (r17 == 0) goto L_0x0111
            r2 = 0
        L_0x00f1:
            if (r2 >= r14) goto L_0x0111
            java.lang.Object r9 = r13.get(r2)
            p.e r9 = (p.e) r9
            boolean r10 = r9 instanceof p.a
            if (r10 == 0) goto L_0x010e
            p.a r9 = (p.a) r9
            int r10 = r9.X()
            if (r10 != 0) goto L_0x010e
            boolean r10 = r9.W()
            if (r10 == 0) goto L_0x010e
            q.i.b(r6, r9, r8, r15)
        L_0x010e:
            int r2 = r2 + 1
            goto L_0x00f1
        L_0x0111:
            if (r12 != r6) goto L_0x011c
            int r2 = r26.l()
            r9 = 0
            r1.M(r9, r2)
            goto L_0x0125
        L_0x011c:
            r9 = 0
            p.d r2 = r1.K
            r2.f3633b = r9
            r2.f3634c = r6
            r1.f3653b0 = r9
        L_0x0125:
            r2 = 0
            r9 = 0
            r10 = 0
        L_0x0128:
            if (r2 >= r14) goto L_0x0179
            java.lang.Object r11 = r13.get(r2)
            p.e r11 = (p.e) r11
            boolean r12 = r11 instanceof p.g
            if (r12 == 0) goto L_0x0169
            p.g r11 = (p.g) r11
            int r12 = r11.f3705v0
            if (r12 != 0) goto L_0x0176
            int r9 = r11.f3702s0
            r12 = -1
            if (r9 == r12) goto L_0x0140
            goto L_0x0164
        L_0x0140:
            int r9 = r11.f3703t0
            if (r9 == r12) goto L_0x0152
            boolean r9 = r26.E()
            if (r9 == 0) goto L_0x0152
            int r9 = r26.l()
            int r12 = r11.f3703t0
            int r9 = r9 - r12
            goto L_0x0164
        L_0x0152:
            boolean r9 = r26.E()
            if (r9 == 0) goto L_0x0167
            float r9 = r11.f3701r0
            int r12 = r26.l()
            float r12 = (float) r12
            float r9 = r9 * r12
            float r9 = r9 + r18
            int r9 = (int) r9
        L_0x0164:
            r11.V(r9)
        L_0x0167:
            r9 = 1
            goto L_0x0176
        L_0x0169:
            boolean r12 = r11 instanceof p.a
            if (r12 == 0) goto L_0x0176
            p.a r11 = (p.a) r11
            int r11 = r11.X()
            if (r11 != r6) goto L_0x0176
            r10 = 1
        L_0x0176:
            int r2 = r2 + 1
            goto L_0x0128
        L_0x0179:
            if (r9 == 0) goto L_0x0194
            r2 = 0
        L_0x017c:
            if (r2 >= r14) goto L_0x0194
            java.lang.Object r9 = r13.get(r2)
            p.e r9 = (p.e) r9
            boolean r11 = r9 instanceof p.g
            if (r11 == 0) goto L_0x0191
            p.g r9 = (p.g) r9
            int r11 = r9.f3705v0
            if (r11 != 0) goto L_0x0191
            q.i.g(r6, r9, r8)
        L_0x0191:
            int r2 = r2 + 1
            goto L_0x017c
        L_0x0194:
            r2 = 0
            q.i.g(r2, r1, r8)
            if (r10 == 0) goto L_0x01bb
            r2 = 0
        L_0x019b:
            if (r2 >= r14) goto L_0x01bb
            java.lang.Object r9 = r13.get(r2)
            p.e r9 = (p.e) r9
            boolean r10 = r9 instanceof p.a
            if (r10 == 0) goto L_0x01b8
            p.a r9 = (p.a) r9
            int r10 = r9.X()
            if (r10 != r6) goto L_0x01b8
            boolean r10 = r9.W()
            if (r10 == 0) goto L_0x01b8
            q.i.g(r6, r9, r8)
        L_0x01b8:
            int r2 = r2 + 1
            goto L_0x019b
        L_0x01bb:
            r2 = 0
        L_0x01bc:
            if (r2 >= r14) goto L_0x01ef
            java.lang.Object r9 = r13.get(r2)
            p.e r9 = (p.e) r9
            boolean r10 = r9.C()
            if (r10 == 0) goto L_0x01ec
            boolean r10 = q.i.a(r9)
            if (r10 == 0) goto L_0x01ec
            q.b$a r10 = q.i.f3758a
            r11 = 0
            e0(r9, r8, r10, r11)
            boolean r10 = r9 instanceof p.g
            if (r10 == 0) goto L_0x01e6
            r10 = r9
            p.g r10 = (p.g) r10
            int r10 = r10.f3705v0
            if (r10 != 0) goto L_0x01e2
            goto L_0x01e9
        L_0x01e2:
            q.i.b(r11, r9, r8, r15)
            goto L_0x01ec
        L_0x01e6:
            q.i.b(r11, r9, r8, r15)
        L_0x01e9:
            q.i.g(r11, r9, r8)
        L_0x01ec:
            int r2 = r2 + 1
            goto L_0x01bc
        L_0x01ef:
            r2 = 0
        L_0x01f0:
            if (r2 >= r3) goto L_0x0239
            java.util.ArrayList<p.e> r8 = r1.f3710r0
            java.lang.Object r8 = r8.get(r2)
            p.e r8 = (p.e) r8
            boolean r9 = r8.C()
            if (r9 == 0) goto L_0x0236
            boolean r9 = r8 instanceof p.g
            if (r9 != 0) goto L_0x0236
            boolean r9 = r8 instanceof p.a
            if (r9 != 0) goto L_0x0236
            boolean r9 = r8 instanceof p.k
            if (r9 != 0) goto L_0x0236
            boolean r9 = r8.G
            if (r9 != 0) goto L_0x0236
            r9 = 0
            int r10 = r8.k(r9)
            int r9 = r8.k(r6)
            r11 = 3
            if (r10 != r11) goto L_0x0228
            int r10 = r8.f3684r
            if (r10 == r6) goto L_0x0228
            if (r9 != r11) goto L_0x0228
            int r9 = r8.f3685s
            if (r9 == r6) goto L_0x0228
            r9 = 1
            goto L_0x0229
        L_0x0228:
            r9 = 0
        L_0x0229:
            if (r9 != 0) goto L_0x0236
            q.b$a r9 = new q.b$a
            r9.<init>()
            q.b$b r10 = r1.f3696v0
            r11 = 0
            e0(r8, r10, r9, r11)
        L_0x0236:
            int r2 = r2 + 1
            goto L_0x01f0
        L_0x0239:
            r2 = 2
            if (r3 <= r2) goto L_0x060e
            if (r5 == r2) goto L_0x0240
            if (r7 != r2) goto L_0x060e
        L_0x0240:
            int r9 = r1.E0
            r10 = 1024(0x400, float:1.435E-42)
            boolean r9 = p.j.b(r9, r10)
            if (r9 == 0) goto L_0x060e
            q.b$b r9 = r1.f3696v0
            p.d$a r10 = p.d.a.CENTER
            java.util.ArrayList<p.e> r11 = r1.f3710r0
            int r12 = r11.size()
            r13 = 0
        L_0x0255:
            if (r13 >= r12) goto L_0x0283
            java.lang.Object r14 = r11.get(r13)
            p.e r14 = (p.e) r14
            int r15 = r26.m()
            int r2 = r26.t()
            int r8 = r14.m()
            int r14 = r14.t()
            boolean r2 = q.j.c(r15, r2, r8, r14)
            if (r2 != 0) goto L_0x027f
            r24 = r0
            r22 = r3
            r21 = r4
            r25 = r5
            r23 = r7
            goto L_0x05c0
        L_0x027f:
            int r13 = r13 + 1
            r2 = 2
            goto L_0x0255
        L_0x0283:
            r2 = 0
            r6 = 0
            r8 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 0
        L_0x028b:
            if (r6 >= r12) goto L_0x0373
            java.lang.Object r21 = r11.get(r6)
            r22 = r3
            r3 = r21
            p.e r3 = (p.e) r3
            r21 = r4
            int r4 = r26.m()
            r23 = r7
            int r7 = r26.t()
            r24 = r0
            int r0 = r3.m()
            r25 = r5
            int r5 = r3.t()
            boolean r0 = q.j.c(r4, r7, r0, r5)
            if (r0 != 0) goto L_0x02bb
            q.b$a r0 = r1.M0
            r4 = 0
            e0(r3, r9, r0, r4)
        L_0x02bb:
            boolean r0 = r3 instanceof p.g
            if (r0 == 0) goto L_0x02e0
            r4 = r3
            p.g r4 = (p.g) r4
            int r5 = r4.f3705v0
            if (r5 != 0) goto L_0x02d1
            if (r13 != 0) goto L_0x02ce
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r13 = r5
        L_0x02ce:
            r13.add(r4)
        L_0x02d1:
            int r5 = r4.f3705v0
            r7 = 1
            if (r5 != r7) goto L_0x02e0
            if (r2 != 0) goto L_0x02dd
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x02dd:
            r2.add(r4)
        L_0x02e0:
            boolean r4 = r3 instanceof p.i
            if (r4 == 0) goto L_0x0323
            boolean r4 = r3 instanceof p.a
            if (r4 == 0) goto L_0x030b
            r4 = r3
            p.a r4 = (p.a) r4
            int r5 = r4.X()
            if (r5 != 0) goto L_0x02fc
            if (r8 != 0) goto L_0x02f9
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r8 = r5
        L_0x02f9:
            r8.add(r4)
        L_0x02fc:
            int r5 = r4.X()
            r7 = 1
            if (r5 != r7) goto L_0x0323
            if (r14 != 0) goto L_0x0320
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            goto L_0x031f
        L_0x030b:
            r4 = r3
            p.i r4 = (p.i) r4
            if (r8 != 0) goto L_0x0315
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
        L_0x0315:
            r8.add(r4)
            if (r14 != 0) goto L_0x0320
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
        L_0x031f:
            r14 = r5
        L_0x0320:
            r14.add(r4)
        L_0x0323:
            p.d r4 = r3.J
            p.d r4 = r4.f3637f
            if (r4 != 0) goto L_0x033f
            p.d r4 = r3.L
            p.d r4 = r4.f3637f
            if (r4 != 0) goto L_0x033f
            if (r0 != 0) goto L_0x033f
            boolean r4 = r3 instanceof p.a
            if (r4 != 0) goto L_0x033f
            if (r15 != 0) goto L_0x033c
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
        L_0x033c:
            r15.add(r3)
        L_0x033f:
            p.d r4 = r3.K
            p.d r4 = r4.f3637f
            if (r4 != 0) goto L_0x0365
            p.d r4 = r3.M
            p.d r4 = r4.f3637f
            if (r4 != 0) goto L_0x0365
            p.d r4 = r3.N
            p.d r4 = r4.f3637f
            if (r4 != 0) goto L_0x0365
            if (r0 != 0) goto L_0x0365
            boolean r0 = r3 instanceof p.a
            if (r0 != 0) goto L_0x0365
            if (r18 != 0) goto L_0x035e
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
        L_0x035e:
            r0 = r18
            r0.add(r3)
            r18 = r0
        L_0x0365:
            int r6 = r6 + 1
            r4 = r21
            r3 = r22
            r7 = r23
            r0 = r24
            r5 = r25
            goto L_0x028b
        L_0x0373:
            r24 = r0
            r22 = r3
            r21 = r4
            r25 = r5
            r23 = r7
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L_0x039a
            java.util.Iterator r2 = r2.iterator()
        L_0x0388:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x039a
            java.lang.Object r3 = r2.next()
            p.g r3 = (p.g) r3
            r4 = 0
            r5 = 0
            q.j.a(r3, r5, r0, r4)
            goto L_0x0388
        L_0x039a:
            r4 = 0
            r5 = 0
            if (r8 == 0) goto L_0x03bb
            java.util.Iterator r2 = r8.iterator()
        L_0x03a2:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03bb
            java.lang.Object r3 = r2.next()
            p.i r3 = (p.i) r3
            q.p r6 = q.j.a(r3, r5, r0, r4)
            r3.V(r0, r5, r6)
            r6.b(r0)
            r4 = 0
            r5 = 0
            goto L_0x03a2
        L_0x03bb:
            p.d$a r2 = p.d.a.LEFT
            p.d r2 = r1.i(r2)
            java.util.HashSet<p.d> r2 = r2.f3632a
            if (r2 == 0) goto L_0x03dd
            java.util.Iterator r2 = r2.iterator()
        L_0x03c9:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03dd
            java.lang.Object r3 = r2.next()
            p.d r3 = (p.d) r3
            p.e r3 = r3.f3635d
            r4 = 0
            r5 = 0
            q.j.a(r3, r5, r0, r4)
            goto L_0x03c9
        L_0x03dd:
            p.d$a r2 = p.d.a.RIGHT
            p.d r2 = r1.i(r2)
            java.util.HashSet<p.d> r2 = r2.f3632a
            if (r2 == 0) goto L_0x03ff
            java.util.Iterator r2 = r2.iterator()
        L_0x03eb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x03ff
            java.lang.Object r3 = r2.next()
            p.d r3 = (p.d) r3
            p.e r3 = r3.f3635d
            r4 = 0
            r5 = 0
            q.j.a(r3, r5, r0, r4)
            goto L_0x03eb
        L_0x03ff:
            p.d r2 = r1.i(r10)
            java.util.HashSet<p.d> r2 = r2.f3632a
            if (r2 == 0) goto L_0x041f
            java.util.Iterator r2 = r2.iterator()
        L_0x040b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.next()
            p.d r3 = (p.d) r3
            p.e r3 = r3.f3635d
            r4 = 0
            r5 = 0
            q.j.a(r3, r5, r0, r4)
            goto L_0x040b
        L_0x041f:
            r4 = 0
            r5 = 0
            if (r15 == 0) goto L_0x0437
            java.util.Iterator r2 = r15.iterator()
        L_0x0427:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0437
            java.lang.Object r3 = r2.next()
            p.e r3 = (p.e) r3
            q.j.a(r3, r5, r0, r4)
            goto L_0x0427
        L_0x0437:
            if (r13 == 0) goto L_0x044e
            java.util.Iterator r2 = r13.iterator()
        L_0x043d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x044e
            java.lang.Object r3 = r2.next()
            p.g r3 = (p.g) r3
            r5 = 1
            q.j.a(r3, r5, r0, r4)
            goto L_0x043d
        L_0x044e:
            r5 = 1
            if (r14 == 0) goto L_0x046e
            java.util.Iterator r2 = r14.iterator()
        L_0x0455:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x046e
            java.lang.Object r3 = r2.next()
            p.i r3 = (p.i) r3
            q.p r6 = q.j.a(r3, r5, r0, r4)
            r3.V(r0, r5, r6)
            r6.b(r0)
            r4 = 0
            r5 = 1
            goto L_0x0455
        L_0x046e:
            p.d$a r2 = p.d.a.TOP
            p.d r2 = r1.i(r2)
            java.util.HashSet<p.d> r2 = r2.f3632a
            if (r2 == 0) goto L_0x0490
            java.util.Iterator r2 = r2.iterator()
        L_0x047c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0490
            java.lang.Object r3 = r2.next()
            p.d r3 = (p.d) r3
            p.e r3 = r3.f3635d
            r4 = 0
            r5 = 1
            q.j.a(r3, r5, r0, r4)
            goto L_0x047c
        L_0x0490:
            p.d$a r2 = p.d.a.BASELINE
            p.d r2 = r1.i(r2)
            java.util.HashSet<p.d> r2 = r2.f3632a
            if (r2 == 0) goto L_0x04b2
            java.util.Iterator r2 = r2.iterator()
        L_0x049e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04b2
            java.lang.Object r3 = r2.next()
            p.d r3 = (p.d) r3
            p.e r3 = r3.f3635d
            r4 = 0
            r5 = 1
            q.j.a(r3, r5, r0, r4)
            goto L_0x049e
        L_0x04b2:
            p.d$a r2 = p.d.a.BOTTOM
            p.d r2 = r1.i(r2)
            java.util.HashSet<p.d> r2 = r2.f3632a
            if (r2 == 0) goto L_0x04d4
            java.util.Iterator r2 = r2.iterator()
        L_0x04c0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04d4
            java.lang.Object r3 = r2.next()
            p.d r3 = (p.d) r3
            p.e r3 = r3.f3635d
            r4 = 0
            r5 = 1
            q.j.a(r3, r5, r0, r4)
            goto L_0x04c0
        L_0x04d4:
            p.d r2 = r1.i(r10)
            java.util.HashSet<p.d> r2 = r2.f3632a
            if (r2 == 0) goto L_0x04f4
            java.util.Iterator r2 = r2.iterator()
        L_0x04e0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x04f4
            java.lang.Object r3 = r2.next()
            p.d r3 = (p.d) r3
            p.e r3 = r3.f3635d
            r4 = 0
            r5 = 1
            q.j.a(r3, r5, r0, r4)
            goto L_0x04e0
        L_0x04f4:
            r4 = 0
            r5 = 1
            if (r18 == 0) goto L_0x050c
            java.util.Iterator r2 = r18.iterator()
        L_0x04fc:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x050c
            java.lang.Object r3 = r2.next()
            p.e r3 = (p.e) r3
            q.j.a(r3, r5, r0, r4)
            goto L_0x04fc
        L_0x050c:
            r2 = 0
        L_0x050d:
            if (r2 >= r12) goto L_0x0544
            java.lang.Object r3 = r11.get(r2)
            p.e r3 = (p.e) r3
            int[] r4 = r3.U
            r6 = 0
            r7 = r4[r6]
            r6 = 3
            if (r7 != r6) goto L_0x0523
            r4 = r4[r5]
            if (r4 != r6) goto L_0x0523
            r4 = 1
            goto L_0x0524
        L_0x0523:
            r4 = 0
        L_0x0524:
            if (r4 == 0) goto L_0x0540
            int r4 = r3.f3681p0
            q.p r4 = q.j.b(r0, r4)
            int r3 = r3.f3683q0
            q.p r3 = q.j.b(r0, r3)
            if (r4 == 0) goto L_0x0540
            if (r3 == 0) goto L_0x0540
            r5 = 0
            r4.d(r5, r3)
            r5 = 2
            r3.f3770c = r5
            r0.remove(r4)
        L_0x0540:
            int r2 = r2 + 1
            r5 = 1
            goto L_0x050d
        L_0x0544:
            int r2 = r0.size()
            r3 = 1
            if (r2 > r3) goto L_0x054d
            goto L_0x05c0
        L_0x054d:
            int r2 = r26.m()
            r4 = 2
            if (r2 != r4) goto L_0x0583
            java.util.Iterator r2 = r0.iterator()
            r4 = 0
            r5 = 0
        L_0x055a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0578
            java.lang.Object r6 = r2.next()
            q.p r6 = (q.p) r6
            int r7 = r6.f3770c
            if (r7 != r3) goto L_0x056c
            r8 = 0
            goto L_0x055a
        L_0x056c:
            n.d r7 = r1.f3698x0
            r8 = 0
            int r7 = r6.c(r7, r8)
            if (r7 <= r5) goto L_0x055a
            r4 = r6
            r5 = r7
            goto L_0x055a
        L_0x0578:
            r8 = 0
            if (r4 == 0) goto L_0x0583
            int[] r2 = r1.U
            r2[r8] = r3
            r1.S(r5)
            goto L_0x0584
        L_0x0583:
            r4 = 0
        L_0x0584:
            int r2 = r26.t()
            r3 = 2
            if (r2 != r3) goto L_0x05ba
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r3 = 0
        L_0x0591:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x05af
            java.lang.Object r5 = r0.next()
            q.p r5 = (q.p) r5
            int r6 = r5.f3770c
            if (r6 != 0) goto L_0x05a3
            r7 = 1
            goto L_0x0591
        L_0x05a3:
            n.d r6 = r1.f3698x0
            r7 = 1
            int r6 = r5.c(r6, r7)
            if (r6 <= r3) goto L_0x0591
            r2 = r5
            r3 = r6
            goto L_0x0591
        L_0x05af:
            r7 = 1
            if (r2 == 0) goto L_0x05ba
            int[] r0 = r1.U
            r0[r7] = r7
            r1.N(r3)
            goto L_0x05bb
        L_0x05ba:
            r2 = 0
        L_0x05bb:
            if (r4 != 0) goto L_0x05c2
            if (r2 == 0) goto L_0x05c0
            goto L_0x05c2
        L_0x05c0:
            r0 = 0
            goto L_0x05c3
        L_0x05c2:
            r0 = 1
        L_0x05c3:
            if (r0 == 0) goto L_0x0605
            r2 = r25
            r3 = 2
            if (r2 != r3) goto L_0x05e0
            int r0 = r26.u()
            r3 = r24
            if (r3 >= r0) goto L_0x05db
            if (r3 <= 0) goto L_0x05db
            r1.S(r3)
            r4 = 1
            r1.F0 = r4
            goto L_0x05e2
        L_0x05db:
            int r0 = r26.u()
            goto L_0x05e3
        L_0x05e0:
            r3 = r24
        L_0x05e2:
            r0 = r3
        L_0x05e3:
            r4 = r23
            r3 = 2
            if (r4 != r3) goto L_0x05fe
            int r3 = r26.l()
            r5 = r21
            if (r5 >= r3) goto L_0x05f9
            if (r5 <= 0) goto L_0x05f9
            r1.N(r5)
            r3 = 1
            r1.G0 = r3
            goto L_0x0600
        L_0x05f9:
            int r3 = r26.l()
            goto L_0x0601
        L_0x05fe:
            r5 = r21
        L_0x0600:
            r3 = r5
        L_0x0601:
            r5 = r3
            r3 = r0
            r0 = 1
            goto L_0x0615
        L_0x0605:
            r5 = r21
            r4 = r23
            r3 = r24
            r2 = r25
            goto L_0x0614
        L_0x060e:
            r22 = r3
            r2 = r5
            r3 = r0
            r5 = r4
            r4 = r7
        L_0x0614:
            r0 = 0
        L_0x0615:
            r6 = 64
            boolean r7 = r1.f0(r6)
            if (r7 != 0) goto L_0x0628
            r7 = 128(0x80, float:1.794E-43)
            boolean r7 = r1.f0(r7)
            if (r7 == 0) goto L_0x0626
            goto L_0x0628
        L_0x0626:
            r7 = 0
            goto L_0x0629
        L_0x0628:
            r7 = 1
        L_0x0629:
            n.d r8 = r1.f3698x0
            java.util.Objects.requireNonNull(r8)
            r9 = 0
            r8.f3451g = r9
            int r9 = r1.E0
            if (r9 == 0) goto L_0x063a
            if (r7 == 0) goto L_0x063a
            r7 = 1
            r8.f3451g = r7
        L_0x063a:
            java.util.ArrayList<p.e> r7 = r1.f3710r0
            int r8 = r26.m()
            r9 = 2
            if (r8 == r9) goto L_0x064d
            int r8 = r26.t()
            if (r8 != r9) goto L_0x064a
            goto L_0x064d
        L_0x064a:
            r8 = 0
            r10 = 0
            goto L_0x064f
        L_0x064d:
            r8 = 0
            r10 = 1
        L_0x064f:
            r1.A0 = r8
            r1.B0 = r8
            r9 = r22
            r8 = 0
        L_0x0656:
            if (r8 >= r9) goto L_0x066c
            java.util.ArrayList<p.e> r11 = r1.f3710r0
            java.lang.Object r11 = r11.get(r8)
            p.e r11 = (p.e) r11
            boolean r12 = r11 instanceof p.l
            if (r12 == 0) goto L_0x0669
            p.l r11 = (p.l) r11
            r11.V()
        L_0x0669:
            int r8 = r8 + 1
            goto L_0x0656
        L_0x066c:
            boolean r8 = r1.f0(r6)
            r11 = r0
            r0 = 0
            r12 = 1
        L_0x0673:
            if (r12 == 0) goto L_0x08c7
            r13 = 1
            int r14 = r0 + 1
            n.d r0 = r1.f3698x0     // Catch:{ Exception -> 0x0755 }
            r0.u()     // Catch:{ Exception -> 0x0755 }
            r13 = 0
            r1.A0 = r13     // Catch:{ Exception -> 0x0755 }
            r1.B0 = r13     // Catch:{ Exception -> 0x0755 }
            n.d r0 = r1.f3698x0     // Catch:{ Exception -> 0x0755 }
            r1.g(r0)     // Catch:{ Exception -> 0x0755 }
            r0 = 0
        L_0x0688:
            if (r0 >= r9) goto L_0x069a
            java.util.ArrayList<p.e> r13 = r1.f3710r0     // Catch:{ Exception -> 0x0755 }
            java.lang.Object r13 = r13.get(r0)     // Catch:{ Exception -> 0x0755 }
            p.e r13 = (p.e) r13     // Catch:{ Exception -> 0x0755 }
            n.d r15 = r1.f3698x0     // Catch:{ Exception -> 0x0755 }
            r13.g(r15)     // Catch:{ Exception -> 0x0755 }
            int r0 = r0 + 1
            goto L_0x0688
        L_0x069a:
            n.d r0 = r1.f3698x0     // Catch:{ Exception -> 0x0755 }
            r1.X(r0)     // Catch:{ Exception -> 0x0755 }
            java.lang.ref.WeakReference<p.d> r0 = r1.H0     // Catch:{ Exception -> 0x0748 }
            r12 = 5
            if (r0 == 0) goto L_0x06c9
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0748 }
            if (r0 == 0) goto L_0x06c9
            java.lang.ref.WeakReference<p.d> r0 = r1.H0     // Catch:{ Exception -> 0x0748 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0748 }
            p.d r0 = (p.d) r0     // Catch:{ Exception -> 0x0748 }
            n.d r13 = r1.f3698x0     // Catch:{ Exception -> 0x0748 }
            p.d r15 = r1.K     // Catch:{ Exception -> 0x0748 }
            n.h r13 = r13.l(r15)     // Catch:{ Exception -> 0x0748 }
            n.d r15 = r1.f3698x0     // Catch:{ Exception -> 0x0748 }
            n.h r0 = r15.l(r0)     // Catch:{ Exception -> 0x0748 }
            n.d r15 = r1.f3698x0     // Catch:{ Exception -> 0x0748 }
            r6 = 0
            r15.f(r0, r13, r6, r12)     // Catch:{ Exception -> 0x0748 }
            r6 = 0
            r1.H0 = r6     // Catch:{ Exception -> 0x0748 }
        L_0x06c9:
            java.lang.ref.WeakReference<p.d> r0 = r1.J0     // Catch:{ Exception -> 0x0748 }
            if (r0 == 0) goto L_0x06f2
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0748 }
            if (r0 == 0) goto L_0x06f2
            java.lang.ref.WeakReference<p.d> r0 = r1.J0     // Catch:{ Exception -> 0x0748 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0748 }
            p.d r0 = (p.d) r0     // Catch:{ Exception -> 0x0748 }
            n.d r6 = r1.f3698x0     // Catch:{ Exception -> 0x0748 }
            p.d r13 = r1.M     // Catch:{ Exception -> 0x0748 }
            n.h r6 = r6.l(r13)     // Catch:{ Exception -> 0x0748 }
            n.d r13 = r1.f3698x0     // Catch:{ Exception -> 0x0748 }
            n.h r0 = r13.l(r0)     // Catch:{ Exception -> 0x0748 }
            n.d r13 = r1.f3698x0     // Catch:{ Exception -> 0x0748 }
            r15 = 0
            r13.f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x0748 }
            r6 = 0
            r1.J0 = r6     // Catch:{ Exception -> 0x0748 }
        L_0x06f2:
            java.lang.ref.WeakReference<p.d> r0 = r1.I0     // Catch:{ Exception -> 0x0748 }
            if (r0 == 0) goto L_0x071e
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0748 }
            if (r0 == 0) goto L_0x071e
            java.lang.ref.WeakReference<p.d> r0 = r1.I0     // Catch:{ Exception -> 0x0748 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0748 }
            p.d r0 = (p.d) r0     // Catch:{ Exception -> 0x0748 }
            n.d r6 = r1.f3698x0     // Catch:{ Exception -> 0x0748 }
            p.d r13 = r1.J     // Catch:{ Exception -> 0x0748 }
            n.h r6 = r6.l(r13)     // Catch:{ Exception -> 0x0748 }
            n.d r13 = r1.f3698x0     // Catch:{ Exception -> 0x0748 }
            n.h r0 = r13.l(r0)     // Catch:{ Exception -> 0x0748 }
            n.d r13 = r1.f3698x0     // Catch:{ Exception -> 0x0748 }
            r15 = 0
            r13.f(r0, r6, r15, r12)     // Catch:{ Exception -> 0x0748 }
            r6 = 0
            r1.I0 = r6     // Catch:{ Exception -> 0x0748 }
            goto L_0x071e
        L_0x071c:
            r6 = 0
            goto L_0x0753
        L_0x071e:
            java.lang.ref.WeakReference<p.d> r0 = r1.K0     // Catch:{ Exception -> 0x0748 }
            if (r0 == 0) goto L_0x074a
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0748 }
            if (r0 == 0) goto L_0x074a
            java.lang.ref.WeakReference<p.d> r0 = r1.K0     // Catch:{ Exception -> 0x0748 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0748 }
            p.d r0 = (p.d) r0     // Catch:{ Exception -> 0x0748 }
            n.d r6 = r1.f3698x0     // Catch:{ Exception -> 0x0748 }
            p.d r13 = r1.L     // Catch:{ Exception -> 0x0748 }
            n.h r6 = r6.l(r13)     // Catch:{ Exception -> 0x0748 }
            n.d r13 = r1.f3698x0     // Catch:{ Exception -> 0x0748 }
            n.h r0 = r13.l(r0)     // Catch:{ Exception -> 0x0748 }
            n.d r13 = r1.f3698x0     // Catch:{ Exception -> 0x0748 }
            r15 = 0
            r13.f(r6, r0, r15, r12)     // Catch:{ Exception -> 0x0748 }
            r6 = 0
            r1.K0 = r6     // Catch:{ Exception -> 0x0752 }
            goto L_0x074b
        L_0x0748:
            r0 = move-exception
            goto L_0x071c
        L_0x074a:
            r6 = 0
        L_0x074b:
            n.d r0 = r1.f3698x0     // Catch:{ Exception -> 0x0752 }
            r0.q()     // Catch:{ Exception -> 0x0752 }
            r12 = 1
            goto L_0x0770
        L_0x0752:
            r0 = move-exception
        L_0x0753:
            r12 = 1
            goto L_0x0757
        L_0x0755:
            r0 = move-exception
            r6 = 0
        L_0x0757:
            r0.printStackTrace()
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "EXCEPTION : "
            r15.append(r6)
            r15.append(r0)
            java.lang.String r0 = r15.toString()
            r13.println(r0)
        L_0x0770:
            if (r12 == 0) goto L_0x07b9
            n.d r0 = r1.f3698x0
            boolean[] r6 = p.j.f3709a
            r12 = 2
            r13 = 0
            r6[r12] = r13
            r6 = 64
            boolean r12 = r1.f0(r6)
            r1.U(r0, r12)
            java.util.ArrayList<p.e> r13 = r1.f3710r0
            int r13 = r13.size()
            r15 = 0
            r18 = 0
        L_0x078c:
            if (r15 >= r13) goto L_0x07b7
            java.util.ArrayList<p.e> r6 = r1.f3710r0
            java.lang.Object r6 = r6.get(r15)
            p.e r6 = (p.e) r6
            r6.U(r0, r12)
            r21 = r0
            int r0 = r6.f3664h
            r22 = r12
            r12 = -1
            if (r0 != r12) goto L_0x07a9
            int r0 = r6.f3666i
            if (r0 == r12) goto L_0x07a7
            goto L_0x07a9
        L_0x07a7:
            r0 = 0
            goto L_0x07aa
        L_0x07a9:
            r0 = 1
        L_0x07aa:
            if (r0 == 0) goto L_0x07ae
            r18 = 1
        L_0x07ae:
            int r15 = r15 + 1
            r0 = r21
            r12 = r22
            r6 = 64
            goto L_0x078c
        L_0x07b7:
            r12 = -1
            goto L_0x07d4
        L_0x07b9:
            r12 = -1
            n.d r0 = r1.f3698x0
            r1.U(r0, r8)
            r0 = 0
        L_0x07c0:
            if (r0 >= r9) goto L_0x07d2
            java.util.ArrayList<p.e> r6 = r1.f3710r0
            java.lang.Object r6 = r6.get(r0)
            p.e r6 = (p.e) r6
            n.d r13 = r1.f3698x0
            r6.U(r13, r8)
            int r0 = r0 + 1
            goto L_0x07c0
        L_0x07d2:
            r18 = 0
        L_0x07d4:
            r0 = 8
            if (r10 == 0) goto L_0x083e
            if (r14 >= r0) goto L_0x083e
            boolean[] r6 = p.j.f3709a
            r13 = 2
            boolean r6 = r6[r13]
            if (r6 == 0) goto L_0x083e
            r6 = 0
            r13 = 0
            r15 = 0
        L_0x07e4:
            if (r6 >= r9) goto L_0x080b
            java.util.ArrayList<p.e> r12 = r1.f3710r0
            java.lang.Object r12 = r12.get(r6)
            p.e r12 = (p.e) r12
            int r0 = r12.f3651a0
            int r22 = r12.u()
            int r0 = r22 + r0
            int r13 = java.lang.Math.max(r13, r0)
            int r0 = r12.f3653b0
            int r12 = r12.l()
            int r12 = r12 + r0
            int r15 = java.lang.Math.max(r15, r12)
            int r6 = r6 + 1
            r0 = 8
            r12 = -1
            goto L_0x07e4
        L_0x080b:
            int r0 = r1.f3657d0
            int r0 = java.lang.Math.max(r0, r13)
            int r6 = r1.f3659e0
            int r6 = java.lang.Math.max(r6, r15)
            r12 = 2
            if (r2 != r12) goto L_0x082b
            int r13 = r26.u()
            if (r13 >= r0) goto L_0x082b
            r1.S(r0)
            int[] r0 = r1.U
            r11 = 0
            r0[r11] = r12
            r11 = 1
            r18 = 1
        L_0x082b:
            if (r4 != r12) goto L_0x083e
            int r0 = r26.l()
            if (r0 >= r6) goto L_0x083e
            r1.N(r6)
            int[] r0 = r1.U
            r6 = 1
            r0[r6] = r12
            r11 = 1
            r18 = 1
        L_0x083e:
            int r0 = r1.f3657d0
            int r6 = r26.u()
            int r0 = java.lang.Math.max(r0, r6)
            int r6 = r26.u()
            if (r0 <= r6) goto L_0x085c
            r1.S(r0)
            int[] r0 = r1.U
            r6 = 1
            r11 = 0
            r0[r11] = r6
            r18 = 1
            r20 = 1
            goto L_0x085f
        L_0x085c:
            r6 = 1
            r20 = r11
        L_0x085f:
            int r0 = r1.f3659e0
            int r11 = r26.l()
            int r0 = java.lang.Math.max(r0, r11)
            int r11 = r26.l()
            if (r0 <= r11) goto L_0x087a
            r1.N(r0)
            int[] r0 = r1.U
            r0[r6] = r6
            r0 = 1
            r18 = 1
            goto L_0x087c
        L_0x087a:
            r0 = r20
        L_0x087c:
            if (r0 != 0) goto L_0x08b8
            int[] r11 = r1.U
            r12 = 0
            r11 = r11[r12]
            r13 = 2
            if (r11 != r13) goto L_0x089a
            if (r3 <= 0) goto L_0x089a
            int r11 = r26.u()
            if (r11 <= r3) goto L_0x089a
            r1.F0 = r6
            int[] r0 = r1.U
            r0[r12] = r6
            r1.S(r3)
            r0 = 1
            r18 = 1
        L_0x089a:
            int[] r11 = r1.U
            r11 = r11[r6]
            r12 = 2
            if (r11 != r12) goto L_0x08b9
            if (r5 <= 0) goto L_0x08b9
            int r11 = r26.l()
            if (r11 <= r5) goto L_0x08b9
            r1.G0 = r6
            int[] r0 = r1.U
            r0[r6] = r6
            r1.N(r5)
            r0 = 8
            r11 = 1
            r18 = 1
            goto L_0x08bc
        L_0x08b8:
            r12 = 2
        L_0x08b9:
            r11 = r0
            r0 = 8
        L_0x08bc:
            if (r14 <= r0) goto L_0x08c0
            r18 = 0
        L_0x08c0:
            r0 = r14
            r12 = r18
            r6 = 64
            goto L_0x0673
        L_0x08c7:
            r1.f3710r0 = r7
            if (r11 == 0) goto L_0x08d3
            int[] r0 = r1.U
            r3 = 0
            r0[r3] = r2
            r2 = 1
            r0[r2] = r4
        L_0x08d3:
            n.d r0 = r1.f3698x0
            n.c r0 = r0.f3456l
            r1.H(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f.V():void");
    }

    public void W(e eVar, int i2) {
        if (i2 == 0) {
            int i3 = this.A0 + 1;
            c[] cVarArr = this.D0;
            if (i3 >= cVarArr.length) {
                this.D0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            c[] cVarArr2 = this.D0;
            int i4 = this.A0;
            cVarArr2[i4] = new c(eVar, 0, this.f3697w0);
            this.A0 = i4 + 1;
        } else if (i2 == 1) {
            int i5 = this.B0 + 1;
            c[] cVarArr3 = this.C0;
            if (i5 >= cVarArr3.length) {
                this.C0 = (c[]) Arrays.copyOf(cVarArr3, cVarArr3.length * 2);
            }
            c[] cVarArr4 = this.C0;
            int i6 = this.B0;
            cVarArr4[i6] = new c(eVar, 1, this.f3697w0);
            this.B0 = i6 + 1;
        }
    }

    public boolean X(d dVar) {
        boolean z2;
        boolean f02 = f0(64);
        d(dVar, f02);
        int size = this.f3710r0.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = this.f3710r0.get(i2);
            boolean[] zArr = eVar.T;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z3 = true;
            }
        }
        if (z3) {
            for (int i3 = 0; i3 < size; i3++) {
                e eVar2 = this.f3710r0.get(i3);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i4 = 0; i4 < aVar.f3708s0; i4++) {
                        e eVar3 = aVar.f3707r0[i4];
                        if (aVar.f3609u0 || eVar3.e()) {
                            int i5 = aVar.f3608t0;
                            if (i5 == 0 || i5 == 1) {
                                eVar3.T[0] = true;
                            } else if (i5 == 2 || i5 == 3) {
                                eVar3.T[1] = true;
                            }
                        }
                    }
                }
            }
        }
        this.L0.clear();
        for (int i6 = 0; i6 < size; i6++) {
            e eVar4 = this.f3710r0.get(i6);
            if (eVar4.c()) {
                if (eVar4 instanceof k) {
                    this.L0.add(eVar4);
                } else {
                    eVar4.d(dVar, f02);
                }
            }
        }
        while (this.L0.size() > 0) {
            int size2 = this.L0.size();
            Iterator<e> it = this.L0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                HashSet<e> hashSet = this.L0;
                int i7 = 0;
                while (true) {
                    if (i7 >= kVar.f3708s0) {
                        z2 = false;
                        continue;
                        break;
                    } else if (hashSet.contains(kVar.f3707r0[i7])) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i7++;
                    }
                }
                if (z2) {
                    kVar.d(dVar, f02);
                    this.L0.remove(kVar);
                    break;
                }
            }
            if (size2 == this.L0.size()) {
                Iterator<e> it2 = this.L0.iterator();
                while (it2.hasNext()) {
                    it2.next().d(dVar, f02);
                }
                this.L0.clear();
            }
        }
        if (d.f3442p) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                e eVar5 = this.f3710r0.get(i8);
                if (!eVar5.c()) {
                    hashSet2.add(eVar5);
                }
            }
            b(this, dVar, hashSet2, m() == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                e eVar6 = (e) it3.next();
                j.a(this, dVar, eVar6);
                eVar6.d(dVar, f02);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                e eVar7 = this.f3710r0.get(i9);
                if (eVar7 instanceof f) {
                    int[] iArr = eVar7.U;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        iArr[0] = 1;
                    }
                    if (i11 == 2) {
                        iArr[1] = 1;
                    }
                    eVar7.d(dVar, f02);
                    if (i10 == 2) {
                        eVar7.O(i10);
                    }
                    if (i11 == 2) {
                        eVar7.R(i11);
                    }
                } else {
                    j.a(this, dVar, eVar7);
                    if (!eVar7.c()) {
                        eVar7.d(dVar, f02);
                    }
                }
            }
        }
        if (this.A0 > 0) {
            b.a(this, dVar, (ArrayList<e>) null, 0);
        }
        if (this.B0 > 0) {
            b.a(this, dVar, (ArrayList<e>) null, 1);
        }
        return true;
    }

    public void Y(d dVar) {
        WeakReference<d> weakReference = this.K0;
        if (weakReference == null || weakReference.get() == null || dVar.c() > ((d) this.K0.get()).c()) {
            this.K0 = new WeakReference<>(dVar);
        }
    }

    public void Z(d dVar) {
        WeakReference<d> weakReference = this.I0;
        if (weakReference == null || weakReference.get() == null || dVar.c() > ((d) this.I0.get()).c()) {
            this.I0 = new WeakReference<>(dVar);
        }
    }

    public void a0(d dVar) {
        WeakReference<d> weakReference = this.J0;
        if (weakReference == null || weakReference.get() == null || dVar.c() > ((d) this.J0.get()).c()) {
            this.J0 = new WeakReference<>(dVar);
        }
    }

    public void b0(d dVar) {
        WeakReference<d> weakReference = this.H0;
        if (weakReference == null || weakReference.get() == null || dVar.c() > ((d) this.H0.get()).c()) {
            this.H0 = new WeakReference<>(dVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0129 A[EDGE_INSN: B:77:0x0129->B:62:0x0129 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c0(boolean r12, int r13) {
        /*
            r11 = this;
            q.f r0 = r11.f3694t0
            r1 = 1
            r12 = r12 & r1
            p.f r2 = r0.f3728a
            r3 = 0
            int r2 = r2.k(r3)
            p.f r4 = r0.f3728a
            int r4 = r4.k(r1)
            p.f r5 = r0.f3728a
            int r5 = r5.v()
            p.f r6 = r0.f3728a
            int r6 = r6.w()
            if (r12 == 0) goto L_0x007d
            r7 = 2
            if (r2 == r7) goto L_0x0024
            if (r4 != r7) goto L_0x007d
        L_0x0024:
            java.util.ArrayList<q.q> r8 = r0.f3732e
            java.util.Iterator r8 = r8.iterator()
        L_0x002a:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0041
            java.lang.Object r9 = r8.next()
            q.q r9 = (q.q) r9
            int r10 = r9.f3778f
            if (r10 != r13) goto L_0x002a
            boolean r9 = r9.k()
            if (r9 != 0) goto L_0x002a
            r12 = 0
        L_0x0041:
            if (r13 != 0) goto L_0x005f
            if (r12 == 0) goto L_0x007d
            if (r2 != r7) goto L_0x007d
            p.f r12 = r0.f3728a
            int[] r7 = r12.U
            r7[r3] = r1
            int r7 = r0.d(r12, r3)
            r12.S(r7)
            p.f r12 = r0.f3728a
            q.m r7 = r12.f3656d
            q.h r7 = r7.f3777e
            int r12 = r12.u()
            goto L_0x007a
        L_0x005f:
            if (r12 == 0) goto L_0x007d
            if (r4 != r7) goto L_0x007d
            p.f r12 = r0.f3728a
            int[] r7 = r12.U
            r7[r1] = r1
            int r7 = r0.d(r12, r1)
            r12.N(r7)
            p.f r12 = r0.f3728a
            q.o r7 = r12.f3658e
            q.h r7 = r7.f3777e
            int r12 = r12.l()
        L_0x007a:
            r7.c(r12)
        L_0x007d:
            p.f r12 = r0.f3728a
            int[] r7 = r12.U
            r8 = 4
            if (r13 != 0) goto L_0x00a2
            r6 = r7[r3]
            if (r6 == r1) goto L_0x008c
            r6 = r7[r3]
            if (r6 != r8) goto L_0x00ab
        L_0x008c:
            int r12 = r12.u()
            int r12 = r12 + r5
            p.f r6 = r0.f3728a
            q.m r6 = r6.f3656d
            q.g r6 = r6.f3781i
            r6.c(r12)
            p.f r6 = r0.f3728a
            q.m r6 = r6.f3656d
            q.h r6 = r6.f3777e
            int r12 = r12 - r5
            goto L_0x00c3
        L_0x00a2:
            r5 = r7[r1]
            if (r5 == r1) goto L_0x00ad
            r5 = r7[r1]
            if (r5 != r8) goto L_0x00ab
            goto L_0x00ad
        L_0x00ab:
            r12 = 0
            goto L_0x00c7
        L_0x00ad:
            int r12 = r12.l()
            int r12 = r12 + r6
            p.f r5 = r0.f3728a
            q.o r5 = r5.f3658e
            q.g r5 = r5.f3781i
            r5.c(r12)
            p.f r5 = r0.f3728a
            q.o r5 = r5.f3658e
            q.h r5 = r5.f3777e
            int r12 = r12 - r6
            r6 = r5
        L_0x00c3:
            r6.c(r12)
            r12 = 1
        L_0x00c7:
            r0.g()
            java.util.ArrayList<q.q> r5 = r0.f3732e
            java.util.Iterator r5 = r5.iterator()
        L_0x00d0:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00f0
            java.lang.Object r6 = r5.next()
            q.q r6 = (q.q) r6
            int r7 = r6.f3778f
            if (r7 == r13) goto L_0x00e1
            goto L_0x00d0
        L_0x00e1:
            p.e r7 = r6.f3774b
            p.f r8 = r0.f3728a
            if (r7 != r8) goto L_0x00ec
            boolean r7 = r6.f3779g
            if (r7 != 0) goto L_0x00ec
            goto L_0x00d0
        L_0x00ec:
            r6.e()
            goto L_0x00d0
        L_0x00f0:
            java.util.ArrayList<q.q> r5 = r0.f3732e
            java.util.Iterator r5 = r5.iterator()
        L_0x00f6:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0129
            java.lang.Object r6 = r5.next()
            q.q r6 = (q.q) r6
            int r7 = r6.f3778f
            if (r7 == r13) goto L_0x0107
            goto L_0x00f6
        L_0x0107:
            if (r12 != 0) goto L_0x0110
            p.e r7 = r6.f3774b
            p.f r8 = r0.f3728a
            if (r7 != r8) goto L_0x0110
            goto L_0x00f6
        L_0x0110:
            q.g r7 = r6.f3780h
            boolean r7 = r7.f3745j
            if (r7 != 0) goto L_0x0117
            goto L_0x0128
        L_0x0117:
            q.g r7 = r6.f3781i
            boolean r7 = r7.f3745j
            if (r7 != 0) goto L_0x011e
            goto L_0x0128
        L_0x011e:
            boolean r7 = r6 instanceof q.c
            if (r7 != 0) goto L_0x00f6
            q.h r6 = r6.f3777e
            boolean r6 = r6.f3745j
            if (r6 != 0) goto L_0x00f6
        L_0x0128:
            r1 = 0
        L_0x0129:
            p.f r12 = r0.f3728a
            r12.O(r2)
            p.f r12 = r0.f3728a
            r12.R(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f.c0(boolean, int):boolean");
    }

    public void d0() {
        this.f3694t0.f3729b = true;
    }

    public boolean f0(int i2) {
        return (this.E0 & i2) == i2;
    }

    public void g0(int i2) {
        this.E0 = i2;
        d.f3442p = f0(512);
    }

    public void q(StringBuilder sb) {
        sb.append(this.f3668j + ":{\n");
        sb.append("  actualWidth:" + this.W);
        sb.append("\n");
        sb.append("  actualHeight:" + this.X);
        sb.append("\n");
        Iterator<e> it = this.f3710r0.iterator();
        while (it.hasNext()) {
            it.next().q(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
