package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g0.u;
import g0.x;
import java.util.List;
import java.util.WeakHashMap;

public class m extends RecyclerView.k implements RecyclerView.o {
    public static final int[] D = {16842919};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.p C;

    /* renamed from: a  reason: collision with root package name */
    public final int f1931a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1932b;

    /* renamed from: c  reason: collision with root package name */
    public final StateListDrawable f1933c;

    /* renamed from: d  reason: collision with root package name */
    public final Drawable f1934d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1935e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1936f;

    /* renamed from: g  reason: collision with root package name */
    public final StateListDrawable f1937g;

    /* renamed from: h  reason: collision with root package name */
    public final Drawable f1938h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1939i;

    /* renamed from: j  reason: collision with root package name */
    public final int f1940j;

    /* renamed from: k  reason: collision with root package name */
    public int f1941k;

    /* renamed from: l  reason: collision with root package name */
    public int f1942l;

    /* renamed from: m  reason: collision with root package name */
    public float f1943m;

    /* renamed from: n  reason: collision with root package name */
    public int f1944n;

    /* renamed from: o  reason: collision with root package name */
    public int f1945o;

    /* renamed from: p  reason: collision with root package name */
    public float f1946p;

    /* renamed from: q  reason: collision with root package name */
    public int f1947q = 0;

    /* renamed from: r  reason: collision with root package name */
    public int f1948r = 0;

    /* renamed from: s  reason: collision with root package name */
    public RecyclerView f1949s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f1950t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1951u = false;

    /* renamed from: v  reason: collision with root package name */
    public int f1952v = 0;

    /* renamed from: w  reason: collision with root package name */
    public int f1953w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final int[] f1954x = new int[2];

    /* renamed from: y  reason: collision with root package name */
    public final int[] f1955y = new int[2];

