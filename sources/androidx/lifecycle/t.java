package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.g;

public class t extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f1603c = 0;

    /* renamed from: b  reason: collision with root package name */
    public a f1604b;

    public interface a {
    }

    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            t.a(activity, g.b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            t.a(activity, g.b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            t.a(activity, g.b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            t.a(activity, g.b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            t.a(activity, g.b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            t.a(activity, g.b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity, g.b bVar) {
        if (activity instanceof m) {
            l a2 = ((m) activity).a();
            a2.c("handleLifecycleEvent");
            a2.f(bVar.a());
        } else if (activity instanceof k) {
            g a3 = ((k) activity).a();
            if (a3 instanceof l) {
                l lVar = (l) a3;
                lVar.c("handleLifecycleEvent");
                lVar.f(bVar.a());
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new t(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(g.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(g.b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        b(g.b.ON_DESTROY);
        this.f1604b = null;
    }

    public void onPause() {
        super.onPause();
        b(g.b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        a aVar = this.f1604b;
        if (aVar != null) {
            r.this.b();
        }
        b(g.b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        a aVar = this.f1604b;
        if (aVar != null) {
            r.this.e();
        }
        b(g.b.ON_START);
    }

    public void onStop() {
        super.onStop();
        b(g.b.ON_STOP);
    }
}
