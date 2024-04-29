package r0;

import androidx.lifecycle.k;
import androidx.lifecycle.z;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends k & z> a b(T t2) {
        return new b(t2, ((z) t2).f());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
