package d;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

public class r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2782a;

    /* renamed from: b  reason: collision with root package name */
    public Deque<WeakReference<XmlPullParser>> f2783b;

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>>, java.util.HashMap] */
    public r(int i2) {
        this.f2782a = i2;
        if (i2 != 1) {
            this.f2783b = new ArrayDeque();
        } else {
            this.f2783b = new HashMap();
        }
    }
}
