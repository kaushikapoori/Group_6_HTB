package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.PathInterpolator;
import com.example.supermarket.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import u1.j;

public class d {
    public static final int[] A = {16843623, 16842908, 16842910};
    public static final int[] B = {16842908, 16842910};
    public static final int[] C = {16843623, 16842910};
    public static final int[] D = {16842910};
    public static final int[] E = new int[0];

    /* renamed from: y  reason: collision with root package name */
    public static final TimeInterpolator f2438y = z0.a.f4421c;

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f2439z = {16842919, 16842910};

    /* renamed from: a  reason: collision with root package name */
    public j f2440a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2441b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2442c = true;

    /* renamed from: d  reason: collision with root package name */
    public float f2443d;

    /* renamed from: e  reason: collision with root package name */
    public float f2444e;

    /* renamed from: f  reason: collision with root package name */
    public float f2445f;

    /* renamed from: g  reason: collision with root package name */
    public final o1.j f2446g;

    /* renamed from: h  reason: collision with root package name */
    public Animator f2447h;

    /* renamed from: i  reason: collision with root package name */
    public z0.g f2448i;

    /* renamed from: j  reason: collision with root package name */
    public z0.g f2449j;

    /* renamed from: k  reason: collision with root package name */
    public float f2450k;

    /* renamed from: l  reason: collision with root package name */
    public float f2451l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    public int f2452m;

    /* renamed from: n  reason: collision with root package name */
    public int f2453n = 0;

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f2454o;

    /* renamed from: p  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f2455p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<f> f2456q;

    /* renamed from: r  reason: collision with root package name */
    public final FloatingActionButton f2457r;

    /* renamed from: s  reason: collision with root package name */
    public final t1.b f2458s;

    /* renamed from: t  reason: collision with root package name */
    public final Rect f2459t = new Rect();

    /* renamed from: u  reason: collision with root package name */
    public final RectF f2460u = new RectF();

    /* renamed from: v  reason: collision with root package name */
    public final RectF f2461v = new RectF();

    /* renamed from: w  reason: collision with root package name */
    public final Matrix f2462w = new Matrix();

    /* renamed from: x  reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f2463x;

    public class a extends z0.f {
        public a() {
        }

        public Object evaluate(float f2, Object obj, Object obj2) {
            d.this.f2451l = f2;
            ((Matrix) obj).getValues(this.f4428a);
            ((Matrix) obj2).getValues(this.f4429b);
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f4429b;
                float f3 = fArr[i2];
                float[] fArr2 = this.f4428a;
                fArr[i2] = ((f3 - fArr2[i2]) * f2) + fArr2[i2];
            }
            this.f4430c.setValues(this.f4429b);
            return this.f4430c;
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f2465a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f2466b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f2467c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ float f2468d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f2469e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ float f2470f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ float f2471g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Matrix f2472h;

        public b(float f2, float f3, float f4, float f5, float f6, float f7, float f8, Matrix matrix) {
            this.f2465a = f2;
            this.f2466b = f3;
            this.f2467c = f4;
            this.f2468d = f5;
            this.f2469e = f6;
            this.f2470f = f7;
            this.f2471g = f8;
            this.f2472h = matrix;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            d.this.f2457r.setAlpha(z0.a.b(this.f2465a, this.f2466b, 0.0f, 0.2f, floatValue));
            d.this.f2457r.setScaleX(z0.a.a(this.f2467c, this.f2468d, floatValue));
            d.this.f2457r.setScaleY(z0.a.a(this.f2469e, this.f2468d, floatValue));
            d.this.f2451l = z0.a.a(this.f2470f, this.f2471g, floatValue);
            d.this.a(z0.a.a(this.f2470f, this.f2471g, floatValue), this.f2472h);
            d.this.f2457r.setImageMatrix(this.f2472h);
        }
    }

    public class c extends i {
        public c(d dVar) {
            super((b) null);
        }

        public float a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d  reason: collision with other inner class name */
    public class C0017d extends i {
        public C0017d() {
            super((b) null);
        }

        public float a() {
            d dVar = d.this;
            return dVar.f2443d + dVar.f2444e;
        }
    }

    public class e extends i {
        public e() {
            super((b) null);
        }

        public float a() {
            d dVar = d.this;
            return dVar.f2443d + dVar.f2445f;
        }
    }

    public interface f {
        void a();

        void b();
    }

    public interface g {
    }

    public class h extends i {
        public h() {
            super((b) null);
        }

        public float a() {
            return d.this.f2443d;
        }
    }

    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2477a;

        public i(b bVar) {
        }

        public abstract float a();

