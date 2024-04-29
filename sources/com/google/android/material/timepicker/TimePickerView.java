package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import com.example.supermarket.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import g0.u;
import g0.x;
import java.util.Objects;
import java.util.WeakHashMap;

class TimePickerView extends ConstraintLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f2647x = 0;

    /* renamed from: t  reason: collision with root package name */
    public final Chip f2648t;

    /* renamed from: u  reason: collision with root package name */
    public final Chip f2649u;

    /* renamed from: v  reason: collision with root package name */
    public final MaterialButtonToggleGroup f2650v;

    /* renamed from: w  reason: collision with root package name */
    public final View.OnClickListener f2651w;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            TimePickerView timePickerView = TimePickerView.this;
            int i2 = TimePickerView.f2647x;
            Objects.requireNonNull(timePickerView);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.f2651w = aVar;
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.f2650v = materialButtonToggleGroup;
        materialButtonToggleGroup.f2224d.add(new d(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        this.f2648t = chip;
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f2649u = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        f fVar = new f(this, new GestureDetector(getContext(), new e(this)));
        chip.setOnTouchListener(fVar);
        chip2.setOnTouchListener(fVar);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(aVar);
        chip2.setOnClickListener(aVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (view == this && i2 == 0) {
            s();
        }
    }

    public final void s() {
        b.a aVar;
        if (this.f2650v.getVisibility() == 0) {
            b bVar = new b();
            bVar.c(this);
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            char c2 = u.e.d(this) == 0 ? (char) 2 : 1;
            if (bVar.f921c.containsKey(Integer.valueOf(R.id.material_clock_display)) && (aVar = bVar.f921c.get(Integer.valueOf(R.id.material_clock_display))) != null) {
                switch (c2) {
                    case 1:
                        b.C0005b bVar2 = aVar.f925d;
                        bVar2.f960j = -1;
                        bVar2.f958i = -1;
                        bVar2.G = -1;
                        bVar2.N = Integer.MIN_VALUE;
                        break;
                    case 2:
                        b.C0005b bVar3 = aVar.f925d;
                        bVar3.f964l = -1;
                        bVar3.f962k = -1;
                        bVar3.H = -1;
                        bVar3.P = Integer.MIN_VALUE;
                        break;
                    case 3:
                        b.C0005b bVar4 = aVar.f925d;
                        bVar4.f968n = -1;
                        bVar4.f966m = -1;
                        bVar4.I = 0;
                        bVar4.O = Integer.MIN_VALUE;
                        break;
                    case 4:
                        b.C0005b bVar5 = aVar.f925d;
                        bVar5.f970o = -1;
                        bVar5.f972p = -1;
                        bVar5.J = 0;
                        bVar5.Q = Integer.MIN_VALUE;
                        break;
                    case 5:
                        b.C0005b bVar6 = aVar.f925d;
                        bVar6.f974q = -1;
                        bVar6.f975r = -1;
                        bVar6.f976s = -1;
                        bVar6.M = 0;
                        bVar6.T = Integer.MIN_VALUE;
                        break;
                    case 6:
                        b.C0005b bVar7 = aVar.f925d;
                        bVar7.f977t = -1;
                        bVar7.f978u = -1;
                        bVar7.L = 0;
                        bVar7.S = Integer.MIN_VALUE;
                        break;
                    case 7:
                        b.C0005b bVar8 = aVar.f925d;
                        bVar8.f979v = -1;
                        bVar8.f980w = -1;
                        bVar8.K = 0;
                        bVar8.R = Integer.MIN_VALUE;
                        break;
                    case 8:
                        b.C0005b bVar9 = aVar.f925d;
                        bVar9.C = -1.0f;
                        bVar9.B = -1;
                        bVar9.A = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            bVar.b(this, true);
            setConstraintSet((b) null);
            requestLayout();
        }
    }
}
