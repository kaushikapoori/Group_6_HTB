package r0;

import androidx.lifecycle.k;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import androidx.lifecycle.y;
import h.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import m.i;

public class b extends a {

    /* renamed from: a  reason: collision with root package name */
    public final k f3813a;

    /* renamed from: b  reason: collision with root package name */
    public final C0048b f3814b;

    public static class a<D> extends o<D> {
        public void e() {
            throw null;
        }

        public void f() {
            throw null;
        }

        public void g(p<? super D> pVar) {
            super.g(pVar);
        }

        public void h(D d2) {
            super.h(d2);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(0);
            sb.append(" : ");
            c.b.a((Object) null, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: r0.b$b  reason: collision with other inner class name */
    public static class C0048b extends u {

        /* renamed from: c  reason: collision with root package name */
        public static final v f3815c = new a();

        /* renamed from: b  reason: collision with root package name */
        public i<a> f3816b = new i<>();

        /* renamed from: r0.b$b$a */
        public static class a implements v {
            public <T extends u> T a(Class<T> cls) {
                return new C0048b();
            }
        }

        public void a() {
            i<a> iVar = this.f3816b;
            int i2 = iVar.f3381d;
            if (i2 <= 0) {
                Object[] objArr = iVar.f3380c;
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[i3] = null;
                }
                iVar.f3381d = 0;
                return;
            }
            Objects.requireNonNull((a) iVar.f3380c[0]);
            throw null;
        }
    }

    public b(k kVar, y yVar) {
        this.f3813a = kVar;
        v vVar = C0048b.f3815c;
        Class cls = C0048b.class;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            String a2 = f.a("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
            u uVar = yVar.f1606a.get(a2);
            if (!cls.isInstance(uVar)) {
                uVar = vVar instanceof w ? ((w) vVar).a(a2, cls) : ((C0048b.a) vVar).a(cls);
                u put = yVar.f1606a.put(a2, uVar);
                if (put != null) {
                    put.a();
                }
            } else if (vVar instanceof x) {
                x xVar = (x) vVar;
            }
            this.f3814b = (C0048b) uVar;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0048b bVar = this.f3814b;
        if (bVar.f3816b.f3381d > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            i<a> iVar = bVar.f3816b;
            if (iVar.f3381d > 0) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(bVar.f3816b.f3379b[0]);
                printWriter.print(": ");
                printWriter.println(((a) iVar.f3380c[0]).toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(0);
                printWriter.print(" mArgs=");
                printWriter.println((Object) null);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println((Object) null);
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        c.b.a(this.f3813a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
