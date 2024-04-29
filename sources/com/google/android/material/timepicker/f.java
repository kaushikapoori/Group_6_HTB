package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

public class f implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f2661b;

    public f(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.f2661b = gestureDetector;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f2661b.onTouchEvent(motionEvent);
        }
        return false;
    }
}
