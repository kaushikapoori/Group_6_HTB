package o0;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.d;

public final class c extends InputConnectionWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final TextView f3498a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3499b;

    public static class a {
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004c, code lost:
            if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x004f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x007c, code lost:
            if (r12 != false) goto L_0x00a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
            if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x008c;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(android.view.inputmethod.InputConnection r8, android.text.Editable r9, int r10, int r11, boolean r12) {
            /*
                r7 = this;
                java.lang.Object r0 = androidx.emoji2.text.d.f1124j
                r0 = 0
                r1 = 1
                if (r9 == 0) goto L_0x00f7
                if (r10 < 0) goto L_0x00f7
                if (r11 >= 0) goto L_0x000c
                goto L_0x00f7
            L_0x000c:
                int r2 = android.text.Selection.getSelectionStart(r9)
                int r3 = android.text.Selection.getSelectionEnd(r9)
                r4 = -1
                if (r2 == r4) goto L_0x001e
                if (r3 == r4) goto L_0x001e
                if (r2 == r3) goto L_0x001c
                goto L_0x001e
            L_0x001c:
                r5 = 0
                goto L_0x001f
            L_0x001e:
                r5 = 1
            L_0x001f:
                if (r5 == 0) goto L_0x0023
                goto L_0x00f7
            L_0x0023:
                if (r12 == 0) goto L_0x00ad
                int r10 = java.lang.Math.max(r10, r0)
                int r12 = r9.length()
                if (r2 < 0) goto L_0x0064
                if (r12 >= r2) goto L_0x0032
                goto L_0x0064
            L_0x0032:
                if (r10 >= 0) goto L_0x0035
                goto L_0x0064
            L_0x0035:
                r12 = 0
            L_0x0036:
                if (r10 != 0) goto L_0x0039
                goto L_0x0065
            L_0x0039:
                int r2 = r2 + -1
                if (r2 >= 0) goto L_0x0042
                if (r12 == 0) goto L_0x0040
                goto L_0x0064
            L_0x0040:
                r2 = 0
                goto L_0x0065
            L_0x0042:
                char r5 = r9.charAt(r2)
                if (r12 == 0) goto L_0x0052
                boolean r12 = java.lang.Character.isHighSurrogate(r5)
                if (r12 != 0) goto L_0x004f
                goto L_0x0064
            L_0x004f:
                int r10 = r10 + -1
                goto L_0x0035
            L_0x0052:
                boolean r6 = java.lang.Character.isSurrogate(r5)
                if (r6 != 0) goto L_0x005b
                int r10 = r10 + -1
                goto L_0x0036
            L_0x005b:
                boolean r12 = java.lang.Character.isHighSurrogate(r5)
                if (r12 == 0) goto L_0x0062
                goto L_0x0064
            L_0x0062:
                r12 = 1
                goto L_0x0036
            L_0x0064:
                r2 = -1
            L_0x0065:
                int r10 = java.lang.Math.max(r11, r0)
                int r11 = r9.length()
                if (r3 < 0) goto L_0x00a7
                if (r11 >= r3) goto L_0x0072
                goto L_0x00a7
            L_0x0072:
                if (r10 >= 0) goto L_0x0075
                goto L_0x00a7
            L_0x0075:
                r12 = 0
            L_0x0076:
                if (r10 != 0) goto L_0x007a
                r11 = r3
                goto L_0x00a8
            L_0x007a:
                if (r3 < r11) goto L_0x007f
                if (r12 == 0) goto L_0x00a8
                goto L_0x00a7
            L_0x007f:
                char r5 = r9.charAt(r3)
                if (r12 == 0) goto L_0x0091
                boolean r12 = java.lang.Character.isLowSurrogate(r5)
                if (r12 != 0) goto L_0x008c
                goto L_0x00a7
            L_0x008c:
                int r10 = r10 + -1
                int r3 = r3 + 1
                goto L_0x0075
            L_0x0091:
                boolean r6 = java.lang.Character.isSurrogate(r5)
                if (r6 != 0) goto L_0x009c
                int r10 = r10 + -1
                int r3 = r3 + 1
                goto L_0x0076
            L_0x009c:
                boolean r12 = java.lang.Character.isLowSurrogate(r5)
                if (r12 == 0) goto L_0x00a3
                goto L_0x00a7
            L_0x00a3:
                int r3 = r3 + 1
                r12 = 1
                goto L_0x0076
            L_0x00a7:
                r11 = -1
            L_0x00a8:
                if (r2 == r4) goto L_0x00f7
                if (r11 != r4) goto L_0x00bb
                goto L_0x00f7
            L_0x00ad:
                int r2 = r2 - r10
                int r2 = java.lang.Math.max(r2, r0)
                int r3 = r3 + r11
                int r10 = r9.length()
                int r11 = java.lang.Math.min(r3, r10)
            L_0x00bb:
                java.lang.Class<androidx.emoji2.text.i> r10 = androidx.emoji2.text.i.class
                java.lang.Object[] r10 = r9.getSpans(r2, r11, r10)
                androidx.emoji2.text.i[] r10 = (androidx.emoji2.text.i[]) r10
                if (r10 == 0) goto L_0x00f7
                int r12 = r10.length
                if (r12 <= 0) goto L_0x00f7
                int r12 = r10.length
                r3 = 0
            L_0x00ca:
                if (r3 >= r12) goto L_0x00e1
                r4 = r10[r3]
                int r5 = r9.getSpanStart(r4)
                int r4 = r9.getSpanEnd(r4)
                int r2 = java.lang.Math.min(r5, r2)
                int r11 = java.lang.Math.max(r4, r11)
                int r3 = r3 + 1
                goto L_0x00ca
            L_0x00e1:
                int r10 = java.lang.Math.max(r2, r0)
                int r12 = r9.length()
                int r11 = java.lang.Math.min(r11, r12)
                r8.beginBatchEdit()
                r9.delete(r10, r11)
                r8.endBatchEdit()
                r0 = 1
            L_0x00f7:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o0.c.a.a(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        a aVar = new a();
        this.f3498a = textView;
        this.f3499b = aVar;
        if (d.c()) {
            d a2 = d.a();
            if (a2.d() && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                a2.f1130e.c(editorInfo);
            }
        }
    }

    public boolean deleteSurroundingText(int i2, int i3) {
        return this.f3499b.a(this, this.f3498a.getEditableText(), i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    public boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        return this.f3499b.a(this, this.f3498a.getEditableText(), i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
