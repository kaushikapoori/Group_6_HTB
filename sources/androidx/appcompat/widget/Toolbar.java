package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.emoji2.text.k;
import com.example.supermarket.R;
import d.a;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

public class Toolbar extends ViewGroup {
    public ColorStateList A;
    public ColorStateList B;
    public boolean C;
    public boolean D;
    public final ArrayList<View> E;
    public final ArrayList<View> F;
    public final int[] G;
    public final g0.f H;
    public ArrayList<MenuItem> I;
    public f J;
    public final ActionMenuView.e K;
    public d1 L;
    public c M;
    public d N;
    public boolean O;
    public final Runnable P;

    /* renamed from: b  reason: collision with root package name */
    public ActionMenuView f437b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f438c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f439d;

    /* renamed from: e  reason: collision with root package name */
    public ImageButton f440e;

    /* renamed from: f  reason: collision with root package name */
    public ImageView f441f;

    /* renamed from: g  reason: collision with root package name */
    public Drawable f442g;

    /* renamed from: h  reason: collision with root package name */
    public CharSequence f443h;

    /* renamed from: i  reason: collision with root package name */
    public ImageButton f444i;

    /* renamed from: j  reason: collision with root package name */
    public View f445j;

    /* renamed from: k  reason: collision with root package name */
    public Context f446k;

    /* renamed from: l  reason: collision with root package name */
    public int f447l;

    /* renamed from: m  reason: collision with root package name */
    public int f448m;

    /* renamed from: n  reason: collision with root package name */
    public int f449n;

    /* renamed from: o  reason: collision with root package name */
    public int f450o;

    /* renamed from: p  reason: collision with root package name */
    public int f451p;

    /* renamed from: q  reason: collision with root package name */
    public int f452q;

    /* renamed from: r  reason: collision with root package name */
    public int f453r;

    /* renamed from: s  reason: collision with root package name */
    public int f454s;

    /* renamed from: t  reason: collision with root package name */
    public int f455t;

    /* renamed from: u  reason: collision with root package name */
    public t0 f456u;

    /* renamed from: v  reason: collision with root package name */
    public int f457v;

    /* renamed from: w  reason: collision with root package name */
    public int f458w;

    /* renamed from: x  reason: collision with root package name */
    public int f459x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f460y;

