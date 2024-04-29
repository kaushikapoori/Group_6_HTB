package h1;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface d {

    public static class b implements TypeEvaluator<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final TypeEvaluator<e> f3180b = new b();

        /* renamed from: a  reason: collision with root package name */
        public final e f3181a = new e((a) null);

        public Object evaluate(float f2, Object obj, Object obj2) {
            e eVar = (e) obj;
            e eVar2 = (e) obj2;
            e eVar3 = this.f3181a;
            float i2 = c.b.i(eVar.f3184a, eVar2.f3184a, f2);
            float i3 = c.b.i(eVar.f3185b, eVar2.f3185b, f2);
            float i4 = c.b.i(eVar.f3186c, eVar2.f3186c, f2);
            eVar3.f3184a = i2;
            eVar3.f3185b = i3;
            eVar3.f3186c = i4;
            return this.f3181a;
        }
    }

    public static class c extends Property<d, e> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, e> f3182a = new c("circularReveal");

        public c(String str) {
            super(e.class, str);
        }

        public Object get(Object obj) {
            return ((d) obj).getRevealInfo();
        }

        public void set(Object obj, Object obj2) {
            ((d) obj).setRevealInfo((e) obj2);
        }
    }

    /* renamed from: h1.d$d  reason: collision with other inner class name */
    public static class C0035d extends Property<d, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final Property<d, Integer> f3183a = new C0035d("circularRevealScrimColor");

        public C0035d(String str) {
            super(Integer.class, str);
        }

        public Object get(Object obj) {
            return Integer.valueOf(((d) obj).getCircularRevealScrimColor());
        }

        public void set(Object obj, Object obj2) {
            ((d) obj).setCircularRevealScrimColor(((Integer) obj2).intValue());
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public float f3184a;

        /* renamed from: b  reason: collision with root package name */
        public float f3185b;

        /* renamed from: c  reason: collision with root package name */
        public float f3186c;

        public e() {
        }

        public e(float f2, float f3, float f4) {
            this.f3184a = f2;
            this.f3185b = f3;
            this.f3186c = f4;
        }

        public e(a aVar) {
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(e eVar);
}
