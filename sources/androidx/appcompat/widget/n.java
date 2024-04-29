package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import c.c;
import o0.f;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f713a;

    /* renamed from: b  reason: collision with root package name */
    public final f f714b;

    public n(TextView textView) {
        this.f713a = textView;
        this.f714b = new f(textView, false);
    }

    /* JADX INFO: finally extract failed */
    public void a(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = this.f713a.getContext().obtainStyledAttributes(attributeSet, c.f2046i, i2, 0);
        try {
            boolean z2 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z2 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            b(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void b(boolean z2) {
        this.f714b.f3506a.c(z2);
    }
}
