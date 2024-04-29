package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import c.b;
import com.example.supermarket.R;
import e.a;
import j0.g;
import java.util.Objects;

public class d extends AutoCompleteTextView {

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f557e = {16843126};

    /* renamed from: b  reason: collision with root package name */
    public final e f558b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f559c;

    /* renamed from: d  reason: collision with root package name */
    public final m f560d;

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        y0.a(context);
        w0.a(this, getContext());
        b1 q2 = b1.q(getContext(), attributeSet, f557e, i2, 0);
        if (q2.o(0)) {
            setDropDownBackgroundDrawable(q2.g(0));
        }
        q2.f527b.recycle();
        e eVar = new e(this);
        this.f558b = eVar;
        eVar.d(attributeSet, i2);
        b0 b0Var = new b0(this);
        this.f559c = b0Var;
        b0Var.e(attributeSet, i2);
        b0Var.b();
        m mVar = new m((EditText) this);
        this.f560d = mVar;
        mVar.c(attributeSet, i2);
        KeyListener keyListener = getKeyListener();
        Objects.requireNonNull(mVar);
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            int inputType = super.getInputType();
            KeyListener a2 = mVar.a(keyListener);
            if (a2 != keyListener) {
                super.setKeyListener(a2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
            }
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f558b;
        if (eVar != null) {
            eVar.a();
        }
        b0 b0Var = this.f559c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f558b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f558b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.j(onCreateInputConnection, editorInfo, this);
        return this.f560d.d(onCreateInputConnection, editorInfo);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f558b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f558b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.h(this, callback));
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(a.b(getContext(), i2));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((o0.a) this.f560d.f697b).f3492a.c(z2);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f560d.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f558b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f558b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        b0 b0Var = this.f559c;
        if (b0Var != null) {
            b0Var.f(context, i2);
        }
    }
}
