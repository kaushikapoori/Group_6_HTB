package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.example.supermarket.R;
import com.google.android.material.transformation.FabTransformationBehavior;
import g0.u;
import g0.x;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import z0.g;
import z0.i;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    public Map<View, Integer> f2684i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FabTransformationBehavior.b A(Context context, boolean z2) {
        int i2 = z2 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.b bVar = new FabTransformationBehavior.b();
        bVar.f2678a = g.b(context, i2);
        bVar.f2679b = new i(17, 0.0f, 0.0f);
        return bVar;
    }

    public boolean t(View view, View view2, boolean z2, boolean z3) {
        int i2;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                this.f2684i = new HashMap(childCount);
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = coordinatorLayout.getChildAt(i3);
                boolean z4 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f1058a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z4) {
                    Map<View, Integer> map = this.f2684i;
                    if (z2) {
                        map.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        i2 = 4;
                    } else if (map != null && map.containsKey(childAt)) {
                        i2 = this.f2684i.get(childAt).intValue();
                    }
                    WeakHashMap<View, x> weakHashMap = u.f3063a;
                    u.d.s(childAt, i2);
                }
            }
            if (!z2) {
                this.f2684i = null;
            }
        }
        super.t(view, view2, z2, z3);
        return true;
    }
}
