package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.widget.k;
import com.example.supermarket.R;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import m.h;
import m.i;
import org.xmlpull.v1.XmlPullParser;
import w0.b;

public final class r0 {

    /* renamed from: h  reason: collision with root package name */
    public static final PorterDuff.Mode f764h = PorterDuff.Mode.SRC_IN;

    /* renamed from: i  reason: collision with root package name */
    public static r0 f765i;

    /* renamed from: j  reason: collision with root package name */
    public static final c f766j = new c(6);

    /* renamed from: a  reason: collision with root package name */
    public WeakHashMap<Context, i<ColorStateList>> f767a;

    /* renamed from: b  reason: collision with root package name */
    public h<String, e> f768b;

    /* renamed from: c  reason: collision with root package name */
    public i<String> f769c;

    /* renamed from: d  reason: collision with root package name */
    public final WeakHashMap<Context, m.e<WeakReference<Drawable.ConstantState>>> f770d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    public TypedValue f771e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f772f;

    /* renamed from: g  reason: collision with root package name */
    public f f773g;

    public static class a implements e {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return f.b.g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
                return null;
            }
        }
    }

    public static class b implements e {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                w0.b bVar = new w0.b(context, (b.C0057b) null, (Resources) null);
                bVar.inflate(resources, xmlPullParser, attributeSet, theme);
                return bVar;
            } catch (Exception e2) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
                return null;
            }
        }
    }

    public static class c extends m.f<Integer, PorterDuffColorFilter> {
        public c(int i2) {
            super(i2);
        }
    }

    public static class d implements e {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                g.b.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                return drawable;
            } catch (Exception e2) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e2);
                return null;
            }
        }
    }

    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public interface f {
    }

    public static class g implements e {
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return w0.f.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e2) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
                return null;
            }
        }
    }

    public static synchronized r0 d() {
        r0 r0Var;
        synchronized (r0.class) {
            if (f765i == null) {
                r0 r0Var2 = new r0();
                f765i = r0Var2;
                j(r0Var2);
            }
            r0Var = f765i;
        }
        return r0Var;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (r0.class) {
            c cVar = f766j;
            Objects.requireNonNull(cVar);
            int i3 = (i2 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) cVar.a(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                Objects.requireNonNull(cVar);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) cVar.b(Integer.valueOf(mode.hashCode() + i3), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void j(r0 r0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            r0Var.a("vector", new g());
            r0Var.a("animated-vector", new b());
            r0Var.a("animated-selector", new a());
            r0Var.a("drawable", new d());
        }
    }

    public final void a(String str, e eVar) {
        if (this.f768b == null) {
            this.f768b = new h<>();
        }
        this.f768b.put(str, eVar);
    }

    public final synchronized boolean b(Context context, long j2, Drawable drawable) {
        boolean z2;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            m.e eVar = this.f770d.get(context);
            if (eVar == null) {
                eVar = new m.e();
                this.f770d.put(context, eVar);
            }
            eVar.g(j2, new WeakReference(constantState));
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public final Drawable c(Context context, int i2) {
        int i3;
        if (this.f771e == null) {
            this.f771e = new TypedValue();
        }
        TypedValue typedValue = this.f771e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        f fVar = this.f773g;
        LayerDrawable layerDrawable = null;
        if (fVar != null) {
            k.a aVar = (k.a) fVar;
            if (i2 == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i2 == R.drawable.abc_ratingbar_material) {
                    i3 = R.dimen.abc_star_big;
                } else if (i2 == R.drawable.abc_ratingbar_indicator_material) {
                    i3 = R.dimen.abc_star_medium;
                } else if (i2 == R.drawable.abc_ratingbar_small_material) {
                    i3 = R.dimen.abc_star_small;
                }
                layerDrawable = aVar.c(this, context, i3);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r5 = r0.f3347d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable e(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, m.e<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f770d     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0041 }
            m.e r0 = (m.e) r0     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.f(r5, r1)     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0041 }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0028:
            long[] r4 = r0.f3346c     // Catch:{ all -> 0x0041 }
            int r2 = r0.f3348e     // Catch:{ all -> 0x0041 }
            int r4 = m.d.b(r4, r2, r5)     // Catch:{ all -> 0x0041 }
            if (r4 < 0) goto L_0x003f
            java.lang.Object[] r5 = r0.f3347d     // Catch:{ all -> 0x0041 }
            r6 = r5[r4]     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = m.e.f3344f     // Catch:{ all -> 0x0041 }
            if (r6 == r2) goto L_0x003f
            r5[r4] = r2     // Catch:{ all -> 0x0041 }
            r4 = 1
            r0.f3345b = r4     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r3)
            return r1
        L_0x0041:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.e(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        if (r0 != false) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable g(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f772f     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0006
            goto L_0x002b
        L_0x0006:
            r0 = 1
            r4.f772f = r0     // Catch:{ all -> 0x004a }
            r1 = 2131165269(0x7f070055, float:1.794475E38)
            android.graphics.drawable.Drawable r1 = r4.f(r5, r1)     // Catch:{ all -> 0x004a }
            r2 = 0
            if (r1 == 0) goto L_0x004c
            boolean r3 = r1 instanceof w0.f     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x004a }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x004a }
            boolean r1 = r3.equals(r1)     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            if (r0 == 0) goto L_0x004c
        L_0x002b:
            android.graphics.drawable.Drawable r0 = r4.k(r5, r6)     // Catch:{ all -> 0x004a }
            if (r0 != 0) goto L_0x0035
            android.graphics.drawable.Drawable r0 = r4.c(r5, r6)     // Catch:{ all -> 0x004a }
        L_0x0035:
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = x.a.f4298a     // Catch:{ all -> 0x004a }
            android.graphics.drawable.Drawable r0 = x.a.b.b(r5, r6)     // Catch:{ all -> 0x004a }
        L_0x003d:
            if (r0 == 0) goto L_0x0043
            android.graphics.drawable.Drawable r0 = r4.l(r5, r6, r7, r0)     // Catch:{ all -> 0x004a }
        L_0x0043:
            if (r0 == 0) goto L_0x0048
            androidx.appcompat.widget.i0.b(r0)     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r4)
            return r0
        L_0x004a:
            r5 = move-exception
            goto L_0x0056
        L_0x004c:
            r4.f772f = r2     // Catch:{ all -> 0x004a }
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x004a }
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch:{ all -> 0x004a }
            throw r5     // Catch:{ all -> 0x004a }
        L_0x0056:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0006, code lost:
        r0 = r0.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList i(android.content.Context r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, m.i<android.content.res.ColorStateList>> r0 = r3.f767a     // Catch:{ all -> 0x0049 }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0049 }
            m.i r0 = (m.i) r0     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0015
            java.lang.Object r0 = r0.d(r5, r1)     // Catch:{ all -> 0x0049 }
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch:{ all -> 0x0049 }
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 != 0) goto L_0x004b
            androidx.appcompat.widget.r0$f r0 = r3.f773g     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            androidx.appcompat.widget.k$a r0 = (androidx.appcompat.widget.k.a) r0     // Catch:{ all -> 0x0049 }
            android.content.res.ColorStateList r1 = r0.d(r4, r5)     // Catch:{ all -> 0x0049 }
        L_0x0023:
            if (r1 == 0) goto L_0x0047
            java.util.WeakHashMap<android.content.Context, m.i<android.content.res.ColorStateList>> r0 = r3.f767a     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0030
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            r3.f767a = r0     // Catch:{ all -> 0x0049 }
        L_0x0030:
            java.util.WeakHashMap<android.content.Context, m.i<android.content.res.ColorStateList>> r0 = r3.f767a     // Catch:{ all -> 0x0049 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0049 }
            m.i r0 = (m.i) r0     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0044
            m.i r0 = new m.i     // Catch:{ all -> 0x0049 }
            r0.<init>()     // Catch:{ all -> 0x0049 }
            java.util.WeakHashMap<android.content.Context, m.i<android.content.res.ColorStateList>> r2 = r3.f767a     // Catch:{ all -> 0x0049 }
            r2.put(r4, r0)     // Catch:{ all -> 0x0049 }
        L_0x0044:
            r0.a(r5, r1)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            r0 = r1
            goto L_0x004b
        L_0x0049:
            r4 = move-exception
            goto L_0x004d
        L_0x004b:
            monitor-exit(r3)
            return r0
        L_0x004d:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.i(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079 A[Catch:{ Exception -> 0x00a7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[Catch:{ Exception -> 0x00a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.drawable.Drawable k(android.content.Context r11, int r12) {
        /*
            r10 = this;
            m.h<java.lang.String, androidx.appcompat.widget.r0$e> r0 = r10.f768b
            r1 = 0
            if (r0 == 0) goto L_0x00b7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b7
            m.i<java.lang.String> r0 = r10.f769c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.d(r12, r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            m.h<java.lang.String, androidx.appcompat.widget.r0$e> r3 = r10.f768b
            java.lang.Object r0 = r3.getOrDefault(r0, r1)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            m.i r0 = new m.i
            r0.<init>()
            r10.f769c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f771e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f771e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f771e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            int r4 = r0.assetCookie
            long r4 = (long) r4
            r6 = 32
            long r4 = r4 << r6
            int r6 = r0.data
            long r6 = (long) r6
            long r4 = r4 | r6
            android.graphics.drawable.Drawable r6 = r10.e(r11, r4)
            if (r6 == 0) goto L_0x0055
            return r6
        L_0x0055:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00af
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00af
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a7 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a7 }
        L_0x006d:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a7 }
            r9 = 2
            if (r8 == r9) goto L_0x0077
            if (r8 == r3) goto L_0x0077
            goto L_0x006d
        L_0x0077:
            if (r8 != r9) goto L_0x009f
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a7 }
            m.i<java.lang.String> r8 = r10.f769c     // Catch:{ Exception -> 0x00a7 }
            r8.a(r12, r3)     // Catch:{ Exception -> 0x00a7 }
            m.h<java.lang.String, androidx.appcompat.widget.r0$e> r8 = r10.f768b     // Catch:{ Exception -> 0x00a7 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a7 }
            androidx.appcompat.widget.r0$e r3 = (androidx.appcompat.widget.r0.e) r3     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x0094
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a7 }
            android.graphics.drawable.Drawable r6 = r3.a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a7 }
        L_0x0094:
            if (r6 == 0) goto L_0x00af
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a7 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a7 }
            r10.b(r11, r4, r6)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00af
        L_0x009f:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a7 }
            throw r11     // Catch:{ Exception -> 0x00a7 }
        L_0x00a7:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00af:
            if (r6 != 0) goto L_0x00b6
            m.i<java.lang.String> r11 = r10.f769c
            r11.a(r12, r2)
        L_0x00b6:
            return r6
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.k(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    public final Drawable l(Context context, int i2, boolean z2, Drawable drawable) {
        ColorStateList i3 = i(context, i2);
        PorterDuff.Mode mode = null;
        if (i3 != null) {
            if (i0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable g2 = a0.a.g(drawable);
            g2.setTintList(i3);
            f fVar = this.f773g;
            if (fVar != null) {
                k.a aVar = (k.a) fVar;
                if (i2 == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return g2;
            }
            g2.setTintMode(mode);
            return g2;
        }
        f fVar2 = this.f773g;
        if (fVar2 != null) {
            k.a aVar2 = (k.a) fVar2;
            boolean z3 = true;
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
                int c2 = w0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = k.f671b;
                aVar2.e(findDrawableByLayerId, c2, mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908303), w0.c(context, R.attr.colorControlNormal), mode2);
                aVar2.e(layerDrawable.findDrawableByLayerId(16908301), w0.c(context, R.attr.colorControlActivated), mode2);
            } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
                int b2 = w0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = k.f671b;
                aVar2.e(findDrawableByLayerId2, b2, mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908303), w0.c(context, R.attr.colorControlActivated), mode3);
                aVar2.e(layerDrawable2.findDrawableByLayerId(16908301), w0.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z3 = false;
            }
            if (z3) {
                return drawable;
            }
        }
        if (m(context, i2, drawable) || !z2) {
            return drawable;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            androidx.appcompat.widget.r0$f r0 = r7.f773g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0072
            androidx.appcompat.widget.k$a r0 = (androidx.appcompat.widget.k.a) r0
            java.util.Objects.requireNonNull(r0)
            android.graphics.PorterDuff$Mode r3 = androidx.appcompat.widget.k.f671b
            int[] r4 = r0.f674a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L_0x001d
            r5 = 2130903264(0x7f0300e0, float:1.7413341E38)
            goto L_0x0049
        L_0x001d:
            int[] r4 = r0.f676c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L_0x0029
            r5 = 2130903262(0x7f0300de, float:1.7413337E38)
            goto L_0x0049
        L_0x0029:
            int[] r4 = r0.f677d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L_0x0034
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0049
        L_0x0034:
            r0 = 2131165228(0x7f07002c, float:1.7944667E38)
            if (r9 != r0) goto L_0x0044
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L_0x004b
        L_0x0044:
            r0 = 2131165210(0x7f07001a, float:1.794463E38)
            if (r9 != r0) goto L_0x004d
        L_0x0049:
            r9 = r5
            r0 = -1
        L_0x004b:
            r4 = 1
            goto L_0x0050
        L_0x004d:
            r9 = 0
            r0 = -1
            r4 = 0
        L_0x0050:
            if (r4 == 0) goto L_0x006e
            boolean r4 = androidx.appcompat.widget.i0.a(r10)
            if (r4 == 0) goto L_0x005c
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L_0x005c:
            int r8 = androidx.appcompat.widget.w0.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = androidx.appcompat.widget.k.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L_0x006c
            r10.setAlpha(r0)
        L_0x006c:
            r8 = 1
            goto L_0x006f
        L_0x006e:
            r8 = 0
        L_0x006f:
            if (r8 == 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.r0.m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
