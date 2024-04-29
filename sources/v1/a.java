package v1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import m.h;

public class a extends l0.a {
    public static final Parcelable.Creator<a> CREATOR = new C0055a();

    /* renamed from: d  reason: collision with root package name */
    public final h<String, Bundle> f4128d;

    /* renamed from: v1.a$a  reason: collision with other inner class name */
    public class C0055a implements Parcelable.ClassLoaderCreator<a> {
        public Object createFromParcel(Parcel parcel) {
            return new a(parcel, (ClassLoader) null, (C0055a) null);
        }

        public Object[] newArray(int i2) {
            return new a[i2];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new a(parcel, classLoader, (C0055a) null);
        }
    }

    public a(Parcel parcel, ClassLoader classLoader, C0055a aVar) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f4128d = new h<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f4128d.put(strArr[i2], bundleArr[i2]);
        }
    }

    public String toString() {
        StringBuilder a2 = androidx.activity.result.a.a("ExtendableSavedState{");
        a2.append(Integer.toHexString(System.identityHashCode(this)));
        a2.append(" states=");
        a2.append(this.f4128d);
        a2.append("}");
        return a2.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f3321b, i2);
        int i3 = this.f4128d.f3377d;
        parcel.writeInt(i3);
        String[] strArr = new String[i3];
        Bundle[] bundleArr = new Bundle[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            strArr[i4] = this.f4128d.h(i4);
            bundleArr[i4] = this.f4128d.k(i4);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
