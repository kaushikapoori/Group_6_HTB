package androidx.appcompat.widget;

import android.view.View;
import android.widget.PopupWindow;

public class s extends PopupWindow {
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        r4 = r3.getResourceId(0, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public s(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5) {
        /*
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            int[] r0 = c.c.f2056s
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r0, r4, r5)
            r4 = 2
            boolean r5 = r3.hasValue(r4)
            r0 = 0
            if (r5 == 0) goto L_0x0018
            boolean r4 = r3.getBoolean(r4, r0)
            j0.f.a(r1, r4)
        L_0x0018:
            boolean r4 = r3.hasValue(r0)
            if (r4 == 0) goto L_0x0029
            int r4 = r3.getResourceId(r0, r0)
            if (r4 == 0) goto L_0x0029
            android.graphics.drawable.Drawable r2 = e.a.b(r2, r4)
            goto L_0x002d
        L_0x0029:
            android.graphics.drawable.Drawable r2 = r3.getDrawable(r0)
        L_0x002d:
            r1.setBackgroundDrawable(r2)
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    public void showAsDropDown(View view, int i2, int i3) {
        super.showAsDropDown(view, i2, i3);
    }

    public void showAsDropDown(View view, int i2, int i3, int i4) {
        super.showAsDropDown(view, i2, i3, i4);
    }

    public void update(View view, int i2, int i3, int i4, int i5) {
        super.update(view, i2, i3, i4, i5);
    }
}
