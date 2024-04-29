package x0;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final m.a<String, Method> f4299a;

    /* renamed from: b  reason: collision with root package name */
    public final m.a<String, Method> f4300b;

    /* renamed from: c  reason: collision with root package name */
    public final m.a<String, Class> f4301c;

    public a(m.a<String, Method> aVar, m.a<String, Method> aVar2, m.a<String, Class> aVar3) {
        this.f4299a = aVar;
        this.f4300b = aVar2;
        this.f4301c = aVar3;
    }

    public abstract void a();

    public abstract a b();

    public final Class c(Class<? extends c> cls) {
        Class orDefault = this.f4301c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f4301c.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method d(String str) {
        Class<a> cls = a.class;
        Method orDefault = this.f4299a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f4299a.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method e(Class cls) {
        Method orDefault = this.f4300b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class c2 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c2.getDeclaredMethod("write", new Class[]{cls, a.class});
        this.f4300b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean f();

    public abstract byte[] g();

    public abstract CharSequence h();

    public abstract boolean i(int i2);

    public abstract int j();

    public int k(int i2, int i3) {
        return !i(i3) ? i2 : j();
    }

    public abstract <T extends Parcelable> T l();

    public <T extends Parcelable> T m(T t2, int i2) {
        return !i(i2) ? t2 : l();
    }

    public abstract String n();

    public <T extends c> T o() {
        String n2 = n();
        if (n2 == null) {
            return null;
        }
        a b2 = b();
        try {
            return (c) d(n2).invoke((Object) null, new Object[]{b2});
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e3.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
        }
    }

    public abstract void p(int i2);

    public abstract void q(boolean z2);

    public abstract void r(byte[] bArr);

    public abstract void s(CharSequence charSequence);

    public abstract void t(int i2);

    public abstract void u(Parcelable parcelable);

    public abstract void v(String str);

    public void w(c cVar) {
        if (cVar == null) {
            v((String) null);
            return;
        }
        try {
            v(c(cVar.getClass()).getName());
            a b2 = b();
            try {
                e(cVar.getClass()).invoke((Object) null, new Object[]{cVar, b2});
                b2.a();
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (InvocationTargetException e3) {
                if (e3.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e3.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e5);
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e6);
        }
    }
}
