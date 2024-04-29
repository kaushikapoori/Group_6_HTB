package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicReference<a0> f2323a = new AtomicReference<>();

    public static long a(long j2) {
        Calendar e2 = e();
        e2.setTimeInMillis(j2);
        return b(e2).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar f2 = f(calendar);
        Calendar e2 = e();
        e2.set(f2.get(1), f2.get(2), f2.get(5));
        return e2;
    }

    public static TimeZone c() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar d() {
        a0 a0Var = f2323a.get();
        if (a0Var == null) {
            a0Var = a0.f2314c;
        }
        TimeZone timeZone = a0Var.f2316b;
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l2 = a0Var.f2315a;
        if (l2 != null) {
            instance.setTimeInMillis(l2.longValue());
        }
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(c());
        return instance;
    }

    public static Calendar e() {
        return f((Calendar) null);
    }

    public static Calendar f(Calendar calendar) {
        Calendar instance = Calendar.getInstance(c());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
