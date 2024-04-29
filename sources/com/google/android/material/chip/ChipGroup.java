package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import h0.d;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import o1.g;
import o1.i;
import o1.n;

public class ChipGroup extends g {

    /* renamed from: f  reason: collision with root package name */
    public int f2263f;

    /* renamed from: g  reason: collision with root package name */
    public int f2264g;

    /* renamed from: h  reason: collision with root package name */
    public d f2265h;

    /* renamed from: i  reason: collision with root package name */
    public final o1.b<Chip> f2266i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2267j;

    /* renamed from: k  reason: collision with root package name */
    public final e f2268k;

    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f2269a;

        public a(c cVar) {
            this.f2269a = cVar;
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public b(int i2, int i3) {
            super(i2, i3);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Deprecated
    public interface c {
        void a(ChipGroup chipGroup, int i2);
    }

    public interface d {
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f2271a;

        public e(b bVar) {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, x> weakHashMap = u.f3063a;
                    view2.setId(u.e.a());
                }
                o1.b<Chip> bVar = ChipGroup.this.f2266i;
                Chip chip = (Chip) view2;
                bVar.f3518a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    bVar.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new o1.a(bVar));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2271a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                o1.b<Chip> bVar = chipGroup.f2266i;
                Chip chip = (Chip) view2;
                Objects.requireNonNull(bVar);
                chip.setInternalOnCheckedChangeListener((i.a) null);
                bVar.f3518a.remove(Integer.valueOf(chip.getId()));
                bVar.f3519b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f2271a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(x1.a.a(context, attributeSet, R.attr.chipGroupStyle, 2131755975), attributeSet, R.attr.chipGroupStyle);
        o1.b<Chip> bVar = new o1.b<>();
        this.f2266i = bVar;
        e eVar = new e((b) null);
        this.f2268k = eVar;
        TypedArray d2 = n.d(getContext(), attributeSet, y0.a.f4367d, R.attr.chipGroupStyle, 2131755975, new int[0]);
        int dimensionPixelOffset = d2.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(d2.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(d2.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(d2.getBoolean(5, false));
        setSingleSelection(d2.getBoolean(6, false));
        setSelectionRequired(d2.getBoolean(4, false));
        this.f2267j = d2.getResourceId(0, -1);
        d2.recycle();
        bVar.f3520c = new b(this);
        super.setOnHierarchyChangeListener(eVar);
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.d.s(this, 1);
    }

    private int getChipCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if (getChildAt(i3) instanceof Chip) {
                i2++;
            }
        }
        return i2;
    }

    public boolean a() {
        return this.f3559d;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getCheckedChipId() {
        return this.f2266i.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f2266i.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f2263f;
    }

    public int getChipSpacingVertical() {
        return this.f2264g;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f2267j;
        if (i2 != -1) {
            o1.b<Chip> bVar = this.f2266i;
            i iVar = (i) bVar.f3518a.get(Integer.valueOf(i2));
            if (iVar != null && bVar.a(iVar)) {
                bVar.d();
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.b.a(getRowCount(), this.f3559d ? getChipCount() : -1, false, this.f2266i.f3521d ? 1 : 2).f3175a);
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.f2263f != i2) {
            this.f2263f = i2;
            setItemSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.f2264g != i2) {
            this.f2264g = i2;
            setLineSpacing(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener((d) null);
        } else {
            setOnCheckedStateChangeListener(new a(cVar));
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.f2265h = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2268k.f2271a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z2) {
        this.f2266i.f3522e = z2;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    public void setSingleLine(boolean z2) {
        super.setSingleLine(z2);
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z2) {
        o1.b<Chip> bVar = this.f2266i;
        if (bVar.f3521d != z2) {
            bVar.f3521d = z2;
            boolean z3 = !bVar.f3519b.isEmpty();
            for (T e2 : bVar.f3518a.values()) {
                bVar.e(e2, false);
            }
            if (z3) {
                bVar.d();
            }
        }
    }
}
