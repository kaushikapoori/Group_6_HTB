package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import h0.f;

public class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f2126a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f2127b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2128c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2129d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f2130e;

    public b(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
        this.f2130e = baseBehavior;
        this.f2126a = coordinatorLayout;
        this.f2127b = appBarLayout;
        this.f2128c = view;
        this.f2129d = i2;
    }

    public boolean a(View view, f.a aVar) {
        this.f2130e.C(this.f2126a, this.f2127b, this.f2128c, this.f2129d, new int[]{0, 0});
        return true;
    }
}
