package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import c.c;
import z.a;

public class w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f813a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f814b = {-16842910};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f815c = {16842908};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f816d = {16842919};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f817e = {16842912};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f818f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f819g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c.f2047j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i2) {
        ColorStateList d2 = d(context, i2);
        if (d2 != null && d2.isStateful()) {
            return d2.getColorForState(f814b, d2.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f813a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f2 = typedValue.getFloat();
        int c2 = c(context, i2);
        return a.e(c2, Math.round(((float) Color.alpha(c2)) * f2));
    }

    public static int c(Context context, int i2) {
        int[] iArr = f819g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i2) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f819g;
        iArr[0] = i2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = e.a.a(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
