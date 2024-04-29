package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import n0.b;

public class l {
    public static b a(ByteBuffer byteBuffer) {
        long j2;
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        short s2 = duplicate.getShort() & 65535;
        if (s2 <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i2 = 0;
            while (true) {
                if (i2 >= s2) {
                    j2 = -1;
                    break;
                }
                int i3 = duplicate.getInt();
                duplicate.position(duplicate.position() + 4);
                j2 = ((long) duplicate.getInt()) & 4294967295L;
                duplicate.position(duplicate.position() + 4);
                if (1835365473 == i3) {
                    break;
                }
                i2++;
            }
            if (j2 != -1) {
                duplicate.position(duplicate.position() + ((int) (j2 - ((long) duplicate.position()))));
                duplicate.position(duplicate.position() + 12);
                long j3 = ((long) duplicate.getInt()) & 4294967295L;
                for (int i4 = 0; ((long) i4) < j3; i4++) {
                    int i5 = duplicate.getInt();
                    long j4 = ((long) duplicate.getInt()) & 4294967295L;
                    duplicate.getInt();
                    if (1164798569 == i5 || 1701669481 == i5) {
                        duplicate.position((int) (j4 + j2));
                        b bVar = new b();
                        duplicate.order(ByteOrder.LITTLE_ENDIAN);
                        bVar.b(duplicate.position() + duplicate.getInt(duplicate.position()), duplicate);
                        return bVar;
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
