package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.example.supermarket.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import o1.m;
import o1.p;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: b  reason: collision with root package name */
    public final Chip f2624b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f2625c;

    public class b extends m {
        public b(a aVar) {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
                chipTextInputComboView.f2624b.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
                return;
            }
            ChipTextInputComboView chipTextInputComboView2 = ChipTextInputComboView.this;
            chipTextInputComboView2.f2624b.setText(ChipTextInputComboView.a(chipTextInputComboView2, editable));
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.f2624b = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        EditText editText = textInputLayout.getEditText();
        this.f2625c = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new b((a) null));
        b();
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    public final void b() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f2625c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public boolean isChecked() {
        return this.f2624b.isChecked();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void setChecked(boolean z2) {
        this.f2624b.setChecked(z2);
        int i2 = 0;
        this.f2625c.setVisibility(z2 ? 0 : 4);
        Chip chip = this.f2624b;
        if (z2) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            EditText editText = this.f2625c;
            editText.requestFocus();
            editText.post(new p(editText));
            if (!TextUtils.isEmpty(this.f2625c.getText())) {
                EditText editText2 = this.f2625c;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2624b.setOnClickListener(onClickListener);
    }

    public void setTag(int i2, Object obj) {
        this.f2624b.setTag(i2, obj);
    }

    public void toggle() {
        this.f2624b.toggle();
    }
}
