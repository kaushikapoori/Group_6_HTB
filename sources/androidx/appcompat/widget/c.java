package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import com.example.supermarket.R;
import java.util.ArrayList;
import java.util.Objects;

public class c extends androidx.appcompat.view.menu.a {

    /* renamed from: j  reason: collision with root package name */
    public d f529j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f530k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f531l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f532m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f533n;

    /* renamed from: o  reason: collision with root package name */
    public int f534o;

    /* renamed from: p  reason: collision with root package name */
    public int f535p;

    /* renamed from: q  reason: collision with root package name */
    public int f536q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f537r;

    /* renamed from: s  reason: collision with root package name */
    public final SparseBooleanArray f538s = new SparseBooleanArray();

    /* renamed from: t  reason: collision with root package name */
    public e f539t;

    /* renamed from: u  reason: collision with root package name */
    public a f540u;

    /* renamed from: v  reason: collision with root package name */
    public C0002c f541v;

    /* renamed from: w  reason: collision with root package name */
    public b f542w;

    /* renamed from: x  reason: collision with root package name */
    public final f f543x = new f();

    public class a extends h {
        public a(Context context, l lVar, View view) {
            super(context, lVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!lVar.A.g()) {
                View view2 = c.this.f529j;
                this.f275f = view2 == null ? (View) c.this.f166i : view2;
            }
            d(c.this.f543x);
        }

        public void c() {
            c cVar = c.this;
            cVar.f540u = null;
            Objects.requireNonNull(cVar);
            super.c();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c  reason: collision with other inner class name */
    public class C0002c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public e f546b;

        public C0002c(e eVar) {
            this.f546b = eVar;
        }

        public void run() {
            e.a aVar;
            androidx.appcompat.view.menu.e eVar = c.this.f161d;
            if (!(eVar == null || (aVar = eVar.f220e) == null)) {
                aVar.a(eVar);
            }
            View view = (View) c.this.f166i;
            if (!(view == null || view.getWindowToken() == null || !this.f546b.f())) {
                c.this.f539t = this.f546b;
            }
            c.this.f541v = null;
        }
    }

    public class d extends q implements ActionMenuView.a {

        public class a extends l0 {
            public a(View view, c cVar) {
                super(view);
            }

            public i.f b() {
                e eVar = c.this.f539t;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            public boolean c() {
                c.this.n();
                return true;
            }

            public boolean d() {
                c cVar = c.this;
                if (cVar.f541v != null) {
                    return false;
                }
                cVar.i();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            e1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.n();
            return true;
        }

        public boolean setFrame(int i2, int i3, int i4, int i5) {
            boolean frame = super.setFrame(i2, i3, i4, i5);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z2) {
            super(context, eVar, view, z2, R.attr.actionOverflowMenuStyle, 0);
            this.f276g = 8388613;
            d(c.this.f543x);
        }

        public void c() {
            androidx.appcompat.view.menu.e eVar = c.this.f161d;
            if (eVar != null) {
                eVar.c(true);
            }
            c.this.f539t = null;
            super.c();
        }
    }

