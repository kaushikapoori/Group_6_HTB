package i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import g0.b;
import java.lang.reflect.Method;

public class c extends b implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    public final b0.b f3206d;

    /* renamed from: e  reason: collision with root package name */
    public Method f3207e;

    public class a extends g0.b {

        /* renamed from: b  reason: collision with root package name */
        public final ActionProvider f3208b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f3208b = actionProvider;
        }

        public boolean a() {
            return this.f3208b.hasSubMenu();
        }

        public View c() {
            return this.f3208b.onCreateActionView();
        }

        public boolean e() {
            return this.f3208b.onPerformDefaultAction();
        }

        public void f(SubMenu subMenu) {
            this.f3208b.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: d  reason: collision with root package name */
        public b.a f3210d;

        public b(c cVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public boolean b() {
            return this.f3208b.isVisible();
        }

        public View d(MenuItem menuItem) {
            return this.f3208b.onCreateActionView(menuItem);
        }

        public boolean g() {
            return this.f3208b.overridesItemVisibility();
        }

        public void h(b.a aVar) {
            this.f3210d = aVar;
            this.f3208b.setVisibilityListener(this);
        }

        public void onActionProviderVisibilityChanged(boolean z2) {
            b.a aVar = this.f3210d;
            if (aVar != null) {
                androidx.appcompat.view.menu.e eVar = g.this.f256n;
                eVar.f223h = true;
                eVar.p(true);
            }
        }
    }

    /* renamed from: i.c$c  reason: collision with other inner class name */
    public static class C0036c extends FrameLayout implements h.b {

        /* renamed from: b  reason: collision with root package name */
        public final CollapsibleActionView f3211b;

        public C0036c(View view) {
            super(view.getContext());
            this.f3211b = (CollapsibleActionView) view;
            addView(view);
        }

        public void a() {
            this.f3211b.onActionViewExpanded();
        }

        public void e() {
            this.f3211b.onActionViewCollapsed();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f3212a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f3212a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f3212a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f3212a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f3214a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f3214a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f3214a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, b0.b bVar) {
        super(context);
        if (bVar != null) {
            this.f3206d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f3206d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f3206d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        g0.b a2 = this.f3206d.a();
        if (a2 instanceof a) {
            return ((a) a2).f3208b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f3206d.getActionView();
        return actionView instanceof C0036c ? (View) ((C0036c) actionView).f3211b : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f3206d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f3206d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f3206d.getContentDescription();
    }

    public int getGroupId() {
        return this.f3206d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f3206d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f3206d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3206d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f3206d.getIntent();
    }

    public int getItemId() {
        return this.f3206d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f3206d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f3206d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f3206d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f3206d.getOrder();
    }

    public SubMenu getSubMenu() {
        return d(this.f3206d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f3206d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f3206d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f3206d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f3206d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f3206d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f3206d.isCheckable();
    }

    public boolean isChecked() {
        return this.f3206d.isChecked();
    }

    public boolean isEnabled() {
        return this.f3206d.isEnabled();
    }

    public boolean isVisible() {
        return this.f3206d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this, this.f3203a, actionProvider);
        b0.b bVar2 = this.f3206d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.b(bVar);
        return this;
    }

    public MenuItem setActionView(int i2) {
        this.f3206d.setActionView(i2);
        View actionView = this.f3206d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f3206d.setActionView((View) new C0036c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0036c(view);
        }
        this.f3206d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f3206d.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f3206d.setAlphabeticShortcut(c2, i2);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        this.f3206d.setCheckable(z2);
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        this.f3206d.setChecked(z2);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f3206d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        this.f3206d.setEnabled(z2);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.f3206d.setIcon(i2);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f3206d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3206d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3206d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f3206d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f3206d.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f3206d.setNumericShortcut(c2, i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f3206d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f3206d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f3206d.setShortcut(c2, c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3206d.setShortcut(c2, c3, i2, i3);
        return this;
    }

    public void setShowAsAction(int i2) {
        this.f3206d.setShowAsAction(i2);
    }

    public MenuItem setShowAsActionFlags(int i2) {
        this.f3206d.setShowAsActionFlags(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.f3206d.setTitle(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f3206d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3206d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f3206d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        return this.f3206d.setVisible(z2);
    }
}
