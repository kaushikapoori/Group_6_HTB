package p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import n.h;
import q.j;
import q.p;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public HashSet<d> f3632a = null;

    /* renamed from: b  reason: collision with root package name */
    public int f3633b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3634c;

    /* renamed from: d  reason: collision with root package name */
    public final e f3635d;

    /* renamed from: e  reason: collision with root package name */
    public final a f3636e;

    /* renamed from: f  reason: collision with root package name */
    public d f3637f;

    /* renamed from: g  reason: collision with root package name */
    public int f3638g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f3639h = Integer.MIN_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public h f3640i;

    public enum a {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, a aVar) {
        this.f3635d = eVar;
        this.f3636e = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r8.f3635d.E == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r5 != r12) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r5 != r1) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005e, code lost:
        if (r5 != r12) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0071, code lost:
        if (r5 != r2) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(p.d r9, int r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = 1
            if (r9 != 0) goto L_0x0007
            r8.h()
            return r0
        L_0x0007:
            if (r12 != 0) goto L_0x0078
            p.d$a r12 = p.d.a.CENTER_Y
            p.d$a r1 = p.d.a.RIGHT
            p.d$a r2 = p.d.a.CENTER_X
            p.d$a r3 = p.d.a.LEFT
            p.d$a r4 = p.d.a.BASELINE
            p.d$a r5 = r9.f3636e
            p.d$a r6 = r8.f3636e
            r7 = 0
            if (r5 != r6) goto L_0x002b
            if (r6 != r4) goto L_0x0029
            p.e r12 = r9.f3635d
            boolean r12 = r12.E
            if (r12 == 0) goto L_0x0074
            p.e r12 = r8.f3635d
            boolean r12 = r12.E
            if (r12 != 0) goto L_0x0029
            goto L_0x0074
        L_0x0029:
            r1 = 1
            goto L_0x0075
        L_0x002b:
            int r6 = r6.ordinal()
            switch(r6) {
                case 0: goto L_0x0074;
                case 1: goto L_0x0061;
                case 2: goto L_0x004a;
                case 3: goto L_0x0061;
                case 4: goto L_0x004a;
                case 5: goto L_0x0045;
                case 6: goto L_0x003e;
                case 7: goto L_0x0074;
                case 8: goto L_0x0074;
                default: goto L_0x0032;
            }
        L_0x0032:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            p.d$a r10 = r8.f3636e
            java.lang.String r10 = r10.name()
            r9.<init>(r10)
            throw r9
        L_0x003e:
            if (r5 == r4) goto L_0x0074
            if (r5 == r2) goto L_0x0074
            if (r5 == r12) goto L_0x0074
            goto L_0x0029
        L_0x0045:
            if (r5 == r3) goto L_0x0074
            if (r5 != r1) goto L_0x0029
            goto L_0x0074
        L_0x004a:
            p.d$a r1 = p.d.a.TOP
            if (r5 == r1) goto L_0x0055
            p.d$a r1 = p.d.a.BOTTOM
            if (r5 != r1) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            r1 = 0
            goto L_0x0056
        L_0x0055:
            r1 = 1
        L_0x0056:
            p.e r2 = r9.f3635d
            boolean r2 = r2 instanceof p.g
            if (r2 == 0) goto L_0x0075
            if (r1 != 0) goto L_0x0029
            if (r5 != r12) goto L_0x0074
            goto L_0x0029
        L_0x0061:
            if (r5 == r3) goto L_0x0068
            if (r5 != r1) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r1 = 0
            goto L_0x0069
        L_0x0068:
            r1 = 1
        L_0x0069:
            p.e r12 = r9.f3635d
            boolean r12 = r12 instanceof p.g
            if (r12 == 0) goto L_0x0075
            if (r1 != 0) goto L_0x0029
            if (r5 != r2) goto L_0x0074
            goto L_0x0029
        L_0x0074:
            r1 = 0
        L_0x0075:
            if (r1 != 0) goto L_0x0078
            return r7
        L_0x0078:
            r8.f3637f = r9
            java.util.HashSet<p.d> r12 = r9.f3632a
            if (r12 != 0) goto L_0x0085
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            r9.f3632a = r12
        L_0x0085:
            p.d r9 = r8.f3637f
            java.util.HashSet<p.d> r9 = r9.f3632a
            if (r9 == 0) goto L_0x008e
            r9.add(r8)
        L_0x008e:
            r8.f3638g = r10
            r8.f3639h = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.d.a(p.d, int, int, boolean):boolean");
    }

    public void b(int i2, ArrayList<p> arrayList, p pVar) {
        HashSet<d> hashSet = this.f3632a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                j.a(it.next().f3635d, i2, arrayList, pVar);
            }
        }
    }

    public int c() {
        if (!this.f3634c) {
            return 0;
        }
        return this.f3633b;
    }

    public int d() {
        d dVar;
        if (this.f3635d.f3667i0 == 8) {
            return 0;
        }
        int i2 = this.f3639h;
        if (i2 == Integer.MIN_VALUE || (dVar = this.f3637f) == null || dVar.f3635d.f3667i0 != 8) {
            return this.f3638g;
        }
        return i2;
    }

    public boolean e() {
        d dVar;
        HashSet<d> hashSet = this.f3632a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            d next = it.next();
            switch (next.f3636e.ordinal()) {
                case 0:
                case 5:
                case 6:
                case 7:
                case 8:
                    dVar = null;
                    break;
                case 1:
                    dVar = next.f3635d.L;
                    break;
                case 2:
                    dVar = next.f3635d.M;
                    break;
                case 3:
                    dVar = next.f3635d.J;
                    break;
                case 4:
                    dVar = next.f3635d.K;
                    break;
                default:
                    throw new AssertionError(next.f3636e.name());
            }
            if (dVar.g()) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        HashSet<d> hashSet = this.f3632a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean g() {
        return this.f3637f != null;
    }

    public void h() {
        HashSet<d> hashSet;
        d dVar = this.f3637f;
        if (!(dVar == null || (hashSet = dVar.f3632a) == null)) {
            hashSet.remove(this);
            if (this.f3637f.f3632a.size() == 0) {
                this.f3637f.f3632a = null;
            }
        }
        this.f3632a = null;
        this.f3637f = null;
        this.f3638g = 0;
        this.f3639h = Integer.MIN_VALUE;
        this.f3634c = false;
        this.f3633b = 0;
    }

    public void i() {
        h hVar = this.f3640i;
        if (hVar == null) {
            this.f3640i = new h(1);
        } else {
            hVar.c();
        }
    }

    public void j(int i2) {
        this.f3633b = i2;
        this.f3634c = true;
    }

    public String toString() {
        return this.f3635d.f3669j0 + ":" + this.f3636e.toString();
    }
}
