package o1;

import android.view.View;
import android.view.ViewGroup;
import c1.b;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g0.b0;
import g0.m;
import java.util.Objects;
import o1.s;

public class q implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ s.a f3601a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s.b f3602b;

    public q(s.a aVar, s.b bVar) {
        this.f3601a = aVar;
        this.f3602b = bVar;
    }

    public b0 a(View view, b0 b0Var) {
        boolean z2;
        int i2;
        int i3;
        int i4;
        s.a aVar = this.f3601a;
        s.b bVar = this.f3602b;
        int i5 = bVar.f3603a;
        int i6 = bVar.f3605c;
        int i7 = bVar.f3606d;
        b bVar2 = (b) aVar;
        Objects.requireNonNull(bVar2);
        z.b a2 = b0Var.a(7);
        z.b a3 = b0Var.a(32);
        bVar2.f2070b.f2186v = a2.f4393b;
        boolean a4 = s.a(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior = bVar2.f2070b;
        if (bottomSheetBehavior.f2178n) {
            bottomSheetBehavior.f2185u = b0Var.b();
            paddingBottom = bVar2.f2070b.f2185u + i7;
        }
        BottomSheetBehavior bottomSheetBehavior2 = bVar2.f2070b;
        if (bottomSheetBehavior2.f2179o) {
            paddingLeft = (a4 ? i6 : i5) + a2.f4392a;
        }
        if (bottomSheetBehavior2.f2180p) {
            if (!a4) {
                i5 = i6;
            }
            paddingRight = i5 + a2.f4394c;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        BottomSheetBehavior bottomSheetBehavior3 = bVar2.f2070b;
        boolean z3 = true;
        if (!bottomSheetBehavior3.f2182r || marginLayoutParams.leftMargin == (i4 = a2.f4392a)) {
            z2 = false;
        } else {
            marginLayoutParams.leftMargin = i4;
            z2 = true;
        }
        if (bottomSheetBehavior3.f2183s && marginLayoutParams.rightMargin != (i3 = a2.f4394c)) {
            marginLayoutParams.rightMargin = i3;
            z2 = true;
        }
        if (!bottomSheetBehavior3.f2184t || marginLayoutParams.topMargin == (i2 = a2.f4393b)) {
            z3 = z2;
        } else {
            marginLayoutParams.topMargin = i2;
        }
        if (z3) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        boolean z4 = bVar2.f2069a;
        if (z4) {
            bVar2.f2070b.f2176l = a3.f4395d;
        }
        BottomSheetBehavior bottomSheetBehavior4 = bVar2.f2070b;
        if (bottomSheetBehavior4.f2178n || z4) {
            bottomSheetBehavior4.I(false);
        }
        return b0Var;
    }
}
