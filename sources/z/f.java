package z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import d0.m;
import java.lang.reflect.Method;
import y.g;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final l f4399a;

    /* renamed from: b  reason: collision with root package name */
    public static final m.f<String, Typeface> f4400b = new m.f<>(16);

    public static class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public g.c f4401a;

        public a(g.c cVar) {
            this.f4401a = cVar;
        }
    }

    static {
        l lVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            lVar = new k();
        } else if (i2 >= 28) {
            lVar = new j();
        } else if (i2 >= 26) {
            lVar = new i();
        } else {
            if (i2 >= 24) {
                Method method = h.f4409d;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    lVar = new h();
                }
            }
            lVar = new g();
        }
        f4399a = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (r0.equals(r4) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r6, y.e.a r7, android.content.res.Resources r8, int r9, int r10, y.g.c r11, android.os.Handler r12, boolean r13) {
        /*
            boolean r0 = r7 instanceof y.e.d
            r1 = -3
            if (r0 == 0) goto L_0x0145
            y.e$d r7 = (y.e.d) r7
            java.lang.String r0 = r7.f4336d
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0014:
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r3)
            android.graphics.Typeface r4 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r4, r3)
            if (r0 == 0) goto L_0x0027
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r2
        L_0x0028:
            if (r0 == 0) goto L_0x0030
            if (r11 == 0) goto L_0x002f
            r11.b(r0, r12)
        L_0x002f:
            return r0
        L_0x0030:
            if (r13 == 0) goto L_0x0037
            int r0 = r7.f4335c
            if (r0 != 0) goto L_0x003a
            goto L_0x0039
        L_0x0037:
            if (r11 != 0) goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            r0 = -1
            if (r13 == 0) goto L_0x0040
            int r13 = r7.f4334b
            goto L_0x0041
        L_0x0040:
            r13 = -1
        L_0x0041:
            android.os.Handler r12 = y.g.c.c(r12)
            z.f$a r4 = new z.f$a
            r4.<init>(r11)
            d0.e r7 = r7.f4333a
            d0.c r11 = new d0.c
            r11.<init>(r4, r12)
            if (r3 == 0) goto L_0x00c7
            m.f<java.lang.String, android.graphics.Typeface> r3 = d0.j.f2858a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = r7.f2847e
            r3.append(r5)
            java.lang.String r5 = "-"
            r3.append(r5)
            r3.append(r10)
            java.lang.String r3 = r3.toString()
            m.f<java.lang.String, android.graphics.Typeface> r5 = d0.j.f2858a
            java.lang.Object r5 = r5.a(r3)
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5
            if (r5 == 0) goto L_0x0080
            d0.a r6 = new d0.a
            r6.<init>(r11, r4, r5)
            r12.post(r6)
            r2 = r5
            goto L_0x0158
        L_0x0080:
            if (r13 != r0) goto L_0x008d
            d0.j$a r6 = d0.j.a(r3, r6, r7, r10)
            r11.a(r6)
            android.graphics.Typeface r2 = r6.f2862a
            goto L_0x0158
        L_0x008d:
            d0.f r12 = new d0.f
            r12.<init>(r3, r6, r7, r10)
            java.util.concurrent.ExecutorService r6 = d0.j.f2859b     // Catch:{ InterruptedException -> 0x00b9 }
            java.util.concurrent.Future r6 = r6.submit(r12)     // Catch:{ InterruptedException -> 0x00b9 }
            long r12 = (long) r13
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00b2, InterruptedException -> 0x00b0, TimeoutException -> 0x00a8 }
            java.lang.Object r6 = r6.get(r12, r7)     // Catch:{ ExecutionException -> 0x00b2, InterruptedException -> 0x00b0, TimeoutException -> 0x00a8 }
            d0.j$a r6 = (d0.j.a) r6     // Catch:{ InterruptedException -> 0x00b9 }
            r11.a(r6)     // Catch:{ InterruptedException -> 0x00b9 }
            android.graphics.Typeface r2 = r6.f2862a     // Catch:{ InterruptedException -> 0x00b9 }
            goto L_0x0158
        L_0x00a8:
            java.lang.InterruptedException r6 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00b9 }
            java.lang.String r7 = "timeout"
            r6.<init>(r7)     // Catch:{ InterruptedException -> 0x00b9 }
            throw r6     // Catch:{ InterruptedException -> 0x00b9 }
        L_0x00b0:
            r6 = move-exception
            throw r6     // Catch:{ InterruptedException -> 0x00b9 }
        L_0x00b2:
            r6 = move-exception
            java.lang.RuntimeException r7 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00b9 }
            r7.<init>(r6)     // Catch:{ InterruptedException -> 0x00b9 }
            throw r7     // Catch:{ InterruptedException -> 0x00b9 }
        L_0x00b9:
            d0.m r6 = r11.f2840a
            android.os.Handler r7 = r11.f2841b
            d0.b r12 = new d0.b
            r12.<init>(r11, r6, r1)
            r7.post(r12)
            goto L_0x0158
        L_0x00c7:
            m.f<java.lang.String, android.graphics.Typeface> r13 = d0.j.f2858a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = r7.f2847e
            r13.append(r0)
            java.lang.String r0 = "-"
            r13.append(r0)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            m.f<java.lang.String, android.graphics.Typeface> r0 = d0.j.f2858a
            java.lang.Object r0 = r0.a(r13)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00f3
            d0.a r6 = new d0.a
            r6.<init>(r11, r4, r0)
            r12.post(r6)
            r2 = r0
            goto L_0x0158
        L_0x00f3:
            d0.g r12 = new d0.g
            r12.<init>(r11)
            java.lang.Object r0 = d0.j.f2860c
            monitor-enter(r0)
            m.h<java.lang.String, java.util.ArrayList<f0.a<d0.j$a>>> r11 = d0.j.f2861d     // Catch:{ all -> 0x0142 }
            java.lang.Object r1 = r11.getOrDefault(r13, r2)     // Catch:{ all -> 0x0142 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0142 }
            if (r1 == 0) goto L_0x010a
            r1.add(r12)     // Catch:{ all -> 0x0142 }
            monitor-exit(r0)     // Catch:{ all -> 0x0142 }
            goto L_0x0158
        L_0x010a:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0142 }
            r1.<init>()     // Catch:{ all -> 0x0142 }
            r1.add(r12)     // Catch:{ all -> 0x0142 }
            r11.put(r13, r1)     // Catch:{ all -> 0x0142 }
            monitor-exit(r0)     // Catch:{ all -> 0x0142 }
            d0.h r11 = new d0.h
            r11.<init>(r13, r6, r7, r10)
            java.util.concurrent.ExecutorService r6 = d0.j.f2859b
            d0.i r7 = new d0.i
            r7.<init>(r13)
            android.os.Looper r12 = android.os.Looper.myLooper()
            if (r12 != 0) goto L_0x0132
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r12.<init>(r13)
            goto L_0x0137
        L_0x0132:
            android.os.Handler r12 = new android.os.Handler
            r12.<init>()
        L_0x0137:
            d0.o r13 = new d0.o
            r13.<init>(r12, r11, r7)
            java.util.concurrent.ThreadPoolExecutor r6 = (java.util.concurrent.ThreadPoolExecutor) r6
            r6.execute(r13)
            goto L_0x0158
        L_0x0142:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0142 }
            throw r6
        L_0x0145:
            z.l r13 = f4399a
            y.e$b r7 = (y.e.b) r7
            android.graphics.Typeface r2 = r13.a(r6, r7, r8, r10)
            if (r11 == 0) goto L_0x0158
            if (r2 == 0) goto L_0x0155
            r11.b(r2, r12)
            goto L_0x0158
        L_0x0155:
            r11.a(r1, r12)
        L_0x0158:
            if (r2 == 0) goto L_0x0163
            m.f<java.lang.String, android.graphics.Typeface> r6 = f4400b
            java.lang.String r7 = c(r8, r9, r10)
            r6.b(r7, r2)
        L_0x0163:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z.f.a(android.content.Context, y.e$a, android.content.res.Resources, int, int, y.g$c, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static Typeface b(Context context, Resources resources, int i2, String str, int i3) {
        Typeface d2 = f4399a.d(context, resources, i2, str, i3);
        if (d2 != null) {
            f4400b.b(c(resources, i2, i3), d2);
        }
        return d2;
    }

    public static String c(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }
}
