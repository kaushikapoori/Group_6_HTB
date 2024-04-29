package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0016a();

    /* renamed from: b  reason: collision with root package name */
    public final t f2302b;

    /* renamed from: c  reason: collision with root package name */
    public final t f2303c;

    /* renamed from: d  reason: collision with root package name */
    public final c f2304d;

    /* renamed from: e  reason: collision with root package name */
    public t f2305e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2306f;

    /* renamed from: g  reason: collision with root package name */
    public final int f2307g;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    public class C0016a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel parcel) {
            return new a((t) parcel.readParcelable(t.class.getClassLoader()), (t) parcel.readParcelable(t.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (t) parcel.readParcelable(t.class.getClassLoader()), (C0016a) null);
        }

        public Object[] newArray(int i2) {
            return new a[i2];
        }
    }

    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final long f2308e = b0.a(t.k(1900, 0).f2392g);

        /* renamed from: f  reason: collision with root package name */
        public static final long f2309f = b0.a(t.k(2100, 11).f2392g);

        /* renamed from: a  reason: collision with root package name */
        public long f2310a = f2308e;

        /* renamed from: b  reason: collision with root package name */
        public long f2311b = f2309f;

        /* renamed from: c  reason: collision with root package name */
        public Long f2312c;

        /* renamed from: d  reason: collision with root package name */
        public c f2313d = new e(Long.MIN_VALUE);

        public b(a aVar) {
            this.f2310a = aVar.f2302b.f2392g;
            this.f2311b = aVar.f2303c.f2392g;
            this.f2312c = Long.valueOf(aVar.f2305e.f2392g);
            this.f2313d = aVar.f2304d;
        }
    }

    public interface c extends Parcelable {
        boolean i(long j2);
    }

    public a(t tVar, t tVar2, c cVar, t tVar3, C0016a aVar) {
        this.f2302b = tVar;
        this.f2303c = tVar2;
        this.f2305e = tVar3;
        this.f2304d = cVar;
        if (tVar3 != null && tVar.f2387b.compareTo(tVar3.f2387b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (tVar3 == null || tVar3.f2387b.compareTo(tVar2.f2387b) <= 0) {
            this.f2307g = tVar.p(tVar2) + 1;
            this.f2306f = (tVar2.f2389d - tVar.f2389d) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f2302b.equals(aVar.f2302b) || !this.f2303c.equals(aVar.f2303c) || !Objects.equals(this.f2305e, aVar.f2305e) || !this.f2304d.equals(aVar.f2304d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2302b, this.f2303c, this.f2305e, this.f2304d});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f2302b, 0);
        parcel.writeParcelable(this.f2303c, 0);
        parcel.writeParcelable(this.f2305e, 0);
        parcel.writeParcelable(this.f2304d, 0);
    }
}
