package p;

import androidx.activity.result.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p.d;
import q.c;
import q.g;
import q.m;
import q.o;

public class e {
    public int A;
    public float B;
    public int[] C;
    public float D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public d J;
    public d K;
    public d L;
    public d M;
    public d N;
    public d O;
    public d P;
    public d Q;
    public d[] R;
    public ArrayList<d> S;
    public boolean[] T;
    public int[] U;
    public e V;
    public int W;
    public int X;
    public float Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public boolean f3650a = false;

    /* renamed from: a0  reason: collision with root package name */
    public int f3651a0;

    /* renamed from: b  reason: collision with root package name */
    public c f3652b;

    /* renamed from: b0  reason: collision with root package name */
    public int f3653b0;

    /* renamed from: c  reason: collision with root package name */
    public c f3654c;

    /* renamed from: c0  reason: collision with root package name */
    public int f3655c0;

    /* renamed from: d  reason: collision with root package name */
    public m f3656d = null;

    /* renamed from: d0  reason: collision with root package name */
    public int f3657d0;

    /* renamed from: e  reason: collision with root package name */
    public o f3658e = null;

    /* renamed from: e0  reason: collision with root package name */
    public int f3659e0;

    /* renamed from: f  reason: collision with root package name */
    public boolean[] f3660f = {true, true};

    /* renamed from: f0  reason: collision with root package name */
    public float f3661f0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3662g = true;

    /* renamed from: g0  reason: collision with root package name */
    public float f3663g0;

    /* renamed from: h  reason: collision with root package name */
    public int f3664h = -1;

    /* renamed from: h0  reason: collision with root package name */
    public Object f3665h0;

    /* renamed from: i  reason: collision with root package name */
    public int f3666i = -1;

    /* renamed from: i0  reason: collision with root package name */
    public int f3667i0;

    /* renamed from: j  reason: collision with root package name */
    public String f3668j;

    /* renamed from: j0  reason: collision with root package name */
    public String f3669j0;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3670k;

    /* renamed from: k0  reason: collision with root package name */
    public int f3671k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3672l;

    /* renamed from: l0  reason: collision with root package name */
    public int f3673l0;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3674m;

    /* renamed from: m0  reason: collision with root package name */
    public float[] f3675m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3676n;

    /* renamed from: n0  reason: collision with root package name */
    public e[] f3677n0;

    /* renamed from: o  reason: collision with root package name */
    public int f3678o;

    /* renamed from: o0  reason: collision with root package name */
    public e[] f3679o0;

    /* renamed from: p  reason: collision with root package name */
    public int f3680p;

    /* renamed from: p0  reason: collision with root package name */
    public int f3681p0;

    /* renamed from: q  reason: collision with root package name */
    public int f3682q;

    /* renamed from: q0  reason: collision with root package name */
    public int f3683q0;

    /* renamed from: r  reason: collision with root package name */
    public int f3684r;

    /* renamed from: s  reason: collision with root package name */
    public int f3685s;

    /* renamed from: t  reason: collision with root package name */
    public int[] f3686t;

    /* renamed from: u  reason: collision with root package name */
    public int f3687u;

    /* renamed from: v  reason: collision with root package name */
    public int f3688v;

    /* renamed from: w  reason: collision with root package name */
    public float f3689w;

    /* renamed from: x  reason: collision with root package name */
    public int f3690x;

    /* renamed from: y  reason: collision with root package name */
    public int f3691y;

    /* renamed from: z  reason: collision with root package name */
    public float f3692z;

    public e() {
        new HashMap();
        this.f3670k = false;
        this.f3672l = false;
        this.f3674m = false;
        this.f3676n = false;
        this.f3678o = -1;
        this.f3680p = -1;
        this.f3682q = 0;
        this.f3684r = 0;
        this.f3685s = 0;
        this.f3686t = new int[2];
        this.f3687u = 0;
        this.f3688v = 0;
        this.f3689w = 1.0f;
        this.f3690x = 0;
        this.f3691y = 0;
        this.f3692z = 1.0f;
        this.A = -1;
        this.B = 1.0f;
        this.C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.D = 0.0f;
        this.E = false;
        this.G = false;
        this.H = 0;
        this.I = 0;
        d dVar = new d(this, d.a.LEFT);
        this.J = dVar;
        d dVar2 = new d(this, d.a.TOP);
        this.K = dVar2;
        d dVar3 = new d(this, d.a.RIGHT);
        this.L = dVar3;
        d dVar4 = new d(this, d.a.BOTTOM);
        this.M = dVar4;
        d dVar5 = new d(this, d.a.BASELINE);
        this.N = dVar5;
        this.O = new d(this, d.a.CENTER_X);
        this.P = new d(this, d.a.CENTER_Y);
        d dVar6 = new d(this, d.a.CENTER);
        this.Q = dVar6;
        this.R = new d[]{dVar, dVar3, dVar2, dVar4, dVar5, dVar6};
        ArrayList<d> arrayList = new ArrayList<>();
        this.S = arrayList;
        this.T = new boolean[2];
        this.U = new int[]{1, 1};
        this.V = null;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f3651a0 = 0;
        this.f3653b0 = 0;
        this.f3655c0 = 0;
        this.f3661f0 = 0.5f;
        this.f3663g0 = 0.5f;
        this.f3667i0 = 0;
        this.f3669j0 = null;
        this.f3671k0 = 0;
        this.f3673l0 = 0;
        this.f3675m0 = new float[]{-1.0f, -1.0f};
        this.f3677n0 = new e[]{null, null};
        this.f3679o0 = new e[]{null, null};
        this.f3681p0 = -1;
        this.f3683q0 = -1;
        arrayList.add(this.J);
        this.S.add(this.K);
        this.S.add(this.L);
        this.S.add(this.M);
        this.S.add(this.O);
        this.S.add(this.P);
        this.S.add(this.Q);
        this.S.add(this.N);
    }

    public boolean A() {
        d dVar = this.J;
        d dVar2 = dVar.f3637f;
        if (dVar2 != null && dVar2.f3637f == dVar) {
            return true;
        }
        d dVar3 = this.L;
        d dVar4 = dVar3.f3637f;
        return dVar4 != null && dVar4.f3637f == dVar3;
    }

    public boolean B() {
        d dVar = this.K;
        d dVar2 = dVar.f3637f;
        if (dVar2 != null && dVar2.f3637f == dVar) {
            return true;
        }
        d dVar3 = this.M;
        d dVar4 = dVar3.f3637f;
        return dVar4 != null && dVar4.f3637f == dVar3;
    }

    public boolean C() {
        return this.f3662g && this.f3667i0 != 8;
    }

    public boolean D() {
        return this.f3670k || (this.J.f3634c && this.L.f3634c);
    }

    public boolean E() {
        return this.f3672l || (this.K.f3634c && this.M.f3634c);
    }

    public void F() {
        this.J.h();
        this.K.h();
        this.L.h();
        this.M.h();
        this.N.h();
        this.O.h();
        this.P.h();
        this.Q.h();
        this.V = null;
        this.D = 0.0f;
        this.W = 0;
        this.X = 0;
        this.Y = 0.0f;
        this.Z = -1;
        this.f3651a0 = 0;
        this.f3653b0 = 0;
        this.f3655c0 = 0;
        this.f3657d0 = 0;
        this.f3659e0 = 0;
        this.f3661f0 = 0.5f;
        this.f3663g0 = 0.5f;
        int[] iArr = this.U;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f3665h0 = null;
        this.f3667i0 = 0;
        this.f3671k0 = 0;
        this.f3673l0 = 0;
        float[] fArr = this.f3675m0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f3678o = -1;
        this.f3680p = -1;
        int[] iArr2 = this.C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f3684r = 0;
        this.f3685s = 0;
        this.f3689w = 1.0f;
        this.f3692z = 1.0f;
        this.f3688v = Integer.MAX_VALUE;
        this.f3691y = Integer.MAX_VALUE;
        this.f3687u = 0;
        this.f3690x = 0;
        this.A = -1;
        this.B = 1.0f;
        boolean[] zArr = this.f3660f;
        zArr[0] = true;
        zArr[1] = true;
        this.G = false;
        boolean[] zArr2 = this.T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f3662g = true;
        int[] iArr3 = this.f3686t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f3664h = -1;
        this.f3666i = -1;
    }

