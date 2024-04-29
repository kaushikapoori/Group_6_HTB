package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;
import x0.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        Object obj = remoteActionCompat.f1077a;
        if (aVar.i(1)) {
            obj = aVar.o();
        }
        remoteActionCompat.f1077a = (IconCompat) obj;
        CharSequence charSequence = remoteActionCompat.f1078b;
        if (aVar.i(2)) {
            charSequence = aVar.h();
        }
        remoteActionCompat.f1078b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1079c;
        if (aVar.i(3)) {
            charSequence2 = aVar.h();
        }
        remoteActionCompat.f1079c = charSequence2;
        remoteActionCompat.f1080d = (PendingIntent) aVar.m(remoteActionCompat.f1080d, 4);
        boolean z2 = remoteActionCompat.f1081e;
        if (aVar.i(5)) {
            z2 = aVar.f();
        }
        remoteActionCompat.f1081e = z2;
        boolean z3 = remoteActionCompat.f1082f;
        if (aVar.i(6)) {
            z3 = aVar.f();
        }
        remoteActionCompat.f1082f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        Objects.requireNonNull(aVar);
        IconCompat iconCompat = remoteActionCompat.f1077a;
        aVar.p(1);
        aVar.w(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1078b;
        aVar.p(2);
        aVar.s(charSequence);
        CharSequence charSequence2 = remoteActionCompat.f1079c;
        aVar.p(3);
        aVar.s(charSequence2);
        PendingIntent pendingIntent = remoteActionCompat.f1080d;
        aVar.p(4);
        aVar.u(pendingIntent);
        boolean z2 = remoteActionCompat.f1081e;
        aVar.p(5);
        aVar.q(z2);
        boolean z3 = remoteActionCompat.f1082f;
        aVar.p(6);
        aVar.q(z3);
    }
}
