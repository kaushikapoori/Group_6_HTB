package h0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: b  reason: collision with root package name */
    public final int f3155b;

    /* renamed from: c  reason: collision with root package name */
    public final d f3156c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3157d;

    public a(int i2, d dVar, int i3) {
        this.f3155b = i2;
        this.f3156c = dVar;
        this.f3157d = i3;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3155b);
        d dVar = this.f3156c;
        dVar.f3160a.performAction(this.f3157d, bundle);
    }
}
