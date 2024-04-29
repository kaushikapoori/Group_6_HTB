package z0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.activity.result.a;
import java.util.ArrayList;
import java.util.List;
import m.h;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public final h<String, h> f4431a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final h<String, PropertyValuesHolder[]> f4432b = new h<>();

    public static g a(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return b(context, resourceId);
    }

    public static g b(Context context, int i2) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e2) {
            StringBuilder a2 = a.a("Can't load animation resource ID #0x");
            a2.append(Integer.toHexString(i2));
            Log.w("MotionSpec", a2.toString(), e2);
            return null;
        }
    }

    public static g c(List<Animator> list) {
        g gVar = new g();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Animator animator = list.get(i2);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f4432b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = a.f4420b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = a.f4421c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = a.f4422d;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.f4436d = objectAnimator.getRepeatCount();
                hVar.f4437e = objectAnimator.getRepeatMode();
                gVar.f4431a.put(propertyName, hVar);
                i2++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }

    public h d(String str) {
        if (this.f4431a.getOrDefault(str, null) != null) {
            return this.f4431a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.f4431a.equals(((g) obj).f4431a);
    }

    public int hashCode() {
        return this.f4431a.hashCode();
    }

    public String toString() {
        return 10 + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4431a + "}\n";
    }
}
