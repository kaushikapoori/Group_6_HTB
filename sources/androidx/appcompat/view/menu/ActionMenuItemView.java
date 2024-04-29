package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.e1;
import androidx.appcompat.widget.l0;
import i.f;

public class ActionMenuItemView extends d0 implements j.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: h  reason: collision with root package name */
    public g f128h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f129i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f130j;

    /* renamed from: k  reason: collision with root package name */
    public e.b f131k;

    /* renamed from: l  reason: collision with root package name */
    public l0 f132l;

    /* renamed from: m  reason: collision with root package name */
    public b f133m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f134n = e();

    /* renamed from: o  reason: collision with root package name */
    public boolean f135o;

    /* renamed from: p  reason: collision with root package name */
    public int f136p;

    /* renamed from: q  reason: collision with root package name */
    public int f137q;

    /* renamed from: r  reason: collision with root package name */
    public int f138r;

    public class a extends l0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public f b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.f133m;
            if (bVar == null || (aVar = c.this.f540u) == null) {
                return null;
            }
            return aVar.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.e$b r1 = r0.f131k
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.g r0 = r0.f128h
                boolean r0 = r1.b(r0)
                if (r0 == 0) goto L_0x001c
                i.f r0 = r3.b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.a()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.c.f2040c, 0, 0);
        this.f136p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f138r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f137q = -1;
        setSaveEnabled(false);
    }

    public boolean a() {
        return c() && this.f128h.getIcon() == null;
    }

    public boolean b() {
        return c();
    }

    public boolean c() {
        return !TextUtils.isEmpty(getText());
    }

    public void d(g gVar, int i2) {
        this.f128h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.getTitleCondensed());
        setId(gVar.f243a);
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f132l == null) {
            this.f132l = new a();
        }
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f129i);
        if (this.f130j != null) {
            if (!((this.f128h.f267y & 4) == 4) || (!this.f134n && !this.f135o)) {
                z2 = false;
            }
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence = null;
        setText(z4 ? this.f129i : null);
        CharSequence charSequence2 = this.f128h.f259q;
        if (TextUtils.isEmpty(charSequence2)) {
            if (z4) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f128h.f247e;
            }
        }
        setContentDescription(charSequence2);
        CharSequence charSequence3 = this.f128h.f260r;
        if (TextUtils.isEmpty(charSequence3)) {
            if (!z4) {
                charSequence = this.f128h.f247e;
            }
            e1.a(this, charSequence);
            return;
        }
        e1.a(this, charSequence3);
    }

    public g getItemData() {
        return this.f128h;
    }

    public void onClick(View view) {
        e.b bVar = this.f131k;
        if (bVar != null) {
            bVar.b(this.f128h);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f134n = e();
        f();
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        boolean c2 = c();
        if (c2 && (i4 = this.f137q) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f136p) : this.f136p;
        if (mode != 1073741824 && this.f136p > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!c2 && this.f130j != null) {
            super.setPadding((getMeasuredWidth() - this.f130j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        l0 l0Var;
        if (!this.f128h.hasSubMenu() || (l0Var = this.f132l) == null || !l0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f135o != z2) {
            this.f135o = z2;
            g gVar = this.f128h;
            if (gVar != null) {
                e eVar = gVar.f256n;
                eVar.f226k = true;
                eVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f130j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.f138r;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            if (intrinsicHeight > i2) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i2) / ((float) intrinsicHeight)));
            } else {
                i2 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i2);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        f();
    }

    public void setItemInvoker(e.b bVar) {
        this.f131k = bVar;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.f137q = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f133m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f129i = charSequence;
        f();
    }
}
