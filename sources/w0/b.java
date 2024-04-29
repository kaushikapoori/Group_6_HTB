package w0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class b extends e implements Animatable {

    /* renamed from: c  reason: collision with root package name */
    public C0057b f4163c;

    /* renamed from: d  reason: collision with root package name */
    public Context f4164d;

    /* renamed from: e  reason: collision with root package name */
    public ArgbEvaluator f4165e;

    /* renamed from: f  reason: collision with root package name */
    public final Drawable.Callback f4166f;

    public class a implements Drawable.Callback {
        public a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            b.this.scheduleSelf(runnable, j2);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: w0.b$b  reason: collision with other inner class name */
    public static class C0057b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f4168a;

        /* renamed from: b  reason: collision with root package name */
        public f f4169b;

        /* renamed from: c  reason: collision with root package name */
        public AnimatorSet f4170c;

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<Animator> f4171d;

        /* renamed from: e  reason: collision with root package name */
        public m.a<Animator, String> f4172e;

        public C0057b(C0057b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f4168a = bVar.f4168a;
                f fVar = bVar.f4169b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    f fVar2 = (f) (resources != null ? constantState.newDrawable(resources) : constantState.newDrawable());
                    this.f4169b = fVar2;
                    fVar2.mutate();
                    this.f4169b = fVar2;
                    fVar2.setCallback(callback);
                    this.f4169b.setBounds(bVar.f4169b.getBounds());
                    this.f4169b.f4182g = false;
                }
                ArrayList<Animator> arrayList = bVar.f4171d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f4171d = new ArrayList<>(size);
                    this.f4172e = new m.a<>(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        Animator animator = bVar.f4171d.get(i2);
                        Animator clone = animator.clone();
                        String orDefault = bVar.f4172e.getOrDefault(animator, null);
                        clone.setTarget(this.f4169b.f4178c.f4233b.f4231p.getOrDefault(orDefault, null));
                        this.f4171d.add(clone);
                        this.f4172e.put(clone, orDefault);
                    }
                    if (this.f4170c == null) {
                        this.f4170c = new AnimatorSet();
                    }
                    this.f4170c.playTogether(this.f4171d);
                }
            }
        }

        public int getChangingConfigurations() {
            return this.f4168a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public b() {
        this((Context) null, (C0057b) null, (Resources) null);
    }

    public b(Context context, C0057b bVar, Resources resources) {
        this.f4165e = null;
        a aVar = new a();
        this.f4166f = aVar;
        this.f4164d = context;
        this.f4163c = new C0057b((C0057b) null, aVar, (Resources) null);
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f4163c.f4169b.draw(canvas);
        if (this.f4163c.f4170c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f4163c.f4169b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4163c.f4168a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f4163c.f4169b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f4176b == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f4176b.getConstantState());
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4163c.f4169b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4163c.f4169b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.getOpacity() : this.f4163c.f4169b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007a A[Catch:{ IOException | XmlPullParserException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x007f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r3 = r24
            r4 = r25
            android.graphics.drawable.Drawable r0 = r1.f4176b
            if (r0 == 0) goto L_0x0012
            r5 = r23
            r0.inflate(r2, r5, r3, r4)
            return
        L_0x0012:
            r5 = r23
            int r0 = r23.getEventType()
            int r6 = r23.getDepth()
            r7 = 1
            int r6 = r6 + r7
        L_0x001e:
            if (r0 == r7) goto L_0x0189
            int r8 = r23.getDepth()
            if (r8 >= r6) goto L_0x0029
            r8 = 3
            if (r0 == r8) goto L_0x0189
        L_0x0029:
            r8 = 2
            if (r0 != r8) goto L_0x0183
            java.lang.String r0 = r23.getName()
            java.lang.String r9 = "animated-vector"
            boolean r9 = r9.equals(r0)
            r10 = 24
            r11 = 0
            r12 = 0
            if (r9 == 0) goto L_0x00ab
            int[] r0 = w0.a.f4155e
            android.content.res.TypedArray r9 = y.i.d(r2, r4, r3, r0)
            int r0 = r9.getResourceId(r12, r12)
            if (r0 == 0) goto L_0x00a6
            android.graphics.PorterDuff$Mode r13 = w0.f.f4177k
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r10) goto L_0x0067
            w0.f r8 = new w0.f
            r8.<init>()
            java.lang.ThreadLocal<android.util.TypedValue> r10 = y.g.f4339a
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r0, r4)
            r8.f4176b = r0
            w0.f$i r0 = new w0.f$i
            android.graphics.drawable.Drawable r10 = r8.f4176b
            android.graphics.drawable.Drawable$ConstantState r10 = r10.getConstantState()
            r0.<init>(r10)
            goto L_0x0092
        L_0x0067:
            android.content.res.XmlResourceParser r0 = r2.getXml(r0)     // Catch:{ XmlPullParserException -> 0x0089, IOException -> 0x0087 }
            android.util.AttributeSet r10 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x0089, IOException -> 0x0087 }
        L_0x006f:
            int r13 = r0.next()     // Catch:{ XmlPullParserException -> 0x0089, IOException -> 0x0087 }
            if (r13 == r8) goto L_0x0078
            if (r13 == r7) goto L_0x0078
            goto L_0x006f
        L_0x0078:
            if (r13 != r8) goto L_0x007f
            w0.f r8 = w0.f.a(r2, r0, r10, r4)     // Catch:{ XmlPullParserException -> 0x0089, IOException -> 0x0087 }
            goto L_0x0092
        L_0x007f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0089, IOException -> 0x0087 }
            java.lang.String r8 = "No start tag found"
            r0.<init>(r8)     // Catch:{ XmlPullParserException -> 0x0089, IOException -> 0x0087 }
            throw r0     // Catch:{ XmlPullParserException -> 0x0089, IOException -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            goto L_0x008a
        L_0x0089:
            r0 = move-exception
        L_0x008a:
            java.lang.String r8 = "VectorDrawableCompat"
            java.lang.String r10 = "parser error"
            android.util.Log.e(r8, r10, r0)
            r8 = r11
        L_0x0092:
            r8.f4182g = r12
            android.graphics.drawable.Drawable$Callback r0 = r1.f4166f
            r8.setCallback(r0)
            w0.b$b r0 = r1.f4163c
            w0.f r0 = r0.f4169b
            if (r0 == 0) goto L_0x00a2
            r0.setCallback(r11)
        L_0x00a2:
            w0.b$b r0 = r1.f4163c
            r0.f4169b = r8
        L_0x00a6:
            r9.recycle()
            goto L_0x0183
        L_0x00ab:
            java.lang.String r8 = "target"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0183
            int[] r0 = w0.a.f4156f
            android.content.res.TypedArray r0 = r2.obtainAttributes(r3, r0)
            java.lang.String r8 = r0.getString(r12)
            int r9 = r0.getResourceId(r7, r12)
            if (r9 == 0) goto L_0x0180
            android.content.Context r12 = r1.f4164d
            if (r12 == 0) goto L_0x0175
            int r13 = android.os.Build.VERSION.SDK_INT
            if (r13 < r10) goto L_0x00d0
            android.animation.Animator r9 = android.animation.AnimatorInflater.loadAnimator(r12, r9)
            goto L_0x00f1
        L_0x00d0:
            android.content.res.Resources r13 = r12.getResources()
            android.content.res.Resources$Theme r14 = r12.getTheme()
            java.lang.String r10 = "Can't load animation resource ID #0x"
            android.content.res.XmlResourceParser r20 = r13.getAnimation(r9)     // Catch:{ XmlPullParserException -> 0x0150, IOException -> 0x0133 }
            android.util.AttributeSet r16 = android.util.Xml.asAttributeSet(r20)     // Catch:{ XmlPullParserException -> 0x012d, IOException -> 0x0129, all -> 0x0127 }
            r17 = 0
            r18 = 0
            r19 = 1065353216(0x3f800000, float:1.0)
            r15 = r20
            android.animation.Animator r9 = w0.c.a(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ XmlPullParserException -> 0x012d, IOException -> 0x0129, all -> 0x0127 }
            r20.close()
        L_0x00f1:
            w0.b$b r10 = r1.f4163c
            w0.f r10 = r10.f4169b
            w0.f$h r10 = r10.f4178c
            w0.f$g r10 = r10.f4233b
            m.a<java.lang.String, java.lang.Object> r10 = r10.f4231p
            java.lang.Object r10 = r10.getOrDefault(r8, r11)
            r9.setTarget(r10)
            w0.b$b r10 = r1.f4163c
            java.util.ArrayList<android.animation.Animator> r11 = r10.f4171d
            if (r11 != 0) goto L_0x0118
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r10.f4171d = r11
            w0.b$b r10 = r1.f4163c
            m.a r11 = new m.a
            r11.<init>()
            r10.f4172e = r11
        L_0x0118:
            w0.b$b r10 = r1.f4163c
            java.util.ArrayList<android.animation.Animator> r10 = r10.f4171d
            r10.add(r9)
            w0.b$b r10 = r1.f4163c
            m.a<android.animation.Animator, java.lang.String> r10 = r10.f4172e
            r10.put(r9, r8)
            goto L_0x0180
        L_0x0127:
            r0 = move-exception
            goto L_0x016f
        L_0x0129:
            r0 = move-exception
            r11 = r20
            goto L_0x0134
        L_0x012d:
            r0 = move-exception
            r11 = r20
            goto L_0x0151
        L_0x0131:
            r0 = move-exception
            goto L_0x016d
        L_0x0133:
            r0 = move-exception
        L_0x0134:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0131 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0131 }
            r3.<init>()     // Catch:{ all -> 0x0131 }
            r3.append(r10)     // Catch:{ all -> 0x0131 }
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x0131 }
            r3.append(r4)     // Catch:{ all -> 0x0131 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0131 }
            r2.<init>(r3)     // Catch:{ all -> 0x0131 }
            r2.initCause(r0)     // Catch:{ all -> 0x0131 }
            throw r2     // Catch:{ all -> 0x0131 }
        L_0x0150:
            r0 = move-exception
        L_0x0151:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException     // Catch:{ all -> 0x0131 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0131 }
            r3.<init>()     // Catch:{ all -> 0x0131 }
            r3.append(r10)     // Catch:{ all -> 0x0131 }
            java.lang.String r4 = java.lang.Integer.toHexString(r9)     // Catch:{ all -> 0x0131 }
            r3.append(r4)     // Catch:{ all -> 0x0131 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0131 }
            r2.<init>(r3)     // Catch:{ all -> 0x0131 }
            r2.initCause(r0)     // Catch:{ all -> 0x0131 }
            throw r2     // Catch:{ all -> 0x0131 }
        L_0x016d:
            r20 = r11
        L_0x016f:
            if (r20 == 0) goto L_0x0174
            r20.close()
        L_0x0174:
            throw r0
        L_0x0175:
            r0.recycle()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Context can't be null when inflating animators"
            r0.<init>(r2)
            throw r0
        L_0x0180:
            r0.recycle()
        L_0x0183:
            int r0 = r23.next()
            goto L_0x001e
        L_0x0189:
            w0.b$b r0 = r1.f4163c
            android.animation.AnimatorSet r2 = r0.f4170c
            if (r2 != 0) goto L_0x0196
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r0.f4170c = r2
        L_0x0196:
            android.animation.AnimatorSet r2 = r0.f4170c
            java.util.ArrayList<android.animation.Animator> r0 = r0.f4171d
            r2.playTogether(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.b.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f4163c.f4169b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f4176b;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4163c.f4170c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.isStateful() : this.f4163c.f4169b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4163c.f4169b.setBounds(rect);
        }
    }

    public boolean onLevelChange(int i2) {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.setLevel(i2) : this.f4163c.f4169b.setLevel(i2);
    }

    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4176b;
        return drawable != null ? drawable.setState(iArr) : this.f4163c.f4169b.setState(iArr);
    }

    public void setAlpha(int i2) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f4163c.f4169b.setAlpha(i2);
        }
    }

    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
            return;
        }
        f fVar = this.f4163c.f4169b;
        Drawable drawable2 = fVar.f4176b;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z2);
        } else {
            fVar.f4178c.f4236e = z2;
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        f fVar = this.f4163c.f4169b;
        Drawable drawable2 = fVar.f4176b;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
            return;
        }
        fVar.f4180e = colorFilter;
        fVar.invalidateSelf();
    }

    public void setTint(int i2) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            a0.a.d(drawable, i2);
        } else {
            this.f4163c.f4169b.setTint(i2);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            a0.a.e(drawable, colorStateList);
        } else {
            this.f4163c.f4169b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            a0.a.f(drawable, mode);
        } else {
            this.f4163c.f4169b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f4163c.f4169b.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    public void start() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f4163c.f4170c.isStarted()) {
            this.f4163c.f4170c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f4176b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4163c.f4170c.end();
        }
    }

    public static class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f4173a;

        public c(Drawable.ConstantState constantState) {
            this.f4173a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f4173a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f4173a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            b bVar = new b((Context) null, (C0057b) null, (Resources) null);
            Drawable newDrawable = this.f4173a.newDrawable();
            bVar.f4176b = newDrawable;
            newDrawable.setCallback(bVar.f4166f);
            return bVar;
        }

        public Drawable newDrawable(Resources resources) {
            b bVar = new b((Context) null, (C0057b) null, (Resources) null);
            Drawable newDrawable = this.f4173a.newDrawable(resources);
            bVar.f4176b = newDrawable;
            newDrawable.setCallback(bVar.f4166f);
            return bVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b((Context) null, (C0057b) null, (Resources) null);
            Drawable newDrawable = this.f4173a.newDrawable(resources, theme);
            bVar.f4176b = newDrawable;
            newDrawable.setCallback(bVar.f4166f);
            return bVar;
        }
    }
}
