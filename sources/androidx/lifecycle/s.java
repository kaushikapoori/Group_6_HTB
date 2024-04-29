package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.g;

public class s extends d {
    public final /* synthetic */ r this$0;

    public class a extends d {
        public a() {
        }

        public void onActivityPostResumed(Activity activity) {
            s.this.this$0.b();
        }

        public void onActivityPostStarted(Activity activity) {
            s.this.this$0.e();
        }
    }

    public s(r rVar) {
        this.this$0 = rVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i2 = t.f1603c;
            ((t) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f1604b = this.this$0.f1600i;
        }
    }

    public void onActivityPaused(Activity activity) {
        r rVar = this.this$0;
        int i2 = rVar.f1594c - 1;
        rVar.f1594c = i2;
        if (i2 == 0) {
            rVar.f1597f.postDelayed(rVar.f1599h, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    public void onActivityStopped(Activity activity) {
        r rVar = this.this$0;
        int i2 = rVar.f1593b - 1;
        rVar.f1593b = i2;
        if (i2 == 0 && rVar.f1595d) {
            rVar.f1598g.d(g.b.ON_STOP);
            rVar.f1596e = true;
        }
    }
}
