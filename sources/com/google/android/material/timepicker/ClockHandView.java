package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

class ClockHandView extends View {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ int f2631p = 0;

    /* renamed from: b  reason: collision with root package name */
    public ValueAnimator f2632b;

    /* renamed from: c  reason: collision with root package name */
    public float f2633c;

    /* renamed from: d  reason: collision with root package name */
    public float f2634d;

    /* renamed from: e  reason: collision with root package name */
    public int f2635e;

    /* renamed from: f  reason: collision with root package name */
    public final List<c> f2636f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final int f2637g;

    /* renamed from: h  reason: collision with root package name */
    public final float f2638h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f2639i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f2640j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2641k;

    /* renamed from: l  reason: collision with root package name */
    public float f2642l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2643m;

    /* renamed from: n  reason: collision with root package name */
    public double f2644n;

    /* renamed from: o  reason: collision with root package name */
    public int f2645o;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClockHandView clockHandView = ClockHandView.this;
            int i2 = ClockHandView.f2631p;
            clockHandView.c(floatValue, true);
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b(ClockHandView clockHandView) {
        }

        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void a(float f2, boolean z2);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        Paint paint = new Paint();
        this.f2639i = paint;
        this.f2640j = new RectF();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.f4369f, R.attr.materialClockStyle, 2131756048);
        this.f2645o = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f2637g = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f2641k = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f2638h = (float) resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f, false);
        this.f2635e = ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.d.s(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int a(float f2, float f3) {
        int degrees = ((int) Math.toDegrees(Math.atan2((double) (f3 - ((float) (getHeight() / 2))), (double) (f2 - ((float) (getWidth() / 2)))))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    public void b(float f2, boolean z2) {
        ValueAnimator valueAnimator = this.f2632b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z2) {
            c(f2, false);
            return;
        }
        float f3 = this.f2642l;
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (f3 < 180.0f && f2 > 180.0f) {
                f3 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f3), Float.valueOf(f2));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{((Float) pair.first).floatValue(), ((Float) pair.second).floatValue()});
        this.f2632b = ofFloat;
        ofFloat.setDuration(200);
        this.f2632b.addUpdateListener(new a());
        this.f2632b.addListener(new b(this));
        this.f2632b.start();
    }

    public final void c(float f2, boolean z2) {
        float f3 = f2 % 360.0f;
        this.f2642l = f3;
        this.f2644n = Math.toRadians((double) (f3 - 90.0f));
        float cos = (((float) this.f2645o) * ((float) Math.cos(this.f2644n))) + ((float) (getWidth() / 2));
        float sin = (((float) this.f2645o) * ((float) Math.sin(this.f2644n))) + ((float) (getHeight() / 2));
        RectF rectF = this.f2640j;
        int i2 = this.f2637g;
        rectF.set(cos - ((float) i2), sin - ((float) i2), cos + ((float) i2), sin + ((float) i2));
        for (c a2 : this.f2636f) {
            a2.a(f3, z2);
        }
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f2 = (float) width;
        float f3 = (float) height;
        this.f2639i.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) this.f2645o) * ((float) Math.cos(this.f2644n))) + f2, (((float) this.f2645o) * ((float) Math.sin(this.f2644n))) + f3, (float) this.f2637g, this.f2639i);
        double sin = Math.sin(this.f2644n);
        double cos = Math.cos(this.f2644n);
        double d2 = (double) ((float) (this.f2645o - this.f2637g));
        float f4 = (float) (width + ((int) (cos * d2)));
        float f5 = (float) (height + ((int) (d2 * sin)));
        this.f2639i.setStrokeWidth((float) this.f2641k);
        canvas.drawLine(f2, f3, f4, f5, this.f2639i);
        canvas.drawCircle(f2, f3, this.f2638h, this.f2639i);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        b(this.f2642l, false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            z3 = (actionMasked == 1 || actionMasked == 2) ? this.f2643m : false;
            z2 = false;
        } else {
            this.f2633c = x2;
            this.f2634d = y2;
            this.f2643m = false;
            z3 = false;
            z2 = true;
        }
        boolean z5 = this.f2643m;
        float a2 = (float) a(x2, y2);
        boolean z6 = this.f2642l != a2;
        if (!z2 || !z6) {
            if (z6 || z3) {
                b(a2, false);
            }
            this.f2643m = z5 | z4;
            return true;
        }
        z4 = true;
        this.f2643m = z5 | z4;
        return true;
    }
}
