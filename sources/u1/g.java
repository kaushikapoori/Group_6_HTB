package u1;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;
import u1.k;
import u1.m;

public class g extends Drawable implements a0.b, n {

    /* renamed from: y  reason: collision with root package name */
    public static final String f3909y = g.class.getSimpleName();

    /* renamed from: z  reason: collision with root package name */
    public static final Paint f3910z;

    /* renamed from: b  reason: collision with root package name */
    public b f3911b;

    /* renamed from: c  reason: collision with root package name */
    public final m.f[] f3912c;

    /* renamed from: d  reason: collision with root package name */
    public final m.f[] f3913d;

    /* renamed from: e  reason: collision with root package name */
    public final BitSet f3914e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f3915f;

    /* renamed from: g  reason: collision with root package name */
    public final Matrix f3916g;

    /* renamed from: h  reason: collision with root package name */
    public final Path f3917h;

    /* renamed from: i  reason: collision with root package name */
    public final Path f3918i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f3919j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f3920k;

    /* renamed from: l  reason: collision with root package name */
    public final Region f3921l;

    /* renamed from: m  reason: collision with root package name */
    public final Region f3922m;

    /* renamed from: n  reason: collision with root package name */
    public j f3923n;

    /* renamed from: o  reason: collision with root package name */
    public final Paint f3924o;

    /* renamed from: p  reason: collision with root package name */
    public final Paint f3925p;

    /* renamed from: q  reason: collision with root package name */
    public final t1.a f3926q;

    /* renamed from: r  reason: collision with root package name */
    public final k.b f3927r;

    /* renamed from: s  reason: collision with root package name */
    public final k f3928s;

    /* renamed from: t  reason: collision with root package name */
    public PorterDuffColorFilter f3929t;

    /* renamed from: u  reason: collision with root package name */
    public PorterDuffColorFilter f3930u;

    /* renamed from: v  reason: collision with root package name */
    public int f3931v;

    /* renamed from: w  reason: collision with root package name */
    public final RectF f3932w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3933x;

    public class a implements k.b {
        public a() {
        }
    }

    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public j f3935a;

        /* renamed from: b  reason: collision with root package name */
        public l1.a f3936b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f3937c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f3938d = null;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f3939e = null;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f3940f = null;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f3941g = null;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f3942h = PorterDuff.Mode.SRC_IN;

        /* renamed from: i  reason: collision with root package name */
        public Rect f3943i = null;

        /* renamed from: j  reason: collision with root package name */
        public float f3944j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f3945k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f3946l;

        /* renamed from: m  reason: collision with root package name */
        public int f3947m = 255;

        /* renamed from: n  reason: collision with root package name */
        public float f3948n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public float f3949o = 0.0f;

        /* renamed from: p  reason: collision with root package name */
        public float f3950p = 0.0f;

        /* renamed from: q  reason: collision with root package name */
        public int f3951q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f3952r = 0;

        /* renamed from: s  reason: collision with root package name */
        public int f3953s = 0;

        /* renamed from: t  reason: collision with root package name */
        public int f3954t = 0;

        /* renamed from: u  reason: collision with root package name */
        public boolean f3955u = false;

        /* renamed from: v  reason: collision with root package name */
        public Paint.Style f3956v = Paint.Style.FILL_AND_STROKE;

        public b(b bVar) {
            this.f3935a = bVar.f3935a;
            this.f3936b = bVar.f3936b;
            this.f3946l = bVar.f3946l;
            this.f3937c = bVar.f3937c;
            this.f3938d = bVar.f3938d;
            this.f3939e = bVar.f3939e;
            this.f3942h = bVar.f3942h;
            this.f3941g = bVar.f3941g;
            this.f3947m = bVar.f3947m;
            this.f3944j = bVar.f3944j;
            this.f3953s = bVar.f3953s;
            this.f3951q = bVar.f3951q;
            this.f3955u = bVar.f3955u;
            this.f3945k = bVar.f3945k;
            this.f3948n = bVar.f3948n;
            this.f3949o = bVar.f3949o;
            this.f3950p = bVar.f3950p;
            this.f3952r = bVar.f3952r;
            this.f3954t = bVar.f3954t;
            this.f3940f = bVar.f3940f;
            this.f3956v = bVar.f3956v;
            if (bVar.f3943i != null) {
                this.f3943i = new Rect(bVar.f3943i);
            }
        }

