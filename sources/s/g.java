package s;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;

public abstract class g extends a {

    /* renamed from: j  reason: collision with root package name */
    public boolean f3875j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3876k;

    public void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f3864b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 6) {
                    this.f3875j = true;
                } else if (index == 22) {
                    this.f3876k = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3875j || this.f3876k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i2 = 0; i2 < this.f909c; i2++) {
                    View d2 = constraintLayout.d(this.f908b[i2]);
                    if (d2 != null) {
                        if (this.f3875j) {
                            d2.setVisibility(visibility);
                        }
                        if (this.f3876k && elevation > 0.0f) {
                            d2.setTranslationZ(d2.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }
}
