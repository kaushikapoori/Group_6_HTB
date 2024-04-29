package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;

@SuppressLint({"RestrictedApi"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public k.b<String, b> f2010a = new k.b<>();

    /* renamed from: b  reason: collision with root package name */
    public Bundle f2011b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2012c;

    /* renamed from: d  reason: collision with root package name */
    public Recreator.a f2013d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2014e = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    public interface C0013a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.f2012c) {
            Bundle bundle = this.f2011b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f2011b.remove(str);
            if (this.f2011b.isEmpty()) {
                this.f2011b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void b(String str, b bVar) {
        if (this.f2010a.d(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void c(Class<? extends C0013a> cls) {
        if (this.f2014e) {
            if (this.f2013d == null) {
                this.f2013d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar = this.f2013d;
                aVar.f2008a.add(cls.getName());
            } catch (NoSuchMethodException e2) {
                StringBuilder a2 = androidx.activity.result.a.a("Class");
                a2.append(cls.getSimpleName());
                a2.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(a2.toString(), e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
