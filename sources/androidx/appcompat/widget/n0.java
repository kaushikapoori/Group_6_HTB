package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

public class n0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o0 f715b;

    public n0(o0 o0Var) {
        this.f715b = o0Var;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        j0 j0Var;
        if (i2 != -1 && (j0Var = this.f715b.f721d) != null) {
            j0Var.setListSelectionHidden(false);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
