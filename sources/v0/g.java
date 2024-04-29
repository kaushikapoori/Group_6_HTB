package v0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import g0.u;
import g0.x;
import h.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import m.e;

public abstract class g implements Cloneable {

    /* renamed from: v  reason: collision with root package name */
    public static final int[] f4049v = {2, 1, 3, 4};

    /* renamed from: w  reason: collision with root package name */
    public static final androidx.activity.result.d f4050w = new a();

    /* renamed from: x  reason: collision with root package name */
    public static ThreadLocal<m.a<Animator, b>> f4051x = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public String f4052b = getClass().getName();

    /* renamed from: c  reason: collision with root package name */
    public long f4053c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f4054d = -1;

    /* renamed from: e  reason: collision with root package name */
    public TimeInterpolator f4055e = null;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<Integer> f4056f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<View> f4057g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public n.c f4058h = new n.c(2);

    /* renamed from: i  reason: collision with root package name */
    public n.c f4059i = new n.c(2);

    /* renamed from: j  reason: collision with root package name */
    public m f4060j = null;

    /* renamed from: k  reason: collision with root package name */
    public int[] f4061k = f4049v;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<o> f4062l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<o> f4063m;

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<Animator> f4064n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public int f4065o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f4066p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4067q = false;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<d> f4068r = null;

    /* renamed from: s  reason: collision with root package name */
    public ArrayList<Animator> f4069s = new ArrayList<>();

    /* renamed from: t  reason: collision with root package name */
    public c f4070t;

    /* renamed from: u  reason: collision with root package name */
    public androidx.activity.result.d f4071u = f4050w;

    public static class a extends androidx.activity.result.d {
        public a() {
            super(2);
        }

        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f4072a;

        /* renamed from: b  reason: collision with root package name */
        public String f4073b;

        /* renamed from: c  reason: collision with root package name */
        public o f4074c;

        /* renamed from: d  reason: collision with root package name */
        public a0 f4075d;

        /* renamed from: e  reason: collision with root package name */
        public g f4076e;

        public b(View view, String str, g gVar, a0 a0Var, o oVar) {
            this.f4072a = view;
            this.f4073b = str;
            this.f4074c = oVar;
            this.f4075d = a0Var;
            this.f4076e = gVar;
        }
    }

    public static abstract class c {
    }

    public interface d {
        void a(g gVar);

        void b(g gVar);

        void c(g gVar);

        void d(g gVar);

        void e(g gVar);
    }

