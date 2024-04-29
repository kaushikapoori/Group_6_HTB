package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.example.supermarket.R;

public class v extends RatingBar {

    /* renamed from: b  reason: collision with root package name */
    public final t f793b;

    public v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        w0.a(this, getContext());
        t tVar = new t(this);
        this.f793b = tVar;
        tVar.a(attributeSet, R.attr.ratingBarStyle);
    }

    public synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = this.f793b.f776b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
