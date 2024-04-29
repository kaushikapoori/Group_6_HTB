package p;

import java.util.ArrayList;
import n.c;

public class l extends e {

    /* renamed from: r0  reason: collision with root package name */
    public ArrayList<e> f3710r0 = new ArrayList<>();

    public void F() {
        this.f3710r0.clear();
        super.F();
    }

    public void H(c cVar) {
        super.H(cVar);
        int size = this.f3710r0.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f3710r0.get(i2).H(cVar);
        }
    }

    public void V() {
        ArrayList<e> arrayList = this.f3710r0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.f3710r0.get(i2);
                if (eVar instanceof l) {
                    ((l) eVar).V();
                }
            }
        }
    }
}
