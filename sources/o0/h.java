package o0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.d;

public class h implements TransformationMethod {

    /* renamed from: b  reason: collision with root package name */
    public final TransformationMethod f3516b;

    public h(TransformationMethod transformationMethod) {
        this.f3516b = transformationMethod;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f3516b;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || d.a().b() != 1) ? charSequence : d.a().h(charSequence);
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.f3516b;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i2, rect);
        }
    }
}
