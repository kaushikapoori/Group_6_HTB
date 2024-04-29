package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import c0.b;

public class g implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1293a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1294b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.b f1295c;

    public g(c cVar, View view, ViewGroup viewGroup, c.b bVar) {
        this.f1293a = view;
        this.f1294b = viewGroup;
        this.f1295c = bVar;
    }

    public void a() {
        this.f1293a.clearAnimation();
        this.f1294b.endViewTransition(this.f1293a);
        this.f1295c.a();
    }
}
