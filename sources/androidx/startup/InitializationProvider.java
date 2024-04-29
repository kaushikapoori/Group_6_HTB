package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Trace;
import com.example.supermarket.R;
import java.util.HashSet;
import java.util.Objects;
import t0.a;
import t0.b;
import t0.c;

public final class InitializationProvider extends ContentProvider {
    public int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    public String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            a b2 = a.b(context);
            Objects.requireNonNull(b2);
            try {
                Trace.beginSection("Startup");
                Bundle bundle = b2.f3889c.getPackageManager().getProviderInfo(new ComponentName(b2.f3889c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = b2.f3889c.getString(R.string.androidx_startup);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, (String) null))) {
                            Class<?> cls = Class.forName(str);
                            if (b.class.isAssignableFrom(cls)) {
                                b2.f3888b.add(cls);
                                b2.a(cls, hashSet);
                            }
                        }
                    }
                }
                Trace.endSection();
                return true;
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException e2) {
                throw new c(e2);
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            throw new c("Context cannot be null");
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
