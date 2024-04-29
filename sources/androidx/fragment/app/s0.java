package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c0.b;
import g0.p;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import m.h;

@SuppressLint({"UnknownNullness"})
public abstract class s0 {

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1476b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1477c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1478d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1479e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1480f;

        public a(s0 s0Var, int i2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f1476b = i2;
            this.f1477c = arrayList;
            this.f1478d = arrayList2;
            this.f1479e = arrayList3;
            this.f1480f = arrayList4;
        }

        public void run() {
            for (int i2 = 0; i2 < this.f1476b; i2++) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                u.i.v((View) this.f1477c.get(i2), (String) this.f1478d.get(i2));
                u.i.v((View) this.f1479e.get(i2), (String) this.f1480f.get(i2));
            }
        }
    }

    public static void d(List<View> list, View view) {
        int size = list.size();
        if (!h(list, view, size)) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (u.i.k(view) != null) {
                list.add(view);
            }
            for (int i2 = size; i2 < list.size(); i2++) {
                View view2 = list.get(i2);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = viewGroup.getChildAt(i3);
                        if (!h(list, childAt, size) && u.i.k(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public static boolean h(List<View> list, View view, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (list.get(i3) == view) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList<View> arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z2 = view instanceof ViewGroup;
            ViewGroup viewGroup = view;
            if (z2) {
                ViewGroup viewGroup2 = (ViewGroup) view;
                boolean isTransitionGroup = viewGroup2.isTransitionGroup();
                viewGroup = viewGroup2;
                if (!isTransitionGroup) {
                    int childCount = viewGroup2.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        f(arrayList, viewGroup2.getChildAt(i2));
                    }
                    return;
                }
            }
            arrayList.add(viewGroup);
        }
    }

    public abstract Object g(Object obj);

    public void i(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            String k2 = u.i.k(view);
            if (k2 != null) {
                map.put(k2, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    i(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public void j(View view, Rect rect) {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (u.g.b(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(rectF);
                rectF.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object l(Object obj, Object obj2, Object obj3);

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public ArrayList<String> n(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = arrayList.get(i2);
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            arrayList2.add(u.i.k(view));
            u.i.v(view, (String) null);
        }
        return arrayList2;
    }

    public abstract void o(Object obj, View view);

    public abstract void p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract void q(Object obj, View view, ArrayList<View> arrayList);

    public abstract void r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    public abstract void s(Object obj, Rect rect);

    public abstract void t(Object obj, View view);

    public void u(n nVar, Object obj, b bVar, Runnable runnable) {
        runnable.run();
    }

    public void v(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = arrayList.get(i2);
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            String k2 = u.i.k(view2);
            arrayList4.add(k2);
            if (k2 != null) {
                u.i.v(view2, (String) null);
                String str = (String) ((h) map).getOrDefault(k2, null);
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i3))) {
                        u.i.v(arrayList2.get(i3), k2);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        p.a(view, new a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void w(Object obj, View view, ArrayList<View> arrayList);

    public abstract void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    public abstract Object y(Object obj);
}
