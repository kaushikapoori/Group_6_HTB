package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.example.supermarket.R;

public class x extends SeekBar {

    /* renamed from: b  reason: collision with root package name */
    public final y f820b;

    public x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        w0.a(this, getContext());
        y yVar = new y(this);
        this.f820b = yVar;
        yVar.a(attributeSet, R.attr.seekBarStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.f820b;
        Drawable drawable = yVar.f822e;
        if (drawable != null && drawable.isStateful() && drawable.setState(yVar.f821d.getDrawableState())) {
            yVar.f821d.invalidateDrawable(drawable);
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f820b.f822e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f820b.d(canvas);
    }
}
