package l0;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public abstract class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final a f3320c = new C0040a();

    /* renamed from: b  reason: collision with root package name */
    public final Parcelable f3321b;

    /* renamed from: l0.a$a  reason: collision with other inner class name */
    public class C0040a extends a {
        public C0040a() {
            super((C0040a) null);
        }
    }

    public class b implements Parcelable.ClassLoaderCreator<a> {
        public Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable((ClassLoader) null) == null) {
                return a.f3320c;
            }
            throw new IllegalStateException("superState must be null");
        }

        public Object[] newArray(int i2) {
            return new a[i2];
        }

        public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f3320c;
            }
            throw new IllegalStateException("superState must be null");
        }
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f3321b = readParcelable == null ? f3320c : readParcelable;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f3321b = parcelable == f3320c ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(C0040a aVar) {
        this.f3321b = null;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f3321b, i2);
    }
}
