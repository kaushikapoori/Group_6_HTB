package f0;

import androidx.activity.result.a;
import java.util.Objects;

public class b<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f2983a;

    /* renamed from: b  reason: collision with root package name */
    public final S f2984b;

    public b(F f2, S s2) {
        this.f2983a = f2;
        this.f2984b = s2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f2983a, this.f2983a) || !Objects.equals(bVar.f2984b, this.f2984b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        F f2 = this.f2983a;
        int i2 = 0;
        int hashCode = f2 == null ? 0 : f2.hashCode();
        S s2 = this.f2984b;
        if (s2 != null) {
            i2 = s2.hashCode();
        }
        return hashCode ^ i2;
    }

    public String toString() {
        StringBuilder a2 = a.a("Pair{");
        a2.append(this.f2983a);
        a2.append(" ");
        a2.append(this.f2984b);
        a2.append("}");
        return a2.toString();
    }
}
