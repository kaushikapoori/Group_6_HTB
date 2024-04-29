package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public final class g<S> extends y<S> {

    /* renamed from: e0  reason: collision with root package name */
    public static final /* synthetic */ int f2341e0 = 0;
    public int U;
    public d<S> V;
    public a W;
    public t X;
    public int Y;
    public c Z;

    /* renamed from: a0  reason: collision with root package name */
    public RecyclerView f2342a0;

    /* renamed from: b0  reason: collision with root package name */
    public RecyclerView f2343b0;

    /* renamed from: c0  reason: collision with root package name */
    public View f2344c0;

    /* renamed from: d0  reason: collision with root package name */
    public View f2345d0;

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f2346b;

        public a(int i2) {
            this.f2346b = i2;
        }

        public void run() {
            RecyclerView recyclerView = g.this.f2343b0;
            int i2 = this.f2346b;
            if (!recyclerView.f1693w) {
                RecyclerView.l lVar = recyclerView.f1674m;
                if (lVar == null) {
                    Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else {
                    lVar.G0(recyclerView, recyclerView.f1659e0, i2);
                }
            }
        }
    }

    public class b extends g0.a {
        public b(g gVar) {
        }

        public void d(View view, h0.d dVar) {
            this.f2994a.onInitializeAccessibilityNodeInfo(view, dVar.f3160a);
            dVar.i((Object) null);
        }
    }

    public class c extends z {
        public final /* synthetic */ int E;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, int i2, boolean z2, int i3) {
            super(context, i2, z2);
            this.E = i3;
        }

        public void J0(RecyclerView.w wVar, int[] iArr) {
            if (this.E == 0) {
                iArr[0] = g.this.f2343b0.getWidth();
                iArr[1] = g.this.f2343b0.getWidth();
                return;
            }
            iArr[0] = g.this.f2343b0.getHeight();
            iArr[1] = g.this.f2343b0.getHeight();
        }
    }

    public class d implements e {
        public d() {
        }
    }

    public interface e {
    }

    public void G(Bundle bundle) {
        super.G(bundle);
        if (bundle == null) {
            bundle = this.f1376g;
        }
        this.U = bundle.getInt("THEME_RES_ID_KEY");
        this.V = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.W = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.X = (t) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0185, code lost:
        r13 = new androidx.recyclerview.widget.v();
        r0 = r10.f2343b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View H(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            android.view.ContextThemeWrapper r13 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r10.j()
            int r1 = r10.U
            r13.<init>(r0, r1)
            com.google.android.material.datepicker.c r0 = new com.google.android.material.datepicker.c
            r0.<init>(r13)
            r10.Z = r0
            android.view.LayoutInflater r11 = r11.cloneInContext(r13)
            com.google.android.material.datepicker.a r0 = r10.W
            com.google.android.material.datepicker.t r0 = r0.f2302b
            boolean r1 = com.google.android.material.datepicker.o.j0(r13)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0027
            r1 = 2131427406(0x7f0b004e, float:1.8476427E38)
            r9 = 1
            goto L_0x002b
        L_0x0027:
            r1 = 2131427401(0x7f0b0049, float:1.8476417E38)
            r9 = 0
        L_0x002b:
            android.view.View r11 = r11.inflate(r1, r12, r2)
            android.content.Context r12 = r10.U()
            android.content.res.Resources r12 = r12.getResources()
            r1 = 2131100076(0x7f0601ac, float:1.7812523E38)
            int r1 = r12.getDimensionPixelSize(r1)
            r4 = 2131100077(0x7f0601ad, float:1.7812525E38)
            int r4 = r12.getDimensionPixelOffset(r4)
            int r4 = r4 + r1
            r1 = 2131100075(0x7f0601ab, float:1.7812521E38)
            int r1 = r12.getDimensionPixelOffset(r1)
            int r1 = r1 + r4
            r4 = 2131100060(0x7f06019c, float:1.781249E38)
            int r4 = r12.getDimensionPixelSize(r4)
            int r5 = com.google.android.material.datepicker.u.f2394g
            r6 = 2131100055(0x7f060197, float:1.781248E38)
            int r6 = r12.getDimensionPixelSize(r6)
            int r6 = r6 * r5
            int r5 = r5 + -1
            r7 = 2131100074(0x7f0601aa, float:1.781252E38)
            int r7 = r12.getDimensionPixelOffset(r7)
            int r7 = r7 * r5
            int r7 = r7 + r6
            r5 = 2131100052(0x7f060194, float:1.7812475E38)
            int r12 = r12.getDimensionPixelOffset(r5)
            int r1 = r1 + r4
            int r1 = r1 + r7
            int r1 = r1 + r12
            r11.setMinimumHeight(r1)
            r12 = 2131231007(0x7f08011f, float:1.8078083E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.GridView r12 = (android.widget.GridView) r12
            com.google.android.material.datepicker.g$b r1 = new com.google.android.material.datepicker.g$b
            r1.<init>(r10)
            g0.u.u(r12, r1)
            com.google.android.material.datepicker.f r1 = new com.google.android.material.datepicker.f
            r1.<init>()
            r12.setAdapter(r1)
            int r0 = r0.f2390e
            r12.setNumColumns(r0)
            r12.setEnabled(r2)
            r12 = 2131231010(0x7f080122, float:1.8078089E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r10.f2343b0 = r12
            com.google.android.material.datepicker.g$c r12 = new com.google.android.material.datepicker.g$c
            android.content.Context r6 = r10.j()
            r8 = 0
            r4 = r12
            r5 = r10
            r7 = r9
            r4.<init>(r6, r7, r8, r9)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f2343b0
            r0.setLayoutManager(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.f2343b0
            java.lang.String r0 = "MONTHS_VIEW_GROUP_TAG"
            r12.setTag(r0)
            com.google.android.material.datepicker.w r12 = new com.google.android.material.datepicker.w
            com.google.android.material.datepicker.d<S> r0 = r10.V
            com.google.android.material.datepicker.a r1 = r10.W
            com.google.android.material.datepicker.g$d r4 = new com.google.android.material.datepicker.g$d
            r4.<init>()
            r12.<init>(r13, r0, r1, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f2343b0
            r0.setAdapter(r12)
            android.content.res.Resources r0 = r13.getResources()
            r1 = 2131296299(0x7f09002b, float:1.821051E38)
            int r0 = r0.getInteger(r1)
            r1 = 2131231013(0x7f080125, float:1.8078095E38)
            android.view.View r4 = r11.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r10.f2342a0 = r4
            if (r4 == 0) goto L_0x010a
            r4.setHasFixedSize(r3)
            androidx.recyclerview.widget.RecyclerView r4 = r10.f2342a0
            androidx.recyclerview.widget.GridLayoutManager r5 = new androidx.recyclerview.widget.GridLayoutManager
            r5.<init>((android.content.Context) r13, (int) r0, (int) r3, (boolean) r2)
            r4.setLayoutManager(r5)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f2342a0
            com.google.android.material.datepicker.d0 r2 = new com.google.android.material.datepicker.d0
            r2.<init>(r10)
            r0.setAdapter(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r10.f2342a0
            com.google.android.material.datepicker.h r2 = new com.google.android.material.datepicker.h
            r2.<init>(r10)
            r0.g(r2)
        L_0x010a:
            r0 = 2131231000(0x7f080118, float:1.8078069E38)
            android.view.View r2 = r11.findViewById(r0)
            if (r2 == 0) goto L_0x017f
            android.view.View r0 = r11.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.String r2 = "SELECTOR_TOGGLE_TAG"
            r0.setTag(r2)
            com.google.android.material.datepicker.i r2 = new com.google.android.material.datepicker.i
            r2.<init>(r10)
            g0.u.u(r0, r2)
            r2 = 2131231002(0x7f08011a, float:1.8078073E38)
            android.view.View r2 = r11.findViewById(r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            java.lang.String r4 = "NAVIGATION_PREV_TAG"
            r2.setTag(r4)
            r4 = 2131231001(0x7f080119, float:1.807807E38)
            android.view.View r4 = r11.findViewById(r4)
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            java.lang.String r5 = "NAVIGATION_NEXT_TAG"
            r4.setTag(r5)
            android.view.View r1 = r11.findViewById(r1)
            r10.f2344c0 = r1
            r1 = 2131231006(0x7f08011e, float:1.807808E38)
            android.view.View r1 = r11.findViewById(r1)
            r10.f2345d0 = r1
            r10.i0(r3)
            com.google.android.material.datepicker.t r1 = r10.X
            java.lang.String r1 = r1.n()
            r0.setText(r1)
            androidx.recyclerview.widget.RecyclerView r1 = r10.f2343b0
            com.google.android.material.datepicker.j r3 = new com.google.android.material.datepicker.j
            r3.<init>(r10, r12, r0)
            r1.h(r3)
            com.google.android.material.datepicker.k r1 = new com.google.android.material.datepicker.k
            r1.<init>(r10)
            r0.setOnClickListener(r1)
            com.google.android.material.datepicker.l r0 = new com.google.android.material.datepicker.l
            r0.<init>(r10, r12)
            r4.setOnClickListener(r0)
            com.google.android.material.datepicker.m r0 = new com.google.android.material.datepicker.m
            r0.<init>(r10, r12)
            r2.setOnClickListener(r0)
        L_0x017f:
            boolean r13 = com.google.android.material.datepicker.o.j0(r13)
            if (r13 != 0) goto L_0x01d4
            androidx.recyclerview.widget.v r13 = new androidx.recyclerview.widget.v
            r13.<init>()
            androidx.recyclerview.widget.RecyclerView r0 = r10.f2343b0
            androidx.recyclerview.widget.RecyclerView r1 = r13.f1858a
            if (r1 != r0) goto L_0x0191
            goto L_0x01d4
        L_0x0191:
            if (r1 == 0) goto L_0x01a2
            androidx.recyclerview.widget.RecyclerView$p r2 = r13.f1859b
            java.util.List<androidx.recyclerview.widget.RecyclerView$p> r1 = r1.f1663g0
            if (r1 == 0) goto L_0x019c
            r1.remove(r2)
        L_0x019c:
            androidx.recyclerview.widget.RecyclerView r1 = r13.f1858a
            r2 = 0
            r1.setOnFlingListener(r2)
        L_0x01a2:
            r13.f1858a = r0
            if (r0 == 0) goto L_0x01d4
            androidx.recyclerview.widget.RecyclerView$n r0 = r0.getOnFlingListener()
            if (r0 != 0) goto L_0x01cc
            androidx.recyclerview.widget.RecyclerView r0 = r13.f1858a
            androidx.recyclerview.widget.RecyclerView$p r1 = r13.f1859b
            r0.h(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r13.f1858a
            r0.setOnFlingListener(r13)
            android.widget.Scroller r0 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r1 = r13.f1858a
            android.content.Context r1 = r1.getContext()
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            r0.<init>(r1, r2)
            r13.b()
            goto L_0x01d4
        L_0x01cc:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "An instance of OnFlingListener already set."
            r11.<init>(r12)
            throw r11
        L_0x01d4:
            androidx.recyclerview.widget.RecyclerView r13 = r10.f2343b0
            com.google.android.material.datepicker.t r0 = r10.X
            int r12 = r12.f(r0)
            r13.e0(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.g.H(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void M(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.U);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.V);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.W);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.X);
    }

    public boolean e0(x<S> xVar) {
        return this.T.add(xVar);
    }

    public LinearLayoutManager f0() {
        return (LinearLayoutManager) this.f2343b0.getLayoutManager();
    }

    public final void g0(int i2) {
        this.f2343b0.post(new a(i2));
    }

    public void h0(t tVar) {
        RecyclerView recyclerView;
        int i2;
        w wVar = (w) this.f2343b0.getAdapter();
        int p2 = wVar.f2402c.f2302b.p(tVar);
        int f2 = p2 - wVar.f(this.X);
        boolean z2 = true;
        boolean z3 = Math.abs(f2) > 3;
        if (f2 <= 0) {
            z2 = false;
        }
        this.X = tVar;
        if (!z3 || !z2) {
            if (z3) {
                recyclerView = this.f2343b0;
                i2 = p2 + 3;
            }
            g0(p2);
        }
        recyclerView = this.f2343b0;
        i2 = p2 - 3;
        recyclerView.e0(i2);
        g0(p2);
    }

    public void i0(int i2) {
        this.Y = i2;
        if (i2 == 2) {
            this.f2342a0.getLayoutManager().w0(((d0) this.f2342a0.getAdapter()).e(this.X.f2389d));
            this.f2344c0.setVisibility(0);
            this.f2345d0.setVisibility(8);
        } else if (i2 == 1) {
            this.f2344c0.setVisibility(8);
            this.f2345d0.setVisibility(0);
            h0(this.X);
        }
    }
}
