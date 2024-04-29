package e0;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f2917a = new C0027d((b) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final c f2918b = new C0027d((b) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final c f2919c;

    /* renamed from: d  reason: collision with root package name */
    public static final c f2920d;

    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2921a = new a();

        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            int i5 = 2;
            while (i2 < i4 && i5 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                c cVar = d.f2917a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i5 = 2;
                                break;
                        }
                    }
                    i5 = 0;
                    i2++;
                }
                i5 = 1;
                i2++;
            }
            return i5;
        }
    }

    public interface b {
        int a(CharSequence charSequence, int i2, int i3);
    }

    public static abstract class c implements c {

        /* renamed from: a  reason: collision with root package name */
        public final b f2922a;

        public c(b bVar) {
            this.f2922a = bVar;
        }

        public abstract boolean a();

        public boolean b(CharSequence charSequence, int i2, int i3) {
            if (i2 < 0 || i3 < 0 || charSequence.length() - i3 < i2) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f2922a;
            if (bVar == null) {
                return a();
            }
            int a2 = bVar.a(charSequence, i2, i3);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return a();
            }
            return false;
        }
    }

    /* renamed from: e0.d$d  reason: collision with other inner class name */
    public static class C0027d extends c {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2923b;

        public C0027d(b bVar, boolean z2) {
            super(bVar);
            this.f2923b = z2;
        }

        public boolean a() {
            return this.f2923b;
        }
    }

    static {
        a aVar = a.f2921a;
        f2919c = new C0027d(aVar, false);
        f2920d = new C0027d(aVar, true);
    }
}
