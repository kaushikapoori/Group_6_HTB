package m0;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.example.supermarket.R;
import com.google.android.material.chip.Chip;
import g0.u;
import g0.x;
import h0.d;
import h0.e;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import m.i;
import m0.b;

public abstract class a extends g0.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f3382n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o  reason: collision with root package name */
    public static final b.a<d> f3383o = new C0042a();

    /* renamed from: p  reason: collision with root package name */
    public static final b.C0043b<i<d>, d> f3384p = new b();

    /* renamed from: d  reason: collision with root package name */
    public final Rect f3385d = new Rect();

    /* renamed from: e  reason: collision with root package name */
    public final Rect f3386e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f3387f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f3388g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f3389h;

    /* renamed from: i  reason: collision with root package name */
    public final View f3390i;

    /* renamed from: j  reason: collision with root package name */
    public c f3391j;

    /* renamed from: k  reason: collision with root package name */
    public int f3392k = Integer.MIN_VALUE;

    /* renamed from: l  reason: collision with root package name */
    public int f3393l = Integer.MIN_VALUE;

    /* renamed from: m  reason: collision with root package name */
    public int f3394m = Integer.MIN_VALUE;

    /* renamed from: m0.a$a  reason: collision with other inner class name */
    public class C0042a implements b.a<d> {
        public void a(Object obj, Rect rect) {
            ((d) obj).f3160a.getBoundsInParent(rect);
        }
    }

    public class b implements b.C0043b<i<d>, d> {
    }

    public class c extends e {
        public c() {
        }

        public d a(int i2) {
            return new d(AccessibilityNodeInfo.obtain(a.this.o(i2).f3160a));
        }

        public d b(int i2) {
            int i3 = i2 == 2 ? a.this.f3392k : a.this.f3393l;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return new d(AccessibilityNodeInfo.obtain(a.this.o(i3).f3160a));
        }

        public boolean c(int i2, int i3, Bundle bundle) {
            int i4;
            a aVar = a.this;
            if (i2 != -1) {
                boolean z2 = true;
                if (i3 == 1) {
                    return aVar.r(i2);
                }
                if (i3 == 2) {
                    return aVar.k(i2);
                }
                if (i3 != 64) {
                    return i3 != 128 ? aVar.p(i2, i3, bundle) : aVar.j(i2);
                }
                if (!aVar.f3389h.isEnabled() || !aVar.f3389h.isTouchExplorationEnabled() || (i4 = aVar.f3392k) == i2) {
                    z2 = false;
                } else {
                    if (i4 != Integer.MIN_VALUE) {
                        aVar.j(i4);
                    }
                    aVar.f3392k = i2;
                    aVar.f3390i.invalidate();
                    aVar.s(i2, 32768);
                }
                return z2;
            }
            View view = aVar.f3390i;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            return u.d.j(view, i3, bundle);
        }
    }

    public a(View view) {
        if (view != null) {
            this.f3390i = view;
            this.f3389h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (u.d.c(view) == 0) {
                u.d.s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public e b(View view) {
        if (this.f3391j == null) {
            this.f3391j = new c();
        }
        return this.f3391j;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2994a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, d dVar) {
        this.f2994a.onInitializeAccessibilityNodeInfo(view, dVar.f3160a);
        Chip.b bVar = (Chip.b) this;
        dVar.f3160a.setCheckable(Chip.this.f());
        dVar.f3160a.setClickable(Chip.this.isClickable());
        dVar.f3160a.setClassName(Chip.this.getAccessibilityClassName());
        CharSequence text = Chip.this.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            dVar.f3160a.setText(text);
        } else {
            dVar.f3160a.setContentDescription(text);
        }
    }

    public final boolean j(int i2) {
        if (this.f3392k != i2) {
            return false;
        }
        this.f3392k = Integer.MIN_VALUE;
        this.f3390i.invalidate();
        s(i2, 65536);
        return true;
    }

    public final boolean k(int i2) {
        if (this.f3393l != i2) {
            return false;
        }
        this.f3393l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i2 == 1) {
            Chip chip = Chip.this;
            chip.f2251o = false;
            chip.refreshDrawableState();
        }
        s(i2, 8);
        return true;
    }

    public final d l(int i2) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        d dVar = new d(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = f3382n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f3390i;
        dVar.f3161b = -1;
        obtain.setParent(view);
        q(i2, dVar);
        if (dVar.g() == null && dVar.e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        obtain.getBoundsInParent(this.f3386e);
        if (!this.f3386e.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(this.f3390i.getContext().getPackageName());
                View view2 = this.f3390i;
                dVar.f3162c = i2;
                obtain.setSource(view2, i2);
                boolean z2 = false;
                if (this.f3392k == i2) {
                    obtain.setAccessibilityFocused(true);
                    obtain.addAction(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    obtain.addAction(64);
                }
                boolean z3 = this.f3393l == i2;
                if (z3) {
                    obtain.addAction(2);
                } else if (obtain.isFocusable()) {
                    obtain.addAction(1);
                }
                obtain.setFocused(z3);
                this.f3390i.getLocationOnScreen(this.f3388g);
                obtain.getBoundsInScreen(this.f3385d);
                if (this.f3385d.equals(rect)) {
                    obtain.getBoundsInParent(this.f3385d);
                    if (dVar.f3161b != -1) {
                        AccessibilityNodeInfo obtain2 = AccessibilityNodeInfo.obtain();
                        for (int i3 = dVar.f3161b; i3 != -1; i3 = -1) {
                            obtain2.setParent(this.f3390i, -1);
                            obtain2.setBoundsInParent(f3382n);
                            Chip.b bVar = (Chip.b) this;
                            CharSequence charSequence = "";
                            if (i3 == 1) {
                                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                                if (closeIconContentDescription == null) {
                                    CharSequence text = Chip.this.getText();
                                    Context context = Chip.this.getContext();
                                    Object[] objArr = new Object[1];
                                    if (!TextUtils.isEmpty(text)) {
                                        charSequence = text;
                                    }
                                    objArr[0] = charSequence;
                                    closeIconContentDescription = context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim();
                                }
                                obtain2.setContentDescription(closeIconContentDescription);
                                obtain2.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                                obtain2.addAction((AccessibilityNodeInfo.AccessibilityAction) d.a.f3163e.f3171a);
                                obtain2.setEnabled(Chip.this.isEnabled());
                            } else {
                                obtain2.setContentDescription(charSequence);
                                obtain2.setBoundsInParent(Chip.f2240y);
                            }
                            obtain2.getBoundsInParent(this.f3386e);
                            Rect rect2 = this.f3385d;
                            Rect rect3 = this.f3386e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        obtain2.recycle();
                    }
                    this.f3385d.offset(this.f3388g[0] - this.f3390i.getScrollX(), this.f3388g[1] - this.f3390i.getScrollY());
                }
                if (this.f3390i.getLocalVisibleRect(this.f3387f)) {
                    this.f3387f.offset(this.f3388g[0] - this.f3390i.getScrollX(), this.f3388g[1] - this.f3390i.getScrollY());
                    if (this.f3385d.intersect(this.f3387f)) {
                        dVar.f3160a.setBoundsInScreen(this.f3385d);
                        Rect rect4 = this.f3385d;
                        if (rect4 != null && !rect4.isEmpty() && this.f3390i.getWindowVisibility() == 0) {
                            View view3 = this.f3390i;
                            while (true) {
                                ViewParent parent = view3.getParent();
                                if (parent instanceof View) {
                                    view3 = (View) parent;
                                    if (view3.getAlpha() > 0.0f) {
                                        if (view3.getVisibility() != 0) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                } else if (parent != null) {
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            dVar.f3160a.setVisibleToUser(true);
                        }
                    }
                }
                return dVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void m(List<Integer> list);

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013d, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x013f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0149 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0144  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean n(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.m(r3)
            m.i r4 = new m.i
            r4.<init>()
            r5 = 0
            r6 = 0
        L_0x0015:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0039
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            h0.d r7 = r0.l(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.f(r8, r7)
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0039:
            int r3 = r0.f3393l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L_0x0041
            r3 = 0
            goto L_0x0047
        L_0x0041:
            java.lang.Object r3 = r4.c(r3)
            h0.d r3 = (h0.d) r3
        L_0x0047:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L_0x014c
            if (r1 == r8) goto L_0x014c
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0067
            if (r1 == r12) goto L_0x0067
            if (r1 == r11) goto L_0x0067
            if (r1 != r8) goto L_0x005f
            goto L_0x0067
        L_0x005f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0067:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.f3393l
            java.lang.String r6 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r7) goto L_0x007c
            h0.d r2 = r0.o(r15)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.f3160a
            r2.getBoundsInParent(r14)
            goto L_0x00a9
        L_0x007c:
            if (r2 == 0) goto L_0x0082
            r14.set(r2)
            goto L_0x00a9
        L_0x0082:
            android.view.View r2 = r0.f3390i
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x00a6
            if (r1 == r12) goto L_0x00a2
            if (r1 == r11) goto L_0x009e
            if (r1 != r8) goto L_0x0098
            r14.set(r5, r9, r15, r9)
            goto L_0x00a9
        L_0x0098:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x009e:
            r14.set(r9, r5, r9, r2)
            goto L_0x00a9
        L_0x00a2:
            r14.set(r5, r2, r15, r2)
            goto L_0x00a9
        L_0x00a6:
            r14.set(r15, r5, r15, r2)
        L_0x00a9:
            m0.b$b<m.i<h0.d>, h0.d> r2 = f3384p
            m0.b$a<h0.d> r15 = f3383o
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r14)
            if (r1 == r13) goto L_0x00d7
            if (r1 == r12) goto L_0x00ce
            if (r1 == r11) goto L_0x00c7
            if (r1 != r8) goto L_0x00c1
            int r6 = r14.height()
            int r6 = r6 + r10
            int r6 = -r6
            goto L_0x00d3
        L_0x00c1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x00c7:
            int r6 = r14.width()
            int r6 = r6 + r10
            int r6 = -r6
            goto L_0x00dc
        L_0x00ce:
            int r6 = r14.height()
            int r6 = r6 + r10
        L_0x00d3:
            r7.offset(r5, r6)
            goto L_0x00df
        L_0x00d7:
            int r6 = r14.width()
            int r6 = r6 + r10
        L_0x00dc:
            r7.offset(r6, r5)
        L_0x00df:
            m0.a$b r2 = (m0.a.b) r2
            java.util.Objects.requireNonNull(r2)
            int r2 = r4.g()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r8 = 0
            r16 = 0
        L_0x00f0:
            if (r8 >= r2) goto L_0x01ba
            java.lang.Object[] r11 = r4.f3380c
            r11 = r11[r8]
            h0.d r11 = (h0.d) r11
            if (r11 != r3) goto L_0x00fb
            goto L_0x0149
        L_0x00fb:
            r12 = r15
            m0.a$a r12 = (m0.a.C0042a) r12
            r12.a(r11, r6)
            boolean r12 = m0.b.c(r14, r6, r1)
            if (r12 != 0) goto L_0x0108
            goto L_0x0141
        L_0x0108:
            boolean r12 = m0.b.c(r14, r7, r1)
            if (r12 != 0) goto L_0x010f
            goto L_0x013f
        L_0x010f:
            boolean r12 = m0.b.a(r1, r14, r6, r7)
            if (r12 == 0) goto L_0x0116
            goto L_0x013f
        L_0x0116:
            boolean r12 = m0.b.a(r1, r14, r7, r6)
            if (r12 == 0) goto L_0x011d
            goto L_0x0141
        L_0x011d:
            int r12 = m0.b.d(r1, r14, r6)
            int r13 = m0.b.e(r1, r14, r6)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = m0.b.d(r1, r14, r7)
            int r17 = m0.b.e(r1, r14, r7)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L_0x0141
        L_0x013f:
            r12 = 1
            goto L_0x0142
        L_0x0141:
            r12 = 0
        L_0x0142:
            if (r12 == 0) goto L_0x0149
            r7.set(r6)
            r16 = r11
        L_0x0149:
            int r8 = r8 + 1
            goto L_0x00f0
        L_0x014c:
            android.view.View r2 = r0.f3390i
            java.util.WeakHashMap<android.view.View, g0.x> r6 = g0.u.f3063a
            int r2 = g0.u.e.d(r2)
            if (r2 != r10) goto L_0x0158
            r2 = 1
            goto L_0x0159
        L_0x0158:
            r2 = 0
        L_0x0159:
            m0.b$b<m.i<h0.d>, h0.d> r6 = f3384p
            m0.b$a<h0.d> r7 = f3383o
            m0.a$b r6 = (m0.a.b) r6
            java.util.Objects.requireNonNull(r6)
            int r6 = r4.g()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r12 = 0
        L_0x016c:
            if (r12 >= r6) goto L_0x017a
            java.lang.Object[] r13 = r4.f3380c
            r13 = r13[r12]
            h0.d r13 = (h0.d) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x016c
        L_0x017a:
            m0.b$c r6 = new m0.b$c
            r6.<init>(r2, r7)
            java.util.Collections.sort(r11, r6)
            if (r1 == r10) goto L_0x01a4
            if (r1 != r8) goto L_0x019c
            int r1 = r11.size()
            if (r3 != 0) goto L_0x018e
            r2 = -1
            goto L_0x0192
        L_0x018e:
            int r2 = r11.lastIndexOf(r3)
        L_0x0192:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x019a
            java.lang.Object r6 = r11.get(r2)
            goto L_0x01b6
        L_0x019a:
            r6 = 0
            goto L_0x01b6
        L_0x019c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01a4:
            int r1 = r11.size()
            if (r3 != 0) goto L_0x01ab
            goto L_0x01af
        L_0x01ab:
            int r1 = r11.indexOf(r3)
        L_0x01af:
            int r1 = r1 + r9
            if (r1 < 0) goto L_0x019a
            java.lang.Object r6 = r11.get(r1)
        L_0x01b6:
            r16 = r6
            h0.d r16 = (h0.d) r16
        L_0x01ba:
            r1 = r16
            if (r1 != 0) goto L_0x01c1
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01d4
        L_0x01c1:
            int r2 = r4.f3381d
            if (r5 >= r2) goto L_0x01d0
            java.lang.Object[] r2 = r4.f3380c
            r2 = r2[r5]
            if (r2 != r1) goto L_0x01cd
            r9 = r5
            goto L_0x01d0
        L_0x01cd:
            int r5 = r5 + 1
            goto L_0x01c1
        L_0x01d0:
            int r7 = r4.e(r9)
        L_0x01d4:
            boolean r1 = r0.r(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.a.n(int, android.graphics.Rect):boolean");
    }

    public d o(int i2) {
        if (i2 != -1) {
            return l(i2);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f3390i);
        d dVar = new d(obtain);
        View view = this.f3390i;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        m(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                dVar.f3160a.addChild(this.f3390i, ((Integer) arrayList.get(i3)).intValue());
            }
            return dVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract boolean p(int i2, int i3, Bundle bundle);

    public abstract void q(int i2, d dVar);

    public final boolean r(int i2) {
        int i3;
        if ((!this.f3390i.isFocused() && !this.f3390i.requestFocus()) || (i3 = this.f3393l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            k(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.f3393l = i2;
        Chip.b bVar = (Chip.b) this;
        if (i2 == 1) {
            Chip chip = Chip.this;
            chip.f2251o = true;
            chip.refreshDrawableState();
        }
        s(i2, 8);
        return true;
    }

    public final boolean s(int i2, int i3) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i2 == Integer.MIN_VALUE || !this.f3389h.isEnabled() || (parent = this.f3390i.getParent()) == null) {
            return false;
        }
        if (i2 != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i3);
            d o2 = o(i2);
            accessibilityEvent.getText().add(o2.g());
            accessibilityEvent.setContentDescription(o2.e());
            accessibilityEvent.setScrollable(o2.f3160a.isScrollable());
            accessibilityEvent.setPassword(o2.f3160a.isPassword());
            accessibilityEvent.setEnabled(o2.f3160a.isEnabled());
            accessibilityEvent.setChecked(o2.f3160a.isChecked());
            if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                accessibilityEvent.setClassName(o2.f3160a.getClassName());
                accessibilityEvent.setSource(this.f3390i, i2);
                accessibilityEvent.setPackageName(this.f3390i.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i3);
            this.f3390i.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return parent.requestSendAccessibilityEvent(this.f3390i, accessibilityEvent);
    }
}
