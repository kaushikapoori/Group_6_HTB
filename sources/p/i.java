package p;

import java.util.ArrayList;
import q.j;
import q.p;

public class i extends e implements h {

    /* renamed from: r0  reason: collision with root package name */
    public e[] f3707r0 = new e[4];

    /* renamed from: s0  reason: collision with root package name */
    public int f3708s0 = 0;

    public void V(ArrayList<p> arrayList, int i2, p pVar) {
        for (int i3 = 0; i3 < this.f3708s0; i3++) {
            pVar.a(this.f3707r0[i3]);
        }
        for (int i4 = 0; i4 < this.f3708s0; i4++) {
            j.a(this.f3707r0[i4], i2, arrayList, pVar);
        }
    }

    public void a(f fVar) {
    }
}
