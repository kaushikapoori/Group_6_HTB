package a1;

import android.view.View;
import g0.u;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final View f36a;

    /* renamed from: b  reason: collision with root package name */
    public int f37b;

    /* renamed from: c  reason: collision with root package name */
    public int f38c;

    /* renamed from: d  reason: collision with root package name */
    public int f39d;

    /* renamed from: e  reason: collision with root package name */
    public int f40e;

    public e(View view) {
        this.f36a = view;
    }

    public void a() {
        View view = this.f36a;
        u.o(view, this.f39d - (view.getTop() - this.f37b));
        View view2 = this.f36a;
        u.n(view2, this.f40e - (view2.getLeft() - this.f38c));
    }
}
