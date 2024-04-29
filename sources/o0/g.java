package o0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class g implements TextWatcher {

    /* renamed from: b  reason: collision with root package name */
    public final EditText f3511b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3512c;

    /* renamed from: d  reason: collision with root package name */
    public d.e f3513d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3514e = true;

    public static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<EditText> f3515a;

        public a(EditText editText) {
            this.f3515a = new WeakReference(editText);
        }

        public void a() {
            g.a(this.f3515a.get(), 1);
        }
    }

    public g(EditText editText, boolean z2) {
        this.f3511b = editText;
        this.f3512c = z2;
    }

    public static void a(EditText editText, int i2) {
        if (i2 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            d.a().h(editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (!this.f3511b.isInEditMode()) {
            if (!(!this.f3514e || (!this.f3512c && !d.c())) && i3 <= i4 && (charSequence instanceof Spannable)) {
                int b2 = d.a().b();
                if (b2 != 0) {
                    if (b2 == 1) {
                        d.a().i((Spannable) charSequence, i2, i2 + i4, Integer.MAX_VALUE, 0);
                        return;
                    } else if (b2 != 3) {
                        return;
                    }
                }
                d a2 = d.a();
                if (this.f3513d == null) {
                    this.f3513d = new a(this.f3511b);
                }
                a2.j(this.f3513d);
            }
        }
    }
}
