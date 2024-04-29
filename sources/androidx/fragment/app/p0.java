package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.q0;
import java.util.ArrayList;
import m.a;

public class p0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s0 f1431b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f1432c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f1433d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q0.b f1434e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1435f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ View f1436g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ n f1437h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ n f1438i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f1439j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1440k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ Object f1441l;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Rect f1442m;

    public p0(s0 s0Var, a aVar, Object obj, q0.b bVar, ArrayList arrayList, View view, n nVar, n nVar2, boolean z2, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f1431b = s0Var;
        this.f1432c = aVar;
        this.f1433d = obj;
        this.f1434e = bVar;
        this.f1435f = arrayList;
        this.f1436g = view;
        this.f1437h = nVar;
        this.f1438i = nVar2;
        this.f1439j = z2;
        this.f1440k = arrayList2;
        this.f1441l = obj2;
        this.f1442m = rect;
    }

    public void run() {
        a<String, View> e2 = q0.e(this.f1431b, this.f1432c, this.f1433d, this.f1434e);
        if (e2 != null) {
            this.f1435f.addAll(e2.values());
            this.f1435f.add(this.f1436g);
        }
        q0.c(this.f1437h, this.f1438i, this.f1439j, e2, false);
        Object obj = this.f1433d;
        if (obj != null) {
            this.f1431b.x(obj, this.f1440k, this.f1435f);
            View k2 = q0.k(e2, this.f1434e, this.f1441l, this.f1439j);
            if (k2 != null) {
                this.f1431b.j(k2, this.f1442m);
            }
        }
    }
}
