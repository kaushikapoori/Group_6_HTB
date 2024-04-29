package q;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import n.d;
import p.b;
import p.e;
import p.f;

public class p {

    /* renamed from: f  reason: collision with root package name */
    public static int f3767f;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<e> f3768a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f3769b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f3770c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f3771d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f3772e = -1;

    public class a {
        public a(p pVar, e eVar, d dVar, int i2) {
            new WeakReference(eVar);
            dVar.o(eVar.J);
            dVar.o(eVar.K);
            dVar.o(eVar.L);
            dVar.o(eVar.M);
            dVar.o(eVar.N);
        }
    }

    public p(int i2) {
        int i3 = f3767f;
        f3767f = i3 + 1;
        this.f3769b = i3;
        this.f3770c = i2;
    }

    public boolean a(e eVar) {
        if (this.f3768a.contains(eVar)) {
            return false;
        }
        this.f3768a.add(eVar);
        return true;
    }

    public void b(ArrayList<p> arrayList) {
        int size = this.f3768a.size();
        if (this.f3772e != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                p pVar = arrayList.get(i2);
                if (this.f3772e == pVar.f3769b) {
                    d(this.f3770c, pVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c(d dVar, int i2) {
        int i3;
        p.d dVar2;
        if (this.f3768a.size() == 0) {
            return 0;
        }
        ArrayList<e> arrayList = this.f3768a;
        f fVar = (f) arrayList.get(0).V;
        dVar.u();
        fVar.d(dVar, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList.get(i4).d(dVar, false);
        }
        if (i2 == 0 && fVar.A0 > 0) {
            b.a(fVar, dVar, arrayList, 0);
        }
        if (i2 == 1 && fVar.B0 > 0) {
            b.a(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.q();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f3771d = new ArrayList<>();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.f3771d.add(new a(this, arrayList.get(i5), dVar, i2));
        }
        if (i2 == 0) {
            i3 = dVar.o(fVar.J);
            dVar2 = fVar.L;
        } else {
            i3 = dVar.o(fVar.K);
            dVar2 = fVar.M;
        }
        int o2 = dVar.o(dVar2);
        dVar.u();
        return o2 - i3;
    }

    public void d(int i2, p pVar) {
        Iterator<e> it = this.f3768a.iterator();
        while (it.hasNext()) {
            e next = it.next();
            pVar.a(next);
            if (i2 == 0) {
                next.f3681p0 = pVar.f3769b;
            } else {
                next.f3683q0 = pVar.f3769b;
            }
        }
        this.f3772e = pVar.f3769b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i2 = this.f3770c;
        sb.append(i2 == 0 ? "Horizontal" : i2 == 1 ? "Vertical" : i2 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f3769b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator<e> it = this.f3768a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + it.next().f3669j0;
        }
        return h.f.a(sb2, " >");
    }
}
