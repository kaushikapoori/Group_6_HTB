package q;

import java.util.ArrayList;
import java.util.Iterator;
import p.e;

public class c extends q {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<q> f3726k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public int f3727l;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r2 == 1) goto L_0x003f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(p.e r4, int r5) {
        /*
            r3 = this;
            r3.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.f3726k = r4
            r3.f3778f = r5
            p.e r4 = r3.f3774b
        L_0x000e:
            int r5 = r3.f3778f
            p.e r5 = r4.o(r5)
            if (r5 == 0) goto L_0x0018
            r4 = r5
            goto L_0x000e
        L_0x0018:
            r3.f3774b = r4
            java.util.ArrayList<q.q> r5 = r3.f3726k
            int r0 = r3.f3778f
            r1 = 1
            if (r0 != 0) goto L_0x0023
            r0 = r3
            goto L_0x003a
        L_0x0023:
            if (r0 != r1) goto L_0x0027
            r0 = r3
            goto L_0x003f
        L_0x0027:
            r0 = r3
        L_0x0028:
            r2 = 0
        L_0x0029:
            r5.add(r2)
            int r5 = r0.f3778f
            p.e r4 = r4.n(r5)
            if (r4 == 0) goto L_0x0042
            java.util.ArrayList<q.q> r5 = r0.f3726k
            int r2 = r0.f3778f
            if (r2 != 0) goto L_0x003d
        L_0x003a:
            q.m r2 = r4.f3656d
            goto L_0x0029
        L_0x003d:
            if (r2 != r1) goto L_0x0028
        L_0x003f:
            q.o r2 = r4.f3658e
            goto L_0x0029
        L_0x0042:
            java.util.ArrayList<q.q> r4 = r0.f3726k
            java.util.Iterator r4 = r4.iterator()
        L_0x0048:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0064
            java.lang.Object r5 = r4.next()
            q.q r5 = (q.q) r5
            int r2 = r0.f3778f
            if (r2 != 0) goto L_0x005d
            p.e r5 = r5.f3774b
            r5.f3652b = r0
            goto L_0x0048
        L_0x005d:
            if (r2 != r1) goto L_0x0048
            p.e r5 = r5.f3774b
            r5.f3654c = r0
            goto L_0x0048
        L_0x0064:
            int r4 = r0.f3778f
            if (r4 != 0) goto L_0x0074
            p.e r4 = r0.f3774b
            p.e r4 = r4.V
            p.f r4 = (p.f) r4
            boolean r4 = r4.f3697w0
            if (r4 == 0) goto L_0x0074
            r4 = 1
            goto L_0x0075
        L_0x0074:
            r4 = 0
        L_0x0075:
            if (r4 == 0) goto L_0x0090
            java.util.ArrayList<q.q> r4 = r0.f3726k
            int r4 = r4.size()
            if (r4 <= r1) goto L_0x0090
            java.util.ArrayList<q.q> r4 = r0.f3726k
            int r5 = r4.size()
            int r5 = r5 - r1
            java.lang.Object r4 = r4.get(r5)
            q.q r4 = (q.q) r4
            p.e r4 = r4.f3774b
            r0.f3774b = r4
        L_0x0090:
            int r4 = r0.f3778f
            if (r4 != 0) goto L_0x0099
            p.e r4 = r0.f3774b
            int r4 = r4.f3671k0
            goto L_0x009d
        L_0x0099:
            p.e r4 = r0.f3774b
            int r4 = r4.f3673l0
        L_0x009d:
            r0.f3727l = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.c.<init>(p.e, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(q.d r26) {
        /*
            r25 = this;
            r0 = r25
            q.g r1 = r0.f3780h
            boolean r2 = r1.f3745j
            if (r2 == 0) goto L_0x03bd
            q.g r2 = r0.f3781i
            boolean r3 = r2.f3745j
            if (r3 != 0) goto L_0x0010
            goto L_0x03bd
        L_0x0010:
            p.e r3 = r0.f3774b
            p.e r3 = r3.V
            boolean r4 = r3 instanceof p.f
            if (r4 == 0) goto L_0x001d
            p.f r3 = (p.f) r3
            boolean r3 = r3.f3697w0
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r2 = r2.f3742g
            int r1 = r1.f3742g
            int r2 = r2 - r1
            java.util.ArrayList<q.q> r1 = r0.f3726k
            int r1 = r1.size()
            r4 = 0
        L_0x002a:
            r6 = -1
            r7 = 8
            if (r4 >= r1) goto L_0x0040
            java.util.ArrayList<q.q> r8 = r0.f3726k
            java.lang.Object r8 = r8.get(r4)
            q.q r8 = (q.q) r8
            p.e r8 = r8.f3774b
            int r8 = r8.f3667i0
            if (r8 != r7) goto L_0x0041
            int r4 = r4 + 1
            goto L_0x002a
        L_0x0040:
            r4 = -1
        L_0x0041:
            int r8 = r1 + -1
            r9 = r8
        L_0x0044:
            if (r9 < 0) goto L_0x0058
            java.util.ArrayList<q.q> r10 = r0.f3726k
            java.lang.Object r10 = r10.get(r9)
            q.q r10 = (q.q) r10
            p.e r10 = r10.f3774b
            int r10 = r10.f3667i0
            if (r10 != r7) goto L_0x0057
            int r9 = r9 + -1
            goto L_0x0044
        L_0x0057:
            r6 = r9
        L_0x0058:
            r9 = 0
        L_0x0059:
            r11 = 2
            r13 = 3
            if (r9 >= r11) goto L_0x00f8
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0065:
            if (r14 >= r1) goto L_0x00e8
            java.util.ArrayList<q.q> r5 = r0.f3726k
            java.lang.Object r5 = r5.get(r14)
            q.q r5 = (q.q) r5
            p.e r11 = r5.f3774b
            int r10 = r11.f3667i0
            if (r10 != r7) goto L_0x0077
            goto L_0x00e0
        L_0x0077:
            int r17 = r17 + 1
            if (r14 <= 0) goto L_0x0082
            if (r14 < r4) goto L_0x0082
            q.g r10 = r5.f3780h
            int r10 = r10.f3741f
            int r15 = r15 + r10
        L_0x0082:
            q.h r10 = r5.f3777e
            int r7 = r10.f3742g
            int r12 = r5.f3776d
            if (r12 == r13) goto L_0x008c
            r12 = 1
            goto L_0x008d
        L_0x008c:
            r12 = 0
        L_0x008d:
            if (r12 == 0) goto L_0x00ab
            int r10 = r0.f3778f
            if (r10 != 0) goto L_0x009c
            q.m r13 = r11.f3656d
            q.h r13 = r13.f3777e
            boolean r13 = r13.f3745j
            if (r13 != 0) goto L_0x009c
            return
        L_0x009c:
            r13 = 1
            if (r10 != r13) goto L_0x00a8
            q.o r10 = r11.f3658e
            q.h r10 = r10.f3777e
            boolean r10 = r10.f3745j
            if (r10 != 0) goto L_0x00a8
            return
        L_0x00a8:
            r20 = r7
            goto L_0x00c1
        L_0x00ab:
            r20 = r7
            r13 = 1
            int r7 = r5.f3773a
            if (r7 != r13) goto L_0x00b9
            if (r9 != 0) goto L_0x00b9
            int r7 = r10.f3757m
            int r16 = r16 + 1
            goto L_0x00bf
        L_0x00b9:
            boolean r7 = r10.f3745j
            if (r7 == 0) goto L_0x00c1
            r7 = r20
        L_0x00bf:
            r12 = 1
            goto L_0x00c3
        L_0x00c1:
            r7 = r20
        L_0x00c3:
            if (r12 != 0) goto L_0x00d5
            int r16 = r16 + 1
            float[] r7 = r11.f3675m0
            int r10 = r0.f3778f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00d6
            float r18 = r18 + r7
            goto L_0x00d6
        L_0x00d5:
            int r15 = r15 + r7
        L_0x00d6:
            if (r14 >= r8) goto L_0x00e0
            if (r14 >= r6) goto L_0x00e0
            q.g r5 = r5.f3781i
            int r5 = r5.f3741f
            int r5 = -r5
            int r15 = r15 + r5
        L_0x00e0:
            int r14 = r14 + 1
            r7 = 8
            r11 = 2
            r13 = 3
            goto L_0x0065
        L_0x00e8:
            if (r15 < r2) goto L_0x00f3
            if (r16 != 0) goto L_0x00ed
            goto L_0x00f3
        L_0x00ed:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0059
        L_0x00f3:
            r5 = r16
            r7 = r17
            goto L_0x00fd
        L_0x00f8:
            r5 = 0
            r7 = 0
            r15 = 0
            r18 = 0
        L_0x00fd:
            q.g r9 = r0.f3780h
            int r9 = r9.f3742g
            if (r3 == 0) goto L_0x0107
            q.g r9 = r0.f3781i
            int r9 = r9.f3742g
        L_0x0107:
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r15 <= r2) goto L_0x0118
            r11 = 1073741824(0x40000000, float:2.0)
            int r12 = r15 - r2
            float r12 = (float) r12
            float r12 = r12 / r11
            float r12 = r12 + r10
            int r11 = (int) r12
            if (r3 == 0) goto L_0x0117
            int r9 = r9 + r11
            goto L_0x0118
        L_0x0117:
            int r9 = r9 - r11
        L_0x0118:
            if (r5 <= 0) goto L_0x01f9
            int r11 = r2 - r15
            float r11 = (float) r11
            float r12 = (float) r5
            float r12 = r11 / r12
            float r12 = r12 + r10
            int r12 = (int) r12
            r13 = 0
            r14 = 0
        L_0x0124:
            if (r13 >= r1) goto L_0x01ad
            java.util.ArrayList<q.q> r10 = r0.f3726k
            java.lang.Object r10 = r10.get(r13)
            q.q r10 = (q.q) r10
            r17 = r12
            p.e r12 = r10.f3774b
            r20 = r15
            int r15 = r12.f3667i0
            r21 = r9
            r9 = 8
            if (r15 != r9) goto L_0x013d
            goto L_0x0195
        L_0x013d:
            int r9 = r10.f3776d
            r15 = 3
            if (r9 != r15) goto L_0x0195
            q.h r9 = r10.f3777e
            boolean r15 = r9.f3745j
            if (r15 != 0) goto L_0x0195
            r15 = 0
            int r19 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r19 <= 0) goto L_0x015e
            float[] r15 = r12.f3675m0
            r22 = r3
            int r3 = r0.f3778f
            r3 = r15[r3]
            float r3 = r3 * r11
            float r3 = r3 / r18
            r15 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r15
            int r3 = (int) r3
            goto L_0x0162
        L_0x015e:
            r22 = r3
            r3 = r17
        L_0x0162:
            int r15 = r0.f3778f
            if (r15 != 0) goto L_0x016b
            int r15 = r12.f3688v
            int r12 = r12.f3687u
            goto L_0x016f
        L_0x016b:
            int r15 = r12.f3691y
            int r12 = r12.f3690x
        L_0x016f:
            r23 = r11
            int r11 = r10.f3773a
            r24 = r7
            r7 = 1
            if (r11 != r7) goto L_0x017f
            int r7 = r9.f3757m
            int r7 = java.lang.Math.min(r3, r7)
            goto L_0x0180
        L_0x017f:
            r7 = r3
        L_0x0180:
            int r7 = java.lang.Math.max(r12, r7)
            if (r15 <= 0) goto L_0x018a
            int r7 = java.lang.Math.min(r15, r7)
        L_0x018a:
            if (r7 == r3) goto L_0x018f
            int r14 = r14 + 1
            r3 = r7
        L_0x018f:
            q.h r7 = r10.f3777e
            r7.c(r3)
            goto L_0x019b
        L_0x0195:
            r22 = r3
            r24 = r7
            r23 = r11
        L_0x019b:
            int r13 = r13 + 1
            r12 = r17
            r15 = r20
            r9 = r21
            r3 = r22
            r11 = r23
            r7 = r24
            r10 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0124
        L_0x01ad:
            r22 = r3
            r24 = r7
            r21 = r9
            r20 = r15
            if (r14 <= 0) goto L_0x01ea
            int r5 = r5 - r14
            r3 = 0
            r7 = 0
        L_0x01ba:
            if (r3 >= r1) goto L_0x01e8
            java.util.ArrayList<q.q> r9 = r0.f3726k
            java.lang.Object r9 = r9.get(r3)
            q.q r9 = (q.q) r9
            p.e r10 = r9.f3774b
            int r10 = r10.f3667i0
            r11 = 8
            if (r10 != r11) goto L_0x01cd
            goto L_0x01e5
        L_0x01cd:
            if (r3 <= 0) goto L_0x01d6
            if (r3 < r4) goto L_0x01d6
            q.g r10 = r9.f3780h
            int r10 = r10.f3741f
            int r7 = r7 + r10
        L_0x01d6:
            q.h r10 = r9.f3777e
            int r10 = r10.f3742g
            int r7 = r7 + r10
            if (r3 >= r8) goto L_0x01e5
            if (r3 >= r6) goto L_0x01e5
            q.g r9 = r9.f3781i
            int r9 = r9.f3741f
            int r9 = -r9
            int r7 = r7 + r9
        L_0x01e5:
            int r3 = r3 + 1
            goto L_0x01ba
        L_0x01e8:
            r15 = r7
            goto L_0x01ec
        L_0x01ea:
            r15 = r20
        L_0x01ec:
            int r3 = r0.f3727l
            r7 = 2
            if (r3 != r7) goto L_0x01f7
            if (r14 != 0) goto L_0x01f7
            r3 = 0
            r0.f3727l = r3
            goto L_0x0203
        L_0x01f7:
            r3 = 0
            goto L_0x0203
        L_0x01f9:
            r22 = r3
            r24 = r7
            r21 = r9
            r20 = r15
            r3 = 0
            r7 = 2
        L_0x0203:
            if (r15 <= r2) goto L_0x0207
            r0.f3727l = r7
        L_0x0207:
            if (r24 <= 0) goto L_0x020f
            if (r5 != 0) goto L_0x020f
            if (r4 != r6) goto L_0x020f
            r0.f3727l = r7
        L_0x020f:
            int r7 = r0.f3727l
            r9 = 1
            r10 = r24
            if (r7 != r9) goto L_0x02a0
            if (r10 <= r9) goto L_0x021d
            int r2 = r2 - r15
            int r7 = r10 + -1
            int r2 = r2 / r7
            goto L_0x0224
        L_0x021d:
            if (r10 != r9) goto L_0x0223
            int r2 = r2 - r15
            r7 = 2
            int r2 = r2 / r7
            goto L_0x0224
        L_0x0223:
            r2 = 0
        L_0x0224:
            if (r5 <= 0) goto L_0x0227
            r2 = 0
        L_0x0227:
            r9 = r21
            r5 = 0
        L_0x022a:
            if (r5 >= r1) goto L_0x03bd
            if (r22 == 0) goto L_0x0233
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x0234
        L_0x0233:
            r3 = r5
        L_0x0234:
            java.util.ArrayList<q.q> r7 = r0.f3726k
            java.lang.Object r3 = r7.get(r3)
            q.q r3 = (q.q) r3
            p.e r7 = r3.f3774b
            int r7 = r7.f3667i0
            r10 = 8
            if (r7 != r10) goto L_0x024f
            q.g r7 = r3.f3780h
            r7.c(r9)
            q.g r3 = r3.f3781i
            r3.c(r9)
            goto L_0x029d
        L_0x024f:
            if (r5 <= 0) goto L_0x0256
            if (r22 == 0) goto L_0x0255
            int r9 = r9 - r2
            goto L_0x0256
        L_0x0255:
            int r9 = r9 + r2
        L_0x0256:
            if (r5 <= 0) goto L_0x0263
            if (r5 < r4) goto L_0x0263
            q.g r7 = r3.f3780h
            int r7 = r7.f3741f
            if (r22 == 0) goto L_0x0262
            int r9 = r9 - r7
            goto L_0x0263
        L_0x0262:
            int r9 = r9 + r7
        L_0x0263:
            if (r22 == 0) goto L_0x0268
            q.g r7 = r3.f3781i
            goto L_0x026a
        L_0x0268:
            q.g r7 = r3.f3780h
        L_0x026a:
            r7.c(r9)
            q.h r7 = r3.f3777e
            int r10 = r7.f3742g
            int r11 = r3.f3776d
            r12 = 3
            if (r11 != r12) goto L_0x027d
            int r11 = r3.f3773a
            r12 = 1
            if (r11 != r12) goto L_0x027d
            int r10 = r7.f3757m
        L_0x027d:
            if (r22 == 0) goto L_0x0281
            int r9 = r9 - r10
            goto L_0x0282
        L_0x0281:
            int r9 = r9 + r10
        L_0x0282:
            if (r22 == 0) goto L_0x0287
            q.g r7 = r3.f3780h
            goto L_0x0289
        L_0x0287:
            q.g r7 = r3.f3781i
        L_0x0289:
            r7.c(r9)
            r7 = 1
            r3.f3779g = r7
            if (r5 >= r8) goto L_0x029d
            if (r5 >= r6) goto L_0x029d
            q.g r3 = r3.f3781i
            int r3 = r3.f3741f
            int r3 = -r3
            if (r22 == 0) goto L_0x029c
            int r9 = r9 - r3
            goto L_0x029d
        L_0x029c:
            int r9 = r9 + r3
        L_0x029d:
            int r5 = r5 + 1
            goto L_0x022a
        L_0x02a0:
            if (r7 != 0) goto L_0x0322
            int r2 = r2 - r15
            r7 = 1
            int r9 = r10 + 1
            int r2 = r2 / r9
            if (r5 <= 0) goto L_0x02aa
            r2 = 0
        L_0x02aa:
            r9 = r21
            r5 = 0
        L_0x02ad:
            if (r5 >= r1) goto L_0x03bd
            if (r22 == 0) goto L_0x02b6
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x02b7
        L_0x02b6:
            r3 = r5
        L_0x02b7:
            java.util.ArrayList<q.q> r7 = r0.f3726k
            java.lang.Object r3 = r7.get(r3)
            q.q r3 = (q.q) r3
            p.e r7 = r3.f3774b
            int r7 = r7.f3667i0
            r10 = 8
            if (r7 != r10) goto L_0x02d2
            q.g r7 = r3.f3780h
            r7.c(r9)
            q.g r3 = r3.f3781i
            r3.c(r9)
            goto L_0x031f
        L_0x02d2:
            if (r22 == 0) goto L_0x02d6
            int r9 = r9 - r2
            goto L_0x02d7
        L_0x02d6:
            int r9 = r9 + r2
        L_0x02d7:
            if (r5 <= 0) goto L_0x02e4
            if (r5 < r4) goto L_0x02e4
            q.g r7 = r3.f3780h
            int r7 = r7.f3741f
            if (r22 == 0) goto L_0x02e3
            int r9 = r9 - r7
            goto L_0x02e4
        L_0x02e3:
            int r9 = r9 + r7
        L_0x02e4:
            if (r22 == 0) goto L_0x02e9
            q.g r7 = r3.f3781i
            goto L_0x02eb
        L_0x02e9:
            q.g r7 = r3.f3780h
        L_0x02eb:
            r7.c(r9)
            q.h r7 = r3.f3777e
            int r10 = r7.f3742g
            int r11 = r3.f3776d
            r12 = 3
            if (r11 != r12) goto L_0x0302
            int r11 = r3.f3773a
            r12 = 1
            if (r11 != r12) goto L_0x0302
            int r7 = r7.f3757m
            int r10 = java.lang.Math.min(r10, r7)
        L_0x0302:
            if (r22 == 0) goto L_0x0306
            int r9 = r9 - r10
            goto L_0x0307
        L_0x0306:
            int r9 = r9 + r10
        L_0x0307:
            if (r22 == 0) goto L_0x030c
            q.g r7 = r3.f3780h
            goto L_0x030e
        L_0x030c:
            q.g r7 = r3.f3781i
        L_0x030e:
            r7.c(r9)
            if (r5 >= r8) goto L_0x031f
            if (r5 >= r6) goto L_0x031f
            q.g r3 = r3.f3781i
            int r3 = r3.f3741f
            int r3 = -r3
            if (r22 == 0) goto L_0x031e
            int r9 = r9 - r3
            goto L_0x031f
        L_0x031e:
            int r9 = r9 + r3
        L_0x031f:
            int r5 = r5 + 1
            goto L_0x02ad
        L_0x0322:
            r9 = 2
            if (r7 != r9) goto L_0x03bd
            int r7 = r0.f3778f
            if (r7 != 0) goto L_0x032e
            p.e r7 = r0.f3774b
            float r7 = r7.f3661f0
            goto L_0x0332
        L_0x032e:
            p.e r7 = r0.f3774b
            float r7 = r7.f3663g0
        L_0x0332:
            if (r22 == 0) goto L_0x0338
            r9 = 1065353216(0x3f800000, float:1.0)
            float r7 = r9 - r7
        L_0x0338:
            int r2 = r2 - r15
            float r2 = (float) r2
            float r2 = r2 * r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r7
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0344
            if (r5 <= 0) goto L_0x0345
        L_0x0344:
            r2 = 0
        L_0x0345:
            if (r22 == 0) goto L_0x034a
            int r9 = r21 - r2
            goto L_0x034c
        L_0x034a:
            int r9 = r21 + r2
        L_0x034c:
            r5 = 0
        L_0x034d:
            if (r5 >= r1) goto L_0x03bd
            if (r22 == 0) goto L_0x0356
            int r2 = r5 + 1
            int r2 = r1 - r2
            goto L_0x0357
        L_0x0356:
            r2 = r5
        L_0x0357:
            java.util.ArrayList<q.q> r3 = r0.f3726k
            java.lang.Object r2 = r3.get(r2)
            q.q r2 = (q.q) r2
            p.e r3 = r2.f3774b
            int r3 = r3.f3667i0
            r7 = 8
            if (r3 != r7) goto L_0x0374
            q.g r3 = r2.f3780h
            r3.c(r9)
            q.g r2 = r2.f3781i
            r2.c(r9)
            r12 = 3
            r13 = 1
            goto L_0x03ba
        L_0x0374:
            if (r5 <= 0) goto L_0x0381
            if (r5 < r4) goto L_0x0381
            q.g r3 = r2.f3780h
            int r3 = r3.f3741f
            if (r22 == 0) goto L_0x0380
            int r9 = r9 - r3
            goto L_0x0381
        L_0x0380:
            int r9 = r9 + r3
        L_0x0381:
            if (r22 == 0) goto L_0x0386
            q.g r3 = r2.f3781i
            goto L_0x0388
        L_0x0386:
            q.g r3 = r2.f3780h
        L_0x0388:
            r3.c(r9)
            q.h r3 = r2.f3777e
            int r10 = r3.f3742g
            int r11 = r2.f3776d
            r12 = 3
            if (r11 != r12) goto L_0x039c
            int r11 = r2.f3773a
            r13 = 1
            if (r11 != r13) goto L_0x039d
            int r10 = r3.f3757m
            goto L_0x039d
        L_0x039c:
            r13 = 1
        L_0x039d:
            if (r22 == 0) goto L_0x03a1
            int r9 = r9 - r10
            goto L_0x03a2
        L_0x03a1:
            int r9 = r9 + r10
        L_0x03a2:
            if (r22 == 0) goto L_0x03a7
            q.g r3 = r2.f3780h
            goto L_0x03a9
        L_0x03a7:
            q.g r3 = r2.f3781i
        L_0x03a9:
            r3.c(r9)
            if (r5 >= r8) goto L_0x03ba
            if (r5 >= r6) goto L_0x03ba
            q.g r2 = r2.f3781i
            int r2 = r2.f3741f
            int r2 = -r2
            if (r22 == 0) goto L_0x03b9
            int r9 = r9 - r2
            goto L_0x03ba
        L_0x03b9:
            int r9 = r9 + r2
        L_0x03ba:
            int r5 = r5 + 1
            goto L_0x034d
        L_0x03bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.c.a(q.d):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0076, code lost:
        if (r1 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c4, code lost:
        if (r1 != null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r6 = this;
            java.util.ArrayList<q.q> r0 = r6.f3726k
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0016
            java.lang.Object r1 = r0.next()
            q.q r1 = (q.q) r1
            r1.d()
            goto L_0x0006
        L_0x0016:
            java.util.ArrayList<q.q> r0 = r6.f3726k
            int r0 = r0.size()
            r1 = 1
            if (r0 >= r1) goto L_0x0020
            return
        L_0x0020:
            java.util.ArrayList<q.q> r2 = r6.f3726k
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            q.q r2 = (q.q) r2
            p.e r2 = r2.f3774b
            java.util.ArrayList<q.q> r4 = r6.f3726k
            int r0 = r0 - r1
            java.lang.Object r0 = r4.get(r0)
            q.q r0 = (q.q) r0
            p.e r0 = r0.f3774b
            int r4 = r6.f3778f
            if (r4 != 0) goto L_0x0088
            p.d r1 = r2.J
            p.d r0 = r0.L
            q.g r2 = r6.i(r1, r3)
            int r1 = r1.d()
            p.e r4 = r6.m()
            if (r4 == 0) goto L_0x0052
            p.d r1 = r4.J
            int r1 = r1.d()
        L_0x0052:
            if (r2 == 0) goto L_0x0062
            q.g r4 = r6.f3780h
            java.util.List<q.g> r5 = r4.f3747l
            r5.add(r2)
            r4.f3741f = r1
            java.util.List<q.d> r1 = r2.f3746k
            r1.add(r4)
        L_0x0062:
            q.g r1 = r6.i(r0, r3)
            int r0 = r0.d()
            p.e r2 = r6.n()
            if (r2 == 0) goto L_0x0076
            p.d r0 = r2.L
            int r0 = r0.d()
        L_0x0076:
            if (r1 == 0) goto L_0x00c7
        L_0x0078:
            q.g r2 = r6.f3781i
            int r0 = -r0
            java.util.List<q.g> r3 = r2.f3747l
            r3.add(r1)
            r2.f3741f = r0
            java.util.List<q.d> r0 = r1.f3746k
            r0.add(r2)
            goto L_0x00c7
        L_0x0088:
            p.d r2 = r2.K
            p.d r0 = r0.M
            q.g r3 = r6.i(r2, r1)
            int r2 = r2.d()
            p.e r4 = r6.m()
            if (r4 == 0) goto L_0x00a0
            p.d r2 = r4.K
            int r2 = r2.d()
        L_0x00a0:
            if (r3 == 0) goto L_0x00b0
            q.g r4 = r6.f3780h
            java.util.List<q.g> r5 = r4.f3747l
            r5.add(r3)
            r4.f3741f = r2
            java.util.List<q.d> r2 = r3.f3746k
            r2.add(r4)
        L_0x00b0:
            q.g r1 = r6.i(r0, r1)
            int r0 = r0.d()
            p.e r2 = r6.n()
            if (r2 == 0) goto L_0x00c4
            p.d r0 = r2.M
            int r0 = r0.d()
        L_0x00c4:
            if (r1 == 0) goto L_0x00c7
            goto L_0x0078
        L_0x00c7:
            q.g r0 = r6.f3780h
            r0.f3736a = r6
            q.g r0 = r6.f3781i
            r0.f3736a = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.c.d():void");
    }

    public void e() {
        for (int i2 = 0; i2 < this.f3726k.size(); i2++) {
            this.f3726k.get(i2).e();
        }
    }

    public void f() {
        this.f3775c = null;
        Iterator<q> it = this.f3726k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public long j() {
        int size = this.f3726k.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            q qVar = this.f3726k.get(i2);
            j2 = ((long) qVar.f3781i.f3741f) + qVar.j() + j2 + ((long) qVar.f3780h.f3741f);
        }
        return j2;
    }

    public boolean k() {
        int size = this.f3726k.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.f3726k.get(i2).k()) {
                return false;
            }
        }
        return true;
    }

    public final e m() {
        for (int i2 = 0; i2 < this.f3726k.size(); i2++) {
            e eVar = this.f3726k.get(i2).f3774b;
            if (eVar.f3667i0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public final e n() {
        for (int size = this.f3726k.size() - 1; size >= 0; size--) {
            e eVar = this.f3726k.get(size).f3774b;
            if (eVar.f3667i0 != 8) {
                return eVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f3778f == 0 ? "horizontal : " : "vertical : ");
        Iterator<q> it = this.f3726k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
