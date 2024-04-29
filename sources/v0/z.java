package v0;

import android.view.View;
import android.view.WindowId;

public class z implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f4127a;

    public z(View view) {
        this.f4127a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof z) && ((z) obj).f4127a.equals(this.f4127a);
    }

    public int hashCode() {
        return this.f4127a.hashCode();
    }
}
