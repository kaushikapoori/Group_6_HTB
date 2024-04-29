package w;

import android.app.Activity;

public class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f4129b;

    public a(Activity activity) {
        this.f4129b = activity;
    }

    public void run() {
        if (!this.f4129b.isFinishing() && !c.b(this.f4129b)) {
            this.f4129b.recreate();
        }
    }
}
