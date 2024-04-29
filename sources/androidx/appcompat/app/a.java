package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

public class a implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AlertController f123b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AlertController.b f124c;

    public a(AlertController.b bVar, AlertController alertController) {
        this.f124c = bVar;
        this.f123b = alertController;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f124c.f119h.onClick(this.f123b.f84b, i2);
        if (!this.f124c.f120i) {
            this.f123b.f84b.dismiss();
        }
    }
}
