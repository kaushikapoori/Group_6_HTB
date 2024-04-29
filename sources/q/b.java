package q;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p.e;
import p.f;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<e> f3713a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public a f3714b = new a();

    /* renamed from: c  reason: collision with root package name */
    public f f3715c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3716a;

        /* renamed from: b  reason: collision with root package name */
        public int f3717b;

        /* renamed from: c  reason: collision with root package name */
        public int f3718c;

        /* renamed from: d  reason: collision with root package name */
        public int f3719d;

        /* renamed from: e  reason: collision with root package name */
        public int f3720e;

        /* renamed from: f  reason: collision with root package name */
        public int f3721f;

        /* renamed from: g  reason: collision with root package name */
        public int f3722g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3723h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3724i;

        /* renamed from: j  reason: collision with root package name */
        public int f3725j;
    }

    /* renamed from: q.b$b  reason: collision with other inner class name */
    public interface C0046b {
    }

    public b(f fVar) {
        this.f3715c = fVar;
    }

    public final boolean a(C0046b bVar, e eVar, int i2) {
        this.f3714b.f3716a = eVar.m();
        this.f3714b.f3717b = eVar.t();
        this.f3714b.f3718c = eVar.u();
        this.f3714b.f3719d = eVar.l();
        a aVar = this.f3714b;
        aVar.f3724i = false;
        aVar.f3725j = i2;
        boolean z2 = aVar.f3716a == 3;
        boolean z3 = aVar.f3717b == 3;
        boolean z4 = z2 && eVar.Y > 0.0f;
        boolean z5 = z3 && eVar.Y > 0.0f;
        if (z4 && eVar.f3686t[0] == 4) {
            aVar.f3716a = 1;
        }
        if (z5 && eVar.f3686t[1] == 4) {
            aVar.f3717b = 1;
        }
        ((ConstraintLayout.b) bVar).b(eVar, aVar);
        eVar.S(this.f3714b.f3720e);
        eVar.N(this.f3714b.f3721f);
        a aVar2 = this.f3714b;
        eVar.E = aVar2.f3723h;
        eVar.K(aVar2.f3722g);
        a aVar3 = this.f3714b;
        aVar3.f3725j = 0;
        return aVar3.f3724i;
    }

    public final void b(f fVar, int i2, int i3, int i4) {
        int i5 = fVar.f3657d0;
        int i6 = fVar.f3659e0;
        fVar.Q(0);
        fVar.P(0);
        fVar.W = i3;
        int i7 = fVar.f3657d0;
        if (i3 < i7) {
            fVar.W = i7;
        }
        fVar.X = i4;
        int i8 = fVar.f3659e0;
        if (i4 < i8) {
            fVar.X = i8;
        }
        fVar.Q(i5);
        fVar.P(i6);
        f fVar2 = this.f3715c;
        fVar2.f3695u0 = i2;
        fVar2.V();
    }

    public void c(f fVar) {
        this.f3713a.clear();
        int size = fVar.f3710r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            e eVar = fVar.f3710r0.get(i2);
            if (eVar.m() == 3 || eVar.t() == 3) {
                this.f3713a.add(eVar);
            }
        }
        fVar.d0();
    }
}
