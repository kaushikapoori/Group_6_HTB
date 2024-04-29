package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.example.supermarket.R;
import g0.b0;
import g0.j;
import g0.k;
import g0.l;
import g0.m;
import g0.u;
import g0.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import x.a;

public class CoordinatorLayout extends ViewGroup implements j, k {

    /* renamed from: u  reason: collision with root package name */
    public static final String f1032u;

    /* renamed from: v  reason: collision with root package name */
    public static final Class<?>[] f1033v = {Context.class, AttributeSet.class};

    /* renamed from: w  reason: collision with root package name */
    public static final ThreadLocal<Map<String, Constructor<c>>> f1034w = new ThreadLocal<>();

    /* renamed from: x  reason: collision with root package name */
    public static final Comparator<View> f1035x = new i();

    /* renamed from: y  reason: collision with root package name */
    public static final n.e<Rect> f1036y = new f0.c(12);

    /* renamed from: b  reason: collision with root package name */
    public final List<View> f1037b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final n.c f1038c = new n.c(1);

    /* renamed from: d  reason: collision with root package name */
    public final List<View> f1039d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final List<View> f1040e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1041f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1042g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public boolean f1043h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1044i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f1045j;

    /* renamed from: k  reason: collision with root package name */
    public View f1046k;

    /* renamed from: l  reason: collision with root package name */
    public View f1047l;

    /* renamed from: m  reason: collision with root package name */
    public g f1048m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1049n;

    /* renamed from: o  reason: collision with root package name */
    public b0 f1050o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1051p;

    /* renamed from: q  reason: collision with root package name */
    public Drawable f1052q;

    /* renamed from: r  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1053r;

    /* renamed from: s  reason: collision with root package name */
    public m f1054s;

    /* renamed from: t  reason: collision with root package name */
    public final l f1055t = new l();

    public class a implements m {
        public a() {
        }

