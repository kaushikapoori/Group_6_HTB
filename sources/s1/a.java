package s1;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import u1.g;
import u1.j;
import u1.n;

public class a extends Drawable implements n, a0.b {

    /* renamed from: b  reason: collision with root package name */
    public b f3878b;

    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public g f3879a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3880b;

        public b(b bVar) {
            this.f3879a = (g) bVar.f3879a.f3911b.newDrawable();
            this.f3880b = bVar.f3880b;
        }

        public b(g gVar) {
            this.f3879a = gVar;
            this.f3880b = false;
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return new a(new b(this), (C0051a) null);
        }
    }

    public a(b bVar, C0051a aVar) {
        this.f3878b = bVar;
    }

    public void draw(Canvas canvas) {
        b bVar = this.f3878b;
        if (bVar.f3880b) {
            bVar.f3879a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.f3878b;
    }

    public int getOpacity() {
        return this.f3878b.f3879a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        this.f3878b = new b(this.f3878b);
        return this;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3878b.f3879a.setBounds(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f3878b.f3879a.setState(iArr)) {
            onStateChange = true;
        }
        boolean b2 = b.b(iArr);
        b bVar = this.f3878b;
        if (bVar.f3880b == b2) {
            return onStateChange;
        }
        bVar.f3880b = b2;
        return true;
    }

    public void setAlpha(int i2) {
        this.f3878b.f3879a.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3878b.f3879a.setColorFilter(colorFilter);
    }

    public void setShapeAppearanceModel(j jVar) {
        g gVar = this.f3878b.f3879a;
        gVar.f3911b.f3935a = jVar;
        gVar.invalidateSelf();
    }

    public void setTint(int i2) {
        this.f3878b.f3879a.setTint(i2);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3878b.f3879a.setTintList(colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f3878b.f3879a.setTintMode(mode);
    }

    public a(j jVar) {
        this.f3878b = new b(new g(jVar));
    }
}
