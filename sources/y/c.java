package y;

import android.util.TypedValue;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f4322a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r2v11, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.res.Resources r36, org.xmlpull.v1.XmlPullParser r37, android.util.AttributeSet r38, android.content.res.Resources.Theme r39) {
        /*
            r0 = r36
            r1 = r38
            r2 = r39
            java.lang.String r3 = r37.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0350
            int r3 = r37.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = 0
        L_0x0020:
            int r9 = r37.next()
            if (r9 == r4) goto L_0x033e
            int r10 = r37.getDepth()
            r11 = 3
            if (r10 >= r3) goto L_0x002f
            if (r9 == r11) goto L_0x033e
        L_0x002f:
            r12 = 2
            if (r9 != r12) goto L_0x032c
            if (r10 > r3) goto L_0x032c
            java.lang.String r9 = r37.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0042
            goto L_0x032c
        L_0x0042:
            int[] r9 = v.a.f4020a
            if (r2 != 0) goto L_0x004b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x004f
        L_0x004b:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x004f:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r10) goto L_0x008a
            java.lang.ThreadLocal<android.util.TypedValue> r10 = f4322a
            java.lang.Object r15 = r10.get()
            android.util.TypedValue r15 = (android.util.TypedValue) r15
            if (r15 != 0) goto L_0x006b
            android.util.TypedValue r15 = new android.util.TypedValue
            r15.<init>()
            r10.set(r15)
        L_0x006b:
            r0.getValue(r13, r15, r4)
            int r10 = r15.type
            r15 = 28
            if (r10 < r15) goto L_0x007a
            r15 = 31
            if (r10 > r15) goto L_0x007a
            r10 = 1
            goto L_0x007b
        L_0x007a:
            r10 = 0
        L_0x007b:
            if (r10 != 0) goto L_0x008a
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x008a }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x008a }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008a }
            goto L_0x008e
        L_0x008a:
            int r10 = r9.getColor(r7, r14)
        L_0x008e:
            boolean r13 = r9.hasValue(r4)
            r14 = 1065353216(0x3f800000, float:1.0)
            if (r13 == 0) goto L_0x009b
            float r11 = r9.getFloat(r4, r14)
            goto L_0x00a8
        L_0x009b:
            boolean r13 = r9.hasValue(r11)
            if (r13 == 0) goto L_0x00a6
            float r11 = r9.getFloat(r11, r14)
            goto L_0x00a8
        L_0x00a6:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x00a8:
            boolean r13 = c0.a.a()
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 4
            if (r13 == 0) goto L_0x00bc
            boolean r13 = r9.hasValue(r12)
            if (r13 == 0) goto L_0x00bc
            float r13 = r9.getFloat(r12, r15)
            goto L_0x00c0
        L_0x00bc:
            float r13 = r9.getFloat(r4, r15)
        L_0x00c0:
            r9.recycle()
            int r9 = r38.getAttributeCount()
            int[] r15 = new int[r9]
            r4 = 0
            r12 = 0
        L_0x00cb:
            if (r4 >= r9) goto L_0x00fb
            int r14 = r1.getAttributeNameResource(r4)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r14 == r7) goto L_0x00f3
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r14 == r7) goto L_0x00f3
            r7 = 2130903084(0x7f03002c, float:1.7412976E38)
            if (r14 == r7) goto L_0x00f3
            r7 = 2130903581(0x7f03021d, float:1.7413984E38)
            if (r14 == r7) goto L_0x00f3
            int r7 = r12 + 1
            r0 = 0
            boolean r19 = r1.getAttributeBooleanValue(r4, r0)
            if (r19 == 0) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            int r14 = -r14
        L_0x00f0:
            r15[r12] = r14
            r12 = r7
        L_0x00f3:
            int r4 = r4 + 1
            r0 = r36
            r7 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00cb
        L_0x00fb:
            int[] r0 = android.util.StateSet.trimStateSet(r15, r12)
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x010c
            int r9 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x010c
            r9 = 1
            goto L_0x010d
        L_0x010c:
            r9 = 0
        L_0x010d:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x011e
            if (r9 != 0) goto L_0x011e
            r31 = r3
            r27 = r5
            r16 = 1
            r5 = r0
            goto L_0x02f0
        L_0x011e:
            int r12 = android.graphics.Color.alpha(r10)
            float r12 = (float) r12
            float r12 = r12 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r11
            int r11 = (int) r12
            r12 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = c.b.b(r11, r14, r12)
            if (r9 == 0) goto L_0x02e1
            y.a r9 = y.a.a(r10)
            float r10 = r9.f4312a
            float r9 = r9.f4313b
            y.j r12 = y.j.f4353k
            double r14 = (double) r9
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x02d5
            int r14 = java.lang.Math.round(r13)
            double r14 = (double) r14
            r19 = 0
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r21 <= 0) goto L_0x02d5
            int r14 = java.lang.Math.round(r13)
            double r14 = (double) r14
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x015b
            goto L_0x02d5
        L_0x015b:
            int r14 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r14 >= 0) goto L_0x0161
            r10 = 0
            goto L_0x0167
        L_0x0161:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r10 = java.lang.Math.min(r14, r10)
        L_0x0167:
            r15 = r9
            r14 = 0
            r19 = 1
            r20 = 0
        L_0x016d:
            float r22 = r20 - r9
            float r22 = java.lang.Math.abs(r22)
            r23 = 1053609165(0x3ecccccd, float:0.4)
            int r22 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r22 < 0) goto L_0x02c6
            r22 = 1148846080(0x447a0000, float:1000.0)
            r23 = 1148846080(0x447a0000, float:1000.0)
            r24 = 0
            r25 = 1120403456(0x42c80000, float:100.0)
            r26 = 0
        L_0x0184:
            float r27 = r24 - r25
            float r27 = java.lang.Math.abs(r27)
            r28 = 1008981770(0x3c23d70a, float:0.01)
            r29 = 1073741824(0x40000000, float:2.0)
            int r27 = (r27 > r28 ? 1 : (r27 == r28 ? 0 : -1))
            if (r27 <= 0) goto L_0x027e
            float r27 = r25 - r24
            float r27 = r27 / r29
            float r7 = r27 + r24
            y.a r4 = y.a.b(r7, r15, r10)
            y.j r1 = y.j.f4353k
            int r1 = r4.c(r1)
            int r4 = android.graphics.Color.red(r1)
            float r4 = y.b.b(r4)
            int r30 = android.graphics.Color.green(r1)
            float r30 = y.b.b(r30)
            int r31 = android.graphics.Color.blue(r1)
            float r31 = y.b.b(r31)
            float[][] r32 = y.b.f4321d
            r16 = 1
            r33 = r32[r16]
            r18 = 0
            r33 = r33[r18]
            float r4 = r4 * r33
            r33 = r32[r16]
            r33 = r33[r16]
            float r30 = r30 * r33
            float r30 = r30 + r4
            r4 = r32[r16]
            r17 = 2
            r4 = r4[r17]
            float r31 = r31 * r4
            float r31 = r31 + r30
            r4 = 1120403456(0x42c80000, float:100.0)
            float r2 = r31 / r4
            r27 = 1007753895(0x3c111aa7, float:0.008856452)
            int r27 = (r2 > r27 ? 1 : (r2 == r27 ? 0 : -1))
            if (r27 > 0) goto L_0x01ec
            r27 = 1147261687(0x4461d2f7, float:903.2963)
            float r2 = r2 * r27
            r27 = r5
            goto L_0x01fb
        L_0x01ec:
            r27 = r5
            double r4 = (double) r2
            double r4 = java.lang.Math.cbrt(r4)
            float r2 = (float) r4
            r4 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r4
            r4 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 - r4
        L_0x01fb:
            float r4 = r13 - r2
            float r4 = java.lang.Math.abs(r4)
            r5 = 1045220557(0x3e4ccccd, float:0.2)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0256
            y.a r1 = y.a.a(r1)
            float r5 = r1.f4314c
            r31 = r3
            float r3 = r1.f4313b
            y.a r3 = y.a.b(r5, r3, r10)
            float r5 = r1.f4315d
            r32 = r4
            float r4 = r3.f4315d
            float r5 = r5 - r4
            float r4 = r1.f4316e
            r33 = r7
            float r7 = r3.f4316e
            float r4 = r4 - r7
            float r7 = r1.f4317f
            float r3 = r3.f4317f
            float r7 = r7 - r3
            float r5 = r5 * r5
            float r4 = r4 * r4
            float r4 = r4 + r5
            float r7 = r7 * r7
            float r7 = r7 + r4
            double r3 = (double) r7
            double r3 = java.lang.Math.sqrt(r3)
            r34 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            r5 = r0
            r7 = r1
            r0 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r3, r0)
            double r0 = r0 * r34
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x025d
            r23 = r0
            r26 = r7
            r22 = r32
            goto L_0x025d
        L_0x0256:
            r5 = r0
            r31 = r3
            r33 = r7
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x025d:
            r0 = 0
            int r3 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0267
            int r3 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0267
            goto L_0x028a
        L_0x0267:
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x026e
            r24 = r33
            goto L_0x0270
        L_0x026e:
            r25 = r33
        L_0x0270:
            r1 = r38
            r2 = r39
            r0 = r5
            r5 = r27
            r3 = r31
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            goto L_0x0184
        L_0x027e:
            r31 = r3
            r27 = r5
            r1 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r17 = 2
            r5 = r0
            r0 = 0
        L_0x028a:
            r2 = r26
            if (r19 == 0) goto L_0x02ab
            if (r2 == 0) goto L_0x0295
            int r10 = r2.c(r12)
            goto L_0x02e8
        L_0x0295:
            float r2 = r9 - r20
            float r2 = r2 / r29
            float r15 = r2 + r20
            r1 = r38
            r2 = r39
            r0 = r5
            r5 = r27
            r3 = r31
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            r19 = 0
            goto L_0x016d
        L_0x02ab:
            if (r2 != 0) goto L_0x02af
            r9 = r15
            goto L_0x02b2
        L_0x02af:
            r14 = r2
            r20 = r15
        L_0x02b2:
            float r2 = r9 - r20
            float r2 = r2 / r29
            float r15 = r2 + r20
            r1 = r38
            r2 = r39
            r0 = r5
            r5 = r27
            r3 = r31
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            goto L_0x016d
        L_0x02c6:
            r31 = r3
            r27 = r5
            r16 = 1
            r5 = r0
            if (r14 != 0) goto L_0x02d0
            goto L_0x02dc
        L_0x02d0:
            int r10 = r14.c(r12)
            goto L_0x02e8
        L_0x02d5:
            r31 = r3
            r27 = r5
            r16 = 1
            r5 = r0
        L_0x02dc:
            int r10 = y.b.a(r13)
            goto L_0x02e8
        L_0x02e1:
            r31 = r3
            r27 = r5
            r16 = 1
            r5 = r0
        L_0x02e8:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r11 << 24
            r10 = r0 | r1
        L_0x02f0:
            int r0 = r8 + 1
            r1 = r27
            int r2 = r1.length
            r3 = 8
            if (r0 <= r2) goto L_0x0308
            r2 = 4
            if (r8 > r2) goto L_0x02ff
            r2 = 8
            goto L_0x0301
        L_0x02ff:
            int r2 = r8 * 2
        L_0x0301:
            int[] r2 = new int[r2]
            r4 = 0
            java.lang.System.arraycopy(r1, r4, r2, r4, r8)
            r1 = r2
        L_0x0308:
            r1[r8] = r10
            int r2 = r6.length
            if (r0 <= r2) goto L_0x0326
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r2 = r2.getComponentType()
            r4 = 4
            if (r8 > r4) goto L_0x0319
            goto L_0x031b
        L_0x0319:
            int r3 = r8 * 2
        L_0x031b:
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r3 = 0
            java.lang.System.arraycopy(r6, r3, r2, r3, r8)
            r6 = r2
        L_0x0326:
            r6[r8] = r5
            int[][] r6 = (int[][]) r6
            r8 = r0
            goto L_0x0331
        L_0x032c:
            r31 = r3
            r1 = r5
            r16 = 1
        L_0x0331:
            r5 = r1
            r0 = r36
            r1 = r38
            r2 = r39
            r3 = r31
            r4 = 1
            r7 = 0
            goto L_0x0020
        L_0x033e:
            r1 = r5
            int[] r0 = new int[r8]
            int[][] r2 = new int[r8][]
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r8)
            java.lang.System.arraycopy(r6, r3, r2, r3, r8)
            android.content.res.ColorStateList r1 = new android.content.res.ColorStateList
            r1.<init>(r2, r0)
            return r1
        L_0x0350:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r37.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y.c.b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
