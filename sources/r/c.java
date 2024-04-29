package r;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import r.d;
import s.e;

public class c extends a implements d.c {

    /* renamed from: j  reason: collision with root package name */
    public boolean f3791j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f3792k;

    /* renamed from: l  reason: collision with root package name */
    public float f3793l;

    /* renamed from: m  reason: collision with root package name */
    public View[] f3794m;

    public void a(d dVar, int i2, int i3) {
    }

    public void b(d dVar, int i2, int i3, float f2) {
    }

    public float getProgress() {
        return this.f3793l;
    }

    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f3870h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.f3791j = obtainStyledAttributes.getBoolean(index, this.f3791j);
                } else if (index == 0) {
                    this.f3792k = obtainStyledAttributes.getBoolean(index, this.f3792k);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f2) {
        this.f3793l = f2;
        int i2 = 0;
        if (this.f909c > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.f914h;
            if (viewArr == null || viewArr.length != this.f909c) {
                this.f914h = new View[this.f909c];
            }
            for (int i3 = 0; i3 < this.f909c; i3++) {
                this.f914h[i3] = constraintLayout.d(this.f908b[i3]);
            }
            this.f3794m = this.f914h;
            while (i2 < this.f909c) {
                View view = this.f3794m[i2];
                i2++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i2 < childCount) {
            boolean z2 = viewGroup.getChildAt(i2) instanceof c;
            i2++;
        }
    }
}
