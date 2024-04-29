package androidx.fragment.app;

import androidx.fragment.app.n;
import m.h;
import z.d;

public class x {

    /* renamed from: a  reason: collision with root package name */
    public static final h<ClassLoader, h<String, Class<?>>> f1503a = new h<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        h<ClassLoader, h<String, Class<?>>> hVar = f1503a;
        h orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new h();
            hVar.put(classLoader, orDefault);
        }
        Class<?> cls = (Class) orDefault.getOrDefault(str, null);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        orDefault.put(str, cls2);
        return cls2;
    }

    public static Class<? extends n> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e2) {
            throw new n.c(d.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        } catch (ClassCastException e3) {
            throw new n.c(d.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e3);
        }
    }

    public n a(ClassLoader classLoader, String str) {
        throw null;
    }
}
