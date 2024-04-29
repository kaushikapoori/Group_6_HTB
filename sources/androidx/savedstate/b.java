package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.savedstate.a;
import java.util.Map;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c f2015a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2016b = new a();

    public b(c cVar) {
        this.f2015a = cVar;
    }

    public void a(Bundle bundle) {
        g a2 = this.f2015a.a();
        if (((l) a2).f1581b == g.c.INITIALIZED) {
            a2.a(new Recreator(this.f2015a));
            a aVar = this.f2016b;
            if (!aVar.f2012c) {
                if (bundle != null) {
                    aVar.f2011b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                a2.a(new SavedStateRegistry$1(aVar));
                aVar.f2012c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        a aVar = this.f2016b;
        Objects.requireNonNull(aVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f2011b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        k.b<K, V>.d b2 = aVar.f2010a.b();
        while (b2.hasNext()) {
            Map.Entry entry = (Map.Entry) b2.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
