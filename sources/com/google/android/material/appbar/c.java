package com.google.android.material.appbar;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import h0.f;

public class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f2131a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f2132b;

    public c(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z2) {
        this.f2131a = appBarLayout;
        this.f2132b = z2;
    }

    public boolean a(View view, f.a aVar) {
        this.f2131a.setExpanded(this.f2132b);
        return true;
    }
}
