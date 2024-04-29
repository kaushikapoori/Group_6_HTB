package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static Map<Class<?>, Integer> f1590a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static Map<Class<?>, List<Constructor<? extends f>>> f1591b = new HashMap();

    public static f a(Constructor<? extends f> constructor, Object obj) {
        try {
            return (f) constructor.newInstance(new Object[]{obj});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    public static int c(Class<?> cls) {
        Constructor<?> constructor;
        Map<Class<?>, List<Constructor<? extends f>>> map;
        boolean z2;
        Integer num = (Integer) ((HashMap) f1590a).get(cls);
        if (num != null) {
            return num.intValue();
        }
        Class<j> cls2 = j.class;
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            List<?> list = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = packageR != null ? packageR.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String b2 = b(canonicalName);
                if (!name.isEmpty()) {
                    b2 = name + "." + b2;
                }
                constructor = Class.forName(b2).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(e2);
            }
            if (constructor != null) {
                map = f1591b;
                list = Collections.singletonList(constructor);
            } else {
                a aVar = a.f1564c;
                Boolean bool = aVar.f1566b.get(cls);
                if (bool != null) {
                    z2 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                aVar.f1566b.put(cls, Boolean.FALSE);
                                z2 = false;
                                break;
                            } else if (((q) declaredMethods[i3].getAnnotation(q.class)) != null) {
                                aVar.a(cls, declaredMethods);
                                z2 = true;
                                break;
                            } else {
                                i3++;
                            }
                        }
                    } catch (NoClassDefFoundError e3) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e3);
                    }
                }
                if (!z2) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && cls2.isAssignableFrom(superclass)) {
                        if (c(superclass) != 1) {
                            list = new ArrayList<>((Collection) ((HashMap) f1591b).get(superclass));
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            Class cls3 = interfaces[i4];
                            if (cls3 != null && cls2.isAssignableFrom(cls3)) {
                                if (c(cls3) == 1) {
                                    break;
                                }
                                if (list == null) {
                                    list = new ArrayList<>();
                                }
                                list.addAll((Collection) ((HashMap) f1591b).get(cls3));
                            }
                            i4++;
                        } else if (list != null) {
                            map = f1591b;
                        }
                    }
                }
            }
            ((HashMap) map).put(cls, list);
            i2 = 2;
        }
        ((HashMap) f1590a).put(cls, Integer.valueOf(i2));
        return i2;
    }
}
