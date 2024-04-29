package d0;

import android.util.Base64;
import androidx.activity.result.a;
import java.util.List;
import java.util.Objects;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f2843a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2844b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2845c;

    /* renamed from: d  reason: collision with root package name */
    public final List<List<byte[]>> f2846d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2847e;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        Objects.requireNonNull(str);
        this.f2843a = str;
        Objects.requireNonNull(str2);
        this.f2844b = str2;
        this.f2845c = str3;
        Objects.requireNonNull(list);
        this.f2846d = list;
        this.f2847e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder a2 = a.a("FontRequest {mProviderAuthority: ");
        a2.append(this.f2843a);
        a2.append(", mProviderPackage: ");
        a2.append(this.f2844b);
        a2.append(", mQuery: ");
        a2.append(this.f2845c);
        a2.append(", mCertificates:");
        sb.append(a2.toString());
        for (int i2 = 0; i2 < this.f2846d.size(); i2++) {
            sb.append(" [");
            List list = this.f2846d.get(i2);
            for (int i3 = 0; i3 < list.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}
