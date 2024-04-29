package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import g0.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import x.a;

public class e implements b0.a {

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f215y = {1, 4, 5, 3, 2, 0};

    /* renamed from: a  reason: collision with root package name */
    public final Context f216a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f217b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f218c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f219d;

    /* renamed from: e  reason: collision with root package name */
    public a f220e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<g> f221f;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<g> f222g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f223h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<g> f224i;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<g> f225j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f226k;

    /* renamed from: l  reason: collision with root package name */
    public int f227l = 0;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f228m;

    /* renamed from: n  reason: collision with root package name */
    public Drawable f229n;

    /* renamed from: o  reason: collision with root package name */
    public View f230o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f231p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f232q = false;

    /* renamed from: r  reason: collision with root package name */
    public boolean f233r = false;

    /* renamed from: s  reason: collision with root package name */
    public boolean f234s = false;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<g> f235t = new ArrayList<>();

    /* renamed from: u  reason: collision with root package name */
    public CopyOnWriteArrayList<WeakReference<i>> f236u = new CopyOnWriteArrayList<>();

    /* renamed from: v  reason: collision with root package name */
    public g f237v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f238w = false;

    /* renamed from: x  reason: collision with root package name */
    public boolean f239x;

    public interface a {
        void a(e eVar);

        boolean b(e eVar, MenuItem menuItem);
    }

    public interface b {
        boolean b(g gVar);
    }

