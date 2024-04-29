package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.example.supermarket.R;
import g0.c;
import g0.o;
import g0.u;
import j0.g;
import j0.h;
import o0.a;

public class l extends EditText implements o {

    /* renamed from: b  reason: collision with root package name */
    public final e f680b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f681c;

    /* renamed from: d  reason: collision with root package name */
    public final m f682d;

    /* renamed from: e  reason: collision with root package name */
    public final h f683e;

    /* renamed from: f  reason: collision with root package name */
    public final m f684f;

    public l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        y0.a(context);
        w0.a(this, getContext());
        e eVar = new e(this);
        this.f680b = eVar;
        eVar.d(attributeSet, i2);
        b0 b0Var = new b0(this);
        this.f681c = b0Var;
        b0Var.e(attributeSet, i2);
        b0Var.b();
        this.f682d = new m((TextView) this);
        this.f683e = new h();
        m mVar = new m((EditText) this);
        this.f684f = mVar;
        mVar.c(attributeSet, i2);
        KeyListener keyListener = getKeyListener();
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

    public c a(c cVar) {
        return this.f683e.a(this, cVar);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f680b;
        if (eVar != null) {
            eVar.a();
        }
        b0 b0Var = this.f681c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f680b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f680b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f682d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.m r0 = r2.f682d
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.b()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r1 != null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        if (r1 != null) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            androidx.appcompat.widget.b0 r1 = r7.f681c
            r1.g(r7, r0, r8)
            c.b.j(r0, r8, r7)
            if (r0 == 0) goto L_0x006f
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L_0x006f
            java.lang.String[] r2 = g0.u.l(r7)
            if (r2 == 0) goto L_0x006f
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L_0x0025
            r8.contentMimeTypes = r2
            goto L_0x003a
        L_0x0025:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L_0x0030
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L_0x0030:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L_0x003a:
            i0.d r2 = new i0.d
            r2.<init>(r7)
            r6 = 0
            if (r1 < r5) goto L_0x0048
            i0.b r1 = new i0.b
            r1.<init>(r0, r6, r2)
            goto L_0x006e
        L_0x0048:
            if (r1 < r5) goto L_0x004f
            java.lang.String[] r1 = r8.contentMimeTypes
            if (r1 == 0) goto L_0x0063
            goto L_0x0065
        L_0x004f:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L_0x0054
            goto L_0x0063
        L_0x0054:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L_0x0060
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L_0x0060:
            if (r1 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            java.lang.String[] r1 = i0.a.f3219a
        L_0x0065:
            int r1 = r1.length
            if (r1 != 0) goto L_0x0069
            goto L_0x006f
        L_0x0069:
            i0.c r1 = new i0.c
            r1.<init>(r0, r6, r2)
        L_0x006e:
            r0 = r1
        L_0x006f:
            androidx.appcompat.widget.m r1 = r7.f684f
            android.view.inputmethod.InputConnection r8 = r1.d(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.l.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = false;
        if (i2 < 31 && i2 >= 24 && dragEvent.getLocalState() == null && u.l(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z2 = w.a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    public boolean onTextContextMenuItem(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        int i4 = 0;
        if (i3 < 31 && u.l(this) != null && (i2 == 16908322 || i2 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                c.b aVar = i3 >= 31 ? new c.a(primaryClip, 1) : new c.C0032c(primaryClip, 1);
                if (i2 != 16908322) {
                    i4 = 1;
                }
                aVar.d(i4);
                u.q(this, aVar.c());
            }
            i4 = 1;
        }
        if (i4 != 0) {
            return true;
        }
        return super.onTextContextMenuItem(i2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f680b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f680b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.h(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        ((a) this.f684f.f697b).f3492a.c(z2);
    }

    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f684f.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f680b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f680b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        b0 b0Var = this.f681c;
        if (b0Var != null) {
            b0Var.f(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        m mVar;
        if (Build.VERSION.SDK_INT >= 28 || (mVar = this.f682d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            mVar.f697b = textClassifier;
        }
    }
}
