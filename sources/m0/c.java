package m0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import g0.u;
import java.util.Arrays;
import java.util.Objects;

public class c {

    /* renamed from: v  reason: collision with root package name */
    public static final Interpolator f3400v = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f3401a;

    /* renamed from: b  reason: collision with root package name */
    public int f3402b;

    /* renamed from: c  reason: collision with root package name */
    public int f3403c = -1;

    /* renamed from: d  reason: collision with root package name */
    public float[] f3404d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f3405e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f3406f;

    /* renamed from: g  reason: collision with root package name */
    public float[] f3407g;

    /* renamed from: h  reason: collision with root package name */
    public int[] f3408h;

    /* renamed from: i  reason: collision with root package name */
    public int[] f3409i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f3410j;

    /* renamed from: k  reason: collision with root package name */
    public int f3411k;

    /* renamed from: l  reason: collision with root package name */
    public VelocityTracker f3412l;

    /* renamed from: m  reason: collision with root package name */
    public float f3413m;

    /* renamed from: n  reason: collision with root package name */
    public float f3414n;

    /* renamed from: o  reason: collision with root package name */
    public int f3415o;

    /* renamed from: p  reason: collision with root package name */
    public OverScroller f3416p;

    /* renamed from: q  reason: collision with root package name */
    public final C0044c f3417q;

    /* renamed from: r  reason: collision with root package name */
    public View f3418r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3419s;

    /* renamed from: t  reason: collision with root package name */
    public final ViewGroup f3420t;

    /* renamed from: u  reason: collision with root package name */
    public final Runnable f3421u = new b();

