package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class l extends a0 {

    /* renamed from: s  reason: collision with root package name */
    public static TimeInterpolator f1908s;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f1909h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f1910i = new ArrayList<>();

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<b> f1911j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<a> f1912k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<ArrayList<RecyclerView.z>> f1913l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ArrayList<b>> f1914m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<ArrayList<a>> f1915n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f1916o = new ArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f1917p = new ArrayList<>();

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f1918q = new ArrayList<>();

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<RecyclerView.z> f1919r = new ArrayList<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.z f1920a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.z f1921b;

        /* renamed from: c  reason: collision with root package name */
        public int f1922c;

        /* renamed from: d  reason: collision with root package name */
        public int f1923d;

        /* renamed from: e  reason: collision with root package name */
        public int f1924e;

        /* renamed from: f  reason: collision with root package name */
        public int f1925f;

        public a(RecyclerView.z zVar, RecyclerView.z zVar2, int i2, int i3, int i4, int i5) {
            this.f1920a = zVar;
            this.f1921b = zVar2;
            this.f1922c = i2;
            this.f1923d = i3;
            this.f1924e = i4;
            this.f1925f = i5;
        }

        public String toString() {
            StringBuilder a2 = androidx.activity.result.a.a("ChangeInfo{oldHolder=");
            a2.append(this.f1920a);
            a2.append(", newHolder=");
            a2.append(this.f1921b);
            a2.append(", fromX=");
            a2.append(this.f1922c);
            a2.append(", fromY=");
            a2.append(this.f1923d);
            a2.append(", toX=");
            a2.append(this.f1924e);
            a2.append(", toY=");
            a2.append(this.f1925f);
            a2.append('}');
            return a2.toString();
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public RecyclerView.z f1926a;

        /* renamed from: b  reason: collision with root package name */
        public int f1927b;

        /* renamed from: c  reason: collision with root package name */
        public int f1928c;

        /* renamed from: d  reason: collision with root package name */
        public int f1929d;

        /* renamed from: e  reason: collision with root package name */
        public int f1930e;

        public b(RecyclerView.z zVar, int i2, int i3, int i4, int i5) {
            this.f1926a = zVar;
            this.f1927b = i2;
            this.f1928c = i3;
            this.f1929d = i4;
            this.f1930e = i5;
        }
    }

    public void e(RecyclerView.z zVar) {
        View view = zVar.f1788a;
        view.animate().cancel();
        int size = this.f1911j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.f1911j.get(size).f1926a == zVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(zVar);
                this.f1911j.remove(size);
            }
        }
        l(this.f1912k, zVar);
        if (this.f1909h.remove(zVar)) {
            view.setAlpha(1.0f);
            c(zVar);
        }
        if (this.f1910i.remove(zVar)) {
            view.setAlpha(1.0f);
            c(zVar);
        }
        int size2 = this.f1915n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList = this.f1915n.get(size2);
            l(arrayList, zVar);
            if (arrayList.isEmpty()) {
                this.f1915n.remove(size2);
            }
        }
        int size3 = this.f1914m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList2 = this.f1914m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((b) arrayList2.get(size4)).f1926a == zVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(zVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f1914m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.f1913l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList3 = this.f1913l.get(size5);
                if (arrayList3.remove(zVar)) {
                    view.setAlpha(1.0f);
                    c(zVar);
                    if (arrayList3.isEmpty()) {
                        this.f1913l.remove(size5);
                    }
                }
            } else {
                this.f1918q.remove(zVar);
                this.f1916o.remove(zVar);
                this.f1919r.remove(zVar);
                this.f1917p.remove(zVar);
                k();
                return;
            }
        }
    }

    public void f() {
        int size = this.f1911j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.f1911j.get(size);
            View view = bVar.f1926a.f1788a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.f1926a);
            this.f1911j.remove(size);
        }
        int size2 = this.f1909h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(this.f1909h.get(size2));
            this.f1909h.remove(size2);
        }
        int size3 = this.f1910i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.z zVar = this.f1910i.get(size3);
            zVar.f1788a.setAlpha(1.0f);
            c(zVar);
            this.f1910i.remove(size3);
        }
        int size4 = this.f1912k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.f1912k.get(size4);
            RecyclerView.z zVar2 = aVar.f1920a;
            if (zVar2 != null) {
                m(aVar, zVar2);
            }
            RecyclerView.z zVar3 = aVar.f1921b;
            if (zVar3 != null) {
                m(aVar, zVar3);
            }
        }
        this.f1912k.clear();
        if (g()) {
            int size5 = this.f1914m.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                ArrayList arrayList = this.f1914m.get(size5);
                int size6 = arrayList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        b bVar2 = (b) arrayList.get(size6);
                        View view2 = bVar2.f1926a.f1788a;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        c(bVar2.f1926a);
                        arrayList.remove(size6);
                        if (arrayList.isEmpty()) {
                            this.f1914m.remove(arrayList);
                        }
                    }
                }
            }
            int size7 = this.f1913l.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                ArrayList arrayList2 = this.f1913l.get(size7);
                int size8 = arrayList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        RecyclerView.z zVar4 = (RecyclerView.z) arrayList2.get(size8);
                        zVar4.f1788a.setAlpha(1.0f);
                        c(zVar4);
                        arrayList2.remove(size8);
                        if (arrayList2.isEmpty()) {
                            this.f1913l.remove(arrayList2);
                        }
                    }
                }
            }
            int size9 = this.f1915n.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    ArrayList arrayList3 = this.f1915n.get(size9);
                    int size10 = arrayList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            a aVar2 = (a) arrayList3.get(size10);
                            RecyclerView.z zVar5 = aVar2.f1920a;
                            if (zVar5 != null) {
                                m(aVar2, zVar5);
                            }
                            RecyclerView.z zVar6 = aVar2.f1921b;
                            if (zVar6 != null) {
                                m(aVar2, zVar6);
                            }
                            if (arrayList3.isEmpty()) {
                                this.f1915n.remove(arrayList3);
                            }
                        }
                    }
                } else {
                    j(this.f1918q);
                    j(this.f1917p);
                    j(this.f1916o);
                    j(this.f1919r);
                    d();
                    return;
                }
            }
        }
    }

    public boolean g() {
        return !this.f1910i.isEmpty() || !this.f1912k.isEmpty() || !this.f1911j.isEmpty() || !this.f1909h.isEmpty() || !this.f1917p.isEmpty() || !this.f1918q.isEmpty() || !this.f1916o.isEmpty() || !this.f1919r.isEmpty() || !this.f1914m.isEmpty() || !this.f1913l.isEmpty() || !this.f1915n.isEmpty();
    }

    public boolean i(RecyclerView.z zVar, int i2, int i3, int i4, int i5) {
        View view = zVar.f1788a;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) zVar.f1788a.getTranslationY());
        n(zVar);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            c(zVar);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX((float) (-i6));
        }
        if (i7 != 0) {
            view.setTranslationY((float) (-i7));
        }
        this.f1911j.add(new b(zVar, translationX, translationY, i4, i5));
        return true;
    }

    public void j(List<RecyclerView.z> list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                list.get(size).f1788a.animate().cancel();
            } else {
                return;
            }
        }
    }

    public void k() {
        if (!g()) {
            d();
        }
    }

    public final void l(List<a> list, RecyclerView.z zVar) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                a aVar = list.get(size);
                if (m(aVar, zVar) && aVar.f1920a == null && aVar.f1921b == null) {
                    list.remove(aVar);
                }
            } else {
                return;
            }
        }
    }

    public final boolean m(a aVar, RecyclerView.z zVar) {
        if (aVar.f1921b == zVar) {
            aVar.f1921b = null;
        } else if (aVar.f1920a != zVar) {
            return false;
        } else {
            aVar.f1920a = null;
        }
        zVar.f1788a.setAlpha(1.0f);
        zVar.f1788a.setTranslationX(0.0f);
        zVar.f1788a.setTranslationY(0.0f);
        c(zVar);
        return true;
    }

    public final void n(RecyclerView.z zVar) {
        if (f1908s == null) {
            f1908s = new ValueAnimator().getInterpolator();
        }
        zVar.f1788a.animate().setInterpolator(f1908s);
        e(zVar);
    }
}
