package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;
import androidx.emoji2.text.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class d {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f1124j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static volatile d f1125k;

    /* renamed from: a  reason: collision with root package name */
    public final ReadWriteLock f1126a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<e> f1127b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f1128c = 3;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f1129d;

    /* renamed from: e  reason: collision with root package name */
    public final b f1130e;

    /* renamed from: f  reason: collision with root package name */
    public final g f1131f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1132g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1133h;

    /* renamed from: i  reason: collision with root package name */
    public final C0008d f1134i;

    public static final class a extends b {

        /* renamed from: b  reason: collision with root package name */
        public volatile h f1135b;

        /* renamed from: c  reason: collision with root package name */
        public volatile m f1136c;

        /* renamed from: androidx.emoji2.text.d$a$a  reason: collision with other inner class name */
        public class C0007a extends h {
            public C0007a() {
            }

            public void a(Throwable th) {
                a.this.f1138a.f(th);
            }

            public void b(m mVar) {
                a aVar = a.this;
                if (mVar == null) {
                    aVar.f1138a.f(new IllegalArgumentException("metadataRepo cannot be null"));
                    return;
                }
                aVar.f1136c = mVar;
                m mVar2 = aVar.f1136c;
                i iVar = new i();
                d dVar = aVar.f1138a;
                C0008d dVar2 = dVar.f1134i;
                Objects.requireNonNull(dVar);
                aVar.f1135b = new h(mVar2, iVar, dVar2, false, (int[]) null);
                aVar.f1138a.g();
            }
        }

        public a(d dVar) {
            super(dVar);
        }

        public void a() {
            try {
                this.f1138a.f1131f.a(new C0007a());
            } catch (Throwable th) {
                this.f1138a.f(th);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.CharSequence} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v19, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v20, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: android.text.SpannableString} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v24, resolved type: android.text.Spannable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v25, resolved type: android.text.SpannableString} */
        /* JADX WARNING: type inference failed for: r8v3 */
        /* JADX WARNING: Failed to insert additional move for type inference */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0053 A[Catch:{ all -> 0x014d }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006f A[Catch:{ all -> 0x014d }] */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x0146  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.CharSequence b(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21) {
            /*
                r16 = this;
                r1 = r17
                r0 = r18
                r2 = r19
                r3 = r20
                r4 = r16
                androidx.emoji2.text.h r5 = r4.f1135b
                java.util.Objects.requireNonNull(r5)
                boolean r6 = r1 instanceof androidx.emoji2.text.n
                if (r6 == 0) goto L_0x0019
                r7 = r1
                androidx.emoji2.text.n r7 = (androidx.emoji2.text.n) r7
                r7.a()
            L_0x0019:
                r7 = 0
                if (r6 != 0) goto L_0x003c
                boolean r8 = r1 instanceof android.text.Spannable     // Catch:{ all -> 0x014d }
                if (r8 == 0) goto L_0x0021
                goto L_0x003c
            L_0x0021:
                boolean r8 = r1 instanceof android.text.Spanned     // Catch:{ all -> 0x014d }
                if (r8 == 0) goto L_0x003a
                r8 = r1
                android.text.Spanned r8 = (android.text.Spanned) r8     // Catch:{ all -> 0x014d }
                int r9 = r0 + -1
                int r10 = r2 + 1
                java.lang.Class<androidx.emoji2.text.i> r11 = androidx.emoji2.text.i.class
                int r8 = r8.nextSpanTransition(r9, r10, r11)     // Catch:{ all -> 0x014d }
                if (r8 > r2) goto L_0x003a
                android.text.SpannableString r8 = new android.text.SpannableString     // Catch:{ all -> 0x014d }
                r8.<init>(r1)     // Catch:{ all -> 0x014d }
                goto L_0x003f
            L_0x003a:
                r8 = r7
                goto L_0x003f
            L_0x003c:
                r8 = r1
                android.text.Spannable r8 = (android.text.Spannable) r8     // Catch:{ all -> 0x014d }
            L_0x003f:
                r9 = 0
                if (r8 == 0) goto L_0x006d
                java.lang.Class<androidx.emoji2.text.i> r10 = androidx.emoji2.text.i.class
                java.lang.Object[] r10 = r8.getSpans(r0, r2, r10)     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.i[] r10 = (androidx.emoji2.text.i[]) r10     // Catch:{ all -> 0x014d }
                if (r10 == 0) goto L_0x006d
                int r11 = r10.length     // Catch:{ all -> 0x014d }
                if (r11 <= 0) goto L_0x006d
                int r11 = r10.length     // Catch:{ all -> 0x014d }
                r12 = 0
            L_0x0051:
                if (r12 >= r11) goto L_0x006d
                r13 = r10[r12]     // Catch:{ all -> 0x014d }
                int r14 = r8.getSpanStart(r13)     // Catch:{ all -> 0x014d }
                int r15 = r8.getSpanEnd(r13)     // Catch:{ all -> 0x014d }
                if (r14 == r2) goto L_0x0062
                r8.removeSpan(r13)     // Catch:{ all -> 0x014d }
            L_0x0062:
                int r0 = java.lang.Math.min(r14, r0)     // Catch:{ all -> 0x014d }
                int r2 = java.lang.Math.max(r15, r2)     // Catch:{ all -> 0x014d }
                int r12 = r12 + 1
                goto L_0x0051
            L_0x006d:
                if (r0 == r2) goto L_0x0144
                int r10 = r17.length()     // Catch:{ all -> 0x014d }
                if (r0 < r10) goto L_0x0077
                goto L_0x0144
            L_0x0077:
                r10 = 2147483647(0x7fffffff, float:NaN)
                if (r3 == r10) goto L_0x008c
                if (r8 == 0) goto L_0x008c
                int r10 = r8.length()     // Catch:{ all -> 0x014d }
                java.lang.Class<androidx.emoji2.text.i> r11 = androidx.emoji2.text.i.class
                java.lang.Object[] r10 = r8.getSpans(r9, r10, r11)     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.i[] r10 = (androidx.emoji2.text.i[]) r10     // Catch:{ all -> 0x014d }
                int r10 = r10.length     // Catch:{ all -> 0x014d }
                int r3 = r3 - r10
            L_0x008c:
                androidx.emoji2.text.h$b r10 = new androidx.emoji2.text.h$b     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.m r11 = r5.f1154b     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.m$a r11 = r11.f1183c     // Catch:{ all -> 0x014d }
                r10.<init>(r11, r9, r7)     // Catch:{ all -> 0x014d }
                int r7 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x014d }
                r11 = 0
            L_0x009a:
                r12 = r7
                r7 = r0
            L_0x009c:
                r13 = 33
                r14 = 2
                r15 = 1
                if (r0 >= r2) goto L_0x00f7
                if (r11 >= r3) goto L_0x00f7
                int r9 = r10.a(r12)     // Catch:{ all -> 0x014d }
                if (r9 == r15) goto L_0x00e5
                if (r9 == r14) goto L_0x00d9
                r14 = 3
                if (r9 == r14) goto L_0x00b0
                goto L_0x00f5
            L_0x00b0:
                if (r21 != 0) goto L_0x00bc
                androidx.emoji2.text.m$a r9 = r10.f1161d     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.g r9 = r9.f1186b     // Catch:{ all -> 0x014d }
                boolean r9 = r5.b(r1, r7, r0, r9)     // Catch:{ all -> 0x014d }
                if (r9 != 0) goto L_0x00d6
            L_0x00bc:
                if (r8 != 0) goto L_0x00c3
                android.text.SpannableString r8 = new android.text.SpannableString     // Catch:{ all -> 0x014d }
                r8.<init>(r1)     // Catch:{ all -> 0x014d }
            L_0x00c3:
                androidx.emoji2.text.m$a r9 = r10.f1161d     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.g r9 = r9.f1186b     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.d$i r14 = r5.f1153a     // Catch:{ all -> 0x014d }
                java.util.Objects.requireNonNull(r14)     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.o r14 = new androidx.emoji2.text.o     // Catch:{ all -> 0x014d }
                r14.<init>(r9)     // Catch:{ all -> 0x014d }
                r8.setSpan(r14, r7, r0, r13)     // Catch:{ all -> 0x014d }
                int r11 = r11 + 1
            L_0x00d6:
                r7 = r12
                r9 = 0
                goto L_0x009a
            L_0x00d9:
                int r9 = java.lang.Character.charCount(r12)     // Catch:{ all -> 0x014d }
                int r0 = r0 + r9
                if (r0 >= r2) goto L_0x00f5
                int r12 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x014d }
                goto L_0x00f5
            L_0x00e5:
                int r0 = java.lang.Character.codePointAt(r1, r7)     // Catch:{ all -> 0x014d }
                int r0 = java.lang.Character.charCount(r0)     // Catch:{ all -> 0x014d }
                int r0 = r0 + r7
                if (r0 >= r2) goto L_0x00f4
                int r12 = java.lang.Character.codePointAt(r1, r0)     // Catch:{ all -> 0x014d }
            L_0x00f4:
                r7 = r0
            L_0x00f5:
                r9 = 0
                goto L_0x009c
            L_0x00f7:
                int r2 = r10.f1158a     // Catch:{ all -> 0x014d }
                if (r2 != r14) goto L_0x010d
                androidx.emoji2.text.m$a r2 = r10.f1160c     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.g r2 = r2.f1186b     // Catch:{ all -> 0x014d }
                if (r2 == 0) goto L_0x010d
                int r2 = r10.f1163f     // Catch:{ all -> 0x014d }
                if (r2 > r15) goto L_0x010b
                boolean r2 = r10.c()     // Catch:{ all -> 0x014d }
                if (r2 == 0) goto L_0x010d
            L_0x010b:
                r9 = 1
                goto L_0x010e
            L_0x010d:
                r9 = 0
            L_0x010e:
                if (r9 == 0) goto L_0x0137
                if (r11 >= r3) goto L_0x0137
                if (r21 != 0) goto L_0x011e
                androidx.emoji2.text.m$a r2 = r10.f1160c     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.g r2 = r2.f1186b     // Catch:{ all -> 0x014d }
                boolean r2 = r5.b(r1, r7, r0, r2)     // Catch:{ all -> 0x014d }
                if (r2 != 0) goto L_0x0137
            L_0x011e:
                if (r8 != 0) goto L_0x0126
                android.text.SpannableString r2 = new android.text.SpannableString     // Catch:{ all -> 0x014d }
                r2.<init>(r1)     // Catch:{ all -> 0x014d }
                r8 = r2
            L_0x0126:
                androidx.emoji2.text.m$a r2 = r10.f1160c     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.g r2 = r2.f1186b     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.d$i r3 = r5.f1153a     // Catch:{ all -> 0x014d }
                java.util.Objects.requireNonNull(r3)     // Catch:{ all -> 0x014d }
                androidx.emoji2.text.o r3 = new androidx.emoji2.text.o     // Catch:{ all -> 0x014d }
                r3.<init>(r2)     // Catch:{ all -> 0x014d }
                r8.setSpan(r3, r7, r0, r13)     // Catch:{ all -> 0x014d }
            L_0x0137:
                if (r8 != 0) goto L_0x013a
                r8 = r1
            L_0x013a:
                if (r6 == 0) goto L_0x0142
                r0 = r1
                androidx.emoji2.text.n r0 = (androidx.emoji2.text.n) r0
                r0.b()
            L_0x0142:
                r1 = r8
                goto L_0x014c
            L_0x0144:
                if (r6 == 0) goto L_0x014c
                r0 = r1
                androidx.emoji2.text.n r0 = (androidx.emoji2.text.n) r0
                r0.b()
            L_0x014c:
                return r1
            L_0x014d:
                r0 = move-exception
                if (r6 == 0) goto L_0x0155
                androidx.emoji2.text.n r1 = (androidx.emoji2.text.n) r1
                r1.b()
            L_0x0155:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.d.a.b(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
        }

        public void c(EditorInfo editorInfo) {
            Bundle bundle = editorInfo.extras;
            n0.b bVar = this.f1136c.f1181a;
            int a2 = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a2 != 0 ? bVar.f3483b.getInt(a2 + bVar.f3482a) : 0);
            Bundle bundle2 = editorInfo.extras;
            Objects.requireNonNull(this.f1138a);
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final d f1138a;

        public b(d dVar) {
            this.f1138a = dVar;
        }

        public void a() {
            throw null;
        }

        public CharSequence b(CharSequence charSequence, int i2, int i3, int i4, boolean z2) {
            throw null;
        }

        public void c(EditorInfo editorInfo) {
            throw null;
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final g f1139a;

        /* renamed from: b  reason: collision with root package name */
        public int f1140b = 0;

        /* renamed from: c  reason: collision with root package name */
        public C0008d f1141c = new h.a();

        public c(g gVar) {
            this.f1139a = gVar;
        }
    }

    /* renamed from: androidx.emoji2.text.d$d  reason: collision with other inner class name */
    public interface C0008d {
    }

    public static abstract class e {
        public void a() {
        }
    }

    public static class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        public final List<e> f1142b;

        /* renamed from: c  reason: collision with root package name */
        public final int f1143c;

        public f(Collection<e> collection, int i2, Throwable th) {
            c.a.d(collection, "initCallbacks cannot be null");
            this.f1142b = new ArrayList(collection);
            this.f1143c = i2;
        }

        public void run() {
            int size = this.f1142b.size();
            int i2 = 0;
            if (this.f1143c != 1) {
                while (i2 < size) {
                    Objects.requireNonNull(this.f1142b.get(i2));
                    i2++;
                }
                return;
            }
            while (i2 < size) {
                this.f1142b.get(i2).a();
                i2++;
            }
        }
    }

    public interface g {
        void a(h hVar);
    }

    public static abstract class h {
        public abstract void a(Throwable th);

        public abstract void b(m mVar);
    }

    public static class i {
    }

    public d(c cVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f1126a = reentrantReadWriteLock;
        Objects.requireNonNull(cVar);
        this.f1132g = -16711936;
        this.f1131f = cVar.f1139a;
        int i2 = cVar.f1140b;
        this.f1133h = i2;
        this.f1134i = cVar.f1141c;
        this.f1129d = new Handler(Looper.getMainLooper());
        this.f1127b = new m.c();
        a aVar = new a(this);
        this.f1130e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i2 == 0) {
            try {
                this.f1128c = 0;
            } catch (Throwable th) {
                this.f1126a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            aVar.a();
        }
    }

    public static d a() {
        d dVar;
        synchronized (f1124j) {
            dVar = f1125k;
            c.a.f(dVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return dVar;
    }

    public static boolean c() {
        return f1125k != null;
    }

    public int b() {
        this.f1126a.readLock().lock();
        try {
            return this.f1128c;
        } finally {
            this.f1126a.readLock().unlock();
        }
    }

    public final boolean d() {
        return b() == 1;
    }

    public void e() {
        boolean z2 = true;
        if (this.f1133h != 1) {
            z2 = false;
        }
        c.a.f(z2, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (!d()) {
            this.f1126a.writeLock().lock();
            try {
                if (this.f1128c != 0) {
                    this.f1128c = 0;
                    this.f1126a.writeLock().unlock();
                    this.f1130e.a();
                }
            } finally {
                this.f1126a.writeLock().unlock();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void f(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f1126a.writeLock().lock();
        try {
            this.f1128c = 2;
            arrayList.addAll(this.f1127b);
            this.f1127b.clear();
            this.f1126a.writeLock().unlock();
            this.f1129d.post(new f(arrayList, this.f1128c, th));
        } catch (Throwable th2) {
            this.f1126a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public void g() {
        ArrayList arrayList = new ArrayList();
        this.f1126a.writeLock().lock();
        try {
            this.f1128c = 1;
            arrayList.addAll(this.f1127b);
            this.f1127b.clear();
            this.f1126a.writeLock().unlock();
            this.f1129d.post(new f(arrayList, this.f1128c, (Throwable) null));
        } catch (Throwable th) {
            this.f1126a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, 0, charSequence == null ? 0 : charSequence.length(), Integer.MAX_VALUE, 0);
    }

    public CharSequence i(CharSequence charSequence, int i2, int i3, int i4, int i5) {
        c.a.f(d(), "Not initialized yet");
        c.a.c(i2, "start cannot be negative");
        c.a.c(i3, "end cannot be negative");
        c.a.c(i4, "maxEmojiCount cannot be negative");
        c.a.a(i2 <= i3, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        c.a.a(i2 <= charSequence.length(), "start should be < than charSequence length");
        c.a.a(i3 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i2 == i3) {
            return charSequence;
        }
        return this.f1130e.b(charSequence, i2, i3, i4, i5 == 1);
    }

    public void j(e eVar) {
        c.a.d(eVar, "initCallback cannot be null");
        this.f1126a.writeLock().lock();
        try {
            if (this.f1128c != 1) {
                if (this.f1128c != 2) {
                    this.f1127b.add(eVar);
                }
            }
            Handler handler = this.f1129d;
            int i2 = this.f1128c;
            c.a.d(eVar, "initCallback cannot be null");
            handler.post(new f(Arrays.asList(new e[]{eVar}), i2, (Throwable) null));
        } finally {
            this.f1126a.writeLock().unlock();
        }
    }
}
