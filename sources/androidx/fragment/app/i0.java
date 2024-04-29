package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<n> f1322a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, h0> f1323b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public e0 f1324c;

    public void a(n nVar) {
        if (!this.f1322a.contains(nVar)) {
            synchronized (this.f1322a) {
                this.f1322a.add(nVar);
            }
            nVar.f1381l = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + nVar);
    }

    public void b() {
        this.f1323b.values().removeAll(Collections.singleton((Object) null));
    }

    public boolean c(String str) {
        return this.f1323b.get(str) != null;
    }

    public n d(String str) {
        h0 h0Var = this.f1323b.get(str);
        if (h0Var != null) {
            return h0Var.f1315c;
        }
        return null;
    }

    public n e(String str) {
        for (h0 next : this.f1323b.values()) {
            if (next != null) {
                n nVar = next.f1315c;
                if (!str.equals(nVar.f1375f)) {
                    nVar = nVar.f1390u.f1217c.e(str);
                }
                if (nVar != null) {
                    return nVar;
                }
            }
        }
        return null;
    }

    public List<h0> f() {
        ArrayList arrayList = new ArrayList();
        for (h0 next : this.f1323b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List<n> g() {
        ArrayList arrayList = new ArrayList();
        Iterator<h0> it = this.f1323b.values().iterator();
        while (it.hasNext()) {
            h0 next = it.next();
            arrayList.add(next != null ? next.f1315c : null);
        }
        return arrayList;
    }

    public h0 h(String str) {
        return this.f1323b.get(str);
    }

    public List<n> i() {
        ArrayList arrayList;
        if (this.f1322a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1322a) {
            arrayList = new ArrayList(this.f1322a);
        }
        return arrayList;
    }

    public void j(h0 h0Var) {
        n nVar = h0Var.f1315c;
        if (!c(nVar.f1375f)) {
            this.f1323b.put(nVar.f1375f, h0Var);
            if (b0.M(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + nVar);
            }
        }
    }

    public void k(h0 h0Var) {
        n nVar = h0Var.f1315c;
        if (nVar.B) {
            this.f1324c.b(nVar);
        }
        if (this.f1323b.put(nVar.f1375f, (Object) null) != null && b0.M(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + nVar);
        }
    }

    public void l(n nVar) {
        synchronized (this.f1322a) {
            this.f1322a.remove(nVar);
        }
        nVar.f1381l = false;
    }
}
