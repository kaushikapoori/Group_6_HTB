package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.b0;
import androidx.fragment.app.j0;
import androidx.fragment.app.n;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public final class a extends j0 implements b0.l {

    /* renamed from: p  reason: collision with root package name */
    public final b0 f1196p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1197q;

    /* renamed from: r  reason: collision with root package name */
    public int f1198r;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(androidx.fragment.app.b0 r3) {
        /*
            r2 = this;
            androidx.fragment.app.x r0 = r3.J()
            androidx.fragment.app.y<?> r1 = r3.f1231q
            if (r1 == 0) goto L_0x000f
            android.content.Context r1 = r1.f1532c
            java.lang.ClassLoader r1 = r1.getClassLoader()
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r2.<init>(r0, r1)
            r0 = -1
            r2.f1198r = r0
            r2.f1196p = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.<init>(androidx.fragment.app.b0):void");
    }

    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (b0.M(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1332g) {
            return true;
        }
        b0 b0Var = this.f1196p;
        if (b0Var.f1218d == null) {
            b0Var.f1218d = new ArrayList<>();
        }
        b0Var.f1218d.add(this);
        return true;
    }

    public void c(int i2) {
        if (this.f1332g) {
            if (b0.M(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            int size = this.f1326a.size();
            for (int i3 = 0; i3 < size; i3++) {
                j0.a aVar = this.f1326a.get(i3);
                n nVar = aVar.f1342b;
                if (nVar != null) {
                    nVar.f1387r += i2;
                    if (b0.M(2)) {
                        StringBuilder a2 = androidx.activity.result.a.a("Bump nesting of ");
                        a2.append(aVar.f1342b);
                        a2.append(" to ");
                        a2.append(aVar.f1342b.f1387r);
                        Log.v("FragmentManager", a2.toString());
                    }
                }
            }
        }
    }

    public int d(boolean z2) {
        if (!this.f1197q) {
            if (b0.M(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new w0("FragmentManager"));
                f("  ", printWriter, true);
                printWriter.close();
            }
            this.f1197q = true;
            this.f1198r = this.f1332g ? this.f1196p.f1223i.getAndIncrement() : -1;
            this.f1196p.A(this, z2);
            return this.f1198r;
        }
        throw new IllegalStateException("commit already called");
    }

    public void e(int i2, n nVar, String str, int i3) {
        Class<?> cls = nVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder a2 = androidx.activity.result.a.a("Fragment ");
            a2.append(cls.getCanonicalName());
            a2.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(a2.toString());
        }
        if (str != null) {
            String str2 = nVar.f1394y;
            if (str2 == null || str.equals(str2)) {
                nVar.f1394y = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + nVar + ": was " + nVar.f1394y + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = nVar.f1392w;
                if (i4 == 0 || i4 == i2) {
                    nVar.f1392w = i2;
                    nVar.f1393x = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + nVar + ": was " + nVar.f1392w + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + nVar + " with tag " + str + " to container view with no id");
            }
        }
        b(new j0.a(i3, nVar));
        nVar.f1388s = this.f1196p;
    }

    public void f(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1333h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1198r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1197q);
            if (this.f1331f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1331f));
            }
            if (!(this.f1327b == 0 && this.f1328c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1327b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1328c));
            }
            if (!(this.f1329d == 0 && this.f1330e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1329d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1330e));
            }
            if (!(this.f1334i == 0 && this.f1335j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1334i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1335j);
            }
            if (!(this.f1336k == 0 && this.f1337l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1336k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1337l);
            }
        }
        if (!this.f1326a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f1326a.size();
            for (int i2 = 0; i2 < size; i2++) {
                j0.a aVar = this.f1326a.get(i2);
                switch (aVar.f1341a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder a2 = androidx.activity.result.a.a("cmd=");
                        a2.append(aVar.f1341a);
                        str2 = a2.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f1342b);
                if (z2) {
                    if (!(aVar.f1343c == 0 && aVar.f1344d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1343c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1344d));
                    }
                    if (aVar.f1345e != 0 || aVar.f1346f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f1345e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f1346f));
                    }
                }
            }
        }
    }

    public void g() {
        b0 b0Var;
        int size = this.f1326a.size();
        for (int i2 = 0; i2 < size; i2++) {
            j0.a aVar = this.f1326a.get(i2);
            n nVar = aVar.f1342b;
            if (nVar != null) {
                nVar.d0(false);
                int i3 = this.f1331f;
                if (!(nVar.I == null && i3 == 0)) {
                    nVar.g();
                    nVar.I.f1404h = i3;
                }
                ArrayList<String> arrayList = this.f1338m;
                ArrayList<String> arrayList2 = this.f1339n;
                nVar.g();
                n.b bVar = nVar.I;
                bVar.f1405i = arrayList;
                bVar.f1406j = arrayList2;
            }
            switch (aVar.f1341a) {
                case 1:
                    nVar.X(aVar.f1343c, aVar.f1344d, aVar.f1345e, aVar.f1346f);
                    this.f1196p.b0(nVar, false);
                    this.f1196p.a(nVar);
                    continue;
                case 3:
                    nVar.X(aVar.f1343c, aVar.f1344d, aVar.f1345e, aVar.f1346f);
                    this.f1196p.W(nVar);
                    continue;
                case 4:
                    nVar.X(aVar.f1343c, aVar.f1344d, aVar.f1345e, aVar.f1346f);
                    this.f1196p.L(nVar);
                    continue;
                case 5:
                    nVar.X(aVar.f1343c, aVar.f1344d, aVar.f1345e, aVar.f1346f);
                    this.f1196p.b0(nVar, false);
                    this.f1196p.f0(nVar);
                    continue;
                case 6:
                    nVar.X(aVar.f1343c, aVar.f1344d, aVar.f1345e, aVar.f1346f);
                    this.f1196p.j(nVar);
                    continue;
                case 7:
                    nVar.X(aVar.f1343c, aVar.f1344d, aVar.f1345e, aVar.f1346f);
                    this.f1196p.b0(nVar, false);
                    this.f1196p.c(nVar);
                    continue;
                case 8:
                    b0Var = this.f1196p;
                    break;
                case 9:
                    b0Var = this.f1196p;
                    nVar = null;
                    break;
                case 10:
                    this.f1196p.c0(nVar, aVar.f1348h);
                    continue;
                default:
                    StringBuilder a2 = androidx.activity.result.a.a("Unknown cmd: ");
                    a2.append(aVar.f1341a);
                    throw new IllegalArgumentException(a2.toString());
            }
            b0Var.d0(nVar);
        }
    }

    public void h(boolean z2) {
        b0 b0Var;
        for (int size = this.f1326a.size() - 1; size >= 0; size--) {
            j0.a aVar = this.f1326a.get(size);
            n nVar = aVar.f1342b;
            if (nVar != null) {
                nVar.d0(true);
                int i2 = this.f1331f;
                int i3 = 8194;
                if (i2 != 4097) {
                    i3 = i2 != 4099 ? i2 != 8194 ? 0 : 4097 : 4099;
                }
                if (!(nVar.I == null && i3 == 0)) {
                    nVar.g();
                    nVar.I.f1404h = i3;
                }
                ArrayList<String> arrayList = this.f1339n;
                ArrayList<String> arrayList2 = this.f1338m;
                nVar.g();
                n.b bVar = nVar.I;
                bVar.f1405i = arrayList;
                bVar.f1406j = arrayList2;
            }
            switch (aVar.f1341a) {
                case 1:
                    nVar.X(aVar.f1343c, aVar.f1344d, aVar.f1345e, aVar.f1346f);
                    this.f1196p.b0(nVar, true);
                    this.f1196p.W(nVar);
                    continue;
                case 3:
                    nVar.X(aVar.f1343c, aVar.f1344d, aVar.f1345e, aVar.f1346f);
                    this.f1196p.a(nVar);
                    continue;
                case 4:
                    nVar.X(aVar.f1343c, aVar.f1344d, aVar.f1345e, aVar.f1346f);
                    this.f1196p.f0(nVar);
                    continue;
                case 5:
                    nVar.X(aVar.f1343c, aVar.f1344d, aVar.f1345e, aVar.f1346f);
                    this.f1196p.b0(nVar, true);
                    this.f1196p.L(nVar);
                    continue;
                case 6:
                    nVar.X(aVar.f1343c, aVar.f1344d, aVar.f1345e, aVar.f1346f);
                    this.f1196p.c(nVar);
                    continue;
                case 7:
                    nVar.X(aVar.f1343c, aVar.f1344d, aVar.f1345e, aVar.f1346f);
                    this.f1196p.b0(nVar, true);
                    this.f1196p.j(nVar);
                    continue;
                case 8:
                    b0Var = this.f1196p;
                    nVar = null;
                    break;
                case 9:
                    b0Var = this.f1196p;
                    break;
                case 10:
                    this.f1196p.c0(nVar, aVar.f1347g);
                    continue;
                default:
                    StringBuilder a2 = androidx.activity.result.a.a("Unknown cmd: ");
                    a2.append(aVar.f1341a);
                    throw new IllegalArgumentException(a2.toString());
            }
            b0Var.d0(nVar);
        }
    }

    public boolean i(int i2) {
        int size = this.f1326a.size();
        for (int i3 = 0; i3 < size; i3++) {
            n nVar = this.f1326a.get(i3).f1342b;
            int i4 = nVar != null ? nVar.f1393x : 0;
            if (i4 != 0 && i4 == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean j(ArrayList<a> arrayList, int i2, int i3) {
        if (i3 == i2) {
            return false;
        }
        int size = this.f1326a.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            n nVar = this.f1326a.get(i5).f1342b;
            int i6 = nVar != null ? nVar.f1393x : 0;
            if (!(i6 == 0 || i6 == i4)) {
                for (int i7 = i2; i7 < i3; i7++) {
                    a aVar = arrayList.get(i7);
                    int size2 = aVar.f1326a.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        n nVar2 = aVar.f1326a.get(i8).f1342b;
                        if ((nVar2 != null ? nVar2.f1393x : 0) == i6) {
                            return true;
                        }
                    }
                }
                i4 = i6;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1198r >= 0) {
            sb.append(" #");
            sb.append(this.f1198r);
        }
        if (this.f1333h != null) {
            sb.append(" ");
            sb.append(this.f1333h);
        }
        sb.append("}");
        return sb.toString();
    }
}
