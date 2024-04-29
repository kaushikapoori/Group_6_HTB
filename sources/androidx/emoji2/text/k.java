package androidx.emoji2.text;

import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.j;

public final /* synthetic */ class k implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f1179b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1180c;

    public /* synthetic */ k(Toolbar toolbar) {
        this.f1179b = 2;
        this.f1180c = toolbar;
    }

    public /* synthetic */ k(j.b bVar, int i2) {
        this.f1179b = i2;
        this.f1180c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1 = r0.d();
        r2 = r1.f2870e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r2 != 2) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r3 = r0.f1172d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002f, code lost:
        if (r2 != 0) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3 = c0.c.f2067a;
        android.os.Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
        r2 = r0.f1171c;
        r3 = r0.f1169a;
        java.util.Objects.requireNonNull(r2);
        r2 = z.f.f4399a.b(r3, (android.os.CancellationSignal) null, new d0.l[]{r1}, 0);
        r1 = z.m.d(r0.f1169a, (android.os.CancellationSignal) null, r1.f2866a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r1 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0056, code lost:
        if (r2 == null) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        android.os.Trace.beginSection("EmojiCompat.MetadataRepo.create");
        r3 = new androidx.emoji2.text.m(r2, androidx.emoji2.text.l.a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        android.os.Trace.endSection();
        r1 = r0.f1172d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x006e, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r2 = r0.f1176h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0071, code lost:
        if (r2 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
        r2.b(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0076, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r2 = c0.c.f2067a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0084, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x008c, code lost:
        throw new java.lang.RuntimeException("Unable to open file.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x008d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r2 = c0.c.f2067a;
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0093, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00af, code lost:
        throw new java.lang.RuntimeException("fetchFonts result is not OK. (" + r2 + ")");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00b0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b3, code lost:
        monitor-enter(r0.f1172d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        r3 = r0.f1176h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00b6, code lost:
        if (r3 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00b8, code lost:
        r3.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00bc, code lost:
        r0.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r7 = this;
            int r0 = r7.f1179b
            switch(r0) {
                case 0: goto L_0x000f;
                case 1: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x00c6
        L_0x0007:
            java.lang.Object r0 = r7.f1180c
            androidx.emoji2.text.j$b r0 = (androidx.emoji2.text.j.b) r0
            r0.c()
            return
        L_0x000f:
            java.lang.Object r0 = r7.f1180c
            androidx.emoji2.text.j$b r0 = (androidx.emoji2.text.j.b) r0
            java.lang.Object r1 = r0.f1172d
            monitor-enter(r1)
            androidx.emoji2.text.d$h r2 = r0.f1176h     // Catch:{ all -> 0x00c3 }
            if (r2 != 0) goto L_0x001d
            monitor-exit(r1)     // Catch:{ all -> 0x00c3 }
            goto L_0x00bf
        L_0x001d:
            monitor-exit(r1)     // Catch:{ all -> 0x00c3 }
            d0.l r1 = r0.d()     // Catch:{ all -> 0x00b0 }
            int r2 = r1.f2870e     // Catch:{ all -> 0x00b0 }
            r3 = 2
            if (r2 != r3) goto L_0x002f
            java.lang.Object r3 = r0.f1172d     // Catch:{ all -> 0x00b0 }
            monitor-enter(r3)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x002f:
            if (r2 != 0) goto L_0x0094
            java.lang.String r2 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
            int r3 = c0.c.f2067a     // Catch:{ all -> 0x008d }
            android.os.Trace.beginSection(r2)     // Catch:{ all -> 0x008d }
            androidx.emoji2.text.j$a r2 = r0.f1171c     // Catch:{ all -> 0x008d }
            android.content.Context r3 = r0.f1169a     // Catch:{ all -> 0x008d }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x008d }
            r2 = 1
            d0.l[] r2 = new d0.l[r2]     // Catch:{ all -> 0x008d }
            r4 = 0
            r2[r4] = r1     // Catch:{ all -> 0x008d }
            z.l r5 = z.f.f4399a     // Catch:{ all -> 0x008d }
            r6 = 0
            android.graphics.Typeface r2 = r5.b(r3, r6, r2, r4)     // Catch:{ all -> 0x008d }
            android.content.Context r3 = r0.f1169a     // Catch:{ all -> 0x008d }
            android.net.Uri r1 = r1.f2866a     // Catch:{ all -> 0x008d }
            java.nio.ByteBuffer r1 = z.m.d(r3, r6, r1)     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x0085
            if (r2 == 0) goto L_0x0085
            java.lang.String r3 = "EmojiCompat.MetadataRepo.create"
            android.os.Trace.beginSection(r3)     // Catch:{ all -> 0x007e }
            androidx.emoji2.text.m r3 = new androidx.emoji2.text.m     // Catch:{ all -> 0x007e }
            n0.b r1 = androidx.emoji2.text.l.a(r1)     // Catch:{ all -> 0x007e }
            r3.<init>(r2, r1)     // Catch:{ all -> 0x007e }
            android.os.Trace.endSection()     // Catch:{ all -> 0x008d }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00b0 }
            java.lang.Object r1 = r0.f1172d     // Catch:{ all -> 0x00b0 }
            monitor-enter(r1)     // Catch:{ all -> 0x00b0 }
            androidx.emoji2.text.d$h r2 = r0.f1176h     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x0076
            r2.b(r3)     // Catch:{ all -> 0x007b }
        L_0x0076:
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            r0.b()     // Catch:{ all -> 0x00b0 }
            goto L_0x00bf
        L_0x007b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007b }
            throw r2     // Catch:{ all -> 0x00b0 }
        L_0x007e:
            r1 = move-exception
            int r2 = c0.c.f2067a     // Catch:{ all -> 0x008d }
            android.os.Trace.endSection()     // Catch:{ all -> 0x008d }
            throw r1     // Catch:{ all -> 0x008d }
        L_0x0085:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x008d }
            java.lang.String r2 = "Unable to open file."
            r1.<init>(r2)     // Catch:{ all -> 0x008d }
            throw r1     // Catch:{ all -> 0x008d }
        L_0x008d:
            r1 = move-exception
            int r2 = c0.c.f2067a     // Catch:{ all -> 0x00b0 }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00b0 }
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x0094:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b0 }
            r3.<init>()     // Catch:{ all -> 0x00b0 }
            java.lang.String r4 = "fetchFonts result is not OK. ("
            r3.append(r4)     // Catch:{ all -> 0x00b0 }
            r3.append(r2)     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = ")"
            r3.append(r2)     // Catch:{ all -> 0x00b0 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00b0 }
            r1.<init>(r2)     // Catch:{ all -> 0x00b0 }
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r1 = move-exception
            java.lang.Object r2 = r0.f1172d
            monitor-enter(r2)
            androidx.emoji2.text.d$h r3 = r0.f1176h     // Catch:{ all -> 0x00c0 }
            if (r3 == 0) goto L_0x00bb
            r3.a(r1)     // Catch:{ all -> 0x00c0 }
        L_0x00bb:
            monitor-exit(r2)     // Catch:{ all -> 0x00c0 }
            r0.b()
        L_0x00bf:
            return
        L_0x00c0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c0 }
            throw r0
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c3 }
            throw r0
        L_0x00c6:
            java.lang.Object r0 = r7.f1180c
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            r0.o()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.k.run():void");
    }
}
