package q;

import androidx.activity.result.a;
import java.util.List;
import p.d;
import p.e;
import p.h;
import q.g;

public class m extends q {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f3761k = new int[2];

    public m(e eVar) {
        super(eVar);
        this.f3780h.f3740e = g.a.LEFT;
        this.f3781i.f3740e = g.a.RIGHT;
        this.f3778f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0255, code lost:
        if (r15 != 1) goto L_0x02a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:164:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(q.d r19) {
        /*
            r18 = this;
            r8 = r18
            int r0 = r8.f3782j
            int r0 = n.g.a(r0)
            r9 = 3
            r10 = 0
            if (r0 == r9) goto L_0x03be
            q.h r0 = r8.f3777e
            boolean r1 = r0.f3745j
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            if (r1 != 0) goto L_0x02a4
            int r1 = r8.f3776d
            if (r1 != r9) goto L_0x02a4
            p.e r1 = r8.f3774b
            int r2 = r1.f3684r
            r3 = 2
            if (r2 == r3) goto L_0x028c
            if (r2 == r9) goto L_0x0024
            goto L_0x02a4
        L_0x0024:
            int r2 = r1.f3685s
            r3 = -1
            if (r2 == 0) goto L_0x0050
            if (r2 != r9) goto L_0x002c
            goto L_0x0050
        L_0x002c:
            int r2 = r1.Z
            if (r2 == r3) goto L_0x0043
            if (r2 == 0) goto L_0x0037
            if (r2 == r12) goto L_0x0043
            r1 = 0
            goto L_0x02a1
        L_0x0037:
            q.o r2 = r1.f3658e
            q.h r2 = r2.f3777e
            int r2 = r2.f3742g
            float r2 = (float) r2
            float r1 = r1.Y
            float r2 = r2 / r1
            goto L_0x029f
        L_0x0043:
            q.o r2 = r1.f3658e
            q.h r2 = r2.f3777e
            int r2 = r2.f3742g
            float r2 = (float) r2
            float r1 = r1.Y
            float r2 = r2 * r1
            goto L_0x029f
        L_0x0050:
            q.o r0 = r1.f3658e
            q.g r13 = r0.f3780h
            q.g r14 = r0.f3781i
            p.d r0 = r1.J
            p.d r0 = r0.f3637f
            if (r0 == 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            p.d r2 = r1.K
            p.d r2 = r2.f3637f
            if (r2 == 0) goto L_0x0067
            r2 = 1
            goto L_0x0068
        L_0x0067:
            r2 = 0
        L_0x0068:
            p.d r4 = r1.L
            p.d r4 = r4.f3637f
            if (r4 == 0) goto L_0x0070
            r4 = 1
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            p.d r5 = r1.M
            p.d r5 = r5.f3637f
            if (r5 == 0) goto L_0x0079
            r5 = 1
            goto L_0x007a
        L_0x0079:
            r5 = 0
        L_0x007a:
            int r15 = r1.Z
            if (r0 == 0) goto L_0x01b5
            if (r2 == 0) goto L_0x01b5
            if (r4 == 0) goto L_0x01b5
            if (r5 == 0) goto L_0x01b5
            float r7 = r1.Y
            boolean r0 = r13.f3745j
            if (r0 == 0) goto L_0x00e6
            boolean r0 = r14.f3745j
            if (r0 == 0) goto L_0x00e6
            q.g r0 = r8.f3780h
            boolean r1 = r0.f3738c
            if (r1 == 0) goto L_0x00e5
            q.g r1 = r8.f3781i
            boolean r1 = r1.f3738c
            if (r1 != 0) goto L_0x009b
            goto L_0x00e5
        L_0x009b:
            java.util.List<q.g> r0 = r0.f3747l
            java.lang.Object r0 = r0.get(r10)
            q.g r0 = (q.g) r0
            int r0 = r0.f3742g
            q.g r1 = r8.f3780h
            int r1 = r1.f3741f
            int r2 = r0 + r1
            q.g r0 = r8.f3781i
            java.util.List<q.g> r0 = r0.f3747l
            java.lang.Object r0 = r0.get(r10)
            q.g r0 = (q.g) r0
            int r0 = r0.f3742g
            q.g r1 = r8.f3781i
            int r1 = r1.f3741f
            int r3 = r0 - r1
            int r0 = r13.f3742g
            int r1 = r13.f3741f
            int r4 = r0 + r1
            int r0 = r14.f3742g
            int r1 = r14.f3741f
            int r5 = r0 - r1
            int[] r9 = f3761k
            r0 = r18
            r1 = r9
            r6 = r7
            r7 = r15
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            q.h r0 = r8.f3777e
            r1 = r9[r10]
            r0.c(r1)
            p.e r0 = r8.f3774b
            q.o r0 = r0.f3658e
            q.h r0 = r0.f3777e
            r1 = r9[r12]
            r0.c(r1)
        L_0x00e5:
            return
        L_0x00e6:
            q.g r0 = r8.f3780h
            boolean r1 = r0.f3745j
            if (r1 == 0) goto L_0x0143
            q.g r1 = r8.f3781i
            boolean r2 = r1.f3745j
            if (r2 == 0) goto L_0x0143
            boolean r2 = r13.f3738c
            if (r2 == 0) goto L_0x0142
            boolean r2 = r14.f3738c
            if (r2 != 0) goto L_0x00fb
            goto L_0x0142
        L_0x00fb:
            int r2 = r0.f3742g
            int r0 = r0.f3741f
            int r2 = r2 + r0
            int r0 = r1.f3742g
            int r1 = r1.f3741f
            int r3 = r0 - r1
            java.util.List<q.g> r0 = r13.f3747l
            java.lang.Object r0 = r0.get(r10)
            q.g r0 = (q.g) r0
            int r0 = r0.f3742g
            int r1 = r13.f3741f
            int r4 = r0 + r1
            java.util.List<q.g> r0 = r14.f3747l
            java.lang.Object r0 = r0.get(r10)
            q.g r0 = (q.g) r0
            int r0 = r0.f3742g
            int r1 = r14.f3741f
            int r5 = r0 - r1
            int[] r16 = f3761k
            r0 = r18
            r1 = r16
            r6 = r7
            r17 = r7
            r7 = r15
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            q.h r0 = r8.f3777e
            r1 = r16[r10]
            r0.c(r1)
            p.e r0 = r8.f3774b
            q.o r0 = r0.f3658e
            q.h r0 = r0.f3777e
            r1 = r16[r12]
            r0.c(r1)
            goto L_0x0145
        L_0x0142:
            return
        L_0x0143:
            r17 = r7
        L_0x0145:
            q.g r0 = r8.f3780h
            boolean r1 = r0.f3738c
            if (r1 == 0) goto L_0x01b4
            q.g r1 = r8.f3781i
            boolean r1 = r1.f3738c
            if (r1 == 0) goto L_0x01b4
            boolean r1 = r13.f3738c
            if (r1 == 0) goto L_0x01b4
            boolean r1 = r14.f3738c
            if (r1 != 0) goto L_0x015a
            goto L_0x01b4
        L_0x015a:
            java.util.List<q.g> r0 = r0.f3747l
            java.lang.Object r0 = r0.get(r10)
            q.g r0 = (q.g) r0
            int r0 = r0.f3742g
            q.g r1 = r8.f3780h
            int r1 = r1.f3741f
            int r2 = r0 + r1
            q.g r0 = r8.f3781i
            java.util.List<q.g> r0 = r0.f3747l
            java.lang.Object r0 = r0.get(r10)
            q.g r0 = (q.g) r0
            int r0 = r0.f3742g
            q.g r1 = r8.f3781i
            int r1 = r1.f3741f
            int r3 = r0 - r1
            java.util.List<q.g> r0 = r13.f3747l
            java.lang.Object r0 = r0.get(r10)
            q.g r0 = (q.g) r0
            int r0 = r0.f3742g
            int r1 = r13.f3741f
            int r4 = r0 + r1
            java.util.List<q.g> r0 = r14.f3747l
            java.lang.Object r0 = r0.get(r10)
            q.g r0 = (q.g) r0
            int r0 = r0.f3742g
            int r1 = r14.f3741f
            int r5 = r0 - r1
            int[] r13 = f3761k
            r0 = r18
            r1 = r13
            r6 = r17
            r7 = r15
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            q.h r0 = r8.f3777e
            r1 = r13[r10]
            r0.c(r1)
            p.e r0 = r8.f3774b
            q.o r0 = r0.f3658e
            q.h r0 = r0.f3777e
            r1 = r13[r12]
            goto L_0x02a1
        L_0x01b4:
            return
        L_0x01b5:
            if (r0 == 0) goto L_0x0228
            if (r4 == 0) goto L_0x0228
            q.g r0 = r8.f3780h
            boolean r2 = r0.f3738c
            if (r2 == 0) goto L_0x0227
            q.g r2 = r8.f3781i
            boolean r2 = r2.f3738c
            if (r2 != 0) goto L_0x01c6
            goto L_0x0227
        L_0x01c6:
            float r1 = r1.Y
            java.util.List<q.g> r0 = r0.f3747l
            java.lang.Object r0 = r0.get(r10)
            q.g r0 = (q.g) r0
            int r0 = r0.f3742g
            q.g r2 = r8.f3780h
            int r2 = r2.f3741f
            int r0 = r0 + r2
            q.g r2 = r8.f3781i
            java.util.List<q.g> r2 = r2.f3747l
            java.lang.Object r2 = r2.get(r10)
            q.g r2 = (q.g) r2
            int r2 = r2.f3742g
            q.g r4 = r8.f3781i
            int r4 = r4.f3741f
            int r2 = r2 - r4
            if (r15 == r3) goto L_0x0203
            if (r15 == 0) goto L_0x0203
            if (r15 == r12) goto L_0x01f0
            goto L_0x02a4
        L_0x01f0:
            int r2 = r2 - r0
            int r0 = r8.g(r2, r10)
            float r2 = (float) r0
            float r2 = r2 / r1
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r12)
            if (r2 == r3) goto L_0x0217
            float r0 = (float) r3
            float r0 = r0 * r1
            goto L_0x0215
        L_0x0203:
            int r2 = r2 - r0
            int r0 = r8.g(r2, r10)
            float r2 = (float) r0
            float r2 = r2 * r1
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r12)
            if (r2 == r3) goto L_0x0217
            float r0 = (float) r3
            float r0 = r0 / r1
        L_0x0215:
            float r0 = r0 + r11
            int r0 = (int) r0
        L_0x0217:
            q.h r1 = r8.f3777e
            r1.c(r0)
            p.e r0 = r8.f3774b
            q.o r0 = r0.f3658e
            q.h r0 = r0.f3777e
            r0.c(r3)
            goto L_0x02a4
        L_0x0227:
            return
        L_0x0228:
            if (r2 == 0) goto L_0x02a4
            if (r5 == 0) goto L_0x02a4
            boolean r0 = r13.f3738c
            if (r0 == 0) goto L_0x028b
            boolean r0 = r14.f3738c
            if (r0 != 0) goto L_0x0235
            goto L_0x028b
        L_0x0235:
            float r0 = r1.Y
            java.util.List<q.g> r1 = r13.f3747l
            java.lang.Object r1 = r1.get(r10)
            q.g r1 = (q.g) r1
            int r1 = r1.f3742g
            int r2 = r13.f3741f
            int r1 = r1 + r2
            java.util.List<q.g> r2 = r14.f3747l
            java.lang.Object r2 = r2.get(r10)
            q.g r2 = (q.g) r2
            int r2 = r2.f3742g
            int r4 = r14.f3741f
            int r2 = r2 - r4
            if (r15 == r3) goto L_0x026b
            if (r15 == 0) goto L_0x0258
            if (r15 == r12) goto L_0x026b
            goto L_0x02a4
        L_0x0258:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r12)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x027f
            float r1 = (float) r3
            float r1 = r1 / r0
            goto L_0x027d
        L_0x026b:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r12)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x027f
            float r1 = (float) r3
            float r1 = r1 * r0
        L_0x027d:
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x027f:
            q.h r0 = r8.f3777e
            r0.c(r3)
            p.e r0 = r8.f3774b
            q.o r0 = r0.f3658e
            q.h r0 = r0.f3777e
            goto L_0x02a1
        L_0x028b:
            return
        L_0x028c:
            p.e r2 = r1.V
            if (r2 == 0) goto L_0x02a4
            q.m r2 = r2.f3656d
            q.h r2 = r2.f3777e
            boolean r3 = r2.f3745j
            if (r3 == 0) goto L_0x02a4
            float r1 = r1.f3689w
            int r2 = r2.f3742g
            float r2 = (float) r2
            float r2 = r2 * r1
        L_0x029f:
            float r2 = r2 + r11
            int r1 = (int) r2
        L_0x02a1:
            r0.c(r1)
        L_0x02a4:
            q.g r0 = r8.f3780h
            boolean r1 = r0.f3738c
            if (r1 == 0) goto L_0x03bd
            q.g r1 = r8.f3781i
            boolean r2 = r1.f3738c
            if (r2 != 0) goto L_0x02b2
            goto L_0x03bd
        L_0x02b2:
            boolean r0 = r0.f3745j
            if (r0 == 0) goto L_0x02c1
            boolean r0 = r1.f3745j
            if (r0 == 0) goto L_0x02c1
            q.h r0 = r8.f3777e
            boolean r0 = r0.f3745j
            if (r0 == 0) goto L_0x02c1
            return
        L_0x02c1:
            q.h r0 = r8.f3777e
            boolean r0 = r0.f3745j
            if (r0 != 0) goto L_0x0309
            int r0 = r8.f3776d
            if (r0 != r9) goto L_0x0309
            p.e r0 = r8.f3774b
            int r1 = r0.f3684r
            if (r1 != 0) goto L_0x0309
            boolean r0 = r0.A()
            if (r0 != 0) goto L_0x0309
            q.g r0 = r8.f3780h
            java.util.List<q.g> r0 = r0.f3747l
            java.lang.Object r0 = r0.get(r10)
            q.g r0 = (q.g) r0
            q.g r1 = r8.f3781i
            java.util.List<q.g> r1 = r1.f3747l
            java.lang.Object r1 = r1.get(r10)
            q.g r1 = (q.g) r1
            int r0 = r0.f3742g
            q.g r2 = r8.f3780h
            int r3 = r2.f3741f
            int r0 = r0 + r3
            int r1 = r1.f3742g
            q.g r3 = r8.f3781i
            int r3 = r3.f3741f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.c(r0)
            q.g r0 = r8.f3781i
            r0.c(r1)
            q.h r0 = r8.f3777e
            r0.c(r3)
            return
        L_0x0309:
            q.h r0 = r8.f3777e
            boolean r0 = r0.f3745j
            if (r0 != 0) goto L_0x036b
            int r0 = r8.f3776d
            if (r0 != r9) goto L_0x036b
            int r0 = r8.f3773a
            if (r0 != r12) goto L_0x036b
            q.g r0 = r8.f3780h
            java.util.List<q.g> r0 = r0.f3747l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x036b
            q.g r0 = r8.f3781i
            java.util.List<q.g> r0 = r0.f3747l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x036b
            q.g r0 = r8.f3780h
            java.util.List<q.g> r0 = r0.f3747l
            java.lang.Object r0 = r0.get(r10)
            q.g r0 = (q.g) r0
            q.g r1 = r8.f3781i
            java.util.List<q.g> r1 = r1.f3747l
            java.lang.Object r1 = r1.get(r10)
            q.g r1 = (q.g) r1
            int r0 = r0.f3742g
            q.g r2 = r8.f3780h
            int r2 = r2.f3741f
            int r0 = r0 + r2
            int r1 = r1.f3742g
            q.g r2 = r8.f3781i
            int r2 = r2.f3741f
            int r1 = r1 + r2
            int r1 = r1 - r0
            q.h r0 = r8.f3777e
            int r0 = r0.f3757m
            int r0 = java.lang.Math.min(r1, r0)
            p.e r1 = r8.f3774b
            int r2 = r1.f3688v
            int r1 = r1.f3687u
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x0366
            int r0 = java.lang.Math.min(r2, r0)
        L_0x0366:
            q.h r1 = r8.f3777e
            r1.c(r0)
        L_0x036b:
            q.h r0 = r8.f3777e
            boolean r0 = r0.f3745j
            if (r0 != 0) goto L_0x0372
            return
        L_0x0372:
            q.g r0 = r8.f3780h
            java.util.List<q.g> r0 = r0.f3747l
            java.lang.Object r0 = r0.get(r10)
            q.g r0 = (q.g) r0
            q.g r1 = r8.f3781i
            java.util.List<q.g> r1 = r1.f3747l
            java.lang.Object r1 = r1.get(r10)
            q.g r1 = (q.g) r1
            int r2 = r0.f3742g
            q.g r3 = r8.f3780h
            int r4 = r3.f3741f
            int r4 = r4 + r2
            int r5 = r1.f3742g
            q.g r6 = r8.f3781i
            int r6 = r6.f3741f
            int r6 = r6 + r5
            p.e r7 = r8.f3774b
            float r7 = r7.f3661f0
            if (r0 != r1) goto L_0x039d
            r7 = 1056964608(0x3f000000, float:0.5)
            goto L_0x039f
        L_0x039d:
            r2 = r4
            r5 = r6
        L_0x039f:
            int r5 = r5 - r2
            q.h r0 = r8.f3777e
            int r0 = r0.f3742g
            int r5 = r5 - r0
            float r0 = (float) r2
            float r0 = r0 + r11
            float r1 = (float) r5
            float r1 = r1 * r7
            float r1 = r1 + r0
            int r0 = (int) r1
            r3.c(r0)
            q.g r0 = r8.f3781i
            q.g r1 = r8.f3780h
            int r1 = r1.f3742g
            q.h r2 = r8.f3777e
            int r2 = r2.f3742g
            int r1 = r1 + r2
            r0.c(r1)
        L_0x03bd:
            return
        L_0x03be:
            p.e r0 = r8.f3774b
            p.d r1 = r0.J
            p.d r0 = r0.L
            r8.l(r1, r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.m.a(q.d):void");
    }

    public void d() {
        d dVar;
        g gVar;
        e eVar;
        Object obj;
        List list;
        g gVar2;
        int i2;
        g gVar3;
        g gVar4;
        e eVar2;
        e eVar3;
        e eVar4 = this.f3774b;
        if (eVar4.f3650a) {
            this.f3777e.c(eVar4.u());
        }
        if (!this.f3777e.f3745j) {
            int m2 = this.f3774b.m();
            this.f3776d = m2;
            if (m2 != 3) {
                if (m2 == 4 && (eVar3 = this.f3774b.V) != null && (eVar3.m() == 1 || eVar3.m() == 4)) {
                    int u2 = (eVar3.u() - this.f3774b.J.d()) - this.f3774b.L.d();
                    b(this.f3780h, eVar3.f3656d.f3780h, this.f3774b.J.d());
                    b(this.f3781i, eVar3.f3656d.f3781i, -this.f3774b.L.d());
                    this.f3777e.c(u2);
                    return;
                } else if (this.f3776d == 1) {
                    this.f3777e.c(this.f3774b.u());
                }
            }
        } else if (this.f3776d == 4 && (eVar2 = this.f3774b.V) != null && (eVar2.m() == 1 || eVar2.m() == 4)) {
            b(this.f3780h, eVar2.f3656d.f3780h, this.f3774b.J.d());
            b(this.f3781i, eVar2.f3656d.f3781i, -this.f3774b.L.d());
            return;
        }
        h hVar = this.f3777e;
        if (hVar.f3745j) {
            e eVar5 = this.f3774b;
            if (eVar5.f3650a) {
                d[] dVarArr = eVar5.R;
                if (dVarArr[0].f3637f == null || dVarArr[1].f3637f == null) {
                    if (dVarArr[0].f3637f != null) {
                        g h2 = h(dVarArr[0]);
                        if (h2 != null) {
                            g gVar5 = this.f3780h;
                            int d2 = this.f3774b.R[0].d();
                            gVar5.f3747l.add(h2);
                            gVar5.f3741f = d2;
                            h2.f3746k.add(gVar5);
                        } else {
                            return;
                        }
                    } else if (dVarArr[1].f3637f != null) {
                        g h3 = h(dVarArr[1]);
                        if (h3 != null) {
                            g gVar6 = this.f3781i;
                            gVar6.f3747l.add(h3);
                            gVar6.f3741f = -this.f3774b.R[1].d();
                            h3.f3746k.add(gVar6);
                            gVar4 = this.f3780h;
                            gVar3 = this.f3781i;
                            i2 = -this.f3777e.f3742g;
                            b(gVar4, gVar3, i2);
                            return;
                        }
                        return;
                    } else if (!(eVar5 instanceof h) && eVar5.V != null && eVar5.i(d.a.CENTER).f3637f == null) {
                        e eVar6 = this.f3774b;
                        b(this.f3780h, eVar6.V.f3656d.f3780h, eVar6.v());
                    } else {
                        return;
                    }
                    gVar4 = this.f3781i;
                    gVar3 = this.f3780h;
                    i2 = this.f3777e.f3742g;
                    b(gVar4, gVar3, i2);
                    return;
                } else if (eVar5.A()) {
                    this.f3780h.f3741f = this.f3774b.R[0].d();
                    gVar = this.f3781i;
                    dVar = this.f3774b.R[1];
                    gVar.f3741f = -dVar.d();
                } else {
                    g h4 = h(this.f3774b.R[0]);
                    if (h4 != null) {
                        g gVar7 = this.f3780h;
                        int d3 = this.f3774b.R[0].d();
                        gVar7.f3747l.add(h4);
                        gVar7.f3741f = d3;
                        h4.f3746k.add(gVar7);
                    }
                    g h5 = h(this.f3774b.R[1]);
                    if (h5 != null) {
                        g gVar8 = this.f3781i;
                        gVar8.f3747l.add(h5);
                        gVar8.f3741f = -this.f3774b.R[1].d();
                        h5.f3746k.add(gVar8);
                    }
                    this.f3780h.f3737b = true;
                    this.f3781i.f3737b = true;
                    return;
                }
            }
        }
        if (this.f3776d == 3) {
            e eVar7 = this.f3774b;
            int i3 = eVar7.f3684r;
            if (i3 == 2) {
                e eVar8 = eVar7.V;
                if (eVar8 != null) {
                    h hVar2 = eVar8.f3658e.f3777e;
                    hVar.f3747l.add(hVar2);
                    hVar2.f3746k.add(this.f3777e);
                    h hVar3 = this.f3777e;
                    hVar3.f3737b = true;
                    hVar3.f3746k.add(this.f3780h);
                    list = this.f3777e.f3746k;
                    obj = this.f3781i;
                }
            } else if (i3 == 3) {
                if (eVar7.f3685s == 3) {
                    this.f3780h.f3736a = this;
                    this.f3781i.f3736a = this;
                    o oVar = eVar7.f3658e;
                    oVar.f3780h.f3736a = this;
                    oVar.f3781i.f3736a = this;
                    hVar.f3736a = this;
                    if (eVar7.B()) {
                        this.f3777e.f3747l.add(this.f3774b.f3658e.f3777e);
                        this.f3774b.f3658e.f3777e.f3746k.add(this.f3777e);
                        o oVar2 = this.f3774b.f3658e;
                        oVar2.f3777e.f3736a = this;
                        this.f3777e.f3747l.add(oVar2.f3780h);
                        this.f3777e.f3747l.add(this.f3774b.f3658e.f3781i);
                        this.f3774b.f3658e.f3780h.f3746k.add(this.f3777e);
                        list = this.f3774b.f3658e.f3781i.f3746k;
                        obj = this.f3777e;
                    } else if (this.f3774b.A()) {
                        this.f3774b.f3658e.f3777e.f3747l.add(this.f3777e);
                        list = this.f3777e.f3746k;
                        obj = this.f3774b.f3658e.f3777e;
                    } else {
                        gVar2 = this.f3774b.f3658e.f3777e;
                    }
                } else {
                    h hVar4 = eVar7.f3658e.f3777e;
                    hVar.f3747l.add(hVar4);
                    hVar4.f3746k.add(this.f3777e);
                    this.f3774b.f3658e.f3780h.f3746k.add(this.f3777e);
                    this.f3774b.f3658e.f3781i.f3746k.add(this.f3777e);
                    h hVar5 = this.f3777e;
                    hVar5.f3737b = true;
                    hVar5.f3746k.add(this.f3780h);
                    this.f3777e.f3746k.add(this.f3781i);
                    this.f3780h.f3747l.add(this.f3777e);
                    gVar2 = this.f3781i;
                }
                list = gVar2.f3747l;
                obj = this.f3777e;
            }
            list.add(obj);
        }
        e eVar9 = this.f3774b;
        d[] dVarArr2 = eVar9.R;
        if (dVarArr2[0].f3637f == null || dVarArr2[1].f3637f == null) {
            if (dVarArr2[0].f3637f != null) {
                g h6 = h(dVarArr2[0]);
                if (h6 != null) {
                    g gVar9 = this.f3780h;
                    int d4 = this.f3774b.R[0].d();
                    gVar9.f3747l.add(h6);
                    gVar9.f3741f = d4;
                    h6.f3746k.add(gVar9);
                } else {
                    return;
                }
            } else if (dVarArr2[1].f3637f != null) {
                g h7 = h(dVarArr2[1]);
                if (h7 != null) {
                    g gVar10 = this.f3781i;
                    gVar10.f3747l.add(h7);
                    gVar10.f3741f = -this.f3774b.R[1].d();
                    h7.f3746k.add(gVar10);
                    c(this.f3780h, this.f3781i, -1, this.f3777e);
                    return;
                }
                return;
            } else if (!(eVar9 instanceof h) && (eVar = eVar9.V) != null) {
                b(this.f3780h, eVar.f3656d.f3780h, eVar9.v());
            } else {
                return;
            }
            c(this.f3781i, this.f3780h, 1, this.f3777e);
        } else if (eVar9.A()) {
            this.f3780h.f3741f = this.f3774b.R[0].d();
            gVar = this.f3781i;
            dVar = this.f3774b.R[1];
            gVar.f3741f = -dVar.d();
        } else {
            g h8 = h(this.f3774b.R[0]);
            g h9 = h(this.f3774b.R[1]);
            if (h8 != null) {
                h8.f3746k.add(this);
                if (h8.f3745j) {
                    a(this);
                }
            }
            if (h9 != null) {
                h9.f3746k.add(this);
                if (h9.f3745j) {
                    a(this);
                }
            }
            this.f3782j = 4;
        }
    }

    public void e() {
        g gVar = this.f3780h;
        if (gVar.f3745j) {
            this.f3774b.f3651a0 = gVar.f3742g;
        }
    }

    public void f() {
        this.f3775c = null;
        this.f3780h.b();
        this.f3781i.b();
        this.f3777e.b();
        this.f3779g = false;
    }

    public boolean k() {
        return this.f3776d != 3 || this.f3774b.f3684r == 0;
    }

    public final void m(int[] iArr, int i2, int i3, int i4, int i5, float f2, int i6) {
        int i7 = i3 - i2;
        int i8 = i5 - i4;
        if (i6 == -1) {
            int i9 = (int) ((((float) i8) * f2) + 0.5f);
            int i10 = (int) ((((float) i7) / f2) + 0.5f);
            if (i9 <= i7) {
                iArr[0] = i9;
                iArr[1] = i8;
            } else if (i10 <= i8) {
                iArr[0] = i7;
                iArr[1] = i10;
            }
        } else if (i6 == 0) {
            iArr[0] = (int) ((((float) i8) * f2) + 0.5f);
            iArr[1] = i8;
        } else if (i6 == 1) {
            iArr[0] = i7;
            iArr[1] = (int) ((((float) i7) * f2) + 0.5f);
        }
    }

    public void n() {
        this.f3779g = false;
        this.f3780h.b();
        this.f3780h.f3745j = false;
        this.f3781i.b();
        this.f3781i.f3745j = false;
        this.f3777e.f3745j = false;
    }

    public String toString() {
        StringBuilder a2 = a.a("HorizontalRun ");
        a2.append(this.f3774b.f3669j0);
        return a2.toString();
    }
}
