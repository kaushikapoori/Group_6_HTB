package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class w0 extends Writer {

    /* renamed from: b  reason: collision with root package name */
    public final String f1501b;

    /* renamed from: c  reason: collision with root package name */
    public StringBuilder f1502c = new StringBuilder(128);

    public w0(String str) {
        this.f1501b = str;
    }

    public final void a() {
        if (this.f1502c.length() > 0) {
            Log.d(this.f1501b, this.f1502c.toString());
            StringBuilder sb = this.f1502c;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == 10) {
                a();
            } else {
                this.f1502c.append(c2);
            }
        }
    }
}
