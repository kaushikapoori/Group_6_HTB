package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p.h;
import s.d;
import s.e;

public abstract class a extends View {

    /* renamed from: b  reason: collision with root package name */
    public int[] f908b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    public int f909c;

    /* renamed from: d  reason: collision with root package name */
    public Context f910d;

    /* renamed from: e  reason: collision with root package name */
    public h f911e;

    /* renamed from: f  reason: collision with root package name */
    public String f912f;

    /* renamed from: g  reason: collision with root package name */
    public String f913g;

    /* renamed from: h  reason: collision with root package name */
    public View[] f914h = null;

    /* renamed from: i  reason: collision with root package name */
    public HashMap<Integer, String> f915i = new HashMap<>();

    public a(Context context) {
        super(context);
        this.f910d = context;
        i((AttributeSet) null);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f910d = context;
        i(attributeSet);
    }

    public final void c(String str) {
        if (str != null && str.length() != 0 && this.f910d != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            ConstraintLayout constraintLayout2 = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
            int i2 = 0;
            if (isInEditMode() && constraintLayout2 != null) {
                Object c2 = constraintLayout2.c(0, trim);
                if (c2 instanceof Integer) {
                    i2 = ((Integer) c2).intValue();
                }
            }
            if (i2 == 0 && constraintLayout2 != null) {
                i2 = h(constraintLayout2, trim);
            }
            if (i2 == 0) {
                try {
                    i2 = d.class.getField(trim).getInt((Object) null);
                } catch (Exception unused) {
                }
            }
            if (i2 == 0) {
                i2 = this.f910d.getResources().getIdentifier(trim, "id", this.f910d.getPackageName());
            }
            if (i2 != 0) {
                this.f915i.put(Integer.valueOf(i2), trim);
                d(i2);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void d(int i2) {
        if (i2 != getId()) {
            int i3 = this.f909c + 1;
            int[] iArr = this.f908b;
            if (i3 > iArr.length) {
                this.f908b = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f908b;
            int i4 = this.f909c;
            iArr2[i4] = i2;
            this.f909c = i4 + 1;
        }
    }

    public final void e(String str) {
        if (str != null && str.length() != 0 && this.f910d != null) {
            String trim = str.trim();
            ConstraintLayout constraintLayout = null;
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            }
            if (constraintLayout == null) {
                Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
                return;
            }
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof ConstraintLayout.a) && trim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                    if (childAt.getId() == -1) {
                        StringBuilder a2 = androidx.activity.result.a.a("to use ConstraintTag view ");
                        a2.append(childAt.getClass().getSimpleName());
                        a2.append(" must have an ID");
                        Log.w("ConstraintHelper", a2.toString());
                    } else {
                        d(childAt.getId());
                    }
                }
            }
        }
    }

    public void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i2 = 0; i2 < this.f909c; i2++) {
            View d2 = constraintLayout.d(this.f908b[i2]);
            if (d2 != null) {
                d2.setVisibility(visibility);
                if (elevation > 0.0f) {
                    d2.setTranslationZ(d2.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f908b, this.f909c);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || (resources = this.f910d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f3864b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f912f = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f913g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(p.e eVar, boolean z2) {
    }

    public void k() {
        if (this.f911e != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).f888q0 = (p.e) this.f911e;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f912f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f913g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f912f = str;
        if (str != null) {
            int i2 = 0;
            this.f909c = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    c(str.substring(i2));
                    return;
                } else {
                    c(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f913g = str;
        if (str != null) {
            int i2 = 0;
            this.f909c = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    e(str.substring(i2));
                    return;
                } else {
                    e(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f912f = null;
        this.f909c = 0;
        for (int d2 : iArr) {
            d(d2);
        }
    }

    public void setTag(int i2, Object obj) {
        super.setTag(i2, obj);
        if (obj == null && this.f912f == null) {
            d(i2);
        }
    }
}
