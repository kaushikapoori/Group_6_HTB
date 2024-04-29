package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import h0.d;
import h0.e;
import java.util.Map;
import java.util.WeakHashMap;

public class y extends g0.a {

    /* renamed from: d  reason: collision with root package name */
    public final RecyclerView f2003d;

    /* renamed from: e  reason: collision with root package name */
    public final a f2004e;

    public static class a extends g0.a {

        /* renamed from: d  reason: collision with root package name */
        public final y f2005d;

        /* renamed from: e  reason: collision with root package name */
        public Map<View, g0.a> f2006e = new WeakHashMap();

        public a(y yVar) {
            this.f2005d = yVar;
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            g0.a aVar = this.f2006e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : this.f2994a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public e b(View view) {
            g0.a aVar = this.f2006e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        public void c(View view, AccessibilityEvent accessibilityEvent) {
            g0.a aVar = this.f2006e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                this.f2994a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public void d(View view, d dVar) {
            if (!this.f2005d.j() && this.f2005d.f2003d.getLayoutManager() != null) {
                this.f2005d.f2003d.getLayoutManager().c0(view, dVar);
                g0.a aVar = this.f2006e.get(view);
                if (aVar != null) {
                    aVar.d(view, dVar);
                    return;
                }
            }
            this.f2994a.onInitializeAccessibilityNodeInfo(view, dVar.f3160a);
        }

        public void e(View view, AccessibilityEvent accessibilityEvent) {
            g0.a aVar = this.f2006e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                this.f2994a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            g0.a aVar = this.f2006e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : this.f2994a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean g(View view, int i2, Bundle bundle) {
            if (this.f2005d.j() || this.f2005d.f2003d.getLayoutManager() == null) {
                return super.g(view, i2, bundle);
            }
            g0.a aVar = this.f2006e.get(view);
            if (aVar != null) {
                if (aVar.g(view, i2, bundle)) {
                    return true;
                }
            } else if (super.g(view, i2, bundle)) {
                return true;
            }
            RecyclerView.r rVar = this.f2005d.f2003d.getLayoutManager().f1711b.f1654c;
            return false;
        }

        public void h(View view, int i2) {
            g0.a aVar = this.f2006e.get(view);
            if (aVar != null) {
                aVar.h(view, i2);
            } else {
                this.f2994a.sendAccessibilityEvent(view, i2);
            }
        }

        public void i(View view, AccessibilityEvent accessibilityEvent) {
            g0.a aVar = this.f2006e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                this.f2994a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public y(RecyclerView recyclerView) {
        this.f2003d = recyclerView;
        a aVar = this.f2004e;
        this.f2004e = aVar == null ? new a(this) : aVar;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2994a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !j()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().b0(accessibilityEvent);
            }
        }
    }

    public void d(View view, d dVar) {
        this.f2994a.onInitializeAccessibilityNodeInfo(view, dVar.f3160a);
        if (!j() && this.f2003d.getLayoutManager() != null) {
            RecyclerView.l layoutManager = this.f2003d.getLayoutManager();
            RecyclerView recyclerView = layoutManager.f1711b;
            RecyclerView.r rVar = recyclerView.f1654c;
            RecyclerView.w wVar = recyclerView.f1659e0;
            if (recyclerView.canScrollVertically(-1) || layoutManager.f1711b.canScrollHorizontally(-1)) {
                dVar.f3160a.addAction(8192);
                dVar.f3160a.setScrollable(true);
            }
            if (layoutManager.f1711b.canScrollVertically(1) || layoutManager.f1711b.canScrollHorizontally(1)) {
                dVar.f3160a.addAction(4096);
                dVar.f3160a.setScrollable(true);
            }
            dVar.i(d.b.a(layoutManager.S(rVar, wVar), layoutManager.z(rVar, wVar), false, 0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            boolean r9 = super.g(r9, r10, r11)
            r11 = 1
            if (r9 == 0) goto L_0x0008
            return r11
        L_0x0008:
            boolean r9 = r8.j()
            r0 = 0
            if (r9 != 0) goto L_0x0096
            androidx.recyclerview.widget.RecyclerView r9 = r8.f2003d
            androidx.recyclerview.widget.RecyclerView$l r9 = r9.getLayoutManager()
            if (r9 == 0) goto L_0x0096
            androidx.recyclerview.widget.RecyclerView r9 = r8.f2003d
            androidx.recyclerview.widget.RecyclerView$l r9 = r9.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r1 = r9.f1711b
            androidx.recyclerview.widget.RecyclerView$r r2 = r1.f1654c
            r2 = 4096(0x1000, float:5.74E-42)
            if (r10 == r2) goto L_0x0058
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r10 == r2) goto L_0x002c
            r3 = 0
            r4 = 0
            goto L_0x0086
        L_0x002c:
            r10 = -1
            boolean r1 = r1.canScrollVertically(r10)
            if (r1 == 0) goto L_0x0041
            int r1 = r9.f1724o
            int r2 = r9.P()
            int r1 = r1 - r2
            int r2 = r9.M()
            int r1 = r1 - r2
            int r1 = -r1
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            androidx.recyclerview.widget.RecyclerView r2 = r9.f1711b
            boolean r10 = r2.canScrollHorizontally(r10)
            if (r10 == 0) goto L_0x0084
            int r10 = r9.f1723n
            int r2 = r9.N()
            int r10 = r10 - r2
            int r2 = r9.O()
            int r10 = r10 - r2
            int r10 = -r10
            goto L_0x0081
        L_0x0058:
            boolean r10 = r1.canScrollVertically(r11)
            if (r10 == 0) goto L_0x006c
            int r10 = r9.f1724o
            int r1 = r9.P()
            int r10 = r10 - r1
            int r1 = r9.M()
            int r10 = r10 - r1
            r1 = r10
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView r10 = r9.f1711b
            boolean r10 = r10.canScrollHorizontally(r11)
            if (r10 == 0) goto L_0x0084
            int r10 = r9.f1723n
            int r2 = r9.N()
            int r10 = r10 - r2
            int r2 = r9.O()
            int r10 = r10 - r2
        L_0x0081:
            r3 = r10
            r4 = r1
            goto L_0x0086
        L_0x0084:
            r4 = r1
            r3 = 0
        L_0x0086:
            if (r4 != 0) goto L_0x008c
            if (r3 != 0) goto L_0x008c
            r11 = 0
            goto L_0x0095
        L_0x008c:
            androidx.recyclerview.widget.RecyclerView r2 = r9.f1711b
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1
            r2.g0(r3, r4, r5, r6, r7)
        L_0x0095:
            return r11
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.y.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public boolean j() {
        return this.f2003d.M();
    }
}
