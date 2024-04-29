package d0;

import android.content.Context;
import d0.j;
import java.util.concurrent.Callable;

public class h implements Callable<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2853a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f2854b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f2855c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2856d;

    public h(String str, Context context, e eVar, int i2) {
        this.f2853a = str;
        this.f2854b = context;
        this.f2855c = eVar;
        this.f2856d = i2;
    }

    public Object call() {
        try {
            return j.a(this.f2853a, this.f2854b, this.f2855c, this.f2856d);
        } catch (Throwable unused) {
            return new j.a(-3);
        }
    }
}
