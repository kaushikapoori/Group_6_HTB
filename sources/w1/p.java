package w1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.o0;
import com.example.supermarket.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import o1.n;
import x1.a;

public class p extends d {

    /* renamed from: f  reason: collision with root package name */
    public final o0 f4286f;

    /* renamed from: g  reason: collision with root package name */
    public final AccessibilityManager f4287g;

    /* renamed from: h  reason: collision with root package name */
    public final Rect f4288h = new Rect();

    /* renamed from: i  reason: collision with root package name */
    public final int f4289i;

    public p(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        Context context2 = getContext();
        TypedArray d2 = n.d(context2, attributeSet, y0.a.f4374k, R.attr.autoCompleteTextViewStyle, 2131755724, new int[0]);
        if (d2.hasValue(0) && d2.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.f4289i = d2.getResourceId(1, R.layout.mtrl_auto_complete_simple_item);
        this.f4287g = (AccessibilityManager) context2.getSystemService("accessibility");
        o0 o0Var = new o0(context2, (AttributeSet) null, R.attr.listPopupWindowStyle, 0);
        this.f4286f = o0Var;
        o0Var.s(true);
        o0Var.f733p = this;
        o0Var.f743z.setInputMethodMode(2);
        o0Var.o(getAdapter());
        o0Var.f734q = new o(this);
        if (d2.hasValue(2)) {
            setSimpleItems(d2.getResourceId(2, 0));
        }
        d2.recycle();
    }

    public static void a(p pVar, Object obj) {
        pVar.setText(pVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public CharSequence getHint() {
        TextInputLayout b2 = b();
        return (b2 == null || !b2.F) ? super.getHint() : b2.getHint();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b2 = b();
        if (b2 != null && b2.F && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i4 = 0;
            if (!(adapter == null || b2 == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                o0 o0Var = this.f4286f;
                int min = Math.min(adapter.getCount(), Math.max(0, !o0Var.a() ? -1 : o0Var.f721d.getSelectedItemPosition()) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable n2 = this.f4286f.n();
                if (n2 != null) {
                    n2.getPadding(this.f4288h);
                    Rect rect = this.f4288h;
                    i5 += rect.left + rect.right;
                }
                i4 = b2.getEndIconView().getMeasuredWidth() + i5;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i4), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f4286f.o(getAdapter());
    }

    public void setSimpleItems(int i2) {
        setSimpleItems(getResources().getStringArray(i2));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.f4289i, strArr));
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.f4287g;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f4286f.i();
        }
    }
}
