package i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b0.b;
import x.a;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f3187a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f3188b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f3189c;

    /* renamed from: d  reason: collision with root package name */
    public char f3190d;

    /* renamed from: e  reason: collision with root package name */
    public int f3191e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public char f3192f;

    /* renamed from: g  reason: collision with root package name */
    public int f3193g = 4096;

    /* renamed from: h  reason: collision with root package name */
    public Drawable f3194h;

    /* renamed from: i  reason: collision with root package name */
    public Context f3195i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f3196j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f3197k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f3198l = null;

    /* renamed from: m  reason: collision with root package name */
    public PorterDuff.Mode f3199m = null;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3200n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3201o = false;

    /* renamed from: p  reason: collision with root package name */
    public int f3202p = 16;

    public a(Context context, int i2, int i3, int i4, CharSequence charSequence) {
        this.f3195i = context;
        this.f3187a = charSequence;
    }

    public g0.b a() {
        return null;
    }

    public b b(g0.b bVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.f3194h;
        if (drawable == null) {
            return;
        }
        if (this.f3200n || this.f3201o) {
            Drawable g2 = a0.a.g(drawable);
            this.f3194h = g2;
            Drawable mutate = g2.mutate();
            this.f3194h = mutate;
            if (this.f3200n) {
                mutate.setTintList(this.f3198l);
            }
            if (this.f3201o) {
                this.f3194h.setTintMode(this.f3199m);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f3193g;
    }

    public char getAlphabeticShortcut() {
        return this.f3192f;
    }

    public CharSequence getContentDescription() {
        return this.f3196j;
    }

    public int getGroupId() {
        return 0;
    }

    public Drawable getIcon() {
        return this.f3194h;
    }

    public ColorStateList getIconTintList() {
        return this.f3198l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3199m;
    }

    public Intent getIntent() {
        return this.f3189c;
    }

    public int getItemId() {
        return 16908332;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f3191e;
    }

    public char getNumericShortcut() {
        return this.f3190d;
    }

    public int getOrder() {
        return 0;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f3187a;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f3188b;
        return charSequence != null ? charSequence : this.f3187a;
    }

    public CharSequence getTooltipText() {
        return this.f3197k;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f3202p & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f3202p & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f3202p & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f3202p & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f3192f = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f3192f = Character.toLowerCase(c2);
        this.f3193g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        this.f3202p = z2 | (this.f3202p & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        this.f3202p = (z2 ? 2 : 0) | (this.f3202p & -3);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f3196j = charSequence;
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public b m15setContentDescription(CharSequence charSequence) {
        this.f3196j = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        this.f3202p = (z2 ? 16 : 0) | (this.f3202p & -17);
        return this;
    }

    public MenuItem setIcon(int i2) {
        Context context = this.f3195i;
        Object obj = x.a.f4298a;
        this.f3194h = a.b.b(context, i2);
        c();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f3194h = drawable;
        c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f3198l = colorStateList;
        this.f3200n = true;
        c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f3199m = mode;
        this.f3201o = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f3189c = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f3190d = c2;
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f3190d = c2;
        this.f3191e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f3190d = c2;
        this.f3192f = Character.toLowerCase(c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f3190d = c2;
        this.f3191e = KeyEvent.normalizeMetaState(i2);
        this.f3192f = Character.toLowerCase(c3);
        this.f3193g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public void setShowAsAction(int i2) {
    }

    public MenuItem setShowAsActionFlags(int i2) {
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.f3187a = this.f3195i.getResources().getString(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f3187a = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f3188b = charSequence;
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f3197k = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public b m16setTooltipText(CharSequence charSequence) {
        this.f3197k = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        int i2 = 8;
        int i3 = this.f3202p & 8;
        if (z2) {
            i2 = 0;
        }
        this.f3202p = i3 | i2;
        return this;
    }

    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }
}
