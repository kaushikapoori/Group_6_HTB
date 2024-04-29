package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

public class c0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TextView f552b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Typeface f553c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f554d;

    public c0(b0 b0Var, TextView textView, Typeface typeface, int i2) {
        this.f552b = textView;
        this.f553c = typeface;
        this.f554d = i2;
    }

    public void run() {
        this.f552b.setTypeface(this.f553c, this.f554d);
    }
}
