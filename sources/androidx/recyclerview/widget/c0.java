package androidx.recyclerview.widget;

import android.view.View;

public class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f1867a;

    /* renamed from: b  reason: collision with root package name */
    public a f1868b = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1869a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f1870b;

        /* renamed from: c  reason: collision with root package name */
        public int f1871c;

        /* renamed from: d  reason: collision with root package name */
        public int f1872d;

        /* renamed from: e  reason: collision with root package name */
        public int f1873e;

        public boolean a() {
            int i2 = this.f1869a;
            if ((i2 & 7) != 0 && (i2 & (b(this.f1872d, this.f1870b) << 0)) == 0) {
                return false;
            }
            int i3 = this.f1869a;
            if ((i3 & 112) != 0 && (i3 & (b(this.f1872d, this.f1871c) << 4)) == 0) {
                return false;
            }
            int i4 = this.f1869a;
            if ((i4 & 1792) != 0 && (i4 & (b(this.f1873e, this.f1870b) << 8)) == 0) {
                return false;
            }
            int i5 = this.f1869a;
            return (i5 & 28672) == 0 || (i5 & (b(this.f1873e, this.f1871c) << 12)) != 0;
        }

        public int b(int i2, int i3) {
            if (i2 > i3) {
                return 1;
            }
            return i2 == i3 ? 2 : 4;
        }
    }

    public interface b {
        int a();

        int b();

        int c(View view);

        int d(View view);

        View e(int i2);
    }

    public c0(b bVar) {
        this.f1867a = bVar;
    }

    public View a(int i2, int i3, int i4, int i5) {
        int b2 = this.f1867a.b();
        int a2 = this.f1867a.a();
        int i6 = i3 > i2 ? 1 : -1;
        View view = null;
        while (i2 != i3) {
            View e2 = this.f1867a.e(i2);
            int d2 = this.f1867a.d(e2);
            int c2 = this.f1867a.c(e2);
            a aVar = this.f1868b;
            aVar.f1870b = b2;
            aVar.f1871c = a2;
            aVar.f1872d = d2;
            aVar.f1873e = c2;
            if (i4 != 0) {
                aVar.f1869a = 0;
                aVar.f1869a = i4 | 0;
                if (aVar.a()) {
                    return e2;
                }
            }
            if (i5 != 0) {
                a aVar2 = this.f1868b;
                aVar2.f1869a = 0;
                aVar2.f1869a = i5 | 0;
                if (aVar2.a()) {
                    view = e2;
                }
            }
            i2 += i6;
        }
        return view;
    }

    public boolean b(View view, int i2) {
        a aVar = this.f1868b;
        int b2 = this.f1867a.b();
        int a2 = this.f1867a.a();
        int d2 = this.f1867a.d(view);
        int c2 = this.f1867a.c(view);
        aVar.f1870b = b2;
        aVar.f1871c = a2;
        aVar.f1872d = d2;
        aVar.f1873e = c2;
        if (i2 == 0) {
            return false;
        }
        a aVar2 = this.f1868b;
        aVar2.f1869a = 0;
        aVar2.f1869a = 0 | i2;
        return aVar2.a();
    }
}
