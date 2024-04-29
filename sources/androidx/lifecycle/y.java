package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class y {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, u> f1606a = new HashMap<>();

    public final void a() {
        for (u next : this.f1606a.values()) {
            Map<String, Object> map = next.f1605a;
            if (map != null) {
                synchronized (map) {
                    for (Object next2 : next.f1605a.values()) {
                        if (next2 instanceof Closeable) {
                            try {
                                ((Closeable) next2).close();
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                }
            }
            next.a();
        }
        this.f1606a.clear();
    }
}
