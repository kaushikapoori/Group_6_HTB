package o1;

import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.activity.result.d;
import java.lang.ref.WeakReference;

public class l {

    /* renamed from: a  reason: collision with root package name */
    public final TextPaint f3590a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    public final d f3591b = new a();

    /* renamed from: c  reason: collision with root package name */
    public float f3592c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3593d = true;

    /* renamed from: e  reason: collision with root package name */
    public WeakReference<b> f3594e = new WeakReference<>((Object) null);

    /* renamed from: f  reason: collision with root package name */
    public r1.d f3595f;

    public class a extends d {
        public a() {
            super(3);
        }

        public void c(int i2) {
            l lVar = l.this;
            lVar.f3593d = true;
            b bVar = (b) lVar.f3594e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        public void d(Typeface typeface, boolean z2) {
            if (!z2) {
                l lVar = l.this;
                lVar.f3593d = true;
                b bVar = (b) lVar.f3594e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public l(b bVar) {
        this.f3594e = new WeakReference<>(bVar);
    }

    public float a(String str) {
        if (!this.f3593d) {
            return this.f3592c;
        }
        float measureText = str == null ? 0.0f : this.f3590a.measureText(str, 0, str.length());
        this.f3592c = measureText;
        this.f3593d = false;
        return measureText;
    }
}
