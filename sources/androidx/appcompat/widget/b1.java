package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import y.g;

public class b1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f526a;

    /* renamed from: b  reason: collision with root package name */
    public final TypedArray f527b;

    /* renamed from: c  reason: collision with root package name */
    public TypedValue f528c;

    public b1(Context context, TypedArray typedArray) {
        this.f526a = context;
        this.f527b = typedArray;
    }

    public static b1 p(Context context, AttributeSet attributeSet, int[] iArr) {
        return new b1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static b1 q(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new b1(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z2) {
        return this.f527b.getBoolean(i2, z2);
    }

    public int b(int i2, int i3) {
        return this.f527b.getColor(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = e.a.a(r2.f526a, (r0 = r2.f527b.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList c(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f527b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f527b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f526a
            android.content.res.ColorStateList r0 = e.a.a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f527b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b1.c(int):android.content.res.ColorStateList");
    }

    public float d(int i2, float f2) {
        return this.f527b.getDimension(i2, f2);
    }

    public int e(int i2, int i3) {
        return this.f527b.getDimensionPixelOffset(i2, i3);
    }

    public int f(int i2, int i3) {
        return this.f527b.getDimensionPixelSize(i2, i3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f527b.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable g(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f527b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f527b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f526a
            android.graphics.drawable.Drawable r3 = e.a.b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f527b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b1.g(int):android.graphics.drawable.Drawable");
    }

    public Drawable h(int i2) {
        int resourceId;
        Drawable g2;
        if (!this.f527b.hasValue(i2) || (resourceId = this.f527b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        k a2 = k.a();
        Context context = this.f526a;
        synchronized (a2) {
            g2 = a2.f673a.g(context, resourceId, true);
        }
        return g2;
    }

    public Typeface i(int i2, int i3, g.c cVar) {
        int resourceId = this.f527b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f528c == null) {
            this.f528c = new TypedValue();
        }
        Context context = this.f526a;
        TypedValue typedValue = this.f528c;
        ThreadLocal<TypedValue> threadLocal = g.f4339a;
        if (context.isRestricted()) {
            return null;
        }
        return g.b(context, resourceId, typedValue, i3, cVar, (Handler) null, true, false);
    }

    public int j(int i2, int i3) {
        return this.f527b.getInt(i2, i3);
    }

    public int k(int i2, int i3) {
        return this.f527b.getLayoutDimension(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.f527b.getResourceId(i2, i3);
    }

    public String m(int i2) {
        return this.f527b.getString(i2);
    }

    public CharSequence n(int i2) {
        return this.f527b.getText(i2);
    }

    public boolean o(int i2) {
        return this.f527b.hasValue(i2);
    }
}
