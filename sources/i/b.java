package i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import b0.c;
import m.h;

public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3203a;

    /* renamed from: b  reason: collision with root package name */
    public h<b0.b, MenuItem> f3204b;

    /* renamed from: c  reason: collision with root package name */
    public h<c, SubMenu> f3205c;

    public b(Context context) {
        this.f3203a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof b0.b)) {
            return menuItem;
        }
        b0.b bVar = (b0.b) menuItem;
        if (this.f3204b == null) {
            this.f3204b = new h<>();
        }
        MenuItem orDefault = this.f3204b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        c cVar = new c(this.f3203a, bVar);
        this.f3204b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof c)) {
            return subMenu;
        }
        c cVar = (c) subMenu;
        if (this.f3205c == null) {
            this.f3205c = new h<>();
        }
        SubMenu subMenu2 = this.f3205c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        g gVar = new g(this.f3203a, cVar);
        this.f3205c.put(cVar, gVar);
        return gVar;
    }
}