        public void onAnimationEnd(Animator animator) {
            Objects.requireNonNull(d.this);
            this.f2477a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f2477a) {
                Objects.requireNonNull(d.this);
                a();
                this.f2477a = true;
            }
            d dVar = d.this;
            valueAnimator.getAnimatedFraction();
            Objects.requireNonNull(dVar);
        }
    }

    public d(FloatingActionButton floatingActionButton, t1.b bVar) {
        this.f2457r = floatingActionButton;
        this.f2458s = bVar;
        o1.j jVar = new o1.j();
        this.f2446g = jVar;
        jVar.a(f2439z, d(new e()));
        jVar.a(A, d(new C0017d()));
        jVar.a(B, d(new C0017d()));
        jVar.a(C, d(new C0017d()));
        jVar.a(D, d(new h()));
        jVar.a(E, d(new c(this)));
        this.f2450k = floatingActionButton.getRotation();
    }

    public final void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f2457r.getDrawable();
        if (drawable != null && this.f2452m != 0) {
            RectF rectF = this.f2460u;
            RectF rectF2 = this.f2461v;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i2 = this.f2452m;
            rectF2.set(0.0f, 0.0f, (float) i2, (float) i2);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i3 = this.f2452m;
            matrix.postScale(f2, f2, ((float) i3) / 2.0f, ((float) i3) / 2.0f);
        }
    }

    public final AnimatorSet b(z0.g gVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f2457r, View.ALPHA, new float[]{f2});
        gVar.d("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f2457r, View.SCALE_X, new float[]{f3});
        gVar.d("scale").a(ofFloat2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 == 26) {
            ofFloat2.setEvaluator(new n1.a(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f2457r, View.SCALE_Y, new float[]{f3});
        gVar.d("scale").a(ofFloat3);
        if (i2 == 26) {
            ofFloat3.setEvaluator(new n1.a(this));
        }
        arrayList.add(ofFloat3);
        a(f4, this.f2462w);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f2457r, new z0.e(), new a(), new Matrix[]{new Matrix(this.f2462w)});
        gVar.d("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        c.a.g(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f2, float f3, float f4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new b(this.f2457r.getAlpha(), f2, this.f2457r.getScaleX(), f3, this.f2457r.getScaleY(), this.f2451l, f4, new Matrix(this.f2462w)));
        arrayList.add(ofFloat);
        c.a.g(animatorSet, arrayList);
        Context context = this.f2457r.getContext();
        int integer = this.f2457r.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1);
        TypedValue a2 = r1.b.a(context, R.attr.motionDurationLong1);
        if (a2 != null && a2.type == 16) {
            integer = a2.data;
        }
        animatorSet.setDuration((long) integer);
        Context context2 = this.f2457r.getContext();
        TimeInterpolator timeInterpolator = z0.a.f4420b;
        TypedValue typedValue = new TypedValue();
        if (context2.getTheme().resolveAttribute(R.attr.motionEasingStandard, typedValue, true)) {
            if (typedValue.type == 3) {
                String valueOf = String.valueOf(typedValue.string);
                if (p1.a.b(valueOf, "cubic-bezier")) {
                    String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                    if (split.length == 4) {
                        timeInterpolator = new PathInterpolator(p1.a.a(split, 0), p1.a.a(split, 1), p1.a.a(split, 2), p1.a.a(split, 3));
                    } else {
                        StringBuilder a3 = androidx.activity.result.a.a("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                        a3.append(split.length);
                        throw new IllegalArgumentException(a3.toString());
                    }
                } else if (p1.a.b(valueOf, "path")) {
                    timeInterpolator = new PathInterpolator(z.e.d(valueOf.substring(5, valueOf.length() - 1)));
                } else {
                    throw new IllegalArgumentException(h.f.a("Invalid motion easing type: ", valueOf));
                }
            } else {
                throw new IllegalArgumentException("Motion easing theme attribute must be a string");
            }
        }
        animatorSet.setInterpolator(timeInterpolator);
        return animatorSet;
    }

    public final ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f2438y);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int i2 = 0;
        if (this.f2441b) {
            i2 = (0 - this.f2457r.getSizeDimension()) / 2;
        }
        float e2 = this.f2442c ? e() + this.f2445f : 0.0f;
        int max = Math.max(i2, (int) Math.ceil((double) e2));
        int max2 = Math.max(i2, (int) Math.ceil((double) (e2 * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    public boolean g() {
        return this.f2457r.getVisibility() == 0 ? this.f2453n == 1 : this.f2453n != 2;
    }

    public boolean h() {
        return this.f2457r.getVisibility() != 0 ? this.f2453n == 2 : this.f2453n != 1;
    }

    public void i() {
        throw null;
    }

    public void j() {
        throw null;
    }

    public void k(int[] iArr) {
        throw null;
    }

    public void l(float f2, float f3, float f4) {
        throw null;
    }

    public void m() {
        ArrayList<f> arrayList = this.f2456q;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void n() {
        ArrayList<f> arrayList = this.f2456q;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public final void o(float f2) {
        this.f2451l = f2;
        Matrix matrix = this.f2462w;
        a(f2, matrix);
        this.f2457r.setImageMatrix(matrix);
    }

    public void p(ColorStateList colorStateList) {
        throw null;
    }

    public boolean q() {
        throw null;
    }

    public final boolean r() {
        FloatingActionButton floatingActionButton = this.f2457r;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        return u.g.c(floatingActionButton) && !this.f2457r.isInEditMode();
    }

    public final boolean s() {
        return !this.f2441b || this.f2457r.getSizeDimension() >= 0;
    }

    public void t() {
        throw null;
    }

    public final void u() {
        Rect rect = this.f2459t;
        f(rect);
        c.a.d(null, "Didn't initialize content background");
        if (q()) {
            InsetDrawable insetDrawable = new InsetDrawable((Drawable) null, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.f2458s;
            Objects.requireNonNull(bVar);
            d.super.setBackgroundDrawable(insetDrawable);
        } else {
            Objects.requireNonNull((FloatingActionButton.b) this.f2458s);
        }
        t1.b bVar2 = this.f2458s;
        int i2 = rect.left;
        Objects.requireNonNull(FloatingActionButton.this);
        throw null;
    }
}
