package f;

import org.xmlpull.v1.XmlPullParser;

public final /* synthetic */ class a {
    public static String a(XmlPullParser xmlPullParser, StringBuilder sb, String str) {
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(str);
        return sb.toString();
    }
}
