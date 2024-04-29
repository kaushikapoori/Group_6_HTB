package z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import y.e;

public class g extends l {

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f4402b = null;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor<?> f4403c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f4404d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Method f4405e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f4406f = false;

    public static boolean f(Object obj, String str, int i2, boolean z2) {
        g();
        try {
            return ((Boolean) f4404d.invoke(obj, new Object[]{str, Integer.valueOf(i2), Boolean.valueOf(z2)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void g() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f4406f) {
            f4406f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e2) {
                Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
                method2 = null;
                cls = null;
                method = null;
            }
            f4403c = constructor;
            f4402b = cls;
            f4404d = method;
            f4405e = method2;
        }
    }

    public Typeface a(Context context, e.b bVar, Resources resources, int i2) {
        g();
        try {
            Object newInstance = f4403c.newInstance(new Object[0]);
            e.c[] cVarArr = bVar.f4326a;
            int length = cVarArr.length;
            int i3 = 0;
            while (i3 < length) {
                e.c cVar = cVarArr[i3];
                File c2 = m.c(context);
                if (c2 == null) {
                    return null;
                }
                try {
                    if (!m.a(c2, resources, cVar.f4332f)) {
                        c2.delete();
                        return null;
                    } else if (!f(newInstance, c2.getPath(), cVar.f4328b, cVar.f4329c)) {
                        return null;
                    } else {
                        i3++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    c2.delete();
                }
            }
            g();
            try {
                Object newInstance2 = Array.newInstance(f4402b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f4405e.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[SYNTHETIC, Splitter:B:18:0x004e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface b(android.content.Context r4, android.os.CancellationSignal r5, d0.l[] r6, int r7) {
        /*
            r3 = this;
            int r0 = r6.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            d0.l r6 = r3.e(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.f2866a     // Catch:{ IOException -> 0x0084 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch:{ IOException -> 0x0084 }
            if (r5 != 0) goto L_0x001e
            if (r5 == 0) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x0084 }
        L_0x001d:
            return r1
        L_0x001e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x004b }
            r6.<init>()     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r7 = "/proc/self/fd/"
            r6.append(r7)     // Catch:{ ErrnoException -> 0x004b }
            int r7 = r5.getFd()     // Catch:{ ErrnoException -> 0x004b }
            r6.append(r7)     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r6 = r6.toString()     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x004b }
            android.system.StructStat r7 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x004b }
            int r7 = r7.st_mode     // Catch:{ ErrnoException -> 0x004b }
            boolean r7 = android.system.OsConstants.S_ISREG(r7)     // Catch:{ ErrnoException -> 0x004b }
            if (r7 == 0) goto L_0x004b
            java.io.File r7 = new java.io.File     // Catch:{ ErrnoException -> 0x004b }
            r7.<init>(r6)     // Catch:{ ErrnoException -> 0x004b }
            goto L_0x004c
        L_0x0049:
            r4 = move-exception
            goto L_0x007b
        L_0x004b:
            r7 = r1
        L_0x004c:
            if (r7 == 0) goto L_0x005d
            boolean r6 = r7.canRead()     // Catch:{ all -> 0x0049 }
            if (r6 != 0) goto L_0x0055
            goto L_0x005d
        L_0x0055:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r7)     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0084 }
            return r4
        L_0x005d:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0049 }
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch:{ all -> 0x0049 }
            r6.<init>(r7)     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface r4 = r3.c(r4, r6)     // Catch:{ all -> 0x0071 }
            r6.close()     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0084 }
            return r4
        L_0x0071:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0076 }
            goto L_0x007a
        L_0x0076:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0049 }
        L_0x007a:
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x007b:
            r5.close()     // Catch:{ all -> 0x007f }
            goto L_0x0083
        L_0x007f:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0084 }
        L_0x0083:
            throw r4     // Catch:{ IOException -> 0x0084 }
        L_0x0084:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.g.b(android.content.Context, android.os.CancellationSignal, d0.l[], int):android.graphics.Typeface");
    }
}
