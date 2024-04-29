package n1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.d;
import java.util.ArrayList;
import t1.b;

public class c extends d {
    public c(FloatingActionButton floatingActionButton, b bVar) {
        super(floatingActionButton, bVar);
    }

    public float e() {
        return this.f2457r.getElevation();
    }

    public void f(Rect rect) {
        if (FloatingActionButton.this.f2422l) {
            super.f(rect);
            return;
        }
        int i2 = 0;
        if (!s()) {
            i2 = (0 - this.f2457r.getSizeDimension()) / 2;
        }
        rect.set(i2, i2, i2, i2);
    }

    public void i() {
    }

    public void j() {
        u();
        throw null;
    }

    public void k(int[] iArr) {
        FloatingActionButton floatingActionButton;
        if (Build.VERSION.SDK_INT == 21) {
            float f2 = 0.0f;
            if (this.f2457r.isEnabled()) {
                this.f2457r.setElevation(this.f2443d);
                if (this.f2457r.isPressed()) {
                    floatingActionButton = this.f2457r;
                    f2 = this.f2445f;
                } else if (this.f2457r.isFocused() || this.f2457r.isHovered()) {
                    floatingActionButton = this.f2457r;
                    f2 = this.f2444e;
                }
                floatingActionButton.setTranslationZ(f2);
            }
            this.f2457r.setElevation(0.0f);
            floatingActionButton = this.f2457r;
            floatingActionButton.setTranslationZ(f2);
        }
    }

    public void l(float f2, float f3, float f4) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 21) {
            this.f2457r.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.f2439z, v(f2, f4));
            stateListAnimator.addState(d.A, v(f2, f3));
            stateListAnimator.addState(d.B, v(f2, f3));
            stateListAnimator.addState(d.C, v(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f2457r, "elevation", new float[]{f2}).setDuration(0));
            if (i2 >= 22 && i2 <= 24) {
                FloatingActionButton floatingActionButton = this.f2457r;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f2457r, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(d.f2438y);
            stateListAnimator.addState(d.D, animatorSet);
            stateListAnimator.addState(d.E, v(0.0f, 0.0f));
            this.f2457r.setStateListAnimator(stateListAnimator);
        }
        if (q()) {
            u();
            throw null;
        }
    }

    public void p(ColorStateList colorStateList) {
    }

    public boolean q() {
        return FloatingActionButton.this.f2422l || !s();
    }

    public void t() {
    }

    public final Animator v(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f2457r, "elevation", new float[]{f2}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f2457r, View.TRANSLATION_Z, new float[]{f3}).setDuration(100));
        animatorSet.setInterpolator(d.f2438y);
        return animatorSet;
    }
}
