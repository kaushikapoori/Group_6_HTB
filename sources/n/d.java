package n;

import java.util.Arrays;
import java.util.Objects;
import n.b;

public class d {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f3442p = false;

    /* renamed from: q  reason: collision with root package name */
    public static int f3443q = 1000;

    /* renamed from: r  reason: collision with root package name */
    public static long f3444r;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3445a;

    /* renamed from: b  reason: collision with root package name */
    public int f3446b;

    /* renamed from: c  reason: collision with root package name */
    public a f3447c;

    /* renamed from: d  reason: collision with root package name */
    public int f3448d;

    /* renamed from: e  reason: collision with root package name */
    public int f3449e;

    /* renamed from: f  reason: collision with root package name */
    public b[] f3450f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3451g;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f3452h;

    /* renamed from: i  reason: collision with root package name */
    public int f3453i;

    /* renamed from: j  reason: collision with root package name */
    public int f3454j;

    /* renamed from: k  reason: collision with root package name */
    public int f3455k;

    /* renamed from: l  reason: collision with root package name */
    public final c f3456l;

    /* renamed from: m  reason: collision with root package name */
    public h[] f3457m;

    /* renamed from: n  reason: collision with root package name */
    public int f3458n;

    /* renamed from: o  reason: collision with root package name */
    public a f3459o;

    public interface a {
        h a(d dVar, boolean[] zArr);

        void b(h hVar);

        void clear();

        boolean isEmpty();
    }

    public d() {
        this.f3445a = false;
        this.f3446b = 0;
        this.f3448d = 32;
        this.f3449e = 32;
        this.f3450f = null;
        this.f3451g = false;
        this.f3452h = new boolean[32];
        this.f3453i = 1;
        this.f3454j = 0;
        this.f3455k = 32;
        this.f3457m = new h[f3443q];
        this.f3458n = 0;
        this.f3450f = new b[32];
        t();
        c cVar = new c(0);
        this.f3456l = cVar;
        this.f3447c = new f(cVar);
        this.f3459o = new b(cVar);
    }

