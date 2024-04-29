package o1;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
import java.util.Objects;

public final class k {

    /* renamed from: m  reason: collision with root package name */
    public static final int f3574m = (Build.VERSION.SDK_INT >= 23 ? 1 : 0);

    /* renamed from: n  reason: collision with root package name */
    public static boolean f3575n;

    /* renamed from: o  reason: collision with root package name */
    public static Constructor<StaticLayout> f3576o;

    /* renamed from: p  reason: collision with root package name */
    public static Object f3577p;

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f3578a;

    /* renamed from: b  reason: collision with root package name */
    public final TextPaint f3579b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3580c;

    /* renamed from: d  reason: collision with root package name */
    public int f3581d;

    /* renamed from: e  reason: collision with root package name */
    public Layout.Alignment f3582e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f  reason: collision with root package name */
    public int f3583f = Integer.MAX_VALUE;

    /* renamed from: g  reason: collision with root package name */
    public float f3584g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f3585h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public int f3586i = f3574m;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3587j = true;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3588k;

    /* renamed from: l  reason: collision with root package name */
    public TextUtils.TruncateAt f3589l = null;

    public static class a extends Exception {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.String r0 = "Error thrown initializing StaticLayout "
                java.lang.StringBuilder r0 = androidx.activity.result.a.a(r0)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o1.k.a.<init>(java.lang.Throwable):void");
        }
    }

    public k(CharSequence charSequence, TextPaint textPaint, int i2) {
        this.f3578a = charSequence;
        this.f3579b = textPaint;
        this.f3580c = i2;
        this.f3581d = charSequence.length();
    }

    public StaticLayout a() {
        if (this.f3578a == null) {
            this.f3578a = "";
        }
        int max = Math.max(0, this.f3580c);
        CharSequence charSequence = this.f3578a;
        if (this.f3583f == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f3579b, (float) max, this.f3589l);
        }
        int min = Math.min(charSequence.length(), this.f3581d);
        this.f3581d = min;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            if (this.f3588k && this.f3583f == 1) {
                this.f3582e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, this.f3579b, max);
            obtain.setAlignment(this.f3582e);
            obtain.setIncludePad(this.f3587j);
            obtain.setTextDirection(this.f3588k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.f3589l;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.f3583f);
            float f2 = this.f3584g;
            if (!(f2 == 0.0f && this.f3585h == 1.0f)) {
                obtain.setLineSpacing(f2, this.f3585h);
            }
            if (this.f3583f > 1) {
                obtain.setHyphenationFrequency(this.f3586i);
            }
            return obtain.build();
        }
        if (!f3575n) {
            try {
                boolean z2 = this.f3588k && i2 >= 23;
                Class<TextDirectionHeuristic> cls = TextDirectionHeuristic.class;
                f3577p = z2 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(new Class[]{CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2});
                f3576o = declaredConstructor;
                declaredConstructor.setAccessible(true);
                f3575n = true;
            } catch (Exception e2) {
                throw new a(e2);
            }
        }
        try {
            Constructor<StaticLayout> constructor = f3576o;
            Objects.requireNonNull(constructor);
            Object obj = f3577p;
            Objects.requireNonNull(obj);
            return constructor.newInstance(new Object[]{charSequence, 0, Integer.valueOf(this.f3581d), this.f3579b, Integer.valueOf(max), this.f3582e, obj, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f3587j), null, Integer.valueOf(max), Integer.valueOf(this.f3583f)});
        } catch (Exception e3) {
            throw new a(e3);
        }
    }
}
