package w0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import z.e;

public class f extends e {

    /* renamed from: k  reason: collision with root package name */
    public static final PorterDuff.Mode f4177k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public h f4178c;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuffColorFilter f4179d;

    /* renamed from: e  reason: collision with root package name */
    public ColorFilter f4180e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4181f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f4182g;

    /* renamed from: h  reason: collision with root package name */
    public final float[] f4183h;

    /* renamed from: i  reason: collision with root package name */
    public final Matrix f4184i;

    /* renamed from: j  reason: collision with root package name */
    public final Rect f4185j;

    public static class b extends C0058f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    public static class c extends C0058f {

        /* renamed from: e  reason: collision with root package name */
        public int[] f4186e;

        /* renamed from: f  reason: collision with root package name */
        public y.d f4187f;

        /* renamed from: g  reason: collision with root package name */
        public float f4188g = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        public y.d f4189h;

        /* renamed from: i  reason: collision with root package name */
        public float f4190i = 1.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f4191j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f4192k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f4193l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        public float f4194m = 0.0f;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Cap f4195n = Paint.Cap.BUTT;

        /* renamed from: o  reason: collision with root package name */
        public Paint.Join f4196o = Paint.Join.MITER;

        /* renamed from: p  reason: collision with root package name */
        public float f4197p = 4.0f;

        public c() {
        }

        public c(c cVar) {
            super(cVar);
            this.f4186e = cVar.f4186e;
            this.f4187f = cVar.f4187f;
            this.f4188g = cVar.f4188g;
            this.f4190i = cVar.f4190i;
            this.f4189h = cVar.f4189h;
            this.f4213c = cVar.f4213c;
            this.f4191j = cVar.f4191j;
            this.f4192k = cVar.f4192k;
            this.f4193l = cVar.f4193l;
            this.f4194m = cVar.f4194m;
            this.f4195n = cVar.f4195n;
            this.f4196o = cVar.f4196o;
            this.f4197p = cVar.f4197p;
        }

        public boolean a() {
            return this.f4189h.c() || this.f4187f.c();
        }

        public boolean b(int[] iArr) {
            return this.f4187f.d(iArr) | this.f4189h.d(iArr);
        }

        public float getFillAlpha() {
            return this.f4191j;
        }

        public int getFillColor() {
            return this.f4189h.f4325c;
        }

        public float getStrokeAlpha() {
            return this.f4190i;
        }

        public int getStrokeColor() {
            return this.f4187f.f4325c;
        }

        public float getStrokeWidth() {
            return this.f4188g;
        }

        public float getTrimPathEnd() {
            return this.f4193l;
        }

        public float getTrimPathOffset() {
            return this.f4194m;
        }

        public float getTrimPathStart() {
            return this.f4192k;
        }

        public void setFillAlpha(float f2) {
            this.f4191j = f2;
        }

        public void setFillColor(int i2) {
            this.f4189h.f4325c = i2;
        }

        public void setStrokeAlpha(float f2) {
            this.f4190i = f2;
        }

        public void setStrokeColor(int i2) {
            this.f4187f.f4325c = i2;
        }

        public void setStrokeWidth(float f2) {
            this.f4188g = f2;
        }

        public void setTrimPathEnd(float f2) {
            this.f4193l = f2;
        }

        public void setTrimPathOffset(float f2) {
            this.f4194m = f2;
        }

        public void setTrimPathStart(float f2) {
            this.f4192k = f2;
        }
    }

    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f4198a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<e> f4199b;

        /* renamed from: c  reason: collision with root package name */
        public float f4200c;

        /* renamed from: d  reason: collision with root package name */
        public float f4201d;

        /* renamed from: e  reason: collision with root package name */
        public float f4202e;

        /* renamed from: f  reason: collision with root package name */
        public float f4203f;

        /* renamed from: g  reason: collision with root package name */
        public float f4204g;

        /* renamed from: h  reason: collision with root package name */
        public float f4205h;

        /* renamed from: i  reason: collision with root package name */
        public float f4206i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f4207j;

        /* renamed from: k  reason: collision with root package name */
        public int f4208k;

        /* renamed from: l  reason: collision with root package name */
        public int[] f4209l;

        /* renamed from: m  reason: collision with root package name */
        public String f4210m;

        public d() {
            super((a) null);
            this.f4198a = new Matrix();
            this.f4199b = new ArrayList<>();
            this.f4200c = 0.0f;
            this.f4201d = 0.0f;
            this.f4202e = 0.0f;
            this.f4203f = 1.0f;
            this.f4204g = 1.0f;
            this.f4205h = 0.0f;
            this.f4206i = 0.0f;
            this.f4207j = new Matrix();
            this.f4210m = null;
        }

