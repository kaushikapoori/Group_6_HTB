package v0;

import android.view.View;
import androidx.activity.result.a;
import h.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f4094a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f4095b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<g> f4096c = new ArrayList<>();

    @Deprecated
    public o() {
    }

    public o(View view) {
        this.f4095b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f4095b == oVar.f4095b && this.f4094a.equals(oVar.f4094a);
    }

    public int hashCode() {
        return this.f4094a.hashCode() + (this.f4095b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a2 = a.a("TransitionValues@");
        a2.append(Integer.toHexString(hashCode()));
        a2.append(":\n");
        String a3 = f.a(a2.toString() + "    view = " + this.f4095b + "\n", "    values:");
        for (String next : this.f4094a.keySet()) {
            a3 = a3 + "    " + next + ": " + this.f4094a.get(next) + "\n";
        }
        return a3;
    }
}
