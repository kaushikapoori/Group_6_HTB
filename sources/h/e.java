package h;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import b0.b;
import h.a;
import i.c;
import java.util.ArrayList;
import m.h;

public class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3104a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3105b;

    public static class a implements a.C0033a {

        /* renamed from: a  reason: collision with root package name */
        public final ActionMode.Callback f3106a;

        /* renamed from: b  reason: collision with root package name */
        public final Context f3107b;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<e> f3108c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final h<Menu, Menu> f3109d = new h<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f3107b = context;
            this.f3106a = callback;
        }

        public boolean a(a aVar, Menu menu) {
            return this.f3106a.onPrepareActionMode(e(aVar), f(menu));
        }

        public boolean b(a aVar, MenuItem menuItem) {
            return this.f3106a.onActionItemClicked(e(aVar), new c(this.f3107b, (b) menuItem));
        }

        public void c(a aVar) {
            this.f3106a.onDestroyActionMode(e(aVar));
        }

        public boolean d(a aVar, Menu menu) {
            return this.f3106a.onCreateActionMode(e(aVar), f(menu));
        }

        public ActionMode e(a aVar) {
            int size = this.f3108c.size();
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = this.f3108c.get(i2);
                if (eVar != null && eVar.f3105b == aVar) {
                    return eVar;
                }
            }
            e eVar2 = new e(this.f3107b, aVar);
            this.f3108c.add(eVar2);
            return eVar2;
        }

        public final Menu f(Menu menu) {
            Menu orDefault = this.f3109d.getOrDefault(menu, null);
            if (orDefault != null) {
                return orDefault;
            }
            i.e eVar = new i.e(this.f3107b, (b0.a) menu);
            this.f3109d.put(menu, eVar);
            return eVar;
        }
    }

    public e(Context context, a aVar) {
        this.f3104a = context;
        this.f3105b = aVar;
    }

    public void finish() {
        this.f3105b.c();
    }

    public View getCustomView() {
        return this.f3105b.d();
    }

    public Menu getMenu() {
        return new i.e(this.f3104a, (b0.a) this.f3105b.e());
    }

    public MenuInflater getMenuInflater() {
        return this.f3105b.f();
    }

    public CharSequence getSubtitle() {
        return this.f3105b.g();
    }

    public Object getTag() {
        return this.f3105b.f3091b;
    }

    public CharSequence getTitle() {
        return this.f3105b.h();
    }

    public boolean getTitleOptionalHint() {
        return this.f3105b.f3092c;
    }

    public void invalidate() {
        this.f3105b.i();
    }

    public boolean isTitleOptional() {
        return this.f3105b.j();
    }

    public void setCustomView(View view) {
        this.f3105b.k(view);
    }

    public void setSubtitle(int i2) {
        this.f3105b.l(i2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f3105b.m(charSequence);
    }

    public void setTag(Object obj) {
        this.f3105b.f3091b = obj;
    }

    public void setTitle(int i2) {
        this.f3105b.n(i2);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3105b.o(charSequence);
    }

    public void setTitleOptionalHint(boolean z2) {
        this.f3105b.p(z2);
    }
}
