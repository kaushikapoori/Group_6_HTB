package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class r0 extends s0 {

    public class a extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f1459a;

        public a(r0 r0Var, Rect rect) {
            this.f1459a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f1459a;
        }
    }

    public class b implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1460a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1461b;

        public b(r0 r0Var, View view, ArrayList arrayList) {
            this.f1460a = view;
            this.f1461b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f1460a.setVisibility(8);
            int size = this.f1461b.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) this.f1461b.get(i2)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    public class c implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f1462a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1463b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Object f1464c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1465d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ Object f1466e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ArrayList f1467f;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f1462a = obj;
            this.f1463b = arrayList;
            this.f1464c = obj2;
            this.f1465d = arrayList2;
            this.f1466e = obj3;
            this.f1467f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f1462a;
            if (obj != null) {
                r0.this.p(obj, this.f1463b, (ArrayList<View>) null);
            }
            Object obj2 = this.f1464c;
            if (obj2 != null) {
                r0.this.p(obj2, this.f1465d, (ArrayList<View>) null);
            }
            Object obj3 = this.f1466e;
            if (obj3 != null) {
                r0.this.p(obj3, this.f1467f, (ArrayList<View>) null);
            }
        }
    }

    public class d implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f1469a;

        public d(r0 r0Var, Runnable runnable) {
            this.f1469a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f1469a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    public class e extends Transition.EpicenterCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Rect f1470a;

        public e(r0 r0Var, Rect rect) {
            this.f1470a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f1470a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f1470a;
        }
    }

    public static boolean z(Transition transition) {
        return !s0.k(transition.getTargetIds()) || !s0.k(transition.getTargetNames()) || !s0.k(transition.getTargetTypes());
    }

    public void a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    public void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i2 = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i2 < transitionCount) {
                    b(transitionSet.getTransitionAt(i2), arrayList);
                    i2++;
                }
            } else if (!z(transition) && s0.k(transition.getTargets())) {
                int size = arrayList.size();
                while (i2 < size) {
                    transition.addTarget(arrayList.get(i2));
                    i2++;
                }
            }
        }
    }

    public void c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public boolean e(Object obj) {
        return obj instanceof Transition;
    }

    public Object g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    public Object l(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    public Object m(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    public void o(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    public void p(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                p(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!z(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i2 < size) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    public void q(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new b(this, view, arrayList));
    }

    public void r(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    public void s(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new e(this, rect));
        }
    }

    public void t(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            j(view, rect);
            ((Transition) obj).setEpicenterCallback(new a(this, rect));
        }
    }

    public void u(n nVar, Object obj, c0.b bVar, Runnable runnable) {
        ((Transition) obj).addListener(new d(this, runnable));
    }

    public void w(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            s0.d(targets, arrayList.get(i2));
        }
        targets.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    public void x(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            p(transitionSet, arrayList, arrayList2);
        }
    }

    public Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }
}
