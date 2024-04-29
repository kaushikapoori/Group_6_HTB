package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class b0 extends RecyclerView.n {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f1858a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView.p f1859b = new a();

    public class a extends RecyclerView.p {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1860a = false;

        public a() {
        }

        public void a(RecyclerView recyclerView, int i2) {
            if (i2 == 0 && this.f1860a) {
                this.f1860a = false;
                b0.this.b();
            }
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
            if (i2 != 0 || i3 != 0) {
                this.f1860a = true;
            }
        }
    }

    public abstract int[] a(RecyclerView.l lVar, View view);

    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r10 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r10.f1858a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            androidx.recyclerview.widget.RecyclerView$l r0 = r0.getLayoutManager()
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            r1 = r10
            androidx.recyclerview.widget.v r1 = (androidx.recyclerview.widget.v) r1
            boolean r2 = r0.f()
            if (r2 == 0) goto L_0x001a
            androidx.recyclerview.widget.t r2 = r1.f(r0)
            goto L_0x0024
        L_0x001a:
            boolean r2 = r0.e()
            if (r2 == 0) goto L_0x0029
            androidx.recyclerview.widget.t r2 = r1.e(r0)
        L_0x0024:
            android.view.View r1 = r1.d(r0, r2)
            goto L_0x002a
        L_0x0029:
            r1 = 0
        L_0x002a:
            if (r1 != 0) goto L_0x002d
            return
        L_0x002d:
            int[] r0 = r10.a(r0, r1)
            r1 = 0
            r2 = r0[r1]
            r3 = 1
            if (r2 != 0) goto L_0x003b
            r2 = r0[r3]
            if (r2 == 0) goto L_0x0048
        L_0x003b:
            androidx.recyclerview.widget.RecyclerView r4 = r10.f1858a
            r5 = r0[r1]
            r6 = r0[r3]
            r9 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            r4.g0(r5, r6, r7, r8, r9)
        L_0x0048:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.b0.b():void");
    }
}
