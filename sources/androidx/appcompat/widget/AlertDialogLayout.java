package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.m0;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.util.WeakHashMap;

public class AlertDialogLayout extends m0 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int l(View view) {
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        int d2 = u.d.d(view);
        if (d2 > 0) {
            return d2;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return l(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L_0x0039
            r4 = 80
            if (r3 == r4) goto L_0x0030
            int r12 = r9.getPaddingTop()
            goto L_0x0043
        L_0x0030:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L_0x0043
        L_0x0039:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L_0x0043:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L_0x004c
            r14 = 0
            goto L_0x0050
        L_0x004c:
            int r14 = r14.getIntrinsicHeight()
        L_0x0050:
            if (r0 >= r1) goto L_0x00af
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto L_0x00ac
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto L_0x00ac
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.appcompat.widget.m0$a r6 = (androidx.appcompat.widget.m0.a) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L_0x0073
            r7 = r2
        L_0x0073:
            java.util.WeakHashMap<android.view.View, g0.x> r8 = g0.u.f3063a
            int r8 = g0.u.e.d(r9)
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L_0x008c
            r8 = 5
            if (r7 == r8) goto L_0x0089
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L_0x0097
        L_0x0089:
            int r7 = r11 - r4
            goto L_0x0094
        L_0x008c:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
        L_0x0094:
            int r8 = r6.rightMargin
            int r7 = r7 - r8
        L_0x0097:
            boolean r8 = r9.k(r0)
            if (r8 == 0) goto L_0x009e
            int r12 = r12 + r14
        L_0x009e:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r5 + r12
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        L_0x00ac:
            int r0 = r0 + 1
            goto L_0x0050
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i2;
        int childCount = getChildCount();
        View view = null;
        boolean z2 = false;
        View view2 = null;
        View view3 = null;
        int i9 = 0;
        while (true) {
            if (i9 < childCount) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.topPanel) {
                        view = childAt;
                    } else if (id == R.id.buttonPanel) {
                        view2 = childAt;
                    } else if ((id == R.id.contentPanel || id == R.id.customPanel) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i9++;
            } else {
                int mode = View.MeasureSpec.getMode(i3);
                int size = View.MeasureSpec.getSize(i3);
                int mode2 = View.MeasureSpec.getMode(i2);
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                if (view != null) {
                    view.measure(i8, 0);
                    paddingBottom += view.getMeasuredHeight();
                    i4 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i4 = 0;
                }
                if (view2 != null) {
                    view2.measure(i8, 0);
                    i6 = l(view2);
                    i5 = view2.getMeasuredHeight() - i6;
                    paddingBottom += i6;
                    i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                if (view3 != null) {
                    view3.measure(i8, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
                    i7 = view3.getMeasuredHeight();
                    paddingBottom += i7;
                    i4 = View.combineMeasuredStates(i4, view3.getMeasuredState());
                } else {
                    i7 = 0;
                }
                int i10 = size - paddingBottom;
                if (view2 != null) {
                    int i11 = paddingBottom - i6;
                    int min = Math.min(i10, i5);
                    if (min > 0) {
                        i10 -= min;
                        i6 += min;
                    }
                    view2.measure(i8, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
                    paddingBottom = i11 + view2.getMeasuredHeight();
                    i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
                }
                if (view3 != null && i10 > 0) {
                    view3.measure(i8, View.MeasureSpec.makeMeasureSpec(i7 + i10, mode));
                    paddingBottom = (paddingBottom - i7) + view3.getMeasuredHeight();
                    i4 = View.combineMeasuredStates(i4, view3.getMeasuredState());
                }
                int i12 = 0;
                for (int i13 = 0; i13 < childCount; i13++) {
                    View childAt2 = getChildAt(i13);
                    if (childAt2.getVisibility() != 8) {
                        i12 = Math.max(i12, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i12, i8, i4), View.resolveSizeAndState(paddingBottom, i3, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i14 = 0; i14 < childCount; i14++) {
                        View childAt3 = getChildAt(i14);
                        if (childAt3.getVisibility() != 8) {
                            m0.a aVar = (m0.a) childAt3.getLayoutParams();
                            if (aVar.width == -1) {
                                int i15 = aVar.height;
                                aVar.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i3, 0);
                                aVar.height = i15;
                            }
                        }
                    }
                }
                z2 = true;
            }
        }
        int i16 = i3;
        if (!z2) {
            super.onMeasure(i2, i3);
        }
    }
}
