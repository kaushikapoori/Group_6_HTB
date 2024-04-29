package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import c.b;
import com.example.supermarket.R;
import e.a;

public class r extends MultiAutoCompleteTextView {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f760e = {16843126};

    /* renamed from: b  reason: collision with root package name */
    public final e f761b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f762c;

    /* renamed from: d  reason: collision with root package name */
    public final m f763d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        y0.a(context);
        w0.a(this, getContext());
        b1 q2 = b1.q(getContext(), attributeSet, f760e, R.attr.autoCompleteTextViewStyle, 0);
        if (q2.o(0)) {
            setDropDownBackgroundDrawable(q2.g(0));
        }
        q2.f527b.recycle();
        e eVar = new e(this);
        this.f761b = eVar;
        eVar.d(attributeSet, R.attr.autoCompleteTextViewStyle);
        b0 b0Var = new b0(this);
        this.f762c = b0Var;
        b0Var.e(attributeSet, R.attr.autoCompleteTextViewStyle);
        b0Var.b();
        m mVar = new m((EditText) this);
        this.f763d = mVar;
        mVar.c(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            int inputType = getInputType();
            KeyListener a2 = mVar.a(keyListener);
            if (a2 != keyListener) {
                super.setKeyListener(a2);
                setRawInputType(inputType);
                setFocusable(isFocusable);
            }
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f761b;
        if (eVar != null) {
            eVar.a();
        }
        b0 b0Var = this.f762c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f761b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f761b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.j(onCreateInputConnection, editorInfo, this);
        return this.f763d.d(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f761b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f761b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(a.b(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((o0.a) this.f763d.f697b).f3492a.c(z2);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f763d.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f761b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f761b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        b0 b0Var = this.f762c;
        if (b0Var != null) {
            b0Var.f(context, i2);
        }
    }
}