    public final h a(int i2, String str) {
        h hVar = (h) this.f3456l.f3440c.a();
        if (hVar == null) {
            hVar = new h(i2);
        } else {
            hVar.c();
        }
        hVar.f3478j = i2;
        int i3 = this.f3458n;
        int i4 = f3443q;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            f3443q = i5;
            this.f3457m = (h[]) Arrays.copyOf(this.f3457m, i5);
        }
        h[] hVarArr = this.f3457m;
        int i6 = this.f3458n;
        this.f3458n = i6 + 1;
        hVarArr[i6] = hVar;
        return hVar;
    }

    public void b(h hVar, h hVar2, int i2, float f2, h hVar3, h hVar4, int i3, int i4) {
        float f3;
        int i5;
        b m2 = m();
        if (hVar2 == hVar3) {
            m2.f3436d.e(hVar, 1.0f);
            m2.f3436d.e(hVar4, 1.0f);
            m2.f3436d.e(hVar2, -2.0f);
        } else {
            if (f2 == 0.5f) {
                m2.f3436d.e(hVar, 1.0f);
                m2.f3436d.e(hVar2, -1.0f);
                m2.f3436d.e(hVar3, -1.0f);
                m2.f3436d.e(hVar4, 1.0f);
                if (i2 > 0 || i3 > 0) {
                    i5 = (-i2) + i3;
                }
            } else if (f2 <= 0.0f) {
                m2.f3436d.e(hVar, -1.0f);
                m2.f3436d.e(hVar2, 1.0f);
                f3 = (float) i2;
                m2.f3434b = f3;
            } else if (f2 >= 1.0f) {
                m2.f3436d.e(hVar4, -1.0f);
                m2.f3436d.e(hVar3, 1.0f);
                i5 = -i3;
            } else {
                float f4 = 1.0f - f2;
                m2.f3436d.e(hVar, f4 * 1.0f);
                m2.f3436d.e(hVar2, f4 * -1.0f);
                m2.f3436d.e(hVar3, -1.0f * f2);
                m2.f3436d.e(hVar4, 1.0f * f2);
                if (i2 > 0 || i3 > 0) {
                    m2.f3434b = (((float) i3) * f2) + (((float) (-i2)) * f4);
                }
            }
            f3 = (float) i5;
            m2.f3434b = f3;
        }
        if (i4 != 8) {
            m2.c(this, i4);
        }
        c(m2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ae A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(n.b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f3454j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f3455k
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f3453i
            int r2 = r2 + r3
            int r4 = r0.f3449e
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.p()
        L_0x0016:
            boolean r2 = r1.f3437e
            if (r2 != 0) goto L_0x01b1
            n.b[] r2 = r0.f3450f
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x0083
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x0073
            n.b$a r6 = r1.f3436d
            int r6 = r6.k()
            r7 = 0
        L_0x002b:
            if (r7 >= r6) goto L_0x0044
            n.b$a r8 = r1.f3436d
            n.h r8 = r8.b(r7)
            int r9 = r8.f3472d
            if (r9 != r5) goto L_0x003c
            boolean r9 = r8.f3475g
            if (r9 != 0) goto L_0x003c
            goto L_0x0041
        L_0x003c:
            java.util.ArrayList<n.h> r9 = r1.f3435c
            r9.add(r8)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            java.util.ArrayList<n.h> r6 = r1.f3435c
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0071
            r7 = 0
        L_0x004d:
            if (r7 >= r6) goto L_0x006b
            java.util.ArrayList<n.h> r8 = r1.f3435c
            java.lang.Object r8 = r8.get(r7)
            n.h r8 = (n.h) r8
            boolean r9 = r8.f3475g
            if (r9 == 0) goto L_0x005f
            r1.k(r0, r8, r3)
            goto L_0x0068
        L_0x005f:
            n.b[] r9 = r0.f3450f
            int r8 = r8.f3472d
            r8 = r9[r8]
            r1.l(r0, r8, r3)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x004d
        L_0x006b:
            java.util.ArrayList<n.h> r6 = r1.f3435c
            r6.clear()
            goto L_0x0022
        L_0x0071:
            r2 = 1
            goto L_0x0022
        L_0x0073:
            n.h r2 = r1.f3433a
            if (r2 == 0) goto L_0x0083
            n.b$a r2 = r1.f3436d
            int r2 = r2.k()
            if (r2 != 0) goto L_0x0083
            r1.f3437e = r3
            r0.f3445a = r3
        L_0x0083:
            boolean r2 = r17.isEmpty()
            if (r2 == 0) goto L_0x008a
            return
        L_0x008a:
            float r2 = r1.f3434b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x009c
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f3434b = r2
            n.b$a r2 = r1.f3436d
            r2.j()
        L_0x009c:
            n.b$a r2 = r1.f3436d
            int r2 = r2.k()
            r7 = 0
            r9 = r7
            r10 = r9
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x00aa:
            if (r8 >= r2) goto L_0x00f9
            n.b$a r15 = r1.f3436d
            float r15 = r15.a(r8)
            n.b$a r4 = r1.f3436d
            n.h r4 = r4.b(r8)
            int r5 = r4.f3478j
            if (r5 != r3) goto L_0x00d6
            if (r9 != 0) goto L_0x00bf
            goto L_0x00c3
        L_0x00bf:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ca
        L_0x00c3:
            boolean r12 = r1.h(r4)
            r9 = r4
            r11 = r15
            goto L_0x00f5
        L_0x00ca:
            if (r12 != 0) goto L_0x00f5
            boolean r5 = r1.h(r4)
            if (r5 == 0) goto L_0x00f5
            r9 = r4
            r11 = r15
            r12 = 1
            goto L_0x00f5
        L_0x00d6:
            if (r9 != 0) goto L_0x00f5
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x00f5
            if (r10 != 0) goto L_0x00df
            goto L_0x00e3
        L_0x00df:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00ea
        L_0x00e3:
            boolean r14 = r1.h(r4)
            r10 = r4
            r13 = r15
            goto L_0x00f5
        L_0x00ea:
            if (r14 != 0) goto L_0x00f5
            boolean r5 = r1.h(r4)
            if (r5 == 0) goto L_0x00f5
            r10 = r4
            r13 = r15
            r14 = 1
        L_0x00f5:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00aa
        L_0x00f9:
            if (r9 == 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r9 = r10
        L_0x00fd:
            if (r9 != 0) goto L_0x0101
            r2 = 1
            goto L_0x0105
        L_0x0101:
            r1.j(r9)
            r2 = 0
        L_0x0105:
            n.b$a r4 = r1.f3436d
            int r4 = r4.k()
            if (r4 != 0) goto L_0x010f
            r1.f3437e = r3
        L_0x010f:
            if (r2 == 0) goto L_0x019b
            int r2 = r0.f3453i
            int r2 = r2 + r3
            int r4 = r0.f3449e
            if (r2 < r4) goto L_0x011b
            r16.p()
        L_0x011b:
            r2 = 3
            n.h r2 = r0.a(r2, r7)
            int r4 = r0.f3446b
            int r4 = r4 + r3
            r0.f3446b = r4
            int r5 = r0.f3453i
            int r5 = r5 + r3
            r0.f3453i = r5
            r2.f3471c = r4
            n.c r5 = r0.f3456l
            java.lang.Object r5 = r5.f3441d
            n.h[] r5 = (n.h[]) r5
            r5[r4] = r2
            r1.f3433a = r2
            int r4 = r0.f3454j
            r16.i(r17)
            int r5 = r0.f3454j
            int r4 = r4 + r3
            if (r5 != r4) goto L_0x019b
            n.d$a r4 = r0.f3459o
            n.b r4 = (n.b) r4
            java.util.Objects.requireNonNull(r4)
            r4.f3433a = r7
            n.b$a r5 = r4.f3436d
            r5.clear()
            r5 = 0
        L_0x014f:
            n.b$a r8 = r1.f3436d
            int r8 = r8.k()
            if (r5 >= r8) goto L_0x016b
            n.b$a r8 = r1.f3436d
            n.h r8 = r8.b(r5)
            n.b$a r9 = r1.f3436d
            float r9 = r9.a(r5)
            n.b$a r10 = r4.f3436d
            r10.d(r8, r9, r3)
            int r5 = r5 + 1
            goto L_0x014f
        L_0x016b:
            n.d$a r4 = r0.f3459o
            r0.s(r4)
            int r4 = r2.f3472d
            r5 = -1
            if (r4 != r5) goto L_0x0199
            n.h r4 = r1.f3433a
            if (r4 != r2) goto L_0x0182
            n.h r2 = r1.i(r7, r2)
            if (r2 == 0) goto L_0x0182
            r1.j(r2)
        L_0x0182:
            boolean r2 = r1.f3437e
            if (r2 != 0) goto L_0x018b
            n.h r2 = r1.f3433a
            r2.e(r0, r1)
        L_0x018b:
            n.c r2 = r0.f3456l
            n.e r2 = r2.f3439b
            n.e r2 = (n.e) r2
            r2.c(r1)
            int r2 = r0.f3454j
            int r2 = r2 - r3
            r0.f3454j = r2
        L_0x0199:
            r2 = 1
            goto L_0x019c
        L_0x019b:
            r2 = 0
        L_0x019c:
            n.h r4 = r1.f3433a
            if (r4 == 0) goto L_0x01ab
            int r4 = r4.f3478j
            if (r4 == r3) goto L_0x01ac
            float r4 = r1.f3434b
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x01ab
            goto L_0x01ac
        L_0x01ab:
            r3 = 0
        L_0x01ac:
            if (r3 != 0) goto L_0x01af
            return
        L_0x01af:
            r4 = r2
            goto L_0x01b2
        L_0x01b1:
            r4 = 0
        L_0x01b2:
            if (r4 != 0) goto L_0x01b7
            r16.i(r17)
        L_0x01b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n.d.c(n.b):void");
    }

    public b d(h hVar, h hVar2, int i2, int i3) {
        if (i3 == 8 && hVar2.f3475g && hVar.f3472d == -1) {
            hVar.d(this, hVar2.f3474f + ((float) i2));
            return null;
        }
        b m2 = m();
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            m2.f3434b = (float) i2;
        }
        if (!z2) {
            m2.f3436d.e(hVar, -1.0f);
            m2.f3436d.e(hVar2, 1.0f);
        } else {
            m2.f3436d.e(hVar, 1.0f);
            m2.f3436d.e(hVar2, -1.0f);
        }
        if (i3 != 8) {
            m2.c(this, i3);
        }
        c(m2);
        return m2;
    }

    public void e(h hVar, int i2) {
        b bVar;
        b.a aVar;
        float f2;
        int i3 = hVar.f3472d;
        if (i3 == -1) {
            hVar.d(this, (float) i2);
            for (int i4 = 0; i4 < this.f3446b + 1; i4++) {
                h hVar2 = ((h[]) this.f3456l.f3441d)[i4];
            }
            return;
        }
        if (i3 != -1) {
            b bVar2 = this.f3450f[i3];
            if (!bVar2.f3437e) {
                if (bVar2.f3436d.k() == 0) {
                    bVar2.f3437e = true;
                } else {
                    bVar = m();
                    if (i2 < 0) {
                        bVar.f3434b = (float) (i2 * -1);
                        aVar = bVar.f3436d;
                        f2 = 1.0f;
                    } else {
                        bVar.f3434b = (float) i2;
                        aVar = bVar.f3436d;
                        f2 = -1.0f;
                    }
                    aVar.e(hVar, f2);
                }
            }
            bVar2.f3434b = (float) i2;
            return;
        }
        bVar = m();
        bVar.f3433a = hVar;
        float f3 = (float) i2;
        hVar.f3474f = f3;
        bVar.f3434b = f3;
        bVar.f3437e = true;
        c(bVar);
    }

    public void f(h hVar, h hVar2, int i2, int i3) {
        b m2 = m();
        h n2 = n();
        n2.f3473e = 0;
        m2.e(hVar, hVar2, n2, i2);
        if (i3 != 8) {
            m2.f3436d.e(k(i3, (String) null), (float) ((int) (m2.f3436d.c(n2) * -1.0f)));
        }
        c(m2);
    }

    public void g(h hVar, h hVar2, int i2, int i3) {
        b m2 = m();
        h n2 = n();
        n2.f3473e = 0;
        m2.f(hVar, hVar2, n2, i2);
        if (i3 != 8) {
            m2.f3436d.e(k(i3, (String) null), (float) ((int) (m2.f3436d.c(n2) * -1.0f)));
        }
        c(m2);
    }

    public void h(h hVar, h hVar2, h hVar3, h hVar4, float f2, int i2) {
        b m2 = m();
        m2.d(hVar, hVar2, hVar3, hVar4, f2);
        if (i2 != 8) {
            m2.c(this, i2);
        }
        c(m2);
    }

    public final void i(b bVar) {
        int i2;
        if (bVar.f3437e) {
            bVar.f3433a.d(this, bVar.f3434b);
        } else {
            b[] bVarArr = this.f3450f;
            int i3 = this.f3454j;
            bVarArr[i3] = bVar;
            h hVar = bVar.f3433a;
            hVar.f3472d = i3;
            this.f3454j = i3 + 1;
            hVar.e(this, bVar);
        }
        if (this.f3445a) {
            int i4 = 0;
            while (i4 < this.f3454j) {
                if (this.f3450f[i4] == null) {
                    System.out.println("WTF");
                }
                b[] bVarArr2 = this.f3450f;
                if (bVarArr2[i4] != null && bVarArr2[i4].f3437e) {
                    b bVar2 = bVarArr2[i4];
                    bVar2.f3433a.d(this, bVar2.f3434b);
                    this.f3456l.f3439b.c(bVar2);
                    this.f3450f[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.f3454j;
                        if (i5 >= i2) {
                            break;
                        }
                        b[] bVarArr3 = this.f3450f;
                        int i7 = i5 - 1;
                        bVarArr3[i7] = bVarArr3[i5];
                        if (bVarArr3[i7].f3433a.f3472d == i5) {
                            bVarArr3[i7].f3433a.f3472d = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.f3450f[i6] = null;
                    }
                    this.f3454j = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.f3445a = false;
        }
    }

    public final void j() {
        for (int i2 = 0; i2 < this.f3454j; i2++) {
            b bVar = this.f3450f[i2];
            bVar.f3433a.f3474f = bVar.f3434b;
        }
    }

    public h k(int i2, String str) {
        if (this.f3453i + 1 >= this.f3449e) {
            p();
        }
        h a2 = a(4, str);
        int i3 = this.f3446b + 1;
        this.f3446b = i3;
        this.f3453i++;
        a2.f3471c = i3;
        a2.f3473e = i2;
        ((h[]) this.f3456l.f3441d)[i3] = a2;
        this.f3447c.b(a2);
        return a2;
    }

    public h l(Object obj) {
        h hVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f3453i + 1 >= this.f3449e) {
            p();
        }
        if (obj instanceof p.d) {
            p.d dVar = (p.d) obj;
            hVar = dVar.f3640i;
            if (hVar == null) {
                dVar.i();
                hVar = dVar.f3640i;
            }
            int i2 = hVar.f3471c;
            if (i2 == -1 || i2 > this.f3446b || ((h[]) this.f3456l.f3441d)[i2] == null) {
                if (i2 != -1) {
                    hVar.c();
                }
                int i3 = this.f3446b + 1;
                this.f3446b = i3;
                this.f3453i++;
                hVar.f3471c = i3;
                hVar.f3478j = 1;
                ((h[]) this.f3456l.f3441d)[i3] = hVar;
            }
        }
        return hVar;
    }

    public b m() {
        b bVar = (b) this.f3456l.f3439b.a();
        if (bVar == null) {
            bVar = new b(this.f3456l);
            f3444r++;
        } else {
            bVar.f3433a = null;
            bVar.f3436d.clear();
            bVar.f3434b = 0.0f;
            bVar.f3437e = false;
        }
        h.f3469n++;
        return bVar;
    }

    public h n() {
        if (this.f3453i + 1 >= this.f3449e) {
            p();
        }
        h a2 = a(3, (String) null);
        int i2 = this.f3446b + 1;
        this.f3446b = i2;
        this.f3453i++;
        a2.f3471c = i2;
        ((h[]) this.f3456l.f3441d)[i2] = a2;
        return a2;
    }

    public int o(Object obj) {
        h hVar = ((p.d) obj).f3640i;
        if (hVar != null) {
            return (int) (hVar.f3474f + 0.5f);
        }
        return 0;
    }

    public final void p() {
        int i2 = this.f3448d * 2;
        this.f3448d = i2;
        this.f3450f = (b[]) Arrays.copyOf(this.f3450f, i2);
        c cVar = this.f3456l;
        cVar.f3441d = (h[]) Arrays.copyOf((h[]) cVar.f3441d, this.f3448d);
        int i3 = this.f3448d;
        this.f3452h = new boolean[i3];
        this.f3449e = i3;
        this.f3455k = i3;
    }

    public void q() {
        if (this.f3447c.isEmpty()) {
            j();
            return;
        }
        if (this.f3451g) {
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f3454j) {
                    z2 = true;
                    break;
                } else if (!this.f3450f[i2].f3437e) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                j();
                return;
            }
        }
        r(this.f3447c);
    }

    public void r(a aVar) {
        float f2;
        int i2;
        boolean z2;
        int i3 = 0;
        while (true) {
            f2 = 0.0f;
            i2 = 1;
            if (i3 >= this.f3454j) {
                z2 = false;
                break;
            }
            b[] bVarArr = this.f3450f;
            if (bVarArr[i3].f3433a.f3478j != 1 && bVarArr[i3].f3434b < 0.0f) {
                z2 = true;
                break;
            }
            i3++;
        }
        if (z2) {
            boolean z3 = false;
            int i4 = 0;
            while (!z3) {
                i4 += i2;
                float f3 = Float.MAX_VALUE;
                int i5 = 0;
                int i6 = -1;
                int i7 = -1;
                int i8 = 0;
                while (i5 < this.f3454j) {
                    b bVar = this.f3450f[i5];
                    if (bVar.f3433a.f3478j != i2 && !bVar.f3437e && bVar.f3434b < f2) {
                        int k2 = bVar.f3436d.k();
                        int i9 = 0;
                        while (i9 < k2) {
                            h b2 = bVar.f3436d.b(i9);
                            float c2 = bVar.f3436d.c(b2);
                            if (c2 > f2) {
                                for (int i10 = 0; i10 < 9; i10++) {
                                    float f4 = b2.f3476h[i10] / c2;
                                    if ((f4 < f3 && i10 == i8) || i10 > i8) {
                                        i7 = b2.f3471c;
                                        i8 = i10;
                                        f3 = f4;
                                        i6 = i5;
                                    }
                                }
                            }
                            i9++;
                            f2 = 0.0f;
                        }
                    }
                    i5++;
                    f2 = 0.0f;
                    i2 = 1;
                }
                if (i6 != -1) {
                    b bVar2 = this.f3450f[i6];
                    bVar2.f3433a.f3472d = -1;
                    bVar2.j(((h[]) this.f3456l.f3441d)[i7]);
                    h hVar = bVar2.f3433a;
                    hVar.f3472d = i6;
                    hVar.e(this, bVar2);
                } else {
                    z3 = true;
                }
                if (i4 > this.f3453i / 2) {
                    z3 = true;
                }
                f2 = 0.0f;
                i2 = 1;
            }
        }
        s(aVar);
        j();
    }

    public final int s(a aVar) {
        for (int i2 = 0; i2 < this.f3453i; i2++) {
            this.f3452h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f3453i * 2) {
                return i3;
            }
            h hVar = ((b) aVar).f3433a;
            if (hVar != null) {
                this.f3452h[hVar.f3471c] = true;
            }
            h a2 = aVar.a(this, this.f3452h);
            if (a2 != null) {
                boolean[] zArr = this.f3452h;
                int i4 = a2.f3471c;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (a2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f3454j; i6++) {
                    b bVar = this.f3450f[i6];
                    if (bVar.f3433a.f3478j != 1 && !bVar.f3437e && bVar.f3436d.i(a2)) {
                        float c2 = bVar.f3436d.c(a2);
                        if (c2 < 0.0f) {
                            float f3 = (-bVar.f3434b) / c2;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar2 = this.f3450f[i5];
                    bVar2.f3433a.f3472d = -1;
                    bVar2.j(a2);
                    h hVar2 = bVar2.f3433a;
                    hVar2.f3472d = i5;
                    hVar2.e(this, bVar2);
                }
            } else {
                z2 = true;
            }
        }
        return i3;
    }

    public final void t() {
        for (int i2 = 0; i2 < this.f3454j; i2++) {
            b bVar = this.f3450f[i2];
            if (bVar != null) {
                this.f3456l.f3439b.c(bVar);
            }
            this.f3450f[i2] = null;
        }
    }

    public void u() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.f3456l;
            Object obj = cVar.f3441d;
            if (i2 >= ((h[]) obj).length) {
                break;
            }
            h hVar = ((h[]) obj)[i2];
            if (hVar != null) {
                hVar.c();
            }
            i2++;
        }
        e eVar = cVar.f3440c;
        h[] hVarArr = this.f3457m;
        int i3 = this.f3458n;
        Objects.requireNonNull(eVar);
        if (i3 > hVarArr.length) {
            i3 = hVarArr.length;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            h hVar2 = hVarArr[i4];
            int i5 = eVar.f3462c;
            Object[] objArr = eVar.f3461b;
            if (i5 < objArr.length) {
                objArr[i5] = hVar2;
                eVar.f3462c = i5 + 1;
            }
        }
        this.f3458n = 0;
        Arrays.fill((h[]) this.f3456l.f3441d, (Object) null);
        this.f3446b = 0;
        this.f3447c.clear();
        this.f3453i = 1;
        for (int i6 = 0; i6 < this.f3454j; i6++) {
            b[] bVarArr = this.f3450f;
            if (bVarArr[i6] != null) {
                Objects.requireNonNull(bVarArr[i6]);
            }
        }
        t();
        this.f3454j = 0;
        this.f3459o = new b(this.f3456l);
    }
}
