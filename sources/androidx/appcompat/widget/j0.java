package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.example.supermarket.R;
import f.d;
import j0.e;
import java.lang.reflect.Field;

public class j0 extends ListView {

    /* renamed from: b  reason: collision with root package name */
    public final Rect f656b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public int f657c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f658d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f659e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f660f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f661g;

    /* renamed from: h  reason: collision with root package name */
    public Field f662h;

    /* renamed from: i  reason: collision with root package name */
    public a f663i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f664j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f665k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f666l;

    /* renamed from: m  reason: collision with root package name */
    public e f667m;

    /* renamed from: n  reason: collision with root package name */
    public b f668n;

    public static class a extends d {

        /* renamed from: c  reason: collision with root package name */
        public boolean f669c = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        public void draw(Canvas canvas) {
            if (this.f669c) {
                this.f2980b.draw(canvas);
            }
        }

        public void setHotspot(float f2, float f3) {
            if (this.f669c) {
                this.f2980b.setHotspot(f2, f3);
            }
        }

        public void setHotspotBounds(int i2, int i3, int i4, int i5) {
            if (this.f669c) {
                this.f2980b.setHotspotBounds(i2, i3, i4, i5);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.f669c) {
                return this.f2980b.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z2, boolean z3) {
            if (this.f669c) {
                return super.setVisible(z2, z3);
            }
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            j0 j0Var = j0.this;
            j0Var.f668n = null;
            j0Var.drawableStateChanged();
        }
    }

    public j0(Context context, boolean z2) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.f665k = z2;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f662h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z2) {
        a aVar = this.f663i;
        if (aVar != null) {
            aVar.f669c = z2;
        }
    }

    public int a(int i2, int i3, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i5 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i5;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            view.measure(i2, i9 > 0 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i3) {
                return (i4 < 0 || i6 <= i4 || i8 <= 0 || i5 == i3) ? i3 : i8;
            }
            if (i4 >= 0 && i6 >= i4) {
                i8 = i5;
            }
            i6++;
        }
        return i5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 != 3) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0157  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L_0x0016
            r0 = 2
            if (r3 == r0) goto L_0x0014
            r0 = 3
            if (r3 == r0) goto L_0x001d
            goto L_0x0121
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0020
        L_0x001d:
            r0 = 0
            goto L_0x0122
        L_0x0020:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0033
            goto L_0x0123
        L_0x0033:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f666l = r5
            r1.drawableHotspotChanged(r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x004d
            r1.setPressed(r5)
        L_0x004d:
            r16.layoutChildren()
            int r0 = r1.f661g
            if (r0 == r9) goto L_0x006a
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006a
            if (r0 == r10) goto L_0x006a
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006a
            r0.setPressed(r4)
        L_0x006a:
            r1.f661g = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            r10.drawableHotspotChanged(r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0086
            r10.setPressed(r5)
        L_0x0086:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0090
            if (r8 == r9) goto L_0x0090
            r12 = 1
            goto L_0x0091
        L_0x0090:
            r12 = 0
        L_0x0091:
            if (r12 == 0) goto L_0x0096
            r11.setVisible(r4, r4)
        L_0x0096:
            android.graphics.Rect r0 = r1.f656b
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            r0.set(r13, r14, r15, r5)
            int r5 = r0.left
            int r13 = r1.f657c
            int r5 = r5 - r13
            r0.left = r5
            int r5 = r0.top
            int r13 = r1.f658d
            int r5 = r5 - r13
            r0.top = r5
            int r5 = r0.right
            int r13 = r1.f659e
            int r5 = r5 + r13
            r0.right = r5
            int r5 = r0.bottom
            int r13 = r1.f660f
            int r5 = r5 + r13
            r0.bottom = r5
            java.lang.reflect.Field r0 = r1.f662h     // Catch:{ IllegalAccessException -> 0x00e7 }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00e7 }
            boolean r5 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00e7 }
            if (r5 == r0) goto L_0x00eb
            java.lang.reflect.Field r5 = r1.f662h     // Catch:{ IllegalAccessException -> 0x00e7 }
            if (r0 != 0) goto L_0x00d9
            r0 = 1
            goto L_0x00da
        L_0x00d9:
            r0 = 0
        L_0x00da:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00e7 }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00e7 }
            if (r8 == r9) goto L_0x00eb
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00e7 }
            goto L_0x00eb
        L_0x00e7:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00eb:
            if (r12 == 0) goto L_0x0106
            android.graphics.Rect r0 = r1.f656b
            float r5 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x00ff
            r12 = 1
            goto L_0x0100
        L_0x00ff:
            r12 = 0
        L_0x0100:
            r11.setVisible(r12, r4)
            r11.setHotspot(r5, r0)
        L_0x0106:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0111
            if (r8 == r9) goto L_0x0111
            r0.setHotspot(r7, r6)
        L_0x0111:
            r1.setSelectorEnabled(r4)
            r16.refreshDrawableState()
            r5 = 1
            if (r3 != r5) goto L_0x0121
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x0121:
            r0 = 1
        L_0x0122:
            r5 = 0
        L_0x0123:
            if (r0 == 0) goto L_0x0127
            if (r5 == 0) goto L_0x013f
        L_0x0127:
            r1.f666l = r4
            r1.setPressed(r4)
            r16.drawableStateChanged()
            int r3 = r1.f661g
            int r5 = r16.getFirstVisiblePosition()
            int r3 = r3 - r5
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L_0x013f
            r3.setPressed(r4)
        L_0x013f:
            if (r0 == 0) goto L_0x0157
            j0.e r3 = r1.f667m
            if (r3 != 0) goto L_0x014c
            j0.e r3 = new j0.e
            r3.<init>(r1)
            r1.f667m = r3
        L_0x014c:
            j0.e r3 = r1.f667m
            boolean r4 = r3.f3249q
            r4 = 1
            r3.f3249q = r4
            r3.onTouch(r1, r2)
            goto L_0x0164
        L_0x0157:
            j0.e r2 = r1.f667m
            if (r2 == 0) goto L_0x0164
            boolean r3 = r2.f3249q
            if (r3 == 0) goto L_0x0162
            r2.d()
        L_0x0162:
            r2.f3249q = r4
        L_0x0164:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j0.b(android.view.MotionEvent, int):boolean");
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.f666l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f656b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f656b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f668n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            c();
        }
    }

    public boolean hasFocus() {
        return this.f665k || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.f665k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.f665k || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.f665k && this.f664j) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.f668n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f668n == null) {
            b bVar = new b();
            this.f668n = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f661g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f668n;
        if (bVar != null) {
            j0 j0Var = j0.this;
            j0Var.f668n = null;
            j0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.f664j = z2;
    }

    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f663i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f657c = rect.left;
        this.f658d = rect.top;
        this.f659e = rect.right;
        this.f660f = rect.bottom;
    }
}
