package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import com.example.supermarket.R;
import g0.u;
import g0.w;
import g0.x;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class f1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k  reason: collision with root package name */
    public static f1 f612k;

    /* renamed from: l  reason: collision with root package name */
    public static f1 f613l;

    /* renamed from: b  reason: collision with root package name */
    public final View f614b;

    /* renamed from: c  reason: collision with root package name */
    public final CharSequence f615c;

    /* renamed from: d  reason: collision with root package name */
    public final int f616d;

    /* renamed from: e  reason: collision with root package name */
    public final Runnable f617e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final Runnable f618f = new b();

    /* renamed from: g  reason: collision with root package name */
    public int f619g;

    /* renamed from: h  reason: collision with root package name */
    public int f620h;

    /* renamed from: i  reason: collision with root package name */
    public g1 f621i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f622j;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            f1.this.d(false);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            f1.this.b();
        }
    }

    public f1(View view, CharSequence charSequence) {
        this.f614b = view;
        this.f615c = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = w.f3084a;
        this.f616d = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void c(f1 f1Var) {
        f1 f1Var2 = f612k;
        if (f1Var2 != null) {
            f1Var2.f614b.removeCallbacks(f1Var2.f617e);
        }
        f612k = f1Var;
        if (f1Var != null) {
            f1Var.f614b.postDelayed(f1Var.f617e, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.f619g = Integer.MAX_VALUE;
        this.f620h = Integer.MAX_VALUE;
    }

    public void b() {
        if (f613l == this) {
            f613l = null;
            g1 g1Var = this.f621i;
            if (g1Var != null) {
                g1Var.a();
                this.f621i = null;
                a();
                this.f614b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f612k == this) {
            c((f1) null);
        }
        this.f614b.removeCallbacks(this.f618f);
    }

    public void d(boolean z2) {
        int i2;
        int i3;
        long j2;
        View view = this.f614b;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (u.g.b(view)) {
            c((f1) null);
            f1 f1Var = f613l;
            if (f1Var != null) {
                f1Var.b();
            }
            f613l = this;
            this.f622j = z2;
            g1 g1Var = new g1(this.f614b.getContext());
            this.f621i = g1Var;
            View view2 = this.f614b;
            int i4 = this.f619g;
            int i5 = this.f620h;
            boolean z3 = this.f622j;
            CharSequence charSequence = this.f615c;
            if (g1Var.f630b.getParent() != null) {
                g1Var.a();
            }
            g1Var.f631c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = g1Var.f632d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = g1Var.f629a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i4 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = g1Var.f629a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                i2 = i5 + dimensionPixelOffset2;
                i3 = i5 - dimensionPixelOffset2;
            } else {
                i2 = view2.getHeight();
                i3 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = g1Var.f629a.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(g1Var.f633e);
                Rect rect = g1Var.f633e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = g1Var.f629a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    g1Var.f633e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(g1Var.f635g);
                view2.getLocationOnScreen(g1Var.f634f);
                int[] iArr = g1Var.f634f;
                int i6 = iArr[0];
                int[] iArr2 = g1Var.f635g;
                iArr[0] = i6 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i4) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                g1Var.f630b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = g1Var.f630b.getMeasuredHeight();
                int[] iArr3 = g1Var.f634f;
                int i7 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
                int i8 = iArr3[1] + i2 + dimensionPixelOffset3;
                if (!z3 ? measuredHeight + i8 > g1Var.f633e.height() : i7 >= 0) {
                    layoutParams.y = i7;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) g1Var.f629a.getSystemService("window")).addView(g1Var.f630b, g1Var.f632d);
            this.f614b.addOnAttachStateChangeListener(this);
            if (this.f622j) {
                j2 = 2500;
            } else {
                j2 = ((u.d.g(this.f614b) & 1) == 1 ? 3000 : 15000) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f614b.removeCallbacks(this.f618f);
            this.f614b.postDelayed(this.f618f, j2);
        }
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z2;
        if (this.f621i != null && this.f622j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f614b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                a();
                b();
            }
        } else if (this.f614b.isEnabled() && this.f621i == null) {
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (Math.abs(x2 - this.f619g) > this.f616d || Math.abs(y2 - this.f620h) > this.f616d) {
                this.f619g = x2;
                this.f620h = y2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c(this);
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f619g = view.getWidth() / 2;
        this.f620h = view.getHeight() / 2;
        d(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
