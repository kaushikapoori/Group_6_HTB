package androidx.lifecycle;

import androidx.lifecycle.g;
import androidx.savedstate.a;
import androidx.savedstate.c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

final class SavedStateHandleController implements i {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1560a;

    /* renamed from: androidx.lifecycle.SavedStateHandleController$1  reason: invalid class name */
    class AnonymousClass1 implements i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f1561a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ androidx.savedstate.a f1562b;

        public void g(k kVar, g.b bVar) {
            if (bVar == g.b.ON_START) {
                l lVar = (l) this.f1561a;
                lVar.c("removeObserver");
                lVar.f1580a.e(this);
                this.f1562b.c(a.class);
            }
        }
    }

    public static final class a implements a.C0013a {
        public void a(c cVar) {
            Object obj;
            boolean z2;
            if (cVar instanceof z) {
                y f2 = ((z) cVar).f();
                androidx.savedstate.a d2 = cVar.d();
                Objects.requireNonNull(f2);
                Iterator it = new HashSet(f2.f1606a.keySet()).iterator();
                while (it.hasNext()) {
                    u uVar = f2.f1606a.get((String) it.next());
                    g a2 = cVar.a();
                    Map<String, Object> map = uVar.f1605a;
                    if (map == null) {
                        obj = null;
                    } else {
                        synchronized (map) {
                            obj = uVar.f1605a.get("androidx.lifecycle.savedstate.vm.tag");
                        }
                    }
                    SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                    if (savedStateHandleController != null && !(z2 = savedStateHandleController.f1560a)) {
                        if (z2) {
                            throw new IllegalStateException("Already attached to lifecycleOwner");
                        }
                        savedStateHandleController.f1560a = true;
                        a2.a(savedStateHandleController);
                        throw null;
                    }
                }
                if (!new HashSet(f2.f1606a.keySet()).isEmpty()) {
                    d2.c(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    public void g(k kVar, g.b bVar) {
        if (bVar == g.b.ON_DESTROY) {
            this.f1560a = false;
            l lVar = (l) kVar.a();
            lVar.c("removeObserver");
            lVar.f1580a.e(this);
        }
    }
}
