package androidx.appcompat.widget;

import a0.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import c.c;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public class y extends t {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f821d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f822e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f823f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f824g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f825h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f826i = false;

    public y(SeekBar seekBar) {
        super(seekBar);
        this.f821d = seekBar;
    }

    public void a(AttributeSet attributeSet, int i2) {
        super.a(attributeSet, i2);
        Context context = this.f821d.getContext();
        int[] iArr = c.f2044g;
        b1 q2 = b1.q(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.f821d;
        u.t(seekBar, seekBar.getContext(), iArr, attributeSet, q2.f527b, i2, 0);
        Drawable h2 = q2.h(0);
        if (h2 != null) {
            this.f821d.setThumb(h2);
        }
        Drawable g2 = q2.g(1);
        Drawable drawable = this.f822e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f822e = g2;
        if (g2 != null) {
            g2.setCallback(this.f821d);
            SeekBar seekBar2 = this.f821d;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            a.c(g2, u.e.d(seekBar2));
            if (g2.isStateful()) {
                g2.setState(this.f821d.getDrawableState());
            }
            c();
        }
        this.f821d.invalidate();
        if (q2.o(3)) {
            this.f824g = i0.d(q2.j(3, -1), this.f824g);
            this.f826i = true;
        }
        if (q2.o(2)) {
            this.f823f = q2.c(2);
            this.f825h = true;
        }
        q2.f527b.recycle();
        c();
    }

    public final void c() {
        Drawable drawable = this.f822e;
        if (drawable == null) {
            return;
        }
        if (this.f825h || this.f826i) {
            Drawable g2 = a.g(drawable.mutate());
            this.f822e = g2;
            if (this.f825h) {
                g2.setTintList(this.f823f);
            }
            if (this.f826i) {
                this.f822e.setTintMode(this.f824g);
            }
            if (this.f822e.isStateful()) {
                this.f822e.setState(this.f821d.getDrawableState());
            }
        }
    }

    public void d(Canvas canvas) {
        if (this.f822e != null) {
            int max = this.f821d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f822e.getIntrinsicWidth();
                int intrinsicHeight = this.f822e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.f822e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.f821d.getWidth() - this.f821d.getPaddingLeft()) - this.f821d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f821d.getPaddingLeft(), (float) (this.f821d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.f822e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
