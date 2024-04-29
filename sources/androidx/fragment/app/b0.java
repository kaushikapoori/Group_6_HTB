package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.j0;
import androidx.fragment.app.n;
import androidx.fragment.app.q0;
import androidx.lifecycle.g;
import com.example.supermarket.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class b0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public ArrayList<a> F;
    public ArrayList<Boolean> G;
    public ArrayList<n> H;
    public ArrayList<n> I;
    public e0 J;
    public Runnable K = new g();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<l> f1215a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public boolean f1216b;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f1217c = new i0();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<a> f1218d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<n> f1219e;

    /* renamed from: f  reason: collision with root package name */
    public final z f1220f = new z(this);

    /* renamed from: g  reason: collision with root package name */
    public OnBackPressedDispatcher f1221g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.activity.b f1222h = new c(false);

    /* renamed from: i  reason: collision with root package name */
    public final AtomicInteger f1223i = new AtomicInteger();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Bundle> f1224j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, Object> f1225k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l  reason: collision with root package name */
    public Map<n, HashSet<c0.b>> f1226l = Collections.synchronizedMap(new HashMap());

    /* renamed from: m  reason: collision with root package name */
    public final q0.a f1227m = new d();

    /* renamed from: n  reason: collision with root package name */
    public final a0 f1228n = new a0(this);

    /* renamed from: o  reason: collision with root package name */
    public final CopyOnWriteArrayList<f0> f1229o = new CopyOnWriteArrayList<>();

    /* renamed from: p  reason: collision with root package name */
    public int f1230p = -1;

    /* renamed from: q  reason: collision with root package name */
    public y<?> f1231q;

    /* renamed from: r  reason: collision with root package name */
    public v f1232r;

    /* renamed from: s  reason: collision with root package name */
    public n f1233s;

    /* renamed from: t  reason: collision with root package name */
    public n f1234t;

    /* renamed from: u  reason: collision with root package name */
    public x f1235u = new e();

    /* renamed from: v  reason: collision with root package name */
    public y0 f1236v = new f(this);

    /* renamed from: w  reason: collision with root package name */
    public androidx.activity.result.d<Intent> f1237w;

    /* renamed from: x  reason: collision with root package name */
    public androidx.activity.result.d<Object> f1238x;

    /* renamed from: y  reason: collision with root package name */
    public androidx.activity.result.d<String[]> f1239y;

    /* renamed from: z  reason: collision with root package name */
    public ArrayDeque<k> f1240z = new ArrayDeque<>();

    public class a implements androidx.activity.result.c<androidx.activity.result.b> {
        public a() {
        }

        public void a(Object obj) {
            StringBuilder sb;
            androidx.activity.result.b bVar = (androidx.activity.result.b) obj;
            k pollFirst = b0.this.f1240z.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No IntentSenders were started for ");
                sb.append(this);
            } else {
                String str = pollFirst.f1249b;
                int i2 = pollFirst.f1250c;
                n e2 = b0.this.f1217c.e(str);
                if (e2 == null) {
                    sb = new StringBuilder();
                    sb.append("Intent Sender result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    e2.E(i2, bVar.f69b, bVar.f70c);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public class b implements androidx.activity.result.c<Map<String, Boolean>> {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public void a(Object obj) {
            String str;
            Map map = (Map) obj;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
            }
            k pollFirst = b0.this.f1240z.pollFirst();
            if (pollFirst == null) {
                str = "No permissions were requested for " + this;
            } else {
                String str2 = pollFirst.f1249b;
                if (b0.this.f1217c.e(str2) == null) {
                    str = h.f.a("Permission request result delivered for unknown Fragment ", str2);
                } else {
                    return;
                }
            }
            Log.w("FragmentManager", str);
        }
    }

    public class c extends androidx.activity.b {
        public c(boolean z2) {
            super(z2);
        }

        public void a() {
            b0 b0Var = b0.this;
            b0Var.C(true);
            if (b0Var.f1222h.f67a) {
                b0Var.U();
            } else {
                b0Var.f1221g.b();
            }
        }
    }

    public class d implements q0.a {
        public d() {
        }

        public void a(n nVar, c0.b bVar) {
            boolean z2;
            synchronized (bVar) {
                z2 = bVar.f2064a;
            }
            if (!z2) {
                b0 b0Var = b0.this;
                HashSet hashSet = b0Var.f1226l.get(nVar);
                if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
                    b0Var.f1226l.remove(nVar);
                    if (nVar.f1371b < 5) {
                        b0Var.i(nVar);
                        b0Var.S(nVar, b0Var.f1230p);
                    }
                }
            }
        }

        public void b(n nVar, c0.b bVar) {
            b0 b0Var = b0.this;
            if (b0Var.f1226l.get(nVar) == null) {
                b0Var.f1226l.put(nVar, new HashSet());
            }
            b0Var.f1226l.get(nVar).add(bVar);
        }
    }

    public class e extends x {
        public e() {
        }

        public n a(ClassLoader classLoader, String str) {
            y<?> yVar = b0.this.f1231q;
            Context context = yVar.f1532c;
            Objects.requireNonNull(yVar);
            Object obj = n.S;
            try {
                return (n) x.c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (InstantiationException e2) {
                throw new n.c(z.d.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
            } catch (IllegalAccessException e3) {
                throw new n.c(z.d.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
            } catch (NoSuchMethodException e4) {
                throw new n.c(z.d.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
            } catch (InvocationTargetException e5) {
                throw new n.c(z.d.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
            }
        }
    }

    public class f implements y0 {
        public f(b0 b0Var) {
        }
    }

    public class g implements Runnable {
        public g() {
        }

        public void run() {
            b0.this.C(true);
        }
    }

    public class h implements f0 {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ n f1247b;

        public h(b0 b0Var, n nVar) {
            this.f1247b = nVar;
        }

        public void b(b0 b0Var, n nVar) {
            Objects.requireNonNull(this.f1247b);
        }
    }

    public class i implements androidx.activity.result.c<androidx.activity.result.b> {
        public i() {
        }

        public void a(Object obj) {
            StringBuilder sb;
            androidx.activity.result.b bVar = (androidx.activity.result.b) obj;
            k pollFirst = b0.this.f1240z.pollFirst();
            if (pollFirst == null) {
                sb = new StringBuilder();
                sb.append("No Activities were started for result for ");
                sb.append(this);
            } else {
                String str = pollFirst.f1249b;
                int i2 = pollFirst.f1250c;
                n e2 = b0.this.f1217c.e(str);
                if (e2 == null) {
                    sb = new StringBuilder();
                    sb.append("Activity result delivered for unknown Fragment ");
                    sb.append(str);
                } else {
                    e2.E(i2, bVar.f69b, bVar.f70c);
                    return;
                }
            }
            Log.w("FragmentManager", sb.toString());
        }
    }

    public static class j extends b.a<Object, androidx.activity.result.b> {
        public Object a(int i2, Intent intent) {
            return new androidx.activity.result.b(i2, intent);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class k implements Parcelable {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public String f1249b;

        /* renamed from: c  reason: collision with root package name */
        public int f1250c;

        public class a implements Parcelable.Creator<k> {
            public Object createFromParcel(Parcel parcel) {
                return new k(parcel);
            }

            public Object[] newArray(int i2) {
                return new k[i2];
            }
        }

        public k(Parcel parcel) {
            this.f1249b = parcel.readString();
            this.f1250c = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f1249b);
            parcel.writeInt(this.f1250c);
        }
    }

    public interface l {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    public class m implements l {

        /* renamed from: a  reason: collision with root package name */
        public final int f1251a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1252b;

        public m(String str, int i2, int i3) {
            this.f1251a = i2;
            this.f1252b = i3;
        }

        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            n nVar = b0.this.f1234t;
            if (nVar != null && this.f1251a < 0 && nVar.i().U()) {
                return false;
            }
            return b0.this.V(arrayList, arrayList2, (String) null, this.f1251a, this.f1252b);
        }
    }

    public static class n implements n.e {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f1254a;

        /* renamed from: b  reason: collision with root package name */
        public final a f1255b;

        /* renamed from: c  reason: collision with root package name */
        public int f1256c;

        public void a() {
            boolean z2 = this.f1256c > 0;
            for (n c02 : this.f1255b.f1196p.f1217c.i()) {
                c02.c0((n.e) null);
            }
            a aVar = this.f1255b;
            aVar.f1196p.g(aVar, this.f1254a, !z2, true);
        }
    }

    public static boolean M(int i2) {
        return Log.isLoggable("FragmentManager", i2);
    }

    public void A(l lVar, boolean z2) {
        if (!z2) {
            if (this.f1231q == null) {
                if (this.D) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (Q()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1215a) {
            if (this.f1231q != null) {
                this.f1215a.add(lVar);
                a0();
            } else if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public final void B(boolean z2) {
        if (this.f1216b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f1231q == null) {
            if (this.D) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.f1231q.f1533d.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z2 || !Q()) {
            if (this.F == null) {
                this.F = new ArrayList<>();
                this.G = new ArrayList<>();
            }
            this.f1216b = true;
            try {
                F((ArrayList<a>) null, (ArrayList<Boolean>) null);
            } finally {
                this.f1216b = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* JADX INFO: finally extract failed */
    public boolean C(boolean z2) {
        boolean z3;
        B(z2);
        boolean z4 = false;
        while (true) {
            ArrayList<a> arrayList = this.F;
            ArrayList<Boolean> arrayList2 = this.G;
            synchronized (this.f1215a) {
                if (this.f1215a.isEmpty()) {
                    z3 = false;
                } else {
                    int size = this.f1215a.size();
                    z3 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z3 |= this.f1215a.get(i2).a(arrayList, arrayList2);
                    }
                    this.f1215a.clear();
                    this.f1231q.f1533d.removeCallbacks(this.K);
                }
            }
            if (z3) {
                this.f1216b = true;
                try {
                    X(this.F, this.G);
                    e();
                    z4 = true;
                } catch (Throwable th) {
                    e();
                    throw th;
                }
            } else {
                h0();
                x();
                this.f1217c.b();
                return z4;
            }
        }
        while (true) {
        }
    }

    /* JADX INFO: finally extract failed */
    public void D(l lVar, boolean z2) {
        if (!z2 || (this.f1231q != null && !this.D)) {
            B(z2);
            ((a) lVar).a(this.F, this.G);
            this.f1216b = true;
            try {
                X(this.F, this.G);
                e();
                h0();
                x();
                this.f1217c.b();
            } catch (Throwable th) {
                e();
                throw th;
            }
        }
    }

    public final void E(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ViewGroup viewGroup;
        int i4;
        int i5;
        ArrayList<a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i6 = i2;
        int i7 = i3;
        boolean z2 = arrayList3.get(i6).f1340o;
        ArrayList<n> arrayList5 = this.H;
        if (arrayList5 == null) {
            this.H = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.H.addAll(this.f1217c.i());
        n nVar = this.f1234t;
        int i8 = i6;
        boolean z3 = false;
        while (true) {
            int i9 = 1;
            if (i8 < i7) {
                a aVar = arrayList3.get(i8);
                int i10 = 3;
                if (!arrayList4.get(i8).booleanValue()) {
                    ArrayList<n> arrayList6 = this.H;
                    int i11 = 0;
                    while (i11 < aVar.f1326a.size()) {
                        j0.a aVar2 = aVar.f1326a.get(i11);
                        int i12 = aVar2.f1341a;
                        if (i12 != i9) {
                            if (i12 == 2) {
                                n nVar2 = aVar2.f1342b;
                                int i13 = nVar2.f1393x;
                                int size = arrayList6.size() - 1;
                                boolean z4 = false;
                                while (size >= 0) {
                                    n nVar3 = arrayList6.get(size);
                                    if (nVar3.f1393x != i13) {
                                        i5 = i13;
                                    } else if (nVar3 == nVar2) {
                                        i5 = i13;
                                        z4 = true;
                                    } else {
                                        if (nVar3 == nVar) {
                                            i5 = i13;
                                            aVar.f1326a.add(i11, new j0.a(9, nVar3));
                                            i11++;
                                            nVar = null;
                                        } else {
                                            i5 = i13;
                                        }
                                        j0.a aVar3 = new j0.a(3, nVar3);
                                        aVar3.f1343c = aVar2.f1343c;
                                        aVar3.f1345e = aVar2.f1345e;
                                        aVar3.f1344d = aVar2.f1344d;
                                        aVar3.f1346f = aVar2.f1346f;
                                        aVar.f1326a.add(i11, aVar3);
                                        arrayList6.remove(nVar3);
                                        i11++;
                                    }
                                    size--;
                                    ArrayList<Boolean> arrayList7 = arrayList2;
                                    i13 = i5;
                                }
                                if (z4) {
                                    aVar.f1326a.remove(i11);
                                    i11--;
                                } else {
                                    i4 = 1;
                                    aVar2.f1341a = 1;
                                    arrayList6.add(nVar2);
                                    i11 += i4;
                                    ArrayList<Boolean> arrayList8 = arrayList2;
                                    int i14 = i2;
                                    i9 = 1;
                                    i10 = 3;
                                }
                            } else if (i12 == i10 || i12 == 6) {
                                arrayList6.remove(aVar2.f1342b);
                                n nVar4 = aVar2.f1342b;
                                if (nVar4 == nVar) {
                                    aVar.f1326a.add(i11, new j0.a(9, nVar4));
                                    i11++;
                                    i4 = 1;
                                    nVar = null;
                                    i11 += i4;
                                    ArrayList<Boolean> arrayList82 = arrayList2;
                                    int i142 = i2;
                                    i9 = 1;
                                    i10 = 3;
                                }
                            } else if (i12 != 7) {
                                if (i12 == 8) {
                                    aVar.f1326a.add(i11, new j0.a(9, nVar));
                                    i11++;
                                    nVar = aVar2.f1342b;
                                }
                            }
                            i4 = 1;
                            i11 += i4;
                            ArrayList<Boolean> arrayList822 = arrayList2;
                            int i1422 = i2;
                            i9 = 1;
                            i10 = 3;
                        }
                        i4 = 1;
                        arrayList6.add(aVar2.f1342b);
                        i11 += i4;
                        ArrayList<Boolean> arrayList8222 = arrayList2;
                        int i14222 = i2;
                        i9 = 1;
                        i10 = 3;
                    }
                } else {
                    int i15 = 1;
                    ArrayList<n> arrayList9 = this.H;
                    int size2 = aVar.f1326a.size() - 1;
                    while (size2 >= 0) {
                        j0.a aVar4 = aVar.f1326a.get(size2);
                        int i16 = aVar4.f1341a;
                        if (i16 != i15) {
                            if (i16 != 3) {
                                switch (i16) {
                                    case 6:
                                        break;
                                    case 7:
                                        break;
                                    case 8:
                                        nVar = null;
                                        break;
                                    case 9:
                                        nVar = aVar4.f1342b;
                                        break;
                                    case 10:
                                        aVar4.f1348h = aVar4.f1347g;
                                        break;
                                }
                            }
                            arrayList9.add(aVar4.f1342b);
                            size2--;
                            i15 = 1;
                        }
                        arrayList9.remove(aVar4.f1342b);
                        size2--;
                        i15 = 1;
                    }
                }
                z3 = z3 || aVar.f1332g;
                i8++;
                arrayList4 = arrayList2;
                int i17 = i2;
            } else {
                this.H.clear();
                if (!z2 && this.f1230p >= 1) {
                    for (int i18 = i2; i18 < i7; i18++) {
                        Iterator<j0.a> it = arrayList3.get(i18).f1326a.iterator();
                        while (it.hasNext()) {
                            n nVar5 = it.next().f1342b;
                            if (!(nVar5 == null || nVar5.f1388s == null)) {
                                this.f1217c.j(h(nVar5));
                            }
                        }
                    }
                }
                int i19 = i2;
                while (i19 < i7) {
                    a aVar5 = arrayList3.get(i19);
                    if (arrayList2.get(i19).booleanValue()) {
                        aVar5.c(-1);
                        aVar5.h(i19 == i7 + -1);
                    } else {
                        aVar5.c(1);
                        aVar5.g();
                    }
                    i19++;
                }
                ArrayList<Boolean> arrayList10 = arrayList2;
                boolean booleanValue = arrayList10.get(i7 - 1).booleanValue();
                for (int i20 = i2; i20 < i7; i20++) {
                    a aVar6 = arrayList3.get(i20);
                    if (booleanValue) {
                        for (int size3 = aVar6.f1326a.size() - 1; size3 >= 0; size3--) {
                            n nVar6 = aVar6.f1326a.get(size3).f1342b;
                            if (nVar6 != null) {
                                h(nVar6).k();
                            }
                        }
                    } else {
                        Iterator<j0.a> it2 = aVar6.f1326a.iterator();
                        while (it2.hasNext()) {
                            n nVar7 = it2.next().f1342b;
                            if (nVar7 != null) {
                                h(nVar7).k();
                            }
                        }
                    }
                }
                R(this.f1230p, true);
                HashSet hashSet = new HashSet();
                for (int i21 = i2; i21 < i7; i21++) {
                    Iterator<j0.a> it3 = arrayList3.get(i21).f1326a.iterator();
                    while (it3.hasNext()) {
                        n nVar8 = it3.next().f1342b;
                        if (!(nVar8 == null || (viewGroup = nVar8.E) == null)) {
                            hashSet.add(x0.g(viewGroup, K()));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    x0 x0Var = (x0) it4.next();
                    x0Var.f1507d = booleanValue;
                    x0Var.h();
                    x0Var.c();
                }
                for (int i22 = i2; i22 < i7; i22++) {
                    a aVar7 = arrayList3.get(i22);
                    if (arrayList10.get(i22).booleanValue() && aVar7.f1198r >= 0) {
                        aVar7.f1198r = -1;
                    }
                    Objects.requireNonNull(aVar7);
                }
                return;
            }
        }
    }

    public final void F(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<n> arrayList3 = this.I;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            n nVar = this.I.get(i2);
            if (arrayList == null || nVar.f1254a || (indexOf2 = arrayList.indexOf(nVar.f1255b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf2).booleanValue()) {
                if ((nVar.f1256c == 0) || (arrayList != null && nVar.f1255b.j(arrayList, 0, arrayList.size()))) {
                    this.I.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || nVar.f1254a || (indexOf = arrayList.indexOf(nVar.f1255b)) == -1 || arrayList2 == null || !arrayList2.get(indexOf).booleanValue()) {
                        nVar.a();
                    }
                }
                i2++;
            } else {
                this.I.remove(i2);
                i2--;
                size--;
            }
            a aVar = nVar.f1255b;
            aVar.f1196p.g(aVar, nVar.f1254a, false, false);
            i2++;
        }
    }

    public n G(String str) {
        return this.f1217c.d(str);
    }

    public n H(int i2) {
        i0 i0Var = this.f1217c;
        int size = i0Var.f1322a.size();
        while (true) {
            size--;
            if (size >= 0) {
                n nVar = i0Var.f1322a.get(size);
                if (nVar != null && nVar.f1392w == i2) {
                    return nVar;
                }
            } else {
                for (h0 next : i0Var.f1323b.values()) {
                    if (next != null) {
                        n nVar2 = next.f1315c;
                        if (nVar2.f1392w == i2) {
                            return nVar2;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final ViewGroup I(n nVar) {
        ViewGroup viewGroup = nVar.E;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (nVar.f1393x > 0 && this.f1232r.h()) {
            View e2 = this.f1232r.e(nVar.f1393x);
            if (e2 instanceof ViewGroup) {
                return (ViewGroup) e2;
            }
        }
        return null;
    }

    public x J() {
        n nVar = this.f1233s;
        return nVar != null ? nVar.f1388s.J() : this.f1235u;
    }

    public y0 K() {
        n nVar = this.f1233s;
        return nVar != null ? nVar.f1388s.K() : this.f1236v;
    }

    public void L(n nVar) {
        if (M(2)) {
            Log.v("FragmentManager", "hide: " + nVar);
        }
        if (!nVar.f1395z) {
            nVar.f1395z = true;
            nVar.J = true ^ nVar.J;
            e0(nVar);
        }
    }

    public final boolean N(n nVar) {
        b0 b0Var = nVar.f1390u;
        Iterator it = ((ArrayList) b0Var.f1217c.g()).iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            n nVar2 = (n) it.next();
            if (nVar2 != null) {
                z2 = b0Var.N(nVar2);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        r1 = r3.f1388s;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean O(androidx.fragment.app.n r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r3.C
            if (r1 == 0) goto L_0x0015
            androidx.fragment.app.b0 r1 = r3.f1388s
            if (r1 == 0) goto L_0x0016
            androidx.fragment.app.n r3 = r3.f1391v
            boolean r3 = r1.O(r3)
            if (r3 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.O(androidx.fragment.app.n):boolean");
    }

    public boolean P(n nVar) {
        if (nVar == null) {
            return true;
        }
        b0 b0Var = nVar.f1388s;
        if (!nVar.equals(b0Var.f1234t) || !P(b0Var.f1233s)) {
            return false;
        }
        return true;
    }

    public boolean Q() {
        return this.B || this.C;
    }

    public void R(int i2, boolean z2) {
        y<?> yVar;
        if (this.f1231q == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        } else if (z2 || i2 != this.f1230p) {
            this.f1230p = i2;
            i0 i0Var = this.f1217c;
            Iterator<n> it = i0Var.f1322a.iterator();
            while (it.hasNext()) {
                h0 h0Var = i0Var.f1323b.get(it.next().f1375f);
                if (h0Var != null) {
                    h0Var.k();
                }
            }
            Iterator<h0> it2 = i0Var.f1323b.values().iterator();
            while (true) {
                boolean z3 = false;
                if (!it2.hasNext()) {
                    break;
                }
                h0 next = it2.next();
                if (next != null) {
                    next.k();
                    n nVar = next.f1315c;
                    if (nVar.f1382m && !nVar.B()) {
                        z3 = true;
                    }
                    if (z3) {
                        i0Var.k(next);
                    }
                }
            }
            g0();
            if (this.A && (yVar = this.f1231q) != null && this.f1230p == 7) {
                yVar.l();
                this.A = false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r1 != 5) goto L_0x01ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void S(androidx.fragment.app.n r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            androidx.fragment.app.i0 r1 = r0.f1217c
            java.lang.String r2 = r7.f1375f
            androidx.fragment.app.h0 r1 = r1.h(r2)
            r8 = 1
            if (r1 != 0) goto L_0x001a
            androidx.fragment.app.h0 r1 = new androidx.fragment.app.h0
            androidx.fragment.app.a0 r2 = r0.f1228n
            androidx.fragment.app.i0 r3 = r0.f1217c
            r1.<init>(r2, r3, r7)
            r1.f1317e = r8
        L_0x001a:
            r9 = r1
            boolean r1 = r7.f1383n
            r10 = 2
            if (r1 == 0) goto L_0x002f
            boolean r1 = r7.f1384o
            if (r1 == 0) goto L_0x002f
            int r1 = r7.f1371b
            if (r1 != r10) goto L_0x002f
            r1 = r18
            int r1 = java.lang.Math.max(r1, r10)
            goto L_0x0031
        L_0x002f:
            r1 = r18
        L_0x0031:
            int r2 = r9.d()
            int r11 = java.lang.Math.min(r1, r2)
            int r1 = r7.f1371b
            r12 = 3
            java.lang.String r13 = "FragmentManager"
            r2 = -1
            r3 = 5
            r4 = 4
            if (r1 > r11) goto L_0x0085
            if (r1 >= r11) goto L_0x0050
            java.util.Map<androidx.fragment.app.n, java.util.HashSet<c0.b>> r1 = r0.f1226l
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0050
            r16.d(r17)
        L_0x0050:
            int r1 = r7.f1371b
            if (r1 == r2) goto L_0x0060
            if (r1 == 0) goto L_0x0065
            if (r1 == r8) goto L_0x006a
            if (r1 == r10) goto L_0x0074
            if (r1 == r4) goto L_0x0079
            if (r1 == r3) goto L_0x007e
            goto L_0x01ba
        L_0x0060:
            if (r11 <= r2) goto L_0x0065
            r9.c()
        L_0x0065:
            if (r11 <= 0) goto L_0x006a
            r9.e()
        L_0x006a:
            if (r11 <= r2) goto L_0x006f
            r9.j()
        L_0x006f:
            if (r11 <= r8) goto L_0x0074
            r9.f()
        L_0x0074:
            if (r11 <= r10) goto L_0x0079
            r9.a()
        L_0x0079:
            if (r11 <= r4) goto L_0x007e
            r9.p()
        L_0x007e:
            if (r11 <= r3) goto L_0x01ba
            r9.n()
            goto L_0x01ba
        L_0x0085:
            if (r1 <= r11) goto L_0x01ba
            if (r1 == 0) goto L_0x01b3
            if (r1 == r8) goto L_0x01a3
            if (r1 == r10) goto L_0x00cf
            if (r1 == r4) goto L_0x00a0
            if (r1 == r3) goto L_0x009b
            r5 = 7
            if (r1 == r5) goto L_0x0096
            goto L_0x01ba
        L_0x0096:
            if (r11 >= r5) goto L_0x009b
            r9.l()
        L_0x009b:
            if (r11 >= r3) goto L_0x00a0
            r9.q()
        L_0x00a0:
            if (r11 >= r4) goto L_0x00cf
            boolean r1 = M(r12)
            if (r1 == 0) goto L_0x00bc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "movefrom ACTIVITY_CREATED: "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r13, r1)
        L_0x00bc:
            android.view.View r1 = r7.F
            if (r1 == 0) goto L_0x00cf
            androidx.fragment.app.y<?> r1 = r0.f1231q
            boolean r1 = r1.k(r7)
            if (r1 == 0) goto L_0x00cf
            android.util.SparseArray<android.os.Parcelable> r1 = r7.f1373d
            if (r1 != 0) goto L_0x00cf
            r9.o()
        L_0x00cf:
            if (r11 >= r10) goto L_0x01a3
            r1 = 0
            android.view.View r3 = r7.F
            if (r3 == 0) goto L_0x0198
            android.view.ViewGroup r4 = r7.E
            if (r4 == 0) goto L_0x0198
            r4.endViewTransition(r3)
            android.view.View r3 = r7.F
            r3.clearAnimation()
            boolean r3 = r17.D()
            if (r3 != 0) goto L_0x0198
            int r3 = r0.f1230p
            r4 = 0
            if (r3 <= r2) goto L_0x010c
            boolean r2 = r0.D
            if (r2 != 0) goto L_0x010c
            android.view.View r2 = r7.F
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x010c
            float r2 = r7.K
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x010c
            androidx.fragment.app.y<?> r1 = r0.f1231q
            android.content.Context r1 = r1.f1532c
            r2 = 0
            boolean r3 = r17.s()
            androidx.fragment.app.u$a r1 = androidx.fragment.app.u.a(r1, r7, r2, r3)
        L_0x010c:
            r7.K = r4
            android.view.ViewGroup r14 = r7.E
            android.view.View r15 = r7.F
            if (r1 == 0) goto L_0x0166
            androidx.fragment.app.q0$a r2 = r0.f1227m
            r14.startViewTransition(r15)
            c0.b r6 = new c0.b
            r6.<init>()
            androidx.fragment.app.r r3 = new androidx.fragment.app.r
            r3.<init>(r7)
            r6.b(r3)
            r5 = r2
            androidx.fragment.app.b0$d r5 = (androidx.fragment.app.b0.d) r5
            r5.b(r7, r6)
            android.view.animation.Animation r2 = r1.f1488a
            if (r2 == 0) goto L_0x014a
            androidx.fragment.app.u$b r2 = new androidx.fragment.app.u$b
            android.view.animation.Animation r1 = r1.f1488a
            r2.<init>(r1, r14, r15)
            android.view.View r1 = r7.F
            r7.W(r1)
            androidx.fragment.app.s r1 = new androidx.fragment.app.s
            r1.<init>(r14, r7, r5, r6)
            r2.setAnimationListener(r1)
            android.view.View r1 = r7.F
            r1.startAnimation(r2)
            goto L_0x0166
        L_0x014a:
            android.animation.Animator r4 = r1.f1489b
            r7.Y(r4)
            androidx.fragment.app.t r3 = new androidx.fragment.app.t
            r1 = r3
            r2 = r14
            r12 = r3
            r3 = r15
            r8 = r4
            r4 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r8.addListener(r12)
            android.view.View r1 = r7.F
            r8.setTarget(r1)
            r8.start()
        L_0x0166:
            r14.removeView(r15)
            boolean r1 = M(r10)
            if (r1 == 0) goto L_0x0193
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Removing view "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " for fragment "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " from container "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r13, r1)
        L_0x0193:
            android.view.ViewGroup r1 = r7.E
            if (r14 == r1) goto L_0x0198
            return
        L_0x0198:
            java.util.Map<androidx.fragment.app.n, java.util.HashSet<c0.b>> r1 = r0.f1226l
            java.lang.Object r1 = r1.get(r7)
            if (r1 != 0) goto L_0x01a3
            r9.h()
        L_0x01a3:
            r1 = 1
            if (r11 >= r1) goto L_0x01b3
            java.util.Map<androidx.fragment.app.n, java.util.HashSet<c0.b>> r2 = r0.f1226l
            java.lang.Object r2 = r2.get(r7)
            if (r2 == 0) goto L_0x01b0
            r8 = 1
            goto L_0x01b4
        L_0x01b0:
            r9.g()
        L_0x01b3:
            r8 = r11
        L_0x01b4:
            if (r8 >= 0) goto L_0x01b9
            r9.i()
        L_0x01b9:
            r11 = r8
        L_0x01ba:
            int r1 = r7.f1371b
            if (r1 == r11) goto L_0x01ed
            r1 = 3
            boolean r1 = M(r1)
            if (r1 == 0) goto L_0x01eb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "moveToState: Fragment state for "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = " not updated inline; expected state "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r2 = " found "
            r1.append(r2)
            int r2 = r7.f1371b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r13, r1)
        L_0x01eb:
            r7.f1371b = r11
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.S(androidx.fragment.app.n, int):void");
    }

    public void T() {
        if (this.f1231q != null) {
            this.B = false;
            this.C = false;
            this.J.f1288g = false;
            for (n next : this.f1217c.i()) {
                if (next != null) {
                    next.f1390u.T();
                }
            }
        }
    }

    public boolean U() {
        C(false);
        B(true);
        n nVar = this.f1234t;
        if (nVar != null && nVar.i().U()) {
            return true;
        }
        boolean V = V(this.F, this.G, (String) null, -1, 0);
        if (V) {
            this.f1216b = true;
            try {
                X(this.F, this.G);
            } finally {
                e();
            }
        }
        h0();
        x();
        this.f1217c.b();
        return V;
    }

    public boolean V(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        ArrayList<a> arrayList3 = this.f1218d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1218d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            int i4 = -1;
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.f1218d.get(size2);
                    if ((str != null && str.equals(aVar.f1333h)) || (i2 >= 0 && i2 == aVar.f1198r)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.f1218d.get(size2);
                        if ((str == null || !str.equals(aVar2.f1333h)) && (i2 < 0 || i2 != aVar2.f1198r)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            }
            if (i4 == this.f1218d.size() - 1) {
                return false;
            }
            for (int size3 = this.f1218d.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f1218d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void W(n nVar) {
        if (M(2)) {
            Log.v("FragmentManager", "remove: " + nVar + " nesting=" + nVar.f1387r);
        }
        boolean z2 = !nVar.B();
        if (!nVar.A || z2) {
            this.f1217c.l(nVar);
            if (N(nVar)) {
                this.A = true;
            }
            nVar.f1382m = true;
            e0(nVar);
        }
    }

    public final void X(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                F(arrayList, arrayList2);
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    if (!arrayList.get(i2).f1340o) {
                        if (i3 != i2) {
                            E(arrayList, arrayList2, i3, i2);
                        }
                        i3 = i2 + 1;
                        if (arrayList2.get(i2).booleanValue()) {
                            while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f1340o) {
                                i3++;
                            }
                        }
                        E(arrayList, arrayList2, i2, i3);
                        i2 = i3 - 1;
                    }
                    i2++;
                }
                if (i3 != size) {
                    E(arrayList, arrayList2, i3, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public void Y(Parcelable parcelable) {
        h0 h0Var;
        if (parcelable != null) {
            d0 d0Var = (d0) parcelable;
            if (d0Var.f1273b != null) {
                this.f1217c.f1323b.clear();
                Iterator<g0> it = d0Var.f1273b.iterator();
                while (it.hasNext()) {
                    g0 next = it.next();
                    if (next != null) {
                        n nVar = this.J.f1283b.get(next.f1297c);
                        if (nVar != null) {
                            if (M(2)) {
                                Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + nVar);
                            }
                            h0Var = new h0(this.f1228n, this.f1217c, nVar, next);
                        } else {
                            h0Var = new h0(this.f1228n, this.f1217c, this.f1231q.f1532c.getClassLoader(), J(), next);
                        }
                        n nVar2 = h0Var.f1315c;
                        nVar2.f1388s = this;
                        if (M(2)) {
                            StringBuilder a2 = androidx.activity.result.a.a("restoreSaveState: active (");
                            a2.append(nVar2.f1375f);
                            a2.append("): ");
                            a2.append(nVar2);
                            Log.v("FragmentManager", a2.toString());
                        }
                        h0Var.m(this.f1231q.f1532c.getClassLoader());
                        this.f1217c.j(h0Var);
                        h0Var.f1317e = this.f1230p;
                    }
                }
                e0 e0Var = this.J;
                Objects.requireNonNull(e0Var);
                Iterator it2 = new ArrayList(e0Var.f1283b.values()).iterator();
                while (it2.hasNext()) {
                    n nVar3 = (n) it2.next();
                    if (!this.f1217c.c(nVar3.f1375f)) {
                        if (M(2)) {
                            Log.v("FragmentManager", "Discarding retained Fragment " + nVar3 + " that was not found in the set of active Fragments " + d0Var.f1273b);
                        }
                        this.J.b(nVar3);
                        nVar3.f1388s = this;
                        h0 h0Var2 = new h0(this.f1228n, this.f1217c, nVar3);
                        h0Var2.f1317e = 1;
                        h0Var2.k();
                        nVar3.f1382m = true;
                        h0Var2.k();
                    }
                }
                i0 i0Var = this.f1217c;
                ArrayList<String> arrayList = d0Var.f1274c;
                i0Var.f1322a.clear();
                if (arrayList != null) {
                    for (String next2 : arrayList) {
                        n d2 = i0Var.d(next2);
                        if (d2 != null) {
                            if (M(2)) {
                                Log.v("FragmentManager", "restoreSaveState: added (" + next2 + "): " + d2);
                            }
                            i0Var.a(d2);
                        } else {
                            throw new IllegalStateException(z.d.a("No instantiated fragment for (", next2, ")"));
                        }
                    }
                }
                if (d0Var.f1275d != null) {
                    this.f1218d = new ArrayList<>(d0Var.f1275d.length);
                    int i2 = 0;
                    while (true) {
                        b[] bVarArr = d0Var.f1275d;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        b bVar = bVarArr[i2];
                        Objects.requireNonNull(bVar);
                        a aVar = new a(this);
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int[] iArr = bVar.f1201b;
                            if (i3 >= iArr.length) {
                                break;
                            }
                            j0.a aVar2 = new j0.a();
                            int i5 = i3 + 1;
                            aVar2.f1341a = iArr[i3];
                            if (M(2)) {
                                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i4 + " base fragment #" + bVar.f1201b[i5]);
                            }
                            String str = bVar.f1202c.get(i4);
                            aVar2.f1342b = str != null ? this.f1217c.d(str) : null;
                            aVar2.f1347g = g.c.values()[bVar.f1203d[i4]];
                            aVar2.f1348h = g.c.values()[bVar.f1204e[i4]];
                            int[] iArr2 = bVar.f1201b;
                            int i6 = i5 + 1;
                            int i7 = iArr2[i5];
                            aVar2.f1343c = i7;
                            int i8 = i6 + 1;
                            int i9 = iArr2[i6];
                            aVar2.f1344d = i9;
                            int i10 = i8 + 1;
                            int i11 = iArr2[i8];
                            aVar2.f1345e = i11;
                            int i12 = iArr2[i10];
                            aVar2.f1346f = i12;
                            aVar.f1327b = i7;
                            aVar.f1328c = i9;
                            aVar.f1329d = i11;
                            aVar.f1330e = i12;
                            aVar.b(aVar2);
                            i4++;
                            i3 = i10 + 1;
                        }
                        aVar.f1331f = bVar.f1205f;
                        aVar.f1333h = bVar.f1206g;
                        aVar.f1198r = bVar.f1207h;
                        aVar.f1332g = true;
                        aVar.f1334i = bVar.f1208i;
                        aVar.f1335j = bVar.f1209j;
                        aVar.f1336k = bVar.f1210k;
                        aVar.f1337l = bVar.f1211l;
                        aVar.f1338m = bVar.f1212m;
                        aVar.f1339n = bVar.f1213n;
                        aVar.f1340o = bVar.f1214o;
                        aVar.c(1);
                        if (M(2)) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + aVar.f1198r + "): " + aVar);
                            PrintWriter printWriter = new PrintWriter(new w0("FragmentManager"));
                            aVar.f("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f1218d.add(aVar);
                        i2++;
                    }
                } else {
                    this.f1218d = null;
                }
                this.f1223i.set(d0Var.f1276e);
                String str2 = d0Var.f1277f;
                if (str2 != null) {
                    n G2 = G(str2);
                    this.f1234t = G2;
                    t(G2);
                }
                ArrayList<String> arrayList2 = d0Var.f1278g;
                if (arrayList2 != null) {
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        Bundle bundle = d0Var.f1279h.get(i13);
                        bundle.setClassLoader(this.f1231q.f1532c.getClassLoader());
                        this.f1224j.put(arrayList2.get(i13), bundle);
                    }
                }
                this.f1240z = new ArrayDeque<>(d0Var.f1280i);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: androidx.fragment.app.b[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: android.os.Bundle} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable Z() {
        /*
            r11 = this;
            java.util.Set r0 = r11.f()
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x0021
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.x0 r1 = (androidx.fragment.app.x0) r1
            boolean r3 = r1.f1508e
            if (r3 == 0) goto L_0x000a
            r1.f1508e = r2
            r1.c()
            goto L_0x000a
        L_0x0021:
            r11.z()
            r0 = 1
            r11.C(r0)
            r11.B = r0
            androidx.fragment.app.e0 r1 = r11.J
            r1.f1288g = r0
            androidx.fragment.app.i0 r0 = r11.f1217c
            java.util.Objects.requireNonNull(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.HashMap<java.lang.String, androidx.fragment.app.h0> r3 = r0.f1323b
            int r3 = r3.size()
            r1.<init>(r3)
            java.util.HashMap<java.lang.String, androidx.fragment.app.h0> r0 = r0.f1323b
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0048:
            boolean r3 = r0.hasNext()
            r4 = 0
            r5 = 2
            if (r3 == 0) goto L_0x0139
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.h0 r3 = (androidx.fragment.app.h0) r3
            if (r3 == 0) goto L_0x0048
            androidx.fragment.app.n r6 = r3.f1315c
            androidx.fragment.app.g0 r7 = new androidx.fragment.app.g0
            r7.<init>((androidx.fragment.app.n) r6)
            androidx.fragment.app.n r8 = r3.f1315c
            int r9 = r8.f1371b
            r10 = -1
            if (r9 <= r10) goto L_0x010a
            android.os.Bundle r9 = r7.f1308n
            if (r9 != 0) goto L_0x010a
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            androidx.fragment.app.n r9 = r3.f1315c
            r9.M(r8)
            androidx.savedstate.b r10 = r9.Q
            r10.b(r8)
            androidx.fragment.app.b0 r9 = r9.f1390u
            android.os.Parcelable r9 = r9.Z()
            if (r9 == 0) goto L_0x0086
            java.lang.String r10 = "android:support:fragments"
            r8.putParcelable(r10, r9)
        L_0x0086:
            androidx.fragment.app.a0 r9 = r3.f1313a
            androidx.fragment.app.n r10 = r3.f1315c
            r9.j(r10, r8, r2)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r4 = r8
        L_0x0095:
            androidx.fragment.app.n r8 = r3.f1315c
            android.view.View r8 = r8.F
            if (r8 == 0) goto L_0x009e
            r3.o()
        L_0x009e:
            androidx.fragment.app.n r8 = r3.f1315c
            android.util.SparseArray<android.os.Parcelable> r8 = r8.f1373d
            if (r8 == 0) goto L_0x00b4
            if (r4 != 0) goto L_0x00ab
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x00ab:
            androidx.fragment.app.n r8 = r3.f1315c
            android.util.SparseArray<android.os.Parcelable> r8 = r8.f1373d
            java.lang.String r9 = "android:view_state"
            r4.putSparseParcelableArray(r9, r8)
        L_0x00b4:
            androidx.fragment.app.n r8 = r3.f1315c
            android.os.Bundle r8 = r8.f1374e
            if (r8 == 0) goto L_0x00ca
            if (r4 != 0) goto L_0x00c1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x00c1:
            androidx.fragment.app.n r8 = r3.f1315c
            android.os.Bundle r8 = r8.f1374e
            java.lang.String r9 = "android:view_registry_state"
            r4.putBundle(r9, r8)
        L_0x00ca:
            androidx.fragment.app.n r8 = r3.f1315c
            boolean r8 = r8.H
            if (r8 != 0) goto L_0x00e0
            if (r4 != 0) goto L_0x00d7
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x00d7:
            androidx.fragment.app.n r8 = r3.f1315c
            boolean r8 = r8.H
            java.lang.String r9 = "android:user_visible_hint"
            r4.putBoolean(r9, r8)
        L_0x00e0:
            r7.f1308n = r4
            androidx.fragment.app.n r8 = r3.f1315c
            java.lang.String r8 = r8.f1378i
            if (r8 == 0) goto L_0x010e
            if (r4 != 0) goto L_0x00f1
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            r7.f1308n = r4
        L_0x00f1:
            android.os.Bundle r4 = r7.f1308n
            androidx.fragment.app.n r8 = r3.f1315c
            java.lang.String r8 = r8.f1378i
            java.lang.String r9 = "android:target_state"
            r4.putString(r9, r8)
            androidx.fragment.app.n r3 = r3.f1315c
            int r3 = r3.f1379j
            if (r3 == 0) goto L_0x010e
            android.os.Bundle r4 = r7.f1308n
            java.lang.String r8 = "android:target_req_state"
            r4.putInt(r8, r3)
            goto L_0x010e
        L_0x010a:
            android.os.Bundle r3 = r8.f1372c
            r7.f1308n = r3
        L_0x010e:
            r1.add(r7)
            boolean r3 = M(r5)
            if (r3 == 0) goto L_0x0048
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Saved state of "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = ": "
            r3.append(r4)
            android.os.Bundle r4 = r7.f1308n
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
            goto L_0x0048
        L_0x0139:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x014d
            boolean r0 = M(r5)
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = "FragmentManager"
            java.lang.String r1 = "saveAllState: no fragments!"
            android.util.Log.v(r0, r1)
        L_0x014c:
            return r4
        L_0x014d:
            androidx.fragment.app.i0 r0 = r11.f1217c
            java.util.ArrayList<androidx.fragment.app.n> r3 = r0.f1322a
            monitor-enter(r3)
            java.util.ArrayList<androidx.fragment.app.n> r6 = r0.f1322a     // Catch:{ all -> 0x022c }
            boolean r6 = r6.isEmpty()     // Catch:{ all -> 0x022c }
            if (r6 == 0) goto L_0x015d
            monitor-exit(r3)     // Catch:{ all -> 0x022c }
            r6 = r4
            goto L_0x01a7
        L_0x015d:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x022c }
            java.util.ArrayList<androidx.fragment.app.n> r7 = r0.f1322a     // Catch:{ all -> 0x022c }
            int r7 = r7.size()     // Catch:{ all -> 0x022c }
            r6.<init>(r7)     // Catch:{ all -> 0x022c }
            java.util.ArrayList<androidx.fragment.app.n> r0 = r0.f1322a     // Catch:{ all -> 0x022c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x022c }
        L_0x016e:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x022c }
            if (r7 == 0) goto L_0x01a6
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x022c }
            androidx.fragment.app.n r7 = (androidx.fragment.app.n) r7     // Catch:{ all -> 0x022c }
            java.lang.String r8 = r7.f1375f     // Catch:{ all -> 0x022c }
            r6.add(r8)     // Catch:{ all -> 0x022c }
            boolean r8 = M(r5)     // Catch:{ all -> 0x022c }
            if (r8 == 0) goto L_0x016e
            java.lang.String r8 = "FragmentManager"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x022c }
            r9.<init>()     // Catch:{ all -> 0x022c }
            java.lang.String r10 = "saveAllState: adding fragment ("
            r9.append(r10)     // Catch:{ all -> 0x022c }
            java.lang.String r10 = r7.f1375f     // Catch:{ all -> 0x022c }
            r9.append(r10)     // Catch:{ all -> 0x022c }
            java.lang.String r10 = "): "
            r9.append(r10)     // Catch:{ all -> 0x022c }
            r9.append(r7)     // Catch:{ all -> 0x022c }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x022c }
            android.util.Log.v(r8, r7)     // Catch:{ all -> 0x022c }
            goto L_0x016e
        L_0x01a6:
            monitor-exit(r3)     // Catch:{ all -> 0x022c }
        L_0x01a7:
            java.util.ArrayList<androidx.fragment.app.a> r0 = r11.f1218d
            if (r0 == 0) goto L_0x01f1
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01f1
            androidx.fragment.app.b[] r4 = new androidx.fragment.app.b[r0]
        L_0x01b3:
            if (r2 >= r0) goto L_0x01f1
            androidx.fragment.app.b r3 = new androidx.fragment.app.b
            java.util.ArrayList<androidx.fragment.app.a> r7 = r11.f1218d
            java.lang.Object r7 = r7.get(r2)
            androidx.fragment.app.a r7 = (androidx.fragment.app.a) r7
            r3.<init>((androidx.fragment.app.a) r7)
            r4[r2] = r3
            boolean r3 = M(r5)
            if (r3 == 0) goto L_0x01ee
            java.lang.String r3 = "FragmentManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "saveAllState: adding back stack #"
            r7.append(r8)
            r7.append(r2)
            java.lang.String r8 = ": "
            r7.append(r8)
            java.util.ArrayList<androidx.fragment.app.a> r8 = r11.f1218d
            java.lang.Object r8 = r8.get(r2)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r3, r7)
        L_0x01ee:
            int r2 = r2 + 1
            goto L_0x01b3
        L_0x01f1:
            androidx.fragment.app.d0 r0 = new androidx.fragment.app.d0
            r0.<init>()
            r0.f1273b = r1
            r0.f1274c = r6
            r0.f1275d = r4
            java.util.concurrent.atomic.AtomicInteger r1 = r11.f1223i
            int r1 = r1.get()
            r0.f1276e = r1
            androidx.fragment.app.n r1 = r11.f1234t
            if (r1 == 0) goto L_0x020c
            java.lang.String r1 = r1.f1375f
            r0.f1277f = r1
        L_0x020c:
            java.util.ArrayList<java.lang.String> r1 = r0.f1278g
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r11.f1224j
            java.util.Set r2 = r2.keySet()
            r1.addAll(r2)
            java.util.ArrayList<android.os.Bundle> r1 = r0.f1279h
            java.util.Map<java.lang.String, android.os.Bundle> r2 = r11.f1224j
            java.util.Collection r2 = r2.values()
            r1.addAll(r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayDeque<androidx.fragment.app.b0$k> r2 = r11.f1240z
            r1.<init>(r2)
            r0.f1280i = r1
            return r0
        L_0x022c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x022c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.Z():android.os.Parcelable");
    }

    public h0 a(n nVar) {
        if (M(2)) {
            Log.v("FragmentManager", "add: " + nVar);
        }
        h0 h2 = h(nVar);
        nVar.f1388s = this;
        this.f1217c.j(h2);
        if (!nVar.A) {
            this.f1217c.a(nVar);
            nVar.f1382m = false;
            if (nVar.F == null) {
                nVar.J = false;
            }
            if (N(nVar)) {
                this.A = true;
            }
        }
        return h2;
    }

    public void a0() {
        synchronized (this.f1215a) {
            ArrayList<n> arrayList = this.I;
            boolean z2 = false;
            boolean z3 = arrayList != null && !arrayList.isEmpty();
            if (this.f1215a.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.f1231q.f1533d.removeCallbacks(this.K);
                this.f1231q.f1533d.post(this.K);
                h0();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: androidx.activity.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: androidx.fragment.app.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: androidx.fragment.app.n} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v37, resolved type: androidx.fragment.app.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"SyntheticAccessor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(androidx.fragment.app.y<?> r5, androidx.fragment.app.v r6, androidx.fragment.app.n r7) {
        /*
            r4 = this;
            androidx.fragment.app.y<?> r0 = r4.f1231q
            if (r0 != 0) goto L_0x013b
            r4.f1231q = r5
            r4.f1232r = r6
            r4.f1233s = r7
            if (r7 == 0) goto L_0x0012
            androidx.fragment.app.b0$h r6 = new androidx.fragment.app.b0$h
            r6.<init>(r4, r7)
            goto L_0x0019
        L_0x0012:
            boolean r6 = r5 instanceof androidx.fragment.app.f0
            if (r6 == 0) goto L_0x001e
            r6 = r5
            androidx.fragment.app.f0 r6 = (androidx.fragment.app.f0) r6
        L_0x0019:
            java.util.concurrent.CopyOnWriteArrayList<androidx.fragment.app.f0> r0 = r4.f1229o
            r0.add(r6)
        L_0x001e:
            androidx.fragment.app.n r6 = r4.f1233s
            if (r6 == 0) goto L_0x0025
            r4.h0()
        L_0x0025:
            boolean r6 = r5 instanceof androidx.activity.c
            if (r6 == 0) goto L_0x003a
            r6 = r5
            androidx.activity.c r6 = (androidx.activity.c) r6
            androidx.activity.OnBackPressedDispatcher r0 = r6.c()
            r4.f1221g = r0
            if (r7 == 0) goto L_0x0035
            r6 = r7
        L_0x0035:
            androidx.activity.b r1 = r4.f1222h
            r0.a(r6, r1)
        L_0x003a:
            if (r7 == 0) goto L_0x005d
            androidx.fragment.app.b0 r5 = r7.f1388s
            androidx.fragment.app.e0 r5 = r5.J
            java.util.HashMap<java.lang.String, androidx.fragment.app.e0> r6 = r5.f1284c
            java.lang.String r0 = r7.f1375f
            java.lang.Object r6 = r6.get(r0)
            androidx.fragment.app.e0 r6 = (androidx.fragment.app.e0) r6
            if (r6 != 0) goto L_0x005a
            androidx.fragment.app.e0 r6 = new androidx.fragment.app.e0
            boolean r0 = r5.f1286e
            r6.<init>(r0)
            java.util.HashMap<java.lang.String, androidx.fragment.app.e0> r5 = r5.f1284c
            java.lang.String r0 = r7.f1375f
            r5.put(r0, r6)
        L_0x005a:
            r4.J = r6
            goto L_0x00c0
        L_0x005d:
            boolean r6 = r5 instanceof androidx.lifecycle.z
            if (r6 == 0) goto L_0x00b8
            androidx.lifecycle.z r5 = (androidx.lifecycle.z) r5
            androidx.lifecycle.y r5 = r5.f()
            androidx.lifecycle.v r6 = androidx.fragment.app.e0.f1282h
            java.lang.Class<androidx.fragment.app.e0> r0 = androidx.fragment.app.e0.class
            java.lang.String r1 = r0.getCanonicalName()
            if (r1 == 0) goto L_0x00b0
            java.lang.String r2 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r1 = h.f.a(r2, r1)
            java.util.HashMap<java.lang.String, androidx.lifecycle.u> r2 = r5.f1606a
            java.lang.Object r2 = r2.get(r1)
            androidx.lifecycle.u r2 = (androidx.lifecycle.u) r2
            boolean r3 = r0.isInstance(r2)
            if (r3 == 0) goto L_0x008c
            boolean r5 = r6 instanceof androidx.lifecycle.x
            if (r5 == 0) goto L_0x00ab
            androidx.lifecycle.x r6 = (androidx.lifecycle.x) r6
            goto L_0x00ab
        L_0x008c:
            boolean r2 = r6 instanceof androidx.lifecycle.w
            if (r2 == 0) goto L_0x0097
            androidx.lifecycle.w r6 = (androidx.lifecycle.w) r6
            androidx.lifecycle.u r6 = r6.a(r1, r0)
            goto L_0x009d
        L_0x0097:
            androidx.fragment.app.e0$a r6 = (androidx.fragment.app.e0.a) r6
            androidx.lifecycle.u r6 = r6.a(r0)
        L_0x009d:
            r2 = r6
            java.util.HashMap<java.lang.String, androidx.lifecycle.u> r5 = r5.f1606a
            java.lang.Object r5 = r5.put(r1, r2)
            androidx.lifecycle.u r5 = (androidx.lifecycle.u) r5
            if (r5 == 0) goto L_0x00ab
            r5.a()
        L_0x00ab:
            androidx.fragment.app.e0 r2 = (androidx.fragment.app.e0) r2
            r4.J = r2
            goto L_0x00c0
        L_0x00b0:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Local and anonymous classes can not be ViewModels"
            r5.<init>(r6)
            throw r5
        L_0x00b8:
            androidx.fragment.app.e0 r5 = new androidx.fragment.app.e0
            r6 = 0
            r5.<init>(r6)
            r4.J = r5
        L_0x00c0:
            androidx.fragment.app.e0 r5 = r4.J
            boolean r6 = r4.Q()
            r5.f1288g = r6
            androidx.fragment.app.i0 r5 = r4.f1217c
            androidx.fragment.app.e0 r6 = r4.J
            r5.f1324c = r6
            androidx.fragment.app.y<?> r5 = r4.f1231q
            boolean r6 = r5 instanceof androidx.activity.result.f
            if (r6 == 0) goto L_0x013a
            androidx.activity.result.f r5 = (androidx.activity.result.f) r5
            androidx.activity.result.e r5 = r5.g()
            if (r7 == 0) goto L_0x00f0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r7.f1375f
            r6.append(r7)
            java.lang.String r7 = ":"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            goto L_0x00f2
        L_0x00f0:
            java.lang.String r6 = ""
        L_0x00f2:
            java.lang.String r7 = "FragmentManager:"
            java.lang.String r6 = h.f.a(r7, r6)
            java.lang.String r7 = "StartActivityForResult"
            java.lang.String r7 = h.f.a(r6, r7)
            b.c r0 = new b.c
            r0.<init>()
            androidx.fragment.app.b0$i r1 = new androidx.fragment.app.b0$i
            r1.<init>()
            androidx.activity.result.d r7 = r5.b(r7, r0, r1)
            r4.f1237w = r7
            java.lang.String r7 = "StartIntentSenderForResult"
            java.lang.String r7 = h.f.a(r6, r7)
            androidx.fragment.app.b0$j r0 = new androidx.fragment.app.b0$j
            r0.<init>()
            androidx.fragment.app.b0$a r1 = new androidx.fragment.app.b0$a
            r1.<init>()
            androidx.activity.result.d r7 = r5.b(r7, r0, r1)
            r4.f1238x = r7
            java.lang.String r7 = "RequestPermissions"
            java.lang.String r6 = h.f.a(r6, r7)
            b.b r7 = new b.b
            r7.<init>()
            androidx.fragment.app.b0$b r0 = new androidx.fragment.app.b0$b
            r0.<init>()
            androidx.activity.result.d r5 = r5.b(r6, r7, r0)
            r4.f1239y = r5
        L_0x013a:
            return
        L_0x013b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already attached"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.b(androidx.fragment.app.y, androidx.fragment.app.v, androidx.fragment.app.n):void");
    }

    public void b0(n nVar, boolean z2) {
        ViewGroup I2 = I(nVar);
        if (I2 != null && (I2 instanceof FragmentContainerView)) {
            ((FragmentContainerView) I2).setDrawDisappearingViewsLast(!z2);
        }
    }

    public void c(n nVar) {
        if (M(2)) {
            Log.v("FragmentManager", "attach: " + nVar);
        }
        if (nVar.A) {
            nVar.A = false;
            if (!nVar.f1381l) {
                this.f1217c.a(nVar);
                if (M(2)) {
                    Log.v("FragmentManager", "add from attach: " + nVar);
                }
                if (N(nVar)) {
                    this.A = true;
                }
            }
        }
    }

    public void c0(n nVar, g.c cVar) {
        if (!nVar.equals(G(nVar.f1375f)) || !(nVar.f1389t == null || nVar.f1388s == this)) {
            throw new IllegalArgumentException("Fragment " + nVar + " is not an active fragment of FragmentManager " + this);
        }
        nVar.M = cVar;
    }

    public final void d(n nVar) {
        HashSet hashSet = this.f1226l.get(nVar);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((c0.b) it.next()).a();
            }
            hashSet.clear();
            i(nVar);
            this.f1226l.remove(nVar);
        }
    }

    public void d0(n nVar) {
        if (nVar == null || (nVar.equals(G(nVar.f1375f)) && (nVar.f1389t == null || nVar.f1388s == this))) {
            n nVar2 = this.f1234t;
            this.f1234t = nVar;
            t(nVar2);
            t(this.f1234t);
            return;
        }
        throw new IllegalArgumentException("Fragment " + nVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void e() {
        this.f1216b = false;
        this.G.clear();
        this.F.clear();
    }

    public final void e0(n nVar) {
        ViewGroup I2 = I(nVar);
        if (I2 != null) {
            if (nVar.u() + nVar.t() + nVar.n() + nVar.k() > 0) {
                if (I2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    I2.setTag(R.id.visible_removing_fragment_view_tag, nVar);
                }
                ((n) I2.getTag(R.id.visible_removing_fragment_view_tag)).d0(nVar.s());
            }
        }
    }

    public final Set<x0> f() {
        HashSet hashSet = new HashSet();
        Iterator it = ((ArrayList) this.f1217c.f()).iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((h0) it.next()).f1315c.E;
            if (viewGroup != null) {
                hashSet.add(x0.g(viewGroup, K()));
            }
        }
        return hashSet;
    }

    public void f0(n nVar) {
        if (M(2)) {
            Log.v("FragmentManager", "show: " + nVar);
        }
        if (nVar.f1395z) {
            nVar.f1395z = false;
            nVar.J = !nVar.J;
        }
    }

    public void g(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.h(z4);
        } else {
            aVar.g();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3 && this.f1230p >= 1) {
            q0.p(this.f1231q.f1532c, this.f1232r, arrayList, arrayList2, 0, 1, true, this.f1227m);
        }
        if (z4) {
            R(this.f1230p, true);
        }
        Iterator it = ((ArrayList) this.f1217c.g()).iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar != null) {
                View view = nVar.F;
            }
        }
    }

    public final void g0() {
        Iterator it = ((ArrayList) this.f1217c.f()).iterator();
        while (it.hasNext()) {
            h0 h0Var = (h0) it.next();
            n nVar = h0Var.f1315c;
            if (nVar.G) {
                if (this.f1216b) {
                    this.E = true;
                } else {
                    nVar.G = false;
                    h0Var.k();
                }
            }
        }
    }

    public h0 h(n nVar) {
        h0 h2 = this.f1217c.h(nVar.f1375f);
        if (h2 != null) {
            return h2;
        }
        h0 h0Var = new h0(this.f1228n, this.f1217c, nVar);
        h0Var.m(this.f1231q.f1532c.getClassLoader());
        h0Var.f1317e = this.f1230p;
        return h0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r1 == null) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r1 = r1.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r1 <= 0) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (P(r4.f1233s) == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r0.f67a = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r0 = r4.f1222h;
        r1 = r4.f1218d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h0() {
        /*
            r4 = this;
            java.util.ArrayList<androidx.fragment.app.b0$l> r0 = r4.f1215a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.b0$l> r1 = r4.f1215a     // Catch:{ all -> 0x002f }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002f }
            r2 = 1
            if (r1 != 0) goto L_0x0012
            androidx.activity.b r1 = r4.f1222h     // Catch:{ all -> 0x002f }
            r1.f67a = r2     // Catch:{ all -> 0x002f }
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            androidx.activity.b r0 = r4.f1222h
            java.util.ArrayList<androidx.fragment.app.a> r1 = r4.f1218d
            r3 = 0
            if (r1 == 0) goto L_0x001f
            int r1 = r1.size()
            goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            if (r1 <= 0) goto L_0x002b
            androidx.fragment.app.n r1 = r4.f1233s
            boolean r1 = r4.P(r1)
            if (r1 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            r0.f67a = r2
            return
        L_0x002f:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.b0.h0():void");
    }

    public final void i(n nVar) {
        nVar.R();
        this.f1228n.n(nVar, false);
        nVar.E = null;
        nVar.F = null;
        nVar.O = null;
        nVar.P.h(null);
        nVar.f1384o = false;
    }

    public void j(n nVar) {
        if (M(2)) {
            Log.v("FragmentManager", "detach: " + nVar);
        }
        if (!nVar.A) {
            nVar.A = true;
            if (nVar.f1381l) {
                if (M(2)) {
                    Log.v("FragmentManager", "remove from detach: " + nVar);
                }
                this.f1217c.l(nVar);
                if (N(nVar)) {
                    this.A = true;
                }
                e0(nVar);
            }
        }
    }

    public void k(Configuration configuration) {
        for (n next : this.f1217c.i()) {
            if (next != null) {
                next.onConfigurationChanged(configuration);
                next.f1390u.k(configuration);
            }
        }
    }

    public boolean l(MenuItem menuItem) {
        if (this.f1230p < 1) {
            return false;
        }
        for (n next : this.f1217c.i()) {
            if (next != null) {
                if (!next.f1395z ? next.f1390u.l(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public void m() {
        this.B = false;
        this.C = false;
        this.J.f1288g = false;
        w(1);
    }

    public boolean n(Menu menu, MenuInflater menuInflater) {
        if (this.f1230p < 1) {
            return false;
        }
        ArrayList<n> arrayList = null;
        boolean z2 = false;
        for (n next : this.f1217c.i()) {
            if (next != null && O(next)) {
                if (!next.f1395z ? next.f1390u.n(menu, menuInflater) | false : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(next);
                    z2 = true;
                }
            }
        }
        if (this.f1219e != null) {
            for (int i2 = 0; i2 < this.f1219e.size(); i2++) {
                n nVar = this.f1219e.get(i2);
                if (arrayList == null || !arrayList.contains(nVar)) {
                    Objects.requireNonNull(nVar);
                }
            }
        }
        this.f1219e = arrayList;
        return z2;
    }

    public void o() {
        this.D = true;
        C(true);
        z();
        w(-1);
        this.f1231q = null;
        this.f1232r = null;
        this.f1233s = null;
        if (this.f1221g != null) {
            Iterator<androidx.activity.a> it = this.f1222h.f68b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.f1221g = null;
        }
        androidx.activity.result.d<Intent> dVar = this.f1237w;
        if (dVar != null) {
            dVar.e();
            this.f1238x.e();
            this.f1239y.e();
        }
    }

    public void p() {
        for (n next : this.f1217c.i()) {
            if (next != null) {
                next.S();
            }
        }
    }

    public void q(boolean z2) {
        for (n next : this.f1217c.i()) {
            if (next != null) {
                next.f1390u.q(z2);
            }
        }
    }

    public boolean r(MenuItem menuItem) {
        if (this.f1230p < 1) {
            return false;
        }
        for (n next : this.f1217c.i()) {
            if (next != null) {
                if (!next.f1395z ? next.f1390u.r(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public void s(Menu menu) {
        if (this.f1230p >= 1) {
            for (n next : this.f1217c.i()) {
                if (next != null && !next.f1395z) {
                    next.f1390u.s(menu);
                }
            }
        }
    }

    public final void t(n nVar) {
        if (nVar != null && nVar.equals(G(nVar.f1375f))) {
            boolean P = nVar.f1388s.P(nVar);
            Boolean bool = nVar.f1380k;
            if (bool == null || bool.booleanValue() != P) {
                nVar.f1380k = Boolean.valueOf(P);
                b0 b0Var = nVar.f1390u;
                b0Var.h0();
                b0Var.t(b0Var.f1234t);
            }
        }
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        n nVar = this.f1233s;
        if (nVar != null) {
            sb.append(nVar.getClass().getSimpleName());
            sb.append("{");
            obj = this.f1233s;
        } else {
            y<?> yVar = this.f1231q;
            if (yVar != null) {
                sb.append(yVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.f1231q;
            } else {
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            }
        }
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    public void u(boolean z2) {
        for (n next : this.f1217c.i()) {
            if (next != null) {
                next.f1390u.u(z2);
            }
        }
    }

    public boolean v(Menu menu) {
        boolean z2 = false;
        if (this.f1230p < 1) {
            return false;
        }
        for (n next : this.f1217c.i()) {
            if (next != null && O(next) && next.T(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: finally extract failed */
    public final void w(int i2) {
        try {
            this.f1216b = true;
            for (h0 next : this.f1217c.f1323b.values()) {
                if (next != null) {
                    next.f1317e = i2;
                }
            }
            R(i2, false);
            Iterator it = ((HashSet) f()).iterator();
            while (it.hasNext()) {
                ((x0) it.next()).e();
            }
            this.f1216b = false;
            C(true);
        } catch (Throwable th) {
            this.f1216b = false;
            throw th;
        }
    }

    public final void x() {
        if (this.E) {
            this.E = false;
            g0();
        }
    }

    public void y(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String a2 = h.f.a(str, "    ");
        i0 i0Var = this.f1217c;
        Objects.requireNonNull(i0Var);
        String str2 = str + "    ";
        if (!i0Var.f1323b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (h0 next : i0Var.f1323b.values()) {
                printWriter.print(str);
                if (next != null) {
                    n nVar = next.f1315c;
                    printWriter.println(nVar);
                    nVar.e(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size3 = i0Var.f1322a.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size3; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(i0Var.f1322a.get(i2).toString());
            }
        }
        ArrayList<n> arrayList = this.f1219e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i3 = 0; i3 < size2; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.f1219e.get(i3).toString());
            }
        }
        ArrayList<a> arrayList2 = this.f1218d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.f1218d.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.f(a2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1223i.get());
        synchronized (this.f1215a) {
            int size4 = this.f1215a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i5 = 0; i5 < size4; i5++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i5);
                    printWriter.print(": ");
                    printWriter.println(this.f1215a.get(i5));
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1231q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1232r);
        if (this.f1233s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1233s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1230p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.B);
        printWriter.print(" mStopped=");
        printWriter.print(this.C);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.D);
        if (this.A) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.A);
        }
    }

    public final void z() {
        Iterator it = ((HashSet) f()).iterator();
        while (it.hasNext()) {
            ((x0) it.next()).e();
        }
    }
}
