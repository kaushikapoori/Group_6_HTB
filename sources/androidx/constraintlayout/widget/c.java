package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.util.Objects;
import s.e;

public class c extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public b f1019b;

    public static class a extends ConstraintLayout.a {
        public float A0;
        public float B0;
        public float C0;
        public float D0;

        /* renamed from: r0  reason: collision with root package name */
        public float f1020r0;

        /* renamed from: s0  reason: collision with root package name */
        public boolean f1021s0;

        /* renamed from: t0  reason: collision with root package name */
        public float f1022t0;

        /* renamed from: u0  reason: collision with root package name */
        public float f1023u0;

        /* renamed from: v0  reason: collision with root package name */
        public float f1024v0;

        /* renamed from: w0  reason: collision with root package name */
        public float f1025w0;

        /* renamed from: x0  reason: collision with root package name */
        public float f1026x0;

        /* renamed from: y0  reason: collision with root package name */
        public float f1027y0;

        /* renamed from: z0  reason: collision with root package name */
        public float f1028z0;

        public a(int i2, int i3) {
            super(i2, i3);
            this.f1020r0 = 1.0f;
            this.f1021s0 = false;
            this.f1022t0 = 0.0f;
            this.f1023u0 = 0.0f;
            this.f1024v0 = 0.0f;
            this.f1025w0 = 0.0f;
            this.f1026x0 = 1.0f;
            this.f1027y0 = 1.0f;
            this.f1028z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1020r0 = 1.0f;
            this.f1021s0 = false;
            this.f1022t0 = 0.0f;
            this.f1023u0 = 0.0f;
            this.f1024v0 = 0.0f;
            this.f1025w0 = 0.0f;
            this.f1026x0 = 1.0f;
            this.f1027y0 = 1.0f;
            this.f1028z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f3866d);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 15) {
                    this.f1020r0 = obtainStyledAttributes.getFloat(index, this.f1020r0);
                } else if (index == 28) {
                    this.f1022t0 = obtainStyledAttributes.getFloat(index, this.f1022t0);
                    this.f1021s0 = true;
                } else if (index == 23) {
                    this.f1024v0 = obtainStyledAttributes.getFloat(index, this.f1024v0);
                } else if (index == 24) {
                    this.f1025w0 = obtainStyledAttributes.getFloat(index, this.f1025w0);
                } else if (index == 22) {
                    this.f1023u0 = obtainStyledAttributes.getFloat(index, this.f1023u0);
                } else if (index == 20) {
                    this.f1026x0 = obtainStyledAttributes.getFloat(index, this.f1026x0);
                } else if (index == 21) {
                    this.f1027y0 = obtainStyledAttributes.getFloat(index, this.f1027y0);
                } else if (index == 16) {
                    this.f1028z0 = obtainStyledAttributes.getFloat(index, this.f1028z0);
                } else if (index == 17) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.a(layoutParams);
    }

    public b getConstraintSet() {
        if (this.f1019b == null) {
            this.f1019b = new b();
        }
        b bVar = this.f1019b;
        Objects.requireNonNull(bVar);
        int childCount = getChildCount();
        bVar.f921c.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            a aVar = (a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!bVar.f920b || id != -1) {
                if (!bVar.f921c.containsKey(Integer.valueOf(id))) {
                    bVar.f921c.put(Integer.valueOf(id), new b.a());
                }
                b.a aVar2 = bVar.f921c.get(Integer.valueOf(id));
                if (aVar2 != null) {
                    if (childAt instanceof a) {
                        a aVar3 = (a) childAt;
                        aVar2.c(id, aVar);
                        if (aVar3 instanceof Barrier) {
                            b.C0005b bVar2 = aVar2.f925d;
                            bVar2.f959i0 = 1;
                            Barrier barrier = (Barrier) aVar3;
                            bVar2.f955g0 = barrier.getType();
                            aVar2.f925d.f961j0 = barrier.getReferencedIds();
                            aVar2.f925d.f957h0 = barrier.getMargin();
                        }
                    }
                    aVar2.c(id, aVar);
                }
                i2++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f1019b;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }
}
