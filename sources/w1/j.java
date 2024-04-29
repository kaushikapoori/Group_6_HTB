package w1;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.b;

public class j implements View.OnTouchListener {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f4252b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f4253c;

    public j(b bVar, AutoCompleteTextView autoCompleteTextView) {
        this.f4253c = bVar;
        this.f4252b = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f4253c.l()) {
                this.f4253c.f2595l = false;
            }
            b.g(this.f4253c, this.f4252b);
            b.h(this.f4253c);
        }
        return false;
    }
}
