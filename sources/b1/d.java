package b1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

public class d extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f2023a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f2024b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2025c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f2026d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f2027e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z2) {
        this.f2027e = bottomAppBar;
        this.f2024b = actionMenuView;
        this.f2025c = i2;
        this.f2026d = z2;
    }

    public void onAnimationCancel(Animator animator) {
        this.f2023a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f2023a) {
            BottomAppBar bottomAppBar = this.f2027e;
            int i2 = bottomAppBar.f2154a0;
            boolean z2 = i2 != 0;
            if (i2 != 0) {
                bottomAppBar.f2154a0 = 0;
                bottomAppBar.getMenu().clear();
                bottomAppBar.n(i2);
            }
            BottomAppBar bottomAppBar2 = this.f2027e;
            ActionMenuView actionMenuView = this.f2024b;
            int i3 = this.f2025c;
            boolean z3 = this.f2026d;
            Objects.requireNonNull(bottomAppBar2);
            e eVar = new e(bottomAppBar2, actionMenuView, i3, z3);
            if (z2) {
                actionMenuView.post(eVar);
            } else {
                eVar.run();
            }
        }
    }
}
