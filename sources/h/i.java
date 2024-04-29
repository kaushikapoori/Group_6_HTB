package h;

import android.view.ActionMode;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;

public class i implements Window.Callback {

    /* renamed from: b  reason: collision with root package name */
    public final Window.Callback f3154b;

    public i(Window.Callback callback) {
        if (callback != null) {
            this.f3154b = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f3154b.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f3154b.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f3154b.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f3154b.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f3154b.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f3154b.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f3154b.onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        this.f3154b.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        return this.f3154b.onMenuItemSelected(i2, menuItem);
    }

    public void onPointerCaptureChanged(boolean z2) {
        this.f3154b.onPointerCaptureChanged(z2);
    }

    public boolean onSearchRequested() {
        return this.f3154b.onSearchRequested();
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.f3154b.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f3154b.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z2) {
        this.f3154b.onWindowFocusChanged(z2);
    }
}
