package r1;

import android.graphics.Typeface;
import androidx.activity.result.d;
import o1.e;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    public final Typeface f3817a;

    /* renamed from: b  reason: collision with root package name */
    public final C0049a f3818b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3819c;

    /* renamed from: r1.a$a  reason: collision with other inner class name */
    public interface C0049a {
    }

    public a(C0049a aVar, Typeface typeface) {
        super(3);
        this.f3817a = typeface;
        this.f3818b = aVar;
    }

    public void c(int i2) {
        f(this.f3817a);
    }

    public void d(Typeface typeface, boolean z2) {
        f(typeface);
    }

    public final void f(Typeface typeface) {
        if (!this.f3819c) {
            e eVar = ((o1.d) this.f3818b).f3524a;
            if (eVar.o(typeface)) {
                eVar.k(false);
            }
        }
    }
}
