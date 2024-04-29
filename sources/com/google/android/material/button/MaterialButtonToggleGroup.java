package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.example.supermarket.R;
import com.google.android.material.button.MaterialButton;
import g0.u;
import g0.x;
import h0.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import o1.n;
import o1.s;
import u1.j;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f2221l = 0;

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f2222b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final e f2223c = new e((a) null);

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet<d> f2224d = new LinkedHashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public final Comparator<MaterialButton> f2225e = new a();

    /* renamed from: f  reason: collision with root package name */
    public Integer[] f2226f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2227g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2228h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2229i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2230j;

    /* renamed from: k  reason: collision with root package name */
    public Set<Integer> f2231k = new HashSet();

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        public int compare(Object obj, Object obj2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends g0.a {
        public b() {
        }

        public void d(View view, h0.d dVar) {
            this.f2994a.onInitializeAccessibilityNodeInfo(view, dVar.f3160a);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            int i2 = MaterialButtonToggleGroup.f2221l;
            Objects.requireNonNull(materialButtonToggleGroup);
            int i3 = -1;
            if (view instanceof MaterialButton) {
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    if (i4 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i4) == view) {
                        i3 = i5;
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.d(i4)) {
                            i5++;
                        }
                        i4++;
                    }
                }
            }
            dVar.j(d.c.a(0, 1, i3, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* renamed from: e  reason: collision with root package name */
        public static final u1.c f2234e = new u1.a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        public u1.c f2235a;

        /* renamed from: b  reason: collision with root package name */
        public u1.c f2236b;

        /* renamed from: c  reason: collision with root package name */
        public u1.c f2237c;

        /* renamed from: d  reason: collision with root package name */
        public u1.c f2238d;

        public c(u1.c cVar, u1.c cVar2, u1.c cVar3, u1.c cVar4) {
            this.f2235a = cVar;
            this.f2236b = cVar3;
            this.f2237c = cVar4;
            this.f2238d = cVar2;
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i2, boolean z2);
    }

    public class e implements MaterialButton.b {
        public e(a aVar) {
        }
    }

    static {
        Class<MaterialButtonToggleGroup> cls = MaterialButtonToggleGroup.class;
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(x1.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131755989), attributeSet, R.attr.materialButtonToggleGroupStyle);
        TypedArray d2 = n.d(getContext(), attributeSet, y0.a.f4376m, R.attr.materialButtonToggleGroupStyle, 2131755989, new int[0]);
        setSingleSelection(d2.getBoolean(2, false));
        this.f2230j = d2.getResourceId(0, -1);
        this.f2229i = d2.getBoolean(1, false);
        setChildrenDrawingOrderEnabled(true);
        d2.recycle();
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.d.s(this, 1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (d(i2)) {
                return i2;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (d(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && d(i3)) {
                i2++;
            }
        }
        return i2;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            materialButton.setId(u.e.a());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f2223c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
                MaterialButton c2 = c(i2);
                int min = Math.min(c2.getStrokeWidth(), c(i2 - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams = c2.getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
                if (getOrientation() == 0) {
                    layoutParams2.setMarginEnd(0);
                    layoutParams2.setMarginStart(-min);
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.bottomMargin = 0;
                    layoutParams2.topMargin = -min;
                    layoutParams2.setMarginStart(0);
                }
                c2.setLayoutParams(layoutParams2);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MaterialButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.isChecked());
        j shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f2222b.add(new c(shapeAppearanceModel.f3962e, shapeAppearanceModel.f3965h, shapeAppearanceModel.f3963f, shapeAppearanceModel.f3964g));
        u.u(materialButton, new b());
    }

    public final void b(int i2, boolean z2) {
        if (i2 == -1) {
            Log.e("MaterialButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f2231k);
        if (z2 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f2228h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else if (!z2 && hashSet.contains(Integer.valueOf(i2))) {
            if (!this.f2229i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        } else {
            return;
        }
        e(hashSet);
    }

    public final MaterialButton c(int i2) {
        return (MaterialButton) getChildAt(i2);
    }

    public final boolean d(int i2) {
        return getChildAt(i2).getVisibility() != 8;
    }

    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f2225e);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put(c(i2), Integer.valueOf(i2));
        }
        this.f2226f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e(Set<Integer> set) {
        Set<Integer> set2 = this.f2231k;
        this.f2231k = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = c(i2).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f2227g = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f2227g = false;
            }
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean contains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.f2224d.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).a(this, id, contains2);
                }
            }
        }
        invalidate();
    }

    public void f() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i2 = 0; i2 < childCount; i2++) {
            MaterialButton c2 = c(i2);
            if (c2.getVisibility() != 8) {
                j shapeAppearanceModel = c2.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                j.b bVar = new j.b(shapeAppearanceModel);
                c cVar2 = this.f2222b.get(i2);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    if (i2 == firstVisibleChildIndex) {
                        if (!z2) {
                            u1.c cVar3 = cVar2.f2235a;
                            u1.c cVar4 = c.f2234e;
                            cVar = new c(cVar3, cVar4, cVar2.f2236b, cVar4);
                        } else if (s.a(this)) {
                            u1.c cVar5 = c.f2234e;
                            cVar = new c(cVar5, cVar5, cVar2.f2236b, cVar2.f2237c);
                        } else {
                            u1.c cVar6 = cVar2.f2235a;
                            u1.c cVar7 = cVar2.f2238d;
                            u1.c cVar8 = c.f2234e;
                            cVar = new c(cVar6, cVar7, cVar8, cVar8);
                        }
                    } else if (i2 != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (!z2) {
                        u1.c cVar9 = c.f2234e;
                        cVar = new c(cVar9, cVar2.f2238d, cVar9, cVar2.f2237c);
                    } else if (s.a(this)) {
                        u1.c cVar10 = cVar2.f2235a;
                        u1.c cVar11 = cVar2.f2238d;
                        u1.c cVar12 = c.f2234e;
                        cVar = new c(cVar10, cVar11, cVar12, cVar12);
                    } else {
                        u1.c cVar13 = c.f2234e;
                        cVar = new c(cVar13, cVar13, cVar2.f2236b, cVar2.f2237c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    bVar.c(0.0f);
                } else {
                    bVar.f3974e = cVar2.f2235a;
                    bVar.f3977h = cVar2.f2238d;
                    bVar.f3975f = cVar2.f2236b;
                    bVar.f3976g = cVar2.f2237c;
                }
                c2.setShapeAppearanceModel(bVar.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f2228h || this.f2231k.isEmpty()) {
            return -1;
        }
        return this.f2231k.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id = c(i2).getId();
            if (this.f2231k.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        Integer[] numArr = this.f2226f;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MaterialButtonToggleGroup", "Child order wasn't updated");
        return i3;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f2230j;
        if (i2 != -1) {
            e(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.b.a(1, getVisibleButtonCount(), false, this.f2228h ? 1 : 2).f3175a);
    }

    public void onMeasure(int i2, int i3) {
        f();
        a();
        super.onMeasure(i2, i3);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f2222b.remove(indexOfChild);
        }
        f();
        a();
    }

    public void setSelectionRequired(boolean z2) {
        this.f2229i = z2;
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    public void setSingleSelection(boolean z2) {
        if (this.f2228h != z2) {
            this.f2228h = z2;
            e(new HashSet());
        }
    }
}
