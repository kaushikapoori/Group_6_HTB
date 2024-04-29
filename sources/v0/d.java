package v0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.s0;
import java.util.ArrayList;
import java.util.List;
import v0.g;

@SuppressLint({"RestrictedApi"})
public class d extends s0 {

    public class a extends g.c {
        public a(d dVar, Rect rect) {
        }
    }

    public class b implements g.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f4040a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4041b;

        public b(d dVar, View view, ArrayList arrayList) {
            this.f4040a = view;
            this.f4041b = arrayList;
        }

        public void a(g gVar) {
        }

        public void b(g gVar) {
        }

        public void c(g gVar) {
        }

        public void d(g gVar) {
            gVar.v(this);
            this.f4040a.setVisibility(8);
            int size = this.f4041b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f4041b.get(i2)).setVisibility(0);
            }
        }

        public void e(g gVar) {
        }
    }

    public class c extends j {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f4042a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4043b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f4044c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4045d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f4046e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f4047f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4042a = obj;
            this.f4043b = arrayList;
            this.f4044c = obj2;
            this.f4045d = arrayList2;
            this.f4046e = obj3;
            this.f4047f = arrayList3;
        }

        public void d(g gVar) {
            gVar.v(this);
        }

        public void e(g gVar) {
            Object obj = this.f4042a;
            if (obj != null) {
                d.this.p(obj, this.f4043b, (ArrayList<View>) null);
            }
            Object obj2 = this.f4044c;
            if (obj2 != null) {
                d.this.p(obj2, this.f4045d, (ArrayList<View>) null);
            }
            Object obj3 = this.f4046e;
            if (obj3 != null) {
                d.this.p(obj3, this.f4047f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: v0.d$d  reason: collision with other inner class name */
    public class C0053d extends g.c {
        public C0053d(d dVar, Rect rect) {
        }
    }

    public static boolean z(g gVar) {
        return !s0.k(gVar.f4056f) || !s0.k((List) null) || !s0.k((List) null);
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((g) obj).b(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        g gVar = (g) obj;
        if (gVar != null) {
            int i2 = 0;
            if (gVar instanceof m) {
                m mVar = (m) gVar;
                int size = mVar.f4087y.size();
                while (i2 < size) {
                    b(mVar.I(i2), arrayList);
                    i2++;
                }
            } else if (!z(gVar) && s0.k(gVar.f4057g)) {
                int size2 = arrayList.size();
                while (i2 < size2) {
                    gVar.b(arrayList.get(i2));
                    i2++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        k.a(viewGroup, (g) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof g;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((g) obj).clone();
        }
        return null;
    }

    public Object l(Object obj, Object obj2, Object obj3) {
        g gVar = (g) obj;
        g gVar2 = (g) obj2;
        g gVar3 = (g) obj3;
        if (gVar != null && gVar2 != null) {
            m mVar = new m();
            mVar.H(gVar);
            mVar.H(gVar2);
            mVar.J(1);
            gVar = mVar;
        } else if (gVar == null) {
            gVar = gVar2 != null ? gVar2 : null;
        }
        if (gVar3 == null) {
            return gVar;
        }
        m mVar2 = new m();
        if (gVar != null) {
            mVar2.H(gVar);
        }
        mVar2.H(gVar3);
        return mVar2;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        m mVar = new m();
        if (obj != null) {
            mVar.H((g) obj);
        }
        if (obj2 != null) {
            mVar.H((g) obj2);
        }
        if (obj3 != null) {
            mVar.H((g) obj3);
        }
        return mVar;
    }

    public void o(Object obj, View view) {
        if (obj != null) {
            ((g) obj).w(view);
        }
    }

    public void p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        g gVar = (g) obj;
        int i2 = 0;
        if (gVar instanceof m) {
            m mVar = (m) gVar;
            int size = mVar.f4087y.size();
            while (i2 < size) {
                p(mVar.I(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!z(gVar)) {
            ArrayList<View> arrayList3 = gVar.f4057g;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i2 < size2) {
                    gVar.b(arrayList2.get(i2));
                    i2++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        gVar.w(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void q(Object obj, View view, ArrayList<View> arrayList) {
        ((g) obj).a(new b(this, view, arrayList));
    }

    public void r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((g) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void s(Object obj, Rect rect) {
        if (obj != null) {
            ((g) obj).A(new C0053d(this, rect));
        }
    }

    public void t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            j(view, rect);
            ((g) obj).A(new a(this, rect));
        }
    }

    public void w(Object obj, View view, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        ArrayList<View> arrayList2 = mVar.f4057g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s0.d(arrayList2, arrayList.get(i2));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(mVar, arrayList);
    }

    public void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.f4057g.clear();
            mVar.f4057g.addAll(arrayList2);
            p(mVar, arrayList, arrayList2);
        }
    }

    public Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        m mVar = new m();
        mVar.H((g) obj);
        return mVar;
    }
}
