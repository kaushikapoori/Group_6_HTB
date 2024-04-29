package k0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;

public abstract class c extends a {

    /* renamed from: j  reason: collision with root package name */
    public int f3305j;

    /* renamed from: k  reason: collision with root package name */
    public int f3306k;

    /* renamed from: l  reason: collision with root package name */
    public LayoutInflater f3307l;

    @Deprecated
    public c(Context context, int i2, Cursor cursor, boolean z2) {
        super(context, (Cursor) null, z2);
        this.f3306k = i2;
        this.f3305j = i2;
        this.f3307l = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
