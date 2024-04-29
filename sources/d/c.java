package d;

import android.view.View;
import androidx.appcompat.app.AlertController;

public class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2692b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2693c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AlertController f2694d;

    public c(AlertController alertController, View view, View view2) {
        this.f2694d = alertController;
        this.f2692b = view;
        this.f2693c = view2;
    }

    public void run() {
        AlertController.c(this.f2694d.A, this.f2692b, this.f2693c);
    }
}
