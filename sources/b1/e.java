package b1;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

public class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f2028b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2029c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f2030d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f2031e;

    public e(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z2) {
        this.f2031e = bottomAppBar;
        this.f2028b = actionMenuView;
        this.f2029c = i2;
        this.f2030d = z2;
    }

    public void run() {
        ActionMenuView actionMenuView = this.f2028b;
        actionMenuView.setTranslationX((float) this.f2031e.A(actionMenuView, this.f2029c, this.f2030d));
    }
}
