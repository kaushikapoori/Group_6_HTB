package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.example.supermarket.R;
import com.google.android.material.textfield.TextInputLayout;
import g0.u;
import g0.x;
import java.util.Objects;
import java.util.WeakHashMap;
import o1.m;
import u1.g;
import u1.j;
import w1.i;
import w1.k;

public class b extends k {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f2588e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final View.OnFocusChangeListener f2589f = new C0023b();

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.e f2590g = new c(this.f4254a);

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.f f2591h = new d();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i  reason: collision with root package name */
    public final TextInputLayout.g f2592i = new e();

    /* renamed from: j  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f2593j = new f();

    /* renamed from: k  reason: collision with root package name */
    public final h0.b f2594k = new g();

    /* renamed from: l  reason: collision with root package name */
    public boolean f2595l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2596m = false;

    /* renamed from: n  reason: collision with root package name */
    public long f2597n = Long.MAX_VALUE;

    /* renamed from: o  reason: collision with root package name */
    public StateListDrawable f2598o;

    /* renamed from: p  reason: collision with root package name */
    public u1.g f2599p;

    /* renamed from: q  reason: collision with root package name */
    public AccessibilityManager f2600q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f2601r;

    /* renamed from: s  reason: collision with root package name */
    public ValueAnimator f2602s;

    public class a extends m {

        /* renamed from: com.google.android.material.textfield.b$a$a  reason: collision with other inner class name */
        public class C0022a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f2604b;

            public C0022a(AutoCompleteTextView autoCompleteTextView) {
                this.f2604b = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f2604b.isPopupShowing();
                b.f(b.this, isPopupShowing);
                b.this.f2595l = isPopupShowing;
            }
        }

        public a() {
        }

        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView d2 = b.d(b.this.f4254a.getEditText());
            if (b.this.f2600q.isTouchExplorationEnabled() && b.e(d2) && !b.this.f4256c.hasFocus()) {
                d2.dismissDropDown();
            }
            d2.post(new C0022a(d2));
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b  reason: collision with other inner class name */
    public class C0023b implements View.OnFocusChangeListener {
        public C0023b() {
        }

        public void onFocusChange(View view, boolean z2) {
            b.this.f4254a.setEndIconActivated(z2);
            if (!z2) {
                b.f(b.this, false);
                b.this.f2595l = false;
            }
        }
    }

