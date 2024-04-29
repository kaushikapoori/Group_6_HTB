package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class z implements LayoutInflater.Factory2 {

    /* renamed from: b  reason: collision with root package name */
    public final b0 f1535b;

    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ h0 f1536b;

        public a(h0 h0Var) {
            this.f1536b = h0Var;
        }

        public void onViewAttachedToWindow(View view) {
            h0 h0Var = this.f1536b;
            n nVar = h0Var.f1315c;
            h0Var.k();
            x0.f((ViewGroup) nVar.F.getParent(), z.this.f1535b).e();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public z(b0 b0Var) {
        this.f1535b = b0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x017d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            r11 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0014
            androidx.fragment.app.FragmentContainerView r12 = new androidx.fragment.app.FragmentContainerView
            androidx.fragment.app.b0 r13 = r11.f1535b
            r12.<init>(r14, r15, r13)
            return r12
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r13 = r0.equals(r13)
            r0 = 0
            if (r13 != 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r13 = "class"
            java.lang.String r13 = r15.getAttributeValue(r0, r13)
            int[] r1 = p0.a.f3711a
            android.content.res.TypedArray r1 = r14.obtainStyledAttributes(r15, r1)
            r2 = 0
            if (r13 != 0) goto L_0x0031
            java.lang.String r13 = r1.getString(r2)
        L_0x0031:
            r3 = 1
            r4 = -1
            int r5 = r1.getResourceId(r3, r4)
            r6 = 2
            java.lang.String r7 = r1.getString(r6)
            r1.recycle()
            if (r13 == 0) goto L_0x01e6
            java.lang.ClassLoader r1 = r14.getClassLoader()
            m.h<java.lang.ClassLoader, m.h<java.lang.String, java.lang.Class<?>>> r8 = androidx.fragment.app.x.f1503a
            java.lang.Class r1 = androidx.fragment.app.x.b(r1, r13)     // Catch:{ ClassNotFoundException -> 0x0052 }
            java.lang.Class<androidx.fragment.app.n> r8 = androidx.fragment.app.n.class
            boolean r1 = r8.isAssignableFrom(r1)     // Catch:{ ClassNotFoundException -> 0x0052 }
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            if (r1 != 0) goto L_0x0057
            goto L_0x01e6
        L_0x0057:
            if (r12 == 0) goto L_0x005d
            int r2 = r12.getId()
        L_0x005d:
            if (r2 != r4) goto L_0x0082
            if (r5 != r4) goto L_0x0082
            if (r7 == 0) goto L_0x0064
            goto L_0x0082
        L_0x0064:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = r15.getPositionDescription()
            r14.append(r15)
            java.lang.String r15 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            throw r12
        L_0x0082:
            if (r5 == r4) goto L_0x008b
            androidx.fragment.app.b0 r1 = r11.f1535b
            androidx.fragment.app.n r1 = r1.H(r5)
            goto L_0x008c
        L_0x008b:
            r1 = r0
        L_0x008c:
            if (r1 != 0) goto L_0x00d8
            if (r7 == 0) goto L_0x00d8
            androidx.fragment.app.b0 r1 = r11.f1535b
            androidx.fragment.app.i0 r1 = r1.f1217c
            java.util.Objects.requireNonNull(r1)
            java.util.ArrayList<androidx.fragment.app.n> r8 = r1.f1322a
            int r8 = r8.size()
        L_0x009d:
            int r8 = r8 + r4
            if (r8 < 0) goto L_0x00b4
            java.util.ArrayList<androidx.fragment.app.n> r9 = r1.f1322a
            java.lang.Object r9 = r9.get(r8)
            androidx.fragment.app.n r9 = (androidx.fragment.app.n) r9
            if (r9 == 0) goto L_0x009d
            java.lang.String r10 = r9.f1394y
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x009d
            r0 = r9
            goto L_0x00d7
        L_0x00b4:
            java.util.HashMap<java.lang.String, androidx.fragment.app.h0> r1 = r1.f1323b
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x00be:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x00d7
            java.lang.Object r8 = r1.next()
            androidx.fragment.app.h0 r8 = (androidx.fragment.app.h0) r8
            if (r8 == 0) goto L_0x00be
            androidx.fragment.app.n r8 = r8.f1315c
            java.lang.String r9 = r8.f1394y
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x00be
            r0 = r8
        L_0x00d7:
            r1 = r0
        L_0x00d8:
            if (r1 != 0) goto L_0x00e2
            if (r2 == r4) goto L_0x00e2
            androidx.fragment.app.b0 r0 = r11.f1535b
            androidx.fragment.app.n r1 = r0.H(r2)
        L_0x00e2:
            java.lang.String r0 = "Fragment "
            java.lang.String r4 = "FragmentManager"
            if (r1 != 0) goto L_0x012e
            androidx.fragment.app.b0 r1 = r11.f1535b
            androidx.fragment.app.x r1 = r1.J()
            java.lang.ClassLoader r14 = r14.getClassLoader()
            androidx.fragment.app.n r1 = r1.a(r14, r13)
            r1.f1383n = r3
            if (r5 == 0) goto L_0x00fc
            r14 = r5
            goto L_0x00fd
        L_0x00fc:
            r14 = r2
        L_0x00fd:
            r1.f1392w = r14
            r1.f1393x = r2
            r1.f1394y = r7
            r1.f1384o = r3
            androidx.fragment.app.b0 r14 = r11.f1535b
            r1.f1388s = r14
            androidx.fragment.app.y<?> r14 = r14.f1231q
            r1.f1389t = r14
            android.content.Context r14 = r14.f1532c
            android.os.Bundle r2 = r1.f1372c
            r1.L(r14, r15, r2)
            androidx.fragment.app.b0 r14 = r11.f1535b
            androidx.fragment.app.h0 r14 = r14.a(r1)
            boolean r15 = androidx.fragment.app.b0.M(r6)
            if (r15 == 0) goto L_0x016f
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r0)
            r15.append(r1)
            java.lang.String r2 = " has been inflated via the <fragment> tag: id=0x"
            goto L_0x015e
        L_0x012e:
            boolean r14 = r1.f1384o
            if (r14 != 0) goto L_0x01a8
            r1.f1384o = r3
            androidx.fragment.app.b0 r14 = r11.f1535b
            r1.f1388s = r14
            androidx.fragment.app.y<?> r14 = r14.f1231q
            r1.f1389t = r14
            android.content.Context r14 = r14.f1532c
            android.os.Bundle r2 = r1.f1372c
            r1.L(r14, r15, r2)
            androidx.fragment.app.b0 r14 = r11.f1535b
            androidx.fragment.app.h0 r14 = r14.h(r1)
            boolean r15 = androidx.fragment.app.b0.M(r6)
            if (r15 == 0) goto L_0x016f
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r2 = "Retained Fragment "
            r15.append(r2)
            r15.append(r1)
            java.lang.String r2 = " has been re-attached via the <fragment> tag: id=0x"
        L_0x015e:
            r15.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r5)
            r15.append(r2)
            java.lang.String r15 = r15.toString()
            android.util.Log.v(r4, r15)
        L_0x016f:
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            r1.E = r12
            r14.k()
            r14.j()
            android.view.View r12 = r1.F
            if (r12 == 0) goto L_0x019c
            if (r5 == 0) goto L_0x0182
            r12.setId(r5)
        L_0x0182:
            android.view.View r12 = r1.F
            java.lang.Object r12 = r12.getTag()
            if (r12 != 0) goto L_0x018f
            android.view.View r12 = r1.F
            r12.setTag(r7)
        L_0x018f:
            android.view.View r12 = r1.F
            androidx.fragment.app.z$a r13 = new androidx.fragment.app.z$a
            r13.<init>(r14)
            r12.addOnAttachStateChangeListener(r13)
            android.view.View r12 = r1.F
            return r12
        L_0x019c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r14 = " did not create a view."
            java.lang.String r13 = z.d.a(r0, r13, r14)
            r12.<init>(r13)
            throw r12
        L_0x01a8:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = r15.getPositionDescription()
            r14.append(r15)
            java.lang.String r15 = ": Duplicate id 0x"
            r14.append(r15)
            java.lang.String r15 = java.lang.Integer.toHexString(r5)
            r14.append(r15)
            java.lang.String r15 = ", tag "
            r14.append(r15)
            r14.append(r7)
            java.lang.String r15 = ", or parent id 0x"
            r14.append(r15)
            java.lang.String r15 = java.lang.Integer.toHexString(r2)
            r14.append(r15)
            java.lang.String r15 = " with another fragment for "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            throw r12
        L_0x01e6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.z.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
