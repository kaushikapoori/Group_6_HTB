package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.b0;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
public final class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<g0> f1273b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<String> f1274c;

    /* renamed from: d  reason: collision with root package name */
    public b[] f1275d;

    /* renamed from: e  reason: collision with root package name */
    public int f1276e;

    /* renamed from: f  reason: collision with root package name */
    public String f1277f = null;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<String> f1278g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<Bundle> f1279h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<b0.k> f1280i;

    public class a implements Parcelable.Creator<d0> {
        public Object createFromParcel(Parcel parcel) {
            return new d0(parcel);
        }

        public Object[] newArray(int i2) {
            return new d0[i2];
        }
    }

    public d0() {
    }

    public d0(Parcel parcel) {
        this.f1273b = parcel.createTypedArrayList(g0.CREATOR);
        this.f1274c = parcel.createStringArrayList();
        this.f1275d = (b[]) parcel.createTypedArray(b.CREATOR);
        this.f1276e = parcel.readInt();
        this.f1277f = parcel.readString();
        this.f1278g = parcel.createStringArrayList();
        this.f1279h = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f1280i = parcel.createTypedArrayList(b0.k.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedList(this.f1273b);
        parcel.writeStringList(this.f1274c);
        parcel.writeTypedArray(this.f1275d, i2);
        parcel.writeInt(this.f1276e);
        parcel.writeString(this.f1277f);
        parcel.writeStringList(this.f1278g);
        parcel.writeTypedList(this.f1279h);
        parcel.writeTypedList(this.f1280i);
    }
}
