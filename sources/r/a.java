package r;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;

@SuppressLint({"LogConditional"})
public class a {
    public static String a(Context context, int i2) {
        if (i2 == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i2);
        } catch (Exception unused) {
            return "?" + i2;
        }
    }

    public static String b(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }
}
