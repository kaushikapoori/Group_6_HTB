package o1;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;
import g0.a;
import h0.d;

public class c extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ CheckableImageButton f3523d;

    public c(CheckableImageButton checkableImageButton) {
        this.f3523d = checkableImageButton;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2994a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.f3523d.isChecked());
    }

    public void d(View view, d dVar) {
        this.f2994a.onInitializeAccessibilityNodeInfo(view, dVar.f3160a);
        dVar.f3160a.setCheckable(this.f3523d.f2482f);
        dVar.f3160a.setChecked(this.f3523d.isChecked());
    }
}
