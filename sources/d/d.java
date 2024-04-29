package d;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

public class d implements AbsListView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f2695a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2696b;

    public d(AlertController alertController, View view, View view2) {
        this.f2695a = view;
        this.f2696b = view2;
    }

    public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        AlertController.c(absListView, this.f2695a, this.f2696b);
    }

    public void onScrollStateChanged(AbsListView absListView, int i2) {
    }
}
