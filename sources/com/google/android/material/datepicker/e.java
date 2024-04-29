package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public class e implements a.c {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final long f2336b;

    public class a implements Parcelable.Creator<e> {
        public Object createFromParcel(Parcel parcel) {
            return new e(parcel.readLong(), (a) null);
        }

        public Object[] newArray(int i2) {
            return new e[i2];
        }
    }

    public e(long j2) {
        this.f2336b = j2;
    }

    public e(long j2, a aVar) {
        this.f2336b = j2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.f2336b == ((e) obj).f2336b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f2336b)});
    }

    public boolean i(long j2) {
        return j2 >= this.f2336b;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.f2336b);
    }
}
