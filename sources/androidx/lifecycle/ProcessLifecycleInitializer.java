package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import t0.b;

public final class ProcessLifecycleInitializer implements b<k> {
    public List<Class<? extends b<?>>> a() {
        return Collections.emptyList();
    }

    public Object b(Context context) {
        if (!h.f1579a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new h.a());
        }
        r rVar = r.f1592j;
        Objects.requireNonNull(rVar);
        rVar.f1597f = new Handler();
        rVar.f1598g.d(g.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new s(rVar));
        return rVar;
    }
}
