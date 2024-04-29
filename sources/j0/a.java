package j0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import g0.u;
import g0.x;
import java.util.Objects;
import java.util.WeakHashMap;

public abstract class a implements View.OnTouchListener {

    /* renamed from: r  reason: collision with root package name */
    public static final int f3233r = ViewConfiguration.getTapTimeout();

    /* renamed from: b  reason: collision with root package name */
    public final C0037a f3234b;

    /* renamed from: c  reason: collision with root package name */
    public final Interpolator f3235c = new AccelerateInterpolator();

    /* renamed from: d  reason: collision with root package name */
    public final View f3236d;

    /* renamed from: e  reason: collision with root package name */
    public Runnable f3237e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f3238f = {0.0f, 0.0f};

    /* renamed from: g  reason: collision with root package name */
    public float[] f3239g = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: h  reason: collision with root package name */
    public int f3240h;

    /* renamed from: i  reason: collision with root package name */
    public int f3241i;

    /* renamed from: j  reason: collision with root package name */
    public float[] f3242j = {0.0f, 0.0f};

    /* renamed from: k  reason: collision with root package name */
    public float[] f3243k = {0.0f, 0.0f};

    /* renamed from: l  reason: collision with root package name */
    public float[] f3244l = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m  reason: collision with root package name */
    public boolean f3245m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3246n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3247o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3248p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3249q;

    /* renamed from: j0.a$a  reason: collision with other inner class name */
    public static class C0037a {

        /* renamed from: a  reason: collision with root package name */
        public int f3250a;

        /* renamed from: b  reason: collision with root package name */
        public int f3251b;

        /* renamed from: c  reason: collision with root package name */
        public float f3252c;

        /* renamed from: d  reason: collision with root package name */
        public float f3253d;

        /* renamed from: e  reason: collision with root package name */
        public long f3254e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f3255f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f3256g = 0;

        /* renamed from: h  reason: collision with root package name */
        public int f3257h = 0;

        /* renamed from: i  reason: collision with root package name */
        public long f3258i = -1;

        /* renamed from: j  reason: collision with root package name */
        public float f3259j;

        /* renamed from: k  reason: collision with root package name */
        public int f3260k;

