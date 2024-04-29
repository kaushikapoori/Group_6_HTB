package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.supermarket.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import k0.c;

public class v0 extends c implements View.OnClickListener {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f794z = 0;

    /* renamed from: m  reason: collision with root package name */
    public final SearchView f795m;

    /* renamed from: n  reason: collision with root package name */
    public final SearchableInfo f796n;

    /* renamed from: o  reason: collision with root package name */
    public final Context f797o;

    /* renamed from: p  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f798p;

    /* renamed from: q  reason: collision with root package name */
    public final int f799q;

    /* renamed from: r  reason: collision with root package name */
    public int f800r = 1;

    /* renamed from: s  reason: collision with root package name */
    public ColorStateList f801s;

    /* renamed from: t  reason: collision with root package name */
    public int f802t = -1;

    /* renamed from: u  reason: collision with root package name */
    public int f803u = -1;

    /* renamed from: v  reason: collision with root package name */
    public int f804v = -1;

    /* renamed from: w  reason: collision with root package name */
    public int f805w = -1;

    /* renamed from: x  reason: collision with root package name */
    public int f806x = -1;

    /* renamed from: y  reason: collision with root package name */
    public int f807y = -1;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f808a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f809b;

        /* renamed from: c  reason: collision with root package name */
        public final ImageView f810c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f811d;

        /* renamed from: e  reason: collision with root package name */
        public final ImageView f812e;

