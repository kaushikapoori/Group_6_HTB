package w1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import u1.g;
import u1.j;

public class f extends g {
    public final Paint A;
    public final RectF B;

    public f() {
        this((j) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(j jVar) {
        super(jVar == null ? new j() : jVar);
        Paint paint = new Paint(1);
        this.A = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.B = new RectF();
    }

    public void h(Canvas canvas) {
        if (this.B.isEmpty()) {
            super.h(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.B);
        } else {
            canvas.clipRect(this.B, Region.Op.DIFFERENCE);
        }
        super.h(canvas);
        canvas.restore();
    }

    public void y(float f2, float f3, float f4, float f5) {
        RectF rectF = this.B;
        if (f2 != rectF.left || f3 != rectF.top || f4 != rectF.right || f5 != rectF.bottom) {
            rectF.set(f2, f3, f4, f5);
            invalidateSelf();
        }
    }
}