    public class c extends TextInputLayout.e {
        public c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public void d(View view, h0.d dVar) {
            boolean z2;
            super.d(view, dVar);
            if (!b.e(b.this.f4254a.getEditText())) {
                dVar.f3160a.setClassName(Spinner.class.getName());
            }
            if (Build.VERSION.SDK_INT >= 26) {
                z2 = dVar.f3160a.isShowingHintText();
            } else {
                Bundle f2 = dVar.f();
                z2 = f2 != null && (f2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (z2) {
                dVar.k((CharSequence) null);
            }
        }

        public void e(View view, AccessibilityEvent accessibilityEvent) {
            this.f2994a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            AutoCompleteTextView d2 = b.d(b.this.f4254a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && b.this.f2600q.isEnabled() && !b.e(b.this.f4254a.getEditText())) {
                b.g(b.this, d2);
                b.h(b.this);
            }
        }
    }

    public class d implements TextInputLayout.f {
        public d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:8:0x005c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.google.android.material.textfield.TextInputLayout r6) {
            /*
                r5 = this;
                android.widget.EditText r0 = r6.getEditText()
                android.widget.AutoCompleteTextView r0 = com.google.android.material.textfield.b.d(r0)
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.TextInputLayout r2 = r1.f4254a
                int r2 = r2.getBoxBackgroundMode()
                r3 = 1
                r4 = 2
                if (r2 != r4) goto L_0x0017
                u1.g r1 = r1.f2599p
                goto L_0x001b
            L_0x0017:
                if (r2 != r3) goto L_0x001e
                android.graphics.drawable.StateListDrawable r1 = r1.f2598o
            L_0x001b:
                r0.setDropDownBackgroundDrawable(r1)
            L_0x001e:
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                r1.i(r0)
                com.google.android.material.textfield.b r1 = com.google.android.material.textfield.b.this
                java.util.Objects.requireNonNull(r1)
                w1.j r2 = new w1.j
                r2.<init>(r1, r0)
                r0.setOnTouchListener(r2)
                android.view.View$OnFocusChangeListener r2 = r1.f2589f
                r0.setOnFocusChangeListener(r2)
                w1.g r2 = new w1.g
                r2.<init>(r1)
                r0.setOnDismissListener(r2)
                r1 = 0
                r0.setThreshold(r1)
                com.google.android.material.textfield.b r2 = com.google.android.material.textfield.b.this
                android.text.TextWatcher r2 = r2.f2588e
                r0.removeTextChangedListener(r2)
                com.google.android.material.textfield.b r2 = com.google.android.material.textfield.b.this
                android.text.TextWatcher r2 = r2.f2588e
                r0.addTextChangedListener(r2)
                r6.setEndIconCheckable(r3)
                r2 = 0
                r6.setErrorIconDrawable((android.graphics.drawable.Drawable) r2)
                android.text.method.KeyListener r0 = r0.getKeyListener()
                if (r0 == 0) goto L_0x005d
                r1 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0072
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.b.this
                android.view.accessibility.AccessibilityManager r0 = r0.f2600q
                boolean r0 = r0.isTouchExplorationEnabled()
                if (r0 == 0) goto L_0x0072
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.b.this
                com.google.android.material.internal.CheckableImageButton r0 = r0.f4256c
                java.util.WeakHashMap<android.view.View, g0.x> r1 = g0.u.f3063a
                g0.u.d.s(r0, r4)
            L_0x0072:
                com.google.android.material.textfield.b r0 = com.google.android.material.textfield.b.this
                com.google.android.material.textfield.TextInputLayout$e r0 = r0.f2590g
                r6.setTextInputAccessibilityDelegate(r0)
                r6.setEndIconVisible(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.b.d.a(com.google.android.material.textfield.TextInputLayout):void");
        }
    }

    public class e implements TextInputLayout.g {

        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ AutoCompleteTextView f2610b;

            public a(AutoCompleteTextView autoCompleteTextView) {
                this.f2610b = autoCompleteTextView;
            }

            public void run() {
                this.f2610b.removeTextChangedListener(b.this.f2588e);
            }
        }

        public e() {
        }

        public void a(TextInputLayout textInputLayout, int i2) {
            h0.b bVar;
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i2 == 3) {
                autoCompleteTextView.post(new a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == b.this.f2589f) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
            if (i2 == 3) {
                textInputLayout.removeOnAttachStateChangeListener(b.this.f2593j);
                b bVar2 = b.this;
                AccessibilityManager accessibilityManager = bVar2.f2600q;
                if (accessibilityManager != null && (bVar = bVar2.f2594k) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new h0.c(bVar));
                }
            }
        }
    }

    public class f implements View.OnAttachStateChangeListener {
        public f() {
        }

        public void onViewAttachedToWindow(View view) {
            b.this.j();
        }

        public void onViewDetachedFromWindow(View view) {
            h0.b bVar;
            b bVar2 = b.this;
            AccessibilityManager accessibilityManager = bVar2.f2600q;
            if (accessibilityManager != null && (bVar = bVar2.f2594k) != null) {
                accessibilityManager.removeTouchExplorationStateChangeListener(new h0.c(bVar));
            }
        }
    }

    public class g implements h0.b {
        public g() {
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        public void onClick(View view) {
            b.g(b.this, (AutoCompleteTextView) b.this.f4254a.getEditText());
        }
    }

    public b(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
    }

    public static AutoCompleteTextView d(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static boolean e(EditText editText) {
        return editText.getKeyListener() != null;
    }

    public static void f(b bVar, boolean z2) {
        if (bVar.f2596m != z2) {
            bVar.f2596m = z2;
            bVar.f2602s.cancel();
            bVar.f2601r.start();
        }
    }

    public static void g(b bVar, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(bVar);
        if (autoCompleteTextView != null) {
            if (bVar.l()) {
                bVar.f2595l = false;
            }
            if (!bVar.f2595l) {
                boolean z2 = bVar.f2596m;
                boolean z3 = !z2;
                if (z2 != z3) {
                    bVar.f2596m = z3;
                    bVar.f2602s.cancel();
                    bVar.f2601r.start();
                }
                if (bVar.f2596m) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            bVar.f2595l = false;
        }
    }

    public static void h(b bVar) {
        bVar.f2595l = true;
        bVar.f2597n = System.currentTimeMillis();
    }

    public void a() {
        float dimensionPixelOffset = (float) this.f4255b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f4255b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f4255b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        u1.g k2 = k(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        u1.g k3 = k(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f2599p = k2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f2598o = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, k2);
        this.f2598o.addState(new int[0], k3);
        int i2 = this.f4257d;
        if (i2 == 0) {
            i2 = R.drawable.mtrl_dropdown_arrow;
        }
        this.f4254a.setEndIconDrawable(i2);
        TextInputLayout textInputLayout = this.f4254a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f4254a.setEndIconOnClickListener(new h());
        this.f4254a.a(this.f2591h);
        TextInputLayout textInputLayout2 = this.f4254a;
        textInputLayout2.f2526g0.add(this.f2592i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = z0.a.f4419a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new i(this));
        this.f2602s = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new i(this));
        this.f2601r = ofFloat2;
        ofFloat2.addListener(new w1.h(this));
        this.f2600q = (AccessibilityManager) this.f4255b.getSystemService("accessibility");
        this.f4254a.addOnAttachStateChangeListener(this.f2593j);
        j();
    }

    public boolean b(int i2) {
        return i2 != 0;
    }

    public final void i(AutoCompleteTextView autoCompleteTextView) {
        if (!(autoCompleteTextView.getKeyListener() != null)) {
            int boxBackgroundMode = this.f4254a.getBoxBackgroundMode();
            u1.g boxBackground = this.f4254a.getBoxBackground();
            int f2 = c.b.f(autoCompleteTextView, R.attr.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                int f3 = c.b.f(autoCompleteTextView, R.attr.colorSurface);
                u1.g gVar = new u1.g(boxBackground.f3911b.f3935a);
                int h2 = c.b.h(f2, f3, 0.1f);
                gVar.q(new ColorStateList(iArr, new int[]{h2, 0}));
                gVar.setTint(f3);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{h2, f3});
                u1.g gVar2 = new u1.g(boxBackground.f3911b.f3935a);
                gVar2.setTint(-1);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar, gVar2), boxBackground});
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                u.d.q(autoCompleteTextView, layerDrawable);
            } else if (boxBackgroundMode == 1) {
                int boxBackgroundColor = this.f4254a.getBoxBackgroundColor();
                RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{c.b.h(f2, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground);
                WeakHashMap<View, x> weakHashMap2 = u.f3063a;
                u.d.q(autoCompleteTextView, rippleDrawable);
            }
        }
    }

    public final void j() {
        TextInputLayout textInputLayout;
        if (this.f2600q != null && (textInputLayout = this.f4254a) != null) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (u.g.b(textInputLayout)) {
                AccessibilityManager accessibilityManager = this.f2600q;
                h0.b bVar = this.f2594k;
                if (bVar != null) {
                    accessibilityManager.addTouchExplorationStateChangeListener(new h0.c(bVar));
                }
            }
        }
    }

    public final u1.g k(float f2, float f3, float f4, int i2) {
        j.b bVar = new j.b();
        bVar.f3974e = new u1.a(f2);
        bVar.f3975f = new u1.a(f2);
        bVar.f3977h = new u1.a(f3);
        bVar.f3976g = new u1.a(f3);
        j a2 = bVar.a();
        Context context = this.f4255b;
        String str = u1.g.f3909y;
        int c2 = r1.b.c(context, R.attr.colorSurface, u1.g.class.getSimpleName());
        u1.g gVar = new u1.g();
        gVar.f3911b.f3936b = new l1.a(context);
        gVar.x();
        gVar.q(ColorStateList.valueOf(c2));
        g.b bVar2 = gVar.f3911b;
        if (bVar2.f3949o != f4) {
            bVar2.f3949o = f4;
            gVar.x();
        }
        gVar.f3911b.f3935a = a2;
        gVar.invalidateSelf();
        g.b bVar3 = gVar.f3911b;
        if (bVar3.f3943i == null) {
            bVar3.f3943i = new Rect();
        }
        gVar.f3911b.f3943i.set(0, i2, 0, i2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final boolean l() {
        long currentTimeMillis = System.currentTimeMillis() - this.f2597n;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}
