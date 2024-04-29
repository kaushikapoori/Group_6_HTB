package d;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import m.c;

public abstract class j {

    /* renamed from: b  reason: collision with root package name */
    public static final c<WeakReference<j>> f2703b = new c<>();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f2704c = new Object();

    public static void s(j jVar) {
        synchronized (f2704c) {
            Iterator<WeakReference<j>> it = f2703b.iterator();
            while (it.hasNext()) {
                j jVar2 = (j) it.next().get();
                if (jVar2 == jVar || jVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i2);

    public int f() {
        return -100;
    }

    public abstract MenuInflater g();

    public abstract a h();

    public abstract void i();

    public abstract void j();

    public abstract void k(Configuration configuration);

    public abstract void l(Bundle bundle);

    public abstract void m();

    public abstract void n(Bundle bundle);

    public abstract void o();

    public abstract void p(Bundle bundle);

    public abstract void q();

    public abstract void r();

    public abstract boolean t(int i2);

    public abstract void u(int i2);

    public abstract void v(View view);

    public abstract void w(View view, ViewGroup.LayoutParams layoutParams);

    public void x(int i2) {
    }

    public abstract void y(CharSequence charSequence);
}
