package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import c.a;

public abstract class y<E> extends v {

    /* renamed from: b  reason: collision with root package name */
    public final Activity f1531b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f1532c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1533d;

    /* renamed from: e  reason: collision with root package name */
    public final b0 f1534e = new c0();

    public y(q qVar) {
        Handler handler = new Handler();
        this.f1531b = qVar;
        a.d(qVar, "context == null");
        this.f1532c = qVar;
        this.f1533d = handler;
    }

    public abstract E i();

    public abstract LayoutInflater j();

    public abstract boolean k(n nVar);

    public abstract void l();
}
