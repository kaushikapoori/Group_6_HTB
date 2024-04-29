package h;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.c;
import h.a;
import java.lang.ref.WeakReference;

public class d extends a implements e.a {

    /* renamed from: d  reason: collision with root package name */
    public Context f3098d;

    /* renamed from: e  reason: collision with root package name */
    public ActionBarContextView f3099e;

    /* renamed from: f  reason: collision with root package name */
    public a.C0033a f3100f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<View> f3101g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3102h;

    /* renamed from: i  reason: collision with root package name */
    public e f3103i;

    public d(Context context, ActionBarContextView actionBarContextView, a.C0033a aVar, boolean z2) {
        this.f3098d = context;
        this.f3099e = actionBarContextView;
        this.f3100f = aVar;
        e eVar = new e(actionBarContextView.getContext());
        eVar.f227l = 1;
        this.f3103i = eVar;
        eVar.f220e = this;
    }

    public void a(e eVar) {
        i();
        c cVar = this.f3099e.f479e;
        if (cVar != null) {
            cVar.n();
        }
    }

    public boolean b(e eVar, MenuItem menuItem) {
        return this.f3100f.b(this, menuItem);
    }

    public void c() {
        if (!this.f3102h) {
            this.f3102h = true;
            this.f3100f.c(this);
        }
    }

    public View d() {
        WeakReference<View> weakReference = this.f3101g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public Menu e() {
        return this.f3103i;
    }

    public MenuInflater f() {
        return new g(this.f3099e.getContext());
    }

    public CharSequence g() {
        return this.f3099e.getSubtitle();
    }

    public CharSequence h() {
        return this.f3099e.getTitle();
    }

    public void i() {
        this.f3100f.a(this, this.f3103i);
    }

    public boolean j() {
        return this.f3099e.f326t;
    }

    public void k(View view) {
        this.f3099e.setCustomView(view);
        this.f3101g = view != null ? new WeakReference<>(view) : null;
    }

    public void l(int i2) {
        this.f3099e.setSubtitle(this.f3098d.getString(i2));
    }

    public void m(CharSequence charSequence) {
        this.f3099e.setSubtitle(charSequence);
    }

    public void n(int i2) {
        this.f3099e.setTitle(this.f3098d.getString(i2));
    }

    public void o(CharSequence charSequence) {
        this.f3099e.setTitle(charSequence);
    }

    public void p(boolean z2) {
        this.f3092c = z2;
        this.f3099e.setTitleOptional(z2);
    }
}
