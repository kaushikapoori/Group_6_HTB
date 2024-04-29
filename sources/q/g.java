package q;

import java.util.ArrayList;
import java.util.List;

public class g implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f3736a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3737b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3738c = false;

    /* renamed from: d  reason: collision with root package name */
    public q f3739d;

    /* renamed from: e  reason: collision with root package name */
    public a f3740e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    public int f3741f;

    /* renamed from: g  reason: collision with root package name */
    public int f3742g;

    /* renamed from: h  reason: collision with root package name */
    public int f3743h = 1;

    /* renamed from: i  reason: collision with root package name */
    public h f3744i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3745j = false;

    /* renamed from: k  reason: collision with root package name */
    public List<d> f3746k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List<g> f3747l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public g(q qVar) {
        this.f3739d = qVar;
    }

    public void a(d dVar) {
        for (g gVar : this.f3747l) {
            if (!gVar.f3745j) {
                return;
            }
        }
        this.f3738c = true;
        d dVar2 = this.f3736a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f3737b) {
            this.f3739d.a(this);
            return;
        }
        g gVar2 = null;
        int i2 = 0;
        for (g next : this.f3747l) {
            if (!(next instanceof h)) {
                i2++;
                gVar2 = next;
            }
        }
        if (gVar2 != null && i2 == 1 && gVar2.f3745j) {
            h hVar = this.f3744i;
            if (hVar != null) {
                if (hVar.f3745j) {
                    this.f3741f = this.f3743h * hVar.f3742g;
                } else {
                    return;
                }
            }
            c(gVar2.f3742g + this.f3741f);
        }
        d dVar3 = this.f3736a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b() {
        this.f3747l.clear();
        this.f3746k.clear();
        this.f3745j = false;
        this.f3742g = 0;
        this.f3738c = false;
        this.f3737b = false;
    }

    public void c(int i2) {
        if (!this.f3745j) {
            this.f3745j = true;
            this.f3742g = i2;
            for (d next : this.f3746k) {
                next.a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3739d.f3774b.f3669j0);
        sb.append(":");
        sb.append(this.f3740e);
        sb.append("(");
        sb.append(this.f3745j ? Integer.valueOf(this.f3742g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f3747l.size());
        sb.append(":d=");
        sb.append(this.f3746k.size());
        sb.append(">");
        return sb.toString();
    }
}
