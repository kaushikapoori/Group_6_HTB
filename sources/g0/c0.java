package g0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final e f3042a;

    public static class a extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Window f3043a;

        public a(Window window, View view) {
            this.f3043a = window;
        }
    }

    public static class b extends a {
        public b(Window window, View view) {
            super(window, view);
        }

        public void b(boolean z2) {
            if (z2) {
                this.f3043a.clearFlags(67108864);
                this.f3043a.addFlags(Integer.MIN_VALUE);
                View decorView = this.f3043a.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
            View decorView2 = this.f3043a.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -8193);
        }
    }

    public static class c extends b {
        public c(Window window, View view) {
            super(window, view);
        }

        public void a(boolean z2) {
            if (z2) {
                this.f3043a.clearFlags(134217728);
                this.f3043a.addFlags(Integer.MIN_VALUE);
                View decorView = this.f3043a.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                return;
            }
            View decorView2 = this.f3043a.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & -17);
        }
    }

    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final WindowInsetsController f3044a;

        /* renamed from: b  reason: collision with root package name */
        public Window f3045b;

        public d(Window window, c0 c0Var) {
            this.f3044a = window.getInsetsController();
            this.f3045b = window;
        }

        public d(WindowInsetsController windowInsetsController, c0 c0Var) {
            this.f3044a = windowInsetsController;
        }

        public void a(boolean z2) {
            if (z2) {
                this.f3044a.setSystemBarsAppearance(16, 16);
            } else {
                this.f3044a.setSystemBarsAppearance(0, 16);
            }
        }

        public void b(boolean z2) {
            if (z2) {
                Window window = this.f3045b;
                if (window != null) {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & -8193);
                }
                this.f3044a.setSystemBarsAppearance(8, 8);
                return;
            }
            this.f3044a.setSystemBarsAppearance(0, 8);
        }
    }

    public static class e {
        public void a(boolean z2) {
        }

        public void b(boolean z2) {
        }
    }

    public c0(Window window, View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f3042a = new d(window, this);
        } else {
            this.f3042a = i2 >= 26 ? new c(window, view) : i2 >= 23 ? new b(window, view) : new a(window, view);
        }
    }

    public c0(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f3042a = new d(windowInsetsController, this);
        } else {
            this.f3042a = new e();
        }
    }
}
