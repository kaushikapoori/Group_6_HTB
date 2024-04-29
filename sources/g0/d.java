package g0;

import androidx.activity.result.a;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3046a;

    public d(Object obj) {
        this.f3046a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f3046a, ((d) obj).f3046a);
    }

    public int hashCode() {
        Object obj = this.f3046a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder a2 = a.a("DisplayCutoutCompat{");
        a2.append(this.f3046a);
        a2.append("}");
        return a2.toString();
    }
}
