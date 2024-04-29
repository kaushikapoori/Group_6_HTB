package androidx.appcompat.widget;

import a0.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import j0.c;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f650a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f651b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f652c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f653d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f654e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f655f;

    public j(CompoundButton compoundButton) {
        this.f650a = compoundButton;
    }

    public void a() {
        Drawable a2 = c.a(this.f650a);
        if (a2 == null) {
            return;
        }
        if (this.f653d || this.f654e) {
            Drawable mutate = a.g(a2).mutate();
            if (this.f653d) {
                mutate.setTintList(this.f651b);
            }
            if (this.f654e) {
                mutate.setTintMode(this.f652c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f650a.getDrawableState());
            }
            this.f650a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039 A[SYNTHETIC, Splitter:B:11:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059 A[Catch:{ all -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c A[Catch:{ all -> 0x0063 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f650a
            android.content.Context r0 = r0.getContext()
            int[] r3 = c.c.f2050m
            r8 = 0
            androidx.appcompat.widget.b1 r0 = androidx.appcompat.widget.b1.q(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f650a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f527b
            r7 = 0
            r4 = r10
            r6 = r11
            g0.u.t(r1, r2, r3, r4, r5, r6, r7)
            r10 = 1
            boolean r11 = r0.o(r10)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x0036
            int r11 = r0.l(r10, r8)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x0036
            android.widget.CompoundButton r1 = r9.f650a     // Catch:{ NotFoundException -> 0x0036 }
            android.content.Context r2 = r1.getContext()     // Catch:{ NotFoundException -> 0x0036 }
            android.graphics.drawable.Drawable r11 = e.a.b(r2, r11)     // Catch:{ NotFoundException -> 0x0036 }
            r1.setButtonDrawable(r11)     // Catch:{ NotFoundException -> 0x0036 }
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 != 0) goto L_0x0052
            boolean r10 = r0.o(r8)     // Catch:{ all -> 0x0063 }
            if (r10 == 0) goto L_0x0052
            int r10 = r0.l(r8, r8)     // Catch:{ all -> 0x0063 }
            if (r10 == 0) goto L_0x0052
            android.widget.CompoundButton r11 = r9.f650a     // Catch:{ all -> 0x0063 }
            android.content.Context r1 = r11.getContext()     // Catch:{ all -> 0x0063 }
            android.graphics.drawable.Drawable r10 = e.a.b(r1, r10)     // Catch:{ all -> 0x0063 }
            r11.setButtonDrawable(r10)     // Catch:{ all -> 0x0063 }
        L_0x0052:
            r10 = 2
            boolean r11 = r0.o(r10)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x0065
            android.widget.CompoundButton r11 = r9.f650a     // Catch:{ all -> 0x0063 }
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch:{ all -> 0x0063 }
            r11.setButtonTintList(r10)     // Catch:{ all -> 0x0063 }
            goto L_0x0065
        L_0x0063:
            r10 = move-exception
            goto L_0x0081
        L_0x0065:
            r10 = 3
            boolean r11 = r0.o(r10)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x007b
            android.widget.CompoundButton r11 = r9.f650a     // Catch:{ all -> 0x0063 }
            r1 = -1
            int r10 = r0.j(r10, r1)     // Catch:{ all -> 0x0063 }
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.i0.d(r10, r1)     // Catch:{ all -> 0x0063 }
            r11.setButtonTintMode(r10)     // Catch:{ all -> 0x0063 }
        L_0x007b:
            android.content.res.TypedArray r10 = r0.f527b
            r10.recycle()
            return
        L_0x0081:
            android.content.res.TypedArray r11 = r0.f527b
            r11.recycle()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.b(android.util.AttributeSet, int):void");
    }
}
