package y;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class e {

    public interface a {
    }

    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final c[] f4326a;

        public b(c[] cVarArr) {
            this.f4326a = cVarArr;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f4327a;

        /* renamed from: b  reason: collision with root package name */
        public int f4328b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4329c;

        /* renamed from: d  reason: collision with root package name */
        public String f4330d;

        /* renamed from: e  reason: collision with root package name */
        public int f4331e;

        /* renamed from: f  reason: collision with root package name */
        public int f4332f;

        public c(String str, int i2, boolean z2, String str2, int i3, int i4) {
            this.f4327a = str;
            this.f4328b = i2;
            this.f4329c = z2;
            this.f4330d = str2;
            this.f4331e = i3;
            this.f4332f = i4;
        }
    }

    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public final d0.e f4333a;

        /* renamed from: b  reason: collision with root package name */
        public final int f4334b;

        /* renamed from: c  reason: collision with root package name */
        public final int f4335c;

        /* renamed from: d  reason: collision with root package name */
        public final String f4336d;

        public d(d0.e eVar, int i2, int i3, String str) {
            this.f4333a = eVar;
            this.f4335c = i2;
            this.f4334b = i3;
            this.f4336d = str;
        }
    }

    public static a a(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        Resources resources2 = resources;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlPullParser.require(2, (String) null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), v.a.f4021b);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (xmlPullParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources2.obtainAttributes(Xml.asAttributeSet(xmlPullParser), v.a.f4022c);
                                int i2 = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i2 = 1;
                                }
                                int i3 = obtainAttributes2.getInt(i2, 400);
                                boolean z2 = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i4 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i4 = 3;
                                }
                                int i5 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i5 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i5);
                                int i6 = obtainAttributes2.getInt(i4, 0);
                                int i7 = obtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = obtainAttributes2.getResourceId(i7, 0);
                                String string6 = obtainAttributes2.getString(i7);
                                obtainAttributes2.recycle();
                                while (xmlPullParser.next() != 3) {
                                    c(xmlPullParser);
                                }
                                arrayList.add(new c(string6, i3, z2, string5, i6, resourceId2));
                            } else {
                                c(xmlPullParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
                    }
                } else {
                    while (xmlPullParser.next() != 3) {
                        c(xmlPullParser);
                    }
                    return new d(new d0.e(string, string2, string3, b(resources2, resourceId)), integer, integer2, string4);
                }
            } else {
                c(xmlPullParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> b(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        arrayList.add(d(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(d(resources.getStringArray(i2)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static void c(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static List<byte[]> d(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
