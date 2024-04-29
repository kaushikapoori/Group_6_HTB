package u1;

import android.graphics.RectF;
import java.util.Arrays;

public final class h implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f3957a;

    public h(float f2) {
        this.f3957a = f2;
    }

    public float a(RectF rectF) {
        return rectF.height() * this.f3957a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f3957a == ((h) obj).f3957a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3957a)});
    }
}
