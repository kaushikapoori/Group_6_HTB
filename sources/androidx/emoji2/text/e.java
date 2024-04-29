package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import androidx.emoji2.text.j;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;

public final /* synthetic */ class e implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer.b f1144b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.h f1145c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1146d;

    public /* synthetic */ e(EmojiCompatInitializer.b bVar, d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1144b = bVar;
        this.f1145c = hVar;
        this.f1146d = threadPoolExecutor;
    }

    public final void run() {
        EmojiCompatInitializer.b bVar = this.f1144b;
        d.h hVar = this.f1145c;
        ThreadPoolExecutor threadPoolExecutor = this.f1146d;
        Objects.requireNonNull(bVar);
        try {
            j a2 = c.a(bVar.f1122a);
            if (a2 != null) {
                j.b bVar2 = (j.b) a2.f1139a;
                synchronized (bVar2.f1172d) {
                    bVar2.f1174f = threadPoolExecutor;
                }
                a2.f1139a.a(new f(bVar, hVar, threadPoolExecutor));
                return;
            }
            throw new RuntimeException("EmojiCompat font provider not available on this device.");
        } catch (Throwable th) {
            hVar.a(th);
            threadPoolExecutor.shutdown();
        }
    }
}
