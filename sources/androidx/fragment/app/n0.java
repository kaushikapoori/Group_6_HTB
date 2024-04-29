package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

public class n0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1414b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ s0 f1415c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ View f1416d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f1417e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1418f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1419g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ArrayList f1420h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Object f1421i;

    public n0(Object obj, s0 s0Var, View view, n nVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f1414b = obj;
        this.f1415c = s0Var;
        this.f1416d = view;
        this.f1417e = nVar;
        this.f1418f = arrayList;
        this.f1419g = arrayList2;
        this.f1420h = arrayList3;
        this.f1421i = obj2;
    }

    public void run() {
        Object obj = this.f1414b;
        if (obj != null) {
            this.f1415c.o(obj, this.f1416d);
            this.f1419g.addAll(q0.h(this.f1415c, this.f1414b, this.f1417e, this.f1418f, this.f1416d));
        }
        if (this.f1420h != null) {
            if (this.f1421i != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f1416d);
                this.f1415c.p(this.f1421i, this.f1420h, arrayList);
            }
            this.f1420h.clear();
            this.f1420h.add(this.f1416d);
        }
    }
}
