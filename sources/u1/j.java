package u1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import java.util.Objects;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public d f3958a;

    /* renamed from: b  reason: collision with root package name */
    public d f3959b;

    /* renamed from: c  reason: collision with root package name */
    public d f3960c;

    /* renamed from: d  reason: collision with root package name */
    public d f3961d;

    /* renamed from: e  reason: collision with root package name */
    public c f3962e;

    /* renamed from: f  reason: collision with root package name */
    public c f3963f;

    /* renamed from: g  reason: collision with root package name */
    public c f3964g;

    /* renamed from: h  reason: collision with root package name */
    public c f3965h;

    /* renamed from: i  reason: collision with root package name */
    public f f3966i;

    /* renamed from: j  reason: collision with root package name */
    public f f3967j;

    /* renamed from: k  reason: collision with root package name */
    public f f3968k;

    /* renamed from: l  reason: collision with root package name */
    public f f3969l;

    public j() {
        this.f3958a = new i();
        this.f3959b = new i();
        this.f3960c = new i();
        this.f3961d = new i();
        this.f3962e = new a(0.0f);
        this.f3963f = new a(0.0f);
        this.f3964g = new a(0.0f);
        this.f3965h = new a(0.0f);
        this.f3966i = new f();
        this.f3967j = new f();
        this.f3968k = new f();
        this.f3969l = new f();
    }

    public static b a(Context context, int i2, int i3, c cVar) {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, y0.a.f4387x);
        try {
            int i4 = obtainStyledAttributes.getInt(0, 0);
            int i5 = obtainStyledAttributes.getInt(3, i4);
            int i6 = obtainStyledAttributes.getInt(4, i4);
            int i7 = obtainStyledAttributes.getInt(2, i4);
            int i8 = obtainStyledAttributes.getInt(1, i4);
            c c2 = c(obtainStyledAttributes, 5, cVar);
            c c3 = c(obtainStyledAttributes, 8, c2);
            c c4 = c(obtainStyledAttributes, 9, c2);
            c c5 = c(obtainStyledAttributes, 7, c2);
            c c6 = c(obtainStyledAttributes, 6, c2);
            b bVar = new b();
            d c7 = c.b.c(i5);
            bVar.f3970a = c7;
            b.b(c7);
            bVar.f3974e = c3;
            d c8 = c.b.c(i6);
            bVar.f3971b = c8;
            b.b(c8);
            bVar.f3975f = c4;
            d c9 = c.b.c(i7);
            bVar.f3972c = c9;
            b.b(c9);
            bVar.f3976g = c5;
            d c10 = c.b.c(i8);
            bVar.f3973d = c10;
            b.b(c10);
            bVar.f3977h = c6;
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b b(Context context, AttributeSet attributeSet, int i2, int i3) {
        a aVar = new a((float) 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, y0.a.f4381r, i2, i3);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i2, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue == null) {
            return cVar;
        }
        int i3 = peekValue.type;
        return i3 == 5 ? new a((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new h(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public boolean d(RectF rectF) {
        Class<f> cls = f.class;
        boolean z2 = this.f3969l.getClass().equals(cls) && this.f3967j.getClass().equals(cls) && this.f3966i.getClass().equals(cls) && this.f3968k.getClass().equals(cls);
        float a2 = this.f3962e.a(rectF);
        return z2 && ((this.f3963f.a(rectF) > a2 ? 1 : (this.f3963f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f3965h.a(rectF) > a2 ? 1 : (this.f3965h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f3964g.a(rectF) > a2 ? 1 : (this.f3964g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f3959b instanceof i) && (this.f3958a instanceof i) && (this.f3960c instanceof i) && (this.f3961d instanceof i));
    }

    public j e(float f2) {
        b bVar = new b(this);
        bVar.c(f2);
        return bVar.a();
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public d f3970a = new i();

        /* renamed from: b  reason: collision with root package name */
        public d f3971b = new i();

        /* renamed from: c  reason: collision with root package name */
        public d f3972c = new i();

        /* renamed from: d  reason: collision with root package name */
        public d f3973d = new i();

        /* renamed from: e  reason: collision with root package name */
        public c f3974e = new a(0.0f);

        /* renamed from: f  reason: collision with root package name */
        public c f3975f = new a(0.0f);

        /* renamed from: g  reason: collision with root package name */
        public c f3976g = new a(0.0f);

        /* renamed from: h  reason: collision with root package name */
        public c f3977h = new a(0.0f);

        /* renamed from: i  reason: collision with root package name */
        public f f3978i = new f();

        /* renamed from: j  reason: collision with root package name */
        public f f3979j = new f();

        /* renamed from: k  reason: collision with root package name */
        public f f3980k = new f();

        /* renamed from: l  reason: collision with root package name */
        public f f3981l = new f();

        public b() {
        }

        public static float b(d dVar) {
            Object obj;
            if (dVar instanceof i) {
                obj = (i) dVar;
            } else if (!(dVar instanceof e)) {
                return -1.0f;
            } else {
                obj = (e) dVar;
            }
            Objects.requireNonNull(obj);
            return -1.0f;
        }

        public j a() {
            return new j(this, (a) null);
        }

        public b c(float f2) {
            this.f3974e = new a(f2);
            this.f3975f = new a(f2);
            this.f3976g = new a(f2);
            this.f3977h = new a(f2);
            return this;
        }

        public b d(float f2) {
            this.f3977h = new a(f2);
            return this;
        }

        public b e(float f2) {
            this.f3976g = new a(f2);
            return this;
        }

        public b f(float f2) {
            this.f3974e = new a(f2);
            return this;
        }

        public b g(float f2) {
            this.f3975f = new a(f2);
            return this;
        }

        public b(j jVar) {
            this.f3970a = jVar.f3958a;
            this.f3971b = jVar.f3959b;
            this.f3972c = jVar.f3960c;
            this.f3973d = jVar.f3961d;
            this.f3974e = jVar.f3962e;
            this.f3975f = jVar.f3963f;
            this.f3976g = jVar.f3964g;
            this.f3977h = jVar.f3965h;
            this.f3978i = jVar.f3966i;
            this.f3979j = jVar.f3967j;
            this.f3980k = jVar.f3968k;
            this.f3981l = jVar.f3969l;
        }
    }

    public j(b bVar, a aVar) {
        this.f3958a = bVar.f3970a;
        this.f3959b = bVar.f3971b;
        this.f3960c = bVar.f3972c;
        this.f3961d = bVar.f3973d;
        this.f3962e = bVar.f3974e;
        this.f3963f = bVar.f3975f;
        this.f3964g = bVar.f3976g;
        this.f3965h = bVar.f3977h;
        this.f3966i = bVar.f3978i;
        this.f3967j = bVar.f3979j;
        this.f3968k = bVar.f3980k;
        this.f3969l = bVar.f3981l;
    }
}
