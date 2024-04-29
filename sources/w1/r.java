package w1;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.b1;
import androidx.appcompat.widget.d0;
import com.example.supermarket.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import g0.u;
import g0.x;
import j0.g;
import java.util.WeakHashMap;
import o1.s;
import r1.c;

@SuppressLint({"ViewConstructor"})
public class r extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f4290b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f4291c;

    /* renamed from: d  reason: collision with root package name */
    public CharSequence f4292d;

    /* renamed from: e  reason: collision with root package name */
    public final CheckableImageButton f4293e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f4294f;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f4295g;

    /* renamed from: h  reason: collision with root package name */
    public View.OnLongClickListener f4296h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4297i;

    public r(TextInputLayout textInputLayout, b1 b1Var) {
        super(textInputLayout.getContext());
        this.f4290b = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, this, false);
        this.f4293e = checkableImageButton;
        d0 d0Var = new d0(getContext(), (AttributeSet) null);
        this.f4291c = d0Var;
        if (c.d(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        d((View.OnClickListener) null);
        e((View.OnLongClickListener) null);
        if (b1Var.o(62)) {
            this.f4294f = c.b(getContext(), b1Var, 62);
        }
        if (b1Var.o(63)) {
            this.f4295g = s.b(b1Var.j(63, -1), (PorterDuff.Mode) null);
        }
        if (b1Var.o(61)) {
            c(b1Var.g(61));
            if (b1Var.o(60)) {
                b(b1Var.n(60));
            }
            checkableImageButton.setCheckable(b1Var.a(59, true));
        }
        d0Var.setVisibility(8);
        d0Var.setId(R.id.textinput_prefix_text);
        d0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.g.f(d0Var, 1);
        g.f(d0Var, b1Var.l(55, 0));
        if (b1Var.o(56)) {
            d0Var.setTextColor(b1Var.c(56));
        }
        a(b1Var.n(54));
        addView(checkableImageButton);
        addView(d0Var);
    }

    public void a(CharSequence charSequence) {
        this.f4292d = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f4291c.setText(charSequence);
        h();
    }

    public void b(CharSequence charSequence) {
        if (this.f4293e.getContentDescription() != charSequence) {
            this.f4293e.setContentDescription(charSequence);
        }
    }

    public void c(Drawable drawable) {
        this.f4293e.setImageDrawable(drawable);
        if (drawable != null) {
            l.a(this.f4290b, this.f4293e, this.f4294f, this.f4295g);
            f(true);
            l.c(this.f4290b, this.f4293e, this.f4294f);
            return;
        }
        f(false);
        d((View.OnClickListener) null);
        e((View.OnLongClickListener) null);
        b((CharSequence) null);
    }

    public void d(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f4293e;
        View.OnLongClickListener onLongClickListener = this.f4296h;
        checkableImageButton.setOnClickListener((View.OnClickListener) null);
        l.d(checkableImageButton, onLongClickListener);
    }

    public void e(View.OnLongClickListener onLongClickListener) {
        this.f4296h = null;
        CheckableImageButton checkableImageButton = this.f4293e;
        checkableImageButton.setOnLongClickListener((View.OnLongClickListener) null);
        l.d(checkableImageButton, (View.OnLongClickListener) null);
    }

    public void f(boolean z2) {
        int i2 = 0;
        if ((this.f4293e.getVisibility() == 0) != z2) {
            CheckableImageButton checkableImageButton = this.f4293e;
            if (!z2) {
                i2 = 8;
            }
            checkableImageButton.setVisibility(i2);
            g();
            h();
        }
    }

    public void g() {
        EditText editText = this.f4290b.f2523f;
        if (editText != null) {
            int i2 = 0;
            if (!(this.f4293e.getVisibility() == 0)) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                i2 = u.e.f(editText);
            }
            TextView textView = this.f4291c;
            int compoundPaddingTop = editText.getCompoundPaddingTop();
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
            int compoundPaddingBottom = editText.getCompoundPaddingBottom();
            WeakHashMap<View, x> weakHashMap2 = u.f3063a;
            u.e.k(textView, i2, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
        }
    }

    public final void h() {
        int i2 = 8;
        int i3 = (this.f4292d == null || this.f4297i) ? 8 : 0;
        if (this.f4293e.getVisibility() == 0 || i3 == 0) {
            i2 = 0;
        }
        setVisibility(i2);
        this.f4291c.setVisibility(i3);
        this.f4290b.u();
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        g();
    }
}
