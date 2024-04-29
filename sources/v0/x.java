package v0;

import android.view.View;
import android.view.ViewGroup;
import com.example.supermarket.R;
import java.util.ArrayList;
import v0.g;

public class x extends j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f4109a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f4110b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f4111c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y f4112d;

    public x(y yVar, ViewGroup viewGroup, View view, View view2) {
        this.f4112d = yVar;
        this.f4109a = viewGroup;
        this.f4110b = view;
        this.f4111c = view2;
    }

    public void b(g gVar) {
        this.f4109a.getOverlay().remove(this.f4110b);
    }

    public void c(g gVar) {
        if (this.f4110b.getParent() == null) {
            this.f4109a.getOverlay().add(this.f4110b);
            return;
        }
        y yVar = this.f4112d;
        int size = yVar.f4064n.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            yVar.f4064n.get(size).cancel();
        }
        ArrayList<g.d> arrayList = yVar.f4068r;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) yVar.f4068r.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((g.d) arrayList2.get(i2)).a(yVar);
            }
        }
    }

    public void d(g gVar) {
        this.f4111c.setTag(R.id.save_overlay_view, (Object) null);
        this.f4109a.getOverlay().remove(this.f4110b);
        gVar.v(this);
    }
}