    public e(Context context) {
        boolean z2;
        boolean z3 = false;
        this.f216a = context;
        Resources resources = context.getResources();
        this.f217b = resources;
        this.f221f = new ArrayList<>();
        this.f222g = new ArrayList<>();
        this.f223h = true;
        this.f224i = new ArrayList<>();
        this.f225j = new ArrayList<>();
        this.f226k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = w.f3084a;
            if (Build.VERSION.SDK_INT >= 28) {
                z2 = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z2 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z2) {
                z3 = true;
            }
        }
        this.f219d = z3;
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = (-65536 & i4) >> 16;
        if (i6 >= 0) {
            int[] iArr = f215y;
            if (i6 < iArr.length) {
                int i7 = (iArr[i6] << 16) | (65535 & i4);
                g gVar = new g(this, i2, i3, i4, i7, charSequence, this.f227l);
                ArrayList<g> arrayList = this.f221f;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).f246d <= i7) {
                            i5 = size + 1;
                            break;
                        }
                    } else {
                        i5 = 0;
                        break;
                    }
                }
                arrayList.add(i5, gVar);
                p(true);
                return gVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public MenuItem add(int i2) {
        return a(0, 0, 0, this.f217b.getString(i2));
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.f217b.getString(i5));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.f216a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005e
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            android.view.MenuItem r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            androidx.appcompat.view.menu.g r4 = (androidx.appcompat.view.menu.g) r4
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.setIntent(r3)
            if (r15 == 0) goto L_0x005b
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x005b
            r15[r14] = r4
        L_0x005b:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f217b.getString(i2));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.f217b.getString(i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        g gVar = (g) a(i2, i3, i4, charSequence);
        l lVar = new l(this.f216a, this, gVar);
        gVar.f257o = lVar;
        lVar.setHeaderTitle(gVar.f247e);
        return lVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(i iVar, Context context) {
        this.f236u.add(new WeakReference(iVar));
        iVar.j(context, this);
        this.f226k = true;
    }

    public final void c(boolean z2) {
        if (!this.f234s) {
            this.f234s = true;
            Iterator<WeakReference<i>> it = this.f236u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                i iVar = (i) next.get();
                if (iVar == null) {
                    this.f236u.remove(next);
                } else {
                    iVar.b(this, z2);
                }
            }
            this.f234s = false;
        }
    }

    public void clear() {
        g gVar = this.f237v;
        if (gVar != null) {
            d(gVar);
        }
        this.f221f.clear();
        p(true);
    }

    public void clearHeader() {
        this.f229n = null;
        this.f228m = null;
        this.f230o = null;
        p(false);
    }

    public void close() {
        c(true);
    }

    public boolean d(g gVar) {
        boolean z2 = false;
        if (!this.f236u.isEmpty() && this.f237v == gVar) {
            y();
            Iterator<WeakReference<i>> it = this.f236u.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                i iVar = (i) next.get();
                if (iVar == null) {
                    this.f236u.remove(next);
                } else {
                    z2 = iVar.k(this, gVar);
                    if (z2) {
                        break;
                    }
                }
            }
            x();
            if (z2) {
                this.f237v = null;
            }
        }
        return z2;
    }

    public boolean e(e eVar, MenuItem menuItem) {
        a aVar = this.f220e;
        return aVar != null && aVar.b(eVar, menuItem);
    }

    public boolean f(g gVar) {
        boolean z2 = false;
        if (this.f236u.isEmpty()) {
            return false;
        }
        y();
        Iterator<WeakReference<i>> it = this.f236u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            i iVar = (i) next.get();
            if (iVar == null) {
                this.f236u.remove(next);
            } else {
                z2 = iVar.c(this, gVar);
                if (z2) {
                    break;
                }
            }
        }
        x();
        if (z2) {
            this.f237v = gVar;
        }
        return z2;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f221f.get(i3);
            if (gVar.f243a == i2) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (findItem = gVar.f257o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public g g(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList<g> arrayList = this.f235t;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n2 = n();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = arrayList.get(i3);
            if (n2) {
                c2 = gVar.f252j;
            } else {
                c2 = gVar.f250h;
            }
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == 8 && i2 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public MenuItem getItem(int i2) {
        return this.f221f.get(i2);
    }

    public void h(List<g> list, int i2, KeyEvent keyEvent) {
        char c2;
        int i3;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f221f.size();
            for (int i4 = 0; i4 < size; i4++) {
                g gVar = this.f221f.get(i4);
                if (gVar.hasSubMenu()) {
                    gVar.f257o.h(list, i2, keyEvent);
                }
                if (n2) {
                    c2 = gVar.f252j;
                } else {
                    c2 = gVar.f250h;
                }
                if (n2) {
                    i3 = gVar.f253k;
                } else {
                    i3 = gVar.f251i;
                }
                if (((modifiers & 69647) == (i3 & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (n2 && c2 == 8 && i2 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.f239x) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f221f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        ArrayList<g> l2 = l();
        if (this.f226k) {
            Iterator<WeakReference<i>> it = this.f236u.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                i iVar = (i) next.get();
                if (iVar == null) {
                    this.f236u.remove(next);
                } else {
                    z2 |= iVar.g();
                }
            }
            if (z2) {
                this.f224i.clear();
                this.f225j.clear();
                int size = l2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    g gVar = l2.get(i2);
                    (gVar.g() ? this.f224i : this.f225j).add(gVar);
                }
            } else {
                this.f224i.clear();
                this.f225j.clear();
                this.f225j.addAll(l());
            }
            this.f226k = false;
        }
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public e k() {
        return this;
    }

    public ArrayList<g> l() {
        if (!this.f223h) {
            return this.f222g;
        }
        this.f222g.clear();
        int size = this.f221f.size();
        for (int i2 = 0; i2 < size; i2++) {
            g gVar = this.f221f.get(i2);
            if (gVar.isVisible()) {
                this.f222g.add(gVar);
            }
        }
        this.f223h = false;
        this.f226k = true;
        return this.f222g;
    }

    public boolean m() {
        return this.f238w;
    }

    public boolean n() {
        return this.f218c;
    }

    public boolean o() {
        return this.f219d;
    }

    public void p(boolean z2) {
        if (!this.f231p) {
            if (z2) {
                this.f223h = true;
                this.f226k = true;
            }
            if (!this.f236u.isEmpty()) {
                y();
                Iterator<WeakReference<i>> it = this.f236u.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    i iVar = (i) next.get();
                    if (iVar == null) {
                        this.f236u.remove(next);
                    } else {
                        iVar.h(z2);
                    }
                }
                x();
                return;
            }
            return;
        }
        this.f232q = true;
        if (z2) {
            this.f233r = true;
        }
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return q(findItem(i2), i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        g g2 = g(i2, keyEvent);
        boolean r2 = g2 != null ? r(g2, (i) null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return r2;
    }

    public boolean q(MenuItem menuItem, int i2) {
        return r(menuItem, (i) null, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005b, code lost:
        if (r1 != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006a, code lost:
        if ((r9 & 1) == 0) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c6, code lost:
        if (r1 == false) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean r(android.view.MenuItem r7, androidx.appcompat.view.menu.i r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.g r7 = (androidx.appcompat.view.menu.g) r7
            r0 = 0
            if (r7 == 0) goto L_0x00cc
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00cc
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.f258p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0040
        L_0x0019:
            androidx.appcompat.view.menu.e r1 = r7.f256n
            boolean r1 = r1.e(r1, r7)
            if (r1 == 0) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            android.content.Intent r1 = r7.f249g
            if (r1 == 0) goto L_0x0036
            androidx.appcompat.view.menu.e r3 = r7.f256n     // Catch:{ ActivityNotFoundException -> 0x002e }
            android.content.Context r3 = r3.f216a     // Catch:{ ActivityNotFoundException -> 0x002e }
            r3.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002e }
            goto L_0x0040
        L_0x002e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0036:
            g0.b r1 = r7.A
            if (r1 == 0) goto L_0x0042
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0042
        L_0x0040:
            r1 = 1
            goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            g0.b r3 = r7.A
            if (r3 == 0) goto L_0x004f
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x004f
            r4 = 1
            goto L_0x0050
        L_0x004f:
            r4 = 0
        L_0x0050:
            boolean r5 = r7.f()
            if (r5 == 0) goto L_0x005f
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00cb
            goto L_0x00c8
        L_0x005f:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x006d
            if (r4 == 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00cb
            goto L_0x00c8
        L_0x006d:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0074
            r6.c(r0)
        L_0x0074:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0088
            androidx.appcompat.view.menu.l r9 = new androidx.appcompat.view.menu.l
            android.content.Context r5 = r6.f216a
            r9.<init>(r5, r6, r7)
            r7.f257o = r9
            java.lang.CharSequence r5 = r7.f247e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x0088:
            androidx.appcompat.view.menu.l r7 = r7.f257o
            if (r4 == 0) goto L_0x008f
            r3.f(r7)
        L_0x008f:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r9 = r6.f236u
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0098
            goto L_0x00c5
        L_0x0098:
            if (r8 == 0) goto L_0x009e
            boolean r0 = r8.f(r7)
        L_0x009e:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r8 = r6.f236u
            java.util.Iterator r8 = r8.iterator()
        L_0x00a4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00c5
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            androidx.appcompat.view.menu.i r3 = (androidx.appcompat.view.menu.i) r3
            if (r3 != 0) goto L_0x00be
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.i>> r3 = r6.f236u
            r3.remove(r9)
            goto L_0x00a4
        L_0x00be:
            if (r0 != 0) goto L_0x00a4
            boolean r0 = r3.f(r7)
            goto L_0x00a4
        L_0x00c5:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00cb
        L_0x00c8:
            r6.c(r2)
        L_0x00cb:
            return r1
        L_0x00cc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.r(android.view.MenuItem, androidx.appcompat.view.menu.i, int):boolean");
    }

    public void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f221f.get(i3).f244b == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.f221f.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || this.f221f.get(i3).f244b != i2) {
                    p(true);
                } else {
                    s(i3, false);
                    i4 = i5;
                }
            }
            p(true);
        }
    }

    public void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.f221f.get(i3).f243a == i2) {
                break;
            } else {
                i3++;
            }
        }
        s(i3, true);
    }

    public final void s(int i2, boolean z2) {
        if (i2 >= 0 && i2 < this.f221f.size()) {
            this.f221f.remove(i2);
            if (z2) {
                p(true);
            }
        }
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f221f.size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f221f.get(i3);
            if (gVar.f244b == i2) {
                gVar.f266x = (gVar.f266x & -5) | (z3 ? 4 : 0);
                gVar.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.f238w = z2;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f221f.size();
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f221f.get(i3);
            if (gVar.f244b == i2) {
                gVar.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f221f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            g gVar = this.f221f.get(i3);
            if (gVar.f244b == i2 && gVar.l(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            p(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.f218c = z2;
        p(false);
    }

    public int size() {
        return this.f221f.size();
    }

    public void t(i iVar) {
        Iterator<WeakReference<i>> it = this.f236u.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            i iVar2 = (i) next.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.f236u.remove(next);
            }
        }
    }

    public void u(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((l) item.getSubMenu()).u(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void v(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).v(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void w(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.f217b;
        if (view != null) {
            this.f230o = view;
            this.f228m = null;
            this.f229n = null;
        } else {
            if (i2 > 0) {
                this.f228m = resources.getText(i2);
            } else if (charSequence != null) {
                this.f228m = charSequence;
            }
            if (i3 > 0) {
                Context context = this.f216a;
                Object obj = x.a.f4298a;
                this.f229n = a.b.b(context, i3);
            } else if (drawable != null) {
                this.f229n = drawable;
            }
            this.f230o = null;
        }
        p(false);
    }

    public void x() {
        this.f231p = false;
        if (this.f232q) {
            this.f232q = false;
            p(this.f233r);
        }
    }

    public void y() {
        if (!this.f231p) {
            this.f231p = true;
            this.f232q = false;
            this.f233r = false;
        }
    }
}
