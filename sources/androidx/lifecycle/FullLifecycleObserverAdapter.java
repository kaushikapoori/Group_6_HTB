package androidx.lifecycle;

import androidx.lifecycle.g;

class FullLifecycleObserverAdapter implements i {

    /* renamed from: a  reason: collision with root package name */
    public final e f1539a;

    /* renamed from: b  reason: collision with root package name */
    public final i f1540b;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1541a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.lifecycle.g$b[] r0 = androidx.lifecycle.g.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1541a = r0
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1541a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.ON_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1541a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1541a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1541a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1541a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1541a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.lifecycle.g$b r1 = androidx.lifecycle.g.b.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FullLifecycleObserverAdapter.a.<clinit>():void");
        }
    }

    public FullLifecycleObserverAdapter(e eVar, i iVar) {
        this.f1539a = eVar;
        this.f1540b = iVar;
    }

    public void g(k kVar, g.b bVar) {
        switch (a.f1541a[bVar.ordinal()]) {
            case 1:
                this.f1539a.e(kVar);
                break;
            case 2:
                this.f1539a.f(kVar);
                break;
            case 3:
                this.f1539a.a(kVar);
                break;
            case 4:
                this.f1539a.b(kVar);
                break;
            case 5:
                this.f1539a.d(kVar);
                break;
            case 6:
                this.f1539a.c(kVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        i iVar = this.f1540b;
        if (iVar != null) {
            iVar.g(kVar, bVar);
        }
    }
}
