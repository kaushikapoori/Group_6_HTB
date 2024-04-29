package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int f69b;

    /* renamed from: c  reason: collision with root package name */
    public final Intent f70c;

    public class a implements Parcelable.Creator<b> {
        public Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public Object[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(int i2, Intent intent) {
        this.f69b = i2;
        this.f70c = intent;
    }

    public b(Parcel parcel) {
        this.f69b = parcel.readInt();
        this.f70c = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder a2 = a.a("ActivityResult{resultCode=");
        int i2 = this.f69b;
        a2.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        a2.append(", data=");
        a2.append(this.f70c);
        a2.append('}');
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f69b);
        parcel.writeInt(this.f70c == null ? 0 : 1);
        Intent intent = this.f70c;
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}
