package y;

import android.graphics.Color;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final float f4312a;

    /* renamed from: b  reason: collision with root package name */
    public final float f4313b;

    /* renamed from: c  reason: collision with root package name */
    public final float f4314c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4315d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4316e;

    /* renamed from: f  reason: collision with root package name */
    public final float f4317f;

    public a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.f4312a = f2;
        this.f4313b = f3;
        this.f4314c = f4;
        this.f4315d = f8;
        this.f4316e = f9;
        this.f4317f = f10;
    }

    public static a a(int i2) {
        j jVar = j.f4353k;
        float b2 = b.b(Color.red(i2));
        float b3 = b.b(Color.green(i2));
        float b4 = b.b(Color.blue(i2));
        float[][] fArr = b.f4321d;
        float[] fArr2 = {(fArr[0][2] * b4) + (fArr[0][1] * b3) + (fArr[0][0] * b2), (fArr[1][2] * b4) + (fArr[1][1] * b3) + (fArr[1][0] * b2), (b4 * fArr[2][2]) + (b3 * fArr[2][1]) + (b2 * fArr[2][0])};
        float[][] fArr3 = b.f4318a;
        float f2 = (fArr2[2] * fArr3[0][2]) + (fArr2[1] * fArr3[0][1]) + (fArr2[0] * fArr3[0][0]);
        float f3 = (fArr2[2] * fArr3[1][2]) + (fArr2[1] * fArr3[1][1]) + (fArr2[0] * fArr3[1][0]);
        float f4 = fArr2[0] * fArr3[2][0];
        float f5 = fArr2[2] * fArr3[2][2];
        float[] fArr4 = jVar.f4360g;
        float f6 = fArr4[0] * f2;
        float f7 = fArr4[1] * f3;
        float f8 = fArr4[2] * (f5 + (fArr2[1] * fArr3[2][1]) + f4);
        float pow = (float) Math.pow(((double) (Math.abs(f6) * jVar.f4361h)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f7) * jVar.f4361h)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f8) * jVar.f4361h)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f6) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f7) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f8) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = (double) signum3;
        float f9 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d2)) / 11.0f;
        float f10 = ((float) (((double) (signum + signum2)) - (d2 * 2.0d))) / 9.0f;
        float f11 = signum2 * 20.0f;
        float f12 = ((21.0f * signum3) + ((signum * 20.0f) + f11)) / 20.0f;
        float f13 = (((signum * 40.0f) + f11) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f10, (double) f9)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f14 = atan2;
        float f15 = (3.1415927f * f14) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f13 * jVar.f4355b) / jVar.f4354a), (double) (jVar.f4357d * jVar.f4363j))) * 100.0f;
        float sqrt = (jVar.f4354a + 4.0f) * (4.0f / jVar.f4357d) * ((float) Math.sqrt((double) (pow4 / 100.0f))) * jVar.f4362i;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) jVar.f4359f), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) f14) < 20.14d ? 360.0f + f14 : f14)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * jVar.f4358e) * jVar.f4356c) * ((float) Math.sqrt((double) ((f10 * f10) + (f9 * f9))))) / (f12 + 0.305f)), 0.9d));
        float sqrt2 = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float f16 = sqrt2 * jVar.f4362i;
        float sqrt3 = ((float) Math.sqrt((double) ((pow5 * jVar.f4357d) / (jVar.f4354a + 4.0f)))) * 50.0f;
        float f17 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * f16) + 1.0f))) * 43.85965f;
        double d3 = (double) f15;
        return new a(f14, sqrt2, pow4, sqrt, f16, sqrt3, f17, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public static a b(float f2, float f3, float f4) {
        float f5 = f2;
        j jVar = j.f4353k;
        double d2 = ((double) f5) / 100.0d;
        float sqrt = (jVar.f4354a + 4.0f) * (4.0f / jVar.f4357d) * ((float) Math.sqrt(d2));
        float f6 = jVar.f4362i;
        float f7 = sqrt * f6;
        float f8 = f3 * f6;
        float sqrt2 = ((float) Math.sqrt((double) (((f3 / ((float) Math.sqrt(d2))) * jVar.f4357d) / (jVar.f4354a + 4.0f)))) * 50.0f;
        float f9 = (1.7f * f5) / ((0.007f * f5) + 1.0f);
        float log = ((float) Math.log((((double) f8) * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (double) ((3.1415927f * f4) / 180.0f);
        return new a(f4, f3, f2, f7, f8, sqrt2, f9, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public int c(j jVar) {
        float f2;
        j jVar2 = jVar;
        float f3 = this.f4313b;
        if (((double) f3) != 0.0d) {
            double d2 = (double) this.f4314c;
            if (d2 != 0.0d) {
                f2 = f3 / ((float) Math.sqrt(d2 / 100.0d));
                float pow = (float) Math.pow(((double) f2) / Math.pow(1.64d - Math.pow(0.29d, (double) jVar2.f4359f), 0.73d), 1.1111111111111112d);
                double d3 = (double) ((this.f4312a * 3.1415927f) / 180.0f);
                float pow2 = jVar2.f4354a * ((float) Math.pow(((double) this.f4314c) / 100.0d, (1.0d / ((double) jVar2.f4357d)) / ((double) jVar2.f4363j)));
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f * 3846.1538f * jVar2.f4358e * jVar2.f4356c;
                float f4 = pow2 / jVar2.f4355b;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f5 = 11.0f * pow * cos2;
                float f6 = (((0.305f + f4) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f5 + (cos * 23.0f)));
                float f7 = cos2 * f6;
                float f8 = f6 * sin;
                float f9 = f4 * 460.0f;
                float f10 = ((288.0f * f8) + ((451.0f * f7) + f9)) / 1403.0f;
                float f11 = ((f9 - (891.0f * f7)) - (261.0f * f8)) / 1403.0f;
                float f12 = ((f9 - (f7 * 220.0f)) - (f8 * 6300.0f)) / 1403.0f;
                float signum = (100.0f / jVar2.f4361h) * Math.signum(f10) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f10)) * 27.13d) / (400.0d - ((double) Math.abs(f10))))), 2.380952380952381d));
                float signum2 = (100.0f / jVar2.f4361h) * Math.signum(f11) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11))))), 2.380952380952381d));
                float signum3 = Math.signum(f12);
                float[] fArr = jVar2.f4360g;
                float f13 = signum / fArr[0];
                float f14 = signum2 / fArr[1];
                float pow3 = (((100.0f / jVar2.f4361h) * signum3) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12))))), 2.380952380952381d))) / fArr[2];
                float[][] fArr2 = b.f4319b;
                float f15 = (fArr2[0][2] * pow3) + (fArr2[0][1] * f14) + (fArr2[0][0] * f13);
                float f16 = (fArr2[1][2] * pow3) + (fArr2[1][1] * f14) + (fArr2[1][0] * f13);
                float f17 = f13 * fArr2[2][0];
                return z.a.a((double) f15, (double) f16, (double) ((pow3 * fArr2[2][2]) + (f14 * fArr2[2][1]) + f17));
            }
        }
        f2 = 0.0f;
        float pow4 = (float) Math.pow(((double) f2) / Math.pow(1.64d - Math.pow(0.29d, (double) jVar2.f4359f), 0.73d), 1.1111111111111112d);
        double d32 = (double) ((this.f4312a * 3.1415927f) / 180.0f);
        float pow22 = jVar2.f4354a * ((float) Math.pow(((double) this.f4314c) / 100.0d, (1.0d / ((double) jVar2.f4357d)) / ((double) jVar2.f4363j)));
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f * 3846.1538f * jVar2.f4358e * jVar2.f4356c;
        float f42 = pow22 / jVar2.f4355b;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f52 = 11.0f * pow4 * cos22;
        float f62 = (((0.305f + f42) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (f52 + (cos3 * 23.0f)));
        float f72 = cos22 * f62;
        float f82 = f62 * sin2;
        float f92 = f42 * 460.0f;
        float f102 = ((288.0f * f82) + ((451.0f * f72) + f92)) / 1403.0f;
        float f112 = ((f92 - (891.0f * f72)) - (261.0f * f82)) / 1403.0f;
        float f122 = ((f92 - (f72 * 220.0f)) - (f82 * 6300.0f)) / 1403.0f;
        float signum4 = (100.0f / jVar2.f4361h) * Math.signum(f102) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f102)) * 27.13d) / (400.0d - ((double) Math.abs(f102))))), 2.380952380952381d));
        float signum22 = (100.0f / jVar2.f4361h) * Math.signum(f112) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f112)) * 27.13d) / (400.0d - ((double) Math.abs(f112))))), 2.380952380952381d));
        float signum32 = Math.signum(f122);
        float[] fArr3 = jVar2.f4360g;
        float f132 = signum4 / fArr3[0];
        float f142 = signum22 / fArr3[1];
        float pow32 = (((100.0f / jVar2.f4361h) * signum32) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f122)) * 27.13d) / (400.0d - ((double) Math.abs(f122))))), 2.380952380952381d))) / fArr3[2];
        float[][] fArr22 = b.f4319b;
        float f152 = (fArr22[0][2] * pow32) + (fArr22[0][1] * f142) + (fArr22[0][0] * f132);
        float f162 = (fArr22[1][2] * pow32) + (fArr22[1][1] * f142) + (fArr22[1][0] * f132);
        float f172 = f132 * fArr22[2][0];
        return z.a.a((double) f152, (double) f162, (double) ((pow32 * fArr22[2][2]) + (f142 * fArr22[2][1]) + f172));
    }
}
