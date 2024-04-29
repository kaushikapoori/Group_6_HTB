package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import java.util.Objects;

public final class o extends i {
    public o(g gVar) {
        super(gVar);
    }

    public void draw(Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        Paint paint2 = paint;
        Objects.requireNonNull(d.a());
        g gVar = this.f1165c;
        Typeface typeface = gVar.f1151b.f1184d;
        Typeface typeface2 = paint.getTypeface();
        paint2.setTypeface(typeface);
        int i7 = gVar.f1150a * 2;
        char[] cArr = gVar.f1151b.f1182b;
        canvas.drawText(cArr, i7, 2, f2, (float) i5, paint);
        paint2.setTypeface(typeface2);
    }
}
