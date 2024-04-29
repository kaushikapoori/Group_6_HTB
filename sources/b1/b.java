package b1;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class b extends FloatingActionButton.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2019a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f2020b;

    public class a extends FloatingActionButton.a {
        public a() {
        }

        public void b(FloatingActionButton floatingActionButton) {
            BottomAppBar.x(b.this.f2020b);
        }
    }

    public b(BottomAppBar bottomAppBar, int i2) {
        this.f2020b = bottomAppBar;
        this.f2019a = i2;
    }

    public void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f2020b.B(this.f2019a));
        floatingActionButton.m(new a(), true);
    }
}
