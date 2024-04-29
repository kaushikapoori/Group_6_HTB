package d;

import android.view.View;
import androidx.appcompat.app.AlertController;

public class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2697b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2698c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AlertController f2699d;

    public e(AlertController alertController, View view, View view2) {
        this.f2699d = alertController;
        this.f2697b = view;
        this.f2698c = view2;
    }

    public void run() {
        AlertController.c(this.f2699d.f89g, this.f2697b, this.f2698c);
    }
}
