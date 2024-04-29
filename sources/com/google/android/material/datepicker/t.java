package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class t implements Comparable<t>, Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f2387b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2388c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2389d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2390e;

    /* renamed from: f  reason: collision with root package name */
    public final int f2391f;

    /* renamed from: g  reason: collision with root package name */
    public final long f2392g;

    /* renamed from: h  reason: collision with root package name */
    public String f2393h;

    public class a implements Parcelable.Creator<t> {
        public Object createFromParcel(Parcel parcel) {
            return t.k(parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i2) {
            return new t[i2];
        }
    }

    public t(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b2 = b0.b(calendar);
        this.f2387b = b2;
        this.f2388c = b2.get(2);
        this.f2389d = b2.get(1);
        this.f2390e = b2.getMaximum(7);
        this.f2391f = b2.getActualMaximum(5);
        this.f2392g = b2.getTimeInMillis();
    }

    public static t k(int i2, int i3) {
        Calendar e2 = b0.e();
        e2.set(1, i2);
        e2.set(2, i3);
        return new t(e2);
    }

    public static t l(long j2) {
        Calendar e2 = b0.e();
        e2.setTimeInMillis(j2);
        return new t(e2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2388c == tVar.f2388c && this.f2389d == tVar.f2389d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2388c), Integer.valueOf(this.f2389d)});
    }

    /* renamed from: j */
    public int compareTo(t tVar) {
        return this.f2387b.compareTo(tVar.f2387b);
    }

    public int m() {
        int firstDayOfWeek = this.f2387b.get(7) - this.f2387b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f2390e : firstDayOfWeek;
    }

    public String n() {
        if (this.f2393h == null) {
            this.f2393h = DateUtils.formatDateTime((Context) null, this.f2387b.getTimeInMillis(), 8228);
        }
        return this.f2393h;
    }

    public t o(int i2) {
        Calendar b2 = b0.b(this.f2387b);
        b2.add(2, i2);
        return new t(b2);
    }

    public int p(t tVar) {
        if (this.f2387b instanceof GregorianCalendar) {
            return (tVar.f2388c - this.f2388c) + ((tVar.f2389d - this.f2389d) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f2389d);
        parcel.writeInt(this.f2388c);
    }
}
