package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.i;

public abstract class a implements i {

    /* renamed from: b  reason: collision with root package name */
    public Context f159b;

    /* renamed from: c  reason: collision with root package name */
    public Context f160c;

    /* renamed from: d  reason: collision with root package name */
    public e f161d;

    /* renamed from: e  reason: collision with root package name */
    public LayoutInflater f162e;

    /* renamed from: f  reason: collision with root package name */
    public i.a f163f;

    /* renamed from: g  reason: collision with root package name */
    public int f164g;

    /* renamed from: h  reason: collision with root package name */
    public int f165h;

    /* renamed from: i  reason: collision with root package name */
    public j f166i;

    public a(Context context, int i2, int i3) {
        this.f159b = context;
        this.f162e = LayoutInflater.from(context);
        this.f164g = i2;
        this.f165h = i3;
    }

    public boolean c(e eVar, g gVar) {
        return false;
    }

    public void d(i.a aVar) {
        this.f163f = aVar;
    }

    public boolean k(e eVar, g gVar) {
        return false;
    }
}
