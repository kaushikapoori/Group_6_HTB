package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

public class b {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f916d = {0, 4, 8};

    /* renamed from: e  reason: collision with root package name */
    public static SparseIntArray f917e = new SparseIntArray();

    /* renamed from: f  reason: collision with root package name */
    public static SparseIntArray f918f = new SparseIntArray();

    /* renamed from: a  reason: collision with root package name */
    public HashMap<String, s.a> f919a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f920b = true;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<Integer, a> f921c = new HashMap<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f922a;

        /* renamed from: b  reason: collision with root package name */
        public final d f923b = new d();

        /* renamed from: c  reason: collision with root package name */
        public final c f924c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final C0005b f925d = new C0005b();

        /* renamed from: e  reason: collision with root package name */
        public final e f926e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, s.a> f927f = new HashMap<>();

        /* renamed from: g  reason: collision with root package name */
        public C0004a f928g;

        /* renamed from: androidx.constraintlayout.widget.b$a$a  reason: collision with other inner class name */
        public static class C0004a {

            /* renamed from: a  reason: collision with root package name */
            public int[] f929a = new int[10];

            /* renamed from: b  reason: collision with root package name */
            public int[] f930b = new int[10];

            /* renamed from: c  reason: collision with root package name */
            public int f931c = 0;

            /* renamed from: d  reason: collision with root package name */
            public int[] f932d = new int[10];

            /* renamed from: e  reason: collision with root package name */
            public float[] f933e = new float[10];

            /* renamed from: f  reason: collision with root package name */
            public int f934f = 0;

            /* renamed from: g  reason: collision with root package name */
            public int[] f935g = new int[5];

            /* renamed from: h  reason: collision with root package name */
            public String[] f936h = new String[5];

            /* renamed from: i  reason: collision with root package name */
            public int f937i = 0;

            /* renamed from: j  reason: collision with root package name */
            public int[] f938j = new int[4];

            /* renamed from: k  reason: collision with root package name */
            public boolean[] f939k = new boolean[4];

            /* renamed from: l  reason: collision with root package name */
            public int f940l = 0;