        public a(View view) {
            this.f808a = (TextView) view.findViewById(16908308);
            this.f809b = (TextView) view.findViewById(16908309);
            this.f810c = (ImageView) view.findViewById(16908295);
            this.f811d = (ImageView) view.findViewById(16908296);
            this.f812e = (ImageView) view.findViewById(R.id.edit_query);
        }
    }

    public v0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f795m = searchView;
        this.f796n = searchableInfo;
        this.f799q = searchView.getSuggestionCommitIconResId();
        this.f797o = context;
        this.f798p = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.view.View r19, android.content.Context r20, android.database.Cursor r21) {
        /*
            r18 = this;
            r1 = r18
            r2 = r21
            java.lang.Object r0 = r19.getTag()
            r3 = r0
            androidx.appcompat.widget.v0$a r3 = (androidx.appcompat.widget.v0.a) r3
            int r0 = r1.f807y
            r4 = 0
            r5 = -1
            if (r0 == r5) goto L_0x0017
            int r0 = r2.getInt(r0)
            r6 = r0
            goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            android.widget.TextView r0 = r3.f808a
            if (r0 == 0) goto L_0x0034
            int r0 = r1.f802t
            java.lang.String r0 = h(r2, r0)
            android.widget.TextView r8 = r3.f808a
            r8.setText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 8
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            r8.setVisibility(r0)
        L_0x0034:
            android.widget.TextView r0 = r3.f809b
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x00bd
            int r0 = r1.f804v
            java.lang.String r0 = h(r2, r0)
            if (r0 == 0) goto L_0x0086
            android.content.res.ColorStateList r10 = r1.f801s
            if (r10 != 0) goto L_0x0065
            android.util.TypedValue r10 = new android.util.TypedValue
            r10.<init>()
            android.content.Context r11 = r1.f797o
            android.content.res.Resources$Theme r11 = r11.getTheme()
            r12 = 2130904028(0x7f0303dc, float:1.741489E38)
            r11.resolveAttribute(r12, r10, r9)
            android.content.Context r11 = r1.f797o
            android.content.res.Resources r11 = r11.getResources()
            int r10 = r10.resourceId
            android.content.res.ColorStateList r10 = r11.getColorStateList(r10)
            r1.f801s = r10
        L_0x0065:
            android.text.SpannableString r10 = new android.text.SpannableString
            r10.<init>(r0)
            android.text.style.TextAppearanceSpan r15 = new android.text.style.TextAppearanceSpan
            r12 = 0
            r13 = 0
            r14 = 0
            android.content.res.ColorStateList r11 = r1.f801s
            r16 = 0
            r17 = r11
            r11 = r15
            r7 = r15
            r15 = r17
            r11.<init>(r12, r13, r14, r15, r16)
            int r0 = r0.length()
            r11 = 33
            r10.setSpan(r7, r4, r0, r11)
            goto L_0x008c
        L_0x0086:
            int r0 = r1.f803u
            java.lang.String r10 = h(r2, r0)
        L_0x008c:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x009f
            android.widget.TextView r0 = r3.f808a
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r4)
            android.widget.TextView r0 = r3.f808a
            r0.setMaxLines(r8)
            goto L_0x00ab
        L_0x009f:
            android.widget.TextView r0 = r3.f808a
            if (r0 == 0) goto L_0x00ab
            r0.setSingleLine(r9)
            android.widget.TextView r0 = r3.f808a
            r0.setMaxLines(r9)
        L_0x00ab:
            android.widget.TextView r0 = r3.f809b
            r0.setText(r10)
            boolean r7 = android.text.TextUtils.isEmpty(r10)
            if (r7 == 0) goto L_0x00b9
            r7 = 8
            goto L_0x00ba
        L_0x00b9:
            r7 = 0
        L_0x00ba:
            r0.setVisibility(r7)
        L_0x00bd:
            android.widget.ImageView r7 = r3.f810c
            r10 = 0
            if (r7 == 0) goto L_0x0175
            int r0 = r1.f805w
            if (r0 != r5) goto L_0x00c9
            r0 = r10
            goto L_0x0162
        L_0x00c9:
            java.lang.String r0 = r2.getString(r0)
            android.graphics.drawable.Drawable r0 = r1.f(r0)
            if (r0 == 0) goto L_0x00d5
            goto L_0x0162
        L_0x00d5:
            android.app.SearchableInfo r0 = r1.f796n
            android.content.ComponentName r0 = r0.getSearchActivity()
            java.lang.String r11 = r0.flattenToShortString()
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r12 = r1.f798p
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x00fe
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r1.f798p
            java.lang.Object r0 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r0 = (android.graphics.drawable.Drawable.ConstantState) r0
            if (r0 != 0) goto L_0x00f3
            r0 = r10
            goto L_0x0155
        L_0x00f3:
            android.content.Context r11 = r1.f797o
            android.content.res.Resources r11 = r11.getResources()
            android.graphics.drawable.Drawable r0 = r0.newDrawable(r11)
            goto L_0x0155
        L_0x00fe:
            android.content.Context r12 = r1.f797o
            android.content.pm.PackageManager r12 = r12.getPackageManager()
            r13 = 128(0x80, float:1.794E-43)
            android.content.pm.ActivityInfo r13 = r12.getActivityInfo(r0, r13)     // Catch:{ NameNotFoundException -> 0x013b }
            int r14 = r13.getIconResource()
            if (r14 != 0) goto L_0x0111
            goto L_0x0146
        L_0x0111:
            java.lang.String r15 = r0.getPackageName()
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r15, r14, r13)
            if (r12 != 0) goto L_0x0147
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Invalid icon resource "
            r12.append(r13)
            r12.append(r14)
            java.lang.String r13 = " for "
            r12.append(r13)
            java.lang.String r0 = r0.flattenToShortString()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            goto L_0x0141
        L_0x013b:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = r12.toString()
        L_0x0141:
            java.lang.String r12 = "SuggestionsAdapter"
            android.util.Log.w(r12, r0)
        L_0x0146:
            r12 = r10
        L_0x0147:
            if (r12 != 0) goto L_0x014b
            r0 = r10
            goto L_0x014f
        L_0x014b:
            android.graphics.drawable.Drawable$ConstantState r0 = r12.getConstantState()
        L_0x014f:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r13 = r1.f798p
            r13.put(r11, r0)
            r0 = r12
        L_0x0155:
            if (r0 == 0) goto L_0x0158
            goto L_0x0162
        L_0x0158:
            android.content.Context r0 = r1.f797o
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.graphics.drawable.Drawable r0 = r0.getDefaultActivityIcon()
        L_0x0162:
            r11 = 4
            r7.setImageDrawable(r0)
            if (r0 != 0) goto L_0x016c
            r7.setVisibility(r11)
            goto L_0x0175
        L_0x016c:
            r7.setVisibility(r4)
            r0.setVisible(r4, r4)
            r0.setVisible(r9, r4)
        L_0x0175:
            android.widget.ImageView r0 = r3.f811d
            if (r0 == 0) goto L_0x019a
            int r7 = r1.f806x
            if (r7 != r5) goto L_0x017e
            goto L_0x0186
        L_0x017e:
            java.lang.String r2 = r2.getString(r7)
            android.graphics.drawable.Drawable r10 = r1.f(r2)
        L_0x0186:
            r0.setImageDrawable(r10)
            if (r10 != 0) goto L_0x0191
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x019a
        L_0x0191:
            r0.setVisibility(r4)
            r10.setVisible(r4, r4)
            r10.setVisible(r9, r4)
        L_0x019a:
            int r0 = r1.f800r
            if (r0 == r8) goto L_0x01ad
            if (r0 != r9) goto L_0x01a5
            r0 = r6 & 1
            if (r0 == 0) goto L_0x01a5
            goto L_0x01ad
        L_0x01a5:
            android.widget.ImageView r0 = r3.f812e
            r2 = 8
            r0.setVisibility(r2)
            goto L_0x01c2
        L_0x01ad:
            android.widget.ImageView r0 = r3.f812e
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r3.f812e
            android.widget.TextView r2 = r3.f808a
            java.lang.CharSequence r2 = r2.getText()
            r0.setTag(r2)
            android.widget.ImageView r0 = r3.f812e
            r0.setOnClickListener(r1)
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v0.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    public void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f802t = cursor.getColumnIndex("suggest_text_1");
                this.f803u = cursor.getColumnIndex("suggest_text_2");
                this.f804v = cursor.getColumnIndex("suggest_text_2_url");
                this.f805w = cursor.getColumnIndex("suggest_icon_1");
                this.f806x = cursor.getColumnIndex("suggest_icon_2");
                this.f807y = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e2) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e2);
        }
    }

    public CharSequence c(Cursor cursor) {
        String h2;
        String h3;
        if (cursor == null) {
            return null;
        }
        String h4 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h4 != null) {
            return h4;
        }
        if (this.f796n.shouldRewriteQueryFromData() && (h3 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h3;
        }
        if (!this.f796n.shouldRewriteQueryFromText() || (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h2;
    }

    public View d(Context context, Cursor cursor, ViewGroup viewGroup) {
        View inflate = this.f3307l.inflate(this.f3305j, viewGroup, false);
        inflate.setTag(new a(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f799q);
        return inflate;
    }

    public Drawable e(Uri uri) {
        int i2;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f797o.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i2 = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i2 = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i2 != 0) {
                        return resourcesForApplication.getDrawable(i2);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r2);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable f(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "SuggestionsAdapter"
            r1 = 0
            if (r8 == 0) goto L_0x013d
            boolean r2 = r8.isEmpty()
            if (r2 != 0) goto L_0x013d
            java.lang.String r2 = "0"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x0015
            goto L_0x013d
        L_0x0015:
            int r2 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r4 = "android.resource://"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.content.Context r4 = r7.f797o     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.f798p     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.graphics.drawable.Drawable$ConstantState r4 = (android.graphics.drawable.Drawable.ConstantState) r4     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            if (r4 != 0) goto L_0x0044
            r4 = r1
            goto L_0x0048
        L_0x0044:
            android.graphics.drawable.Drawable r4 = r4.newDrawable()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
        L_0x0048:
            if (r4 == 0) goto L_0x004b
            return r4
        L_0x004b:
            android.content.Context r4 = r7.f797o     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            java.lang.Object r5 = x.a.f4298a     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.graphics.drawable.Drawable r2 = x.a.b.b(r4, r2)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            if (r2 == 0) goto L_0x005e
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r4 = r7.f798p     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            android.graphics.drawable.Drawable$ConstantState r5 = r2.getConstantState()     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
            r4.put(r3, r5)     // Catch:{ NumberFormatException -> 0x0074, NotFoundException -> 0x005f }
        L_0x005e:
            return r2
        L_0x005f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Icon resource not found: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            android.util.Log.w(r0, r8)
            return r1
        L_0x0074:
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r2 = r7.f798p
            java.lang.Object r2 = r2.get(r8)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L_0x0081
            r2 = r1
            goto L_0x0085
        L_0x0081:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L_0x0085:
            if (r2 == 0) goto L_0x0088
            return r2
        L_0x0088:
            android.net.Uri r2 = android.net.Uri.parse(r8)
            java.lang.String r3 = "Error closing icon stream for "
            java.lang.String r4 = r2.getScheme()     // Catch:{ FileNotFoundException -> 0x0111 }
            java.lang.String r5 = "android.resource"
            boolean r4 = r5.equals(r4)     // Catch:{ FileNotFoundException -> 0x0111 }
            if (r4 == 0) goto L_0x00b8
            android.graphics.drawable.Drawable r0 = r7.e(r2)     // Catch:{ NotFoundException -> 0x00a1 }
            r1 = r0
            goto L_0x0132
        L_0x00a1:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0111 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0111 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0111 }
            java.lang.String r5 = "Resource does not exist: "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0111 }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x0111 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0111 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0111 }
            throw r3     // Catch:{ FileNotFoundException -> 0x0111 }
        L_0x00b8:
            android.content.Context r4 = r7.f797o     // Catch:{ FileNotFoundException -> 0x0111 }
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0111 }
            java.io.InputStream r4 = r4.openInputStream(r2)     // Catch:{ FileNotFoundException -> 0x0111 }
            if (r4 == 0) goto L_0x00fa
            android.graphics.drawable.Drawable r5 = android.graphics.drawable.Drawable.createFromStream(r4, r1)     // Catch:{ all -> 0x00e1 }
            r4.close()     // Catch:{ IOException -> 0x00cc }
            goto L_0x00df
        L_0x00cc:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0111 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0111 }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x0111 }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x0111 }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0111 }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x0111 }
        L_0x00df:
            r1 = r5
            goto L_0x0132
        L_0x00e1:
            r5 = move-exception
            r4.close()     // Catch:{ IOException -> 0x00e6 }
            goto L_0x00f9
        L_0x00e6:
            r4 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0111 }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x0111 }
            r6.append(r3)     // Catch:{ FileNotFoundException -> 0x0111 }
            r6.append(r2)     // Catch:{ FileNotFoundException -> 0x0111 }
            java.lang.String r3 = r6.toString()     // Catch:{ FileNotFoundException -> 0x0111 }
            android.util.Log.e(r0, r3, r4)     // Catch:{ FileNotFoundException -> 0x0111 }
        L_0x00f9:
            throw r5     // Catch:{ FileNotFoundException -> 0x0111 }
        L_0x00fa:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0111 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0111 }
            r4.<init>()     // Catch:{ FileNotFoundException -> 0x0111 }
            java.lang.String r5 = "Failed to open "
            r4.append(r5)     // Catch:{ FileNotFoundException -> 0x0111 }
            r4.append(r2)     // Catch:{ FileNotFoundException -> 0x0111 }
            java.lang.String r4 = r4.toString()     // Catch:{ FileNotFoundException -> 0x0111 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0111 }
            throw r3     // Catch:{ FileNotFoundException -> 0x0111 }
        L_0x0111:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Icon not found: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = ", "
            r4.append(r2)
            java.lang.String r2 = r3.getMessage()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            android.util.Log.w(r0, r2)
        L_0x0132:
            if (r1 == 0) goto L_0x013d
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r0 = r7.f798p
            android.graphics.drawable.Drawable$ConstantState r2 = r1.getConstantState()
            r0.put(r8, r2)
        L_0x013d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v0.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public Cursor g(SearchableInfo searchableInfo, String str, int i2) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i2 > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i2));
        }
        return this.f797o.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View inflate = this.f3307l.inflate(this.f3306k, viewGroup, false);
            if (inflate != null) {
                ((a) inflate.getTag()).f808a.setText(e2.toString());
            }
            return inflate;
        }
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e2) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e2);
            View d2 = d(this.f797o, this.f3296d, viewGroup);
            ((a) d2.getTag()).f808a.setText(e2.toString());
            return d2;
        }
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f3296d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f3296d;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f795m.s((CharSequence) tag);
        }
    }
}
