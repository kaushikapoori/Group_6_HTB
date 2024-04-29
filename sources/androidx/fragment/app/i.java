package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;

public class i implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s0 f1319b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1320c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Rect f1321d;

    public i(c cVar, s0 s0Var, View view, Rect rect) {
        this.f1319b = s0Var;
        this.f1320c = view;
        this.f1321d = rect;
    }

    public void run() {
        this.f1319b.j(this.f1320c, this.f1321d);
    }
}
