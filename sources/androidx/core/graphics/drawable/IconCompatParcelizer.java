package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import java.nio.charset.Charset;
import java.util.Objects;
import x0.a;

public class IconCompatParcelizer {
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.core.graphics.drawable.IconCompat read(x0.a r5) {
        /*
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>()
            int r1 = r0.f1084a
            r2 = 1
            int r1 = r5.k(r1, r2)
            r0.f1084a = r1
            byte[] r1 = r0.f1086c
            r2 = 2
            boolean r3 = r5.i(r2)
            if (r3 != 0) goto L_0x0018
            goto L_0x001c
        L_0x0018:
            byte[] r1 = r5.g()
        L_0x001c:
            r0.f1086c = r1
            android.os.Parcelable r1 = r0.f1087d
            r3 = 3
            android.os.Parcelable r1 = r5.m(r1, r3)
            r0.f1087d = r1
            int r1 = r0.f1088e
            r4 = 4
            int r1 = r5.k(r1, r4)
            r0.f1088e = r1
            int r1 = r0.f1089f
            r4 = 5
            int r1 = r5.k(r1, r4)
            r0.f1089f = r1
            android.content.res.ColorStateList r1 = r0.f1090g
            r4 = 6
            android.os.Parcelable r1 = r5.m(r1, r4)
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1
            r0.f1090g = r1
            java.lang.String r1 = r0.f1092i
            r4 = 7
            boolean r4 = r5.i(r4)
            if (r4 != 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            java.lang.String r1 = r5.n()
        L_0x0052:
            r0.f1092i = r1
            java.lang.String r1 = r0.f1093j
            r4 = 8
            boolean r4 = r5.i(r4)
            if (r4 != 0) goto L_0x005f
            goto L_0x0063
        L_0x005f:
            java.lang.String r1 = r5.n()
        L_0x0063:
            r0.f1093j = r1
            java.lang.String r5 = r0.f1092i
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.valueOf(r5)
            r0.f1091h = r5
            int r5 = r0.f1084a
            r1 = 0
            switch(r5) {
                case -1: goto L_0x00ad;
                case 0: goto L_0x0073;
                case 1: goto L_0x009c;
                case 2: goto L_0x0079;
                case 3: goto L_0x0074;
                case 4: goto L_0x0079;
                case 5: goto L_0x009c;
                case 6: goto L_0x0079;
                default: goto L_0x0073;
            }
        L_0x0073:
            goto L_0x00bc
        L_0x0074:
            byte[] r5 = r0.f1086c
            r0.f1085b = r5
            goto L_0x00bc
        L_0x0079:
            java.lang.String r5 = new java.lang.String
            byte[] r3 = r0.f1086c
            java.lang.String r4 = "UTF-16"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r5.<init>(r3, r4)
            r0.f1085b = r5
            int r3 = r0.f1084a
            if (r3 != r2) goto L_0x00bc
            java.lang.String r2 = r0.f1093j
            if (r2 != 0) goto L_0x00bc
            r2 = -1
            java.lang.String r3 = ":"
            java.lang.String[] r5 = r5.split(r3, r2)
            r5 = r5[r1]
            r0.f1093j = r5
            goto L_0x00bc
        L_0x009c:
            android.os.Parcelable r5 = r0.f1087d
            if (r5 == 0) goto L_0x00a1
            goto L_0x00b1
        L_0x00a1:
            byte[] r5 = r0.f1086c
            r0.f1085b = r5
            r0.f1084a = r3
            r0.f1088e = r1
            int r5 = r5.length
            r0.f1089f = r5
            goto L_0x00bc
        L_0x00ad:
            android.os.Parcelable r5 = r0.f1087d
            if (r5 == 0) goto L_0x00b4
        L_0x00b1:
            r0.f1085b = r5
            goto L_0x00bc
        L_0x00b4:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid icon"
            r5.<init>(r0)
            throw r5
        L_0x00bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.read(x0.a):androidx.core.graphics.drawable.IconCompat");
    }

    public static void write(IconCompat iconCompat, a aVar) {
        Objects.requireNonNull(aVar);
        iconCompat.f1092i = iconCompat.f1091h.name();
        switch (iconCompat.f1084a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f1087d = (Parcelable) iconCompat.f1085b;
                break;
            case 2:
                iconCompat.f1086c = ((String) iconCompat.f1085b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1086c = (byte[]) iconCompat.f1085b;
                break;
            case 4:
            case 6:
                iconCompat.f1086c = iconCompat.f1085b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1084a;
        if (-1 != i2) {
            aVar.p(1);
            aVar.t(i2);
        }
        byte[] bArr = iconCompat.f1086c;
        if (bArr != null) {
            aVar.p(2);
            aVar.r(bArr);
        }
        Parcelable parcelable = iconCompat.f1087d;
        if (parcelable != null) {
            aVar.p(3);
            aVar.u(parcelable);
        }
        int i3 = iconCompat.f1088e;
        if (i3 != 0) {
            aVar.p(4);
            aVar.t(i3);
        }
        int i4 = iconCompat.f1089f;
        if (i4 != 0) {
            aVar.p(5);
            aVar.t(i4);
        }
        ColorStateList colorStateList = iconCompat.f1090g;
        if (colorStateList != null) {
            aVar.p(6);
            aVar.u(colorStateList);
        }
        String str = iconCompat.f1092i;
        if (str != null) {
            aVar.p(7);
            aVar.v(str);
        }
        String str2 = iconCompat.f1093j;
        if (str2 != null) {
            aVar.p(8);
            aVar.v(str2);
        }
    }
}
