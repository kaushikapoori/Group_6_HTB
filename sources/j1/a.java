package j1;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class a implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    public final Dialog f3276b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3277c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3278d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3279e;

    public a(Dialog dialog, Rect rect) {
        this.f3276b = dialog;
        this.f3277c = rect.left;
        this.f3278d = rect.top;
        this.f3279e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = findViewById.getLeft() + this.f3277c;
        int width = findViewById.getWidth() + left;
        int top = findViewById.getTop() + this.f3278d;
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i2 = this.f3279e;
            obtain.setLocation((float) ((-i2) - 1), (float) ((-i2) - 1));
        }
        view.performClick();
        return this.f3276b.onTouchEvent(obtain);
    }
}