        public d(d dVar, m.a<String, Object> aVar) {
            super((a) null);
            C0058f fVar;
            this.f4198a = new Matrix();
            this.f4199b = new ArrayList<>();
            this.f4200c = 0.0f;
            this.f4201d = 0.0f;
            this.f4202e = 0.0f;
            this.f4203f = 1.0f;
            this.f4204g = 1.0f;
            this.f4205h = 0.0f;
            this.f4206i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4207j = matrix;
            this.f4210m = null;
            this.f4200c = dVar.f4200c;
            this.f4201d = dVar.f4201d;
            this.f4202e = dVar.f4202e;
            this.f4203f = dVar.f4203f;
            this.f4204g = dVar.f4204g;
            this.f4205h = dVar.f4205h;
            this.f4206i = dVar.f4206i;
            this.f4209l = dVar.f4209l;
            String str = dVar.f4210m;
            this.f4210m = str;
            this.f4208k = dVar.f4208k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f4207j);
            ArrayList<e> arrayList = dVar.f4199b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f4199b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4199b.add(fVar);
                    String str2 = fVar.f4212b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        public boolean a() {
            for (int i2 = 0; i2 < this.f4199b.size(); i2++) {
                if (this.f4199b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z2 = false;
            for (int i2 = 0; i2 < this.f4199b.size(); i2++) {
                z2 |= this.f4199b.get(i2).b(iArr);
            }
            return z2;
        }

        public final void c() {
            this.f4207j.reset();
            this.f4207j.postTranslate(-this.f4201d, -this.f4202e);
            this.f4207j.postScale(this.f4203f, this.f4204g);
            this.f4207j.postRotate(this.f4200c, 0.0f, 0.0f);
            this.f4207j.postTranslate(this.f4205h + this.f4201d, this.f4206i + this.f4202e);
        }

        public String getGroupName() {
            return this.f4210m;
        }

        public Matrix getLocalMatrix() {
            return this.f4207j;
        }

        public float getPivotX() {
            return this.f4201d;
        }

        public float getPivotY() {
            return this.f4202e;
        }

        public float getRotation() {
            return this.f4200c;
        }

        public float getScaleX() {
            return this.f4203f;
        }

        public float getScaleY() {
            return this.f4204g;
        }

        public float getTranslateX() {
            return this.f4205h;
        }

        public float getTranslateY() {
            return this.f4206i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f4201d) {
                this.f4201d = f2;
                c();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f4202e) {
                this.f4202e = f2;
                c();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f4200c) {
                this.f4200c = f2;
                c();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f4203f) {
                this.f4203f = f2;
                c();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f4204g) {
                this.f4204g = f2;
                c();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f4205h) {
                this.f4205h = f2;
                c();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f4206i) {
                this.f4206i = f2;
                c();
            }
        }
    }

    public static abstract class e {
        public e() {
        }

        public e(a aVar) {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* renamed from: w0.f$f  reason: collision with other inner class name */
    public static abstract class C0058f extends e {

        /* renamed from: a  reason: collision with root package name */
        public e.a[] f4211a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f4212b;

        /* renamed from: c  reason: collision with root package name */
        public int f4213c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f4214d;

        public C0058f() {
            super((a) null);
        }

        public C0058f(C0058f fVar) {
            super((a) null);
            this.f4212b = fVar.f4212b;
            this.f4214d = fVar.f4214d;
            this.f4211a = z.e.e(fVar.f4211a);
        }

        public e.a[] getPathData() {
            return this.f4211a;
        }

        public String getPathName() {
            return this.f4212b;
        }

        public void setPathData(e.a[] aVarArr) {
            if (!z.e.a(this.f4211a, aVarArr)) {
                this.f4211a = z.e.e(aVarArr);
                return;
            }
            e.a[] aVarArr2 = this.f4211a;
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                aVarArr2[i2].f4397a = aVarArr[i2].f4397a;
                for (int i3 = 0; i3 < aVarArr[i2].f4398b.length; i3++) {
                    aVarArr2[i2].f4398b[i3] = aVarArr[i2].f4398b[i3];
                }
            }
        }
    }

    public static class g {

        /* renamed from: q  reason: collision with root package name */
        public static final Matrix f4215q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f4216a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f4217b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f4218c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f4219d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f4220e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f4221f;

        /* renamed from: g  reason: collision with root package name */
        public int f4222g;

        /* renamed from: h  reason: collision with root package name */
        public final d f4223h;

        /* renamed from: i  reason: collision with root package name */
        public float f4224i;

        /* renamed from: j  reason: collision with root package name */
        public float f4225j;

        /* renamed from: k  reason: collision with root package name */
        public float f4226k;

        /* renamed from: l  reason: collision with root package name */
        public float f4227l;

        /* renamed from: m  reason: collision with root package name */
        public int f4228m;

        /* renamed from: n  reason: collision with root package name */
        public String f4229n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f4230o;

        /* renamed from: p  reason: collision with root package name */
        public final m.a<String, Object> f4231p;

        public g() {
            this.f4218c = new Matrix();
            this.f4224i = 0.0f;
            this.f4225j = 0.0f;
            this.f4226k = 0.0f;
            this.f4227l = 0.0f;
            this.f4228m = 255;
            this.f4229n = null;
            this.f4230o = null;
            this.f4231p = new m.a<>();
            this.f4223h = new d();
            this.f4216a = new Path();
            this.f4217b = new Path();
        }

