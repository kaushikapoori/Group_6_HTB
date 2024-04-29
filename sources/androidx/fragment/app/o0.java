package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import m.a;

public class o0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ n f1423b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ n f1424c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f1425d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ a f1426e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ View f1427f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ s0 f1428g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Rect f1429h;

    public o0(n nVar, n nVar2, boolean z2, a aVar, View view, s0 s0Var, Rect rect) {
        this.f1423b = nVar;
        this.f1424c = nVar2;
        this.f1425d = z2;
        this.f1426e = aVar;
        this.f1427f = view;
        this.f1428g = s0Var;
        this.f1429h = rect;
    }

    public void run() {
        q0.c(this.f1423b, this.f1424c, this.f1425d, this.f1426e, false);
        View view = this.f1427f;
        if (view != null) {
            this.f1428g.j(view, this.f1429h);
        }
    }
}
