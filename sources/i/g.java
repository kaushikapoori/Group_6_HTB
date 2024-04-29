package i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b0.c;

public class g extends e implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    public final c f3218e;

    public g(Context context, c cVar) {
        super(context, cVar);
        this.f3218e = cVar;
    }

    public void clearHeader() {
        this.f3218e.clearHeader();
    }

    public MenuItem getItem() {
        return c(this.f3218e.getItem());
    }

    public SubMenu setHeaderIcon(int i2) {
        this.f3218e.setHeaderIcon(i2);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f3218e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i2) {
        this.f3218e.setHeaderTitle(i2);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f3218e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f3218e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i2) {
        this.f3218e.setIcon(i2);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f3218e.setIcon(drawable);
        return this;
    }
}
