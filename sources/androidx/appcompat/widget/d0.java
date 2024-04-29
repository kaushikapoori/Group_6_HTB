package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import e.a;
import e0.b;
import j0.b;
import j0.g;
import j0.i;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import z.f;
import z.l;

public class d0 extends TextView implements i, b {

    /* renamed from: b  reason: collision with root package name */
    public final e f561b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f562c;

    /* renamed from: d  reason: collision with root package name */
    public final m f563d;

    /* renamed from: e  reason: collision with root package name */
    public n f564e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f565f;

    /* renamed from: g  reason: collision with root package name */
    public Future<e0.b> f566g;

    public d0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        y0.a(context);
        this.f565f = false;
        w0.a(this, getContext());
        e eVar = new e(this);
        this.f561b = eVar;
        eVar.d(attributeSet, i2);
        b0 b0Var = new b0(this);
        this.f562c = b0Var;
        b0Var.e(attributeSet, i2);
        b0Var.b();
        this.f563d = new m((TextView) this);
        getEmojiTextViewHelper().a(attributeSet, i2);
    }

    private n getEmojiTextViewHelper() {
        if (this.f564e == null) {
            this.f564e = new n(this);
        }
        return this.f564e;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f561b;
        if (eVar != null) {
            eVar.a();
        }
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.f3262a) {
            return super.getAutoSizeMaxTextSize();
        }
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            return Math.round(b0Var.f517i.f599e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.f3262a) {
            return super.getAutoSizeMinTextSize();
        }
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            return Math.round(b0Var.f517i.f598d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.f3262a) {
            return super.getAutoSizeStepGranularity();
        }
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            return Math.round(b0Var.f517i.f597c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.f3262a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        b0 b0Var = this.f562c;
        return b0Var != null ? b0Var.f517i.f600f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.f3262a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            return b0Var.f517i.f595a;
        }
        return 0;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.g(super.getCustomSelectionActionModeCallback());
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f561b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f561b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        z0 z0Var = this.f562c.f516h;
        if (z0Var != null) {
            return z0Var.f830a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        z0 z0Var = this.f562c.f516h;
        if (z0Var != null) {
            return z0Var.f831b;
        }
        return null;
    }

    public CharSequence getText() {
        Future<e0.b> future = this.f566g;
        if (future != null) {
            try {
                this.f566g = null;
                g.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.f563d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto L_0x0010
            androidx.appcompat.widget.m r0 = r2.f563d
            if (r0 != 0) goto L_0x000b
            goto L_0x0010
        L_0x000b:
            android.view.textclassifier.TextClassifier r0 = r0.b()
            return r0
        L_0x0010:
            android.view.textclassifier.TextClassifier r0 = super.getTextClassifier()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d0.getTextClassifier():android.view.textclassifier.TextClassifier");
    }

    public b.a getTextMetricsParamsCompat() {
        return g.a(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f562c.g(this, onCreateInputConnection, editorInfo);
        c.b.j(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        b0 b0Var = this.f562c;
        if (b0Var != null && !j0.b.f3262a) {
            b0Var.f517i.a();
        }
    }

    public void onMeasure(int i2, int i3) {
        Future<e0.b> future = this.f566g;
        if (future != null) {
            try {
                this.f566g = null;
                g.e(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i3);
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        b0 b0Var = this.f562c;
        if (b0Var != null && !j0.b.f3262a && b0Var.d()) {
            this.f562c.f517i.a();
        }
    }

    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().f714b.f3506a.b(z2);
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (j0.b.f3262a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            b0Var.h(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (j0.b.f3262a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            b0Var.i(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (j0.b.f3262a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            b0Var.j(i2);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f561b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f561b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i2 != 0 ? a.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? a.b(context, i3) : null;
        Drawable b4 = i4 != 0 ? a.b(context, i4) : null;
        if (i5 != 0) {
            drawable = a.b(context, i5);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(b2, b3, b4, drawable);
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable b2 = i2 != 0 ? a.b(context, i2) : null;
        Drawable b3 = i3 != 0 ? a.b(context, i3) : null;
        Drawable b4 = i4 != 0 ? a.b(context, i4) : null;
        if (i5 != 0) {
            drawable = a.b(context, i5);
        }
        setCompoundDrawablesWithIntrinsicBounds(b2, b3, b4, drawable);
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.h(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().f714b.f3506a.c(z2);
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().f714b.f3506a.a(inputFilterArr));
    }

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            g.b(this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            g.c(this, i2);
        }
    }

    public void setLineHeight(int i2) {
        g.d(this, i2);
    }

    public void setPrecomputedText(e0.b bVar) {
        g.e(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f561b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f561b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f562c.k(colorStateList);
        this.f562c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f562c.l(mode);
        this.f562c.b();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            b0Var.f(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        m mVar;
        if (Build.VERSION.SDK_INT >= 28 || (mVar = this.f563d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            mVar.f697b = textClassifier;
        }
    }

    public void setTextFuture(Future<e0.b> future) {
        this.f566g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f2914b;
        int i3 = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i3 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        if (i2 < 23) {
            float textScaleX = aVar.f2913a.getTextScaleX();
            getPaint().set(aVar.f2913a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.f2913a);
        setBreakStrategy(aVar.f2915c);
        setHyphenationFrequency(aVar.f2916d);
    }

    public void setTextSize(int i2, float f2) {
        boolean z2 = j0.b.f3262a;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        b0 b0Var = this.f562c;
        if (b0Var != null && !z2 && !b0Var.d()) {
            b0Var.f517i.f(i2, f2);
        }
    }

    public void setTypeface(Typeface typeface, int i2) {
        if (!this.f565f) {
            Typeface typeface2 = null;
            if (typeface != null && i2 > 0) {
                Context context = getContext();
                l lVar = f.f4399a;
                if (context != null) {
                    typeface2 = Typeface.create(typeface, i2);
                } else {
                    throw new IllegalArgumentException("Context cannot be null");
                }
            }
            this.f565f = true;
            if (typeface2 != null) {
                typeface = typeface2;
            }
            try {
                super.setTypeface(typeface, i2);
            } finally {
                this.f565f = false;
            }
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        b0 b0Var = this.f562c;
        if (b0Var != null) {
            b0Var.b();
        }
    }
}
