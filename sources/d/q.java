package d;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.u;
import com.example.supermarket.R;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m.h;

public class q {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f2770b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f2771c = {16843375};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f2772d = {16844160};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f2773e = {16844156};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f2774f = {16844148};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f2775g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h  reason: collision with root package name */
    public static final h<String, Constructor<? extends View>> f2776h = new h<>();

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f2777a = new Object[2];

    public static class a implements View.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public final View f2778b;

        /* renamed from: c  reason: collision with root package name */
        public final String f2779c;

        /* renamed from: d  reason: collision with root package name */
        public Method f2780d;

        /* renamed from: e  reason: collision with root package name */
        public Context f2781e;

        public a(View view, String str) {
            this.f2778b = view;
            this.f2779c = str;
        }

        public void onClick(View view) {
            String str;
            Method method;
            if (this.f2780d == null) {
                for (Context context = this.f2778b.getContext(); context != null; context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(this.f2779c, new Class[]{View.class})) != null) {
                            this.f2780d = method;
                            this.f2781e = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                }
                int id = this.f2778b.getId();
                if (id == -1) {
                    str = "";
                } else {
                    StringBuilder a2 = androidx.activity.result.a.a(" with id '");
                    a2.append(this.f2778b.getContext().getResources().getResourceEntryName(id));
                    a2.append("'");
                    str = a2.toString();
                }
                StringBuilder a3 = androidx.activity.result.a.a("Could not find method ");
                a3.append(this.f2779c);
                a3.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                a3.append(this.f2778b.getClass());
                a3.append(str);
                throw new IllegalStateException(a3.toString());
            }
            try {
                this.f2780d.invoke(this.f2781e, new Object[]{view});
            } catch (IllegalAccessException e2) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
            } catch (InvocationTargetException e3) {
                throw new IllegalStateException("Could not execute method for android:onClick", e3);
            }
        }
    }

    public d a(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    public f b(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    public g c(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    public u d(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet, R.attr.radioButtonStyle);
    }

    public d0 e(Context context, AttributeSet attributeSet) {
        return new d0(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        h<String, Constructor<? extends View>> hVar = f2776h;
        Constructor<? extends U> orDefault = hVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f2770b);
            hVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return (View) orDefault.newInstance(this.f2777a);
    }

    public final void g(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }
}
