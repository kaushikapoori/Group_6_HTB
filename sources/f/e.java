package f;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import f.c;

@SuppressLint({"RestrictedAPI"})
public class e extends c {

    /* renamed from: o  reason: collision with root package name */
    public a f2981o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2982p;

    public static class a extends c.C0030c {
        public int[][] J;

        public a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[this.f2960g.length][];
            }
        }

        public void e() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public int g(int[] iArr) {
            int[][] iArr2 = this.J;
            int i2 = this.f2961h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                    return i3;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new e(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }
    }

    public e(a aVar) {
    }

    public e(a aVar, Resources resources) {
        e(new a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public void e(c.C0030c cVar) {
        this.f2940b = cVar;
        int i2 = this.f2946h;
        if (i2 >= 0) {
            Drawable d2 = cVar.d(i2);
            this.f2942d = d2;
            if (d2 != null) {
                c(d2);
            }
        }
        this.f2943e = null;
        if (cVar instanceof a) {
            this.f2981o = (a) cVar;
        }
    }

    /* renamed from: f */
    public a b() {
        return new a(this.f2981o, this, (Resources) null);
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f2982p) {
            super.mutate();
            this.f2981o.e();
            this.f2982p = true;
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int g2 = this.f2981o.g(iArr);
        if (g2 < 0) {
            g2 = this.f2981o.g(StateSet.WILD_CARD);
        }
        return d(g2) || onStateChange;
    }
}
