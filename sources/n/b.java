package n;

import java.util.ArrayList;
import n.d;

public class b implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public h f3433a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f3434b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<h> f3435c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public a f3436d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3437e = false;

    public interface a {
        float a(int i2);

        h b(int i2);

        float c(h hVar);

        void clear();

        void d(h hVar, float f2, boolean z2);

        void e(h hVar, float f2);

        void f(float f2);

        float g(h hVar, boolean z2);

        float h(b bVar, boolean z2);

        boolean i(h hVar);

        void j();

        int k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f3436d = new a(this, cVar);
    }

    public h a(d dVar, boolean[] zArr) {
        return i(zArr, (h) null);
    }

    public void b(h hVar) {
        float f2;
        int i2 = hVar.f3473e;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
            this.f3436d.e(hVar, f2);
        }
        f2 = 1.0f;
        this.f3436d.e(hVar, f2);
    }

    public b c(d dVar, int i2) {
        this.f3436d.e(dVar.k(i2, "ep"), 1.0f);
        this.f3436d.e(dVar.k(i2, "em"), -1.0f);
        return this;
    }

    public void clear() {
        this.f3436d.clear();
        this.f3433a = null;
        this.f3434b = 0.0f;
    }

    public b d(h hVar, h hVar2, h hVar3, h hVar4, float f2) {
        this.f3436d.e(hVar, -1.0f);
        this.f3436d.e(hVar2, 1.0f);
        this.f3436d.e(hVar3, f2);
        this.f3436d.e(hVar4, -f2);
        return this;
    }

    public b e(h hVar, h hVar2, h hVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f3434b = (float) i2;
        }
        if (!z2) {
            this.f3436d.e(hVar, -1.0f);
            this.f3436d.e(hVar2, 1.0f);
            this.f3436d.e(hVar3, 1.0f);
        } else {
            this.f3436d.e(hVar, 1.0f);
            this.f3436d.e(hVar2, -1.0f);
            this.f3436d.e(hVar3, -1.0f);
        }
        return this;
    }

    public b f(h hVar, h hVar2, h hVar3, int i2) {
        boolean z2 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z2 = true;
            }
            this.f3434b = (float) i2;
        }
        if (!z2) {
            this.f3436d.e(hVar, -1.0f);
            this.f3436d.e(hVar2, 1.0f);
            this.f3436d.e(hVar3, -1.0f);
        } else {
            this.f3436d.e(hVar, 1.0f);
            this.f3436d.e(hVar2, -1.0f);
            this.f3436d.e(hVar3, 1.0f);
        }
        return this;
    }

    public b g(h hVar, h hVar2, h hVar3, h hVar4, float f2) {
        this.f3436d.e(hVar3, 0.5f);
        this.f3436d.e(hVar4, 0.5f);
        this.f3436d.e(hVar, -0.5f);
        this.f3436d.e(hVar2, -0.5f);
        this.f3434b = -f2;
        return this;
    }

    public final boolean h(h hVar) {
        return hVar.f3481m <= 1;
    }

    public final h i(boolean[] zArr, h hVar) {
        int i2;
        int k2 = this.f3436d.k();
        h hVar2 = null;
        float f2 = 0.0f;
        for (int i3 = 0; i3 < k2; i3++) {
            float a2 = this.f3436d.a(i3);
            if (a2 < 0.0f) {
                h b2 = this.f3436d.b(i3);
                if ((zArr == null || !zArr[b2.f3471c]) && b2 != hVar && (((i2 = b2.f3478j) == 3 || i2 == 4) && a2 < f2)) {
                    f2 = a2;
                    hVar2 = b2;
                }
            }
        }
        return hVar2;
    }

    public boolean isEmpty() {
        return this.f3433a == null && this.f3434b == 0.0f && this.f3436d.k() == 0;
    }

    public void j(h hVar) {
        h hVar2 = this.f3433a;
        if (hVar2 != null) {
            this.f3436d.e(hVar2, -1.0f);
            this.f3433a.f3472d = -1;
            this.f3433a = null;
        }
        float g2 = this.f3436d.g(hVar, true) * -1.0f;
        this.f3433a = hVar;
        if (g2 != 1.0f) {
            this.f3434b /= g2;
            this.f3436d.f(g2);
        }
    }

    public void k(d dVar, h hVar, boolean z2) {
        if (hVar.f3475g) {
            float c2 = this.f3436d.c(hVar);
            this.f3434b = (hVar.f3474f * c2) + this.f3434b;
            this.f3436d.g(hVar, z2);
            if (z2) {
                hVar.b(this);
            }
            if (this.f3436d.k() == 0) {
                this.f3437e = true;
                dVar.f3445a = true;
            }
        }
    }

    public void l(d dVar, b bVar, boolean z2) {
        float h2 = this.f3436d.h(bVar, z2);
        this.f3434b = (bVar.f3434b * h2) + this.f3434b;
        if (z2) {
            bVar.f3433a.b(this);
        }
        if (this.f3433a != null && this.f3436d.k() == 0) {
            this.f3437e = true;
            dVar.f3445a = true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            n.h r0 = r9.f3433a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = androidx.activity.result.a.a(r0)
            n.h r1 = r9.f3433a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = h.f.a(r0, r1)
            float r1 = r9.f3434b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = androidx.activity.result.a.a(r0)
            float r1 = r9.f3434b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            n.b$a r4 = r9.f3436d
            int r4 = r4.k()
        L_0x003a:
            if (r3 >= r4) goto L_0x00a5
            n.b$a r5 = r9.f3436d
            n.h r5 = r5.b(r3)
            if (r5 != 0) goto L_0x0045
            goto L_0x00a2
        L_0x0045:
            n.b$a r6 = r9.f3436d
            float r6 = r6.a(r3)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0050
            goto L_0x00a2
        L_0x0050:
            java.lang.String r5 = r5.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0063
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x007e
            java.lang.StringBuilder r0 = androidx.activity.result.a.a(r0)
            java.lang.String r1 = "- "
            goto L_0x0075
        L_0x0063:
            java.lang.StringBuilder r0 = androidx.activity.result.a.a(r0)
            if (r7 <= 0) goto L_0x0073
            java.lang.String r1 = " + "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x007e
        L_0x0073:
            java.lang.String r1 = " - "
        L_0x0075:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            float r6 = r6 * r8
        L_0x007e:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x008a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto L_0x0097
        L_0x008a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
        L_0x0097:
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            r1 = 1
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x003a
        L_0x00a5:
            if (r1 != 0) goto L_0x00ad
            java.lang.String r1 = "0.0"
            java.lang.String r0 = h.f.a(r0, r1)
        L_0x00ad:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.b.toString():java.lang.String");
    }
}
