package o0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.d;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class d implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f3500a;

    /* renamed from: b  reason: collision with root package name */
    public d.e f3501b;

    public static class a extends d.e {

        /* renamed from: a  reason: collision with root package name */
        public final Reference<TextView> f3502a;

        /* renamed from: b  reason: collision with root package name */
        public final Reference<d> f3503b;

        public a(TextView textView, d dVar) {
            this.f3502a = new WeakReference(textView);
            this.f3503b = new WeakReference(dVar);
        }

        public void a() {
            InputFilter[] filters;
            TextView textView = this.f3502a.get();
            InputFilter inputFilter = this.f3503b.get();
            boolean z2 = false;
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= filters.length) {
                        break;
                    } else if (filters[i2] == inputFilter) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (z2 && textView.isAttachedToWindow()) {
                CharSequence h2 = androidx.emoji2.text.d.a().h(textView.getText());
                int selectionStart = Selection.getSelectionStart(h2);
                int selectionEnd = Selection.getSelectionEnd(h2);
                textView.setText(h2);
                if (h2 instanceof Spannable) {
                    Spannable spannable = (Spannable) h2;
                    if (selectionStart >= 0 && selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionStart, selectionEnd);
                    } else if (selectionStart >= 0) {
                        Selection.setSelection(spannable, selectionStart);
                    } else if (selectionEnd >= 0) {
                        Selection.setSelection(spannable, selectionEnd);
                    }
                }
            }
        }
    }

    public d(TextView textView) {
        this.f3500a = textView;
    }

    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        if (this.f3500a.isInEditMode()) {
            return charSequence;
        }
        int b2 = androidx.emoji2.text.d.a().b();
        if (b2 != 0) {
            boolean z2 = true;
            if (b2 == 1) {
                if (i5 == 0 && i4 == 0 && spanned.length() == 0 && charSequence == this.f3500a.getText()) {
                    z2 = false;
                }
                if (!z2 || charSequence == null) {
                    return charSequence;
                }
                if (!(i2 == 0 && i3 == charSequence.length())) {
                    charSequence = charSequence.subSequence(i2, i3);
                }
                CharSequence charSequence2 = charSequence;
                return androidx.emoji2.text.d.a().i(charSequence2, 0, charSequence2.length(), Integer.MAX_VALUE, 0);
            } else if (b2 != 3) {
                return charSequence;
            }
        }
        androidx.emoji2.text.d a2 = androidx.emoji2.text.d.a();
        if (this.f3501b == null) {
            this.f3501b = new a(this.f3500a, this);
        }
        a2.j(this.f3501b);
        return charSequence;
    }
}
