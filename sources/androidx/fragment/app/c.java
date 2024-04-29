package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.n;
import androidx.fragment.app.u;
import androidx.fragment.app.x0;
import g0.p;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import m.g;

public class c extends x0 {

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ List f1257b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ x0.d f1258c;

        public a(List list, x0.d dVar) {
            this.f1257b = list;
            this.f1258c = dVar;
        }

        public void run() {
            if (this.f1257b.contains(this.f1258c)) {
                this.f1257b.remove(this.f1258c);
                c cVar = c.this;
                x0.d dVar = this.f1258c;
                Objects.requireNonNull(cVar);
                dVar.f1514a.a(dVar.f1516c.F);
            }
        }
    }

    public static class b extends C0009c {

        /* renamed from: c  reason: collision with root package name */
        public boolean f1260c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1261d = false;

        /* renamed from: e  reason: collision with root package name */
        public u.a f1262e;

        public b(x0.d dVar, c0.b bVar, boolean z2) {
            super(dVar, bVar);
            this.f1260c = z2;
        }

        public u.a c(Context context) {
            if (this.f1261d) {
                return this.f1262e;
            }
            x0.d dVar = this.f1263a;
            u.a a2 = u.a(context, dVar.f1516c, dVar.f1514a == x0.d.c.VISIBLE, this.f1260c);
            this.f1262e = a2;
            this.f1261d = true;
            return a2;
        }
    }

    /* renamed from: androidx.fragment.app.c$c  reason: collision with other inner class name */
    public static class C0009c {

        /* renamed from: a  reason: collision with root package name */
        public final x0.d f1263a;

        /* renamed from: b  reason: collision with root package name */
        public final c0.b f1264b;

        public C0009c(x0.d dVar, c0.b bVar) {
            this.f1263a = dVar;
            this.f1264b = bVar;
        }

        public void a() {
            x0.d dVar = this.f1263a;
            if (dVar.f1518e.remove(this.f1264b) && dVar.f1518e.isEmpty()) {
                dVar.b();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
            r2 = androidx.fragment.app.x0.d.c.f1527c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean b() {
            /*
                r3 = this;
                androidx.fragment.app.x0$d r0 = r3.f1263a
                androidx.fragment.app.n r0 = r0.f1516c
                android.view.View r0 = r0.F
                androidx.fragment.app.x0$d$c r0 = androidx.fragment.app.x0.d.c.c(r0)
                androidx.fragment.app.x0$d r1 = r3.f1263a
                androidx.fragment.app.x0$d$c r1 = r1.f1514a
                if (r0 == r1) goto L_0x0019
                androidx.fragment.app.x0$d$c r2 = androidx.fragment.app.x0.d.c.VISIBLE
                if (r0 == r2) goto L_0x0017
                if (r1 == r2) goto L_0x0017
                goto L_0x0019
            L_0x0017:
                r0 = 0
                goto L_0x001a
            L_0x0019:
                r0 = 1
            L_0x001a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.C0009c.b():boolean");
        }
    }

    public static class d extends C0009c {

        /* renamed from: c  reason: collision with root package name */
        public final Object f1265c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f1266d;

        /* renamed from: e  reason: collision with root package name */
        public final Object f1267e;

        public d(x0.d dVar, c0.b bVar, boolean z2, boolean z3) {
            super(dVar, bVar);
            Object obj;
            Object obj2;
            if (dVar.f1514a == x0.d.c.VISIBLE) {
                if (z2) {
                    obj2 = dVar.f1516c.v();
                } else {
                    dVar.f1516c.l();
                    obj2 = null;
                }
                this.f1265c = obj2;
                if (z2) {
                    n.b bVar2 = dVar.f1516c.I;
                } else {
                    n.b bVar3 = dVar.f1516c.I;
                }
            } else {
                if (z2) {
                    obj = dVar.f1516c.x();
                } else {
                    dVar.f1516c.o();
                    obj = null;
                }
                this.f1265c = obj;
            }
            this.f1266d = true;
            if (z3) {
                if (z2) {
                    this.f1267e = dVar.f1516c.z();
                    return;
                }
                dVar.f1516c.y();
            }
            this.f1267e = null;
        }

        public final s0 c(Object obj) {
            if (obj == null) {
                return null;
            }
            s0 s0Var = q0.f1450b;
            if (obj instanceof Transition) {
                return s0Var;
            }
            s0 s0Var2 = q0.f1451c;
            if (s0Var2 != null && s0Var2.e(obj)) {
                return s0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f1263a.f1516c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public void b(List<x0.d> list, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        x0.d.c cVar;
        HashMap hashMap;
        String str2;
        StringBuilder sb;
        u.a c2;
        String str3;
        Iterator it;
        x0.d dVar;
        Object obj;
        View view;
        x0.d.c cVar2;
        Object obj2;
        x0.d.c cVar3;
        x0.d dVar2;
        View view2;
        Object obj3;
        String str4;
        m.a aVar;
        ArrayList arrayList3;
        x0.d.c cVar4;
        ArrayList arrayList4;
        ArrayList arrayList5;
        x0.d dVar3;
        s0 s0Var;
        HashMap hashMap2;
        ArrayList arrayList6;
        Rect rect;
        View view3;
        ArrayList<String> arrayList7;
        ArrayList<String> arrayList8;
        ArrayList<String> arrayList9;
        ArrayList<String> arrayList10;
        int i2;
        View view4;
        boolean z3 = z2;
        x0.d.c cVar5 = x0.d.c.GONE;
        x0.d.c cVar6 = x0.d.c.VISIBLE;
        x0.d dVar4 = null;
        x0.d dVar5 = null;
        for (x0.d next : list) {
            x0.d.c c3 = x0.d.c.c(next.f1516c.F);
            int ordinal = next.f1514a.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (!(ordinal == 2 || ordinal == 3)) {
                    }
                } else if (c3 != cVar6) {
                    dVar5 = next;
                }
            }
            if (c3 == cVar6 && dVar4 == null) {
                dVar4 = next;
            }
        }
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList(list);
        Iterator<x0.d> it2 = list.iterator();
        while (it2.hasNext()) {
            x0.d next2 = it2.next();
            c0.b bVar = new c0.b();
            next2.d();
            next2.f1518e.add(bVar);
            arrayList11.add(new b(next2, bVar, z3));
            c0.b bVar2 = new c0.b();
            next2.d();
            next2.f1518e.add(bVar2);
            arrayList12.add(new d(next2, bVar2, z3, !z3 ? next2 == dVar5 : next2 == dVar4));
            next2.f1517d.add(new a(arrayList13, next2));
        }
        HashMap hashMap3 = new HashMap();
        Iterator it3 = arrayList12.iterator();
        s0 s0Var2 = null;
        while (it3.hasNext()) {
            d dVar6 = (d) it3.next();
            if (!dVar6.b()) {
                s0 c4 = dVar6.c(dVar6.f1265c);
                s0 c5 = dVar6.c(dVar6.f1267e);
                if (c4 == null || c5 == null || c4 == c5) {
                    if (c4 == null) {
                        c4 = c5;
                    }
                    if (s0Var2 == null) {
                        s0Var2 = c4;
                    } else if (!(c4 == null || s0Var2 == c4)) {
                        StringBuilder a2 = androidx.activity.result.a.a("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                        a2.append(dVar6.f1263a.f1516c);
                        a2.append(" returned Transition ");
                        a2.append(dVar6.f1265c);
                        a2.append(" which uses a different Transition  type than other Fragments.");
                        throw new IllegalArgumentException(a2.toString());
                    }
                } else {
                    StringBuilder a3 = androidx.activity.result.a.a("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    a3.append(dVar6.f1263a.f1516c);
                    a3.append(" returned Transition ");
                    a3.append(dVar6.f1265c);
                    a3.append(" which uses a different Transition  type than its shared element transition ");
                    a3.append(dVar6.f1267e);
                    throw new IllegalArgumentException(a3.toString());
                }
            }
        }
        if (s0Var2 == null) {
            Iterator it4 = arrayList12.iterator();
            while (it4.hasNext()) {
                d dVar7 = (d) it4.next();
                hashMap3.put(dVar7.f1263a, Boolean.FALSE);
                dVar7.a();
            }
            cVar = cVar5;
            arrayList2 = arrayList11;
            arrayList = arrayList13;
            hashMap = hashMap3;
            str = "FragmentManager";
        } else {
            View view5 = new View(this.f1504a.getContext());
            Rect rect2 = new Rect();
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            arrayList2 = arrayList11;
            m.a aVar2 = new m.a();
            Iterator it5 = arrayList12.iterator();
            Rect rect3 = rect2;
            Object obj4 = null;
            View view6 = null;
            boolean z4 = false;
            View view7 = view5;
            String str5 = "FragmentManager";
            x0.d dVar8 = dVar4;
            x0.d dVar9 = dVar5;
            while (it5.hasNext()) {
                x0.d.c cVar7 = cVar6;
                Object obj5 = ((d) it5.next()).f1267e;
                if (!(obj5 != null) || dVar8 == null || dVar9 == null) {
                    arrayList6 = arrayList14;
                    cVar4 = cVar5;
                    aVar = aVar2;
                    arrayList3 = arrayList12;
                    arrayList4 = arrayList13;
                    hashMap2 = hashMap3;
                    str4 = str5;
                    arrayList5 = arrayList15;
                    dVar3 = dVar5;
                    view3 = view7;
                    s0Var = s0Var2;
                    rect = rect3;
                } else {
                    Object y2 = s0Var2.y(s0Var2.g(obj5));
                    n.b bVar3 = dVar9.f1516c.I;
                    if (bVar3 == null || (arrayList7 = bVar3.f1405i) == null) {
                        arrayList7 = new ArrayList<>();
                    }
                    s0 s0Var3 = s0Var2;
                    n.b bVar4 = dVar8.f1516c.I;
                    if (bVar4 == null || (arrayList8 = bVar4.f1405i) == null) {
                        arrayList8 = new ArrayList<>();
                    }
                    arrayList4 = arrayList13;
                    n.b bVar5 = dVar8.f1516c.I;
                    if (bVar5 == null || (arrayList9 = bVar5.f1406j) == null) {
                        arrayList9 = new ArrayList<>();
                    }
                    cVar4 = cVar5;
                    arrayList3 = arrayList12;
                    int i3 = 0;
                    while (i3 < arrayList9.size()) {
                        int indexOf = arrayList7.indexOf(arrayList9.get(i3));
                        ArrayList<String> arrayList16 = arrayList9;
                        if (indexOf != -1) {
                            arrayList7.set(indexOf, arrayList8.get(i3));
                        }
                        i3++;
                        arrayList9 = arrayList16;
                    }
                    n.b bVar6 = dVar9.f1516c.I;
                    if (bVar6 == null || (arrayList10 = bVar6.f1406j) == null) {
                        arrayList10 = new ArrayList<>();
                    }
                    ArrayList<String> arrayList17 = arrayList10;
                    if (!z3) {
                        dVar8.f1516c.p();
                        dVar9.f1516c.m();
                    } else {
                        dVar8.f1516c.m();
                        dVar9.f1516c.p();
                    }
                    int i4 = 0;
                    for (int size = arrayList7.size(); i4 < size; size = size) {
                        aVar2.put(arrayList7.get(i4), arrayList17.get(i4));
                        i4++;
                    }
                    m.a aVar3 = new m.a();
                    k(aVar3, dVar8.f1516c.F);
                    g.k(aVar3, arrayList7);
                    g.k(aVar2, aVar3.keySet());
                    m.a aVar4 = new m.a();
                    k(aVar4, dVar9.f1516c.F);
                    g.k(aVar4, arrayList17);
                    g.k(aVar4, aVar2.values());
                    q0.m(aVar2, aVar4);
                    l(aVar3, aVar2.keySet());
                    l(aVar4, aVar2.values());
                    if (aVar2.isEmpty()) {
                        arrayList14.clear();
                        arrayList15.clear();
                        obj4 = null;
                        rect = rect3;
                        arrayList6 = arrayList14;
                        aVar = aVar2;
                        hashMap2 = hashMap3;
                        str4 = str5;
                        arrayList5 = arrayList15;
                        dVar3 = dVar5;
                        view3 = view7;
                        s0Var = s0Var3;
                    } else {
                        q0.c(dVar9.f1516c, dVar8.f1516c, z3, aVar3, true);
                        arrayList6 = arrayList14;
                        aVar = aVar2;
                        Rect rect4 = rect3;
                        ArrayList<String> arrayList18 = arrayList7;
                        x0.d dVar10 = dVar5;
                        x0.d dVar11 = dVar5;
                        HashMap hashMap4 = hashMap3;
                        arrayList5 = arrayList15;
                        x0.d dVar12 = dVar4;
                        x0.d dVar13 = dVar4;
                        str4 = str5;
                        h hVar = r0;
                        View view8 = view7;
                        Rect rect5 = rect4;
                        s0Var = s0Var3;
                        ViewGroup viewGroup = this.f1504a;
                        h hVar2 = new h(this, dVar10, dVar12, z2, aVar4);
                        p.a(viewGroup, hVar);
                        arrayList6.addAll(aVar3.values());
                        if (!arrayList18.isEmpty()) {
                            i2 = 0;
                            View view9 = (View) aVar3.get(arrayList18.get(0));
                            s0Var.t(y2, view9);
                            view6 = view9;
                        } else {
                            i2 = 0;
                        }
                        arrayList5.addAll(aVar4.values());
                        if (arrayList17.isEmpty() || (view4 = (View) aVar4.get(arrayList17.get(i2))) == null) {
                            rect = rect5;
                            view3 = view8;
                        } else {
                            rect = rect5;
                            p.a(this.f1504a, new i(this, s0Var, view4, rect));
                            view3 = view8;
                            z4 = true;
                        }
                        s0Var.w(y2, view3, arrayList6);
                        s0Var.r(y2, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null, y2, arrayList5);
                        Boolean bool = Boolean.TRUE;
                        hashMap2 = hashMap4;
                        dVar4 = dVar13;
                        hashMap2.put(dVar4, bool);
                        dVar3 = dVar11;
                        hashMap2.put(dVar3, bool);
                        obj4 = y2;
                        dVar8 = dVar4;
                        dVar9 = dVar3;
                    }
                }
                view7 = view3;
                rect3 = rect;
                arrayList14 = arrayList6;
                s0Var2 = s0Var;
                dVar5 = dVar3;
                arrayList15 = arrayList5;
                cVar6 = cVar7;
                arrayList13 = arrayList4;
                arrayList12 = arrayList3;
                aVar2 = aVar;
                str5 = str4;
                z3 = z2;
                hashMap3 = hashMap2;
                cVar5 = cVar4;
            }
            ArrayList arrayList19 = arrayList14;
            x0.d.c cVar8 = cVar5;
            x0.d.c cVar9 = cVar6;
            m.a aVar5 = aVar2;
            ArrayList arrayList20 = arrayList12;
            arrayList = arrayList13;
            hashMap = hashMap3;
            String str6 = str5;
            ArrayList arrayList21 = arrayList15;
            x0.d dVar14 = dVar5;
            View view10 = view7;
            s0 s0Var4 = s0Var2;
            Rect rect6 = rect3;
            ArrayList arrayList22 = new ArrayList();
            Iterator it6 = arrayList20.iterator();
            Object obj6 = null;
            Object obj7 = null;
            while (it6.hasNext()) {
                d dVar15 = (d) it6.next();
                if (dVar15.b()) {
                    it = it6;
                    dVar = dVar14;
                    hashMap.put(dVar15.f1263a, Boolean.FALSE);
                    dVar15.a();
                    view = view10;
                    obj = obj4;
                    dVar2 = dVar9;
                    obj2 = obj6;
                    view2 = view6;
                    cVar3 = cVar9;
                    cVar2 = cVar8;
                } else {
                    it = it6;
                    dVar = dVar14;
                    Object g2 = s0Var4.g(dVar15.f1265c);
                    x0.d dVar16 = dVar15.f1263a;
                    boolean z5 = obj4 != null && (dVar16 == dVar8 || dVar16 == dVar9);
                    if (g2 == null) {
                        if (!z5) {
                            hashMap.put(dVar16, Boolean.FALSE);
                            dVar15.a();
                        }
                        view = view10;
                        obj = obj4;
                        obj3 = obj6;
                        view2 = view6;
                        cVar3 = cVar9;
                        cVar2 = cVar8;
                    } else {
                        obj = obj4;
                        ArrayList arrayList23 = new ArrayList();
                        Object obj8 = obj6;
                        j(arrayList23, dVar16.f1516c.F);
                        if (z5) {
                            if (dVar16 == dVar8) {
                                arrayList23.removeAll(arrayList19);
                            } else {
                                arrayList23.removeAll(arrayList21);
                            }
                        }
                        if (arrayList23.isEmpty()) {
                            s0Var4.a(g2, view10);
                            view = view10;
                            cVar2 = cVar8;
                        } else {
                            s0Var4.b(g2, arrayList23);
                            s0Var4.r(g2, g2, arrayList23, (Object) null, (ArrayList<View>) null, (Object) null, (ArrayList<View>) null);
                            cVar2 = cVar8;
                            if (dVar16.f1514a == cVar2) {
                                arrayList.remove(dVar16);
                                view = view10;
                                ArrayList arrayList24 = new ArrayList(arrayList23);
                                arrayList24.remove(dVar16.f1516c.F);
                                s0Var4.q(g2, dVar16.f1516c.F, arrayList24);
                                p.a(this.f1504a, new j(this, arrayList23));
                            } else {
                                view = view10;
                            }
                        }
                        cVar3 = cVar9;
                        if (dVar16.f1514a == cVar3) {
                            arrayList22.addAll(arrayList23);
                            if (z4) {
                                s0Var4.s(g2, rect6);
                            }
                            view2 = view6;
                        } else {
                            view2 = view6;
                            s0Var4.t(g2, view2);
                        }
                        hashMap.put(dVar16, Boolean.TRUE);
                        if (dVar15.f1266d) {
                            obj7 = s0Var4.m(obj7, g2, (Object) null);
                            obj3 = obj8;
                        } else {
                            obj3 = s0Var4.m(obj8, g2, (Object) null);
                        }
                    }
                    obj2 = obj3;
                    dVar2 = dVar;
                }
                view6 = view2;
                cVar9 = cVar3;
                cVar8 = cVar2;
                view10 = view;
                dVar14 = dVar;
                dVar9 = dVar2;
                obj6 = obj2;
                obj4 = obj;
                it6 = it;
            }
            x0.d dVar17 = dVar14;
            Object obj9 = obj6;
            cVar = cVar8;
            Object l2 = s0Var4.l(obj7, obj9, obj4);
            Iterator it7 = arrayList20.iterator();
            while (it7.hasNext()) {
                d dVar18 = (d) it7.next();
                if (!dVar18.b()) {
                    Object obj10 = dVar18.f1265c;
                    x0.d dVar19 = dVar18.f1263a;
                    x0.d dVar20 = dVar17;
                    boolean z6 = obj4 != null && (dVar19 == dVar8 || dVar19 == dVar20);
                    if (obj10 != null || z6) {
                        ViewGroup viewGroup2 = this.f1504a;
                        WeakHashMap<View, x> weakHashMap = g0.u.f3063a;
                        if (!u.g.c(viewGroup2)) {
                            if (b0.M(2)) {
                                StringBuilder a4 = androidx.activity.result.a.a("SpecialEffectsController: Container ");
                                a4.append(this.f1504a);
                                a4.append(" has not been laid out. Completing operation ");
                                a4.append(dVar19);
                                str3 = str6;
                                Log.v(str3, a4.toString());
                            } else {
                                str3 = str6;
                            }
                            dVar18.a();
                        } else {
                            String str7 = str6;
                            s0Var4.u(dVar18.f1263a.f1516c, l2, dVar18.f1264b, new k(this, dVar18));
                            dVar8 = dVar8;
                            dVar17 = dVar20;
                        }
                    } else {
                        str3 = str6;
                    }
                    str6 = str3;
                    dVar17 = dVar20;
                }
            }
            str = str6;
            ViewGroup viewGroup3 = this.f1504a;
            WeakHashMap<View, x> weakHashMap2 = g0.u.f3063a;
            if (u.g.c(viewGroup3)) {
                q0.o(arrayList22, 4);
                ArrayList<String> n2 = s0Var4.n(arrayList21);
                s0Var4.c(this.f1504a, l2);
                s0Var4.v(this.f1504a, arrayList19, arrayList21, n2, aVar5);
                q0.o(arrayList22, 0);
                s0Var4.x(obj4, arrayList19, arrayList21);
            }
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup4 = this.f1504a;
        Context context = viewGroup4.getContext();
        ArrayList arrayList25 = new ArrayList();
        Iterator it8 = arrayList2.iterator();
        boolean z7 = false;
        while (it8.hasNext()) {
            b bVar7 = (b) it8.next();
            if (!bVar7.b() && (c2 = bVar7.c(context)) != null) {
                Animator animator = c2.f1489b;
                if (animator == null) {
                    arrayList25.add(bVar7);
                } else {
                    x0.d dVar21 = bVar7.f1263a;
                    n nVar = dVar21.f1516c;
                    if (!Boolean.TRUE.equals(hashMap.get(dVar21))) {
                        boolean z8 = dVar21.f1514a == cVar;
                        ArrayList arrayList26 = arrayList;
                        if (z8) {
                            arrayList26.remove(dVar21);
                        }
                        View view11 = nVar.F;
                        viewGroup4.startViewTransition(view11);
                        HashMap hashMap5 = hashMap;
                        d dVar22 = r0;
                        View view12 = view11;
                        x0.d.c cVar10 = cVar;
                        Animator animator2 = animator;
                        d dVar23 = new d(this, viewGroup4, view12, z8, dVar21, bVar7);
                        animator2.addListener(dVar22);
                        animator2.setTarget(view12);
                        animator2.start();
                        bVar7.f1264b.b(new e(this, animator2));
                        z7 = true;
                        arrayList = arrayList26;
                        cVar = cVar10;
                        hashMap = hashMap5;
                    } else if (b0.M(2)) {
                        Log.v(str, "Ignoring Animator set on " + nVar + " as this Fragment was involved in a Transition.");
                    }
                }
            }
            bVar7.a();
        }
        ArrayList arrayList27 = arrayList;
        Iterator it9 = arrayList25.iterator();
        while (it9.hasNext()) {
            b bVar8 = (b) it9.next();
            x0.d dVar24 = bVar8.f1263a;
            n nVar2 = dVar24.f1516c;
            if (containsValue) {
                if (b0.M(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(nVar2);
                    str2 = " as Animations cannot run alongside Transitions.";
                }
                bVar8.a();
            } else if (z7) {
                if (b0.M(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(nVar2);
                    str2 = " as Animations cannot run alongside Animators.";
                }
                bVar8.a();
            } else {
                View view13 = nVar2.F;
                u.a c6 = bVar8.c(context);
                Objects.requireNonNull(c6);
                Animation animation = c6.f1488a;
                Objects.requireNonNull(animation);
                if (dVar24.f1514a != x0.d.c.REMOVED) {
                    view13.startAnimation(animation);
                    bVar8.a();
                } else {
                    viewGroup4.startViewTransition(view13);
                    u.b bVar9 = new u.b(animation, viewGroup4, view13);
                    bVar9.setAnimationListener(new f(this, viewGroup4, view13, bVar8));
                    view13.startAnimation(bVar9);
                }
                bVar8.f1264b.b(new g(this, view13, viewGroup4, bVar8));
            }
            sb.append(str2);
            Log.v(str, sb.toString());
            bVar8.a();
        }
        Iterator it10 = arrayList27.iterator();
        while (it10.hasNext()) {
            x0.d dVar25 = (x0.d) it10.next();
            dVar25.f1514a.a(dVar25.f1516c.F);
        }
        arrayList27.clear();
    }

    public void j(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!viewGroup.isTransitionGroup()) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt.getVisibility() == 0) {
                        j(arrayList, childAt);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void k(Map<String, View> map, View view) {
        WeakHashMap<View, x> weakHashMap = g0.u.f3063a;
        String k2 = u.i.k(view);
        if (k2 != null) {
            map.put(k2, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    k(map, childAt);
                }
            }
        }
    }

    public void l(m.a<String, View> aVar, Collection<String> collection) {
        Iterator it = ((g.b) aVar.entrySet()).iterator();
        while (true) {
            g.d dVar = (g.d) it;
            if (dVar.hasNext()) {
                dVar.next();
                WeakHashMap<View, x> weakHashMap = g0.u.f3063a;
                if (!collection.contains(u.i.k((View) dVar.getValue()))) {
                    dVar.remove();
                }
            } else {
                return;
            }
        }
    }
}
