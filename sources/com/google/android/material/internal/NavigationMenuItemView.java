package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.m0;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import h0.d;
import java.util.WeakHashMap;
import o1.h;

public class NavigationMenuItemView extends h implements j.a {
    public static final int[] G = {16842912};
    public FrameLayout A;
    public g B;
    public ColorStateList C;
    public boolean D;
    public Drawable E;
    public final g0.a F;

    /* renamed from: w  reason: collision with root package name */
    public int f2485w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f2486x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f2487y;

    /* renamed from: z  reason: collision with root package name */
    public final CheckedTextView f2488z;

    public class a extends g0.a {
        public a() {
        }

        public void d(View view, d dVar) {
            this.f2994a.onInitializeAccessibilityNodeInfo(view, dVar.f3160a);
            dVar.f3160a.setCheckable(NavigationMenuItemView.this.f2487y);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.F = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.f2488z = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        u.u(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.A == null) {
                this.A = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.A.removeAllViews();
            this.A.addView(view);
        }
    }

    public void d(g gVar, int i2) {
        int i3;
        m0.a aVar;
        StateListDrawable stateListDrawable;
        this.B = gVar;
        int i4 = gVar.f243a;
        if (i4 > 0) {
            setId(i4);
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        boolean z2 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(G, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.d.q(this, stateListDrawable);
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.f247e);
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.f259q);
        e1.a(this, gVar.f260r);
        g gVar2 = this.B;
        if (!(gVar2.f247e == null && gVar2.getIcon() == null && this.B.getActionView() != null)) {
            z2 = false;
        }
        if (z2) {
            this.f2488z.setVisibility(8);
            FrameLayout frameLayout = this.A;
            if (frameLayout != null) {
                aVar = (m0.a) frameLayout.getLayoutParams();
                i3 = -1;
            } else {
                return;
            }
        } else {
            this.f2488z.setVisibility(0);
            FrameLayout frameLayout2 = this.A;
            if (frameLayout2 != null) {
                aVar = (m0.a) frameLayout2.getLayoutParams();
                i3 = -2;
            } else {
                return;
            }
        }
        aVar.width = i3;
        this.A.setLayoutParams(aVar);
    }

    public g getItemData() {
        return this.B;
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        g gVar = this.B;
        if (gVar != null && gVar.isCheckable() && this.B.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f2487y != z2) {
            this.f2487y = z2;
            this.F.h(this.f2488z, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        this.f2488z.setChecked(z2);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.D) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = a0.a.g(drawable).mutate();
                drawable.setTintList(this.C);
            }
            int i2 = this.f2485w;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f2486x) {
            if (this.E == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = y.g.f4339a;
                Drawable drawable2 = resources.getDrawable(R.drawable.navigation_empty_icon, theme);
                this.E = drawable2;
                if (drawable2 != null) {
                    int i3 = this.f2485w;
                    drawable2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.E;
        }
        this.f2488z.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i2) {
        this.f2488z.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(int i2) {
        this.f2485w = i2;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.C = colorStateList;
        this.D = colorStateList != null;
        g gVar = this.B;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f2488z.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f2486x = z2;
    }

    public void setTextAppearance(int i2) {
        j0.g.f(this.f2488z, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f2488z.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2488z.setText(charSequence);
    }
}
