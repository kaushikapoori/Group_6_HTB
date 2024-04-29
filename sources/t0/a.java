package t0;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f3885d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f3886e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f3887a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<? extends b<?>>> f3888b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public final Context f3889c;

    public a(Context context) {
        this.f3889c = context.getApplicationContext();
    }

    public static a b(Context context) {
        if (f3885d == null) {
            synchronized (f3886e) {
                if (f3885d == null) {
                    f3885d = new a(context);
                }
            }
        }
        return f3885d;
    }

    public <T> T a(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t2;
        synchronized (f3886e) {
            if (u0.a.a()) {
                try {
                    Trace.beginSection(cls.getSimpleName());
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            if (!set.contains(cls)) {
                if (!this.f3887a.containsKey(cls)) {
                    set.add(cls);
                    b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends b<?>>> a2 = bVar.a();
                    if (!a2.isEmpty()) {
                        for (Class next : a2) {
                            if (!this.f3887a.containsKey(next)) {
                                a(next, set);
                            }
                        }
                    }
                    t2 = bVar.b(this.f3889c);
                    set.remove(cls);
                    this.f3887a.put(cls, t2);
                } else {
                    t2 = this.f3887a.get(cls);
                }
                Trace.endSection();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
            }
        }
        return t2;
    }
}
