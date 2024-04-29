package g0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import com.example.supermarket.R;
import g0.a;
import g0.b0;
import g0.c;
import h0.d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public class u {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, x> f3063a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f3064b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f3065c = false;

    /* renamed from: d  reason: collision with root package name */
    public static ThreadLocal<Rect> f3066d;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f3067e = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: f  reason: collision with root package name */
    public static final o f3068f = q.f3062b;

    /* renamed from: g  reason: collision with root package name */
    public static final a f3069g = new a();

    public static class a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f3070b = new WeakHashMap<>();

        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry next : this.f3070b.entrySet()) {
                    View view = (View) next.getKey();
                    boolean booleanValue = ((Boolean) next.getValue()).booleanValue();
                    boolean z2 = view.getVisibility() == 0;
                    if (booleanValue != z2) {
                        u.m(view, z2 ? 16 : 32);
                        this.f3070b.put(view, Boolean.valueOf(z2));
                    }
                }
            }
        }

        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static abstract class b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f3071a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f3072b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3073c;

        /* renamed from: d  reason: collision with root package name */
        public final int f3074d;

        public b(int i2, Class<T> cls, int i3) {
            this.f3071a = i2;
            this.f3072b = cls;
            this.f3074d = 0;
            this.f3073c = i3;
        }

        public b(int i2, Class<T> cls, int i3, int i4) {
            this.f3071a = i2;
            this.f3072b = cls;
            this.f3074d = i3;
            this.f3073c = i4;
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public abstract T b(View view);

        public abstract void c(View view, T t2);

        public T d(View view) {
            if (Build.VERSION.SDK_INT >= this.f3073c) {
                return b(view);
            }
            T tag = view.getTag(this.f3071a);
            if (this.f3072b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void e(View view, T t2) {
            if (Build.VERSION.SDK_INT >= this.f3073c) {
                c(view, t2);
            } else if (f(d(view), t2)) {
                a g2 = u.g(view);
                if (g2 == null) {
                    g2 = new a();
                }
                u.u(view, g2);
                view.setTag(this.f3071a, t2);
                u.m(view, this.f3074d);
            }
        }

        public abstract boolean f(T t2, T t3);
    }

    public static class c {
        public static boolean a(View view) {
            return view.hasOnClickListeners();
        }
    }

    public static class d {
        public static AccessibilityNodeProvider a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        public static boolean b(View view) {
            return view.getFitsSystemWindows();
        }

        public static int c(View view) {
            return view.getImportantForAccessibility();
        }

        public static int d(View view) {
            return view.getMinimumHeight();
        }

        public static int e(View view) {
            return view.getMinimumWidth();
        }

        public static ViewParent f(View view) {
            return view.getParentForAccessibility();
        }

        public static int g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        public static boolean h(View view) {
            return view.hasOverlappingRendering();
        }

        public static boolean i(View view) {
            return view.hasTransientState();
        }

        public static boolean j(View view, int i2, Bundle bundle) {
            return view.performAccessibilityAction(i2, bundle);
        }

        public static void k(View view) {
            view.postInvalidateOnAnimation();
        }

        public static void l(View view, int i2, int i3, int i4, int i5) {
            view.postInvalidateOnAnimation(i2, i3, i4, i5);
        }

        public static void m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        public static void n(View view, Runnable runnable, long j2) {
            view.postOnAnimationDelayed(runnable, j2);
        }

        public static void o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        public static void p(View view) {
            view.requestFitSystemWindows();
        }

        public static void q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        public static void r(View view, boolean z2) {
            view.setHasTransientState(z2);
        }

        public static void s(View view, int i2) {
            view.setImportantForAccessibility(i2);
        }
    }

    public static class e {
        public static int a() {
            return View.generateViewId();
        }

        public static Display b(View view) {
            return view.getDisplay();
        }

        public static int c(View view) {
            return view.getLabelFor();
        }

        public static int d(View view) {
            return view.getLayoutDirection();
        }

        public static int e(View view) {
            return view.getPaddingEnd();
        }

        public static int f(View view) {
            return view.getPaddingStart();
        }

        public static boolean g(View view) {
            return view.isPaddingRelative();
        }

        public static void h(View view, int i2) {
            view.setLabelFor(i2);
        }

        public static void i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        public static void j(View view, int i2) {
            view.setLayoutDirection(i2);
        }

        public static void k(View view, int i2, int i3, int i4, int i5) {
            view.setPaddingRelative(i2, i3, i4, i5);
        }
    }

    public static class f {
        public static Rect a(View view) {
            return view.getClipBounds();
        }

        public static boolean b(View view) {
            return view.isInLayout();
        }

        public static void c(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    public static class g {
        public static int a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        public static boolean b(View view) {
            return view.isAttachedToWindow();
        }

        public static boolean c(View view) {
            return view.isLaidOut();
        }

        public static boolean d(View view) {
            return view.isLayoutDirectionResolved();
        }

        public static void e(ViewParent viewParent, View view, View view2, int i2) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i2);
        }

        public static void f(View view, int i2) {
            view.setAccessibilityLiveRegion(i2);
        }

        public static void g(AccessibilityEvent accessibilityEvent, int i2) {
            accessibilityEvent.setContentChangeTypes(i2);
        }
    }

    public static class h {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    public static class i {

        public class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a  reason: collision with root package name */
            public b0 f3075a = null;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f3076b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ m f3077c;

            public a(View view, m mVar) {
                this.f3076b = view;
                this.f3077c = mVar;
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                b0 j2 = b0.j(windowInsets, view);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    i.a(windowInsets, this.f3076b);
                    if (j2.equals(this.f3075a)) {
                        return this.f3077c.a(view, j2).h();
                    }
                }
                this.f3075a = j2;
                b0 a2 = this.f3077c.a(view, j2);
                if (i2 >= 30) {
                    return a2.h();
                }
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                h.c(view);
                return a2.h();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static b0 b(View view, b0 b0Var, Rect rect) {
            WindowInsets h2 = b0Var.h();
            if (h2 != null) {
                return b0.j(view.computeSystemWindowInsets(h2, rect), view);
            }
            rect.setEmpty();
            return b0Var;
        }

        public static boolean c(View view, float f2, float f3, boolean z2) {
            return view.dispatchNestedFling(f2, f3, z2);
        }

        public static boolean d(View view, float f2, float f3) {
            return view.dispatchNestedPreFling(f2, f3);
        }

        public static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
        }

        public static boolean f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
            return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static b0 j(View view) {
            if (!b0.a.f3003d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = b0.a.f3000a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) b0.a.f3001b.get(obj);
                Rect rect2 = (Rect) b0.a.f3002c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                int i2 = Build.VERSION.SDK_INT;
                b0.e dVar = i2 >= 30 ? new b0.d() : i2 >= 29 ? new b0.c() : new b0.b();
                dVar.c(z.b.b(rect.left, rect.top, rect.right, rect.bottom));
                dVar.d(z.b.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                b0 b2 = dVar.b();
                b2.f2999a.p(b2);
                b2.f2999a.d(view.getRootView());
                return b2;
            } catch (IllegalAccessException e2) {
                StringBuilder a2 = androidx.activity.result.a.a("Failed to get insets from AttachInfo. ");
                a2.append(e2.getMessage());
                Log.w("WindowInsetsCompat", a2.toString(), e2);
                return null;
            }
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f2) {
            view.setElevation(f2);
        }

        public static void t(View view, boolean z2) {
            view.setNestedScrollingEnabled(z2);
        }

        public static void u(View view, m mVar) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, mVar);
            }
            if (mVar == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, mVar));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f2) {
            view.setTranslationZ(f2);
        }

        public static void x(View view, float f2) {
            view.setZ(f2);
        }

        public static boolean y(View view, int i2) {
            return view.startNestedScroll(i2);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    public static class j {
        public static b0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            b0 j2 = b0.j(rootWindowInsets, (View) null);
            j2.f2999a.p(j2);
            j2.f2999a.d(view.getRootView());
            return j2;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i2) {
            view.setScrollIndicators(i2);
        }

        public static void d(View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static class k {
        public static void a(View view, Collection<View> collection, int i2) {
            view.addKeyboardNavigationClusters(collection, i2);
        }

        public static int b(View view) {
            return view.getImportantForAutofill();
        }

        public static int c(View view) {
            return view.getNextClusterForwardId();
        }

        public static boolean d(View view) {
            return view.hasExplicitFocusable();
        }

        public static boolean e(View view) {
            return view.isFocusedByDefault();
        }

        public static boolean f(View view) {
            return view.isImportantForAutofill();
        }

        public static boolean g(View view) {
            return view.isKeyboardNavigationCluster();
        }

        public static View h(View view, View view2, int i2) {
            return view.keyboardNavigationClusterSearch(view2, i2);
        }

        public static boolean i(View view) {
            return view.restoreDefaultFocus();
        }

        public static void j(View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        public static void k(View view, boolean z2) {
            view.setFocusedByDefault(z2);
        }

        public static void l(View view, int i2) {
            view.setImportantForAutofill(i2);
        }

        public static void m(View view, boolean z2) {
            view.setKeyboardNavigationCluster(z2);
        }

        public static void n(View view, int i2) {
            view.setNextClusterForwardId(i2);
        }

        public static void o(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static class l {
        public static void a(View view, q qVar) {
            m.h hVar = (m.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar == null) {
                hVar = new m.h();
                view.setTag(R.id.tag_unhandled_key_listeners, hVar);
            }
            Objects.requireNonNull(qVar);
            v vVar = new v(qVar);
            hVar.put(qVar, vVar);
            view.addOnUnhandledKeyEventListener(vVar);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, q qVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            m.h hVar = (m.h) view.getTag(R.id.tag_unhandled_key_listeners);
            if (hVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) hVar.getOrDefault(qVar, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        public static <T> T f(View view, int i2) {
            return view.requireViewById(i2);
        }

        public static void g(View view, boolean z2) {
            view.setAccessibilityHeading(z2);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, boolean z2) {
            view.setScreenReaderFocusable(z2);
        }
    }

    public static class m {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static List<Rect> b(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }

        public static void d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    public static class n {
        public static CharSequence a(View view) {
            return view.getStateDescription();
        }

        public static void b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    public static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static c b(View view, c cVar) {
            ContentInfo d2 = cVar.f3029a.d();
            ContentInfo performReceiveContent = view.performReceiveContent(d2);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == d2) {
                return cVar;
            }
            return new c(new c.d(performReceiveContent));
        }

        public static void c(View view, String[] strArr, n nVar) {
            if (nVar == null) {
                view.setOnReceiveContentListener(strArr, (OnReceiveContentListener) null);
            } else {
                view.setOnReceiveContentListener(strArr, new p(nVar));
            }
        }
    }

    public static final class p implements OnReceiveContentListener {

        /* renamed from: a  reason: collision with root package name */
        public final n f3078a;

        public p(n nVar) {
            this.f3078a = nVar;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            c cVar = new c(new c.d(contentInfo));
            c a2 = this.f3078a.a(view, cVar);
            if (a2 == null) {
                return null;
            }
            if (a2 == cVar) {
                return contentInfo;
            }
            return a2.f3029a.d();
        }
    }

    public interface q {
        boolean onUnhandledKeyEvent(View view, KeyEvent keyEvent);
    }

    public static class r {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f3079d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f3080a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f3081b = null;

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<KeyEvent> f3082c = null;

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f3080a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((q) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }
    }

    static {
        new AtomicInteger(1);
    }

    public static void a(View view, d.a aVar) {
        a g2 = g(view);
        if (g2 == null) {
            g2 = new a();
        }
        u(view, g2);
        r(aVar.a(), view);
        j(view).add(aVar);
        m(view, 0);
    }

    public static x b(View view) {
        if (f3063a == null) {
            f3063a = new WeakHashMap<>();
        }
        x xVar = f3063a.get(view);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(view);
        f3063a.put(view, xVar2);
        return xVar2;
    }

    public static void c(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                x((View) parent);
            }
        }
    }

    public static void d(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                x((View) parent);
            }
        }
    }

    public static b0 e(View view, b0 b0Var) {
        WindowInsets h2 = b0Var.h();
        if (h2 != null) {
            WindowInsets a2 = h.a(view, h2);
            if (!a2.equals(h2)) {
                return b0.j(a2, view);
            }
        }
        return b0Var;
    }

    public static boolean f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = r.f3079d;
        r rVar = (r) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (rVar == null) {
            rVar = new r();
            view.setTag(R.id.tag_unhandled_key_event_manager, rVar);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = rVar.f3080a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = r.f3079d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (rVar.f3080a == null) {
                        rVar.f3080a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = r.f3079d;
                        View view2 = (View) arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            rVar.f3080a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                rVar.f3080a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = rVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (rVar.f3081b == null) {
                    rVar.f3081b = new SparseArray<>();
                }
                rVar.f3081b.put(keyCode, new WeakReference(a2));
            }
        }
        if (a2 != null) {
            return true;
        }
        return false;
    }

    public static a g(View view) {
        View.AccessibilityDelegate h2 = h(view);
        if (h2 == null) {
            return null;
        }
        return h2 instanceof a.C0031a ? ((a.C0031a) h2).f2996a : new a(h2);
    }

    public static View.AccessibilityDelegate h(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return m.a(view);
        }
        if (f3065c) {
            return null;
        }
        if (f3064b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3064b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3065c = true;
                return null;
            }
        }
        Object obj = f3064b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static CharSequence i(View view) {
        Object obj;
        Class<CharSequence> cls = CharSequence.class;
        if (Build.VERSION.SDK_INT >= 28) {
            obj = l.b(view);
        } else {
            obj = view.getTag(R.id.tag_accessibility_pane_title);
            if (!cls.isInstance(obj)) {
                obj = null;
            }
        }
        return (CharSequence) obj;
    }

    public static List<d.a> j(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static Rect k() {
        if (f3066d == null) {
            f3066d = new ThreadLocal<>();
        }
        Rect rect = f3066d.get();
        if (rect == null) {
            rect = new Rect();
            f3066d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] l(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void m(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = i(view) != null && view.getVisibility() == 0;
            int i3 = 32;
            if (g.a(view) != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z2) {
                    i3 = 2048;
                }
                obtain.setEventType(i3);
                g.g(obtain, i2);
                if (z2) {
                    obtain.getText().add(i(view));
                    if (d.c(view) == 0) {
                        d.s(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (d.c((View) parent) == 4) {
                            d.s(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i2 == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                g.g(obtain2, i2);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(i(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    g.e(view.getParent(), view, view, i2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void n(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        Rect k2 = k();
        boolean z2 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            k2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !k2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        c(view, i2);
        if (z2 && k2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(k2);
        }
    }

    public static void o(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        Rect k2 = k();
        boolean z2 = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            k2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z2 = !k2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        d(view, i2);
        if (z2 && k2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(k2);
        }
    }

    public static b0 p(View view, b0 b0Var) {
        WindowInsets h2 = b0Var.h();
        if (h2 != null) {
            WindowInsets b2 = h.b(view, h2);
            if (!b2.equals(h2)) {
                return b0.j(b2, view);
            }
        }
        return b0Var;
    }

    public static c q(View view, c cVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + cVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, cVar);
        }
        n nVar = (n) view.getTag(R.id.tag_on_receive_content_listener);
        if (nVar != null) {
            c a2 = nVar.a(view, cVar);
            if (a2 == null) {
                return null;
            }
            return (view instanceof o ? (o) view : f3068f).a(a2);
        }
        return (view instanceof o ? (o) view : f3068f).a(cVar);
    }

    public static void r(int i2, View view) {
        List<d.a> j2 = j(view);
        for (int i3 = 0; i3 < j2.size(); i3++) {
            if (j2.get(i3).a() == i2) {
                j2.remove(i3);
                return;
            }
        }
    }

    public static void s(View view, d.a aVar, CharSequence charSequence, h0.f fVar) {
        a(view, new d.a((Object) null, aVar.f3172b, (CharSequence) null, fVar, aVar.f3173c));
    }

    public static void t(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.c(view, context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static void u(View view, a aVar) {
        if (aVar == null && (h(view) instanceof a.C0031a)) {
            aVar = new a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f2995b);
    }

    public static void v(View view, CharSequence charSequence) {
        new s(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).e(view, charSequence);
        if (charSequence != null) {
            a aVar = f3069g;
            aVar.f3070b.put(view, Boolean.valueOf(view.getVisibility() == 0));
            view.addOnAttachStateChangeListener(aVar);
            if (g.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
                return;
            }
            return;
        }
        a aVar2 = f3069g;
        aVar2.f3070b.remove(view);
        view.removeOnAttachStateChangeListener(aVar2);
        d.o(view.getViewTreeObserver(), aVar2);
    }

    public static void w(View view, ColorStateList colorStateList) {
        int i2 = Build.VERSION.SDK_INT;
        i.q(view, colorStateList);
        if (i2 == 21) {
            Drawable background = view.getBackground();
            boolean z2 = (i.g(view) == null && i.h(view) == null) ? false : true;
            if (background != null && z2) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                d.q(view, background);
            }
        }
    }

    public static void x(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