    /* renamed from: z  reason: collision with root package name */
    public CharSequence f461z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.w();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            d dVar = Toolbar.this.N;
            androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f466c;
            if (gVar != null) {
                gVar.collapseActionView();
            }
        }
    }

    public class d implements i {

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f465b;

        /* renamed from: c  reason: collision with root package name */
        public androidx.appcompat.view.menu.g f466c;

        public d() {
        }

        public void b(androidx.appcompat.view.menu.e eVar, boolean z2) {
        }

        public boolean c(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f444i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f444i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f444i);
            }
            Toolbar.this.f445j = gVar.getActionView();
            this.f466c = gVar;
            ViewParent parent2 = Toolbar.this.f445j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f445j);
                }
                e h2 = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                h2.f2689a = 8388611 | (toolbar4.f450o & 112);
                h2.f468b = 2;
                toolbar4.f445j.setLayoutParams(h2);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f445j);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((e) childAt.getLayoutParams()).f468b == 2 || childAt == toolbar6.f437b)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.F.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            gVar.C = true;
            gVar.f256n.p(false);
            View view = Toolbar.this.f445j;
            if (view instanceof h.b) {
                ((h.b) view).a();
            }
            return true;
        }

        public boolean f(l lVar) {
            return false;
        }

        public boolean g() {
            return false;
        }

        public void h(boolean z2) {
            if (this.f466c != null) {
                androidx.appcompat.view.menu.e eVar = this.f465b;
                boolean z3 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (this.f465b.getItem(i2) == this.f466c) {
                            z3 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (!z3) {
                    k(this.f465b, this.f466c);
                }
            }
        }

        public void j(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f465b;
            if (!(eVar2 == null || (gVar = this.f466c) == null)) {
                eVar2.d(gVar);
            }
            this.f465b = eVar;
        }

        public boolean k(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.f445j;
            if (view instanceof h.b) {
                ((h.b) view).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f445j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f444i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f445j = null;
            int size = toolbar3.F.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.F.get(size));
                } else {
                    toolbar3.F.clear();
                    this.f466c = null;
                    Toolbar.this.requestLayout();
                    gVar.C = false;
                    gVar.f256n.p(false);
                    return true;
                }
            }
        }
    }

    public static class e extends a.C0025a {

        /* renamed from: b  reason: collision with root package name */
        public int f468b = 0;

        public e(int i2, int i3) {
            super(i2, i3);
            this.f2689a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0025a) eVar);
            this.f468b = eVar.f468b;
        }

        public e(a.C0025a aVar) {
            super(aVar);
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends l0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public int f469d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f470e;

        public class a implements Parcelable.ClassLoaderCreator<g> {
            public Object createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i2) {
                return new g[i2];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f469d = parcel.readInt();
            this.f470e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3321b, i2);
            parcel.writeInt(this.f469d);
            parcel.writeInt(this.f470e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f459x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.H = new g0.f(new k(this));
        this.I = new ArrayList<>();
        this.K = new a();
        this.P = new b();
        Context context2 = getContext();
        int[] iArr = c.c.f2061x;
        b1 q2 = b1.q(context2, attributeSet, iArr, i2, 0);
        u.t(this, context, iArr, attributeSet, q2.f527b, i2, 0);
        this.f448m = q2.l(28, 0);
        this.f449n = q2.l(19, 0);
        this.f459x = q2.f527b.getInteger(0, this.f459x);
        this.f450o = q2.f527b.getInteger(2, 48);
        int e2 = q2.e(22, 0);
        e2 = q2.o(27) ? q2.e(27, e2) : e2;
        this.f455t = e2;
        this.f454s = e2;
        this.f453r = e2;
        this.f452q = e2;
        int e3 = q2.e(25, -1);
        if (e3 >= 0) {
            this.f452q = e3;
        }
        int e4 = q2.e(24, -1);
        if (e4 >= 0) {
            this.f453r = e4;
        }
        int e5 = q2.e(26, -1);
        if (e5 >= 0) {
            this.f454s = e5;
        }
        int e6 = q2.e(23, -1);
        if (e6 >= 0) {
            this.f455t = e6;
        }
        this.f451p = q2.f(13, -1);
        int e7 = q2.e(9, Integer.MIN_VALUE);
        int e8 = q2.e(5, Integer.MIN_VALUE);
        int f2 = q2.f(7, 0);
        int f3 = q2.f(8, 0);
        d();
        t0 t0Var = this.f456u;
        t0Var.f784h = false;
        if (f2 != Integer.MIN_VALUE) {
            t0Var.f781e = f2;
            t0Var.f777a = f2;
        }
        if (f3 != Integer.MIN_VALUE) {
            t0Var.f782f = f3;
            t0Var.f778b = f3;
        }
        if (!(e7 == Integer.MIN_VALUE && e8 == Integer.MIN_VALUE)) {
            t0Var.a(e7, e8);
        }
        this.f457v = q2.e(10, Integer.MIN_VALUE);
        this.f458w = q2.e(6, Integer.MIN_VALUE);
        this.f442g = q2.g(4);
        this.f443h = q2.n(3);
        CharSequence n2 = q2.n(21);
        if (!TextUtils.isEmpty(n2)) {
            setTitle(n2);
        }
        CharSequence n3 = q2.n(18);
        if (!TextUtils.isEmpty(n3)) {
            setSubtitle(n3);
        }
        this.f446k = getContext();
        setPopupTheme(q2.l(17, 0));
        Drawable g2 = q2.g(16);
        if (g2 != null) {
            setNavigationIcon(g2);
        }
        CharSequence n4 = q2.n(15);
        if (!TextUtils.isEmpty(n4)) {
            setNavigationContentDescription(n4);
        }
        Drawable g3 = q2.g(11);
        if (g3 != null) {
            setLogo(g3);
        }
        CharSequence n5 = q2.n(12);
        if (!TextUtils.isEmpty(n5)) {
            setLogoDescription(n5);
        }
        if (q2.o(29)) {
            setTitleTextColor(q2.c(29));
        }
        if (q2.o(20)) {
            setSubtitleTextColor(q2.c(20));
        }
        if (q2.o(14)) {
            getMenuInflater().inflate(q2.l(14, 0), getMenu());
        }
        q2.f527b.recycle();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h.g(getContext());
    }

    public final void a(List<View> list, int i2) {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        boolean z2 = u.e.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, u.e.d(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f468b == 0 && v(childAt) && j(eVar.f2689a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f468b == 0 && v(childAt2) && j(eVar2.f2689a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e h2 = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        h2.f468b = 1;
        if (!z2 || this.f445j == null) {
            addView(view, h2);
            return;
        }
        view.setLayoutParams(h2);
        this.F.add(view);
    }

    public void c() {
        if (this.f444i == null) {
            o oVar = new o(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.f444i = oVar;
            oVar.setImageDrawable(this.f442g);
            this.f444i.setContentDescription(this.f443h);
            e h2 = generateDefaultLayoutParams();
            h2.f2689a = 8388611 | (this.f450o & 112);
            h2.f468b = 2;
            this.f444i.setLayoutParams(h2);
            this.f444i.setOnClickListener(new c());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.f456u == null) {
            this.f456u = new t0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f437b;
        if (actionMenuView.f357q == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) actionMenuView.getMenu();
            if (this.N == null) {
                this.N = new d();
            }
            this.f437b.setExpandedActionViewsExclusive(true);
            eVar.b(this.N, this.f446k);
        }
    }

    public final void f() {
        if (this.f437b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.f437b = actionMenuView;
            actionMenuView.setPopupTheme(this.f447l);
            this.f437b.setOnMenuItemClickListener(this.K);
            ActionMenuView actionMenuView2 = this.f437b;
            actionMenuView2.f362v = null;
            actionMenuView2.f363w = null;
            e h2 = generateDefaultLayoutParams();
            h2.f2689a = 8388613 | (this.f450o & 112);
            this.f437b.setLayoutParams(h2);
            b(this.f437b, false);
        }
    }

    public final void g() {
        if (this.f440e == null) {
            this.f440e = new o(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            e h2 = generateDefaultLayoutParams();
            h2.f2689a = 8388611 | (this.f450o & 112);
            this.f440e.setLayoutParams(h2);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f444i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f444i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        t0 t0Var = this.f456u;
        if (t0Var != null) {
            return t0Var.f783g ? t0Var.f777a : t0Var.f778b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f458w;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        t0 t0Var = this.f456u;
        if (t0Var != null) {
            return t0Var.f777a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        t0 t0Var = this.f456u;
        if (t0Var != null) {
            return t0Var.f778b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        t0 t0Var = this.f456u;
        if (t0Var != null) {
            return t0Var.f783g ? t0Var.f778b : t0Var.f777a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f457v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f357q;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f437b
            r1 = 0
            if (r0 == 0) goto L_0x0011
            androidx.appcompat.view.menu.e r0 = r0.f357q
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f458w
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        return u.e.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        return u.e.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f457v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f441f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f441f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f437b.getMenu();
    }

    public View getNavButtonView() {
        return this.f440e;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f440e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f440e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public c getOuterActionMenuPresenter() {
        return this.M;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f437b.getOverflowIcon();
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.f446k;
    }

    public int getPopupTheme() {
        return this.f447l;
    }

    public CharSequence getSubtitle() {
        return this.f461z;
    }

    public final TextView getSubtitleTextView() {
        return this.f439d;
    }

    public CharSequence getTitle() {
        return this.f460y;
    }

    public int getTitleMarginBottom() {
        return this.f455t;
    }

    public int getTitleMarginEnd() {
        return this.f453r;
    }

    public int getTitleMarginStart() {
        return this.f452q;
    }

    public int getTitleMarginTop() {
        return this.f454s;
    }

    public final TextView getTitleTextView() {
        return this.f438c;
    }

    public h0 getWrapper() {
        if (this.L == null) {
            this.L = new d1(this, true);
        }
        return this.L;
    }

    /* renamed from: h */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: i */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0025a ? new e((a.C0025a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int j(int i2) {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        int d2 = u.e.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, d2) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return d2 == 1 ? 5 : 3;
    }

    public final int k(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = eVar.f2689a & 112;
        if (!(i4 == 16 || i4 == 48 || i4 == 80)) {
            i4 = this.f459x & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = eVar.topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = eVar.bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public void n(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public void o() {
        Iterator<MenuItem> it = this.I.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        g0.f fVar = this.H;
        Menu menu = getMenu();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<g0.g> it2 = fVar.f3051a.iterator();
        while (it2.hasNext()) {
            it2.next().a(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.I = currentMenuItems2;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:107:0x0297 A[LOOP:0: B:106:0x0295->B:107:0x0297, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02b9 A[LOOP:1: B:109:0x02b7->B:110:0x02b9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02de A[LOOP:2: B:112:0x02dc->B:113:0x02de, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x031f  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0330 A[LOOP:3: B:120:0x032e->B:121:0x0330, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x021d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            java.util.WeakHashMap<android.view.View, g0.x> r1 = g0.u.f3063a
            int r1 = g0.u.e.d(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000e
            r1 = 1
            goto L_0x000f
        L_0x000e:
            r1 = 0
        L_0x000f:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.G
            r11[r2] = r3
            r11[r3] = r3
            int r12 = g0.u.d.d(r19)
            if (r12 < 0) goto L_0x003c
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003d
        L_0x003c:
            r12 = 0
        L_0x003d:
            android.widget.ImageButton r13 = r0.f440e
            boolean r13 = r0.v(r13)
            if (r13 == 0) goto L_0x0055
            android.widget.ImageButton r13 = r0.f440e
            if (r1 == 0) goto L_0x0050
            int r13 = r0.s(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x0050:
            int r13 = r0.r(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f444i
            boolean r15 = r0.v(r15)
            if (r15 == 0) goto L_0x006c
            android.widget.ImageButton r15 = r0.f444i
            if (r1 == 0) goto L_0x0068
            int r14 = r0.s(r15, r14, r11, r12)
            goto L_0x006c
        L_0x0068:
            int r13 = r0.r(r15, r13, r11, r12)
        L_0x006c:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f437b
            boolean r15 = r0.v(r15)
            if (r15 == 0) goto L_0x0081
            androidx.appcompat.widget.ActionMenuView r15 = r0.f437b
            if (r1 == 0) goto L_0x007d
            int r13 = r0.r(r15, r13, r11, r12)
            goto L_0x0081
        L_0x007d:
            int r14 = r0.s(r15, r14, r11, r12)
        L_0x0081:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f445j
            boolean r13 = r0.v(r13)
            if (r13 == 0) goto L_0x00bc
            android.view.View r13 = r0.f445j
            if (r1 == 0) goto L_0x00b8
            int r10 = r0.s(r13, r10, r11, r12)
            goto L_0x00bc
        L_0x00b8:
            int r2 = r0.r(r13, r2, r11, r12)
        L_0x00bc:
            android.widget.ImageView r13 = r0.f441f
            boolean r13 = r0.v(r13)
            if (r13 == 0) goto L_0x00d1
            android.widget.ImageView r13 = r0.f441f
            if (r1 == 0) goto L_0x00cd
            int r10 = r0.s(r13, r10, r11, r12)
            goto L_0x00d1
        L_0x00cd:
            int r2 = r0.r(r13, r2, r11, r12)
        L_0x00d1:
            android.widget.TextView r13 = r0.f438c
            boolean r13 = r0.v(r13)
            android.widget.TextView r14 = r0.f439d
            boolean r14 = r0.v(r14)
            if (r13 == 0) goto L_0x00f8
            android.widget.TextView r15 = r0.f438c
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f438c
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x00fb
        L_0x00f8:
            r23 = r7
            r7 = 0
        L_0x00fb:
            if (r14 == 0) goto L_0x0115
            android.widget.TextView r3 = r0.f439d
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r15 = r3.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f439d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x0117
        L_0x0115:
            r16 = r4
        L_0x0117:
            if (r13 != 0) goto L_0x0122
            if (r14 == 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            r18 = r6
            r22 = r12
            goto L_0x0287
        L_0x0122:
            if (r13 == 0) goto L_0x0127
            android.widget.TextView r3 = r0.f438c
            goto L_0x0129
        L_0x0127:
            android.widget.TextView r3 = r0.f439d
        L_0x0129:
            if (r14 == 0) goto L_0x012e
            android.widget.TextView r4 = r0.f439d
            goto L_0x0130
        L_0x012e:
            android.widget.TextView r4 = r0.f438c
        L_0x0130:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            if (r13 == 0) goto L_0x0146
            android.widget.TextView r15 = r0.f438c
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0150
        L_0x0146:
            if (r14 == 0) goto L_0x0153
            android.widget.TextView r15 = r0.f439d
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x0153
        L_0x0150:
            r17 = 1
            goto L_0x0155
        L_0x0153:
            r17 = 0
        L_0x0155:
            int r15 = r0.f459x
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x019d
            r6 = 80
            if (r15 == r6) goto L_0x018f
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r22 = r12
            int r12 = r0.f454s
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0178
            int r6 = r15 + r12
            goto L_0x018d
        L_0x0178:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r3.bottomMargin
            int r3 = r0.f455t
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x018d
            int r2 = r4.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x018d:
            int r8 = r8 + r6
            goto L_0x01ac
        L_0x018f:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r4.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f455t
            int r5 = r5 - r2
            int r8 = r5 - r7
            goto L_0x01ac
        L_0x019d:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r3 = r0.f454s
            int r8 = r2 + r3
        L_0x01ac:
            if (r1 == 0) goto L_0x021d
            if (r17 == 0) goto L_0x01b3
            int r1 = r0.f452q
            goto L_0x01b4
        L_0x01b3:
            r1 = 0
        L_0x01b4:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01eb
            android.widget.TextView r1 = r0.f438c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f438c
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f438c
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f438c
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f453r
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01ec
        L_0x01eb:
            r2 = r10
        L_0x01ec:
            if (r14 == 0) goto L_0x0212
            android.widget.TextView r1 = r0.f439d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f439d
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f439d
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f439d
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.f453r
            int r1 = r10 - r1
            goto L_0x0213
        L_0x0212:
            r1 = r10
        L_0x0213:
            if (r17 == 0) goto L_0x021a
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x021a:
            r2 = r24
            goto L_0x0287
        L_0x021d:
            if (r17 == 0) goto L_0x0222
            int r1 = r0.f452q
            goto L_0x0223
        L_0x0222:
            r1 = 0
        L_0x0223:
            r2 = 0
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r24
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0259
            android.widget.TextView r1 = r0.f438c
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f438c
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.f438c
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f438c
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.f453r
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x025a
        L_0x0259:
            r2 = r3
        L_0x025a:
            if (r14 == 0) goto L_0x027e
            android.widget.TextView r1 = r0.f439d
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f439d
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r4 = r0.f439d
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f439d
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.f453r
            int r1 = r1 + r4
            goto L_0x027f
        L_0x027e:
            r1 = r3
        L_0x027f:
            if (r17 == 0) goto L_0x0286
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x0287
        L_0x0286:
            r2 = r3
        L_0x0287:
            java.util.ArrayList<android.view.View> r1 = r0.E
            r3 = 3
            r0.a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.E
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x0295:
            if (r2 >= r1) goto L_0x02a8
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.r(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x0295
        L_0x02a8:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.E
            r2 = 5
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.E
            int r1 = r1.size()
            r2 = 0
        L_0x02b7:
            if (r2 >= r1) goto L_0x02c8
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.s(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02b7
        L_0x02c8:
            java.util.ArrayList<android.view.View> r1 = r0.E
            r2 = 1
            r0.a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.E
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02dc:
            if (r5 >= r4) goto L_0x030f
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02dc
        L_0x030f:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x031f
            goto L_0x0326
        L_0x031f:
            if (r6 <= r10) goto L_0x0325
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x0326
        L_0x0325:
            r3 = r4
        L_0x0326:
            java.util.ArrayList<android.view.View> r1 = r0.E
            int r1 = r1.size()
            r2 = r3
            r3 = 0
        L_0x032e:
            if (r3 >= r1) goto L_0x033f
            java.util.ArrayList<android.view.View> r4 = r0.E
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.r(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L_0x032e
        L_0x033f:
            java.util.ArrayList<android.view.View> r1 = r0.E
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.G;
        char b2 = i1.b(this);
        boolean z2 = true;
        int i11 = 0;
        char c2 = b2 ^ 1;
        if (v(this.f440e)) {
            u(this.f440e, i2, 0, i3, 0, this.f451p);
            i6 = l(this.f440e) + this.f440e.getMeasuredWidth();
            i5 = Math.max(0, m(this.f440e) + this.f440e.getMeasuredHeight());
            i4 = View.combineMeasuredStates(0, this.f440e.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (v(this.f444i)) {
            u(this.f444i, i2, 0, i3, 0, this.f451p);
            i6 = l(this.f444i) + this.f444i.getMeasuredWidth();
            i5 = Math.max(i5, m(this.f444i) + this.f444i.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f444i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6) + 0;
        iArr[b2] = Math.max(0, currentContentInsetStart - i6);
        if (v(this.f437b)) {
            u(this.f437b, i2, max, i3, 0, this.f451p);
            i7 = l(this.f437b) + this.f437b.getMeasuredWidth();
            i5 = Math.max(i5, m(this.f437b) + this.f437b.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f437b.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i7) + max;
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (v(this.f445j)) {
            max2 += t(this.f445j, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, m(this.f445j) + this.f445j.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f445j.getMeasuredState());
        }
        if (v(this.f441f)) {
            max2 += t(this.f441f, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, m(this.f441f) + this.f441f.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f441f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).f468b == 0 && v(childAt)) {
                View view = childAt;
                max2 += t(childAt, i2, max2, i3, 0, iArr);
                View view2 = view;
                i5 = Math.max(i5, m(view2) + view.getMeasuredHeight());
                i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
            }
        }
        int i13 = this.f454s + this.f455t;
        int i14 = this.f452q + this.f453r;
        if (v(this.f438c)) {
            t(this.f438c, i2, max2 + i14, i3, i13, iArr);
            int l2 = l(this.f438c) + this.f438c.getMeasuredWidth();
            i8 = m(this.f438c) + this.f438c.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i4, this.f438c.getMeasuredState());
            i9 = l2;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (v(this.f439d)) {
            int i15 = i8 + i13;
            i9 = Math.max(i9, t(this.f439d, i2, max2 + i14, i3, i15, iArr));
            i8 = m(this.f439d) + this.f439d.getMeasuredHeight() + i8;
            i10 = View.combineMeasuredStates(i10, this.f439d.getMeasuredState());
        } else {
            int i16 = i10;
        }
        int max3 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i9, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (this.O) {
            int childCount2 = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i17);
                if (v(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i17++;
            }
        }
        z2 = false;
        if (!z2) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f3321b);
        ActionMenuView actionMenuView = this.f437b;
        androidx.appcompat.view.menu.e eVar = actionMenuView != null ? actionMenuView.f357q : null;
        int i2 = gVar.f469d;
        if (!(i2 == 0 || this.N == null || eVar == null || (findItem = eVar.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f470e) {
            removeCallbacks(this.P);
            post(this.P);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.d()
            androidx.appcompat.widget.t0 r0 = r2.f456u
            r1 = 1
            if (r3 != r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            boolean r3 = r0.f783g
            if (r1 != r3) goto L_0x0012
            goto L_0x0040
        L_0x0012:
            r0.f783g = r1
            boolean r3 = r0.f784h
            if (r3 == 0) goto L_0x0038
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x002a
            int r1 = r0.f780d
            if (r1 == r3) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            int r1 = r0.f781e
        L_0x0023:
            r0.f777a = r1
            int r1 = r0.f779c
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x002a:
            int r1 = r0.f779c
            if (r1 == r3) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            int r1 = r0.f781e
        L_0x0031:
            r0.f777a = r1
            int r1 = r0.f780d
            if (r1 == r3) goto L_0x003c
            goto L_0x003e
        L_0x0038:
            int r3 = r0.f781e
            r0.f777a = r3
        L_0x003c:
            int r1 = r0.f782f
        L_0x003e:
            r0.f778b = r1
        L_0x0040:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.N;
        if (!(dVar == null || (gVar = dVar.f466c) == null)) {
            gVar2.f469d = gVar.f243a;
        }
        gVar2.f470e = q();
        return gVar2;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public final boolean p(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public boolean q() {
        ActionMenuView actionMenuView = this.f437b;
        if (actionMenuView != null) {
            c cVar = actionMenuView.f361u;
            if (cVar != null && cVar.m()) {
                return true;
            }
        }
        return false;
    }

    public final int r(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k2, max + measuredWidth, view.getMeasuredHeight() + k2);
        return measuredWidth + eVar.rightMargin + max;
    }

    public final int s(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int k2 = k(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k2, max, view.getMeasuredHeight() + k2);
        return max - (measuredWidth + eVar.leftMargin);
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.f444i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(e.a.b(getContext(), i2));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f444i.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f444i;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f442g);
        }
    }

    public void setCollapsible(boolean z2) {
        this.O = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f458w) {
            this.f458w = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f457v) {
            this.f457v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(e.a.b(getContext(), i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f441f == null) {
                this.f441f = new q(getContext(), (AttributeSet) null, 0);
            }
            if (!p(this.f441f)) {
                b(this.f441f, true);
            }
        } else {
            ImageView imageView = this.f441f;
            if (imageView != null && p(imageView)) {
                removeView(this.f441f);
                this.F.remove(this.f441f);
            }
        }
        ImageView imageView2 = this.f441f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f441f == null) {
            this.f441f = new q(getContext(), (AttributeSet) null, 0);
        }
        ImageView imageView = this.f441f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f440e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            e1.a(this.f440e, charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(e.a.b(getContext(), i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!p(this.f440e)) {
                b(this.f440e, true);
            }
        } else {
            ImageButton imageButton = this.f440e;
            if (imageButton != null && p(imageButton)) {
                removeView(this.f440e);
                this.F.remove(this.f440e);
            }
        }
        ImageButton imageButton2 = this.f440e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f440e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.J = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f437b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f447l != i2) {
            this.f447l = i2;
            if (i2 == 0) {
                this.f446k = getContext();
            } else {
                this.f446k = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f439d == null) {
                Context context = getContext();
                d0 d0Var = new d0(context, (AttributeSet) null);
                this.f439d = d0Var;
                d0Var.setSingleLine();
                this.f439d.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f449n;
                if (i2 != 0) {
                    this.f439d.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f439d.setTextColor(colorStateList);
                }
            }
            if (!p(this.f439d)) {
                b(this.f439d, true);
            }
        } else {
            TextView textView = this.f439d;
            if (textView != null && p(textView)) {
                removeView(this.f439d);
                this.F.remove(this.f439d);
            }
        }
        TextView textView2 = this.f439d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f461z = charSequence;
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f439d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f438c == null) {
                Context context = getContext();
                d0 d0Var = new d0(context, (AttributeSet) null);
                this.f438c = d0Var;
                d0Var.setSingleLine();
                this.f438c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f448m;
                if (i2 != 0) {
                    this.f438c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f438c.setTextColor(colorStateList);
                }
            }
            if (!p(this.f438c)) {
                b(this.f438c, true);
            }
        } else {
            TextView textView = this.f438c;
            if (textView != null && p(textView)) {
                removeView(this.f438c);
                this.F.remove(this.f438c);
            }
        }
        TextView textView2 = this.f438c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f460y = charSequence;
    }

    public void setTitleMarginBottom(int i2) {
        this.f455t = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f453r = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f452q = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f454s = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f438c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final int t(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void u(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f437b;
        if (actionMenuView != null) {
            c cVar = actionMenuView.f361u;
            if (cVar != null && cVar.n()) {
                return true;
            }
        }
        return false;
    }
}