    public class a implements Interpolator {
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            c.this.s(0);
        }
    }

    /* renamed from: m0.c$c  reason: collision with other inner class name */
    public static abstract class C0044c {
        public abstract int a(View view, int i2, int i3);

        public abstract int b(View view, int i2, int i3);

        public int c(View view) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public void e(View view, int i2) {
        }

        public abstract void f(int i2);

        public abstract void g(View view, int i2, int i3, int i4, int i5);

        public abstract void h(View view, float f2, float f3);

        public abstract boolean i(View view, int i2);
    }

    public c(Context context, ViewGroup viewGroup, C0044c cVar) {
        if (cVar != null) {
            this.f3420t = viewGroup;
            this.f3417q = cVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.f3415o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f3402b = viewConfiguration.getScaledTouchSlop();
            this.f3413m = (float) viewConfiguration.getScaledMaximumFlingVelocity();
            this.f3414n = (float) viewConfiguration.getScaledMinimumFlingVelocity();
            this.f3416p = new OverScroller(context, f3400v);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    public void a() {
        this.f3403c = -1;
        float[] fArr = this.f3404d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.f3405e, 0.0f);
            Arrays.fill(this.f3406f, 0.0f);
            Arrays.fill(this.f3407g, 0.0f);
            Arrays.fill(this.f3408h, 0);
            Arrays.fill(this.f3409i, 0);
            Arrays.fill(this.f3410j, 0);
            this.f3411k = 0;
        }
        VelocityTracker velocityTracker = this.f3412l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3412l = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() == this.f3420t) {
            this.f3418r = view;
            this.f3403c = i2;
            this.f3417q.e(view, i2);
            s(1);
            return;
        }
        StringBuilder a2 = androidx.activity.result.a.a("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        a2.append(this.f3420t);
        a2.append(")");
        throw new IllegalArgumentException(a2.toString());
    }

    public final boolean c(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f3408h[i2] & i3) != i3 || (0 & i3) == 0 || (this.f3410j[i2] & i3) == i3 || (this.f3409i[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f3402b;
        if (abs <= ((float) i4) && abs2 <= ((float) i4)) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            Objects.requireNonNull(this.f3417q);
        }
        return (this.f3409i[i2] & i3) == 0 && abs > ((float) this.f3402b);
    }

    public final boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z2 = this.f3417q.c(view) > 0;
        boolean z3 = this.f3417q.d(view) > 0;
        if (!z2 || !z3) {
            return z2 ? Math.abs(f2) > ((float) this.f3402b) : z3 && Math.abs(f3) > ((float) this.f3402b);
        }
        float f4 = f3 * f3;
        int i2 = this.f3402b;
        return f4 + (f2 * f2) > ((float) (i2 * i2));
    }

    public final float e(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    public final int f(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    public final void g(int i2) {
        float[] fArr = this.f3404d;
        if (fArr != null) {
            int i3 = this.f3411k;
            boolean z2 = true;
            int i4 = 1 << i2;
            if ((i4 & i3) == 0) {
                z2 = false;
            }
            if (z2) {
                fArr[i2] = 0.0f;
                this.f3405e[i2] = 0.0f;
                this.f3406f[i2] = 0.0f;
                this.f3407g[i2] = 0.0f;
                this.f3408h[i2] = 0;
                this.f3409i[i2] = 0;
                this.f3410j[i2] = 0;
                this.f3411k = (~i4) & i3;
            }
        }
    }

    public final int h(int i2, int i3, int i4) {
        if (i2 == 0) {
            return 0;
        }
        int width = this.f3420t.getWidth();
        float f2 = (float) (width / 2);
        float sin = (((float) Math.sin((double) ((Math.min(1.0f, ((float) Math.abs(i2)) / ((float) width)) - 0.5f) * 0.47123894f))) * f2) + f2;
        int abs = Math.abs(i3);
        return Math.min(abs > 0 ? Math.round(Math.abs(sin / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i2)) / ((float) i4)) + 1.0f) * 256.0f), 600);
    }

    public boolean i(boolean z2) {
        if (this.f3401a == 2) {
            boolean computeScrollOffset = this.f3416p.computeScrollOffset();
            int currX = this.f3416p.getCurrX();
            int currY = this.f3416p.getCurrY();
            int left = currX - this.f3418r.getLeft();
            int top = currY - this.f3418r.getTop();
            if (left != 0) {
                u.n(this.f3418r, left);
            }
            if (top != 0) {
                u.o(this.f3418r, top);
            }
            if (!(left == 0 && top == 0)) {
                this.f3417q.g(this.f3418r, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f3416p.getFinalX() && currY == this.f3416p.getFinalY()) {
                this.f3416p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z2) {
                    this.f3420t.post(this.f3421u);
                } else {
                    s(0);
                }
            }
        }
        return this.f3401a == 2;
    }

    public final void j(float f2, float f3) {
        this.f3419s = true;
        this.f3417q.h(this.f3418r, f2, f3);
        this.f3419s = false;
        if (this.f3401a == 1) {
            s(0);
        }
    }

    public View k(int i2, int i3) {
        for (int childCount = this.f3420t.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.f3420t;
            Objects.requireNonNull(this.f3417q);
            View childAt = viewGroup.getChildAt(childCount);
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean l(int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int left = this.f3418r.getLeft();
        int top = this.f3418r.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.f3416p.abortAnimation();
            s(0);
            return false;
        }
        View view = this.f3418r;
        int f6 = f(i4, (int) this.f3414n, (int) this.f3413m);
        int f7 = f(i5, (int) this.f3414n, (int) this.f3413m);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(f6);
        int abs4 = Math.abs(f7);
        int i8 = abs3 + abs4;
        int i9 = abs + abs2;
        if (f6 != 0) {
            f2 = (float) abs3;
            f3 = (float) i8;
        } else {
            f2 = (float) abs;
            f3 = (float) i9;
        }
        float f8 = f2 / f3;
        if (f7 != 0) {
            f5 = (float) abs4;
            f4 = (float) i8;
        } else {
            f5 = (float) abs2;
            f4 = (float) i9;
        }
        int h2 = h(i6, f6, this.f3417q.c(view));
        float h3 = ((float) h(i7, f7, this.f3417q.d(view))) * (f5 / f4);
        this.f3416p.startScroll(left, top, i6, i7, (int) (h3 + (((float) h2) * f8)));
        s(2);
        return true;
    }

    public final boolean m(int i2) {
        if ((this.f3411k & (1 << i2)) != 0) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public void n(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f3412l == null) {
            this.f3412l = VelocityTracker.obtain();
        }
        this.f3412l.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f3401a != 1) {
                        int pointerCount = motionEvent.getPointerCount();
                        while (i3 < pointerCount) {
                            int pointerId = motionEvent.getPointerId(i3);
                            if (m(pointerId)) {
                                float x2 = motionEvent.getX(i3);
                                float y2 = motionEvent.getY(i3);
                                float f2 = x2 - this.f3404d[pointerId];
                                float f3 = y2 - this.f3405e[pointerId];
                                p(f2, f3, pointerId);
                                if (this.f3401a != 1) {
                                    View k2 = k((int) x2, (int) y2);
                                    if (d(k2, f2, f3) && v(k2, pointerId)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i3++;
                        }
                    } else if (m(this.f3403c)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.f3403c);
                        float x3 = motionEvent.getX(findPointerIndex);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float[] fArr = this.f3406f;
                        int i4 = this.f3403c;
                        int i5 = (int) (x3 - fArr[i4]);
                        int i6 = (int) (y3 - this.f3407g[i4]);
                        int left = this.f3418r.getLeft() + i5;
                        int top = this.f3418r.getTop() + i6;
                        int left2 = this.f3418r.getLeft();
                        int top2 = this.f3418r.getTop();
                        if (i5 != 0) {
                            left = this.f3417q.a(this.f3418r, left, i5);
                            u.n(this.f3418r, left - left2);
                        }
                        int i7 = left;
                        if (i6 != 0) {
                            top = this.f3417q.b(this.f3418r, top, i6);
                            u.o(this.f3418r, top - top2);
                        }
                        int i8 = top;
                        if (!(i5 == 0 && i6 == 0)) {
                            this.f3417q.g(this.f3418r, i7, i8, i7 - left2, i8 - top2);
                        }
                    } else {
                        return;
                    }
                    r(motionEvent);
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x4 = motionEvent.getX(actionIndex);
                        float y4 = motionEvent.getY(actionIndex);
                        q(x4, y4, pointerId2);
                        if (this.f3401a == 0) {
                            v(k((int) x4, (int) y4), pointerId2);
                            if ((this.f3408h[pointerId2] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i9 = (int) x4;
                            int i10 = (int) y4;
                            View view = this.f3418r;
                            if (view != null && i9 >= view.getLeft() && i9 < view.getRight() && i10 >= view.getTop() && i10 < view.getBottom()) {
                                i3 = 1;
                            }
                            if (i3 != 0) {
                                v(this.f3418r, pointerId2);
                                return;
                            }
                            return;
                        }
                    } else if (actionMasked == 6) {
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        if (this.f3401a == 1 && pointerId3 == this.f3403c) {
                            int pointerCount2 = motionEvent.getPointerCount();
                            while (true) {
                                if (i3 >= pointerCount2) {
                                    i2 = -1;
                                    break;
                                }
                                int pointerId4 = motionEvent.getPointerId(i3);
                                if (pointerId4 != this.f3403c) {
                                    View k3 = k((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                                    View view2 = this.f3418r;
                                    if (k3 == view2 && v(view2, pointerId4)) {
                                        i2 = this.f3403c;
                                        break;
                                    }
                                }
                                i3++;
                            }
                            if (i2 == -1) {
                                o();
                            }
                        }
                        g(pointerId3);
                        return;
                    } else {
                        return;
                    }
                } else if (this.f3401a == 1) {
                    j(0.0f, 0.0f);
                }
            } else if (this.f3401a == 1) {
                o();
            }
            a();
            return;
        }
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View k4 = k((int) x5, (int) y5);
        q(x5, y5, pointerId5);
        v(k4, pointerId5);
        if ((this.f3408h[pointerId5] & 0) == 0) {
            return;
        }
        Objects.requireNonNull(this.f3417q);
    }

    public final void o() {
        this.f3412l.computeCurrentVelocity(1000, this.f3413m);
        j(e(this.f3412l.getXVelocity(this.f3403c), this.f3414n, this.f3413m), e(this.f3412l.getYVelocity(this.f3403c), this.f3414n, this.f3413m));
    }

    public final void p(float f2, float f3, int i2) {
        boolean c2 = c(f2, f3, i2, 1);
        if (c(f3, f2, i2, 4)) {
            c2 |= true;
        }
        if (c(f2, f3, i2, 2)) {
            c2 |= true;
        }
        if (c(f3, f2, i2, 8)) {
            c2 |= true;
        }
        if (c2) {
            int[] iArr = this.f3409i;
            iArr[i2] = iArr[i2] | c2;
            Objects.requireNonNull(this.f3417q);
        }
    }

    public final void q(float f2, float f3, int i2) {
        float[] fArr = this.f3404d;
        int i3 = 0;
        if (fArr == null || fArr.length <= i2) {
            int i4 = i2 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f3405e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f3406f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f3407g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f3408h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f3409i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f3410j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f3404d = fArr2;
            this.f3405e = fArr3;
            this.f3406f = fArr4;
            this.f3407g = fArr5;
            this.f3408h = iArr;
            this.f3409i = iArr2;
            this.f3410j = iArr3;
        }
        float[] fArr9 = this.f3404d;
        this.f3406f[i2] = f2;
        fArr9[i2] = f2;
        float[] fArr10 = this.f3405e;
        this.f3407g[i2] = f3;
        fArr10[i2] = f3;
        int[] iArr7 = this.f3408h;
        int i5 = (int) f2;
        int i6 = (int) f3;
        if (i5 < this.f3420t.getLeft() + this.f3415o) {
            i3 = 1;
        }
        if (i6 < this.f3420t.getTop() + this.f3415o) {
            i3 |= 4;
        }
        if (i5 > this.f3420t.getRight() - this.f3415o) {
            i3 |= 2;
        }
        if (i6 > this.f3420t.getBottom() - this.f3415o) {
            i3 |= 8;
        }
        iArr7[i2] = i3;
        this.f3411k |= 1 << i2;
    }

    public final void r(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (m(pointerId)) {
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                this.f3406f[pointerId] = x2;
                this.f3407g[pointerId] = y2;
            }
        }
    }

    public void s(int i2) {
        this.f3420t.removeCallbacks(this.f3421u);
        if (this.f3401a != i2) {
            this.f3401a = i2;
            this.f3417q.f(i2);
            if (this.f3401a == 0) {
                this.f3418r = null;
            }
        }
    }

    public boolean t(int i2, int i3) {
        if (this.f3419s) {
            return l(i2, i3, (int) this.f3412l.getXVelocity(this.f3403c), (int) this.f3412l.getYVelocity(this.f3403c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00dd, code lost:
        if (r12 != r11) goto L_0x00e6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean u(android.view.MotionEvent r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L_0x0011
            r16.a()
        L_0x0011:
            android.view.VelocityTracker r4 = r0.f3412l
            if (r4 != 0) goto L_0x001b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.f3412l = r4
        L_0x001b:
            android.view.VelocityTracker r4 = r0.f3412l
            r4.addMovement(r1)
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0104
            if (r2 == r5) goto L_0x00ff
            if (r2 == r4) goto L_0x006f
            r7 = 3
            if (r2 == r7) goto L_0x00ff
            r7 = 5
            if (r2 == r7) goto L_0x003d
            r4 = 6
            if (r2 == r4) goto L_0x0034
            goto L_0x0102
        L_0x0034:
            int r1 = r1.getPointerId(r3)
            r0.g(r1)
            goto L_0x0102
        L_0x003d:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.q(r7, r1, r2)
            int r3 = r0.f3401a
            if (r3 != 0) goto L_0x005e
            int[] r1 = r0.f3408h
            r1 = r1[r2]
            r1 = r1 & r6
            if (r1 == 0) goto L_0x0102
            m0.c$c r1 = r0.f3417q
            java.util.Objects.requireNonNull(r1)
            goto L_0x0102
        L_0x005e:
            if (r3 != r4) goto L_0x0102
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.k(r3, r1)
            android.view.View r3 = r0.f3418r
            if (r1 != r3) goto L_0x0102
            r0.v(r1, r2)
            goto L_0x0102
        L_0x006f:
            float[] r2 = r0.f3404d
            if (r2 == 0) goto L_0x0102
            float[] r2 = r0.f3405e
            if (r2 != 0) goto L_0x0079
            goto L_0x0102
        L_0x0079:
            int r2 = r17.getPointerCount()
            r3 = 0
        L_0x007e:
            if (r3 >= r2) goto L_0x00fb
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.m(r4)
            if (r7 != 0) goto L_0x008c
            goto L_0x00f7
        L_0x008c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.f3404d
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.f3405e
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.k(r7, r8)
            if (r7 == 0) goto L_0x00b0
            boolean r8 = r0.d(r7, r9, r10)
            if (r8 == 0) goto L_0x00b0
            r8 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            if (r8 == 0) goto L_0x00e6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            m0.c$c r14 = r0.f3417q
            int r12 = r14.a(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            m0.c$c r6 = r0.f3417q
            int r6 = r6.b(r7, r15, r14)
            m0.c$c r14 = r0.f3417q
            int r14 = r14.c(r7)
            m0.c$c r15 = r0.f3417q
            int r15 = r15.d(r7)
            if (r14 == 0) goto L_0x00df
            if (r14 <= 0) goto L_0x00e6
            if (r12 != r11) goto L_0x00e6
        L_0x00df:
            if (r15 == 0) goto L_0x00fb
            if (r15 <= 0) goto L_0x00e6
            if (r6 != r13) goto L_0x00e6
            goto L_0x00fb
        L_0x00e6:
            r0.p(r9, r10, r4)
            int r6 = r0.f3401a
            if (r6 != r5) goto L_0x00ee
            goto L_0x00fb
        L_0x00ee:
            if (r8 == 0) goto L_0x00f7
            boolean r4 = r0.v(r7, r4)
            if (r4 == 0) goto L_0x00f7
            goto L_0x00fb
        L_0x00f7:
            int r3 = r3 + 1
            r6 = 0
            goto L_0x007e
        L_0x00fb:
            r16.r(r17)
            goto L_0x0102
        L_0x00ff:
            r16.a()
        L_0x0102:
            r2 = 0
            goto L_0x0132
        L_0x0104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r6 = 0
            int r1 = r1.getPointerId(r6)
            r0.q(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.k(r2, r3)
            android.view.View r3 = r0.f3418r
            if (r2 != r3) goto L_0x0125
            int r3 = r0.f3401a
            if (r3 != r4) goto L_0x0125
            r0.v(r2, r1)
        L_0x0125:
            int[] r2 = r0.f3408h
            r1 = r2[r1]
            r2 = 0
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0132
            m0.c$c r1 = r0.f3417q
            java.util.Objects.requireNonNull(r1)
        L_0x0132:
            int r1 = r0.f3401a
            if (r1 != r5) goto L_0x0137
            goto L_0x0138
        L_0x0137:
            r5 = 0
        L_0x0138:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.c.u(android.view.MotionEvent):boolean");
    }

    public boolean v(View view, int i2) {
        if (view == this.f3418r && this.f3403c == i2) {
            return true;
        }
        if (view == null || !this.f3417q.i(view, i2)) {
            return false;
        }
        this.f3403c = i2;
        b(view, i2);
        return true;
    }
}
