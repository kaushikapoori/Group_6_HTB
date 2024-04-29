package o1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f3567a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public b f3568b = null;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f3569c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Animator.AnimatorListener f3570d = new a();

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            j jVar = j.this;
            if (jVar.f3569c == animator) {
                jVar.f3569c = null;
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f3572a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f3573b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f3572a = iArr;
            this.f3573b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f3570d);
        this.f3567a.add(bVar);
    }
}
