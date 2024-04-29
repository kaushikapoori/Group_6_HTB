package a1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class d<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public e f34a;

    /* renamed from: b  reason: collision with root package name */
    public int f35b = 0;

    public d() {
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        t(coordinatorLayout, v2, i2);
        if (this.f34a == null) {
            this.f34a = new e(v2);
        }
        e eVar = this.f34a;
        eVar.f37b = eVar.f36a.getTop();
        eVar.f38c = eVar.f36a.getLeft();
        this.f34a.a();
        int i3 = this.f35b;
        if (i3 == 0) {
            return true;
        }
        e eVar2 = this.f34a;
        if (eVar2.f39d != i3) {
            eVar2.f39d = i3;
            eVar2.a();
        }
        this.f35b = 0;
        return true;
    }

    public int s() {
        e eVar = this.f34a;
        if (eVar != null) {
            return eVar.f39d;
        }
        return 0;
    }

    public void t(CoordinatorLayout coordinatorLayout, V v2, int i2) {
        coordinatorLayout.r(v2, i2);
    }

    public boolean u(int i2) {
        e eVar = this.f34a;
        if (eVar == null) {
            this.f35b = i2;
            return false;
        } else if (eVar.f39d == i2) {
            return false;
        } else {
            eVar.f39d = i2;
            eVar.a();
            return true;
        }
    }
}
