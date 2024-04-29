package y;

public final class j {

    /* renamed from: k  reason: collision with root package name */
    public static final j f4353k;

    /* renamed from: a  reason: collision with root package name */
    public final float f4354a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4355b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4356c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4357d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4358e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4359f;

    /* renamed from: g  reason: collision with root package name */
    public final float[] f4360g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4361h;

    /* renamed from: i  reason: collision with root package name */
    public final float f4362i;

    /* renamed from: j  reason: collision with root package name */
    public final float f4363j;

    static {
        float[] fArr = b.f4320c;
        float c2 = (float) ((((double) b.c(50.0f)) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f4318a;
        float f2 = (fArr[2] * fArr2[0][2]) + (fArr[1] * fArr2[0][1]) + (fArr[0] * fArr2[0][0]);
        float f3 = (fArr[2] * fArr2[1][2]) + (fArr[1] * fArr2[1][1]) + (fArr[0] * fArr2[1][0]);
        float f4 = (fArr[2] * fArr2[2][2]) + (fArr[1] * fArr2[2][1]) + (fArr[0] * fArr2[2][0]);
        float f5 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp((double) (((-c2) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d2 = (double) exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr3 = {(((100.0f / f2) * exp) + 1.0f) - exp, (((100.0f / f3) * exp) + 1.0f) - exp, (((100.0f / f4) * exp) + 1.0f) - exp};
        float f6 = 1.0f / ((5.0f * c2) + 1.0f);
        float f7 = f6 * f6 * f6 * f6;
        float f8 = 1.0f - f7;
        float cbrt = (0.1f * f8 * f8 * ((float) Math.cbrt(((double) c2) * 5.0d))) + (f7 * c2);
        float c3 = b.c(50.0f) / fArr[1];
        double d3 = (double) c3;
        float pow = 0.725f / ((float) Math.pow(d3, 0.2d));
        float f9 = cbrt;
        float[] fArr4 = {(float) Math.pow(((double) ((fArr3[0] * cbrt) * f2)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[1] * cbrt) * f3)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr3[2] * cbrt) * f4)) / 100.0d, 0.42d)};
        float[] fArr5 = {(fArr4[0] * 400.0f) / (fArr4[0] + 27.13f), (fArr4[1] * 400.0f) / (fArr4[1] + 27.13f), (fArr4[2] * 400.0f) / (fArr4[2] + 27.13f)};
        f4353k = new j(c3, ((fArr5[2] * 0.05f) + (fArr5[0] * 2.0f) + fArr5[1]) * pow, pow, pow, f5, 1.0f, fArr3, f9, (float) Math.pow((double) f9, 0.25d), ((float) Math.sqrt(d3)) + 1.48f);
    }

    public j(float f2, float f3, float f4, float f5, float f6, float f7, float[] fArr, float f8, float f9, float f10) {
        this.f4359f = f2;
        this.f4354a = f3;
        this.f4355b = f4;
        this.f4356c = f5;
        this.f4357d = f6;
        this.f4358e = f7;
        this.f4360g = fArr;
        this.f4361h = f8;
        this.f4362i = f9;
        this.f4363j = f10;
    }
}
