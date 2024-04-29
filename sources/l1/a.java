package l1;

import android.content.Context;
import com.example.supermarket.R;
import r1.b;

public class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f3322f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3323a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3324b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3325c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3326d;

    /* renamed from: e  reason: collision with root package name */
    public final float f3327e;

    public a(Context context) {
        boolean b2 = b.b(context, R.attr.elevationOverlayEnabled, false);
        int e2 = c.b.e(context, R.attr.elevationOverlayColor, 0);
        int e3 = c.b.e(context, R.attr.elevationOverlayAccentColor, 0);
        int e4 = c.b.e(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f3323a = b2;
        this.f3324b = e2;
        this.f3325c = e3;
        this.f3326d = e4;
        this.f3327e = f2;
    }
}
