package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import c.a;

public abstract class i extends ReplacementSpan {

    /* renamed from: b  reason: collision with root package name */
    public final Paint.FontMetricsInt f1164b = new Paint.FontMetricsInt();

    /* renamed from: c  reason: collision with root package name */
    public final g f1165c;

    /* renamed from: d  reason: collision with root package name */
    public short f1166d = -1;

    /* renamed from: e  reason: collision with root package name */
    public float f1167e = 1.0f;

    public i(g gVar) {
        a.d(gVar, "metadata cannot be null");
        this.f1165c = gVar;
    }

    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f1164b);
        Paint.FontMetricsInt fontMetricsInt2 = this.f1164b;
        this.f1167e = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f1165c.c());
        this.f1165c.c();
        n0.a e2 = this.f1165c.e();
        int a2 = e2.a(12);
        short s2 = (short) ((int) (((float) (a2 != 0 ? e2.f3483b.getShort(a2 + e2.f3482a) : 0)) * this.f1167e));
        this.f1166d = s2;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f1164b;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return s2;
    }
}
