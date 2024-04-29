package v0;

import android.os.Build;
import android.view.ViewGroup;

public class p {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f4097a = true;

    public static void a(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z2);
        } else if (f4097a) {
            try {
                viewGroup.suppressLayout(z2);
            } catch (NoSuchMethodError unused) {
                f4097a = false;
            }
        }
    }
}