    public static void c(n.c cVar, View view, o oVar) {
        ((m.a) cVar.f3438a).put(view, oVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) cVar.f3439b).indexOfKey(id) >= 0) {
                ((SparseArray) cVar.f3439b).put(id, (Object) null);
            } else {
                ((SparseArray) cVar.f3439b).put(id, view);
            }
        }
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        String k2 = u.i.k(view);
        if (k2 != null) {
            if (((m.a) cVar.f3441d).e(k2) >= 0) {
                ((m.a) cVar.f3441d).put(k2, null);
            } else {
                ((m.a) cVar.f3441d).put(k2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                e eVar = (e) cVar.f3440c;
                if (eVar.f3345b) {
                    eVar.d();
                }
                if (m.d.b(eVar.f3346c, eVar.f3348e, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((e) cVar.f3440c).e(itemIdAtPosition);
                    if (view2 != null) {
                        u.d.r(view2, false);
                        ((e) cVar.f3440c).g(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                u.d.r(view, true);
                ((e) cVar.f3440c).g(itemIdAtPosition, view);
            }
        }
    }

    public static m.a<Animator, b> o() {
        m.a<Animator, b> aVar = f4051x.get();
        if (aVar != null) {
            return aVar;
        }
        m.a<Animator, b> aVar2 = new m.a<>();
        f4051x.set(aVar2);
        return aVar2;
    }

    public static boolean t(o oVar, o oVar2, String str) {
        Object obj = oVar.f4094a.get(str);
        Object obj2 = oVar2.f4094a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public void A(c cVar) {
        this.f4070t = cVar;
    }

    public g B(TimeInterpolator timeInterpolator) {
        this.f4055e = timeInterpolator;
        return this;
    }

    public void C(androidx.activity.result.d dVar) {
        if (dVar == null) {
            dVar = f4050w;
        }
        this.f4071u = dVar;
    }

    public void D(l lVar) {
    }

    public g E(long j2) {
        this.f4053c = j2;
        return this;
    }

    public void F() {
        if (this.f4065o == 0) {
            ArrayList<d> arrayList = this.f4068r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4068r.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).e(this);
                }
            }
            this.f4067q = false;
        }
        this.f4065o++;
    }

    public String G(String str) {
        StringBuilder a2 = androidx.activity.result.a.a(str);
        a2.append(getClass().getSimpleName());
        a2.append("@");
        a2.append(Integer.toHexString(hashCode()));
        a2.append(": ");
        String sb = a2.toString();
        if (this.f4054d != -1) {
            sb = sb + "dur(" + this.f4054d + ") ";
        }
        if (this.f4053c != -1) {
            sb = sb + "dly(" + this.f4053c + ") ";
        }
        if (this.f4055e != null) {
            sb = sb + "interp(" + this.f4055e + ") ";
        }
        if (this.f4056f.size() <= 0 && this.f4057g.size() <= 0) {
            return sb;
        }
        String a3 = f.a(sb, "tgts(");
        if (this.f4056f.size() > 0) {
            for (int i2 = 0; i2 < this.f4056f.size(); i2++) {
                if (i2 > 0) {
                    a3 = f.a(a3, ", ");
                }
                StringBuilder a4 = androidx.activity.result.a.a(a3);
                a4.append(this.f4056f.get(i2));
                a3 = a4.toString();
            }
        }
        if (this.f4057g.size() > 0) {
            for (int i3 = 0; i3 < this.f4057g.size(); i3++) {
                if (i3 > 0) {
                    a3 = f.a(a3, ", ");
                }
                StringBuilder a5 = androidx.activity.result.a.a(a3);
                a5.append(this.f4057g.get(i3));
                a3 = a5.toString();
            }
        }
        return f.a(a3, ")");
    }

    public g a(d dVar) {
        if (this.f4068r == null) {
            this.f4068r = new ArrayList<>();
        }
        this.f4068r.add(dVar);
        return this;
    }

    public g b(View view) {
        this.f4057g.add(view);
        return this;
    }

    public abstract void d(o oVar);

    public final void e(View view, boolean z2) {
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                o oVar = new o(view);
                if (z2) {
                    g(oVar);
                } else {
                    d(oVar);
                }
                oVar.f4096c.add(this);
                f(oVar);
                c(z2 ? this.f4058h : this.f4059i, view, oVar);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    e(viewGroup.getChildAt(i2), z2);
                }
            }
        }
    }

    public void f(o oVar) {
    }

    public abstract void g(o oVar);

    public void h(ViewGroup viewGroup, boolean z2) {
        i(z2);
        if (this.f4056f.size() > 0 || this.f4057g.size() > 0) {
            for (int i2 = 0; i2 < this.f4056f.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.f4056f.get(i2).intValue());
                if (findViewById != null) {
                    o oVar = new o(findViewById);
                    if (z2) {
                        g(oVar);
                    } else {
                        d(oVar);
                    }
                    oVar.f4096c.add(this);
                    f(oVar);
                    c(z2 ? this.f4058h : this.f4059i, findViewById, oVar);
                }
            }
            for (int i3 = 0; i3 < this.f4057g.size(); i3++) {
                View view = this.f4057g.get(i3);
                o oVar2 = new o(view);
                if (z2) {
                    g(oVar2);
                } else {
                    d(oVar2);
                }
                oVar2.f4096c.add(this);
                f(oVar2);
                c(z2 ? this.f4058h : this.f4059i, view, oVar2);
            }
            return;
        }
        e(viewGroup, z2);
    }

    public void i(boolean z2) {
        n.c cVar;
        if (z2) {
            ((m.a) this.f4058h.f3438a).clear();
            ((SparseArray) this.f4058h.f3439b).clear();
            cVar = this.f4058h;
        } else {
            ((m.a) this.f4059i.f3438a).clear();
            ((SparseArray) this.f4059i.f3439b).clear();
            cVar = this.f4059i;
        }
        ((e) cVar.f3440c).b();
    }

    /* renamed from: j */
    public g clone() {
        try {
            g gVar = (g) super.clone();
            gVar.f4069s = new ArrayList<>();
            gVar.f4058h = new n.c(2);
            gVar.f4059i = new n.c(2);
            gVar.f4062l = null;
            gVar.f4063m = null;
            return gVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator k(ViewGroup viewGroup, o oVar, o oVar2) {
        return null;
    }

    public void l(ViewGroup viewGroup, n.c cVar, n.c cVar2, ArrayList<o> arrayList, ArrayList<o> arrayList2) {
        int i2;
        Animator k2;
        Animator animator;
        o oVar;
        View view;
        o oVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        m.a<Animator, b> o2 = o();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            o oVar3 = arrayList.get(i3);
            o oVar4 = arrayList2.get(i3);
            if (oVar3 != null && !oVar3.f4096c.contains(this)) {
                oVar3 = null;
            }
            if (oVar4 != null && !oVar4.f4096c.contains(this)) {
                oVar4 = null;
            }
            if (!(oVar3 == null && oVar4 == null)) {
                if ((oVar3 == null || oVar4 == null || r(oVar3, oVar4)) && (k2 = k(viewGroup2, oVar3, oVar4)) != null) {
                    if (oVar4 != null) {
                        View view2 = oVar4.f4095b;
                        String[] p2 = p();
                        if (p2 != null && p2.length > 0) {
                            oVar2 = new o(view2);
                            o oVar5 = (o) ((m.a) cVar2.f3438a).get(view2);
                            if (oVar5 != null) {
                                int i4 = 0;
                                while (i4 < p2.length) {
                                    oVar2.f4094a.put(p2[i4], oVar5.f4094a.get(p2[i4]));
                                    i4++;
                                    k2 = k2;
                                    size = size;
                                    oVar5 = oVar5;
                                }
                            }
                            Animator animator3 = k2;
                            i2 = size;
                            int i5 = o2.f3377d;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= i5) {
                                    animator2 = animator3;
                                    break;
                                }
                                b bVar = o2.get(o2.h(i6));
                                if (bVar.f4074c != null && bVar.f4072a == view2 && bVar.f4073b.equals(this.f4052b) && bVar.f4074c.equals(oVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            n.c cVar3 = cVar2;
                            i2 = size;
                            animator2 = k2;
                            oVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        oVar = oVar2;
                    } else {
                        n.c cVar4 = cVar2;
                        i2 = size;
                        view = oVar3.f4095b;
                        animator = k2;
                        oVar = null;
                    }
                    if (animator != null) {
                        String str = this.f4052b;
                        w wVar = q.f4098a;
                        o2.put(animator, new b(view, str, this, new z(viewGroup2), oVar));
                        this.f4069s.add(animator);
                    }
                    i3++;
                    size = i2;
                }
            }
            n.c cVar5 = cVar2;
            i2 = size;
            i3++;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator4 = this.f4069s.get(sparseIntArray.keyAt(i7));
                animator4.setStartDelay(animator4.getStartDelay() + (((long) sparseIntArray.valueAt(i7)) - Long.MAX_VALUE));
            }
        }
    }

    public void m() {
        int i2 = this.f4065o - 1;
        this.f4065o = i2;
        if (i2 == 0) {
            ArrayList<d> arrayList = this.f4068r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4068r.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((d) arrayList2.get(i3)).d(this);
                }
            }
            for (int i4 = 0; i4 < ((e) this.f4058h.f3440c).h(); i4++) {
                View view = (View) ((e) this.f4058h.f3440c).i(i4);
                if (view != null) {
                    WeakHashMap<View, x> weakHashMap = u.f3063a;
                    u.d.r(view, false);
                }
            }
            for (int i5 = 0; i5 < ((e) this.f4059i.f3440c).h(); i5++) {
                View view2 = (View) ((e) this.f4059i.f3440c).i(i5);
                if (view2 != null) {
                    WeakHashMap<View, x> weakHashMap2 = u.f3063a;
                    u.d.r(view2, false);
                }
            }
            this.f4067q = true;
        }
    }

    public o n(View view, boolean z2) {
        m mVar = this.f4060j;
        if (mVar != null) {
            return mVar.n(view, z2);
        }
        ArrayList<o> arrayList = z2 ? this.f4062l : this.f4063m;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            o oVar = arrayList.get(i3);
            if (oVar == null) {
                return null;
            }
            if (oVar.f4095b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 < 0) {
            return null;
        }
        return (z2 ? this.f4063m : this.f4062l).get(i2);
    }

    public String[] p() {
        return null;
    }

    public o q(View view, boolean z2) {
        m mVar = this.f4060j;
        if (mVar != null) {
            return mVar.q(view, z2);
        }
        return (o) ((m.a) (z2 ? this.f4058h : this.f4059i).f3438a).getOrDefault(view, null);
    }

    public boolean r(o oVar, o oVar2) {
        if (oVar == null || oVar2 == null) {
            return false;
        }
        String[] p2 = p();
        if (p2 != null) {
            int length = p2.length;
            int i2 = 0;
            while (i2 < length) {
                if (!t(oVar, oVar2, p2[i2])) {
                    i2++;
                }
            }
            return false;
        }
        for (String t2 : oVar.f4094a.keySet()) {
            if (t(oVar, oVar2, t2)) {
            }
        }
        return false;
        return true;
    }

    public boolean s(View view) {
        return (this.f4056f.size() == 0 && this.f4057g.size() == 0) || this.f4056f.contains(Integer.valueOf(view.getId())) || this.f4057g.contains(view);
    }

    public String toString() {
        return G("");
    }

    public void u(View view) {
        int i2;
        if (!this.f4067q) {
            m.a<Animator, b> o2 = o();
            int i3 = o2.f3377d;
            w wVar = q.f4098a;
            WindowId windowId = view.getWindowId();
            int i4 = i3 - 1;
            while (true) {
                i2 = 0;
                if (i4 < 0) {
                    break;
                }
                b k2 = o2.k(i4);
                if (k2.f4072a != null) {
                    a0 a0Var = k2.f4075d;
                    if ((a0Var instanceof z) && ((z) a0Var).f4127a.equals(windowId)) {
                        i2 = 1;
                    }
                    if (i2 != 0) {
                        o2.h(i4).pause();
                    }
                }
                i4--;
            }
            ArrayList<d> arrayList = this.f4068r;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4068r.clone();
                int size = arrayList2.size();
                while (i2 < size) {
                    ((d) arrayList2.get(i2)).b(this);
                    i2++;
                }
            }
            this.f4066p = true;
        }
    }

    public g v(d dVar) {
        ArrayList<d> arrayList = this.f4068r;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(dVar);
        if (this.f4068r.size() == 0) {
            this.f4068r = null;
        }
        return this;
    }

    public g w(View view) {
        this.f4057g.remove(view);
        return this;
    }

    public void x(View view) {
        if (this.f4066p) {
            if (!this.f4067q) {
                m.a<Animator, b> o2 = o();
                int i2 = o2.f3377d;
                w wVar = q.f4098a;
                WindowId windowId = view.getWindowId();
                for (int i3 = i2 - 1; i3 >= 0; i3--) {
                    b k2 = o2.k(i3);
                    if (k2.f4072a != null) {
                        a0 a0Var = k2.f4075d;
                        if ((a0Var instanceof z) && ((z) a0Var).f4127a.equals(windowId)) {
                            o2.h(i3).resume();
                        }
                    }
                }
                ArrayList<d> arrayList = this.f4068r;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f4068r.clone();
                    int size = arrayList2.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        ((d) arrayList2.get(i4)).c(this);
                    }
                }
            }
            this.f4066p = false;
        }
    }

    public void y() {
        F();
        m.a<Animator, b> o2 = o();
        Iterator<Animator> it = this.f4069s.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (o2.containsKey(next)) {
                F();
                if (next != null) {
                    next.addListener(new h(this, o2));
                    long j2 = this.f4054d;
                    if (j2 >= 0) {
                        next.setDuration(j2);
                    }
                    long j3 = this.f4053c;
                    if (j3 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f4055e;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new i(this));
                    next.start();
                }
            }
        }
        this.f4069s.clear();
        m();
    }

    public g z(long j2) {
        this.f4054d = j2;
        return this;
    }
}
