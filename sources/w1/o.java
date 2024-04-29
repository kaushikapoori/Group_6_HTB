package w1;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.o0;

public class o implements AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f4285b;

    public o(p pVar) {
        this.f4285b = pVar;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        Object obj;
        p pVar = this.f4285b;
        if (i2 < 0) {
            o0 o0Var = pVar.f4286f;
            obj = !o0Var.a() ? null : o0Var.f721d.getSelectedItem();
        } else {
            obj = pVar.getAdapter().getItem(i2);
        }
        p.a(this.f4285b, obj);
        AdapterView.OnItemClickListener onItemClickListener = this.f4285b.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i2 < 0) {
                o0 o0Var2 = this.f4285b.f4286f;
                view = !o0Var2.a() ? null : o0Var2.f721d.getSelectedView();
                o0 o0Var3 = this.f4285b.f4286f;
                i2 = !o0Var3.a() ? -1 : o0Var3.f721d.getSelectedItemPosition();
                o0 o0Var4 = this.f4285b.f4286f;
                j2 = !o0Var4.a() ? Long.MIN_VALUE : o0Var4.f721d.getSelectedItemId();
            }
            onItemClickListener.onItemClick(this.f4285b.f4286f.f721d, view, i2, j2);
        }
        this.f4285b.f4286f.dismiss();
    }
}