    public class f implements i.a {
        public f() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
            if (eVar instanceof l) {
                eVar.k().c(false);
            }
            i.a aVar = c.this.f163f;
            if (aVar != null) {
                aVar.b(eVar, z2);
            }
        }

        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == c.this.f161d) {
                return false;
            }
            Objects.requireNonNull(((l) eVar).A);
            i.a aVar = c.this.f163f;
            if (aVar != null) {
                return aVar.c(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
    }

    public boolean a() {
        return i() | l();
    }

    public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
        a();
        i.a aVar = this.f163f;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    public View e(g gVar, View view, ViewGroup viewGroup) {
        j.a aVar;
        View actionView = gVar.getActionView();
        int i2 = 0;
        if (actionView == null || gVar.f()) {
            if (view instanceof j.a) {
                aVar = (j.a) view;
            } else {
                aVar = (j.a) this.f162e.inflate(this.f165h, viewGroup, false);
            }
            aVar.d(gVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f166i);
            if (this.f542w == null) {
                this.f542w = new b();
            }
            actionMenuItemView.setPopupCallback(this.f542w);
            actionView = (View) aVar;
        }
        if (gVar.C) {
            i2 = 8;
        }
        actionView.setVisibility(i2);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public boolean f(l lVar) {
        boolean z2 = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l lVar2 = lVar;
        while (true) {
            androidx.appcompat.view.menu.e eVar = lVar2.f305z;
            if (eVar == this.f161d) {
                break;
            }
            lVar2 = eVar;
        }
        g gVar = lVar2.A;
        ViewGroup viewGroup = (ViewGroup) this.f166i;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == gVar) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        Objects.requireNonNull(lVar.A);
        int size = lVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            MenuItem item = lVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        a aVar = new a(this.f160c, lVar, view);
        this.f540u = aVar;
        aVar.f277h = z2;
        i.d dVar = aVar.f279j;
        if (dVar != null) {
            dVar.o(z2);
        }
        if (this.f540u.f()) {
            i.a aVar2 = this.f163f;
            if (aVar2 != null) {
                aVar2.c(lVar);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public boolean g() {
        int i2;
        ArrayList<g> arrayList;
        int i3;
        boolean z2;
        androidx.appcompat.view.menu.e eVar = this.f161d;
        if (eVar != null) {
            arrayList = eVar.l();
            i2 = arrayList.size();
        } else {
            arrayList = null;
            i2 = 0;
        }
        int i4 = this.f536q;
        int i5 = this.f535p;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f166i;
        int i6 = 0;
        boolean z3 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z2 = true;
            if (i6 >= i2) {
                break;
            }
            g gVar = arrayList.get(i6);
            int i9 = gVar.f267y;
            if ((i9 & 2) == 2) {
                i8++;
            } else {
                if ((i9 & 1) == 1) {
                    i7++;
                } else {
                    z3 = true;
                }
            }
            if (this.f537r && gVar.C) {
                i4 = 0;
            }
            i6++;
        }
        if (this.f532m && (z3 || i7 + i8 > i4)) {
            i4--;
        }
        int i10 = i4 - i8;
        SparseBooleanArray sparseBooleanArray = this.f538s;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i2) {
            g gVar2 = arrayList.get(i11);
            int i13 = gVar2.f267y;
            if ((i13 & 2) == i3) {
                View e2 = e(gVar2, (View) null, viewGroup);
                e2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = e2.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int i14 = gVar2.f244b;
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z2);
                }
                gVar2.k(z2);
            } else {
                if ((i13 & true) == z2) {
                    int i15 = gVar2.f244b;
                    boolean z4 = sparseBooleanArray.get(i15);
                    boolean z5 = (i10 > 0 || z4) && i5 > 0;
                    if (z5) {
                        View e3 = e(gVar2, (View) null, viewGroup);
                        e3.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = e3.getMeasuredWidth();
                        i5 -= measuredWidth2;
                        if (i12 == 0) {
                            i12 = measuredWidth2;
                        }
                        z5 &= i5 + i12 > 0;
                    }
                    if (z5 && i15 != 0) {
                        sparseBooleanArray.put(i15, true);
                    } else if (z4) {
                        sparseBooleanArray.put(i15, false);
                        for (int i16 = 0; i16 < i11; i16++) {
                            g gVar3 = arrayList.get(i16);
                            if (gVar3.f244b == i15) {
                                if (gVar3.g()) {
                                    i10++;
                                }
                                gVar3.k(false);
                            }
                        }
                    }
                    if (z5) {
                        i10--;
                    }
                    gVar2.k(z5);
                } else {
                    gVar2.k(false);
                    i11++;
                    i3 = 2;
                    z2 = true;
                }
            }
            i11++;
            i3 = 2;
            z2 = true;
        }
        return true;
    }

