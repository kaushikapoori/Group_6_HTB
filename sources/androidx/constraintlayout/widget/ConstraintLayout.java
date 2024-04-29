package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p.d;
import p.e;
import p.g;
import q.b;
import s.c;
import s.f;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: s  reason: collision with root package name */
    public static f f837s;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<View> f838b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<a> f839c = new ArrayList<>(4);

    /* renamed from: d  reason: collision with root package name */
    public p.f f840d = new p.f();

    /* renamed from: e  reason: collision with root package name */
    public int f841e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f842f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f843g = Integer.MAX_VALUE;

    /* renamed from: h  reason: collision with root package name */
    public int f844h = Integer.MAX_VALUE;

    /* renamed from: i  reason: collision with root package name */
    public boolean f845i = true;

    /* renamed from: j  reason: collision with root package name */
    public int f846j = 257;

    /* renamed from: k  reason: collision with root package name */
    public b f847k = null;

    /* renamed from: l  reason: collision with root package name */
    public s.b f848l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f849m = -1;

    /* renamed from: n  reason: collision with root package name */
    public HashMap<String, Integer> f850n = new HashMap<>();

    /* renamed from: o  reason: collision with root package name */
    public SparseArray<e> f851o = new SparseArray<>();

    /* renamed from: p  reason: collision with root package name */
    public b f852p = new b(this);

    /* renamed from: q  reason: collision with root package name */
    public int f853q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f854r = 0;

    public static class a extends ViewGroup.MarginLayoutParams {
        public int A = Integer.MIN_VALUE;
        public int B = Integer.MIN_VALUE;
        public int C = Integer.MIN_VALUE;
        public int D = 0;
        public float E = 0.5f;
        public float F = 0.5f;
        public String G = null;
        public float H = -1.0f;
        public float I = -1.0f;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = 0;
        public int P = 0;
        public int Q = 0;
        public float R = 1.0f;
        public float S = 1.0f;
        public int T = -1;
        public int U = -1;
        public int V = -1;
        public boolean W = false;
        public boolean X = false;
        public String Y = null;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public int f855a = -1;

        /* renamed from: a0  reason: collision with root package name */
        public boolean f856a0 = true;

        /* renamed from: b  reason: collision with root package name */
        public int f857b = -1;

        /* renamed from: b0  reason: collision with root package name */
        public boolean f858b0 = true;

        /* renamed from: c  reason: collision with root package name */
        public float f859c = -1.0f;

        /* renamed from: c0  reason: collision with root package name */
        public boolean f860c0 = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f861d = true;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f862d0 = false;

        /* renamed from: e  reason: collision with root package name */
        public int f863e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public boolean f864e0 = false;

        /* renamed from: f  reason: collision with root package name */
        public int f865f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public boolean f866f0 = false;

        /* renamed from: g  reason: collision with root package name */
        public int f867g = -1;

        /* renamed from: g0  reason: collision with root package name */
        public int f868g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f869h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public int f870h0 = -1;

        /* renamed from: i  reason: collision with root package name */
        public int f871i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f872i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f873j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int f874j0 = -1;

        /* renamed from: k  reason: collision with root package name */
        public int f875k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public int f876k0 = Integer.MIN_VALUE;

        /* renamed from: l  reason: collision with root package name */
        public int f877l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public int f878l0 = Integer.MIN_VALUE;

        /* renamed from: m  reason: collision with root package name */
        public int f879m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public float f880m0 = 0.5f;

        /* renamed from: n  reason: collision with root package name */
        public int f881n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public int f882n0;

        /* renamed from: o  reason: collision with root package name */
        public int f883o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public int f884o0;

        /* renamed from: p  reason: collision with root package name */
        public int f885p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public float f886p0;

        /* renamed from: q  reason: collision with root package name */
        public int f887q = 0;

        /* renamed from: q0  reason: collision with root package name */
        public e f888q0 = new e();

        /* renamed from: r  reason: collision with root package name */
        public float f889r = 0.0f;

        /* renamed from: s  reason: collision with root package name */
        public int f890s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f891t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f892u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f893v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f894w = Integer.MIN_VALUE;

        /* renamed from: x  reason: collision with root package name */
        public int f895x = Integer.MIN_VALUE;

        /* renamed from: y  reason: collision with root package name */
        public int f896y = Integer.MIN_VALUE;

        /* renamed from: z  reason: collision with root package name */
        public int f897z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a  reason: collision with other inner class name */
        public static class C0003a {

            /* renamed from: a  reason: collision with root package name */
            public static final SparseIntArray f898a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f898a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public a(int i2, int i3) {
            super(i2, i3);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x014e, code lost:
            android.util.Log.e("ConstraintLayout", r5);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.content.Context r10, android.util.AttributeSet r11) {
            /*
                r9 = this;
                r9.<init>(r10, r11)
                r0 = -1
                r9.f855a = r0
                r9.f857b = r0
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r9.f859c = r1
                r2 = 1
                r9.f861d = r2
                r9.f863e = r0
                r9.f865f = r0
                r9.f867g = r0
                r9.f869h = r0
                r9.f871i = r0
                r9.f873j = r0
                r9.f875k = r0
                r9.f877l = r0
                r9.f879m = r0
                r9.f881n = r0
                r9.f883o = r0
                r9.f885p = r0
                r3 = 0
                r9.f887q = r3
                r4 = 0
                r9.f889r = r4
                r9.f890s = r0
                r9.f891t = r0
                r9.f892u = r0
                r9.f893v = r0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r9.f894w = r5
                r9.f895x = r5
                r9.f896y = r5
                r9.f897z = r5
                r9.A = r5
                r9.B = r5
                r9.C = r5
                r9.D = r3
                r6 = 1056964608(0x3f000000, float:0.5)
                r9.E = r6
                r9.F = r6
                r7 = 0
                r9.G = r7
                r9.H = r1
                r9.I = r1
                r9.J = r3
                r9.K = r3
                r9.L = r3
                r9.M = r3
                r9.N = r3
                r9.O = r3
                r9.P = r3
                r9.Q = r3
                r1 = 1065353216(0x3f800000, float:1.0)
                r9.R = r1
                r9.S = r1
                r9.T = r0
                r9.U = r0
                r9.V = r0
                r9.W = r3
                r9.X = r3
                r9.Y = r7
                r9.Z = r3
                r9.f856a0 = r2
                r9.f858b0 = r2
                r9.f860c0 = r3
                r9.f862d0 = r3
                r9.f864e0 = r3
                r9.f866f0 = r3
                r9.f868g0 = r0
                r9.f870h0 = r0
                r9.f872i0 = r0
                r9.f874j0 = r0
                r9.f876k0 = r5
                r9.f878l0 = r5
                r9.f880m0 = r6
                p.e r1 = new p.e
                r1.<init>()
                r9.f888q0 = r1
                int[] r1 = s.e.f3864b
                android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r1)
                int r11 = r10.getIndexCount()
                r1 = 0
            L_0x00a4:
                if (r1 >= r11) goto L_0x0392
                int r5 = r10.getIndex(r1)
                android.util.SparseIntArray r6 = androidx.constraintlayout.widget.ConstraintLayout.a.C0003a.f898a
                int r6 = r6.get(r5)
                r7 = 2
                r8 = -2
                switch(r6) {
                    case 1: goto L_0x02f3;
                    case 2: goto L_0x02e1;
                    case 3: goto L_0x02d7;
                    case 4: goto L_0x02c1;
                    case 5: goto L_0x02b7;
                    case 6: goto L_0x02ad;
                    case 7: goto L_0x02a3;
                    case 8: goto L_0x0291;
                    case 9: goto L_0x027f;
                    case 10: goto L_0x026d;
                    case 11: goto L_0x025b;
                    case 12: goto L_0x0249;
                    case 13: goto L_0x0237;
                    case 14: goto L_0x0225;
                    case 15: goto L_0x0213;
                    case 16: goto L_0x0201;
                    case 17: goto L_0x01ef;
                    case 18: goto L_0x01dd;
                    case 19: goto L_0x01cb;
                    case 20: goto L_0x01b9;
                    case 21: goto L_0x01af;
                    case 22: goto L_0x01a5;
                    case 23: goto L_0x019b;
                    case 24: goto L_0x0191;
                    case 25: goto L_0x0187;
                    case 26: goto L_0x017d;
                    case 27: goto L_0x0173;
                    case 28: goto L_0x0169;
                    case 29: goto L_0x015f;
                    case 30: goto L_0x0155;
                    case 31: goto L_0x0144;
                    case 32: goto L_0x0139;
                    case 33: goto L_0x0122;
                    case 34: goto L_0x010b;
                    case 35: goto L_0x00fb;
                    case 36: goto L_0x00e4;
                    case 37: goto L_0x00cd;
                    case 38: goto L_0x00bd;
                    default: goto L_0x00b5;
                }
            L_0x00b5:
                switch(r6) {
                    case 44: goto L_0x036d;
                    case 45: goto L_0x0364;
                    case 46: goto L_0x035b;
                    case 47: goto L_0x0354;
                    case 48: goto L_0x034d;
                    case 49: goto L_0x0344;
                    case 50: goto L_0x033b;
                    case 51: goto L_0x0334;
                    case 52: goto L_0x0323;
                    case 53: goto L_0x0311;
                    case 54: goto L_0x0307;
                    case 55: goto L_0x02fd;
                    default: goto L_0x00b8;
                }
            L_0x00b8:
                switch(r6) {
                    case 64: goto L_0x038b;
                    case 65: goto L_0x0387;
                    case 66: goto L_0x037e;
                    case 67: goto L_0x0375;
                    default: goto L_0x00bb;
                }
            L_0x00bb:
                goto L_0x038e
            L_0x00bd:
                float r6 = r9.S
                float r5 = r10.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r4, r5)
                r9.S = r5
                r9.M = r7
                goto L_0x038e
            L_0x00cd:
                int r6 = r9.Q     // Catch:{ Exception -> 0x00d7 }
                int r6 = r10.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x00d7 }
                r9.Q = r6     // Catch:{ Exception -> 0x00d7 }
                goto L_0x038e
            L_0x00d7:
                int r6 = r9.Q
                int r5 = r10.getInt(r5, r6)
                if (r5 != r8) goto L_0x038e
                r9.Q = r8
                goto L_0x038e
            L_0x00e4:
                int r6 = r9.O     // Catch:{ Exception -> 0x00ee }
                int r6 = r10.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x00ee }
                r9.O = r6     // Catch:{ Exception -> 0x00ee }
                goto L_0x038e
            L_0x00ee:
                int r6 = r9.O
                int r5 = r10.getInt(r5, r6)
                if (r5 != r8) goto L_0x038e
                r9.O = r8
                goto L_0x038e
            L_0x00fb:
                float r6 = r9.R
                float r5 = r10.getFloat(r5, r6)
                float r5 = java.lang.Math.max(r4, r5)
                r9.R = r5
                r9.L = r7
                goto L_0x038e
            L_0x010b:
                int r6 = r9.P     // Catch:{ Exception -> 0x0115 }
                int r6 = r10.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x0115 }
                r9.P = r6     // Catch:{ Exception -> 0x0115 }
                goto L_0x038e
            L_0x0115:
                int r6 = r9.P
                int r5 = r10.getInt(r5, r6)
                if (r5 != r8) goto L_0x038e
                r9.P = r8
                goto L_0x038e
            L_0x0122:
                int r6 = r9.N     // Catch:{ Exception -> 0x012c }
                int r6 = r10.getDimensionPixelSize(r5, r6)     // Catch:{ Exception -> 0x012c }
                r9.N = r6     // Catch:{ Exception -> 0x012c }
                goto L_0x038e
            L_0x012c:
                int r6 = r9.N
                int r5 = r10.getInt(r5, r6)
                if (r5 != r8) goto L_0x038e
                r9.N = r8
                goto L_0x038e
            L_0x0139:
                int r5 = r10.getInt(r5, r3)
                r9.M = r5
                if (r5 != r2) goto L_0x038e
                java.lang.String r5 = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead."
                goto L_0x014e
            L_0x0144:
                int r5 = r10.getInt(r5, r3)
                r9.L = r5
                if (r5 != r2) goto L_0x038e
                java.lang.String r5 = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead."
            L_0x014e:
                java.lang.String r6 = "ConstraintLayout"
                android.util.Log.e(r6, r5)
                goto L_0x038e
            L_0x0155:
                float r6 = r9.F
                float r5 = r10.getFloat(r5, r6)
                r9.F = r5
                goto L_0x038e
            L_0x015f:
                float r6 = r9.E
                float r5 = r10.getFloat(r5, r6)
                r9.E = r5
                goto L_0x038e
            L_0x0169:
                boolean r6 = r9.X
                boolean r5 = r10.getBoolean(r5, r6)
                r9.X = r5
                goto L_0x038e
            L_0x0173:
                boolean r6 = r9.W
                boolean r5 = r10.getBoolean(r5, r6)
                r9.W = r5
                goto L_0x038e
            L_0x017d:
                int r6 = r9.B
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.B = r5
                goto L_0x038e
            L_0x0187:
                int r6 = r9.A
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.A = r5
                goto L_0x038e
            L_0x0191:
                int r6 = r9.f897z
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f897z = r5
                goto L_0x038e
            L_0x019b:
                int r6 = r9.f896y
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f896y = r5
                goto L_0x038e
            L_0x01a5:
                int r6 = r9.f895x
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f895x = r5
                goto L_0x038e
            L_0x01af:
                int r6 = r9.f894w
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f894w = r5
                goto L_0x038e
            L_0x01b9:
                int r6 = r9.f893v
                int r6 = r10.getResourceId(r5, r6)
                r9.f893v = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f893v = r5
                goto L_0x038e
            L_0x01cb:
                int r6 = r9.f892u
                int r6 = r10.getResourceId(r5, r6)
                r9.f892u = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f892u = r5
                goto L_0x038e
            L_0x01dd:
                int r6 = r9.f891t
                int r6 = r10.getResourceId(r5, r6)
                r9.f891t = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f891t = r5
                goto L_0x038e
            L_0x01ef:
                int r6 = r9.f890s
                int r6 = r10.getResourceId(r5, r6)
                r9.f890s = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f890s = r5
                goto L_0x038e
            L_0x0201:
                int r6 = r9.f879m
                int r6 = r10.getResourceId(r5, r6)
                r9.f879m = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f879m = r5
                goto L_0x038e
            L_0x0213:
                int r6 = r9.f877l
                int r6 = r10.getResourceId(r5, r6)
                r9.f877l = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f877l = r5
                goto L_0x038e
            L_0x0225:
                int r6 = r9.f875k
                int r6 = r10.getResourceId(r5, r6)
                r9.f875k = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f875k = r5
                goto L_0x038e
            L_0x0237:
                int r6 = r9.f873j
                int r6 = r10.getResourceId(r5, r6)
                r9.f873j = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f873j = r5
                goto L_0x038e
            L_0x0249:
                int r6 = r9.f871i
                int r6 = r10.getResourceId(r5, r6)
                r9.f871i = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f871i = r5
                goto L_0x038e
            L_0x025b:
                int r6 = r9.f869h
                int r6 = r10.getResourceId(r5, r6)
                r9.f869h = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f869h = r5
                goto L_0x038e
            L_0x026d:
                int r6 = r9.f867g
                int r6 = r10.getResourceId(r5, r6)
                r9.f867g = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f867g = r5
                goto L_0x038e
            L_0x027f:
                int r6 = r9.f865f
                int r6 = r10.getResourceId(r5, r6)
                r9.f865f = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f865f = r5
                goto L_0x038e
            L_0x0291:
                int r6 = r9.f863e
                int r6 = r10.getResourceId(r5, r6)
                r9.f863e = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f863e = r5
                goto L_0x038e
            L_0x02a3:
                float r6 = r9.f859c
                float r5 = r10.getFloat(r5, r6)
                r9.f859c = r5
                goto L_0x038e
            L_0x02ad:
                int r6 = r9.f857b
                int r5 = r10.getDimensionPixelOffset(r5, r6)
                r9.f857b = r5
                goto L_0x038e
            L_0x02b7:
                int r6 = r9.f855a
                int r5 = r10.getDimensionPixelOffset(r5, r6)
                r9.f855a = r5
                goto L_0x038e
            L_0x02c1:
                float r6 = r9.f889r
                float r5 = r10.getFloat(r5, r6)
                r6 = 1135869952(0x43b40000, float:360.0)
                float r5 = r5 % r6
                r9.f889r = r5
                int r7 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r7 >= 0) goto L_0x038e
                float r5 = r6 - r5
                float r5 = r5 % r6
                r9.f889r = r5
                goto L_0x038e
            L_0x02d7:
                int r6 = r9.f887q
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.f887q = r5
                goto L_0x038e
            L_0x02e1:
                int r6 = r9.f885p
                int r6 = r10.getResourceId(r5, r6)
                r9.f885p = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f885p = r5
                goto L_0x038e
            L_0x02f3:
                int r6 = r9.V
                int r5 = r10.getInt(r5, r6)
                r9.V = r5
                goto L_0x038e
            L_0x02fd:
                int r6 = r9.C
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.C = r5
                goto L_0x038e
            L_0x0307:
                int r6 = r9.D
                int r5 = r10.getDimensionPixelSize(r5, r6)
                r9.D = r5
                goto L_0x038e
            L_0x0311:
                int r6 = r9.f883o
                int r6 = r10.getResourceId(r5, r6)
                r9.f883o = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f883o = r5
                goto L_0x038e
            L_0x0323:
                int r6 = r9.f881n
                int r6 = r10.getResourceId(r5, r6)
                r9.f881n = r6
                if (r6 != r0) goto L_0x038e
                int r5 = r10.getInt(r5, r0)
                r9.f881n = r5
                goto L_0x038e
            L_0x0334:
                java.lang.String r5 = r10.getString(r5)
                r9.Y = r5
                goto L_0x038e
            L_0x033b:
                int r6 = r9.U
                int r5 = r10.getDimensionPixelOffset(r5, r6)
                r9.U = r5
                goto L_0x038e
            L_0x0344:
                int r6 = r9.T
                int r5 = r10.getDimensionPixelOffset(r5, r6)
                r9.T = r5
                goto L_0x038e
            L_0x034d:
                int r5 = r10.getInt(r5, r3)
                r9.K = r5
                goto L_0x038e
            L_0x0354:
                int r5 = r10.getInt(r5, r3)
                r9.J = r5
                goto L_0x038e
            L_0x035b:
                float r6 = r9.I
                float r5 = r10.getFloat(r5, r6)
                r9.I = r5
                goto L_0x038e
            L_0x0364:
                float r6 = r9.H
                float r5 = r10.getFloat(r5, r6)
                r9.H = r5
                goto L_0x038e
            L_0x036d:
                java.lang.String r5 = r10.getString(r5)
                androidx.constraintlayout.widget.b.h(r9, r5)
                goto L_0x038e
            L_0x0375:
                boolean r6 = r9.f861d
                boolean r5 = r10.getBoolean(r5, r6)
                r9.f861d = r5
                goto L_0x038e
            L_0x037e:
                int r6 = r9.Z
                int r5 = r10.getInt(r5, r6)
                r9.Z = r5
                goto L_0x038e
            L_0x0387:
                androidx.constraintlayout.widget.b.g(r9, r10, r5, r2)
                goto L_0x038e
            L_0x038b:
                androidx.constraintlayout.widget.b.g(r9, r10, r5, r3)
            L_0x038e:
                int r1 = r1 + 1
                goto L_0x00a4
            L_0x0392:
                r10.recycle()
                r9.a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.<init>(android.content.Context, android.util.AttributeSet):void");
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public void a() {
            this.f862d0 = false;
            this.f856a0 = true;
            this.f858b0 = true;
            int i2 = this.width;
            if (i2 == -2 && this.W) {
                this.f856a0 = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            int i3 = this.height;
            if (i3 == -2 && this.X) {
                this.f858b0 = false;
                if (this.M == 0) {
                    this.M = 1;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f856a0 = false;
                if (i2 == 0 && this.L == 1) {
                    this.width = -2;
                    this.W = true;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.f858b0 = false;
                if (i3 == 0 && this.M == 1) {
                    this.height = -2;
                    this.X = true;
                }
            }
            if (this.f859c != -1.0f || this.f855a != -1 || this.f857b != -1) {
                this.f862d0 = true;
                this.f856a0 = true;
                this.f858b0 = true;
                if (!(this.f888q0 instanceof g)) {
                    this.f888q0 = new g();
                }
                ((g) this.f888q0).W(this.V);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d4, code lost:
            if (r1 > 0) goto L_0x00d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:0x00e3, code lost:
            if (r1 > 0) goto L_0x00d6;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0055  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x00ea  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x00f5  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = 1
                goto L_0x0012
            L_0x0011:
                r11 = 0
            L_0x0012:
                r4 = -1
                r10.f872i0 = r4
                r10.f874j0 = r4
                r10.f868g0 = r4
                r10.f870h0 = r4
                r10.f876k0 = r4
                r10.f878l0 = r4
                int r5 = r10.f894w
                r10.f876k0 = r5
                int r5 = r10.f896y
                r10.f878l0 = r5
                float r5 = r10.E
                r10.f880m0 = r5
                int r6 = r10.f855a
                r10.f882n0 = r6
                int r7 = r10.f857b
                r10.f884o0 = r7
                float r8 = r10.f859c
                r10.f886p0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0096
                int r11 = r10.f890s
                if (r11 == r4) goto L_0x0043
                r10.f872i0 = r11
            L_0x0041:
                r2 = 1
                goto L_0x004a
            L_0x0043:
                int r11 = r10.f891t
                if (r11 == r4) goto L_0x004a
                r10.f874j0 = r11
                goto L_0x0041
            L_0x004a:
                int r11 = r10.f892u
                if (r11 == r4) goto L_0x0051
                r10.f870h0 = r11
                r2 = 1
            L_0x0051:
                int r11 = r10.f893v
                if (r11 == r4) goto L_0x0058
                r10.f868g0 = r11
                r2 = 1
            L_0x0058:
                int r11 = r10.A
                if (r11 == r9) goto L_0x005e
                r10.f878l0 = r11
            L_0x005e:
                int r11 = r10.B
                if (r11 == r9) goto L_0x0064
                r10.f876k0 = r11
            L_0x0064:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x006c
                float r2 = r11 - r5
                r10.f880m0 = r2
            L_0x006c:
                boolean r2 = r10.f862d0
                if (r2 == 0) goto L_0x00ba
                int r2 = r10.V
                if (r2 != r3) goto L_0x00ba
                boolean r2 = r10.f861d
                if (r2 == 0) goto L_0x00ba
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0086
                float r11 = r11 - r8
                r10.f886p0 = r11
                r10.f882n0 = r4
                r10.f884o0 = r4
                goto L_0x00ba
            L_0x0086:
                if (r6 == r4) goto L_0x008f
                r10.f884o0 = r6
                r10.f882n0 = r4
            L_0x008c:
                r10.f886p0 = r2
                goto L_0x00ba
            L_0x008f:
                if (r7 == r4) goto L_0x00ba
                r10.f882n0 = r7
                r10.f884o0 = r4
                goto L_0x008c
            L_0x0096:
                int r11 = r10.f890s
                if (r11 == r4) goto L_0x009c
                r10.f870h0 = r11
            L_0x009c:
                int r11 = r10.f891t
                if (r11 == r4) goto L_0x00a2
                r10.f868g0 = r11
            L_0x00a2:
                int r11 = r10.f892u
                if (r11 == r4) goto L_0x00a8
                r10.f872i0 = r11
            L_0x00a8:
                int r11 = r10.f893v
                if (r11 == r4) goto L_0x00ae
                r10.f874j0 = r11
            L_0x00ae:
                int r11 = r10.A
                if (r11 == r9) goto L_0x00b4
                r10.f876k0 = r11
            L_0x00b4:
                int r11 = r10.B
                if (r11 == r9) goto L_0x00ba
                r10.f878l0 = r11
            L_0x00ba:
                int r11 = r10.f892u
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f893v
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f891t
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f890s
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f867g
                if (r11 == r4) goto L_0x00d9
                r10.f872i0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e6
                if (r1 <= 0) goto L_0x00e6
            L_0x00d6:
                r10.rightMargin = r1
                goto L_0x00e6
            L_0x00d9:
                int r11 = r10.f869h
                if (r11 == r4) goto L_0x00e6
                r10.f874j0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e6
                if (r1 <= 0) goto L_0x00e6
                goto L_0x00d6
            L_0x00e6:
                int r11 = r10.f863e
                if (r11 == r4) goto L_0x00f5
                r10.f868g0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
            L_0x00f2:
                r10.leftMargin = r0
                goto L_0x0102
            L_0x00f5:
                int r11 = r10.f865f
                if (r11 == r4) goto L_0x0102
                r10.f870h0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                goto L_0x00f2
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.a.resolveLayoutDirection(int):void");
        }
    }

    public class b implements b.C0046b {

        /* renamed from: a  reason: collision with root package name */
        public ConstraintLayout f899a;

        /* renamed from: b  reason: collision with root package name */
        public int f900b;

        /* renamed from: c  reason: collision with root package name */
        public int f901c;

        /* renamed from: d  reason: collision with root package name */
        public int f902d;

        /* renamed from: e  reason: collision with root package name */
        public int f903e;

        /* renamed from: f  reason: collision with root package name */
        public int f904f;

        /* renamed from: g  reason: collision with root package name */
        public int f905g;

        public b(ConstraintLayout constraintLayout) {
            this.f899a = constraintLayout;
        }

        public final boolean a(int i2, int i3, int i4) {
            if (i2 == i3) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i2);
            View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:114:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x01a0  */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x01b6  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x01b8  */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x01bb  */
        /* JADX WARNING: Removed duplicated region for block: B:124:0x01bd  */
        /* JADX WARNING: Removed duplicated region for block: B:138:0x01d8  */
        /* JADX WARNING: Removed duplicated region for block: B:139:0x01da  */
        /* JADX WARNING: Removed duplicated region for block: B:143:0x01e3  */
        /* JADX WARNING: Removed duplicated region for block: B:144:0x01e5  */
        /* JADX WARNING: Removed duplicated region for block: B:146:0x01e8 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:147:0x01e9  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(p.e r18, q.b.a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r1.f3667i0
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001b
                boolean r3 = r1.F
                if (r3 != 0) goto L_0x001b
                r2.f3720e = r5
                r2.f3721f = r5
                r2.f3722g = r5
                return
            L_0x001b:
                p.e r3 = r1.V
                if (r3 != 0) goto L_0x0020
                return
            L_0x0020:
                int r3 = r2.f3716a
                int r4 = r2.f3717b
                int r6 = r2.f3718c
                int r7 = r2.f3719d
                int r8 = r0.f900b
                int r9 = r0.f901c
                int r8 = r8 + r9
                int r9 = r0.f902d
                java.lang.Object r10 = r1.f3665h0
                android.view.View r10 = (android.view.View) r10
                int r11 = n.g.a(r3)
                r12 = 2
                r13 = 3
                r14 = -1
                r15 = 1
                if (r11 == 0) goto L_0x00b1
                if (r11 == r15) goto L_0x00a7
                if (r11 == r12) goto L_0x005d
                if (r11 == r13) goto L_0x0045
                goto L_0x00b7
            L_0x0045:
                int r6 = r0.f904f
                p.d r11 = r1.J
                if (r11 == 0) goto L_0x004f
                int r11 = r11.f3638g
                int r11 = r11 + r5
                goto L_0x0050
            L_0x004f:
                r11 = 0
            L_0x0050:
                p.d r5 = r1.L
                if (r5 == 0) goto L_0x0057
                int r5 = r5.f3638g
                int r11 = r11 + r5
            L_0x0057:
                int r9 = r9 + r11
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r14)
                goto L_0x00b7
            L_0x005d:
                int r5 = r0.f904f
                r6 = -2
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r6)
                int r6 = r1.f3684r
                if (r6 != r15) goto L_0x006a
                r6 = 1
                goto L_0x006b
            L_0x006a:
                r6 = 0
            L_0x006b:
                int r9 = r2.f3725j
                if (r9 == r15) goto L_0x0075
                if (r9 != r12) goto L_0x0072
                goto L_0x0075
            L_0x0072:
                r11 = 1073741824(0x40000000, float:2.0)
                goto L_0x00b7
            L_0x0075:
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.l()
                if (r9 != r11) goto L_0x0081
                r9 = 1
                goto L_0x0082
            L_0x0081:
                r9 = 0
            L_0x0082:
                int r11 = r2.f3725j
                if (r11 == r12) goto L_0x0099
                if (r6 == 0) goto L_0x0099
                if (r6 == 0) goto L_0x008c
                if (r9 != 0) goto L_0x0099
            L_0x008c:
                boolean r6 = r10 instanceof androidx.constraintlayout.widget.d
                if (r6 != 0) goto L_0x0099
                boolean r6 = r18.D()
                if (r6 == 0) goto L_0x0097
                goto L_0x0099
            L_0x0097:
                r6 = 0
                goto L_0x009a
            L_0x0099:
                r6 = 1
            L_0x009a:
                if (r6 == 0) goto L_0x0072
                int r5 = r18.u()
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r11)
                goto L_0x00b7
            L_0x00a7:
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = r0.f904f
                r6 = -2
                int r5 = android.view.ViewGroup.getChildMeasureSpec(r5, r9, r6)
                goto L_0x00b7
            L_0x00b1:
                r11 = 1073741824(0x40000000, float:2.0)
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r11)
            L_0x00b7:
                int r6 = n.g.a(r4)
                if (r6 == 0) goto L_0x0137
                if (r6 == r15) goto L_0x012d
                if (r6 == r12) goto L_0x00e3
                if (r6 == r13) goto L_0x00c6
                r9 = 0
                goto L_0x013e
            L_0x00c6:
                int r6 = r0.f905g
                p.d r7 = r1.J
                if (r7 == 0) goto L_0x00d3
                p.d r7 = r1.K
                int r7 = r7.f3638g
                r9 = 0
                int r7 = r7 + r9
                goto L_0x00d4
            L_0x00d3:
                r7 = 0
            L_0x00d4:
                p.d r9 = r1.L
                if (r9 == 0) goto L_0x00dd
                p.d r9 = r1.M
                int r9 = r9.f3638g
                int r7 = r7 + r9
            L_0x00dd:
                int r8 = r8 + r7
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r14)
                goto L_0x013d
            L_0x00e3:
                int r6 = r0.f905g
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r7)
                int r7 = r1.f3685s
                if (r7 != r15) goto L_0x00f0
                r7 = 1
                goto L_0x00f1
            L_0x00f0:
                r7 = 0
            L_0x00f1:
                int r8 = r2.f3725j
                if (r8 == r15) goto L_0x00fb
                if (r8 != r12) goto L_0x00f8
                goto L_0x00fb
            L_0x00f8:
                r9 = 1073741824(0x40000000, float:2.0)
                goto L_0x013d
            L_0x00fb:
                int r8 = r10.getMeasuredWidth()
                int r9 = r18.u()
                if (r8 != r9) goto L_0x0107
                r8 = 1
                goto L_0x0108
            L_0x0107:
                r8 = 0
            L_0x0108:
                int r9 = r2.f3725j
                if (r9 == r12) goto L_0x011f
                if (r7 == 0) goto L_0x011f
                if (r7 == 0) goto L_0x0112
                if (r8 != 0) goto L_0x011f
            L_0x0112:
                boolean r7 = r10 instanceof androidx.constraintlayout.widget.d
                if (r7 != 0) goto L_0x011f
                boolean r7 = r18.E()
                if (r7 == 0) goto L_0x011d
                goto L_0x011f
            L_0x011d:
                r7 = 0
                goto L_0x0120
            L_0x011f:
                r7 = 1
            L_0x0120:
                if (r7 == 0) goto L_0x00f8
                int r6 = r18.l()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x013d
            L_0x012d:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = r0.f905g
                r7 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r8, r7)
                goto L_0x013d
            L_0x0137:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            L_0x013d:
                r9 = r6
            L_0x013e:
                p.e r6 = r1.V
                p.f r6 = (p.f) r6
                if (r6 == 0) goto L_0x01b4
                androidx.constraintlayout.widget.ConstraintLayout r7 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r7 = r7.f846j
                r8 = 256(0x100, float:3.59E-43)
                boolean r7 = p.j.b(r7, r8)
                if (r7 == 0) goto L_0x01b4
                int r7 = r10.getMeasuredWidth()
                int r8 = r18.u()
                if (r7 != r8) goto L_0x01b4
                int r7 = r10.getMeasuredWidth()
                int r8 = r6.u()
                if (r7 >= r8) goto L_0x01b4
                int r7 = r10.getMeasuredHeight()
                int r8 = r18.l()
                if (r7 != r8) goto L_0x01b4
                int r7 = r10.getMeasuredHeight()
                int r6 = r6.l()
                if (r7 >= r6) goto L_0x01b4
                int r6 = r10.getBaseline()
                int r7 = r1.f3655c0
                if (r6 != r7) goto L_0x01b4
                boolean r6 = r18.C()
                if (r6 != 0) goto L_0x01b4
                int r6 = r1.H
                int r7 = r18.u()
                boolean r6 = r0.a(r6, r5, r7)
                if (r6 == 0) goto L_0x01a0
                int r6 = r1.I
                int r7 = r18.l()
                boolean r6 = r0.a(r6, r9, r7)
                if (r6 == 0) goto L_0x01a0
                r6 = 1
                goto L_0x01a1
            L_0x01a0:
                r6 = 0
            L_0x01a1:
                if (r6 == 0) goto L_0x01b4
                int r3 = r18.u()
                r2.f3720e = r3
                int r3 = r18.l()
                r2.f3721f = r3
                int r1 = r1.f3655c0
                r2.f3722g = r1
                return
            L_0x01b4:
                if (r3 != r13) goto L_0x01b8
                r6 = 1
                goto L_0x01b9
            L_0x01b8:
                r6 = 0
            L_0x01b9:
                if (r4 != r13) goto L_0x01bd
                r7 = 1
                goto L_0x01be
            L_0x01bd:
                r7 = 0
            L_0x01be:
                r8 = 4
                if (r4 == r8) goto L_0x01c6
                if (r4 != r15) goto L_0x01c4
                goto L_0x01c6
            L_0x01c4:
                r4 = 0
                goto L_0x01c7
            L_0x01c6:
                r4 = 1
            L_0x01c7:
                if (r3 == r8) goto L_0x01ce
                if (r3 != r15) goto L_0x01cc
                goto L_0x01ce
            L_0x01cc:
                r3 = 0
                goto L_0x01cf
            L_0x01ce:
                r3 = 1
            L_0x01cf:
                r8 = 0
                if (r6 == 0) goto L_0x01da
                float r11 = r1.Y
                int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
                if (r11 <= 0) goto L_0x01da
                r11 = 1
                goto L_0x01db
            L_0x01da:
                r11 = 0
            L_0x01db:
                if (r7 == 0) goto L_0x01e5
                float r13 = r1.Y
                int r8 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
                if (r8 <= 0) goto L_0x01e5
                r8 = 1
                goto L_0x01e6
            L_0x01e5:
                r8 = 0
            L_0x01e6:
                if (r10 != 0) goto L_0x01e9
                return
            L_0x01e9:
                android.view.ViewGroup$LayoutParams r13 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$a r13 = (androidx.constraintlayout.widget.ConstraintLayout.a) r13
                int r14 = r2.f3725j
                if (r14 == r15) goto L_0x0209
                if (r14 == r12) goto L_0x0209
                if (r6 == 0) goto L_0x0209
                int r6 = r1.f3684r
                if (r6 != 0) goto L_0x0209
                if (r7 == 0) goto L_0x0209
                int r6 = r1.f3685s
                if (r6 == 0) goto L_0x0202
                goto L_0x0209
            L_0x0202:
                r0 = -1
                r4 = 0
                r9 = 0
                r14 = 0
                r15 = 0
                goto L_0x02ae
            L_0x0209:
                boolean r6 = r10 instanceof s.g
                if (r6 == 0) goto L_0x0218
                boolean r6 = r1 instanceof p.k
                if (r6 == 0) goto L_0x0218
                r6 = r1
                p.k r6 = (p.k) r6
                r6 = r10
                s.g r6 = (s.g) r6
                goto L_0x021b
            L_0x0218:
                r10.measure(r5, r9)
            L_0x021b:
                r1.H = r5
                r1.I = r9
                r6 = 0
                r1.f3662g = r6
                int r6 = r10.getMeasuredWidth()
                int r7 = r10.getMeasuredHeight()
                int r12 = r10.getBaseline()
                int r14 = r1.f3687u
                if (r14 <= 0) goto L_0x0237
                int r14 = java.lang.Math.max(r14, r6)
                goto L_0x0238
            L_0x0237:
                r14 = r6
            L_0x0238:
                int r15 = r1.f3688v
                if (r15 <= 0) goto L_0x0240
                int r14 = java.lang.Math.min(r15, r14)
            L_0x0240:
                int r15 = r1.f3690x
                if (r15 <= 0) goto L_0x024b
                int r15 = java.lang.Math.max(r15, r7)
                r16 = r5
                goto L_0x024e
            L_0x024b:
                r16 = r5
                r15 = r7
            L_0x024e:
                int r5 = r1.f3691y
                if (r5 <= 0) goto L_0x0256
                int r15 = java.lang.Math.min(r5, r15)
            L_0x0256:
                androidx.constraintlayout.widget.ConstraintLayout r5 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r5 = r5.f846j
                r0 = 1
                boolean r5 = p.j.b(r5, r0)
                if (r5 != 0) goto L_0x027b
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r11 == 0) goto L_0x0270
                if (r4 == 0) goto L_0x0270
                float r3 = r1.Y
                float r4 = (float) r15
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r14 = r0
                goto L_0x027b
            L_0x0270:
                if (r8 == 0) goto L_0x027b
                if (r3 == 0) goto L_0x027b
                float r3 = r1.Y
                float r4 = (float) r14
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r15 = r0
            L_0x027b:
                if (r6 != r14) goto L_0x0284
                if (r7 == r15) goto L_0x0280
                goto L_0x0284
            L_0x0280:
                r4 = r12
                r0 = -1
                r9 = 0
                goto L_0x02ae
            L_0x0284:
                r0 = 1073741824(0x40000000, float:2.0)
                if (r6 == r14) goto L_0x028d
                int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r0)
                goto L_0x028f
            L_0x028d:
                r5 = r16
            L_0x028f:
                if (r7 == r15) goto L_0x0295
                int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
            L_0x0295:
                r10.measure(r5, r9)
                r1.H = r5
                r1.I = r9
                r9 = 0
                r1.f3662g = r9
                int r0 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                r14 = r0
                r15 = r3
                r0 = -1
            L_0x02ae:
                if (r4 == r0) goto L_0x02b2
                r0 = 1
                goto L_0x02b3
            L_0x02b2:
                r0 = 0
            L_0x02b3:
                int r3 = r2.f3718c
                if (r14 != r3) goto L_0x02be
                int r3 = r2.f3719d
                if (r15 == r3) goto L_0x02bc
                goto L_0x02be
            L_0x02bc:
                r5 = 0
                goto L_0x02bf
            L_0x02be:
                r5 = 1
            L_0x02bf:
                r2.f3724i = r5
                boolean r3 = r13.f860c0
                if (r3 == 0) goto L_0x02c6
                r0 = 1
            L_0x02c6:
                if (r0 == 0) goto L_0x02d2
                r3 = -1
                if (r4 == r3) goto L_0x02d2
                int r1 = r1.f3655c0
                if (r1 == r4) goto L_0x02d2
                r1 = 1
                r2.f3724i = r1
            L_0x02d2:
                r2.f3720e = r14
                r2.f3721f = r15
                r2.f3723h = r0
                r2.f3722g = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.b(p.e, q.b$a):void");
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        f(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        f(attributeSet, i2, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static f getSharedValues() {
        if (f837s == null) {
            f837s = new f();
        }
        return f837s;
    }

    /* renamed from: b */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public Object c(int i2, Object obj) {
        if (i2 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.f850n;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f850n.get(str);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public View d(int i2) {
        return this.f838b.get(i2);
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<a> arrayList = this.f839c;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                Objects.requireNonNull(this.f839c.get(i2));
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i4 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i5 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = (float) i4;
                        float f3 = (float) (i4 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f4 = (float) i5;
                        float f5 = f2;
                        float f6 = f2;
                        float f7 = f4;
                        Paint paint2 = paint;
                        float f8 = f3;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f5, f7, f8, f4, paint3);
                        float parseInt4 = (float) (i5 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f9 = f3;
                        float f10 = parseInt4;
                        canvas2.drawLine(f9, f7, f8, f10, paint3);
                        float f11 = parseInt4;
                        float f12 = f6;
                        canvas2.drawLine(f9, f11, f12, f10, paint3);
                        float f13 = f6;
                        canvas2.drawLine(f13, f11, f12, f4, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f14 = f3;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f13, f4, f14, parseInt4, paint6);
                        canvas2.drawLine(f13, parseInt4, f14, f4, paint6);
                    }
                }
            }
        }
    }

    public final e e(View view) {
        if (view == this) {
            return this.f840d;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof a)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof a)) {
                return null;
            }
        }
        return ((a) view.getLayoutParams()).f888q0;
    }

    public final void f(AttributeSet attributeSet, int i2, int i3) {
        p.f fVar = this.f840d;
        fVar.f3665h0 = this;
        b bVar = this.f852p;
        fVar.f3696v0 = bVar;
        fVar.f3694t0.f3733f = bVar;
        this.f838b.put(getId(), this);
        this.f847k = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.e.f3864b, i2, i3);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 16) {
                    this.f841e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f841e);
                } else if (index == 17) {
                    this.f842f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f842f);
                } else if (index == 14) {
                    this.f843g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f843g);
                } else if (index == 15) {
                    this.f844h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f844h);
                } else if (index == 113) {
                    this.f846j = obtainStyledAttributes.getInt(index, this.f846j);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            h(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f848l = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        b bVar2 = new b();
                        this.f847k = bVar2;
                        bVar2.f(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f847k = null;
                    }
                    this.f849m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f840d.g0(this.f846j);
    }

    public void forceLayout() {
        this.f845i = true;
        super.forceLayout();
    }

    public boolean g() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int getMaxHeight() {
        return this.f844h;
    }

    public int getMaxWidth() {
        return this.f843g;
    }

    public int getMinHeight() {
        return this.f842f;
    }

    public int getMinWidth() {
        return this.f841e;
    }

    public int getOptimizationLevel() {
        return this.f840d.E0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.f840d.f3668j == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.f840d.f3668j = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.f840d.f3668j = "parent";
            }
        }
        p.f fVar = this.f840d;
        if (fVar.f3669j0 == null) {
            fVar.f3669j0 = fVar.f3668j;
            StringBuilder a2 = androidx.activity.result.a.a(" setDebugName ");
            a2.append(this.f840d.f3669j0);
            Log.v("ConstraintLayout", a2.toString());
        }
        Iterator<e> it = this.f840d.f3710r0.iterator();
        while (it.hasNext()) {
            e next = it.next();
            View view = (View) next.f3665h0;
            if (view != null) {
                if (next.f3668j == null && (id = view.getId()) != -1) {
                    next.f3668j = getContext().getResources().getResourceEntryName(id);
                }
                if (next.f3669j0 == null) {
                    next.f3669j0 = next.f3668j;
                    StringBuilder a3 = androidx.activity.result.a.a(" setDebugName ");
                    a3.append(next.f3669j0);
                    Log.v("ConstraintLayout", a3.toString());
                }
            }
        }
        this.f840d.q(sb);
        return sb.toString();
    }

    public void h(int i2) {
        this.f848l = new s.b(getContext(), this, i2);
    }

    public void j(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
        b bVar = this.f852p;
        int i6 = bVar.f903e;
        int resolveSizeAndState = ViewGroup.resolveSizeAndState(i4 + bVar.f902d, i2, 0);
        int min = Math.min(this.f843g, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f844h, ViewGroup.resolveSizeAndState(i5 + i6, i3, 0) & 16777215);
        if (z2) {
            min |= 16777216;
        }
        if (z3) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            a aVar = (a) childAt.getLayoutParams();
            e eVar = aVar.f888q0;
            if ((childAt.getVisibility() != 8 || aVar.f862d0 || aVar.f864e0 || isInEditMode) && !aVar.f866f0) {
                int v2 = eVar.v();
                int w2 = eVar.w();
                int u2 = eVar.u() + v2;
                int l2 = eVar.l() + w2;
                childAt.layout(v2, w2, u2, l2);
                if ((childAt instanceof d) && (content = ((d) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(v2, w2, u2, l2);
                }
            }
        }
        int size = this.f839c.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                Objects.requireNonNull(this.f839c.get(i7));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:205:0x049f  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0553  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x05e8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x07a9  */
    /* JADX WARNING: Removed duplicated region for block: B:408:0x0557 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0181  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01e7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r28, int r29) {
        /*
            r27 = this;
            r7 = r27
            r1 = r28
            r2 = r29
            boolean r0 = r7.f845i
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0023
            int r0 = r27.getChildCount()
            r5 = 0
        L_0x0011:
            if (r5 >= r0) goto L_0x0023
            android.view.View r6 = r7.getChildAt(r5)
            boolean r6 = r6.isLayoutRequested()
            if (r6 == 0) goto L_0x0020
            r7.f845i = r3
            goto L_0x0023
        L_0x0020:
            int r5 = r5 + 1
            goto L_0x0011
        L_0x0023:
            r7.f853q = r1
            r7.f854r = r2
            p.f r0 = r7.f840d
            boolean r5 = r27.g()
            r0.f3697w0 = r5
            boolean r0 = r7.f845i
            if (r0 == 0) goto L_0x0042
            r7.f845i = r4
            boolean r0 = r27.r()
            if (r0 == 0) goto L_0x0042
            p.f r0 = r7.f840d
            q.b r5 = r0.f3693s0
            r5.c(r0)
        L_0x0042:
            p.f r0 = r7.f840d
            int r5 = r7.f846j
            int r6 = android.view.View.MeasureSpec.getMode(r28)
            int r8 = android.view.View.MeasureSpec.getSize(r28)
            int r9 = android.view.View.MeasureSpec.getMode(r29)
            int r10 = android.view.View.MeasureSpec.getSize(r29)
            int r11 = r27.getPaddingTop()
            int r11 = java.lang.Math.max(r4, r11)
            int r12 = r27.getPaddingBottom()
            int r12 = java.lang.Math.max(r4, r12)
            int r13 = r11 + r12
            int r14 = r27.getPaddingWidth()
            androidx.constraintlayout.widget.ConstraintLayout$b r15 = r7.f852p
            r15.f900b = r11
            r15.f901c = r12
            r15.f902d = r14
            r15.f903e = r13
            r15.f904f = r1
            r15.f905g = r2
            int r12 = r27.getPaddingStart()
            int r12 = java.lang.Math.max(r4, r12)
            int r15 = r27.getPaddingEnd()
            int r15 = java.lang.Math.max(r4, r15)
            if (r12 > 0) goto L_0x0098
            if (r15 <= 0) goto L_0x008f
            goto L_0x0098
        L_0x008f:
            int r12 = r27.getPaddingLeft()
            int r12 = java.lang.Math.max(r4, r12)
            goto L_0x009f
        L_0x0098:
            boolean r16 = r27.g()
            if (r16 == 0) goto L_0x009f
            r12 = r15
        L_0x009f:
            int r8 = r8 - r14
            int r10 = r10 - r13
            androidx.constraintlayout.widget.ConstraintLayout$b r13 = r7.f852p
            int r14 = r13.f903e
            int r13 = r13.f902d
            int r15 = r27.getChildCount()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r6 == r3) goto L_0x00c8
            if (r6 == 0) goto L_0x00c0
            if (r6 == r4) goto L_0x00b7
            r4 = 1
            goto L_0x00c4
        L_0x00b7:
            int r4 = r7.f843g
            int r4 = r4 - r13
            int r4 = java.lang.Math.min(r4, r8)
            r3 = 1
            goto L_0x00d4
        L_0x00c0:
            if (r15 != 0) goto L_0x00c3
            goto L_0x00ca
        L_0x00c3:
            r4 = 2
        L_0x00c4:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            goto L_0x00db
        L_0x00c8:
            if (r15 != 0) goto L_0x00d2
        L_0x00ca:
            int r4 = r7.f841e
            r3 = 0
            int r4 = java.lang.Math.max(r3, r4)
            goto L_0x00d3
        L_0x00d2:
            r4 = r8
        L_0x00d3:
            r3 = 2
        L_0x00d4:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r26 = r4
            r4 = r3
            r3 = r26
        L_0x00db:
            if (r9 == r1) goto L_0x00f5
            if (r9 == 0) goto L_0x00ef
            r1 = 1073741824(0x40000000, float:2.0)
            if (r9 == r1) goto L_0x00e5
            r1 = 1
            goto L_0x00f3
        L_0x00e5:
            int r1 = r7.f844h
            int r1 = r1 - r14
            int r1 = java.lang.Math.min(r1, r10)
            r15 = r1
            r1 = 1
            goto L_0x0102
        L_0x00ef:
            if (r15 != 0) goto L_0x00f2
            goto L_0x00f7
        L_0x00f2:
            r1 = 2
        L_0x00f3:
            r15 = 0
            goto L_0x0102
        L_0x00f5:
            if (r15 != 0) goto L_0x00ff
        L_0x00f7:
            int r1 = r7.f842f
            r15 = 0
            int r1 = java.lang.Math.max(r15, r1)
            goto L_0x0100
        L_0x00ff:
            r1 = r10
        L_0x0100:
            r15 = r1
            r1 = 2
        L_0x0102:
            int r2 = r0.u()
            if (r3 != r2) goto L_0x0114
            int r2 = r0.l()
            if (r15 == r2) goto L_0x010f
            goto L_0x0114
        L_0x010f:
            r17 = r10
            r2 = 0
            r10 = 1
            goto L_0x011c
        L_0x0114:
            q.f r2 = r0.f3694t0
            r17 = r10
            r10 = 1
            r2.f3730c = r10
            r2 = 0
        L_0x011c:
            r0.f3651a0 = r2
            r0.f3653b0 = r2
            int r10 = r7.f843g
            int r10 = r10 - r13
            r18 = r8
            int[] r8 = r0.C
            r8[r2] = r10
            int r10 = r7.f844h
            int r10 = r10 - r14
            r16 = 1
            r8[r16] = r10
            r0.Q(r2)
            r0.P(r2)
            int[] r8 = r0.U
            r8[r2] = r4
            r0.S(r3)
            int[] r2 = r0.U
            r2[r16] = r1
            r0.N(r15)
            int r1 = r7.f841e
            int r1 = r1 - r13
            r0.Q(r1)
            int r1 = r7.f842f
            int r1 = r1 - r14
            r0.P(r1)
            r0.f3699y0 = r12
            r0.f3700z0 = r11
            q.b r1 = r0.f3693s0
            java.util.Objects.requireNonNull(r1)
            p.d$a r2 = p.d.a.BOTTOM
            p.d$a r3 = p.d.a.RIGHT
            r4 = 3
            q.b$b r8 = r0.f3696v0
            java.util.ArrayList<p.e> r10 = r0.f3710r0
            int r10 = r10.size()
            int r11 = r0.u()
            int r12 = r0.l()
            r13 = 128(0x80, float:1.794E-43)
            boolean r13 = p.j.b(r5, r13)
            r14 = 64
            if (r13 != 0) goto L_0x0181
            boolean r5 = p.j.b(r5, r14)
            if (r5 == 0) goto L_0x017f
            goto L_0x0181
        L_0x017f:
            r5 = 0
            goto L_0x0182
        L_0x0181:
            r5 = 1
        L_0x0182:
            if (r5 == 0) goto L_0x01e1
            r14 = 0
        L_0x0185:
            if (r14 >= r10) goto L_0x01e1
            java.util.ArrayList<p.e> r15 = r0.f3710r0
            java.lang.Object r15 = r15.get(r14)
            p.e r15 = (p.e) r15
            r21 = r5
            int r5 = r15.m()
            if (r5 != r4) goto L_0x0199
            r5 = 1
            goto L_0x019a
        L_0x0199:
            r5 = 0
        L_0x019a:
            int r7 = r15.t()
            if (r7 != r4) goto L_0x01a2
            r7 = 1
            goto L_0x01a3
        L_0x01a2:
            r7 = 0
        L_0x01a3:
            if (r5 == 0) goto L_0x01b0
            if (r7 == 0) goto L_0x01b0
            float r5 = r15.Y
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x01b0
            r5 = 1
            goto L_0x01b1
        L_0x01b0:
            r5 = 0
        L_0x01b1:
            boolean r7 = r15.A()
            if (r7 == 0) goto L_0x01ba
            if (r5 == 0) goto L_0x01ba
            goto L_0x01dc
        L_0x01ba:
            boolean r7 = r15.B()
            if (r7 == 0) goto L_0x01c3
            if (r5 == 0) goto L_0x01c3
            goto L_0x01dc
        L_0x01c3:
            boolean r5 = r15 instanceof p.k
            if (r5 == 0) goto L_0x01c8
            goto L_0x01dc
        L_0x01c8:
            boolean r5 = r15.A()
            if (r5 != 0) goto L_0x01dc
            boolean r5 = r15.B()
            if (r5 == 0) goto L_0x01d5
            goto L_0x01dc
        L_0x01d5:
            int r14 = r14 + 1
            r7 = r27
            r5 = r21
            goto L_0x0185
        L_0x01dc:
            r5 = 1073741824(0x40000000, float:2.0)
            r21 = 0
            goto L_0x01e5
        L_0x01e1:
            r21 = r5
            r5 = 1073741824(0x40000000, float:2.0)
        L_0x01e5:
            if (r6 != r5) goto L_0x01e9
            if (r9 == r5) goto L_0x01eb
        L_0x01e9:
            if (r13 == 0) goto L_0x01ed
        L_0x01eb:
            r5 = 1
            goto L_0x01ee
        L_0x01ed:
            r5 = 0
        L_0x01ee:
            r5 = r21 & r5
            if (r5 == 0) goto L_0x049f
            int[] r7 = r0.C
            r14 = 0
            r7 = r7[r14]
            r14 = r18
            int r7 = java.lang.Math.min(r7, r14)
            int[] r14 = r0.C
            r15 = 1
            r14 = r14[r15]
            r15 = r17
            int r14 = java.lang.Math.min(r14, r15)
            r15 = 1073741824(0x40000000, float:2.0)
            if (r6 != r15) goto L_0x0218
            int r4 = r0.u()
            if (r4 == r7) goto L_0x0218
            r0.S(r7)
            r0.d0()
        L_0x0218:
            if (r9 != r15) goto L_0x0226
            int r4 = r0.l()
            if (r4 == r14) goto L_0x0226
            r0.N(r14)
            r0.d0()
        L_0x0226:
            if (r6 != r15) goto L_0x03f1
            if (r9 != r15) goto L_0x03f1
            q.f r4 = r0.f3694t0
            r14 = 1
            r13 = r13 & r14
            boolean r14 = r4.f3729b
            if (r14 != 0) goto L_0x0239
            boolean r14 = r4.f3730c
            if (r14 == 0) goto L_0x0237
            goto L_0x0239
        L_0x0237:
            r14 = 0
            goto L_0x0276
        L_0x0239:
            p.f r14 = r4.f3728a
            java.util.ArrayList<p.e> r14 = r14.f3710r0
            java.util.Iterator r14 = r14.iterator()
        L_0x0241:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x025e
            java.lang.Object r15 = r14.next()
            p.e r15 = (p.e) r15
            r15.h()
            r7 = 0
            r15.f3650a = r7
            q.m r7 = r15.f3656d
            r7.n()
            q.o r7 = r15.f3658e
            r7.m()
            goto L_0x0241
        L_0x025e:
            p.f r7 = r4.f3728a
            r7.h()
            p.f r7 = r4.f3728a
            r14 = 0
            r7.f3650a = r14
            q.m r7 = r7.f3656d
            r7.n()
            p.f r7 = r4.f3728a
            q.o r7 = r7.f3658e
            r7.m()
            r4.f3730c = r14
        L_0x0276:
            p.f r7 = r4.f3731d
            r4.b(r7)
            p.f r7 = r4.f3728a
            r7.f3651a0 = r14
            r7.f3653b0 = r14
            int r7 = r7.k(r14)
            p.f r14 = r4.f3728a
            r15 = 1
            int r14 = r14.k(r15)
            boolean r15 = r4.f3729b
            if (r15 == 0) goto L_0x0293
            r4.c()
        L_0x0293:
            p.f r15 = r4.f3728a
            int r15 = r15.v()
            r21 = r5
            p.f r5 = r4.f3728a
            int r5 = r5.w()
            r22 = r2
            p.f r2 = r4.f3728a
            q.m r2 = r2.f3656d
            q.g r2 = r2.f3780h
            r2.c(r15)
            p.f r2 = r4.f3728a
            q.o r2 = r2.f3658e
            q.g r2 = r2.f3780h
            r2.c(r5)
            r4.g()
            r2 = 2
            if (r7 == r2) goto L_0x02c3
            if (r14 != r2) goto L_0x02be
            goto L_0x02c3
        L_0x02be:
            r23 = r3
            r24 = r8
            goto L_0x0329
        L_0x02c3:
            if (r13 == 0) goto L_0x02de
            java.util.ArrayList<q.q> r2 = r4.f3732e
            java.util.Iterator r2 = r2.iterator()
        L_0x02cb:
            boolean r23 = r2.hasNext()
            if (r23 == 0) goto L_0x02de
            java.lang.Object r23 = r2.next()
            q.q r23 = (q.q) r23
            boolean r23 = r23.k()
            if (r23 != 0) goto L_0x02cb
            r13 = 0
        L_0x02de:
            if (r13 == 0) goto L_0x0305
            r2 = 2
            if (r7 != r2) goto L_0x0305
            p.f r2 = r4.f3728a
            r23 = r3
            int[] r3 = r2.U
            r24 = r8
            r8 = 0
            r16 = 1
            r3[r8] = r16
            int r3 = r4.d(r2, r8)
            r2.S(r3)
            p.f r2 = r4.f3728a
            q.m r3 = r2.f3656d
            q.h r3 = r3.f3777e
            int r2 = r2.u()
            r3.c(r2)
            goto L_0x0309
        L_0x0305:
            r23 = r3
            r24 = r8
        L_0x0309:
            if (r13 == 0) goto L_0x0329
            r2 = 2
            if (r14 != r2) goto L_0x0329
            p.f r2 = r4.f3728a
            int[] r3 = r2.U
            r8 = 1
            r3[r8] = r8
            int r3 = r4.d(r2, r8)
            r2.N(r3)
            p.f r2 = r4.f3728a
            q.o r3 = r2.f3658e
            q.h r3 = r3.f3777e
            int r2 = r2.l()
            r3.c(r2)
        L_0x0329:
            p.f r2 = r4.f3728a
            int[] r3 = r2.U
            r8 = 0
            r13 = r3[r8]
            r25 = r11
            r11 = 1
            if (r13 == r11) goto L_0x033d
            r3 = r3[r8]
            r8 = 4
            if (r3 != r8) goto L_0x033b
            goto L_0x033d
        L_0x033b:
            r2 = 0
            goto L_0x0382
        L_0x033d:
            int r2 = r2.u()
            int r2 = r2 + r15
            p.f r3 = r4.f3728a
            q.m r3 = r3.f3656d
            q.g r3 = r3.f3781i
            r3.c(r2)
            p.f r3 = r4.f3728a
            q.m r3 = r3.f3656d
            q.h r3 = r3.f3777e
            int r2 = r2 - r15
            r3.c(r2)
            r4.g()
            p.f r2 = r4.f3728a
            int[] r3 = r2.U
            r8 = 1
            r11 = r3[r8]
            if (r11 == r8) goto L_0x0366
            r3 = r3[r8]
            r8 = 4
            if (r3 != r8) goto L_0x037e
        L_0x0366:
            int r2 = r2.l()
            int r2 = r2 + r5
            p.f r3 = r4.f3728a
            q.o r3 = r3.f3658e
            q.g r3 = r3.f3781i
            r3.c(r2)
            p.f r3 = r4.f3728a
            q.o r3 = r3.f3658e
            q.h r3 = r3.f3777e
            int r2 = r2 - r5
            r3.c(r2)
        L_0x037e:
            r4.g()
            r2 = 1
        L_0x0382:
            java.util.ArrayList<q.q> r3 = r4.f3732e
            java.util.Iterator r3 = r3.iterator()
        L_0x0388:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x03a3
            java.lang.Object r5 = r3.next()
            q.q r5 = (q.q) r5
            p.e r8 = r5.f3774b
            p.f r11 = r4.f3728a
            if (r8 != r11) goto L_0x039f
            boolean r8 = r5.f3779g
            if (r8 != 0) goto L_0x039f
            goto L_0x0388
        L_0x039f:
            r5.e()
            goto L_0x0388
        L_0x03a3:
            java.util.ArrayList<q.q> r3 = r4.f3732e
            java.util.Iterator r3 = r3.iterator()
        L_0x03a9:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x03e0
            java.lang.Object r5 = r3.next()
            q.q r5 = (q.q) r5
            if (r2 != 0) goto L_0x03be
            p.e r8 = r5.f3774b
            p.f r11 = r4.f3728a
            if (r8 != r11) goto L_0x03be
            goto L_0x03a9
        L_0x03be:
            q.g r8 = r5.f3780h
            boolean r8 = r8.f3745j
            if (r8 != 0) goto L_0x03c5
            goto L_0x03de
        L_0x03c5:
            q.g r8 = r5.f3781i
            boolean r8 = r8.f3745j
            if (r8 != 0) goto L_0x03d0
            boolean r8 = r5 instanceof q.k
            if (r8 != 0) goto L_0x03d0
            goto L_0x03de
        L_0x03d0:
            q.h r8 = r5.f3777e
            boolean r8 = r8.f3745j
            if (r8 != 0) goto L_0x03a9
            boolean r8 = r5 instanceof q.c
            if (r8 != 0) goto L_0x03a9
            boolean r5 = r5 instanceof q.k
            if (r5 != 0) goto L_0x03a9
        L_0x03de:
            r2 = 0
            goto L_0x03e1
        L_0x03e0:
            r2 = 1
        L_0x03e1:
            p.f r3 = r4.f3728a
            r3.O(r7)
            p.f r3 = r4.f3728a
            r3.R(r14)
            r3 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            r5 = 2
            goto L_0x048f
        L_0x03f1:
            r22 = r2
            r23 = r3
            r21 = r5
            r24 = r8
            r25 = r11
            q.f r2 = r0.f3694t0
            boolean r3 = r2.f3729b
            if (r3 == 0) goto L_0x0458
            p.f r3 = r2.f3728a
            java.util.ArrayList<p.e> r3 = r3.f3710r0
            java.util.Iterator r3 = r3.iterator()
        L_0x0409:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0432
            java.lang.Object r4 = r3.next()
            p.e r4 = (p.e) r4
            r4.h()
            r5 = 0
            r4.f3650a = r5
            q.m r7 = r4.f3656d
            q.h r8 = r7.f3777e
            r8.f3745j = r5
            r7.f3779g = r5
            r7.n()
            q.o r4 = r4.f3658e
            q.h r7 = r4.f3777e
            r7.f3745j = r5
            r4.f3779g = r5
            r4.m()
            goto L_0x0409
        L_0x0432:
            r5 = 0
            p.f r3 = r2.f3728a
            r3.h()
            p.f r3 = r2.f3728a
            r3.f3650a = r5
            q.m r3 = r3.f3656d
            q.h r4 = r3.f3777e
            r4.f3745j = r5
            r3.f3779g = r5
            r3.n()
            p.f r3 = r2.f3728a
            q.o r3 = r3.f3658e
            q.h r4 = r3.f3777e
            r4.f3745j = r5
            r3.f3779g = r5
            r3.m()
            r2.c()
            goto L_0x0459
        L_0x0458:
            r5 = 0
        L_0x0459:
            p.f r3 = r2.f3731d
            r2.b(r3)
            p.f r3 = r2.f3728a
            r3.f3651a0 = r5
            r3.f3653b0 = r5
            q.m r3 = r3.f3656d
            q.g r3 = r3.f3780h
            r3.c(r5)
            p.f r2 = r2.f3728a
            q.o r2 = r2.f3658e
            q.g r2 = r2.f3780h
            r2.c(r5)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r6 != r2) goto L_0x0483
            boolean r3 = r0.c0(r13, r5)
            r4 = 1
            r16 = r3 & 1
            r3 = r16
            r5 = 1
            goto L_0x0486
        L_0x0483:
            r4 = 1
            r3 = 1
            r5 = 0
        L_0x0486:
            if (r9 != r2) goto L_0x048f
            boolean r7 = r0.c0(r13, r4)
            r3 = r3 & r7
            int r5 = r5 + 1
        L_0x048f:
            if (r3 == 0) goto L_0x04ab
            if (r6 != r2) goto L_0x0495
            r4 = 1
            goto L_0x0496
        L_0x0495:
            r4 = 0
        L_0x0496:
            if (r9 != r2) goto L_0x049a
            r2 = 1
            goto L_0x049b
        L_0x049a:
            r2 = 0
        L_0x049b:
            r0.T(r4, r2)
            goto L_0x04ab
        L_0x049f:
            r22 = r2
            r23 = r3
            r21 = r5
            r24 = r8
            r25 = r11
            r3 = 0
            r5 = 0
        L_0x04ab:
            if (r3 == 0) goto L_0x04b5
            r2 = 2
            if (r5 == r2) goto L_0x04b1
            goto L_0x04b5
        L_0x04b1:
            r7 = r27
            goto L_0x07af
        L_0x04b5:
            int r2 = r0.E0
            r3 = 8
            if (r10 <= 0) goto L_0x05d5
            java.util.ArrayList<p.e> r4 = r0.f3710r0
            int r4 = r4.size()
            r5 = 64
            boolean r5 = r0.f0(r5)
            q.b$b r6 = r0.f3696v0
            r7 = 0
        L_0x04ca:
            if (r7 >= r4) goto L_0x055b
            java.util.ArrayList<p.e> r8 = r0.f3710r0
            java.lang.Object r8 = r8.get(r7)
            p.e r8 = (p.e) r8
            boolean r9 = r8 instanceof p.g
            if (r9 == 0) goto L_0x04d9
            goto L_0x04f9
        L_0x04d9:
            boolean r9 = r8 instanceof p.a
            if (r9 == 0) goto L_0x04de
            goto L_0x04f9
        L_0x04de:
            boolean r9 = r8.G
            if (r9 == 0) goto L_0x04e3
            goto L_0x04f9
        L_0x04e3:
            if (r5 == 0) goto L_0x04fc
            q.m r9 = r8.f3656d
            if (r9 == 0) goto L_0x04fc
            q.o r11 = r8.f3658e
            if (r11 == 0) goto L_0x04fc
            q.h r9 = r9.f3777e
            boolean r9 = r9.f3745j
            if (r9 == 0) goto L_0x04fc
            q.h r9 = r11.f3777e
            boolean r9 = r9.f3745j
            if (r9 == 0) goto L_0x04fc
        L_0x04f9:
            r9 = 3
            r13 = 0
            goto L_0x0557
        L_0x04fc:
            r9 = 0
            int r11 = r8.k(r9)
            r9 = 1
            int r13 = r8.k(r9)
            r14 = 3
            if (r11 != r14) goto L_0x0515
            int r15 = r8.f3684r
            if (r15 == r9) goto L_0x0515
            if (r13 != r14) goto L_0x0515
            int r14 = r8.f3685s
            if (r14 == r9) goto L_0x0515
            r14 = 1
            goto L_0x0516
        L_0x0515:
            r14 = 0
        L_0x0516:
            if (r14 != 0) goto L_0x054e
            boolean r15 = r0.f0(r9)
            if (r15 == 0) goto L_0x054e
            boolean r9 = r8 instanceof p.k
            if (r9 != 0) goto L_0x054e
            r9 = 3
            if (r11 != r9) goto L_0x0532
            int r15 = r8.f3684r
            if (r15 != 0) goto L_0x0532
            if (r13 == r9) goto L_0x0532
            boolean r15 = r8.A()
            if (r15 != 0) goto L_0x0532
            r14 = 1
        L_0x0532:
            if (r13 != r9) goto L_0x0541
            int r15 = r8.f3685s
            if (r15 != 0) goto L_0x0541
            if (r11 == r9) goto L_0x0541
            boolean r15 = r8.A()
            if (r15 != 0) goto L_0x0541
            r14 = 1
        L_0x0541:
            if (r11 == r9) goto L_0x0545
            if (r13 != r9) goto L_0x054f
        L_0x0545:
            float r11 = r8.Y
            r13 = 0
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x0550
            r14 = 1
            goto L_0x0550
        L_0x054e:
            r9 = 3
        L_0x054f:
            r13 = 0
        L_0x0550:
            if (r14 == 0) goto L_0x0553
            goto L_0x0557
        L_0x0553:
            r11 = 0
            r1.a(r6, r8, r11)
        L_0x0557:
            int r7 = r7 + 1
            goto L_0x04ca
        L_0x055b:
            androidx.constraintlayout.widget.ConstraintLayout$b r6 = (androidx.constraintlayout.widget.ConstraintLayout.b) r6
            androidx.constraintlayout.widget.ConstraintLayout r4 = r6.f899a
            int r4 = r4.getChildCount()
            r5 = 0
        L_0x0564:
            if (r5 >= r4) goto L_0x05b8
            androidx.constraintlayout.widget.ConstraintLayout r7 = r6.f899a
            android.view.View r7 = r7.getChildAt(r5)
            boolean r8 = r7 instanceof androidx.constraintlayout.widget.d
            if (r8 == 0) goto L_0x05b5
            androidx.constraintlayout.widget.d r7 = (androidx.constraintlayout.widget.d) r7
            android.view.View r8 = r7.f1030c
            if (r8 != 0) goto L_0x0577
            goto L_0x05b5
        L_0x0577:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            android.view.View r7 = r7.f1030c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r7 = (androidx.constraintlayout.widget.ConstraintLayout.a) r7
            p.e r9 = r7.f888q0
            r11 = 0
            r9.f3667i0 = r11
            p.e r9 = r8.f888q0
            int r9 = r9.m()
            r11 = 1
            if (r9 == r11) goto L_0x059e
            p.e r9 = r8.f888q0
            p.e r13 = r7.f888q0
            int r13 = r13.u()
            r9.S(r13)
        L_0x059e:
            p.e r9 = r8.f888q0
            int r9 = r9.t()
            if (r9 == r11) goto L_0x05b1
            p.e r8 = r8.f888q0
            p.e r9 = r7.f888q0
            int r9 = r9.l()
            r8.N(r9)
        L_0x05b1:
            p.e r7 = r7.f888q0
            r7.f3667i0 = r3
        L_0x05b5:
            int r5 = r5 + 1
            goto L_0x0564
        L_0x05b8:
            androidx.constraintlayout.widget.ConstraintLayout r4 = r6.f899a
            java.util.ArrayList<androidx.constraintlayout.widget.a> r4 = r4.f839c
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x05d5
            r5 = 0
        L_0x05c3:
            if (r5 >= r4) goto L_0x05d5
            androidx.constraintlayout.widget.ConstraintLayout r7 = r6.f899a
            java.util.ArrayList<androidx.constraintlayout.widget.a> r7 = r7.f839c
            java.lang.Object r7 = r7.get(r5)
            androidx.constraintlayout.widget.a r7 = (androidx.constraintlayout.widget.a) r7
            java.util.Objects.requireNonNull(r7)
            int r5 = r5 + 1
            goto L_0x05c3
        L_0x05d5:
            r1.c(r0)
            java.util.ArrayList<p.e> r4 = r1.f3713a
            int r4 = r4.size()
            r5 = r25
            if (r10 <= 0) goto L_0x05e6
            r6 = 0
            r1.b(r0, r6, r5, r12)
        L_0x05e6:
            if (r4 <= 0) goto L_0x07a9
            int r6 = r0.m()
            r7 = 2
            if (r6 != r7) goto L_0x05f1
            r6 = 1
            goto L_0x05f2
        L_0x05f1:
            r6 = 0
        L_0x05f2:
            int r8 = r0.t()
            if (r8 != r7) goto L_0x05fa
            r7 = 1
            goto L_0x05fb
        L_0x05fa:
            r7 = 0
        L_0x05fb:
            int r8 = r0.u()
            p.f r9 = r1.f3715c
            int r9 = r9.f3657d0
            int r8 = java.lang.Math.max(r8, r9)
            int r9 = r0.l()
            p.f r10 = r1.f3715c
            int r10 = r10.f3659e0
            int r9 = java.lang.Math.max(r9, r10)
            r10 = r8
            r11 = r9
            r8 = 0
            r9 = 0
        L_0x0617:
            if (r8 >= r4) goto L_0x06b2
            java.util.ArrayList<p.e> r13 = r1.f3713a
            java.lang.Object r13 = r13.get(r8)
            p.e r13 = (p.e) r13
            boolean r14 = r13 instanceof p.k
            if (r14 != 0) goto L_0x0630
            r17 = r2
            r15 = r22
            r14 = r23
            r3 = r24
            r2 = 0
            goto L_0x06a4
        L_0x0630:
            int r14 = r13.u()
            int r15 = r13.l()
            r17 = r2
            r3 = r24
            r2 = 1
            boolean r18 = r1.a(r3, r13, r2)
            r2 = r9 | r18
            int r9 = r13.u()
            r18 = r2
            int r2 = r13.l()
            if (r9 == r14) goto L_0x0674
            r13.S(r9)
            if (r6 == 0) goto L_0x066f
            int r9 = r13.p()
            if (r9 <= r10) goto L_0x066f
            int r9 = r13.p()
            r14 = r23
            p.d r18 = r13.i(r14)
            int r18 = r18.d()
            int r9 = r18 + r9
            int r10 = java.lang.Math.max(r10, r9)
            goto L_0x0671
        L_0x066f:
            r14 = r23
        L_0x0671:
            r18 = 1
            goto L_0x0676
        L_0x0674:
            r14 = r23
        L_0x0676:
            if (r2 == r15) goto L_0x069d
            r13.N(r2)
            if (r7 == 0) goto L_0x0698
            int r2 = r13.j()
            if (r2 <= r11) goto L_0x0698
            int r2 = r13.j()
            r15 = r22
            p.d r9 = r13.i(r15)
            int r9 = r9.d()
            int r9 = r9 + r2
            int r2 = java.lang.Math.max(r11, r9)
            r11 = r2
            goto L_0x069a
        L_0x0698:
            r15 = r22
        L_0x069a:
            r18 = 1
            goto L_0x069f
        L_0x069d:
            r15 = r22
        L_0x069f:
            p.k r13 = (p.k) r13
            r2 = 0
            r9 = r18 | 0
        L_0x06a4:
            int r8 = r8 + 1
            r24 = r3
            r23 = r14
            r22 = r15
            r2 = r17
            r3 = 8
            goto L_0x0617
        L_0x06b2:
            r17 = r2
            r15 = r22
            r14 = r23
            r3 = r24
            r2 = 0
            r13 = r11
            r8 = 0
            r11 = 2
        L_0x06be:
            if (r8 >= r11) goto L_0x07a6
            r2 = r13
            r13 = r10
            r10 = r9
            r9 = 0
        L_0x06c4:
            if (r9 >= r4) goto L_0x0780
            java.util.ArrayList<p.e> r11 = r1.f3713a
            java.lang.Object r11 = r11.get(r9)
            p.e r11 = (p.e) r11
            r18 = r4
            boolean r4 = r11 instanceof p.h
            if (r4 == 0) goto L_0x06d8
            boolean r4 = r11 instanceof p.k
            if (r4 == 0) goto L_0x06dc
        L_0x06d8:
            boolean r4 = r11 instanceof p.g
            if (r4 == 0) goto L_0x06e1
        L_0x06dc:
            r19 = r0
            r0 = 8
            goto L_0x0701
        L_0x06e1:
            int r4 = r11.f3667i0
            r19 = r0
            r0 = 8
            if (r4 != r0) goto L_0x06ea
            goto L_0x0701
        L_0x06ea:
            if (r21 == 0) goto L_0x06fd
            q.m r4 = r11.f3656d
            q.h r4 = r4.f3777e
            boolean r4 = r4.f3745j
            if (r4 == 0) goto L_0x06fd
            q.o r4 = r11.f3658e
            q.h r4 = r4.f3777e
            boolean r4 = r4.f3745j
            if (r4 == 0) goto L_0x06fd
            goto L_0x0701
        L_0x06fd:
            boolean r4 = r11 instanceof p.k
            if (r4 == 0) goto L_0x0708
        L_0x0701:
            r24 = r3
            r25 = r5
            r20 = r12
            goto L_0x0771
        L_0x0708:
            int r4 = r11.u()
            int r0 = r11.l()
            r25 = r5
            int r5 = r11.f3655c0
            r20 = r12
            r12 = 1
            if (r8 != r12) goto L_0x071a
            r12 = 2
        L_0x071a:
            boolean r12 = r1.a(r3, r11, r12)
            r10 = r10 | r12
            int r12 = r11.u()
            r24 = r3
            int r3 = r11.l()
            if (r12 == r4) goto L_0x0748
            r11.S(r12)
            if (r6 == 0) goto L_0x0747
            int r4 = r11.p()
            if (r4 <= r13) goto L_0x0747
            int r4 = r11.p()
            p.d r10 = r11.i(r14)
            int r10 = r10.d()
            int r10 = r10 + r4
            int r13 = java.lang.Math.max(r13, r10)
        L_0x0747:
            r10 = 1
        L_0x0748:
            if (r3 == r0) goto L_0x0768
            r11.N(r3)
            if (r7 == 0) goto L_0x0767
            int r0 = r11.j()
            if (r0 <= r2) goto L_0x0767
            int r0 = r11.j()
            p.d r3 = r11.i(r15)
            int r3 = r3.d()
            int r3 = r3 + r0
            int r0 = java.lang.Math.max(r2, r3)
            r2 = r0
        L_0x0767:
            r10 = 1
        L_0x0768:
            boolean r0 = r11.E
            if (r0 == 0) goto L_0x0771
            int r0 = r11.f3655c0
            if (r5 == r0) goto L_0x0771
            r10 = 1
        L_0x0771:
            int r9 = r9 + 1
            r4 = r18
            r0 = r19
            r12 = r20
            r3 = r24
            r5 = r25
            r11 = 2
            goto L_0x06c4
        L_0x0780:
            r19 = r0
            r24 = r3
            r18 = r4
            r25 = r5
            r20 = r12
            if (r10 == 0) goto L_0x07a4
            int r8 = r8 + 1
            r0 = r19
            r4 = r20
            r3 = r25
            r1.b(r0, r8, r3, r4)
            r5 = r3
            r12 = r4
            r10 = r13
            r4 = r18
            r3 = r24
            r9 = 0
            r11 = 2
            r13 = r2
            r2 = 0
            goto L_0x06be
        L_0x07a4:
            r0 = r19
        L_0x07a6:
            r1 = r17
            goto L_0x07aa
        L_0x07a9:
            r1 = r2
        L_0x07aa:
            r0.g0(r1)
            goto L_0x04b1
        L_0x07af:
            p.f r0 = r7.f840d
            int r3 = r0.u()
            p.f r0 = r7.f840d
            int r4 = r0.l()
            p.f r0 = r7.f840d
            boolean r5 = r0.F0
            boolean r6 = r0.G0
            r0 = r27
            r1 = r28
            r2 = r29
            r0.j(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        e e2 = e(view);
        if ((view instanceof Guideline) && !(e2 instanceof g)) {
            a aVar = (a) view.getLayoutParams();
            g gVar = new g();
            aVar.f888q0 = gVar;
            aVar.f862d0 = true;
            gVar.W(aVar.V);
        }
        if (view instanceof a) {
            a aVar2 = (a) view;
            aVar2.k();
            ((a) view.getLayoutParams()).f864e0 = true;
            if (!this.f839c.contains(aVar2)) {
                this.f839c.add(aVar2);
            }
        }
        this.f838b.put(view.getId(), view);
        this.f845i = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f838b.remove(view.getId());
        e e2 = e(view);
        this.f840d.f3710r0.remove(e2);
        e2.F();
        this.f839c.remove(view);
        this.f845i = true;
    }

    public void p(int i2, Object obj, Object obj2) {
        if (i2 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f850n == null) {
                this.f850n = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f850n.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final void q(e eVar, a aVar, SparseArray<e> sparseArray, int i2, d.a aVar2) {
        View view = this.f838b.get(i2);
        e eVar2 = sparseArray.get(i2);
        if (eVar2 != null && view != null && (view.getLayoutParams() instanceof a)) {
            aVar.f860c0 = true;
            d.a aVar3 = d.a.BASELINE;
            if (aVar2 == aVar3) {
                a aVar4 = (a) view.getLayoutParams();
                aVar4.f860c0 = true;
                aVar4.f888q0.E = true;
            }
            eVar.i(aVar3).a(eVar2.i(aVar2), aVar.D, aVar.C, true);
            eVar.E = true;
            eVar.i(d.a.TOP).h();
            eVar.i(d.a.BOTTOM).h();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:145:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02f7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0385  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03a9  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x04e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r() {
        /*
            r21 = this;
            r6 = r21
            int r0 = r21.getChildCount()
            r7 = 0
            r1 = 0
        L_0x0008:
            r8 = 1
            if (r1 >= r0) goto L_0x001a
            android.view.View r2 = r6.getChildAt(r1)
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L_0x0017
            r9 = 1
            goto L_0x001b
        L_0x0017:
            int r1 = r1 + 1
            goto L_0x0008
        L_0x001a:
            r9 = 0
        L_0x001b:
            if (r9 == 0) goto L_0x0562
            boolean r10 = r21.isInEditMode()
            int r11 = r21.getChildCount()
            r0 = 0
        L_0x0026:
            if (r0 >= r11) goto L_0x0039
            android.view.View r1 = r6.getChildAt(r0)
            p.e r1 = r6.e(r1)
            if (r1 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r1.F()
        L_0x0036:
            int r0 = r0 + 1
            goto L_0x0026
        L_0x0039:
            r0 = 0
            r12 = -1
            if (r10 == 0) goto L_0x00a1
            r1 = 0
        L_0x003e:
            if (r1 >= r11) goto L_0x00a1
            android.view.View r2 = r6.getChildAt(r1)
            android.content.res.Resources r3 = r21.getResources()     // Catch:{ NotFoundException -> 0x009e }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x009e }
            java.lang.String r3 = r3.getResourceName(r4)     // Catch:{ NotFoundException -> 0x009e }
            int r4 = r2.getId()     // Catch:{ NotFoundException -> 0x009e }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NotFoundException -> 0x009e }
            r6.p(r7, r3, r4)     // Catch:{ NotFoundException -> 0x009e }
            r4 = 47
            int r4 = r3.indexOf(r4)     // Catch:{ NotFoundException -> 0x009e }
            if (r4 == r12) goto L_0x0069
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)     // Catch:{ NotFoundException -> 0x009e }
        L_0x0069:
            int r2 = r2.getId()     // Catch:{ NotFoundException -> 0x009e }
            if (r2 != 0) goto L_0x0070
            goto L_0x008d
        L_0x0070:
            android.util.SparseArray<android.view.View> r4 = r6.f838b     // Catch:{ NotFoundException -> 0x009e }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ NotFoundException -> 0x009e }
            android.view.View r4 = (android.view.View) r4     // Catch:{ NotFoundException -> 0x009e }
            if (r4 != 0) goto L_0x008b
            android.view.View r4 = r6.findViewById(r2)     // Catch:{ NotFoundException -> 0x009e }
            if (r4 == 0) goto L_0x008b
            if (r4 == r6) goto L_0x008b
            android.view.ViewParent r2 = r4.getParent()     // Catch:{ NotFoundException -> 0x009e }
            if (r2 != r6) goto L_0x008b
            r6.onViewAdded(r4)     // Catch:{ NotFoundException -> 0x009e }
        L_0x008b:
            if (r4 != r6) goto L_0x0090
        L_0x008d:
            p.f r2 = r6.f840d     // Catch:{ NotFoundException -> 0x009e }
            goto L_0x009c
        L_0x0090:
            if (r4 != 0) goto L_0x0094
            r2 = r0
            goto L_0x009c
        L_0x0094:
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()     // Catch:{ NotFoundException -> 0x009e }
            androidx.constraintlayout.widget.ConstraintLayout$a r2 = (androidx.constraintlayout.widget.ConstraintLayout.a) r2     // Catch:{ NotFoundException -> 0x009e }
            p.e r2 = r2.f888q0     // Catch:{ NotFoundException -> 0x009e }
        L_0x009c:
            r2.f3669j0 = r3     // Catch:{ NotFoundException -> 0x009e }
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x003e
        L_0x00a1:
            int r1 = r6.f849m
            if (r1 == r12) goto L_0x00c3
            r1 = 0
        L_0x00a6:
            if (r1 >= r11) goto L_0x00c3
            android.view.View r2 = r6.getChildAt(r1)
            int r3 = r2.getId()
            int r4 = r6.f849m
            if (r3 != r4) goto L_0x00c0
            boolean r3 = r2 instanceof androidx.constraintlayout.widget.c
            if (r3 == 0) goto L_0x00c0
            androidx.constraintlayout.widget.c r2 = (androidx.constraintlayout.widget.c) r2
            androidx.constraintlayout.widget.b r2 = r2.getConstraintSet()
            r6.f847k = r2
        L_0x00c0:
            int r1 = r1 + 1
            goto L_0x00a6
        L_0x00c3:
            androidx.constraintlayout.widget.b r1 = r6.f847k
            if (r1 == 0) goto L_0x00ca
            r1.b(r6, r8)
        L_0x00ca:
            p.f r1 = r6.f840d
            java.util.ArrayList<p.e> r1 = r1.f3710r0
            r1.clear()
            java.util.ArrayList<androidx.constraintlayout.widget.a> r1 = r6.f839c
            int r1 = r1.size()
            r13 = 2
            if (r1 <= 0) goto L_0x0171
            r2 = 0
        L_0x00db:
            if (r2 >= r1) goto L_0x0171
            java.util.ArrayList<androidx.constraintlayout.widget.a> r3 = r6.f839c
            java.lang.Object r3 = r3.get(r2)
            androidx.constraintlayout.widget.a r3 = (androidx.constraintlayout.widget.a) r3
            boolean r4 = r3.isInEditMode()
            if (r4 == 0) goto L_0x00f0
            java.lang.String r4 = r3.f912f
            r3.setIds(r4)
        L_0x00f0:
            p.h r4 = r3.f911e
            if (r4 != 0) goto L_0x00f6
            goto L_0x016b
        L_0x00f6:
            p.i r4 = (p.i) r4
            r4.f3708s0 = r7
            p.e[] r4 = r4.f3707r0
            java.util.Arrays.fill(r4, r0)
            r4 = 0
        L_0x0100:
            int r5 = r3.f909c
            if (r4 >= r5) goto L_0x0164
            int[] r5 = r3.f908b
            r5 = r5[r4]
            android.view.View r14 = r6.d(r5)
            if (r14 != 0) goto L_0x0131
            java.util.HashMap<java.lang.Integer, java.lang.String> r15 = r3.f915i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r5 = r15.get(r5)
            java.lang.String r5 = (java.lang.String) r5
            int r15 = r3.h(r6, r5)
            if (r15 == 0) goto L_0x0131
            int[] r14 = r3.f908b
            r14[r4] = r15
            java.util.HashMap<java.lang.Integer, java.lang.String> r14 = r3.f915i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r14.put(r0, r5)
            android.view.View r14 = r6.d(r15)
        L_0x0131:
            if (r14 == 0) goto L_0x015f
            p.h r0 = r3.f911e
            p.e r5 = r6.e(r14)
            p.i r0 = (p.i) r0
            java.util.Objects.requireNonNull(r0)
            if (r5 == r0) goto L_0x015f
            if (r5 != 0) goto L_0x0143
            goto L_0x015f
        L_0x0143:
            int r14 = r0.f3708s0
            int r14 = r14 + r8
            p.e[] r15 = r0.f3707r0
            int r7 = r15.length
            if (r14 <= r7) goto L_0x0156
            int r7 = r15.length
            int r7 = r7 * 2
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r15, r7)
            p.e[] r7 = (p.e[]) r7
            r0.f3707r0 = r7
        L_0x0156:
            p.e[] r7 = r0.f3707r0
            int r14 = r0.f3708s0
            r7[r14] = r5
            int r14 = r14 + r8
            r0.f3708s0 = r14
        L_0x015f:
            int r4 = r4 + 1
            r0 = 0
            r7 = 0
            goto L_0x0100
        L_0x0164:
            p.h r0 = r3.f911e
            p.f r3 = r6.f840d
            r0.a(r3)
        L_0x016b:
            int r2 = r2 + 1
            r0 = 0
            r7 = 0
            goto L_0x00db
        L_0x0171:
            r0 = 0
        L_0x0172:
            if (r0 >= r11) goto L_0x01ab
            android.view.View r1 = r6.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.d
            if (r2 == 0) goto L_0x01a8
            androidx.constraintlayout.widget.d r1 = (androidx.constraintlayout.widget.d) r1
            int r2 = r1.f1029b
            if (r2 != r12) goto L_0x018d
            boolean r2 = r1.isInEditMode()
            if (r2 != 0) goto L_0x018d
            int r2 = r1.f1031d
            r1.setVisibility(r2)
        L_0x018d:
            int r2 = r1.f1029b
            android.view.View r2 = r6.findViewById(r2)
            r1.f1030c = r2
            if (r2 == 0) goto L_0x01a8
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$a r2 = (androidx.constraintlayout.widget.ConstraintLayout.a) r2
            r2.f866f0 = r8
            android.view.View r2 = r1.f1030c
            r3 = 0
            r2.setVisibility(r3)
            r1.setVisibility(r3)
        L_0x01a8:
            int r0 = r0 + 1
            goto L_0x0172
        L_0x01ab:
            android.util.SparseArray<p.e> r0 = r6.f851o
            r0.clear()
            android.util.SparseArray<p.e> r0 = r6.f851o
            p.f r1 = r6.f840d
            r2 = 0
            r0.put(r2, r1)
            android.util.SparseArray<p.e> r0 = r6.f851o
            int r1 = r21.getId()
            p.f r2 = r6.f840d
            r0.put(r1, r2)
            r0 = 0
        L_0x01c4:
            if (r0 >= r11) goto L_0x01da
            android.view.View r1 = r6.getChildAt(r0)
            p.e r2 = r6.e(r1)
            android.util.SparseArray<p.e> r3 = r6.f851o
            int r1 = r1.getId()
            r3.put(r1, r2)
            int r0 = r0 + 1
            goto L_0x01c4
        L_0x01da:
            r7 = 0
        L_0x01db:
            if (r7 >= r11) goto L_0x0562
            android.view.View r0 = r6.getChildAt(r7)
            p.e r14 = r6.e(r0)
            if (r14 != 0) goto L_0x01e9
            goto L_0x0265
        L_0x01e9:
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            r15 = r1
            androidx.constraintlayout.widget.ConstraintLayout$a r15 = (androidx.constraintlayout.widget.ConstraintLayout.a) r15
            p.f r1 = r6.f840d
            java.util.ArrayList<p.e> r2 = r1.f3710r0
            r2.add(r14)
            p.e r2 = r14.V
            if (r2 == 0) goto L_0x0205
            p.l r2 = (p.l) r2
            java.util.ArrayList<p.e> r2 = r2.f3710r0
            r2.remove(r14)
            r14.F()
        L_0x0205:
            r14.V = r1
            android.util.SparseArray<p.e> r3 = r6.f851o
            r16 = 4
            p.d$a r5 = p.d.a.RIGHT
            p.d$a r4 = p.d.a.LEFT
            p.d$a r2 = p.d.a.BOTTOM
            p.d$a r1 = p.d.a.TOP
            r15.a()
            int r13 = r0.getVisibility()
            r14.f3667i0 = r13
            boolean r13 = r15.f866f0
            if (r13 == 0) goto L_0x0226
            r14.F = r8
            r13 = 8
            r14.f3667i0 = r13
        L_0x0226:
            r14.f3665h0 = r0
            boolean r13 = r0 instanceof androidx.constraintlayout.widget.a
            if (r13 == 0) goto L_0x0235
            androidx.constraintlayout.widget.a r0 = (androidx.constraintlayout.widget.a) r0
            p.f r13 = r6.f840d
            boolean r13 = r13.f3697w0
            r0.j(r14, r13)
        L_0x0235:
            boolean r0 = r15.f862d0
            if (r0 == 0) goto L_0x0273
            p.g r14 = (p.g) r14
            int r0 = r15.f882n0
            int r1 = r15.f884o0
            float r2 = r15.f886p0
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0250
            if (r4 <= 0) goto L_0x0265
            r14.f3701r0 = r2
            r14.f3702s0 = r12
            r14.f3703t0 = r12
            goto L_0x0265
        L_0x0250:
            if (r0 == r12) goto L_0x025b
            if (r0 <= r12) goto L_0x0265
            r14.f3701r0 = r3
            r14.f3702s0 = r0
            r14.f3703t0 = r12
            goto L_0x0265
        L_0x025b:
            if (r1 == r12) goto L_0x0265
            if (r1 <= r12) goto L_0x0265
            r14.f3701r0 = r3
            r14.f3702s0 = r12
            r14.f3703t0 = r1
        L_0x0265:
            r19 = r7
            r18 = r9
            r20 = r10
            r17 = r11
            r0 = 2
            r3 = -1
            r4 = 0
            r5 = 1
            goto L_0x0553
        L_0x0273:
            int r0 = r15.f868g0
            int r13 = r15.f870h0
            int r8 = r15.f872i0
            int r12 = r15.f874j0
            int r6 = r15.f876k0
            r17 = r11
            int r11 = r15.f878l0
            r18 = r9
            float r9 = r15.f880m0
            r19 = r7
            int r7 = r15.f885p
            r20 = r10
            r10 = -1
            if (r7 == r10) goto L_0x02b1
            java.lang.Object r0 = r3.get(r7)
            p.e r0 = (p.e) r0
            if (r0 == 0) goto L_0x02ab
            float r3 = r15.f889r
            int r6 = r15.f887q
            p.d$a r7 = p.d.a.CENTER
            p.d r8 = r14.i(r7)
            p.d r0 = r0.i(r7)
            r7 = 0
            r9 = 1
            r8.a(r0, r6, r7, r9)
            r14.D = r3
        L_0x02ab:
            r8 = r1
            r10 = r2
            r11 = r4
            r6 = r5
            goto L_0x03b3
        L_0x02b1:
            r7 = -1
            if (r0 == r7) goto L_0x02c8
            java.lang.Object r0 = r3.get(r0)
            p.e r0 = (p.e) r0
            if (r0 == 0) goto L_0x02e0
            int r10 = r15.leftMargin
            p.d r13 = r14.i(r4)
            p.d r0 = r0.i(r4)
        L_0x02c6:
            r7 = 1
            goto L_0x02dd
        L_0x02c8:
            if (r13 == r7) goto L_0x02e0
            java.lang.Object r0 = r3.get(r13)
            p.e r0 = (p.e) r0
            if (r0 == 0) goto L_0x02e0
            int r10 = r15.leftMargin
            p.d r13 = r14.i(r4)
            p.d r0 = r0.i(r5)
            goto L_0x02c6
        L_0x02dd:
            r13.a(r0, r10, r6, r7)
        L_0x02e0:
            r0 = -1
            if (r8 == r0) goto L_0x02f7
            java.lang.Object r6 = r3.get(r8)
            p.e r6 = (p.e) r6
            if (r6 == 0) goto L_0x030f
            int r7 = r15.rightMargin
            p.d r8 = r14.i(r5)
            p.d r6 = r6.i(r4)
        L_0x02f5:
            r0 = 1
            goto L_0x030c
        L_0x02f7:
            if (r12 == r0) goto L_0x030f
            java.lang.Object r0 = r3.get(r12)
            p.e r0 = (p.e) r0
            if (r0 == 0) goto L_0x030f
            int r7 = r15.rightMargin
            p.d r8 = r14.i(r5)
            p.d r6 = r0.i(r5)
            goto L_0x02f5
        L_0x030c:
            r8.a(r6, r7, r11, r0)
        L_0x030f:
            int r0 = r15.f871i
            r6 = -1
            if (r0 == r6) goto L_0x032a
            java.lang.Object r0 = r3.get(r0)
            p.e r0 = (p.e) r0
            if (r0 == 0) goto L_0x0346
            int r7 = r15.topMargin
            int r8 = r15.f895x
            p.d r10 = r14.i(r1)
            p.d r0 = r0.i(r1)
        L_0x0328:
            r6 = 1
            goto L_0x0343
        L_0x032a:
            int r0 = r15.f873j
            if (r0 == r6) goto L_0x0346
            java.lang.Object r0 = r3.get(r0)
            p.e r0 = (p.e) r0
            if (r0 == 0) goto L_0x0346
            int r7 = r15.topMargin
            int r8 = r15.f895x
            p.d r10 = r14.i(r1)
            p.d r0 = r0.i(r2)
            goto L_0x0328
        L_0x0343:
            r10.a(r0, r7, r8, r6)
        L_0x0346:
            int r0 = r15.f875k
            r6 = -1
            if (r0 == r6) goto L_0x0360
            java.lang.Object r0 = r3.get(r0)
            p.e r0 = (p.e) r0
            if (r0 == 0) goto L_0x037c
            int r7 = r15.bottomMargin
            int r8 = r15.f897z
            p.d r10 = r14.i(r2)
            p.d r0 = r0.i(r1)
            goto L_0x0378
        L_0x0360:
            int r0 = r15.f877l
            if (r0 == r6) goto L_0x037c
            java.lang.Object r0 = r3.get(r0)
            p.e r0 = (p.e) r0
            if (r0 == 0) goto L_0x037c
            int r7 = r15.bottomMargin
            int r8 = r15.f897z
            p.d r10 = r14.i(r2)
            p.d r0 = r0.i(r2)
        L_0x0378:
            r6 = 1
            r10.a(r0, r7, r8, r6)
        L_0x037c:
            int r0 = r15.f879m
            r6 = -1
            if (r0 == r6) goto L_0x0385
            p.d$a r7 = p.d.a.BASELINE
            r6 = r0
            goto L_0x0392
        L_0x0385:
            int r0 = r15.f881n
            if (r0 == r6) goto L_0x038c
            r6 = r0
            r7 = r1
            goto L_0x0392
        L_0x038c:
            int r0 = r15.f883o
            if (r0 == r6) goto L_0x03a0
            r6 = r0
            r7 = r2
        L_0x0392:
            r0 = r21
            r8 = r1
            r1 = r14
            r10 = r2
            r2 = r15
            r11 = r4
            r4 = r6
            r6 = r5
            r5 = r7
            r0.q(r1, r2, r3, r4, r5)
            goto L_0x03a4
        L_0x03a0:
            r8 = r1
            r10 = r2
            r11 = r4
            r6 = r5
        L_0x03a4:
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 < 0) goto L_0x03ab
            r14.f3661f0 = r9
        L_0x03ab:
            float r1 = r15.F
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x03b3
            r14.f3663g0 = r1
        L_0x03b3:
            if (r20 == 0) goto L_0x03c4
            int r0 = r15.T
            r1 = -1
            if (r0 != r1) goto L_0x03be
            int r2 = r15.U
            if (r2 == r1) goto L_0x03c4
        L_0x03be:
            int r1 = r15.U
            r14.f3651a0 = r0
            r14.f3653b0 = r1
        L_0x03c4:
            boolean r0 = r15.f856a0
            r1 = -2
            r2 = 3
            if (r0 != 0) goto L_0x03f8
            int r0 = r15.width
            r3 = -1
            if (r0 != r3) goto L_0x03ef
            boolean r0 = r15.W
            if (r0 == 0) goto L_0x03d9
            int[] r0 = r14.U
            r3 = 0
            r0[r3] = r2
            goto L_0x03de
        L_0x03d9:
            r3 = 0
            int[] r0 = r14.U
            r0[r3] = r16
        L_0x03de:
            p.d r0 = r14.i(r11)
            int r4 = r15.leftMargin
            r0.f3638g = r4
            p.d r0 = r14.i(r6)
            int r4 = r15.rightMargin
            r0.f3638g = r4
            goto L_0x040c
        L_0x03ef:
            r3 = 0
            int[] r0 = r14.U
            r0[r3] = r2
            r14.S(r3)
            goto L_0x040c
        L_0x03f8:
            r3 = 0
            int[] r0 = r14.U
            r4 = 1
            r0[r3] = r4
            int r0 = r15.width
            r14.S(r0)
            int r0 = r15.width
            if (r0 != r1) goto L_0x040c
            int[] r0 = r14.U
            r4 = 2
            r0[r3] = r4
        L_0x040c:
            boolean r0 = r15.f858b0
            if (r0 != 0) goto L_0x043f
            int r0 = r15.height
            r3 = -1
            if (r0 != r3) goto L_0x0435
            boolean r0 = r15.X
            if (r0 == 0) goto L_0x041f
            int[] r0 = r14.U
            r4 = 1
            r0[r4] = r2
            goto L_0x0424
        L_0x041f:
            r4 = 1
            int[] r0 = r14.U
            r0[r4] = r16
        L_0x0424:
            p.d r0 = r14.i(r8)
            int r1 = r15.topMargin
            r0.f3638g = r1
            p.d r0 = r14.i(r10)
            int r1 = r15.bottomMargin
            r0.f3638g = r1
            goto L_0x0453
        L_0x0435:
            r4 = 1
            int[] r0 = r14.U
            r0[r4] = r2
            r0 = 0
            r14.N(r0)
            goto L_0x0453
        L_0x043f:
            r3 = -1
            r4 = 1
            int[] r0 = r14.U
            r0[r4] = r4
            int r0 = r15.height
            r14.N(r0)
            int r0 = r15.height
            if (r0 != r1) goto L_0x0453
            int[] r0 = r14.U
            r1 = 2
            r0[r4] = r1
        L_0x0453:
            java.lang.String r0 = r15.G
            if (r0 == 0) goto L_0x04eb
            int r1 = r0.length()
            if (r1 != 0) goto L_0x045f
            goto L_0x04eb
        L_0x045f:
            int r1 = r0.length()
            r4 = 44
            int r4 = r0.indexOf(r4)
            if (r4 <= 0) goto L_0x048d
            int r5 = r1 + -1
            if (r4 >= r5) goto L_0x048d
            r5 = 0
            java.lang.String r6 = r0.substring(r5, r4)
            java.lang.String r5 = "W"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x047e
            r5 = 0
            goto L_0x0489
        L_0x047e:
            java.lang.String r5 = "H"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0488
            r5 = 1
            goto L_0x0489
        L_0x0488:
            r5 = -1
        L_0x0489:
            int r4 = r4 + 1
            r10 = r5
            goto L_0x048f
        L_0x048d:
            r4 = 0
            r10 = -1
        L_0x048f:
            r5 = 58
            int r5 = r0.indexOf(r5)
            if (r5 < 0) goto L_0x04d1
            int r1 = r1 + -1
            if (r5 >= r1) goto L_0x04d1
            java.lang.String r1 = r0.substring(r4, r5)
            int r5 = r5 + 1
            java.lang.String r0 = r0.substring(r5)
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x04e0
            int r4 = r0.length()
            if (r4 <= 0) goto L_0x04e0
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x04e0 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04e0 }
            r4 = 0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x04e0
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x04e0
            r4 = 1
            if (r10 != r4) goto L_0x04cb
            float r0 = r0 / r1
            float r0 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x04e0 }
            goto L_0x04e1
        L_0x04cb:
            float r1 = r1 / r0
            float r0 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x04e0 }
            goto L_0x04e1
        L_0x04d1:
            java.lang.String r0 = r0.substring(r4)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x04e0
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x04e0 }
            goto L_0x04e1
        L_0x04e0:
            r0 = 0
        L_0x04e1:
            r1 = 0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x04ee
            r14.Y = r0
            r14.Z = r10
            goto L_0x04ee
        L_0x04eb:
            r1 = 0
            r14.Y = r1
        L_0x04ee:
            float r0 = r15.H
            float[] r1 = r14.f3675m0
            r4 = 0
            r1[r4] = r0
            float r0 = r15.I
            r5 = 1
            r1[r5] = r0
            int r0 = r15.J
            r14.f3671k0 = r0
            int r0 = r15.K
            r14.f3673l0 = r0
            int r0 = r15.Z
            if (r0 < 0) goto L_0x050a
            if (r0 > r2) goto L_0x050a
            r14.f3682q = r0
        L_0x050a:
            int r0 = r15.L
            int r1 = r15.N
            int r2 = r15.P
            float r6 = r15.R
            r14.f3684r = r0
            r14.f3687u = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x051c
            r2 = 0
        L_0x051c:
            r14.f3688v = r2
            r14.f3689w = r6
            r2 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 <= 0) goto L_0x0530
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0530
            if (r0 != 0) goto L_0x0530
            r0 = 2
            r14.f3684r = r0
        L_0x0530:
            int r0 = r15.M
            int r6 = r15.O
            int r7 = r15.Q
            float r8 = r15.S
            r14.f3685s = r0
            r14.f3690x = r6
            if (r7 != r1) goto L_0x053f
            r7 = 0
        L_0x053f:
            r14.f3691y = r7
            r14.f3692z = r8
            r1 = 0
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0552
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0552
            if (r0 != 0) goto L_0x0552
            r0 = 2
            r14.f3685s = r0
            goto L_0x0553
        L_0x0552:
            r0 = 2
        L_0x0553:
            int r7 = r19 + 1
            r6 = r21
            r11 = r17
            r9 = r18
            r10 = r20
            r8 = 1
            r12 = -1
            r13 = 2
            goto L_0x01db
        L_0x0562:
            r18 = r9
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.r():boolean");
    }

    public void requestLayout() {
        this.f845i = true;
        super.requestLayout();
    }

    public void setConstraintSet(b bVar) {
        this.f847k = bVar;
    }

    public void setId(int i2) {
        this.f838b.remove(getId());
        super.setId(i2);
        this.f838b.put(getId(), this);
    }

    public void setMaxHeight(int i2) {
        if (i2 != this.f844h) {
            this.f844h = i2;
            requestLayout();
        }
    }

    public void setMaxWidth(int i2) {
        if (i2 != this.f843g) {
            this.f843g = i2;
            requestLayout();
        }
    }

    public void setMinHeight(int i2) {
        if (i2 != this.f842f) {
            this.f842f = i2;
            requestLayout();
        }
    }

    public void setMinWidth(int i2) {
        if (i2 != this.f841e) {
            this.f841e = i2;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(c cVar) {
        s.b bVar = this.f848l;
        if (bVar != null) {
            Objects.requireNonNull(bVar);
        }
    }

    public void setOptimizationLevel(int i2) {
        this.f846j = i2;
        p.f fVar = this.f840d;
        fVar.E0 = i2;
        n.d.f3442p = fVar.f0(512);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
