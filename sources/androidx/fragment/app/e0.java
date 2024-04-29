package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import java.util.HashMap;
import java.util.Iterator;

public final class e0 extends u {

    /* renamed from: h  reason: collision with root package name */
    public static final v f1282h = new a();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, n> f1283b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, e0> f1284c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap<String, y> f1285d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1286e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1287f = false;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1288g = false;

    public class a implements v {
        public <T extends u> T a(Class<T> cls) {
            return new e0(true);
        }
    }

    public e0(boolean z2) {
        this.f1286e = z2;
    }

    public void a() {
        if (b0.M(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1287f = true;
    }

    public void b(n nVar) {
        if (!this.f1288g) {
            if ((this.f1283b.remove(nVar.f1375f) != null) && b0.M(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Removed " + nVar);
            }
        } else if (b0.M(2)) {
            Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
        }
    }

    public boolean c(n nVar) {
        if (this.f1283b.containsKey(nVar.f1375f) && this.f1286e) {
            return this.f1287f;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0.class != obj.getClass()) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f1283b.equals(e0Var.f1283b) && this.f1284c.equals(e0Var.f1284c) && this.f1285d.equals(e0Var.f1285d);
    }

    public int hashCode() {
        int hashCode = this.f1284c.hashCode();
        return this.f1285d.hashCode() + ((hashCode + (this.f1283b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<n> it = this.f1283b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1284c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1285d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
