package com.google.android.material.datepicker;

import androidx.fragment.app.n;
import java.util.LinkedHashSet;

public abstract class y<S> extends n {
    public final LinkedHashSet<x<S>> T = new LinkedHashSet<>();

    public boolean e0(x<S> xVar) {
        return this.T.add(xVar);
    }
}
