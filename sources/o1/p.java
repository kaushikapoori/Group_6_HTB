package o1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class p implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3600b;

    public p(View view) {
        this.f3600b = view;
    }

    public void run() {
        ((InputMethodManager) this.f3600b.getContext().getSystemService("input_method")).showSoftInput(this.f3600b, 1);
    }
}
