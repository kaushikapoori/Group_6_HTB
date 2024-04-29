package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b0;
import androidx.fragment.app.n;
import c0.b;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

public abstract class x0 {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f1504a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<d> f1505b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<d> f1506c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f1507d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1508e = false;

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f1509b;

        public a(c cVar) {
            this.f1509b = cVar;
        }

        public void run() {
            if (x0.this.f1505b.contains(this.f1509b)) {
                c cVar = this.f1509b;
                cVar.f1514a.a(cVar.f1516c.F);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f1511b;

        public b(c cVar) {
            this.f1511b = cVar;
        }

        public void run() {
            x0.this.f1505b.remove(this.f1511b);
            x0.this.f1506c.remove(this.f1511b);
        }
    }

    public static class c extends d {

        /* renamed from: h  reason: collision with root package name */
        public final h0 f1513h;

        public c(d.c cVar, d.b bVar, h0 h0Var, c0.b bVar2) {
            super(cVar, bVar, h0Var.f1315c, bVar2);
            this.f1513h = h0Var;
        }

        public void b() {
            super.b();
            this.f1513h.k();
        }

        public void d() {
            if (this.f1515b == d.b.ADDING) {
                n nVar = this.f1513h.f1315c;
                View findFocus = nVar.F.findFocus();
                if (findFocus != null) {
                    nVar.g().f1411o = findFocus;
                    if (b0.M(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + nVar);
                    }
                }
                View V = this.f1516c.V();
                if (V.getParent() == null) {
                    this.f1513h.b();
                    V.setAlpha(0.0f);
                }
                if (V.getAlpha() == 0.0f && V.getVisibility() == 0) {
                    V.setVisibility(4);
                }
                n.b bVar = nVar.I;
                V.setAlpha(bVar == null ? 1.0f : bVar.f1410n);
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public c f1514a;

        /* renamed from: b  reason: collision with root package name */
        public b f1515b;

        /* renamed from: c  reason: collision with root package name */
        public final n f1516c;

        /* renamed from: d  reason: collision with root package name */
        public final List<Runnable> f1517d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final HashSet<c0.b> f1518e = new HashSet<>();

        /* renamed from: f  reason: collision with root package name */
        public boolean f1519f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1520g = false;

        public class a implements b.a {
            public a() {
            }

            public void a() {
                d.this.a();
            }
        }

        public enum b {
            NONE,
            ADDING,
            REMOVING
        }

        public enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            public static c b(int i2) {
                if (i2 == 0) {
                    return VISIBLE;
                }
                if (i2 == 4) {
                    return INVISIBLE;
                }
                if (i2 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i2);
            }

            public static c c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public void a(View view) {
                int i2;
                int ordinal = ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        if (b0.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                        }
                        i2 = 0;
                    } else if (ordinal == 2) {
                        if (b0.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        i2 = 8;
                    } else if (ordinal == 3) {
                        if (b0.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        i2 = 4;
                    } else {
                        return;
                    }
                    view.setVisibility(i2);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (b0.M(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        public d(c cVar, b bVar, n nVar, c0.b bVar2) {
            this.f1514a = cVar;
            this.f1515b = bVar;
            this.f1516c = nVar;
            bVar2.b(new a());
        }

        public final void a() {
            if (!this.f1519f) {
                this.f1519f = true;
                if (this.f1518e.isEmpty()) {
                    b();
                    return;
                }
                Iterator it = new ArrayList(this.f1518e).iterator();
                while (it.hasNext()) {
                    ((c0.b) it.next()).a();
                }
            }
        }

        public void b() {
            if (!this.f1520g) {
                if (b0.M(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
                }
                this.f1520g = true;
                for (Runnable run : this.f1517d) {
                    run.run();
                }
            }
        }

        public final void c(c cVar, b bVar) {
            b bVar2;
            c cVar2 = c.REMOVED;
            int ordinal = bVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (b0.M(2)) {
                            StringBuilder a2 = androidx.activity.result.a.a("SpecialEffectsController: For fragment ");
                            a2.append(this.f1516c);
                            a2.append(" mFinalState = ");
                            a2.append(this.f1514a);
                            a2.append(" -> REMOVED. mLifecycleImpact  = ");
                            a2.append(this.f1515b);
                            a2.append(" to REMOVING.");
                            Log.v("FragmentManager", a2.toString());
                        }
                        this.f1514a = cVar2;
                        bVar2 = b.REMOVING;
                    } else {
                        return;
                    }
                } else if (this.f1514a == cVar2) {
                    if (b0.M(2)) {
                        StringBuilder a3 = androidx.activity.result.a.a("SpecialEffectsController: For fragment ");
                        a3.append(this.f1516c);
                        a3.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                        a3.append(this.f1515b);
                        a3.append(" to ADDING.");
                        Log.v("FragmentManager", a3.toString());
                    }
                    this.f1514a = c.VISIBLE;
                    bVar2 = b.ADDING;
                } else {
                    return;
                }
                this.f1515b = bVar2;
            } else if (this.f1514a != cVar2) {
                if (b0.M(2)) {
                    StringBuilder a4 = androidx.activity.result.a.a("SpecialEffectsController: For fragment ");
                    a4.append(this.f1516c);
                    a4.append(" mFinalState = ");
                    a4.append(this.f1514a);
                    a4.append(" -> ");
                    a4.append(cVar);
                    a4.append(". ");
                    Log.v("FragmentManager", a4.toString());
                }
                this.f1514a = cVar;
            }
        }

        public void d() {
        }

        public String toString() {
            return "Operation " + "{" + Integer.toHexString(System.identityHashCode(this)) + "} " + "{" + "mFinalState = " + this.f1514a + "} " + "{" + "mLifecycleImpact = " + this.f1515b + "} " + "{" + "mFragment = " + this.f1516c + "}";
        }
    }

    public x0(ViewGroup viewGroup) {
        this.f1504a = viewGroup;
    }

    public static x0 f(ViewGroup viewGroup, b0 b0Var) {
        return g(viewGroup, b0Var.K());
    }

    public static x0 g(ViewGroup viewGroup, y0 y0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof x0) {
            return (x0) tag;
        }
        Objects.requireNonNull((b0.f) y0Var);
        c cVar = new c(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, cVar);
        return cVar;
    }

    public final void a(d.c cVar, d.b bVar, h0 h0Var) {
        synchronized (this.f1505b) {
            c0.b bVar2 = new c0.b();
            d d2 = d(h0Var.f1315c);
            if (d2 != null) {
                d2.c(cVar, bVar);
                return;
            }
            c cVar2 = new c(cVar, bVar, h0Var, bVar2);
            this.f1505b.add(cVar2);
            cVar2.f1517d.add(new a(cVar2));
            cVar2.f1517d.add(new b(cVar2));
        }
    }

    public abstract void b(List<d> list, boolean z2);

    public void c() {
        if (!this.f1508e) {
            ViewGroup viewGroup = this.f1504a;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (!u.g.b(viewGroup)) {
                e();
                this.f1507d = false;
                return;
            }
            synchronized (this.f1505b) {
                if (!this.f1505b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f1506c);
                    this.f1506c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        d dVar = (d) it.next();
                        if (b0.M(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + dVar);
                        }
                        dVar.a();
                        if (!dVar.f1520g) {
                            this.f1506c.add(dVar);
                        }
                    }
                    i();
                    ArrayList arrayList2 = new ArrayList(this.f1505b);
                    this.f1505b.clear();
                    this.f1506c.addAll(arrayList2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((d) it2.next()).d();
                    }
                    b(arrayList2, this.f1507d);
                    this.f1507d = false;
                }
            }
        }
    }

    public final d d(n nVar) {
        Iterator<d> it = this.f1505b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f1516c.equals(nVar) && !next.f1519f) {
                return next;
            }
        }
        return null;
    }

