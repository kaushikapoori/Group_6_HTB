package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.j;
import java.util.ArrayList;

public class d extends BaseAdapter {

    /* renamed from: b  reason: collision with root package name */
    public e f209b;

    /* renamed from: c  reason: collision with root package name */
    public int f210c = -1;

    /* renamed from: d  reason: collision with root package name */
    public boolean f211d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f212e;

    /* renamed from: f  reason: collision with root package name */
    public final LayoutInflater f213f;

    /* renamed from: g  reason: collision with root package name */
    public final int f214g;

    public d(e eVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f212e = z2;
        this.f213f = layoutInflater;
        this.f209b = eVar;
        this.f214g = i2;
        a();
    }

    public void a() {
        e eVar = this.f209b;
        g gVar = eVar.f237v;
        if (gVar != null) {
            eVar.i();
            ArrayList<g> arrayList = eVar.f225j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayList.get(i2) == gVar) {
                    this.f210c = i2;
                    return;
                }
            }
        }
        this.f210c = -1;
    }

    /* renamed from: b */
    public g getItem(int i2) {
        ArrayList<g> arrayList;
        if (this.f212e) {
            e eVar = this.f209b;
            eVar.i();
            arrayList = eVar.f225j;
        } else {
            arrayList = this.f209b.l();
        }
        int i3 = this.f210c;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return arrayList.get(i2);
    }

    public int getCount() {
        ArrayList<g> arrayList;
        if (this.f212e) {
            e eVar = this.f209b;
            eVar.i();
            arrayList = eVar.f225j;
        } else {
            arrayList = this.f209b.l();
        }
        int i2 = this.f210c;
        int size = arrayList.size();
        return i2 < 0 ? size : size - 1;
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f213f.inflate(this.f214g, viewGroup, false);
        }
        int i3 = getItem(i2).f244b;
        int i4 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f209b.m() && i3 != (i4 >= 0 ? getItem(i4).f244b : i3));
        j.a aVar = (j.a) view;
        if (this.f211d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i2), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
