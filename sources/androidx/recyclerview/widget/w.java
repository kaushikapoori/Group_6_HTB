package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.c;

public class w implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2001a;

    public w(RecyclerView recyclerView) {
        this.f2001a = recyclerView;
    }

    public View a(int i2) {
        return this.f2001a.getChildAt(i2);
    }

    public int b() {
        return this.f2001a.getChildCount();
    }

    public void c(int i2) {
        View childAt = this.f2001a.getChildAt(i2);
        if (childAt != null) {
            this.f2001a.p(childAt);
            childAt.clearAnimation();
        }
        this.f2001a.removeViewAt(i2);
    }
}
