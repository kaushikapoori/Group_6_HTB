package androidx.emoji2.text;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import java.util.List;

public final class c {

    public static class a {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            throw null;
        }

        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i2) {
            throw null;
        }
    }

    public static class b extends a {
        public ProviderInfo a(ResolveInfo resolveInfo) {
            return resolveInfo.providerInfo;
        }

        public List<ResolveInfo> c(PackageManager packageManager, Intent intent, int i2) {
            return packageManager.queryIntentContentProviders(intent, i2);
        }
    }

    /* renamed from: androidx.emoji2.text.c$c  reason: collision with other inner class name */
    public static class C0006c extends b {
        public Signature[] b(PackageManager packageManager, String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.emoji2.text.j a(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x000c
            androidx.emoji2.text.c$c r0 = new androidx.emoji2.text.c$c
            r0.<init>()
            goto L_0x0011
        L_0x000c:
            androidx.emoji2.text.c$b r0 = new androidx.emoji2.text.c$b
            r0.<init>()
        L_0x0011:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            c.a.d(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r0.c(r1, r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x002a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x004c
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r0.a(r4)
            r6 = 1
            if (r4 == 0) goto L_0x0048
            android.content.pm.ApplicationInfo r7 = r4.applicationInfo
            if (r7 == 0) goto L_0x0048
            int r7 = r7.flags
            r7 = r7 & r6
            if (r7 != r6) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            if (r6 == 0) goto L_0x002a
            goto L_0x004d
        L_0x004c:
            r4 = r5
        L_0x004d:
            if (r4 != 0) goto L_0x0050
            goto L_0x007e
        L_0x0050:
            java.lang.String r2 = r4.authority     // Catch:{ NameNotFoundException -> 0x0078 }
            java.lang.String r4 = r4.packageName     // Catch:{ NameNotFoundException -> 0x0078 }
            android.content.pm.Signature[] r0 = r0.b(r1, r4)     // Catch:{ NameNotFoundException -> 0x0078 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ NameNotFoundException -> 0x0078 }
            r1.<init>()     // Catch:{ NameNotFoundException -> 0x0078 }
            int r6 = r0.length     // Catch:{ NameNotFoundException -> 0x0078 }
        L_0x005e:
            if (r3 >= r6) goto L_0x006c
            r7 = r0[r3]     // Catch:{ NameNotFoundException -> 0x0078 }
            byte[] r7 = r7.toByteArray()     // Catch:{ NameNotFoundException -> 0x0078 }
            r1.add(r7)     // Catch:{ NameNotFoundException -> 0x0078 }
            int r3 = r3 + 1
            goto L_0x005e
        L_0x006c:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch:{ NameNotFoundException -> 0x0078 }
            d0.e r1 = new d0.e     // Catch:{ NameNotFoundException -> 0x0078 }
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch:{ NameNotFoundException -> 0x0078 }
            goto L_0x007f
        L_0x0078:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
        L_0x007e:
            r1 = r5
        L_0x007f:
            if (r1 != 0) goto L_0x0082
            goto L_0x0087
        L_0x0082:
            androidx.emoji2.text.j r5 = new androidx.emoji2.text.j
            r5.<init>(r8, r1)
        L_0x0087:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.c.a(android.content.Context):androidx.emoji2.text.j");
    }
}
