package u1;

import android.graphics.RectF;
import java.util.Arrays;

public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f3906a;

    public a(float f2) {
        this.f3906a = f2;
    }

    public float a(RectF rectF) {
        return this.f3906a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f3906a == ((a) obj).f3906a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3906a)});
    }
}
