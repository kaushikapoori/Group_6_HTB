package v0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public class k {

    /* renamed from: a  reason: collision with root package name */
    public static g f4080a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<m.a<ViewGroup, ArrayList<g>>>> f4081b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public static ArrayList<ViewGroup> f4082c = new ArrayList<>();

    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        public g f4083b;

        /* renamed from: c  reason: collision with root package name */
        public ViewGroup f4084c;

        /* renamed from: v0.k$a$a  reason: collision with other inner class name */
        public class C0054a extends j {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ m.a f4085a;

            public C0054a(m.a aVar) {
                this.f4085a = aVar;
            }

            public void d(g gVar) {
                ((ArrayList) this.f4085a.get(a.this.f4084c)).remove(gVar);
                gVar.v(this);
            }
        }

        public a(g gVar, ViewGroup viewGroup) {
            this.f4083b = gVar;
            this.f4084c = viewGroup;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: v0.o} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x022a  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x0256  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:141:0x0204 A[EDGE_INSN: B:141:0x0204->B:91:0x0204 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0209  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
                r18 = this;
                r0 = r18
                android.view.ViewGroup r1 = r0.f4084c
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f4084c
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = v0.k.f4082c
                android.view.ViewGroup r2 = r0.f4084c
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                m.a r1 = v0.k.b()
                android.view.ViewGroup r3 = r0.f4084c
                java.lang.Object r3 = r1.get(r3)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r4 = 0
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f4084c
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                v0.g r6 = r0.f4083b
                r3.add(r6)
                v0.g r3 = r0.f4083b
                v0.k$a$a r6 = new v0.k$a$a
                r6.<init>(r1)
                r3.a(r6)
                v0.g r1 = r0.f4083b
                android.view.ViewGroup r3 = r0.f4084c
                r6 = 0
                r1.h(r3, r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                v0.g r3 = (v0.g) r3
                android.view.ViewGroup r5 = r0.f4084c
                r3.x(r5)
                goto L_0x0060
            L_0x0072:
                v0.g r1 = r0.f4083b
                android.view.ViewGroup r8 = r0.f4084c
                java.util.Objects.requireNonNull(r1)
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f4062l = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f4063m = r3
                n.c r3 = r1.f4058h
                n.c r5 = r1.f4059i
                m.a r7 = new m.a
                n.e r9 = r3.f3438a
                m.a r9 = (m.a) r9
                r7.<init>((m.h) r9)
                m.a r9 = new m.a
                n.e r10 = r5.f3438a
                m.a r10 = (m.a) r10
                r9.<init>((m.h) r10)
                r10 = 0
            L_0x009e:
                int[] r11 = r1.f4061k
                int r12 = r11.length
                if (r10 >= r12) goto L_0x0204
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01c4
                r12 = 2
                if (r11 == r12) goto L_0x0172
                r12 = 3
                if (r11 == r12) goto L_0x011a
                r12 = 4
                if (r11 == r12) goto L_0x00b3
            L_0x00b0:
                r17 = r3
                goto L_0x0116
            L_0x00b3:
                n.e r11 = r3.f3440c
                m.e r11 = (m.e) r11
                n.e r12 = r5.f3440c
                m.e r12 = (m.e) r12
                int r13 = r11.h()
                r14 = 0
            L_0x00c0:
                if (r14 >= r13) goto L_0x00b0
                java.lang.Object r15 = r11.i(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x010c
                boolean r16 = r1.s(r15)
                if (r16 == 0) goto L_0x010c
                boolean r6 = r11.f3345b
                if (r6 == 0) goto L_0x00d7
                r11.d()
            L_0x00d7:
                long[] r6 = r11.f3346c
                r17 = r3
                r2 = r6[r14]
                java.lang.Object r2 = r12.e(r2)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x010e
                boolean r3 = r1.s(r2)
                if (r3 == 0) goto L_0x010e
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                v0.o r3 = (v0.o) r3
                java.lang.Object r6 = r9.getOrDefault(r2, r4)
                v0.o r6 = (v0.o) r6
                if (r3 == 0) goto L_0x010e
                if (r6 == 0) goto L_0x010e
                java.util.ArrayList<v0.o> r4 = r1.f4062l
                r4.add(r3)
                java.util.ArrayList<v0.o> r3 = r1.f4063m
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x010e
            L_0x010c:
                r17 = r3
            L_0x010e:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00c0
            L_0x0116:
                r2 = r17
                goto L_0x01fa
            L_0x011a:
                r2 = r3
                n.e r3 = r2.f3439b
                android.util.SparseArray r3 = (android.util.SparseArray) r3
                n.e r4 = r5.f3439b
                android.util.SparseArray r4 = (android.util.SparseArray) r4
                int r6 = r3.size()
                r11 = 0
            L_0x0128:
                if (r11 >= r6) goto L_0x01fa
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x016d
                boolean r13 = r1.s(r12)
                if (r13 == 0) goto L_0x016d
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x016d
                boolean r14 = r1.s(r13)
                if (r14 == 0) goto L_0x016d
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                v0.o r15 = (v0.o) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                v0.o r14 = (v0.o) r14
                if (r15 == 0) goto L_0x016d
                if (r14 == 0) goto L_0x016d
                java.util.ArrayList<v0.o> r0 = r1.f4062l
                r0.add(r15)
                java.util.ArrayList<v0.o> r0 = r1.f4063m
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x016d:
                int r11 = r11 + 1
                r0 = r18
                goto L_0x0128
            L_0x0172:
                r2 = r3
                java.lang.Object r0 = r2.f3441d
                m.a r0 = (m.a) r0
                java.lang.Object r3 = r5.f3441d
                m.a r3 = (m.a) r3
                int r4 = r0.f3377d
                r6 = 0
            L_0x017e:
                if (r6 >= r4) goto L_0x01fa
                java.lang.Object r11 = r0.k(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01c1
                boolean r12 = r1.s(r11)
                if (r12 == 0) goto L_0x01c1
                java.lang.Object r12 = r0.h(r6)
                java.lang.Object r12 = r3.get(r12)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01c1
                boolean r13 = r1.s(r12)
                if (r13 == 0) goto L_0x01c1
                r13 = 0
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                v0.o r14 = (v0.o) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                v0.o r15 = (v0.o) r15
                if (r14 == 0) goto L_0x01c1
                if (r15 == 0) goto L_0x01c1
                java.util.ArrayList<v0.o> r13 = r1.f4062l
                r13.add(r14)
                java.util.ArrayList<v0.o> r13 = r1.f4063m
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01c1:
                int r6 = r6 + 1
                goto L_0x017e
            L_0x01c4:
                r2 = r3
                int r0 = r7.f3377d
            L_0x01c7:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01fa
                java.lang.Object r3 = r7.h(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01c7
                boolean r4 = r1.s(r3)
                if (r4 == 0) goto L_0x01c7
                java.lang.Object r3 = r9.remove(r3)
                v0.o r3 = (v0.o) r3
                if (r3 == 0) goto L_0x01c7
                android.view.View r4 = r3.f4095b
                boolean r4 = r1.s(r4)
                if (r4 == 0) goto L_0x01c7
                java.lang.Object r4 = r7.i(r0)
                v0.o r4 = (v0.o) r4
                java.util.ArrayList<v0.o> r6 = r1.f4062l
                r6.add(r4)
                java.util.ArrayList<v0.o> r4 = r1.f4063m
                r4.add(r3)
                goto L_0x01c7
            L_0x01fa:
                int r10 = r10 + 1
                r0 = r18
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x009e
            L_0x0204:
                r0 = 0
            L_0x0205:
                int r2 = r7.f3377d
                if (r0 >= r2) goto L_0x0225
                java.lang.Object r2 = r7.k(r0)
                v0.o r2 = (v0.o) r2
                android.view.View r3 = r2.f4095b
                boolean r3 = r1.s(r3)
                if (r3 == 0) goto L_0x0222
                java.util.ArrayList<v0.o> r3 = r1.f4062l
                r3.add(r2)
                java.util.ArrayList<v0.o> r2 = r1.f4063m
                r3 = 0
                r2.add(r3)
            L_0x0222:
                int r0 = r0 + 1
                goto L_0x0205
            L_0x0225:
                r0 = 0
            L_0x0226:
                int r2 = r9.f3377d
                if (r0 >= r2) goto L_0x0246
                java.lang.Object r2 = r9.k(r0)
                v0.o r2 = (v0.o) r2
                android.view.View r3 = r2.f4095b
                boolean r3 = r1.s(r3)
                if (r3 == 0) goto L_0x0243
                java.util.ArrayList<v0.o> r3 = r1.f4063m
                r3.add(r2)
                java.util.ArrayList<v0.o> r2 = r1.f4062l
                r3 = 0
                r2.add(r3)
            L_0x0243:
                int r0 = r0 + 1
                goto L_0x0226
            L_0x0246:
                m.a r0 = v0.g.o()
                int r2 = r0.f3377d
                v0.w r3 = v0.q.f4098a
                android.view.WindowId r3 = r8.getWindowId()
                r4 = 1
                int r2 = r2 - r4
            L_0x0254:
                if (r2 < 0) goto L_0x02c6
                java.lang.Object r4 = r0.h(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                r5 = 0
                if (r4 == 0) goto L_0x02c3
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                v0.g$b r6 = (v0.g.b) r6
                if (r6 == 0) goto L_0x02c3
                android.view.View r7 = r6.f4072a
                if (r7 == 0) goto L_0x02c3
                v0.a0 r7 = r6.f4075d
                boolean r9 = r7 instanceof v0.z
                if (r9 == 0) goto L_0x027d
                v0.z r7 = (v0.z) r7
                android.view.WindowId r7 = r7.f4127a
                boolean r7 = r7.equals(r3)
                if (r7 == 0) goto L_0x027d
                r7 = 1
                goto L_0x027e
            L_0x027d:
                r7 = 0
            L_0x027e:
                if (r7 == 0) goto L_0x02c3
                v0.o r7 = r6.f4074c
                android.view.View r9 = r6.f4072a
                r10 = 1
                v0.o r11 = r1.q(r9, r10)
                v0.o r12 = r1.n(r9, r10)
                if (r11 != 0) goto L_0x029e
                if (r12 != 0) goto L_0x029e
                n.c r10 = r1.f4059i
                n.e r10 = r10.f3438a
                m.a r10 = (m.a) r10
                java.lang.Object r9 = r10.get(r9)
                r12 = r9
                v0.o r12 = (v0.o) r12
            L_0x029e:
                if (r11 != 0) goto L_0x02a2
                if (r12 == 0) goto L_0x02ac
            L_0x02a2:
                v0.g r6 = r6.f4076e
                boolean r6 = r6.r(r7, r12)
                if (r6 == 0) goto L_0x02ac
                r6 = 1
                goto L_0x02ad
            L_0x02ac:
                r6 = 0
            L_0x02ad:
                if (r6 == 0) goto L_0x02c3
                boolean r6 = r4.isRunning()
                if (r6 != 0) goto L_0x02c0
                boolean r6 = r4.isStarted()
                if (r6 == 0) goto L_0x02bc
                goto L_0x02c0
            L_0x02bc:
                r0.remove(r4)
                goto L_0x02c3
            L_0x02c0:
                r4.cancel()
            L_0x02c3:
                int r2 = r2 + -1
                goto L_0x0254
            L_0x02c6:
                n.c r9 = r1.f4058h
                n.c r10 = r1.f4059i
                java.util.ArrayList<v0.o> r11 = r1.f4062l
                java.util.ArrayList<v0.o> r12 = r1.f4063m
                r7 = r1
                r7.l(r8, r9, r10, r11, r12)
                r1.y()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: v0.k.a.onPreDraw():boolean");
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f4084c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f4084c.removeOnAttachStateChangeListener(this);
            k.f4082c.remove(this.f4084c);
            ArrayList arrayList = k.b().get(this.f4084c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).x(this.f4084c);
                }
            }
            this.f4083b.i(true);
        }
    }

    public static void a(ViewGroup viewGroup, g gVar) {
        if (!f4082c.contains(viewGroup)) {
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            if (u.g.c(viewGroup)) {
                f4082c.add(viewGroup);
                if (gVar == null) {
                    gVar = f4080a;
                }
                g j2 = gVar.clone();
                ArrayList orDefault = b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator it = orDefault.iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).u(viewGroup);
                    }
                }
                if (j2 != null) {
                    j2.h(viewGroup, true);
                }
                if (((f) viewGroup.getTag(R.id.transition_current_scene)) == null) {
                    viewGroup.setTag(R.id.transition_current_scene, (Object) null);
                    if (j2 != null) {
                        a aVar = new a(j2, viewGroup);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public static m.a<ViewGroup, ArrayList<g>> b() {
        m.a<ViewGroup, ArrayList<g>> aVar;
        WeakReference weakReference = f4081b.get();
        if (weakReference != null && (aVar = (m.a) weakReference.get()) != null) {
            return aVar;
        }
        m.a<ViewGroup, ArrayList<g>> aVar2 = new m.a<>();
        f4081b.set(new WeakReference(aVar2));
        return aVar2;
    }
}
