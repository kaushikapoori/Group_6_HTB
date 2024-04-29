package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

public class e1 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        f1 f1Var = f1.f612k;
        if (f1Var != null && f1Var.f614b == view) {
            f1.c((f1) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            f1 f1Var2 = f1.f613l;
            if (f1Var2 != null && f1Var2.f614b == view) {
                f1Var2.b();
            }
            view.setOnLongClickListener((View.OnLongClickListener) null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener) null);
            return;
        }
        new f1(view, charSequence);
    }
}
