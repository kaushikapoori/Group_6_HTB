package androidx.appcompat.widget;

public class t0 {

    /* renamed from: a  reason: collision with root package name */
    public int f777a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f778b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f779c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f780d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f781e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f782f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f783g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f784h = false;

    public void a(int i2, int i3) {
        this.f779c = i2;
        this.f780d = i3;
        this.f784h = true;
        if (this.f783g) {
            if (i3 != Integer.MIN_VALUE) {
                this.f777a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f778b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f777a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f778b = i3;
        }
    }
}
