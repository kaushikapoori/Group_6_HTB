package u1;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    public final c f3907a;

    /* renamed from: b  reason: collision with root package name */
    public final float f3908b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f3907a;
            f2 += ((b) cVar).f3908b;
        }
        this.f3907a = cVar;
        this.f3908b = f2;
    }

    public float a(RectF rectF) {
        return Math.max(0.0f, this.f3907a.a(rectF) + this.f3908b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3907a.equals(bVar.f3907a) && this.f3908b == bVar.f3908b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3907a, Float.valueOf(this.f3908b)});
    }
}
