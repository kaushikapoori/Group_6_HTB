package w;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class<?> f4131a;

    /* renamed from: b  reason: collision with root package name */
    public static final Field f4132b;

    /* renamed from: c  reason: collision with root package name */
    public static final Field f4133c;

    /* renamed from: d  reason: collision with root package name */
    public static final Method f4134d;

    /* renamed from: e  reason: collision with root package name */
    public static final Method f4135e;

    /* renamed from: f  reason: collision with root package name */
    public static final Method f4136f;

    /* renamed from: g  reason: collision with root package name */
    public static final Handler f4137g = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ C0056c f4138b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f4139c;

        public a(C0056c cVar, Object obj) {
            this.f4138b = cVar;
            this.f4139c = obj;
        }

        public void run() {
            this.f4138b.f4142a = this.f4139c;
        }
    }

    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Application f4140b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ C0056c f4141c;

        public b(Application application, C0056c cVar) {
            this.f4140b = application;
            this.f4141c = cVar;
        }

        public void run() {
            this.f4140b.unregisterActivityLifecycleCallbacks(this.f4141c);
        }
    }

    /* renamed from: w.c$c  reason: collision with other inner class name */
    public static final class C0056c implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a  reason: collision with root package name */
        public Object f4142a;

        /* renamed from: b  reason: collision with root package name */
        public Activity f4143b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4144c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f4145d = false;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4146e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f4147f = false;

        public C0056c(Activity activity) {
            this.f4143b = activity;
            this.f4144c = activity.hashCode();
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            if (this.f4143b == activity) {
                this.f4143b = null;
                this.f4146e = true;
            }
        }

        public void onActivityPaused(Activity activity) {
            if (this.f4146e && !this.f4147f && !this.f4145d) {
                Object obj = this.f4142a;
                int i2 = this.f4144c;
                boolean z2 = false;
                try {
                    Object obj2 = c.f4133c.get(activity);
                    if (obj2 == obj) {
                        if (activity.hashCode() == i2) {
                            c.f4137g.postAtFrontOfQueue(new d(c.f4132b.get(activity), obj2));
                            z2 = true;
                        }
                    }
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while fetching field values", th);
                }
                if (z2) {
                    this.f4147f = true;
                    this.f4142a = null;
                }
            }
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            if (this.f4143b == activity) {
                this.f4145d = true;
            }
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b A[SYNTHETIC, Splitter:B:25:0x005b] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            f4137g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            f4131a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0023 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x0023 }
            goto L_0x0024
        L_0x0023:
            r3 = r1
        L_0x0024:
            f4132b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch:{ all -> 0x0030 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = r1
        L_0x0031:
            f4133c = r0
            java.lang.Class<?> r0 = f4131a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L_0x003e
        L_0x003c:
            r0 = r1
            goto L_0x0053
        L_0x003e:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x003c }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x003c }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x003c }
            r7[r2] = r8     // Catch:{ all -> 0x003c }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch:{ all -> 0x003c }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x003c }
            r0.setAccessible(r2)     // Catch:{ all -> 0x003c }
        L_0x0053:
            f4134d = r0
            java.lang.Class<?> r0 = f4131a
            if (r0 != 0) goto L_0x005b
        L_0x0059:
            r0 = r1
            goto L_0x006c
        L_0x005b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x0059 }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x0059 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0059 }
            r7[r2] = r8     // Catch:{ all -> 0x0059 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x0059 }
            r0.setAccessible(r2)     // Catch:{ all -> 0x0059 }
        L_0x006c:
            f4135e = r0
            java.lang.Class<?> r0 = f4131a
            boolean r4 = a()
            if (r4 == 0) goto L_0x00ad
            if (r0 != 0) goto L_0x0079
            goto L_0x00ad
        L_0x0079:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x00ad }
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch:{ all -> 0x00ad }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch:{ all -> 0x00ad }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch:{ all -> 0x00ad }
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00ad }
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00ad }
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00ad }
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch:{ all -> 0x00ad }
            r3 = 7
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            r3 = 8
            r7[r3] = r5     // Catch:{ all -> 0x00ad }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch:{ all -> 0x00ad }
            r0.setAccessible(r2)     // Catch:{ all -> 0x00ad }
            r1 = r0
        L_0x00ad:
            f4136f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c.<clinit>():void");
    }

    public static boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        return i2 == 26 || i2 == 27;
    }

    public static boolean b(Activity activity) {
        Object obj;
        Application application;
        C0056c cVar;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (a() && f4136f == null) {
            return false;
        } else {
            if (f4135e == null && f4134d == null) {
                return false;
            }
            try {
                Object obj2 = f4133c.get(activity);
                if (obj2 == null || (obj = f4132b.get(activity)) == null) {
                    return false;
                }
                application = activity.getApplication();
                cVar = new C0056c(activity);
                application.registerActivityLifecycleCallbacks(cVar);
                Handler handler = f4137g;
                handler.post(new a(cVar, obj2));
                if (a()) {
                    Method method = f4136f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, new Object[]{obj2, null, null, 0, bool, null, null, bool, bool});
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, cVar));
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
