package z;

import android.graphics.Insets;
import androidx.activity.result.a;

public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f4391e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f4392a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4393b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4394c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4395d;

    public b(int i2, int i3, int i4, int i5) {
        this.f4392a = i2;
        this.f4393b = i3;
        this.f4394c = i4;
        this.f4395d = i5;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f4392a, bVar2.f4392a), Math.max(bVar.f4393b, bVar2.f4393b), Math.max(bVar.f4394c, bVar2.f4394c), Math.max(bVar.f4395d, bVar2.f4395d));
    }

    public static b b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f4391e : new b(i2, i3, i4, i5);
    }

    public static b c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets d() {
        return Insets.of(this.f4392a, this.f4393b, this.f4394c, this.f4395d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4395d == bVar.f4395d && this.f4392a == bVar.f4392a && this.f4394c == bVar.f4394c && this.f4393b == bVar.f4393b;
    }

    public int hashCode() {
        return (((((this.f4392a * 31) + this.f4393b) * 31) + this.f4394c) * 31) + this.f4395d;
    }

    public String toString() {
        StringBuilder a2 = a.a("Insets{left=");
        a2.append(this.f4392a);
        a2.append(", top=");
        a2.append(this.f4393b);
        a2.append(", right=");
        a2.append(this.f4394c);
        a2.append(", bottom=");
        a2.append(this.f4395d);
        a2.append('}');
        return a2.toString();
    }
}
