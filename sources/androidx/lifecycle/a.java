package androidx.lifecycle;

import androidx.lifecycle.g;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Deprecated
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static a f1564c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, C0010a> f1565a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Boolean> f1566b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    public static class C0010a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<g.b, List<b>> f1567a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<b, g.b> f1568b;

        public C0010a(Map<b, g.b> map) {
            this.f1568b = map;
            for (Map.Entry next : map.entrySet()) {
                g.b bVar = (g.b) next.getValue();
                List list = this.f1567a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f1567a.put(bVar, list);
                }
                list.add((b) next.getKey());
            }
        }

        public static void a(List<b> list, k kVar, g.b bVar, Object obj) {
            if (list != null) {
                int size = list.size() - 1;
                while (size >= 0) {
                    b bVar2 = list.get(size);
                    Objects.requireNonNull(bVar2);
                    try {
                        int i2 = bVar2.f1569a;
                        if (i2 == 0) {
                            bVar2.f1570b.invoke(obj, new Object[0]);
                        } else if (i2 == 1) {
                            bVar2.f1570b.invoke(obj, new Object[]{kVar});
                        } else if (i2 == 2) {
                            bVar2.f1570b.invoke(obj, new Object[]{kVar, bVar});
                        }
                        size--;
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException(e3);
                    }
                }
            }
        }
    }

    @Deprecated
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f1569a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f1570b;

        public b(int i2, Method method) {
            this.f1569a = i2;
            this.f1570b = method;
            method.setAccessible(true);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f1569a == bVar.f1569a && this.f1570b.getName().equals(bVar.f1570b.getName());
        }

        public int hashCode() {
            return this.f1570b.getName().hashCode() + (this.f1569a * 31);
        }
    }

    public final C0010a a(Class<?> cls, Method[] methodArr) {
        int i2;
        C0010a b2;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (!(superclass == null || (b2 = b(superclass)) == null)) {
            hashMap.putAll(b2.f1568b);
        }
        for (Class b3 : cls.getInterfaces()) {
            for (Map.Entry next : b(b3).f1568b.entrySet()) {
                c(hashMap, (b) next.getKey(), (g.b) next.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            q qVar = (q) method.getAnnotation(q.class);
            if (qVar != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (parameterTypes[0].isAssignableFrom(k.class)) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                g.b value = qVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(g.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == g.b.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(i2, method), value, cls);
                    z2 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0010a aVar = new C0010a(hashMap);
        this.f1565a.put(cls, aVar);
        this.f1566b.put(cls, Boolean.valueOf(z2));
        return aVar;
    }

    public C0010a b(Class<?> cls) {
        C0010a aVar = this.f1565a.get(cls);
        return aVar != null ? aVar : a(cls, (Method[]) null);
    }

    public final void c(Map<b, g.b> map, b bVar, g.b bVar2, Class<?> cls) {
        g.b bVar3 = map.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.f1570b;
            StringBuilder a2 = androidx.activity.result.a.a("Method ");
            a2.append(method.getName());
            a2.append(" in ");
            a2.append(cls.getName());
            a2.append(" already declared with different @OnLifecycleEvent value: previous value ");
            a2.append(bVar3);
            a2.append(", new value ");
            a2.append(bVar2);
            throw new IllegalArgumentException(a2.toString());
        } else if (bVar3 == null) {
            map.put(bVar, bVar2);
        }
    }
}
