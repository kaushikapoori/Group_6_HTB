package androidx.emoji2.text;

import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import java.util.concurrent.ThreadPoolExecutor;

public class f extends d.h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.h f1147a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f1148b;

    public f(EmojiCompatInitializer.b bVar, d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
        this.f1147a = hVar;
        this.f1148b = threadPoolExecutor;
    }

    public void a(Throwable th) {
        try {
            this.f1147a.a(th);
        } finally {
            this.f1148b.shutdown();
        }
    }

    public void b(m mVar) {
        try {
            this.f1147a.b(mVar);
        } finally {
            this.f1148b.shutdown();
        }
    }
}
