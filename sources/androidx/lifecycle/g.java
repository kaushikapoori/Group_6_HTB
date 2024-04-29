package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

public abstract class g {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1571a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f1572b;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|(2:21|22)|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006c */
        static {
            /*
                androidx.lifecycle.g$b[] r0 = androidx.lifecycle.g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1572b = r0
                r1 = 1
                androidx.lifecycle.g$b r2 = androidx.lifecycle.g.b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f1572b     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.g$b r3 = androidx.lifecycle.g.b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f1572b     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.g$b r4 = androidx.lifecycle.g.b.ON_START     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f1572b     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.g$b r5 = androidx.lifecycle.g.b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f1572b     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.g$b r6 = androidx.lifecycle.g.b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f1572b     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.g$b r6 = androidx.lifecycle.g.b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = f1572b     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.g$b r6 = androidx.lifecycle.g.b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                androidx.lifecycle.g$c[] r5 = androidx.lifecycle.g.c.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f1571a = r5
                r5[r0] = r1     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                int[] r5 = f1571a     // Catch:{ NoSuchFieldError -> 0x0063 }
                r5[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f1571a     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = f1571a     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 0
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f1571a     // Catch:{ NoSuchFieldError -> 0x0070 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0070 }
            L_0x0070:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.g.a.<clinit>():void");
        }
    }

    public enum b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static b b(c cVar) {
            int ordinal = cVar.ordinal();
            if (ordinal == 1) {
                return ON_CREATE;
            }
            if (ordinal == 2) {
                return ON_START;
            }
            if (ordinal != 3) {
                return null;
            }
            return ON_RESUME;
        }

        public c a() {
            switch (a.f1572b[ordinal()]) {
                case 1:
                case 2:
                    return c.CREATED;
                case 3:
                case 4:
                    return c.STARTED;
                case 5:
                    return c.RESUMED;
                case 6:
                    return c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED
    }

    public g() {
        new AtomicReference();
    }

    public abstract void a(j jVar);
}
