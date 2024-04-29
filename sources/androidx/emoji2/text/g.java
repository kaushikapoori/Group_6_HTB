package androidx.emoji2.text;

import java.nio.ByteBuffer;
import n0.a;
import n0.b;

public class g {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<a> f1149d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f1150a;

    /* renamed from: b  reason: collision with root package name */
    public final m f1151b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1152c = 0;

    public g(m mVar, int i2) {
        this.f1151b = mVar;
        this.f1150a = i2;
    }

    public int a(int i2) {
        a e2 = e();
        int a2 = e2.a(16);
        if (a2 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = e2.f3483b;
        int i3 = a2 + e2.f3482a;
        return byteBuffer.getInt((i2 * 4) + byteBuffer.getInt(i3) + i3 + 4);
    }

    public int b() {
        a e2 = e();
        int a2 = e2.a(16);
        if (a2 == 0) {
            return 0;
        }
        int i2 = a2 + e2.f3482a;
        return e2.f3483b.getInt(e2.f3483b.getInt(i2) + i2);
    }

    public short c() {
        a e2 = e();
        int a2 = e2.a(14);
        if (a2 != 0) {
            return e2.f3483b.getShort(a2 + e2.f3482a);
        }
        return 0;
    }

    public int d() {
        a e2 = e();
        int a2 = e2.a(4);
        if (a2 != 0) {
            return e2.f3483b.getInt(a2 + e2.f3482a);
        }
        return 0;
    }

    public final a e() {
        ThreadLocal<a> threadLocal = f1149d;
        a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new a();
            threadLocal.set(aVar);
        }
        b bVar = this.f1151b.f1181a;
        int i2 = this.f1150a;
        int a2 = bVar.a(6);
        if (a2 != 0) {
            int i3 = a2 + bVar.f3482a;
            int i4 = (i2 * 4) + bVar.f3483b.getInt(i3) + i3 + 4;
            aVar.b(bVar.f3483b.getInt(i4) + i4, bVar.f3483b);
        }
        return aVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(d()));
        sb.append(", codepoints:");
        int b2 = b();
        for (int i2 = 0; i2 < b2; i2++) {
            sb.append(Integer.toHexString(a(i2)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
