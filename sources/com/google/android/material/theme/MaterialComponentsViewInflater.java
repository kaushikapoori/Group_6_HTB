package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.u;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import d.q;
import f1.a;
import w1.p;

public class MaterialComponentsViewInflater extends q {
    public d a(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    public f b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    public g c(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    public u d(Context context, AttributeSet attributeSet) {
        return new q1.a(context, attributeSet);
    }

    public d0 e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
