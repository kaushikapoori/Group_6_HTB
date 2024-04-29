package e0;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import e0.d;
import java.util.Locale;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final c f2900d;

    /* renamed from: e  reason: collision with root package name */
    public static final String f2901e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    public static final String f2902f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    public static final a f2903g;

    /* renamed from: h  reason: collision with root package name */
    public static final a f2904h;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2905a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2906b;

    /* renamed from: c  reason: collision with root package name */
    public final c f2907c;

    /* renamed from: e0.a$a  reason: collision with other inner class name */
    public static class C0026a {

        /* renamed from: e  reason: collision with root package name */
        public static final byte[] f2908e = new byte[1792];

        /* renamed from: a  reason: collision with root package name */
        public final CharSequence f2909a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2910b;

        /* renamed from: c  reason: collision with root package name */
        public int f2911c;

        /* renamed from: d  reason: collision with root package name */
        public char f2912d;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                f2908e[i2] = Character.getDirectionality(i2);
            }
        }

        public C0026a(CharSequence charSequence, boolean z2) {
            this.f2909a = charSequence;
            this.f2910b = charSequence.length();
        }

        public byte a() {
            char charAt = this.f2909a.charAt(this.f2911c - 1);
            this.f2912d = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.f2909a, this.f2911c);
                this.f2911c -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.f2911c--;
            char c2 = this.f2912d;
            return c2 < 1792 ? f2908e[c2] : Character.getDirectionality(c2);
        }
    }

    static {
        c cVar = d.f2919c;
        f2900d = cVar;
        f2903g = new a(false, 2, cVar);
        f2904h = new a(true, 2, cVar);
    }

    public a(boolean z2, int i2, c cVar) {
        this.f2905a = z2;
        this.f2906b = i2;
        this.f2907c = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008e, code lost:
        r5 = r5 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r9) {
        /*
            e0.a$a r0 = new e0.a$a
            r1 = 0
            r0.<init>(r9, r1)
            r0.f2911c = r1
            r9 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000d:
            int r6 = r0.f2911c
            int r7 = r0.f2910b
            if (r6 >= r7) goto L_0x0070
            if (r3 != 0) goto L_0x0070
            java.lang.CharSequence r7 = r0.f2909a
            char r6 = r7.charAt(r6)
            r0.f2912d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x0039
            java.lang.CharSequence r6 = r0.f2909a
            int r7 = r0.f2911c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f2911c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f2911c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x004d
        L_0x0039:
            int r6 = r0.f2911c
            int r6 = r6 + r2
            r0.f2911c = r6
            char r6 = r0.f2912d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x0049
            byte[] r7 = e0.a.C0026a.f2908e
            byte r6 = r7[r6]
            goto L_0x004d
        L_0x0049:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004d:
            if (r6 == 0) goto L_0x006b
            if (r6 == r2) goto L_0x0068
            r7 = 2
            if (r6 == r7) goto L_0x0068
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x0064;
                case 15: goto L_0x0064;
                case 16: goto L_0x0060;
                case 17: goto L_0x0060;
                case 18: goto L_0x005c;
                default: goto L_0x005b;
            }
        L_0x005b:
            goto L_0x006e
        L_0x005c:
            int r5 = r5 + -1
            r4 = 0
            goto L_0x000d
        L_0x0060:
            int r5 = r5 + 1
            r4 = 1
            goto L_0x000d
        L_0x0064:
            int r5 = r5 + 1
            r4 = -1
            goto L_0x000d
        L_0x0068:
            if (r5 != 0) goto L_0x006e
            goto L_0x0088
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x008c
        L_0x006e:
            r3 = r5
            goto L_0x000d
        L_0x0070:
            if (r3 != 0) goto L_0x0073
            goto L_0x0091
        L_0x0073:
            if (r4 == 0) goto L_0x0077
            r1 = r4
            goto L_0x0091
        L_0x0077:
            int r4 = r0.f2911c
            if (r4 <= 0) goto L_0x0091
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L_0x008a;
                case 15: goto L_0x008a;
                case 16: goto L_0x0086;
                case 17: goto L_0x0086;
                case 18: goto L_0x0083;
                default: goto L_0x0082;
            }
        L_0x0082:
            goto L_0x0077
        L_0x0083:
            int r5 = r5 + 1
            goto L_0x0077
        L_0x0086:
            if (r3 != r5) goto L_0x008e
        L_0x0088:
            r1 = 1
            goto L_0x0091
        L_0x008a:
            if (r3 != r5) goto L_0x008e
        L_0x008c:
            r1 = -1
            goto L_0x0091
        L_0x008e:
            int r5 = r5 + -1
            goto L_0x0077
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.a.a(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r6 = r6 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6) {
        /*
            e0.a$a r0 = new e0.a$a
            r1 = 0
            r0.<init>(r6, r1)
            int r6 = r0.f2910b
            r0.f2911c = r6
            r6 = 0
            r2 = 0
        L_0x000c:
            int r3 = r0.f2911c
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r2 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r6 = r6 + 1
            goto L_0x000c
        L_0x0029:
            if (r2 != r6) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r2 != r6) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r6 = r6 + -1
            goto L_0x000c
        L_0x0032:
            if (r6 != 0) goto L_0x0036
        L_0x0034:
            r1 = 1
            goto L_0x0041
        L_0x0036:
            if (r2 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r6 != 0) goto L_0x003d
        L_0x003b:
            r1 = -1
            goto L_0x0041
        L_0x003d:
            if (r2 != 0) goto L_0x000c
        L_0x003f:
            r2 = r6
            goto L_0x000c
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.a.b(java.lang.CharSequence):int");
    }

    public static a c() {
        Locale locale = Locale.getDefault();
        int i2 = e.f2924a;
        boolean z2 = true;
        if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
            z2 = false;
        }
        c cVar = f2900d;
        if (cVar == f2900d) {
            return z2 ? f2904h : f2903g;
        }
        return new a(z2, 2, cVar);
    }

    public CharSequence d(CharSequence charSequence, c cVar, boolean z2) {
        if (charSequence == null) {
            return null;
        }
        boolean b2 = ((d.c) cVar).b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (((this.f2906b & 2) != 0) && z2) {
            boolean b3 = ((d.c) (b2 ? d.f2918b : d.f2917a)).b(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((this.f2905a || (!b3 && a(charSequence) != 1)) ? (!this.f2905a || (b3 && a(charSequence) != -1)) ? str : f2902f : f2901e);
        }
        if (b2 != this.f2905a) {
            spannableStringBuilder.append(b2 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z2) {
            boolean b4 = ((d.c) (b2 ? d.f2918b : d.f2917a)).b(charSequence, 0, charSequence.length());
            if (!this.f2905a && (b4 || b(charSequence) == 1)) {
                str = f2901e;
            } else if (this.f2905a && (!b4 || b(charSequence) == -1)) {
                str = f2902f;
            }
            spannableStringBuilder.append(str);
        }
        return spannableStringBuilder;
    }
}
