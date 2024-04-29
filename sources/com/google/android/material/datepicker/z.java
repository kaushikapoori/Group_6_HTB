package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;

public class z extends LinearLayoutManager {

    public class a extends p {
        public a(z zVar, Context context) {
            super(context);
        }

        public float f(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public z(Context context, int i2, boolean z2) {
        super(i2, z2);
    }

    public void G0(RecyclerView recyclerView, RecyclerView.w wVar, int i2) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.f1751a = i2;
        H0(aVar);
    }
}
