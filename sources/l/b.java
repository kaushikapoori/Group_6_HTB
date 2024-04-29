package l;

import android.content.res.ColorStateList;
import android.graphics.Rect;

public class b implements d {
    public final e a(c cVar) {
        return (e) cVar.c();
    }

    public float b(c cVar) {
        a((c) null);
        throw null;
    }

    public float c(c cVar) {
        a((c) null);
        throw null;
    }

    public void d(c cVar, ColorStateList colorStateList) {
        a((c) null);
        throw null;
    }

    public void e(c cVar, float f2) {
        e a2 = a(cVar);
        boolean a3 = cVar.a();
        boolean d2 = cVar.d();
        if (f2 != a2.f3312b || a2.f3313c != a3 || a2.f3314d != d2) {
            a2.f3312b = f2;
            a2.f3313c = a3;
            a2.f3314d = d2;
            a2.b((Rect) null);
            throw null;
        } else if (!cVar.a()) {
            cVar.b(0, 0, 0, 0);
        } else {
            float f3 = a(cVar).f3312b;
            float f4 = a(cVar).f3311a;
            int ceil = (int) Math.ceil((double) f.a(f3, f4, cVar.d()));
            int ceil2 = (int) Math.ceil((double) f.b(f3, f4, cVar.d()));
            cVar.b(ceil, ceil2, ceil, ceil2);
        }
    }
}
