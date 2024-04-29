package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.i;
import com.example.supermarket.R;
import d.v;
import g0.b0;
import g0.j;
import g0.k;
import g0.l;
import g0.u;
import g0.x;
import java.util.Objects;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements g0, j, k {
    public static final int[] C = {R.attr.actionBarSize, 16842841};
    public final Runnable A;
    public final l B;

    /* renamed from: b  reason: collision with root package name */
    public int f329b;

    /* renamed from: c  reason: collision with root package name */
    public int f330c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ContentFrameLayout f331d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContainer f332e;

    /* renamed from: f  reason: collision with root package name */
    public h0 f333f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f334g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f335h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f336i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f337j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f338k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f339l;

    /* renamed from: m  reason: collision with root package name */
    public int f340m;

    /* renamed from: n  reason: collision with root package name */
    public int f341n;

    /* renamed from: o  reason: collision with root package name */
    public final Rect f342o = new Rect();

    /* renamed from: p  reason: collision with root package name */
    public final Rect f343p = new Rect();

    /* renamed from: q  reason: collision with root package name */
    public final Rect f344q = new Rect();

    /* renamed from: r  reason: collision with root package name */
    public b0 f345r;

    /* renamed from: s  reason: collision with root package name */
    public b0 f346s;

    /* renamed from: t  reason: collision with root package name */
    public b0 f347t;

    /* renamed from: u  reason: collision with root package name */
    public b0 f348u;

    /* renamed from: v  reason: collision with root package name */
    public d f349v;

    /* renamed from: w  reason: collision with root package name */
    public OverScroller f350w;

    /* renamed from: x  reason: collision with root package name */
    public ViewPropertyAnimator f351x;

    /* renamed from: y  reason: collision with root package name */
    public final AnimatorListenerAdapter f352y;

    /* renamed from: z  reason: collision with root package name */
    public final Runnable f353z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f351x = null;
            actionBarOverlayLayout.f339l = false;
        }

        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f351x = null;
            actionBarOverlayLayout.f339l = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f351x = actionBarOverlayLayout.f332e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f352y);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f351x = actionBarOverlayLayout.f332e.animate().translationY((float) (-ActionBarOverlayLayout.this.f332e.getHeight())).setListener(ActionBarOverlayLayout.this.f352y);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        b0 b0Var = b0.f2998b;
        this.f345r = b0Var;
        this.f346s = b0Var;
        this.f347t = b0Var;
        this.f348u = b0Var;
        this.f352y = new a();
        this.f353z = new b();
        this.A = new c();
        r(context);
        this.B = new l();
    }

    public boolean a() {
        s();
        return this.f333f.a();
    }

    public void b(Menu menu, i.a aVar) {
        s();
        this.f333f.b(menu, aVar);
    }

    public boolean c() {
        s();
        return this.f333f.c();
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    public void d() {
        s();
        this.f333f.d();
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        if (this.f334g != null && !this.f335h) {
            if (this.f332e.getVisibility() == 0) {
                i2 = (int) (this.f332e.getTranslationY() + ((float) this.f332e.getBottom()) + 0.5f);
            } else {
                i2 = 0;
            }
            this.f334g.setBounds(0, i2, getWidth(), this.f334g.getIntrinsicHeight() + i2);
            this.f334g.draw(canvas);
        }
    }

    public boolean e() {
        s();
        return this.f333f.e();
    }

    public boolean f() {
        s();
        return this.f333f.f();
    }

    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public boolean g() {
        s();
        return this.f333f.g();
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f332e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public int getNestedScrollAxes() {
        return this.B.a();
    }

    public CharSequence getTitle() {
        s();
        return this.f333f.getTitle();
    }

    public void h(int i2) {
        s();
        if (i2 == 2) {
            this.f333f.l();
        } else if (i2 == 5) {
            this.f333f.q();
        } else if (i2 == 109) {
            setOverlayMode(true);
        }
    }

    public void i(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public void j() {
        s();
        this.f333f.h();
    }

    public void k(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public void l(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    public void m(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    public void n(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    public boolean o(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        b0 j2 = b0.j(windowInsets, this);
        boolean p2 = p(this.f332e, new Rect(j2.c(), j2.e(), j2.d(), j2.b()), true, true, false, true);
        Rect rect = this.f342o;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.i.b(this, j2, rect);
        Rect rect2 = this.f342o;
        b0 l2 = j2.f2999a.l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.f345r = l2;
        boolean z2 = true;
        if (!this.f346s.equals(l2)) {
            this.f346s = this.f345r;
            p2 = true;
        }
        if (!this.f343p.equals(this.f342o)) {
            this.f343p.set(this.f342o);
        } else {
            z2 = p2;
        }
        if (z2) {
            requestLayout();
        }
        return j2.f2999a.a().f2999a.c().f2999a.b().h();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.h.c(this);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = eVar.leftMargin + paddingLeft;
                int i8 = eVar.topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        b0 b0Var;
        s();
        measureChildWithMargins(this.f332e, i2, 0, i3, 0);
        e eVar = (e) this.f332e.getLayoutParams();
        int max = Math.max(0, this.f332e.getMeasuredWidth() + eVar.leftMargin + eVar.rightMargin);
        int max2 = Math.max(0, this.f332e.getMeasuredHeight() + eVar.topMargin + eVar.bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f332e.getMeasuredState());
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        boolean z2 = (u.d.g(this) & 256) != 0;
        if (z2) {
            i4 = this.f329b;
            if (this.f337j && this.f332e.getTabContainer() != null) {
                i4 += this.f329b;
            }
        } else {
            i4 = this.f332e.getVisibility() != 8 ? this.f332e.getMeasuredHeight() : 0;
        }
        this.f344q.set(this.f342o);
        b0 b0Var2 = this.f345r;
        this.f347t = b0Var2;
        if (this.f336i || z2) {
            z.b b2 = z.b.b(b0Var2.c(), this.f347t.e() + i4, this.f347t.d(), this.f347t.b() + 0);
            b0 b0Var3 = this.f347t;
            int i5 = Build.VERSION.SDK_INT;
            b0.e dVar = i5 >= 30 ? new b0.d(b0Var3) : i5 >= 29 ? new b0.c(b0Var3) : new b0.b(b0Var3);
            dVar.d(b2);
            b0Var = dVar.b();
        } else {
            Rect rect = this.f344q;
            rect.top += i4;
            rect.bottom += 0;
            b0Var = b0Var2.f2999a.l(0, i4, 0, 0);
        }
        this.f347t = b0Var;
        p(this.f331d, this.f344q, true, true, true, true);
        if (!this.f348u.equals(this.f347t)) {
            b0 b0Var4 = this.f347t;
            this.f348u = b0Var4;
            u.e(this.f331d, b0Var4);
        }
        measureChildWithMargins(this.f331d, i2, 0, i3, 0);
        e eVar2 = (e) this.f331d.getLayoutParams();
        int max3 = Math.max(max, this.f331d.getMeasuredWidth() + eVar2.leftMargin + eVar2.rightMargin);
        int max4 = Math.max(max2, this.f331d.getMeasuredHeight() + eVar2.topMargin + eVar2.bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f331d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i2, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i3, combineMeasuredStates2 << 16));
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        boolean z3 = false;
        if (!this.f338k || !z2) {
            return false;
        }
        this.f350w.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f350w.getFinalY() > this.f332e.getHeight()) {
            z3 = true;
        }
        if (z3) {
            q();
            this.A.run();
        } else {
            q();
            this.f353z.run();
        }
        this.f339l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f340m + i3;
        this.f340m = i6;
        setActionBarHideOffset(i6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = (d.v) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3) {
        /*
            r0 = this;
            g0.l r1 = r0.B
            r1.f3057a = r3
            int r1 = r0.getActionBarHideOffset()
            r0.f340m = r1
            r0.q()
            androidx.appcompat.widget.ActionBarOverlayLayout$d r1 = r0.f349v
            if (r1 == 0) goto L_0x001d
            d.v r1 = (d.v) r1
            h.h r2 = r1.f2822t
            if (r2 == 0) goto L_0x001d
            r2.a()
            r2 = 0
            r1.f2822t = r2
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onNestedScrollAccepted(android.view.View, android.view.View, int):void");
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f332e.getVisibility() != 0) {
            return false;
        }
        return this.f338k;
    }

    public void onStopNestedScroll(View view) {
        if (this.f338k && !this.f339l) {
            if (this.f340m <= this.f332e.getHeight()) {
                q();
                postDelayed(this.f353z, 600);
            } else {
                q();
                postDelayed(this.A, 600);
            }
        }
        d dVar = this.f349v;
        if (dVar != null) {
            Objects.requireNonNull(dVar);
        }
    }

    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        s();
        int i3 = this.f341n ^ i2;
        this.f341n = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        d dVar = this.f349v;
        if (dVar != null) {
            ((v) dVar).f2818p = !z3;
            if (z2 || !z3) {
                v vVar = (v) dVar;
                if (vVar.f2819q) {
                    vVar.f2819q = false;
                    vVar.g(true);
                }
            } else {
                v vVar2 = (v) dVar;
                if (!vVar2.f2819q) {
                    vVar2.f2819q = true;
                    vVar2.g(true);
                }
            }
        }
        if ((i3 & 256) != 0 && this.f349v != null) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.h.c(this);
        }
    }

    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f330c = i2;
        d dVar = this.f349v;
        if (dVar != null) {
            ((v) dVar).f2817o = i2;
        }
    }

    public final boolean p(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i2;
        int i3;
        int i4;
        int i5;
        e eVar = (e) view.getLayoutParams();
        if (!z2 || eVar.leftMargin == (i5 = rect.left)) {
            z6 = false;
        } else {
            eVar.leftMargin = i5;
            z6 = true;
        }
        if (z3 && eVar.topMargin != (i4 = rect.top)) {
            eVar.topMargin = i4;
            z6 = true;
        }
        if (z5 && eVar.rightMargin != (i3 = rect.right)) {
            eVar.rightMargin = i3;
            z6 = true;
        }
        if (!z4 || eVar.bottomMargin == (i2 = rect.bottom)) {
            return z6;
        }
        eVar.bottomMargin = i2;
        return true;
    }

    public void q() {
        removeCallbacks(this.f353z);
        removeCallbacks(this.A);
        ViewPropertyAnimator viewPropertyAnimator = this.f351x;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        boolean z2 = false;
        this.f329b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f334g = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.f335h = z2;
        this.f350w = new OverScroller(context);
    }

    public void s() {
        h0 h0Var;
        if (this.f331d == null) {
            this.f331d = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f332e = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof h0) {
                h0Var = (h0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                h0Var = ((Toolbar) findViewById).getWrapper();
            } else {
                StringBuilder a2 = androidx.activity.result.a.a("Can't make a decor toolbar out of ");
                a2.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(a2.toString());
            }
            this.f333f = h0Var;
        }
    }

    public void setActionBarHideOffset(int i2) {
        q();
        this.f332e.setTranslationY((float) (-Math.max(0, Math.min(i2, this.f332e.getHeight()))));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f349v = dVar;
        if (getWindowToken() != null) {
            ((v) this.f349v).f2817o = this.f330c;
            int i2 = this.f341n;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                u.h.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f337j = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f338k) {
            this.f338k = z2;
            if (!z2) {
                q();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i2) {
        s();
        this.f333f.setIcon(i2);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f333f.setIcon(drawable);
    }

    public void setLogo(int i2) {
        s();
        this.f333f.n(i2);
    }

    public void setOverlayMode(boolean z2) {
        this.f336i = z2;
        this.f335h = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f333f.setWindowCallback(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f333f.setWindowTitle(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
