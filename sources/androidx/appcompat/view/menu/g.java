package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import b0.b;
import g0.b;
import java.util.Objects;

public final class g implements b {
    public g0.b A;
    public MenuItem.OnActionExpandListener B;
    public boolean C = false;
    public ContextMenu.ContextMenuInfo D;

    /* renamed from: a  reason: collision with root package name */
    public final int f243a;

    /* renamed from: b  reason: collision with root package name */
    public final int f244b;

    /* renamed from: c  reason: collision with root package name */
    public final int f245c;

    /* renamed from: d  reason: collision with root package name */
    public final int f246d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f247e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f248f;

    /* renamed from: g  reason: collision with root package name */
    public Intent f249g;

    /* renamed from: h  reason: collision with root package name */
    public char f250h;

    /* renamed from: i  reason: collision with root package name */
    public int f251i = 4096;

    /* renamed from: j  reason: collision with root package name */
    public char f252j;

    /* renamed from: k  reason: collision with root package name */
    public int f253k = 4096;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f254l;

    /* renamed from: m  reason: collision with root package name */
    public int f255m = 0;

    /* renamed from: n  reason: collision with root package name */
    public e f256n;

    /* renamed from: o  reason: collision with root package name */
    public l f257o;

    /* renamed from: p  reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f258p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f259q;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f260r;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f261s = null;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuff.Mode f262t = null;

    /* renamed from: u  reason: collision with root package name */
    public boolean f263u = false;

    /* renamed from: v  reason: collision with root package name */
    public boolean f264v = false;

    /* renamed from: w  reason: collision with root package name */
    public boolean f265w = false;

    /* renamed from: x  reason: collision with root package name */
    public int f266x = 16;

    /* renamed from: y  reason: collision with root package name */
    public int f267y = 0;

    /* renamed from: z  reason: collision with root package name */
    public View f268z;

    public class a implements b.a {
        public a() {
        }
    }

    public g(e eVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f256n = eVar;
        this.f243a = i3;
        this.f244b = i2;
        this.f245c = i4;
        this.f246d = i5;
        this.f247e = charSequence;
        this.f267y = i6;
    }

