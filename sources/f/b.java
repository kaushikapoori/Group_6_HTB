package f;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import f.c;
import f.e;
import m.i;

@SuppressLint({"RestrictedAPI"})
public class b extends e implements a0.b {

    /* renamed from: q  reason: collision with root package name */
    public c f2927q;

    /* renamed from: r  reason: collision with root package name */
    public g f2928r;

    /* renamed from: s  reason: collision with root package name */
    public int f2929s;

    /* renamed from: t  reason: collision with root package name */
    public int f2930t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2931u;

    /* renamed from: f.b$b  reason: collision with other inner class name */
    public static class C0029b extends g {

        /* renamed from: a  reason: collision with root package name */
        public final Animatable f2932a;

        public C0029b(Animatable animatable) {
            super((a) null);
            this.f2932a = animatable;
        }

        public void c() {
            this.f2932a.start();
        }

        public void d() {
            this.f2932a.stop();
        }
    }

    public static class c extends e.a {
        public m.e<Long> K;
        public i<Integer> L;

        public c(c cVar, b bVar, Resources resources) {
            super(cVar, bVar, resources);
            i<Integer> iVar;
            if (cVar != null) {
                this.K = cVar.K;
                iVar = cVar.L;
            } else {
                this.K = new m.e<>();
                iVar = new i<>();
            }
            this.L = iVar;
        }

        public static long h(int i2, int i3) {
            return ((long) i3) | (((long) i2) << 32);
        }

        public void e() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        public int i(int i2) {
            if (i2 < 0) {
                return 0;
            }
            return this.L.d(i2, 0).intValue();
        }

        public Drawable newDrawable() {
            return new b(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new b(this, resources);
        }
    }

    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        public final w0.b f2933a;

        public d(w0.b bVar) {
            super((a) null);
            this.f2933a = bVar;
        }

        public void c() {
            this.f2933a.start();
        }

        public void d() {
            this.f2933a.stop();
        }
    }

    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        public final ObjectAnimator f2934a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2935b;

