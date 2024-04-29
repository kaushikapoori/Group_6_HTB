package a0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class f extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f14a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f15b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f16c = null;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f17d = d.f6h;

    public f(f fVar) {
        if (fVar != null) {
            this.f14a = fVar.f14a;
            this.f15b = fVar.f15b;
            this.f16c = fVar.f16c;
            this.f17d = fVar.f17d;
        }
    }

    public int getChangingConfigurations() {
        int i2 = this.f14a;
        Drawable.ConstantState constantState = this.f15b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return new e(this, (Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
