package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o1.s;
import u1.g;
import u1.j;
import u1.n;

public class MaterialButton extends f implements Checkable, n {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f2205r = {16842911};

    /* renamed from: s  reason: collision with root package name */
    public static final int[] f2206s = {16842912};

    /* renamed from: e  reason: collision with root package name */
    public final d1.a f2207e;

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashSet<a> f2208f = new LinkedHashSet<>();

    /* renamed from: g  reason: collision with root package name */
    public b f2209g;

    /* renamed from: h  reason: collision with root package name */
    public PorterDuff.Mode f2210h;

    /* renamed from: i  reason: collision with root package name */
    public ColorStateList f2211i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f2212j;

    /* renamed from: k  reason: collision with root package name */
    public int f2213k;

    /* renamed from: l  reason: collision with root package name */
    public int f2214l;

    /* renamed from: m  reason: collision with root package name */
    public int f2215m;

    /* renamed from: n  reason: collision with root package name */
    public int f2216n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2217o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2218p;

    /* renamed from: q  reason: collision with root package name */
    public int f2219q;

    public interface a {
        void a(MaterialButton materialButton, boolean z2);
    }

    public interface b {
    }

    public static class c extends l0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public boolean f2220d;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            public Object createFromParcel(Parcel parcel) {
                return new c(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i2) {
                return new c[i2];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f2220d = parcel.readInt() != 1 ? false : true;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3321b, i2);
            parcel.writeInt(this.f2220d ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(x1.a.a(context, attributeSet, R.attr.materialButtonStyle, 2131755957), attributeSet, R.attr.materialButtonStyle);
        boolean z2 = false;
        this.f2217o = false;
        this.f2218p = false;
        Context context2 = getContext();
        TypedArray d2 = o1.n.d(context2, attributeSet, y0.a.f4375l, R.attr.materialButtonStyle, 2131755957, new int[0]);
        this.f2216n = d2.getDimensionPixelSize(12, 0);
        this.f2210h = s.b(d2.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f2211i = r1.c.a(getContext(), d2, 14);
        this.f2212j = r1.c.c(getContext(), d2, 10);
        this.f2219q = d2.getInteger(11, 1);
        this.f2213k = d2.getDimensionPixelSize(13, 0);
        d1.a aVar = new d1.a(this, j.b(context2, attributeSet, R.attr.materialButtonStyle, 2131755957).a());
        this.f2207e = aVar;
        aVar.f2883c = d2.getDimensionPixelOffset(1, 0);
        aVar.f2884d = d2.getDimensionPixelOffset(2, 0);
        aVar.f2885e = d2.getDimensionPixelOffset(3, 0);
        aVar.f2886f = d2.getDimensionPixelOffset(4, 0);
        if (d2.hasValue(8)) {
            int dimensionPixelSize = d2.getDimensionPixelSize(8, -1);
            aVar.f2887g = dimensionPixelSize;
            aVar.e(aVar.f2882b.e((float) dimensionPixelSize));
            aVar.f2896p = true;
        }
        aVar.f2888h = d2.getDimensionPixelSize(20, 0);
        aVar.f2889i = s.b(d2.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        aVar.f2890j = r1.c.a(getContext(), d2, 6);
        aVar.f2891k = r1.c.a(getContext(), d2, 19);
        aVar.f2892l = r1.c.a(getContext(), d2, 16);
        aVar.f2897q = d2.getBoolean(5, false);
        aVar.f2899s = d2.getDimensionPixelSize(9, 0);
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        int f2 = u.e.f(this);
        int paddingTop = getPaddingTop();
        int e2 = u.e.e(this);
        int paddingBottom = getPaddingBottom();
        if (d2.hasValue(0)) {
            aVar.f2895o = true;
            setSupportBackgroundTintList(aVar.f2890j);
            setSupportBackgroundTintMode(aVar.f2889i);
        } else {
            aVar.g();
        }
        u.e.k(this, f2 + aVar.f2883c, paddingTop + aVar.f2885e, e2 + aVar.f2884d, paddingBottom + aVar.f2886f);
        d2.recycle();
        setCompoundDrawablePadding(this.f2216n);
        g(this.f2212j != null ? true : z2);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    public boolean a() {
        d1.a aVar = this.f2207e;
        return aVar != null && aVar.f2897q;
    }

    public final boolean b() {
        int i2 = this.f2219q;
        return i2 == 3 || i2 == 4;
    }

    public final boolean c() {
        int i2 = this.f2219q;
        return i2 == 1 || i2 == 2;
    }

    public final boolean d() {
        int i2 = this.f2219q;
        return i2 == 16 || i2 == 32;
    }

    public final boolean e() {
        d1.a aVar = this.f2207e;
        return aVar != null && !aVar.f2895o;
    }

    public final void f() {
        if (c()) {
            setCompoundDrawablesRelative(this.f2212j, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (b()) {
            setCompoundDrawablesRelative((Drawable) null, (Drawable) null, this.f2212j, (Drawable) null);
        } else if (d()) {
            setCompoundDrawablesRelative((Drawable) null, this.f2212j, (Drawable) null, (Drawable) null);
        }
    }

    public final void g(boolean z2) {
        Drawable drawable = this.f2212j;
        boolean z3 = true;
        if (drawable != null) {
            Drawable mutate = a0.a.g(drawable).mutate();
            this.f2212j = mutate;
            mutate.setTintList(this.f2211i);
            PorterDuff.Mode mode = this.f2210h;
            if (mode != null) {
                this.f2212j.setTintMode(mode);
            }
            int i2 = this.f2213k;
            if (i2 == 0) {
                i2 = this.f2212j.getIntrinsicWidth();
            }
            int i3 = this.f2213k;
            if (i3 == 0) {
                i3 = this.f2212j.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2212j;
            int i4 = this.f2214l;
            int i5 = this.f2215m;
            drawable2.setBounds(i4, i5, i2 + i4, i3 + i5);
            this.f2212j.setVisible(true, z2);
        }
        if (z2) {
            f();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!c() || drawable3 == this.f2212j) && ((!b() || drawable5 == this.f2212j) && (!d() || drawable4 == this.f2212j))) {
            z3 = false;
        }
        if (z3) {
            f();
        }
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (e()) {
            return this.f2207e.f2887g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2212j;
    }

    public int getIconGravity() {
        return this.f2219q;
    }

    public int getIconPadding() {
        return this.f2216n;
    }

    public int getIconSize() {
        return this.f2213k;
    }

    public ColorStateList getIconTint() {
        return this.f2211i;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2210h;
    }

    public int getInsetBottom() {
        return this.f2207e.f2886f;
    }

    public int getInsetTop() {
        return this.f2207e.f2885e;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.f2207e.f2892l;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        if (e()) {
            return this.f2207e.f2882b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.f2207e.f2891k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.f2207e.f2888h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (e()) {
            return this.f2207e.f2890j;
        }
        return super.getSupportBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (e()) {
            return this.f2207e.f2889i;
        }
        return super.getSupportBackgroundTintMode();
    }

    public final void h(int i2, int i3) {
        if (this.f2212j != null && getLayout() != null) {
            if (c() || b()) {
                this.f2215m = 0;
                Layout.Alignment actualTextAlignment = getActualTextAlignment();
                int i4 = this.f2219q;
                boolean z2 = true;
                if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
                    this.f2214l = 0;
                } else {
                    int i5 = this.f2213k;
                    if (i5 == 0) {
                        i5 = this.f2212j.getIntrinsicWidth();
                    }
                    int textWidth = i2 - getTextWidth();
                    WeakHashMap<View, x> weakHashMap = u.f3063a;
                    int e2 = (((textWidth - u.e.e(this)) - i5) - this.f2216n) - u.e.f(this);
                    if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                        e2 /= 2;
                    }
                    boolean z3 = u.e.d(this) == 1;
                    if (this.f2219q != 4) {
                        z2 = false;
                    }
                    if (z3 != z2) {
                        e2 = -e2;
                    }
                    if (this.f2214l != e2) {
                        this.f2214l = e2;
                        g(false);
                        return;
                    }
                    return;
                }
            } else if (d()) {
                this.f2214l = 0;
                if (this.f2219q == 16) {
                    this.f2215m = 0;
                } else {
                    int i6 = this.f2213k;
                    if (i6 == 0) {
                        i6 = this.f2212j.getIntrinsicHeight();
                    }
                    int textHeight = (((((i3 - getTextHeight()) - getPaddingTop()) - i6) - this.f2216n) - getPaddingBottom()) / 2;
                    if (this.f2215m != textHeight) {
                        this.f2215m = textHeight;
                        g(false);
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            g(false);
        }
    }

    public boolean isChecked() {
        return this.f2217o;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            c.b.l(this, this.f2207e.b());
        }
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, f2205r);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, f2206s);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        d1.a aVar;
        super.onLayout(z2, i2, i3, i4, i5);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.f2207e) != null) {
            int i6 = i5 - i3;
            int i7 = i4 - i2;
            Drawable drawable = aVar.f2893m;
            if (drawable != null) {
                drawable.setBounds(aVar.f2883c, aVar.f2885e, i7 - aVar.f2884d, i6 - aVar.f2886f);
            }
        }
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f3321b);
        setChecked(cVar.f2220d);
    }

    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f2220d = this.f2217o;
        return cVar;
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2212j != null) {
            if (this.f2212j.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i2) {
        if (e()) {
            d1.a aVar = this.f2207e;
            if (aVar.b() != null) {
                aVar.b().setTint(i2);
                return;
            }
            return;
        }
        super.setBackgroundColor(i2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (e()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                d1.a aVar = this.f2207e;
                aVar.f2895o = true;
                aVar.f2881a.setSupportBackgroundTintList(aVar.f2890j);
                aVar.f2881a.setSupportBackgroundTintMode(aVar.f2889i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i2) {
        setBackgroundDrawable(i2 != 0 ? e.a.b(getContext(), i2) : null);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (e()) {
            this.f2207e.f2897q = z2;
        }
    }

    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f2217o != z2) {
            this.f2217o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f2217o;
                if (!materialButtonToggleGroup.f2227g) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (!this.f2218p) {
                this.f2218p = true;
                Iterator it = this.f2208f.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(this, this.f2217o);
                }
                this.f2218p = false;
            }
        }
    }

    public void setCornerRadius(int i2) {
        if (e()) {
            d1.a aVar = this.f2207e;
            if (!aVar.f2896p || aVar.f2887g != i2) {
                aVar.f2887g = i2;
                aVar.f2896p = true;
                aVar.e(aVar.f2882b.e((float) i2));
            }
        }
    }

    public void setCornerRadiusResource(int i2) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setElevation(float f2) {
        super.setElevation(f2);
        if (e()) {
            g b2 = this.f2207e.b();
            g.b bVar = b2.f3911b;
            if (bVar.f3949o != f2) {
                bVar.f3949o = f2;
                b2.x();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2212j != drawable) {
            this.f2212j = drawable;
            g(true);
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.f2219q != i2) {
            this.f2219q = i2;
            h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i2) {
        if (this.f2216n != i2) {
            this.f2216n = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(int i2) {
        setIcon(i2 != 0 ? e.a.b(getContext(), i2) : null);
    }

    public void setIconSize(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f2213k != i2) {
            this.f2213k = i2;
            g(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2211i != colorStateList) {
            this.f2211i = colorStateList;
            g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2210h != mode) {
            this.f2210h = mode;
            g(false);
        }
    }

    public void setIconTintResource(int i2) {
        setIconTint(e.a.a(getContext(), i2));
    }

    public void setInsetBottom(int i2) {
        d1.a aVar = this.f2207e;
        aVar.f(aVar.f2885e, i2);
    }

    public void setInsetTop(int i2) {
        d1.a aVar = this.f2207e;
        aVar.f(i2, aVar.f2886f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f2209g = bVar;
    }

    public void setPressed(boolean z2) {
        b bVar = this.f2209g;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            d1.a aVar = this.f2207e;
            if (aVar.f2892l != colorStateList) {
                aVar.f2892l = colorStateList;
                boolean z2 = d1.a.f2879t;
                if (z2 && (aVar.f2881a.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) aVar.f2881a.getBackground()).setColor(s1.b.a(colorStateList));
                } else if (!z2 && (aVar.f2881a.getBackground() instanceof s1.a)) {
                    ((s1.a) aVar.f2881a.getBackground()).setTintList(s1.b.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i2) {
        if (e()) {
            setRippleColor(e.a.a(getContext(), i2));
        }
    }

    public void setShapeAppearanceModel(j jVar) {
        if (e()) {
            this.f2207e.e(jVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (e()) {
            d1.a aVar = this.f2207e;
            aVar.f2894n = z2;
            aVar.h();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            d1.a aVar = this.f2207e;
            if (aVar.f2891k != colorStateList) {
                aVar.f2891k = colorStateList;
                aVar.h();
            }
        }
    }

    public void setStrokeColorResource(int i2) {
        if (e()) {
            setStrokeColor(e.a.a(getContext(), i2));
        }
    }

    public void setStrokeWidth(int i2) {
        if (e()) {
            d1.a aVar = this.f2207e;
            if (aVar.f2888h != i2) {
                aVar.f2888h = i2;
                aVar.h();
            }
        }
    }

    public void setStrokeWidthResource(int i2) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (e()) {
            d1.a aVar = this.f2207e;
            if (aVar.f2890j != colorStateList) {
                aVar.f2890j = colorStateList;
                if (aVar.b() != null) {
                    aVar.b().setTintList(aVar.f2890j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (e()) {
            d1.a aVar = this.f2207e;
            if (aVar.f2889i != mode) {
                aVar.f2889i = mode;
                if (aVar.b() != null && aVar.f2889i != null) {
                    aVar.b().setTintMode(aVar.f2889i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        h(getMeasuredWidth(), getMeasuredHeight());
    }

    public void toggle() {
        setChecked(!this.f2217o);
    }
}
