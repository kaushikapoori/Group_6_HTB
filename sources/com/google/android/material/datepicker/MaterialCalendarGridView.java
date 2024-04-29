package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.example.supermarket.R;
import f0.b;
import g0.u;
import java.util.Calendar;
import java.util.Iterator;
import o1.s;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f2300b = b0.e();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f2301c;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (o.j0(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.f2301c = o.k0(getContext(), R.attr.nestedScrollable);
        u.u(this, new n(this));
    }

    /* renamed from: a */
    public u getAdapter() {
        return (u) super.getAdapter();
    }

    public final View b(int i2) {
        return getChildAt(i2 - getFirstVisiblePosition());
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        u a2 = getAdapter();
        d<?> dVar = a2.f2396c;
        c cVar = a2.f2398e;
        int max = Math.max(a2.b(), getFirstVisiblePosition());
        int min = Math.min(a2.d(), getLastVisiblePosition());
        Long c2 = a2.getItem(max);
        Long c3 = a2.getItem(min);
        Iterator<b<Long, Long>> it = dVar.g().iterator();
        while (it.hasNext()) {
            b next = it.next();
            F f2 = next.f2983a;
            if (f2 == null) {
                materialCalendarGridView = this;
            } else if (next.f2984b != null) {
                long longValue = ((Long) f2).longValue();
                long longValue2 = ((Long) next.f2984b).longValue();
                Long valueOf = Long.valueOf(longValue);
                Long valueOf2 = Long.valueOf(longValue2);
                if (!(c2 == null || c3 == null || valueOf == null || valueOf2 == null || valueOf.longValue() > c3.longValue() || valueOf2.longValue() < c2.longValue())) {
                    boolean a3 = s.a(this);
                    if (longValue < c2.longValue()) {
                        if (max % a2.f2395b.f2390e == 0) {
                            i9 = 0;
                        } else {
                            View b2 = materialCalendarGridView.b(max - 1);
                            i9 = !a3 ? b2.getRight() : b2.getLeft();
                        }
                        i2 = i9;
                        i3 = max;
                    } else {
                        materialCalendarGridView.f2300b.setTimeInMillis(longValue);
                        i3 = a2.a(materialCalendarGridView.f2300b.get(5));
                        View b3 = materialCalendarGridView.b(i3);
                        i2 = (b3.getWidth() / 2) + b3.getLeft();
                    }
                    if (longValue2 > c3.longValue()) {
                        if ((min + 1) % a2.f2395b.f2390e == 0) {
                            i8 = getWidth();
                        } else {
                            View b4 = materialCalendarGridView.b(min);
                            i8 = !a3 ? b4.getRight() : b4.getLeft();
                        }
                        i4 = i8;
                        i5 = min;
                    } else {
                        materialCalendarGridView.f2300b.setTimeInMillis(longValue2);
                        i5 = a2.a(materialCalendarGridView.f2300b.get(5));
                        View b5 = materialCalendarGridView.b(i5);
                        i4 = (b5.getWidth() / 2) + b5.getLeft();
                    }
                    int itemId = (int) a2.getItemId(i3);
                    int i10 = max;
                    int i11 = min;
                    int itemId2 = (int) a2.getItemId(i5);
                    while (itemId <= itemId2) {
                        int numColumns = getNumColumns() * itemId;
                        int numColumns2 = (getNumColumns() + numColumns) - 1;
                        View b6 = materialCalendarGridView.b(numColumns);
                        int top = b6.getTop() + cVar.f2324a.f2317a.top;
                        u uVar = a2;
                        int bottom = b6.getBottom() - cVar.f2324a.f2317a.bottom;
                        if (!a3) {
                            i7 = numColumns > i3 ? 0 : i2;
                            i6 = i5 > numColumns2 ? getWidth() : i4;
                        } else {
                            int i12 = i5 > numColumns2 ? 0 : i4;
                            i6 = numColumns > i3 ? getWidth() : i2;
                            i7 = i12;
                        }
                        canvas.drawRect((float) i7, (float) top, (float) i6, (float) bottom, cVar.f2331h);
                        itemId++;
                        materialCalendarGridView = this;
                        it = it;
                        a2 = uVar;
                    }
                    materialCalendarGridView = this;
                    max = i10;
                    min = i11;
                }
            }
        }
    }

    public void onFocusChanged(boolean z2, int i2, Rect rect) {
        int i3;
        if (z2) {
            if (i2 == 33) {
                i3 = getAdapter().d();
            } else if (i2 == 130) {
                i3 = getAdapter().b();
            } else {
                super.onFocusChanged(true, i2, rect);
                return;
            }
            setSelection(i3);
            return;
        }
        super.onFocusChanged(false, i2, rect);
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().b()) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(getAdapter().b());
        return true;
    }

    public void onMeasure(int i2, int i3) {
        if (this.f2301c) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i2, i3);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof u) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), u.class.getCanonicalName()}));
        }
    }

    public void setSelection(int i2) {
        if (i2 < getAdapter().b()) {
            i2 = getAdapter().b();
        }
        super.setSelection(i2);
    }
}
