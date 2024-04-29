package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f1083k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a  reason: collision with root package name */
    public int f1084a = -1;

    /* renamed from: b  reason: collision with root package name */
    public Object f1085b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f1086c = null;

    /* renamed from: d  reason: collision with root package name */
    public Parcelable f1087d = null;

    /* renamed from: e  reason: collision with root package name */
    public int f1088e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1089f = 0;

    /* renamed from: g  reason: collision with root package name */
    public ColorStateList f1090g = null;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f1091h = f1083k;

    /* renamed from: i  reason: collision with root package name */
    public String f1092i = null;

    /* renamed from: j  reason: collision with root package name */
    public String f1093j;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r7 = this;
            int r0 = r7.f1084a
            r1 = -1
            if (r0 != r1) goto L_0x000c
            java.lang.Object r0 = r7.f1085b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Icon(typ="
            r0.<init>(r2)
            int r2 = r7.f1084a
            switch(r2) {
                case 1: goto L_0x002a;
                case 2: goto L_0x0027;
                case 3: goto L_0x0024;
                case 4: goto L_0x0021;
                case 5: goto L_0x001e;
                case 6: goto L_0x001b;
                default: goto L_0x0018;
            }
        L_0x0018:
            java.lang.String r2 = "UNKNOWN"
            goto L_0x002c
        L_0x001b:
            java.lang.String r2 = "URI_MASKABLE"
            goto L_0x002c
        L_0x001e:
            java.lang.String r2 = "BITMAP_MASKABLE"
            goto L_0x002c
        L_0x0021:
            java.lang.String r2 = "URI"
            goto L_0x002c
        L_0x0024:
            java.lang.String r2 = "DATA"
            goto L_0x002c
        L_0x0027:
            java.lang.String r2 = "RESOURCE"
            goto L_0x002c
        L_0x002a:
            java.lang.String r2 = "BITMAP"
        L_0x002c:
            r0.append(r2)
            int r2 = r7.f1084a
            switch(r2) {
                case 1: goto L_0x00d6;
                case 2: goto L_0x0059;
                case 3: goto L_0x0042;
                case 4: goto L_0x0036;
                case 5: goto L_0x00d6;
                case 6: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x00f6
        L_0x0036:
            java.lang.String r1 = " uri="
            r0.append(r1)
            java.lang.Object r1 = r7.f1085b
            r0.append(r1)
            goto L_0x00f6
        L_0x0042:
            java.lang.String r1 = " len="
            r0.append(r1)
            int r1 = r7.f1088e
            r0.append(r1)
            int r1 = r7.f1089f
            if (r1 == 0) goto L_0x00f6
            java.lang.String r1 = " off="
            r0.append(r1)
            int r1 = r7.f1089f
            goto L_0x00f3
        L_0x0059:
            java.lang.String r2 = " pkg="
            r0.append(r2)
            java.lang.String r2 = r7.f1093j
            r0.append(r2)
            java.lang.String r2 = " id="
            r0.append(r2)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r7.f1084a
            r4 = 0
            if (r3 != r1) goto L_0x00aa
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 23
            if (r1 < r5) goto L_0x00aa
            java.lang.Object r3 = r7.f1085b
            android.graphics.drawable.Icon r3 = (android.graphics.drawable.Icon) r3
            r5 = 28
            if (r1 < r5) goto L_0x0083
            int r1 = r3.getResId()
            goto L_0x00af
        L_0x0083:
            java.lang.Class r1 = r3.getClass()     // Catch:{ IllegalAccessException -> 0x00a0, InvocationTargetException -> 0x009e, NoSuchMethodException -> 0x009c }
            java.lang.String r5 = "getResId"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ IllegalAccessException -> 0x00a0, InvocationTargetException -> 0x009e, NoSuchMethodException -> 0x009c }
            java.lang.reflect.Method r1 = r1.getMethod(r5, r6)     // Catch:{ IllegalAccessException -> 0x00a0, InvocationTargetException -> 0x009e, NoSuchMethodException -> 0x009c }
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x00a0, InvocationTargetException -> 0x009e, NoSuchMethodException -> 0x009c }
            java.lang.Object r1 = r1.invoke(r3, r5)     // Catch:{ IllegalAccessException -> 0x00a0, InvocationTargetException -> 0x009e, NoSuchMethodException -> 0x009c }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException -> 0x00a0, InvocationTargetException -> 0x009e, NoSuchMethodException -> 0x009c }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException -> 0x00a0, InvocationTargetException -> 0x009e, NoSuchMethodException -> 0x009c }
            goto L_0x00af
        L_0x009c:
            r1 = move-exception
            goto L_0x00a1
        L_0x009e:
            r1 = move-exception
            goto L_0x00a1
        L_0x00a0:
            r1 = move-exception
        L_0x00a1:
            java.lang.String r3 = "IconCompat"
            java.lang.String r5 = "Unable to get icon resource"
            android.util.Log.e(r3, r5, r1)
            r1 = 0
            goto L_0x00af
        L_0x00aa:
            r1 = 2
            if (r3 != r1) goto L_0x00bf
            int r1 = r7.f1088e
        L_0x00af:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2[r4] = r1
            java.lang.String r1 = "0x%08x"
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.append(r1)
            goto L_0x00f6
        L_0x00bf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "called getResId() on "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00d6:
            java.lang.String r1 = " size="
            r0.append(r1)
            java.lang.Object r1 = r7.f1085b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getWidth()
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            java.lang.Object r1 = r7.f1085b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            int r1 = r1.getHeight()
        L_0x00f3:
            r0.append(r1)
        L_0x00f6:
            android.content.res.ColorStateList r1 = r7.f1090g
            if (r1 == 0) goto L_0x0104
            java.lang.String r1 = " tint="
            r0.append(r1)
            android.content.res.ColorStateList r1 = r7.f1090g
            r0.append(r1)
        L_0x0104:
            android.graphics.PorterDuff$Mode r1 = r7.f1091h
            android.graphics.PorterDuff$Mode r2 = f1083k
            if (r1 == r2) goto L_0x0114
            java.lang.String r1 = " mode="
            r0.append(r1)
            android.graphics.PorterDuff$Mode r1 = r7.f1091h
            r0.append(r1)
        L_0x0114:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.toString():java.lang.String");
    }
}