            public void a(int i2, float f2) {
                int i3 = this.f934f;
                int[] iArr = this.f932d;
                if (i3 >= iArr.length) {
                    this.f932d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f933e;
                    this.f933e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f932d;
                int i4 = this.f934f;
                iArr2[i4] = i2;
                float[] fArr2 = this.f933e;
                this.f934f = i4 + 1;
                fArr2[i4] = f2;
            }

            public void b(int i2, int i3) {
                int i4 = this.f931c;
                int[] iArr = this.f929a;
                if (i4 >= iArr.length) {
                    this.f929a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f930b;
                    this.f930b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f929a;
                int i5 = this.f931c;
                iArr3[i5] = i2;
                int[] iArr4 = this.f930b;
                this.f931c = i5 + 1;
                iArr4[i5] = i3;
            }

            public void c(int i2, String str) {
                int i3 = this.f937i;
                int[] iArr = this.f935g;
                if (i3 >= iArr.length) {
                    this.f935g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f936h;
                    this.f936h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f935g;
                int i4 = this.f937i;
                iArr2[i4] = i2;
                String[] strArr2 = this.f936h;
                this.f937i = i4 + 1;
                strArr2[i4] = str;
            }

            public void d(int i2, boolean z2) {
                int i3 = this.f940l;
                int[] iArr = this.f938j;
                if (i3 >= iArr.length) {
                    this.f938j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f939k;
                    this.f939k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f938j;
                int i4 = this.f940l;
                iArr2[i4] = i2;
                boolean[] zArr2 = this.f939k;
                this.f940l = i4 + 1;
                zArr2[i4] = z2;
            }
        }

        public void a(ConstraintLayout.a aVar) {
            C0005b bVar = this.f925d;
            aVar.f863e = bVar.f958i;
            aVar.f865f = bVar.f960j;
            aVar.f867g = bVar.f962k;
            aVar.f869h = bVar.f964l;
            aVar.f871i = bVar.f966m;
            aVar.f873j = bVar.f968n;
            aVar.f875k = bVar.f970o;
            aVar.f877l = bVar.f972p;
            aVar.f879m = bVar.f974q;
            aVar.f881n = bVar.f975r;
            aVar.f883o = bVar.f976s;
            aVar.f890s = bVar.f977t;
            aVar.f891t = bVar.f978u;
            aVar.f892u = bVar.f979v;
            aVar.f893v = bVar.f980w;
            aVar.leftMargin = bVar.G;
            aVar.rightMargin = bVar.H;
            aVar.topMargin = bVar.I;
            aVar.bottomMargin = bVar.J;
            aVar.A = bVar.S;
            aVar.B = bVar.R;
            aVar.f895x = bVar.O;
            aVar.f897z = bVar.Q;
            aVar.E = bVar.f981x;
            aVar.F = bVar.f982y;
            aVar.f885p = bVar.A;
            aVar.f887q = bVar.B;
            aVar.f889r = bVar.C;
            aVar.G = bVar.f983z;
            aVar.T = bVar.D;
            aVar.U = bVar.E;
            aVar.I = bVar.U;
            aVar.H = bVar.V;
            aVar.K = bVar.X;
            aVar.J = bVar.W;
            aVar.W = bVar.f967m0;
            aVar.X = bVar.f969n0;
            aVar.L = bVar.Y;
            aVar.M = bVar.Z;
            aVar.P = bVar.f943a0;
            aVar.Q = bVar.f945b0;
            aVar.N = bVar.f947c0;
            aVar.O = bVar.f949d0;
            aVar.R = bVar.f951e0;
            aVar.S = bVar.f953f0;
            aVar.V = bVar.F;
            aVar.f859c = bVar.f954g;
            aVar.f855a = bVar.f950e;
            aVar.f857b = bVar.f952f;
            aVar.width = bVar.f946c;
            aVar.height = bVar.f948d;
            String str = bVar.f965l0;
            if (str != null) {
                aVar.Y = str;
            }
            aVar.Z = bVar.f973p0;
            aVar.setMarginStart(bVar.L);
            aVar.setMarginEnd(this.f925d.K);
            aVar.a();
        }

        public final void b(int i2, ConstraintLayout.a aVar) {
            this.f922a = i2;
            C0005b bVar = this.f925d;
            bVar.f958i = aVar.f863e;
            bVar.f960j = aVar.f865f;
            bVar.f962k = aVar.f867g;
            bVar.f964l = aVar.f869h;
            bVar.f966m = aVar.f871i;
            bVar.f968n = aVar.f873j;
            bVar.f970o = aVar.f875k;
            bVar.f972p = aVar.f877l;
            bVar.f974q = aVar.f879m;
            bVar.f975r = aVar.f881n;
            bVar.f976s = aVar.f883o;
            bVar.f977t = aVar.f890s;
            bVar.f978u = aVar.f891t;
            bVar.f979v = aVar.f892u;
            bVar.f980w = aVar.f893v;
            bVar.f981x = aVar.E;
            bVar.f982y = aVar.F;
            bVar.f983z = aVar.G;
            bVar.A = aVar.f885p;
            bVar.B = aVar.f887q;
            bVar.C = aVar.f889r;
            bVar.D = aVar.T;
            bVar.E = aVar.U;
            bVar.F = aVar.V;
            bVar.f954g = aVar.f859c;
            bVar.f950e = aVar.f855a;
            bVar.f952f = aVar.f857b;
            bVar.f946c = aVar.width;
            bVar.f948d = aVar.height;
            bVar.G = aVar.leftMargin;
            bVar.H = aVar.rightMargin;
            bVar.I = aVar.topMargin;
            bVar.J = aVar.bottomMargin;
            bVar.M = aVar.D;
            bVar.U = aVar.I;
            bVar.V = aVar.H;
            bVar.X = aVar.K;
            bVar.W = aVar.J;
            bVar.f967m0 = aVar.W;
            bVar.f969n0 = aVar.X;
            bVar.Y = aVar.L;
            bVar.Z = aVar.M;
            bVar.f943a0 = aVar.P;
            bVar.f945b0 = aVar.Q;
            bVar.f947c0 = aVar.N;
            bVar.f949d0 = aVar.O;
            bVar.f951e0 = aVar.R;
            bVar.f953f0 = aVar.S;
            bVar.f965l0 = aVar.Y;
            bVar.O = aVar.f895x;
            bVar.Q = aVar.f897z;
            bVar.N = aVar.f894w;
            bVar.P = aVar.f896y;
            bVar.S = aVar.A;
            bVar.R = aVar.B;
            bVar.T = aVar.C;
            bVar.f973p0 = aVar.Z;
            bVar.K = aVar.getMarginEnd();
            this.f925d.L = aVar.getMarginStart();
        }

        public final void c(int i2, c.a aVar) {
            b(i2, aVar);
            this.f923b.f1002d = aVar.f1020r0;
            e eVar = this.f926e;
            eVar.f1006b = aVar.f1023u0;
            eVar.f1007c = aVar.f1024v0;
            eVar.f1008d = aVar.f1025w0;
            eVar.f1009e = aVar.f1026x0;
            eVar.f1010f = aVar.f1027y0;
            eVar.f1011g = aVar.f1028z0;
            eVar.f1012h = aVar.A0;
            eVar.f1014j = aVar.B0;
            eVar.f1015k = aVar.C0;
            eVar.f1016l = aVar.D0;
            eVar.f1018n = aVar.f1022t0;
            eVar.f1017m = aVar.f1021s0;
        }

        public Object clone() {
            a aVar = new a();
            C0005b bVar = aVar.f925d;
            C0005b bVar2 = this.f925d;
            Objects.requireNonNull(bVar);
            bVar.f942a = bVar2.f942a;
            bVar.f946c = bVar2.f946c;
            bVar.f944b = bVar2.f944b;
            bVar.f948d = bVar2.f948d;
            bVar.f950e = bVar2.f950e;
            bVar.f952f = bVar2.f952f;
            bVar.f954g = bVar2.f954g;
            bVar.f956h = bVar2.f956h;
            bVar.f958i = bVar2.f958i;
            bVar.f960j = bVar2.f960j;
            bVar.f962k = bVar2.f962k;
            bVar.f964l = bVar2.f964l;
            bVar.f966m = bVar2.f966m;
            bVar.f968n = bVar2.f968n;
            bVar.f970o = bVar2.f970o;
            bVar.f972p = bVar2.f972p;
            bVar.f974q = bVar2.f974q;
            bVar.f975r = bVar2.f975r;
            bVar.f976s = bVar2.f976s;
            bVar.f977t = bVar2.f977t;
            bVar.f978u = bVar2.f978u;
            bVar.f979v = bVar2.f979v;
            bVar.f980w = bVar2.f980w;
            bVar.f981x = bVar2.f981x;
            bVar.f982y = bVar2.f982y;
            bVar.f983z = bVar2.f983z;
            bVar.A = bVar2.A;
            bVar.B = bVar2.B;
            bVar.C = bVar2.C;
            bVar.D = bVar2.D;
            bVar.E = bVar2.E;
            bVar.F = bVar2.F;
            bVar.G = bVar2.G;
            bVar.H = bVar2.H;
            bVar.I = bVar2.I;
            bVar.J = bVar2.J;
            bVar.K = bVar2.K;
            bVar.L = bVar2.L;
            bVar.M = bVar2.M;
            bVar.N = bVar2.N;
            bVar.O = bVar2.O;
            bVar.P = bVar2.P;
            bVar.Q = bVar2.Q;
            bVar.R = bVar2.R;
            bVar.S = bVar2.S;
            bVar.T = bVar2.T;
            bVar.U = bVar2.U;
            bVar.V = bVar2.V;
            bVar.W = bVar2.W;
            bVar.X = bVar2.X;
            bVar.Y = bVar2.Y;
            bVar.Z = bVar2.Z;
            bVar.f943a0 = bVar2.f943a0;
            bVar.f945b0 = bVar2.f945b0;
            bVar.f947c0 = bVar2.f947c0;
            bVar.f949d0 = bVar2.f949d0;
            bVar.f951e0 = bVar2.f951e0;
            bVar.f953f0 = bVar2.f953f0;
            bVar.f955g0 = bVar2.f955g0;
            bVar.f957h0 = bVar2.f957h0;
            bVar.f959i0 = bVar2.f959i0;
            bVar.f965l0 = bVar2.f965l0;
            int[] iArr = bVar2.f961j0;
            if (iArr == null || bVar2.f963k0 != null) {
                bVar.f961j0 = null;
            } else {
                bVar.f961j0 = Arrays.copyOf(iArr, iArr.length);
            }
            bVar.f963k0 = bVar2.f963k0;
            bVar.f967m0 = bVar2.f967m0;
            bVar.f969n0 = bVar2.f969n0;
            bVar.f971o0 = bVar2.f971o0;
            bVar.f973p0 = bVar2.f973p0;
            c cVar = aVar.f924c;
            c cVar2 = this.f924c;
            Objects.requireNonNull(cVar);
            cVar.f985a = cVar2.f985a;
            cVar.f986b = cVar2.f986b;
            cVar.f988d = cVar2.f988d;
            cVar.f989e = cVar2.f989e;
            cVar.f990f = cVar2.f990f;
            cVar.f993i = cVar2.f993i;
            cVar.f991g = cVar2.f991g;
            cVar.f992h = cVar2.f992h;
            d dVar = aVar.f923b;
            d dVar2 = this.f923b;
            Objects.requireNonNull(dVar);
            dVar.f999a = dVar2.f999a;
            dVar.f1000b = dVar2.f1000b;
            dVar.f1002d = dVar2.f1002d;
            dVar.f1003e = dVar2.f1003e;
            dVar.f1001c = dVar2.f1001c;
            e eVar = aVar.f926e;
            e eVar2 = this.f926e;
            Objects.requireNonNull(eVar);
            eVar.f1005a = eVar2.f1005a;
            eVar.f1006b = eVar2.f1006b;
            eVar.f1007c = eVar2.f1007c;
            eVar.f1008d = eVar2.f1008d;
            eVar.f1009e = eVar2.f1009e;
            eVar.f1010f = eVar2.f1010f;
            eVar.f1011g = eVar2.f1011g;
            eVar.f1012h = eVar2.f1012h;
            eVar.f1013i = eVar2.f1013i;
            eVar.f1014j = eVar2.f1014j;
            eVar.f1015k = eVar2.f1015k;
            eVar.f1016l = eVar2.f1016l;
            eVar.f1017m = eVar2.f1017m;
            eVar.f1018n = eVar2.f1018n;
            aVar.f922a = this.f922a;
            aVar.f928g = this.f928g;
            return aVar;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    public static class C0005b {

        /* renamed from: q0  reason: collision with root package name */
        public static SparseIntArray f941q0;
        public int A = -1;
        public int B = 0;
        public float C = 0.0f;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = 0;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = Integer.MIN_VALUE;
        public int O = Integer.MIN_VALUE;
        public int P = Integer.MIN_VALUE;
        public int Q = Integer.MIN_VALUE;
        public int R = Integer.MIN_VALUE;
        public int S = Integer.MIN_VALUE;
        public int T = Integer.MIN_VALUE;
        public float U = -1.0f;
        public float V = -1.0f;
        public int W = 0;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* renamed from: a  reason: collision with root package name */
        public boolean f942a = false;

        /* renamed from: a0  reason: collision with root package name */
        public int f943a0 = 0;

        /* renamed from: b  reason: collision with root package name */
        public boolean f944b = false;

        /* renamed from: b0  reason: collision with root package name */
        public int f945b0 = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f946c;

        /* renamed from: c0  reason: collision with root package name */
        public int f947c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f948d;

        /* renamed from: d0  reason: collision with root package name */
        public int f949d0 = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f950e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public float f951e0 = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public int f952f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public float f953f0 = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f954g = -1.0f;

        /* renamed from: g0  reason: collision with root package name */
        public int f955g0 = -1;

        /* renamed from: h  reason: collision with root package name */
        public boolean f956h = true;

        /* renamed from: h0  reason: collision with root package name */
        public int f957h0 = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f958i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public int f959i0 = -1;

        /* renamed from: j  reason: collision with root package name */
        public int f960j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public int[] f961j0;

        /* renamed from: k  reason: collision with root package name */
        public int f962k = -1;

        /* renamed from: k0  reason: collision with root package name */
        public String f963k0;

        /* renamed from: l  reason: collision with root package name */
        public int f964l = -1;

        /* renamed from: l0  reason: collision with root package name */
        public String f965l0;

        /* renamed from: m  reason: collision with root package name */
        public int f966m = -1;

        /* renamed from: m0  reason: collision with root package name */
        public boolean f967m0 = false;

        /* renamed from: n  reason: collision with root package name */
        public int f968n = -1;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f969n0 = false;

        /* renamed from: o  reason: collision with root package name */
        public int f970o = -1;

        /* renamed from: o0  reason: collision with root package name */
        public boolean f971o0 = true;

        /* renamed from: p  reason: collision with root package name */
        public int f972p = -1;

        /* renamed from: p0  reason: collision with root package name */
        public int f973p0 = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f974q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f975r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f976s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f977t = -1;

        /* renamed from: u  reason: collision with root package name */
        public int f978u = -1;

        /* renamed from: v  reason: collision with root package name */
        public int f979v = -1;

        /* renamed from: w  reason: collision with root package name */
        public int f980w = -1;

        /* renamed from: x  reason: collision with root package name */
        public float f981x = 0.5f;

        /* renamed from: y  reason: collision with root package name */
        public float f982y = 0.5f;

        /* renamed from: z  reason: collision with root package name */
        public String f983z = null;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f941q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            f941q0.append(44, 25);
            f941q0.append(46, 28);
            f941q0.append(47, 29);
            f941q0.append(52, 35);
            f941q0.append(51, 34);
            f941q0.append(24, 4);
            f941q0.append(23, 3);
            f941q0.append(19, 1);
            f941q0.append(61, 6);
            f941q0.append(62, 7);
            f941q0.append(31, 17);
            f941q0.append(32, 18);
            f941q0.append(33, 19);
            f941q0.append(15, 90);
            f941q0.append(0, 26);
            f941q0.append(48, 31);
            f941q0.append(49, 32);
            f941q0.append(30, 10);
            f941q0.append(29, 9);
            f941q0.append(66, 13);
            f941q0.append(69, 16);
            f941q0.append(67, 14);
            f941q0.append(64, 11);
            f941q0.append(68, 15);
            f941q0.append(65, 12);
            f941q0.append(55, 38);
            f941q0.append(41, 37);
            f941q0.append(40, 39);
            f941q0.append(54, 40);
            f941q0.append(39, 20);
            f941q0.append(53, 36);
            f941q0.append(28, 5);
            f941q0.append(42, 91);
            f941q0.append(50, 91);
            f941q0.append(45, 91);
            f941q0.append(22, 91);
            f941q0.append(18, 91);
            f941q0.append(3, 23);
            f941q0.append(5, 27);
            f941q0.append(7, 30);
            f941q0.append(8, 8);
            f941q0.append(4, 33);
            f941q0.append(6, 2);
            f941q0.append(1, 22);
            f941q0.append(2, 21);
            f941q0.append(56, 41);
            f941q0.append(34, 42);
            f941q0.append(17, 41);
            f941q0.append(16, 42);
            f941q0.append(71, 76);
            f941q0.append(25, 61);
            f941q0.append(27, 62);
            f941q0.append(26, 63);
            f941q0.append(60, 69);
            f941q0.append(38, 70);
            f941q0.append(12, 71);
            f941q0.append(10, 72);
            f941q0.append(11, 73);
            f941q0.append(13, 74);
            f941q0.append(9, 75);
        }

        public void a(Context context, AttributeSet attributeSet) {
            String str;
            StringBuilder sb;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.e.f3868f);
            this.f944b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = f941q0.get(index);
                switch (i3) {
                    case 1:
                        int i4 = this.f974q;
                        int[] iArr = b.f916d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i4);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f974q = resourceId;
                        break;
                    case 2:
                        this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 3:
                        int i5 = this.f972p;
                        int[] iArr2 = b.f916d;
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, i5);
                        if (resourceId2 == -1) {
                            resourceId2 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f972p = resourceId2;
                        break;
                    case 4:
                        int i6 = this.f970o;
                        int[] iArr3 = b.f916d;
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, i6);
                        if (resourceId3 == -1) {
                            resourceId3 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f970o = resourceId3;
                        break;
                    case 5:
                        this.f983z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                        break;
                    case 7:
                        this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 8:
                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 9:
                        int i7 = this.f980w;
                        int[] iArr4 = b.f916d;
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, i7);
                        if (resourceId4 == -1) {
                            resourceId4 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f980w = resourceId4;
                        break;
                    case 10:
                        int i8 = this.f979v;
                        int[] iArr5 = b.f916d;
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, i8);
                        if (resourceId5 == -1) {
                            resourceId5 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f979v = resourceId5;
                        break;
                    case 11:
                        this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 12:
                        this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 13:
                        this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 14:
                        this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 15:
                        this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 16:
                        this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 17:
                        this.f950e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f950e);
                        break;
                    case 18:
                        this.f952f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f952f);
                        break;
                    case 19:
                        this.f954g = obtainStyledAttributes.getFloat(index, this.f954g);
                        break;
                    case 20:
                        this.f981x = obtainStyledAttributes.getFloat(index, this.f981x);
                        break;
                    case 21:
                        this.f948d = obtainStyledAttributes.getLayoutDimension(index, this.f948d);
                        break;
                    case 22:
                        this.f946c = obtainStyledAttributes.getLayoutDimension(index, this.f946c);
                        break;
                    case 23:
                        this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 24:
                        int i9 = this.f958i;
                        int[] iArr6 = b.f916d;
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, i9);
                        if (resourceId6 == -1) {
                            resourceId6 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f958i = resourceId6;
                        break;
                    case 25:
                        int i10 = this.f960j;
                        int[] iArr7 = b.f916d;
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, i10);
                        if (resourceId7 == -1) {
                            resourceId7 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f960j = resourceId7;
                        break;
                    case 26:
                        this.F = obtainStyledAttributes.getInt(index, this.F);
                        break;
                    case 27:
                        this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 28:
                        int i11 = this.f962k;
                        int[] iArr8 = b.f916d;
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, i11);
                        if (resourceId8 == -1) {
                            resourceId8 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f962k = resourceId8;
                        break;
                    case 29:
                        int i12 = this.f964l;
                        int[] iArr9 = b.f916d;
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, i12);
                        if (resourceId9 == -1) {
                            resourceId9 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f964l = resourceId9;
                        break;
                    case 30:
                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 31:
                        int i13 = this.f977t;
                        int[] iArr10 = b.f916d;
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, i13);
                        if (resourceId10 == -1) {
                            resourceId10 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f977t = resourceId10;
                        break;
                    case 32:
                        int i14 = this.f978u;
                        int[] iArr11 = b.f916d;
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, i14);
                        if (resourceId11 == -1) {
                            resourceId11 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f978u = resourceId11;
                        break;
                    case 33:
                        this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 34:
                        int i15 = this.f968n;
                        int[] iArr12 = b.f916d;
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, i15);
                        if (resourceId12 == -1) {
                            resourceId12 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f968n = resourceId12;
                        break;
                    case 35:
                        int i16 = this.f966m;
                        int[] iArr13 = b.f916d;
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, i16);
                        if (resourceId13 == -1) {
                            resourceId13 = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f966m = resourceId13;
                        break;
                    case 36:
                        this.f982y = obtainStyledAttributes.getFloat(index, this.f982y);
                        break;
                    case 37:
                        this.V = obtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 38:
                        this.U = obtainStyledAttributes.getFloat(index, this.U);
                        break;
                    case 39:
                        this.W = obtainStyledAttributes.getInt(index, this.W);
                        break;
                    case 40:
                        this.X = obtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 41:
                        b.g(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        b.g(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i3) {
                            case 61:
                                int i17 = this.A;
                                int[] iArr14 = b.f916d;
                                int resourceId14 = obtainStyledAttributes.getResourceId(index, i17);
                                if (resourceId14 == -1) {
                                    resourceId14 = obtainStyledAttributes.getInt(index, -1);
                                }
                                this.A = resourceId14;
                                break;
                            case 62:
                                this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                break;
                            case 63:
                                this.C = obtainStyledAttributes.getFloat(index, this.C);
                                break;
                            default:
                                switch (i3) {
                                    case 69:
                                        this.f951e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.f953f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        continue;
                                    case 72:
                                        this.f955g0 = obtainStyledAttributes.getInt(index, this.f955g0);
                                        continue;
                                    case 73:
                                        this.f957h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f957h0);
                                        continue;
                                    case 74:
                                        this.f963k0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.f971o0 = obtainStyledAttributes.getBoolean(index, this.f971o0);
                                        continue;
                                    case 76:
                                        this.f973p0 = obtainStyledAttributes.getInt(index, this.f973p0);
                                        continue;
                                    case 77:
                                        int i18 = this.f975r;
                                        int[] iArr15 = b.f916d;
                                        int resourceId15 = obtainStyledAttributes.getResourceId(index, i18);
                                        if (resourceId15 == -1) {
                                            resourceId15 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.f975r = resourceId15;
                                        continue;
                                    case 78:
                                        int i19 = this.f976s;
                                        int[] iArr16 = b.f916d;
                                        int resourceId16 = obtainStyledAttributes.getResourceId(index, i19);
                                        if (resourceId16 == -1) {
                                            resourceId16 = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        this.f976s = resourceId16;
                                        continue;
                                    case 79:
                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                        continue;
                                    case 80:
                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                        continue;
                                    case 81:
                                        this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                        continue;
                                    case 82:
                                        this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                        continue;
                                    case 83:
                                        this.f945b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f945b0);
                                        continue;
                                    case 84:
                                        this.f943a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f943a0);
                                        continue;
                                    case 85:
                                        this.f949d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f949d0);
                                        continue;
                                    case 86:
                                        this.f947c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f947c0);
                                        continue;
                                    case 87:
                                        this.f967m0 = obtainStyledAttributes.getBoolean(index, this.f967m0);
                                        continue;
                                    case 88:
                                        this.f969n0 = obtainStyledAttributes.getBoolean(index, this.f969n0);
                                        continue;
                                    case 89:
                                        this.f965l0 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.f956h = obtainStyledAttributes.getBoolean(index, this.f956h);
                                        continue;
                                    case 91:
                                        sb = new StringBuilder();
                                        str = "unused attribute 0x";
                                        break;
                                    default:
                                        sb = new StringBuilder();
                                        str = "Unknown attribute 0x";
                                        break;
                                }
                                sb.append(str);
                                sb.append(Integer.toHexString(index));
                                sb.append("   ");
                                sb.append(f941q0.get(index));
                                Log.w("ConstraintSet", sb.toString());
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: o  reason: collision with root package name */
        public static SparseIntArray f984o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f985a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f986b = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f987c = 0;

        /* renamed from: d  reason: collision with root package name */
        public String f988d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f989e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f990f = 0;

        /* renamed from: g  reason: collision with root package name */
        public float f991g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public int f992h = -1;

        /* renamed from: i  reason: collision with root package name */
        public float f993i = Float.NaN;

        /* renamed from: j  reason: collision with root package name */
        public float f994j = Float.NaN;

        /* renamed from: k  reason: collision with root package name */
        public int f995k = -1;

        /* renamed from: l  reason: collision with root package name */
        public String f996l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f997m = -3;

        /* renamed from: n  reason: collision with root package name */
        public int f998n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f984o = sparseIntArray;
            sparseIntArray.append(3, 1);
            f984o.append(5, 2);
            f984o.append(9, 3);
            f984o.append(2, 4);
            f984o.append(1, 5);
            f984o.append(0, 6);
            f984o.append(4, 7);
            f984o.append(8, 8);
            f984o.append(7, 9);
            f984o.append(6, 10);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.e.f3869g);
            this.f985a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (f984o.get(index)) {
                    case 1:
                        this.f993i = obtainStyledAttributes.getFloat(index, this.f993i);
                        break;
                    case 2:
                        this.f989e = obtainStyledAttributes.getInt(index, this.f989e);
                        break;
                    case 3:
                        this.f988d = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : o.a.f3490c[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f990f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        int i3 = this.f986b;
                        int[] iArr = b.f916d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f986b = resourceId;
                        break;
                    case 6:
                        this.f987c = obtainStyledAttributes.getInteger(index, this.f987c);
                        break;
                    case 7:
                        this.f991g = obtainStyledAttributes.getFloat(index, this.f991g);
                        break;
                    case 8:
                        this.f995k = obtainStyledAttributes.getInteger(index, this.f995k);
                        break;
                    case 9:
                        this.f994j = obtainStyledAttributes.getFloat(index, this.f994j);
                        break;
                    case 10:
                        int i4 = obtainStyledAttributes.peekValue(index).type;
                        if (i4 != 1) {
                            if (i4 != 3) {
                                this.f997m = obtainStyledAttributes.getInteger(index, this.f998n);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f996l = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f997m = -1;
                                    break;
                                } else {
                                    this.f998n = obtainStyledAttributes.getResourceId(index, -1);
                                }
                            }
                        } else {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            this.f998n = resourceId2;
                            if (resourceId2 == -1) {
                                break;
                            }
                        }
                        this.f997m = -2;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f999a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1000b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f1001c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f1002d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1003e = Float.NaN;

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.e.f3871i);
            this.f999a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.f1002d = obtainStyledAttributes.getFloat(index, this.f1002d);
                } else if (index == 0) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f1000b);
                    this.f1000b = i3;
                    int[] iArr = b.f916d;
                    this.f1000b = b.f916d[i3];
                } else if (index == 4) {
                    this.f1001c = obtainStyledAttributes.getInt(index, this.f1001c);
                } else if (index == 3) {
                    this.f1003e = obtainStyledAttributes.getFloat(index, this.f1003e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: o  reason: collision with root package name */
        public static SparseIntArray f1004o;

        /* renamed from: a  reason: collision with root package name */
        public boolean f1005a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f1006b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1007c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f1008d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f1009e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f1010f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1011g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f1012h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public int f1013i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f1014j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f1015k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f1016l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1017m = false;

        /* renamed from: n  reason: collision with root package name */
        public float f1018n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1004o = sparseIntArray;
            sparseIntArray.append(6, 1);
            f1004o.append(7, 2);
            f1004o.append(8, 3);
            f1004o.append(4, 4);
            f1004o.append(5, 5);
            f1004o.append(0, 6);
            f1004o.append(1, 7);
            f1004o.append(2, 8);
            f1004o.append(3, 9);
            f1004o.append(9, 10);
            f1004o.append(10, 11);
            f1004o.append(11, 12);
        }

        public void a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s.e.f3873k);
            this.f1005a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (f1004o.get(index)) {
                    case 1:
                        this.f1006b = obtainStyledAttributes.getFloat(index, this.f1006b);
                        break;
                    case 2:
                        this.f1007c = obtainStyledAttributes.getFloat(index, this.f1007c);
                        break;
                    case 3:
                        this.f1008d = obtainStyledAttributes.getFloat(index, this.f1008d);
                        break;
                    case 4:
                        this.f1009e = obtainStyledAttributes.getFloat(index, this.f1009e);
                        break;
                    case 5:
                        this.f1010f = obtainStyledAttributes.getFloat(index, this.f1010f);
                        break;
                    case 6:
                        this.f1011g = obtainStyledAttributes.getDimension(index, this.f1011g);
                        break;
                    case 7:
                        this.f1012h = obtainStyledAttributes.getDimension(index, this.f1012h);
                        break;
                    case 8:
                        this.f1014j = obtainStyledAttributes.getDimension(index, this.f1014j);
                        break;
                    case 9:
                        this.f1015k = obtainStyledAttributes.getDimension(index, this.f1015k);
                        break;
                    case 10:
                        this.f1016l = obtainStyledAttributes.getDimension(index, this.f1016l);
                        break;
                    case 11:
                        this.f1017m = true;
                        this.f1018n = obtainStyledAttributes.getDimension(index, this.f1018n);
                        break;
                    case 12:
                        int i3 = this.f1013i;
                        int[] iArr = b.f916d;
                        int resourceId = obtainStyledAttributes.getResourceId(index, i3);
                        if (resourceId == -1) {
                            resourceId = obtainStyledAttributes.getInt(index, -1);
                        }
                        this.f1013i = resourceId;
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f917e.append(82, 25);
        f917e.append(83, 26);
        f917e.append(85, 29);
        f917e.append(86, 30);
        f917e.append(92, 36);
        f917e.append(91, 35);
        f917e.append(63, 4);
        f917e.append(62, 3);
        f917e.append(58, 1);
        f917e.append(60, 91);
        f917e.append(59, 92);
        f917e.append(101, 6);
        f917e.append(102, 7);
        f917e.append(70, 17);
        f917e.append(71, 18);
        f917e.append(72, 19);
        f917e.append(54, 99);
        f917e.append(0, 27);
        f917e.append(87, 32);
        f917e.append(88, 33);
        f917e.append(69, 10);
        f917e.append(68, 9);
        f917e.append(106, 13);
        f917e.append(109, 16);
        f917e.append(107, 14);
        f917e.append(104, 11);
        f917e.append(108, 15);
        f917e.append(105, 12);
        f917e.append(95, 40);
        f917e.append(80, 39);
        f917e.append(79, 41);
        f917e.append(94, 42);
        f917e.append(78, 20);
        f917e.append(93, 37);
        f917e.append(67, 5);
        f917e.append(81, 87);
        f917e.append(90, 87);
        f917e.append(84, 87);
        f917e.append(61, 87);
        f917e.append(57, 87);
        f917e.append(5, 24);
        f917e.append(7, 28);
        f917e.append(23, 31);
        f917e.append(24, 8);
        f917e.append(6, 34);
        f917e.append(8, 2);
        f917e.append(3, 23);
        f917e.append(4, 21);
        f917e.append(96, 95);
        f917e.append(73, 96);
        f917e.append(2, 22);
        f917e.append(13, 43);
        f917e.append(26, 44);
        f917e.append(21, 45);
        f917e.append(22, 46);
        f917e.append(20, 60);
        f917e.append(18, 47);
        f917e.append(19, 48);
        f917e.append(14, 49);
        f917e.append(15, 50);
        f917e.append(16, 51);
        f917e.append(17, 52);
        f917e.append(25, 53);
        f917e.append(97, 54);
        f917e.append(74, 55);
        f917e.append(98, 56);
        f917e.append(75, 57);
        f917e.append(99, 58);
        f917e.append(76, 59);
        f917e.append(64, 61);
        f917e.append(66, 62);
        f917e.append(65, 63);
        f917e.append(28, 64);
        f917e.append(121, 65);
        f917e.append(35, 66);
        f917e.append(122, 67);
        f917e.append(113, 79);
        f917e.append(1, 38);
        f917e.append(112, 68);
        f917e.append(100, 69);
        f917e.append(77, 70);
        f917e.append(111, 97);
        f917e.append(32, 71);
        f917e.append(30, 72);
        f917e.append(31, 73);
        f917e.append(33, 74);
        f917e.append(29, 75);
        f917e.append(114, 76);
        f917e.append(89, 77);
        f917e.append(123, 78);
        f917e.append(56, 80);
        f917e.append(55, 81);
        f917e.append(116, 82);
        f917e.append(120, 83);
        f917e.append(119, 84);
        f917e.append(118, 85);
        f917e.append(117, 86);
        f918f.append(85, 6);
        f918f.append(85, 7);
        f918f.append(0, 27);
        f918f.append(89, 13);
        f918f.append(92, 16);
        f918f.append(90, 14);
        f918f.append(87, 11);
        f918f.append(91, 15);
        f918f.append(88, 12);
        f918f.append(78, 40);
        f918f.append(71, 39);
        f918f.append(70, 41);
        f918f.append(77, 42);
        f918f.append(69, 20);
        f918f.append(76, 37);
        f918f.append(60, 5);
        f918f.append(72, 87);
        f918f.append(75, 87);
        f918f.append(73, 87);
        f918f.append(57, 87);
        f918f.append(56, 87);
        f918f.append(5, 24);
        f918f.append(7, 28);
        f918f.append(23, 31);
        f918f.append(24, 8);
        f918f.append(6, 34);
        f918f.append(8, 2);
        f918f.append(3, 23);
        f918f.append(4, 21);
        f918f.append(79, 95);
        f918f.append(64, 96);
        f918f.append(2, 22);
        f918f.append(13, 43);
        f918f.append(26, 44);
        f918f.append(21, 45);
        f918f.append(22, 46);
        f918f.append(20, 60);
        f918f.append(18, 47);
        f918f.append(19, 48);
        f918f.append(14, 49);
        f918f.append(15, 50);
        f918f.append(16, 51);
        f918f.append(17, 52);
        f918f.append(25, 53);
        f918f.append(80, 54);
        f918f.append(65, 55);
        f918f.append(81, 56);
        f918f.append(66, 57);
        f918f.append(82, 58);
        f918f.append(67, 59);
        f918f.append(59, 62);
        f918f.append(58, 63);
        f918f.append(28, 64);
        f918f.append(105, 65);
        f918f.append(34, 66);
        f918f.append(106, 67);
        f918f.append(96, 79);
        f918f.append(1, 38);
        f918f.append(97, 98);
        f918f.append(95, 68);
        f918f.append(83, 69);
        f918f.append(68, 70);
        f918f.append(32, 71);
        f918f.append(30, 72);
        f918f.append(31, 73);
        f918f.append(33, 74);
        f918f.append(29, 75);
        f918f.append(98, 76);
        f918f.append(74, 77);
        f918f.append(107, 78);
        f918f.append(55, 80);
        f918f.append(54, 81);
        f918f.append(100, 82);
        f918f.append(104, 83);
        f918f.append(103, 84);
        f918f.append(102, 85);
        f918f.append(101, 86);
        f918f.append(94, 97);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r9.peekValue(r10)
            int r0 = r0.type
            r1 = 3
            r2 = 21
            r3 = 23
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 0
            if (r0 == r1) goto L_0x0068
            r1 = -2
            if (r0 == r6) goto L_0x0027
            int r9 = r9.getInt(r10, r7)
            r10 = -4
            if (r9 == r10) goto L_0x002d
            r10 = -3
            if (r9 == r10) goto L_0x0025
            if (r9 == r1) goto L_0x002b
            if (r9 == r5) goto L_0x002b
        L_0x0025:
            r1 = 0
            goto L_0x002c
        L_0x0027:
            int r9 = r9.getDimensionPixelSize(r10, r7)
        L_0x002b:
            r1 = r9
        L_0x002c:
            r4 = 0
        L_0x002d:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r9 == 0) goto L_0x003f
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            if (r11 != 0) goto L_0x003a
            r8.width = r1
            r8.W = r4
            goto L_0x0067
        L_0x003a:
            r8.height = r1
            r8.X = r4
            goto L_0x0067
        L_0x003f:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.b.C0005b
            if (r9 == 0) goto L_0x0051
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0005b) r8
            if (r11 != 0) goto L_0x004c
            r8.f946c = r1
            r8.f967m0 = r4
            goto L_0x0067
        L_0x004c:
            r8.f948d = r1
            r8.f969n0 = r4
            goto L_0x0067
        L_0x0051:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.b.a.C0004a
            if (r9 == 0) goto L_0x0067
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0004a) r8
            if (r11 != 0) goto L_0x005f
            r8.b(r3, r1)
            r9 = 80
            goto L_0x0064
        L_0x005f:
            r8.b(r2, r1)
            r9 = 81
        L_0x0064:
            r8.d(r9, r4)
        L_0x0067:
            return
        L_0x0068:
            java.lang.String r9 = r9.getString(r10)
            if (r9 != 0) goto L_0x0070
            goto L_0x016a
        L_0x0070:
            r10 = 61
            int r10 = r9.indexOf(r10)
            int r0 = r9.length()
            if (r10 <= 0) goto L_0x016a
            int r0 = r0 + r5
            if (r10 >= r0) goto L_0x016a
            java.lang.String r0 = r9.substring(r7, r10)
            int r10 = r10 + r4
            java.lang.String r9 = r9.substring(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L_0x016a
            java.lang.String r10 = r0.trim()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x00c5
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a
            if (r10 == 0) goto L_0x00b0
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8
            if (r11 != 0) goto L_0x00a9
            r8.width = r7
            goto L_0x00ab
        L_0x00a9:
            r8.height = r7
        L_0x00ab:
            h(r8, r9)
            goto L_0x016a
        L_0x00b0:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.C0005b
            if (r10 == 0) goto L_0x00ba
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0005b) r8
            r8.f983z = r9
            goto L_0x016a
        L_0x00ba:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.a.C0004a
            if (r10 == 0) goto L_0x016a
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0004a) r8
            r8.c(r6, r9)
            goto L_0x016a
        L_0x00c5:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0110
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x016a }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a     // Catch:{ NumberFormatException -> 0x016a }
            if (r10 == 0) goto L_0x00e5
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8     // Catch:{ NumberFormatException -> 0x016a }
            if (r11 != 0) goto L_0x00df
            r8.width = r7     // Catch:{ NumberFormatException -> 0x016a }
            r8.H = r9     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x00df:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x016a }
            r8.I = r9     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x00e5:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.C0005b     // Catch:{ NumberFormatException -> 0x016a }
            if (r10 == 0) goto L_0x00f9
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0005b) r8     // Catch:{ NumberFormatException -> 0x016a }
            if (r11 != 0) goto L_0x00f3
            r8.f946c = r7     // Catch:{ NumberFormatException -> 0x016a }
            r8.V = r9     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x00f3:
            r8.f948d = r7     // Catch:{ NumberFormatException -> 0x016a }
            r8.U = r9     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x00f9:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.a.C0004a     // Catch:{ NumberFormatException -> 0x016a }
            if (r10 == 0) goto L_0x016a
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0004a) r8     // Catch:{ NumberFormatException -> 0x016a }
            if (r11 != 0) goto L_0x0107
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x016a }
            r10 = 39
            goto L_0x010c
        L_0x0107:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x016a }
            r10 = 40
        L_0x010c:
            r8.a(r10, r9)     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x0110:
            java.lang.String r0 = "parent"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x016a
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x016a }
            float r9 = java.lang.Math.min(r10, r9)     // Catch:{ NumberFormatException -> 0x016a }
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)     // Catch:{ NumberFormatException -> 0x016a }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.a     // Catch:{ NumberFormatException -> 0x016a }
            r0 = 2
            if (r10 == 0) goto L_0x013e
            androidx.constraintlayout.widget.ConstraintLayout$a r8 = (androidx.constraintlayout.widget.ConstraintLayout.a) r8     // Catch:{ NumberFormatException -> 0x016a }
            if (r11 != 0) goto L_0x0137
            r8.width = r7     // Catch:{ NumberFormatException -> 0x016a }
            r8.R = r9     // Catch:{ NumberFormatException -> 0x016a }
            r8.L = r0     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x0137:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x016a }
            r8.S = r9     // Catch:{ NumberFormatException -> 0x016a }
            r8.M = r0     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x013e:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.b.C0005b     // Catch:{ NumberFormatException -> 0x016a }
            if (r10 == 0) goto L_0x0154
            androidx.constraintlayout.widget.b$b r8 = (androidx.constraintlayout.widget.b.C0005b) r8     // Catch:{ NumberFormatException -> 0x016a }
            if (r11 != 0) goto L_0x014d
            r8.f946c = r7     // Catch:{ NumberFormatException -> 0x016a }
            r8.f951e0 = r9     // Catch:{ NumberFormatException -> 0x016a }
            r8.Y = r0     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x014d:
            r8.f948d = r7     // Catch:{ NumberFormatException -> 0x016a }
            r8.f953f0 = r9     // Catch:{ NumberFormatException -> 0x016a }
            r8.Z = r0     // Catch:{ NumberFormatException -> 0x016a }
            goto L_0x016a
        L_0x0154:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.b.a.C0004a     // Catch:{ NumberFormatException -> 0x016a }
            if (r9 == 0) goto L_0x016a
            androidx.constraintlayout.widget.b$a$a r8 = (androidx.constraintlayout.widget.b.a.C0004a) r8     // Catch:{ NumberFormatException -> 0x016a }
            if (r11 != 0) goto L_0x0162
            r8.b(r3, r7)     // Catch:{ NumberFormatException -> 0x016a }
            r9 = 54
            goto L_0x0167
        L_0x0162:
            r8.b(r2, r7)     // Catch:{ NumberFormatException -> 0x016a }
            r9 = 55
        L_0x0167:
            r8.b(r9, r0)     // Catch:{ NumberFormatException -> 0x016a }
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.g(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static void h(ConstraintLayout.a aVar, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            int i3 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i2 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i3 = i2;
                i2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i2);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i2, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i3 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        aVar.G = str;
    }

    public void a(ConstraintLayout constraintLayout) {
        b(constraintLayout, true);
        constraintLayout.setConstraintSet((b) null);
        constraintLayout.requestLayout();
    }

    public void b(ConstraintLayout constraintLayout, boolean z2) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f921c.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.f921c.containsKey(Integer.valueOf(id))) {
                StringBuilder a2 = androidx.activity.result.a.a("id unknown ");
                a2.append(r.a.b(childAt));
                Log.w("ConstraintSet", a2.toString());
            } else if (this.f920b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f921c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.f921c.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.f925d.f959i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.f925d.f955g0);
                            barrier.setMargin(aVar.f925d.f957h0);
                            barrier.setAllowsGoneWidget(aVar.f925d.f971o0);
                            C0005b bVar = aVar.f925d;
                            int[] iArr = bVar.f961j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f963k0;
                                if (str != null) {
                                    bVar.f961j0 = d(barrier, str);
                                    barrier.setReferencedIds(aVar.f925d.f961j0);
                                }
                            }
                        }
                        ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
                        aVar2.a();
                        aVar.a(aVar2);
                        if (z2) {
                            s.a.b(childAt, aVar.f927f);
                        }
                        childAt.setLayoutParams(aVar2);
                        d dVar = aVar.f923b;
                        if (dVar.f1001c == 0) {
                            childAt.setVisibility(dVar.f1000b);
                        }
                        childAt.setAlpha(aVar.f923b.f1002d);
                        childAt.setRotation(aVar.f926e.f1006b);
                        childAt.setRotationX(aVar.f926e.f1007c);
                        childAt.setRotationY(aVar.f926e.f1008d);
                        childAt.setScaleX(aVar.f926e.f1009e);
                        childAt.setScaleY(aVar.f926e.f1010f);
                        e eVar = aVar.f926e;
                        if (eVar.f1013i != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f926e.f1013i);
                            if (findViewById != null) {
                                float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                                float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - ((float) childAt.getLeft()));
                                    childAt.setPivotY(bottom - ((float) childAt.getTop()));
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.f1011g)) {
                                childAt.setPivotX(aVar.f926e.f1011g);
                            }
                            if (!Float.isNaN(aVar.f926e.f1012h)) {
                                childAt.setPivotY(aVar.f926e.f1012h);
                            }
                        }
                        childAt.setTranslationX(aVar.f926e.f1014j);
                        childAt.setTranslationY(aVar.f926e.f1015k);
                        childAt.setTranslationZ(aVar.f926e.f1016l);
                        e eVar2 = aVar.f926e;
                        if (eVar2.f1017m) {
                            childAt.setElevation(eVar2.f1018n);
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar3 = this.f921c.get(num);
            if (aVar3 != null) {
                if (aVar3.f925d.f959i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C0005b bVar2 = aVar3.f925d;
                    int[] iArr2 = bVar2.f961j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f963k0;
                        if (str2 != null) {
                            bVar2.f961j0 = d(barrier2, str2);
                            barrier2.setReferencedIds(aVar3.f925d.f961j0);
                        }
                    }
                    barrier2.setType(aVar3.f925d.f955g0);
                    barrier2.setMargin(aVar3.f925d.f957h0);
                    ConstraintLayout.a b2 = constraintLayout.generateDefaultLayoutParams();
                    barrier2.k();
                    aVar3.a(b2);
                    constraintLayout.addView(barrier2, b2);
                }
                if (aVar3.f925d.f942a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.a b3 = constraintLayout.generateDefaultLayoutParams();
                    aVar3.a(b3);
                    constraintLayout.addView(guideline, b3);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof a) {
                ((a) childAt2).g(constraintLayout);
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        s.a aVar;
        b bVar = this;
        int childCount = constraintLayout.getChildCount();
        bVar.f921c.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.a aVar2 = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!bVar.f920b || id != -1) {
                if (!bVar.f921c.containsKey(Integer.valueOf(id))) {
                    bVar.f921c.put(Integer.valueOf(id), new a());
                }
                a aVar3 = bVar.f921c.get(Integer.valueOf(id));
                if (aVar3 != null) {
                    HashMap<String, s.a> hashMap = bVar.f919a;
                    HashMap<String, s.a> hashMap2 = new HashMap<>();
                    Class<?> cls = childAt.getClass();
                    for (String next : hashMap.keySet()) {
                        s.a aVar4 = hashMap.get(next);
                        try {
                            if (next.equals("BackgroundColor")) {
                                aVar = new s.a(aVar4, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                            } else {
                                try {
                                    aVar = new s.a(aVar4, cls.getMethod("getMap" + next, new Class[0]).invoke(childAt, new Object[0]));
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    e.printStackTrace();
                                } catch (IllegalAccessException e3) {
                                    e = e3;
                                    e.printStackTrace();
                                } catch (InvocationTargetException e4) {
                                    e = e4;
                                    e.printStackTrace();
                                }
                            }
                            hashMap2.put(next, aVar);
                        } catch (NoSuchMethodException e5) {
                            e = e5;
                            e.printStackTrace();
                        } catch (IllegalAccessException e6) {
                            e = e6;
                            e.printStackTrace();
                        } catch (InvocationTargetException e7) {
                            e = e7;
                            e.printStackTrace();
                        }
                    }
                    aVar3.f927f = hashMap2;
                    aVar3.b(id, aVar2);
                    aVar3.f923b.f1000b = childAt.getVisibility();
                    aVar3.f923b.f1002d = childAt.getAlpha();
                    aVar3.f926e.f1006b = childAt.getRotation();
                    aVar3.f926e.f1007c = childAt.getRotationX();
                    aVar3.f926e.f1008d = childAt.getRotationY();
                    aVar3.f926e.f1009e = childAt.getScaleX();
                    aVar3.f926e.f1010f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        e eVar = aVar3.f926e;
                        eVar.f1011g = pivotX;
                        eVar.f1012h = pivotY;
                    }
                    aVar3.f926e.f1014j = childAt.getTranslationX();
                    aVar3.f926e.f1015k = childAt.getTranslationY();
                    aVar3.f926e.f1016l = childAt.getTranslationZ();
                    e eVar2 = aVar3.f926e;
                    if (eVar2.f1017m) {
                        eVar2.f1018n = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar3.f925d.f971o0 = barrier.getAllowsGoneWidget();
                        aVar3.f925d.f961j0 = barrier.getReferencedIds();
                        aVar3.f925d.f955g0 = barrier.getType();
                        aVar3.f925d.f957h0 = barrier.getMargin();
                    }
                }
                i2++;
                bVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final int[] d(View view, String str) {
        int i2;
        Object c2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = s.d.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c2 = ((ConstraintLayout) view.getParent()).c(0, trim)) != null && (c2 instanceof Integer)) {
                i2 = ((Integer) c2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0308, code lost:
        r8 = r1.getLayoutDimension(r14, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x031b, code lost:
        r9 = r1.getFloat(r14, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x031f, code lost:
        r12.a(r8, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0374, code lost:
        r8 = r1.getDimensionPixelOffset(r14, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x037a, code lost:
        r12.c(r8, r1.getString(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0387, code lost:
        r8 = r1.getDimensionPixelSize(r14, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x038b, code lost:
        r15 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x038c, code lost:
        r12.b(r15, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0390, code lost:
        r8.append(r9);
        r8.append(java.lang.Integer.toHexString(r14));
        r8.append("   ");
        r8.append(f917e.get(r14));
        android.util.Log.w("ConstraintSet", r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03ad, code lost:
        r13 = r13 + 1;
        r8 = 3;
        r9 = 1;
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03e7, code lost:
        r11.append(java.lang.Integer.toHexString(r10));
        r11.append("   ");
        r11.append(f917e.get(r10));
        android.util.Log.w("ConstraintSet", r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0416, code lost:
        g(r11, r1, r10, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x091e, code lost:
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0130, code lost:
        if (r8 == -1) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013c, code lost:
        r8 = r1.getInteger(r14, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0172, code lost:
        r12.d(r9, r1.getBoolean(r14, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0199, code lost:
        r9 = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01df, code lost:
        if (r8 == -1) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e1, code lost:
        r8 = r1.getInt(r14, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x027c, code lost:
        r9 = r1.getDimension(r14, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02d9, code lost:
        r8 = r1.getInt(r14, r8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.constraintlayout.widget.b.a e(android.content.Context r17, android.util.AttributeSet r18, boolean r19) {
        /*
            r16 = this;
            androidx.constraintlayout.widget.b$a r0 = new androidx.constraintlayout.widget.b$a
            r0.<init>()
            if (r19 == 0) goto L_0x000a
            int[] r1 = s.e.f3865c
            goto L_0x000c
        L_0x000a:
            int[] r1 = s.e.f3863a
        L_0x000c:
            r2 = r17
            r3 = r18
            android.content.res.TypedArray r1 = r2.obtainStyledAttributes(r3, r1)
            java.lang.String r2 = "/"
            java.lang.String r3 = "unused attribute 0x"
            java.lang.String r4 = "CURRENTLY UNSUPPORTED"
            java.lang.String r5 = "Unknown attribute 0x"
            java.lang.String r6 = "   "
            java.lang.String r7 = "ConstraintSet"
            r8 = 3
            r9 = 1
            r10 = 0
            if (r19 == 0) goto L_0x03b4
            int r11 = r1.getIndexCount()
            androidx.constraintlayout.widget.b$a$a r12 = new androidx.constraintlayout.widget.b$a$a
            r12.<init>()
            r0.f928g = r12
            androidx.constraintlayout.widget.b$c r13 = r0.f924c
            r13.f985a = r10
            androidx.constraintlayout.widget.b$b r13 = r0.f925d
            r13.f944b = r10
            androidx.constraintlayout.widget.b$d r13 = r0.f923b
            r13.f999a = r10
            androidx.constraintlayout.widget.b$e r13 = r0.f926e
            r13.f1005a = r10
            r13 = 0
        L_0x0041:
            if (r13 >= r11) goto L_0x092b
            int r14 = r1.getIndex(r13)
            android.util.SparseIntArray r15 = f918f
            int r15 = r15.get(r14)
            switch(r15) {
                case 2: goto L_0x0382;
                case 3: goto L_0x0050;
                case 4: goto L_0x0050;
                case 5: goto L_0x0379;
                case 6: goto L_0x036e;
                case 7: goto L_0x0367;
                case 8: goto L_0x0360;
                case 9: goto L_0x0050;
                case 10: goto L_0x0050;
                case 11: goto L_0x0359;
                case 12: goto L_0x0352;
                case 13: goto L_0x034b;
                case 14: goto L_0x0344;
                case 15: goto L_0x033d;
                case 16: goto L_0x0336;
                case 17: goto L_0x032d;
                case 18: goto L_0x0324;
                case 19: goto L_0x0315;
                case 20: goto L_0x030e;
                case 21: goto L_0x0300;
                case 22: goto L_0x02f0;
                case 23: goto L_0x02e7;
                case 24: goto L_0x02df;
                case 25: goto L_0x0050;
                case 26: goto L_0x0050;
                case 27: goto L_0x02d3;
                case 28: goto L_0x02cb;
                case 29: goto L_0x0050;
                case 30: goto L_0x0050;
                case 31: goto L_0x02c3;
                case 32: goto L_0x0050;
                case 33: goto L_0x0050;
                case 34: goto L_0x02bb;
                case 35: goto L_0x0050;
                case 36: goto L_0x0050;
                case 37: goto L_0x02b4;
                case 38: goto L_0x02a8;
                case 39: goto L_0x02a0;
                case 40: goto L_0x0298;
                case 41: goto L_0x0291;
                case 42: goto L_0x028a;
                case 43: goto L_0x0282;
                case 44: goto L_0x0272;
                case 45: goto L_0x026a;
                case 46: goto L_0x0262;
                case 47: goto L_0x025a;
                case 48: goto L_0x0252;
                case 49: goto L_0x024b;
                case 50: goto L_0x0244;
                case 51: goto L_0x023d;
                case 52: goto L_0x0236;
                case 53: goto L_0x022f;
                case 54: goto L_0x0227;
                case 55: goto L_0x021f;
                case 56: goto L_0x0217;
                case 57: goto L_0x020f;
                case 58: goto L_0x0207;
                case 59: goto L_0x01ff;
                case 60: goto L_0x01f7;
                case 61: goto L_0x0050;
                case 62: goto L_0x01ef;
                case 63: goto L_0x01e7;
                case 64: goto L_0x01d4;
                case 65: goto L_0x01b6;
                case 66: goto L_0x01ad;
                case 67: goto L_0x01a5;
                case 68: goto L_0x019d;
                case 69: goto L_0x0197;
                case 70: goto L_0x0194;
                case 71: goto L_0x018f;
                case 72: goto L_0x0187;
                case 73: goto L_0x017f;
                case 74: goto L_0x017b;
                case 75: goto L_0x016c;
                case 76: goto L_0x0164;
                case 77: goto L_0x0160;
                case 78: goto L_0x0158;
                case 79: goto L_0x0150;
                case 80: goto L_0x0149;
                case 81: goto L_0x0142;
                case 82: goto L_0x0134;
                case 83: goto L_0x0125;
                case 84: goto L_0x011c;
                case 85: goto L_0x0114;
                case 86: goto L_0x00a3;
                case 87: goto L_0x009b;
                case 88: goto L_0x0050;
                case 89: goto L_0x0050;
                case 90: goto L_0x0050;
                case 91: goto L_0x0050;
                case 92: goto L_0x0050;
                case 93: goto L_0x0093;
                case 94: goto L_0x008b;
                case 95: goto L_0x0086;
                case 96: goto L_0x0081;
                case 97: goto L_0x0079;
                case 98: goto L_0x0060;
                case 99: goto L_0x0058;
                default: goto L_0x0050;
            }
        L_0x0050:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = r5
            goto L_0x0390
        L_0x0058:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            boolean r8 = r8.f956h
            r9 = 99
            goto L_0x0172
        L_0x0060:
            int r9 = r.d.P
            android.util.TypedValue r9 = r1.peekValue(r14)
            int r9 = r9.type
            if (r9 != r8) goto L_0x006f
            r1.getString(r14)
            goto L_0x03ad
        L_0x006f:
            int r8 = r0.f922a
            int r8 = r1.getResourceId(r14, r8)
            r0.f922a = r8
            goto L_0x03ad
        L_0x0079:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.f973p0
            r9 = 97
            goto L_0x02d9
        L_0x0081:
            g(r12, r1, r14, r9)
            goto L_0x03ad
        L_0x0086:
            g(r12, r1, r14, r10)
            goto L_0x03ad
        L_0x008b:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.T
            r9 = 94
            goto L_0x0387
        L_0x0093:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.M
            r9 = 93
            goto L_0x0387
        L_0x009b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = r3
            goto L_0x0390
        L_0x00a3:
            android.util.TypedValue r8 = r1.peekValue(r14)
            int r8 = r8.type
            r10 = 89
            r15 = 88
            if (r8 != r9) goto L_0x00c7
            androidx.constraintlayout.widget.b$c r8 = r0.f924c
            r9 = -1
            int r14 = r1.getResourceId(r14, r9)
            r8.f998n = r14
            androidx.constraintlayout.widget.b$c r8 = r0.f924c
            int r8 = r8.f998n
            r12.b(r10, r8)
            androidx.constraintlayout.widget.b$c r8 = r0.f924c
            int r10 = r8.f998n
            if (r10 == r9) goto L_0x03ad
        L_0x00c5:
            r9 = -2
            goto L_0x00f8
        L_0x00c7:
            r9 = 3
            if (r8 != r9) goto L_0x0104
            androidx.constraintlayout.widget.b$c r8 = r0.f924c
            java.lang.String r9 = r1.getString(r14)
            r8.f996l = r9
            r8 = 90
            androidx.constraintlayout.widget.b$c r9 = r0.f924c
            java.lang.String r9 = r9.f996l
            r12.c(r8, r9)
            androidx.constraintlayout.widget.b$c r8 = r0.f924c
            java.lang.String r8 = r8.f996l
            int r8 = r8.indexOf(r2)
            if (r8 <= 0) goto L_0x00fd
            androidx.constraintlayout.widget.b$c r8 = r0.f924c
            r9 = -1
            int r9 = r1.getResourceId(r14, r9)
            r8.f998n = r9
            androidx.constraintlayout.widget.b$c r8 = r0.f924c
            int r8 = r8.f998n
            r12.b(r10, r8)
            androidx.constraintlayout.widget.b$c r8 = r0.f924c
            goto L_0x00c5
        L_0x00f8:
            r8.f997m = r9
            r8 = -2
            goto L_0x038c
        L_0x00fd:
            r8 = -1
            androidx.constraintlayout.widget.b$c r9 = r0.f924c
            r9.f997m = r8
            goto L_0x038c
        L_0x0104:
            androidx.constraintlayout.widget.b$c r8 = r0.f924c
            int r9 = r8.f998n
            int r9 = r1.getInteger(r14, r9)
            r8.f997m = r9
            androidx.constraintlayout.widget.b$c r8 = r0.f924c
            int r8 = r8.f997m
            goto L_0x038c
        L_0x0114:
            r8 = 85
            androidx.constraintlayout.widget.b$c r9 = r0.f924c
            float r9 = r9.f994j
            goto L_0x031b
        L_0x011c:
            r8 = 84
            androidx.constraintlayout.widget.b$c r9 = r0.f924c
            int r9 = r9.f995k
            r15 = 84
            goto L_0x013c
        L_0x0125:
            r15 = 83
            androidx.constraintlayout.widget.b$e r8 = r0.f926e
            int r8 = r8.f1013i
            int r8 = r1.getResourceId(r14, r8)
            r9 = -1
            if (r8 != r9) goto L_0x038c
            goto L_0x01e1
        L_0x0134:
            r8 = 82
            androidx.constraintlayout.widget.b$c r9 = r0.f924c
            int r9 = r9.f987c
            r15 = 82
        L_0x013c:
            int r8 = r1.getInteger(r14, r9)
            goto L_0x038c
        L_0x0142:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            boolean r8 = r8.f969n0
            r9 = 81
            goto L_0x0172
        L_0x0149:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            boolean r8 = r8.f967m0
            r9 = 80
            goto L_0x0172
        L_0x0150:
            r8 = 79
            androidx.constraintlayout.widget.b$c r9 = r0.f924c
            float r9 = r9.f991g
            goto L_0x031b
        L_0x0158:
            androidx.constraintlayout.widget.b$d r8 = r0.f923b
            int r8 = r8.f1001c
            r9 = 78
            goto L_0x02d9
        L_0x0160:
            r8 = 77
            goto L_0x037a
        L_0x0164:
            androidx.constraintlayout.widget.b$c r8 = r0.f924c
            int r8 = r8.f989e
            r9 = 76
            goto L_0x02d9
        L_0x016c:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            boolean r8 = r8.f971o0
            r9 = 75
        L_0x0172:
            boolean r8 = r1.getBoolean(r14, r8)
            r12.d(r9, r8)
            goto L_0x03ad
        L_0x017b:
            r8 = 74
            goto L_0x037a
        L_0x017f:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.f957h0
            r9 = 73
            goto L_0x0387
        L_0x0187:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.f955g0
            r9 = 72
            goto L_0x02d9
        L_0x018f:
            android.util.Log.e(r7, r4)
            goto L_0x03ad
        L_0x0194:
            r8 = 70
            goto L_0x0199
        L_0x0197:
            r8 = 69
        L_0x0199:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x031b
        L_0x019d:
            r8 = 68
            androidx.constraintlayout.widget.b$d r9 = r0.f923b
            float r9 = r9.f1003e
            goto L_0x031b
        L_0x01a5:
            r8 = 67
            androidx.constraintlayout.widget.b$c r9 = r0.f924c
            float r9 = r9.f993i
            goto L_0x031b
        L_0x01ad:
            r15 = 66
            r8 = 0
            int r8 = r1.getInt(r14, r8)
            goto L_0x038c
        L_0x01b6:
            r8 = 0
            android.util.TypedValue r9 = r1.peekValue(r14)
            int r9 = r9.type
            r10 = 65
            r15 = 3
            if (r9 != r15) goto L_0x01c7
            java.lang.String r8 = r1.getString(r14)
            goto L_0x01cf
        L_0x01c7:
            java.lang.String[] r9 = o.a.f3490c
            int r8 = r1.getInteger(r14, r8)
            r8 = r9[r8]
        L_0x01cf:
            r12.c(r10, r8)
            goto L_0x03ad
        L_0x01d4:
            r15 = 64
            androidx.constraintlayout.widget.b$c r8 = r0.f924c
            int r8 = r8.f986b
            int r8 = r1.getResourceId(r14, r8)
            r9 = -1
            if (r8 != r9) goto L_0x038c
        L_0x01e1:
            int r8 = r1.getInt(r14, r9)
            goto L_0x038c
        L_0x01e7:
            r8 = 63
            androidx.constraintlayout.widget.b$b r9 = r0.f925d
            float r9 = r9.C
            goto L_0x031b
        L_0x01ef:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.B
            r9 = 62
            goto L_0x0387
        L_0x01f7:
            r8 = 60
            androidx.constraintlayout.widget.b$e r9 = r0.f926e
            float r9 = r9.f1006b
            goto L_0x031b
        L_0x01ff:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.f949d0
            r9 = 59
            goto L_0x0387
        L_0x0207:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.f947c0
            r9 = 58
            goto L_0x0387
        L_0x020f:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.f945b0
            r9 = 57
            goto L_0x0387
        L_0x0217:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.f943a0
            r9 = 56
            goto L_0x0387
        L_0x021f:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.Z
            r9 = 55
            goto L_0x02d9
        L_0x0227:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.Y
            r9 = 54
            goto L_0x02d9
        L_0x022f:
            r8 = 53
            androidx.constraintlayout.widget.b$e r9 = r0.f926e
            float r9 = r9.f1016l
            goto L_0x027c
        L_0x0236:
            r8 = 52
            androidx.constraintlayout.widget.b$e r9 = r0.f926e
            float r9 = r9.f1015k
            goto L_0x027c
        L_0x023d:
            r8 = 51
            androidx.constraintlayout.widget.b$e r9 = r0.f926e
            float r9 = r9.f1014j
            goto L_0x027c
        L_0x0244:
            r8 = 50
            androidx.constraintlayout.widget.b$e r9 = r0.f926e
            float r9 = r9.f1012h
            goto L_0x027c
        L_0x024b:
            r8 = 49
            androidx.constraintlayout.widget.b$e r9 = r0.f926e
            float r9 = r9.f1011g
            goto L_0x027c
        L_0x0252:
            r8 = 48
            androidx.constraintlayout.widget.b$e r9 = r0.f926e
            float r9 = r9.f1010f
            goto L_0x031b
        L_0x025a:
            r8 = 47
            androidx.constraintlayout.widget.b$e r9 = r0.f926e
            float r9 = r9.f1009e
            goto L_0x031b
        L_0x0262:
            r8 = 46
            androidx.constraintlayout.widget.b$e r9 = r0.f926e
            float r9 = r9.f1008d
            goto L_0x031b
        L_0x026a:
            r8 = 45
            androidx.constraintlayout.widget.b$e r9 = r0.f926e
            float r9 = r9.f1007c
            goto L_0x031b
        L_0x0272:
            r8 = 44
            r9 = 1
            r12.d(r8, r9)
            androidx.constraintlayout.widget.b$e r9 = r0.f926e
            float r9 = r9.f1018n
        L_0x027c:
            float r9 = r1.getDimension(r14, r9)
            goto L_0x031f
        L_0x0282:
            r8 = 43
            androidx.constraintlayout.widget.b$d r9 = r0.f923b
            float r9 = r9.f1002d
            goto L_0x031b
        L_0x028a:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.X
            r9 = 42
            goto L_0x02d9
        L_0x0291:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.W
            r9 = 41
            goto L_0x02d9
        L_0x0298:
            r8 = 40
            androidx.constraintlayout.widget.b$b r9 = r0.f925d
            float r9 = r9.U
            goto L_0x031b
        L_0x02a0:
            r8 = 39
            androidx.constraintlayout.widget.b$b r9 = r0.f925d
            float r9 = r9.V
            goto L_0x031b
        L_0x02a8:
            int r8 = r0.f922a
            int r8 = r1.getResourceId(r14, r8)
            r0.f922a = r8
            r15 = 38
            goto L_0x038c
        L_0x02b4:
            r8 = 37
            androidx.constraintlayout.widget.b$b r9 = r0.f925d
            float r9 = r9.f982y
            goto L_0x031b
        L_0x02bb:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.I
            r9 = 34
            goto L_0x0387
        L_0x02c3:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.L
            r9 = 31
            goto L_0x0387
        L_0x02cb:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.H
            r9 = 28
            goto L_0x0387
        L_0x02d3:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.F
            r9 = 27
        L_0x02d9:
            int r8 = r1.getInt(r14, r8)
            goto L_0x038b
        L_0x02df:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.G
            r9 = 24
            goto L_0x0387
        L_0x02e7:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.f946c
            r9 = 23
            r15 = 23
            goto L_0x0308
        L_0x02f0:
            r15 = 22
            int[] r8 = f916d
            androidx.constraintlayout.widget.b$d r9 = r0.f923b
            int r9 = r9.f1000b
            int r9 = r1.getInt(r14, r9)
            r8 = r8[r9]
            goto L_0x038c
        L_0x0300:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.f948d
            r9 = 21
            r15 = 21
        L_0x0308:
            int r8 = r1.getLayoutDimension(r14, r8)
            goto L_0x038c
        L_0x030e:
            r8 = 20
            androidx.constraintlayout.widget.b$b r9 = r0.f925d
            float r9 = r9.f981x
            goto L_0x031b
        L_0x0315:
            r8 = 19
            androidx.constraintlayout.widget.b$b r9 = r0.f925d
            float r9 = r9.f954g
        L_0x031b:
            float r9 = r1.getFloat(r14, r9)
        L_0x031f:
            r12.a(r8, r9)
            goto L_0x03ad
        L_0x0324:
            r8 = 18
            androidx.constraintlayout.widget.b$b r9 = r0.f925d
            int r9 = r9.f952f
            r15 = 18
            goto L_0x0374
        L_0x032d:
            r8 = 17
            androidx.constraintlayout.widget.b$b r9 = r0.f925d
            int r9 = r9.f950e
            r15 = 17
            goto L_0x0374
        L_0x0336:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.O
            r9 = 16
            goto L_0x0387
        L_0x033d:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.S
            r9 = 15
            goto L_0x0387
        L_0x0344:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.P
            r9 = 14
            goto L_0x0387
        L_0x034b:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.N
            r9 = 13
            goto L_0x0387
        L_0x0352:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.R
            r9 = 12
            goto L_0x0387
        L_0x0359:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.Q
            r9 = 11
            goto L_0x0387
        L_0x0360:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.K
            r9 = 8
            goto L_0x0387
        L_0x0367:
            r8 = 7
            androidx.constraintlayout.widget.b$b r9 = r0.f925d
            int r9 = r9.E
            r15 = 7
            goto L_0x0374
        L_0x036e:
            r8 = 6
            androidx.constraintlayout.widget.b$b r9 = r0.f925d
            int r9 = r9.D
            r15 = 6
        L_0x0374:
            int r8 = r1.getDimensionPixelOffset(r14, r9)
            goto L_0x038c
        L_0x0379:
            r8 = 5
        L_0x037a:
            java.lang.String r9 = r1.getString(r14)
            r12.c(r8, r9)
            goto L_0x03ad
        L_0x0382:
            androidx.constraintlayout.widget.b$b r8 = r0.f925d
            int r8 = r8.J
            r9 = 2
        L_0x0387:
            int r8 = r1.getDimensionPixelSize(r14, r8)
        L_0x038b:
            r15 = r9
        L_0x038c:
            r12.b(r15, r8)
            goto L_0x03ad
        L_0x0390:
            r8.append(r9)
            java.lang.String r9 = java.lang.Integer.toHexString(r14)
            r8.append(r9)
            r8.append(r6)
            android.util.SparseIntArray r9 = f917e
            int r9 = r9.get(r14)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r7, r8)
        L_0x03ad:
            int r13 = r13 + 1
            r8 = 3
            r9 = 1
            r10 = 0
            goto L_0x0041
        L_0x03b4:
            int r8 = r1.getIndexCount()
            r9 = 0
        L_0x03b9:
            if (r9 >= r8) goto L_0x0922
            int r10 = r1.getIndex(r9)
            r11 = 1
            r12 = 23
            r13 = 24
            if (r10 == r11) goto L_0x03da
            if (r12 == r10) goto L_0x03da
            if (r13 == r10) goto L_0x03da
            androidx.constraintlayout.widget.b$c r12 = r0.f924c
            r12.f985a = r11
            androidx.constraintlayout.widget.b$b r12 = r0.f925d
            r12.f944b = r11
            androidx.constraintlayout.widget.b$d r12 = r0.f923b
            r12.f999a = r11
            androidx.constraintlayout.widget.b$e r12 = r0.f926e
            r12.f1005a = r11
        L_0x03da:
            android.util.SparseIntArray r11 = f917e
            int r11 = r11.get(r10)
            switch(r11) {
                case 1: goto L_0x090d;
                case 2: goto L_0x0902;
                case 3: goto L_0x08f0;
                case 4: goto L_0x08de;
                case 5: goto L_0x08d5;
                case 6: goto L_0x08ca;
                case 7: goto L_0x08bf;
                case 8: goto L_0x08b4;
                case 9: goto L_0x08a2;
                case 10: goto L_0x088f;
                case 11: goto L_0x0883;
                case 12: goto L_0x0877;
                case 13: goto L_0x086b;
                case 14: goto L_0x085f;
                case 15: goto L_0x0853;
                case 16: goto L_0x0847;
                case 17: goto L_0x083b;
                case 18: goto L_0x082f;
                case 19: goto L_0x0823;
                case 20: goto L_0x0817;
                case 21: goto L_0x080b;
                case 22: goto L_0x07f5;
                case 23: goto L_0x07e9;
                case 24: goto L_0x07dd;
                case 25: goto L_0x07ca;
                case 26: goto L_0x07b7;
                case 27: goto L_0x07ab;
                case 28: goto L_0x079f;
                case 29: goto L_0x078c;
                case 30: goto L_0x0779;
                case 31: goto L_0x076d;
                case 32: goto L_0x075a;
                case 33: goto L_0x0747;
                case 34: goto L_0x073b;
                case 35: goto L_0x0728;
                case 36: goto L_0x0715;
                case 37: goto L_0x0709;
                case 38: goto L_0x06ff;
                case 39: goto L_0x06f3;
                case 40: goto L_0x06e7;
                case 41: goto L_0x06db;
                case 42: goto L_0x06cf;
                case 43: goto L_0x06c3;
                case 44: goto L_0x06b4;
                case 45: goto L_0x06a8;
                case 46: goto L_0x069c;
                case 47: goto L_0x0690;
                case 48: goto L_0x0684;
                case 49: goto L_0x0678;
                case 50: goto L_0x066c;
                case 51: goto L_0x0660;
                case 52: goto L_0x0654;
                case 53: goto L_0x0648;
                case 54: goto L_0x063c;
                case 55: goto L_0x0630;
                case 56: goto L_0x0624;
                case 57: goto L_0x0618;
                case 58: goto L_0x060c;
                case 59: goto L_0x0600;
                case 60: goto L_0x05f4;
                case 61: goto L_0x05e1;
                case 62: goto L_0x05d5;
                case 63: goto L_0x05c9;
                case 64: goto L_0x05b6;
                case 65: goto L_0x0597;
                case 66: goto L_0x058c;
                case 67: goto L_0x0580;
                case 68: goto L_0x0574;
                case 69: goto L_0x0568;
                case 70: goto L_0x055c;
                case 71: goto L_0x0557;
                case 72: goto L_0x054b;
                case 73: goto L_0x053f;
                case 74: goto L_0x0535;
                case 75: goto L_0x0529;
                case 76: goto L_0x051d;
                case 77: goto L_0x0513;
                case 78: goto L_0x0507;
                case 79: goto L_0x04fb;
                case 80: goto L_0x04ef;
                case 81: goto L_0x04e3;
                case 82: goto L_0x04d7;
                case 83: goto L_0x04c4;
                case 84: goto L_0x04b8;
                case 85: goto L_0x04ac;
                case 86: goto L_0x045e;
                case 87: goto L_0x0459;
                case 88: goto L_0x03e3;
                case 89: goto L_0x03e3;
                case 90: goto L_0x03e3;
                case 91: goto L_0x0446;
                case 92: goto L_0x0433;
                case 93: goto L_0x0427;
                case 94: goto L_0x041b;
                case 95: goto L_0x0413;
                case 96: goto L_0x040f;
                case 97: goto L_0x0403;
                default: goto L_0x03e3;
            }
        L_0x03e3:
            java.lang.StringBuilder r11 = androidx.activity.result.a.a(r5)
        L_0x03e7:
            java.lang.String r12 = java.lang.Integer.toHexString(r10)
            r11.append(r12)
            r11.append(r6)
            android.util.SparseIntArray r12 = f917e
            int r10 = r12.get(r10)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.util.Log.w(r7, r10)
            goto L_0x091e
        L_0x0403:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f973p0
            int r10 = r1.getInt(r10, r12)
            r11.f973p0 = r10
            goto L_0x091e
        L_0x040f:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            r12 = 1
            goto L_0x0416
        L_0x0413:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            r12 = 0
        L_0x0416:
            g(r11, r1, r10, r12)
            goto L_0x091e
        L_0x041b:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.T
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.T = r10
            goto L_0x091e
        L_0x0427:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.M
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.M = r10
            goto L_0x091e
        L_0x0433:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f976s
            int r12 = r1.getResourceId(r10, r12)
            r13 = -1
            if (r12 != r13) goto L_0x0442
            int r12 = r1.getInt(r10, r13)
        L_0x0442:
            r11.f976s = r12
            goto L_0x091e
        L_0x0446:
            r11 = -1
            androidx.constraintlayout.widget.b$b r12 = r0.f925d
            int r13 = r12.f975r
            int r13 = r1.getResourceId(r10, r13)
            if (r13 != r11) goto L_0x0455
            int r13 = r1.getInt(r10, r11)
        L_0x0455:
            r12.f975r = r13
            goto L_0x091e
        L_0x0459:
            java.lang.StringBuilder r11 = androidx.activity.result.a.a(r3)
            goto L_0x03e7
        L_0x045e:
            android.util.TypedValue r11 = r1.peekValue(r10)
            int r11 = r11.type
            r12 = 1
            if (r11 != r12) goto L_0x0477
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            r12 = -1
            int r10 = r1.getResourceId(r10, r12)
            r11.f998n = r10
            androidx.constraintlayout.widget.b$c r10 = r0.f924c
            int r11 = r10.f998n
            if (r11 == r12) goto L_0x091e
            goto L_0x0497
        L_0x0477:
            r12 = 3
            if (r11 != r12) goto L_0x04a0
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            java.lang.String r12 = r1.getString(r10)
            r11.f996l = r12
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            java.lang.String r11 = r11.f996l
            int r11 = r11.indexOf(r2)
            if (r11 <= 0) goto L_0x049c
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            r12 = -1
            int r10 = r1.getResourceId(r10, r12)
            r11.f998n = r10
            androidx.constraintlayout.widget.b$c r10 = r0.f924c
        L_0x0497:
            r11 = -2
            r10.f997m = r11
            goto L_0x091e
        L_0x049c:
            r10 = -1
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            goto L_0x04a8
        L_0x04a0:
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            int r12 = r11.f998n
            int r10 = r1.getInteger(r10, r12)
        L_0x04a8:
            r11.f997m = r10
            goto L_0x091e
        L_0x04ac:
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            float r12 = r11.f994j
            float r10 = r1.getFloat(r10, r12)
            r11.f994j = r10
            goto L_0x091e
        L_0x04b8:
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            int r12 = r11.f995k
            int r10 = r1.getInteger(r10, r12)
            r11.f995k = r10
            goto L_0x091e
        L_0x04c4:
            androidx.constraintlayout.widget.b$e r11 = r0.f926e
            int r12 = r11.f1013i
            int r12 = r1.getResourceId(r10, r12)
            r13 = -1
            if (r12 != r13) goto L_0x04d3
            int r12 = r1.getInt(r10, r13)
        L_0x04d3:
            r11.f1013i = r12
            goto L_0x091e
        L_0x04d7:
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            int r12 = r11.f987c
            int r10 = r1.getInteger(r10, r12)
            r11.f987c = r10
            goto L_0x091e
        L_0x04e3:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            boolean r12 = r11.f969n0
            boolean r10 = r1.getBoolean(r10, r12)
            r11.f969n0 = r10
            goto L_0x091e
        L_0x04ef:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            boolean r12 = r11.f967m0
            boolean r10 = r1.getBoolean(r10, r12)
            r11.f967m0 = r10
            goto L_0x091e
        L_0x04fb:
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            float r12 = r11.f991g
            float r10 = r1.getFloat(r10, r12)
            r11.f991g = r10
            goto L_0x091e
        L_0x0507:
            androidx.constraintlayout.widget.b$d r11 = r0.f923b
            int r12 = r11.f1001c
            int r10 = r1.getInt(r10, r12)
            r11.f1001c = r10
            goto L_0x091e
        L_0x0513:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            java.lang.String r10 = r1.getString(r10)
            r11.f965l0 = r10
            goto L_0x091e
        L_0x051d:
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            int r12 = r11.f989e
            int r10 = r1.getInt(r10, r12)
            r11.f989e = r10
            goto L_0x091e
        L_0x0529:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            boolean r12 = r11.f971o0
            boolean r10 = r1.getBoolean(r10, r12)
            r11.f971o0 = r10
            goto L_0x091e
        L_0x0535:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            java.lang.String r10 = r1.getString(r10)
            r11.f963k0 = r10
            goto L_0x091e
        L_0x053f:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f957h0
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.f957h0 = r10
            goto L_0x091e
        L_0x054b:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f955g0
            int r10 = r1.getInt(r10, r12)
            r11.f955g0 = r10
            goto L_0x091e
        L_0x0557:
            android.util.Log.e(r7, r4)
            goto L_0x091e
        L_0x055c:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            r12 = 1065353216(0x3f800000, float:1.0)
            float r10 = r1.getFloat(r10, r12)
            r11.f953f0 = r10
            goto L_0x091e
        L_0x0568:
            r11 = 1065353216(0x3f800000, float:1.0)
            androidx.constraintlayout.widget.b$b r12 = r0.f925d
            float r10 = r1.getFloat(r10, r11)
            r12.f951e0 = r10
            goto L_0x091e
        L_0x0574:
            androidx.constraintlayout.widget.b$d r11 = r0.f923b
            float r12 = r11.f1003e
            float r10 = r1.getFloat(r10, r12)
            r11.f1003e = r10
            goto L_0x091e
        L_0x0580:
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            float r12 = r11.f993i
            float r10 = r1.getFloat(r10, r12)
            r11.f993i = r10
            goto L_0x091e
        L_0x058c:
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            r12 = 0
            int r10 = r1.getInt(r10, r12)
            r11.f990f = r10
            goto L_0x091e
        L_0x0597:
            android.util.TypedValue r11 = r1.peekValue(r10)
            int r11 = r11.type
            r12 = 3
            if (r11 != r12) goto L_0x05a7
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            java.lang.String r10 = r1.getString(r10)
            goto L_0x05b2
        L_0x05a7:
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            java.lang.String[] r12 = o.a.f3490c
            r13 = 0
            int r10 = r1.getInteger(r10, r13)
            r10 = r12[r10]
        L_0x05b2:
            r11.f988d = r10
            goto L_0x091e
        L_0x05b6:
            androidx.constraintlayout.widget.b$c r11 = r0.f924c
            int r12 = r11.f986b
            int r12 = r1.getResourceId(r10, r12)
            r13 = -1
            if (r12 != r13) goto L_0x05c5
            int r12 = r1.getInt(r10, r13)
        L_0x05c5:
            r11.f986b = r12
            goto L_0x091e
        L_0x05c9:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            float r12 = r11.C
            float r10 = r1.getFloat(r10, r12)
            r11.C = r10
            goto L_0x091e
        L_0x05d5:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.B
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.B = r10
            goto L_0x091e
        L_0x05e1:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.A
            int r12 = r1.getResourceId(r10, r12)
            r13 = -1
            if (r12 != r13) goto L_0x05f0
            int r12 = r1.getInt(r10, r13)
        L_0x05f0:
            r11.A = r12
            goto L_0x091e
        L_0x05f4:
            androidx.constraintlayout.widget.b$e r11 = r0.f926e
            float r12 = r11.f1006b
            float r10 = r1.getFloat(r10, r12)
            r11.f1006b = r10
            goto L_0x091e
        L_0x0600:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f949d0
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.f949d0 = r10
            goto L_0x091e
        L_0x060c:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f947c0
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.f947c0 = r10
            goto L_0x091e
        L_0x0618:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f945b0
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.f945b0 = r10
            goto L_0x091e
        L_0x0624:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f943a0
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.f943a0 = r10
            goto L_0x091e
        L_0x0630:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.Z
            int r10 = r1.getInt(r10, r12)
            r11.Z = r10
            goto L_0x091e
        L_0x063c:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.Y
            int r10 = r1.getInt(r10, r12)
            r11.Y = r10
            goto L_0x091e
        L_0x0648:
            androidx.constraintlayout.widget.b$e r11 = r0.f926e
            float r12 = r11.f1016l
            float r10 = r1.getDimension(r10, r12)
            r11.f1016l = r10
            goto L_0x091e
        L_0x0654:
            androidx.constraintlayout.widget.b$e r11 = r0.f926e
            float r12 = r11.f1015k
            float r10 = r1.getDimension(r10, r12)
            r11.f1015k = r10
            goto L_0x091e
        L_0x0660:
            androidx.constraintlayout.widget.b$e r11 = r0.f926e
            float r12 = r11.f1014j
            float r10 = r1.getDimension(r10, r12)
            r11.f1014j = r10
            goto L_0x091e
        L_0x066c:
            androidx.constraintlayout.widget.b$e r11 = r0.f926e
            float r12 = r11.f1012h
            float r10 = r1.getDimension(r10, r12)
            r11.f1012h = r10
            goto L_0x091e
        L_0x0678:
            androidx.constraintlayout.widget.b$e r11 = r0.f926e
            float r12 = r11.f1011g
            float r10 = r1.getDimension(r10, r12)
            r11.f1011g = r10
            goto L_0x091e
        L_0x0684:
            androidx.constraintlayout.widget.b$e r11 = r0.f926e
            float r12 = r11.f1010f
            float r10 = r1.getFloat(r10, r12)
            r11.f1010f = r10
            goto L_0x091e
        L_0x0690:
            androidx.constraintlayout.widget.b$e r11 = r0.f926e
            float r12 = r11.f1009e
            float r10 = r1.getFloat(r10, r12)
            r11.f1009e = r10
            goto L_0x091e
        L_0x069c:
            androidx.constraintlayout.widget.b$e r11 = r0.f926e
            float r12 = r11.f1008d
            float r10 = r1.getFloat(r10, r12)
            r11.f1008d = r10
            goto L_0x091e
        L_0x06a8:
            androidx.constraintlayout.widget.b$e r11 = r0.f926e
            float r12 = r11.f1007c
            float r10 = r1.getFloat(r10, r12)
            r11.f1007c = r10
            goto L_0x091e
        L_0x06b4:
            androidx.constraintlayout.widget.b$e r11 = r0.f926e
            r12 = 1
            r11.f1017m = r12
            float r12 = r11.f1018n
            float r10 = r1.getDimension(r10, r12)
            r11.f1018n = r10
            goto L_0x091e
        L_0x06c3:
            androidx.constraintlayout.widget.b$d r11 = r0.f923b
            float r12 = r11.f1002d
            float r10 = r1.getFloat(r10, r12)
            r11.f1002d = r10
            goto L_0x091e
        L_0x06cf:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.X
            int r10 = r1.getInt(r10, r12)
            r11.X = r10
            goto L_0x091e
        L_0x06db:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.W
            int r10 = r1.getInt(r10, r12)
            r11.W = r10
            goto L_0x091e
        L_0x06e7:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            float r12 = r11.U
            float r10 = r1.getFloat(r10, r12)
            r11.U = r10
            goto L_0x091e
        L_0x06f3:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            float r12 = r11.V
            float r10 = r1.getFloat(r10, r12)
            r11.V = r10
            goto L_0x091e
        L_0x06ff:
            int r11 = r0.f922a
            int r10 = r1.getResourceId(r10, r11)
            r0.f922a = r10
            goto L_0x091e
        L_0x0709:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            float r12 = r11.f982y
            float r10 = r1.getFloat(r10, r12)
            r11.f982y = r10
            goto L_0x091e
        L_0x0715:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f966m
            int r12 = r1.getResourceId(r10, r12)
            r13 = -1
            if (r12 != r13) goto L_0x0724
            int r12 = r1.getInt(r10, r13)
        L_0x0724:
            r11.f966m = r12
            goto L_0x091e
        L_0x0728:
            r11 = -1
            androidx.constraintlayout.widget.b$b r12 = r0.f925d
            int r13 = r12.f968n
            int r13 = r1.getResourceId(r10, r13)
            if (r13 != r11) goto L_0x0737
            int r13 = r1.getInt(r10, r11)
        L_0x0737:
            r12.f968n = r13
            goto L_0x091e
        L_0x073b:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.I
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.I = r10
            goto L_0x091e
        L_0x0747:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f978u
            int r12 = r1.getResourceId(r10, r12)
            r13 = -1
            if (r12 != r13) goto L_0x0756
            int r12 = r1.getInt(r10, r13)
        L_0x0756:
            r11.f978u = r12
            goto L_0x091e
        L_0x075a:
            r11 = -1
            androidx.constraintlayout.widget.b$b r12 = r0.f925d
            int r13 = r12.f977t
            int r13 = r1.getResourceId(r10, r13)
            if (r13 != r11) goto L_0x0769
            int r13 = r1.getInt(r10, r11)
        L_0x0769:
            r12.f977t = r13
            goto L_0x091e
        L_0x076d:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.L
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.L = r10
            goto L_0x091e
        L_0x0779:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f964l
            int r12 = r1.getResourceId(r10, r12)
            r13 = -1
            if (r12 != r13) goto L_0x0788
            int r12 = r1.getInt(r10, r13)
        L_0x0788:
            r11.f964l = r12
            goto L_0x091e
        L_0x078c:
            r11 = -1
            androidx.constraintlayout.widget.b$b r12 = r0.f925d
            int r13 = r12.f962k
            int r13 = r1.getResourceId(r10, r13)
            if (r13 != r11) goto L_0x079b
            int r13 = r1.getInt(r10, r11)
        L_0x079b:
            r12.f962k = r13
            goto L_0x091e
        L_0x079f:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.H
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.H = r10
            goto L_0x091e
        L_0x07ab:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.F
            int r10 = r1.getInt(r10, r12)
            r11.F = r10
            goto L_0x091e
        L_0x07b7:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f960j
            int r12 = r1.getResourceId(r10, r12)
            r13 = -1
            if (r12 != r13) goto L_0x07c6
            int r12 = r1.getInt(r10, r13)
        L_0x07c6:
            r11.f960j = r12
            goto L_0x091e
        L_0x07ca:
            r11 = -1
            androidx.constraintlayout.widget.b$b r12 = r0.f925d
            int r13 = r12.f958i
            int r13 = r1.getResourceId(r10, r13)
            if (r13 != r11) goto L_0x07d9
            int r13 = r1.getInt(r10, r11)
        L_0x07d9:
            r12.f958i = r13
            goto L_0x091e
        L_0x07dd:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.G
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.G = r10
            goto L_0x091e
        L_0x07e9:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f946c
            int r10 = r1.getLayoutDimension(r10, r12)
            r11.f946c = r10
            goto L_0x091e
        L_0x07f5:
            androidx.constraintlayout.widget.b$d r11 = r0.f923b
            int r12 = r11.f1000b
            int r10 = r1.getInt(r10, r12)
            r11.f1000b = r10
            androidx.constraintlayout.widget.b$d r10 = r0.f923b
            int[] r11 = f916d
            int r12 = r10.f1000b
            r11 = r11[r12]
            r10.f1000b = r11
            goto L_0x091e
        L_0x080b:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f948d
            int r10 = r1.getLayoutDimension(r10, r12)
            r11.f948d = r10
            goto L_0x091e
        L_0x0817:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            float r12 = r11.f981x
            float r10 = r1.getFloat(r10, r12)
            r11.f981x = r10
            goto L_0x091e
        L_0x0823:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            float r12 = r11.f954g
            float r10 = r1.getFloat(r10, r12)
            r11.f954g = r10
            goto L_0x091e
        L_0x082f:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f952f
            int r10 = r1.getDimensionPixelOffset(r10, r12)
            r11.f952f = r10
            goto L_0x091e
        L_0x083b:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f950e
            int r10 = r1.getDimensionPixelOffset(r10, r12)
            r11.f950e = r10
            goto L_0x091e
        L_0x0847:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.O
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.O = r10
            goto L_0x091e
        L_0x0853:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.S
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.S = r10
            goto L_0x091e
        L_0x085f:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.P
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.P = r10
            goto L_0x091e
        L_0x086b:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.N
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.N = r10
            goto L_0x091e
        L_0x0877:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.R
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.R = r10
            goto L_0x091e
        L_0x0883:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.Q
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.Q = r10
            goto L_0x091e
        L_0x088f:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f979v
            int r12 = r1.getResourceId(r10, r12)
            r13 = -1
            if (r12 != r13) goto L_0x089e
            int r12 = r1.getInt(r10, r13)
        L_0x089e:
            r11.f979v = r12
            goto L_0x091e
        L_0x08a2:
            r11 = -1
            androidx.constraintlayout.widget.b$b r12 = r0.f925d
            int r13 = r12.f980w
            int r13 = r1.getResourceId(r10, r13)
            if (r13 != r11) goto L_0x08b1
            int r13 = r1.getInt(r10, r11)
        L_0x08b1:
            r12.f980w = r13
            goto L_0x091e
        L_0x08b4:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.K
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.K = r10
            goto L_0x091e
        L_0x08bf:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.E
            int r10 = r1.getDimensionPixelOffset(r10, r12)
            r11.E = r10
            goto L_0x091e
        L_0x08ca:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.D
            int r10 = r1.getDimensionPixelOffset(r10, r12)
            r11.D = r10
            goto L_0x091e
        L_0x08d5:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            java.lang.String r10 = r1.getString(r10)
            r11.f983z = r10
            goto L_0x091e
        L_0x08de:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f970o
            int r12 = r1.getResourceId(r10, r12)
            r13 = -1
            if (r12 != r13) goto L_0x08ed
            int r12 = r1.getInt(r10, r13)
        L_0x08ed:
            r11.f970o = r12
            goto L_0x091e
        L_0x08f0:
            r11 = -1
            androidx.constraintlayout.widget.b$b r12 = r0.f925d
            int r13 = r12.f972p
            int r13 = r1.getResourceId(r10, r13)
            if (r13 != r11) goto L_0x08ff
            int r13 = r1.getInt(r10, r11)
        L_0x08ff:
            r12.f972p = r13
            goto L_0x091e
        L_0x0902:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.J
            int r10 = r1.getDimensionPixelSize(r10, r12)
            r11.J = r10
            goto L_0x091e
        L_0x090d:
            androidx.constraintlayout.widget.b$b r11 = r0.f925d
            int r12 = r11.f974q
            int r12 = r1.getResourceId(r10, r12)
            r13 = -1
            if (r12 != r13) goto L_0x091c
            int r12 = r1.getInt(r10, r13)
        L_0x091c:
            r11.f974q = r12
        L_0x091e:
            int r9 = r9 + 1
            goto L_0x03b9
        L_0x0922:
            androidx.constraintlayout.widget.b$b r2 = r0.f925d
            java.lang.String r3 = r2.f963k0
            if (r3 == 0) goto L_0x092b
            r3 = 0
            r2.f961j0 = r3
        L_0x092b:
            r1.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.b.e(android.content.Context, android.util.AttributeSet, boolean):androidx.constraintlayout.widget.b$a");
    }

    public void f(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a e2 = e(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        e2.f925d.f942a = true;
                    }
                    this.f921c.put(Integer.valueOf(e2.f922a), e2);
                }
            }
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }
}
