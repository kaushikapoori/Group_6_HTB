package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import c.c;
import java.util.Objects;
import o0.a;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public Object f696a;

    /* renamed from: b  reason: collision with root package name */
    public Object f697b;

    public m(EditText editText) {
        this.f696a = editText;
        this.f697b = new a(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return (keyListener instanceof NumberKeyListener) ^ true ? ((a) this.f697b).f3492a.a(keyListener) : keyListener;
    }

    public TextClassifier b() {
        Object obj = this.f697b;
        if (((TextClassifier) obj) != null) {
            return (TextClassifier) obj;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((TextView) this.f696a).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    /* JADX INFO: finally extract failed */
    public void c(AttributeSet attributeSet, int i2) {
        TypedArray obtainStyledAttributes = ((EditText) this.f696a).getContext().obtainStyledAttributes(attributeSet, c.f2046i, i2, 0);
        try {
            boolean z2 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z2 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            e(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        a aVar = (a) this.f697b;
        Objects.requireNonNull(aVar);
        if (inputConnection == null) {
            return null;
        }
        return aVar.f3492a.b(inputConnection, editorInfo);
    }

    public void e(boolean z2) {
        ((a) this.f697b).f3492a.c(z2);
    }

    public m(TextView textView) {
        this.f696a = textView;
    }
}
