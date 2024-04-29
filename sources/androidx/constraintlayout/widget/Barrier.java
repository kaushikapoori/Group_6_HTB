package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p.a;
import s.e;

public class Barrier extends a {

    /* renamed from: j  reason: collision with root package name */
    public int f834j;

    /* renamed from: k  reason: collision with root package name */
    public int f835k;

    /* renamed from: l  reason: collision with root package name */
    public a f836l;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f836l.f3609u0;
    }

    public int getMargin() {
        return this.f836l.f3610v0;
    }

    public int getType() {
        return this.f834j;
    }

    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f836l = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f3864b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f836l.f3609u0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f836l.f3610v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f911e = this.f836l;
        k();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r0 == 6) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r0 == 6) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(p.e r4, boolean r5) {
        /*
            r3 = this;
            int r0 = r3.f834j
            r3.f835k = r0
            r1 = 6
            r2 = 5
            if (r5 == 0) goto L_0x000e
            if (r0 != r2) goto L_0x000b
            goto L_0x0016
        L_0x000b:
            if (r0 != r1) goto L_0x0018
            goto L_0x0010
        L_0x000e:
            if (r0 != r2) goto L_0x0014
        L_0x0010:
            r5 = 0
        L_0x0011:
            r3.f835k = r5
            goto L_0x0018
        L_0x0014:
            if (r0 != r1) goto L_0x0018
        L_0x0016:
            r5 = 1
            goto L_0x0011
        L_0x0018:
            boolean r5 = r4 instanceof p.a
            if (r5 == 0) goto L_0x0022
            p.a r4 = (p.a) r4
            int r5 = r3.f835k
            r4.f3608t0 = r5
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.j(p.e, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f836l.f3609u0 = z2;
    }

    public void setDpMargin(int i2) {
        this.f836l.f3610v0 = (int) ((((float) i2) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.f836l.f3610v0 = i2;
    }

    public void setType(int i2) {
        this.f834j = i2;
    }
}
