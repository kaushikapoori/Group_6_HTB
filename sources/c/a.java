package c;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import java.util.List;
import java.util.Objects;
import w.e;

public class a {
    public static void a(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int b(int i2) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException();
    }

    public static int c(int i2, String str) {
        if (i2 >= 0) {
            return i2;
        }
        throw new IllegalArgumentException(str);
    }

    public static <T> T d(T t2, Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static int e(Context context, String str) {
        int i2;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            int i3 = Build.VERSION.SDK_INT;
            String permissionToOp = i3 >= 23 ? AppOpsManager.permissionToOp(str) : null;
            if (permissionToOp == null) {
                return 0;
            }
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid != null && packagesForUid.length > 0) {
                    packageName = packagesForUid[0];
                }
            }
            if (!(Process.myUid() == myUid && Objects.equals(context.getPackageName(), packageName))) {
                i2 = e.a(context, permissionToOp, packageName);
            } else if (i3 >= 29) {
                AppOpsManager c2 = e.a.c(context);
                i2 = e.a.a(c2, permissionToOp, Binder.getCallingUid(), packageName);
                if (i2 == 0) {
                    i2 = e.a.a(c2, permissionToOp, myUid, e.a.b(context));
                }
            } else {
                i2 = e.a(context, permissionToOp, packageName);
            }
            if (i2 == 0) {
                return 0;
            }
            return -2;
        }
        return -1;
    }

    public static void f(boolean z2, String str) {
        if (!z2) {
            throw new IllegalStateException(str);
        }
    }

    public static void g(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = list.get(i2);
            j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j2);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
