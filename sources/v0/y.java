package v0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import v0.g;

public abstract class y extends g {

    /* renamed from: z  reason: collision with root package name */
    public static final String[] f4113z = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: y  reason: collision with root package name */
    public int f4114y = 3;

    public static class a extends AnimatorListenerAdapter implements g.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f4115a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4116b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f4117c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f4118d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4119e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4120f = false;

        public a(View view, int i2, boolean z2) {
            this.f4115a = view;
            this.f4116b = i2;
            this.f4117c = (ViewGroup) view.getParent();
            this.f4118d = z2;
            g(true);
        }

        public void a(g gVar) {
        }

        public void b(g gVar) {
            g(false);
        }

        public void c(g gVar) {
            g(true);
        }

        public void d(g gVar) {
            f();
            gVar.v(this);
        }

        public void e(g gVar) {
        }

        public final void f() {
            if (!this.f4120f) {
                q.f4098a.f(this.f4115a, this.f4116b);
                ViewGroup viewGroup = this.f4117c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z2) {
            ViewGroup viewGroup;
            if (this.f4118d && this.f4119e != z2 && (viewGroup = this.f4117c) != null) {
                this.f4119e = z2;
                p.a(viewGroup, z2);
            }
        }

        public void onAnimationCancel(Animator animator) {
            this.f4120f = true;
        }

        public void onAnimationEnd(Animator animator) {
            f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f4120f) {
                q.f4098a.f(this.f4115a, this.f4116b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f4120f) {
                q.f4098a.f(this.f4115a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f4121a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4122b;

        /* renamed from: c  reason: collision with root package name */
        public int f4123c;

        /* renamed from: d  reason: collision with root package name */
        public int f4124d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f4125e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f4126f;
    }

    public final void H(o oVar) {
        oVar.f4094a.put("android:visibility:visibility", Integer.valueOf(oVar.f4095b.getVisibility()));
        oVar.f4094a.put("android:visibility:parent", oVar.f4095b.getParent());
        int[] iArr = new int[2];
        oVar.f4095b.getLocationOnScreen(iArr);
        oVar.f4094a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r9 == 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        if (r0.f4125e == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (r0.f4123c == 0) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final v0.y.b I(v0.o r8, v0.o r9) {
        /*
            r7 = this;
            v0.y$b r0 = new v0.y$b
            r0.<init>()
            r1 = 0
            r0.f4121a = r1
            r0.f4122b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f4094a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0033
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f4094a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f4123c = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f4094a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f4125e = r6
            goto L_0x0037
        L_0x0033:
            r0.f4123c = r4
            r0.f4125e = r3
        L_0x0037:
            if (r9 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f4094a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x005a
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f4094a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f4124d = r3
            java.util.Map<java.lang.String, java.lang.Object> r3 = r9.f4094a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f4126f = r2
            goto L_0x005e
        L_0x005a:
            r0.f4124d = r4
            r0.f4126f = r3
        L_0x005e:
            r2 = 1
            if (r8 == 0) goto L_0x0082
            if (r9 == 0) goto L_0x0082
            int r8 = r0.f4123c
            int r9 = r0.f4124d
            if (r8 != r9) goto L_0x0070
            android.view.ViewGroup r3 = r0.f4125e
            android.view.ViewGroup r4 = r0.f4126f
            if (r3 != r4) goto L_0x0070
            return r0
        L_0x0070:
            if (r8 == r9) goto L_0x0078
            if (r8 != 0) goto L_0x0075
            goto L_0x0093
        L_0x0075:
            if (r9 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0078:
            android.view.ViewGroup r8 = r0.f4126f
            if (r8 != 0) goto L_0x007d
            goto L_0x0093
        L_0x007d:
            android.view.ViewGroup r8 = r0.f4125e
            if (r8 != 0) goto L_0x0096
            goto L_0x0088
        L_0x0082:
            if (r8 != 0) goto L_0x008d
            int r8 = r0.f4124d
            if (r8 != 0) goto L_0x008d
        L_0x0088:
            r0.f4122b = r2
        L_0x008a:
            r0.f4121a = r2
            goto L_0x0096
        L_0x008d:
            if (r9 != 0) goto L_0x0096
            int r8 = r0.f4123c
            if (r8 != 0) goto L_0x0096
        L_0x0093:
            r0.f4122b = r1
            goto L_0x008a
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.y.I(v0.o, v0.o):v0.y$b");
    }

    public abstract Animator J(ViewGroup viewGroup, View view, o oVar, o oVar2);

    public void d(o oVar) {
        H(oVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: android.widget.ImageView} */
    /* JADX WARNING: type inference failed for: r16v7, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (I(n(r1, false), q(r1, false)).f4121a != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004b, code lost:
        r2 = (java.lang.Float) r2.f4094a.get("android:fade:transitionAlpha");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator k(android.view.ViewGroup r22, v0.o r23, v0.o r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r24
            v0.y$b r4 = r0.I(r2, r3)
            boolean r5 = r4.f4121a
            if (r5 == 0) goto L_0x02aa
            android.view.ViewGroup r5 = r4.f4125e
            if (r5 != 0) goto L_0x0018
            android.view.ViewGroup r5 = r4.f4126f
            if (r5 == 0) goto L_0x02aa
        L_0x0018:
            boolean r5 = r4.f4122b
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 1
            r10 = 0
            if (r5 == 0) goto L_0x006a
            int r1 = r0.f4114y
            r1 = r1 & r9
            if (r1 != r9) goto L_0x0068
            if (r3 != 0) goto L_0x0029
            goto L_0x0068
        L_0x0029:
            if (r2 != 0) goto L_0x0044
            android.view.View r1 = r3.f4095b
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            v0.o r4 = r0.n(r1, r10)
            v0.o r1 = r0.q(r1, r10)
            v0.y$b r1 = r0.I(r4, r1)
            boolean r1 = r1.f4121a
            if (r1 == 0) goto L_0x0044
            goto L_0x0068
        L_0x0044:
            android.view.View r1 = r3.f4095b
            r3 = r0
            v0.c r3 = (v0.c) r3
            if (r2 == 0) goto L_0x005c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f4094a
            java.lang.String r4 = "android:fade:transitionAlpha"
            java.lang.Object r2 = r2.get(r4)
            java.lang.Float r2 = (java.lang.Float) r2
            if (r2 == 0) goto L_0x005c
            float r2 = r2.floatValue()
            goto L_0x005d
        L_0x005c:
            r2 = 0
        L_0x005d:
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x0062
            goto L_0x0063
        L_0x0062:
            r8 = r2
        L_0x0063:
            android.animation.Animator r6 = r3.K(r1, r8, r7)
            goto L_0x0069
        L_0x0068:
            r6 = 0
        L_0x0069:
            return r6
        L_0x006a:
            int r4 = r4.f4124d
            int r5 = r0.f4114y
            r11 = 2
            r5 = r5 & r11
            if (r5 == r11) goto L_0x0076
        L_0x0072:
            r2 = r0
        L_0x0073:
            r6 = 0
            goto L_0x02a9
        L_0x0076:
            if (r2 != 0) goto L_0x0079
            goto L_0x0072
        L_0x0079:
            android.view.View r5 = r2.f4095b
            if (r3 == 0) goto L_0x0080
            android.view.View r12 = r3.f4095b
            goto L_0x0081
        L_0x0080:
            r12 = 0
        L_0x0081:
            r13 = 2131231080(0x7f080168, float:1.807823E38)
            java.lang.Object r14 = r5.getTag(r13)
            android.view.View r14 = (android.view.View) r14
            if (r14 == 0) goto L_0x0091
            r19 = r4
            r12 = 0
            goto L_0x0223
        L_0x0091:
            if (r12 == 0) goto L_0x00a2
            android.view.ViewParent r14 = r12.getParent()
            if (r14 != 0) goto L_0x009a
            goto L_0x00a2
        L_0x009a:
            r14 = 4
            if (r4 != r14) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            if (r5 != r12) goto L_0x00a8
        L_0x00a0:
            r14 = 0
            goto L_0x00a6
        L_0x00a2:
            if (r12 == 0) goto L_0x00a8
            r14 = r12
            r12 = 0
        L_0x00a6:
            r15 = 0
            goto L_0x00ab
        L_0x00a8:
            r12 = 0
            r14 = 0
            r15 = 1
        L_0x00ab:
            if (r15 == 0) goto L_0x021b
            android.view.ViewParent r15 = r5.getParent()
            if (r15 != 0) goto L_0x00b9
            r19 = r4
            r14 = r5
        L_0x00b6:
            r9 = 0
            goto L_0x0223
        L_0x00b9:
            android.view.ViewParent r15 = r5.getParent()
            boolean r15 = r15 instanceof android.view.View
            if (r15 == 0) goto L_0x021b
            android.view.ViewParent r15 = r5.getParent()
            android.view.View r15 = (android.view.View) r15
            v0.o r6 = r0.q(r15, r9)
            v0.o r13 = r0.n(r15, r9)
            v0.y$b r6 = r0.I(r6, r13)
            boolean r6 = r6.f4121a
            if (r6 != 0) goto L_0x0206
            boolean r6 = v0.n.f4091a
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            int r13 = r15.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r14 = r15.getScrollY()
            int r14 = -r14
            float r14 = (float) r14
            r6.setTranslate(r13, r14)
            v0.w r13 = v0.q.f4098a
            r13.g(r5, r6)
            r13.h(r1, r6)
            android.graphics.RectF r13 = new android.graphics.RectF
            int r14 = r5.getWidth()
            float r14 = (float) r14
            int r15 = r5.getHeight()
            float r15 = (float) r15
            r13.<init>(r8, r8, r14, r15)
            r6.mapRect(r13)
            float r8 = r13.left
            int r8 = java.lang.Math.round(r8)
            float r14 = r13.top
            int r14 = java.lang.Math.round(r14)
            float r15 = r13.right
            int r15 = java.lang.Math.round(r15)
            float r11 = r13.bottom
            int r11 = java.lang.Math.round(r11)
            android.widget.ImageView r10 = new android.widget.ImageView
            android.content.Context r7 = r5.getContext()
            r10.<init>(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER_CROP
            r10.setScaleType(r7)
            boolean r7 = v0.n.f4091a
            if (r7 == 0) goto L_0x013e
            boolean r7 = r5.isAttachedToWindow()
            r7 = r7 ^ r9
            if (r1 != 0) goto L_0x0139
            goto L_0x013f
        L_0x0139:
            boolean r16 = r22.isAttachedToWindow()
            goto L_0x0141
        L_0x013e:
            r7 = 0
        L_0x013f:
            r16 = 0
        L_0x0141:
            boolean r17 = v0.n.f4092b
            if (r17 == 0) goto L_0x016e
            if (r7 == 0) goto L_0x016e
            if (r16 != 0) goto L_0x0150
            r19 = r4
            r16 = r12
            r0 = 0
            goto L_0x01eb
        L_0x0150:
            android.view.ViewParent r16 = r5.getParent()
            r9 = r16
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            int r16 = r9.indexOfChild(r5)
            r18 = r9
            android.view.ViewGroupOverlay r9 = r22.getOverlay()
            r9.add(r5)
            r9 = r18
            r20 = r16
            r16 = r12
            r12 = r20
            goto L_0x0172
        L_0x016e:
            r16 = r12
            r9 = 0
            r12 = 0
        L_0x0172:
            float r18 = r13.width()
            r19 = r4
            int r4 = java.lang.Math.round(r18)
            float r18 = r13.height()
            int r0 = java.lang.Math.round(r18)
            if (r4 <= 0) goto L_0x01dc
            if (r0 <= 0) goto L_0x01dc
            r18 = 1233125376(0x49800000, float:1048576.0)
            int r3 = r4 * r0
            float r3 = (float) r3
            float r3 = r18 / r3
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r3)
            float r3 = (float) r4
            float r3 = r3 * r2
            int r3 = java.lang.Math.round(r3)
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = java.lang.Math.round(r0)
            float r4 = r13.left
            float r4 = -r4
            float r13 = r13.top
            float r13 = -r13
            r6.postTranslate(r4, r13)
            r6.postScale(r2, r2)
            boolean r2 = v0.n.f4093c
            if (r2 == 0) goto L_0x01ca
            android.graphics.Picture r2 = new android.graphics.Picture
            r2.<init>()
            android.graphics.Canvas r0 = r2.beginRecording(r3, r0)
            r0.concat(r6)
            r5.draw(r0)
            r2.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2)
            goto L_0x01dd
        L_0x01ca:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r0, r2)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r6)
            r5.draw(r2)
            goto L_0x01dd
        L_0x01dc:
            r0 = 0
        L_0x01dd:
            if (r17 == 0) goto L_0x01eb
            if (r7 == 0) goto L_0x01eb
            android.view.ViewGroupOverlay r2 = r22.getOverlay()
            r2.remove(r5)
            r9.addView(r5, r12)
        L_0x01eb:
            if (r0 == 0) goto L_0x01f0
            r10.setImageBitmap(r0)
        L_0x01f0:
            int r0 = r15 - r8
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r11 - r14
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r10.measure(r0, r2)
            r10.layout(r8, r14, r15, r11)
            r14 = r10
            goto L_0x021f
        L_0x0206:
            r19 = r4
            r16 = r12
            int r0 = r15.getId()
            android.view.ViewParent r2 = r15.getParent()
            if (r2 != 0) goto L_0x021f
            r2 = -1
            if (r0 == r2) goto L_0x021f
            r1.findViewById(r0)
            goto L_0x021f
        L_0x021b:
            r19 = r4
            r16 = r12
        L_0x021f:
            r12 = r16
            goto L_0x00b6
        L_0x0223:
            if (r14 == 0) goto L_0x027f
            r0 = r23
            if (r9 != 0) goto L_0x025c
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.f4094a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r2 = r2.get(r3)
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = r2[r3]
            r6 = 1
            r2 = r2[r6]
            r7 = 2
            int[] r7 = new int[r7]
            r1.getLocationOnScreen(r7)
            r3 = r7[r3]
            int r4 = r4 - r3
            int r3 = r14.getLeft()
            int r4 = r4 - r3
            r14.offsetLeftAndRight(r4)
            r3 = r7[r6]
            int r2 = r2 - r3
            int r3 = r14.getTop()
            int r2 = r2 - r3
            r14.offsetTopAndBottom(r2)
            android.view.ViewGroupOverlay r2 = r22.getOverlay()
            r2.add(r14)
        L_0x025c:
            r2 = r21
            r3 = r24
            android.animation.Animator r6 = r2.J(r1, r14, r0, r3)
            if (r9 != 0) goto L_0x02a9
            if (r6 != 0) goto L_0x0270
            android.view.ViewGroupOverlay r0 = r22.getOverlay()
            r0.remove(r14)
            goto L_0x02a9
        L_0x0270:
            r0 = 2131231080(0x7f080168, float:1.807823E38)
            r5.setTag(r0, r14)
            v0.x r0 = new v0.x
            r0.<init>(r2, r1, r14, r5)
        L_0x027b:
            r2.a(r0)
            goto L_0x02a9
        L_0x027f:
            r2 = r21
            r0 = r23
            r3 = r24
            if (r12 == 0) goto L_0x0073
            int r4 = r12.getVisibility()
            v0.w r5 = v0.q.f4098a
            r6 = 0
            r5.f(r12, r6)
            android.animation.Animator r6 = r2.J(r1, r12, r0, r3)
            if (r6 == 0) goto L_0x02a6
            v0.y$a r0 = new v0.y$a
            r1 = r19
            r3 = 1
            r0.<init>(r12, r1, r3)
            r6.addListener(r0)
            r6.addPauseListener(r0)
            goto L_0x027b
        L_0x02a6:
            r5.f(r12, r4)
        L_0x02a9:
            return r6
        L_0x02aa:
            r2 = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.y.k(android.view.ViewGroup, v0.o, v0.o):android.animation.Animator");
    }

    public String[] p() {
        return f4113z;
    }

    public boolean r(o oVar, o oVar2) {
        if (oVar == null && oVar2 == null) {
            return false;
        }
        if (oVar != null && oVar2 != null && oVar2.f4094a.containsKey("android:visibility:visibility") != oVar.f4094a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b I = I(oVar, oVar2);
        if (I.f4121a) {
            return I.f4123c == 0 || I.f4124d == 0;
        }
        return false;
    }
}
