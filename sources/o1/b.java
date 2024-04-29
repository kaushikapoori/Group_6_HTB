package o1;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o1.i;

public class b<T extends i<T>> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Integer, T> f3518a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Set<Integer> f3519b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    public a f3520c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3521d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3522e;

    public interface a {
    }

    public final boolean a(i<T> iVar) {
        int id = iVar.getId();
        if (this.f3519b.contains(Integer.valueOf(id))) {
            return false;
        }
        i iVar2 = (i) this.f3518a.get(Integer.valueOf(c()));
        if (iVar2 != null) {
            e(iVar2, false);
        }
        boolean add = this.f3519b.add(Integer.valueOf(id));
        if (!iVar.isChecked()) {
            iVar.setChecked(true);
        }
        return add;
    }

    public List<Integer> b(ViewGroup viewGroup) {
        HashSet hashSet = new HashSet(this.f3519b);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof i) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int c() {
        if (!this.f3521d || this.f3519b.isEmpty()) {
            return -1;
        }
        return this.f3519b.iterator().next().intValue();
    }

    public final void d() {
        a aVar = this.f3520c;
        if (aVar != null) {
            new HashSet(this.f3519b);
            ChipGroup chipGroup = ((com.google.android.material.chip.b) aVar).f2299a;
            ChipGroup.d dVar = chipGroup.f2265h;
            if (dVar != null) {
                chipGroup.f2266i.b(chipGroup);
                ChipGroup.a aVar2 = (ChipGroup.a) dVar;
                ChipGroup chipGroup2 = ChipGroup.this;
                if (chipGroup2.f2266i.f3521d) {
                    aVar2.f2269a.a(chipGroup, chipGroup2.getCheckedChipId());
                }
            }
        }
    }

    public final boolean e(i<T> iVar, boolean z2) {
        int id = iVar.getId();
        if (!this.f3519b.contains(Integer.valueOf(id))) {
            return false;
        }
        if (!z2 || this.f3519b.size() != 1 || !this.f3519b.contains(Integer.valueOf(id))) {
            boolean remove = this.f3519b.remove(Integer.valueOf(id));
            if (iVar.isChecked()) {
                iVar.setChecked(false);
            }
            return remove;
        }
        iVar.setChecked(true);
        return false;
    }
}
