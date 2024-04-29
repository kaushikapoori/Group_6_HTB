package g0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import java.util.Objects;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final e f3029a;

    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo.Builder f3030a;

        public a(ClipData clipData, int i2) {
            this.f3030a = new ContentInfo.Builder(clipData, i2);
        }

        public void a(Bundle bundle) {
            this.f3030a.setExtras(bundle);
        }

        public void b(Uri uri) {
            this.f3030a.setLinkUri(uri);
        }

        public c c() {
            return new c(new d(this.f3030a.build()));
        }

        public void d(int i2) {
            this.f3030a.setFlags(i2);
        }
    }

    public interface b {
        void a(Bundle bundle);

        void b(Uri uri);

        c c();

        void d(int i2);
    }

    /* renamed from: g0.c$c  reason: collision with other inner class name */
    public static final class C0032c implements b {

        /* renamed from: a  reason: collision with root package name */
        public ClipData f3031a;

        /* renamed from: b  reason: collision with root package name */
        public int f3032b;

        /* renamed from: c  reason: collision with root package name */
        public int f3033c;

        /* renamed from: d  reason: collision with root package name */
        public Uri f3034d;

        /* renamed from: e  reason: collision with root package name */
        public Bundle f3035e;

        public C0032c(ClipData clipData, int i2) {
            this.f3031a = clipData;
            this.f3032b = i2;
        }

        public void a(Bundle bundle) {
            this.f3035e = bundle;
        }

        public void b(Uri uri) {
            this.f3034d = uri;
        }

        public c c() {
            return new c(new f(this));
        }

        public void d(int i2) {
            this.f3033c = i2;
        }
    }

    public static final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ContentInfo f3036a;

        public d(ContentInfo contentInfo) {
            Objects.requireNonNull(contentInfo);
            this.f3036a = contentInfo;
        }

        public int a() {
            return this.f3036a.getSource();
        }

        public ClipData b() {
            return this.f3036a.getClip();
        }

        public int c() {
            return this.f3036a.getFlags();
        }

        public ContentInfo d() {
            return this.f3036a;
        }

        public String toString() {
            StringBuilder a2 = androidx.activity.result.a.a("ContentInfoCompat{");
            a2.append(this.f3036a);
            a2.append("}");
            return a2.toString();
        }
    }

    public interface e {
        int a();

        ClipData b();

        int c();

        ContentInfo d();
    }

    public static final class f implements e {

        /* renamed from: a  reason: collision with root package name */
        public final ClipData f3037a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3038b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3039c;

        /* renamed from: d  reason: collision with root package name */
        public final Uri f3040d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f3041e;

        public f(C0032c cVar) {
            ClipData clipData = cVar.f3031a;
            Objects.requireNonNull(clipData);
            this.f3037a = clipData;
            int i2 = cVar.f3032b;
            if (i2 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{"source", 0, 5}));
            } else if (i2 <= 5) {
                this.f3038b = i2;
                int i3 = cVar.f3033c;
                if ((i3 & 1) == i3) {
                    this.f3039c = i3;
                    this.f3040d = cVar.f3034d;
                    this.f3041e = cVar.f3035e;
                    return;
                }
                StringBuilder a2 = androidx.activity.result.a.a("Requested flags 0x");
                a2.append(Integer.toHexString(i3));
                a2.append(", but only 0x");
                a2.append(Integer.toHexString(1));
                a2.append(" are allowed");
                throw new IllegalArgumentException(a2.toString());
            } else {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{"source", 0, 5}));
            }
        }

        public int a() {
            return this.f3038b;
        }

        public ClipData b() {
            return this.f3037a;
        }

        public int c() {
            return this.f3039c;
        }

        public ContentInfo d() {
            return null;
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder a2 = androidx.activity.result.a.a("ContentInfoCompat{clip=");
            a2.append(this.f3037a.getDescription());
            a2.append(", source=");
            int i2 = this.f3038b;
            a2.append(i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? String.valueOf(i2) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
            a2.append(", flags=");
            int i3 = this.f3039c;
            if ((i3 & 1) != 0) {
                str = "FLAG_CONVERT_TO_PLAIN_TEXT";
            } else {
                str = String.valueOf(i3);
            }
            a2.append(str);
            String str3 = "";
            if (this.f3040d == null) {
                str2 = str3;
            } else {
                StringBuilder a3 = androidx.activity.result.a.a(", hasLinkUri(");
                a3.append(this.f3040d.toString().length());
                a3.append(")");
                str2 = a3.toString();
            }
            a2.append(str2);
            if (this.f3041e != null) {
                str3 = ", hasExtras";
            }
            a2.append(str3);
            a2.append("}");
            return a2.toString();
        }
    }

    public c(e eVar) {
        this.f3029a = eVar;
    }

    public String toString() {
        return this.f3029a.toString();
    }
}
