package w1;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public TextInputLayout f4254a;

    /* renamed from: b  reason: collision with root package name */
    public Context f4255b;

    /* renamed from: c  reason: collision with root package name */
    public CheckableImageButton f4256c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4257d;

    public k(TextInputLayout textInputLayout, int i2) {
        this.f4254a = textInputLayout;
        this.f4255b = textInputLayout.getContext();
        this.f4256c = textInputLayout.getEndIconView();
        this.f4257d = i2;
    }

    public abstract void a();

    public boolean b(int i2) {
        return true;
    }

    public void c(boolean z2) {
    }
}
