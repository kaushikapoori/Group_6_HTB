package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.example.supermarket.R;
import com.google.android.material.textfield.TextInputLayout;
import w1.k;

public class a extends k {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f2575e = new C0020a();

    /* renamed from: f  reason: collision with root package name */
    public final View.OnFocusChangeListener f2576f = new b();

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.f f2577g = new c();

    /* renamed from: h  reason: collision with root package name */
    public final TextInputLayout.g f2578h = new d();

    /* renamed from: i  reason: collision with root package name */
    public AnimatorSet f2579i;

    /* renamed from: j  reason: collision with root package name */
    public ValueAnimator f2580j;

    /* renamed from: com.google.android.material.textfield.a$a  reason: collision with other inner class name */
    public class C0020a implements TextWatcher {
        public C0020a() {
        }

        public void afterTextChanged(Editable editable) {
            if (a.this.f4254a.getSuffixText() == null) {
                a aVar = a.this;
                aVar.e(a.d(aVar));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public class b implements View.OnFocusChangeListener {
        public b() {
        }

        public void onFocusChange(View view, boolean z2) {
            a aVar = a.this;
            aVar.e(a.d(aVar));
        }
    }

    public class c implements TextInputLayout.f {
        public c() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(a.d(a.this));
            editText.setOnFocusChangeListener(a.this.f2576f);
            a aVar = a.this;
            aVar.f4256c.setOnFocusChangeListener(aVar.f2576f);
            editText.removeTextChangedListener(a.this.f2575e);
            editText.addTextChangedListener(a.this.f2575e);
        }
    }

    public class d implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.a$d$a  reason: collision with other inner class name */
        public class C0021a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ EditText f2585b;

            public C0021a(EditText editText) {
                this.f2585b = editText;
            }

            public void run() {
                this.f2585b.removeTextChangedListener(a.this.f2575e);
                a.this.e(true);
            }
        }

        public d() {
        }

        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i2 == 2) {
                editText.post(new C0021a(editText));
                if (editText.getOnFocusChangeListener() == a.this.f2576f) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                View.OnFocusChangeListener onFocusChangeListener = a.this.f4256c.getOnFocusChangeListener();
                a aVar = a.this;
                if (onFocusChangeListener == aVar.f2576f) {
                    aVar.f4256c.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    public class e implements View.OnClickListener {
        public e() {
        }

        public void onClick(View view) {
            Editable text = a.this.f4254a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f4254a.o();
        }
    }

    public a(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
    }

    public static boolean d(a aVar) {
        EditText editText = aVar.f4254a.getEditText();
        return editText != null && (editText.hasFocus() || aVar.f4256c.hasFocus()) && editText.getText().length() > 0;
    }

    public void a() {
        TextInputLayout textInputLayout = this.f4254a;
        int i2 = this.f4257d;
        if (i2 == 0) {
            i2 = R.drawable.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i2);
        TextInputLayout textInputLayout2 = this.f4254a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.clear_text_end_icon_content_description));
        this.f4254a.setEndIconCheckable(false);
        this.f4254a.setEndIconOnClickListener(new e());
        this.f4254a.a(this.f2577g);
        TextInputLayout textInputLayout3 = this.f4254a;
        textInputLayout3.f2526g0.add(this.f2578h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(z0.a.f4422d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new w1.d(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        TimeInterpolator timeInterpolator = z0.a.f4419a;
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(100);
        ofFloat2.addUpdateListener(new w1.c(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f2579i = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f2579i.addListener(new w1.a(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(100);
        ofFloat3.addUpdateListener(new w1.c(this));
        this.f2580j = ofFloat3;
        ofFloat3.addListener(new w1.b(this));
    }

    public void c(boolean z2) {
        if (this.f4254a.getSuffixText() != null) {
            e(z2);
        }
    }

    public final void e(boolean z2) {
        boolean z3 = this.f4254a.j() == z2;
        if (z2 && !this.f2579i.isRunning()) {
            this.f2580j.cancel();
            this.f2579i.start();
            if (z3) {
                this.f2579i.end();
            }
        } else if (!z2) {
            this.f2579i.cancel();
            this.f2580j.start();
            if (z3) {
                this.f2580j.end();
            }
        }
    }
}
