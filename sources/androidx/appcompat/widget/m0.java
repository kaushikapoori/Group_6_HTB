package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

public class m0 extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public boolean f698b;

    /* renamed from: c  reason: collision with root package name */
    public int f699c;

    /* renamed from: d  reason: collision with root package name */
    public int f700d;

    /* renamed from: e  reason: collision with root package name */
    public int f701e;

    /* renamed from: f  reason: collision with root package name */
    public int f702f;

    /* renamed from: g  reason: collision with root package name */
    public int f703g;

    /* renamed from: h  reason: collision with root package name */
    public float f704h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f705i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f706j;

    /* renamed from: k  reason: collision with root package name */
    public int[] f707k;

    /* renamed from: l  reason: collision with root package name */
    public Drawable f708l;

    /* renamed from: m  reason: collision with root package name */
    public int f709m;

    /* renamed from: n  reason: collision with root package name */
    public int f710n;

    /* renamed from: o  reason: collision with root package name */
    public int f711o;

    /* renamed from: p  reason: collision with root package name */
    public int f712p;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i2, int i3) {
            super(i2, i3);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public m0(Context context) {
        this(context, (AttributeSet) null);
    }

    public m0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x005a, code lost:
        r14 = r3.getResourceId(5, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m0(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r11.<init>(r12, r13, r14)
            r0 = 1
            r11.f698b = r0
            r1 = -1
            r11.f699c = r1
            r2 = 0
            r11.f700d = r2
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r11.f702f = r3
            int[] r6 = c.c.f2051n
            android.content.res.TypedArray r3 = r12.obtainStyledAttributes(r13, r6, r14, r2)
            r10 = 0
            r4 = r11
            r5 = r12
            r7 = r13
            r8 = r3
            r9 = r14
            g0.u.t(r4, r5, r6, r7, r8, r9, r10)
            int r13 = r3.getInt(r0, r1)
            if (r13 < 0) goto L_0x0029
            r11.setOrientation(r13)
        L_0x0029:
            int r13 = r3.getInt(r2, r1)
            if (r13 < 0) goto L_0x0032
            r11.setGravity(r13)
        L_0x0032:
            r13 = 2
            boolean r13 = r3.getBoolean(r13, r0)
            if (r13 != 0) goto L_0x003c
            r11.setBaselineAligned(r13)
        L_0x003c:
            r13 = 4
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r13 = r3.getFloat(r13, r14)
            r11.f704h = r13
            r13 = 3
            int r13 = r3.getInt(r13, r1)
            r11.f699c = r13
            r13 = 7
            boolean r13 = r3.getBoolean(r13, r2)
            r11.f705i = r13
            r13 = 5
            boolean r14 = r3.hasValue(r13)
            if (r14 == 0) goto L_0x0065
            int r14 = r3.getResourceId(r13, r2)
            if (r14 == 0) goto L_0x0065
            android.graphics.drawable.Drawable r12 = e.a.b(r12, r14)
            goto L_0x0069
        L_0x0065:
            android.graphics.drawable.Drawable r12 = r3.getDrawable(r13)
        L_0x0069:
            r11.setDividerDrawable(r12)
            r12 = 8
            int r12 = r3.getInt(r12, r2)
            r11.f711o = r12
            r12 = 6
            int r12 = r3.getDimensionPixelSize(r12, r2)
            r11.f712p = r12
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void f(Canvas canvas, int i2) {
        this.f708l.setBounds(getPaddingLeft() + this.f712p, i2, (getWidth() - getPaddingRight()) - this.f712p, this.f710n + i2);
        this.f708l.draw(canvas);
    }

    public void g(Canvas canvas, int i2) {
        this.f708l.setBounds(i2, getPaddingTop() + this.f712p, this.f709m + i2, (getHeight() - getPaddingBottom()) - this.f712p);
        this.f708l.draw(canvas);
    }

    public int getBaseline() {
        int i2;
        if (this.f699c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f699c;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.f700d;
                if (this.f701e == 1 && (i2 = this.f702f & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f703g) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f703g;
                    }
                }
                return i4 + ((a) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f699c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f699c;
    }

    public Drawable getDividerDrawable() {
        return this.f708l;
    }

    public int getDividerPadding() {
        return this.f712p;
    }

    public int getDividerWidth() {
        return this.f709m;
    }

    public int getGravity() {
        return this.f702f;
    }

    public int getOrientation() {
        return this.f701e;
    }

    public int getShowDividers() {
        return this.f711o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f704h;
    }

    /* renamed from: h */
    public a generateDefaultLayoutParams() {
        int i2 = this.f701e;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: i */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: j */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public boolean k(int i2) {
        if (i2 == 0) {
            return (this.f711o & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f711o & 4) != 0;
        }
        if ((this.f711o & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        if (this.f708l != null) {
            int i5 = 0;
            if (this.f701e == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i5 < virtualChildCount) {
                    View childAt = getChildAt(i5);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !k(i5))) {
                        f(canvas, (childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.f710n);
                    }
                    i5++;
                }
                if (k(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.f710n : childAt2.getBottom() + ((a) childAt2.getLayoutParams()).bottomMargin);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean b2 = i1.b(this);
            while (i5 < virtualChildCount2) {
                View childAt3 = getChildAt(i5);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !k(i5))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    g(canvas, b2 ? childAt3.getRight() + aVar.rightMargin : (childAt3.getLeft() - aVar.leftMargin) - this.f709m);
                }
                i5++;
            }
            if (k(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (b2) {
                        i4 = childAt4.getLeft();
                        i3 = aVar2.leftMargin;
                    } else {
                        i2 = childAt4.getRight() + aVar2.rightMargin;
                        g(canvas, i2);
                    }
                } else if (b2) {
                    i2 = getPaddingLeft();
                    g(canvas, i2);
                } else {
                    i4 = getWidth();
                    i3 = getPaddingRight();
                }
                i2 = (i4 - i3) - this.f709m;
                g(canvas, i2);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f701e
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 2
            r8 = 1
            if (r1 != r8) goto L_0x00b9
            int r1 = r25.getPaddingLeft()
            int r10 = r29 - r27
            int r11 = r25.getPaddingRight()
            int r11 = r10 - r11
            int r10 = r10 - r1
            int r12 = r25.getPaddingRight()
            int r10 = r10 - r12
            int r12 = r25.getVirtualChildCount()
            int r13 = r0.f702f
            r14 = r13 & 112(0x70, float:1.57E-43)
            r6 = r6 & r13
            if (r14 == r3) goto L_0x0042
            if (r14 == r2) goto L_0x0036
            int r2 = r25.getPaddingTop()
            goto L_0x004d
        L_0x0036:
            int r2 = r25.getPaddingTop()
            int r2 = r2 + r30
            int r2 = r2 - r28
            int r3 = r0.f703g
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0042:
            int r2 = r25.getPaddingTop()
            int r3 = r30 - r28
            int r13 = r0.f703g
            int r3 = r3 - r13
            int r3 = r3 / r7
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r12) goto L_0x01d1
            android.view.View r13 = r0.getChildAt(r3)
            if (r13 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00b3
        L_0x0059:
            int r14 = r13.getVisibility()
            if (r14 == r4) goto L_0x00b3
            int r14 = r13.getMeasuredWidth()
            int r15 = r13.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r13.getLayoutParams()
            r4 = r16
            androidx.appcompat.widget.m0$a r4 = (androidx.appcompat.widget.m0.a) r4
            int r9 = r4.gravity
            if (r9 >= 0) goto L_0x0074
            r9 = r6
        L_0x0074:
            java.util.WeakHashMap<android.view.View, g0.x> r17 = g0.u.f3063a
            int r7 = g0.u.e.d(r25)
            int r7 = android.view.Gravity.getAbsoluteGravity(r9, r7)
            r7 = r7 & 7
            if (r7 == r8) goto L_0x008b
            if (r7 == r5) goto L_0x0088
            int r7 = r4.leftMargin
            int r7 = r7 + r1
            goto L_0x0096
        L_0x0088:
            int r7 = r11 - r14
            goto L_0x0093
        L_0x008b:
            int r7 = r10 - r14
            r9 = 2
            int r7 = r7 / r9
            int r7 = r7 + r1
            int r9 = r4.leftMargin
            int r7 = r7 + r9
        L_0x0093:
            int r9 = r4.rightMargin
            int r7 = r7 - r9
        L_0x0096:
            boolean r9 = r0.k(r3)
            if (r9 == 0) goto L_0x009f
            int r9 = r0.f710n
            int r2 = r2 + r9
        L_0x009f:
            int r9 = r4.topMargin
            int r2 = r2 + r9
            int r9 = r2 + 0
            int r14 = r14 + r7
            int r5 = r15 + r9
            r13.layout(r7, r9, r14, r5)
            int r4 = r4.bottomMargin
            int r15 = r15 + r4
            r4 = 0
            int r15 = r15 + r4
            int r15 = r15 + r2
            int r3 = r3 + 0
            r2 = r15
        L_0x00b3:
            int r3 = r3 + r8
            r4 = 8
            r5 = 5
            r7 = 2
            goto L_0x004e
        L_0x00b9:
            boolean r1 = androidx.appcompat.widget.i1.b(r25)
            int r4 = r25.getPaddingTop()
            int r5 = r30 - r28
            int r7 = r25.getPaddingBottom()
            int r7 = r5 - r7
            int r5 = r5 - r4
            int r9 = r25.getPaddingBottom()
            int r5 = r5 - r9
            int r9 = r25.getVirtualChildCount()
            int r10 = r0.f702f
            r6 = r6 & r10
            r10 = r10 & 112(0x70, float:1.57E-43)
            boolean r11 = r0.f698b
            int[] r12 = r0.f706j
            int[] r13 = r0.f707k
            java.util.WeakHashMap<android.view.View, g0.x> r14 = g0.u.f3063a
            int r14 = g0.u.e.d(r25)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r14)
            if (r6 == r8) goto L_0x00fe
            r14 = 5
            if (r6 == r14) goto L_0x00f2
            int r6 = r25.getPaddingLeft()
            goto L_0x010a
        L_0x00f2:
            int r6 = r25.getPaddingLeft()
            int r6 = r6 + r29
            int r6 = r6 - r27
            int r14 = r0.f703g
            int r6 = r6 - r14
            goto L_0x010a
        L_0x00fe:
            int r6 = r25.getPaddingLeft()
            int r14 = r29 - r27
            int r15 = r0.f703g
            int r14 = r14 - r15
            r15 = 2
            int r14 = r14 / r15
            int r6 = r6 + r14
        L_0x010a:
            if (r1 == 0) goto L_0x0110
            int r1 = r9 + -1
            r15 = -1
            goto L_0x0112
        L_0x0110:
            r1 = 0
            r15 = 1
        L_0x0112:
            r18 = r6
            r6 = 0
        L_0x0115:
            if (r6 >= r9) goto L_0x01d1
            int r19 = r15 * r6
            int r8 = r19 + r1
            android.view.View r2 = r0.getChildAt(r8)
            if (r2 != 0) goto L_0x012d
            int r18 = r18 + 0
        L_0x0123:
            r28 = r1
            r30 = r9
            r22 = r10
            r1 = 0
        L_0x012a:
            r2 = 1
            goto L_0x01c3
        L_0x012d:
            int r3 = r2.getVisibility()
            r14 = 8
            if (r3 == r14) goto L_0x0123
            int r3 = r2.getMeasuredWidth()
            int r21 = r2.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r22 = r2.getLayoutParams()
            r14 = r22
            androidx.appcompat.widget.m0$a r14 = (androidx.appcompat.widget.m0.a) r14
            r28 = r1
            if (r11 == 0) goto L_0x0155
            int r1 = r14.height
            r30 = r9
            r9 = -1
            if (r1 == r9) goto L_0x0157
            int r9 = r2.getBaseline()
            goto L_0x0158
        L_0x0155:
            r30 = r9
        L_0x0157:
            r9 = -1
        L_0x0158:
            int r1 = r14.gravity
            if (r1 >= 0) goto L_0x015d
            r1 = r10
        L_0x015d:
            r1 = r1 & 112(0x70, float:1.57E-43)
            r22 = r10
            r10 = 16
            if (r1 == r10) goto L_0x0195
            r10 = 48
            if (r1 == r10) goto L_0x0186
            r10 = 80
            if (r1 == r10) goto L_0x0170
            r1 = r4
            r10 = -1
            goto L_0x01a1
        L_0x0170:
            int r1 = r7 - r21
            int r10 = r14.bottomMargin
            int r1 = r1 - r10
            r10 = -1
            if (r9 == r10) goto L_0x01a1
            int r23 = r2.getMeasuredHeight()
            int r23 = r23 - r9
            r9 = 2
            r24 = r13[r9]
            int r24 = r24 - r23
            int r1 = r1 - r24
            goto L_0x01a1
        L_0x0186:
            r10 = -1
            int r1 = r14.topMargin
            int r1 = r1 + r4
            if (r9 == r10) goto L_0x01a1
            r20 = 1
            r23 = r12[r20]
            int r23 = r23 - r9
            int r1 = r23 + r1
            goto L_0x01a1
        L_0x0195:
            r10 = -1
            int r1 = r5 - r21
            r9 = 2
            int r1 = r1 / r9
            int r1 = r1 + r4
            int r9 = r14.topMargin
            int r1 = r1 + r9
            int r9 = r14.bottomMargin
            int r1 = r1 - r9
        L_0x01a1:
            boolean r8 = r0.k(r8)
            if (r8 == 0) goto L_0x01ab
            int r8 = r0.f709m
            int r18 = r18 + r8
        L_0x01ab:
            int r8 = r14.leftMargin
            int r18 = r18 + r8
            int r8 = r18 + 0
            int r9 = r3 + r8
            int r10 = r21 + r1
            r2.layout(r8, r1, r9, r10)
            int r1 = r14.rightMargin
            int r3 = r3 + r1
            r1 = 0
            int r3 = r3 + r1
            int r18 = r3 + r18
            int r6 = r6 + 0
            goto L_0x012a
        L_0x01c3:
            int r6 = r6 + r2
            r1 = r28
            r9 = r30
            r10 = r22
            r2 = 80
            r3 = 16
            r8 = 1
            goto L_0x0115
        L_0x01d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02b1, code lost:
        if (r13 < 0) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x072c, code lost:
        if (r7 < 0) goto L_0x072e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02ed  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04bb  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04c0  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x04fd  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0540  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x054f  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0557  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x05f9  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x06d5  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x07bc  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x07e0  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0820  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0829  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0882  */
    /* JADX WARNING: Removed duplicated region for block: B:421:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r38, int r39) {
        /*
            r37 = this;
            r6 = r37
            r7 = r38
            r8 = r39
            int r0 = r6.f701e
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            r4 = 0
            if (r0 != r5) goto L_0x038a
            r6.f703g = r4
            int r3 = r37.getVirtualChildCount()
            int r2 = android.view.View.MeasureSpec.getMode(r38)
            int r1 = android.view.View.MeasureSpec.getMode(r39)
            int r0 = r6.f699c
            boolean r9 = r6.f705i
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 1
            r24 = 0
            r25 = 0
        L_0x0039:
            if (r14 >= r3) goto L_0x0179
            android.view.View r26 = r6.getChildAt(r14)
            if (r26 != 0) goto L_0x0047
            int r5 = r6.f703g
            int r5 = r5 + r4
            r6.f703g = r5
            goto L_0x004f
        L_0x0047:
            int r5 = r26.getVisibility()
            if (r5 != r12) goto L_0x005b
            int r14 = r14 + 0
        L_0x004f:
            r10 = r0
            r28 = r1
            r0 = r2
            r30 = r3
            r4 = r17
            r27 = 1
            goto L_0x0163
        L_0x005b:
            boolean r5 = r6.k(r14)
            if (r5 == 0) goto L_0x0068
            int r5 = r6.f703g
            int r4 = r6.f710n
            int r5 = r5 + r4
            r6.f703g = r5
        L_0x0068:
            android.view.ViewGroup$LayoutParams r4 = r26.getLayoutParams()
            r5 = r4
            androidx.appcompat.widget.m0$a r5 = (androidx.appcompat.widget.m0.a) r5
            float r4 = r5.weight
            float r21 = r21 + r4
            if (r1 != r15) goto L_0x0097
            int r12 = r5.height
            if (r12 != 0) goto L_0x0097
            int r12 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0097
            int r4 = r6.f703g
            int r12 = r5.topMargin
            int r12 = r12 + r4
            int r15 = r5.bottomMargin
            int r12 = r12 + r15
            int r4 = java.lang.Math.max(r4, r12)
            r6.f703g = r4
            r10 = r0
            r28 = r1
            r29 = r2
            r30 = r3
            r13 = r5
            r5 = 1
            r27 = 1
            goto L_0x00eb
        L_0x0097:
            int r12 = r5.height
            if (r12 != 0) goto L_0x00a3
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a3
            r5.height = r10
            r12 = 0
            goto L_0x00a5
        L_0x00a3:
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00a5:
            r4 = 0
            int r15 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x00ae
            int r15 = r6.f703g
            r10 = r0
            goto L_0x00b0
        L_0x00ae:
            r10 = r0
            r15 = 0
        L_0x00b0:
            r0 = r37
            r28 = r1
            r1 = r26
            r29 = r2
            r2 = r38
            r30 = r3
            r3 = r4
            r13 = 0
            r4 = r39
            r13 = r5
            r27 = 1
            r5 = r15
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r12 == r11) goto L_0x00cb
            r13.height = r12
        L_0x00cb:
            int r0 = r26.getMeasuredHeight()
            int r1 = r6.f703g
            int r2 = r1 + r0
            int r3 = r13.topMargin
            int r2 = r2 + r3
            int r3 = r13.bottomMargin
            int r2 = r2 + r3
            r3 = 0
            int r2 = r2 + r3
            int r1 = java.lang.Math.max(r1, r2)
            r6.f703g = r1
            r4 = r18
            if (r9 == 0) goto L_0x00e9
            int r18 = java.lang.Math.max(r0, r4)
        L_0x00e9:
            r5 = r22
        L_0x00eb:
            if (r10 < 0) goto L_0x00f5
            int r0 = r14 + 1
            if (r10 != r0) goto L_0x00f5
            int r0 = r6.f703g
            r6.f700d = r0
        L_0x00f5:
            if (r14 >= r10) goto L_0x0107
            float r0 = r13.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00ff
            goto L_0x0107
        L_0x00ff:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x0107:
            r0 = r29
            r1 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x0116
            int r1 = r13.width
            r2 = -1
            if (r1 != r2) goto L_0x0116
            r1 = 1
            r24 = 1
            goto L_0x0117
        L_0x0116:
            r1 = 0
        L_0x0117:
            int r2 = r13.leftMargin
            int r3 = r13.rightMargin
            int r2 = r2 + r3
            int r3 = r26.getMeasuredWidth()
            int r3 = r3 + r2
            r12 = r17
            int r4 = java.lang.Math.max(r12, r3)
            int r12 = r26.getMeasuredState()
            r15 = r25
            int r12 = android.view.View.combineMeasuredStates(r15, r12)
            if (r23 == 0) goto L_0x013a
            int r15 = r13.width
            r11 = -1
            if (r15 != r11) goto L_0x013a
            r11 = 1
            goto L_0x013b
        L_0x013a:
            r11 = 0
        L_0x013b:
            float r13 = r13.weight
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x014d
            if (r1 == 0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r2 = r3
        L_0x0146:
            r13 = r20
            int r20 = java.lang.Math.max(r13, r2)
            goto L_0x015b
        L_0x014d:
            r13 = r20
            if (r1 == 0) goto L_0x0152
            goto L_0x0153
        L_0x0152:
            r2 = r3
        L_0x0153:
            r1 = r19
            int r19 = java.lang.Math.max(r1, r2)
            r20 = r13
        L_0x015b:
            int r14 = r14 + 0
            r22 = r5
            r23 = r11
            r25 = r12
        L_0x0163:
            int r14 = r14 + 1
            r2 = r0
            r17 = r4
            r0 = r10
            r1 = r28
            r3 = r30
            r4 = 0
            r5 = 1
            r10 = -2
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = 8
            r13 = 0
            r15 = 1073741824(0x40000000, float:2.0)
            goto L_0x0039
        L_0x0179:
            r28 = r1
            r0 = r2
            r30 = r3
            r12 = r17
            r4 = r18
            r1 = r19
            r13 = r20
            r15 = r25
            r27 = 1
            int r2 = r6.f703g
            r10 = r30
            if (r2 <= 0) goto L_0x019d
            boolean r2 = r6.k(r10)
            if (r2 == 0) goto L_0x019d
            int r2 = r6.f703g
            int r3 = r6.f710n
            int r2 = r2 + r3
            r6.f703g = r2
        L_0x019d:
            r2 = r28
            if (r9 == 0) goto L_0x01e3
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L_0x01a7
            if (r2 != 0) goto L_0x01e3
        L_0x01a7:
            r3 = 0
            r6.f703g = r3
            r5 = 0
        L_0x01ab:
            if (r5 >= r10) goto L_0x01e3
            android.view.View r11 = r6.getChildAt(r5)
            if (r11 != 0) goto L_0x01b9
            int r11 = r6.f703g
            int r11 = r11 + r3
            r6.f703g = r11
            goto L_0x01df
        L_0x01b9:
            int r3 = r11.getVisibility()
            r14 = 8
            if (r3 != r14) goto L_0x01c4
            int r5 = r5 + 0
            goto L_0x01df
        L_0x01c4:
            android.view.ViewGroup$LayoutParams r3 = r11.getLayoutParams()
            androidx.appcompat.widget.m0$a r3 = (androidx.appcompat.widget.m0.a) r3
            int r11 = r6.f703g
            int r18 = r11 + r4
            int r14 = r3.topMargin
            int r18 = r18 + r14
            int r3 = r3.bottomMargin
            int r18 = r18 + r3
            r3 = 0
            int r14 = r18 + 0
            int r3 = java.lang.Math.max(r11, r14)
            r6.f703g = r3
        L_0x01df:
            int r5 = r5 + 1
            r3 = 0
            goto L_0x01ab
        L_0x01e3:
            int r3 = r6.f703g
            int r5 = r37.getPaddingTop()
            int r11 = r37.getPaddingBottom()
            int r11 = r11 + r5
            int r11 = r11 + r3
            r6.f703g = r11
            int r3 = r37.getSuggestedMinimumHeight()
            int r3 = java.lang.Math.max(r11, r3)
            r5 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r8, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r3
            int r11 = r6.f703g
            int r5 = r5 - r11
            if (r22 != 0) goto L_0x0250
            if (r5 == 0) goto L_0x020f
            r11 = 0
            int r14 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
            if (r14 <= 0) goto L_0x020f
            goto L_0x0250
        L_0x020f:
            int r1 = java.lang.Math.max(r1, r13)
            if (r9 == 0) goto L_0x024c
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 == r5) goto L_0x024c
            r2 = 0
        L_0x021a:
            if (r2 >= r10) goto L_0x024c
            android.view.View r5 = r6.getChildAt(r2)
            if (r5 == 0) goto L_0x0249
            int r9 = r5.getVisibility()
            r11 = 8
            if (r9 != r11) goto L_0x022b
            goto L_0x0249
        L_0x022b:
            android.view.ViewGroup$LayoutParams r9 = r5.getLayoutParams()
            androidx.appcompat.widget.m0$a r9 = (androidx.appcompat.widget.m0.a) r9
            float r9 = r9.weight
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x0249
            int r9 = r5.getMeasuredWidth()
            r11 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r11)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r11)
            r5.measure(r9, r13)
        L_0x0249:
            int r2 = r2 + 1
            goto L_0x021a
        L_0x024c:
            r17 = r12
            goto L_0x032a
        L_0x0250:
            float r4 = r6.f704h
            r9 = 0
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x0259
            r21 = r4
        L_0x0259:
            r4 = 0
            r6.f703g = r4
            r4 = 0
        L_0x025d:
            if (r4 >= r10) goto L_0x031a
            android.view.View r9 = r6.getChildAt(r4)
            int r11 = r9.getVisibility()
            r13 = 8
            if (r11 != r13) goto L_0x026f
            r28 = r2
            goto L_0x0314
        L_0x026f:
            android.view.ViewGroup$LayoutParams r11 = r9.getLayoutParams()
            androidx.appcompat.widget.m0$a r11 = (androidx.appcompat.widget.m0.a) r11
            float r13 = r11.weight
            r14 = 0
            int r16 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x02c9
            float r14 = (float) r5
            float r14 = r14 * r13
            float r14 = r14 / r21
            int r14 = (int) r14
            float r21 = r21 - r13
            int r5 = r5 - r14
            int r13 = r37.getPaddingLeft()
            int r16 = r37.getPaddingRight()
            int r16 = r16 + r13
            int r13 = r11.leftMargin
            int r16 = r16 + r13
            int r13 = r11.rightMargin
            int r13 = r16 + r13
            r16 = r5
            int r5 = r11.width
            int r5 = android.view.ViewGroup.getChildMeasureSpec(r7, r13, r5)
            int r13 = r11.height
            if (r13 != 0) goto L_0x02ac
            r13 = 1073741824(0x40000000, float:2.0)
            if (r2 == r13) goto L_0x02a8
            goto L_0x02ac
        L_0x02a8:
            if (r14 <= 0) goto L_0x02b3
            r13 = r14
            goto L_0x02b4
        L_0x02ac:
            int r13 = r9.getMeasuredHeight()
            int r13 = r13 + r14
            if (r13 >= 0) goto L_0x02b4
        L_0x02b3:
            r13 = 0
        L_0x02b4:
            r14 = 1073741824(0x40000000, float:2.0)
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r14)
            r9.measure(r5, r13)
            int r5 = r9.getMeasuredState()
            r5 = r5 & -256(0xffffffffffffff00, float:NaN)
            int r15 = android.view.View.combineMeasuredStates(r15, r5)
            r5 = r16
        L_0x02c9:
            int r13 = r11.leftMargin
            int r14 = r11.rightMargin
            int r13 = r13 + r14
            int r14 = r9.getMeasuredWidth()
            int r14 = r14 + r13
            int r12 = java.lang.Math.max(r12, r14)
            r28 = r2
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x02e6
            int r2 = r11.width
            r16 = r5
            r5 = -1
            if (r2 != r5) goto L_0x02e9
            r2 = 1
            goto L_0x02ea
        L_0x02e6:
            r16 = r5
            r5 = -1
        L_0x02e9:
            r2 = 0
        L_0x02ea:
            if (r2 == 0) goto L_0x02ed
            goto L_0x02ee
        L_0x02ed:
            r13 = r14
        L_0x02ee:
            int r1 = java.lang.Math.max(r1, r13)
            if (r23 == 0) goto L_0x02fa
            int r2 = r11.width
            if (r2 != r5) goto L_0x02fa
            r5 = 1
            goto L_0x02fb
        L_0x02fa:
            r5 = 0
        L_0x02fb:
            int r2 = r6.f703g
            int r9 = r9.getMeasuredHeight()
            int r9 = r9 + r2
            int r13 = r11.topMargin
            int r9 = r9 + r13
            int r11 = r11.bottomMargin
            int r9 = r9 + r11
            r11 = 0
            int r9 = r9 + r11
            int r2 = java.lang.Math.max(r2, r9)
            r6.f703g = r2
            r23 = r5
            r5 = r16
        L_0x0314:
            int r4 = r4 + 1
            r2 = r28
            goto L_0x025d
        L_0x031a:
            int r2 = r6.f703g
            int r4 = r37.getPaddingTop()
            int r5 = r37.getPaddingBottom()
            int r5 = r5 + r4
            int r5 = r5 + r2
            r6.f703g = r5
            goto L_0x024c
        L_0x032a:
            if (r23 != 0) goto L_0x0331
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r2) goto L_0x0331
            goto L_0x0333
        L_0x0331:
            r1 = r17
        L_0x0333:
            int r0 = r37.getPaddingLeft()
            int r2 = r37.getPaddingRight()
            int r2 = r2 + r0
            int r2 = r2 + r1
            int r0 = r37.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r2, r0)
            int r0 = android.view.View.resolveSizeAndState(r0, r7, r15)
            r6.setMeasuredDimension(r0, r3)
            if (r24 == 0) goto L_0x08c2
            int r0 = r37.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = 0
        L_0x0359:
            if (r9 >= r10) goto L_0x08c2
            android.view.View r1 = r6.getChildAt(r9)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x0387
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.m0$a r11 = (androidx.appcompat.widget.m0.a) r11
            int r0 = r11.width
            r2 = -1
            if (r0 != r2) goto L_0x0387
            int r12 = r11.height
            int r0 = r1.getMeasuredHeight()
            r11.height = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r7
            r4 = r39
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.height = r12
        L_0x0387:
            int r9 = r9 + 1
            goto L_0x0359
        L_0x038a:
            r27 = 1
            r0 = 0
            r6.f703g = r0
            int r9 = r37.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r38)
            int r11 = android.view.View.MeasureSpec.getMode(r39)
            int[] r0 = r6.f706j
            r12 = 4
            if (r0 == 0) goto L_0x03a4
            int[] r0 = r6.f707k
            if (r0 != 0) goto L_0x03ac
        L_0x03a4:
            int[] r0 = new int[r12]
            r6.f706j = r0
            int[] r0 = new int[r12]
            r6.f707k = r0
        L_0x03ac:
            int[] r13 = r6.f706j
            int[] r14 = r6.f707k
            r15 = 3
            r0 = -1
            r13[r15] = r0
            r18 = 2
            r13[r18] = r0
            r13[r27] = r0
            r1 = 0
            r13[r1] = r0
            r14[r15] = r0
            r14[r18] = r0
            r14[r27] = r0
            r14[r1] = r0
            boolean r5 = r6.f698b
            boolean r4 = r6.f705i
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03d0
            r19 = 1
            goto L_0x03d2
        L_0x03d0:
            r19 = 0
        L_0x03d2:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r8 = 0
            r12 = 0
            r15 = 0
            r22 = 0
            r23 = 1
            r24 = 0
        L_0x03df:
            if (r3 >= r9) goto L_0x0587
            android.view.View r7 = r6.getChildAt(r3)
            if (r7 != 0) goto L_0x03f4
            int r7 = r6.f703g
            r25 = 0
            int r7 = r7 + 0
            r6.f703g = r7
            r25 = r0
            r26 = r2
            goto L_0x0402
        L_0x03f4:
            r25 = r0
            int r0 = r7.getVisibility()
            r26 = r2
            r2 = 8
            if (r0 != r2) goto L_0x040c
            int r3 = r3 + 0
        L_0x0402:
            r29 = r5
            r0 = r25
            r2 = r26
            r26 = r4
            goto L_0x057d
        L_0x040c:
            boolean r0 = r6.k(r3)
            if (r0 == 0) goto L_0x0419
            int r0 = r6.f703g
            int r2 = r6.f709m
            int r0 = r0 + r2
            r6.f703g = r0
        L_0x0419:
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            r2 = r0
            androidx.appcompat.widget.m0$a r2 = (androidx.appcompat.widget.m0.a) r2
            float r0 = r2.weight
            float r28 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x0477
            int r1 = r2.width
            if (r1 != 0) goto L_0x0477
            r1 = 0
            int r29 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r29 <= 0) goto L_0x0477
            if (r19 == 0) goto L_0x0440
            int r0 = r6.f703g
            int r1 = r2.leftMargin
            r29 = r3
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r1 = r1 + r0
            r6.f703g = r1
            goto L_0x0450
        L_0x0440:
            r29 = r3
            int r0 = r6.f703g
            int r1 = r2.leftMargin
            int r1 = r1 + r0
            int r3 = r2.rightMargin
            int r1 = r1 + r3
            int r0 = java.lang.Math.max(r0, r1)
            r6.f703g = r0
        L_0x0450:
            if (r5 == 0) goto L_0x0467
            r0 = 0
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r7.measure(r1, r1)
            r1 = r2
            r32 = r25
            r33 = r26
            r25 = r29
            r26 = r4
            r29 = r5
            goto L_0x04ee
        L_0x0467:
            r1 = r2
            r32 = r25
            r33 = r26
            r25 = r29
            r0 = 1073741824(0x40000000, float:2.0)
            r26 = r4
            r29 = r5
            r5 = 1
            goto L_0x04f2
        L_0x0477:
            r29 = r3
            int r1 = r2.width
            if (r1 != 0) goto L_0x0487
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0488
            r0 = -2
            r2.width = r0
            r3 = 0
            goto L_0x048a
        L_0x0487:
            r1 = 0
        L_0x0488:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x048a:
            int r0 = (r28 > r1 ? 1 : (r28 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0493
            int r0 = r6.f703g
            r30 = r0
            goto L_0x0495
        L_0x0493:
            r30 = 0
        L_0x0495:
            r31 = 0
            r1 = r25
            r0 = r37
            r32 = r1
            r1 = r7
            r34 = r2
            r33 = r26
            r2 = r38
            r35 = r3
            r25 = r29
            r3 = r30
            r26 = r4
            r4 = r39
            r29 = r5
            r5 = r31
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = r35
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x04c0
            r1 = r34
            r1.width = r0
            goto L_0x04c2
        L_0x04c0:
            r1 = r34
        L_0x04c2:
            int r0 = r7.getMeasuredWidth()
            if (r19 == 0) goto L_0x04d6
            int r2 = r6.f703g
            int r3 = r1.leftMargin
            int r3 = r3 + r0
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            r4 = 0
            int r3 = r3 + r4
            int r3 = r3 + r2
            r6.f703g = r3
            goto L_0x04e8
        L_0x04d6:
            r4 = 0
            int r2 = r6.f703g
            int r3 = r2 + r0
            int r5 = r1.leftMargin
            int r3 = r3 + r5
            int r5 = r1.rightMargin
            int r3 = r3 + r5
            int r3 = r3 + r4
            int r2 = java.lang.Math.max(r2, r3)
            r6.f703g = r2
        L_0x04e8:
            if (r26 == 0) goto L_0x04ee
            int r8 = java.lang.Math.max(r0, r8)
        L_0x04ee:
            r5 = r22
            r0 = 1073741824(0x40000000, float:2.0)
        L_0x04f2:
            if (r11 == r0) goto L_0x04fd
            int r0 = r1.height
            r2 = -1
            if (r0 != r2) goto L_0x04fd
            r0 = 1
            r24 = 1
            goto L_0x04fe
        L_0x04fd:
            r0 = 0
        L_0x04fe:
            int r2 = r1.topMargin
            int r3 = r1.bottomMargin
            int r2 = r2 + r3
            int r3 = r7.getMeasuredHeight()
            int r3 = r3 + r2
            int r4 = r7.getMeasuredState()
            int r4 = android.view.View.combineMeasuredStates(r12, r4)
            if (r29 == 0) goto L_0x0540
            int r7 = r7.getBaseline()
            r12 = -1
            if (r7 == r12) goto L_0x0540
            int r12 = r1.gravity
            if (r12 >= 0) goto L_0x051f
            int r12 = r6.f702f
        L_0x051f:
            r12 = r12 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r12 = r12 >> 4
            r22 = -2
            r12 = r12 & -2
            int r12 = r12 >> 1
            r22 = r2
            r2 = r13[r12]
            int r2 = java.lang.Math.max(r2, r7)
            r13[r12] = r2
            r2 = r14[r12]
            int r7 = r3 - r7
            int r2 = java.lang.Math.max(r2, r7)
            r14[r12] = r2
            goto L_0x0542
        L_0x0540:
            r22 = r2
        L_0x0542:
            int r2 = java.lang.Math.max(r15, r3)
            if (r23 == 0) goto L_0x054f
            int r7 = r1.height
            r12 = -1
            if (r7 != r12) goto L_0x054f
            r7 = 1
            goto L_0x0550
        L_0x054f:
            r7 = 0
        L_0x0550:
            float r1 = r1.weight
            r12 = 0
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0562
            if (r0 == 0) goto L_0x055b
            r3 = r22
        L_0x055b:
            r1 = r32
            int r0 = java.lang.Math.max(r1, r3)
            goto L_0x0571
        L_0x0562:
            r1 = r32
            if (r0 == 0) goto L_0x0568
            r3 = r22
        L_0x0568:
            r0 = r33
            int r0 = java.lang.Math.max(r0, r3)
            r33 = r0
            r0 = r1
        L_0x0571:
            int r3 = r25 + 0
            r15 = r2
            r12 = r4
            r22 = r5
            r23 = r7
            r1 = r28
            r2 = r33
        L_0x057d:
            int r3 = r3 + 1
            r7 = r38
            r4 = r26
            r5 = r29
            goto L_0x03df
        L_0x0587:
            r26 = r4
            r29 = r5
            r36 = r2
            r2 = r0
            r0 = r36
            int r3 = r6.f703g
            if (r3 <= 0) goto L_0x05a1
            boolean r3 = r6.k(r9)
            if (r3 == 0) goto L_0x05a1
            int r3 = r6.f703g
            int r4 = r6.f709m
            int r3 = r3 + r4
            r6.f703g = r3
        L_0x05a1:
            r3 = r13[r27]
            r4 = -1
            if (r3 != r4) goto L_0x05b8
            r3 = 0
            r5 = r13[r3]
            if (r5 != r4) goto L_0x05b8
            r3 = r13[r18]
            if (r3 != r4) goto L_0x05b8
            r3 = 3
            r5 = r13[r3]
            if (r5 == r4) goto L_0x05b5
            goto L_0x05b9
        L_0x05b5:
            r25 = r12
            goto L_0x05eb
        L_0x05b8:
            r3 = 3
        L_0x05b9:
            r4 = r13[r3]
            r5 = 0
            r7 = r13[r5]
            r5 = r13[r27]
            r3 = r13[r18]
            int r3 = java.lang.Math.max(r5, r3)
            int r3 = java.lang.Math.max(r7, r3)
            int r3 = java.lang.Math.max(r4, r3)
            r4 = 3
            r5 = r14[r4]
            r4 = 0
            r7 = r14[r4]
            r4 = r14[r27]
            r25 = r12
            r12 = r14[r18]
            int r4 = java.lang.Math.max(r4, r12)
            int r4 = java.lang.Math.max(r7, r4)
            int r4 = java.lang.Math.max(r5, r4)
            int r4 = r4 + r3
            int r15 = java.lang.Math.max(r15, r4)
        L_0x05eb:
            if (r26 == 0) goto L_0x063d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r3) goto L_0x05f3
            if (r10 != 0) goto L_0x063d
        L_0x05f3:
            r3 = 0
            r6.f703g = r3
            r4 = 0
        L_0x05f7:
            if (r4 >= r9) goto L_0x063d
            android.view.View r5 = r6.getChildAt(r4)
            if (r5 != 0) goto L_0x0605
            int r5 = r6.f703g
            int r5 = r5 + r3
            r6.f703g = r5
            goto L_0x0639
        L_0x0605:
            int r3 = r5.getVisibility()
            r7 = 8
            if (r3 != r7) goto L_0x0610
            int r4 = r4 + 0
            goto L_0x0639
        L_0x0610:
            android.view.ViewGroup$LayoutParams r3 = r5.getLayoutParams()
            androidx.appcompat.widget.m0$a r3 = (androidx.appcompat.widget.m0.a) r3
            if (r19 == 0) goto L_0x0626
            int r5 = r6.f703g
            int r7 = r3.leftMargin
            int r7 = r7 + r8
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            r12 = 0
            int r7 = r7 + r12
            int r7 = r7 + r5
            r6.f703g = r7
            goto L_0x0639
        L_0x0626:
            r12 = 0
            int r5 = r6.f703g
            int r7 = r5 + r8
            int r12 = r3.leftMargin
            int r7 = r7 + r12
            int r3 = r3.rightMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            int r3 = java.lang.Math.max(r5, r7)
            r6.f703g = r3
        L_0x0639:
            int r4 = r4 + 1
            r3 = 0
            goto L_0x05f7
        L_0x063d:
            int r3 = r6.f703g
            int r4 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r3
            r6.f703g = r5
            int r3 = r37.getSuggestedMinimumWidth()
            int r3 = java.lang.Math.max(r5, r3)
            r7 = r38
            r4 = 0
            int r3 = android.view.View.resolveSizeAndState(r3, r7, r4)
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            int r5 = r6.f703g
            int r4 = r4 - r5
            if (r22 != 0) goto L_0x06b1
            if (r4 == 0) goto L_0x066b
            r12 = 0
            int r16 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x066b
            goto L_0x06b1
        L_0x066b:
            int r0 = java.lang.Math.max(r0, r2)
            if (r26 == 0) goto L_0x06a8
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 == r1) goto L_0x06a8
            r4 = 0
        L_0x0676:
            if (r4 >= r9) goto L_0x06a8
            android.view.View r1 = r6.getChildAt(r4)
            if (r1 == 0) goto L_0x06a5
            int r2 = r1.getVisibility()
            r10 = 8
            if (r2 != r10) goto L_0x0687
            goto L_0x06a5
        L_0x0687:
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.appcompat.widget.m0$a r2 = (androidx.appcompat.widget.m0.a) r2
            float r2 = r2.weight
            r10 = 0
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 <= 0) goto L_0x06a5
            r2 = 1073741824(0x40000000, float:2.0)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2)
            int r12 = r1.getMeasuredHeight()
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r2)
            r1.measure(r10, r12)
        L_0x06a5:
            int r4 = r4 + 1
            goto L_0x0676
        L_0x06a8:
            r8 = r39
            r22 = r9
            r12 = r25
        L_0x06ae:
            r5 = 0
            goto L_0x0859
        L_0x06b1:
            float r2 = r6.f704h
            r8 = 0
            int r12 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r12 <= 0) goto L_0x06b9
            r1 = r2
        L_0x06b9:
            r2 = 3
            r8 = -1
            r13[r2] = r8
            r13[r18] = r8
            r13[r27] = r8
            r12 = 0
            r13[r12] = r8
            r14[r2] = r8
            r14[r18] = r8
            r14[r27] = r8
            r14[r12] = r8
            r6.f703g = r12
            r8 = r4
            r12 = r25
            r2 = -1
            r4 = 0
        L_0x06d3:
            if (r4 >= r9) goto L_0x0800
            android.view.View r15 = r6.getChildAt(r4)
            if (r15 == 0) goto L_0x07e9
            int r5 = r15.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x06e5
            goto L_0x07e9
        L_0x06e5:
            android.view.ViewGroup$LayoutParams r5 = r15.getLayoutParams()
            androidx.appcompat.widget.m0$a r5 = (androidx.appcompat.widget.m0.a) r5
            float r7 = r5.weight
            r17 = 0
            int r22 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r22 <= 0) goto L_0x0748
            r22 = r9
            float r9 = (float) r8
            float r9 = r9 * r7
            float r9 = r9 / r1
            int r9 = (int) r9
            float r1 = r1 - r7
            int r8 = r8 - r9
            int r7 = r37.getPaddingTop()
            int r25 = r37.getPaddingBottom()
            int r25 = r25 + r7
            int r7 = r5.topMargin
            int r25 = r25 + r7
            int r7 = r5.bottomMargin
            int r7 = r25 + r7
            r25 = r1
            int r1 = r5.height
            r26 = r8
            r8 = r39
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r8, r7, r1)
            int r7 = r5.width
            if (r7 != 0) goto L_0x0727
            r7 = 1073741824(0x40000000, float:2.0)
            if (r10 == r7) goto L_0x0723
            goto L_0x0727
        L_0x0723:
            if (r9 <= 0) goto L_0x072e
            r7 = r9
            goto L_0x072f
        L_0x0727:
            int r7 = r15.getMeasuredWidth()
            int r7 = r7 + r9
            if (r7 >= 0) goto L_0x072f
        L_0x072e:
            r7 = 0
        L_0x072f:
            r9 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r9)
            r15.measure(r7, r1)
            int r1 = r15.getMeasuredState()
            r7 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r7
            int r12 = android.view.View.combineMeasuredStates(r12, r1)
            r1 = r25
            r7 = r26
            goto L_0x074d
        L_0x0748:
            r7 = r8
            r22 = r9
            r8 = r39
        L_0x074d:
            if (r19 == 0) goto L_0x0769
            int r9 = r6.f703g
            int r25 = r15.getMeasuredWidth()
            r26 = r1
            int r1 = r5.leftMargin
            int r25 = r25 + r1
            int r1 = r5.rightMargin
            int r25 = r25 + r1
            r1 = 0
            int r25 = r25 + 0
            int r9 = r25 + r9
            r6.f703g = r9
            r28 = r7
            goto L_0x0787
        L_0x0769:
            r26 = r1
            r1 = 0
            int r9 = r6.f703g
            int r25 = r15.getMeasuredWidth()
            int r25 = r25 + r9
            int r1 = r5.leftMargin
            int r25 = r25 + r1
            int r1 = r5.rightMargin
            int r25 = r25 + r1
            r28 = r7
            r1 = 0
            int r7 = r25 + 0
            int r1 = java.lang.Math.max(r9, r7)
            r6.f703g = r1
        L_0x0787:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x0792
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x0792
            r1 = 1
            goto L_0x0793
        L_0x0792:
            r1 = 0
        L_0x0793:
            int r7 = r5.topMargin
            int r9 = r5.bottomMargin
            int r7 = r7 + r9
            int r9 = r15.getMeasuredHeight()
            int r9 = r9 + r7
            int r2 = java.lang.Math.max(r2, r9)
            if (r1 == 0) goto L_0x07a4
            goto L_0x07a5
        L_0x07a4:
            r7 = r9
        L_0x07a5:
            int r0 = java.lang.Math.max(r0, r7)
            if (r23 == 0) goto L_0x07b2
            int r1 = r5.height
            r7 = -1
            if (r1 != r7) goto L_0x07b3
            r1 = 1
            goto L_0x07b4
        L_0x07b2:
            r7 = -1
        L_0x07b3:
            r1 = 0
        L_0x07b4:
            if (r29 == 0) goto L_0x07e0
            int r15 = r15.getBaseline()
            if (r15 == r7) goto L_0x07e0
            int r5 = r5.gravity
            if (r5 >= 0) goto L_0x07c2
            int r5 = r6.f702f
        L_0x07c2:
            r5 = r5 & 112(0x70, float:1.57E-43)
            r21 = 4
            int r5 = r5 >> 4
            r25 = -2
            r5 = r5 & -2
            int r5 = r5 >> 1
            r7 = r13[r5]
            int r7 = java.lang.Math.max(r7, r15)
            r13[r5] = r7
            r7 = r14[r5]
            int r9 = r9 - r15
            int r7 = java.lang.Math.max(r7, r9)
            r14[r5] = r7
            goto L_0x07e4
        L_0x07e0:
            r21 = 4
            r25 = -2
        L_0x07e4:
            r23 = r1
            r1 = r26
            goto L_0x07f6
        L_0x07e9:
            r7 = r8
            r22 = r9
            r17 = 0
            r21 = 4
            r25 = -2
            r8 = r39
            r28 = r7
        L_0x07f6:
            int r4 = r4 + 1
            r7 = r38
            r9 = r22
            r8 = r28
            goto L_0x06d3
        L_0x0800:
            r8 = r39
            r22 = r9
            int r1 = r6.f703g
            int r4 = r37.getPaddingLeft()
            int r5 = r37.getPaddingRight()
            int r5 = r5 + r4
            int r5 = r5 + r1
            r6.f703g = r5
            r1 = r13[r27]
            r4 = -1
            if (r1 != r4) goto L_0x0829
            r1 = 0
            r5 = r13[r1]
            if (r5 != r4) goto L_0x0829
            r1 = r13[r18]
            if (r1 != r4) goto L_0x0829
            r1 = 3
            r5 = r13[r1]
            if (r5 == r4) goto L_0x0826
            goto L_0x082a
        L_0x0826:
            r15 = r2
            goto L_0x06ae
        L_0x0829:
            r1 = 3
        L_0x082a:
            r4 = r13[r1]
            r5 = 0
            r7 = r13[r5]
            r9 = r13[r27]
            r10 = r13[r18]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r4 = java.lang.Math.max(r4, r7)
            r1 = r14[r1]
            r7 = r14[r5]
            r9 = r14[r27]
            r10 = r14[r18]
            int r9 = java.lang.Math.max(r9, r10)
            int r7 = java.lang.Math.max(r7, r9)
            int r1 = java.lang.Math.max(r1, r7)
            int r1 = r1 + r4
            int r1 = java.lang.Math.max(r2, r1)
            r15 = r1
        L_0x0859:
            if (r23 != 0) goto L_0x0860
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x0860
            goto L_0x0861
        L_0x0860:
            r0 = r15
        L_0x0861:
            int r1 = r37.getPaddingTop()
            int r2 = r37.getPaddingBottom()
            int r2 = r2 + r1
            int r2 = r2 + r0
            int r0 = r37.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r2, r0)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r12
            r1 = r1 | r3
            int r2 = r12 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r8, r2)
            r6.setMeasuredDimension(r1, r0)
            if (r24 == 0) goto L_0x08c2
            int r0 = r37.getMeasuredHeight()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r22
            r8 = 0
        L_0x088f:
            if (r8 >= r9) goto L_0x08c2
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r10 = 8
            if (r0 == r10) goto L_0x08be
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r11 = r0
            androidx.appcompat.widget.m0$a r11 = (androidx.appcompat.widget.m0.a) r11
            int r0 = r11.height
            r12 = -1
            if (r0 != r12) goto L_0x08bf
            int r13 = r11.width
            int r0 = r1.getMeasuredWidth()
            r11.width = r0
            r3 = 0
            r5 = 0
            r0 = r37
            r2 = r38
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r11.width = r13
            goto L_0x08bf
        L_0x08be:
            r12 = -1
        L_0x08bf:
            int r8 = r8 + 1
            goto L_0x088f
        L_0x08c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z2) {
        this.f698b = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            StringBuilder a2 = androidx.activity.result.a.a("base aligned child index out of range (0, ");
            a2.append(getChildCount());
            a2.append(")");
            throw new IllegalArgumentException(a2.toString());
        }
        this.f699c = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f708l) {
            this.f708l = drawable;
            boolean z2 = false;
            if (drawable != null) {
                this.f709m = drawable.getIntrinsicWidth();
                this.f710n = drawable.getIntrinsicHeight();
            } else {
                this.f709m = 0;
                this.f710n = 0;
            }
            if (drawable == null) {
                z2 = true;
            }
            setWillNotDraw(z2);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.f712p = i2;
    }

    public void setGravity(int i2) {
        if (this.f702f != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f702f = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.f702f;
        if ((8388615 & i4) != i3) {
            this.f702f = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f705i = z2;
    }

    public void setOrientation(int i2) {
        if (this.f701e != i2) {
            this.f701e = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f711o) {
            requestLayout();
        }
        this.f711o = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f702f;
        if ((i4 & 112) != i3) {
            this.f702f = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f704h = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
