package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

public final class s<S> extends y<S> {
    public int U;
    public d<S> V;
    public a W;

    public class a extends x<S> {
        public a() {
        }

        public void a(S s2) {
            Iterator it = s.this.T.iterator();
            while (it.hasNext()) {
                ((x) it.next()).a(s2);
            }
        }
    }

    public void G(Bundle bundle) {
        super.G(bundle);
        if (bundle == null) {
            bundle = this.f1376g;
        }
        this.U = bundle.getInt("THEME_RES_ID_KEY");
        this.V = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.W = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.V.e(layoutInflater.cloneInContext(new ContextThemeWrapper(j(), this.U)), viewGroup, bundle, this.W, new a());
    }

    public void M(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.U);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.V);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.W);
    }
}
