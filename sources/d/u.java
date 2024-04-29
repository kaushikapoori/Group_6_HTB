package d;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

public class u {

    /* renamed from: d  reason: collision with root package name */
    public static u f2796d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f2797a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f2798b;

    /* renamed from: c  reason: collision with root package name */
    public final a f2799c = new a();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2800a;

        /* renamed from: b  reason: collision with root package name */
        public long f2801b;
    }

    public u(Context context, LocationManager locationManager) {
        this.f2797a = context;
        this.f2798b = locationManager;
    }

    public final Location a(String str) {
        try {
            if (this.f2798b.isProviderEnabled(str)) {
                return this.f2798b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }
}
