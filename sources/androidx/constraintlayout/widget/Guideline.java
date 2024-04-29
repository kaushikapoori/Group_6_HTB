package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {

    /* renamed from: b  reason: collision with root package name */
    public boolean f907b = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f907b = z2;
    }

    public void setGuidelineBegin(int i2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f907b || aVar.f855a != i2) {
            aVar.f855a = i2;
            setLayoutParams(aVar);
        }
    }

    public void setGuidelineEnd(int i2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f907b || aVar.f857b != i2) {
            aVar.f857b = i2;
            setLayoutParams(aVar);
        }
    }

    public void setGuidelinePercent(float f2) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f907b || aVar.f859c != f2) {
            aVar.f859c = f2;
            setLayoutParams(aVar);
        }
    }

    public void setVisibility(int i2) {
    }
}
