package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import f0.b;
import java.util.Collection;

public interface d<S> extends Parcelable {
    S a();

    boolean b();

    void c(long j2);

    String d(Context context);

    View e(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, x<S> xVar);

    int f(Context context);

    Collection<b<Long, Long>> g();

    Collection<Long> h();
}
