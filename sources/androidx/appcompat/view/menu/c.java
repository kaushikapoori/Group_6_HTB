package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import com.example.supermarket.R;
import java.util.ArrayList;
import java.util.Objects;

public class c implements i, AdapterView.OnItemClickListener {

    /* renamed from: b  reason: collision with root package name */
    public Context f201b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f202c;

    /* renamed from: d  reason: collision with root package name */
    public e f203d;

    /* renamed from: e  reason: collision with root package name */
    public ExpandedMenuView f204e;

    /* renamed from: f  reason: collision with root package name */
    public i.a f205f;

    /* renamed from: g  reason: collision with root package name */
    public a f206g;

    public class a extends BaseAdapter {

        /* renamed from: b  reason: collision with root package name */
        public int f207b = -1;

        public a() {
            a();
        }

        public void a() {
            e eVar = c.this.f203d;
            g gVar = eVar.f237v;
            if (gVar != null) {
                eVar.i();
                ArrayList<g> arrayList = eVar.f225j;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (arrayList.get(i2) == gVar) {
                        this.f207b = i2;
                        return;
                    }
                }
            }
            this.f207b = -1;
        }

        /* renamed from: b */
        public g getItem(int i2) {
            e eVar = c.this.f203d;
            eVar.i();
            ArrayList<g> arrayList = eVar.f225j;
            Objects.requireNonNull(c.this);
            int i3 = i2 + 0;
            int i4 = this.f207b;
            if (i4 >= 0 && i3 >= i4) {
                i3++;
            }
            return arrayList.get(i3);
        }

        public int getCount() {
            e eVar = c.this.f203d;
            eVar.i();
            int size = eVar.f225j.size();
            Objects.requireNonNull(c.this);
            int i2 = size + 0;
            return this.f207b < 0 ? i2 : i2 - 1;
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = c.this.f202c.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((j.a) view).d(getItem(i2), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public c(Context context, int i2) {
        this.f201b = context;
        this.f202c = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f206g == null) {
            this.f206g = new a();
        }
        return this.f206g;
    }

    public void b(e eVar, boolean z2) {
        i.a aVar = this.f205f;
        if (aVar != null) {
            aVar.b(eVar, z2);
        }
    }

    public boolean c(e eVar, g gVar) {
        return false;
    }

    public void d(i.a aVar) {
        this.f205f = aVar;
    }

    public boolean f(l lVar) {
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        f fVar = new f(lVar);
        b.a aVar = new b.a(lVar.f216a);
        c cVar = new c(aVar.f126a.f112a, R.layout.abc_list_menu_item_layout);
        fVar.f242d = cVar;
        cVar.f205f = fVar;
        e eVar = fVar.f240b;
        eVar.b(cVar, eVar.f216a);
        ListAdapter a2 = fVar.f242d.a();
        AlertController.b bVar = aVar.f126a;
        bVar.f118g = a2;
        bVar.f119h = fVar;
        View view = lVar.f230o;
        if (view != null) {
            bVar.f116e = view;
        } else {
            bVar.f114c = lVar.f229n;
            bVar.f115d = lVar.f228m;
        }
        bVar.f117f = fVar;
        b a3 = aVar.a();
        fVar.f241c = a3;
        a3.setOnDismissListener(fVar);
        WindowManager.LayoutParams attributes = fVar.f241c.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        fVar.f241c.show();
        i.a aVar2 = this.f205f;
        if (aVar2 == null) {
            return true;
        }
        aVar2.c(lVar);
        return true;
    }

    public boolean g() {
        return false;
    }

    public void h(boolean z2) {
        a aVar = this.f206g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void j(Context context, e eVar) {
        if (this.f201b != null) {
            this.f201b = context;
            if (this.f202c == null) {
                this.f202c = LayoutInflater.from(context);
            }
        }
        this.f203d = eVar;
        a aVar = this.f206g;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean k(e eVar, g gVar) {
        return false;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        this.f203d.r(this.f206g.getItem(i2), this, 0);
    }
}
