package h0;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textfield.b;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public final class c implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final b f3158a;

    public c(b bVar) {
        this.f3158a = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return this.f3158a.equals(((c) obj).f3158a);
    }

    public int hashCode() {
        return this.f3158a.hashCode();
    }

    public void onTouchExplorationStateChanged(boolean z2) {
        AutoCompleteTextView autoCompleteTextView;
        b.g gVar = (b.g) this.f3158a;
        TextInputLayout textInputLayout = b.this.f4254a;
        if (textInputLayout != null && (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) != null) {
            int i2 = 1;
            if (!(autoCompleteTextView.getKeyListener() != null)) {
                CheckableImageButton checkableImageButton = b.this.f4256c;
                if (z2) {
                    i2 = 2;
                }
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                u.d.s(checkableImageButton, i2);
            }
        }
    }
}
