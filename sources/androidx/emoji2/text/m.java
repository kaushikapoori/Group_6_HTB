package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import n0.b;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final b f1181a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f1182b;

    /* renamed from: c  reason: collision with root package name */
    public final a f1183c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f1184d;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f1185a;

        /* renamed from: b  reason: collision with root package name */
        public g f1186b;

        public a() {
            this.f1185a = new SparseArray<>(1);
        }

        public a(int i2) {
            this.f1185a = new SparseArray<>(i2);
        }

        public void a(g gVar, int i2, int i3) {
            int a2 = gVar.a(i2);
            SparseArray<a> sparseArray = this.f1185a;
            a aVar = sparseArray == null ? null : sparseArray.get(a2);
            if (aVar == null) {
                aVar = new a();
                this.f1185a.put(gVar.a(i2), aVar);
            }
            if (i3 > i2) {
                aVar.a(gVar, i2 + 1, i3);
            } else {
                aVar.f1186b = gVar;
            }
        }
    }

    public m(Typeface typeface, b bVar) {
        this.f1184d = typeface;
        this.f1181a = bVar;
        this.f1182b = new char[(bVar.c() * 2)];
        int c2 = bVar.c();
        for (int i2 = 0; i2 < c2; i2++) {
            g gVar = new g(this, i2);
            Character.toChars(gVar.d(), this.f1182b, i2 * 2);
            c.a.a(gVar.b() > 0, "invalid metadata codepoint length");
            this.f1183c.a(gVar, 0, gVar.b() - 1);
        }
    }
}
