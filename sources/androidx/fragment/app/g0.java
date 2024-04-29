package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class g0 implements Parcelable {
    public static final Parcelable.Creator<g0> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f1296b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1297c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f1298d;

    /* renamed from: e  reason: collision with root package name */
    public final int f1299e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1300f;

    /* renamed from: g  reason: collision with root package name */
    public final String f1301g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1302h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1303i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1304j;

    /* renamed from: k  reason: collision with root package name */
    public final Bundle f1305k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1306l;

    /* renamed from: m  reason: collision with root package name */
    public final int f1307m;

    /* renamed from: n  reason: collision with root package name */
    public Bundle f1308n;

    public class a implements Parcelable.Creator<g0> {
        public Object createFromParcel(Parcel parcel) {
            return new g0(parcel);
        }

        public Object[] newArray(int i2) {
            return new g0[i2];
        }
    }

    public g0(Parcel parcel) {
        this.f1296b = parcel.readString();
        this.f1297c = parcel.readString();
        boolean z2 = true;
        this.f1298d = parcel.readInt() != 0;
        this.f1299e = parcel.readInt();
        this.f1300f = parcel.readInt();
        this.f1301g = parcel.readString();
        this.f1302h = parcel.readInt() != 0;
        this.f1303i = parcel.readInt() != 0;
        this.f1304j = parcel.readInt() != 0;
        this.f1305k = parcel.readBundle();
        this.f1306l = parcel.readInt() == 0 ? false : z2;
        this.f1308n = parcel.readBundle();
        this.f1307m = parcel.readInt();
    }

    public g0(n nVar) {
        this.f1296b = nVar.getClass().getName();
        this.f1297c = nVar.f1375f;
        this.f1298d = nVar.f1383n;
        this.f1299e = nVar.f1392w;
        this.f1300f = nVar.f1393x;
        this.f1301g = nVar.f1394y;
        this.f1302h = nVar.B;
        this.f1303i = nVar.f1382m;
        this.f1304j = nVar.A;
        this.f1305k = nVar.f1376g;
        this.f1306l = nVar.f1395z;
        this.f1307m = nVar.M.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1296b);
        sb.append(" (");
        sb.append(this.f1297c);
        sb.append(")}:");
        if (this.f1298d) {
            sb.append(" fromLayout");
        }
        if (this.f1300f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1300f));
        }
        String str = this.f1301g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1301g);
        }
        if (this.f1302h) {
            sb.append(" retainInstance");
        }
        if (this.f1303i) {
            sb.append(" removing");
        }
        if (this.f1304j) {
            sb.append(" detached");
        }
        if (this.f1306l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1296b);
        parcel.writeString(this.f1297c);
        parcel.writeInt(this.f1298d ? 1 : 0);
        parcel.writeInt(this.f1299e);
        parcel.writeInt(this.f1300f);
        parcel.writeString(this.f1301g);
        parcel.writeInt(this.f1302h ? 1 : 0);
        parcel.writeInt(this.f1303i ? 1 : 0);
        parcel.writeInt(this.f1304j ? 1 : 0);
        parcel.writeBundle(this.f1305k);
        parcel.writeInt(this.f1306l ? 1 : 0);
        parcel.writeBundle(this.f1308n);
        parcel.writeInt(this.f1307m);
    }
}
