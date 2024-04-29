package i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import b0.a;
import b0.b;
import b0.c;
import m.h;

public class e extends b implements Menu {

    /* renamed from: d  reason: collision with root package name */
    public final a f3217d;

    public e(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f3217d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i2) {
        return c(this.f3217d.add(i2));
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return c(this.f3217d.add(i2, i3, i4, i5));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return c(this.f3217d.add(i2, i3, i4, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return c(this.f3217d.add(charSequence));
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f3217d.addIntentOptions(i2, i3, i4, componentName, intentArr, intent, i5, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i6 = 0; i6 < length; i6++) {
                menuItemArr2[i6] = c(menuItemArr3[i6]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i2) {
        return d(this.f3217d.addSubMenu(i2));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return d(this.f3217d.addSubMenu(i2, i3, i4, i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        return d(this.f3217d.addSubMenu(i2, i3, i4, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f3217d.addSubMenu(charSequence));
    }

    public void clear() {
        h<b, MenuItem> hVar = this.f3204b;
        if (hVar != null) {
            hVar.clear();
        }
        h<c, SubMenu> hVar2 = this.f3205c;
        if (hVar2 != null) {
            hVar2.clear();
        }
        this.f3217d.clear();
    }

    public void close() {
        this.f3217d.close();
    }

    public MenuItem findItem(int i2) {
        return c(this.f3217d.findItem(i2));
    }

    public MenuItem getItem(int i2) {
        return c(this.f3217d.getItem(i2));
    }

    public boolean hasVisibleItems() {
        return this.f3217d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return this.f3217d.isShortcutKey(i2, keyEvent);
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return this.f3217d.performIdentifierAction(i2, i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        return this.f3217d.performShortcut(i2, keyEvent, i3);
    }

    public void removeGroup(int i2) {
        if (this.f3204b != null) {
            int i3 = 0;
            while (true) {
                h<b, MenuItem> hVar = this.f3204b;
                if (i3 >= hVar.f3377d) {
                    break;
                }
                if (hVar.h(i3).getGroupId() == i2) {
                    this.f3204b.i(i3);
                    i3--;
                }
                i3++;
            }
        }
        this.f3217d.removeGroup(i2);
    }

    public void removeItem(int i2) {
        if (this.f3204b != null) {
            int i3 = 0;
            while (true) {
                h<b, MenuItem> hVar = this.f3204b;
                if (i3 >= hVar.f3377d) {
                    break;
                } else if (hVar.h(i3).getItemId() == i2) {
                    this.f3204b.i(i3);
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.f3217d.removeItem(i2);
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        this.f3217d.setGroupCheckable(i2, z2, z3);
    }

    public void setGroupEnabled(int i2, boolean z2) {
        this.f3217d.setGroupEnabled(i2, z2);
    }

    public void setGroupVisible(int i2, boolean z2) {
        this.f3217d.setGroupVisible(i2, z2);
    }

    public void setQwertyMode(boolean z2) {
        this.f3217d.setQwertyMode(z2);
    }

    public int size() {
        return this.f3217d.size();
    }
}
