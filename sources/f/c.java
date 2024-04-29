package f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import f.e;
import java.util.Objects;

public class c extends Drawable implements Drawable.Callback {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f2939n = 0;

    /* renamed from: b  reason: collision with root package name */
    public C0030c f2940b;

    /* renamed from: c  reason: collision with root package name */
    public Rect f2941c;

    /* renamed from: d  reason: collision with root package name */
    public Drawable f2942d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f2943e;

    /* renamed from: f  reason: collision with root package name */
    public int f2944f = 255;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2945g;

    /* renamed from: h  reason: collision with root package name */
    public int f2946h = -1;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2947i;

    /* renamed from: j  reason: collision with root package name */
    public Runnable f2948j;

    /* renamed from: k  reason: collision with root package name */
    public long f2949k;

    /* renamed from: l  reason: collision with root package name */
    public long f2950l;

    /* renamed from: m  reason: collision with root package name */
    public b f2951m;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            c.this.a(true);
            c.this.invalidateSelf();
        }
    }

    public static class b implements Drawable.Callback {

        /* renamed from: b  reason: collision with root package name */
        public Drawable.Callback f2953b;

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f2953b;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f2953b;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: f.c$c  reason: collision with other inner class name */
    public static abstract class C0030c extends Drawable.ConstantState {
        public int A = 0;
        public int B = 0;
        public boolean C;
        public ColorFilter D;
        public boolean E;
        public ColorStateList F;
        public PorterDuff.Mode G;
        public boolean H;
        public boolean I;

        /* renamed from: a  reason: collision with root package name */
        public final c f2954a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f2955b;

        /* renamed from: c  reason: collision with root package name */
        public int f2956c;

        /* renamed from: d  reason: collision with root package name */
        public int f2957d;

        /* renamed from: e  reason: collision with root package name */
        public int f2958e;

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f2959f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f2960g;

        /* renamed from: h  reason: collision with root package name */
        public int f2961h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f2962i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f2963j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f2964k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2965l = false;

        /* renamed from: m  reason: collision with root package name */
        public boolean f2966m;

        /* renamed from: n  reason: collision with root package name */
        public int f2967n;

        /* renamed from: o  reason: collision with root package name */
        public int f2968o;

        /* renamed from: p  reason: collision with root package name */
        public int f2969p;

        /* renamed from: q  reason: collision with root package name */
        public int f2970q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f2971r;

        /* renamed from: s  reason: collision with root package name */
        public int f2972s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f2973t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f2974u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f2975v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f2976w;

        /* renamed from: x  reason: collision with root package name */
        public boolean f2977x = true;

        /* renamed from: y  reason: collision with root package name */
        public boolean f2978y;

        /* renamed from: z  reason: collision with root package name */
        public int f2979z;

        public C0030c(C0030c cVar, c cVar2, Resources resources) {
            this.f2954a = cVar2;
            Rect rect = null;
            this.f2955b = resources != null ? resources : cVar != null ? cVar.f2955b : null;
            int i2 = cVar != null ? cVar.f2956c : 0;
            int i3 = c.f2939n;
            i2 = resources != null ? resources.getDisplayMetrics().densityDpi : i2;
            i2 = i2 == 0 ? 160 : i2;
            this.f2956c = i2;
            if (cVar != null) {
                this.f2957d = cVar.f2957d;
                this.f2958e = cVar.f2958e;
                this.f2975v = true;
                this.f2976w = true;
                this.f2962i = cVar.f2962i;
                this.f2965l = cVar.f2965l;
                this.f2977x = cVar.f2977x;
                this.f2978y = cVar.f2978y;
                this.f2979z = cVar.f2979z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                this.H = cVar.H;
                this.I = cVar.I;
                if (cVar.f2956c == i2) {
                    if (cVar.f2963j) {
                        this.f2964k = cVar.f2964k != null ? new Rect(cVar.f2964k) : rect;
                        this.f2963j = true;
                    }
                    if (cVar.f2966m) {
                        this.f2967n = cVar.f2967n;
                        this.f2968o = cVar.f2968o;
                        this.f2969p = cVar.f2969p;
                        this.f2970q = cVar.f2970q;
                        this.f2966m = true;
                    }
                }
                if (cVar.f2971r) {
                    this.f2972s = cVar.f2972s;
                    this.f2971r = true;
                }
                if (cVar.f2973t) {
                    this.f2974u = cVar.f2974u;
                    this.f2973t = true;
                }
                Drawable[] drawableArr = cVar.f2960g;
                this.f2960g = new Drawable[drawableArr.length];
                this.f2961h = cVar.f2961h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f2959f;
                this.f2959f = sparseArray != null ? sparseArray.clone() : new SparseArray<>(this.f2961h);
                int i4 = this.f2961h;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (drawableArr[i5] != null) {
                        Drawable.ConstantState constantState = drawableArr[i5].getConstantState();
                        if (constantState != null) {
                            this.f2959f.put(i5, constantState);
                        } else {
                            this.f2960g[i5] = drawableArr[i5];
                        }
                    }
                }
                return;
            }
            this.f2960g = new Drawable[10];
            this.f2961h = 0;
        }

        public final int a(Drawable drawable) {
            int i2 = this.f2961h;
            if (i2 >= this.f2960g.length) {
                int i3 = i2 + 10;
                e.a aVar = (e.a) this;
                Drawable[] drawableArr = new Drawable[i3];
                Drawable[] drawableArr2 = aVar.f2960g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i2);
                }
                aVar.f2960g = drawableArr;
                int[][] iArr = new int[i3][];
                System.arraycopy(aVar.J, 0, iArr, 0, i2);
                aVar.J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f2954a);
            this.f2960g[i2] = drawable;
            this.f2961h++;
            this.f2958e = drawable.getChangingConfigurations() | this.f2958e;
            this.f2971r = false;
            this.f2973t = false;
            this.f2964k = null;
            this.f2963j = false;
            this.f2966m = false;
            this.f2975v = false;
            return i2;
        }

        public void b() {
            this.f2966m = true;
            c();
            int i2 = this.f2961h;
            Drawable[] drawableArr = this.f2960g;
            this.f2968o = -1;
            this.f2967n = -1;
            this.f2970q = 0;
            this.f2969p = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f2967n) {
                    this.f2967n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f2968o) {
                    this.f2968o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f2969p) {
                    this.f2969p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f2970q) {
                    this.f2970q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f2959f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int keyAt = this.f2959f.keyAt(i2);
                    Drawable[] drawableArr = this.f2960g;
                    Drawable newDrawable = this.f2959f.valueAt(i2).newDrawable(this.f2955b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        a0.a.c(newDrawable, this.f2979z);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f2954a);
                    drawableArr[keyAt] = mutate;
                }
                this.f2959f = null;
            }
        }

        public boolean canApplyTheme() {
            int i2 = this.f2961h;
            Drawable[] drawableArr = this.f2960g;
            for (int i3 = 0; i3 < i2; i3++) {
                Drawable drawable = drawableArr[i3];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f2959f.get(i3);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        public final Drawable d(int i2) {
            int indexOfKey;
            Drawable drawable = this.f2960g[i2];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f2959f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i2)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f2959f.valueAt(indexOfKey).newDrawable(this.f2955b);
            if (Build.VERSION.SDK_INT >= 23) {
                a0.a.c(newDrawable, this.f2979z);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f2954a);
            this.f2960g[i2] = mutate;
            this.f2959f.removeAt(indexOfKey);
            if (this.f2959f.size() == 0) {
                this.f2959f = null;
            }
            return mutate;
        }

        public abstract void e();

        public final void f(Resources resources) {
            if (resources != null) {
                this.f2955b = resources;
                int i2 = c.f2939n;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = this.f2956c;
                this.f2956c = i3;
                if (i4 != i3) {
                    this.f2966m = false;
                    this.f2963j = false;
                }
            }
        }

        public int getChangingConfigurations() {
            return this.f2957d | this.f2958e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f2945g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f2942d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0036
            long r9 = r13.f2949k
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0038
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0020
            int r9 = r13.f2944f
            r3.setAlpha(r9)
            goto L_0x0036
        L_0x0020:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            f.c$c r9 = r13.f2940b
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f2944f
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x0039
        L_0x0036:
            r13.f2949k = r7
        L_0x0038:
            r3 = 0
        L_0x0039:
            android.graphics.drawable.Drawable r9 = r13.f2943e
            if (r9 == 0) goto L_0x0061
            long r10 = r13.f2950l
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0063
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x004e
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f2943e = r0
            goto L_0x0061
        L_0x004e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            f.c$c r4 = r13.f2940b
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f2944f
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0064
        L_0x0061:
            r13.f2950l = r7
        L_0x0063:
            r0 = r3
        L_0x0064:
            if (r14 == 0) goto L_0x0070
            if (r0 == 0) goto L_0x0070
            java.lang.Runnable r14 = r13.f2948j
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0070:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.c.a(boolean):void");
    }

    public void applyTheme(Resources.Theme theme) {
        C0030c cVar = this.f2940b;
        Objects.requireNonNull(cVar);
        if (theme != null) {
            cVar.c();
            int i2 = cVar.f2961h;
            Drawable[] drawableArr = cVar.f2960g;
            for (int i3 = 0; i3 < i2; i3++) {
                if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                    drawableArr[i3].applyTheme(theme);
                    cVar.f2958e |= drawableArr[i3].getChangingConfigurations();
                }
            }
            cVar.f(theme.getResources());
        }
    }

    public C0030c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.f2951m == null) {
            this.f2951m = new b();
        }
        b bVar = this.f2951m;
        bVar.f2953b = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f2940b.A <= 0 && this.f2945g) {
                drawable.setAlpha(this.f2944f);
            }
            C0030c cVar = this.f2940b;
            if (cVar.E) {
                drawable.setColorFilter(cVar.D);
            } else {
                if (cVar.H) {
                    drawable.setTintList(cVar.F);
                }
                C0030c cVar2 = this.f2940b;
                if (cVar2.I) {
                    drawable.setTintMode(cVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f2940b.f2977x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                a0.a.c(drawable, a0.a.b(this));
            }
            drawable.setAutoMirrored(this.f2940b.C);
            Rect rect = this.f2941c;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            b bVar2 = this.f2951m;
            Drawable.Callback callback = bVar2.f2953b;
            bVar2.f2953b = null;
            drawable.setCallback(callback);
        }
    }

    public boolean canApplyTheme() {
        return this.f2940b.canApplyTheme();
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(int r10) {
        /*
            r9 = this;
            int r0 = r9.f2946h
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            f.c$c r0 = r9.f2940b
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f2943e
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f2942d
            if (r0 == 0) goto L_0x0029
            r9.f2943e = r0
            f.c$c r0 = r9.f2940b
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f2950l = r0
            goto L_0x0035
        L_0x0029:
            r9.f2943e = r4
            r9.f2950l = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f2942d
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            f.c$c r0 = r9.f2940b
            int r1 = r0.f2961h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f2942d = r0
            r9.f2946h = r10
            if (r0 == 0) goto L_0x005a
            f.c$c r10 = r9.f2940b
            int r10 = r10.A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f2949k = r2
        L_0x0051:
            r9.c(r0)
            goto L_0x005a
        L_0x0055:
            r9.f2942d = r4
            r10 = -1
            r9.f2946h = r10
        L_0x005a:
            long r0 = r9.f2949k
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f2950l
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f2948j
            if (r0 != 0) goto L_0x0073
            f.c$a r0 = new f.c$a
            r0.<init>()
            r9.f2948j = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f.c.d(int):boolean");
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f2942d;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f2943e;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(C0030c cVar) {
        throw null;
    }

    public int getAlpha() {
        return this.f2944f;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f2940b.getChangingConfigurations();
    }

    public final Drawable.ConstantState getConstantState() {
        C0030c cVar = this.f2940b;
        boolean z2 = false;
        if (!cVar.f2975v) {
            cVar.c();
            cVar.f2975v = true;
            int i2 = cVar.f2961h;
            Drawable[] drawableArr = cVar.f2960g;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    cVar.f2976w = true;
                    z2 = true;
                    break;
                } else if (drawableArr[i3].getConstantState() == null) {
                    cVar.f2976w = false;
                    break;
                } else {
                    i3++;
                }
            }
        } else {
            z2 = cVar.f2976w;
        }
        if (!z2) {
            return null;
        }
        this.f2940b.f2957d = getChangingConfigurations();
        return this.f2940b;
    }

    public Drawable getCurrent() {
        return this.f2942d;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f2941c;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        C0030c cVar = this.f2940b;
        if (cVar.f2965l) {
            if (!cVar.f2966m) {
                cVar.b();
            }
            return cVar.f2968o;
        }
        Drawable drawable = this.f2942d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        C0030c cVar = this.f2940b;
        if (cVar.f2965l) {
            if (!cVar.f2966m) {
                cVar.b();
            }
            return cVar.f2967n;
        }
        Drawable drawable = this.f2942d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        C0030c cVar = this.f2940b;
        if (cVar.f2965l) {
            if (!cVar.f2966m) {
                cVar.b();
            }
            return cVar.f2970q;
        }
        Drawable drawable = this.f2942d;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        C0030c cVar = this.f2940b;
        if (cVar.f2965l) {
            if (!cVar.f2966m) {
                cVar.b();
            }
            return cVar.f2969p;
        }
        Drawable drawable = this.f2942d;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f2942d;
        int i2 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C0030c cVar = this.f2940b;
        if (cVar.f2971r) {
            return cVar.f2972s;
        }
        cVar.c();
        int i3 = cVar.f2961h;
        Drawable[] drawableArr = cVar.f2960g;
        if (i3 > 0) {
            i2 = drawableArr[0].getOpacity();
        }
        for (int i4 = 1; i4 < i3; i4++) {
            i2 = Drawable.resolveOpacity(i2, drawableArr[i4].getOpacity());
        }
        cVar.f2972s = i2;
        cVar.f2971r = true;
        return i2;
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f2942d;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z2;
        C0030c cVar = this.f2940b;
        Rect rect2 = null;
        boolean z3 = true;
        if (!cVar.f2962i) {
            Rect rect3 = cVar.f2964k;
            if (rect3 != null || cVar.f2963j) {
                rect2 = rect3;
            } else {
                cVar.c();
                Rect rect4 = new Rect();
                int i2 = cVar.f2961h;
                Drawable[] drawableArr = cVar.f2960g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i4 = rect4.left;
                        if (i4 > rect2.left) {
                            rect2.left = i4;
                        }
                        int i5 = rect4.top;
                        if (i5 > rect2.top) {
                            rect2.top = i5;
                        }
                        int i6 = rect4.right;
                        if (i6 > rect2.right) {
                            rect2.right = i6;
                        }
                        int i7 = rect4.bottom;
                        if (i7 > rect2.bottom) {
                            rect2.bottom = i7;
                        }
                    }
                }
                cVar.f2963j = true;
                cVar.f2964k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            z2 = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f2942d;
            z2 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (!this.f2940b.C || a0.a.b(this) != 1) {
            z3 = false;
        }
        if (z3) {
            int i8 = rect.left;
            rect.left = rect.right;
            rect.right = i8;
        }
        return z2;
    }

    public void invalidateDrawable(Drawable drawable) {
        C0030c cVar = this.f2940b;
        if (cVar != null) {
            cVar.f2971r = false;
            cVar.f2973t = false;
        }
        if (drawable == this.f2942d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f2940b.C;
    }

    public void jumpToCurrentState() {
        boolean z2;
        Drawable drawable = this.f2943e;
        boolean z3 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f2943e = null;
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f2942d;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f2945g) {
                this.f2942d.setAlpha(this.f2944f);
            }
        }
        if (this.f2950l != 0) {
            this.f2950l = 0;
            z2 = true;
        }
        if (this.f2949k != 0) {
            this.f2949k = 0;
        } else {
            z3 = z2;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f2947i && super.mutate() == this) {
            C0030c b2 = b();
            b2.e();
            e(b2);
            this.f2947i = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2943e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f2942d;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i2) {
        C0030c cVar = this.f2940b;
        int i3 = this.f2946h;
        int i4 = cVar.f2961h;
        Drawable[] drawableArr = cVar.f2960g;
        boolean z2 = false;
        for (int i5 = 0; i5 < i4; i5++) {
            if (drawableArr[i5] != null) {
                boolean c2 = Build.VERSION.SDK_INT >= 23 ? a0.a.c(drawableArr[i5], i2) : false;
                if (i5 == i3) {
                    z2 = c2;
                }
            }
        }
        cVar.f2979z = i2;
        return z2;
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f2943e;
        if (drawable != null) {
            return drawable.setLevel(i2);
        }
        Drawable drawable2 = this.f2942d;
        if (drawable2 != null) {
            return drawable2.setLevel(i2);
        }
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2943e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f2942d;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable == this.f2942d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        if (!this.f2945g || this.f2944f != i2) {
            this.f2945g = true;
            this.f2944f = i2;
            Drawable drawable = this.f2942d;
            if (drawable == null) {
                return;
            }
            if (this.f2949k == 0) {
                drawable.setAlpha(i2);
            } else {
                a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z2) {
        C0030c cVar = this.f2940b;
        if (cVar.C != z2) {
            cVar.C = z2;
            Drawable drawable = this.f2942d;
            if (drawable != null) {
                drawable.setAutoMirrored(z2);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C0030c cVar = this.f2940b;
        cVar.E = true;
        if (cVar.D != colorFilter) {
            cVar.D = colorFilter;
            Drawable drawable = this.f2942d;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z2) {
        C0030c cVar = this.f2940b;
        if (cVar.f2977x != z2) {
            cVar.f2977x = z2;
            Drawable drawable = this.f2942d;
            if (drawable != null) {
                drawable.setDither(z2);
            }
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.f2942d;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    public void setHotspotBounds(int i2, int i3, int i4, int i5) {
        Rect rect = this.f2941c;
        if (rect == null) {
            this.f2941c = new Rect(i2, i3, i4, i5);
        } else {
            rect.set(i2, i3, i4, i5);
        }
        Drawable drawable = this.f2942d;
        if (drawable != null) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C0030c cVar = this.f2940b;
        cVar.H = true;
        if (cVar.F != colorStateList) {
            cVar.F = colorStateList;
            a0.a.e(this.f2942d, colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        C0030c cVar = this.f2940b;
        cVar.I = true;
        if (cVar.G != mode) {
            cVar.G = mode;
            a0.a.f(this.f2942d, mode);
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f2943e;
        if (drawable != null) {
            drawable.setVisible(z2, z3);
        }
        Drawable drawable2 = this.f2942d;
        if (drawable2 != null) {
            drawable2.setVisible(z2, z3);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f2942d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
