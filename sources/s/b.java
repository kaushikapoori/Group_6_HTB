package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f3848a;

    /* renamed from: b  reason: collision with root package name */
    public int f3849b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f3850c = -1;

    /* renamed from: d  reason: collision with root package name */
    public SparseArray<a> f3851d = new SparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<androidx.constraintlayout.widget.b> f3852e = new SparseArray<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f3853a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<C0050b> f3854b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f3855c = -1;

        /* renamed from: d  reason: collision with root package name */
        public androidx.constraintlayout.widget.b f3856d;

        public a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.f3872j);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f3853a = obtainStyledAttributes.getResourceId(index, this.f3853a);
                } else if (index == 1) {
                    this.f3855c = obtainStyledAttributes.getResourceId(index, this.f3855c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3855c);
                    context.getResources().getResourceName(this.f3855c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f3856d = bVar;
                        bVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f3855c, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public int a(float f2, float f3) {
            for (int i2 = 0; i2 < this.f3854b.size(); i2++) {
                if (this.f3854b.get(i2).a(f2, f3)) {
                    return i2;
                }
            }
            return -1;
        }
    }

    /* renamed from: s.b$b  reason: collision with other inner class name */
    public static class C0050b {

        /* renamed from: a  reason: collision with root package name */
        public float f3857a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f3858b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public float f3859c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        public float f3860d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public int f3861e = -1;

        /* renamed from: f  reason: collision with root package name */
        public androidx.constraintlayout.widget.b f3862f;

        public C0050b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.f3874l);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f3861e = obtainStyledAttributes.getResourceId(index, this.f3861e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3861e);
                    context.getResources().getResourceName(this.f3861e);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
                        this.f3862f = bVar;
                        bVar.c((ConstraintLayout) LayoutInflater.from(context).inflate(this.f3861e, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f3860d = obtainStyledAttributes.getDimension(index, this.f3860d);
                } else if (index == 2) {
                    this.f3858b = obtainStyledAttributes.getDimension(index, this.f3858b);
                } else if (index == 3) {
                    this.f3859c = obtainStyledAttributes.getDimension(index, this.f3859c);
                } else if (index == 4) {
                    this.f3857a = obtainStyledAttributes.getDimension(index, this.f3857a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f2, float f3) {
            if (!Float.isNaN(this.f3857a) && f2 < this.f3857a) {
                return false;
            }
            if (!Float.isNaN(this.f3858b) && f3 < this.f3858b) {
                return false;
            }
            if (Float.isNaN(this.f3859c) || f2 <= this.f3859c) {
                return Float.isNaN(this.f3860d) || f3 <= this.f3860d;
            }
            return false;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r8, androidx.constraintlayout.widget.ConstraintLayout r9, int r10) {
        /*
            r7 = this;
            r7.<init>()
            r0 = -1
            r7.f3849b = r0
            r7.f3850c = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f3851d = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r7.f3852e = r1
            r7.f3848a = r9
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.XmlResourceParser r9 = r9.getXml(r10)
            int r10 = r9.getEventType()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1 = 0
        L_0x0025:
            r2 = 1
            if (r10 == r2) goto L_0x00a6
            if (r10 == 0) goto L_0x0095
            r3 = 2
            if (r10 == r3) goto L_0x002f
            goto L_0x0098
        L_0x002f:
            java.lang.String r10 = r9.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            int r4 = r10.hashCode()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r5 = 4
            r6 = 3
            switch(r4) {
                case -1349929691: goto L_0x0064;
                case 80204913: goto L_0x005a;
                case 1382829617: goto L_0x0051;
                case 1657696882: goto L_0x0047;
                case 1901439077: goto L_0x003d;
                default: goto L_0x003c;
            }     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
        L_0x003c:
            goto L_0x006e
        L_0x003d:
            java.lang.String r2 = "Variant"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = 3
            goto L_0x006f
        L_0x0047:
            java.lang.String r2 = "layoutDescription"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = 0
            goto L_0x006f
        L_0x0051:
            java.lang.String r4 = "StateSet"
            boolean r10 = r10.equals(r4)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            goto L_0x006f
        L_0x005a:
            java.lang.String r2 = "State"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = 2
            goto L_0x006f
        L_0x0064:
            java.lang.String r2 = "ConstraintSet"
            boolean r10 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r10 == 0) goto L_0x006e
            r2 = 4
            goto L_0x006f
        L_0x006e:
            r2 = -1
        L_0x006f:
            if (r2 == r3) goto L_0x0087
            if (r2 == r6) goto L_0x007a
            if (r2 == r5) goto L_0x0076
            goto L_0x0098
        L_0x0076:
            r7.a(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0098
        L_0x007a:
            s.b$b r10 = new s.b$b     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r10.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            if (r1 == 0) goto L_0x0098
            java.util.ArrayList<s.b$b> r2 = r1.f3854b     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r2.add(r10)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0098
        L_0x0087:
            s.b$a r10 = new s.b$a     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r10.<init>(r8, r9)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            android.util.SparseArray<s.b$a> r1 = r7.f3851d     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            int r2 = r10.f3853a     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1.put(r2, r10)     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            r1 = r10
            goto L_0x0098
        L_0x0095:
            r9.getName()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
        L_0x0098:
            int r10 = r9.next()     // Catch:{ XmlPullParserException -> 0x00a2, IOException -> 0x009d }
            goto L_0x0025
        L_0x009d:
            r8 = move-exception
            r8.printStackTrace()
            goto L_0x00a6
        L_0x00a2:
            r8 = move-exception
            r8.printStackTrace()
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.<init>(android.content.Context, androidx.constraintlayout.widget.ConstraintLayout, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0228, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        r5 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (r5 == 0) goto L_0x0237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ad, code lost:
        if (r5 == 1) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00af, code lost:
        if (r5 == 2) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b1, code lost:
        if (r5 == 3) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b5, code lost:
        r0.f921c.put(java.lang.Integer.valueOf(r7.f922a), r7);
        r7 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            r11 = this;
            androidx.constraintlayout.widget.b r0 = new androidx.constraintlayout.widget.b
            r0.<init>()
            int r1 = r13.getAttributeCount()
            r2 = 0
            r3 = 0
        L_0x000b:
            if (r3 >= r1) goto L_0x0241
            java.lang.String r4 = r13.getAttributeName(r3)
            java.lang.String r5 = r13.getAttributeValue(r3)
            if (r4 == 0) goto L_0x023d
            if (r5 != 0) goto L_0x001b
            goto L_0x023d
        L_0x001b:
            java.lang.String r6 = "id"
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L_0x023d
            java.lang.String r1 = "/"
            boolean r1 = r5.contains(r1)
            r3 = -1
            r4 = 1
            if (r1 == 0) goto L_0x0045
            r1 = 47
            int r1 = r5.indexOf(r1)
            int r1 = r1 + r4
            java.lang.String r1 = r5.substring(r1)
            android.content.res.Resources r7 = r12.getResources()
            java.lang.String r8 = r12.getPackageName()
            int r1 = r7.getIdentifier(r1, r6, r8)
            goto L_0x0046
        L_0x0045:
            r1 = -1
        L_0x0046:
            if (r1 != r3) goto L_0x005e
            int r6 = r5.length()
            if (r6 <= r4) goto L_0x0057
            java.lang.String r1 = r5.substring(r4)
            int r1 = java.lang.Integer.parseInt(r1)
            goto L_0x005e
        L_0x0057:
            java.lang.String r5 = "ConstraintLayoutStates"
            java.lang.String r6 = "error in parsing id"
            android.util.Log.e(r5, r6)
        L_0x005e:
            int r5 = r13.getEventType()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r6 = 0
            r7 = r6
        L_0x0064:
            if (r5 == r4) goto L_0x0237
            if (r5 == 0) goto L_0x0225
            r8 = 2
            r9 = 3
            if (r5 == r8) goto L_0x00c3
            if (r5 == r9) goto L_0x0070
            goto L_0x0228
        L_0x0070:
            java.lang.String r5 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.lang.String r5 = r5.toLowerCase(r10)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            switch(r10) {
                case -2075718416: goto L_0x00a0;
                case -190376483: goto L_0x0096;
                case 426575017: goto L_0x008c;
                case 2146106725: goto L_0x0082;
                default: goto L_0x0081;
            }     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
        L_0x0081:
            goto L_0x00aa
        L_0x0082:
            java.lang.String r10 = "constraintset"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x00aa
            r5 = 0
            goto L_0x00ab
        L_0x008c:
            java.lang.String r10 = "constraintoverride"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x00aa
            r5 = 2
            goto L_0x00ab
        L_0x0096:
            java.lang.String r10 = "constraint"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x00aa
            r5 = 1
            goto L_0x00ab
        L_0x00a0:
            java.lang.String r10 = "guideline"
            boolean r5 = r5.equals(r10)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x00aa
            r5 = 3
            goto L_0x00ab
        L_0x00aa:
            r5 = -1
        L_0x00ab:
            if (r5 == 0) goto L_0x0237
            if (r5 == r4) goto L_0x00b5
            if (r5 == r8) goto L_0x00b5
            if (r5 == r9) goto L_0x00b5
            goto L_0x0228
        L_0x00b5:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.b$a> r5 = r0.f921c     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            int r8 = r7.f922a     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r5.put(r8, r7)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r7 = r6
            goto L_0x0228
        L_0x00c3:
            java.lang.String r5 = r13.getName()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            int r10 = r5.hashCode()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            switch(r10) {
                case -2025855158: goto L_0x012b;
                case -1984451626: goto L_0x0121;
                case -1962203927: goto L_0x0117;
                case -1269513683: goto L_0x010d;
                case -1238332596: goto L_0x0103;
                case -71750448: goto L_0x00fa;
                case 366511058: goto L_0x00ef;
                case 1331510167: goto L_0x00e5;
                case 1791837707: goto L_0x00da;
                case 1803088381: goto L_0x00d0;
                default: goto L_0x00ce;
            }     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
        L_0x00ce:
            goto L_0x0135
        L_0x00d0:
            java.lang.String r8 = "Constraint"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x0135
            r8 = 0
            goto L_0x0136
        L_0x00da:
            java.lang.String r8 = "CustomAttribute"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x0135
            r8 = 8
            goto L_0x0136
        L_0x00e5:
            java.lang.String r8 = "Barrier"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x0135
            r8 = 3
            goto L_0x0136
        L_0x00ef:
            java.lang.String r8 = "CustomMethod"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x0135
            r8 = 9
            goto L_0x0136
        L_0x00fa:
            java.lang.String r9 = "Guideline"
            boolean r5 = r5.equals(r9)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x0135
            goto L_0x0136
        L_0x0103:
            java.lang.String r8 = "Transform"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x0135
            r8 = 5
            goto L_0x0136
        L_0x010d:
            java.lang.String r8 = "PropertySet"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x0135
            r8 = 4
            goto L_0x0136
        L_0x0117:
            java.lang.String r8 = "ConstraintOverride"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x0135
            r8 = 1
            goto L_0x0136
        L_0x0121:
            java.lang.String r8 = "Motion"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x0135
            r8 = 7
            goto L_0x0136
        L_0x012b:
            java.lang.String r8 = "Layout"
            boolean r5 = r5.equals(r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            if (r5 == 0) goto L_0x0135
            r8 = 6
            goto L_0x0136
        L_0x0135:
            r8 = -1
        L_0x0136:
            java.lang.String r5 = "XML parser error must be within a Constraint "
            switch(r8) {
                case 0: goto L_0x021b;
                case 1: goto L_0x0212;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01d1;
                case 5: goto L_0x01ab;
                case 6: goto L_0x0185;
                case 7: goto L_0x015f;
                case 8: goto L_0x013d;
                case 9: goto L_0x013d;
                default: goto L_0x013b;
            }
        L_0x013b:
            goto L_0x0228
        L_0x013d:
            if (r7 == 0) goto L_0x0146
            java.util.HashMap<java.lang.String, s.a> r5 = r7.f927f     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            s.a.a(r12, r13, r5)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            goto L_0x0228
        L_0x0146:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            throw r12     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
        L_0x015f:
            if (r7 == 0) goto L_0x016c
            androidx.constraintlayout.widget.b$c r5 = r7.f924c     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            goto L_0x0228
        L_0x016c:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            throw r12     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
        L_0x0185:
            if (r7 == 0) goto L_0x0192
            androidx.constraintlayout.widget.b$b r5 = r7.f925d     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            goto L_0x0228
        L_0x0192:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            throw r12     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
        L_0x01ab:
            if (r7 == 0) goto L_0x01b8
            androidx.constraintlayout.widget.b$e r5 = r7.f926e     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            goto L_0x0228
        L_0x01b8:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            throw r12     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
        L_0x01d1:
            if (r7 == 0) goto L_0x01dd
            androidx.constraintlayout.widget.b$d r5 = r7.f923b     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            android.util.AttributeSet r8 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r5.a(r12, r8)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            goto L_0x0228
        L_0x01dd:
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.append(r5)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            int r13 = r13.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r2.append(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            java.lang.String r13 = r2.toString()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r12.<init>(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            throw r12     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
        L_0x01f6:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            androidx.constraintlayout.widget.b$a r5 = r0.e(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            androidx.constraintlayout.widget.b$b r7 = r5.f925d     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r7.f959i0 = r4     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            goto L_0x0223
        L_0x0203:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            androidx.constraintlayout.widget.b$a r5 = r0.e(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            androidx.constraintlayout.widget.b$b r7 = r5.f925d     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r7.f942a = r4     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            r7.f944b = r4     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            goto L_0x0223
        L_0x0212:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            androidx.constraintlayout.widget.b$a r5 = r0.e(r12, r5, r4)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            goto L_0x0223
        L_0x021b:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r13)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            androidx.constraintlayout.widget.b$a r5 = r0.e(r12, r5, r2)     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
        L_0x0223:
            r7 = r5
            goto L_0x0228
        L_0x0225:
            r13.getName()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
        L_0x0228:
            int r5 = r13.next()     // Catch:{ XmlPullParserException -> 0x0233, IOException -> 0x022e }
            goto L_0x0064
        L_0x022e:
            r12 = move-exception
            r12.printStackTrace()
            goto L_0x0237
        L_0x0233:
            r12 = move-exception
            r12.printStackTrace()
        L_0x0237:
            android.util.SparseArray<androidx.constraintlayout.widget.b> r12 = r11.f3852e
            r12.put(r1, r0)
            goto L_0x0241
        L_0x023d:
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0241:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
