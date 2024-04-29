package o0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.n;

public final class b extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f3495a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile Editable.Factory f3496b;

    /* renamed from: c  reason: collision with root package name */
    public static Class<?> f3497c;

    @SuppressLint({"PrivateApi"})
    public b() {
        try {
            f3497c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f3497c;
        if (cls != null) {
            return new n(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
