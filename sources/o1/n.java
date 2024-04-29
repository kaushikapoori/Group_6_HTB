package o1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.example.supermarket.R;
import y0.a;
import z.d;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f3597a = {R.attr.colorPrimary};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f3598b = {R.attr.colorPrimaryVariant};

    public static void a(Context context, AttributeSet attributeSet, int i2, int i3) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.C, i2, i3);
        boolean z2 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f3598b, "Theme.MaterialComponents");
            }
        }
        c(context, f3597a, "Theme.AppCompat");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r0.getResourceId(0, -1) != -1) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = y0.a.C
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L_0x0012
            r0.recycle()
            return
        L_0x0012:
            r1 = -1
            if (r9 == 0) goto L_0x0034
            int r3 = r9.length
            if (r3 != 0) goto L_0x0019
            goto L_0x0034
        L_0x0019:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = 0
        L_0x001f:
            if (r6 >= r5) goto L_0x0030
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r1)
            if (r7 != r1) goto L_0x002d
            r4.recycle()
            goto L_0x003b
        L_0x002d:
            int r6 = r6 + 1
            goto L_0x001f
        L_0x0030:
            r4.recycle()
            goto L_0x003a
        L_0x0034:
            int r4 = r0.getResourceId(r2, r1)
            if (r4 == r1) goto L_0x003b
        L_0x003a:
            r2 = 1
        L_0x003b:
            r0.recycle()
            if (r2 == 0) goto L_0x0041
            return
        L_0x0041:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.n.b(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= iArr.length) {
                obtainStyledAttributes.recycle();
                z2 = true;
                break;
            } else if (!obtainStyledAttributes.hasValue(i2)) {
                obtainStyledAttributes.recycle();
                break;
            } else {
                i2++;
            }
        }
        if (!z2) {
            throw new IllegalArgumentException(d.a("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    public static TypedArray d(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3, int... iArr2) {
        a(context, attributeSet, i2, i3);
        b(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }
}
