package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.savedstate.a;
import h.f;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import z.d;

@SuppressLint({"RestrictedApi"})
final class Recreator implements i {

    /* renamed from: a  reason: collision with root package name */
    public final c f2007a;

    public static final class a implements a.b {

        /* renamed from: a  reason: collision with root package name */
        public final Set<String> f2008a = new HashSet();

        public a(a aVar) {
            aVar.b("androidx.savedstate.Restarter", this);
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f2008a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        this.f2007a = cVar;
    }

    public void g(k kVar, g.b bVar) {
        if (bVar == g.b.ON_CREATE) {
            l lVar = (l) kVar.a();
            lVar.c("removeObserver");
            lVar.f1580a.e(this);
            Bundle a2 = this.f2007a.d().a("androidx.savedstate.Restarter");
            if (a2 != null) {
                ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.C0013a.class);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((a.C0013a) declaredConstructor.newInstance(new Object[0])).a(this.f2007a);
                                } catch (Exception e2) {
                                    throw new RuntimeException(f.a("Failed to instantiate ", next), e2);
                                }
                            } catch (NoSuchMethodException e3) {
                                StringBuilder a3 = androidx.activity.result.a.a("Class");
                                a3.append(asSubclass.getSimpleName());
                                a3.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(a3.toString(), e3);
                            }
                        } catch (ClassNotFoundException e4) {
                            throw new RuntimeException(d.a("Class ", next, " wasn't found"), e4);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
