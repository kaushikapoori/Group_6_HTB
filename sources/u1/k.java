package u1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;
import u1.g;
import u1.m;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public final m[] f3982a = new m[4];

    /* renamed from: b  reason: collision with root package name */
    public final Matrix[] f3983b = new Matrix[4];

    /* renamed from: c  reason: collision with root package name */
    public final Matrix[] f3984c = new Matrix[4];

    /* renamed from: d  reason: collision with root package name */
    public final PointF f3985d = new PointF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f3986e = new Path();

    /* renamed from: f  reason: collision with root package name */
    public final Path f3987f = new Path();

    /* renamed from: g  reason: collision with root package name */
    public final m f3988g = new m();

    /* renamed from: h  reason: collision with root package name */
    public final float[] f3989h = new float[2];

    /* renamed from: i  reason: collision with root package name */
    public final float[] f3990i = new float[2];

    /* renamed from: j  reason: collision with root package name */
    public final Path f3991j = new Path();

    /* renamed from: k  reason: collision with root package name */
    public final Path f3992k = new Path();

    /* renamed from: l  reason: collision with root package name */
    public boolean f3993l = true;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final k f3994a = new k();
    }

    public interface b {
    }

    public k() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.f3982a[i2] = new m();
            this.f3983b[i2] = new Matrix();
            this.f3984c[i2] = new Matrix();
        }
    }

    public void a(j jVar, float f2, RectF rectF, b bVar, Path path) {
        float f3;
        float f4;
        f fVar;
        Path path2;
        Matrix matrix;
        m mVar;
        c cVar;
        d dVar;
        float f5;
        float f6;
        j jVar2 = jVar;
        float f7 = f2;
        RectF rectF2 = rectF;
        Path path3 = path;
        path.rewind();
        this.f3986e.rewind();
        this.f3987f.rewind();
        this.f3987f.addRect(rectF2, Path.Direction.CW);
        int i2 = 0;
        while (i2 < 4) {
            if (i2 == 1) {
                cVar = jVar2.f3964g;
            } else if (i2 == 2) {
                cVar = jVar2.f3965h;
            } else if (i2 != 3) {
                cVar = jVar2.f3963f;
            } else {
                cVar = jVar2.f3962e;
            }
            if (i2 == 1) {
                dVar = jVar2.f3960c;
            } else if (i2 == 2) {
                dVar = jVar2.f3961d;
            } else if (i2 != 3) {
                dVar = jVar2.f3959b;
            } else {
                dVar = jVar2.f3958a;
            }
            m mVar2 = this.f3982a[i2];
            Objects.requireNonNull(dVar);
            dVar.a(mVar2, 90.0f, f7, cVar.a(rectF2));
            int i3 = i2 + 1;
            float f8 = (float) (i3 * 90);
            this.f3983b[i2].reset();
            PointF pointF = this.f3985d;
            if (i2 == 1) {
                f6 = rectF2.right;
            } else if (i2 != 2) {
                float f9 = i2 != 3 ? rectF2.right : rectF2.left;
                f5 = rectF2.top;
                pointF.set(f9, f5);
                Matrix matrix2 = this.f3983b[i2];
                PointF pointF2 = this.f3985d;
                matrix2.setTranslate(pointF2.x, pointF2.y);
                this.f3983b[i2].preRotate(f8);
                float[] fArr = this.f3989h;
                m[] mVarArr = this.f3982a;
                fArr[0] = mVarArr[i2].f3999c;
                fArr[1] = mVarArr[i2].f4000d;
                this.f3983b[i2].mapPoints(fArr);
                this.f3984c[i2].reset();
                Matrix matrix3 = this.f3984c[i2];
                float[] fArr2 = this.f3989h;
                matrix3.setTranslate(fArr2[0], fArr2[1]);
                this.f3984c[i2].preRotate(f8);
                i2 = i3;
            } else {
                f6 = rectF2.left;
            }
            f5 = rectF2.bottom;
            pointF.set(f9, f5);
            Matrix matrix22 = this.f3983b[i2];
            PointF pointF22 = this.f3985d;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.f3983b[i2].preRotate(f8);
            float[] fArr3 = this.f3989h;
            m[] mVarArr2 = this.f3982a;
            fArr3[0] = mVarArr2[i2].f3999c;
            fArr3[1] = mVarArr2[i2].f4000d;
            this.f3983b[i2].mapPoints(fArr3);
            this.f3984c[i2].reset();
            Matrix matrix32 = this.f3984c[i2];
            float[] fArr22 = this.f3989h;
            matrix32.setTranslate(fArr22[0], fArr22[1]);
            this.f3984c[i2].preRotate(f8);
            i2 = i3;
        }
        int i4 = 0;
        while (i4 < 4) {
            float[] fArr4 = this.f3989h;
            m[] mVarArr3 = this.f3982a;
            fArr4[0] = mVarArr3[i4].f3997a;
            fArr4[1] = mVarArr3[i4].f3998b;
            this.f3983b[i4].mapPoints(fArr4);
            float[] fArr5 = this.f3989h;
            if (i4 == 0) {
                path3.moveTo(fArr5[0], fArr5[1]);
            } else {
                path3.lineTo(fArr5[0], fArr5[1]);
            }
            this.f3982a[i4].c(this.f3983b[i4], path3);
            if (bVar != null) {
                m mVar3 = this.f3982a[i4];
                Matrix matrix4 = this.f3983b[i4];
                g.a aVar = (g.a) bVar;
                BitSet bitSet = g.this.f3914e;
                Objects.requireNonNull(mVar3);
                bitSet.set(i4, false);
                m.f[] fVarArr = g.this.f3912c;
                mVar3.b(mVar3.f4002f);
                fVarArr[i4] = new l(mVar3, new ArrayList(mVar3.f4004h), new Matrix(matrix4));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr6 = this.f3989h;
            m[] mVarArr4 = this.f3982a;
            fArr6[0] = mVarArr4[i4].f3999c;
            fArr6[1] = mVarArr4[i4].f4000d;
            this.f3983b[i4].mapPoints(fArr6);
            float[] fArr7 = this.f3990i;
            m[] mVarArr5 = this.f3982a;
            fArr7[0] = mVarArr5[i6].f3997a;
            fArr7[1] = mVarArr5[i6].f3998b;
            this.f3983b[i6].mapPoints(fArr7);
            float[] fArr8 = this.f3989h;
            float f10 = fArr8[0];
            float[] fArr9 = this.f3990i;
            float max = Math.max(((float) Math.hypot((double) (f10 - fArr9[0]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.f3989h;
            m[] mVarArr6 = this.f3982a;
            fArr10[0] = mVarArr6[i4].f3999c;
            fArr10[1] = mVarArr6[i4].f4000d;
            this.f3983b[i4].mapPoints(fArr10);
            if (i4 == 1 || i4 == 3) {
                f4 = rectF.centerX();
                f3 = this.f3989h[0];
            } else {
                f4 = rectF.centerY();
                f3 = this.f3989h[1];
            }
            float abs = Math.abs(f4 - f3);
            this.f3988g.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                fVar = jVar2.f3968k;
            } else if (i4 == 2) {
                fVar = jVar2.f3969l;
            } else if (i4 != 3) {
                fVar = jVar2.f3967j;
            } else {
                fVar = jVar2.f3966i;
            }
            fVar.a(max, abs, f7, this.f3988g);
            this.f3991j.reset();
            this.f3988g.c(this.f3984c[i4], this.f3991j);
            if (!this.f3993l || (!b(this.f3991j, i4) && !b(this.f3991j, i6))) {
                mVar = this.f3988g;
                matrix = this.f3984c[i4];
                path2 = path3;
            } else {
                Path path4 = this.f3991j;
                path4.op(path4, this.f3987f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f3989h;
                m mVar4 = this.f3988g;
                fArr11[0] = mVar4.f3997a;
                fArr11[1] = mVar4.f3998b;
                this.f3984c[i4].mapPoints(fArr11);
                Path path5 = this.f3986e;
                float[] fArr12 = this.f3989h;
                path5.moveTo(fArr12[0], fArr12[1]);
                mVar = this.f3988g;
                matrix = this.f3984c[i4];
                path2 = this.f3986e;
            }
            mVar.c(matrix, path2);
            if (bVar != null) {
                m mVar5 = this.f3988g;
                Matrix matrix5 = this.f3984c[i4];
                g.a aVar2 = (g.a) bVar;
                Objects.requireNonNull(mVar5);
                g.this.f3914e.set(i4 + 4, false);
                m.f[] fVarArr2 = g.this.f3913d;
                mVar5.b(mVar5.f4002f);
                fVarArr2[i4] = new l(mVar5, new ArrayList(mVar5.f4004h), new Matrix(matrix5));
            }
            i4 = i5;
        }
        path.close();
        this.f3986e.close();
        if (!this.f3986e.isEmpty()) {
            path3.op(this.f3986e, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i2) {
        this.f3992k.reset();
        this.f3982a[i2].c(this.f3983b[i2], this.f3992k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f3992k.computeBounds(rectF, true);
        path.op(this.f3992k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