        public b0 a(View view, b0 b0Var) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.f1050o, b0Var)) {
                coordinatorLayout.f1050o = b0Var;
                boolean z2 = true;
                boolean z3 = b0Var.e() > 0;
                coordinatorLayout.f1051p = z3;
                if (z3 || coordinatorLayout.getBackground() != null) {
                    z2 = false;
                }
                coordinatorLayout.setWillNotDraw(z2);
                if (!b0Var.g()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = coordinatorLayout.getChildAt(i2);
                        WeakHashMap<View, x> weakHashMap = u.f3063a;
                        if (u.d.b(childAt) && ((f) childAt.getLayoutParams()).f1058a != null && b0Var.g()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return b0Var;
        }
    }

    public interface b {
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v2, Rect rect) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v2, View view) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v2, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, V v2, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i2) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, V v2, int i2, int i3, int i4, int i5) {
            return false;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, V v2, View view, float f2, float f3) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int[] iArr, int i4) {
        }

        public void l(CoordinatorLayout coordinatorLayout, V v2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v2, Rect rect, boolean z2) {
            return false;
        }

        public void n(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        }

        public Parcelable o(CoordinatorLayout coordinatorLayout, V v2) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i2, int i3) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v2, View view, int i2) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }
    }

    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
        }

        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1053r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f1053r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public c f1058a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1059b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f1060c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f1061d = 0;

        /* renamed from: e  reason: collision with root package name */
        public int f1062e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f1063f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f1064g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f1065h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f1066i;

        /* renamed from: j  reason: collision with root package name */
        public int f1067j;

        /* renamed from: k  reason: collision with root package name */
        public View f1068k;

        /* renamed from: l  reason: collision with root package name */
        public View f1069l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1070m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1071n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1072o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1073p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f1074q = new Rect();

        public f(int i2, int i3) {
            super(i2, i3);
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c cVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, t.a.f3884b);
            this.f1060c = obtainStyledAttributes.getInteger(0, 0);
            this.f1063f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1061d = obtainStyledAttributes.getInteger(2, 0);
            this.f1062e = obtainStyledAttributes.getInteger(6, -1);
            this.f1064g = obtainStyledAttributes.getInt(5, 0);
            this.f1065h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f1059b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f1032u;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f1032u;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.f1034w;
                        Map map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1033v);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = (c) constructor.newInstance(new Object[]{context, attributeSet});
                    } catch (Exception e2) {
                        throw new RuntimeException(h.f.a("Could not inflate Behavior subclass ", string), e2);
                    }
                }
                this.f1058a = cVar;
            }
            obtainStyledAttributes.recycle();
            c cVar2 = this.f1058a;
            if (cVar2 != null) {
                cVar2.c(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public f(f fVar) {
            super(fVar);
        }

        public boolean a(int i2) {
            if (i2 == 0) {
                return this.f1071n;
            }
            if (i2 != 1) {
                return false;
            }
            return this.f1072o;
        }

        public void b(c cVar) {
            c cVar2 = this.f1058a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.f();
                }
                this.f1058a = cVar;
                this.f1059b = true;
                if (cVar != null) {
                    cVar.c(this);
                }
            }
        }

        public void c(int i2, boolean z2) {
            if (i2 == 0) {
                this.f1071n = z2;
            } else if (i2 == 1) {
                this.f1072o = z2;
            }
        }
    }

    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    public static class h extends l0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public SparseArray<Parcelable> f1076d;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i2) {
                return new h[i2];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1076d = new SparseArray<>(readInt);
            for (int i2 = 0; i2 < readInt; i2++) {
                this.f1076d.append(iArr[i2], readParcelableArray[i2]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3321b, i2);
            SparseArray<Parcelable> sparseArray = this.f1076d;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f1076d.keyAt(i3);
                parcelableArr[i3] = this.f1076d.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }
    }

    public static class i implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            float m2 = u.i.m((View) obj);
            float m3 = u.i.m((View) obj2);
            if (m2 > m3) {
                return -1;
            }
            return m2 < m3 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = r0.getName()
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            f1032u = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$i r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$i
            r0.<init>()
            f1035x = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            r1 = 1
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r0[r1] = r2
            f1033v = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            f1034w = r0
            f0.c r0 = new f0.c
            r1 = 12
            r0.<init>(r1)
            f1036y = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = t.a.f3883a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.f1045j = resources.getIntArray(resourceId);
            float f2 = resources.getDisplayMetrics().density;
            int length = this.f1045j.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr2 = this.f1045j;
                iArr2[i2] = (int) (((float) iArr2[i2]) * f2);
            }
        }
        this.f1052q = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (u.d.c(this) == 0) {
            u.d.s(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) f1036y.a();
        return rect == null ? new Rect() : rect;
    }

    public final void b(f fVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + fVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - fVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + fVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - fVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    public void c(View view, boolean z2, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    public List<View> d(View view) {
        n.c cVar = this.f1038c;
        int i2 = ((m.h) cVar.f3439b).f3377d;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) ((m.h) cVar.f3439b).k(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((m.h) cVar.f3439b).h(i3));
            }
        }
        this.f1040e.clear();
        if (arrayList != null) {
            this.f1040e.addAll(arrayList);
        }
        return this.f1040e;
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        c cVar = ((f) view.getLayoutParams()).f1058a;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
        }
        return super.drawChild(canvas, view, j2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1052q;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public List<View> e(View view) {
        List list = (List) ((m.h) this.f1038c.f3439b).getOrDefault(view, null);
        this.f1040e.clear();
        if (list != null) {
            this.f1040e.addAll(list);
        }
        return this.f1040e;
    }

    public void f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = u.a.f3902a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = u.a.f3902a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        u.a.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = u.a.f3903b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void g(int i2, Rect rect, Rect rect2, f fVar, int i3, int i4) {
        int i5 = fVar.f1060c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = fVar.f1061d;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        int width = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            width -= i3 / 2;
        } else if (i7 != 5) {
            width -= i3;
        }
        if (i8 == 16) {
            height -= i4 / 2;
        } else if (i8 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f1037b);
    }

    public final b0 getLastWindowInsets() {
        return this.f1050o;
    }

    public int getNestedScrollAxes() {
        return this.f1055t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f1052q;
    }

    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final int h(int i2) {
        StringBuilder sb;
        int[] iArr = this.f1045j;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i2);
        } else if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i2);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public void i(View view, View view2, int i2, int i3) {
        l lVar = this.f1055t;
        if (i3 == 1) {
            lVar.f3058b = i2;
        } else {
            lVar.f3057a = i2;
        }
        this.f1047l = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            boolean a2 = ((f) getChildAt(i4).getLayoutParams()).a(i3);
        }
    }

    public f j(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1059b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
            } else {
                d dVar = null;
                for (Class cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b((c) dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e2) {
                        StringBuilder a2 = androidx.activity.result.a.a("Default behavior class ");
                        a2.append(dVar.value().getName());
                        a2.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", a2.toString(), e2);
                    }
                }
            }
            fVar.f1059b = true;
        }
        return fVar;
    }

    public void k(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i6) && (cVar = fVar.f1058a) != null) {
                    int[] iArr2 = this.f1041f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    int[] iArr3 = this.f1041f;
                    i7 = i4 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    i8 = i5 > 0 ? Math.max(i8, this.f1041f[1]) : Math.min(i8, this.f1041f[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z2) {
            q(1);
        }
    }

    public void l(View view, int i2, int i3, int i4, int i5, int i6) {
        k(view, i2, i3, i4, i5, 0, this.f1042g);
    }

    public void m(View view, int i2) {
        l lVar = this.f1055t;
        if (i2 == 1) {
            lVar.f3058b = 0;
        } else {
            lVar.f3057a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i2)) {
                c cVar = fVar.f1058a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i2);
                }
                fVar.c(i2, false);
                fVar.f1073p = false;
            }
        }
        this.f1047l = null;
    }

    public void n(View view, int i2, int i3, int[] iArr, int i4) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                int i8 = i4;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i4) && (cVar = fVar.f1058a) != null) {
                    int[] iArr2 = this.f1041f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i2, i3, iArr2, i4);
                    int[] iArr3 = this.f1041f;
                    i5 = i2 > 0 ? Math.max(i5, iArr3[0]) : Math.min(i5, iArr3[0]);
                    int[] iArr4 = this.f1041f;
                    i6 = i3 > 0 ? Math.max(i6, iArr4[1]) : Math.min(i6, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z2) {
            q(1);
        }
    }

    public boolean o(View view, View view2, int i2, int i3) {
        int i4 = i3;
        int childCount = getChildCount();
        int i5 = 0;
        boolean z2 = false;
        while (true) {
            if (i5 >= childCount) {
                return z2;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f1058a;
                if (cVar != null) {
                    boolean p2 = cVar.p(this, childAt, view, view2, i2, i3);
                    z2 |= p2;
                    fVar.c(i4, p2);
                } else {
                    fVar.c(i4, false);
                }
            }
            i5++;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.f1049n) {
            if (this.f1048m == null) {
                this.f1048m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1048m);
        }
        if (this.f1050o == null) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (u.d.b(this)) {
                u.h.c(this);
            }
        }
        this.f1044i = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.f1049n && this.f1048m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1048m);
        }
        View view = this.f1047l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1044i = false;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1051p && this.f1052q != null) {
            b0 b0Var = this.f1050o;
            int e2 = b0Var != null ? b0Var.e() : 0;
            if (e2 > 0) {
                this.f1052q.setBounds(0, 0, getWidth(), e2);
                this.f1052q.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t2 = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            v(true);
        }
        return t2;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        c cVar;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        int d2 = u.e.d(this);
        int size = this.f1037b.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = this.f1037b.get(i6);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f1058a) == null || !cVar.h(this, view, d2))) {
                r(view, d2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0184, code lost:
        if (r0.i(r30, r20, r8, r21, r23, 0) == false) goto L_0x0194;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r31, int r32) {
        /*
            r30 = this;
            r7 = r30
            r30.u()
            int r0 = r30.getChildCount()
            r8 = 0
            r1 = 0
        L_0x000b:
            r2 = 1
            if (r1 >= r0) goto L_0x003c
            android.view.View r3 = r7.getChildAt(r1)
            n.c r4 = r7.f1038c
            n.e r5 = r4.f3439b
            m.h r5 = (m.h) r5
            int r5 = r5.f3377d
            r6 = 0
        L_0x001b:
            if (r6 >= r5) goto L_0x0034
            n.e r9 = r4.f3439b
            m.h r9 = (m.h) r9
            java.lang.Object r9 = r9.k(r6)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L_0x0031
            boolean r9 = r9.contains(r3)
            if (r9 == 0) goto L_0x0031
            r3 = 1
            goto L_0x0035
        L_0x0031:
            int r6 = r6 + 1
            goto L_0x001b
        L_0x0034:
            r3 = 0
        L_0x0035:
            if (r3 == 0) goto L_0x0039
            r0 = 1
            goto L_0x003d
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x000b
        L_0x003c:
            r0 = 0
        L_0x003d:
            boolean r1 = r7.f1049n
            if (r0 == r1) goto L_0x0071
            if (r0 == 0) goto L_0x005e
            boolean r0 = r7.f1044i
            if (r0 == 0) goto L_0x005b
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f1048m
            if (r0 != 0) goto L_0x0052
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$g
            r0.<init>()
            r7.f1048m = r0
        L_0x0052:
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f1048m
            r0.addOnPreDrawListener(r1)
        L_0x005b:
            r7.f1049n = r2
            goto L_0x0071
        L_0x005e:
            boolean r0 = r7.f1044i
            if (r0 == 0) goto L_0x006f
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r0 = r7.f1048m
            if (r0 == 0) goto L_0x006f
            android.view.ViewTreeObserver r0 = r30.getViewTreeObserver()
            androidx.coordinatorlayout.widget.CoordinatorLayout$g r1 = r7.f1048m
            r0.removeOnPreDrawListener(r1)
        L_0x006f:
            r7.f1049n = r8
        L_0x0071:
            int r9 = r30.getPaddingLeft()
            int r0 = r30.getPaddingTop()
            int r10 = r30.getPaddingRight()
            int r1 = r30.getPaddingBottom()
            java.util.WeakHashMap<android.view.View, g0.x> r3 = g0.u.f3063a
            int r11 = g0.u.e.d(r30)
            if (r11 != r2) goto L_0x008b
            r12 = 1
            goto L_0x008c
        L_0x008b:
            r12 = 0
        L_0x008c:
            int r13 = android.view.View.MeasureSpec.getMode(r31)
            int r14 = android.view.View.MeasureSpec.getSize(r31)
            int r15 = android.view.View.MeasureSpec.getMode(r32)
            int r16 = android.view.View.MeasureSpec.getSize(r32)
            int r17 = r9 + r10
            int r18 = r0 + r1
            int r0 = r30.getSuggestedMinimumWidth()
            int r1 = r30.getSuggestedMinimumHeight()
            g0.b0 r3 = r7.f1050o
            if (r3 == 0) goto L_0x00b5
            boolean r3 = g0.u.d.b(r30)
            if (r3 == 0) goto L_0x00b5
            r19 = 1
            goto L_0x00b7
        L_0x00b5:
            r19 = 0
        L_0x00b7:
            java.util.List<android.view.View> r2 = r7.f1037b
            int r6 = r2.size()
            r5 = r0
            r4 = r1
            r2 = 0
            r3 = 0
        L_0x00c1:
            if (r3 >= r6) goto L_0x01da
            java.util.List<android.view.View> r0 = r7.f1037b
            java.lang.Object r0 = r0.get(r3)
            r20 = r0
            android.view.View r20 = (android.view.View) r20
            int r0 = r20.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x00dd
            r22 = r3
            r29 = r6
            r28 = r9
            goto L_0x01d1
        L_0x00dd:
            android.view.ViewGroup$LayoutParams r0 = r20.getLayoutParams()
            r1 = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r1
            int r0 = r1.f1062e
            if (r0 < 0) goto L_0x0127
            if (r13 == 0) goto L_0x0127
            int r0 = r7.h(r0)
            int r8 = r1.f1060c
            if (r8 != 0) goto L_0x00f5
            r8 = 8388661(0x800035, float:1.1755018E-38)
        L_0x00f5:
            int r8 = android.view.Gravity.getAbsoluteGravity(r8, r11)
            r8 = r8 & 7
            r22 = r2
            r2 = 3
            if (r8 != r2) goto L_0x0102
            if (r12 == 0) goto L_0x0107
        L_0x0102:
            r2 = 5
            if (r8 != r2) goto L_0x0113
            if (r12 == 0) goto L_0x0113
        L_0x0107:
            int r2 = r14 - r10
            int r2 = r2 - r0
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r21 = r2
            r8 = 0
            goto L_0x012b
        L_0x0113:
            if (r8 != r2) goto L_0x0117
            if (r12 == 0) goto L_0x011c
        L_0x0117:
            r2 = 3
            if (r8 != r2) goto L_0x0125
            if (r12 == 0) goto L_0x0125
        L_0x011c:
            int r0 = r0 - r9
            r8 = 0
            int r0 = java.lang.Math.max(r8, r0)
            r21 = r0
            goto L_0x012b
        L_0x0125:
            r8 = 0
            goto L_0x0129
        L_0x0127:
            r22 = r2
        L_0x0129:
            r21 = 0
        L_0x012b:
            if (r19 == 0) goto L_0x015d
            boolean r0 = g0.u.d.b(r20)
            if (r0 != 0) goto L_0x015d
            g0.b0 r0 = r7.f1050o
            int r0 = r0.c()
            g0.b0 r2 = r7.f1050o
            int r2 = r2.d()
            int r2 = r2 + r0
            g0.b0 r0 = r7.f1050o
            int r0 = r0.e()
            g0.b0 r8 = r7.f1050o
            int r8 = r8.b()
            int r8 = r8 + r0
            int r0 = r14 - r2
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r13)
            int r2 = r16 - r8
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r15)
            r8 = r0
            r23 = r2
            goto L_0x0161
        L_0x015d:
            r8 = r31
            r23 = r32
        L_0x0161:
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r0 = r1.f1058a
            if (r0 == 0) goto L_0x0187
            r24 = 0
            r2 = r1
            r1 = r30
            r26 = r2
            r25 = r22
            r2 = r20
            r22 = r3
            r3 = r8
            r27 = r4
            r4 = r21
            r28 = r9
            r9 = r5
            r5 = r23
            r29 = r6
            r6 = r24
            boolean r0 = r0.i(r1, r2, r3, r4, r5, r6)
            if (r0 != 0) goto L_0x01a1
            goto L_0x0194
        L_0x0187:
            r26 = r1
            r27 = r4
            r29 = r6
            r28 = r9
            r25 = r22
            r22 = r3
            r9 = r5
        L_0x0194:
            r5 = 0
            r0 = r30
            r1 = r20
            r2 = r8
            r3 = r21
            r4 = r23
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
        L_0x01a1:
            int r0 = r20.getMeasuredWidth()
            int r0 = r0 + r17
            r1 = r26
            int r2 = r1.leftMargin
            int r0 = r0 + r2
            int r2 = r1.rightMargin
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r9, r0)
            int r2 = r20.getMeasuredHeight()
            int r2 = r2 + r18
            int r3 = r1.topMargin
            int r2 = r2 + r3
            int r1 = r1.bottomMargin
            int r2 = r2 + r1
            r1 = r27
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r20.getMeasuredState()
            r8 = r25
            int r2 = android.view.View.combineMeasuredStates(r8, r2)
            r5 = r0
            r4 = r1
        L_0x01d1:
            int r3 = r22 + 1
            r9 = r28
            r6 = r29
            r8 = 0
            goto L_0x00c1
        L_0x01da:
            r8 = r2
            r1 = r4
            r9 = r5
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r8
            r2 = r31
            int r0 = android.view.View.resolveSizeAndState(r9, r2, r0)
            int r2 = r8 << 16
            r3 = r32
            int r1 = android.view.View.resolveSizeAndState(r1, r3, r2)
            r7.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0)) {
                    c cVar = fVar.f1058a;
                }
            }
        }
        return false;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        c cVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1058a) != null) {
                    z2 |= cVar.j(this, childAt, view, f2, f3);
                }
            }
        }
        return z2;
    }

    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        n(view, i2, i3, iArr, 0);
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        k(view, i2, i3, i4, i5, 0, this.f1042g);
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        i(view, view2, i2, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f3321b);
        SparseArray<Parcelable> sparseArray = hVar.f1076d;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = j(childAt).f1058a;
            if (!(id == -1 || cVar == null || (parcelable2 = sparseArray.get(id)) == null)) {
                cVar.n(this, childAt, parcelable2);
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable o2;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f1058a;
            if (!(id == -1 || cVar == null || (o2 = cVar.o(this, childAt)) == null)) {
                sparseArray.append(id, o2);
            }
        }
        hVar.f1076d = sparseArray;
        return hVar;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return o(view, view2, i2, 0);
    }

    public void onStopNestedScroll(View view) {
        m(view, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r3 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1046k
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L_0x0015
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0015:
            r3 = 0
        L_0x0016:
            android.view.View r6 = r0.f1046k
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1058a
            if (r6 == 0) goto L_0x0029
            android.view.View r7 = r0.f1046k
            boolean r6 = r6.r(r0, r7, r1)
            goto L_0x002a
        L_0x0029:
            r6 = 0
        L_0x002a:
            android.view.View r7 = r0.f1046k
            r8 = 0
            if (r7 != 0) goto L_0x0035
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L_0x0048
        L_0x0035:
            if (r3 == 0) goto L_0x0048
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L_0x0048:
            if (r8 == 0) goto L_0x004d
            r8.recycle()
        L_0x004d:
            if (r2 == r4) goto L_0x0052
            r1 = 3
            if (r2 != r1) goto L_0x0055
        L_0x0052:
            r0.v(r5)
        L_0x0055:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean p(View view, int i2, int i3) {
        Rect a2 = a();
        f(view, a2);
        try {
            return a2.contains(i2, i3);
        } finally {
            a2.setEmpty();
            f1036y.c(a2);
        }
    }

    public final void q(int i2) {
        int i3;
        Rect rect;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int width;
        int i5;
        int i6;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        Rect rect2;
        int i11;
        int i12;
        int i13;
        f fVar;
        c cVar;
        int i14 = i2;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        int d2 = u.e.d(this);
        int size = this.f1037b.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        int i15 = 0;
        while (i15 < size) {
            View view = this.f1037b.get(i15);
            f fVar2 = (f) view.getLayoutParams();
            if (i14 == 0 && view.getVisibility() == 8) {
                i4 = size;
                rect = a4;
                i3 = i15;
            } else {
                int i16 = 0;
                while (i16 < i15) {
                    if (fVar2.f1069l == this.f1037b.get(i16)) {
                        f fVar3 = (f) view.getLayoutParams();
                        if (fVar3.f1068k != null) {
                            Rect a5 = a();
                            Rect a6 = a();
                            Rect a7 = a();
                            f(fVar3.f1068k, a5);
                            c(view, false, a6);
                            int measuredWidth = view.getMeasuredWidth();
                            i13 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            int i17 = measuredWidth;
                            Rect rect3 = a7;
                            i12 = i15;
                            Rect rect4 = a6;
                            Rect rect5 = a5;
                            f fVar4 = fVar3;
                            i11 = i16;
                            rect2 = a4;
                            fVar = fVar2;
                            g(d2, a5, rect3, fVar3, i17, measuredHeight);
                            Rect rect6 = rect3;
                            boolean z5 = (rect6.left == rect4.left && rect6.top == rect4.top) ? false : true;
                            f fVar5 = fVar4;
                            b(fVar5, rect6, i17, measuredHeight);
                            int i18 = rect6.left - rect4.left;
                            int i19 = rect6.top - rect4.top;
                            if (i18 != 0) {
                                u.n(view, i18);
                            }
                            if (i19 != 0) {
                                u.o(view, i19);
                            }
                            if (z5 && (cVar = fVar5.f1058a) != null) {
                                cVar.d(this, view, fVar5.f1068k);
                            }
                            rect5.setEmpty();
                            n.e<Rect> eVar = f1036y;
                            eVar.c(rect5);
                            rect4.setEmpty();
                            eVar.c(rect4);
                            rect6.setEmpty();
                            eVar.c(rect6);
                            i16 = i11 + 1;
                            fVar2 = fVar;
                            size = i13;
                            i15 = i12;
                            a4 = rect2;
                        }
                    }
                    i11 = i16;
                    i13 = size;
                    rect2 = a4;
                    i12 = i15;
                    fVar = fVar2;
                    i16 = i11 + 1;
                    fVar2 = fVar;
                    size = i13;
                    i15 = i12;
                    a4 = rect2;
                }
                int i20 = size;
                Rect rect7 = a4;
                i3 = i15;
                f fVar6 = fVar2;
                c(view, true, a3);
                if (fVar6.f1064g != 0 && !a3.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar6.f1064g, d2);
                    int i21 = absoluteGravity & 112;
                    if (i21 == 48) {
                        a2.top = Math.max(a2.top, a3.bottom);
                    } else if (i21 == 80) {
                        a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                    }
                    int i22 = absoluteGravity & 7;
                    if (i22 == 3) {
                        a2.left = Math.max(a2.left, a3.right);
                    } else if (i22 == 5) {
                        a2.right = Math.max(a2.right, getWidth() - a3.left);
                    }
                }
                if (fVar6.f1065h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, x> weakHashMap2 = u.f3063a;
                    if (u.g.c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar7 = (f) view.getLayoutParams();
                        c cVar2 = fVar7.f1058a;
                        Rect a8 = a();
                        Rect a9 = a();
                        a9.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar2 == null || !cVar2.a(this, view, a8)) {
                            a8.set(a9);
                        } else if (!a9.contains(a8)) {
                            StringBuilder a10 = androidx.activity.result.a.a("Rect should be within the child's bounds. Rect:");
                            a10.append(a8.toShortString());
                            a10.append(" | Bounds:");
                            a10.append(a9.toShortString());
                            throw new IllegalArgumentException(a10.toString());
                        }
                        a9.setEmpty();
                        n.e<Rect> eVar2 = f1036y;
                        eVar2.c(a9);
                        if (!a8.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar7.f1065h, d2);
                            if ((absoluteGravity2 & 48) != 48 || (i9 = (a8.top - fVar7.topMargin) - fVar7.f1067j) >= (i10 = a2.top)) {
                                z3 = false;
                            } else {
                                x(view, i10 - i9);
                                z3 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a8.bottom) - fVar7.bottomMargin) + fVar7.f1067j) < (i8 = a2.bottom)) {
                                x(view, height - i8);
                                z3 = true;
                            }
                            if (!z3) {
                                x(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i6 = (a8.left - fVar7.leftMargin) - fVar7.f1066i) >= (i7 = a2.left)) {
                                z4 = false;
                            } else {
                                w(view, i7 - i6);
                                z4 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a8.right) - fVar7.rightMargin) + fVar7.f1066i) < (i5 = a2.right)) {
                                w(view, width - i5);
                                z4 = true;
                            }
                            if (!z4) {
                                w(view, 0);
                            }
                        }
                        a8.setEmpty();
                        eVar2.c(a8);
                    }
                }
                if (i14 != 2) {
                    rect = rect7;
                    rect.set(((f) view.getLayoutParams()).f1074q);
                    if (rect.equals(a3)) {
                        i4 = i20;
                    } else {
                        ((f) view.getLayoutParams()).f1074q.set(a3);
                    }
                } else {
                    rect = rect7;
                }
                i4 = i20;
                for (int i23 = i3 + 1; i23 < i4; i23++) {
                    View view2 = this.f1037b.get(i23);
                    f fVar8 = (f) view2.getLayoutParams();
                    c cVar3 = fVar8.f1058a;
                    if (cVar3 != null && cVar3.b(this, view2, view)) {
                        if (i14 != 0 || !fVar8.f1073p) {
                            if (i14 != 2) {
                                z2 = cVar3.d(this, view2, view);
                            } else {
                                cVar3.e(this, view2, view);
                                z2 = true;
                            }
                            if (i14 == 1) {
                                fVar8.f1073p = z2;
                            }
                        } else {
                            fVar8.f1073p = false;
                        }
                    }
                }
            }
            i15 = i3 + 1;
            size = i4;
            a4 = rect;
        }
        Rect rect8 = a4;
        a2.setEmpty();
        n.e<Rect> eVar3 = f1036y;
        eVar3.c(a2);
        a3.setEmpty();
        eVar3.c(a3);
        rect8.setEmpty();
        eVar3.c(rect8);
    }

    public void r(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f1068k;
        int i3 = 0;
        if (view2 == null && fVar.f1063f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        } else if (view2 != null) {
            Rect a2 = a();
            Rect a3 = a();
            try {
                f(view2, a2);
                f fVar2 = (f) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                g(i2, a2, a3, fVar2, measuredWidth, measuredHeight);
                b(fVar2, a3, measuredWidth, measuredHeight);
                view.layout(a3.left, a3.top, a3.right, a3.bottom);
            } finally {
                a2.setEmpty();
                n.e<Rect> eVar = f1036y;
                eVar.c(a2);
                a3.setEmpty();
                eVar.c(a3);
            }
        } else {
            int i4 = fVar.f1062e;
            if (i4 >= 0) {
                f fVar3 = (f) view.getLayoutParams();
                int i5 = fVar3.f1060c;
                if (i5 == 0) {
                    i5 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
                int i6 = absoluteGravity & 7;
                int i7 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i2 == 1) {
                    i4 = width - i4;
                }
                int h2 = h(i4) - measuredWidth2;
                if (i6 == 1) {
                    h2 += measuredWidth2 / 2;
                } else if (i6 == 5) {
                    h2 += measuredWidth2;
                }
                if (i7 == 16) {
                    i3 = 0 + (measuredHeight2 / 2);
                } else if (i7 == 80) {
                    i3 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + fVar3.leftMargin, Math.min(h2, ((width - getPaddingRight()) - measuredWidth2) - fVar3.rightMargin));
                int max2 = Math.max(getPaddingTop() + fVar3.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - fVar3.bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar4 = (f) view.getLayoutParams();
            Rect a4 = a();
            a4.set(getPaddingLeft() + fVar4.leftMargin, getPaddingTop() + fVar4.topMargin, (getWidth() - getPaddingRight()) - fVar4.rightMargin, (getHeight() - getPaddingBottom()) - fVar4.bottomMargin);
            if (this.f1050o != null) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                if (u.d.b(this) && !u.d.b(view)) {
                    a4.left = this.f1050o.c() + a4.left;
                    a4.top = this.f1050o.e() + a4.top;
                    a4.right -= this.f1050o.d();
                    a4.bottom -= this.f1050o.b();
                }
            }
            Rect a5 = a();
            int i8 = fVar4.f1060c;
            if ((i8 & 7) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            Gravity.apply(i8, view.getMeasuredWidth(), view.getMeasuredHeight(), a4, a5, i2);
            view.layout(a5.left, a5.top, a5.right, a5.bottom);
            a4.setEmpty();
            n.e<Rect> eVar2 = f1036y;
            eVar2.c(a4);
            a5.setEmpty();
            eVar2.c(a5);
        }
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        c cVar = ((f) view.getLayoutParams()).f1058a;
        if (cVar == null || !cVar.m(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.f1043h) {
            v(false);
            this.f1043h = true;
        }
    }

    public void s(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        y();
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1053r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1052q;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f1052q = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f1052q.setState(getDrawableState());
                }
                Drawable drawable4 = this.f1052q;
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                a0.a.c(drawable4, u.e.d(this));
                this.f1052q.setVisible(getVisibility() == 0, false);
                this.f1052q.setCallback(this);
            }
            WeakHashMap<View, x> weakHashMap2 = u.f3063a;
            u.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        Drawable drawable;
        if (i2 != 0) {
            Context context = getContext();
            Object obj = x.a.f4298a;
            drawable = a.b.b(context, i2);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1052q;
        if (drawable != null && drawable.isVisible() != z2) {
            this.f1052q.setVisible(z2, false);
        }
    }

    public final boolean t(MotionEvent motionEvent, int i2) {
        boolean z2;
        MotionEvent motionEvent2 = motionEvent;
        int i3 = i2;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1039d;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i4 = childCount - 1; i4 >= 0; i4--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i4) : i4));
        }
        Comparator<View> comparator = f1035x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent3 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view = list.get(i5);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f1058a;
            if ((!z3 && !z4) || actionMasked == 0) {
                if (!z3 && cVar != null) {
                    if (i3 == 0) {
                        z3 = cVar.g(this, view, motionEvent2);
                    } else if (i3 == 1) {
                        z3 = cVar.r(this, view, motionEvent2);
                    }
                    if (z3) {
                        this.f1046k = view;
                    }
                }
                if (fVar.f1058a == null) {
                    fVar.f1070m = false;
                }
                boolean z5 = fVar.f1070m;
                if (z5) {
                    z2 = true;
                } else {
                    z2 = z5 | false;
                    fVar.f1070m = z2;
                }
                z4 = z2 && !z5;
                if (z2 && !z4) {
                    break;
                }
            } else if (cVar != null) {
                if (motionEvent3 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent3 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i3 == 0) {
                    cVar.g(this, view, motionEvent3);
                } else if (i3 == 1) {
                    cVar.r(this, view, motionEvent3);
                }
            }
        }
        list.clear();
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        if (r5 != false) goto L_0x00c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0162 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r11 = this;
            java.util.List<android.view.View> r0 = r11.f1037b
            r0.clear()
            n.c r0 = r11.f1038c
            n.e r1 = r0.f3439b
            m.h r1 = (m.h) r1
            int r1 = r1.f3377d
            r2 = 0
            r3 = 0
        L_0x000f:
            if (r3 >= r1) goto L_0x0023
            n.e r4 = r0.f3439b
            m.h r4 = (m.h) r4
            java.lang.Object r4 = r4.k(r3)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L_0x0020
            r0.d(r4)
        L_0x0020:
            int r3 = r3 + 1
            goto L_0x000f
        L_0x0023:
            n.e r0 = r0.f3439b
            m.h r0 = (m.h) r0
            r0.clear()
            int r0 = r11.getChildCount()
            r1 = 0
        L_0x002f:
            if (r1 >= r0) goto L_0x018f
            android.view.View r3 = r11.getChildAt(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r4 = r11.j(r3)
            int r5 = r4.f1063f
            r6 = -1
            r7 = 0
            if (r5 != r6) goto L_0x0045
            r4.f1069l = r7
            r4.f1068k = r7
            goto L_0x00c3
        L_0x0045:
            android.view.View r5 = r4.f1068k
            if (r5 == 0) goto L_0x0076
            int r5 = r5.getId()
            int r6 = r4.f1063f
            if (r5 == r6) goto L_0x0052
            goto L_0x006f
        L_0x0052:
            android.view.View r5 = r4.f1068k
            android.view.ViewParent r6 = r5.getParent()
        L_0x0058:
            if (r6 == r11) goto L_0x0071
            if (r6 == 0) goto L_0x006b
            if (r6 != r3) goto L_0x005f
            goto L_0x006b
        L_0x005f:
            boolean r8 = r6 instanceof android.view.View
            if (r8 == 0) goto L_0x0066
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x0066:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0058
        L_0x006b:
            r4.f1069l = r7
            r4.f1068k = r7
        L_0x006f:
            r5 = 0
            goto L_0x0074
        L_0x0071:
            r4.f1069l = r5
            r5 = 1
        L_0x0074:
            if (r5 != 0) goto L_0x00c3
        L_0x0076:
            int r5 = r4.f1063f
            android.view.View r5 = r11.findViewById(r5)
            r4.f1068k = r5
            if (r5 == 0) goto L_0x00b9
            if (r5 != r11) goto L_0x0091
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x0089
            goto L_0x00bf
        L_0x0089:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "View can not be anchored to the the parent CoordinatorLayout"
            r0.<init>(r1)
            throw r0
        L_0x0091:
            android.view.ViewParent r6 = r5.getParent()
        L_0x0095:
            if (r6 == r11) goto L_0x00b6
            if (r6 == 0) goto L_0x00b6
            if (r6 != r3) goto L_0x00aa
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x00a2
            goto L_0x00bf
        L_0x00a2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Anchor must not be a descendant of the anchored view"
            r0.<init>(r1)
            throw r0
        L_0x00aa:
            boolean r8 = r6 instanceof android.view.View
            if (r8 == 0) goto L_0x00b1
            r5 = r6
            android.view.View r5 = (android.view.View) r5
        L_0x00b1:
            android.view.ViewParent r6 = r6.getParent()
            goto L_0x0095
        L_0x00b6:
            r4.f1069l = r5
            goto L_0x00c3
        L_0x00b9:
            boolean r5 = r11.isInEditMode()
            if (r5 == 0) goto L_0x016a
        L_0x00bf:
            r4.f1069l = r7
            r4.f1068k = r7
        L_0x00c3:
            n.c r5 = r11.f1038c
            r5.a(r3)
            r5 = 0
        L_0x00c9:
            if (r5 >= r0) goto L_0x0166
            if (r5 != r1) goto L_0x00cf
            goto L_0x0162
        L_0x00cf:
            android.view.View r6 = r11.getChildAt(r5)
            android.view.View r8 = r4.f1069l
            if (r6 == r8) goto L_0x0106
            java.util.WeakHashMap<android.view.View, g0.x> r8 = g0.u.f3063a
            int r8 = g0.u.e.d(r11)
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r9 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r9
            int r9 = r9.f1064g
            int r9 = android.view.Gravity.getAbsoluteGravity(r9, r8)
            if (r9 == 0) goto L_0x00f6
            int r10 = r4.f1065h
            int r8 = android.view.Gravity.getAbsoluteGravity(r10, r8)
            r8 = r8 & r9
            if (r8 != r9) goto L_0x00f6
            r8 = 1
            goto L_0x00f7
        L_0x00f6:
            r8 = 0
        L_0x00f7:
            if (r8 != 0) goto L_0x0106
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r8 = r4.f1058a
            if (r8 == 0) goto L_0x0104
            boolean r8 = r8.b(r11, r3, r6)
            if (r8 == 0) goto L_0x0104
            goto L_0x0106
        L_0x0104:
            r8 = 0
            goto L_0x0107
        L_0x0106:
            r8 = 1
        L_0x0107:
            if (r8 == 0) goto L_0x0162
            n.c r8 = r11.f1038c
            n.e r8 = r8.f3439b
            m.h r8 = (m.h) r8
            int r8 = r8.e(r6)
            if (r8 < 0) goto L_0x0117
            r8 = 1
            goto L_0x0118
        L_0x0117:
            r8 = 0
        L_0x0118:
            if (r8 != 0) goto L_0x011f
            n.c r8 = r11.f1038c
            r8.a(r6)
        L_0x011f:
            n.c r8 = r11.f1038c
            n.e r9 = r8.f3439b
            m.h r9 = (m.h) r9
            int r9 = r9.e(r6)
            if (r9 < 0) goto L_0x012d
            r9 = 1
            goto L_0x012e
        L_0x012d:
            r9 = 0
        L_0x012e:
            if (r9 == 0) goto L_0x015a
            n.e r9 = r8.f3439b
            m.h r9 = (m.h) r9
            int r9 = r9.e(r3)
            if (r9 < 0) goto L_0x013c
            r9 = 1
            goto L_0x013d
        L_0x013c:
            r9 = 0
        L_0x013d:
            if (r9 == 0) goto L_0x015a
            n.e r9 = r8.f3439b
            m.h r9 = (m.h) r9
            java.lang.Object r9 = r9.getOrDefault(r6, r7)
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 != 0) goto L_0x0156
            java.util.ArrayList r9 = r8.c()
            n.e r8 = r8.f3439b
            m.h r8 = (m.h) r8
            r8.put(r6, r9)
        L_0x0156:
            r9.add(r3)
            goto L_0x0162
        L_0x015a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All nodes must be present in the graph before being added as an edge"
            r0.<init>(r1)
            throw r0
        L_0x0162:
            int r5 = r5 + 1
            goto L_0x00c9
        L_0x0166:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x016a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Could not find CoordinatorLayout descendant view with id "
            java.lang.StringBuilder r1 = androidx.activity.result.a.a(r1)
            android.content.res.Resources r2 = r11.getResources()
            int r4 = r4.f1063f
            java.lang.String r2 = r2.getResourceName(r4)
            r1.append(r2)
            java.lang.String r2 = " to anchor view "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x018f:
            java.util.List<android.view.View> r0 = r11.f1037b
            n.c r1 = r11.f1038c
            n.e r3 = r1.f3440c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            java.lang.Object r3 = r1.f3441d
            java.util.HashSet r3 = (java.util.HashSet) r3
            r3.clear()
            n.e r3 = r1.f3439b
            m.h r3 = (m.h) r3
            int r3 = r3.f3377d
        L_0x01a7:
            if (r2 >= r3) goto L_0x01bf
            n.e r4 = r1.f3439b
            m.h r4 = (m.h) r4
            java.lang.Object r4 = r4.h(r2)
            n.e r5 = r1.f3440c
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r1.f3441d
            java.util.HashSet r6 = (java.util.HashSet) r6
            r1.b(r4, r5, r6)
            int r2 = r2 + 1
            goto L_0x01a7
        L_0x01bf:
            n.e r1 = r1.f3440c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r0.addAll(r1)
            java.util.List<android.view.View> r0 = r11.f1037b
            java.util.Collections.reverse(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            c cVar = ((f) childAt.getLayoutParams()).f1058a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    cVar.g(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((f) getChildAt(i3).getLayoutParams()).f1070m = false;
        }
        this.f1046k = null;
        this.f1043h = false;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1052q;
    }

    public final void w(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f1066i;
        if (i3 != i2) {
            u.n(view, i2 - i3);
            fVar.f1066i = i2;
        }
    }

    public final void x(View view, int i2) {
        f fVar = (f) view.getLayoutParams();
        int i3 = fVar.f1067j;
        if (i3 != i2) {
            u.o(view, i2 - i3);
            fVar.f1067j = i2;
        }
    }

    public final void y() {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (u.d.b(this)) {
            if (this.f1054s == null) {
                this.f1054s = new a();
            }
            u.i.u(this, this.f1054s);
            setSystemUiVisibility(1280);
            return;
        }
        u.i.u(this, (m) null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}