    public void h(boolean z2) {
        j jVar;
        int i2;
        boolean z3;
        ViewGroup viewGroup = (ViewGroup) this.f166i;
        ArrayList<g> arrayList = null;
        boolean z4 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.e eVar = this.f161d;
            if (eVar != null) {
                eVar.i();
                ArrayList<g> l2 = this.f161d.l();
                int size = l2.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    g gVar = l2.get(i3);
                    if (gVar.g()) {
                        View childAt = viewGroup.getChildAt(i2);
                        g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                        View e2 = e(gVar, childAt, viewGroup);
                        if (gVar != itemData) {
                            e2.setPressed(false);
                            e2.jumpDrawablesToCurrentState();
                        }
                        if (e2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) e2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(e2);
                            }
                            ((ViewGroup) this.f166i).addView(e2, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f529j) {
                    z3 = false;
                } else {
                    viewGroup.removeViewAt(i2);
                    z3 = true;
                }
                if (!z3) {
                    i2++;
                }
            }
        }
        ((View) this.f166i).requestLayout();
        androidx.appcompat.view.menu.e eVar2 = this.f161d;
        if (eVar2 != null) {
            eVar2.i();
            ArrayList<g> arrayList2 = eVar2.f224i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                g0.b bVar = arrayList2.get(i4).A;
            }
        }
        androidx.appcompat.view.menu.e eVar3 = this.f161d;
        if (eVar3 != null) {
            eVar3.i();
            arrayList = eVar3.f225j;
        }
        if (this.f532m && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z4 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z4 = true;
            }
        }
        d dVar = this.f529j;
        if (z4) {
            if (dVar == null) {
                this.f529j = new d(this.f159b);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f529j.getParent();
            if (viewGroup3 != this.f166i) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f529j);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f166i;
                d dVar2 = this.f529j;
                ActionMenuView.c l3 = actionMenuView.h();
                l3.f367a = true;
                actionMenuView.addView(dVar2, l3);
            }
        } else if (dVar != null && dVar.getParent() == (jVar = this.f166i)) {
            ((ViewGroup) jVar).removeView(this.f529j);
        }
        ((ActionMenuView) this.f166i).setOverflowReserved(this.f532m);
    }

    public boolean i() {
        j jVar;
        C0002c cVar = this.f541v;
        if (cVar == null || (jVar = this.f166i) == null) {
            e eVar = this.f539t;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.f279j.dismiss();
            }
            return true;
        }
        ((View) jVar).removeCallbacks(cVar);
        this.f541v = null;
        return true;
    }

    public void j(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f160c = context;
        LayoutInflater.from(context);
        this.f161d = eVar;
        Resources resources = context.getResources();
        if (!this.f533n) {
            this.f532m = true;
        }
        int i2 = 2;
        this.f534o = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f536q = i2;
        int i5 = this.f534o;
        if (this.f532m) {
            if (this.f529j == null) {
                d dVar = new d(this.f159b);
                this.f529j = dVar;
                if (this.f531l) {
                    dVar.setImageDrawable(this.f530k);
                    this.f530k = null;
                    this.f531l = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f529j.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.f529j.getMeasuredWidth();
        } else {
            this.f529j = null;
        }
        this.f535p = i5;
        float f2 = resources.getDisplayMetrics().density;
    }

    public boolean l() {
        a aVar = this.f540u;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b()) {
            return true;
        }
        aVar.f279j.dismiss();
        return true;
    }

    public boolean m() {
        e eVar = this.f539t;
        return eVar != null && eVar.b();
    }

    public boolean n() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f532m || m() || (eVar = this.f161d) == null || this.f166i == null || this.f541v != null) {
            return false;
        }
        eVar.i();
        if (eVar.f225j.isEmpty()) {
            return false;
        }
        C0002c cVar = new C0002c(new e(this.f160c, this.f161d, this.f529j, true));
        this.f541v = cVar;
        ((View) this.f166i).post(cVar);
        return true;
    }
}
