package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import com.example.supermarket.R;
import g0.h;
import g0.i;
import g0.k;
import g0.l;
import g0.u;
import g0.x;
import h0.d;
import j0.d;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class NestedScrollView extends FrameLayout implements k, h {
    public static final a B = new a();
    public static final int[] C = {16843130};
    public b A;

    /* renamed from: b  reason: collision with root package name */
    public long f1094b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f1095c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public OverScroller f1096d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f1097e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f1098f;

    /* renamed from: g  reason: collision with root package name */
    public int f1099g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1100h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1101i = false;

    /* renamed from: j  reason: collision with root package name */
    public View f1102j = null;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1103k = false;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f1104l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1105m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1106n = true;

    /* renamed from: o  reason: collision with root package name */
    public int f1107o;

    /* renamed from: p  reason: collision with root package name */
    public int f1108p;

    /* renamed from: q  reason: collision with root package name */
    public int f1109q;

    /* renamed from: r  reason: collision with root package name */
    public int f1110r = -1;

    /* renamed from: s  reason: collision with root package name */
    public final int[] f1111s = new int[2];

    /* renamed from: t  reason: collision with root package name */
    public final int[] f1112t = new int[2];

    /* renamed from: u  reason: collision with root package name */
    public int f1113u;

    /* renamed from: v  reason: collision with root package name */
    public int f1114v;

    /* renamed from: w  reason: collision with root package name */
    public c f1115w;

    /* renamed from: x  reason: collision with root package name */
    public final l f1116x;

    /* renamed from: y  reason: collision with root package name */
    public final i f1117y;

    /* renamed from: z  reason: collision with root package name */
    public float f1118z;

    public static class a extends g0.a {
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            this.f2994a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        public void d(View view, d dVar) {
            int scrollRange;
            this.f2994a.onInitializeAccessibilityNodeInfo(view, dVar.f3160a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            dVar.f3160a.setClassName(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                dVar.f3160a.setScrollable(true);
                if (nestedScrollView.getScrollY() > 0) {
                    dVar.a(d.a.f3165g);
                    dVar.a(d.a.f3169k);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    dVar.a(d.a.f3164f);
                    dVar.a(d.a.f3170l);
                }
            }
        }

        public boolean g(View view, int i2, Bundle bundle) {
            int min;
            if (super.g(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    min = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.z(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
                    return true;
                } else if (i2 != 16908346) {
                    return false;
                }
            }
            min = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.z(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
    }

    public interface b {
    }

    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public int f1119b;

        public class a implements Parcelable.Creator<c> {
            public Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            public Object[] newArray(int i2) {
                return new c[i2];
            }
        }

        public c(Parcel parcel) {
            super(parcel);
            this.f1119b = parcel.readInt();
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = androidx.activity.result.a.a("HorizontalScrollView.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" scrollPosition=");
            a2.append(this.f1119b);
            a2.append("}");
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1119b);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        this.f1097e = c0.a.a() ? d.a.a(context, attributeSet) : new EdgeEffect(context);
        this.f1098f = c0.a.a() ? d.a.a(context, attributeSet) : new EdgeEffect(context);
        this.f1096d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1107o = viewConfiguration.getScaledTouchSlop();
        this.f1108p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1109q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f1116x = new l();
        this.f1117y = new i(this);
        setNestedScrollingEnabled(true);
        u.u(this, B);
    }

    public static int c(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f1118z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                this.f1118z = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.f1118z;
    }

    public static boolean q(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && q((View) parent, view2);
    }

    public boolean A(int i2, int i3) {
        return this.f1117y.i(i2, i3);
    }

    public final boolean B(MotionEvent motionEvent) {
        boolean z2;
        if (j0.d.a(this.f1097e) != 0.0f) {
            j0.d.b(this.f1097e, 0.0f, motionEvent.getY() / ((float) getHeight()));
            z2 = true;
        } else {
            z2 = false;
        }
        if (j0.d.a(this.f1098f) == 0.0f) {
            return z2;
        }
        j0.d.b(this.f1098f, 0.0f, 1.0f - (motionEvent.getY() / ((float) getHeight())));
        return true;
    }

    public final void a() {
        this.f1096d.abortAnimation();
        this.f1117y.j(1);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean b(int i2) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !r(findNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            f(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1095c);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1095c);
            f(d(this.f1095c));
            findNextFocus.requestFocus(i2);
        }
        if (findFocus != null && findFocus.isFocused() && (!r(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    public void computeScroll() {
        EdgeEffect edgeEffect;
        if (!this.f1096d.isFinished()) {
            this.f1096d.computeScrollOffset();
            int currY = this.f1096d.getCurrY();
            int i2 = currY - this.f1114v;
            this.f1114v = currY;
            int[] iArr = this.f1112t;
            boolean z2 = false;
            iArr[1] = 0;
            e(0, i2, iArr, (int[]) null, 1);
            int i3 = i2 - this.f1112t[1];
            int scrollRange = getScrollRange();
            if (i3 != 0) {
                int scrollY = getScrollY();
                u(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0);
                int scrollY2 = getScrollY() - scrollY;
                int i4 = i3 - scrollY2;
                int[] iArr2 = this.f1112t;
                iArr2[1] = 0;
                this.f1117y.f(0, scrollY2, 0, i4, this.f1111s, 1, iArr2);
                i3 = i4 - this.f1112t[1];
            }
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    z2 = true;
                }
                if (z2) {
                    if (i3 < 0) {
                        if (this.f1097e.isFinished()) {
                            edgeEffect = this.f1097e;
                        }
                    } else if (this.f1098f.isFinished()) {
                        edgeEffect = this.f1098f;
                    }
                    edgeEffect.onAbsorb((int) this.f1096d.getCurrVelocity());
                }
                a();
            }
            if (!this.f1096d.isFinished()) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                u.d.k(this);
                return;
            }
            this.f1117y.j(1);
        }
    }

    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public int d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        } else if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || g(keyEvent);
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f1117y.a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1117y.b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return e(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1117y.e(i2, i3, i4, i5, iArr);
    }

    public void draw(Canvas canvas) {
        int i2;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i3 = 0;
        if (!this.f1097e.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                i2 = getPaddingLeft() + 0;
            } else {
                i2 = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate((float) i2, (float) min);
            this.f1097e.setSize(width, height);
            if (this.f1097e.draw(canvas)) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                u.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f1098f.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i3 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate((float) (i3 - width2), (float) max);
            canvas.rotate(180.0f, (float) width2, 0.0f);
            this.f1098f.setSize(width2, height2);
            if (this.f1098f.draw(canvas)) {
                WeakHashMap<View, x> weakHashMap2 = u.f3063a;
                u.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public boolean e(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.f1117y.c(i2, i3, iArr, iArr2, i4);
    }

    public final void f(int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.f1106n) {
            z(0, i2, 250, false);
        } else {
            scrollBy(0, i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(android.view.KeyEvent r7) {
        /*
            r6 = this;
            android.graphics.Rect r0 = r6.f1095c
            r0.setEmpty()
            int r0 = r6.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0033
            android.view.View r0 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r6.getHeight()
            int r4 = r6.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r6.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r6.isFocused()
            if (r0 == 0) goto L_0x0061
            int r7 = r7.getKeyCode()
            r0 = 4
            if (r7 == r0) goto L_0x0061
            android.view.View r7 = r6.findFocus()
            if (r7 != r6) goto L_0x004c
            r7 = 0
        L_0x004c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r7 = r0.findNextFocus(r6, r7, r3)
            if (r7 == 0) goto L_0x005f
            if (r7 == r6) goto L_0x005f
            boolean r7 = r7.requestFocus(r3)
            if (r7 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            return r1
        L_0x0061:
            return r2
        L_0x0062:
            int r0 = r7.getAction()
            if (r0 != 0) goto L_0x00fb
            int r0 = r7.getKeyCode()
            r4 = 19
            r5 = 33
            if (r0 == r4) goto L_0x00ec
            r4 = 20
            if (r0 == r4) goto L_0x00dc
            r4 = 62
            if (r0 == r4) goto L_0x007c
            goto L_0x00fb
        L_0x007c:
            boolean r7 = r7.isShiftPressed()
            if (r7 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r5 = 130(0x82, float:1.82E-43)
        L_0x0085:
            if (r5 != r3) goto L_0x0089
            r7 = 1
            goto L_0x008a
        L_0x0089:
            r7 = 0
        L_0x008a:
            int r0 = r6.getHeight()
            if (r7 == 0) goto L_0x00bf
            android.graphics.Rect r7 = r6.f1095c
            int r3 = r6.getScrollY()
            int r3 = r3 + r0
            r7.top = r3
            int r7 = r6.getChildCount()
            if (r7 <= 0) goto L_0x00d1
            int r7 = r7 - r1
            android.view.View r7 = r6.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r7 = r7.getBottom()
            int r1 = r1.bottomMargin
            int r7 = r7 + r1
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r7
            android.graphics.Rect r7 = r6.f1095c
            int r3 = r7.top
            int r3 = r3 + r0
            if (r3 <= r1) goto L_0x00d1
            int r1 = r1 - r0
            goto L_0x00cf
        L_0x00bf:
            android.graphics.Rect r7 = r6.f1095c
            int r1 = r6.getScrollY()
            int r1 = r1 - r0
            r7.top = r1
            android.graphics.Rect r7 = r6.f1095c
            int r1 = r7.top
            if (r1 >= 0) goto L_0x00d1
            r1 = 0
        L_0x00cf:
            r7.top = r1
        L_0x00d1:
            android.graphics.Rect r7 = r6.f1095c
            int r1 = r7.top
            int r0 = r0 + r1
            r7.bottom = r0
            r6.x(r5, r1, r0)
            goto L_0x00fb
        L_0x00dc:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00e7
            boolean r2 = r6.b(r3)
            goto L_0x00fb
        L_0x00e7:
            boolean r2 = r6.j(r3)
            goto L_0x00fb
        L_0x00ec:
            boolean r7 = r7.isAltPressed()
            if (r7 != 0) goto L_0x00f7
            boolean r2 = r6.b(r5)
            goto L_0x00fb
        L_0x00f7:
            boolean r2 = r6.j(r5)
        L_0x00fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.g(android.view.KeyEvent):boolean");
    }

    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return ((float) bottom) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (((float) getHeight()) * 0.5f);
    }

    public int getNestedScrollAxes() {
        return this.f1116x.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return ((float) scrollY) / ((float) verticalFadingEdgeLength);
        }
        return 1.0f;
    }

    public void h(int i2) {
        if (getChildCount() > 0) {
            this.f1096d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            w(true);
        }
    }

    public boolean hasNestedScrollingParent() {
        return p(0);
    }

    public void i(View view, View view2, int i2, int i3) {
        l lVar = this.f1116x;
        if (i3 == 1) {
            lVar.f3058b = i2;
        } else {
            lVar.f3057a = i2;
        }
        A(2, i3);
    }

    public boolean isNestedScrollingEnabled() {
        return this.f1117y.f3055d;
    }

    public boolean j(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1095c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1095c.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f1095c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1095c;
        return x(i2, rect3.top, rect3.bottom);
    }

    public void k(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        s(i5, i6, iArr);
    }

    public void l(View view, int i2, int i3, int i4, int i5, int i6) {
        s(i5, i6, (int[]) null);
    }

    public void m(View view, int i2) {
        l lVar = this.f1116x;
        if (i2 == 1) {
            lVar.f3058b = 0;
        } else {
            lVar.f3057a = 0;
        }
        this.f1117y.j(i2);
    }

    public void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    public void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public void n(View view, int i2, int i3, int[] iArr, int i4) {
        e(i2, i3, iArr, (int[]) null, i4);
    }

    public boolean o(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1101i = false;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f1103k) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int verticalScrollFactorCompat = scrollY - ((int) (axisValue * getVerticalScrollFactorCompat()));
                if (verticalScrollFactorCompat < 0) {
                    scrollRange = 0;
                } else if (verticalScrollFactorCompat <= scrollRange) {
                    scrollRange = verticalScrollFactorCompat;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto L_0x000d
            boolean r3 = r11.f1103k
            if (r3 == 0) goto L_0x000d
            return r1
        L_0x000d:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto L_0x00af
            r4 = -1
            if (r0 == r1) goto L_0x0085
            if (r0 == r2) goto L_0x0024
            r1 = 3
            if (r0 == r1) goto L_0x0085
            r1 = 6
            if (r0 == r1) goto L_0x001f
            goto L_0x0131
        L_0x001f:
            r11.t(r12)
            goto L_0x0131
        L_0x0024:
            int r0 = r11.f1110r
            if (r0 != r4) goto L_0x002a
            goto L_0x0131
        L_0x002a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L_0x004d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Invalid pointerId="
            r12.append(r1)
            r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto L_0x0131
        L_0x004d:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.f1099g
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.f1107o
            if (r4 <= r5) goto L_0x0131
            int r4 = r11.getNestedScrollAxes()
            r2 = r2 & r4
            if (r2 != 0) goto L_0x0131
            r11.f1103k = r1
            r11.f1099g = r0
            android.view.VelocityTracker r0 = r11.f1104l
            if (r0 != 0) goto L_0x0073
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f1104l = r0
        L_0x0073:
            android.view.VelocityTracker r0 = r11.f1104l
            r0.addMovement(r12)
            r11.f1113u = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto L_0x0131
            r12.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0131
        L_0x0085:
            r11.f1103k = r3
            r11.f1110r = r4
            r11.v()
            android.widget.OverScroller r4 = r11.f1096d
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L_0x00a8
            java.util.WeakHashMap<android.view.View, g0.x> r12 = g0.u.f3063a
            g0.u.d.k(r11)
        L_0x00a8:
            g0.i r12 = r11.f1117y
            r12.j(r3)
            goto L_0x0131
        L_0x00af:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            int r5 = r11.getChildCount()
            if (r5 <= 0) goto L_0x00e3
            int r5 = r11.getScrollY()
            android.view.View r6 = r11.getChildAt(r3)
            int r7 = r6.getTop()
            int r7 = r7 - r5
            if (r0 < r7) goto L_0x00e3
            int r7 = r6.getBottom()
            int r7 = r7 - r5
            if (r0 >= r7) goto L_0x00e3
            int r5 = r6.getLeft()
            if (r4 < r5) goto L_0x00e3
            int r5 = r6.getRight()
            if (r4 >= r5) goto L_0x00e3
            r4 = 1
            goto L_0x00e4
        L_0x00e3:
            r4 = 0
        L_0x00e4:
            if (r4 != 0) goto L_0x00fc
            boolean r12 = r11.B(r12)
            if (r12 != 0) goto L_0x00f6
            android.widget.OverScroller r12 = r11.f1096d
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00f5:
            r1 = 0
        L_0x00f6:
            r11.f1103k = r1
            r11.v()
            goto L_0x0131
        L_0x00fc:
            r11.f1099g = r0
            int r0 = r12.getPointerId(r3)
            r11.f1110r = r0
            android.view.VelocityTracker r0 = r11.f1104l
            if (r0 != 0) goto L_0x010f
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r11.f1104l = r0
            goto L_0x0112
        L_0x010f:
            r0.clear()
        L_0x0112:
            android.view.VelocityTracker r0 = r11.f1104l
            r0.addMovement(r12)
            android.widget.OverScroller r0 = r11.f1096d
            r0.computeScrollOffset()
            boolean r12 = r11.B(r12)
            if (r12 != 0) goto L_0x012c
            android.widget.OverScroller r12 = r11.f1096d
            boolean r12 = r12.isFinished()
            if (r12 != 0) goto L_0x012b
            goto L_0x012c
        L_0x012b:
            r1 = 0
        L_0x012c:
            r11.f1103k = r1
            r11.A(r2, r3)
        L_0x0131:
            boolean r12 = r11.f1103k
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.f1100h = false;
        View view = this.f1102j;
        if (view != null && q(view, this)) {
            y(this.f1102j);
        }
        this.f1102j = null;
        if (!this.f1101i) {
            if (this.f1115w != null) {
                scrollTo(getScrollX(), this.f1115w.f1119b);
                this.f1115w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i6 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int c2 = c(scrollY, paddingTop, i6);
            if (c2 != scrollY) {
                scrollTo(getScrollX(), c2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1101i = true;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1105m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        h((int) f3);
        return true;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        e(i2, i3, iArr, (int[]) null, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        s(i5, 0, (int[]) null);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f1116x.f3057a = i2;
        A(2, 0);
    }

    public void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        FocusFinder instance = FocusFinder.getInstance();
        View findNextFocus = rect == null ? instance.findNextFocus(this, (View) null, i2) : instance.findNextFocusFromRect(this, rect, i2);
        if (findNextFocus != null && !(true ^ r(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.f1115w = cVar;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f1119b = getScrollY();
        return cVar;
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        b bVar = this.A;
        if (bVar != null) {
            d.b bVar2 = (d.b) bVar;
            AlertController.c(this, bVar2.f2690a, bVar2.f2691b);
        }
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && r(findFocus, 0, i5)) {
            findFocus.getDrawingRect(this.f1095c);
            offsetDescendantRectToMyCoords(findFocus, this.f1095c);
            f(d(this.f1095c));
        }
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return (i2 & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f1116x.f3057a = 0;
        this.f1117y.j(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x029e, code lost:
        if (r9.f1096d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r9.f1096d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L_0x02a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0234  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r31) {
        /*
            r30 = this;
            r9 = r30
            r10 = r31
            android.view.VelocityTracker r0 = r9.f1104l
            if (r0 != 0) goto L_0x000e
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.f1104l = r0
        L_0x000e:
            int r0 = r31.getActionMasked()
            r11 = 0
            if (r0 != 0) goto L_0x0017
            r9.f1113u = r11
        L_0x0017:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r31)
            int r1 = r9.f1113u
            float r1 = (float) r1
            r2 = 0
            r12.offsetLocation(r2, r1)
            r1 = 2
            r13 = 1
            if (r0 == 0) goto L_0x02bc
            r3 = -1
            if (r0 == r13) goto L_0x023b
            if (r0 == r1) goto L_0x0081
            r1 = 3
            if (r0 == r1) goto L_0x005b
            r1 = 5
            if (r0 == r1) goto L_0x0048
            r1 = 6
            if (r0 == r1) goto L_0x0036
            goto L_0x02eb
        L_0x0036:
            r30.t(r31)
            int r0 = r9.f1110r
            int r0 = r10.findPointerIndex(r0)
            float r0 = r10.getY(r0)
            int r0 = (int) r0
            r9.f1099g = r0
            goto L_0x02eb
        L_0x0048:
            int r0 = r31.getActionIndex()
            float r1 = r10.getY(r0)
            int r1 = (int) r1
            r9.f1099g = r1
            int r0 = r10.getPointerId(r0)
            r9.f1110r = r0
            goto L_0x02eb
        L_0x005b:
            boolean r0 = r9.f1103k
            if (r0 == 0) goto L_0x02a5
            int r0 = r30.getChildCount()
            if (r0 <= 0) goto L_0x02a5
            android.widget.OverScroller r14 = r9.f1096d
            int r15 = r30.getScrollX()
            int r16 = r30.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r30.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x02a5
            goto L_0x02a0
        L_0x0081:
            int r0 = r9.f1110r
            int r14 = r10.findPointerIndex(r0)
            if (r14 != r3) goto L_0x00a4
            java.lang.String r0 = "Invalid pointerId="
            java.lang.StringBuilder r0 = androidx.activity.result.a.a(r0)
            int r1 = r9.f1110r
            r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L_0x02eb
        L_0x00a4:
            float r0 = r10.getY(r14)
            int r6 = (int) r0
            int r0 = r9.f1099g
            int r0 = r0 - r6
            float r1 = r10.getX(r14)
            int r3 = r30.getWidth()
            float r3 = (float) r3
            float r1 = r1 / r3
            float r3 = (float) r0
            int r4 = r30.getHeight()
            float r4 = (float) r4
            float r3 = r3 / r4
            android.widget.EdgeEffect r4 = r9.f1097e
            float r4 = j0.d.a(r4)
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00e0
            android.widget.EdgeEffect r4 = r9.f1097e
            float r3 = -r3
            float r1 = j0.d.b(r4, r3, r1)
            float r1 = -r1
            android.widget.EdgeEffect r3 = r9.f1097e
            float r3 = j0.d.a(r3)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00de
            android.widget.EdgeEffect r2 = r9.f1097e
            goto L_0x00fd
        L_0x00de:
            r2 = r1
            goto L_0x0101
        L_0x00e0:
            android.widget.EdgeEffect r4 = r9.f1098f
            float r4 = j0.d.a(r4)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0101
            android.widget.EdgeEffect r4 = r9.f1098f
            float r5 = r5 - r1
            float r1 = j0.d.b(r4, r3, r5)
            android.widget.EdgeEffect r3 = r9.f1098f
            float r3 = j0.d.a(r3)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x00de
            android.widget.EdgeEffect r2 = r9.f1098f
        L_0x00fd:
            r2.onRelease()
            goto L_0x00de
        L_0x0101:
            int r1 = r30.getHeight()
            float r1 = (float) r1
            float r2 = r2 * r1
            int r1 = java.lang.Math.round(r2)
            if (r1 == 0) goto L_0x0111
            r30.invalidate()
        L_0x0111:
            int r0 = r0 - r1
            boolean r1 = r9.f1103k
            if (r1 != 0) goto L_0x0130
            int r1 = java.lang.Math.abs(r0)
            int r2 = r9.f1107o
            if (r1 <= r2) goto L_0x0130
            android.view.ViewParent r1 = r30.getParent()
            if (r1 == 0) goto L_0x0127
            r1.requestDisallowInterceptTouchEvent(r13)
        L_0x0127:
            r9.f1103k = r13
            int r1 = r9.f1107o
            if (r0 <= 0) goto L_0x012f
            int r0 = r0 - r1
            goto L_0x0130
        L_0x012f:
            int r0 = r0 + r1
        L_0x0130:
            r7 = r0
            boolean r0 = r9.f1103k
            if (r0 == 0) goto L_0x02eb
            r1 = 0
            int[] r3 = r9.f1112t
            int[] r4 = r9.f1111s
            r5 = 0
            r0 = r30
            r2 = r7
            boolean r0 = r0.e(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0152
            int[] r0 = r9.f1112t
            r0 = r0[r13]
            int r7 = r7 - r0
            int r0 = r9.f1113u
            int[] r1 = r9.f1111s
            r1 = r1[r13]
            int r0 = r0 + r1
            r9.f1113u = r0
        L_0x0152:
            r15 = r7
            int[] r0 = r9.f1111s
            r0 = r0[r13]
            int r6 = r6 - r0
            r9.f1099g = r6
            int r16 = r30.getScrollY()
            int r8 = r30.getScrollRange()
            int r0 = r30.getOverScrollMode()
            if (r0 == 0) goto L_0x0171
            if (r0 != r13) goto L_0x016d
            if (r8 <= 0) goto L_0x016d
            goto L_0x0171
        L_0x016d:
            r0 = 0
            r17 = 0
            goto L_0x0174
        L_0x0171:
            r0 = 1
            r17 = 1
        L_0x0174:
            r1 = 0
            r3 = 0
            int r4 = r30.getScrollY()
            r5 = 0
            r7 = 0
            r18 = 0
            r0 = r30
            r2 = r15
            r6 = r8
            r21 = r8
            r8 = r18
            boolean r0 = r0.u(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x0194
            boolean r0 = r9.p(r11)
            if (r0 != 0) goto L_0x0194
            r0 = 1
            goto L_0x0195
        L_0x0194:
            r0 = 0
        L_0x0195:
            int r1 = r30.getScrollY()
            int r24 = r1 - r16
            int r26 = r15 - r24
            int[] r1 = r9.f1112t
            r1[r13] = r11
            r23 = 0
            r25 = 0
            int[] r2 = r9.f1111s
            r28 = 0
            g0.i r3 = r9.f1117y
            r22 = r3
            r27 = r2
            r29 = r1
            r22.f(r23, r24, r25, r26, r27, r28, r29)
            int r1 = r9.f1099g
            int[] r2 = r9.f1111s
            r3 = r2[r13]
            int r1 = r1 - r3
            r9.f1099g = r1
            int r1 = r9.f1113u
            r2 = r2[r13]
            int r1 = r1 + r2
            r9.f1113u = r1
            if (r17 == 0) goto L_0x0231
            int[] r1 = r9.f1112t
            r1 = r1[r13]
            int r15 = r15 - r1
            int r1 = r16 + r15
            if (r1 >= 0) goto L_0x01f1
            android.widget.EdgeEffect r1 = r9.f1097e
            int r2 = -r15
            float r2 = (float) r2
            int r3 = r30.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r3 = r10.getX(r14)
            int r4 = r30.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            j0.d.b(r1, r2, r3)
            android.widget.EdgeEffect r1 = r9.f1098f
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x021b
            android.widget.EdgeEffect r1 = r9.f1098f
            goto L_0x0218
        L_0x01f1:
            r2 = r21
            if (r1 <= r2) goto L_0x021b
            android.widget.EdgeEffect r1 = r9.f1098f
            float r2 = (float) r15
            int r3 = r30.getHeight()
            float r3 = (float) r3
            float r2 = r2 / r3
            float r3 = r10.getX(r14)
            int r4 = r30.getWidth()
            float r4 = (float) r4
            float r3 = r3 / r4
            r4 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r3
            j0.d.b(r1, r2, r4)
            android.widget.EdgeEffect r1 = r9.f1097e
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x021b
            android.widget.EdgeEffect r1 = r9.f1097e
        L_0x0218:
            r1.onRelease()
        L_0x021b:
            android.widget.EdgeEffect r1 = r9.f1097e
            boolean r1 = r1.isFinished()
            if (r1 == 0) goto L_0x022b
            android.widget.EdgeEffect r1 = r9.f1098f
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L_0x0231
        L_0x022b:
            java.util.WeakHashMap<android.view.View, g0.x> r0 = g0.u.f3063a
            g0.u.d.k(r30)
            goto L_0x0232
        L_0x0231:
            r11 = r0
        L_0x0232:
            if (r11 == 0) goto L_0x02eb
            android.view.VelocityTracker r0 = r9.f1104l
            r0.clear()
            goto L_0x02eb
        L_0x023b:
            android.view.VelocityTracker r0 = r9.f1104l
            r1 = 1000(0x3e8, float:1.401E-42)
            int r4 = r9.f1109q
            float r4 = (float) r4
            r0.computeCurrentVelocity(r1, r4)
            int r1 = r9.f1110r
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r9.f1108p
            if (r1 < r4) goto L_0x0286
            android.widget.EdgeEffect r1 = r9.f1097e
            float r1 = j0.d.a(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0262
            android.widget.EdgeEffect r1 = r9.f1097e
            r4 = r0
            goto L_0x026f
        L_0x0262:
            android.widget.EdgeEffect r1 = r9.f1098f
            float r1 = j0.d.a(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0274
            android.widget.EdgeEffect r1 = r9.f1098f
            int r4 = -r0
        L_0x026f:
            r1.onAbsorb(r4)
            r1 = 1
            goto L_0x0275
        L_0x0274:
            r1 = 0
        L_0x0275:
            if (r1 != 0) goto L_0x02a5
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r9.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L_0x02a5
            r9.dispatchNestedFling(r2, r1, r13)
            r9.h(r0)
            goto L_0x02a5
        L_0x0286:
            android.widget.OverScroller r14 = r9.f1096d
            int r15 = r30.getScrollX()
            int r16 = r30.getScrollY()
            r17 = 0
            r18 = 0
            r19 = 0
            int r20 = r30.getScrollRange()
            boolean r0 = r14.springBack(r15, r16, r17, r18, r19, r20)
            if (r0 == 0) goto L_0x02a5
        L_0x02a0:
            java.util.WeakHashMap<android.view.View, g0.x> r0 = g0.u.f3063a
            g0.u.d.k(r30)
        L_0x02a5:
            r9.f1110r = r3
            r9.f1103k = r11
            r30.v()
            g0.i r0 = r9.f1117y
            r0.j(r11)
            android.widget.EdgeEffect r0 = r9.f1097e
            r0.onRelease()
            android.widget.EdgeEffect r0 = r9.f1098f
            r0.onRelease()
            goto L_0x02eb
        L_0x02bc:
            int r0 = r30.getChildCount()
            if (r0 != 0) goto L_0x02c3
            return r11
        L_0x02c3:
            boolean r0 = r9.f1103k
            if (r0 == 0) goto L_0x02d0
            android.view.ViewParent r0 = r30.getParent()
            if (r0 == 0) goto L_0x02d0
            r0.requestDisallowInterceptTouchEvent(r13)
        L_0x02d0:
            android.widget.OverScroller r0 = r9.f1096d
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x02db
            r30.a()
        L_0x02db:
            float r0 = r31.getY()
            int r0 = (int) r0
            r9.f1099g = r0
            int r0 = r10.getPointerId(r11)
            r9.f1110r = r0
            r9.A(r1, r11)
        L_0x02eb:
            android.view.VelocityTracker r0 = r9.f1104l
            if (r0 == 0) goto L_0x02f2
            r0.addMovement(r12)
        L_0x02f2:
            r12.recycle()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(int i2) {
        return this.f1117y.g(i2) != null;
    }

    public final boolean r(View view, int i2, int i3) {
        view.getDrawingRect(this.f1095c);
        offsetDescendantRectToMyCoords(view, this.f1095c);
        return this.f1095c.bottom + i2 >= getScrollY() && this.f1095c.top - i2 <= getScrollY() + i3;
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.f1100h) {
            y(view2);
        } else {
            this.f1102j = view2;
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int d2 = d(rect);
        boolean z3 = d2 != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, d2);
            } else {
                z(0, d2, 250, false);
            }
        }
        return z3;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            v();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        this.f1100h = true;
        super.requestLayout();
    }

    public final void s(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1117y.d(0, scrollY2, 0, i2 - scrollY2, (int[]) null, i3, iArr);
    }

    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int c2 = c(i2, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int c3 = c(i3, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (c2 != getScrollX() || c3 != getScrollY()) {
                super.scrollTo(c2, c3);
            }
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1105m) {
            this.f1105m = z2;
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        i iVar = this.f1117y;
        if (iVar.f3055d) {
            View view = iVar.f3054c;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.i.z(view);
        }
        iVar.f3055d = z2;
    }

    public void setOnScrollChangeListener(b bVar) {
        this.A = bVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1106n = z2;
    }

    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public boolean startNestedScroll(int i2) {
        return this.f1117y.i(i2, 0);
    }

    public void stopNestedScroll() {
        this.f1117y.j(0);
    }

    public final void t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1110r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1099g = (int) motionEvent.getY(i2);
            this.f1110r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1104l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0083 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean u(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20) {
        /*
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L_0x0013
            r2 = 1
            goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = 0
        L_0x0021:
            if (r1 == 0) goto L_0x002a
            if (r1 != r5) goto L_0x0028
            if (r2 == 0) goto L_0x0028
            goto L_0x002a
        L_0x0028:
            r2 = 0
            goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x0034
            if (r1 != r5) goto L_0x0032
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r1 = 0
            goto L_0x0035
        L_0x0034:
            r1 = 1
        L_0x0035:
            int r3 = r15 + r13
            if (r2 != 0) goto L_0x003b
            r2 = 0
            goto L_0x003d
        L_0x003b:
            r2 = r19
        L_0x003d:
            int r6 = r16 + r14
            if (r1 != 0) goto L_0x0043
            r1 = 0
            goto L_0x0045
        L_0x0043:
            r1 = r20
        L_0x0045:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L_0x0050
            r3 = r2
        L_0x004e:
            r2 = 1
            goto L_0x0055
        L_0x0050:
            if (r3 >= r7) goto L_0x0054
            r3 = r7
            goto L_0x004e
        L_0x0054:
            r2 = 0
        L_0x0055:
            if (r6 <= r1) goto L_0x005a
            r6 = r1
        L_0x0058:
            r1 = 1
            goto L_0x005f
        L_0x005a:
            if (r6 >= r8) goto L_0x005e
            r6 = r8
            goto L_0x0058
        L_0x005e:
            r1 = 0
        L_0x005f:
            if (r1 == 0) goto L_0x007e
            boolean r7 = r12.p(r5)
            if (r7 != 0) goto L_0x007e
            android.widget.OverScroller r7 = r0.f1096d
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L_0x007e:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L_0x0085
            if (r1 == 0) goto L_0x0086
        L_0x0085:
            r4 = 1
        L_0x0086:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.u(int, int, int, int, int, int, int, int):boolean");
    }

    public final void v() {
        VelocityTracker velocityTracker = this.f1104l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f1104l = null;
        }
    }

    public final void w(boolean z2) {
        if (z2) {
            A(2, 1);
        } else {
            this.f1117y.j(1);
        }
        this.f1114v = getScrollY();
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.d.k(this);
    }

    public final boolean x(int i2, int i3, int i4) {
        boolean z2;
        int i5 = i2;
        int i6 = i3;
        int i7 = i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        boolean z3 = i5 == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = (View) focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i6 < bottom && top < i7) {
                boolean z5 = i6 < top && bottom < i7;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else if (!z6) {
                    }
                    view = view2;
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i6 < scrollY || i7 > i8) {
            f(z3 ? i6 - scrollY : i7 - i8);
            z2 = true;
        } else {
            z2 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i5);
        }
        return z2;
    }

    public final void y(View view) {
        view.getDrawingRect(this.f1095c);
        offsetDescendantRectToMyCoords(view, this.f1095c);
        int d2 = d(this.f1095c);
        if (d2 != 0) {
            scrollBy(0, d2);
        }
    }

    public final void z(int i2, int i3, int i4, boolean z2) {
        if (getChildCount() != 0) {
            if (AnimationUtils.currentAnimationTimeMillis() - this.f1094b > 250) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int scrollY = getScrollY();
                OverScroller overScroller = this.f1096d;
                int scrollX = getScrollX();
                overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, i4);
                w(z2);
            } else {
                if (!this.f1096d.isFinished()) {
                    a();
                }
                scrollBy(i2, i3);
            }
            this.f1094b = AnimationUtils.currentAnimationTimeMillis();
        }
    }
}
