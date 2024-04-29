package u1;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class m {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public float f3997a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public float f3998b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public float f3999c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public float f4000d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public float f4001e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public float f4002f;

    /* renamed from: g  reason: collision with root package name */
    public final List<e> f4003g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public final List<f> f4004h = new ArrayList();

    public static class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public final c f4005b;

        public a(c cVar) {
            this.f4005b = cVar;
        }

        public void a(Matrix matrix, t1.a aVar, int i2, Canvas canvas) {
            t1.a aVar2 = aVar;
            int i3 = i2;
            Canvas canvas2 = canvas;
            c cVar = this.f4005b;
            float f2 = cVar.f4014f;
            float f3 = cVar.f4015g;
            c cVar2 = this.f4005b;
            RectF rectF = new RectF(cVar2.f4010b, cVar2.f4011c, cVar2.f4012d, cVar2.f4013e);
            boolean z2 = f3 < 0.0f;
            Path path = aVar2.f3900g;
            if (z2) {
                int[] iArr = t1.a.f3892k;
                iArr[0] = 0;
                iArr[1] = aVar2.f3899f;
                iArr[2] = aVar2.f3898e;
                iArr[3] = aVar2.f3897d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f2, f3);
                path.close();
                float f4 = (float) (-i3);
                rectF.inset(f4, f4);
                int[] iArr2 = t1.a.f3892k;
                iArr2[0] = 0;
                iArr2[1] = aVar2.f3897d;
                iArr2[2] = aVar2.f3898e;
                iArr2[3] = aVar2.f3899f;
            }
            float width = rectF.width() / 2.0f;
            if (width > 0.0f) {
                float f5 = 1.0f - (((float) i3) / width);
                float[] fArr = t1.a.f3893l;
                fArr[1] = f5;
                fArr[2] = ((1.0f - f5) / 2.0f) + f5;
                aVar2.f3895b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, t1.a.f3892k, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas2.concat(matrix);
                canvas2.scale(1.0f, rectF.height() / rectF.width());
                if (!z2) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, aVar2.f3901h);
                }
                canvas.drawArc(rectF, f2, f3, true, aVar2.f3895b);
                canvas.restore();
            }
        }
    }

    public static class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public final d f4006b;

        /* renamed from: c  reason: collision with root package name */
        public final float f4007c;

        /* renamed from: d  reason: collision with root package name */
        public final float f4008d;

        public b(d dVar, float f2, float f3) {
            this.f4006b = dVar;
            this.f4007c = f2;
            this.f4008d = f3;
        }

        public void a(Matrix matrix, t1.a aVar, int i2, Canvas canvas) {
            d dVar = this.f4006b;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (dVar.f4017c - this.f4008d), (double) (dVar.f4016b - this.f4007c)), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f4007c, this.f4008d);
            matrix2.preRotate(b());
            Objects.requireNonNull(aVar);
            rectF.bottom += (float) i2;
            rectF.offset(0.0f, (float) (-i2));
            int[] iArr = t1.a.f3890i;
            iArr[0] = aVar.f3899f;
            iArr[1] = aVar.f3898e;
            iArr[2] = aVar.f3897d;
            Paint paint = aVar.f3896c;
            float f2 = rectF.left;
            paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, t1.a.f3891j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f3896c);
            canvas.restore();
        }

        public float b() {
            d dVar = this.f4006b;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f4017c - this.f4008d) / (dVar.f4016b - this.f4007c))));
        }
    }

    public static class c extends e {

        /* renamed from: h  reason: collision with root package name */
        public static final RectF f4009h = new RectF();
        @Deprecated

        /* renamed from: b  reason: collision with root package name */
        public float f4010b;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public float f4011c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public float f4012d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public float f4013e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public float f4014f;
        @Deprecated

        /* renamed from: g  reason: collision with root package name */
        public float f4015g;

        public c(float f2, float f3, float f4, float f5) {
            this.f4010b = f2;
            this.f4011c = f3;
            this.f4012d = f4;
            this.f4013e = f5;
        }

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4018a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f4009h;
            rectF.set(this.f4010b, this.f4011c, this.f4012d, this.f4013e);
            path.arcTo(rectF, this.f4014f, this.f4015g, false);
            path.transform(matrix);
        }
    }

    public static class d extends e {

        /* renamed from: b  reason: collision with root package name */
        public float f4016b;

        /* renamed from: c  reason: collision with root package name */
        public float f4017c;

        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f4018a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f4016b, this.f4017c);
            path.transform(matrix);
        }
    }

    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f4018a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        public static final Matrix f4019a = new Matrix();

        public abstract void a(Matrix matrix, t1.a aVar, int i2, Canvas canvas);
    }

    public m() {
        e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        c cVar = new c(f2, f3, f4, f5);
        cVar.f4014f = f6;
        cVar.f4015g = f7;
        this.f4003g.add(cVar);
        a aVar = new a(cVar);
        float f8 = f6 + f7;
        boolean z2 = f7 < 0.0f;
        if (z2) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        float f9 = z2 ? (180.0f + f8) % 360.0f : f8;
        b(f6);
        this.f4004h.add(aVar);
        this.f4001e = f9;
        double d2 = (double) f8;
        this.f3999c = (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))) + ((f2 + f4) * 0.5f);
        this.f4000d = (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))) + ((f3 + f5) * 0.5f);
    }

    public final void b(float f2) {
        float f3 = this.f4001e;
        if (f3 != f2) {
            float f4 = ((f2 - f3) + 360.0f) % 360.0f;
            if (f4 <= 180.0f) {
                float f5 = this.f3999c;
                float f6 = this.f4000d;
                c cVar = new c(f5, f6, f5, f6);
                cVar.f4014f = this.f4001e;
                cVar.f4015g = f4;
                this.f4004h.add(new a(cVar));
                this.f4001e = f2;
            }
        }
    }

    public void c(Matrix matrix, Path path) {
        int size = this.f4003g.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f4003g.get(i2).a(matrix, path);
        }
    }

    public void d(float f2, float f3) {
        d dVar = new d();
        dVar.f4016b = f2;
        dVar.f4017c = f3;
        this.f4003g.add(dVar);
        b bVar = new b(dVar, this.f3999c, this.f4000d);
        b(bVar.b() + 270.0f);
        this.f4004h.add(bVar);
        this.f4001e = bVar.b() + 270.0f;
        this.f3999c = f2;
        this.f4000d = f3;
    }

    public void e(float f2, float f3, float f4, float f5) {
        this.f3997a = f2;
        this.f3998b = f3;
        this.f3999c = f2;
        this.f4000d = f3;
        this.f4001e = f4;
        this.f4002f = (f4 + f5) % 360.0f;
        this.f4003g.clear();
        this.f4004h.clear();
    }
}
