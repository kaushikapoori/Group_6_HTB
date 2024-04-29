package r1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import y.g;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f3820a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3821b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3822c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3823d;

    /* renamed from: e  reason: collision with root package name */
    public final float f3824e;

    /* renamed from: f  reason: collision with root package name */
    public final float f3825f;

    /* renamed from: g  reason: collision with root package name */
    public final float f3826g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3827h;

    /* renamed from: i  reason: collision with root package name */
    public final float f3828i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f3829j;

    /* renamed from: k  reason: collision with root package name */
    public float f3830k;

    /* renamed from: l  reason: collision with root package name */
    public final int f3831l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3832m = false;

    /* renamed from: n  reason: collision with root package name */
    public Typeface f3833n;

    public class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ androidx.activity.result.d f3834a;

        public a(androidx.activity.result.d dVar) {
            this.f3834a = dVar;
        }

        public void d(int i2) {
            d.this.f3832m = true;
            this.f3834a.c(i2);
        }

        public void e(Typeface typeface) {
            d dVar = d.this;
            dVar.f3833n = Typeface.create(typeface, dVar.f3822c);
            d dVar2 = d.this;
            dVar2.f3832m = true;
            this.f3834a.d(dVar2.f3833n, false);
        }
    }

    public d(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, y0.a.f4389z);
        this.f3830k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f3829j = c.a(context, obtainStyledAttributes, 3);
        c.a(context, obtainStyledAttributes, 4);
        c.a(context, obtainStyledAttributes, 5);
        this.f3822c = obtainStyledAttributes.getInt(2, 0);
        this.f3823d = obtainStyledAttributes.getInt(1, 1);
        int i3 = !obtainStyledAttributes.hasValue(12) ? 10 : 12;
        this.f3831l = obtainStyledAttributes.getResourceId(i3, 0);
        this.f3821b = obtainStyledAttributes.getString(i3);
        obtainStyledAttributes.getBoolean(14, false);
        this.f3820a = c.a(context, obtainStyledAttributes, 6);
        this.f3824e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f3825f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f3826g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i2, y0.a.f4382s);
        this.f3827h = obtainStyledAttributes2.hasValue(0);
        this.f3828i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        if (this.f3833n == null && (str = this.f3821b) != null) {
            this.f3833n = Typeface.create(str, this.f3822c);
        }
        if (this.f3833n == null) {
            int i2 = this.f3823d;
            this.f3833n = i2 != 1 ? i2 != 2 ? i2 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f3833n = Typeface.create(this.f3833n, this.f3822c);
        }
    }

    public Typeface b(Context context) {
        if (this.f3832m) {
            return this.f3833n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = g.a(context, this.f3831l);
                this.f3833n = a2;
                if (a2 != null) {
                    this.f3833n = Typeface.create(a2, this.f3822c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                StringBuilder a3 = androidx.activity.result.a.a("Error loading font ");
                a3.append(this.f3821b);
                Log.d("TextAppearance", a3.toString(), e2);
            }
        }
        a();
        this.f3832m = true;
        return this.f3833n;
    }

    public void c(Context context, androidx.activity.result.d dVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i2 = this.f3831l;
        if (i2 == 0) {
            this.f3832m = true;
        }
        if (this.f3832m) {
            dVar.d(this.f3833n, true);
            return;
        }
        try {
            a aVar = new a(dVar);
            ThreadLocal<TypedValue> threadLocal = g.f4339a;
            if (context.isRestricted()) {
                aVar.a(-4, (Handler) null);
                return;
            }
            g.b(context, i2, new TypedValue(), 0, aVar, (Handler) null, false, false);
        } catch (Resources.NotFoundException unused) {
            this.f3832m = true;
            dVar.c(1);
        } catch (Exception e2) {
            StringBuilder a2 = androidx.activity.result.a.a("Error loading font ");
            a2.append(this.f3821b);
            Log.d("TextAppearance", a2.toString(), e2);
            this.f3832m = true;
            dVar.c(-3);
        }
    }

    public final boolean d(Context context) {
        int i2 = this.f3831l;
        Typeface typeface = null;
        if (i2 != 0) {
            ThreadLocal<TypedValue> threadLocal = g.f4339a;
            if (!context.isRestricted()) {
                typeface = g.b(context, i2, new TypedValue(), 0, (g.c) null, (Handler) null, false, true);
            }
        }
        return typeface != null;
    }

    public void e(Context context, TextPaint textPaint, androidx.activity.result.d dVar) {
        f(context, textPaint, dVar);
        ColorStateList colorStateList = this.f3829j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.f3826g;
        float f3 = this.f3824e;
        float f4 = this.f3825f;
        ColorStateList colorStateList2 = this.f3820a;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void f(Context context, TextPaint textPaint, androidx.activity.result.d dVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f3833n);
        c(context, new e(this, context, textPaint, dVar));
    }

    public void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a2 = f.a(context.getResources().getConfiguration(), typeface);
        if (a2 != null) {
            typeface = a2;
        }
        textPaint.setTypeface(typeface);
        int i2 = this.f3822c & (~typeface.getStyle());
        textPaint.setFakeBoldText((i2 & 1) != 0);
        textPaint.setTextSkewX((i2 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f3830k);
        if (this.f3827h) {
            textPaint.setLetterSpacing(this.f3828i);
        }
    }
}