        public final float a(long j2) {
            long j3 = this.f3254e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f3258i;
            if (j4 < 0 || j2 < j4) {
                return a.b(((float) (j2 - j3)) / ((float) this.f3250a), 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.f3259j;
            return (a.b(((float) (j2 - j4)) / ((float) this.f3260k), 0.0f, 1.0f) * f2) + (1.0f - f2);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a aVar = a.this;
            if (aVar.f3248p) {
                if (aVar.f3246n) {
                    aVar.f3246n = false;
                    C0037a aVar2 = aVar.f3234b;
                    Objects.requireNonNull(aVar2);
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.f3254e = currentAnimationTimeMillis;
                    aVar2.f3258i = -1;
                    aVar2.f3255f = currentAnimationTimeMillis;
                    aVar2.f3259j = 0.5f;
                    aVar2.f3256g = 0;
                    aVar2.f3257h = 0;
                }
                C0037a aVar3 = a.this.f3234b;
                if ((aVar3.f3258i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar3.f3258i + ((long) aVar3.f3260k)) || !a.this.e()) {
                    a.this.f3248p = false;
                    return;
                }
                a aVar4 = a.this;
                if (aVar4.f3247o) {
                    aVar4.f3247o = false;
                    Objects.requireNonNull(aVar4);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar4.f3236d.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar3.f3255f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a2 = aVar3.a(currentAnimationTimeMillis2);
                    aVar3.f3255f = currentAnimationTimeMillis2;
                    float f2 = ((float) (currentAnimationTimeMillis2 - aVar3.f3255f)) * ((a2 * 4.0f) + (-4.0f * a2 * a2));
                    aVar3.f3256g = (int) (aVar3.f3252c * f2);
                    int i2 = (int) (f2 * aVar3.f3253d);
                    aVar3.f3257h = i2;
                    ((e) a.this).f3265s.scrollListBy(i2);
                    View view = a.this.f3236d;
                    WeakHashMap<View, x> weakHashMap = u.f3063a;
                    u.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        C0037a aVar = new C0037a();
        this.f3234b = aVar;
        this.f3236d = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f3244l;
        float f3 = ((float) ((int) ((1575.0f * f2) + 0.5f))) / 1000.0f;
        fArr[0] = f3;
        fArr[1] = f3;
        float[] fArr2 = this.f3243k;
        float f4 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f4;
        fArr2[1] = f4;
        this.f3240h = 1;
        float[] fArr3 = this.f3239g;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f3238f;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f3242j;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f3241i = f3233r;
        aVar.f3250a = 500;
        aVar.f3251b = 500;
    }

    public static float b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f3238f
            r0 = r0[r4]
            float[] r1 = r3.f3239g
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0026
            android.view.animation.Interpolator r6 = r3.f3235c
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L_0x0030
        L_0x0026:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0039
            android.view.animation.Interpolator r6 = r3.f3235c
            float r5 = r6.getInterpolation(r5)
        L_0x0030:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L_0x003a
        L_0x0039:
            r5 = 0
        L_0x003a:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x003f
            return r2
        L_0x003f:
            float[] r0 = r3.f3242j
            r0 = r0[r4]
            float[] r1 = r3.f3243k
            r1 = r1[r4]
            float[] r2 = r3.f3244l
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L_0x0056
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L_0x0056:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.a(int, float, float, float):float");
    }

    public final float c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.f3240h;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                return f2 >= 0.0f ? 1.0f - (f2 / f3) : (!this.f3248p || i2 != 1) ? 0.0f : 1.0f;
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
    }

    public final void d() {
        int i2 = 0;
        if (this.f3246n) {
            this.f3248p = false;
            return;
        }
        C0037a aVar = this.f3234b;
        Objects.requireNonNull(aVar);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i3 = (int) (currentAnimationTimeMillis - aVar.f3254e);
        int i4 = aVar.f3251b;
        if (i3 > i4) {
            i2 = i4;
        } else if (i3 >= 0) {
            i2 = i3;
        }
        aVar.f3260k = i2;
        aVar.f3259j = aVar.a(currentAnimationTimeMillis);
        aVar.f3258i = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean e() {
        /*
            r9 = this;
            j0.a$a r0 = r9.f3234b
            float r1 = r0.f3253d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f3252c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            j0.e r4 = (j0.e) r4
            android.widget.ListView r4 = r4.f3265s
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = 1
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f3249q
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007f
        L_0x0016:
            r5.d()
            goto L_0x007f
        L_0x001a:
            r5.f3247o = r2
            r5.f3245m = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f3236d
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f3236d
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            j0.a$a r7 = r5.f3234b
            r7.f3252c = r0
            r7.f3253d = r6
            boolean r6 = r5.f3248p
            if (r6 != 0) goto L_0x007f
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x007f
            java.lang.Runnable r6 = r5.f3237e
            if (r6 != 0) goto L_0x0061
            j0.a$b r6 = new j0.a$b
            r6.<init>()
            r5.f3237e = r6
        L_0x0061:
            r5.f3248p = r2
            r5.f3246n = r2
            boolean r6 = r5.f3245m
            if (r6 != 0) goto L_0x0078
            int r6 = r5.f3241i
            if (r6 <= 0) goto L_0x0078
            android.view.View r7 = r5.f3236d
            java.lang.Runnable r0 = r5.f3237e
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, g0.x> r6 = g0.u.f3063a
            g0.u.d.n(r7, r0, r3)
            goto L_0x007d
        L_0x0078:
            java.lang.Runnable r6 = r5.f3237e
            r6.run()
        L_0x007d:
            r5.f3245m = r2
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
