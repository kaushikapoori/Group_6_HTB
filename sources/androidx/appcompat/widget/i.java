package androidx.appcompat.widget;

import a0.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public final CheckedTextView f641a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f642b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f643c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f644d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f645e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f646f;

    public i(CheckedTextView checkedTextView) {
        this.f641a = checkedTextView;
    }

    public void a() {
        Drawable checkMarkDrawable = this.f641a.getCheckMarkDrawable();
        if (checkMarkDrawable == null) {
            return;
        }
        if (this.f644d || this.f645e) {
            Drawable mutate = a.g(checkMarkDrawable).mutate();
            if (this.f644d) {
                mutate.setTintList(this.f642b);
            }
            if (this.f645e) {
                mutate.setTintMode(this.f643c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f641a.getDrawableState());
            }
            this.f641a.setCheckMarkDrawable(mutate);
        }
    }
}
