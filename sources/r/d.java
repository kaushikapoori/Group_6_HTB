package r;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import g0.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import r.e;
import s.b;

public class d extends ConstraintLayout implements k {
    public static final /* synthetic */ int P = 0;
    public long A;
    public float B;
    public c C;
    public b D;
    public boolean E;
    public ArrayList<c> F;
    public ArrayList<c> G;
    public CopyOnWriteArrayList<c> H;
    public int I;
    public float J;
    public boolean K;
    public b L;
    public boolean M;
    public C0047d N;
    public boolean O;

    /* renamed from: t  reason: collision with root package name */
    public float f3795t;

    /* renamed from: u  reason: collision with root package name */
    public int f3796u;

    /* renamed from: v  reason: collision with root package name */
    public int f3797v;

    /* renamed from: w  reason: collision with root package name */
    public int f3798w;

    /* renamed from: x  reason: collision with root package name */
    public float f3799x;

    /* renamed from: y  reason: collision with root package name */
    public float f3800y;

    /* renamed from: z  reason: collision with root package name */
    public float f3801z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            d.this.L.a();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public float f3803a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f3804b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f3805c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f3806d = -1;

        public b() {
        }

        public void a() {
            int a2;
            C0047d dVar = C0047d.SETUP;
            int i2 = this.f3805c;
            if (!(i2 == -1 && this.f3806d == -1)) {
                if (i2 == -1) {
                    d.this.x(this.f3806d);
                } else {
                    int i3 = this.f3806d;
                    if (i3 == -1) {
                        d dVar2 = d.this;
                        dVar2.setState(dVar);
                        dVar2.f3797v = i2;
                        dVar2.f3796u = -1;
                        dVar2.f3798w = -1;
                        s.b bVar = dVar2.f848l;
                        if (bVar != null) {
                            float f2 = (float) -1;
                            int i4 = bVar.f3849b;
                            if (i4 == i2) {
                                b.a aVar = (b.a) (i2 == -1 ? bVar.f3851d.valueAt(0) : bVar.f3851d.get(i4));
                                int i5 = bVar.f3850c;
                                if ((i5 == -1 || !aVar.f3854b.get(i5).a(f2, f2)) && bVar.f3850c != (a2 = aVar.a(f2, f2))) {
                                    androidx.constraintlayout.widget.b bVar2 = a2 == -1 ? null : aVar.f3854b.get(a2).f3862f;
                                    if (a2 != -1) {
                                        int i6 = aVar.f3854b.get(a2).f3861e;
                                    }
                                    if (bVar2 != null) {
                                        bVar.f3850c = a2;
                                        bVar2.a(bVar.f3848a);
                                    }
                                }
                            } else {
                                bVar.f3849b = i2;
                                b.a aVar2 = bVar.f3851d.get(i2);
                                int a3 = aVar2.a(f2, f2);
                                androidx.constraintlayout.widget.b bVar3 = a3 == -1 ? aVar2.f3856d : aVar2.f3854b.get(a3).f3862f;
                                if (a3 != -1) {
                                    int i7 = aVar2.f3854b.get(a3).f3861e;
                                }
                                if (bVar3 == null) {
                                    Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i2 + ", dim =" + f2 + ", " + f2);
                                } else {
                                    bVar.f3850c = a3;
                                    bVar3.a(bVar.f3848a);
                                }
                            }
                        }
                    } else {
                        d.this.w(i2, i3);
                    }
                }
                d.this.setState(dVar);
            }
            if (!Float.isNaN(this.f3804b)) {
                d.this.v(this.f3803a, this.f3804b);
                this.f3803a = Float.NaN;
                this.f3804b = Float.NaN;
                this.f3805c = -1;
                this.f3806d = -1;
            } else if (!Float.isNaN(this.f3803a)) {
                d.this.setProgress(this.f3803a);
            }
        }
    }

    public interface c {
        void a(d dVar, int i2, int i3);

        void b(d dVar, int i2, int i3, float f2);
    }

    /* renamed from: r.d$d  reason: collision with other inner class name */
    public enum C0047d {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public void dispatchDraw(Canvas canvas) {
        s(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f3797v;
    }

    public ArrayList<e.a> getDefinedTransitions() {
        return null;
    }

    public b getDesignTool() {
        if (this.D == null) {
            this.D = new b(this);
        }
        return this.D;
    }

    public int getEndState() {
        return this.f3798w;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f3801z;
    }

    public e getScene() {
        return null;
    }

    public int getStartState() {
        return this.f3796u;
    }

    public float getTargetPosition() {
        return this.B;
    }

    public Bundle getTransitionState() {
        if (this.L == null) {
            this.L = new b();
        }
        b bVar = this.L;
        d dVar = d.this;
        bVar.f3806d = dVar.f3798w;
        bVar.f3805c = dVar.f3796u;
        bVar.f3804b = dVar.getVelocity();
        bVar.f3803a = d.this.getProgress();
        b bVar2 = this.L;
        Objects.requireNonNull(bVar2);
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", bVar2.f3803a);
        bundle.putFloat("motion.velocity", bVar2.f3804b);
        bundle.putInt("motion.StartState", bVar2.f3805c);
        bundle.putInt("motion.EndState", bVar2.f3806d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        return (long) (this.f3799x * 1000.0f);
    }

    public float getVelocity() {
        return this.f3795t;
    }

    public void h(int i2) {
        this.f848l = null;
    }

    public void i(View view, View view2, int i2, int i3) {
        getNanoTime();
    }

    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public void k(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (i2 != 0 || i3 != 0) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
    }

    public void l(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    public void m(View view, int i2) {
    }

    public void n(View view, int i2, int i3, int[] iArr, int i4) {
    }

    public boolean o(View view, View view2, int i2, int i3) {
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        b bVar = this.L;
        if (bVar == null) {
            return;
        }
        if (this.M) {
            post(new a());
        } else {
            bVar.a();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.K = true;
        try {
            super.onLayout(z2, i2, i3, i4, i5);
        } finally {
            this.K = false;
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return false;
    }

    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    public void onRtlPropertiesChanged(int i2) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof c) {
            c cVar = (c) view;
            if (this.H == null) {
                this.H = new CopyOnWriteArrayList<>();
            }
            this.H.add(cVar);
            if (cVar.f3791j) {
                if (this.F == null) {
                    this.F = new ArrayList<>();
                }
                this.F.add(cVar);
            }
            if (cVar.f3792k) {
                if (this.G == null) {
                    this.G = new ArrayList<>();
                }
                this.G.add(cVar);
            }
        }
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<c> arrayList = this.F;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<c> arrayList2 = this.G;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public void requestLayout() {
        int i2 = this.f3797v;
        super.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0106, code lost:
        if (r1 != r2) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0111, code lost:
        if (r1 != r2) goto L_0x0115;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(boolean r18) {
        /*
            r17 = this;
            r0 = r17
            r.d$d r1 = r.d.C0047d.FINISHED
            long r2 = r0.A
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0012
            long r2 = r17.getNanoTime()
            r0.A = r2
        L_0x0012:
            float r2 = r0.f3801z
            r3 = -1
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x0022
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0022
            r0.f3797v = r3
        L_0x0022:
            boolean r6 = r0.E
            r7 = 1
            r8 = 0
            if (r6 != 0) goto L_0x002a
            goto L_0x00fc
        L_0x002a:
            float r6 = r0.B
            float r6 = r6 - r2
            float r2 = java.lang.Math.signum(r6)
            long r9 = r17.getNanoTime()
            long r11 = r0.A
            long r11 = r9 - r11
            float r6 = (float) r11
            float r6 = r6 * r2
            r11 = 814313567(0x3089705f, float:1.0E-9)
            float r6 = r6 * r11
            float r11 = r0.f3799x
            float r6 = r6 / r11
            float r11 = r0.f3801z
            float r11 = r11 + r6
            int r12 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r12 <= 0) goto L_0x0051
            float r13 = r0.B
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x005b
        L_0x0051:
            int r13 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r13 > 0) goto L_0x005d
            float r13 = r0.B
            int r13 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r13 > 0) goto L_0x005d
        L_0x005b:
            float r11 = r0.B
        L_0x005d:
            r0.f3801z = r11
            r0.f3800y = r11
            r0.A = r9
            r0.f3795t = r6
            float r6 = java.lang.Math.abs(r6)
            r9 = 925353388(0x3727c5ac, float:1.0E-5)
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0075
            r.d$d r6 = r.d.C0047d.MOVING
            r0.setState(r6)
        L_0x0075:
            if (r12 <= 0) goto L_0x007d
            float r6 = r0.B
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x0087
        L_0x007d:
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 > 0) goto L_0x0089
            float r6 = r0.B
            int r6 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x0089
        L_0x0087:
            float r11 = r0.B
        L_0x0089:
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x0091
            int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0094
        L_0x0091:
            r0.setState(r1)
        L_0x0094:
            int r9 = r17.getChildCount()
            r0.E = r8
            r17.getNanoTime()
            r10 = 0
            if (r9 > 0) goto L_0x012b
            if (r12 <= 0) goto L_0x00a8
            float r9 = r0.B
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 >= 0) goto L_0x00b2
        L_0x00a8:
            int r9 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x00b4
            float r9 = r0.B
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x00b4
        L_0x00b2:
            r9 = 1
            goto L_0x00b5
        L_0x00b4:
            r9 = 0
        L_0x00b5:
            boolean r13 = r0.E
            if (r13 != 0) goto L_0x00be
            if (r9 == 0) goto L_0x00be
            r0.setState(r1)
        L_0x00be:
            boolean r13 = r0.E
            r9 = r9 ^ r7
            r9 = r9 | r13
            r0.E = r9
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 > 0) goto L_0x00d4
            int r13 = r0.f3796u
            if (r13 == r3) goto L_0x00d4
            int r3 = r0.f3797v
            if (r3 != r13) goto L_0x00d1
            goto L_0x00d4
        L_0x00d1:
            r0.f3797v = r13
            throw r10
        L_0x00d4:
            double r13 = (double) r11
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r3 < 0) goto L_0x00e5
            int r3 = r0.f3797v
            int r13 = r0.f3798w
            if (r3 != r13) goto L_0x00e2
            goto L_0x00e5
        L_0x00e2:
            r0.f3797v = r13
            throw r10
        L_0x00e5:
            if (r9 != 0) goto L_0x00f7
            if (r12 <= 0) goto L_0x00eb
            if (r6 == 0) goto L_0x00f3
        L_0x00eb:
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x00fa
            int r2 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x00fa
        L_0x00f3:
            r0.setState(r1)
            goto L_0x00fa
        L_0x00f7:
            r17.invalidate()
        L_0x00fa:
            boolean r1 = r0.E
        L_0x00fc:
            float r1 = r0.f3801z
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0109
            int r1 = r0.f3797v
            int r2 = r0.f3798w
            if (r1 == r2) goto L_0x0114
            goto L_0x0115
        L_0x0109:
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0118
            int r1 = r0.f3797v
            int r2 = r0.f3796u
            if (r1 == r2) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r7 = 0
        L_0x0115:
            r0.f3797v = r2
            r8 = r7
        L_0x0118:
            boolean r1 = r0.O
            r1 = r1 | r8
            r0.O = r1
            if (r8 == 0) goto L_0x0126
            boolean r1 = r0.K
            if (r1 != 0) goto L_0x0126
            r17.requestLayout()
        L_0x0126:
            float r1 = r0.f3801z
            r0.f3800y = r1
            return
        L_0x012b:
            r0.getChildAt(r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r.d.s(boolean):void");
    }

    public void setDebugMode(int i2) {
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z2) {
        this.M = z2;
    }

    public void setInteractionEnabled(boolean z2) {
    }

    public void setInterpolatedProgress(float f2) {
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList<c> arrayList = this.G;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.G.get(i2).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList<c> arrayList = this.F;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.F.get(i2).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        C0047d dVar = C0047d.FINISHED;
        C0047d dVar2 = C0047d.MOVING;
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        if (i2 < 0 || f2 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new b();
            }
            this.L.f3803a = f2;
            return;
        }
        if (i2 <= 0) {
            if (this.f3801z == 1.0f && this.f3797v == this.f3798w) {
                setState(dVar2);
            }
            this.f3797v = this.f3796u;
            if (this.f3801z != 0.0f) {
                return;
            }
        } else if (f2 >= 1.0f) {
            if (this.f3801z == 0.0f && this.f3797v == this.f3796u) {
                setState(dVar2);
            }
            this.f3797v = this.f3798w;
            if (this.f3801z != 1.0f) {
                return;
            }
        } else {
            this.f3797v = -1;
            setState(dVar2);
            return;
        }
        setState(dVar);
    }

    public void setScene(e eVar) {
        g();
        throw null;
    }

    public void setStartState(int i2) {
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new b();
            }
            b bVar = this.L;
            bVar.f3805c = i2;
            bVar.f3806d = i2;
            return;
        }
        this.f3797v = i2;
    }

    public void setState(C0047d dVar) {
        C0047d dVar2 = C0047d.FINISHED;
        if (dVar != dVar2 || this.f3797v != -1) {
            C0047d dVar3 = this.N;
            this.N = dVar;
            C0047d dVar4 = C0047d.MOVING;
            if (dVar3 == dVar4 && dVar == dVar4) {
                t();
            }
            int ordinal = dVar3.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (dVar == dVar4) {
                    t();
                }
                if (dVar != dVar2) {
                    return;
                }
            } else if (!(ordinal == 2 && dVar == dVar2)) {
                return;
            }
            u();
        }
    }

    public void setTransition(int i2) {
    }

    public void setTransition(e.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i2) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(c cVar) {
        this.C = cVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.L == null) {
            this.L = new b();
        }
        b bVar = this.L;
        Objects.requireNonNull(bVar);
        bVar.f3803a = bundle.getFloat("motion.progress");
        bVar.f3804b = bundle.getFloat("motion.velocity");
        bVar.f3805c = bundle.getInt("motion.StartState");
        bVar.f3806d = bundle.getInt("motion.EndState");
        if (super.isAttachedToWindow()) {
            this.L.a();
        }
    }

    public final void t() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        if ((this.C != null || ((copyOnWriteArrayList = this.H) != null && !copyOnWriteArrayList.isEmpty())) && this.J != this.f3800y) {
            if (this.I != -1) {
                c cVar = this.C;
                if (cVar != null) {
                    cVar.a(this, this.f3796u, this.f3798w);
                }
                CopyOnWriteArrayList<c> copyOnWriteArrayList2 = this.H;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<c> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().a(this, this.f3796u, this.f3798w);
                    }
                }
            }
            this.I = -1;
            float f2 = this.f3800y;
            this.J = f2;
            c cVar2 = this.C;
            if (cVar2 != null) {
                cVar2.b(this, this.f3796u, this.f3798w, f2);
            }
            CopyOnWriteArrayList<c> copyOnWriteArrayList3 = this.H;
            if (copyOnWriteArrayList3 != null) {
                Iterator<c> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().b(this, this.f3796u, this.f3798w, this.f3800y);
                }
            }
        }
    }

    public String toString() {
        Context context = getContext();
        return a.a(context, this.f3796u) + "->" + a.a(context, this.f3798w) + " (pos:" + this.f3801z + " Dpos/Dt:" + this.f3795t;
    }

    public void u() {
        CopyOnWriteArrayList<c> copyOnWriteArrayList;
        CopyOnWriteArrayList<c> copyOnWriteArrayList2;
        if ((this.C != null || ((copyOnWriteArrayList2 = this.H) != null && !copyOnWriteArrayList2.isEmpty())) && this.I == -1) {
            this.I = this.f3797v;
            throw null;
        } else if (this.C != null || ((copyOnWriteArrayList = this.H) != null && !copyOnWriteArrayList.isEmpty())) {
            throw null;
        }
    }

    public void v(float f2, float f3) {
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new b();
            }
            b bVar = this.L;
            bVar.f3803a = f2;
            bVar.f3804b = f3;
            return;
        }
        setProgress(f2);
        setState(C0047d.MOVING);
        this.f3795t = f3;
    }

    public void w(int i2, int i3) {
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new b();
            }
            b bVar = this.L;
            bVar.f3805c = i2;
            bVar.f3806d = i3;
        }
    }

    public void x(int i2) {
        if (!super.isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new b();
            }
            this.L.f3806d = i2;
            return;
        }
        int i3 = this.f3797v;
        if (i3 != i2 && this.f3796u != i2 && this.f3798w != i2) {
            this.f3798w = i2;
            if (i3 != -1) {
                w(i3, i2);
                this.f3801z = 0.0f;
                return;
            }
            this.B = 1.0f;
            this.f3800y = 0.0f;
            this.f3801z = 0.0f;
            this.A = getNanoTime();
            getNanoTime();
            throw null;
        }
    }
}
