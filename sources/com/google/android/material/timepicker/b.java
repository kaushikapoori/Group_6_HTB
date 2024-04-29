package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.supermarket.R;
import g0.a;
import h0.d;

public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2654d;

    public b(ClockFaceView clockFaceView) {
        this.f2654d = clockFaceView;
    }

    public void d(View view, d dVar) {
        this.f2994a.onInitializeAccessibilityNodeInfo(view, dVar.f3160a);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            dVar.l(this.f2654d.f2630z.get(intValue - 1));
        }
        dVar.f3160a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) d.c.a(0, 1, intValue, 1, false, view.isSelected()).f3176a);
        dVar.f3160a.setClickable(true);
        dVar.a(d.a.f3163e);
    }

    public boolean g(View view, int i2, Bundle bundle) {
        if (i2 != 16) {
            return super.g(view, i2, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float x2 = view.getX() + (((float) view.getWidth()) / 2.0f);
        float height = (((float) view.getHeight()) / 2.0f) + view.getY();
        this.f2654d.f2627w.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x2, height, 0));
        this.f2654d.f2627w.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x2, height, 0));
        return true;
    }
}
