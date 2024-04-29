package v0;

import android.os.Build;

public class n {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f4091a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f4092b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f4093c;

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i2 < 28) {
            z2 = false;
        }
        f4093c = z2;
    }
}