    public void e() {
        String str;
        String str2;
        ViewGroup viewGroup = this.f1504a;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        boolean b2 = u.g.b(viewGroup);
        synchronized (this.f1505b) {
            i();
            Iterator<d> it = this.f1505b.iterator();
            while (it.hasNext()) {
                it.next().d();
            }
            Iterator it2 = new ArrayList(this.f1506c).iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                if (b0.M(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (b2) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f1504a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(dVar);
                    Log.v("FragmentManager", sb.toString());
                }
                dVar.a();
            }
            Iterator it3 = new ArrayList(this.f1505b).iterator();
            while (it3.hasNext()) {
                d dVar2 = (d) it3.next();
                if (b0.M(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b2) {
                        str = "";
                    } else {
                        str = "Container " + this.f1504a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(dVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                dVar2.a();
            }
        }
    }

    public void h() {
        synchronized (this.f1505b) {
            i();
            this.f1508e = false;
            int size = this.f1505b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                d dVar = this.f1505b.get(size);
                d.c c2 = d.c.c(dVar.f1516c.F);
                d.c cVar = dVar.f1514a;
                d.c cVar2 = d.c.VISIBLE;
                if (cVar == cVar2 && c2 != cVar2) {
                    this.f1508e = dVar.f1516c.C();
                    break;
                }
                size--;
            }
        }
    }

    public final void i() {
        Iterator<d> it = this.f1505b.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.f1515b == d.b.ADDING) {
                next.c(d.c.b(next.f1516c.V().getVisibility()), d.b.NONE);
            }
        }
    }
}
