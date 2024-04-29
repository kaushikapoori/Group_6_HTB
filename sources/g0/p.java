package g0;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

public final class p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    public final View f3059b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTreeObserver f3060c;

    /* renamed from: d  reason: collision with root package name */
    public final Runnable f3061d;

    public p(View view, Runnable runnable) {
        this.f3059b = view;
        this.f3060c = view.getViewTreeObserver();
        this.f3061d = runnable;
    }

    public static p a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        p pVar = new p(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(pVar);
        view.addOnAttachStateChangeListener(pVar);
        return pVar;
    }

    public void b() {
        (this.f3060c.isAlive() ? this.f3060c : this.f3059b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f3059b.removeOnAttachStateChangeListener(this);
    }

    public boolean onPreDraw() {
        b();
        this.f3061d.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f3060c = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
