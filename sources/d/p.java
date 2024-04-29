package d;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import g0.e;
import h.a;
import java.lang.ref.WeakReference;
import m.c;

public class p extends Dialog implements i {

    /* renamed from: b  reason: collision with root package name */
    public j f2767b;

    /* renamed from: c  reason: collision with root package name */
    public final e.a f2768c;

    public class a implements e.a {
        public a() {
        }

        public boolean h(KeyEvent keyEvent) {
            return p.this.c(keyEvent);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130903366(0x7f030146, float:1.7413548E38)
            if (r6 != 0) goto L_0x0015
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L_0x0016
        L_0x0015:
            r2 = r6
        L_0x0016:
            r4.<init>(r5, r2)
            d.p$a r2 = new d.p$a
            r2.<init>()
            r4.f2768c = r2
            d.j r2 = r4.a()
            if (r6 != 0) goto L_0x0034
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L_0x0034:
            r2.x(r6)
            r5 = 0
            r2.l(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.p.<init>(android.content.Context, int):void");
    }

    public j a() {
        if (this.f2767b == null) {
            c<WeakReference<j>> cVar = j.f2703b;
            this.f2767b = new k(getContext(), getWindow(), this, this);
        }
        return this.f2767b;
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public h.a b(a.C0033a aVar) {
        return null;
    }

    public boolean c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void dismiss() {
        super.dismiss();
        a().m();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return e.b(this.f2768c, getWindow().getDecorView(), this, keyEvent);
    }

    public void e(h.a aVar) {
    }

    public <T extends View> T findViewById(int i2) {
        return a().e(i2);
    }

    public void i(h.a aVar) {
    }

    public void invalidateOptionsMenu() {
        a().j();
    }

    public void onCreate(Bundle bundle) {
        a().i();
        super.onCreate(bundle);
        a().l(bundle);
    }

    public void onStop() {
        super.onStop();
        a().r();
    }

    public void setContentView(int i2) {
        a().u(i2);
    }

    public void setContentView(View view) {
        a().v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().w(view, layoutParams);
    }

    public void setTitle(int i2) {
        super.setTitle(i2);
        a().y(getContext().getString(i2));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().y(charSequence);
    }
}