    public void G() {
        this.f3670k = false;
        this.f3672l = false;
        this.f3674m = false;
        this.f3676n = false;
        int size = this.S.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = this.S.get(i2);
            dVar.f3634c = false;
            dVar.f3633b = 0;
        }
    }

    public void H(n.c cVar) {
        this.J.i();
        this.K.i();
        this.L.i();
        this.M.i();
        this.N.i();
        this.Q.i();
        this.O.i();
        this.P.i();
    }

    public final void I(StringBuilder sb, String str, float f2, float f3) {
        if (f2 != f3) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(f2);
            sb.append(",\n");
        }
    }

    public final void J(StringBuilder sb, String str, int i2, int i3) {
        if (i2 != i3) {
            sb.append(str);
            sb.append(" :   ");
            sb.append(i2);
            sb.append(",\n");
        }
    }

    public void K(int i2) {
        this.f3655c0 = i2;
        this.E = i2 > 0;
    }

    public void L(int i2, int i3) {
        if (!this.f3670k) {
            d dVar = this.J;
            dVar.f3633b = i2;
            dVar.f3634c = true;
            d dVar2 = this.L;
            dVar2.f3633b = i3;
            dVar2.f3634c = true;
            this.f3651a0 = i2;
            this.W = i3 - i2;
            this.f3670k = true;
        }
    }

    public void M(int i2, int i3) {
        if (!this.f3672l) {
            d dVar = this.K;
            dVar.f3633b = i2;
            dVar.f3634c = true;
            d dVar2 = this.M;
            dVar2.f3633b = i3;
            dVar2.f3634c = true;
            this.f3653b0 = i2;
            this.X = i3 - i2;
            if (this.E) {
                this.N.j(i2 + this.f3655c0);
            }
            this.f3672l = true;
        }
    }

    public void N(int i2) {
        this.X = i2;
        int i3 = this.f3659e0;
        if (i2 < i3) {
            this.X = i3;
        }
    }

    public void O(int i2) {
        this.U[0] = i2;
    }

    public void P(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.f3659e0 = i2;
    }

    public void Q(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        this.f3657d0 = i2;
    }

    public void R(int i2) {
        this.U[1] = i2;
    }

    public void S(int i2) {
        this.W = i2;
        int i3 = this.f3657d0;
        if (i2 < i3) {
            this.W = i3;
        }
    }

    public void T(boolean z2, boolean z3) {
        int i2;
        int i3;
        m mVar = this.f3656d;
        boolean z4 = z2 & mVar.f3779g;
        o oVar = this.f3658e;
        boolean z5 = z3 & oVar.f3779g;
        int i4 = mVar.f3780h.f3742g;
        int i5 = oVar.f3780h.f3742g;
        int i6 = mVar.f3781i.f3742g;
        int i7 = oVar.f3781i.f3742g;
        int i8 = i7 - i5;
        if (i6 - i4 < 0 || i8 < 0 || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE || i7 == Integer.MIN_VALUE || i7 == Integer.MAX_VALUE) {
            i6 = 0;
            i7 = 0;
            i4 = 0;
            i5 = 0;
        }
        int i9 = i6 - i4;
        int i10 = i7 - i5;
        if (z4) {
            this.f3651a0 = i4;
        }
        if (z5) {
            this.f3653b0 = i5;
        }
        if (this.f3667i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        if (z4) {
            if (this.U[0] == 1 && i9 < (i3 = this.W)) {
                i9 = i3;
            }
            this.W = i9;
            int i11 = this.f3657d0;
            if (i9 < i11) {
                this.W = i11;
            }
        }
        if (z5) {
            if (this.U[1] == 1 && i10 < (i2 = this.X)) {
                i10 = i2;
            }
            this.X = i10;
            int i12 = this.f3659e0;
            if (i10 < i12) {
                this.X = i12;
            }
        }
    }

    public void U(n.d dVar, boolean z2) {
        int i2;
        int i3;
        o oVar;
        m mVar;
        int o2 = dVar.o(this.J);
        int o3 = dVar.o(this.K);
        int o4 = dVar.o(this.L);
        int o5 = dVar.o(this.M);
        if (z2 && (mVar = this.f3656d) != null) {
            g gVar = mVar.f3780h;
            if (gVar.f3745j) {
                g gVar2 = mVar.f3781i;
                if (gVar2.f3745j) {
                    o2 = gVar.f3742g;
                    o4 = gVar2.f3742g;
                }
            }
        }
        if (z2 && (oVar = this.f3658e) != null) {
            g gVar3 = oVar.f3780h;
            if (gVar3.f3745j) {
                g gVar4 = oVar.f3781i;
                if (gVar4.f3745j) {
                    o3 = gVar3.f3742g;
                    o5 = gVar4.f3742g;
                }
            }
        }
        int i4 = o5 - o3;
        if (o4 - o2 < 0 || i4 < 0 || o2 == Integer.MIN_VALUE || o2 == Integer.MAX_VALUE || o3 == Integer.MIN_VALUE || o3 == Integer.MAX_VALUE || o4 == Integer.MIN_VALUE || o4 == Integer.MAX_VALUE || o5 == Integer.MIN_VALUE || o5 == Integer.MAX_VALUE) {
            o5 = 0;
            o2 = 0;
            o3 = 0;
            o4 = 0;
        }
        int i5 = o4 - o2;
        int i6 = o5 - o3;
        this.f3651a0 = o2;
        this.f3653b0 = o3;
        if (this.f3667i0 == 8) {
            this.W = 0;
            this.X = 0;
            return;
        }
        int[] iArr = this.U;
        if (iArr[0] == 1 && i5 < (i3 = this.W)) {
            i5 = i3;
        }
        if (iArr[1] == 1 && i6 < (i2 = this.X)) {
            i6 = i2;
        }
        this.W = i5;
        this.X = i6;
        int i7 = this.f3659e0;
        if (i6 < i7) {
            this.X = i7;
        }
        int i8 = this.f3657d0;
        if (i5 < i8) {
            this.W = i8;
        }
        int i9 = this.f3688v;
        if (i9 > 0 && iArr[0] == 3) {
            this.W = Math.min(this.W, i9);
        }
        int i10 = this.f3691y;
        if (i10 > 0 && this.U[1] == 3) {
            this.X = Math.min(this.X, i10);
        }
        int i11 = this.W;
        if (i5 != i11) {
            this.f3664h = i11;
        }
        int i12 = this.X;
        if (i6 != i12) {
            this.f3666i = i12;
        }
    }

    public void b(f fVar, n.d dVar, HashSet<e> hashSet, int i2, boolean z2) {
        if (z2) {
            if (hashSet.contains(this)) {
                j.a(fVar, dVar, this);
                hashSet.remove(this);
                d(dVar, fVar.f0(64));
            } else {
                return;
            }
        }
        if (i2 == 0) {
            HashSet<d> hashSet2 = this.J.f3632a;
            if (hashSet2 != null) {
                Iterator<d> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f3635d.b(fVar, dVar, hashSet, i2, true);
                }
            }
            HashSet<d> hashSet3 = this.L.f3632a;
            if (hashSet3 != null) {
                Iterator<d> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f3635d.b(fVar, dVar, hashSet, i2, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSet4 = this.K.f3632a;
        if (hashSet4 != null) {
            Iterator<d> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f3635d.b(fVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<d> hashSet5 = this.M.f3632a;
        if (hashSet5 != null) {
            Iterator<d> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f3635d.b(fVar, dVar, hashSet, i2, true);
            }
        }
        HashSet<d> hashSet6 = this.N.f3632a;
        if (hashSet6 != null) {
            Iterator<d> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f3635d.b(fVar, dVar, hashSet, i2, true);
            }
        }
    }

    public boolean c() {
        return (this instanceof k) || (this instanceof g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:191:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x02e8  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0397  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x04a1  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x051b  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0522  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x05ad  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(n.d r49, boolean r50) {
        /*
            r48 = this;
            r15 = r48
            r14 = r49
            p.d r0 = r15.J
            n.h r13 = r14.l(r0)
            p.d r0 = r15.L
            n.h r12 = r14.l(r0)
            p.d r0 = r15.K
            n.h r11 = r14.l(r0)
            p.d r0 = r15.M
            n.h r10 = r14.l(r0)
            p.d r0 = r15.N
            n.h r9 = r14.l(r0)
            p.e r0 = r15.V
            r8 = 2
            r7 = 3
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x004c
            int[] r0 = r0.U
            r1 = r0[r5]
            if (r1 != r8) goto L_0x0032
            r1 = 1
            goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            r0 = r0[r6]
            if (r0 != r8) goto L_0x0039
            r0 = 1
            goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            int r2 = r15.f3682q
            if (r2 == r6) goto L_0x0047
            if (r2 == r8) goto L_0x004d
            if (r2 == r7) goto L_0x004c
            r28 = r0
            r29 = r1
            goto L_0x0051
        L_0x0047:
            r29 = r1
            r28 = 0
            goto L_0x0051
        L_0x004c:
            r0 = 0
        L_0x004d:
            r28 = r0
            r29 = 0
        L_0x0051:
            int r0 = r15.f3667i0
            r4 = 8
            if (r0 != r4) goto L_0x0081
            java.util.ArrayList<p.d> r0 = r15.S
            int r0 = r0.size()
            r1 = 0
        L_0x005e:
            if (r1 >= r0) goto L_0x0073
            java.util.ArrayList<p.d> r2 = r15.S
            java.lang.Object r2 = r2.get(r1)
            p.d r2 = (p.d) r2
            boolean r2 = r2.f()
            if (r2 == 0) goto L_0x0070
            r0 = 1
            goto L_0x0074
        L_0x0070:
            int r1 = r1 + 1
            goto L_0x005e
        L_0x0073:
            r0 = 0
        L_0x0074:
            if (r0 != 0) goto L_0x0081
            boolean[] r0 = r15.T
            boolean r1 = r0[r5]
            if (r1 != 0) goto L_0x0081
            boolean r0 = r0[r6]
            if (r0 != 0) goto L_0x0081
            return
        L_0x0081:
            boolean r0 = r15.f3670k
            if (r0 != 0) goto L_0x0089
            boolean r1 = r15.f3672l
            if (r1 == 0) goto L_0x00ea
        L_0x0089:
            if (r0 == 0) goto L_0x00aa
            int r0 = r15.f3651a0
            r14.e(r13, r0)
            int r0 = r15.f3651a0
            int r1 = r15.W
            int r0 = r0 + r1
            r14.e(r12, r0)
            if (r29 == 0) goto L_0x00aa
            p.e r0 = r15.V
            if (r0 == 0) goto L_0x00aa
            p.f r0 = (p.f) r0
            p.d r1 = r15.J
            r0.Z(r1)
            p.d r1 = r15.L
            r0.Y(r1)
        L_0x00aa:
            boolean r0 = r15.f3672l
            if (r0 == 0) goto L_0x00dd
            int r0 = r15.f3653b0
            r14.e(r11, r0)
            int r0 = r15.f3653b0
            int r1 = r15.X
            int r0 = r0 + r1
            r14.e(r10, r0)
            p.d r0 = r15.N
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00cb
            int r0 = r15.f3653b0
            int r1 = r15.f3655c0
            int r0 = r0 + r1
            r14.e(r9, r0)
        L_0x00cb:
            if (r28 == 0) goto L_0x00dd
            p.e r0 = r15.V
            if (r0 == 0) goto L_0x00dd
            p.f r0 = (p.f) r0
            p.d r1 = r15.K
            r0.b0(r1)
            p.d r1 = r15.M
            r0.a0(r1)
        L_0x00dd:
            boolean r0 = r15.f3670k
            if (r0 == 0) goto L_0x00ea
            boolean r0 = r15.f3672l
            if (r0 == 0) goto L_0x00ea
            r15.f3670k = r5
            r15.f3672l = r5
            return
        L_0x00ea:
            if (r50 == 0) goto L_0x0170
            q.m r0 = r15.f3656d
            if (r0 == 0) goto L_0x0170
            q.o r1 = r15.f3658e
            if (r1 == 0) goto L_0x0170
            q.g r2 = r0.f3780h
            boolean r3 = r2.f3745j
            if (r3 == 0) goto L_0x0170
            q.g r0 = r0.f3781i
            boolean r0 = r0.f3745j
            if (r0 == 0) goto L_0x0170
            q.g r0 = r1.f3780h
            boolean r0 = r0.f3745j
            if (r0 == 0) goto L_0x0170
            q.g r0 = r1.f3781i
            boolean r0 = r0.f3745j
            if (r0 == 0) goto L_0x0170
            int r0 = r2.f3742g
            r14.e(r13, r0)
            q.m r0 = r15.f3656d
            q.g r0 = r0.f3781i
            int r0 = r0.f3742g
            r14.e(r12, r0)
            q.o r0 = r15.f3658e
            q.g r0 = r0.f3780h
            int r0 = r0.f3742g
            r14.e(r11, r0)
            q.o r0 = r15.f3658e
            q.g r0 = r0.f3781i
            int r0 = r0.f3742g
            r14.e(r10, r0)
            q.o r0 = r15.f3658e
            q.g r0 = r0.f3765k
            int r0 = r0.f3742g
            r14.e(r9, r0)
            p.e r0 = r15.V
            if (r0 == 0) goto L_0x016b
            if (r29 == 0) goto L_0x0152
            boolean[] r0 = r15.f3660f
            boolean r0 = r0[r5]
            if (r0 == 0) goto L_0x0152
            boolean r0 = r48.A()
            if (r0 != 0) goto L_0x0152
            p.e r0 = r15.V
            p.d r0 = r0.L
            n.h r0 = r14.l(r0)
            r14.f(r0, r12, r5, r4)
        L_0x0152:
            if (r28 == 0) goto L_0x016b
            boolean[] r0 = r15.f3660f
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x016b
            boolean r0 = r48.B()
            if (r0 != 0) goto L_0x016b
            p.e r0 = r15.V
            p.d r0 = r0.M
            n.h r0 = r14.l(r0)
            r14.f(r0, r10, r5, r4)
        L_0x016b:
            r15.f3670k = r5
            r15.f3672l = r5
            return
        L_0x0170:
            p.e r0 = r15.V
            if (r0 == 0) goto L_0x01e1
            boolean r0 = r15.z(r5)
            if (r0 == 0) goto L_0x0183
            p.e r0 = r15.V
            p.f r0 = (p.f) r0
            r0.W(r15, r5)
            r0 = 1
            goto L_0x0187
        L_0x0183:
            boolean r0 = r48.A()
        L_0x0187:
            boolean r1 = r15.z(r6)
            if (r1 == 0) goto L_0x0196
            p.e r1 = r15.V
            p.f r1 = (p.f) r1
            r1.W(r15, r6)
            r1 = 1
            goto L_0x019a
        L_0x0196:
            boolean r1 = r48.B()
        L_0x019a:
            if (r0 != 0) goto L_0x01b9
            if (r29 == 0) goto L_0x01b9
            int r2 = r15.f3667i0
            if (r2 == r4) goto L_0x01b9
            p.d r2 = r15.J
            p.d r2 = r2.f3637f
            if (r2 != 0) goto L_0x01b9
            p.d r2 = r15.L
            p.d r2 = r2.f3637f
            if (r2 != 0) goto L_0x01b9
            p.e r2 = r15.V
            p.d r2 = r2.L
            n.h r2 = r14.l(r2)
            r14.f(r2, r12, r5, r6)
        L_0x01b9:
            if (r1 != 0) goto L_0x01dc
            if (r28 == 0) goto L_0x01dc
            int r2 = r15.f3667i0
            if (r2 == r4) goto L_0x01dc
            p.d r2 = r15.K
            p.d r2 = r2.f3637f
            if (r2 != 0) goto L_0x01dc
            p.d r2 = r15.M
            p.d r2 = r2.f3637f
            if (r2 != 0) goto L_0x01dc
            p.d r2 = r15.N
            if (r2 != 0) goto L_0x01dc
            p.e r2 = r15.V
            p.d r2 = r2.M
            n.h r2 = r14.l(r2)
            r14.f(r2, r10, r5, r6)
        L_0x01dc:
            r31 = r0
            r30 = r1
            goto L_0x01e5
        L_0x01e1:
            r30 = 0
            r31 = 0
        L_0x01e5:
            int r0 = r15.W
            int r1 = r15.f3657d0
            if (r0 >= r1) goto L_0x01ec
            goto L_0x01ed
        L_0x01ec:
            r1 = r0
        L_0x01ed:
            int r2 = r15.X
            int r3 = r15.f3659e0
            if (r2 >= r3) goto L_0x01f4
            goto L_0x01f5
        L_0x01f4:
            r3 = r2
        L_0x01f5:
            int[] r8 = r15.U
            r4 = r8[r5]
            if (r4 == r7) goto L_0x01fd
            r4 = 1
            goto L_0x01fe
        L_0x01fd:
            r4 = 0
        L_0x01fe:
            r5 = r8[r6]
            if (r5 == r7) goto L_0x0204
            r5 = 1
            goto L_0x0205
        L_0x0204:
            r5 = 0
        L_0x0205:
            int r6 = r15.Z
            r15.A = r6
            float r7 = r15.Y
            r15.B = r7
            r21 = r1
            int r1 = r15.f3684r
            r22 = r3
            int r3 = r15.f3685s
            r23 = 0
            r24 = 4
            r27 = r9
            int r23 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r23 <= 0) goto L_0x0358
            int r9 = r15.f3667i0
            r32 = r10
            r10 = 8
            if (r9 == r10) goto L_0x035a
            r9 = 0
            r10 = r8[r9]
            r9 = 3
            if (r10 != r9) goto L_0x0233
            if (r1 != 0) goto L_0x0233
            r33 = r11
            r1 = 3
            goto L_0x0235
        L_0x0233:
            r33 = r11
        L_0x0235:
            r10 = 1
            r11 = r8[r10]
            if (r11 != r9) goto L_0x023d
            if (r3 != 0) goto L_0x023d
            r3 = 3
        L_0x023d:
            r11 = 0
            r10 = r8[r11]
            r25 = 1065353216(0x3f800000, float:1.0)
            if (r10 != r9) goto L_0x0304
            r10 = 1
            r11 = r8[r10]
            if (r11 != r9) goto L_0x0304
            if (r1 != r9) goto L_0x0304
            if (r3 != r9) goto L_0x0304
            r9 = -1
            if (r6 != r9) goto L_0x0265
            if (r4 == 0) goto L_0x0258
            if (r5 != 0) goto L_0x0258
            r0 = 0
            r15.A = r0
            goto L_0x0265
        L_0x0258:
            if (r4 != 0) goto L_0x0265
            if (r5 == 0) goto L_0x0265
            r0 = 1
            r15.A = r0
            if (r6 != r9) goto L_0x0265
            float r0 = r25 / r7
            r15.B = r0
        L_0x0265:
            int r0 = r15.A
            if (r0 != 0) goto L_0x027b
            p.d r0 = r15.K
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x0279
            p.d r0 = r15.M
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x027b
        L_0x0279:
            r0 = 1
            goto L_0x0291
        L_0x027b:
            int r0 = r15.A
            r2 = 1
            if (r0 != r2) goto L_0x0293
            p.d r0 = r15.J
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x0290
            p.d r0 = r15.L
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0293
        L_0x0290:
            r0 = 0
        L_0x0291:
            r15.A = r0
        L_0x0293:
            int r0 = r15.A
            r2 = -1
            if (r0 != r2) goto L_0x02e3
            p.d r0 = r15.K
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02b8
            p.d r0 = r15.M
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02b8
            p.d r0 = r15.J
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02b8
            p.d r0 = r15.L
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x02e3
        L_0x02b8:
            p.d r0 = r15.K
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02ca
            p.d r0 = r15.M
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02ca
            r0 = 0
            goto L_0x02e1
        L_0x02ca:
            p.d r0 = r15.J
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02e3
            p.d r0 = r15.L
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x02e3
            float r0 = r15.B
            float r0 = r25 / r0
            r15.B = r0
            r0 = 1
        L_0x02e1:
            r15.A = r0
        L_0x02e3:
            int r0 = r15.A
            r2 = -1
            if (r0 != r2) goto L_0x034d
            int r0 = r15.f3687u
            if (r0 <= 0) goto L_0x02f4
            int r2 = r15.f3690x
            if (r2 != 0) goto L_0x02f4
            r2 = 0
            r15.A = r2
            goto L_0x034d
        L_0x02f4:
            if (r0 != 0) goto L_0x034d
            int r0 = r15.f3690x
            if (r0 <= 0) goto L_0x034d
            float r0 = r15.B
            float r0 = r25 / r0
            r15.B = r0
            r0 = 1
            r15.A = r0
            goto L_0x034d
        L_0x0304:
            r4 = 0
            r5 = r8[r4]
            r9 = 3
            if (r5 != r9) goto L_0x0324
            if (r1 != r9) goto L_0x0324
            r15.A = r4
            float r0 = (float) r2
            float r7 = r7 * r0
            int r0 = (int) r7
            r2 = 1
            r4 = r8[r2]
            if (r4 == r9) goto L_0x0321
            r1 = r0
            r36 = r3
            r34 = r22
            r35 = 0
            r37 = 4
            goto L_0x0366
        L_0x0321:
            r21 = r0
            goto L_0x034d
        L_0x0324:
            r2 = 1
            r4 = r8[r2]
            if (r4 != r9) goto L_0x034d
            if (r3 != r9) goto L_0x034d
            r15.A = r2
            r2 = -1
            if (r6 != r2) goto L_0x0334
            float r2 = r25 / r7
            r15.B = r2
        L_0x0334:
            float r2 = r15.B
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = (int) r2
            r2 = 0
            r4 = r8[r2]
            r2 = 3
            if (r4 == r2) goto L_0x034b
            r34 = r0
            r37 = r1
            r1 = r21
            r35 = 0
            r36 = 4
            goto L_0x0366
        L_0x034b:
            r22 = r0
        L_0x034d:
            r37 = r1
            r36 = r3
            r1 = r21
            r34 = r22
            r35 = 1
            goto L_0x0366
        L_0x0358:
            r32 = r10
        L_0x035a:
            r33 = r11
            r37 = r1
            r36 = r3
            r1 = r21
            r34 = r22
            r35 = 0
        L_0x0366:
            int[] r0 = r15.f3686t
            r2 = 0
            r0[r2] = r37
            r2 = 1
            r0[r2] = r36
            if (r35 == 0) goto L_0x037a
            int r0 = r15.A
            r2 = -1
            if (r0 == 0) goto L_0x0377
            if (r0 != r2) goto L_0x037b
        L_0x0377:
            r21 = 1
            goto L_0x037d
        L_0x037a:
            r2 = -1
        L_0x037b:
            r21 = 0
        L_0x037d:
            if (r35 == 0) goto L_0x0389
            int r0 = r15.A
            r3 = 1
            if (r0 == r3) goto L_0x0386
            if (r0 != r2) goto L_0x0389
        L_0x0386:
            r38 = 1
            goto L_0x038b
        L_0x0389:
            r38 = 0
        L_0x038b:
            int[] r0 = r15.U
            r2 = 0
            r0 = r0[r2]
            r2 = 2
            if (r0 != r2) goto L_0x0399
            boolean r0 = r15 instanceof p.f
            if (r0 == 0) goto L_0x0399
            r9 = 1
            goto L_0x039a
        L_0x0399:
            r9 = 0
        L_0x039a:
            if (r9 == 0) goto L_0x039f
            r22 = 0
            goto L_0x03a1
        L_0x039f:
            r22 = r1
        L_0x03a1:
            p.d r0 = r15.Q
            boolean r0 = r0.g()
            r1 = 1
            r39 = r0 ^ 1
            boolean[] r0 = r15.T
            r2 = 0
            boolean r23 = r0[r2]
            boolean r40 = r0[r1]
            int r0 = r15.f3678o
            r41 = 0
            r8 = 2
            if (r0 == r8) goto L_0x0402
            boolean r0 = r15.f3670k
            if (r0 != 0) goto L_0x0402
            if (r50 == 0) goto L_0x040e
            q.m r0 = r15.f3656d
            if (r0 == 0) goto L_0x040e
            q.g r1 = r0.f3780h
            boolean r2 = r1.f3745j
            if (r2 == 0) goto L_0x040e
            q.g r0 = r0.f3781i
            boolean r0 = r0.f3745j
            if (r0 != 0) goto L_0x03cf
            goto L_0x040e
        L_0x03cf:
            if (r50 == 0) goto L_0x0402
            int r0 = r1.f3742g
            r14.e(r13, r0)
            q.m r0 = r15.f3656d
            q.g r0 = r0.f3781i
            int r0 = r0.f3742g
            r14.e(r12, r0)
            p.e r0 = r15.V
            if (r0 == 0) goto L_0x0400
            if (r29 == 0) goto L_0x0400
            boolean[] r0 = r15.f3660f
            r1 = 0
            boolean r0 = r0[r1]
            if (r0 == 0) goto L_0x0400
            boolean r0 = r48.A()
            if (r0 != 0) goto L_0x0400
            p.e r0 = r15.V
            p.d r0 = r0.L
            n.h r0 = r14.l(r0)
            r4 = 8
            r14.f(r0, r12, r1, r4)
            goto L_0x0402
        L_0x0400:
            r4 = 8
        L_0x0402:
            r47 = r27
            r45 = r32
            r46 = r33
            r32 = r12
            r33 = r13
            goto L_0x049f
        L_0x040e:
            r4 = 8
            p.e r0 = r15.V
            if (r0 == 0) goto L_0x041c
            p.d r0 = r0.L
            n.h r0 = r14.l(r0)
            r7 = r0
            goto L_0x041e
        L_0x041c:
            r7 = r41
        L_0x041e:
            p.e r0 = r15.V
            if (r0 == 0) goto L_0x042a
            p.d r0 = r0.J
            n.h r0 = r14.l(r0)
            r6 = r0
            goto L_0x042c
        L_0x042a:
            r6 = r41
        L_0x042c:
            boolean[] r0 = r15.f3660f
            r5 = 0
            boolean r10 = r0[r5]
            int[] r0 = r15.U
            r11 = r0[r5]
            p.d r3 = r15.J
            p.d r1 = r15.L
            int r2 = r15.f3651a0
            r16 = r2
            int r2 = r15.f3657d0
            int[] r4 = r15.C
            r18 = r4[r5]
            float r4 = r15.f3661f0
            r19 = 1
            r0 = r0[r19]
            r8 = 3
            if (r0 != r8) goto L_0x044f
            r20 = 1
            goto L_0x0451
        L_0x044f:
            r20 = 0
        L_0x0451:
            int r0 = r15.f3687u
            r24 = r0
            int r0 = r15.f3688v
            r25 = r0
            float r0 = r15.f3689w
            r26 = r0
            r0 = 1
            r42 = r2
            r2 = r0
            r0 = r48
            r43 = r1
            r1 = r49
            r44 = r3
            r3 = r29
            r17 = r4
            r4 = r28
            r5 = r10
            r10 = 1
            r8 = r11
            r11 = r27
            r45 = r32
            r10 = r44
            r47 = r11
            r46 = r33
            r11 = r43
            r32 = r12
            r12 = r16
            r33 = r13
            r13 = r22
            r14 = r42
            r15 = r18
            r16 = r17
            r17 = r21
            r18 = r20
            r19 = r31
            r20 = r30
            r21 = r23
            r22 = r37
            r23 = r36
            r27 = r39
            r0.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x049f:
            if (r50 == 0) goto L_0x0505
            r15 = r48
            q.o r0 = r15.f3658e
            if (r0 == 0) goto L_0x04f8
            q.g r1 = r0.f3780h
            boolean r2 = r1.f3745j
            if (r2 == 0) goto L_0x04f8
            q.g r0 = r0.f3781i
            boolean r0 = r0.f3745j
            if (r0 == 0) goto L_0x04f8
            int r0 = r1.f3742g
            r14 = r49
            r13 = r46
            r14.e(r13, r0)
            q.o r0 = r15.f3658e
            q.g r0 = r0.f3781i
            int r0 = r0.f3742g
            r12 = r45
            r14.e(r12, r0)
            q.o r0 = r15.f3658e
            q.g r0 = r0.f3765k
            int r0 = r0.f3742g
            r1 = r47
            r14.e(r1, r0)
            p.e r0 = r15.V
            if (r0 == 0) goto L_0x04f2
            if (r30 != 0) goto L_0x04f2
            if (r28 == 0) goto L_0x04f2
            boolean[] r2 = r15.f3660f
            r11 = 1
            boolean r2 = r2[r11]
            if (r2 == 0) goto L_0x04ee
            p.d r0 = r0.M
            n.h r0 = r14.l(r0)
            r2 = 8
            r10 = 0
            r14.f(r0, r12, r10, r2)
            goto L_0x04f6
        L_0x04ee:
            r2 = 8
            r10 = 0
            goto L_0x04f6
        L_0x04f2:
            r2 = 8
            r10 = 0
            r11 = 1
        L_0x04f6:
            r6 = 0
            goto L_0x0514
        L_0x04f8:
            r14 = r49
            r12 = r45
            r13 = r46
            r1 = r47
            r2 = 8
            r10 = 0
            r11 = 1
            goto L_0x0513
        L_0x0505:
            r2 = 8
            r10 = 0
            r11 = 1
            r15 = r48
            r14 = r49
            r12 = r45
            r13 = r46
            r1 = r47
        L_0x0513:
            r6 = 1
        L_0x0514:
            int r0 = r15.f3680p
            r3 = 2
            if (r0 != r3) goto L_0x051b
            r5 = 0
            goto L_0x051c
        L_0x051b:
            r5 = r6
        L_0x051c:
            if (r5 == 0) goto L_0x05ee
            boolean r0 = r15.f3672l
            if (r0 != 0) goto L_0x05ee
            int[] r0 = r15.U
            r0 = r0[r11]
            if (r0 != r3) goto L_0x052e
            boolean r0 = r15 instanceof p.f
            if (r0 == 0) goto L_0x052e
            r9 = 1
            goto L_0x052f
        L_0x052e:
            r9 = 0
        L_0x052f:
            if (r9 == 0) goto L_0x0533
            r34 = 0
        L_0x0533:
            p.e r0 = r15.V
            if (r0 == 0) goto L_0x053f
            p.d r0 = r0.M
            n.h r0 = r14.l(r0)
            r7 = r0
            goto L_0x0541
        L_0x053f:
            r7 = r41
        L_0x0541:
            p.e r0 = r15.V
            if (r0 == 0) goto L_0x054d
            p.d r0 = r0.K
            n.h r0 = r14.l(r0)
            r6 = r0
            goto L_0x054f
        L_0x054d:
            r6 = r41
        L_0x054f:
            int r0 = r15.f3655c0
            if (r0 > 0) goto L_0x0557
            int r3 = r15.f3667i0
            if (r3 != r2) goto L_0x058b
        L_0x0557:
            p.d r3 = r15.N
            p.d r4 = r3.f3637f
            if (r4 == 0) goto L_0x0580
            r14.d(r1, r13, r0, r2)
            p.d r0 = r15.N
            p.d r0 = r0.f3637f
            n.h r0 = r14.l(r0)
            p.d r3 = r15.N
            int r3 = r3.d()
            r14.d(r1, r0, r3, r2)
            if (r28 == 0) goto L_0x057d
            p.d r0 = r15.M
            n.h r0 = r14.l(r0)
            r1 = 5
            r14.f(r7, r0, r10, r1)
        L_0x057d:
            r27 = 0
            goto L_0x058d
        L_0x0580:
            int r4 = r15.f3667i0
            if (r4 != r2) goto L_0x0588
            int r0 = r3.d()
        L_0x0588:
            r14.d(r1, r13, r0, r2)
        L_0x058b:
            r27 = r39
        L_0x058d:
            boolean[] r0 = r15.f3660f
            boolean r5 = r0[r11]
            int[] r0 = r15.U
            r8 = r0[r11]
            p.d r4 = r15.K
            p.d r3 = r15.M
            int r1 = r15.f3653b0
            int r2 = r15.f3659e0
            int[] r10 = r15.C
            r16 = r10[r11]
            float r10 = r15.f3663g0
            r17 = 0
            r0 = r0[r17]
            r11 = 3
            if (r0 != r11) goto L_0x05ad
            r18 = 1
            goto L_0x05af
        L_0x05ad:
            r18 = 0
        L_0x05af:
            int r0 = r15.f3690x
            r24 = r0
            int r0 = r15.f3691y
            r25 = r0
            float r0 = r15.f3692z
            r26 = r0
            r0 = 0
            r20 = r2
            r2 = r0
            r0 = r48
            r21 = r1
            r1 = r49
            r11 = r3
            r3 = r28
            r22 = r4
            r4 = r29
            r17 = r10
            r10 = r22
            r28 = r12
            r12 = r21
            r29 = r13
            r13 = r34
            r14 = r20
            r15 = r16
            r16 = r17
            r17 = r38
            r19 = r30
            r20 = r31
            r21 = r40
            r22 = r36
            r23 = r37
            r0.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x05f2
        L_0x05ee:
            r28 = r12
            r29 = r13
        L_0x05f2:
            r7 = r48
            if (r35 == 0) goto L_0x0615
            int r0 = r7.A
            float r5 = r7.B
            r1 = 1
            if (r0 != r1) goto L_0x0606
            r1 = r28
            r2 = r29
            r3 = r32
            r4 = r33
            goto L_0x060e
        L_0x0606:
            r3 = r28
            r4 = r29
            r1 = r32
            r2 = r33
        L_0x060e:
            r6 = 8
            r0 = r49
            r0.h(r1, r2, r3, r4, r5, r6)
        L_0x0615:
            p.d r0 = r7.Q
            boolean r0 = r0.g()
            if (r0 == 0) goto L_0x06ae
            p.d r0 = r7.Q
            p.d r0 = r0.f3637f
            p.e r0 = r0.f3635d
            float r1 = r7.D
            r2 = 1119092736(0x42b40000, float:90.0)
            float r1 = r1 + r2
            double r1 = (double) r1
            double r1 = java.lang.Math.toRadians(r1)
            float r1 = (float) r1
            p.d r2 = r7.Q
            int r2 = r2.d()
            p.d$a r3 = p.d.a.LEFT
            p.d r4 = r7.i(r3)
            r5 = r49
            n.h r9 = r5.l(r4)
            p.d$a r4 = p.d.a.TOP
            p.d r6 = r7.i(r4)
            n.h r11 = r5.l(r6)
            p.d$a r6 = p.d.a.RIGHT
            p.d r8 = r7.i(r6)
            n.h r16 = r5.l(r8)
            p.d$a r8 = p.d.a.BOTTOM
            p.d r10 = r7.i(r8)
            n.h r12 = r5.l(r10)
            p.d r3 = r0.i(r3)
            n.h r3 = r5.l(r3)
            p.d r4 = r0.i(r4)
            n.h r13 = r5.l(r4)
            p.d r4 = r0.i(r6)
            n.h r4 = r5.l(r4)
            p.d r0 = r0.i(r8)
            n.h r14 = r5.l(r0)
            n.b r0 = r49.m()
            double r6 = (double) r1
            double r17 = java.lang.Math.sin(r6)
            double r1 = (double) r2
            r50 = r3
            r19 = r4
            double r3 = r17 * r1
            float r15 = (float) r3
            r10 = r0
            r10.g(r11, r12, r13, r14, r15)
            r5.c(r0)
            n.b r0 = r49.m()
            double r3 = java.lang.Math.cos(r6)
            double r3 = r3 * r1
            float r13 = (float) r3
            r8 = r0
            r10 = r16
            r11 = r50
            r12 = r19
            r8.g(r9, r10, r11, r12, r13)
            r5.c(r0)
        L_0x06ae:
            r1 = 0
            r0 = r48
            r0.f3670k = r1
            r0.f3672l = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.d(n.d, boolean):void");
    }

    public boolean e() {
        return this.f3667i0 != 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x02dc  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x0391 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x040f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x04d8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:341:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(n.d r35, boolean r36, boolean r37, boolean r38, boolean r39, n.h r40, n.h r41, int r42, boolean r43, p.d r44, p.d r45, int r46, int r47, int r48, int r49, float r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, int r56, int r57, int r58, int r59, float r60, boolean r61) {
        /*
            r34 = this;
            r0 = r34
            r10 = r35
            r11 = r40
            r12 = r41
            r13 = r44
            r14 = r45
            r15 = r48
            r1 = r49
            r2 = r57
            r3 = r58
            r4 = r59
            p.d$a r5 = p.d.a.BOTTOM
            n.h r9 = r10.l(r13)
            n.h r8 = r10.l(r14)
            p.d r6 = r13.f3637f
            n.h r7 = r10.l(r6)
            p.d r6 = r14.f3637f
            n.h r6 = r10.l(r6)
            boolean r22 = r44.g()
            boolean r23 = r45.g()
            p.d r12 = r0.Q
            boolean r12 = r12.g()
            if (r23 == 0) goto L_0x003f
            int r16 = r22 + 1
            goto L_0x0041
        L_0x003f:
            r16 = r22
        L_0x0041:
            if (r12 == 0) goto L_0x0045
            int r16 = r16 + 1
        L_0x0045:
            r2 = r16
            if (r51 == 0) goto L_0x004b
            r14 = 3
            goto L_0x004d
        L_0x004b:
            r14 = r56
        L_0x004d:
            int r11 = n.g.a(r42)
            r24 = r6
            r6 = 1
            if (r11 == 0) goto L_0x0061
            if (r11 == r6) goto L_0x0061
            r6 = 2
            if (r11 == r6) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            r6 = 4
            if (r14 == r6) goto L_0x0061
            r11 = 1
            goto L_0x0062
        L_0x0061:
            r11 = 0
        L_0x0062:
            int r6 = r0.f3664h
            r16 = r11
            r11 = -1
            if (r6 == r11) goto L_0x0071
            if (r36 == 0) goto L_0x0071
            r0.f3664h = r11
            r47 = r6
            r16 = 0
        L_0x0071:
            int r6 = r0.f3666i
            if (r6 == r11) goto L_0x007c
            if (r36 != 0) goto L_0x007c
            r0.f3666i = r11
            r16 = 0
            goto L_0x007e
        L_0x007c:
            r6 = r47
        L_0x007e:
            int r11 = r0.f3667i0
            r47 = r6
            r6 = 8
            if (r11 != r6) goto L_0x008a
            r11 = 0
            r28 = 0
            goto L_0x008e
        L_0x008a:
            r11 = r47
            r28 = r16
        L_0x008e:
            if (r61 == 0) goto L_0x00ac
            if (r22 != 0) goto L_0x009c
            if (r23 != 0) goto L_0x009c
            if (r12 != 0) goto L_0x009c
            r6 = r46
            r10.e(r9, r6)
            goto L_0x00ac
        L_0x009c:
            if (r22 == 0) goto L_0x00ac
            if (r23 != 0) goto L_0x00ac
            int r6 = r44.d()
            r29 = r12
            r12 = 8
            r10.d(r9, r7, r6, r12)
            goto L_0x00b0
        L_0x00ac:
            r29 = r12
            r12 = 8
        L_0x00b0:
            if (r28 != 0) goto L_0x00d0
            r5 = 3
            if (r43 == 0) goto L_0x00c7
            r6 = 0
            r10.d(r8, r9, r6, r5)
            if (r15 <= 0) goto L_0x00be
            r10.f(r8, r9, r15, r12)
        L_0x00be:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r1 >= r6) goto L_0x00ca
            r10.g(r8, r9, r1, r12)
            goto L_0x00ca
        L_0x00c7:
            r10.d(r8, r9, r11, r12)
        L_0x00ca:
            r11 = r39
            r12 = r3
            r1 = 3
            goto L_0x0192
        L_0x00d0:
            r1 = 3
            r6 = 2
            if (r2 == r6) goto L_0x00f1
            if (r51 != 0) goto L_0x00f1
            r6 = 1
            if (r14 == r6) goto L_0x00db
            if (r14 != 0) goto L_0x00f1
        L_0x00db:
            int r5 = java.lang.Math.max(r3, r11)
            if (r4 <= 0) goto L_0x00e5
            int r5 = java.lang.Math.min(r4, r5)
        L_0x00e5:
            r6 = 8
            r10.d(r8, r9, r5, r6)
            r11 = r39
            r12 = r3
            r28 = 0
            goto L_0x0192
        L_0x00f1:
            r6 = -2
            if (r3 != r6) goto L_0x00f5
            r3 = r11
        L_0x00f5:
            if (r4 != r6) goto L_0x00f8
            r4 = r11
        L_0x00f8:
            if (r11 <= 0) goto L_0x00fe
            r6 = 1
            if (r14 == r6) goto L_0x00fe
            r11 = 0
        L_0x00fe:
            if (r3 <= 0) goto L_0x0109
            r6 = 8
            r10.f(r8, r9, r3, r6)
            int r11 = java.lang.Math.max(r11, r3)
        L_0x0109:
            if (r4 <= 0) goto L_0x0122
            if (r37 == 0) goto L_0x0112
            r6 = 1
            if (r14 != r6) goto L_0x0112
            r6 = 0
            goto L_0x0113
        L_0x0112:
            r6 = 1
        L_0x0113:
            if (r6 == 0) goto L_0x011b
            r6 = 8
            r10.g(r8, r9, r4, r6)
            goto L_0x011d
        L_0x011b:
            r6 = 8
        L_0x011d:
            int r11 = java.lang.Math.min(r11, r4)
            goto L_0x0124
        L_0x0122:
            r6 = 8
        L_0x0124:
            r12 = 1
            if (r14 != r12) goto L_0x0138
            if (r37 == 0) goto L_0x012d
            r10.d(r8, r9, r11, r6)
            goto L_0x0134
        L_0x012d:
            r5 = 5
            r10.d(r8, r9, r11, r5)
            r10.g(r8, r9, r11, r6)
        L_0x0134:
            r11 = r39
            r12 = r3
            goto L_0x0192
        L_0x0138:
            r6 = 2
            if (r14 != r6) goto L_0x0190
            p.d$a r6 = r13.f3636e
            p.d$a r11 = p.d.a.TOP
            if (r6 == r11) goto L_0x0161
            if (r6 != r5) goto L_0x0144
            goto L_0x0161
        L_0x0144:
            p.e r5 = r0.V
            p.d$a r6 = p.d.a.LEFT
            p.d r5 = r5.i(r6)
            n.h r5 = r10.l(r5)
            p.e r6 = r0.V
            p.d$a r11 = p.d.a.RIGHT
            p.d r6 = r6.i(r11)
            n.h r6 = r10.l(r6)
            r20 = r5
            r19 = r6
            goto L_0x0179
        L_0x0161:
            p.e r6 = r0.V
            p.d r6 = r6.i(r11)
            n.h r6 = r10.l(r6)
            p.e r11 = r0.V
            p.d r5 = r11.i(r5)
            n.h r5 = r10.l(r5)
            r19 = r5
            r20 = r6
        L_0x0179:
            n.b r5 = r35.m()
            r16 = r5
            r17 = r8
            r18 = r9
            r21 = r60
            r16.d(r17, r18, r19, r20, r21)
            r10.c(r5)
            if (r37 == 0) goto L_0x0134
            r28 = 0
            goto L_0x0134
        L_0x0190:
            r12 = r3
            r11 = 1
        L_0x0192:
            if (r61 == 0) goto L_0x04ec
            if (r53 == 0) goto L_0x01a7
            r3 = r41
            r4 = r2
            r7 = r8
            r5 = r9
            r39 = r11
            r1 = 0
            r6 = 2
            r12 = 8
            r25 = 1
            r2 = r40
            goto L_0x04fb
        L_0x01a7:
            if (r22 != 0) goto L_0x01b6
            if (r23 != 0) goto L_0x01b6
            if (r29 != 0) goto L_0x01b6
            r7 = r8
            r39 = r11
            r2 = r24
        L_0x01b2:
            r1 = 0
            r3 = 5
            goto L_0x04d3
        L_0x01b6:
            if (r22 == 0) goto L_0x01d2
            if (r23 != 0) goto L_0x01d2
            p.d r1 = r13.f3637f
            p.e r1 = r1.f3635d
            if (r37 == 0) goto L_0x01c7
            boolean r1 = r1 instanceof p.a
            if (r1 == 0) goto L_0x01c7
            r6 = 8
            goto L_0x01c8
        L_0x01c7:
            r6 = 5
        L_0x01c8:
            r20 = r37
            r7 = r8
            r39 = r11
            r2 = r24
            r1 = 0
            goto L_0x04d6
        L_0x01d2:
            if (r22 != 0) goto L_0x01ed
            if (r23 == 0) goto L_0x01ed
            int r1 = r45.d()
            int r1 = -r1
            r6 = r24
            r2 = 8
            r10.d(r8, r6, r1, r2)
            if (r37 == 0) goto L_0x04cd
            r3 = r40
            r1 = 5
            r5 = 0
            r10.f(r9, r3, r5, r1)
            goto L_0x04cd
        L_0x01ed:
            r3 = r40
            r6 = r24
            r5 = 0
            if (r22 == 0) goto L_0x04cd
            if (r23 == 0) goto L_0x04cd
            p.d r2 = r13.f3637f
            p.e r2 = r2.f3635d
            r1 = r45
            r13 = 3
            p.d r5 = r1.f3637f
            p.e r5 = r5.f3635d
            p.e r13 = r0.V
            r16 = 6
            if (r28 == 0) goto L_0x033b
            if (r14 != 0) goto L_0x026a
            if (r4 != 0) goto L_0x0234
            if (r12 != 0) goto L_0x0234
            boolean r4 = r7.f3475g
            if (r4 == 0) goto L_0x0227
            boolean r4 = r6.f3475g
            if (r4 == 0) goto L_0x0227
            int r2 = r44.d()
            r4 = 8
            r10.d(r9, r7, r2, r4)
            int r1 = r45.d()
            int r1 = -r1
            r10.d(r8, r6, r1, r4)
            return
        L_0x0227:
            r4 = 8
            r17 = 8
            r18 = 8
            r19 = 1
            r20 = 0
            r21 = 0
            goto L_0x0240
        L_0x0234:
            r4 = 8
            r17 = 5
            r18 = 5
            r19 = 0
            r20 = 1
            r21 = 1
        L_0x0240:
            boolean r4 = r2 instanceof p.a
            if (r4 != 0) goto L_0x0258
            boolean r4 = r5 instanceof p.a
            if (r4 == 0) goto L_0x0249
            goto L_0x0258
        L_0x0249:
            r23 = r18
            r26 = r20
            r4 = 5
            r15 = 1
            r22 = 6
            r18 = r14
            r20 = r17
            r17 = 8
            goto L_0x02a3
        L_0x0258:
            r18 = r14
            r26 = r20
            r4 = 5
            r15 = 1
            r22 = 6
            r23 = 4
            r14 = r41
            r20 = r17
            r17 = 8
            goto L_0x038f
        L_0x026a:
            r15 = 2
            r17 = 8
            if (r14 != r15) goto L_0x0290
            boolean r4 = r2 instanceof p.a
            if (r4 != 0) goto L_0x0287
            boolean r4 = r5 instanceof p.a
            if (r4 == 0) goto L_0x0278
            goto L_0x0287
        L_0x0278:
            r18 = r14
            r4 = 5
            r15 = 1
            r19 = 0
            r20 = 5
            r21 = 1
            r22 = 6
            r23 = 5
            goto L_0x02a1
        L_0x0287:
            r18 = r14
            r4 = 5
            r15 = 1
            r19 = 0
            r20 = 5
            goto L_0x029b
        L_0x0290:
            r15 = 1
            if (r14 != r15) goto L_0x02a7
            r18 = r14
            r4 = 5
            r15 = 1
            r19 = 0
            r20 = 8
        L_0x029b:
            r21 = 1
            r22 = 6
            r23 = 4
        L_0x02a1:
            r26 = 1
        L_0x02a3:
            r14 = r41
            goto L_0x038f
        L_0x02a7:
            r15 = 3
            if (r14 != r15) goto L_0x0328
            int r15 = r0.A
            r18 = r14
            r14 = -1
            if (r15 != r14) goto L_0x02cb
            r14 = r41
            r4 = 5
            r15 = 1
            r19 = 1
            r20 = 8
            r21 = 1
            if (r54 == 0) goto L_0x02c5
            if (r37 == 0) goto L_0x02c2
            r22 = 5
            goto L_0x02c7
        L_0x02c2:
            r22 = 4
            goto L_0x02c7
        L_0x02c5:
            r22 = 8
        L_0x02c7:
            r23 = 5
            goto L_0x038d
        L_0x02cb:
            if (r51 == 0) goto L_0x02ee
            r14 = r57
            r15 = 2
            if (r14 == r15) goto L_0x02d8
            r15 = 1
            if (r14 != r15) goto L_0x02d6
            goto L_0x02d9
        L_0x02d6:
            r4 = 0
            goto L_0x02da
        L_0x02d8:
            r15 = 1
        L_0x02d9:
            r4 = 1
        L_0x02da:
            if (r4 != 0) goto L_0x02e0
            r4 = 8
            r14 = 5
            goto L_0x02e2
        L_0x02e0:
            r4 = 5
            r14 = 4
        L_0x02e2:
            r20 = r4
            r23 = r14
            r4 = 5
            r19 = 1
            r21 = 1
            r22 = 6
            goto L_0x02a1
        L_0x02ee:
            r15 = 1
            if (r4 <= 0) goto L_0x02fd
            r14 = r41
            r4 = 5
            r19 = 1
            r20 = 5
            r21 = 1
            r22 = 6
            goto L_0x02c7
        L_0x02fd:
            if (r4 != 0) goto L_0x0322
            if (r12 != 0) goto L_0x0322
            if (r54 != 0) goto L_0x0312
            r14 = r41
            r4 = 5
            r19 = 1
            r20 = 5
            r21 = 1
            r22 = 6
            r23 = 8
            goto L_0x038d
        L_0x0312:
            if (r2 == r13) goto L_0x0318
            if (r5 == r13) goto L_0x0318
            r4 = 4
            goto L_0x0319
        L_0x0318:
            r4 = 5
        L_0x0319:
            r14 = r41
            r20 = r4
            r4 = 5
            r19 = 1
            goto L_0x0387
        L_0x0322:
            r14 = r41
            r4 = 5
            r19 = 1
            goto L_0x0385
        L_0x0328:
            r18 = r14
            r15 = 1
            r14 = r41
            r4 = 5
            r19 = 0
            r20 = 5
            r21 = 0
            r22 = 6
            r23 = 4
            r26 = 0
            goto L_0x038f
        L_0x033b:
            r18 = r14
            r15 = 1
            r17 = 8
            boolean r4 = r7.f3475g
            if (r4 == 0) goto L_0x0380
            boolean r4 = r6.f3475g
            if (r4 == 0) goto L_0x0380
            int r2 = r44.d()
            int r3 = r45.d()
            r4 = 8
            r51 = r35
            r52 = r9
            r53 = r7
            r54 = r2
            r55 = r50
            r56 = r6
            r57 = r8
            r58 = r3
            r59 = r4
            r51.b(r52, r53, r54, r55, r56, r57, r58, r59)
            if (r37 == 0) goto L_0x037f
            if (r11 == 0) goto L_0x037f
            p.d r2 = r1.f3637f
            if (r2 == 0) goto L_0x0376
            int r1 = r45.d()
            r14 = r41
            goto L_0x0379
        L_0x0376:
            r14 = r41
            r1 = 0
        L_0x0379:
            if (r6 == r14) goto L_0x037f
            r4 = 5
            r10.f(r14, r8, r1, r4)
        L_0x037f:
            return
        L_0x0380:
            r14 = r41
            r4 = 5
            r19 = 0
        L_0x0385:
            r20 = 5
        L_0x0387:
            r21 = 1
            r22 = 6
            r23 = 4
        L_0x038d:
            r26 = 1
        L_0x038f:
            if (r26 == 0) goto L_0x039a
            if (r7 != r6) goto L_0x039a
            if (r2 == r13) goto L_0x039a
            r24 = 0
            r26 = 0
            goto L_0x039c
        L_0x039a:
            r24 = 1
        L_0x039c:
            if (r21 == 0) goto L_0x03ea
            if (r28 != 0) goto L_0x03b1
            if (r52 != 0) goto L_0x03b1
            if (r54 != 0) goto L_0x03b1
            if (r7 != r3) goto L_0x03b1
            if (r6 != r14) goto L_0x03b1
            r20 = 0
            r21 = 8
            r22 = 8
            r24 = 0
            goto L_0x03b5
        L_0x03b1:
            r21 = r20
            r20 = r37
        L_0x03b5:
            int r27 = r44.d()
            int r29 = r45.d()
            r15 = r1
            r1 = r35
            r14 = r2
            r2 = r9
            r15 = r3
            r3 = r7
            r30 = 5
            r4 = r27
            r39 = r11
            r25 = 0
            r11 = r5
            r5 = r50
            r36 = r6
            r42 = r12
            r12 = 8
            r17 = 4
            r25 = 1
            r31 = r7
            r7 = r8
            r32 = r8
            r8 = r29
            r33 = r9
            r9 = r22
            r1.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = r24
            goto L_0x0405
        L_0x03ea:
            r14 = r2
            r15 = r3
            r36 = r6
            r31 = r7
            r32 = r8
            r33 = r9
            r39 = r11
            r42 = r12
            r12 = 8
            r17 = 4
            r25 = 1
            r11 = r5
            r21 = r20
            r6 = r24
            r20 = r37
        L_0x0405:
            int r1 = r0.f3667i0
            if (r1 != r12) goto L_0x0410
            boolean r1 = r45.f()
            if (r1 != 0) goto L_0x0410
            return
        L_0x0410:
            r2 = r36
            r1 = r31
            if (r26 == 0) goto L_0x043e
            if (r20 == 0) goto L_0x0426
            if (r1 == r2) goto L_0x0426
            if (r28 != 0) goto L_0x0426
            boolean r3 = r14 instanceof p.a
            if (r3 != 0) goto L_0x0424
            boolean r3 = r11 instanceof p.a
            if (r3 == 0) goto L_0x0426
        L_0x0424:
            r3 = 6
            goto L_0x0428
        L_0x0426:
            r3 = r21
        L_0x0428:
            int r4 = r44.d()
            r5 = r33
            r10.f(r5, r1, r4, r3)
            int r4 = r45.d()
            int r4 = -r4
            r7 = r32
            r10.g(r7, r2, r4, r3)
            r21 = r3
            goto L_0x0442
        L_0x043e:
            r7 = r32
            r5 = r33
        L_0x0442:
            if (r20 == 0) goto L_0x0454
            if (r55 == 0) goto L_0x0454
            boolean r3 = r14 instanceof p.a
            if (r3 != 0) goto L_0x0454
            boolean r3 = r11 instanceof p.a
            if (r3 != 0) goto L_0x0454
            if (r11 == r13) goto L_0x0454
            r3 = 6
            r4 = 6
            r6 = 1
            goto L_0x0458
        L_0x0454:
            r3 = r21
            r4 = r23
        L_0x0458:
            if (r6 == 0) goto L_0x04a0
            if (r19 == 0) goto L_0x0481
            if (r54 == 0) goto L_0x0460
            if (r38 == 0) goto L_0x0481
        L_0x0460:
            if (r14 == r13) goto L_0x0467
            if (r11 != r13) goto L_0x0465
            goto L_0x0467
        L_0x0465:
            r6 = r4
            goto L_0x0468
        L_0x0467:
            r6 = 6
        L_0x0468:
            boolean r8 = r14 instanceof p.g
            if (r8 != 0) goto L_0x0470
            boolean r8 = r11 instanceof p.g
            if (r8 == 0) goto L_0x0471
        L_0x0470:
            r6 = 5
        L_0x0471:
            boolean r8 = r14 instanceof p.a
            if (r8 != 0) goto L_0x0479
            boolean r8 = r11 instanceof p.a
            if (r8 == 0) goto L_0x047a
        L_0x0479:
            r6 = 5
        L_0x047a:
            if (r54 == 0) goto L_0x047d
            r6 = 5
        L_0x047d:
            int r4 = java.lang.Math.max(r6, r4)
        L_0x0481:
            r6 = r4
            if (r20 == 0) goto L_0x0491
            int r6 = java.lang.Math.min(r3, r6)
            if (r51 == 0) goto L_0x0491
            if (r54 != 0) goto L_0x0491
            if (r14 == r13) goto L_0x0490
            if (r11 != r13) goto L_0x0491
        L_0x0490:
            r6 = 4
        L_0x0491:
            int r3 = r44.d()
            r10.d(r5, r1, r3, r6)
            int r3 = r45.d()
            int r3 = -r3
            r10.d(r7, r2, r3, r6)
        L_0x04a0:
            if (r20 == 0) goto L_0x04b0
            if (r15 != r1) goto L_0x04a9
            int r6 = r44.d()
            goto L_0x04aa
        L_0x04a9:
            r6 = 0
        L_0x04aa:
            if (r1 == r15) goto L_0x04b0
            r1 = 5
            r10.f(r5, r15, r6, r1)
        L_0x04b0:
            if (r20 == 0) goto L_0x04ca
            if (r28 == 0) goto L_0x04ca
            if (r48 != 0) goto L_0x04ca
            if (r42 != 0) goto L_0x04ca
            if (r28 == 0) goto L_0x04c4
            r14 = r18
            r1 = 3
            if (r14 != r1) goto L_0x04c4
            r1 = 0
            r10.f(r7, r5, r1, r12)
            goto L_0x04cb
        L_0x04c4:
            r1 = 0
            r3 = 5
            r10.f(r7, r5, r1, r3)
            goto L_0x04d5
        L_0x04ca:
            r1 = 0
        L_0x04cb:
            r3 = 5
            goto L_0x04d5
        L_0x04cd:
            r2 = r6
            r7 = r8
            r39 = r11
            goto L_0x01b2
        L_0x04d3:
            r20 = r37
        L_0x04d5:
            r6 = 5
        L_0x04d6:
            if (r20 == 0) goto L_0x04eb
            if (r39 == 0) goto L_0x04eb
            r3 = r45
            p.d r4 = r3.f3637f
            if (r4 == 0) goto L_0x04e4
            int r1 = r45.d()
        L_0x04e4:
            r3 = r41
            if (r2 == r3) goto L_0x04eb
            r10.f(r3, r7, r1, r6)
        L_0x04eb:
            return
        L_0x04ec:
            r3 = r41
            r4 = r2
            r7 = r8
            r5 = r9
            r39 = r11
            r1 = 0
            r12 = 8
            r25 = 1
            r2 = r40
            r6 = 2
        L_0x04fb:
            if (r4 >= r6) goto L_0x0534
            if (r37 == 0) goto L_0x0534
            if (r39 == 0) goto L_0x0534
            r10.f(r5, r2, r1, r12)
            if (r36 != 0) goto L_0x050f
            p.d r2 = r0.N
            p.d r2 = r2.f3637f
            if (r2 != 0) goto L_0x050d
            goto L_0x050f
        L_0x050d:
            r6 = 0
            goto L_0x0510
        L_0x050f:
            r6 = 1
        L_0x0510:
            if (r36 != 0) goto L_0x052f
            p.d r2 = r0.N
            p.d r2 = r2.f3637f
            if (r2 == 0) goto L_0x052f
            p.e r2 = r2.f3635d
            float r4 = r2.Y
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x052e
            int[] r2 = r2.U
            r4 = r2[r1]
            r5 = 3
            if (r4 != r5) goto L_0x052e
            r2 = r2[r25]
            if (r2 != r5) goto L_0x052e
            r6 = 1
            goto L_0x052f
        L_0x052e:
            r6 = 0
        L_0x052f:
            if (r6 == 0) goto L_0x0534
            r10.f(r3, r7, r1, r12)
        L_0x0534:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.f(n.d, boolean, boolean, boolean, boolean, n.h, n.h, int, boolean, p.d, p.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void g(n.d dVar) {
        dVar.l(this.J);
        dVar.l(this.K);
        dVar.l(this.L);
        dVar.l(this.M);
        if (this.f3655c0 > 0) {
            dVar.l(this.N);
        }
    }

    public void h() {
        if (this.f3656d == null) {
            this.f3656d = new m(this);
        }
        if (this.f3658e == null) {
            this.f3658e = new o(this);
        }
    }

    public d i(d.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.J;
            case 2:
                return this.K;
            case 3:
                return this.L;
            case 4:
                return this.M;
            case 5:
                return this.N;
            case 6:
                return this.Q;
            case 7:
                return this.O;
            case 8:
                return this.P;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public int j() {
        return w() + this.X;
    }

    public int k(int i2) {
        if (i2 == 0) {
            return m();
        }
        if (i2 == 1) {
            return t();
        }
        return 0;
    }

    public int l() {
        if (this.f3667i0 == 8) {
            return 0;
        }
        return this.X;
    }

    public int m() {
        return this.U[0];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.M;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p.e n(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            p.d r3 = r2.L
            p.d r0 = r3.f3637f
            if (r0 == 0) goto L_0x001f
            p.d r1 = r0.f3637f
            if (r1 != r3) goto L_0x001f
            p.e r3 = r0.f3635d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            p.d r3 = r2.M
            p.d r0 = r3.f3637f
            if (r0 == 0) goto L_0x001f
            p.d r1 = r0.f3637f
            if (r1 != r3) goto L_0x001f
            p.e r3 = r0.f3635d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.n(int):p.e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        r3 = r2.K;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p.e o(int r3) {
        /*
            r2 = this;
            if (r3 != 0) goto L_0x000f
            p.d r3 = r2.J
            p.d r0 = r3.f3637f
            if (r0 == 0) goto L_0x001f
            p.d r1 = r0.f3637f
            if (r1 != r3) goto L_0x001f
            p.e r3 = r0.f3635d
            return r3
        L_0x000f:
            r0 = 1
            if (r3 != r0) goto L_0x001f
            p.d r3 = r2.K
            p.d r0 = r3.f3637f
            if (r0 == 0) goto L_0x001f
            p.d r1 = r0.f3637f
            if (r1 != r3) goto L_0x001f
            p.e r3 = r0.f3635d
            return r3
        L_0x001f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.e.o(int):p.e");
    }

    public int p() {
        return v() + this.W;
    }

    public void q(StringBuilder sb) {
        StringBuilder a2 = a.a("  ");
        a2.append(this.f3668j);
        a2.append(":{\n");
        sb.append(a2.toString());
        sb.append("    actualWidth:" + this.W);
        sb.append("\n");
        sb.append("    actualHeight:" + this.X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f3651a0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f3653b0);
        sb.append("\n");
        s(sb, "left", this.J);
        s(sb, "top", this.K);
        s(sb, "right", this.L);
        s(sb, "bottom", this.M);
        s(sb, "baseline", this.N);
        s(sb, "centerX", this.O);
        s(sb, "centerY", this.P);
        int i2 = this.W;
        int i3 = this.f3657d0;
        int i4 = this.C[0];
        int i5 = this.f3687u;
        int i6 = this.f3684r;
        float f2 = this.f3689w;
        float f3 = this.f3675m0[0];
        r(sb, "    width", i2, i3, i4, i5, i6, f2);
        int i7 = this.X;
        int i8 = this.f3659e0;
        int i9 = this.C[1];
        int i10 = this.f3690x;
        int i11 = this.f3685s;
        float f4 = this.f3692z;
        float f5 = this.f3675m0[1];
        r(sb, "    height", i7, i8, i9, i10, i11, f4);
        float f6 = this.Y;
        int i12 = this.Z;
        if (f6 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f6);
            sb.append(",");
            sb.append(i12);
            sb.append("");
            sb.append("],\n");
        }
        I(sb, "    horizontalBias", this.f3661f0, 0.5f);
        I(sb, "    verticalBias", this.f3663g0, 0.5f);
        J(sb, "    horizontalChainStyle", this.f3671k0, 0);
        J(sb, "    verticalChainStyle", this.f3673l0, 0);
        sb.append("  }");
    }

    public final void r(StringBuilder sb, String str, int i2, int i3, int i4, int i5, int i6, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        J(sb, "      size", i2, 0);
        J(sb, "      min", i3, 0);
        J(sb, "      max", i4, Integer.MAX_VALUE);
        J(sb, "      matchMin", i5, 0);
        J(sb, "      matchDef", i6, 0);
        I(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    public final void s(StringBuilder sb, String str, d dVar) {
        if (dVar.f3637f != null) {
            sb.append("    ");
            sb.append(str);
            sb.append(" : [ '");
            sb.append(dVar.f3637f);
            sb.append("'");
            if (!(dVar.f3639h == Integer.MIN_VALUE && dVar.f3638g == 0)) {
                sb.append(",");
                sb.append(dVar.f3638g);
                if (dVar.f3639h != Integer.MIN_VALUE) {
                    sb.append(",");
                    sb.append(dVar.f3639h);
                    sb.append(",");
                }
            }
            sb.append(" ] ,\n");
        }
    }

    public int t() {
        return this.U[1];
    }

    public String toString() {
        String str = "";
        StringBuilder a2 = a.a(str);
        if (this.f3669j0 != null) {
            StringBuilder a3 = a.a("id: ");
            a3.append(this.f3669j0);
            a3.append(" ");
            str = a3.toString();
        }
        a2.append(str);
        a2.append("(");
        a2.append(this.f3651a0);
        a2.append(", ");
        a2.append(this.f3653b0);
        a2.append(") - (");
        a2.append(this.W);
        a2.append(" x ");
        a2.append(this.X);
        a2.append(")");
        return a2.toString();
    }

    public int u() {
        if (this.f3667i0 == 8) {
            return 0;
        }
        return this.W;
    }

    public int v() {
        e eVar = this.V;
        return (eVar == null || !(eVar instanceof f)) ? this.f3651a0 : ((f) eVar).f3699y0 + this.f3651a0;
    }

    public int w() {
        e eVar = this.V;
        return (eVar == null || !(eVar instanceof f)) ? this.f3653b0 : ((f) eVar).f3700z0 + this.f3653b0;
    }

    public boolean x(int i2) {
        if (i2 == 0) {
            return (this.J.f3637f != null ? 1 : 0) + (this.L.f3637f != null ? 1 : 0) < 2;
        }
        return ((this.K.f3637f != null ? 1 : 0) + (this.M.f3637f != null ? 1 : 0)) + (this.N.f3637f != null ? 1 : 0) < 2;
    }

    public boolean y(int i2, int i3) {
        d dVar;
        d dVar2;
        if (i2 == 0) {
            d dVar3 = this.J.f3637f;
            if (dVar3 != null && dVar3.f3634c && (dVar2 = this.L.f3637f) != null && dVar2.f3634c) {
                if ((dVar2.c() - this.L.d()) - (this.J.d() + this.J.f3637f.c()) >= i3) {
                    return true;
                }
                return false;
            }
        } else {
            d dVar4 = this.K.f3637f;
            if (dVar4 != null && dVar4.f3634c && (dVar = this.M.f3637f) != null && dVar.f3634c) {
                if ((dVar.c() - this.M.d()) - (this.K.d() + this.K.f3637f.c()) >= i3) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final boolean z(int i2) {
        int i3 = i2 * 2;
        d[] dVarArr = this.R;
        if (!(dVarArr[i3].f3637f == null || dVarArr[i3].f3637f.f3637f == dVarArr[i3])) {
            int i4 = i3 + 1;
            return dVarArr[i4].f3637f != null && dVarArr[i4].f3637f.f3637f == dVarArr[i4];
        }
    }
}
