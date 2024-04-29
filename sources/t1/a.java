package t1;

import android.graphics.Paint;
import android.graphics.Path;

public class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f3890i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f3891j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f3892k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f3893l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f3894a = new Paint();

    /* renamed from: b  reason: collision with root package name */
    public final Paint f3895b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f3896c;

    /* renamed from: d  reason: collision with root package name */
    public int f3897d;

    /* renamed from: e  reason: collision with root package name */
    public int f3898e;

    /* renamed from: f  reason: collision with root package name */
    public int f3899f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f3900g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public Paint f3901h = new Paint();

    public a() {
        a(-16777216);
        this.f3901h.setColor(0);
        Paint paint = new Paint(4);
        this.f3895b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f3896c = new Paint(paint);
    }

    public void a(int i2) {
        this.f3897d = z.a.e(i2, 68);
        this.f3898e = z.a.e(i2, 20);
        this.f3899f = z.a.e(i2, 0);
        this.f3894a.setColor(this.f3897d);
    }
}
