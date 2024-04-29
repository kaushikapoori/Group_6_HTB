package z;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.activity.result.a;
import d0.l;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import y.e;

public class i extends g {

    /* renamed from: g  reason: collision with root package name */
    public final Class<?> f4411g;

    /* renamed from: h  reason: collision with root package name */
    public final Constructor<?> f4412h;

    /* renamed from: i  reason: collision with root package name */
    public final Method f4413i;

    /* renamed from: j  reason: collision with root package name */
    public final Method f4414j;

    /* renamed from: k  reason: collision with root package name */
    public final Method f4415k;

    /* renamed from: l  reason: collision with root package name */
    public final Method f4416l;

    /* renamed from: m  reason: collision with root package name */
    public final Method f4417m;

    public i() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = n(cls2);
            method2 = o(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = p(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            StringBuilder a2 = a.a("Unable to collect necessary methods for class ");
            a2.append(e2.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", a2.toString(), e2);
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f4411g = cls;
        this.f4412h = constructor;
        this.f4413i = method3;
        this.f4414j = method2;
        this.f4415k = method;
        this.f4416l = method4;
        this.f4417m = method5;
    }

    private Object m() {
        try {
            return this.f4412h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Typeface a(Context context, e.b bVar, Resources resources, int i2) {
        if (!l()) {
            return super.a(context, bVar, resources, i2);
        }
        Object m2 = m();
        if (m2 == null) {
            return null;
        }
        for (e.c cVar : bVar.f4326a) {
            if (!i(context, m2, cVar.f4327a, cVar.f4331e, cVar.f4328b, cVar.f4329c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.f4330d))) {
                h(m2);
                return null;
            }
        }
        if (!k(m2)) {
            return null;
        }
        return j(m2);
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, l[] lVarArr, int i2) {
        Typeface j2;
        boolean z2;
        ParcelFileDescriptor openFileDescriptor;
        if (lVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            l e2 = e(lVarArr, i2);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(e2.f2866a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(e2.f2868c).setItalic(e2.f2869d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (l lVar : lVarArr) {
                if (lVar.f2870e == 0) {
                    Uri uri = lVar.f2866a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, m.d(context, cancellationSignal, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            Object m2 = m();
            if (m2 == null) {
                return null;
            }
            boolean z3 = false;
            for (l lVar2 : lVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(lVar2.f2866a);
                if (byteBuffer != null) {
                    try {
                        z2 = ((Boolean) this.f4414j.invoke(m2, new Object[]{byteBuffer, Integer.valueOf(lVar2.f2867b), null, Integer.valueOf(lVar2.f2868c), Integer.valueOf(lVar2.f2869d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                        z2 = false;
                    }
                    if (!z2) {
                        h(m2);
                        return null;
                    }
                    z3 = true;
                }
            }
            if (!z3) {
                h(m2);
                return null;
            } else if (k(m2) && (j2 = j(m2)) != null) {
                return Typeface.create(j2, i2);
            } else {
                return null;
            }
        }
        throw th;
    }

    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        if (!l()) {
            return super.d(context, resources, i2, str, i3);
        }
        Object m2 = m();
        if (m2 == null) {
            return null;
        }
        if (!i(context, m2, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            h(m2);
            return null;
        } else if (!k(m2)) {
            return null;
        } else {
            return j(m2);
        }
    }

    public final void h(Object obj) {
        try {
            this.f4416l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean i(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4413i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f4411g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f4417m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.f4415k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        if (this.f4413i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f4413i != null;
    }

    public Method n(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    public Method o(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    public Method p(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
