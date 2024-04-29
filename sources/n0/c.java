package n0;

import java.nio.ByteBuffer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f3482a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f3483b;

    /* renamed from: c  reason: collision with root package name */
    public int f3484c;

    /* renamed from: d  reason: collision with root package name */
    public int f3485d;

    public c() {
        if (d.f3486a == null) {
            d.f3486a = new d();
        }
    }

    public int a(int i2) {
        if (i2 < this.f3485d) {
            return this.f3483b.getShort(this.f3484c + i2);
        }
        return 0;
    }

    public void b(int i2, ByteBuffer byteBuffer) {
        short s2;
        this.f3483b = byteBuffer;
        if (byteBuffer != null) {
            this.f3482a = i2;
            int i3 = i2 - byteBuffer.getInt(i2);
            this.f3484c = i3;
            s2 = this.f3483b.getShort(i3);
        } else {
            s2 = 0;
            this.f3482a = 0;
            this.f3484c = 0;
        }
        this.f3485d = s2;
    }
}
