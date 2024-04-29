package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

public class p extends RecyclerView.v {

    /* renamed from: i  reason: collision with root package name */
    public final LinearInterpolator f1986i = new LinearInterpolator();

    /* renamed from: j  reason: collision with root package name */
    public final DecelerateInterpolator f1987j = new DecelerateInterpolator();

    /* renamed from: k  reason: collision with root package name */
    public PointF f1988k;

    /* renamed from: l  reason: collision with root package name */
    public final DisplayMetrics f1989l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1990m = false;

    /* renamed from: n  reason: collision with root package name */
    public float f1991n;

    /* renamed from: o  reason: collision with root package name */
    public int f1992o = 0;

    /* renamed from: p  reason: collision with root package name */
    public int f1993p = 0;

    public p(Context context) {
        this.f1989l = context.getResources().getDisplayMetrics();
    }

    public void c(View view, RecyclerView.w wVar, RecyclerView.v.a aVar) {
        int i2;
        int i3;
        int i4;
        PointF pointF = this.f1988k;
        int i5 = 0;
        int i6 = (pointF == null || pointF.x == 0.0f) ? 0 : i4 > 0 ? 1 : -1;
        RecyclerView.l lVar = this.f1753c;
        if (lVar == null || !lVar.e()) {
            i2 = 0;
        } else {
            RecyclerView.m mVar = (RecyclerView.m) view.getLayoutParams();
            i2 = e(lVar.C(view) - mVar.leftMargin, lVar.F(view) + mVar.rightMargin, lVar.N(), lVar.f1723n - lVar.O(), i6);
        }
        PointF pointF2 = this.f1988k;
        int i7 = (pointF2 == null || pointF2.y == 0.0f) ? 0 : i3 > 0 ? 1 : -1;
        RecyclerView.l lVar2 = this.f1753c;
        if (lVar2 != null && lVar2.f()) {
            RecyclerView.m mVar2 = (RecyclerView.m) view.getLayoutParams();
            i5 = e(lVar2.G(view) - mVar2.topMargin, lVar2.A(view) + mVar2.bottomMargin, lVar2.P(), lVar2.f1724o - lVar2.M(), i7);
        }
        int ceil = (int) Math.ceil(((double) g((int) Math.sqrt((double) ((i5 * i5) + (i2 * i2))))) / 0.3356d);
        if (ceil > 0) {
            aVar.b(-i2, -i5, ceil, this.f1987j);
        }
    }

    public int e(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public float f(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public int g(int i2) {
        float abs = (float) Math.abs(i2);
        if (!this.f1990m) {
            this.f1991n = f(this.f1989l);
            this.f1990m = true;
        }
        return (int) Math.ceil((double) (abs * this.f1991n));
    }
}
