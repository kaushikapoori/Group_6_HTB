package d0;

import android.content.Context;
import d0.j;
import java.util.concurrent.Callable;

public class f implements Callable<j.a> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f2848a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f2849b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e f2850c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2851d;

    public f(String str, Context context, e eVar, int i2) {
        this.f2848a = str;
        this.f2849b = context;
        this.f2850c = eVar;
        this.f2851d = i2;
    }

    public Object call() {
        return j.a(this.f2848a, this.f2849b, this.f2850c, this.f2851d);
    }
}