        public b(j jVar, l1.a aVar) {
            this.f3935a = jVar;
            this.f3936b = null;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            g gVar = new g(this);
            gVar.f3915f = true;
            return gVar;
        }
    }

    static {
        Paint paint = new Paint(1);
        f3910z = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new j());
    }

    public g(b bVar) {
        k kVar;
        this.f3912c = new m.f[4];
        this.f3913d = new m.f[4];
        this.f3914e = new BitSet(8);
        this.f3916g = new Matrix();
        this.f3917h = new Path();
        this.f3918i = new Path();
        this.f3919j = new RectF();
        this.f3920k = new RectF();
        this.f3921l = new Region();
        this.f3922m = new Region();
        Paint paint = new Paint(1);
        this.f3924o = paint;
        Paint paint2 = new Paint(1);
        this.f3925p = paint2;
        this.f3926q = new t1.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            kVar = k.a.f3994a;
        } else {
            kVar = new k();
        }
        this.f3928s = kVar;
        this.f3932w = new RectF();
        this.f3933x = true;
        this.f3911b = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        w();
        v(getState());
        this.f3927r = new a();
    }

    public g(j jVar) {
        this(new b(jVar, (l1.a) null));
    }

    public final void b(RectF rectF, Path path) {
        c(rectF, path);
        if (this.f3911b.f3944j != 1.0f) {
            this.f3916g.reset();
            Matrix matrix = this.f3916g;
            float f2 = this.f3911b.f3944j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f3916g);
        }
        path.computeBounds(this.f3932w, true);
    }

    public final void c(RectF rectF, Path path) {
        k kVar = this.f3928s;
        b bVar = this.f3911b;
        j jVar = bVar.f3935a;
        float f2 = bVar.f3945k;
        kVar.a(jVar, f2, rectF, this.f3927r, path);
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList == null || mode == null) {
            if (z2) {
                int color = paint.getColor();
                int e2 = e(color);
                this.f3931v = e2;
                if (e2 != color) {
                    porterDuffColorFilter = new PorterDuffColorFilter(e2, PorterDuff.Mode.SRC_IN);
                    return porterDuffColorFilter;
                }
            }
            porterDuffColorFilter = null;
            return porterDuffColorFilter;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = e(colorForState);
        }
        this.f3931v = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f1, code lost:
        if ((!r2.f3935a.d(i()) && !r12.f3917h.isConvex() && android.os.Build.VERSION.SDK_INT < 29) != false) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r13) {
        /*
            r12 = this;
            android.graphics.Paint r0 = r12.f3924o
            android.graphics.PorterDuffColorFilter r1 = r12.f3929t
            r0.setColorFilter(r1)
            android.graphics.Paint r0 = r12.f3924o
            int r0 = r0.getAlpha()
            android.graphics.Paint r1 = r12.f3924o
            u1.g$b r2 = r12.f3911b
            int r2 = r2.f3947m
            int r3 = r2 >>> 7
            int r2 = r2 + r3
            int r2 = r2 * r0
            int r2 = r2 >>> 8
            r1.setAlpha(r2)
            android.graphics.Paint r1 = r12.f3925p
            android.graphics.PorterDuffColorFilter r2 = r12.f3930u
            r1.setColorFilter(r2)
            android.graphics.Paint r1 = r12.f3925p
            u1.g$b r2 = r12.f3911b
            float r2 = r2.f3946l
            r1.setStrokeWidth(r2)
            android.graphics.Paint r1 = r12.f3925p
            int r1 = r1.getAlpha()
            android.graphics.Paint r2 = r12.f3925p
            u1.g$b r3 = r12.f3911b
            int r3 = r3.f3947m
            int r4 = r3 >>> 7
            int r3 = r3 + r4
            int r3 = r3 * r1
            int r3 = r3 >>> 8
            r2.setAlpha(r3)
            boolean r2 = r12.f3915f
            r3 = 0
            if (r2 == 0) goto L_0x00c6
            float r2 = r12.l()
            float r2 = -r2
            u1.g$b r4 = r12.f3911b
            u1.j r4 = r4.f3935a
            java.util.Objects.requireNonNull(r4)
            u1.j$b r5 = new u1.j$b
            r5.<init>(r4)
            u1.c r6 = r4.f3962e
            boolean r7 = r6 instanceof u1.h
            if (r7 == 0) goto L_0x0060
            goto L_0x0066
        L_0x0060:
            u1.b r7 = new u1.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0066:
            r5.f3974e = r6
            u1.c r6 = r4.f3963f
            boolean r7 = r6 instanceof u1.h
            if (r7 == 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            u1.b r7 = new u1.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0075:
            r5.f3975f = r6
            u1.c r6 = r4.f3965h
            boolean r7 = r6 instanceof u1.h
            if (r7 == 0) goto L_0x007e
            goto L_0x0084
        L_0x007e:
            u1.b r7 = new u1.b
            r7.<init>(r2, r6)
            r6 = r7
        L_0x0084:
            r5.f3977h = r6
            u1.c r4 = r4.f3964g
            boolean r6 = r4 instanceof u1.h
            if (r6 == 0) goto L_0x008d
            goto L_0x0093
        L_0x008d:
            u1.b r6 = new u1.b
            r6.<init>(r2, r4)
            r4 = r6
        L_0x0093:
            r5.f3976g = r4
            u1.j r7 = r5.a()
            r12.f3923n = r7
            u1.k r6 = r12.f3928s
            u1.g$b r2 = r12.f3911b
            float r8 = r2.f3945k
            android.graphics.RectF r2 = r12.f3920k
            android.graphics.RectF r4 = r12.i()
            r2.set(r4)
            float r2 = r12.l()
            android.graphics.RectF r4 = r12.f3920k
            r4.inset(r2, r2)
            android.graphics.RectF r9 = r12.f3920k
            android.graphics.Path r11 = r12.f3918i
            r10 = 0
            r6.a(r7, r8, r9, r10, r11)
            android.graphics.RectF r2 = r12.i()
            android.graphics.Path r4 = r12.f3917h
            r12.b(r2, r4)
            r12.f3915f = r3
        L_0x00c6:
            u1.g$b r2 = r12.f3911b
            int r4 = r2.f3951q
            r5 = 2
            r6 = 1
            if (r4 == r6) goto L_0x00f5
            int r7 = r2.f3952r
            if (r7 <= 0) goto L_0x00f5
            if (r4 == r5) goto L_0x00f3
            int r4 = android.os.Build.VERSION.SDK_INT
            u1.j r2 = r2.f3935a
            android.graphics.RectF r7 = r12.i()
            boolean r2 = r2.d(r7)
            if (r2 != 0) goto L_0x00f0
            android.graphics.Path r2 = r12.f3917h
            boolean r2 = r2.isConvex()
            if (r2 != 0) goto L_0x00f0
            r2 = 29
            if (r4 >= r2) goto L_0x00f0
            r2 = 1
            goto L_0x00f1
        L_0x00f0:
            r2 = 0
        L_0x00f1:
            if (r2 == 0) goto L_0x00f5
        L_0x00f3:
            r2 = 1
            goto L_0x00f6
        L_0x00f5:
            r2 = 0
        L_0x00f6:
            if (r2 != 0) goto L_0x00fa
            goto L_0x018d
        L_0x00fa:
            r13.save()
            int r2 = r12.j()
            int r4 = r12.k()
            float r2 = (float) r2
            float r4 = (float) r4
            r13.translate(r2, r4)
            boolean r2 = r12.f3933x
            if (r2 != 0) goto L_0x0112
            r12.f(r13)
            goto L_0x018a
        L_0x0112:
            android.graphics.RectF r2 = r12.f3932w
            float r2 = r2.width()
            android.graphics.Rect r4 = r12.getBounds()
            int r4 = r4.width()
            float r4 = (float) r4
            float r2 = r2 - r4
            int r2 = (int) r2
            android.graphics.RectF r4 = r12.f3932w
            float r4 = r4.height()
            android.graphics.Rect r7 = r12.getBounds()
            int r7 = r7.height()
            float r7 = (float) r7
            float r4 = r4 - r7
            int r4 = (int) r4
            if (r2 < 0) goto L_0x01bf
            if (r4 < 0) goto L_0x01bf
            android.graphics.RectF r7 = r12.f3932w
            float r7 = r7.width()
            int r7 = (int) r7
            u1.g$b r8 = r12.f3911b
            int r8 = r8.f3952r
            int r8 = r8 * 2
            int r8 = r8 + r7
            int r8 = r8 + r2
            android.graphics.RectF r7 = r12.f3932w
            float r7 = r7.height()
            int r7 = (int) r7
            u1.g$b r9 = r12.f3911b
            int r9 = r9.f3952r
            int r9 = r9 * 2
            int r9 = r9 + r7
            int r9 = r9 + r4
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r8, r9, r5)
            android.graphics.Canvas r7 = new android.graphics.Canvas
            r7.<init>(r5)
            android.graphics.Rect r8 = r12.getBounds()
            int r8 = r8.left
            u1.g$b r9 = r12.f3911b
            int r9 = r9.f3952r
            int r8 = r8 - r9
            int r8 = r8 - r2
            float r2 = (float) r8
            android.graphics.Rect r8 = r12.getBounds()
            int r8 = r8.top
            u1.g$b r9 = r12.f3911b
            int r9 = r9.f3952r
            int r8 = r8 - r9
            int r8 = r8 - r4
            float r4 = (float) r8
            float r8 = -r2
            float r9 = -r4
            r7.translate(r8, r9)
            r12.f(r7)
            r7 = 0
            r13.drawBitmap(r5, r2, r4, r7)
            r5.recycle()
        L_0x018a:
            r13.restore()
        L_0x018d:
            u1.g$b r2 = r12.f3911b
            android.graphics.Paint$Style r4 = r2.f3956v
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL_AND_STROKE
            if (r4 == r5) goto L_0x0199
            android.graphics.Paint$Style r5 = android.graphics.Paint.Style.FILL
            if (r4 != r5) goto L_0x019a
        L_0x0199:
            r3 = 1
        L_0x019a:
            if (r3 == 0) goto L_0x01ab
            android.graphics.Paint r6 = r12.f3924o
            android.graphics.Path r7 = r12.f3917h
            u1.j r8 = r2.f3935a
            android.graphics.RectF r9 = r12.i()
            r4 = r12
            r5 = r13
            r4.g(r5, r6, r7, r8, r9)
        L_0x01ab:
            boolean r2 = r12.n()
            if (r2 == 0) goto L_0x01b4
            r12.h(r13)
        L_0x01b4:
            android.graphics.Paint r13 = r12.f3924o
            r13.setAlpha(r0)
            android.graphics.Paint r13 = r12.f3925p
            r13.setAlpha(r1)
            return
        L_0x01bf:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid shadow bounds. Check that the treatments result in a valid path."
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.g.draw(android.graphics.Canvas):void");
    }

    public int e(int i2) {
        int i3;
        b bVar = this.f3911b;
        float f2 = bVar.f3949o + bVar.f3950p + bVar.f3948n;
        l1.a aVar = bVar.f3936b;
        if (aVar == null || !aVar.f3323a) {
            return i2;
        }
        if (!(z.a.e(i2, 255) == aVar.f3326d)) {
            return i2;
        }
        float f3 = aVar.f3327e;
        float min = (f3 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p((double) (f2 / f3))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i2);
        int h2 = c.b.h(z.a.e(i2, 255), aVar.f3324b, min);
        if (min > 0.0f && (i3 = aVar.f3325c) != 0) {
            h2 = z.a.b(z.a.e(i3, l1.a.f3322f), h2);
        }
        return z.a.e(h2, alpha);
    }

    public final void f(Canvas canvas) {
        if (this.f3914e.cardinality() > 0) {
            Log.w(f3909y, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f3911b.f3953s != 0) {
            canvas.drawPath(this.f3917h, this.f3926q.f3894a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            m.f fVar = this.f3912c[i2];
            t1.a aVar = this.f3926q;
            int i3 = this.f3911b.f3952r;
            Matrix matrix = m.f.f4019a;
            fVar.a(matrix, aVar, i3, canvas);
            this.f3913d[i2].a(matrix, this.f3926q, this.f3911b.f3952r, canvas);
        }
        if (this.f3933x) {
            int j2 = j();
            int k2 = k();
            canvas.translate((float) (-j2), (float) (-k2));
            canvas.drawPath(this.f3917h, f3910z);
            canvas.translate((float) j2, (float) k2);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, j jVar, RectF rectF) {
        if (jVar.d(rectF)) {
            float a2 = jVar.f3963f.a(rectF) * this.f3911b.f3945k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public int getAlpha() {
        return this.f3911b.f3947m;
    }

    public Drawable.ConstantState getConstantState() {
        return this.f3911b;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        b bVar = this.f3911b;
        if (bVar.f3951q != 2) {
            if (bVar.f3935a.d(i())) {
                outline.setRoundRect(getBounds(), m() * this.f3911b.f3945k);
                return;
            }
            b(i(), this.f3917h);
            if (this.f3917h.isConvex() || Build.VERSION.SDK_INT >= 29) {
                try {
                    outline.setConvexPath(this.f3917h);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f3911b.f3943i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public Region getTransparentRegion() {
        this.f3921l.set(getBounds());
        b(i(), this.f3917h);
        this.f3922m.setPath(this.f3917h, this.f3921l);
        this.f3921l.op(this.f3922m, Region.Op.DIFFERENCE);
        return this.f3921l;
    }

    public void h(Canvas canvas) {
        Paint paint = this.f3925p;
        Path path = this.f3918i;
        j jVar = this.f3923n;
        this.f3920k.set(i());
        float l2 = l();
        this.f3920k.inset(l2, l2);
        g(canvas, paint, path, jVar, this.f3920k);
    }

    public RectF i() {
        this.f3919j.set(getBounds());
        return this.f3919j;
    }

    public void invalidateSelf() {
        this.f3915f = true;
        super.invalidateSelf();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = r1.f3911b.f3939e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = r1.f3911b.f3938d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f3911b.f3941g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r1.f3911b.f3940f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0039
            u1.g$b r0 = r1.f3911b
            android.content.res.ColorStateList r0 = r0.f3941g
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x0012:
            u1.g$b r0 = r1.f3911b
            android.content.res.ColorStateList r0 = r0.f3940f
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x001e:
            u1.g$b r0 = r1.f3911b
            android.content.res.ColorStateList r0 = r0.f3939e
            if (r0 == 0) goto L_0x002a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x0039
        L_0x002a:
            u1.g$b r0 = r1.f3911b
            android.content.res.ColorStateList r0 = r0.f3938d
            if (r0 == 0) goto L_0x0037
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r0 = 0
            goto L_0x003a
        L_0x0039:
            r0 = 1
        L_0x003a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.g.isStateful():boolean");
    }

    public int j() {
        b bVar = this.f3911b;
        return (int) (Math.sin(Math.toRadians((double) bVar.f3954t)) * ((double) bVar.f3953s));
    }

    public int k() {
        b bVar = this.f3911b;
        return (int) (Math.cos(Math.toRadians((double) bVar.f3954t)) * ((double) bVar.f3953s));
    }

    public final float l() {
        if (n()) {
            return this.f3925p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public float m() {
        return this.f3911b.f3935a.f3962e.a(i());
    }

    public Drawable mutate() {
        this.f3911b = new b(this.f3911b);
        return this;
    }

    public final boolean n() {
        Paint.Style style = this.f3911b.f3956v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f3925p.getStrokeWidth() > 0.0f;
    }

    public void o(Context context) {
        this.f3911b.f3936b = new l1.a(context);
        x();
    }

    public void onBoundsChange(Rect rect) {
        this.f3915f = true;
        super.onBoundsChange(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean z2 = v(iArr) || w();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    public void p(float f2) {
        b bVar = this.f3911b;
        if (bVar.f3949o != f2) {
            bVar.f3949o = f2;
            x();
        }
    }

    public void q(ColorStateList colorStateList) {
        b bVar = this.f3911b;
        if (bVar.f3938d != colorStateList) {
            bVar.f3938d = colorStateList;
            onStateChange(getState());
        }
    }

    public void r(float f2) {
        b bVar = this.f3911b;
        if (bVar.f3945k != f2) {
            bVar.f3945k = f2;
            this.f3915f = true;
            invalidateSelf();
        }
    }

    public void s(float f2, int i2) {
        this.f3911b.f3946l = f2;
        invalidateSelf();
        u(ColorStateList.valueOf(i2));
    }

    public void setAlpha(int i2) {
        b bVar = this.f3911b;
        if (bVar.f3947m != i2) {
            bVar.f3947m = i2;
            super.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3911b.f3937c = colorFilter;
        super.invalidateSelf();
    }

    public void setShapeAppearanceModel(j jVar) {
        this.f3911b.f3935a = jVar;
        invalidateSelf();
    }

    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3911b.f3941g = colorStateList;
        w();
        super.invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f3911b;
        if (bVar.f3942h != mode) {
            bVar.f3942h = mode;
            w();
            super.invalidateSelf();
        }
    }

    public void t(float f2, ColorStateList colorStateList) {
        this.f3911b.f3946l = f2;
        invalidateSelf();
        u(colorStateList);
    }

    public void u(ColorStateList colorStateList) {
        b bVar = this.f3911b;
        if (bVar.f3939e != colorStateList) {
            bVar.f3939e = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean v(int[] iArr) {
        boolean z2;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f3911b.f3938d == null || (color2 = this.f3924o.getColor()) == (colorForState2 = this.f3911b.f3938d.getColorForState(iArr, color2))) {
            z2 = false;
        } else {
            this.f3924o.setColor(colorForState2);
            z2 = true;
        }
        if (this.f3911b.f3939e == null || (color = this.f3925p.getColor()) == (colorForState = this.f3911b.f3939e.getColorForState(iArr, color))) {
            return z2;
        }
        this.f3925p.setColor(colorForState);
        return true;
    }

    public final boolean w() {
        PorterDuffColorFilter porterDuffColorFilter = this.f3929t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f3930u;
        b bVar = this.f3911b;
        this.f3929t = d(bVar.f3941g, bVar.f3942h, this.f3924o, true);
        b bVar2 = this.f3911b;
        this.f3930u = d(bVar2.f3940f, bVar2.f3942h, this.f3925p, false);
        b bVar3 = this.f3911b;
        if (bVar3.f3955u) {
            this.f3926q.a(bVar3.f3941g.getColorForState(getState(), 0));
        }
        if (!Objects.equals(porterDuffColorFilter, this.f3929t) || !Objects.equals(porterDuffColorFilter2, this.f3930u)) {
            return true;
        }
        return false;
    }

    public final void x() {
        b bVar = this.f3911b;
        float f2 = bVar.f3949o + bVar.f3950p;
        bVar.f3952r = (int) Math.ceil((double) (0.75f * f2));
        this.f3911b.f3953s = (int) Math.ceil((double) (f2 * 0.25f));
        w();
        super.invalidateSelf();
    }
}
