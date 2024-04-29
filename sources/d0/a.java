package d0;

import android.graphics.Typeface;
import y.g;
import z.f;

public class a implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f2836b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Typeface f2837c;

    public a(c cVar, m mVar, Typeface typeface) {
        this.f2836b = mVar;
        this.f2837c = typeface;
    }

    public void run() {
        m mVar = this.f2836b;
        Typeface typeface = this.f2837c;
        g.c cVar = ((f.a) mVar).f4401a;
        if (cVar != null) {
            cVar.e(typeface);
        }
    }
}
