package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public Random f71a = new Random();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Integer, String> f72b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Integer> f73c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, c> f74d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<String> f75e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public final transient Map<String, b<?>> f76f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, Object> f77g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public final Bundle f78h = new Bundle();

    public class a extends d<I> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f79a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, int i2, b.a aVar) {
            super(0);
            this.f79a = str;
        }

        public void e() {
            e.this.c(this.f79a);
        }
    }

    public static class b<O> {

        /* renamed from: a  reason: collision with root package name */
        public final c<O> f81a;

        /* renamed from: b  reason: collision with root package name */
        public final b.a<?, O> f82b;

        public b(c<O> cVar, b.a<?, O> aVar) {
            this.f81a = cVar;
            this.f82b = aVar;
        }
    }

    public static class c {
    }

    public final boolean a(int i2, int i3, Intent intent) {
        c<O> cVar;
        String str = this.f72b.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f75e.remove(str);
        b bVar = this.f76f.get(str);
        if (bVar == null || (cVar = bVar.f81a) == null) {
            this.f77g.remove(str);
            this.f78h.putParcelable(str, new b(i3, intent));
            return true;
        }
        cVar.a(bVar.f82b.a(i3, intent));
        return true;
    }

    public final <I, O> d<I> b(String str, b.a<I, O> aVar, c<O> cVar) {
        int i2;
        Integer num = this.f73c.get(str);
        if (num != null) {
            i2 = num.intValue();
        } else {
            int nextInt = this.f71a.nextInt(2147418112);
            while (true) {
                i2 = nextInt + 65536;
                if (!this.f72b.containsKey(Integer.valueOf(i2))) {
                    break;
                }
                nextInt = this.f71a.nextInt(2147418112);
            }
            this.f72b.put(Integer.valueOf(i2), str);
            this.f73c.put(str, Integer.valueOf(i2));
        }
        this.f76f.put(str, new b(cVar, aVar));
        if (this.f77g.containsKey(str)) {
            Object obj = this.f77g.get(str);
            this.f77g.remove(str);
            cVar.a(obj);
        }
        b bVar = (b) this.f78h.getParcelable(str);
        if (bVar != null) {
            this.f78h.remove(str);
            cVar.a(aVar.a(bVar.f69b, bVar.f70c));
        }
        return new a(str, i2, aVar);
    }

    public final void c(String str) {
        Integer remove;
        if (!this.f75e.contains(str) && (remove = this.f73c.remove(str)) != null) {
            this.f72b.remove(remove);
        }
        this.f76f.remove(str);
        if (this.f77g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f77g.get(str));
            this.f77g.remove(str);
        }
        if (this.f78h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f78h.getParcelable(str));
            this.f78h.remove(str);
        }
        if (this.f74d.get(str) != null) {
            throw null;
        }
    }
}
