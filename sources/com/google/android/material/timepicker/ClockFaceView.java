package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.example.supermarket.R;
import com.google.android.material.timepicker.ClockHandView;
import g0.a;
import g0.u;
import h0.d;
import java.util.Arrays;
import r1.c;

class ClockFaceView extends c implements ClockHandView.c {
    public final a A;
    public final int[] B;
    public final float[] C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public String[] H;
    public float I;
    public final ColorStateList J;

    /* renamed from: w  reason: collision with root package name */
    public final ClockHandView f2627w;

    /* renamed from: x  reason: collision with root package name */
    public final Rect f2628x = new Rect();

    /* renamed from: y  reason: collision with root package name */
    public final RectF f2629y = new RectF();

    /* renamed from: z  reason: collision with root package name */
    public final SparseArray<TextView> f2630z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        SparseArray<TextView> sparseArray = new SparseArray<>();
        this.f2630z = sparseArray;
        this.C = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.f4368e, R.attr.materialClockStyle, 2131756048);
        Resources resources = getResources();
        ColorStateList a2 = c.a(context, obtainStyledAttributes, 1);
        this.J = a2;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f2627w = clockHandView;
        this.D = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a2.getColorForState(new int[]{16842913}, a2.getDefaultColor());
        this.B = new int[]{colorForState, colorForState, a2.getDefaultColor()};
        clockHandView.f2636f.add(this);
        int defaultColor = e.a.a(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a3 = c.a(context, obtainStyledAttributes, 0);
        setBackgroundColor(a3 != null ? a3.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.A = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.H = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        for (int i2 = 0; i2 < Math.max(this.H.length, size); i2++) {
            TextView textView = this.f2630z.get(i2);
            if (i2 >= this.H.length) {
                removeView(textView);
                this.f2630z.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, this, false);
                    this.f2630z.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.H[i2]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i2));
                u.u(textView, this.A);
                textView.setTextColor(this.J);
            }
        }
        this.E = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.F = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.G = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    public void a(float f2, boolean z2) {
        if (Math.abs(this.I - f2) > 0.001f) {
            this.I = f2;
            t();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.b.a(1, this.H.length, false, 1).f3175a);
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        t();
    }

    public void onMeasure(int i2, int i3) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.G) / Math.max(Math.max(((float) this.E) / ((float) displayMetrics.heightPixels), ((float) this.F) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void t() {
        RectF rectF = this.f2627w.f2640j;
        for (int i2 = 0; i2 < this.f2630z.size(); i2++) {
            TextView textView = this.f2630z.get(i2);
            if (textView != null) {
                textView.getDrawingRect(this.f2628x);
                offsetDescendantRectToMyCoords(textView, this.f2628x);
                textView.setSelected(rectF.contains((float) this.f2628x.centerX(), (float) this.f2628x.centerY()));
                this.f2629y.set(this.f2628x);
                this.f2629y.offset((float) textView.getPaddingLeft(), (float) textView.getPaddingTop());
                textView.getPaint().setShader(!RectF.intersects(rectF, this.f2629y) ? null : new RadialGradient(rectF.centerX() - this.f2629y.left, rectF.centerY() - this.f2629y.top, 0.5f * rectF.width(), this.B, this.C, Shader.TileMode.CLAMP));
                textView.invalidate();
            }
        }
    }
}
