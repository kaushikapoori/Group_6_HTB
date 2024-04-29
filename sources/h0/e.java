package h0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3177a;

    public static class a extends AccessibilityNodeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final e f3178a;

        public a(e eVar) {
            this.f3178a = eVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
            d a2 = this.f3178a.a(i2);
            if (a2 == null) {
                return null;
            }
            return a2.f3160a;
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i2) {
            Objects.requireNonNull(this.f3178a);
            return null;
        }

        public boolean performAction(int i2, int i3, Bundle bundle) {
            return this.f3178a.c(i2, i3, bundle);
        }
    }

    public static class b extends a {
        public b(e eVar) {
            super(eVar);
        }

        public AccessibilityNodeInfo findFocus(int i2) {
            d b2 = this.f3178a.b(i2);
            if (b2 == null) {
                return null;
            }
            return b2.f3160a;
        }
    }

    public static class c extends b {
        public c(e eVar) {
            super(eVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.f3178a);
        }
    }

    public e() {
        this.f3177a = Build.VERSION.SDK_INT >= 26 ? new c(this) : new b(this);
    }

    public e(Object obj) {
        this.f3177a = obj;
    }

    public d a(int i2) {
        return null;
    }

    public d b(int i2) {
        return null;
    }

    public boolean c(int i2, int i3, Bundle bundle) {
        return false;
    }
}