        public e(AnimationDrawable animationDrawable, boolean z2, boolean z3) {
            super((a) null);
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i2 = z2 ? numberOfFrames - 1 : 0;
            int i3 = z2 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z2);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i2, i3});
            g.a.a(ofInt, true);
            ofInt.setDuration((long) fVar.f2938c);
            ofInt.setInterpolator(fVar);
            this.f2935b = z3;
            this.f2934a = ofInt;
        }

        public boolean a() {
            return this.f2935b;
        }

        public void b() {
            this.f2934a.reverse();
        }

        public void c() {
            this.f2934a.start();
        }

        public void d() {
            this.f2934a.cancel();
        }
    }

    public static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        public int[] f2936a;

        /* renamed from: b  reason: collision with root package name */
        public int f2937b;

        /* renamed from: c  reason: collision with root package name */
        public int f2938c;

        public f(AnimationDrawable animationDrawable, boolean z2) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f2937b = numberOfFrames;
            int[] iArr = this.f2936a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f2936a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f2936a;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                int duration = animationDrawable.getDuration(z2 ? (numberOfFrames - i3) - 1 : i3);
                iArr2[i3] = duration;
                i2 += duration;
            }
            this.f2938c = i2;
        }

        public float getInterpolation(float f2) {
            int i2 = (int) ((f2 * ((float) this.f2938c)) + 0.5f);
            int i3 = this.f2937b;
            int[] iArr = this.f2936a;
            int i4 = 0;
            while (i4 < i3 && i2 >= iArr[i4]) {
                i2 -= iArr[i4];
                i4++;
            }
            return (((float) i4) / ((float) i3)) + (i4 < i3 ? ((float) i2) / ((float) this.f2938c) : 0.0f);
        }
    }

    public static abstract class g {
        public g(a aVar) {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    static {
        Class<b> cls = b.class;
    }

    public b() {
        this((c) null, (Resources) null);
    }

    public b(c cVar, Resources resources) {
        super((e.a) null);
        this.f2929s = -1;
        this.f2930t = -1;
        c cVar2 = new c(cVar, this, resources);
        super.e(cVar2);
        this.f2927q = cVar2;
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01f8, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(f.a.a(r2, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f.b g(android.content.Context r19, android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            java.lang.String r5 = r21.getName()
            java.lang.String r6 = "animated-selector"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x021e
            f.b r5 = new f.b
            r6 = 0
            r5.<init>(r6, r6)
            int[] r7 = g.c.f2990a
            android.content.res.TypedArray r7 = y.i.d(r1, r4, r3, r7)
            r8 = 1
            boolean r9 = r7.getBoolean(r8, r8)
            r5.setVisible(r9, r8)
            f.b$c r9 = r5.f2927q
            int r10 = r9.f2957d
            int r11 = g.b.b(r7)
            r10 = r10 | r11
            r9.f2957d = r10
            boolean r10 = r9.f2962i
            r11 = 2
            boolean r10 = r7.getBoolean(r11, r10)
            r9.f2962i = r10
            boolean r10 = r9.f2965l
            r12 = 3
            boolean r10 = r7.getBoolean(r12, r10)
            r9.f2965l = r10
            int r10 = r9.A
            r13 = 4
            int r10 = r7.getInt(r13, r10)
            r9.A = r10
            r10 = 5
            int r14 = r9.B
            int r10 = r7.getInt(r10, r14)
            r9.B = r10
            boolean r9 = r9.f2977x
            r10 = 0
            boolean r9 = r7.getBoolean(r10, r9)
            r5.setDither(r9)
            f.c$c r9 = r5.f2940b
            r9.f(r1)
            r7.recycle()
            int r7 = r21.getDepth()
            int r7 = r7 + r8
        L_0x0070:
            int r9 = r21.next()
            if (r9 == r8) goto L_0x0216
            int r14 = r21.getDepth()
            if (r14 >= r7) goto L_0x007e
            if (r9 == r12) goto L_0x0216
        L_0x007e:
            if (r9 == r11) goto L_0x0081
            goto L_0x0070
        L_0x0081:
            if (r14 <= r7) goto L_0x0084
            goto L_0x0070
        L_0x0084:
            java.lang.String r9 = r21.getName()
            java.lang.String r11 = "item"
            boolean r9 = r9.equals(r11)
            r11 = -1
            if (r9 == 0) goto L_0x013d
            int[] r9 = g.c.f2991b
            android.content.res.TypedArray r9 = y.i.d(r1, r4, r3, r9)
            int r12 = r9.getResourceId(r10, r10)
            int r8 = r9.getResourceId(r8, r11)
            if (r8 <= 0) goto L_0x00a9
            androidx.appcompat.widget.r0 r6 = androidx.appcompat.widget.r0.d()
            android.graphics.drawable.Drawable r6 = r6.f(r0, r8)
        L_0x00a9:
            r9.recycle()
            int r8 = r22.getAttributeCount()
            int[] r9 = new int[r8]
            r11 = 0
            r14 = 0
        L_0x00b4:
            if (r11 >= r8) goto L_0x00da
            int r15 = r3.getAttributeNameResource(r11)
            r16 = r7
            if (r15 == 0) goto L_0x00d5
            r7 = 16842960(0x10100d0, float:2.369414E-38)
            if (r15 == r7) goto L_0x00d5
            r7 = 16843161(0x1010199, float:2.3694704E-38)
            if (r15 == r7) goto L_0x00d5
            int r7 = r14 + 1
            boolean r17 = r3.getAttributeBooleanValue(r11, r10)
            if (r17 == 0) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            int r15 = -r15
        L_0x00d2:
            r9[r14] = r15
            r14 = r7
        L_0x00d5:
            int r11 = r11 + 1
            r7 = r16
            goto L_0x00b4
        L_0x00da:
            r16 = r7
            int[] r7 = android.util.StateSet.trimStateSet(r9, r14)
            java.lang.String r8 = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r6 != 0) goto L_0x0113
        L_0x00e4:
            int r6 = r21.next()
            if (r6 != r13) goto L_0x00eb
            goto L_0x00e4
        L_0x00eb:
            r9 = 2
            if (r6 != r9) goto L_0x0104
            java.lang.String r6 = r21.getName()
            java.lang.String r9 = "vector"
            boolean r6 = r6.equals(r9)
            if (r6 == 0) goto L_0x00ff
            w0.f r6 = w0.f.a(r20, r21, r22, r23)
            goto L_0x0113
        L_0x00ff:
            android.graphics.drawable.Drawable r6 = g.b.a(r20, r21, r22, r23)
            goto L_0x0113
        L_0x0104:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = f.a.a(r2, r1, r8)
            r0.<init>(r1)
            throw r0
        L_0x0113:
            if (r6 == 0) goto L_0x012e
            f.b$c r8 = r5.f2927q
            int r6 = r8.a(r6)
            int[][] r9 = r8.J
            r9[r6] = r7
            m.i<java.lang.Integer> r7 = r8.L
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
            r7.f(r6, r8)
            r6 = 0
            r8 = 1
            r11 = 2
            r12 = 3
            goto L_0x0212
        L_0x012e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = f.a.a(r2, r1, r8)
            r0.<init>(r1)
            throw r0
        L_0x013d:
            r16 = r7
            java.lang.String r6 = r21.getName()
            java.lang.String r7 = "transition"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0208
            int[] r6 = g.c.f2992c
            android.content.res.TypedArray r6 = y.i.d(r1, r4, r3, r6)
            r7 = 2
            int r7 = r6.getResourceId(r7, r11)
            r8 = 1
            int r8 = r6.getResourceId(r8, r11)
            int r9 = r6.getResourceId(r10, r11)
            if (r9 <= 0) goto L_0x016a
            androidx.appcompat.widget.r0 r12 = androidx.appcompat.widget.r0.d()
            android.graphics.drawable.Drawable r9 = r12.f(r0, r9)
            goto L_0x016b
        L_0x016a:
            r9 = 0
        L_0x016b:
            r12 = 3
            boolean r10 = r6.getBoolean(r12, r10)
            r6.recycle()
            java.lang.String r6 = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable"
            if (r9 != 0) goto L_0x01ab
        L_0x0177:
            int r9 = r21.next()
            if (r9 != r13) goto L_0x017e
            goto L_0x0177
        L_0x017e:
            r12 = 2
            if (r9 != r12) goto L_0x019c
            java.lang.String r9 = r21.getName()
            java.lang.String r12 = "animated-vector"
            boolean r9 = r9.equals(r12)
            if (r9 == 0) goto L_0x0197
            w0.b r9 = new w0.b
            r12 = 0
            r9.<init>(r0, r12, r12)
            r9.inflate(r1, r2, r3, r4)
            goto L_0x01ab
        L_0x0197:
            android.graphics.drawable.Drawable r9 = g.b.a(r20, r21, r22, r23)
            goto L_0x01ab
        L_0x019c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = f.a.a(r2, r1, r6)
            r0.<init>(r1)
            throw r0
        L_0x01ab:
            if (r9 == 0) goto L_0x01f9
            if (r7 == r11) goto L_0x01e8
            if (r8 == r11) goto L_0x01e8
            f.b$c r6 = r5.f2927q
            int r9 = r6.a(r9)
            long r11 = f.b.c.h(r7, r8)
            if (r10 == 0) goto L_0x01c3
            r13 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L_0x01c5
        L_0x01c3:
            r13 = 0
        L_0x01c5:
            m.e<java.lang.Long> r15 = r6.K
            long r0 = (long) r9
            long r17 = r0 | r13
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            r15.a(r11, r9)
            if (r10 == 0) goto L_0x0208
            long r7 = f.b.c.h(r8, r7)
            m.e<java.lang.Long> r6 = r6.K
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 | r9
            long r0 = r0 | r13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.a(r7, r0)
            goto L_0x0208
        L_0x01e8:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = ": <transition> tag requires 'fromId' & 'toId' attributes"
            java.lang.String r1 = f.a.a(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L_0x01f9:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r1 = f.a.a(r2, r1, r6)
            r0.<init>(r1)
            throw r0
        L_0x0208:
            r6 = 0
            r8 = 1
            r10 = 0
            r11 = 2
            r12 = 3
            r13 = 4
            r0 = r19
            r1 = r20
        L_0x0212:
            r7 = r16
            goto L_0x0070
        L_0x0216:
            int[] r0 = r5.getState()
            r5.onStateChange(r0)
            return r5
        L_0x021e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r21.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid animated-selector tag "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.b.g(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):f.b");
    }

    public c.C0030c b() {
        return new c(this.f2927q, this, (Resources) null);
    }

    public void e(c.C0030c cVar) {
        super.e(cVar);
        if (cVar instanceof c) {
            this.f2927q = (c) cVar;
        }
    }

    public e.a f() {
        return new c(this.f2927q, this, (Resources) null);
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f2928r;
        if (gVar != null) {
            gVar.d();
            this.f2928r = null;
            d(this.f2929s);
            this.f2929s = -1;
            this.f2930t = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f2931u) {
            super.mutate();
            this.f2927q.e();
            this.f2931u = true;
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean z2;
        g gVar;
        int[] iArr2 = iArr;
        c cVar = this.f2927q;
        int g2 = cVar.g(iArr2);
        if (g2 < 0) {
            g2 = cVar.g(StateSet.WILD_CARD);
        }
        int i2 = this.f2946h;
        boolean z3 = false;
        if (g2 != i2) {
            g gVar2 = this.f2928r;
            if (gVar2 != null) {
                if (g2 != this.f2929s) {
                    if (g2 != this.f2930t || !gVar2.a()) {
                        i2 = this.f2929s;
                        gVar2.d();
                    } else {
                        gVar2.b();
                        this.f2929s = this.f2930t;
                        this.f2930t = g2;
                    }
                }
                z2 = true;
                if (z2 || d(g2)) {
                    z3 = true;
                }
            }
            this.f2928r = null;
            this.f2930t = -1;
            this.f2929s = -1;
            c cVar2 = this.f2927q;
            int i3 = cVar2.i(i2);
            int i4 = cVar2.i(g2);
            if (!(i4 == 0 || i3 == 0)) {
                int longValue = (int) cVar2.K.f(c.h(i3, i4), -1L).longValue();
                if (longValue >= 0) {
                    boolean z4 = (cVar2.K.f(c.h(i3, i4), -1L).longValue() & 8589934592L) != 0;
                    d(longValue);
                    Drawable drawable = this.f2942d;
                    if (drawable instanceof AnimationDrawable) {
                        gVar = new e((AnimationDrawable) drawable, (cVar2.K.f(c.h(i3, i4), -1L).longValue() & 4294967296L) != 0, z4);
                    } else if (drawable instanceof w0.b) {
                        gVar = new d((w0.b) drawable);
                    } else if (drawable instanceof Animatable) {
                        gVar = new C0029b((Animatable) drawable);
                    }
                    gVar.c();
                    this.f2928r = gVar;
                    this.f2930t = i2;
                    this.f2929s = g2;
                    z2 = true;
                    z3 = true;
                }
            }
            z2 = false;
            z3 = true;
        }
        Drawable drawable2 = this.f2942d;
        return drawable2 != null ? z3 | drawable2.setState(iArr2) : z3;
    }

    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        g gVar = this.f2928r;
        if (gVar != null && (visible || z3)) {
            if (z2) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
