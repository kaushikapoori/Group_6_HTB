package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import i.a;

public class c1 implements View.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final a f555b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d1 f556c;

    public c1(d1 d1Var) {
        this.f556c = d1Var;
        this.f555b = new a(d1Var.f567a.getContext(), 0, 16908332, 0, d1Var.f575i);
    }

    public void onClick(View view) {
        d1 d1Var = this.f556c;
        Window.Callback callback = d1Var.f578l;
        if (callback != null && d1Var.f579m) {
            callback.onMenuItemSelected(0, this.f555b);
        }
    }
}
