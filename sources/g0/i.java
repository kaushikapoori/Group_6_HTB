package g0;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public ViewParent f3052a;

    /* renamed from: b  reason: collision with root package name */
    public ViewParent f3053b;

    /* renamed from: c  reason: collision with root package name */
    public final View f3054c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3055d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f3056e;

    public i(View view) {
        this.f3054c = view;
    }

    public boolean a(float f2, float f3, boolean z2) {
        ViewParent g2;
        if (!this.f3055d || (g2 = g(0)) == null) {
            return false;
        }
        try {
            return g2.onNestedFling(this.f3054c, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    public boolean b(float f2, float f3) {
        ViewParent g2;
        if (!this.f3055d || (g2 = g(0)) == null) {
            return false;
        }
        try {
            return g2.onNestedPreFling(this.f3054c, f2, f3);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedPreFling", e2);
            return false;
        }
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent g2;
        int i5;
        int i6;
        int[] iArr3;
        int i7 = i2;
        int i8 = i3;
        int[] iArr4 = iArr2;
        int i9 = i4;
        if (!this.f3055d || (g2 = g(i9)) == null) {
            return false;
        }
        if (i7 == 0 && i8 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f3054c.getLocationInWindow(iArr4);
            i6 = iArr4[0];
            i5 = iArr4[1];
        } else {
            i6 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f3056e == null) {
                this.f3056e = new int[2];
            }
            iArr3 = this.f3056e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.f3054c;
        if (g2 instanceof j) {
            ((j) g2).n(view, i2, i3, iArr3, i4);
        } else if (i9 == 0) {
            try {
                g2.onNestedPreScroll(view, i2, i8, iArr3);
            } catch (AbstractMethodError e2) {
                AbstractMethodError abstractMethodError = e2;
                Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedPreScroll", abstractMethodError);
            }
        }
        if (iArr4 != null) {
            this.f3054c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i6;
            iArr4[1] = iArr4[1] - i5;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public void d(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        f(i2, i3, i4, i5, (int[]) null, i6, iArr2);
    }

    public boolean e(int i2, int i3, int i4, int i5, int[] iArr) {
        return f(i2, i3, i4, i5, iArr, 0, (int[]) null);
    }

    public final boolean f(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent g2;
        int i7;
        int i8;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i9 = i6;
        if (!this.f3055d || (g2 = g(i9)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f3054c.getLocationInWindow(iArr4);
            i8 = iArr4[0];
            i7 = iArr4[1];
        } else {
            i8 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f3056e == null) {
                this.f3056e = new int[2];
            }
            int[] iArr5 = this.f3056e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f3054c;
        if (g2 instanceof k) {
            ((k) g2).k(view, i2, i3, i4, i5, i6, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i4;
            iArr3[1] = iArr3[1] + i5;
            if (g2 instanceof j) {
                ((j) g2).l(view, i2, i3, i4, i5, i6);
            } else if (i9 == 0) {
                try {
                    g2.onNestedScroll(view, i2, i3, i4, i5);
                } catch (AbstractMethodError e2) {
                    AbstractMethodError abstractMethodError = e2;
                    Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onNestedScroll", abstractMethodError);
                }
            }
        }
        if (iArr4 != null) {
            this.f3054c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i8;
            iArr4[1] = iArr4[1] - i7;
        }
        return true;
    }

    public final ViewParent g(int i2) {
        if (i2 == 0) {
            return this.f3052a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f3053b;
    }

    public boolean h(int i2) {
        return g(i2) != null;
    }

    public boolean i(int i2, int i3) {
        boolean z2;
        if (g(i3) != null) {
            return true;
        }
        if (this.f3055d) {
            View view = this.f3054c;
            for (ViewParent parent = this.f3054c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f3054c;
                boolean z3 = parent instanceof j;
                if (z3) {
                    z2 = ((j) parent).o(view, view2, i2, i3);
                } else {
                    if (i3 == 0) {
                        try {
                            z2 = parent.onStartNestedScroll(view, view2, i2);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    if (i3 == 0) {
                        this.f3052a = parent;
                    } else if (i3 == 1) {
                        this.f3053b = parent;
                    }
                    View view3 = this.f3054c;
                    if (z3) {
                        ((j) parent).i(view, view3, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public void j(int i2) {
        ViewParent g2 = g(i2);
        if (g2 != null) {
            View view = this.f3054c;
            if (g2 instanceof j) {
                ((j) g2).m(view, i2);
            } else if (i2 == 0) {
                try {
                    g2.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + g2 + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                this.f3052a = null;
            } else if (i2 == 1) {
                this.f3053b = null;
            }
        }
    }
}