        public g(g gVar) {
            this.f4218c = new Matrix();
            this.f4224i = 0.0f;
            this.f4225j = 0.0f;
            this.f4226k = 0.0f;
            this.f4227l = 0.0f;
            this.f4228m = 255;
            this.f4229n = null;
            this.f4230o = null;
            m.a<String, Object> aVar = new m.a<>();
            this.f4231p = aVar;
            this.f4223h = new d(gVar.f4223h, aVar);
            this.f4216a = new Path(gVar.f4216a);
            this.f4217b = new Path(gVar.f4217b);
            this.f4224i = gVar.f4224i;
            this.f4225j = gVar.f4225j;
            this.f4226k = gVar.f4226k;
            this.f4227l = gVar.f4227l;
            this.f4222g = gVar.f4222g;
            this.f4228m = gVar.f4228m;
            this.f4229n = gVar.f4229n;
            String str = gVar.f4229n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4230o = gVar.f4230o;
        }

        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r11v2 */
        public final void a(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            g gVar;
            g gVar2 = this;
            d dVar2 = dVar;
            Canvas canvas2 = canvas;
            ColorFilter colorFilter2 = colorFilter;
            dVar2.f4198a.set(matrix);
            dVar2.f4198a.preConcat(dVar2.f4207j);
            canvas.save();
            ? r11 = 0;
            int i4 = 0;
            while (i4 < dVar2.f4199b.size()) {
                e eVar = dVar2.f4199b.get(i4);
                if (eVar instanceof d) {
                    a((d) eVar, dVar2.f4198a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof C0058f) {
                    C0058f fVar = (C0058f) eVar;
                    float f2 = ((float) i2) / gVar2.f4226k;
                    float f3 = ((float) i3) / gVar2.f4227l;
                    float min = Math.min(f2, f3);
                    Matrix matrix2 = dVar2.f4198a;
                    gVar2.f4218c.set(matrix2);
                    gVar2.f4218c.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float f4 = min;
                    float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot((double) fArr[r11], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
                    float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                    if (abs == 0.0f) {
                        gVar = this;
                    } else {
                        gVar = this;
                        Path path = gVar.f4216a;
                        Objects.requireNonNull(fVar);
                        path.reset();
                        e.a[] aVarArr = fVar.f4211a;
                        if (aVarArr != null) {
                            e.a.b(aVarArr, path);
                        }
                        Path path2 = gVar.f4216a;
                        gVar.f4217b.reset();
                        if (fVar instanceof b) {
                            gVar.f4217b.setFillType(fVar.f4213c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            gVar.f4217b.addPath(path2, gVar.f4218c);
                            canvas2.clipPath(gVar.f4217b);
                        } else {
                            c cVar = (c) fVar;
                            float f6 = cVar.f4192k;
                            if (!(f6 == 0.0f && cVar.f4193l == 1.0f)) {
                                float f7 = cVar.f4194m;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (cVar.f4193l + f7) % 1.0f;
                                if (gVar.f4221f == null) {
                                    gVar.f4221f = new PathMeasure();
                                }
                                gVar.f4221f.setPath(gVar.f4216a, r11);
                                float length = gVar.f4221f.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path2.reset();
                                if (f10 > f11) {
                                    gVar.f4221f.getSegment(f10, length, path2, true);
                                    gVar.f4221f.getSegment(0.0f, f11, path2, true);
                                } else {
                                    gVar.f4221f.getSegment(f10, f11, path2, true);
                                }
                                path2.rLineTo(0.0f, 0.0f);
                            }
                            gVar.f4217b.addPath(path2, gVar.f4218c);
                            y.d dVar3 = cVar.f4189h;
                            if (dVar3.b() || dVar3.f4325c != 0) {
                                y.d dVar4 = cVar.f4189h;
                                if (gVar.f4220e == null) {
                                    Paint paint = new Paint(1);
                                    gVar.f4220e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = gVar.f4220e;
                                if (dVar4.b()) {
                                    Shader shader = dVar4.f4323a;
                                    shader.setLocalMatrix(gVar.f4218c);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(cVar.f4191j * 255.0f));
                                } else {
                                    paint2.setShader((Shader) null);
                                    paint2.setAlpha(255);
                                    int i5 = dVar4.f4325c;
                                    float f12 = cVar.f4191j;
                                    PorterDuff.Mode mode = f.f4177k;
                                    paint2.setColor((i5 & 16777215) | (((int) (((float) Color.alpha(i5)) * f12)) << 24));
                                }
                                paint2.setColorFilter(colorFilter2);
                                gVar.f4217b.setFillType(cVar.f4213c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas2.drawPath(gVar.f4217b, paint2);
                            }
                            y.d dVar5 = cVar.f4187f;
                            if (dVar5.b() || dVar5.f4325c != 0) {
                                y.d dVar6 = cVar.f4187f;
                                if (gVar.f4219d == null) {
                                    Paint paint3 = new Paint(1);
                                    gVar.f4219d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = gVar.f4219d;
                                Paint.Join join = cVar.f4196o;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = cVar.f4195n;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(cVar.f4197p);
                                if (dVar6.b()) {
                                    Shader shader2 = dVar6.f4323a;
                                    shader2.setLocalMatrix(gVar.f4218c);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(cVar.f4190i * 255.0f));
                                } else {
                                    paint4.setShader((Shader) null);
                                    paint4.setAlpha(255);
                                    int i6 = dVar6.f4325c;
                                    float f13 = cVar.f4190i;
                                    PorterDuff.Mode mode2 = f.f4177k;
                                    paint4.setColor((i6 & 16777215) | (((int) (((float) Color.alpha(i6)) * f13)) << 24));
                                }
                                paint4.setColorFilter(colorFilter2);
                                paint4.setStrokeWidth(cVar.f4188g * abs * f4);
                                canvas2.drawPath(gVar.f4217b, paint4);
                            }
                        }
                    }
                    i4++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                int i7 = i2;
                int i8 = i3;
                gVar = gVar2;
                i4++;
                gVar2 = gVar;
                r11 = 0;
            }
            g gVar3 = gVar2;
            canvas.restore();
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4228m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f4228m = i2;
        }
    }

    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f4232a;

        /* renamed from: b  reason: collision with root package name */
        public g f4233b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f4234c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f4235d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4236e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f4237f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f4238g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f4239h;

        /* renamed from: i  reason: collision with root package name */
        public int f4240i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f4241j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f4242k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f4243l;

        public h() {
            this.f4234c = null;
            this.f4235d = f.f4177k;
            this.f4233b = new g();
        }

        public h(h hVar) {
            this.f4234c = null;
            this.f4235d = f.f4177k;
            if (hVar != null) {
                this.f4232a = hVar.f4232a;
                g gVar = new g(hVar.f4233b);
                this.f4233b = gVar;
                if (hVar.f4233b.f4220e != null) {
                    gVar.f4220e = new Paint(hVar.f4233b.f4220e);
                }
                if (hVar.f4233b.f4219d != null) {
                    this.f4233b.f4219d = new Paint(hVar.f4233b.f4219d);
                }
                this.f4234c = hVar.f4234c;
                this.f4235d = hVar.f4235d;
                this.f4236e = hVar.f4236e;
            }
        }

        public boolean a() {
            g gVar = this.f4233b;
            if (gVar.f4230o == null) {
                gVar.f4230o = Boolean.valueOf(gVar.f4223h.a());
            }
            return gVar.f4230o.booleanValue();
        }

        public void b(int i2, int i3) {
            this.f4237f.eraseColor(0);
            Canvas canvas = new Canvas(this.f4237f);
            g gVar = this.f4233b;
            gVar.a(gVar.f4223h, g.f4215q, canvas, i2, i3, (ColorFilter) null);
        }

        public int getChangingConfigurations() {
            return this.f4232a;
        }

        public Drawable newDrawable() {
            return new f(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f4244a;

        public i(Drawable.ConstantState constantState) {
            this.f4244a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4244a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4244a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f4176b = (VectorDrawable) this.f4244a.newDrawable();
            return fVar;
        }

        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f4176b = (VectorDrawable) this.f4244a.newDrawable(resources);
            return fVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f4176b = (VectorDrawable) this.f4244a.newDrawable(resources, theme);
            return fVar;
        }
    }

    public f() {
        this.f4182g = true;
        this.f4183h = new float[9];
        this.f4184i = new Matrix();
        this.f4185j = new Rect();
        this.f4178c = new h();
    }

    public f(h hVar) {
        this.f4182g = true;
        this.f4183h = new float[9];
        this.f4184i = new Matrix();
        this.f4185j = new Rect();
        this.f4178c = hVar;
        this.f4179d = b(hVar.f4234c, hVar.f4235d);
    }

    public static f a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        f fVar = new f();
        fVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return fVar;
    }

    public PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4176b;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d3, code lost:
        if ((r1 == r7.getWidth() && r3 == r6.f4237f.getHeight()) == false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.f4176b
            if (r0 == 0) goto L_0x0008
            r0.draw(r11)
            return
        L_0x0008:
            android.graphics.Rect r0 = r10.f4185j
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.f4185j
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x016b
            android.graphics.Rect r0 = r10.f4185j
            int r0 = r0.height()
            if (r0 > 0) goto L_0x001f
            goto L_0x016b
        L_0x001f:
            android.graphics.ColorFilter r0 = r10.f4180e
            if (r0 != 0) goto L_0x0025
            android.graphics.PorterDuffColorFilter r0 = r10.f4179d
        L_0x0025:
            android.graphics.Matrix r1 = r10.f4184i
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.f4184i
            float[] r2 = r10.f4183h
            r1.getValues(r2)
            float[] r1 = r10.f4183h
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.f4183h
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.f4183h
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.f4183h
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0060
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0064
        L_0x0060:
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0064:
            android.graphics.Rect r4 = r10.f4185j
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.f4185j
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x016b
            if (r3 > 0) goto L_0x0088
            goto L_0x016b
        L_0x0088:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.f4185j
            int r9 = r6.left
            float r9 = (float) r9
            int r6 = r6.top
            float r6 = (float) r6
            r11.translate(r9, r6)
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00a5
            int r6 = a0.a.b(r10)
            if (r6 != r5) goto L_0x00a5
            r6 = 1
            goto L_0x00a6
        L_0x00a5:
            r6 = 0
        L_0x00a6:
            if (r6 == 0) goto L_0x00b7
            android.graphics.Rect r6 = r10.f4185j
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r8)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r7)
        L_0x00b7:
            android.graphics.Rect r6 = r10.f4185j
            r6.offsetTo(r2, r2)
            w0.f$h r6 = r10.f4178c
            android.graphics.Bitmap r7 = r6.f4237f
            if (r7 == 0) goto L_0x00d5
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00d2
            android.graphics.Bitmap r7 = r6.f4237f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00d2
            r7 = 1
            goto L_0x00d3
        L_0x00d2:
            r7 = 0
        L_0x00d3:
            if (r7 != 0) goto L_0x00df
        L_0x00d5:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f4237f = r7
            r6.f4242k = r5
        L_0x00df:
            boolean r6 = r10.f4182g
            if (r6 != 0) goto L_0x00e9
            w0.f$h r6 = r10.f4178c
            r6.b(r1, r3)
            goto L_0x012d
        L_0x00e9:
            w0.f$h r6 = r10.f4178c
            boolean r7 = r6.f4242k
            if (r7 != 0) goto L_0x010d
            android.content.res.ColorStateList r7 = r6.f4238g
            android.content.res.ColorStateList r8 = r6.f4234c
            if (r7 != r8) goto L_0x010d
            android.graphics.PorterDuff$Mode r7 = r6.f4239h
            android.graphics.PorterDuff$Mode r8 = r6.f4235d
            if (r7 != r8) goto L_0x010d
            boolean r7 = r6.f4241j
            boolean r8 = r6.f4236e
            if (r7 != r8) goto L_0x010d
            int r7 = r6.f4240i
            w0.f$g r6 = r6.f4233b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x010d
            r6 = 1
            goto L_0x010e
        L_0x010d:
            r6 = 0
        L_0x010e:
            if (r6 != 0) goto L_0x012d
            w0.f$h r6 = r10.f4178c
            r6.b(r1, r3)
            w0.f$h r1 = r10.f4178c
            android.content.res.ColorStateList r3 = r1.f4234c
            r1.f4238g = r3
            android.graphics.PorterDuff$Mode r3 = r1.f4235d
            r1.f4239h = r3
            w0.f$g r3 = r1.f4233b
            int r3 = r3.getRootAlpha()
            r1.f4240i = r3
            boolean r3 = r1.f4236e
            r1.f4241j = r3
            r1.f4242k = r2
        L_0x012d:
            w0.f$h r1 = r10.f4178c
            android.graphics.Rect r3 = r10.f4185j
            w0.f$g r6 = r1.f4233b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x013c
            r2 = 1
        L_0x013c:
            r6 = 0
            if (r2 != 0) goto L_0x0143
            if (r0 != 0) goto L_0x0143
            r0 = r6
            goto L_0x0163
        L_0x0143:
            android.graphics.Paint r2 = r1.f4243l
            if (r2 != 0) goto L_0x0151
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f4243l = r2
            r2.setFilterBitmap(r5)
        L_0x0151:
            android.graphics.Paint r2 = r1.f4243l
            w0.f$g r5 = r1.f4233b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.f4243l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.f4243l
        L_0x0163:
            android.graphics.Bitmap r1 = r1.f4237f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
        L_0x016b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.f.draw(android.graphics.Canvas):void");
    }

    public int getAlpha() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f4178c.f4233b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4178c.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f4180e;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4176b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f4176b.getConstantState());
        }
        this.f4178c.f4232a = getChangingConfigurations();
        return this.f4178c;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4178c.f4233b.f4225j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4178c.f4233b.f4224i;
    }

