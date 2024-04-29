package j0;

import android.graphics.Paint;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import e0.b;
import java.lang.reflect.Method;
import java.util.Objects;

public final class g {

    public static class a implements ActionMode.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f3270a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f3271b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f3272c;

        /* renamed from: d  reason: collision with root package name */
        public Method f3273d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3274e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3275f = false;

        public a(ActionMode.Callback callback, TextView textView) {
            this.f3270a = callback;
            this.f3271b = textView;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3270a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3270a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f3270a.onDestroyActionMode(actionMode);
        }

        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x009f A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPrepareActionMode(android.view.ActionMode r13, android.view.Menu r14) {
            /*
                r12 = this;
                android.widget.TextView r0 = r12.f3271b
                android.content.Context r0 = r0.getContext()
                android.content.pm.PackageManager r1 = r0.getPackageManager()
                boolean r2 = r12.f3275f
                java.lang.String r3 = "removeItemAt"
                r4 = 1
                r5 = 0
                if (r2 != 0) goto L_0x0032
                r12.f3275f = r4
                java.lang.String r2 = "com.android.internal.view.menu.MenuBuilder"
                java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f3272c = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r6[r5] = r7     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f3273d = r2     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                r12.f3274e = r4     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x002b }
                goto L_0x0032
            L_0x002b:
                r2 = 0
                r12.f3272c = r2
                r12.f3273d = r2
                r12.f3274e = r5
            L_0x0032:
                boolean r2 = r12.f3274e     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r2 == 0) goto L_0x0041
                java.lang.Class<?> r2 = r12.f3272c     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                boolean r2 = r2.isInstance(r14)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r2 == 0) goto L_0x0041
                java.lang.reflect.Method r2 = r12.f3273d     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                goto L_0x004f
            L_0x0041:
                java.lang.Class r2 = r14.getClass()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r6[r5] = r7     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
            L_0x004f:
                int r3 = r14.size()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                int r3 = r3 - r4
            L_0x0054:
                java.lang.String r6 = "android.intent.action.PROCESS_TEXT"
                if (r3 < 0) goto L_0x007e
                android.view.MenuItem r7 = r14.getItem(r3)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                android.content.Intent r8 = r7.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r8 == 0) goto L_0x007b
                android.content.Intent r7 = r7.getIntent()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.String r7 = r7.getAction()     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                boolean r6 = r6.equals(r7)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                if (r6 == 0) goto L_0x007b
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r6[r5] = r7     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
                r2.invoke(r14, r6)     // Catch:{ IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0129 }
            L_0x007b:
                int r3 = r3 + -1
                goto L_0x0054
            L_0x007e:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                boolean r3 = r0 instanceof android.app.Activity
                java.lang.String r7 = "text/plain"
                if (r3 != 0) goto L_0x008a
                goto L_0x00d5
            L_0x008a:
                android.content.Intent r3 = new android.content.Intent
                r3.<init>()
                android.content.Intent r3 = r3.setAction(r6)
                android.content.Intent r3 = r3.setType(r7)
                java.util.List r3 = r1.queryIntentActivities(r3, r5)
                java.util.Iterator r3 = r3.iterator()
            L_0x009f:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L_0x00d5
                java.lang.Object r8 = r3.next()
                android.content.pm.ResolveInfo r8 = (android.content.pm.ResolveInfo) r8
                java.lang.String r9 = r0.getPackageName()
                android.content.pm.ActivityInfo r10 = r8.activityInfo
                java.lang.String r10 = r10.packageName
                boolean r9 = r9.equals(r10)
                if (r9 == 0) goto L_0x00ba
                goto L_0x00ce
            L_0x00ba:
                android.content.pm.ActivityInfo r9 = r8.activityInfo
                boolean r10 = r9.exported
                if (r10 != 0) goto L_0x00c1
                goto L_0x00cc
            L_0x00c1:
                java.lang.String r9 = r9.permission
                if (r9 == 0) goto L_0x00ce
                int r9 = r0.checkSelfPermission(r9)
                if (r9 != 0) goto L_0x00cc
                goto L_0x00ce
            L_0x00cc:
                r9 = 0
                goto L_0x00cf
            L_0x00ce:
                r9 = 1
            L_0x00cf:
                if (r9 == 0) goto L_0x009f
                r2.add(r8)
                goto L_0x009f
            L_0x00d5:
                r0 = 0
            L_0x00d6:
                int r3 = r2.size()
                if (r0 >= r3) goto L_0x0129
                java.lang.Object r3 = r2.get(r0)
                android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
                int r8 = r0 + 100
                java.lang.CharSequence r9 = r3.loadLabel(r1)
                android.view.MenuItem r8 = r14.add(r5, r5, r8, r9)
                android.widget.TextView r9 = r12.f3271b
                android.content.Intent r10 = new android.content.Intent
                r10.<init>()
                android.content.Intent r10 = r10.setAction(r6)
                android.content.Intent r10 = r10.setType(r7)
                boolean r11 = r9 instanceof android.text.Editable
                if (r11 == 0) goto L_0x010d
                boolean r11 = r9.onCheckIsTextEditor()
                if (r11 == 0) goto L_0x010d
                boolean r9 = r9.isEnabled()
                if (r9 == 0) goto L_0x010d
                r9 = 1
                goto L_0x010e
            L_0x010d:
                r9 = 0
            L_0x010e:
                r9 = r9 ^ r4
                java.lang.String r11 = "android.intent.extra.PROCESS_TEXT_READONLY"
                android.content.Intent r9 = r10.putExtra(r11, r9)
                android.content.pm.ActivityInfo r3 = r3.activityInfo
                java.lang.String r10 = r3.packageName
                java.lang.String r3 = r3.name
                android.content.Intent r3 = r9.setClassName(r10, r3)
                android.view.MenuItem r3 = r8.setIntent(r3)
                r3.setShowAsAction(r4)
                int r0 = r0 + 1
                goto L_0x00d6
            L_0x0129:
                android.view.ActionMode$Callback r0 = r12.f3270a
                boolean r13 = r0.onPrepareActionMode(r13, r14)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: j0.g.a.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (r9 != 2) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        if (r4 != false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0074, code lost:
        r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static e0.b.a a(android.widget.TextView r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L_0x0010
            e0.b$a r0 = new e0.b$a
            android.text.PrecomputedText$Params r9 = r9.getTextMetricsParams()
            r0.<init>(r9)
            return r0
        L_0x0010:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r9.getPaint()
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 23
            r6 = 1
            if (r3 < r5) goto L_0x0024
            r3 = 1
            r7 = 1
            goto L_0x0026
        L_0x0024:
            r3 = 0
            r7 = 0
        L_0x0026:
            android.text.TextDirectionHeuristic r8 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r0 < r5) goto L_0x0032
            int r3 = r9.getBreakStrategy()
            int r7 = r9.getHyphenationFrequency()
        L_0x0032:
            android.text.method.TransformationMethod r5 = r9.getTransformationMethod()
            boolean r5 = r5 instanceof android.text.method.PasswordTransformationMethod
            if (r5 == 0) goto L_0x003d
        L_0x003a:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0082
        L_0x003d:
            if (r0 < r1) goto L_0x0064
            int r0 = r9.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L_0x0064
            java.util.Locale r9 = r9.getTextLocale()
            android.icu.text.DecimalFormatSymbols r9 = android.icu.text.DecimalFormatSymbols.getInstance(r9)
            java.lang.String[] r9 = r9.getDigitStrings()
            r9 = r9[r4]
            int r9 = r9.codePointAt(r4)
            byte r9 = java.lang.Character.getDirectionality(r9)
            if (r9 == r6) goto L_0x007a
            r0 = 2
            if (r9 != r0) goto L_0x003a
            goto L_0x007a
        L_0x0064:
            int r0 = r9.getLayoutDirection()
            if (r0 != r6) goto L_0x006b
            r4 = 1
        L_0x006b:
            int r9 = r9.getTextDirection()
            switch(r9) {
                case 2: goto L_0x007d;
                case 3: goto L_0x003a;
                case 4: goto L_0x007a;
                case 5: goto L_0x0077;
                case 6: goto L_0x0080;
                case 7: goto L_0x0074;
                default: goto L_0x0072;
            }
        L_0x0072:
            if (r4 == 0) goto L_0x0080
        L_0x0074:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L_0x0082
        L_0x0077:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.LOCALE
            goto L_0x0082
        L_0x007a:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.RTL
            goto L_0x0082
        L_0x007d:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            goto L_0x0082
        L_0x0080:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
        L_0x0082:
            e0.b$a r0 = new e0.b$a
            r0.<init>(r2, r9, r3, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.g.a(android.widget.TextView):e0.b$a");
    }

    public static void b(TextView textView, int i2) {
        c.a.b(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i2) {
        c.a.b(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i3 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void d(TextView textView, int i2) {
        c.a.b(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing((float) (i2 - fontMetricsInt), 1.0f);
        }
    }

    public static void e(TextView textView, b bVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Objects.requireNonNull(bVar);
            textView.setText((CharSequence) null);
            return;
        }
        b.a a2 = a(textView);
        Objects.requireNonNull(bVar);
        if (a2.a((b.a) null)) {
            textView.setText(bVar);
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    public static void f(TextView textView, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i2);
        } else {
            textView.setTextAppearance(textView.getContext(), i2);
        }
    }

    public static ActionMode.Callback g(ActionMode.Callback callback) {
        return (!(callback instanceof a) || Build.VERSION.SDK_INT < 26) ? callback : ((a) callback).f3270a;
    }

    public static ActionMode.Callback h(TextView textView, ActionMode.Callback callback) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof a) || callback == null) ? callback : new a(callback, textView);
    }
}
