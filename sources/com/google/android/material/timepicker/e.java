package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.Objects;

public class e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f2660a;

    public e(TimePickerView timePickerView) {
        this.f2660a = timePickerView;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView timePickerView = this.f2660a;
        int i2 = TimePickerView.f2647x;
        Objects.requireNonNull(timePickerView);
        return false;
    }
}
