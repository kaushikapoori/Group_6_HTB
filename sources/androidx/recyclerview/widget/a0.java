package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;

public abstract class a0 extends RecyclerView.i {

    /* renamed from: g  reason: collision with root package name */
    public boolean f1857g = true;

    public boolean a(RecyclerView.z zVar, RecyclerView.z zVar2, RecyclerView.i.c cVar, RecyclerView.i.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.f1707a;
        int i5 = cVar.f1708b;
        if (zVar2.t()) {
            int i6 = cVar.f1707a;
            i2 = cVar.f1708b;
            i3 = i6;
        } else {
            i3 = cVar2.f1707a;
            i2 = cVar2.f1708b;
        }
        l lVar = (l) this;
        if (zVar == zVar2) {
            return lVar.i(zVar, i4, i5, i3, i2);
        }
        float translationX = zVar.f1788a.getTranslationX();
        float translationY = zVar.f1788a.getTranslationY();
        float alpha = zVar.f1788a.getAlpha();
        lVar.n(zVar);
        zVar.f1788a.setTranslationX(translationX);
        zVar.f1788a.setTranslationY(translationY);
        zVar.f1788a.setAlpha(alpha);
        lVar.n(zVar2);
        zVar2.f1788a.setTranslationX((float) (-((int) (((float) (i3 - i4)) - translationX))));
        zVar2.f1788a.setTranslationY((float) (-((int) (((float) (i2 - i5)) - translationY))));
        zVar2.f1788a.setAlpha(0.0f);
        lVar.f1912k.add(new l.a(zVar, zVar2, i4, i5, i3, i2));
        return true;
    }

    public abstract boolean i(RecyclerView.z zVar, int i2, int i3, int i4, int i5);
}
