package r1;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.activity.result.d;

public class e extends d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f3836a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextPaint f3837b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f3838c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f3839d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, Context context, TextPaint textPaint, d dVar2) {
        super(3);
        this.f3839d = dVar;
        this.f3836a = context;
        this.f3837b = textPaint;
        this.f3838c = dVar2;
    }

    public void c(int i2) {
        this.f3838c.c(i2);
    }

    public void d(Typeface typeface, boolean z2) {
        this.f3839d.g(this.f3836a, this.f3837b, typeface);
        this.f3838c.d(typeface, z2);
    }
}
