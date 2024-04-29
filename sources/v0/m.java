package v0;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.d;
import java.util.ArrayList;
import java.util.Iterator;
import n.c;
import v0.g;

public class m extends g {
    public int A;
    public boolean B = false;
    public int C = 0;

    /* renamed from: y  reason: collision with root package name */
    public ArrayList<g> f4087y = new ArrayList<>();

    /* renamed from: z  reason: collision with root package name */
    public boolean f4088z = true;

    public class a extends j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f4089a;

        public a(m mVar, g gVar) {
            this.f4089a = gVar;
        }

        public void d(g gVar) {
            this.f4089a.y();
            gVar.v(this);
        }
    }

    public static class b extends j {

        /* renamed from: a  reason: collision with root package name */
        public m f4090a;

        public b(m mVar) {
            this.f4090a = mVar;
        }

        public void d(g gVar) {
            m mVar = this.f4090a;
            int i2 = mVar.A - 1;
            mVar.A = i2;
            if (i2 == 0) {
                mVar.B = false;
                mVar.m();
            }
            gVar.v(this);
        }

        public void e(g gVar) {
            m mVar = this.f4090a;
            if (!mVar.B) {
                mVar.F();
                this.f4090a.B = true;
            }
        }
    }

    public void A(g.c cVar) {
        this.f4070t = cVar;
        this.C |= 8;
        int size = this.f4087y.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f4087y.get(i2).A(cVar);
        }
    }

    public g B(TimeInterpolator timeInterpolator) {
        this.C |= 1;
        ArrayList<g> arrayList = this.f4087y;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f4087y.get(i2).B(timeInterpolator);
            }
        }
        this.f4055e = timeInterpolator;
        return this;
    }

    public void C(d dVar) {
        this.f4071u = dVar == null ? g.f4050w : dVar;
        this.C |= 4;
        if (this.f4087y != null) {
            for (int i2 = 0; i2 < this.f4087y.size(); i2++) {
                this.f4087y.get(i2).C(dVar);
            }
        }
    }

    public void D(l lVar) {
        this.C |= 2;
        int size = this.f4087y.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f4087y.get(i2).D(lVar);
        }
    }

    public g E(long j2) {
        this.f4053c = j2;
        return this;
    }

    public String G(String str) {
        String G = super.G(str);
        for (int i2 = 0; i2 < this.f4087y.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(G);
            sb.append("\n");
            sb.append(this.f4087y.get(i2).G(str + "  "));
            G = sb.toString();
        }
        return G;
    }

    public m H(g gVar) {
        this.f4087y.add(gVar);
        gVar.f4060j = this;
        long j2 = this.f4054d;
        if (j2 >= 0) {
            gVar.z(j2);
        }
        if ((this.C & 1) != 0) {
            gVar.B(this.f4055e);
        }
        if ((this.C & 2) != 0) {
            gVar.D((l) null);
        }
        if ((this.C & 4) != 0) {
            gVar.C(this.f4071u);
        }
        if ((this.C & 8) != 0) {
            gVar.A(this.f4070t);
        }
        return this;
    }

    public g I(int i2) {
        if (i2 < 0 || i2 >= this.f4087y.size()) {
            return null;
        }
        return this.f4087y.get(i2);
    }

    public m J(int i2) {
        if (i2 == 0) {
            this.f4088z = true;
        } else if (i2 == 1) {
            this.f4088z = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
        }
        return this;
    }

    public g a(g.d dVar) {
        super.a(dVar);
        return this;
    }

    public g b(View view) {
        for (int i2 = 0; i2 < this.f4087y.size(); i2++) {
            this.f4087y.get(i2).b(view);
        }
        this.f4057g.add(view);
        return this;
    }

    public void d(o oVar) {
        if (s(oVar.f4095b)) {
            Iterator<g> it = this.f4087y.iterator();
            while (it.hasNext()) {
                g next = it.next();
                if (next.s(oVar.f4095b)) {
                    next.d(oVar);
                    oVar.f4096c.add(next);
                }
            }
        }
    }

    public void f(o oVar) {
        int size = this.f4087y.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f4087y.get(i2).f(oVar);
        }
    }

    public void g(o oVar) {
        if (s(oVar.f4095b)) {
            Iterator<g> it = this.f4087y.iterator();
            while (it.hasNext()) {
                g next = it.next();
                if (next.s(oVar.f4095b)) {
                    next.g(oVar);
                    oVar.f4096c.add(next);
                }
            }
        }
    }

    /* renamed from: j */
    public g clone() {
        m mVar = (m) super.clone();
        mVar.f4087y = new ArrayList<>();
        int size = this.f4087y.size();
        for (int i2 = 0; i2 < size; i2++) {
            g j2 = this.f4087y.get(i2).clone();
            mVar.f4087y.add(j2);
            j2.f4060j = mVar;
        }
        return mVar;
    }

    public void l(ViewGroup viewGroup, c cVar, c cVar2, ArrayList<o> arrayList, ArrayList<o> arrayList2) {
        long j2 = this.f4053c;
        int size = this.f4087y.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f4087y.get(i2);
            if (j2 > 0 && (this.f4088z || i2 == 0)) {
                long j3 = gVar.f4053c;
                if (j3 > 0) {
                    gVar.E(j3 + j2);
                } else {
                    gVar.E(j2);
                }
            }
            gVar.l(viewGroup, cVar, cVar2, arrayList, arrayList2);
        }
    }

    public void u(View view) {
        super.u(view);
        int size = this.f4087y.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f4087y.get(i2).u(view);
        }
    }

    public g v(g.d dVar) {
        super.v(dVar);
        return this;
    }

    public g w(View view) {
        for (int i2 = 0; i2 < this.f4087y.size(); i2++) {
            this.f4087y.get(i2).w(view);
        }
        this.f4057g.remove(view);
        return this;
    }

    public void x(View view) {
        super.x(view);
        int size = this.f4087y.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f4087y.get(i2).x(view);
        }
    }

    public void y() {
        if (this.f4087y.isEmpty()) {
            F();
            m();
            return;
        }
        b bVar = new b(this);
        Iterator<g> it = this.f4087y.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.A = this.f4087y.size();
        if (!this.f4088z) {
            for (int i2 = 1; i2 < this.f4087y.size(); i2++) {
                this.f4087y.get(i2 - 1).a(new a(this, this.f4087y.get(i2)));
            }
            g gVar = this.f4087y.get(0);
            if (gVar != null) {
                gVar.y();
                return;
            }
            return;
        }
        Iterator<g> it2 = this.f4087y.iterator();
        while (it2.hasNext()) {
            it2.next().y();
        }
    }

    public g z(long j2) {
        ArrayList<g> arrayList;
        this.f4054d = j2;
        if (j2 >= 0 && (arrayList = this.f4087y) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f4087y.get(i2).z(j2);
            }
        }
        return this;
    }
}