    public static void c(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    public g0.b a() {
        return this.A;
    }

    public b0.b b(g0.b bVar) {
        g0.b bVar2 = this.A;
        if (bVar2 != null) {
            bVar2.f2997a = null;
        }
        this.f268z = null;
        this.A = bVar;
        this.f256n.p(true);
        g0.b bVar3 = this.A;
        if (bVar3 != null) {
            bVar3.h(new a());
        }
        return this;
    }

    public boolean collapseActionView() {
        if ((this.f267y & 8) == 0) {
            return false;
        }
        if (this.f268z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f256n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f265w && (this.f263u || this.f264v)) {
            drawable = a0.a.g(drawable).mutate();
            if (this.f263u) {
                drawable.setTintList(this.f261s);
            }
            if (this.f264v) {
                drawable.setTintMode(this.f262t);
            }
            this.f265w = false;
        }
        return drawable;
    }

    public char e() {
        return this.f256n.n() ? this.f252j : this.f250h;
    }

    public boolean expandActionView() {
        if (!f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f256n.f(this);
        }
        return false;
    }

    public boolean f() {
        g0.b bVar;
        if ((this.f267y & 8) == 0) {
            return false;
        }
        if (this.f268z == null && (bVar = this.A) != null) {
            this.f268z = bVar.d(this);
        }
        return this.f268z != null;
    }

    public boolean g() {
        return (this.f266x & 32) == 32;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f268z;
        if (view != null) {
            return view;
        }
        g0.b bVar = this.A;
        if (bVar == null) {
            return null;
        }
        View d2 = bVar.d(this);
        this.f268z = d2;
        return d2;
    }

    public int getAlphabeticModifiers() {
        return this.f253k;
    }

    public char getAlphabeticShortcut() {
        return this.f252j;
    }

    public CharSequence getContentDescription() {
        return this.f259q;
    }

    public int getGroupId() {
        return this.f244b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f254l;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.f255m;
        if (i2 == 0) {
            return null;
        }
        Drawable b2 = e.a.b(this.f256n.f216a, i2);
        this.f255m = 0;
        this.f254l = b2;
        return d(b2);
    }

    public ColorStateList getIconTintList() {
        return this.f261s;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f262t;
    }

    public Intent getIntent() {
        return this.f249g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f243a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.D;
    }

    public int getNumericModifiers() {
        return this.f251i;
    }

    public char getNumericShortcut() {
        return this.f250h;
    }

    public int getOrder() {
        return this.f245c;
    }

    public SubMenu getSubMenu() {
        return this.f257o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f247e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f248f;
        return charSequence != null ? charSequence : this.f247e;
    }

    public CharSequence getTooltipText() {
        return this.f260r;
    }

    public boolean h() {
        return (this.f266x & 4) != 0;
    }

    public boolean hasSubMenu() {
        return this.f257o != null;
    }

    public b0.b i(View view) {
        int i2;
        this.f268z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f243a) > 0) {
            view.setId(i2);
        }
        e eVar = this.f256n;
        eVar.f226k = true;
        eVar.p(true);
        return this;
    }

    public boolean isActionViewExpanded() {
        return this.C;
    }

    public boolean isCheckable() {
        return (this.f266x & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f266x & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f266x & 16) != 0;
    }

    public boolean isVisible() {
        g0.b bVar = this.A;
        return (bVar == null || !bVar.g()) ? (this.f266x & 8) == 0 : (this.f266x & 8) == 0 && this.A.b();
    }

    public void j(boolean z2) {
        int i2 = this.f266x;
        int i3 = (z2 ? 2 : 0) | (i2 & -3);
        this.f266x = i3;
        if (i2 != i3) {
            this.f256n.p(false);
        }
    }

    public void k(boolean z2) {
        this.f266x = z2 ? this.f266x | 32 : this.f266x & -33;
    }

    public boolean l(boolean z2) {
        int i2 = this.f266x;
        int i3 = (z2 ? 0 : 8) | (i2 & -9);
        this.f266x = i3;
        return i2 != i3;
    }

    public boolean m() {
        return this.f256n.o() && e() != 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setActionView(int i2) {
        Context context = this.f256n.f216a;
        i(LayoutInflater.from(context).inflate(i2, new LinearLayout(context), false));
        return this;
    }

    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        i(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f252j == c2) {
            return this;
        }
        this.f252j = Character.toLowerCase(c2);
        this.f256n.p(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f252j == c2 && this.f253k == i2) {
            return this;
        }
        this.f252j = Character.toLowerCase(c2);
        this.f253k = KeyEvent.normalizeMetaState(i2);
        this.f256n.p(false);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        int i2 = this.f266x;
        boolean z3 = z2 | (i2 & true);
        this.f266x = z3 ? 1 : 0;
        if (i2 != z3) {
            this.f256n.p(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        if ((this.f266x & 4) != 0) {
            e eVar = this.f256n;
            Objects.requireNonNull(eVar);
            int groupId = getGroupId();
            int size = eVar.f221f.size();
            eVar.y();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = eVar.f221f.get(i2);
                if (gVar.f244b == groupId && gVar.h() && gVar.isCheckable()) {
                    gVar.j(gVar == this);
                }
            }
            eVar.x();
        } else {
            j(z2);
        }
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f259q = charSequence;
        this.f256n.p(false);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public b0.b m0setContentDescription(CharSequence charSequence) {
        this.f259q = charSequence;
        this.f256n.p(false);
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        this.f266x = z2 ? this.f266x | 16 : this.f266x & -17;
        this.f256n.p(false);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f254l = null;
        this.f255m = i2;
        this.f265w = true;
        this.f256n.p(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f255m = 0;
        this.f254l = drawable;
        this.f265w = true;
        this.f256n.p(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f261s = colorStateList;
        this.f263u = true;
        this.f265w = true;
        this.f256n.p(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f262t = mode;
        this.f264v = true;
        this.f265w = true;
        this.f256n.p(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f249g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        if (this.f250h == c2) {
            return this;
        }
        this.f250h = c2;
        this.f256n.p(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.f250h == c2 && this.f251i == i2) {
            return this;
        }
        this.f250h = c2;
        this.f251i = KeyEvent.normalizeMetaState(i2);
        this.f256n.p(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f258p = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f250h = c2;
        this.f252j = Character.toLowerCase(c3);
        this.f256n.p(false);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f250h = c2;
        this.f251i = KeyEvent.normalizeMetaState(i2);
        this.f252j = Character.toLowerCase(c3);
        this.f253k = KeyEvent.normalizeMetaState(i3);
        this.f256n.p(false);
        return this;
    }

    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.f267y = i2;
            e eVar = this.f256n;
            eVar.f226k = true;
            eVar.p(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        setTitle((CharSequence) this.f256n.f216a.getString(i2));
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f247e = charSequence;
        this.f256n.p(false);
        l lVar = this.f257o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f248f = charSequence;
        this.f256n.p(false);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f260r = charSequence;
        this.f256n.p(false);
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public b0.b m1setTooltipText(CharSequence charSequence) {
        this.f260r = charSequence;
        this.f256n.p(false);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        if (l(z2)) {
            e eVar = this.f256n;
            eVar.f223h = true;
            eVar.p(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f247e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }
}