    public int getOpacity() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:200:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r28, org.xmlpull.v1.XmlPullParser r29, android.util.AttributeSet r30, android.content.res.Resources.Theme r31) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            r9 = r29
            r10 = r30
            r11 = r31
            android.graphics.drawable.Drawable r0 = r1.f4176b
            if (r0 == 0) goto L_0x0012
            r0.inflate(r2, r9, r10, r11)
            return
        L_0x0012:
            w0.f$h r12 = r1.f4178c
            w0.f$g r0 = new w0.f$g
            r0.<init>()
            r12.f4233b = r0
            int[] r0 = w0.a.f4151a
            android.content.res.TypedArray r3 = y.i.d(r2, r11, r10, r0)
            w0.f$h r4 = r1.f4178c
            w0.f$g r5 = r4.f4233b
            java.lang.String r0 = "tintMode"
            boolean r0 = y.i.c(r9, r0)
            r13 = 6
            r14 = -1
            if (r0 != 0) goto L_0x0031
            r0 = -1
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getInt(r13, r14)
        L_0x0035:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            r15 = 9
            r8 = 5
            r7 = 3
            if (r0 == r7) goto L_0x0051
            if (r0 == r8) goto L_0x0053
            if (r0 == r15) goto L_0x004e
            switch(r0) {
                case 14: goto L_0x004b;
                case 15: goto L_0x0048;
                case 16: goto L_0x0045;
                default: goto L_0x0044;
            }
        L_0x0044:
            goto L_0x0053
        L_0x0045:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.ADD
            goto L_0x0053
        L_0x0048:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SCREEN
            goto L_0x0053
        L_0x004b:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0053
        L_0x004e:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_ATOP
            goto L_0x0053
        L_0x0051:
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_OVER
        L_0x0053:
            r4.f4235d = r6
            java.lang.String r0 = "tint"
            boolean r0 = y.i.c(r9, r0)
            r13 = 0
            r15 = 1
            r14 = 2
            if (r0 == 0) goto L_0x00b6
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r3.getValue(r15, r0)
            int r6 = r0.type
            if (r6 == r14) goto L_0x0097
            r14 = 28
            if (r6 < r14) goto L_0x007b
            r14 = 31
            if (r6 > r14) goto L_0x007b
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            goto L_0x00b7
        L_0x007b:
            android.content.res.Resources r0 = r3.getResources()
            int r6 = r3.getResourceId(r15, r13)
            java.lang.ThreadLocal<android.util.TypedValue> r14 = y.c.f4322a
            android.content.res.XmlResourceParser r6 = r0.getXml(r6)     // Catch:{ Exception -> 0x008e }
            android.content.res.ColorStateList r0 = y.c.a(r0, r6, r11)     // Catch:{ Exception -> 0x008e }
            goto L_0x00b7
        L_0x008e:
            r0 = move-exception
            java.lang.String r6 = "CSLCompat"
            java.lang.String r14 = "Failed to inflate ColorStateList."
            android.util.Log.e(r6, r14, r0)
            goto L_0x00b6
        L_0x0097:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to resolve attribute at index "
            r3.append(r4)
            r3.append(r15)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            if (r0 == 0) goto L_0x00bb
            r4.f4234c = r0
        L_0x00bb:
            boolean r0 = r4.f4236e
            java.lang.String r6 = "autoMirrored"
            boolean r6 = y.i.c(r9, r6)
            if (r6 != 0) goto L_0x00c6
            goto L_0x00ca
        L_0x00c6:
            boolean r0 = r3.getBoolean(r8, r0)
        L_0x00ca:
            r4.f4236e = r0
            float r0 = r5.f4226k
            java.lang.String r4 = "viewportWidth"
            boolean r4 = y.i.c(r9, r4)
            r14 = 7
            if (r4 != 0) goto L_0x00d8
            goto L_0x00dc
        L_0x00d8:
            float r0 = r3.getFloat(r14, r0)
        L_0x00dc:
            r5.f4226k = r0
            float r0 = r5.f4227l
            java.lang.String r4 = "viewportHeight"
            boolean r4 = y.i.c(r9, r4)
            r6 = 8
            if (r4 != 0) goto L_0x00eb
            goto L_0x00ef
        L_0x00eb:
            float r0 = r3.getFloat(r6, r0)
        L_0x00ef:
            r5.f4227l = r0
            float r4 = r5.f4226k
            r19 = 0
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x04da
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x04be
            float r0 = r5.f4224i
            float r0 = r3.getDimension(r7, r0)
            r5.f4224i = r0
            float r0 = r5.f4225j
            r4 = 2
            float r0 = r3.getDimension(r4, r0)
            r5.f4225j = r0
            float r4 = r5.f4224i
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto L_0x04a2
            int r0 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r0 <= 0) goto L_0x0486
            float r0 = r5.getAlpha()
            java.lang.String r4 = "alpha"
            boolean r4 = y.i.c(r9, r4)
            r14 = 4
            if (r4 != 0) goto L_0x0126
            goto L_0x012a
        L_0x0126:
            float r0 = r3.getFloat(r14, r0)
        L_0x012a:
            r5.setAlpha(r0)
            java.lang.String r0 = r3.getString(r13)
            if (r0 == 0) goto L_0x013a
            r5.f4229n = r0
            m.a<java.lang.String, java.lang.Object> r4 = r5.f4231p
            r4.put(r0, r5)
        L_0x013a:
            r3.recycle()
            int r0 = r27.getChangingConfigurations()
            r12.f4232a = r0
            r12.f4242k = r15
            w0.f$h r0 = r1.f4178c
            w0.f$g r5 = r0.f4233b
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>()
            w0.f$d r3 = r5.f4223h
            r4.push(r3)
            int r3 = r29.getEventType()
            int r20 = r29.getDepth()
            int r14 = r20 + 1
            r20 = 1
        L_0x015f:
            if (r3 == r15) goto L_0x046d
            int r6 = r29.getDepth()
            if (r6 >= r14) goto L_0x0169
            if (r3 == r7) goto L_0x046d
        L_0x0169:
            java.lang.String r6 = "group"
            r7 = 2
            if (r3 != r7) goto L_0x043e
            java.lang.String r3 = r29.getName()
            java.lang.Object r7 = r4.peek()
            w0.f$d r7 = (w0.f.d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            java.lang.String r15 = "fillType"
            java.lang.String r13 = "pathData"
            if (r8 == 0) goto L_0x0314
            w0.f$c r8 = new w0.f$c
            r8.<init>()
            int[] r3 = w0.a.f4153c
            android.content.res.TypedArray r6 = y.i.d(r2, r11, r10, r3)
            r3 = 0
            r8.f4186e = r3
            boolean r13 = y.i.c(r9, r13)
            if (r13 != 0) goto L_0x01a9
            r24 = r4
            r25 = r5
            r1 = r6
            r13 = r8
            r18 = r14
            r17 = -1
            r21 = 8
            r22 = 9
            r14 = r7
            goto L_0x02e6
        L_0x01a9:
            r13 = 0
            java.lang.String r3 = r6.getString(r13)
            if (r3 == 0) goto L_0x01b2
            r8.f4212b = r3
        L_0x01b2:
            r3 = 2
            java.lang.String r13 = r6.getString(r3)
            if (r13 == 0) goto L_0x01bf
            z.e$a[] r3 = z.e.c(r13)
            r8.f4211a = r3
        L_0x01bf:
            r13 = 1
            r20 = 0
            java.lang.String r23 = "fillColor"
            r18 = 0
            r3 = r6
            r24 = r4
            r4 = r29
            r25 = r5
            r5 = r31
            r26 = r6
            r6 = r23
            r18 = r14
            r1 = 3
            r14 = r7
            r7 = r13
            r13 = r8
            r1 = 5
            r8 = r20
            y.d r3 = y.i.a(r3, r4, r5, r6, r7, r8)
            r13.f4189h = r3
            r3 = 12
            float r4 = r13.f4191j
            java.lang.String r5 = "fillAlpha"
            boolean r5 = y.i.c(r9, r5)
            r8 = r26
            if (r5 != 0) goto L_0x01f1
            goto L_0x01f5
        L_0x01f1:
            float r4 = r8.getFloat(r3, r4)
        L_0x01f5:
            r13.f4191j = r4
            java.lang.String r3 = "strokeLineCap"
            boolean r3 = y.i.c(r9, r3)
            if (r3 != 0) goto L_0x0203
            r3 = -1
            r7 = 8
            goto L_0x020b
        L_0x0203:
            r3 = -1
            r7 = 8
            int r4 = r8.getInt(r7, r3)
            r3 = r4
        L_0x020b:
            android.graphics.Paint$Cap r4 = r13.f4195n
            if (r3 == 0) goto L_0x021c
            r5 = 1
            if (r3 == r5) goto L_0x0219
            r5 = 2
            if (r3 == r5) goto L_0x0216
            goto L_0x021e
        L_0x0216:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE
            goto L_0x021e
        L_0x0219:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            goto L_0x021e
        L_0x021c:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
        L_0x021e:
            r13.f4195n = r4
            java.lang.String r3 = "strokeLineJoin"
            boolean r3 = y.i.c(r9, r3)
            if (r3 != 0) goto L_0x022d
            r3 = -1
            r5 = -1
            r6 = 9
            goto L_0x0234
        L_0x022d:
            r5 = -1
            r6 = 9
            int r3 = r8.getInt(r6, r5)
        L_0x0234:
            android.graphics.Paint$Join r4 = r13.f4196o
            if (r3 == 0) goto L_0x0245
            r5 = 1
            if (r3 == r5) goto L_0x0242
            r5 = 2
            if (r3 == r5) goto L_0x023f
            goto L_0x0247
        L_0x023f:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.BEVEL
            goto L_0x0247
        L_0x0242:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.ROUND
            goto L_0x0247
        L_0x0245:
            android.graphics.Paint$Join r4 = android.graphics.Paint.Join.MITER
        L_0x0247:
            r13.f4196o = r4
            r3 = 10
            float r4 = r13.f4197p
            java.lang.String r5 = "strokeMiterLimit"
            boolean r5 = y.i.c(r9, r5)
            if (r5 != 0) goto L_0x0256
            goto L_0x025a
        L_0x0256:
            float r4 = r8.getFloat(r3, r4)
        L_0x025a:
            r13.f4197p = r4
            r16 = 3
            r20 = 0
            java.lang.String r21 = "strokeColor"
            r3 = r8
            r4 = r29
            r17 = -1
            r5 = r31
            r22 = 9
            r6 = r21
            r21 = 8
            r7 = r16
            r1 = r8
            r8 = r20
            y.d r3 = y.i.a(r3, r4, r5, r6, r7, r8)
            r13.f4187f = r3
            r3 = 11
            float r4 = r13.f4190i
            java.lang.String r5 = "strokeAlpha"
            boolean r5 = y.i.c(r9, r5)
            if (r5 != 0) goto L_0x0287
            goto L_0x028b
        L_0x0287:
            float r4 = r1.getFloat(r3, r4)
        L_0x028b:
            r13.f4190i = r4
            float r3 = r13.f4188g
            java.lang.String r4 = "strokeWidth"
            boolean r4 = y.i.c(r9, r4)
            if (r4 != 0) goto L_0x0298
            goto L_0x029d
        L_0x0298:
            r4 = 4
            float r3 = r1.getFloat(r4, r3)
        L_0x029d:
            r13.f4188g = r3
            float r3 = r13.f4193l
            java.lang.String r4 = "trimPathEnd"
            boolean r4 = y.i.c(r9, r4)
            if (r4 != 0) goto L_0x02aa
            goto L_0x02af
        L_0x02aa:
            r4 = 6
            float r3 = r1.getFloat(r4, r3)
        L_0x02af:
            r13.f4193l = r3
            float r3 = r13.f4194m
            java.lang.String r4 = "trimPathOffset"
            boolean r4 = y.i.c(r9, r4)
            if (r4 != 0) goto L_0x02bc
            goto L_0x02c1
        L_0x02bc:
            r4 = 7
            float r3 = r1.getFloat(r4, r3)
        L_0x02c1:
            r13.f4194m = r3
            float r3 = r13.f4192k
            java.lang.String r4 = "trimPathStart"
            boolean r4 = y.i.c(r9, r4)
            if (r4 != 0) goto L_0x02ce
            goto L_0x02d3
        L_0x02ce:
            r4 = 5
            float r3 = r1.getFloat(r4, r3)
        L_0x02d3:
            r13.f4192k = r3
            r3 = 13
            int r4 = r13.f4213c
            boolean r5 = y.i.c(r9, r15)
            if (r5 != 0) goto L_0x02e0
            goto L_0x02e4
        L_0x02e0:
            int r4 = r1.getInt(r3, r4)
        L_0x02e4:
            r13.f4213c = r4
        L_0x02e6:
            r1.recycle()
            java.util.ArrayList<w0.f$e> r1 = r14.f4199b
            r1.add(r13)
            java.lang.String r1 = r13.getPathName()
            if (r1 == 0) goto L_0x0300
            r1 = r25
            m.a<java.lang.String, java.lang.Object> r3 = r1.f4231p
            java.lang.String r4 = r13.getPathName()
            r3.put(r4, r13)
            goto L_0x0302
        L_0x0300:
            r1 = r25
        L_0x0302:
            int r3 = r0.f4232a
            int r4 = r13.f4214d
            r3 = r3 | r4
            r0.f4232a = r3
            r4 = r24
            r6 = 0
            r7 = 5
            r8 = 1
            r13 = 2
            r15 = 4
            r20 = 0
            goto L_0x043b
        L_0x0314:
            r24 = r4
            r1 = r5
            r18 = r14
            r17 = -1
            r21 = 8
            r22 = 9
            r14 = r7
            java.lang.String r4 = "clip-path"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0380
            w0.f$b r3 = new w0.f$b
            r3.<init>()
            boolean r4 = y.i.c(r9, r13)
            if (r4 != 0) goto L_0x0334
            goto L_0x0363
        L_0x0334:
            int[] r4 = w0.a.f4154d
            android.content.res.TypedArray r4 = y.i.d(r2, r11, r10, r4)
            r5 = 0
            java.lang.String r6 = r4.getString(r5)
            if (r6 == 0) goto L_0x0343
            r3.f4212b = r6
        L_0x0343:
            r5 = 1
            java.lang.String r6 = r4.getString(r5)
            if (r6 == 0) goto L_0x0350
            z.e$a[] r5 = z.e.c(r6)
            r3.f4211a = r5
        L_0x0350:
            boolean r5 = y.i.c(r9, r15)
            if (r5 != 0) goto L_0x0358
            r13 = 0
            goto L_0x035e
        L_0x0358:
            r5 = 0
            r6 = 2
            int r13 = r4.getInt(r6, r5)
        L_0x035e:
            r3.f4213c = r13
            r4.recycle()
        L_0x0363:
            java.util.ArrayList<w0.f$e> r4 = r14.f4199b
            r4.add(r3)
            java.lang.String r4 = r3.getPathName()
            if (r4 == 0) goto L_0x0377
            m.a<java.lang.String, java.lang.Object> r4 = r1.f4231p
            java.lang.String r5 = r3.getPathName()
            r4.put(r5, r3)
        L_0x0377:
            int r4 = r0.f4232a
            int r3 = r3.f4214d
            r3 = r3 | r4
            r0.f4232a = r3
            goto L_0x0434
        L_0x0380:
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x0434
            w0.f$d r3 = new w0.f$d
            r3.<init>()
            int[] r4 = w0.a.f4152b
            android.content.res.TypedArray r4 = y.i.d(r2, r11, r10, r4)
            r5 = 0
            r3.f4209l = r5
            float r6 = r3.f4200c
            java.lang.String r7 = "rotation"
            boolean r7 = y.i.c(r9, r7)
            if (r7 != 0) goto L_0x03a0
            r7 = 5
            goto L_0x03a5
        L_0x03a0:
            r7 = 5
            float r6 = r4.getFloat(r7, r6)
        L_0x03a5:
            r3.f4200c = r6
            float r6 = r3.f4201d
            r8 = 1
            float r6 = r4.getFloat(r8, r6)
            r3.f4201d = r6
            float r6 = r3.f4202e
            r13 = 2
            float r6 = r4.getFloat(r13, r6)
            r3.f4202e = r6
            float r6 = r3.f4203f
            java.lang.String r15 = "scaleX"
            boolean r15 = y.i.c(r9, r15)
            if (r15 != 0) goto L_0x03c4
            goto L_0x03c9
        L_0x03c4:
            r15 = 3
            float r6 = r4.getFloat(r15, r6)
        L_0x03c9:
            r3.f4203f = r6
            float r6 = r3.f4204g
            java.lang.String r15 = "scaleY"
            boolean r15 = y.i.c(r9, r15)
            if (r15 != 0) goto L_0x03d7
            r15 = 4
            goto L_0x03dc
        L_0x03d7:
            r15 = 4
            float r6 = r4.getFloat(r15, r6)
        L_0x03dc:
            r3.f4204g = r6
            float r6 = r3.f4205h
            java.lang.String r5 = "translateX"
            boolean r5 = y.i.c(r9, r5)
            if (r5 != 0) goto L_0x03ea
            r5 = 6
            goto L_0x03ef
        L_0x03ea:
            r5 = 6
            float r6 = r4.getFloat(r5, r6)
        L_0x03ef:
            r3.f4205h = r6
            float r6 = r3.f4206i
            java.lang.String r5 = "translateY"
            boolean r5 = y.i.c(r9, r5)
            if (r5 != 0) goto L_0x03fd
            r5 = 7
            goto L_0x0402
        L_0x03fd:
            r5 = 7
            float r6 = r4.getFloat(r5, r6)
        L_0x0402:
            r3.f4206i = r6
            r6 = 0
            java.lang.String r5 = r4.getString(r6)
            if (r5 == 0) goto L_0x040d
            r3.f4210m = r5
        L_0x040d:
            r3.c()
            r4.recycle()
            java.util.ArrayList<w0.f$e> r4 = r14.f4199b
            r4.add(r3)
            r4 = r24
            r4.push(r3)
            java.lang.String r5 = r3.getGroupName()
            if (r5 == 0) goto L_0x042c
            m.a<java.lang.String, java.lang.Object> r5 = r1.f4231p
            java.lang.String r14 = r3.getGroupName()
            r5.put(r14, r3)
        L_0x042c:
            int r5 = r0.f4232a
            int r3 = r3.f4208k
            r3 = r3 | r5
            r0.f4232a = r3
            goto L_0x043b
        L_0x0434:
            r4 = r24
            r6 = 0
            r7 = 5
            r8 = 1
            r13 = 2
            r15 = 4
        L_0x043b:
            r5 = 3
            r14 = 0
            goto L_0x045c
        L_0x043e:
            r1 = r5
            r18 = r14
            r5 = 3
            r7 = 5
            r8 = 1
            r13 = 2
            r14 = 0
            r15 = 4
            r17 = -1
            r21 = 8
            r22 = 9
            if (r3 != r5) goto L_0x045c
            java.lang.String r3 = r29.getName()
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L_0x045c
            r4.pop()
        L_0x045c:
            int r3 = r29.next()
            r6 = 8
            r7 = 3
            r8 = 5
            r13 = 0
            r15 = 1
            r5 = r1
            r14 = r18
            r1 = r27
            goto L_0x015f
        L_0x046d:
            if (r20 != 0) goto L_0x047c
            android.content.res.ColorStateList r0 = r12.f4234c
            android.graphics.PorterDuff$Mode r1 = r12.f4235d
            r2 = r27
            android.graphics.PorterDuffColorFilter r0 = r2.b(r0, r1)
            r2.f4179d = r0
            return
        L_0x047c:
            r2 = r27
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "no path defined"
            r0.<init>(r1)
            throw r0
        L_0x0486:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires height > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04a2:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires width > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04be:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportHeight > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x04da:
            r2 = r1
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r3.getPositionDescription()
            r1.append(r3)
            java.lang.String r3 = "<vector> tag requires viewportWidth > 0"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.f.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public void invalidateSelf() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f4178c.f4236e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.f4178c.f4234c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.f4178c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.f4176b
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            w0.f$h r0 = r1.f4178c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x0028
            w0.f$h r0 = r1.f4178c
            android.content.res.ColorStateList r0 = r0.f4234c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.f.isStateful():boolean");
    }

    public Drawable mutate() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4181f && super.mutate() == this) {
            this.f4178c = new h(this.f4178c);
            this.f4181f = true;
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z2 = false;
        h hVar = this.f4178c;
        ColorStateList colorStateList = hVar.f4234c;
        if (!(colorStateList == null || (mode = hVar.f4235d) == null)) {
            this.f4179d = b(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        if (hVar.a()) {
            boolean b2 = hVar.f4233b.f4223h.b(iArr);
            hVar.f4242k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f4178c.f4233b.getRootAlpha() != i2) {
            this.f4178c.f4233b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4178c.f4236e = z2;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f4180e = colorFilter;
        invalidateSelf();
    }

    public void setTint(int i2) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            a0.a.d(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            a0.a.e(drawable, colorStateList);
            return;
        }
        h hVar = this.f4178c;
        if (hVar.f4234c != colorStateList) {
            hVar.f4234c = colorStateList;
            this.f4179d = b(colorStateList, hVar.f4235d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            a0.a.f(drawable, mode);
            return;
        }
        h hVar = this.f4178c;
        if (hVar.f4235d != mode) {
            hVar.f4235d = mode;
            this.f4179d = b(hVar.f4234c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
