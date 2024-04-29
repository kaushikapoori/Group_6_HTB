package w1;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

public class g implements AutoCompleteTextView.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f4249a;

    public g(b bVar) {
        this.f4249a = bVar;
    }

    public void onDismiss() {
        b.h(this.f4249a);
        b.f(this.f4249a, false);
    }
}
