package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import c.b;
import e.a;
import j0.g;

public class h extends CheckedTextView {

    /* renamed from: b  reason: collision with root package name */
    public final i f636b;

    /* renamed from: c  reason: collision with root package name */
    public final e f637c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f638d;

    /* renamed from: e  reason: collision with root package name */
    public n f639e;

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0064 A[SYNTHETIC, Splitter:B:11:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0084 A[Catch:{ all -> 0x00b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0094 A[Catch:{ all -> 0x00b0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            androidx.appcompat.widget.y0.a(r11)
            r0 = 2130903204(0x7f0300a4, float:1.741322E38)
            r10.<init>(r11, r12, r0)
            android.content.Context r11 = r10.getContext()
            androidx.appcompat.widget.w0.a(r10, r11)
            androidx.appcompat.widget.b0 r11 = new androidx.appcompat.widget.b0
            r11.<init>(r10)
            r10.f638d = r11
            r11.e(r12, r0)
            r11.b()
            androidx.appcompat.widget.e r11 = new androidx.appcompat.widget.e
            r11.<init>(r10)
            r10.f637c = r11
            r11.d(r12, r0)
            androidx.appcompat.widget.i r11 = new androidx.appcompat.widget.i
            r11.<init>(r10)
            r10.f636b = r11
            android.content.Context r1 = r10.getContext()
            int[] r4 = c.c.f2049l
            r9 = 0
            androidx.appcompat.widget.b1 r1 = androidx.appcompat.widget.b1.q(r1, r12, r4, r0, r9)
            android.content.Context r3 = r10.getContext()
            android.content.res.TypedArray r6 = r1.f527b
            r8 = 0
            r7 = 2130903204(0x7f0300a4, float:1.741322E38)
            r2 = r10
            r5 = r12
            g0.u.t(r2, r3, r4, r5, r6, r7, r8)
            r2 = 1
            boolean r3 = r1.o(r2)     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x0061
            int r3 = r1.l(r2, r9)     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x0061
            android.content.Context r4 = r10.getContext()     // Catch:{ NotFoundException -> 0x0061 }
            android.graphics.drawable.Drawable r3 = e.a.b(r4, r3)     // Catch:{ NotFoundException -> 0x0061 }
            r10.setCheckMarkDrawable((android.graphics.drawable.Drawable) r3)     // Catch:{ NotFoundException -> 0x0061 }
            goto L_0x0062
        L_0x0061:
            r2 = 0
        L_0x0062:
            if (r2 != 0) goto L_0x007d
            boolean r2 = r1.o(r9)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x007d
            int r2 = r1.l(r9, r9)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x007d
            android.widget.CheckedTextView r3 = r11.f641a     // Catch:{ all -> 0x00b0 }
            android.content.Context r4 = r3.getContext()     // Catch:{ all -> 0x00b0 }
            android.graphics.drawable.Drawable r2 = e.a.b(r4, r2)     // Catch:{ all -> 0x00b0 }
            r3.setCheckMarkDrawable(r2)     // Catch:{ all -> 0x00b0 }
        L_0x007d:
            r2 = 2
            boolean r3 = r1.o(r2)     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x008d
            android.widget.CheckedTextView r3 = r11.f641a     // Catch:{ all -> 0x00b0 }
            android.content.res.ColorStateList r2 = r1.c(r2)     // Catch:{ all -> 0x00b0 }
            r3.setCheckMarkTintList(r2)     // Catch:{ all -> 0x00b0 }
        L_0x008d:
            r2 = 3
            boolean r3 = r1.o(r2)     // Catch:{ all -> 0x00b0 }
            if (r3 == 0) goto L_0x00a3
            android.widget.CheckedTextView r11 = r11.f641a     // Catch:{ all -> 0x00b0 }
            r3 = -1
            int r2 = r1.j(r2, r3)     // Catch:{ all -> 0x00b0 }
            r3 = 0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.i0.d(r2, r3)     // Catch:{ all -> 0x00b0 }
            r11.setCheckMarkTintMode(r2)     // Catch:{ all -> 0x00b0 }
        L_0x00a3:
            android.content.res.TypedArray r11 = r1.f527b
            r11.recycle()
            androidx.appcompat.widget.n r11 = r10.getEmojiTextViewHelper()
            r11.a(r12, r0)
            return
        L_0x00b0:
            r11 = move-exception
            android.content.res.TypedArray r12 = r1.f527b
            r12.recycle()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.h.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private n getEmojiTextViewHelper() {
        if (this.f639e == null) {
            this.f639e = new n(this);
        }
        return this.f639e;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        b0 b0Var = this.f638d;
        if (b0Var != null) {
            b0Var.b();
        }
        e eVar = this.f637c;
        if (eVar != null) {
            eVar.a();
        }
        i iVar = this.f636b;
        if (iVar != null) {
            iVar.a();
        }
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.g(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f637c;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f637c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        i iVar = this.f636b;
        if (iVar != null) {
            return iVar.f642b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        i iVar = this.f636b;
        if (iVar != null) {
            return iVar.f643c;
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.j(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().f714b.f3506a.b(z2);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f637c;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f637c;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(a.b(getContext(), i2));
    }

    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        i iVar = this.f636b;
        if (iVar == null) {
            return;
        }
        if (iVar.f646f) {
            iVar.f646f = false;
            return;
        }
        iVar.f646f = true;
        iVar.a();
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.h(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().f714b.f3506a.c(z2);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f637c;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f637c;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        i iVar = this.f636b;
        if (iVar != null) {
            iVar.f642b = colorStateList;
            iVar.f644d = true;
            iVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        i iVar = this.f636b;
        if (iVar != null) {
            iVar.f643c = mode;
            iVar.f645e = true;
            iVar.a();
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        b0 b0Var = this.f638d;
        if (b0Var != null) {
            b0Var.f(context, i2);
        }
    }
}
