package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Objects;
import z0.g;
import z0.h;
import z0.i;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f2669c = new Rect();

    /* renamed from: d  reason: collision with root package name */
    public final RectF f2670d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final RectF f2671e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f2672f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public float f2673g;

    /* renamed from: h  reason: collision with root package name */
    public float f2674h;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f2675a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f2676b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ View f2677c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z2, View view, View view2) {
            this.f2675a = z2;
            this.f2676b = view;
            this.f2677c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f2675a) {
                this.f2676b.setVisibility(4);
                this.f2677c.setAlpha(1.0f);
                this.f2677c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f2675a) {
                this.f2676b.setVisibility(0);
                this.f2677c.setAlpha(0.0f);
                this.f2677c.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public g f2678a;

        /* renamed from: b  reason: collision with root package name */
        public i f2679b;
    }

    public FabTransformationBehavior() {
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public abstract b A(Context context, boolean z2);

    public final ViewGroup B(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
        }
    }

    public void c(CoordinatorLayout.f fVar) {
        if (fVar.f1065h == 0) {
            fVar.f1065h = 80;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x03d6 A[LOOP:1: B:108:0x03d4->B:109:0x03d6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x035f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.AnimatorSet u(android.view.View r27, android.view.View r28, boolean r29, boolean r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            android.content.Context r4 = r28.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$b r4 = r0.A(r4, r3)
            if (r3 == 0) goto L_0x001e
            float r5 = r27.getTranslationX()
            r0.f2673g = r5
            float r5 = r27.getTranslationY()
            r0.f2674h = r5
        L_0x001e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.WeakHashMap<android.view.View, g0.x> r7 = g0.u.f3063a
            float r7 = g0.u.i.i(r28)
            float r8 = g0.u.i.i(r27)
            float r7 = r7 - r8
            r8 = 0
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0049
            if (r30 != 0) goto L_0x003e
            float r7 = -r7
            r2.setTranslationZ(r7)
        L_0x003e:
            android.util.Property r7 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r9]
            r11[r10] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
            goto L_0x0054
        L_0x0049:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r9]
            float r7 = -r7
            r12[r10] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L_0x0054:
            z0.g r11 = r4.f2678a
            java.lang.String r12 = "elevation"
            z0.h r11 = r11.d(r12)
            r11.a(r7)
            r5.add(r7)
            android.graphics.RectF r7 = r0.f2670d
            z0.i r11 = r4.f2679b
            float r11 = r0.w(r1, r2, r11)
            z0.i r12 = r4.f2679b
            float r12 = r0.x(r1, r2, r12)
            android.util.Pair r13 = r0.v(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            z0.h r14 = (z0.h) r14
            java.lang.Object r13 = r13.second
            z0.h r13 = (z0.h) r13
            if (r3 == 0) goto L_0x00c6
            if (r30 != 0) goto L_0x0088
            float r15 = -r11
            r2.setTranslationX(r15)
            float r15 = -r12
            r2.setTranslationY(r15)
        L_0x0088:
            android.util.Property r15 = android.view.View.TRANSLATION_X
            r16 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            android.util.Property r15 = android.view.View.TRANSLATION_Y
            r17 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            float r11 = -r11
            float r12 = -r12
            float r11 = r0.y(r4, r14, r11, r8)
            float r12 = r0.y(r4, r13, r12, r8)
            android.graphics.Rect r15 = r0.f2669c
            r2.getWindowVisibleDisplayFrame(r15)
            android.graphics.RectF r8 = r0.f2670d
            r8.set(r15)
            android.graphics.RectF r15 = r0.f2671e
            r0.z(r2, r15)
            r15.offset(r11, r12)
            r15.intersect(r8)
            r7.set(r15)
            r8 = r6
            r6 = r17
            goto L_0x00de
        L_0x00c6:
            r16 = r6
            android.util.Property r6 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r9]
            float r11 = -r11
            r8[r10] = r11
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r6, r8)
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r9]
            float r12 = -r12
            r11[r10] = r12
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r8, r11)
        L_0x00de:
            r14.a(r6)
            r13.a(r8)
            r5.add(r6)
            r5.add(r8)
            float r6 = r7.width()
            float r7 = r7.height()
            z0.i r8 = r4.f2679b
            float r8 = r0.w(r1, r2, r8)
            z0.i r11 = r4.f2679b
            float r11 = r0.x(r1, r2, r11)
            android.util.Pair r12 = r0.v(r8, r11, r3, r4)
            java.lang.Object r13 = r12.first
            z0.h r13 = (z0.h) r13
            java.lang.Object r12 = r12.second
            z0.h r12 = (z0.h) r12
            android.util.Property r14 = android.view.View.TRANSLATION_X
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            float r8 = r0.f2673g
        L_0x0113:
            r15[r10] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            float r11 = r0.f2674h
        L_0x0122:
            r15[r10] = r11
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            r13.a(r8)
            r12.a(r11)
            r5.add(r8)
            r5.add(r11)
            boolean r8 = r2 instanceof h1.d
            if (r8 == 0) goto L_0x018c
            boolean r11 = r1 instanceof android.widget.ImageView
            if (r11 != 0) goto L_0x013d
            goto L_0x018c
        L_0x013d:
            r11 = r2
            h1.d r11 = (h1.d) r11
            r12 = r1
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.graphics.drawable.Drawable r12 = r12.getDrawable()
            if (r12 != 0) goto L_0x014a
            goto L_0x018c
        L_0x014a:
            r12.mutate()
            r13 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0161
            if (r30 != 0) goto L_0x0156
            r12.setAlpha(r13)
        L_0x0156:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r13 = z0.d.f4426a
            int[] r14 = new int[r9]
            r14[r10] = r10
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r13, r14)
            goto L_0x016b
        L_0x0161:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r14 = z0.d.f4426a
            int[] r15 = new int[r9]
            r15[r10] = r13
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r14, r15)
        L_0x016b:
            com.google.android.material.transformation.a r14 = new com.google.android.material.transformation.a
            r14.<init>(r0, r2)
            r13.addUpdateListener(r14)
            z0.g r14 = r4.f2678a
            java.lang.String r15 = "iconFade"
            z0.h r14 = r14.d(r15)
            r14.a(r13)
            r5.add(r13)
            com.google.android.material.transformation.b r13 = new com.google.android.material.transformation.b
            r13.<init>(r0, r11, r12)
            r11 = r16
            r11.add(r13)
            goto L_0x018e
        L_0x018c:
            r11 = r16
        L_0x018e:
            if (r8 != 0) goto L_0x0198
            r22 = r4
            r1 = r5
            r18 = r8
            r3 = r11
            goto L_0x02fc
        L_0x0198:
            r12 = r2
            h1.d r12 = (h1.d) r12
            z0.i r13 = r4.f2679b
            android.graphics.RectF r14 = r0.f2670d
            android.graphics.RectF r15 = r0.f2671e
            r0.z(r1, r14)
            float r10 = r0.f2673g
            float r9 = r0.f2674h
            r14.offset(r10, r9)
            r0.z(r2, r15)
            float r9 = r0.w(r1, r2, r13)
            float r9 = -r9
            r10 = 0
            r15.offset(r9, r10)
            float r9 = r14.centerX()
            float r10 = r15.left
            float r9 = r9 - r10
            z0.i r10 = r4.f2679b
            android.graphics.RectF r13 = r0.f2670d
            android.graphics.RectF r14 = r0.f2671e
            r0.z(r1, r13)
            float r15 = r0.f2673g
            r18 = r8
            float r8 = r0.f2674h
            r13.offset(r15, r8)
            r0.z(r2, r14)
            float r8 = r0.x(r1, r2, r10)
            float r8 = -r8
            r10 = 0
            r14.offset(r10, r8)
            float r8 = r13.centerY()
            float r10 = r14.top
            float r8 = r8 - r10
            r10 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r10 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r10
            android.graphics.Rect r13 = r0.f2669c
            r10.g(r13)
            android.graphics.Rect r10 = r0.f2669c
            int r10 = r10.width()
            float r10 = (float) r10
            r13 = 1073741824(0x40000000, float:2.0)
            float r10 = r10 / r13
            z0.g r13 = r4.f2678a
            java.lang.String r14 = "expansion"
            z0.h r13 = r13.d(r14)
            if (r3 == 0) goto L_0x026e
            if (r30 != 0) goto L_0x0209
            h1.d$e r14 = new h1.d$e
            r14.<init>(r9, r8, r10)
            r12.setRevealInfo(r14)
        L_0x0209:
            if (r30 == 0) goto L_0x0211
            h1.d$e r10 = r12.getRevealInfo()
            float r10 = r10.f3186c
        L_0x0211:
            r14 = 0
            float r15 = c.b.d(r9, r8, r14, r14)
            float r21 = c.b.d(r9, r8, r6, r14)
            float r6 = c.b.d(r9, r8, r6, r7)
            float r7 = c.b.d(r9, r8, r14, r7)
            int r14 = (r15 > r21 ? 1 : (r15 == r21 ? 0 : -1))
            if (r14 <= 0) goto L_0x022f
            int r14 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r14 <= 0) goto L_0x022f
            int r14 = (r15 > r7 ? 1 : (r15 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x022f
            goto L_0x0241
        L_0x022f:
            int r14 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r14 <= 0) goto L_0x023a
            int r14 = (r21 > r7 ? 1 : (r21 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x023a
            r15 = r21
            goto L_0x0241
        L_0x023a:
            int r14 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x0240
            r15 = r6
            goto L_0x0241
        L_0x0240:
            r15 = r7
        L_0x0241:
            android.animation.Animator r6 = h1.b.a(r12, r9, r8, r15)
            com.google.android.material.transformation.c r7 = new com.google.android.material.transformation.c
            r7.<init>(r0, r12)
            r6.addListener(r7)
            long r14 = r13.f4433a
            int r7 = (int) r9
            int r8 = (int) r8
            r0 = 0
            int r9 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0264
            android.animation.Animator r7 = android.view.ViewAnimationUtils.createCircularReveal(r2, r7, r8, r10, r10)
            r7.setStartDelay(r0)
            r7.setDuration(r14)
            r5.add(r7)
        L_0x0264:
            r22 = r4
            r1 = r5
            r19 = r11
            r23 = r12
            r0 = r13
            goto L_0x02ea
        L_0x026e:
            h1.d$e r0 = r12.getRevealInfo()
            float r0 = r0.f3186c
            android.animation.Animator r6 = h1.b.a(r12, r9, r8, r10)
            long r14 = r13.f4433a
            int r1 = (int) r9
            int r7 = (int) r8
            r8 = 0
            int r19 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r19 <= 0) goto L_0x028f
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r7, r0, r0)
            r0.setStartDelay(r8)
            r0.setDuration(r14)
            r5.add(r0)
        L_0x028f:
            long r14 = r13.f4433a
            long r8 = r13.f4434b
            z0.g r0 = r4.f2678a
            r21 = r6
            m.h<java.lang.String, z0.h> r6 = r0.f4431a
            int r6 = r6.f3377d
            r22 = r4
            r19 = r11
            r3 = 0
            r11 = 0
        L_0x02a2:
            if (r11 >= r6) goto L_0x02c8
            r20 = r6
            m.h<java.lang.String, z0.h> r6 = r0.f4431a
            java.lang.Object r6 = r6.k(r11)
            z0.h r6 = (z0.h) r6
            r23 = r12
            r24 = r13
            long r12 = r6.f4433a
            r25 = r5
            long r5 = r6.f4434b
            long r12 = r12 + r5
            long r3 = java.lang.Math.max(r3, r12)
            int r11 = r11 + 1
            r6 = r20
            r12 = r23
            r13 = r24
            r5 = r25
            goto L_0x02a2
        L_0x02c8:
            r25 = r5
            r23 = r12
            r24 = r13
            long r14 = r14 + r8
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x02e4
            android.animation.Animator r0 = android.view.ViewAnimationUtils.createCircularReveal(r2, r1, r7, r10, r10)
            r0.setStartDelay(r14)
            long r3 = r3 - r14
            r0.setDuration(r3)
            r1 = r25
            r1.add(r0)
            goto L_0x02e6
        L_0x02e4:
            r1 = r25
        L_0x02e6:
            r6 = r21
            r0 = r24
        L_0x02ea:
            r0.a(r6)
            r1.add(r6)
            h1.a r0 = new h1.a
            r3 = r23
            r0.<init>(r3)
            r3 = r19
            r3.add(r0)
        L_0x02fc:
            if (r18 != 0) goto L_0x0303
            r6 = r29
            r4 = r22
            goto L_0x0357
        L_0x0303:
            r0 = r2
            h1.d r0 = (h1.d) r0
            java.util.WeakHashMap<android.view.View, g0.x> r4 = g0.u.f3063a
            android.content.res.ColorStateList r4 = g0.u.i.g(r27)
            if (r4 == 0) goto L_0x031b
            int[] r5 = r27.getDrawableState()
            int r6 = r4.getDefaultColor()
            int r4 = r4.getColorForState(r5, r6)
            goto L_0x031c
        L_0x031b:
            r4 = 0
        L_0x031c:
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r4
            r6 = r29
            if (r6 == 0) goto L_0x0336
            if (r30 != 0) goto L_0x0329
            r0.setCircularRevealScrimColor(r4)
        L_0x0329:
            android.util.Property<h1.d, java.lang.Integer> r4 = h1.d.C0035d.f3183a
            r7 = 1
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r4, r8)
            goto L_0x0342
        L_0x0336:
            r7 = 1
            r9 = 0
            android.util.Property<h1.d, java.lang.Integer> r5 = h1.d.C0035d.f3183a
            int[] r8 = new int[r7]
            r8[r9] = r4
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofInt(r0, r5, r8)
        L_0x0342:
            z0.b r4 = z0.b.f4424a
            r0.setEvaluator(r4)
            r4 = r22
            z0.g r5 = r4.f2678a
            java.lang.String r7 = "color"
            z0.h r5 = r5.d(r7)
            r5.a(r0)
            r1.add(r0)
        L_0x0357:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x035f
            r5 = r26
        L_0x035d:
            r10 = 0
            goto L_0x03be
        L_0x035f:
            r0 = 2131231015(0x7f080127, float:1.80781E38)
            android.view.View r0 = r2.findViewById(r0)
            r5 = r26
            if (r0 == 0) goto L_0x036f
        L_0x036a:
            android.view.ViewGroup r0 = r5.B(r0)
            goto L_0x0383
        L_0x036f:
            boolean r0 = r2 instanceof y1.b
            if (r0 != 0) goto L_0x037a
            boolean r0 = r2 instanceof y1.a
            if (r0 == 0) goto L_0x0378
            goto L_0x037a
        L_0x0378:
            r0 = r2
            goto L_0x036a
        L_0x037a:
            r0 = r2
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7 = 0
            android.view.View r0 = r0.getChildAt(r7)
            goto L_0x036a
        L_0x0383:
            if (r0 != 0) goto L_0x0386
            goto L_0x035d
        L_0x0386:
            if (r6 == 0) goto L_0x03a3
            if (r30 != 0) goto L_0x0394
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = z0.c.f4425a
            r8 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            r7.set(r0, r8)
        L_0x0394:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = z0.c.f4425a
            r8 = 1
            float[] r8 = new float[r8]
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r8[r10] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r7, r8)
            goto L_0x03b0
        L_0x03a3:
            r8 = 1
            r10 = 0
            android.util.Property<android.view.ViewGroup, java.lang.Float> r7 = z0.c.f4425a
            float[] r8 = new float[r8]
            r9 = 0
            r8[r10] = r9
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r0, r7, r8)
        L_0x03b0:
            z0.g r4 = r4.f2678a
            java.lang.String r7 = "contentFade"
            z0.h r4 = r4.d(r7)
            r4.a(r0)
            r1.add(r0)
        L_0x03be:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            c.a.g(r0, r1)
            com.google.android.material.transformation.FabTransformationBehavior$a r1 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r27
            r1.<init>(r5, r6, r2, r4)
            r0.addListener(r1)
            int r1 = r3.size()
        L_0x03d4:
            if (r10 >= r1) goto L_0x03e2
            java.lang.Object r2 = r3.get(r10)
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r0.addListener(r2)
            int r10 = r10 + 1
            goto L_0x03d4
        L_0x03e2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.u(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final Pair<h, h> v(float f2, float f3, boolean z2, b bVar) {
        String str;
        g gVar;
        h hVar;
        int i2;
        if (f2 == 0.0f || f3 == 0.0f) {
            hVar = bVar.f2678a.d("translationXLinear");
            gVar = bVar.f2678a;
            str = "translationYLinear";
        } else if ((!z2 || f3 >= 0.0f) && (z2 || i2 <= 0)) {
            hVar = bVar.f2678a.d("translationXCurveDownwards");
            gVar = bVar.f2678a;
            str = "translationYCurveDownwards";
        } else {
            hVar = bVar.f2678a.d("translationXCurveUpwards");
            gVar = bVar.f2678a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(hVar, gVar.d(str));
    }

    public final float w(View view, View view2, i iVar) {
        RectF rectF = this.f2670d;
        RectF rectF2 = this.f2671e;
        z(view, rectF);
        rectF.offset(this.f2673g, this.f2674h);
        z(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float x(View view, View view2, i iVar) {
        RectF rectF = this.f2670d;
        RectF rectF2 = this.f2671e;
        z(view, rectF);
        rectF.offset(this.f2673g, this.f2674h);
        z(view2, rectF2);
        Objects.requireNonNull(iVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float y(b bVar, h hVar, float f2, float f3) {
        long j2 = hVar.f4433a;
        long j3 = hVar.f4434b;
        h d2 = bVar.f2678a.d("expansion");
        return z0.a.a(f2, f3, hVar.b().getInterpolation(((float) (((d2.f4433a + d2.f4434b) + 17) - j2)) / ((float) j3)));
    }

    public final void z(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f2672f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }
}
