package androidx.fragment.app;

import android.view.View;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.WeakHashMap;
import m.g;
import v0.d;

public class q0 {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1449a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    public static final s0 f1450b = new r0();

    /* renamed from: c  reason: collision with root package name */
    public static final s0 f1451c;

    public interface a {
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public n f1452a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1453b;

        /* renamed from: c  reason: collision with root package name */
        public a f1454c;

        /* renamed from: d  reason: collision with root package name */
        public n f1455d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f1456e;

        /* renamed from: f  reason: collision with root package name */
        public a f1457f;
    }

    static {
        s0 s0Var;
        try {
            s0Var = d.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            s0Var = null;
        }
        f1451c = s0Var;
    }

    public static void a(ArrayList<View> arrayList, m.a<String, View> aVar, Collection<String> collection) {
        for (int i2 = aVar.f3377d - 1; i2 >= 0; i2--) {
            View k2 = aVar.k(i2);
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (collection.contains(u.i.k(k2))) {
                arrayList.add(k2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0038, code lost:
        if (r0.f1381l != false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0074, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0084, code lost:
        if (r0.f1395z != false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0086, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(androidx.fragment.app.a r8, androidx.fragment.app.j0.a r9, android.util.SparseArray<androidx.fragment.app.q0.b> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.n r0 = r9.f1342b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.f1393x
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f1449a
            int r9 = r9.f1341a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f1341a
        L_0x0015:
            r2 = 1
            r3 = 0
            if (r9 == r2) goto L_0x007a
            r4 = 3
            if (r9 == r4) goto L_0x0056
            r4 = 4
            if (r9 == r4) goto L_0x003e
            r4 = 5
            if (r9 == r4) goto L_0x002c
            r4 = 6
            if (r9 == r4) goto L_0x0056
            r4 = 7
            if (r9 == r4) goto L_0x007a
            r9 = 0
            r2 = 0
            goto L_0x0087
        L_0x002c:
            if (r12 == 0) goto L_0x003b
            boolean r9 = r0.J
            if (r9 == 0) goto L_0x007c
            boolean r9 = r0.f1395z
            if (r9 != 0) goto L_0x007c
            boolean r9 = r0.f1381l
            if (r9 == 0) goto L_0x007c
            goto L_0x0086
        L_0x003b:
            boolean r9 = r0.f1395z
            goto L_0x0087
        L_0x003e:
            if (r12 == 0) goto L_0x004d
            boolean r9 = r0.J
            if (r9 == 0) goto L_0x0076
            boolean r9 = r0.f1381l
            if (r9 == 0) goto L_0x0076
            boolean r9 = r0.f1395z
            if (r9 == 0) goto L_0x0076
            goto L_0x0074
        L_0x004d:
            boolean r9 = r0.f1381l
            if (r9 == 0) goto L_0x0076
            boolean r9 = r0.f1395z
            if (r9 != 0) goto L_0x0076
            goto L_0x0074
        L_0x0056:
            boolean r9 = r0.f1381l
            if (r12 == 0) goto L_0x006e
            if (r9 != 0) goto L_0x0076
            android.view.View r9 = r0.F
            if (r9 == 0) goto L_0x0076
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0076
            float r9 = r0.K
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0076
            goto L_0x0074
        L_0x006e:
            if (r9 == 0) goto L_0x0076
            boolean r9 = r0.f1395z
            if (r9 != 0) goto L_0x0076
        L_0x0074:
            r9 = 1
            goto L_0x0077
        L_0x0076:
            r9 = 0
        L_0x0077:
            r4 = r9
            r9 = 0
            goto L_0x008b
        L_0x007a:
            if (r12 == 0) goto L_0x007e
        L_0x007c:
            r9 = 0
            goto L_0x0087
        L_0x007e:
            boolean r9 = r0.f1381l
            if (r9 != 0) goto L_0x007c
            boolean r9 = r0.f1395z
            if (r9 != 0) goto L_0x007c
        L_0x0086:
            r9 = 1
        L_0x0087:
            r3 = r9
            r9 = r2
            r2 = 0
            r4 = 0
        L_0x008b:
            java.lang.Object r5 = r10.get(r1)
            androidx.fragment.app.q0$b r5 = (androidx.fragment.app.q0.b) r5
            if (r3 == 0) goto L_0x00a4
            if (r5 != 0) goto L_0x009e
            androidx.fragment.app.q0$b r3 = new androidx.fragment.app.q0$b
            r3.<init>()
            r10.put(r1, r3)
            r5 = r3
        L_0x009e:
            r5.f1452a = r0
            r5.f1453b = r11
            r5.f1454c = r8
        L_0x00a4:
            r3 = 0
            if (r12 != 0) goto L_0x00c5
            if (r9 == 0) goto L_0x00c5
            if (r5 == 0) goto L_0x00b1
            androidx.fragment.app.n r9 = r5.f1455d
            if (r9 != r0) goto L_0x00b1
            r5.f1455d = r3
        L_0x00b1:
            boolean r9 = r8.f1340o
            if (r9 != 0) goto L_0x00c5
            androidx.fragment.app.b0 r9 = r8.f1196p
            androidx.fragment.app.h0 r6 = r9.h(r0)
            androidx.fragment.app.i0 r7 = r9.f1217c
            r7.j(r6)
            int r6 = r9.f1230p
            r9.S(r0, r6)
        L_0x00c5:
            if (r4 == 0) goto L_0x00de
            if (r5 == 0) goto L_0x00cd
            androidx.fragment.app.n r9 = r5.f1455d
            if (r9 != 0) goto L_0x00de
        L_0x00cd:
            if (r5 != 0) goto L_0x00d8
            androidx.fragment.app.q0$b r9 = new androidx.fragment.app.q0$b
            r9.<init>()
            r10.put(r1, r9)
            r5 = r9
        L_0x00d8:
            r5.f1455d = r0
            r5.f1456e = r11
            r5.f1457f = r8
        L_0x00de:
            if (r12 != 0) goto L_0x00ea
            if (r2 == 0) goto L_0x00ea
            if (r5 == 0) goto L_0x00ea
            androidx.fragment.app.n r8 = r5.f1452a
            if (r8 != r0) goto L_0x00ea
            r5.f1452a = r3
        L_0x00ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q0.b(androidx.fragment.app.a, androidx.fragment.app.j0$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(n nVar, n nVar2, boolean z2, m.a<String, View> aVar, boolean z3) {
        if (z2) {
            nVar2.m();
        } else {
            nVar.m();
        }
    }

    public static boolean d(s0 s0Var, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!s0Var.e(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static m.a<String, View> e(s0 s0Var, m.a<String, String> aVar, Object obj, b bVar) {
        ArrayList<String> arrayList;
        n nVar = bVar.f1452a;
        View view = nVar.F;
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        m.a<String, View> aVar2 = new m.a<>();
        s0Var.i(aVar2, view);
        a aVar3 = bVar.f1454c;
        if (bVar.f1453b) {
            nVar.p();
            arrayList = aVar3.f1338m;
        } else {
            nVar.m();
            arrayList = aVar3.f1339n;
        }
        if (arrayList != null) {
            g.k(aVar2, arrayList);
            g.k(aVar2, aVar.values());
        }
        m(aVar, aVar2);
        return aVar2;
    }

    public static m.a<String, View> f(s0 s0Var, m.a<String, String> aVar, Object obj, b bVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        n nVar = bVar.f1455d;
        m.a<String, View> aVar2 = new m.a<>();
        s0Var.i(aVar2, nVar.V());
        a aVar3 = bVar.f1457f;
        if (bVar.f1456e) {
            nVar.m();
            arrayList = aVar3.f1339n;
        } else {
            nVar.p();
            arrayList = aVar3.f1338m;
        }
        if (arrayList != null) {
            g.k(aVar2, arrayList);
        }
        g.k(aVar, aVar2.keySet());
        return aVar2;
    }

    public static s0 g(n nVar, n nVar2) {
        ArrayList arrayList = new ArrayList();
        if (nVar != null) {
            nVar.o();
            Object x2 = nVar.x();
            if (x2 != null) {
                arrayList.add(x2);
            }
            Object z2 = nVar.z();
            if (z2 != null) {
                arrayList.add(z2);
            }
        }
        if (nVar2 != null) {
            nVar2.l();
            Object v2 = nVar2.v();
            if (v2 != null) {
                arrayList.add(v2);
            }
            nVar2.y();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        s0 s0Var = f1450b;
        if (d(s0Var, arrayList)) {
            return s0Var;
        }
        s0 s0Var2 = f1451c;
        if (s0Var2 != null && d(s0Var2, arrayList)) {
            return s0Var2;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList<View> h(s0 s0Var, Object obj, n nVar, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = nVar.F;
        if (view2 != null) {
            s0Var.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        s0Var.b(obj, arrayList2);
        return arrayList2;
    }

    public static Object i(s0 s0Var, n nVar, boolean z2) {
        Object obj = null;
        if (nVar == null) {
            return null;
        }
        if (z2) {
            obj = nVar.v();
        } else {
            nVar.l();
        }
        return s0Var.g(obj);
    }

    public static Object j(s0 s0Var, n nVar, boolean z2) {
        Object obj = null;
        if (nVar == null) {
            return null;
        }
        if (z2) {
            obj = nVar.x();
        } else {
            nVar.o();
        }
        return s0Var.g(obj);
    }

    public static View k(m.a<String, View> aVar, b bVar, Object obj, boolean z2) {
        ArrayList<String> arrayList;
        a aVar2 = bVar.f1454c;
        if (obj == null || aVar == null || (arrayList = aVar2.f1338m) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z2 ? aVar2.f1338m : aVar2.f1339n).get(0));
    }

    public static Object l(s0 s0Var, n nVar, n nVar2, boolean z2) {
        Object obj;
        if (z2) {
            obj = nVar2.z();
        } else {
            nVar.y();
            obj = null;
        }
        return s0Var.y(s0Var.g(obj));
    }

    public static void m(m.a<String, String> aVar, m.a<String, View> aVar2) {
        int i2 = aVar.f3377d;
        while (true) {
            i2--;
            if (i2 < 0) {
                return;
            }
            if (!aVar2.containsKey(aVar.k(i2))) {
                aVar.i(i2);
            }
        }
    }

    public static void n(s0 s0Var, Object obj, Object obj2, m.a<String, View> aVar, boolean z2, a aVar2) {
        ArrayList<String> arrayList = aVar2.f1338m;
        if (arrayList != null && !arrayList.isEmpty()) {
            View view = aVar.get((z2 ? aVar2.f1339n : aVar2.f1338m).get(0));
            s0Var.t(obj, view);
            if (obj2 != null) {
                s0Var.t(obj2, view);
            }
        }
    }

    public static void o(ArrayList<View> arrayList, int i2) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03f5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0230 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void p(android.content.Context r37, androidx.fragment.app.v r38, java.util.ArrayList<androidx.fragment.app.a> r39, java.util.ArrayList<java.lang.Boolean> r40, int r41, int r42, boolean r43, androidx.fragment.app.q0.a r44) {
        /*
            r0 = r39
            r1 = r40
            r2 = r42
            r3 = r43
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            r5 = r41
        L_0x000f:
            r6 = 0
            r7 = 1
            if (r5 >= r2) goto L_0x0061
            java.lang.Object r8 = r0.get(r5)
            androidx.fragment.app.a r8 = (androidx.fragment.app.a) r8
            java.lang.Object r9 = r1.get(r5)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0047
            androidx.fragment.app.b0 r6 = r8.f1196p
            androidx.fragment.app.v r6 = r6.f1232r
            boolean r6 = r6.h()
            if (r6 != 0) goto L_0x0030
            goto L_0x005e
        L_0x0030:
            java.util.ArrayList<androidx.fragment.app.j0$a> r6 = r8.f1326a
            int r6 = r6.size()
            int r6 = r6 - r7
        L_0x0037:
            if (r6 < 0) goto L_0x005e
            java.util.ArrayList<androidx.fragment.app.j0$a> r9 = r8.f1326a
            java.lang.Object r9 = r9.get(r6)
            androidx.fragment.app.j0$a r9 = (androidx.fragment.app.j0.a) r9
            b(r8, r9, r4, r7, r3)
            int r6 = r6 + -1
            goto L_0x0037
        L_0x0047:
            java.util.ArrayList<androidx.fragment.app.j0$a> r7 = r8.f1326a
            int r7 = r7.size()
            r9 = 0
        L_0x004e:
            if (r9 >= r7) goto L_0x005e
            java.util.ArrayList<androidx.fragment.app.j0$a> r10 = r8.f1326a
            java.lang.Object r10 = r10.get(r9)
            androidx.fragment.app.j0$a r10 = (androidx.fragment.app.j0.a) r10
            b(r8, r10, r4, r6, r3)
            int r9 = r9 + 1
            goto L_0x004e
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0061:
            int r5 = r4.size()
            if (r5 == 0) goto L_0x0407
            android.view.View r5 = new android.view.View
            r8 = r37
            r5.<init>(r8)
            int r15 = r4.size()
            r14 = 0
        L_0x0073:
            if (r14 >= r15) goto L_0x0407
            int r8 = r4.keyAt(r14)
            m.a r13 = new m.a
            r13.<init>()
            int r9 = r2 + -1
            r12 = r41
        L_0x0082:
            if (r9 < r12) goto L_0x00ea
            java.lang.Object r10 = r0.get(r9)
            androidx.fragment.app.a r10 = (androidx.fragment.app.a) r10
            boolean r11 = r10.i(r8)
            if (r11 != 0) goto L_0x0091
            goto L_0x00df
        L_0x0091:
            java.lang.Object r11 = r1.get(r9)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            java.util.ArrayList<java.lang.String> r7 = r10.f1338m
            if (r7 == 0) goto L_0x00df
            int r7 = r7.size()
            if (r11 == 0) goto L_0x00aa
            java.util.ArrayList<java.lang.String> r11 = r10.f1338m
            java.util.ArrayList<java.lang.String> r10 = r10.f1339n
            goto L_0x00b3
        L_0x00aa:
            java.util.ArrayList<java.lang.String> r11 = r10.f1338m
            java.util.ArrayList<java.lang.String> r10 = r10.f1339n
            r36 = r11
            r11 = r10
            r10 = r36
        L_0x00b3:
            if (r6 >= r7) goto L_0x00df
            java.lang.Object r16 = r10.get(r6)
            r0 = r16
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r16 = r11.get(r6)
            r1 = r16
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r16 = r13.remove(r1)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00d3
            r13.put(r0, r2)
            goto L_0x00d6
        L_0x00d3:
            r13.put(r0, r1)
        L_0x00d6:
            int r6 = r6 + 1
            r0 = r39
            r1 = r40
            r2 = r42
            goto L_0x00b3
        L_0x00df:
            int r9 = r9 + -1
            r0 = r39
            r1 = r40
            r2 = r42
            r6 = 0
            r7 = 1
            goto L_0x0082
        L_0x00ea:
            java.lang.Object r0 = r4.valueAt(r14)
            androidx.fragment.app.q0$b r0 = (androidx.fragment.app.q0.b) r0
            boolean r1 = r38.h()
            if (r1 == 0) goto L_0x03ef
            r1 = r38
            android.view.View r2 = r1.e(r8)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L_0x0102
            goto L_0x03ef
        L_0x0102:
            if (r3 == 0) goto L_0x0282
            androidx.fragment.app.n r7 = r0.f1452a
            androidx.fragment.app.n r8 = r0.f1455d
            androidx.fragment.app.s0 r9 = g(r8, r7)
            if (r9 != 0) goto L_0x0117
            r30 = r4
            r31 = r14
            r32 = r15
        L_0x0114:
            r7 = 0
            goto L_0x0295
        L_0x0117:
            boolean r10 = r0.f1453b
            boolean r11 = r0.f1456e
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Object r10 = i(r9, r7, r10)
            java.lang.Object r11 = j(r9, r8, r11)
            androidx.fragment.app.n r3 = r0.f1452a
            r30 = r4
            androidx.fragment.app.n r4 = r0.f1455d
            if (r3 == 0) goto L_0x0140
            android.view.View r12 = r3.V()
            r31 = r14
            r14 = 0
            r12.setVisibility(r14)
            goto L_0x0142
        L_0x0140:
            r31 = r14
        L_0x0142:
            if (r3 == 0) goto L_0x01e5
            if (r4 != 0) goto L_0x0148
            goto L_0x01e5
        L_0x0148:
            boolean r12 = r0.f1453b
            boolean r14 = r13.isEmpty()
            if (r14 == 0) goto L_0x0154
            r32 = r15
            r14 = 0
            goto L_0x015a
        L_0x0154:
            java.lang.Object r14 = l(r9, r3, r4, r12)
            r32 = r15
        L_0x015a:
            m.a r15 = f(r9, r13, r14, r0)
            r33 = r7
            m.a r7 = e(r9, r13, r14, r0)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x0176
            if (r15 == 0) goto L_0x016f
            r15.clear()
        L_0x016f:
            if (r7 == 0) goto L_0x0174
            r7.clear()
        L_0x0174:
            r14 = 0
            goto L_0x0188
        L_0x0176:
            r16 = r14
            java.util.Set r14 = r13.keySet()
            a(r1, r15, r14)
            java.util.Collection r14 = r13.values()
            a(r6, r7, r14)
            r14 = r16
        L_0x0188:
            if (r10 != 0) goto L_0x0193
            if (r11 != 0) goto L_0x0193
            if (r14 != 0) goto L_0x0193
            r35 = r6
            r34 = r13
            goto L_0x01ed
        L_0x0193:
            r34 = r13
            r13 = 1
            c(r3, r4, r12, r15, r13)
            if (r14 == 0) goto L_0x01c9
            r6.add(r5)
            r9.w(r14, r5, r1)
            boolean r13 = r0.f1456e
            r35 = r6
            androidx.fragment.app.a r6 = r0.f1457f
            r16 = r9
            r17 = r14
            r18 = r11
            r19 = r15
            r20 = r13
            r21 = r6
            n(r16, r17, r18, r19, r20, r21)
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.view.View r0 = k(r7, r0, r10, r12)
            if (r0 == 0) goto L_0x01c4
            r9.s(r10, r6)
        L_0x01c4:
            r27 = r0
            r29 = r6
            goto L_0x01cf
        L_0x01c9:
            r35 = r6
            r27 = 0
            r29 = 0
        L_0x01cf:
            androidx.fragment.app.o0 r0 = new androidx.fragment.app.o0
            r22 = r0
            r23 = r3
            r24 = r4
            r25 = r12
            r26 = r7
            r28 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            g0.p.a(r2, r0)
            r6 = r14
            goto L_0x01ee
        L_0x01e5:
            r35 = r6
            r33 = r7
            r34 = r13
            r32 = r15
        L_0x01ed:
            r6 = 0
        L_0x01ee:
            if (r10 != 0) goto L_0x01f6
            if (r6 != 0) goto L_0x01f6
            if (r11 != 0) goto L_0x01f6
            goto L_0x0114
        L_0x01f6:
            java.util.ArrayList r0 = h(r9, r11, r8, r1, r5)
            r3 = r33
            r4 = r35
            java.util.ArrayList r3 = h(r9, r10, r3, r4, r5)
            r7 = 4
            o(r3, r7)
            java.lang.Object r7 = r9.m(r11, r10, r6)
            if (r8 == 0) goto L_0x022e
            if (r0 == 0) goto L_0x022e
            int r12 = r0.size()
            if (r12 > 0) goto L_0x021a
            int r12 = r1.size()
            if (r12 <= 0) goto L_0x022e
        L_0x021a:
            c0.b r12 = new c0.b
            r12.<init>()
            r13 = r44
            androidx.fragment.app.b0$d r13 = (androidx.fragment.app.b0.d) r13
            r13.b(r8, r12)
            androidx.fragment.app.k0 r14 = new androidx.fragment.app.k0
            r14.<init>(r13, r8, r12)
            r9.u(r8, r7, r12, r14)
        L_0x022e:
            if (r7 == 0) goto L_0x0114
            if (r8 == 0) goto L_0x0253
            if (r11 == 0) goto L_0x0253
            boolean r12 = r8.f1381l
            if (r12 == 0) goto L_0x0253
            boolean r12 = r8.f1395z
            if (r12 == 0) goto L_0x0253
            boolean r12 = r8.J
            if (r12 == 0) goto L_0x0253
            r12 = 1
            r8.b0(r12)
            android.view.View r12 = r8.F
            r9.q(r11, r12, r0)
            android.view.ViewGroup r8 = r8.E
            androidx.fragment.app.l0 r12 = new androidx.fragment.app.l0
            r12.<init>(r0)
            g0.p.a(r8, r12)
        L_0x0253:
            java.util.ArrayList r20 = r9.n(r4)
            r22 = r9
            r23 = r7
            r24 = r10
            r25 = r3
            r26 = r11
            r27 = r0
            r28 = r6
            r29 = r4
            r22.r(r23, r24, r25, r26, r27, r28, r29)
            r9.c(r2, r7)
            r16 = r9
            r17 = r2
            r18 = r1
            r19 = r4
            r21 = r34
            r16.v(r17, r18, r19, r20, r21)
            r7 = 0
            o(r3, r7)
            r9.x(r6, r1, r4)
            goto L_0x0295
        L_0x0282:
            r30 = r4
            r34 = r13
            r31 = r14
            r32 = r15
            r7 = 0
            androidx.fragment.app.n r1 = r0.f1452a
            androidx.fragment.app.n r3 = r0.f1455d
            androidx.fragment.app.s0 r4 = g(r3, r1)
            if (r4 != 0) goto L_0x029b
        L_0x0295:
            r24 = r31
            r26 = r32
            goto L_0x03f5
        L_0x029b:
            boolean r6 = r0.f1453b
            boolean r8 = r0.f1456e
            java.lang.Object r6 = i(r4, r1, r6)
            java.lang.Object r15 = j(r4, r3, r8)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            androidx.fragment.app.n r12 = r0.f1452a
            androidx.fragment.app.n r11 = r0.f1455d
            if (r12 == 0) goto L_0x0365
            if (r11 != 0) goto L_0x02bb
            goto L_0x0365
        L_0x02bb:
            boolean r10 = r0.f1453b
            boolean r8 = r34.isEmpty()
            if (r8 == 0) goto L_0x02c7
            r9 = r34
            r8 = 0
            goto L_0x02cd
        L_0x02c7:
            java.lang.Object r8 = l(r4, r12, r11, r10)
            r9 = r34
        L_0x02cd:
            m.a r7 = f(r4, r9, r8, r0)
            boolean r16 = r9.isEmpty()
            if (r16 == 0) goto L_0x02d9
            r8 = 0
            goto L_0x02e4
        L_0x02d9:
            r16 = r8
            java.util.Collection r8 = r7.values()
            r14.addAll(r8)
            r8 = r16
        L_0x02e4:
            if (r6 != 0) goto L_0x02fb
            if (r15 != 0) goto L_0x02fb
            if (r8 != 0) goto L_0x02fb
            r21 = r1
            r27 = r3
            r34 = r9
        L_0x02f0:
            r23 = r13
            r25 = r14
            r3 = r15
            r24 = r31
            r26 = r32
            goto L_0x036a
        L_0x02fb:
            r21 = r1
            r1 = 1
            c(r12, r11, r10, r7, r1)
            if (r8 == 0) goto L_0x032d
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.w(r8, r5, r14)
            r16 = r12
            boolean r12 = r0.f1456e
            r17 = r13
            androidx.fragment.app.a r13 = r0.f1457f
            r22 = r8
            r8 = r4
            r18 = r9
            r9 = r22
            r19 = r10
            r10 = r15
            r20 = r11
            r11 = r7
            r7 = r16
            r23 = r17
            n(r8, r9, r10, r11, r12, r13)
            if (r6 == 0) goto L_0x0339
            r4.s(r6, r1)
            goto L_0x0339
        L_0x032d:
            r22 = r8
            r18 = r9
            r19 = r10
            r20 = r11
            r7 = r12
            r23 = r13
            r1 = 0
        L_0x0339:
            androidx.fragment.app.p0 r13 = new androidx.fragment.app.p0
            r8 = r13
            r9 = r4
            r10 = r18
            r11 = r22
            r12 = r0
            r0 = r13
            r34 = r18
            r13 = r23
            r25 = r14
            r24 = r31
            r14 = r5
            r27 = r3
            r3 = r15
            r26 = r32
            r15 = r7
            r16 = r20
            r17 = r19
            r18 = r25
            r19 = r6
            r20 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            g0.p.a(r2, r0)
            r14 = r22
            goto L_0x036b
        L_0x0365:
            r21 = r1
            r27 = r3
            goto L_0x02f0
        L_0x036a:
            r14 = 0
        L_0x036b:
            if (r6 != 0) goto L_0x0373
            if (r14 != 0) goto L_0x0373
            if (r3 != 0) goto L_0x0373
            goto L_0x03f5
        L_0x0373:
            r1 = r25
            r0 = r27
            java.util.ArrayList r7 = h(r4, r3, r0, r1, r5)
            if (r7 == 0) goto L_0x0383
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0384
        L_0x0383:
            r3 = 0
        L_0x0384:
            r4.a(r6, r5)
            java.lang.Object r15 = r4.m(r3, r6, r14)
            if (r0 == 0) goto L_0x03af
            if (r7 == 0) goto L_0x03af
            int r8 = r7.size()
            if (r8 > 0) goto L_0x039b
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x03af
        L_0x039b:
            c0.b r1 = new c0.b
            r1.<init>()
            r8 = r44
            androidx.fragment.app.b0$d r8 = (androidx.fragment.app.b0.d) r8
            r8.b(r0, r1)
            androidx.fragment.app.m0 r9 = new androidx.fragment.app.m0
            r9.<init>(r8, r0, r1)
            r4.u(r0, r15, r1, r9)
        L_0x03af:
            if (r15 == 0) goto L_0x03f5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8 = r4
            r9 = r15
            r10 = r6
            r11 = r0
            r12 = r3
            r13 = r7
            r1 = r15
            r15 = r23
            r8.r(r9, r10, r11, r12, r13, r14, r15)
            androidx.fragment.app.n0 r15 = new androidx.fragment.app.n0
            r8 = r15
            r9 = r6
            r10 = r4
            r11 = r5
            r12 = r21
            r13 = r23
            r14 = r0
            r0 = r15
            r15 = r7
            r16 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            g0.p.a(r2, r0)
            androidx.fragment.app.t0 r0 = new androidx.fragment.app.t0
            r6 = r23
            r3 = r34
            r0.<init>(r4, r6, r3)
            g0.p.a(r2, r0)
            r4.c(r2, r1)
            androidx.fragment.app.u0 r0 = new androidx.fragment.app.u0
            r0.<init>(r4, r6, r3)
            g0.p.a(r2, r0)
            goto L_0x03f5
        L_0x03ef:
            r30 = r4
            r24 = r14
            r26 = r15
        L_0x03f5:
            int r14 = r24 + 1
            r0 = r39
            r1 = r40
            r2 = r42
            r3 = r43
            r15 = r26
            r4 = r30
            r6 = 0
            r7 = 1
            goto L_0x0073
        L_0x0407:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q0.p(android.content.Context, androidx.fragment.app.v, java.util.ArrayList, java.util.ArrayList, int, int, boolean, androidx.fragment.app.q0$a):void");
    }
}
