package v0;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import g0.u;
import g0.x;
import java.util.Objects;
import java.util.WeakHashMap;

public class b extends g {
    public static final Property<i, PointF> A = new c(PointF.class, "bottomRight");
    public static final Property<View, PointF> B = new d(PointF.class, "bottomRight");
    public static final Property<View, PointF> C = new e(PointF.class, "topLeft");
    public static final Property<View, PointF> D = new f(PointF.class, "position");

    /* renamed from: y  reason: collision with root package name */
    public static final String[] f4025y = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: z  reason: collision with root package name */
    public static final Property<i, PointF> f4026z = new C0052b(PointF.class, "topLeft");

    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f4027a = new Rect();

        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f4027a);
            Rect rect = this.f4027a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        public void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f4027a);
            this.f4027a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f4027a);
        }
    }

    /* renamed from: v0.b$b  reason: collision with other inner class name */
    public static class C0052b extends Property<i, PointF> {
        public C0052b(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            Objects.requireNonNull(iVar);
            iVar.f4030a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f4031b = round;
            int i2 = iVar.f4035f + 1;
            iVar.f4035f = i2;
            if (i2 == iVar.f4036g) {
                q.b(iVar.f4034e, iVar.f4030a, round, iVar.f4032c, iVar.f4033d);
                iVar.f4035f = 0;
                iVar.f4036g = 0;
            }
        }
    }

    public static class c extends Property<i, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            Objects.requireNonNull(iVar);
            iVar.f4032c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f4033d = round;
            int i2 = iVar.f4036g + 1;
            iVar.f4036g = i2;
            if (iVar.f4035f == i2) {
                q.b(iVar.f4034e, iVar.f4030a, iVar.f4031b, iVar.f4032c, round);
                iVar.f4035f = 0;
                iVar.f4036g = 0;
            }
        }
    }

    public static class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            q.b(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            q.b(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        public /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            q.b(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(b bVar, i iVar) {
            this.mViewBounds = iVar;
        }
    }

    public class h extends j {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4028a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f4029b;

        public h(b bVar, ViewGroup viewGroup) {
            this.f4029b = viewGroup;
        }

        public void a(g gVar) {
            p.a(this.f4029b, false);
            this.f4028a = true;
        }

        public void b(g gVar) {
            p.a(this.f4029b, false);
        }

        public void c(g gVar) {
            p.a(this.f4029b, true);
        }

        public void d(g gVar) {
            if (!this.f4028a) {
                p.a(this.f4029b, false);
            }
            gVar.v(this);
        }
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f4030a;

        /* renamed from: b  reason: collision with root package name */
        public int f4031b;

        /* renamed from: c  reason: collision with root package name */
        public int f4032c;

        /* renamed from: d  reason: collision with root package name */
        public int f4033d;

        /* renamed from: e  reason: collision with root package name */
        public View f4034e;

        /* renamed from: f  reason: collision with root package name */
        public int f4035f;

        /* renamed from: g  reason: collision with root package name */
        public int f4036g;

        public i(View view) {
            this.f4034e = view;
        }
    }

    static {
        new a(PointF.class, "boundsOrigin");
    }

    public final void H(o oVar) {
        View view = oVar.f4095b;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (u.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            oVar.f4094a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            oVar.f4094a.put("android:changeBounds:parent", oVar.f4095b.getParent());
        }
    }

    public void d(o oVar) {
        H(oVar);
    }

    public void g(o oVar) {
        H(oVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator k(android.view.ViewGroup r19, v0.o r20, v0.o r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x012c
            if (r2 != 0) goto L_0x000c
            goto L_0x012c
        L_0x000c:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f4094a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f4094a
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L_0x012a
            if (r5 != 0) goto L_0x0024
            goto L_0x012a
        L_0x0024:
            android.view.View r4 = r2.f4095b
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.f4094a
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f4094a
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r7 = r5.left
            int r8 = r6.left
            int r9 = r5.top
            int r10 = r6.top
            int r11 = r5.right
            int r12 = r6.right
            int r5 = r5.bottom
            int r6 = r6.bottom
            int r13 = r11 - r7
            int r14 = r5 - r9
            int r15 = r12 - r8
            int r3 = r6 - r10
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f4094a
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f4094a
            java.lang.Object r0 = r2.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r2 = 1
            if (r13 == 0) goto L_0x0067
            if (r14 != 0) goto L_0x006b
        L_0x0067:
            if (r15 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007c
        L_0x006b:
            if (r7 != r8) goto L_0x0073
            if (r9 == r10) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r16 = 0
            goto L_0x0075
        L_0x0073:
            r16 = 1
        L_0x0075:
            if (r11 != r12) goto L_0x0079
            if (r5 == r6) goto L_0x007e
        L_0x0079:
            int r16 = r16 + 1
            goto L_0x007e
        L_0x007c:
            r16 = 0
        L_0x007e:
            if (r1 == 0) goto L_0x0086
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x008a
        L_0x0086:
            if (r1 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
        L_0x008a:
            int r16 = r16 + 1
        L_0x008c:
            r0 = r16
            if (r0 <= 0) goto L_0x0126
            v0.q.b(r4, r7, r9, r11, r5)
            r1 = 2
            if (r0 != r1) goto L_0x00e8
            if (r13 != r15) goto L_0x00a9
            if (r14 != r3) goto L_0x00a9
            r0 = r18
            androidx.activity.result.d r1 = r0.f4071u
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.a(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = D
            goto L_0x0108
        L_0x00a9:
            r0 = r18
            v0.b$i r3 = new v0.b$i
            r3.<init>(r4)
            androidx.activity.result.d r13 = r0.f4071u
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r7 = r13.a(r7, r9, r8, r10)
            android.util.Property<v0.b$i, android.graphics.PointF> r8 = f4026z
            android.animation.ObjectAnimator r7 = v0.e.a(r3, r8, r7)
            androidx.activity.result.d r8 = r0.f4071u
            float r9 = (float) r11
            float r5 = (float) r5
            float r10 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r5 = r8.a(r9, r5, r10, r6)
            android.util.Property<v0.b$i, android.graphics.PointF> r6 = A
            android.animation.ObjectAnimator r5 = v0.e.a(r3, r6, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r8 = 0
            r1[r8] = r7
            r1[r2] = r5
            r6.playTogether(r1)
            v0.b$g r1 = new v0.b$g
            r1.<init>(r0, r3)
            r6.addListener(r1)
            goto L_0x010c
        L_0x00e8:
            r0 = r18
            if (r7 != r8) goto L_0x00fc
            if (r9 == r10) goto L_0x00ef
            goto L_0x00fc
        L_0x00ef:
            androidx.activity.result.d r1 = r0.f4071u
            float r3 = (float) r11
            float r5 = (float) r5
            float r7 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r1 = r1.a(r3, r5, r7, r6)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = B
            goto L_0x0108
        L_0x00fc:
            androidx.activity.result.d r1 = r0.f4071u
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.a(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = C
        L_0x0108:
            android.animation.ObjectAnimator r6 = v0.e.a(r4, r3, r1)
        L_0x010c:
            android.view.ViewParent r1 = r4.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0125
            android.view.ViewParent r1 = r4.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            v0.p.a(r1, r2)
            v0.b$h r2 = new v0.b$h
            r2.<init>(r0, r1)
            r0.a(r2)
        L_0x0125:
            return r6
        L_0x0126:
            r0 = r18
            r1 = 0
            return r1
        L_0x012a:
            r1 = 0
            return r1
        L_0x012c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.b.k(android.view.ViewGroup, v0.o, v0.o):android.animation.Animator");
    }

    public String[] p() {
        return f4025y;
    }
}
