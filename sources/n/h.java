package n;

import androidx.activity.result.a;
import java.util.Arrays;

public class h implements Comparable<h> {

    /* renamed from: n  reason: collision with root package name */
    public static int f3469n = 1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3470b;

    /* renamed from: c  reason: collision with root package name */
    public int f3471c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f3472d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f3473e = 0;

    /* renamed from: f  reason: collision with root package name */
    public float f3474f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f3475g = false;

    /* renamed from: h  reason: collision with root package name */
    public float[] f3476h = new float[9];

    /* renamed from: i  reason: collision with root package name */
    public float[] f3477i = new float[9];

    /* renamed from: j  reason: collision with root package name */
    public int f3478j;

    /* renamed from: k  reason: collision with root package name */
    public b[] f3479k = new b[16];

    /* renamed from: l  reason: collision with root package name */
    public int f3480l = 0;

    /* renamed from: m  reason: collision with root package name */
    public int f3481m = 0;

    public h(int i2) {
        this.f3478j = i2;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f3480l;
            if (i2 >= i3) {
                b[] bVarArr = this.f3479k;
                if (i3 >= bVarArr.length) {
                    this.f3479k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f3479k;
                int i4 = this.f3480l;
                bVarArr2[i4] = bVar;
                this.f3480l = i4 + 1;
                return;
            } else if (this.f3479k[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i2 = this.f3480l;
        int i3 = 0;
        while (i3 < i2) {
            if (this.f3479k[i3] == bVar) {
                while (i3 < i2 - 1) {
                    b[] bVarArr = this.f3479k;
                    int i4 = i3 + 1;
                    bVarArr[i3] = bVarArr[i4];
                    i3 = i4;
                }
                this.f3480l--;
                return;
            }
            i3++;
        }
    }

    public void c() {
        this.f3478j = 5;
        this.f3473e = 0;
        this.f3471c = -1;
        this.f3472d = -1;
        this.f3474f = 0.0f;
        this.f3475g = false;
        int i2 = this.f3480l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3479k[i3] = null;
        }
        this.f3480l = 0;
        this.f3481m = 0;
        this.f3470b = false;
        Arrays.fill(this.f3477i, 0.0f);
    }

    public int compareTo(Object obj) {
        return this.f3471c - ((h) obj).f3471c;
    }

    public void d(d dVar, float f2) {
        this.f3474f = f2;
        this.f3475g = true;
        int i2 = this.f3480l;
        this.f3472d = -1;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3479k[i3].k(dVar, this, false);
        }
        this.f3480l = 0;
    }

    public final void e(d dVar, b bVar) {
        int i2 = this.f3480l;
        for (int i3 = 0; i3 < i2; i3++) {
            this.f3479k[i3].l(dVar, bVar, false);
        }
        this.f3480l = 0;
    }

    public String toString() {
        StringBuilder a2 = a.a("");
        a2.append(this.f3471c);
        return a2.toString();
    }
}
