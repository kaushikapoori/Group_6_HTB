package n;

import h.f;
import java.util.Arrays;
import n.b;

public class a implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f3423a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f3424b;

    /* renamed from: c  reason: collision with root package name */
    public final c f3425c;

    /* renamed from: d  reason: collision with root package name */
    public int f3426d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f3427e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f3428f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public float[] f3429g = new float[8];

    /* renamed from: h  reason: collision with root package name */
    public int f3430h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f3431i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3432j = false;

    public a(b bVar, c cVar) {
        this.f3424b = bVar;
        this.f3425c = cVar;
    }

    public float a(int i2) {
        int i3 = this.f3430h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f3423a) {
            if (i4 == i2) {
                return this.f3429g[i3];
            }
            i3 = this.f3428f[i3];
            i4++;
        }
        return 0.0f;
    }

    public h b(int i2) {
        int i3 = this.f3430h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.f3423a) {
            if (i4 == i2) {
                return ((h[]) this.f3425c.f3441d)[this.f3427e[i3]];
            }
            i3 = this.f3428f[i3];
            i4++;
        }
        return null;
    }

    public final float c(h hVar) {
        int i2 = this.f3430h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3423a) {
            if (this.f3427e[i2] == hVar.f3471c) {
                return this.f3429g[i2];
            }
            i2 = this.f3428f[i2];
            i3++;
        }
        return 0.0f;
    }

    public final void clear() {
        int i2 = this.f3430h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3423a) {
            h hVar = ((h[]) this.f3425c.f3441d)[this.f3427e[i2]];
            if (hVar != null) {
                hVar.b(this.f3424b);
            }
            i2 = this.f3428f[i2];
            i3++;
        }
        this.f3430h = -1;
        this.f3431i = -1;
        this.f3432j = false;
        this.f3423a = 0;
    }

    public void d(h hVar, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.f3430h;
            if (i2 == -1) {
                this.f3430h = 0;
                this.f3429g[0] = f2;
                this.f3427e[0] = hVar.f3471c;
                this.f3428f[0] = -1;
                hVar.f3481m++;
                hVar.a(this.f3424b);
                this.f3423a++;
                if (!this.f3432j) {
                    int i3 = this.f3431i + 1;
                    this.f3431i = i3;
                    int[] iArr = this.f3427e;
                    if (i3 >= iArr.length) {
                        this.f3432j = true;
                        this.f3431i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.f3423a) {
                int[] iArr2 = this.f3427e;
                int i6 = iArr2[i2];
                int i7 = hVar.f3471c;
                if (i6 == i7) {
                    float[] fArr = this.f3429g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.f3430h) {
                            this.f3430h = this.f3428f[i2];
                        } else {
                            int[] iArr3 = this.f3428f;
                            iArr3[i5] = iArr3[i2];
                        }
                        if (z2) {
                            hVar.b(this.f3424b);
                        }
                        if (this.f3432j) {
                            this.f3431i = i2;
                        }
                        hVar.f3481m--;
                        this.f3423a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i5 = i2;
                }
                i2 = this.f3428f[i2];
                i4++;
            }
            int i8 = this.f3431i;
            int i9 = i8 + 1;
            if (this.f3432j) {
                int[] iArr4 = this.f3427e;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f3427e;
            if (i8 >= iArr5.length && this.f3423a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f3427e;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f3427e;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.f3426d * 2;
                this.f3426d = i11;
                this.f3432j = false;
                this.f3431i = i8 - 1;
                this.f3429g = Arrays.copyOf(this.f3429g, i11);
                this.f3427e = Arrays.copyOf(this.f3427e, this.f3426d);
                this.f3428f = Arrays.copyOf(this.f3428f, this.f3426d);
            }
            this.f3427e[i8] = hVar.f3471c;
            this.f3429g[i8] = f2;
            int[] iArr8 = this.f3428f;
            if (i5 != -1) {
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                iArr8[i8] = this.f3430h;
                this.f3430h = i8;
            }
            hVar.f3481m++;
            hVar.a(this.f3424b);
            this.f3423a++;
            if (!this.f3432j) {
                this.f3431i++;
            }
            int i12 = this.f3431i;
            int[] iArr9 = this.f3427e;
            if (i12 >= iArr9.length) {
                this.f3432j = true;
                this.f3431i = iArr9.length - 1;
            }
        }
    }

    public final void e(h hVar, float f2) {
        if (f2 == 0.0f) {
            g(hVar, true);
            return;
        }
        int i2 = this.f3430h;
        if (i2 == -1) {
            this.f3430h = 0;
            this.f3429g[0] = f2;
            this.f3427e[0] = hVar.f3471c;
            this.f3428f[0] = -1;
            hVar.f3481m++;
            hVar.a(this.f3424b);
            this.f3423a++;
            if (!this.f3432j) {
                int i3 = this.f3431i + 1;
                this.f3431i = i3;
                int[] iArr = this.f3427e;
                if (i3 >= iArr.length) {
                    this.f3432j = true;
                    this.f3431i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.f3423a) {
            int[] iArr2 = this.f3427e;
            int i6 = iArr2[i2];
            int i7 = hVar.f3471c;
            if (i6 == i7) {
                this.f3429g[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i5 = i2;
            }
            i2 = this.f3428f[i2];
            i4++;
        }
        int i8 = this.f3431i;
        int i9 = i8 + 1;
        if (this.f3432j) {
            int[] iArr3 = this.f3427e;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f3427e;
        if (i8 >= iArr4.length && this.f3423a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f3427e;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f3427e;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.f3426d * 2;
            this.f3426d = i11;
            this.f3432j = false;
            this.f3431i = i8 - 1;
            this.f3429g = Arrays.copyOf(this.f3429g, i11);
            this.f3427e = Arrays.copyOf(this.f3427e, this.f3426d);
            this.f3428f = Arrays.copyOf(this.f3428f, this.f3426d);
        }
        this.f3427e[i8] = hVar.f3471c;
        this.f3429g[i8] = f2;
        int[] iArr7 = this.f3428f;
        if (i5 != -1) {
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            iArr7[i8] = this.f3430h;
            this.f3430h = i8;
        }
        hVar.f3481m++;
        hVar.a(this.f3424b);
        int i12 = this.f3423a + 1;
        this.f3423a = i12;
        if (!this.f3432j) {
            this.f3431i++;
        }
        int[] iArr8 = this.f3427e;
        if (i12 >= iArr8.length) {
            this.f3432j = true;
        }
        if (this.f3431i >= iArr8.length) {
            this.f3432j = true;
            this.f3431i = iArr8.length - 1;
        }
    }

    public void f(float f2) {
        int i2 = this.f3430h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3423a) {
            float[] fArr = this.f3429g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f3428f[i2];
            i3++;
        }
    }

    public final float g(h hVar, boolean z2) {
        int i2 = this.f3430h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.f3423a) {
            if (this.f3427e[i2] == hVar.f3471c) {
                if (i2 == this.f3430h) {
                    this.f3430h = this.f3428f[i2];
                } else {
                    int[] iArr = this.f3428f;
                    iArr[i4] = iArr[i2];
                }
                if (z2) {
                    hVar.b(this.f3424b);
                }
                hVar.f3481m--;
                this.f3423a--;
                this.f3427e[i2] = -1;
                if (this.f3432j) {
                    this.f3431i = i2;
                }
                return this.f3429g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f3428f[i2];
        }
        return 0.0f;
    }

    public float h(b bVar, boolean z2) {
        float c2 = c(bVar.f3433a);
        g(bVar.f3433a, z2);
        b.a aVar = bVar.f3436d;
        int k2 = aVar.k();
        for (int i2 = 0; i2 < k2; i2++) {
            h b2 = aVar.b(i2);
            d(b2, aVar.c(b2) * c2, z2);
        }
        return c2;
    }

    public boolean i(h hVar) {
        int i2 = this.f3430h;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3423a) {
            if (this.f3427e[i2] == hVar.f3471c) {
                return true;
            }
            i2 = this.f3428f[i2];
            i3++;
        }
        return false;
    }

    public void j() {
        int i2 = this.f3430h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3423a) {
            float[] fArr = this.f3429g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f3428f[i2];
            i3++;
        }
    }

    public int k() {
        return this.f3423a;
    }

    public String toString() {
        int i2 = this.f3430h;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.f3423a) {
            StringBuilder a2 = androidx.activity.result.a.a(f.a(str, " -> "));
            a2.append(this.f3429g[i2]);
            a2.append(" : ");
            StringBuilder a3 = androidx.activity.result.a.a(a2.toString());
            a3.append(((h[]) this.f3425c.f3441d)[this.f3427e[i2]]);
            str = a3.toString();
            i2 = this.f3428f[i2];
            i3++;
        }
        return str;
    }
}
