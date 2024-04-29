package d1;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import c.b;
import com.example.supermarket.R;
import com.google.android.material.button.MaterialButton;
import g0.u;
import g0.x;
import java.util.WeakHashMap;
import u1.g;
import u1.j;
import u1.n;

public class a {

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f2879t = true;

    /* renamed from: u  reason: collision with root package name */
    public static final boolean f2880u;

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f2881a;

    /* renamed from: b  reason: collision with root package name */
    public j f2882b;

    /* renamed from: c  reason: collision with root package name */
    public int f2883c;

    /* renamed from: d  reason: collision with root package name */
    public int f2884d;

    /* renamed from: e  reason: collision with root package name */
    public int f2885e;

    /* renamed from: f  reason: collision with root package name */
    public int f2886f;

    /* renamed from: g  reason: collision with root package name */
    public int f2887g;

    /* renamed from: h  reason: collision with root package name */
    public int f2888h;

    /* renamed from: i  reason: collision with root package name */
    public PorterDuff.Mode f2889i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f2890j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f2891k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f2892l;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f2893m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f2894n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2895o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2896p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2897q;

    /* renamed from: r  reason: collision with root package name */
    public LayerDrawable f2898r;

    /* renamed from: s  reason: collision with root package name */
    public int f2899s;

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        if (i2 > 22) {
            z2 = false;
        }
        f2880u = z2;
    }

    public a(MaterialButton materialButton, j jVar) {
        this.f2881a = materialButton;
        this.f2882b = jVar;
    }

    public n a() {
        LayerDrawable layerDrawable = this.f2898r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.f2898r.getNumberOfLayers() > 2 ? this.f2898r.getDrawable(2) : this.f2898r.getDrawable(1));
    }

    public g b() {
        return c(false);
    }

    public final g c(boolean z2) {
        LayerDrawable layerDrawable = this.f2898r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (f2879t ? (LayerDrawable) ((InsetDrawable) this.f2898r.getDrawable(0)).getDrawable() : this.f2898r).getDrawable(z2 ^ true ? 1 : 0);
    }

    public final g d() {
        return c(true);
    }

    public void e(j jVar) {
        this.f2882b = jVar;
        if (!f2880u || this.f2895o) {
            if (b() != null) {
                g b2 = b();
                b2.f3911b.f3935a = jVar;
                b2.invalidateSelf();
            }
            if (d() != null) {
                g d2 = d();
                d2.f3911b.f3935a = jVar;
                d2.invalidateSelf();
            }
            if (a() != null) {
                a().setShapeAppearanceModel(jVar);
                return;
            }
            return;
        }
        MaterialButton materialButton = this.f2881a;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        int f2 = u.e.f(materialButton);
        int paddingTop = this.f2881a.getPaddingTop();
        int e2 = u.e.e(this.f2881a);
        int paddingBottom = this.f2881a.getPaddingBottom();
        g();
        u.e.k(this.f2881a, f2, paddingTop, e2, paddingBottom);
    }

    public final void f(int i2, int i3) {
        MaterialButton materialButton = this.f2881a;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        int f2 = u.e.f(materialButton);
        int paddingTop = this.f2881a.getPaddingTop();
        int e2 = u.e.e(this.f2881a);
        int paddingBottom = this.f2881a.getPaddingBottom();
        int i4 = this.f2885e;
        int i5 = this.f2886f;
        this.f2886f = i3;
        this.f2885e = i2;
        if (!this.f2895o) {
            g();
        }
        u.e.k(this.f2881a, f2, (paddingTop + i2) - i4, e2, (paddingBottom + i3) - i5);
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
            r14 = this;
            com.google.android.material.button.MaterialButton r0 = r14.f2881a
            u1.g r1 = new u1.g
            u1.j r2 = r14.f2882b
            r1.<init>((u1.j) r2)
            com.google.android.material.button.MaterialButton r2 = r14.f2881a
            android.content.Context r2 = r2.getContext()
            r1.o(r2)
            android.content.res.ColorStateList r2 = r14.f2890j
            r1.setTintList(r2)
            android.graphics.PorterDuff$Mode r2 = r14.f2889i
            if (r2 == 0) goto L_0x001e
            r1.setTintMode(r2)
        L_0x001e:
            int r2 = r14.f2888h
            float r2 = (float) r2
            android.content.res.ColorStateList r3 = r14.f2891k
            r1.t(r2, r3)
            u1.g r2 = new u1.g
            u1.j r3 = r14.f2882b
            r2.<init>((u1.j) r3)
            r3 = 0
            r2.setTint(r3)
            int r4 = r14.f2888h
            float r4 = (float) r4
            boolean r5 = r14.f2894n
            if (r5 == 0) goto L_0x0042
            com.google.android.material.button.MaterialButton r5 = r14.f2881a
            r6 = 2130903291(0x7f0300fb, float:1.7413396E38)
            int r5 = c.b.f(r5, r6)
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            r2.s(r4, r5)
            boolean r4 = f2879t
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0082
            u1.g r4 = new u1.g
            u1.j r7 = r14.f2882b
            r4.<init>((u1.j) r7)
            r14.f2893m = r4
            r7 = -1
            r4.setTint(r7)
            android.graphics.drawable.RippleDrawable r4 = new android.graphics.drawable.RippleDrawable
            android.content.res.ColorStateList r7 = r14.f2892l
            android.content.res.ColorStateList r7 = s1.b.a(r7)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r5]
            r5[r3] = r2
            r5[r6] = r1
            r9.<init>(r5)
            android.graphics.drawable.InsetDrawable r1 = new android.graphics.drawable.InsetDrawable
            int r10 = r14.f2883c
            int r11 = r14.f2885e
            int r12 = r14.f2884d
            int r13 = r14.f2886f
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            android.graphics.drawable.Drawable r2 = r14.f2893m
            r4.<init>(r7, r1, r2)
            r14.f2898r = r4
            goto L_0x00b4
        L_0x0082:
            s1.a r4 = new s1.a
            u1.j r7 = r14.f2882b
            r4.<init>(r7)
            r14.f2893m = r4
            android.content.res.ColorStateList r7 = r14.f2892l
            android.content.res.ColorStateList r7 = s1.b.a(r7)
            r4.setTintList(r7)
            android.graphics.drawable.LayerDrawable r9 = new android.graphics.drawable.LayerDrawable
            r4 = 3
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r4]
            r4[r3] = r2
            r4[r6] = r1
            android.graphics.drawable.Drawable r1 = r14.f2893m
            r4[r5] = r1
            r9.<init>(r4)
            r14.f2898r = r9
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            int r10 = r14.f2883c
            int r11 = r14.f2885e
            int r12 = r14.f2884d
            int r13 = r14.f2886f
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13)
        L_0x00b4:
            r0.setInternalBackground(r4)
            u1.g r0 = r14.b()
            if (r0 == 0) goto L_0x00c3
            int r1 = r14.f2899s
            float r1 = (float) r1
            r0.p(r1)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d1.a.g():void");
    }

    public final void h() {
        g b2 = b();
        g d2 = d();
        if (b2 != null) {
            b2.t((float) this.f2888h, this.f2891k);
            if (d2 != null) {
                d2.s((float) this.f2888h, this.f2894n ? b.f(this.f2881a, R.attr.colorSurface) : 0);
            }
        }
    }
}
