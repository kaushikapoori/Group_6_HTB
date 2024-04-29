package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

public class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2653b;

    public a(ClockFaceView clockFaceView) {
        this.f2653b = clockFaceView;
    }

    public boolean onPreDraw() {
        if (!this.f2653b.isShown()) {
            return true;
        }
        this.f2653b.getViewTreeObserver().removeOnPreDrawListener(this);
        ClockFaceView clockFaceView = this.f2653b;
        int height = ((this.f2653b.getHeight() / 2) - clockFaceView.f2627w.f2637g) - clockFaceView.D;
        if (height != clockFaceView.f2656u) {
            clockFaceView.f2656u = height;
            clockFaceView.s();
            ClockHandView clockHandView = clockFaceView.f2627w;
            clockHandView.f2645o = clockFaceView.f2656u;
            clockHandView.invalidate();
        }
        return true;
    }
}
