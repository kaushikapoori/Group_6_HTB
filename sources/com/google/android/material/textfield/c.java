package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.example.supermarket.R;
import com.google.android.material.textfield.TextInputLayout;
import o1.m;
import w1.k;

public class c extends k {

    /* renamed from: e  reason: collision with root package name */
    public final TextWatcher f2615e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.f f2616f = new b();

    /* renamed from: g  reason: collision with root package name */
    public final TextInputLayout.g f2617g = new C0024c();

    public class a extends m {
        public a() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            c cVar = c.this;
            cVar.f4256c.setChecked(!c.d(cVar));
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            c cVar = c.this;
            cVar.f4256c.setChecked(!c.d(cVar));
            editText.removeTextChangedListener(c.this.f2615e);
            editText.addTextChangedListener(c.this.f2615e);
        }
    }

    /* renamed from: com.google.android.material.textfield.c$c  reason: collision with other inner class name */
    public class C0024c implements TextInputLayout.g {

        /* renamed from: com.google.android.material.textfield.c$c$a */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ EditText f2621b;

            public a(EditText editText) {
                this.f2621b = editText;
            }

            public void run() {
                this.f2621b.removeTextChangedListener(c.this.f2615e);
            }
        }

        public C0024c() {
        }

        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i2 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new a(editText));
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            EditText editText = c.this.f4254a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                editText.setTransformationMethod(c.d(c.this) ? null : PasswordTransformationMethod.getInstance());
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                c.this.f4254a.o();
            }
        }
    }

    public c(TextInputLayout textInputLayout, int i2) {
        super(textInputLayout, i2);
    }

    public static boolean d(c cVar) {
        EditText editText = cVar.f4254a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    public void a() {
        TextInputLayout textInputLayout = this.f4254a;
        int i2 = this.f4257d;
        if (i2 == 0) {
            i2 = R.drawable.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i2);
        TextInputLayout textInputLayout2 = this.f4254a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(R.string.password_toggle_content_description));
        boolean z2 = true;
        this.f4254a.setEndIconVisible(true);
        this.f4254a.setEndIconCheckable(true);
        this.f4254a.setEndIconOnClickListener(new d());
        this.f4254a.a(this.f2616f);
        TextInputLayout textInputLayout3 = this.f4254a;
        textInputLayout3.f2526g0.add(this.f2617g);
        EditText editText = this.f4254a.getEditText();
        if (editText == null || !(editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z2 = false;
        }
        if (z2) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
