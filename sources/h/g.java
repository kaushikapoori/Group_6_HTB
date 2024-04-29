package h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.i0;
import i.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final Class<?>[] f3110e;

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f3111f;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f3112a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f3113b;

    /* renamed from: c  reason: collision with root package name */
    public Context f3114c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3115d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f3116c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f3117a;

        /* renamed from: b  reason: collision with root package name */
        public Method f3118b;

        public a(Object obj, String str) {
            this.f3117a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f3118b = cls.getMethod(str, f3116c);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f3118b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f3118b.invoke(this.f3117a, new Object[]{menuItem})).booleanValue();
                }
                this.f3118b.invoke(this.f3117a, new Object[]{menuItem});
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f3119a;

        /* renamed from: b  reason: collision with root package name */
        public int f3120b;

        /* renamed from: c  reason: collision with root package name */
        public int f3121c;

        /* renamed from: d  reason: collision with root package name */
        public int f3122d;

        /* renamed from: e  reason: collision with root package name */
        public int f3123e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3124f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3125g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3126h;

        /* renamed from: i  reason: collision with root package name */
        public int f3127i;

        /* renamed from: j  reason: collision with root package name */
        public int f3128j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f3129k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f3130l;

        /* renamed from: m  reason: collision with root package name */
        public int f3131m;

        /* renamed from: n  reason: collision with root package name */
        public char f3132n;

        /* renamed from: o  reason: collision with root package name */
        public int f3133o;

        /* renamed from: p  reason: collision with root package name */
        public char f3134p;

        /* renamed from: q  reason: collision with root package name */
        public int f3135q;

        /* renamed from: r  reason: collision with root package name */
        public int f3136r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f3137s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f3138t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f3139u;

        /* renamed from: v  reason: collision with root package name */
        public int f3140v;

        /* renamed from: w  reason: collision with root package name */
        public int f3141w;

        /* renamed from: x  reason: collision with root package name */
        public String f3142x;

        /* renamed from: y  reason: collision with root package name */
        public String f3143y;

        /* renamed from: z  reason: collision with root package name */
        public g0.b f3144z;

        public b(Menu menu) {
            this.f3119a = menu;
            this.f3120b = 0;
            this.f3121c = 0;
            this.f3122d = 0;
            this.f3123e = 0;
            this.f3124f = true;
            this.f3125g = true;
        }

        public SubMenu a() {
            this.f3126h = true;
            SubMenu addSubMenu = this.f3119a.addSubMenu(this.f3120b, this.f3127i, this.f3128j, this.f3129k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f3114c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.f3137s).setVisible(this.f3138t).setEnabled(this.f3139u).setCheckable(this.f3136r >= 1).setTitleCondensed(this.f3130l).setIcon(this.f3131m);
            int i2 = this.f3140v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.f3143y != null) {
                if (!g.this.f3114c.isRestricted()) {
                    g gVar = g.this;
                    if (gVar.f3115d == null) {
                        gVar.f3115d = gVar.a(gVar.f3114c);
                    }
                    menuItem.setOnMenuItemClickListener(new a(gVar.f3115d, this.f3143y));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f3136r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) menuItem;
                    gVar2.f266x = (gVar2.f266x & -5) | 4;
                } else if (menuItem instanceof c) {
                    c cVar = (c) menuItem;
                    try {
                        if (cVar.f3207e == null) {
                            cVar.f3207e = cVar.f3206d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        cVar.f3207e.invoke(cVar.f3206d, new Object[]{Boolean.TRUE});
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.f3142x;
            if (str != null) {
                menuItem.setActionView((View) b(str, g.f3110e, g.this.f3112a));
                z2 = true;
            }
            int i3 = this.f3141w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            g0.b bVar = this.f3144z;
            if (bVar != null) {
                if (menuItem instanceof b0.b) {
                    ((b0.b) menuItem).b(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z3 = menuItem instanceof b0.b;
            if (z3) {
                ((b0.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z3) {
                ((b0.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.f3132n;
            int i4 = this.f3133o;
            if (z3) {
                ((b0.b) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.f3134p;
            int i5 = this.f3135q;
            if (z3) {
                ((b0.b) menuItem).setNumericShortcut(c3, i5);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z3) {
                    ((b0.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList == null) {
                return;
            }
            if (z3) {
                ((b0.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f3110e = r0
            f3111f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.g.<clinit>():void");
    }

    public g(Context context) {
        super(context);
        this.f3114c = context;
        Object[] objArr = {context};
        this.f3112a = objArr;
        this.f3113b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        char c2;
        char c3;
        g0.b bVar;
        ColorStateList colorStateList;
        AttributeSet attributeSet2 = attributeSet;
        b bVar2 = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(f.a("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (!z2) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z3 && name2.equals(str)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            str = null;
                            z3 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals("group")) {
                            bVar2.f3120b = 0;
                            bVar2.f3121c = 0;
                            bVar2.f3122d = 0;
                            bVar2.f3123e = 0;
                            bVar2.f3124f = true;
                            bVar2.f3125g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar2.f3126h) {
                                g0.b bVar3 = bVar2.f3144z;
                                if (bVar3 == null || !bVar3.a()) {
                                    bVar2.f3126h = true;
                                    bVar2.c(bVar2.f3119a.add(bVar2.f3120b, bVar2.f3127i, bVar2.f3128j, bVar2.f3129k));
                                } else {
                                    bVar2.a();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            z2 = true;
                            eventType = xmlPullParser.next();
                        }
                    }
                } else if (!z3) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = g.this.f3114c.obtainStyledAttributes(attributeSet2, c.c.f2053p);
                        bVar2.f3120b = obtainStyledAttributes.getResourceId(1, 0);
                        bVar2.f3121c = obtainStyledAttributes.getInt(3, 0);
                        bVar2.f3122d = obtainStyledAttributes.getInt(4, 0);
                        bVar2.f3123e = obtainStyledAttributes.getInt(5, 0);
                        bVar2.f3124f = obtainStyledAttributes.getBoolean(2, true);
                        bVar2.f3125g = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        b1 p2 = b1.p(g.this.f3114c, attributeSet2, c.c.f2054q);
                        bVar2.f3127i = p2.l(2, 0);
                        bVar2.f3128j = (p2.j(5, bVar2.f3121c) & -65536) | (p2.j(6, bVar2.f3122d) & 65535);
                        bVar2.f3129k = p2.n(7);
                        bVar2.f3130l = p2.n(8);
                        bVar2.f3131m = p2.l(0, 0);
                        String m2 = p2.m(9);
                        if (m2 == null) {
                            c2 = 0;
                        } else {
                            c2 = m2.charAt(0);
                        }
                        bVar2.f3132n = c2;
                        bVar2.f3133o = p2.j(16, 4096);
                        String m3 = p2.m(10);
                        if (m3 == null) {
                            c3 = 0;
                        } else {
                            c3 = m3.charAt(0);
                        }
                        bVar2.f3134p = c3;
                        bVar2.f3135q = p2.j(20, 4096);
                        bVar2.f3136r = p2.o(11) ? p2.a(11, false) : bVar2.f3123e;
                        bVar2.f3137s = p2.a(3, false);
                        bVar2.f3138t = p2.a(4, bVar2.f3124f);
                        bVar2.f3139u = p2.a(1, bVar2.f3125g);
                        bVar2.f3140v = p2.j(21, -1);
                        bVar2.f3143y = p2.m(12);
                        bVar2.f3141w = p2.l(13, 0);
                        bVar2.f3142x = p2.m(15);
                        String m4 = p2.m(14);
                        boolean z4 = m4 != null;
                        if (z4 && bVar2.f3141w == 0 && bVar2.f3142x == null) {
                            bVar = (g0.b) bVar2.b(m4, f3111f, g.this.f3113b);
                        } else {
                            if (z4) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar = null;
                        }
                        bVar2.f3144z = bVar;
                        bVar2.A = p2.n(17);
                        bVar2.B = p2.n(22);
                        if (p2.o(19)) {
                            bVar2.D = i0.d(p2.j(19, -1), bVar2.D);
                            colorStateList = null;
                        } else {
                            colorStateList = null;
                            bVar2.D = null;
                        }
                        if (p2.o(18)) {
                            colorStateList = p2.c(18);
                        }
                        bVar2.C = colorStateList;
                        p2.f527b.recycle();
                        bVar2.f3126h = false;
                    } else {
                        if (name3.equals("menu")) {
                            b(xmlPullParser, attributeSet2, bVar2.a());
                        } else {
                            XmlPullParser xmlPullParser5 = xmlPullParser;
                            z3 = true;
                            str = name3;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser6 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i2, Menu menu) {
        if (!(menu instanceof b0.a)) {
            super.inflate(i2, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f3114c.getResources().getLayout(i2);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
