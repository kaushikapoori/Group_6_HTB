package r1;

import android.content.Context;

public class c {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = e.a.a(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = e.a.a(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.c.a(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = e.a.a(r2, (r0 = r3.f527b.getResourceId(r4, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.Context r2, androidx.appcompat.widget.b1 r3, int r4) {
        /*
            android.content.res.TypedArray r0 = r3.f527b
            boolean r0 = r0.hasValue(r4)
            if (r0 == 0) goto L_0x0018
            r0 = 0
            android.content.res.TypedArray r1 = r3.f527b
            int r0 = r1.getResourceId(r4, r0)
            if (r0 == 0) goto L_0x0018
            android.content.res.ColorStateList r2 = e.a.a(r2, r0)
            if (r2 == 0) goto L_0x0018
            return r2
        L_0x0018:
            android.content.res.ColorStateList r2 = r3.c(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.c.b(android.content.Context, androidx.appcompat.widget.b1, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = e.a.b(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable c(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = e.a.b(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.c.c(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    public static boolean d(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean e(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
