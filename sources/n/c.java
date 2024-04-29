package n;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import m.a;
import m.e;
import m.h;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public e f3438a;

    /* renamed from: b  reason: collision with root package name */
    public e f3439b;

    /* renamed from: c  reason: collision with root package name */
    public e f3440c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3441d;

    /* JADX WARNING: type inference failed for: r3v2, types: [n.e, m.h] */
    /* JADX WARNING: type inference failed for: r3v3, types: [n.e, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v5, types: [m.a, n.e] */
    /* JADX WARNING: type inference failed for: r3v6, types: [android.util.SparseArray, n.e] */
    /* JADX WARNING: type inference failed for: r3v7, types: [n.e, m.e] */
    public c(int i2) {
        if (i2 == 1) {
            this.f3438a = new e(10, 1);
            this.f3439b = new h();
            this.f3440c = new ArrayList();
            this.f3441d = new HashSet();
        } else if (i2 != 2) {
            this.f3438a = new e(256, 0);
            this.f3439b = new e(256, 0);
            this.f3440c = new e(256, 0);
            this.f3441d = new h[32];
        } else {
            this.f3438a = new a();
            this.f3439b = new SparseArray();
            this.f3440c = new e();
            this.f3441d = new a();
        }
    }

    public void a(T t2) {
        if (!(((h) this.f3439b).e(t2) >= 0)) {
            ((h) this.f3439b).put(t2, null);
        }
    }

    public void b(T t2, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t2)) {
            if (!hashSet.contains(t2)) {
                hashSet.add(t2);
                ArrayList arrayList2 = (ArrayList) ((h) this.f3439b).getOrDefault(t2, null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        b(arrayList2.get(i2), arrayList, hashSet);
                    }
                }
                hashSet.remove(t2);
                arrayList.add(t2);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public ArrayList<T> c() {
        ArrayList<T> arrayList = (ArrayList) this.f3438a.a();
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    public void d(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3438a.c(arrayList);
    }
}
