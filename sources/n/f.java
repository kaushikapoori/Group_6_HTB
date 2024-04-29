package n;

import java.util.Arrays;
import java.util.Comparator;
import n.b;

public class f extends b {

    /* renamed from: f  reason: collision with root package name */
    public h[] f3463f = new h[128];

    /* renamed from: g  reason: collision with root package name */
    public h[] f3464g = new h[128];

    /* renamed from: h  reason: collision with root package name */
    public int f3465h = 0;

    /* renamed from: i  reason: collision with root package name */
    public b f3466i = new b(this);

    public class a implements Comparator<h> {
        public a(f fVar) {
        }

        public int compare(Object obj, Object obj2) {
            return ((h) obj).f3471c - ((h) obj2).f3471c;
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public h f3467a;

        public b(f fVar) {
        }

        public String toString() {
            String str = "[ ";
            if (this.f3467a != null) {
                for (int i2 = 0; i2 < 9; i2++) {
                    StringBuilder a2 = androidx.activity.result.a.a(str);
                    a2.append(this.f3467a.f3477i[i2]);
                    a2.append(" ");
                    str = a2.toString();
                }
            }
            return str + "] " + this.f3467a;
        }
    }

    public f(c cVar) {
        super(cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        if (r8 < r7) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n.h a(n.d r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = 0
            r0 = -1
            r1 = 0
            r2 = -1
        L_0x0004:
            int r3 = r10.f3465h
            if (r1 >= r3) goto L_0x0057
            n.h[] r3 = r10.f3463f
            r4 = r3[r1]
            int r5 = r4.f3471c
            boolean r5 = r12[r5]
            if (r5 == 0) goto L_0x0013
            goto L_0x0054
        L_0x0013:
            n.f$b r5 = r10.f3466i
            r5.f3467a = r4
            r4 = 8
            r6 = 1
            if (r2 != r0) goto L_0x0036
        L_0x001c:
            if (r4 < 0) goto L_0x0032
            n.h r3 = r5.f3467a
            float[] r3 = r3.f3477i
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x002a
            goto L_0x0032
        L_0x002a:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x002f
            goto L_0x0033
        L_0x002f:
            int r4 = r4 + -1
            goto L_0x001c
        L_0x0032:
            r6 = 0
        L_0x0033:
            if (r6 == 0) goto L_0x0054
            goto L_0x0053
        L_0x0036:
            r3 = r3[r2]
        L_0x0038:
            if (r4 < 0) goto L_0x0050
            float[] r7 = r3.f3477i
            r7 = r7[r4]
            n.h r8 = r5.f3467a
            float[] r8 = r8.f3477i
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x004b
            int r4 = r4 + -1
            goto L_0x0038
        L_0x004b:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            if (r6 == 0) goto L_0x0054
        L_0x0053:
            r2 = r1
        L_0x0054:
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0057:
            if (r2 != r0) goto L_0x005b
            r11 = 0
            return r11
        L_0x005b:
            n.h[] r11 = r10.f3463f
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: n.f.a(n.d, boolean[]):n.h");
    }

    public void b(h hVar) {
        this.f3466i.f3467a = hVar;
        Arrays.fill(hVar.f3477i, 0.0f);
        hVar.f3477i[hVar.f3473e] = 1.0f;
        m(hVar);
    }

    public void clear() {
        this.f3465h = 0;
        this.f3434b = 0.0f;
    }

    public boolean isEmpty() {
        return this.f3465h == 0;
    }

    public void l(d dVar, b bVar, boolean z2) {
        b bVar2 = bVar;
        h hVar = bVar2.f3433a;
        if (hVar != null) {
            b.a aVar = bVar2.f3436d;
            int k2 = aVar.k();
            for (int i2 = 0; i2 < k2; i2++) {
                h b2 = aVar.b(i2);
                float a2 = aVar.a(i2);
                b bVar3 = this.f3466i;
                bVar3.f3467a = b2;
                boolean z3 = true;
                if (b2.f3470b) {
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr = bVar3.f3467a.f3477i;
                        fArr[i3] = (hVar.f3477i[i3] * a2) + fArr[i3];
                        if (Math.abs(fArr[i3]) < 1.0E-4f) {
                            bVar3.f3467a.f3477i[i3] = 0.0f;
                        } else {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        f.this.n(bVar3.f3467a);
                    }
                    z3 = false;
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f2 = hVar.f3477i[i4];
                        if (f2 != 0.0f) {
                            float f3 = f2 * a2;
                            if (Math.abs(f3) < 1.0E-4f) {
                                f3 = 0.0f;
                            }
                            bVar3.f3467a.f3477i[i4] = f3;
                        } else {
                            bVar3.f3467a.f3477i[i4] = 0.0f;
                        }
                    }
                }
                if (z3) {
                    m(b2);
                }
                this.f3434b = (bVar2.f3434b * a2) + this.f3434b;
            }
            n(hVar);
        }
    }

    public final void m(h hVar) {
        int i2;
        int i3 = this.f3465h + 1;
        h[] hVarArr = this.f3463f;
        if (i3 > hVarArr.length) {
            h[] hVarArr2 = (h[]) Arrays.copyOf(hVarArr, hVarArr.length * 2);
            this.f3463f = hVarArr2;
            this.f3464g = (h[]) Arrays.copyOf(hVarArr2, hVarArr2.length * 2);
        }
        h[] hVarArr3 = this.f3463f;
        int i4 = this.f3465h;
        hVarArr3[i4] = hVar;
        int i5 = i4 + 1;
        this.f3465h = i5;
        if (i5 > 1 && hVarArr3[i5 - 1].f3471c > hVar.f3471c) {
            int i6 = 0;
            while (true) {
                i2 = this.f3465h;
                if (i6 >= i2) {
                    break;
                }
                this.f3464g[i6] = this.f3463f[i6];
                i6++;
            }
            Arrays.sort(this.f3464g, 0, i2, new a(this));
            for (int i7 = 0; i7 < this.f3465h; i7++) {
                this.f3463f[i7] = this.f3464g[i7];
            }
        }
        hVar.f3470b = true;
        hVar.a(this);
    }

    public final void n(h hVar) {
        int i2 = 0;
        while (i2 < this.f3465h) {
            if (this.f3463f[i2] == hVar) {
                while (true) {
                    int i3 = this.f3465h;
                    if (i2 < i3 - 1) {
                        h[] hVarArr = this.f3463f;
                        int i4 = i2 + 1;
                        hVarArr[i2] = hVarArr[i4];
                        i2 = i4;
                    } else {
                        this.f3465h = i3 - 1;
                        hVar.f3470b = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    public String toString() {
        String str = "" + " goal -> (" + this.f3434b + ") : ";
        for (int i2 = 0; i2 < this.f3465h; i2++) {
            this.f3466i.f3467a = this.f3463f[i2];
            StringBuilder a2 = androidx.activity.result.a.a(str);
            a2.append(this.f3466i);
            a2.append(" ");
            str = a2.toString();
        }
        return str;
    }
}
