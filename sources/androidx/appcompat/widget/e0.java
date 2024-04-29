package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class e0 {

    /* renamed from: l  reason: collision with root package name */
    public static final RectF f592l = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: m  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f593m = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: n  reason: collision with root package name */
    public static ConcurrentHashMap<String, Field> f594n = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public int f595a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f596b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f597c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f598d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f599e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f600f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f601g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f602h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f603i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f604j;

    /* renamed from: k  reason: collision with root package name */
    public final c f605k;

    public static class a extends c {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) e0.e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class b extends a {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) e0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public e0(TextView textView) {
        this.f603i = textView;
        this.f604j = textView.getContext();
        int i2 = Build.VERSION.SDK_INT;
        this.f605k = i2 >= 29 ? new b() : i2 >= 23 ? new a() : new c();
    }

    public static Method d(String str) {
        try {
            Method method = f593m.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f593m.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static <T> T e(Object obj, String str, T t2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return t2;
        }
    }

    public void a() {
        if (i() && this.f595a != 0) {
            if (this.f596b) {
                if (this.f603i.getMeasuredHeight() > 0 && this.f603i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f605k.b(this.f603i) ? 1048576 : (this.f603i.getMeasuredWidth() - this.f603i.getTotalPaddingLeft()) - this.f603i.getTotalPaddingRight();
                    int height = (this.f603i.getHeight() - this.f603i.getCompoundPaddingBottom()) - this.f603i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f592l;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float c2 = (float) c(rectF);
                            if (c2 != this.f603i.getTextSize()) {
                                f(0, c2);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f596b = true;
        }
    }

    public final int[] b(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0104, code lost:
        if (r7.getLineEnd(r7.getLineCount() - 1) != r8.length()) goto L_0x0115;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c(android.graphics.RectF r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            int[] r2 = r0.f600f
            int r2 = r2.length
            if (r2 == 0) goto L_0x0131
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = 1
            r6 = 0
        L_0x000e:
            if (r5 > r2) goto L_0x012c
            int r6 = r5 + r2
            int r6 = r6 / 2
            int[] r7 = r0.f600f
            r7 = r7[r6]
            android.widget.TextView r8 = r0.f603i
            java.lang.CharSequence r8 = r8.getText()
            android.widget.TextView r9 = r0.f603i
            android.text.method.TransformationMethod r9 = r9.getTransformationMethod()
            if (r9 == 0) goto L_0x002f
            android.widget.TextView r10 = r0.f603i
            java.lang.CharSequence r9 = r9.getTransformation(r8, r10)
            if (r9 == 0) goto L_0x002f
            r8 = r9
        L_0x002f:
            int r9 = android.os.Build.VERSION.SDK_INT
            android.widget.TextView r10 = r0.f603i
            int r15 = r10.getMaxLines()
            android.text.TextPaint r10 = r0.f602h
            if (r10 != 0) goto L_0x0043
            android.text.TextPaint r10 = new android.text.TextPaint
            r10.<init>()
            r0.f602h = r10
            goto L_0x0046
        L_0x0043:
            r10.reset()
        L_0x0046:
            android.text.TextPaint r10 = r0.f602h
            android.widget.TextView r11 = r0.f603i
            android.text.TextPaint r11 = r11.getPaint()
            r10.set(r11)
            android.text.TextPaint r10 = r0.f602h
            float r7 = (float) r7
            r10.setTextSize(r7)
            android.widget.TextView r7 = r0.f603i
            android.text.Layout$Alignment r10 = android.text.Layout.Alignment.ALIGN_NORMAL
            java.lang.String r11 = "getLayoutAlignment"
            java.lang.Object r7 = e(r7, r11, r10)
            r14 = r7
            android.text.Layout$Alignment r14 = (android.text.Layout.Alignment) r14
            float r7 = r1.right
            int r13 = java.lang.Math.round(r7)
            r7 = 23
            r12 = -1
            if (r9 < r7) goto L_0x00cb
            int r7 = r8.length()
            android.text.TextPaint r9 = r0.f602h
            android.text.StaticLayout$Builder r7 = android.text.StaticLayout.Builder.obtain(r8, r4, r7, r9, r13)
            android.text.StaticLayout$Builder r9 = r7.setAlignment(r14)
            android.widget.TextView r10 = r0.f603i
            float r10 = r10.getLineSpacingExtra()
            android.widget.TextView r11 = r0.f603i
            float r11 = r11.getLineSpacingMultiplier()
            android.text.StaticLayout$Builder r9 = r9.setLineSpacing(r10, r11)
            android.widget.TextView r10 = r0.f603i
            boolean r10 = r10.getIncludeFontPadding()
            android.text.StaticLayout$Builder r9 = r9.setIncludePad(r10)
            android.widget.TextView r10 = r0.f603i
            int r10 = r10.getBreakStrategy()
            android.text.StaticLayout$Builder r9 = r9.setBreakStrategy(r10)
            android.widget.TextView r10 = r0.f603i
            int r10 = r10.getHyphenationFrequency()
            android.text.StaticLayout$Builder r9 = r9.setHyphenationFrequency(r10)
            if (r15 != r12) goto L_0x00b1
            r10 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00b2
        L_0x00b1:
            r10 = r15
        L_0x00b2:
            r9.setMaxLines(r10)
            androidx.appcompat.widget.e0$c r9 = r0.f605k     // Catch:{ ClassCastException -> 0x00bd }
            android.widget.TextView r10 = r0.f603i     // Catch:{ ClassCastException -> 0x00bd }
            r9.a(r7, r10)     // Catch:{ ClassCastException -> 0x00bd }
            goto L_0x00c4
        L_0x00bd:
            java.lang.String r9 = "ACTVAutoSizeHelper"
            java.lang.String r10 = "Failed to obtain TextDirectionHeuristic, auto size may be incorrect"
            android.util.Log.w(r9, r10)
        L_0x00c4:
            android.text.StaticLayout r7 = r7.build()
            r3 = r15
            r4 = -1
            goto L_0x00ee
        L_0x00cb:
            android.widget.TextView r7 = r0.f603i
            float r7 = r7.getLineSpacingMultiplier()
            android.widget.TextView r9 = r0.f603i
            float r16 = r9.getLineSpacingExtra()
            android.widget.TextView r9 = r0.f603i
            boolean r17 = r9.getIncludeFontPadding()
            android.text.StaticLayout r9 = new android.text.StaticLayout
            android.text.TextPaint r11 = r0.f602h
            r10 = r9
            r18 = r11
            r11 = r8
            r4 = -1
            r12 = r18
            r3 = r15
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            r7 = r9
        L_0x00ee:
            if (r3 == r4) goto L_0x0109
            int r4 = r7.getLineCount()
            if (r4 > r3) goto L_0x0107
            int r3 = r7.getLineCount()
            r4 = 1
            int r3 = r3 - r4
            int r3 = r7.getLineEnd(r3)
            int r8 = r8.length()
            if (r3 == r8) goto L_0x010a
            goto L_0x0115
        L_0x0107:
            r4 = 1
            goto L_0x0115
        L_0x0109:
            r4 = 1
        L_0x010a:
            int r3 = r7.getHeight()
            float r3 = (float) r3
            float r7 = r1.bottom
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x0117
        L_0x0115:
            r3 = 0
            goto L_0x0118
        L_0x0117:
            r3 = 1
        L_0x0118:
            if (r3 == 0) goto L_0x0125
            int r6 = r6 + 1
            r3 = 1
            r4 = 0
            r19 = r6
            r6 = r5
            r5 = r19
            goto L_0x000e
        L_0x0125:
            int r6 = r6 + -1
            r2 = r6
            r3 = 1
            r4 = 0
            goto L_0x000e
        L_0x012c:
            int[] r1 = r0.f600f
            r1 = r1[r6]
            return r1
        L_0x0131:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No available text sizes to choose from."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.e0.c(android.graphics.RectF):int");
    }

    public void f(int i2, float f2) {
        Context context = this.f604j;
        float applyDimension = TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (applyDimension != this.f603i.getPaint().getTextSize()) {
            this.f603i.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f603i.isInLayout();
            if (this.f603i.getLayout() != null) {
                this.f596b = false;
                try {
                    Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(this.f603i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (!isInLayout) {
                    this.f603i.requestLayout();
                } else {
                    this.f603i.forceLayout();
                }
                this.f603i.invalidate();
            }
        }
    }

    public final boolean g() {
        if (!i() || this.f595a != 1) {
            this.f596b = false;
        } else {
            if (!this.f601g || this.f600f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f599e - this.f598d) / this.f597c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round((((float) i2) * this.f597c) + this.f598d);
                }
                this.f600f = b(iArr);
            }
            this.f596b = true;
        }
        return this.f596b;
    }

    public final boolean h() {
        int[] iArr = this.f600f;
        int length = iArr.length;
        boolean z2 = length > 0;
        this.f601g = z2;
        if (z2) {
            this.f595a = 1;
            this.f598d = (float) iArr[0];
            this.f599e = (float) iArr[length - 1];
            this.f597c = -1.0f;
        }
        return z2;
    }

    public final boolean i() {
        return !(this.f603i instanceof l);
    }

    public final void j(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        } else if (f3 <= f2) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        } else if (f4 > 0.0f) {
            this.f595a = 1;
            this.f598d = f2;
            this.f599e = f3;
            this.f597c = f4;
            this.f601g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
    }
}
