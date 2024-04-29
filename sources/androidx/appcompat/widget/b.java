package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

public class b extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    public final ActionBarContainer f508a;

    public b(ActionBarContainer actionBarContainer) {
        this.f508a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f508a;
        if (actionBarContainer.f313i) {
            Drawable drawable = actionBarContainer.f312h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f310f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f508a;
        Drawable drawable3 = actionBarContainer2.f311g;
        if (drawable3 != null && actionBarContainer2.f314j) {
            drawable3.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void getOutline(Outline outline) {
        Drawable drawable;
        ActionBarContainer actionBarContainer = this.f508a;
        if (actionBarContainer.f313i) {
            drawable = actionBarContainer.f312h;
            if (drawable == null) {
                return;
            }
        } else {
            drawable = actionBarContainer.f310f;
            if (drawable == null) {
                return;
            }
        }
        drawable.getOutline(outline);
    }

    public void setAlpha(int i2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
