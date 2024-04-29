package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: b  reason: collision with root package name */
    public TextView f2503b;

    /* renamed from: c  reason: collision with root package name */
    public Button f2504c;

    /* renamed from: d  reason: collision with root package name */
    public int f2505d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean a(int i2, int i3, int i4) {
        boolean z2;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f2503b.getPaddingTop() == i3 && this.f2503b.getPaddingBottom() == i4) {
            return z2;
        }
        TextView textView = this.f2503b;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        if (u.e.g(textView)) {
            u.e.k(textView, u.e.f(textView), i3, u.e.e(textView), i4);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i3, textView.getPaddingRight(), i4);
        return true;
    }

    public Button getActionView() {
        return this.f2504c;
    }

    public TextView getMessageView() {
        return this.f2503b;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2503b = (TextView) findViewById(R.id.snackbar_text);
        this.f2504c = (Button) findViewById(R.id.snackbar_action);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (a(1, r0, r0 - r2) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (a(0, r0, r0) != false) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto L_0x000b
            return
        L_0x000b:
            android.content.res.Resources r0 = r7.getResources()
            r2 = 2131099785(0x7f060089, float:1.7811933E38)
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            r3 = 2131099784(0x7f060088, float:1.781193E38)
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f2503b
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineCount()
            r4 = 0
            if (r3 <= r1) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            if (r3 == 0) goto L_0x004a
            int r5 = r7.f2505d
            if (r5 <= 0) goto L_0x004a
            android.widget.Button r5 = r7.f2504c
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f2505d
            if (r5 <= r6) goto L_0x004a
            int r2 = r0 - r2
            boolean r0 = r7.a(r1, r0, r2)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x004a:
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r2
        L_0x004e:
            boolean r0 = r7.a(r4, r0, r0)
            if (r0 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            if (r1 == 0) goto L_0x005b
            super.onMeasure(r8, r9)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f2505d = i2;
    }
}
