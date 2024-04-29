package z;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import y.e;

public class l {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a  reason: collision with root package name */
    public ConcurrentHashMap<Long, e.b> f4418a = new ConcurrentHashMap<>();

    public Typeface a(Context context, e.b bVar, Resources resources, int i2) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, d0.l[] lVarArr, int i2) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File c2 = m.c(context);
        if (c2 == null) {
            return null;
        }
        try {
            if (!m.b(c2, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(c2.getPath());
            c2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            c2.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        File c2 = m.c(context);
        if (c2 == null) {
            return null;
        }
        try {
            if (!m.a(c2, resources, i2)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(c2.getPath());
            c2.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            c2.delete();
        }
    }

    public d0.l e(d0.l[] lVarArr, int i2) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        d0.l lVar = null;
        int i4 = Integer.MAX_VALUE;
        for (d0.l lVar2 : lVarArr) {
            int abs = (Math.abs(lVar2.f2868c - i3) * 2) + (lVar2.f2869d == z2 ? 0 : 1);
            if (lVar == null || i4 > abs) {
                lVar = lVar2;
                i4 = abs;
            }
        }
        return lVar;
    }
}
