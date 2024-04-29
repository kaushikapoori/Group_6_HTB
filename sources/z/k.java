package z;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import d0.l;
import java.io.IOException;
import java.io.InputStream;
import y.e;

public class k extends l {
    public Typeface a(Context context, e.b bVar, Resources resources, int i2) {
        try {
            e.c[] cVarArr = bVar.f4326a;
            int length = cVarArr.length;
            int i3 = 0;
            FontFamily.Builder builder = null;
            int i4 = 0;
            while (true) {
                int i5 = 1;
                if (i4 >= length) {
                    break;
                }
                e.c cVar = cVarArr[i4];
                try {
                    Font.Builder weight = new Font.Builder(resources, cVar.f4332f).setWeight(cVar.f4328b);
                    if (!cVar.f4329c) {
                        i5 = 0;
                    }
                    Font build = weight.setSlant(i5).setTtcIndex(cVar.f4331e).setFontVariationSettings(cVar.f4330d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
                i4++;
            }
            if (builder == null) {
                return null;
            }
            int i6 = (i2 & 1) != 0 ? 700 : 400;
            if ((i2 & 2) != 0) {
                i3 = 1;
            }
            return new Typeface.CustomFallbackBuilder(builder.build()).setStyle(new FontStyle(i6, i3)).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (r4 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        if ((r14 & 1) == 0) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        r12 = 700;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0063, code lost:
        r12 = 400;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0067, code lost:
        if ((r14 & 2) == 0) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0069, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007e, code lost:
        return new android.graphics.Typeface.CustomFallbackBuilder(r4.build()).setStyle(new android.graphics.fonts.FontStyle(r12, r2)).build();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface b(android.content.Context r11, android.os.CancellationSignal r12, d0.l[] r13, int r14) {
        /*
            r10 = this;
            android.content.ContentResolver r11 = r11.getContentResolver()
            r0 = 0
            int r1 = r13.length     // Catch:{ Exception -> 0x007f }
            r2 = 0
            r4 = r0
            r3 = 0
        L_0x0009:
            r5 = 1
            if (r3 >= r1) goto L_0x0057
            r6 = r13[r3]     // Catch:{ Exception -> 0x007f }
            android.net.Uri r7 = r6.f2866a     // Catch:{ IOException -> 0x0054 }
            java.lang.String r8 = "r"
            android.os.ParcelFileDescriptor r7 = r11.openFileDescriptor(r7, r8, r12)     // Catch:{ IOException -> 0x0054 }
            if (r7 != 0) goto L_0x001e
            if (r7 == 0) goto L_0x0054
        L_0x001a:
            r7.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0054
        L_0x001e:
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch:{ all -> 0x004a }
            r8.<init>(r7)     // Catch:{ all -> 0x004a }
            int r9 = r6.f2868c     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r9)     // Catch:{ all -> 0x004a }
            boolean r9 = r6.f2869d     // Catch:{ all -> 0x004a }
            if (r9 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            android.graphics.fonts.Font$Builder r5 = r8.setSlant(r5)     // Catch:{ all -> 0x004a }
            int r6 = r6.f2867b     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font$Builder r5 = r5.setTtcIndex(r6)     // Catch:{ all -> 0x004a }
            android.graphics.fonts.Font r5 = r5.build()     // Catch:{ all -> 0x004a }
            if (r4 != 0) goto L_0x0046
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ all -> 0x004a }
            r6.<init>(r5)     // Catch:{ all -> 0x004a }
            r4 = r6
            goto L_0x001a
        L_0x0046:
            r4.addFont(r5)     // Catch:{ all -> 0x004a }
            goto L_0x001a
        L_0x004a:
            r5 = move-exception
            r7.close()     // Catch:{ all -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch:{ IOException -> 0x0054 }
        L_0x0053:
            throw r5     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0057:
            if (r4 != 0) goto L_0x005a
            return r0
        L_0x005a:
            android.graphics.fonts.FontStyle r11 = new android.graphics.fonts.FontStyle     // Catch:{ Exception -> 0x007f }
            r12 = r14 & 1
            if (r12 == 0) goto L_0x0063
            r12 = 700(0x2bc, float:9.81E-43)
            goto L_0x0065
        L_0x0063:
            r12 = 400(0x190, float:5.6E-43)
        L_0x0065:
            r13 = r14 & 2
            if (r13 == 0) goto L_0x006a
            r2 = 1
        L_0x006a:
            r11.<init>(r12, r2)     // Catch:{ Exception -> 0x007f }
            android.graphics.Typeface$CustomFallbackBuilder r12 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x007f }
            android.graphics.fonts.FontFamily r13 = r4.build()     // Catch:{ Exception -> 0x007f }
            r12.<init>(r13)     // Catch:{ Exception -> 0x007f }
            android.graphics.Typeface$CustomFallbackBuilder r11 = r12.setStyle(r11)     // Catch:{ Exception -> 0x007f }
            android.graphics.Typeface r11 = r11.build()     // Catch:{ Exception -> 0x007f }
            return r11
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.k.b(android.content.Context, android.os.CancellationSignal, d0.l[], int):android.graphics.Typeface");
    }

    public Typeface c(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font build = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    public l e(l[] lVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
