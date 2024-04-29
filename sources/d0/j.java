package d0;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m.f;
import m.h;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public static final f<String, Typeface> f2858a = new f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ExecutorService f2859b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2860c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static final h<String, ArrayList<f0.a<a>>> f2861d = new h<>();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Typeface f2862a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2863b;

        public a(int i2) {
            this.f2862a = null;
            this.f2863b = i2;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f2862a = typeface;
            this.f2863b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f2859b = threadPoolExecutor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static d0.j.a a(java.lang.String r7, android.content.Context r8, d0.e r9, int r10) {
        /*
            m.f<java.lang.String, android.graphics.Typeface> r0 = f2858a
            java.lang.Object r0 = r0.a(r7)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0010
            d0.j$a r7 = new d0.j$a
            r7.<init>((android.graphics.Typeface) r0)
            return r7
        L_0x0010:
            r0 = 0
            d0.k r9 = d0.d.a(r8, r9, r0)     // Catch:{ NameNotFoundException -> 0x0061 }
            int r1 = r9.f2864a
            r2 = -3
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x001e
            goto L_0x0035
        L_0x001e:
            r1 = -2
            goto L_0x003e
        L_0x0020:
            d0.l[] r1 = r9.f2865b
            r4 = 0
            if (r1 == 0) goto L_0x003d
            int r5 = r1.length
            if (r5 != 0) goto L_0x0029
            goto L_0x003d
        L_0x0029:
            int r3 = r1.length
            r5 = 0
        L_0x002b:
            if (r5 >= r3) goto L_0x003c
            r6 = r1[r5]
            int r6 = r6.f2870e
            if (r6 == 0) goto L_0x0039
            if (r6 >= 0) goto L_0x0037
        L_0x0035:
            r1 = -3
            goto L_0x003e
        L_0x0037:
            r1 = r6
            goto L_0x003e
        L_0x0039:
            int r5 = r5 + 1
            goto L_0x002b
        L_0x003c:
            r3 = 0
        L_0x003d:
            r1 = r3
        L_0x003e:
            if (r1 == 0) goto L_0x0046
            d0.j$a r7 = new d0.j$a
            r7.<init>((int) r1)
            return r7
        L_0x0046:
            d0.l[] r9 = r9.f2865b
            z.l r1 = z.f.f4399a
            android.graphics.Typeface r8 = r1.b(r8, r0, r9, r10)
            if (r8 == 0) goto L_0x005b
            m.f<java.lang.String, android.graphics.Typeface> r9 = f2858a
            r9.b(r7, r8)
            d0.j$a r7 = new d0.j$a
            r7.<init>((android.graphics.Typeface) r8)
            return r7
        L_0x005b:
            d0.j$a r7 = new d0.j$a
            r7.<init>((int) r2)
            return r7
        L_0x0061:
            d0.j$a r7 = new d0.j$a
            r8 = -1
            r7.<init>((int) r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.j.a(java.lang.String, android.content.Context, d0.e, int):d0.j$a");
    }
}