    /* renamed from: z  reason: collision with root package name */
    public final ValueAnimator f1956z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            m mVar = m.this;
            int i2 = mVar.A;
            if (i2 == 1) {
                mVar.f1956z.cancel();
            } else if (i2 != 2) {
                return;
            }
            mVar.A = 3;
            ValueAnimator valueAnimator = mVar.f1956z;
            valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
            mVar.f1956z.setDuration((long) 500);
            mVar.f1956z.start();
        }
    }

    public class b extends RecyclerView.p {
        public b() {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
            m mVar = m.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = mVar.f1949s.computeVerticalScrollRange();
            int i4 = mVar.f1948r;
            mVar.f1950t = computeVerticalScrollRange - i4 > 0 && i4 >= mVar.f1931a;
            int computeHorizontalScrollRange = mVar.f1949s.computeHorizontalScrollRange();
            int i5 = mVar.f1947q;
            boolean z2 = computeHorizontalScrollRange - i5 > 0 && i5 >= mVar.f1931a;
            mVar.f1951u = z2;
            boolean z3 = mVar.f1950t;
            if (z3 || z2) {
                if (z3) {
                    float f2 = (float) i4;
                    mVar.f1942l = (int) ((((f2 / 2.0f) + ((float) computeVerticalScrollOffset)) * f2) / ((float) computeVerticalScrollRange));
                    mVar.f1941k = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
                }
                if (mVar.f1951u) {
                    float f3 = (float) computeHorizontalScrollOffset;
                    float f4 = (float) i5;
                    mVar.f1945o = (int) ((((f4 / 2.0f) + f3) * f4) / ((float) computeHorizontalScrollRange));
                    mVar.f1944n = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
                }
                int i6 = mVar.f1952v;
                if (i6 == 0 || i6 == 1) {
                    mVar.j(1);
                }
            } else if (mVar.f1952v != 0) {
                mVar.j(0);
            }
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1959a = false;

        public c() {
        }

        public void onAnimationCancel(Animator animator) {
            this.f1959a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.f1959a) {
                this.f1959a = false;
            } else if (((Float) m.this.f1956z.getAnimatedValue()).floatValue() == 0.0f) {
                m mVar = m.this;
                mVar.A = 0;
                mVar.j(0);
            } else {
                m mVar2 = m.this;
                mVar2.A = 2;
                mVar2.f1949s.invalidate();
            }
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            m.this.f1933c.setAlpha(floatValue);
            m.this.f1934d.setAlpha(floatValue);
            m.this.f1949s.invalidate();
        }
    }

    public m(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i2, int i3, int i4) {
        boolean z2 = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f1956z = ofFloat;
        this.A = 0;
        this.B = new a();
        b bVar = new b();
        this.C = bVar;
        this.f1933c = stateListDrawable;
        this.f1934d = drawable;
        this.f1937g = stateListDrawable2;
        this.f1938h = drawable2;
        this.f1935e = Math.max(i2, stateListDrawable.getIntrinsicWidth());
        this.f1936f = Math.max(i2, drawable.getIntrinsicWidth());
        this.f1939i = Math.max(i2, stateListDrawable2.getIntrinsicWidth());
        this.f1940j = Math.max(i2, drawable2.getIntrinsicWidth());
        this.f1931a = i3;
        this.f1932b = i4;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.f1949s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                RecyclerView.l lVar = recyclerView2.f1674m;
                if (lVar != null) {
                    lVar.d("Cannot remove item decoration during a scroll  or layout");
                }
                recyclerView2.f1678o.remove(this);
                if (recyclerView2.f1678o.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2 ? true : z2);
                }
                recyclerView2.Q();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f1949s;
                recyclerView3.f1680p.remove(this);
                if (recyclerView3.f1682q == this) {
                    recyclerView3.f1682q = null;
                }
                List<RecyclerView.p> list = this.f1949s.f1663g0;
                if (list != null) {
                    list.remove(bVar);
                }
                f();
            }
            this.f1949s = recyclerView;
            recyclerView.g(this);
            this.f1949s.f1680p.add(this);
            this.f1949s.h(bVar);
        }
    }

    public void a(boolean z2) {
    }

    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i2 = this.f1952v;
        if (i2 == 1) {
            boolean h2 = h(motionEvent.getX(), motionEvent.getY());
            boolean g2 = g(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (h2 || g2)) {
                if (g2) {
                    this.f1953w = 1;
                    this.f1946p = (float) ((int) motionEvent.getX());
                } else if (h2) {
                    this.f1953w = 2;
                    this.f1943m = (float) ((int) motionEvent.getY());
                }
                j(2);
                return true;
            }
        } else if (i2 == 2) {
            return true;
        }
        return false;
    }

    public void c(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f1952v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean h2 = h(motionEvent.getX(), motionEvent.getY());
                boolean g2 = g(motionEvent.getX(), motionEvent.getY());
                if (h2 || g2) {
                    if (g2) {
                        this.f1953w = 1;
                        this.f1946p = (float) ((int) motionEvent.getX());
                    } else if (h2) {
                        this.f1953w = 2;
                        this.f1943m = (float) ((int) motionEvent.getY());
                    }
                    j(2);
                }
            } else if (motionEvent.getAction() == 1 && this.f1952v == 2) {
                this.f1943m = 0.0f;
                this.f1946p = 0.0f;
                j(1);
                this.f1953w = 0;
            } else if (motionEvent.getAction() == 2 && this.f1952v == 2) {
                k();
                if (this.f1953w == 1) {
                    float x2 = motionEvent.getX();
                    int[] iArr = this.f1955y;
                    int i2 = this.f1932b;
                    iArr[0] = i2;
                    iArr[1] = this.f1947q - i2;
                    float max = Math.max((float) iArr[0], Math.min((float) iArr[1], x2));
                    if (Math.abs(((float) this.f1945o) - max) >= 2.0f) {
                        int i3 = i(this.f1946p, max, iArr, this.f1949s.computeHorizontalScrollRange(), this.f1949s.computeHorizontalScrollOffset(), this.f1947q);
                        if (i3 != 0) {
                            this.f1949s.scrollBy(i3, 0);
                        }
                        this.f1946p = max;
                    }
                }
                if (this.f1953w == 2) {
                    float y2 = motionEvent.getY();
                    int[] iArr2 = this.f1954x;
                    int i4 = this.f1932b;
                    iArr2[0] = i4;
                    iArr2[1] = this.f1948r - i4;
                    float max2 = Math.max((float) iArr2[0], Math.min((float) iArr2[1], y2));
                    if (Math.abs(((float) this.f1942l) - max2) >= 2.0f) {
                        int i5 = i(this.f1943m, max2, iArr2, this.f1949s.computeVerticalScrollRange(), this.f1949s.computeVerticalScrollOffset(), this.f1948r);
                        if (i5 != 0) {
                            this.f1949s.scrollBy(0, i5);
                        }
                        this.f1943m = max2;
                    }
                }
            }
        }
    }

    public void e(Canvas canvas, RecyclerView recyclerView, RecyclerView.w wVar) {
        if (this.f1947q != this.f1949s.getWidth() || this.f1948r != this.f1949s.getHeight()) {
            this.f1947q = this.f1949s.getWidth();
            this.f1948r = this.f1949s.getHeight();
            j(0);
        } else if (this.A != 0) {
            if (this.f1950t) {
                int i2 = this.f1947q;
                int i3 = this.f1935e;
                int i4 = i2 - i3;
                int i5 = this.f1942l;
                int i6 = this.f1941k;
                int i7 = i5 - (i6 / 2);
                this.f1933c.setBounds(0, 0, i3, i6);
                this.f1934d.setBounds(0, 0, this.f1936f, this.f1948r);
                RecyclerView recyclerView2 = this.f1949s;
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                boolean z2 = true;
                if (u.e.d(recyclerView2) != 1) {
                    z2 = false;
                }
                if (z2) {
                    this.f1934d.draw(canvas);
                    canvas.translate((float) this.f1935e, (float) i7);
                    canvas.scale(-1.0f, 1.0f);
                    this.f1933c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i4 = this.f1935e;
                } else {
                    canvas.translate((float) i4, 0.0f);
                    this.f1934d.draw(canvas);
                    canvas.translate(0.0f, (float) i7);
                    this.f1933c.draw(canvas);
                }
                canvas.translate((float) (-i4), (float) (-i7));
            }
            if (this.f1951u) {
                int i8 = this.f1948r;
                int i9 = this.f1939i;
                int i10 = i8 - i9;
                int i11 = this.f1945o;
                int i12 = this.f1944n;
                int i13 = i11 - (i12 / 2);
                this.f1937g.setBounds(0, 0, i12, i9);
                this.f1938h.setBounds(0, 0, this.f1947q, this.f1940j);
                canvas.translate(0.0f, (float) i10);
                this.f1938h.draw(canvas);
                canvas.translate((float) i13, 0.0f);
                this.f1937g.draw(canvas);
                canvas.translate((float) (-i13), (float) (-i10));
            }
        }
    }

    public final void f() {
        this.f1949s.removeCallbacks(this.B);
    }

    public boolean g(float f2, float f3) {
        if (f3 >= ((float) (this.f1948r - this.f1939i))) {
            int i2 = this.f1945o;
            int i3 = this.f1944n;
            return f2 >= ((float) (i2 - (i3 / 2))) && f2 <= ((float) ((i3 / 2) + i2));
        }
    }

    public boolean h(float f2, float f3) {
        RecyclerView recyclerView = this.f1949s;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (u.e.d(recyclerView) == 1) {
            if (f2 > ((float) (this.f1935e / 2))) {
                return false;
            }
        } else if (f2 < ((float) (this.f1947q - this.f1935e))) {
            return false;
        }
        int i2 = this.f1942l;
        int i3 = this.f1941k / 2;
        if (f3 < ((float) (i2 - i3)) || f3 > ((float) (i3 + i2))) {
            return false;
        }
        return true;
    }

    public final int i(float f2, float f3, int[] iArr, int i2, int i3, int i4) {
        int i5 = iArr[1] - iArr[0];
        if (i5 == 0) {
            return 0;
        }
        int i6 = i2 - i4;
        int i7 = (int) (((f3 - f2) / ((float) i5)) * ((float) i6));
        int i8 = i3 + i7;
        if (i8 >= i6 || i8 < 0) {
            return 0;
        }
        return i7;
    }

    public void j(int i2) {
        int i3;
        if (i2 == 2 && this.f1952v != 2) {
            this.f1933c.setState(D);
            f();
        }
        if (i2 == 0) {
            this.f1949s.invalidate();
        } else {
            k();
        }
        if (this.f1952v != 2 || i2 == 2) {
            if (i2 == 1) {
                i3 = 1500;
            }
            this.f1952v = i2;
        }
        this.f1933c.setState(E);
        i3 = 1200;
        f();
        this.f1949s.postDelayed(this.B, (long) i3);
        this.f1952v = i2;
    }

    public void k() {
        int i2 = this.A;
        if (i2 != 0) {
            if (i2 == 3) {
                this.f1956z.cancel();
            } else {
                return;
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.f1956z;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f});
        this.f1956z.setDuration(500);
        this.f1956z.setStartDelay(0);
        this.f1956z.start();
    }
}
