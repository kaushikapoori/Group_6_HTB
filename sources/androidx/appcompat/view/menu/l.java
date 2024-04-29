package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public class l extends e implements SubMenu {
    public g A;

    /* renamed from: z  reason: collision with root package name */
    public e f305z;

    public l(Context context, e eVar, g gVar) {
        super(context);
        this.f305z = eVar;
        this.A = gVar;
    }

    public boolean d(g gVar) {
        return this.f305z.d(gVar);
    }

    public boolean e(e eVar, MenuItem menuItem) {
        return super.e(eVar, menuItem) || this.f305z.e(eVar, menuItem);
    }

    public boolean f(g gVar) {
        return this.f305z.f(gVar);
    }

    public MenuItem getItem() {
        return this.A;
    }

    public String j() {
        g gVar = this.A;
        int i2 = gVar != null ? gVar.f243a : 0;
        if (i2 == 0) {
            return null;
        }
        return "android:menu:actionviewstates" + ":" + i2;
    }

    public e k() {
        return this.f305z.k();
    }

    public boolean m() {
        return this.f305z.m();
    }

    public boolean n() {
        return this.f305z.n();
    }

    public boolean o() {
        return this.f305z.o();
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.f305z.setGroupDividerEnabled(z2);
    }

    public SubMenu setHeaderIcon(int i2) {
        w(0, (CharSequence) null, i2, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setHeaderTitle(int i2) {
        w(i2, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        w(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public SubMenu setIcon(int i2) {
        this.A.setIcon(i2);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z2) {
        this.f305z.setQwertyMode(z2);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        w(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }
}
