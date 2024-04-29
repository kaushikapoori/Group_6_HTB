package o1;

import android.annotation.SuppressLint;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class t extends ImageButton {

    /* renamed from: b  reason: collision with root package name */
    public int f3607b;

    public final void b(int i2, boolean z2) {
        super.setVisibility(i2);
        if (z2) {
            this.f3607b = i2;
        }
    }

    public final int getUserSetVisibility() {
        return this.f3607b;
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        this.f3607b = i2;
    }
}
