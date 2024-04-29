package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.KeyEvent;
import androidx.emoji2.text.d;
import androidx.emoji2.text.m;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final d.i f1153a;

    /* renamed from: b  reason: collision with root package name */
    public final m f1154b;

    /* renamed from: c  reason: collision with root package name */
    public d.C0008d f1155c;

    public static class a implements d.C0008d {

        /* renamed from: b  reason: collision with root package name */
        public static final ThreadLocal<StringBuilder> f1156b = new ThreadLocal<>();

        /* renamed from: a  reason: collision with root package name */
        public final TextPaint f1157a;

        public a() {
            TextPaint textPaint = new TextPaint();
            this.f1157a = textPaint;
            textPaint.setTextSize(10.0f);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f1158a = 1;

        /* renamed from: b  reason: collision with root package name */
        public final m.a f1159b;

        /* renamed from: c  reason: collision with root package name */
        public m.a f1160c;

        /* renamed from: d  reason: collision with root package name */
        public m.a f1161d;

        /* renamed from: e  reason: collision with root package name */
        public int f1162e;

        /* renamed from: f  reason: collision with root package name */
        public int f1163f;

        public b(m.a aVar, boolean z2, int[] iArr) {
            this.f1159b = aVar;
            this.f1160c = aVar;
        }

        public int a(int i2) {
            SparseArray<m.a> sparseArray = this.f1160c.f1185a;
            m.a aVar = sparseArray == null ? null : sparseArray.get(i2);
            int i3 = 3;
            if (this.f1158a != 2) {
                if (aVar != null) {
                    this.f1158a = 2;
                    this.f1160c = aVar;
                    this.f1163f = 1;
                }
                b();
                i3 = 1;
                this.f1162e = i2;
                return i3;
            } else if (aVar != null) {
                this.f1160c = aVar;
                this.f1163f++;
            } else {
                boolean z2 = false;
                if (!(i2 == 65038)) {
                    if (i2 == 65039) {
                        z2 = true;
                    }
                    if (!z2) {
                        m.a aVar2 = this.f1160c;
                        if (aVar2.f1186b != null) {
                            if (this.f1163f == 1) {
                                if (c()) {
                                    aVar2 = this.f1160c;
                                }
                            }
                            this.f1161d = aVar2;
                            b();
                            this.f1162e = i2;
                            return i3;
                        }
                    }
                }
                b();
                i3 = 1;
                this.f1162e = i2;
                return i3;
            }
            i3 = 2;
            this.f1162e = i2;
            return i3;
        }

        public final int b() {
            this.f1158a = 1;
            this.f1160c = this.f1159b;
            this.f1163f = 0;
            return 1;
        }

        public final boolean c() {
            n0.a e2 = this.f1160c.f1186b.e();
            int a2 = e2.a(6);
            if ((a2 == 0 || e2.f3483b.get(a2 + e2.f3482a) == 0) ? false : true) {
                return true;
            }
            return this.f1162e == 65039;
        }
    }

    public h(m mVar, d.i iVar, d.C0008d dVar, boolean z2, int[] iArr) {
        this.f1153a = iVar;
        this.f1154b = mVar;
        this.f1155c = dVar;
    }

    public static boolean a(Editable editable, KeyEvent keyEvent, boolean z2) {
        i[] iVarArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (iVarArr = (i[]) editable.getSpans(selectionStart, selectionEnd, i.class)) != null && iVarArr.length > 0) {
            int length = iVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                i iVar = iVarArr[i2];
                int spanStart = editable.getSpanStart(iVar);
                int spanEnd = editable.getSpanEnd(iVar);
                if ((!z2 || spanStart != selectionStart) && ((z2 || spanEnd != selectionStart) && (selectionStart <= spanStart || selectionStart >= spanEnd))) {
                    i2++;
                } else {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        if (r6 >= r7) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.g r13) {
        /*
            r9 = this;
            int r0 = r13.f1152c
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x010a
            androidx.emoji2.text.d$d r0 = r9.f1155c
            n0.a r4 = r13.e()
            r5 = 8
            int r5 = r4.a(r5)
            if (r5 == 0) goto L_0x001f
            java.nio.ByteBuffer r6 = r4.f3483b
            int r4 = r4.f3482a
            int r5 = r5 + r4
            short r4 = r6.getShort(r5)
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            androidx.emoji2.text.h$a r0 = (androidx.emoji2.text.h.a) r0
            java.util.Objects.requireNonNull(r0)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 23
            if (r5 >= r6) goto L_0x002f
            if (r4 <= r5) goto L_0x002f
            goto L_0x00b7
        L_0x002f:
            java.lang.ThreadLocal<java.lang.StringBuilder> r4 = androidx.emoji2.text.h.a.f1156b
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L_0x003f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r4.set(r5)
        L_0x003f:
            java.lang.Object r4 = r4.get()
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            r4.setLength(r2)
        L_0x0048:
            if (r11 >= r12) goto L_0x0054
            char r5 = r10.charAt(r11)
            r4.append(r5)
            int r11 = r11 + 1
            goto L_0x0048
        L_0x0054:
            android.text.TextPaint r10 = r0.f1157a
            java.lang.String r11 = r4.toString()
            java.lang.ThreadLocal<f0.b<android.graphics.Rect, android.graphics.Rect>> r12 = z.c.f4396a
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r6) goto L_0x0066
            boolean r10 = r10.hasGlyph(r11)
            goto L_0x0103
        L_0x0066:
            int r12 = r11.length()
            if (r12 != r3) goto L_0x0077
            char r0 = r11.charAt(r2)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x0077
            goto L_0x00bd
        L_0x0077:
            java.lang.String r0 = "󟿽"
            float r4 = r10.measureText(r0)
            java.lang.String r5 = "m"
            float r5 = r10.measureText(r5)
            float r6 = r10.measureText(r11)
            r7 = 0
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 != 0) goto L_0x008d
            goto L_0x00b7
        L_0x008d:
            int r8 = r11.length()
            int r8 = r11.codePointCount(r2, r8)
            if (r8 <= r3) goto L_0x00b9
            r8 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 * r8
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a0
            goto L_0x00b7
        L_0x00a0:
            r5 = 0
        L_0x00a1:
            if (r5 >= r12) goto L_0x00b3
            int r8 = r11.codePointAt(r5)
            int r8 = java.lang.Character.charCount(r8)
            int r8 = r8 + r5
            float r5 = r10.measureText(r11, r5, r8)
            float r7 = r7 + r5
            r5 = r8
            goto L_0x00a1
        L_0x00b3:
            int r5 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x00b9
        L_0x00b7:
            r10 = 0
            goto L_0x0103
        L_0x00b9:
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 == 0) goto L_0x00bf
        L_0x00bd:
            r10 = 1
            goto L_0x0103
        L_0x00bf:
            java.lang.ThreadLocal<f0.b<android.graphics.Rect, android.graphics.Rect>> r4 = z.c.f4396a
            java.lang.Object r5 = r4.get()
            f0.b r5 = (f0.b) r5
            if (r5 != 0) goto L_0x00dc
            f0.b r5 = new f0.b
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r5.<init>(r6, r7)
            r4.set(r5)
            goto L_0x00ea
        L_0x00dc:
            F r4 = r5.f2983a
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r4.setEmpty()
            S r4 = r5.f2984b
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r4.setEmpty()
        L_0x00ea:
            F r4 = r5.f2983a
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            r10.getTextBounds(r0, r2, r1, r4)
            S r0 = r5.f2984b
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r10.getTextBounds(r11, r2, r12, r0)
            F r10 = r5.f2983a
            android.graphics.Rect r10 = (android.graphics.Rect) r10
            S r11 = r5.f2984b
            boolean r10 = r10.equals(r11)
            r10 = r10 ^ r3
        L_0x0103:
            if (r10 == 0) goto L_0x0107
            r10 = 2
            goto L_0x0108
        L_0x0107:
            r10 = 1
        L_0x0108:
            r13.f1152c = r10
        L_0x010a:
            int r10 = r13.f1152c
            if (r10 != r1) goto L_0x010f
            r2 = 1
        L_0x010f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.h.b(java.lang.CharSequence, int, int, androidx.emoji2.text.g):boolean");
    }
}
