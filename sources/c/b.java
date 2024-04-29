package c;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.j1;
import g0.u;
import g0.x;
import java.util.WeakHashMap;
import u1.d;
import u1.e;
import u1.g;
import u1.i;
import z.a;

public class b {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        r0 = r2.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0005
            java.lang.String r2 = "null"
            goto L_0x0039
        L_0x0005:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x0029
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x0029
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x0029:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
        L_0x0039:
            r3.append(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a(java.lang.Object, java.lang.StringBuilder):void");
    }

    public static int b(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static d c(int i2) {
        if (i2 == 0) {
            return new i();
        }
        if (i2 != 1) {
            return new i();
        }
        return new e();
    }

    public static float d(float f2, float f3, float f4, float f5) {
        return (float) Math.hypot((double) (f4 - f2), (double) (f5 - f3));
    }

    public static int e(Context context, int i2, int i3) {
        TypedValue a2 = r1.b.a(context, i2);
        return a2 != null ? a2.data : i3;
    }

    public static int f(View view, int i2) {
        return r1.b.c(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static boolean g(int i2) {
        if (i2 != 0) {
            ThreadLocal<double[]> threadLocal = a.f4390a;
            double[] dArr = threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i2);
            int green = Color.green(i2);
            int blue = Color.blue(i2);
            if (dArr.length == 3) {
                double d2 = ((double) red) / 255.0d;
                double pow = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                double d3 = ((double) green) / 255.0d;
                double pow2 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                double[] dArr2 = dArr;
                double d4 = ((double) blue) / 255.0d;
                double pow3 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
                dArr2[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                dArr2[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr2[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (dArr2[1] / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        }
        return false;
    }

    public static int h(int i2, int i3, float f2) {
        return a.b(a.e(i3, Math.round(((float) Color.alpha(i3)) * f2)), i2);
    }

    public static float i(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static InputConnection j(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof j1) {
                    editorInfo.hintText = ((j1) parent).a();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }

    public static void k(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            g gVar = (g) background;
            g.b bVar = gVar.f3911b;
            if (bVar.f3949o != f2) {
                bVar.f3949o = f2;
                gVar.x();
            }
        }
    }

    public static void l(View view, g gVar) {
        l1.a aVar = gVar.f3911b.f3936b;
        if (aVar != null && aVar.f3323a) {
            float f2 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                f2 += u.i.i((View) parent);
            }
            g.b bVar = gVar.f3911b;
            if (bVar.f3948n != f2) {
                bVar.f3948n = f2;
                gVar.x();
            }
        }
    }
}
