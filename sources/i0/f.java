package i0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final c f3223a;

    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final InputContentInfo f3224a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f3224a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f3224a = (InputContentInfo) obj;
        }

        public ClipDescription a() {
            return this.f3224a.getDescription();
        }

        public void b() {
            this.f3224a.requestPermission();
        }

        public Uri c() {
            return this.f3224a.getLinkUri();
        }

        public Object d() {
            return this.f3224a;
        }

        public Uri e() {
            return this.f3224a.getContentUri();
        }
    }

    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f3225a;

        /* renamed from: b  reason: collision with root package name */
        public final ClipDescription f3226b;

        /* renamed from: c  reason: collision with root package name */
        public final Uri f3227c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f3225a = uri;
            this.f3226b = clipDescription;
            this.f3227c = uri2;
        }

        public ClipDescription a() {
            return this.f3226b;
        }

        public void b() {
        }

        public Uri c() {
            return this.f3227c;
        }

        public Object d() {
            return null;
        }

        public Uri e() {
            return this.f3225a;
        }
    }

    public interface c {
        ClipDescription a();

        void b();

        Uri c();

        Object d();

        Uri e();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3223a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public f(c cVar) {
        this.f3223a = cVar;
    }
}
