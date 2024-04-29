package y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.Objects;
import java.util.WeakHashMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f4339a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<b, SparseArray<a>> f4340b = new WeakHashMap<>(0);

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4341c = new Object();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final ColorStateList f4342a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f4343b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.f4342a = colorStateList;
            this.f4343b = configuration;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f4344a;

        /* renamed from: b  reason: collision with root package name */
        public final Resources.Theme f4345b;

        public b(Resources resources, Resources.Theme theme) {
            this.f4344a = resources;
            this.f4345b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4344a.equals(bVar.f4344a) && Objects.equals(this.f4345b, bVar.f4345b);
        }

        public int hashCode() {
            return Objects.hash(new Object[]{this.f4344a, this.f4345b});
        }
    }

    public static abstract class c {

        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Typeface f4346b;

            public a(Typeface typeface) {
                this.f4346b = typeface;
            }

            public void run() {
                c.this.e(this.f4346b);
            }
        }

        public class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f4348b;

            public b(int i2) {
                this.f4348b = i2;
            }

            public void run() {
                c.this.d(this.f4348b);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i2, Handler handler) {
            c(handler).post(new b(i2));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i2);

        public abstract void e(Typeface typeface);
    }

    public static Typeface a(Context context, int i2) {
        if (context.isRestricted()) {
            return null;
        }
        return b(context, i2, new TypedValue(), 0, (c) null, (Handler) null, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a6, code lost:
        if (r10 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        if (r10 != null) goto L_0x00a8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ad A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface b(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, y.g.c r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r9 = r17
            r0 = r18
            r5 = r19
            r10 = r20
            r11 = r21
            android.content.res.Resources r3 = r16.getResources()
            r1 = 1
            r3.getValue(r9, r0, r1)
            java.lang.String r12 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto L_0x00cf
            java.lang.String r13 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r13.startsWith(r0)
            r14 = -3
            r15 = 0
            if (r0 != 0) goto L_0x002a
            if (r10 == 0) goto L_0x00ab
            goto L_0x00a8
        L_0x002a:
            m.f<java.lang.String, android.graphics.Typeface> r0 = z.f.f4400b
            java.lang.String r1 = z.f.c(r3, r9, r5)
            java.lang.Object r0 = r0.a(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0040
            if (r10 == 0) goto L_0x003d
            r10.b(r0, r11)
        L_0x003d:
            r15 = r0
            goto L_0x00ab
        L_0x0040:
            if (r23 == 0) goto L_0x0044
            goto L_0x00ab
        L_0x0044:
            java.lang.String r0 = r13.toLowerCase()     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x0088 }
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x0088 }
            if (r0 == 0) goto L_0x0076
            android.content.res.XmlResourceParser r0 = r3.getXml(r9)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x0088 }
            y.e$a r2 = y.e.a(r0, r3)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x0088 }
            if (r2 != 0) goto L_0x0065
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r12, r0)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x0088 }
            if (r10 == 0) goto L_0x00ab
            r10.a(r14, r11)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x0088 }
            goto L_0x00ab
        L_0x0065:
            r1 = r16
            r4 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r15 = z.f.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x0088 }
            goto L_0x00ab
        L_0x0076:
            r0 = r16
            android.graphics.Typeface r0 = z.f.b(r0, r3, r9, r13, r5)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x0088 }
            if (r10 == 0) goto L_0x003d
            if (r0 == 0) goto L_0x0084
            r10.b(r0, r11)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x0088 }
            goto L_0x003d
        L_0x0084:
            r10.a(r14, r11)     // Catch:{ XmlPullParserException -> 0x0091, IOException -> 0x0088 }
            goto L_0x003d
        L_0x0088:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L_0x0099
        L_0x0091:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L_0x0099:
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r12, r1, r0)
            if (r10 == 0) goto L_0x00ab
        L_0x00a8:
            r10.a(r14, r11)
        L_0x00ab:
            if (r15 != 0) goto L_0x00ce
            if (r10 != 0) goto L_0x00ce
            if (r23 == 0) goto L_0x00b2
            goto L_0x00ce
        L_0x00b2:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = androidx.activity.result.a.a(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r17)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00ce:
            return r15
        L_0x00cf:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.String r2 = "Resource \""
            java.lang.StringBuilder r2 = androidx.activity.result.a.a(r2)
            java.lang.String r3 = r3.getResourceName(r9)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r17)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y.g.b(android.content.Context, int, android.util.TypedValue, int, y.g$c, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}
