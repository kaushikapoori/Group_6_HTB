package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import g0.u;
import g0.x;
import i.f;
import j0.f;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class o0 implements f {
    public static Method A;
    public static Method B;
    public static Method C;

    /* renamed from: b  reason: collision with root package name */
    public Context f719b;

    /* renamed from: c  reason: collision with root package name */
    public ListAdapter f720c;

    /* renamed from: d  reason: collision with root package name */
    public j0 f721d;

    /* renamed from: e  reason: collision with root package name */
    public int f722e = -2;

    /* renamed from: f  reason: collision with root package name */
    public int f723f = -2;

    /* renamed from: g  reason: collision with root package name */
    public int f724g;

    /* renamed from: h  reason: collision with root package name */
    public int f725h;

    /* renamed from: i  reason: collision with root package name */
    public int f726i = 1002;

    /* renamed from: j  reason: collision with root package name */
    public boolean f727j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f728k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f729l;

    /* renamed from: m  reason: collision with root package name */
    public int f730m = 0;

    /* renamed from: n  reason: collision with root package name */
    public int f731n = Integer.MAX_VALUE;

    /* renamed from: o  reason: collision with root package name */
    public DataSetObserver f732o;

    /* renamed from: p  reason: collision with root package name */
    public View f733p;

    /* renamed from: q  reason: collision with root package name */
    public AdapterView.OnItemClickListener f734q;

    /* renamed from: r  reason: collision with root package name */
    public final e f735r = new e();

    /* renamed from: s  reason: collision with root package name */
    public final d f736s = new d();

    /* renamed from: t  reason: collision with root package name */
    public final c f737t = new c();

    /* renamed from: u  reason: collision with root package name */
    public final a f738u = new a();

    /* renamed from: v  reason: collision with root package name */
    public final Handler f739v;

    /* renamed from: w  reason: collision with root package name */
    public final Rect f740w = new Rect();

    /* renamed from: x  reason: collision with root package name */
    public Rect f741x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f742y;

    /* renamed from: z  reason: collision with root package name */
    public PopupWindow f743z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            j0 j0Var = o0.this.f721d;
            if (j0Var != null) {
                j0Var.setListSelectionHidden(true);
                j0Var.requestLayout();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            if (o0.this.a()) {
                o0.this.i();
            }
        }

        public void onInvalidated() {
            o0.this.dismiss();
        }
    }

    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i2) {
            boolean z2 = true;
            if (i2 == 1) {
                if (o0.this.f743z.getInputMethodMode() != 2) {
                    z2 = false;
                }
                if (!z2 && o0.this.f743z.getContentView() != null) {
                    o0 o0Var = o0.this;
                    o0Var.f739v.removeCallbacks(o0Var.f735r);
                    o0.this.f735r.run();
                }
            }
        }
    }

    public class d implements View.OnTouchListener {
        public d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = o0.this.f743z) != null && popupWindow.isShowing() && x2 >= 0 && x2 < o0.this.f743z.getWidth() && y2 >= 0 && y2 < o0.this.f743z.getHeight()) {
                o0 o0Var = o0.this;
                o0Var.f739v.postDelayed(o0Var.f735r, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                o0 o0Var2 = o0.this;
                o0Var2.f739v.removeCallbacks(o0Var2.f735r);
                return false;
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        public void run() {
            j0 j0Var = o0.this.f721d;
            if (j0Var != null) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                if (u.g.b(j0Var) && o0.this.f721d.getCount() > o0.this.f721d.getChildCount()) {
                    int childCount = o0.this.f721d.getChildCount();
                    o0 o0Var = o0.this;
                    if (childCount <= o0Var.f731n) {
                        o0Var.f743z.setInputMethodMode(2);
                        o0.this.i();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                A = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                B = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public o0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.f719b = context;
        this.f739v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.c.f2052o, i2, i3);
        this.f724g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f725h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f727j = true;
        }
        obtainStyledAttributes.recycle();
        s sVar = new s(context, attributeSet, i2, i3);
        this.f743z = sVar;
        sVar.setInputMethodMode(1);
    }

    public boolean a() {
        return this.f743z.isShowing();
    }

    public void c(int i2) {
        this.f724g = i2;
    }

    public int d() {
        return this.f724g;
    }

    public void dismiss() {
        this.f743z.dismiss();
        this.f743z.setContentView((View) null);
        this.f721d = null;
        this.f739v.removeCallbacks(this.f735r);
    }

    public ListView e() {
        return this.f721d;
    }

    public void i() {
        int i2;
        int i3;
        int i4;
        j0 j0Var;
        int i5;
        if (this.f721d == null) {
            j0 q2 = q(this.f719b, !this.f742y);
            this.f721d = q2;
            q2.setAdapter(this.f720c);
            this.f721d.setOnItemClickListener(this.f734q);
            this.f721d.setFocusable(true);
            this.f721d.setFocusableInTouchMode(true);
            this.f721d.setOnItemSelectedListener(new n0(this));
            this.f721d.setOnScrollListener(this.f737t);
            this.f743z.setContentView(this.f721d);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f743z.getContentView();
        }
        Drawable background = this.f743z.getBackground();
        int i6 = 0;
        if (background != null) {
            background.getPadding(this.f740w);
            Rect rect = this.f740w;
            int i7 = rect.top;
            i2 = rect.bottom + i7;
            if (!this.f727j) {
                this.f725h = -i7;
            }
        } else {
            this.f740w.setEmpty();
            i2 = 0;
        }
        boolean z2 = this.f743z.getInputMethodMode() == 2;
        View view = this.f733p;
        int i8 = this.f725h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = B;
            if (method != null) {
                try {
                    i3 = ((Integer) method.invoke(this.f743z, new Object[]{view, Integer.valueOf(i8), Boolean.valueOf(z2)})).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            i3 = this.f743z.getMaxAvailableHeight(view, i8);
        } else {
            i3 = this.f743z.getMaxAvailableHeight(view, i8, z2);
        }
        if (this.f722e == -1) {
            i4 = i3 + i2;
        } else {
            int i9 = this.f723f;
            if (i9 != -2) {
                i5 = 1073741824;
                if (i9 == -1) {
                    int i10 = this.f719b.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.f740w;
                    i9 = i10 - (rect2.left + rect2.right);
                }
            } else {
                int i11 = this.f719b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f740w;
                i9 = i11 - (rect3.left + rect3.right);
                i5 = Integer.MIN_VALUE;
            }
            int a2 = this.f721d.a(View.MeasureSpec.makeMeasureSpec(i9, i5), i3 - 0, -1);
            i4 = a2 + (a2 > 0 ? this.f721d.getPaddingBottom() + this.f721d.getPaddingTop() + i2 + 0 : 0);
        }
        boolean z3 = this.f743z.getInputMethodMode() == 2;
        j0.f.b(this.f743z, this.f726i);
        if (this.f743z.isShowing()) {
            View view2 = this.f733p;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (u.g.b(view2)) {
                int i12 = this.f723f;
                if (i12 == -1) {
                    i12 = -1;
                } else if (i12 == -2) {
                    i12 = this.f733p.getWidth();
                }
                int i13 = this.f722e;
                if (i13 == -1) {
                    if (!z3) {
                        i4 = -1;
                    }
                    if (z3) {
                        this.f743z.setWidth(this.f723f == -1 ? -1 : 0);
                        this.f743z.setHeight(0);
                    } else {
                        PopupWindow popupWindow = this.f743z;
                        if (this.f723f == -1) {
                            i6 = -1;
                        }
                        popupWindow.setWidth(i6);
                        this.f743z.setHeight(-1);
                    }
                } else if (i13 != -2) {
                    i4 = i13;
                }
                this.f743z.setOutsideTouchable(true);
                this.f743z.update(this.f733p, this.f724g, this.f725h, i12 < 0 ? -1 : i12, i4 < 0 ? -1 : i4);
                return;
            }
            return;
        }
        int i14 = this.f723f;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.f733p.getWidth();
        }
        int i15 = this.f722e;
        if (i15 == -1) {
            i4 = -1;
        } else if (i15 != -2) {
            i4 = i15;
        }
        this.f743z.setWidth(i14);
        this.f743z.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = A;
            if (method2 != null) {
                try {
                    method2.invoke(this.f743z, new Object[]{Boolean.TRUE});
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            this.f743z.setIsClippedToScreen(true);
        }
        this.f743z.setOutsideTouchable(true);
        this.f743z.setTouchInterceptor(this.f736s);
        if (this.f729l) {
            j0.f.a(this.f743z, this.f728k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = C;
            if (method3 != null) {
                try {
                    method3.invoke(this.f743z, new Object[]{this.f741x});
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.f743z.setEpicenterBounds(this.f741x);
        }
        f.a.a(this.f743z, this.f733p, this.f724g, this.f725h, this.f730m);
        this.f721d.setSelection(-1);
        if ((!this.f742y || this.f721d.isInTouchMode()) && (j0Var = this.f721d) != null) {
            j0Var.setListSelectionHidden(true);
            j0Var.requestLayout();
        }
        if (!this.f742y) {
            this.f739v.post(this.f738u);
        }
    }

    public int j() {
        if (!this.f727j) {
            return 0;
        }
        return this.f725h;
    }

    public void l(Drawable drawable) {
        this.f743z.setBackgroundDrawable(drawable);
    }

    public void m(int i2) {
        this.f725h = i2;
        this.f727j = true;
    }

    public Drawable n() {
        return this.f743z.getBackground();
    }

    public void o(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f732o;
        if (dataSetObserver == null) {
            this.f732o = new b();
        } else {
            ListAdapter listAdapter2 = this.f720c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f720c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f732o);
        }
        j0 j0Var = this.f721d;
        if (j0Var != null) {
            j0Var.setAdapter(this.f720c);
        }
    }

    public j0 q(Context context, boolean z2) {
        return new j0(context, z2);
    }

    public void r(int i2) {
        Drawable background = this.f743z.getBackground();
        if (background != null) {
            background.getPadding(this.f740w);
            Rect rect = this.f740w;
            this.f723f = rect.left + rect.right + i2;
            return;
        }
        this.f723f = i2;
    }

    public void s(boolean z2) {
        this.f742y = z2;
        this.f743z.setFocusable(z2);
    }
}
