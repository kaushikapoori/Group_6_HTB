package z0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public long f4433a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f4434b = 300;

    /* renamed from: c  reason: collision with root package name */
    public TimeInterpolator f4435c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f4436d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f4437e = 1;

    public h(long j2, long j3) {
        this.f4433a = j2;
        this.f4434b = j3;
    }

    public h(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.f4433a = j2;
        this.f4434b = j3;
        this.f4435c = timeInterpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.f4433a);
        animator.setDuration(this.f4434b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f4436d);
            valueAnimator.setRepeatMode(this.f4437e);
        }
    }

    public TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f4435c;
        return timeInterpolator != null ? timeInterpolator : a.f4420b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f4433a == hVar.f4433a && this.f4434b == hVar.f4434b && this.f4436d == hVar.f4436d && this.f4437e == hVar.f4437e) {
            return b().getClass().equals(hVar.b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f4433a;
        long j3 = this.f4434b;
        return ((((b().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f4436d) * 31) + this.f4437e;
    }

    public String toString() {
        return 10 + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f4433a + " duration: " + this.f4434b + " interpolator: " + b().getClass() + " repeatCount: " + this.f4436d + " repeatMode: " + this.f4437e + "}\n";
    }
}
