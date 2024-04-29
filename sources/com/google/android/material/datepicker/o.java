package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.l;
import com.example.supermarket.R;
import com.google.android.material.datepicker.a;
import com.google.android.material.internal.CheckableImageButton;
import g0.c0;
import g0.u;
import g0.x;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import u1.g;
import u1.j;

public final class o<S> extends l {
    public static final /* synthetic */ int E0 = 0;
    public CheckableImageButton A0;
    public g B0;
    public Button C0;
    public boolean D0;

    /* renamed from: i0  reason: collision with root package name */
    public final LinkedHashSet<r<? super S>> f2361i0 = new LinkedHashSet<>();

    /* renamed from: j0  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f2362j0 = new LinkedHashSet<>();

    /* renamed from: k0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f2363k0 = new LinkedHashSet<>();

    /* renamed from: l0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f2364l0 = new LinkedHashSet<>();

    /* renamed from: m0  reason: collision with root package name */
    public int f2365m0;

    /* renamed from: n0  reason: collision with root package name */
    public d<S> f2366n0;

    /* renamed from: o0  reason: collision with root package name */
    public y<S> f2367o0;

    /* renamed from: p0  reason: collision with root package name */
    public a f2368p0;

    /* renamed from: q0  reason: collision with root package name */
    public g<S> f2369q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f2370r0;

    /* renamed from: s0  reason: collision with root package name */
    public CharSequence f2371s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f2372t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f2373u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f2374v0;

    /* renamed from: w0  reason: collision with root package name */
    public CharSequence f2375w0;

    /* renamed from: x0  reason: collision with root package name */
    public int f2376x0;

    /* renamed from: y0  reason: collision with root package name */
    public CharSequence f2377y0;

    /* renamed from: z0  reason: collision with root package name */
    public TextView f2378z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            Iterator it = o.this.f2361i0.iterator();
            while (it.hasNext()) {
                ((r) it.next()).a(o.this.h0().a());
            }
            o.this.e0(false, false);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            Iterator it = o.this.f2362j0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            o.this.e0(false, false);
        }
    }

    public class c extends x<S> {
        public c() {
        }

        public void a(S s2) {
            o oVar = o.this;
            int i2 = o.E0;
            oVar.m0();
            o oVar2 = o.this;
            oVar2.C0.setEnabled(oVar2.h0().b());
        }
    }

    public static int i0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar d2 = b0.d();
        d2.set(5, 1);
        Calendar b2 = b0.b(d2);
        b2.get(2);
        b2.get(1);
        int maximum = b2.getMaximum(7);
        b2.getActualMaximum(5);
        b2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean j0(Context context) {
        return k0(context, 16843277);
    }

    public static boolean k0(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r1.b.c(context, R.attr.materialCalendarStyle, g.class.getCanonicalName()), new int[]{i2});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    public final void G(Bundle bundle) {
        super.G(bundle);
        if (bundle == null) {
            bundle = this.f1376g;
        }
        this.f2365m0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f2366n0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f2368p0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f2370r0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2371s0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f2373u0 = bundle.getInt("INPUT_MODE_KEY");
        this.f2374v0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2375w0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f2376x0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2377y0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View view;
        LinearLayout.LayoutParams layoutParams;
        View inflate = layoutInflater.inflate(this.f2372t0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f2372t0) {
            view = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(i0(context), -2);
        } else {
            view = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(i0(context), -1);
        }
        view.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.f2378z0 = textView;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.g.f(textView, 1);
        this.A0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.f2371s0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f2370r0);
        }
        this.A0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.A0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, e.a.b(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], e.a.b(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.A0.setChecked(this.f2373u0 != 0);
        u.u(this.A0, (g0.a) null);
        n0(this.A0);
        this.A0.setOnClickListener(new q(this));
        this.C0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (h0().b()) {
            this.C0.setEnabled(true);
        } else {
            this.C0.setEnabled(false);
        }
        this.C0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence2 = this.f2375w0;
        if (charSequence2 != null) {
            this.C0.setText(charSequence2);
        } else {
            int i2 = this.f2374v0;
            if (i2 != 0) {
                this.C0.setText(i2);
            }
        }
        this.C0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.f2377y0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i3 = this.f2376x0;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    public final void M(Bundle bundle) {
        super.M(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f2365m0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f2366n0);
        a.b bVar = new a.b(this.f2368p0);
        t tVar = this.f2369q0.X;
        if (tVar != null) {
            bVar.f2312c = Long.valueOf(tVar.f2392g);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f2313d);
        t l2 = t.l(bVar.f2310a);
        t l3 = t.l(bVar.f2311b);
        a.c cVar = (a.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l4 = bVar.f2312c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new a(l2, l3, cVar, l4 == null ? null : t.l(l4.longValue()), (a.C0016a) null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f2370r0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f2371s0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2374v0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2375w0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2376x0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2377y0);
    }

    public void N() {
        super.N();
        Window window = g0().getWindow();
        if (this.f2372t0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.B0);
            if (!this.D0) {
                View findViewById = V().findViewById(R.id.fullscreen_header);
                c0 c0Var = null;
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                int i2 = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int e2 = c.b.e(window.getContext(), 16842801, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(e2);
                }
                Integer valueOf2 = Integer.valueOf(e2);
                if (i2 >= 30) {
                    window.setDecorFitsSystemWindows(false);
                } else {
                    View decorView = window.getDecorView();
                    decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                }
                int e3 = i2 < 23 ? z.a.e(c.b.e(window.getContext(), 16843857, -16777216), 128) : 0;
                int e4 = i2 < 27 ? z.a.e(c.b.e(window.getContext(), 16843858, -16777216), 128) : 0;
                window.setStatusBarColor(e3);
                window.setNavigationBarColor(e4);
                boolean z4 = c.b.g(e3) || (e3 == 0 && c.b.g(valueOf.intValue()));
                boolean g2 = c.b.g(valueOf2.intValue());
                if (c.b.g(e4) || (e4 == 0 && g2)) {
                    z2 = true;
                }
                View decorView2 = window.getDecorView();
                if (i2 >= 30) {
                    WindowInsetsController insetsController = window.getInsetsController();
                    if (insetsController != null) {
                        c0Var = new c0(insetsController);
                    }
                } else {
                    c0Var = new c0(window, decorView2);
                }
                if (c0Var != null) {
                    c0Var.f3042a.b(z4);
                    c0Var.f3042a.a(z2);
                }
                p pVar = new p(this, findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                u.i.u(findViewById, pVar);
                this.D0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = w().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.B0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new j1.a(g0(), rect));
        }
        l0();
    }

    public void O() {
        this.f2367o0.T.clear();
        this.D = true;
        Dialog dialog = this.f1357e0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final Dialog f0(Bundle bundle) {
        Context U = U();
        Context U2 = U();
        int i2 = this.f2365m0;
        if (i2 == 0) {
            i2 = h0().f(U2);
        }
        Dialog dialog = new Dialog(U, i2);
        Context context = dialog.getContext();
        this.f2372t0 = j0(context);
        int c2 = r1.b.c(context, R.attr.colorSurface, o.class.getCanonicalName());
        g gVar = new g(j.b(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2131755990).a());
        this.B0 = gVar;
        gVar.f3911b.f3936b = new l1.a(context);
        gVar.x();
        this.B0.q(ColorStateList.valueOf(c2));
        g gVar2 = this.B0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        gVar2.p(u.i.i(decorView));
        return dialog;
    }

    public final d<S> h0() {
        if (this.f2366n0 == null) {
            this.f2366n0 = (d) this.f1376g.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f2366n0;
    }

    public final void l0() {
        y<S> yVar;
        Context U = U();
        int i2 = this.f2365m0;
        if (i2 == 0) {
            i2 = h0().f(U);
        }
        d h02 = h0();
        a aVar = this.f2368p0;
        g<S> gVar = new g<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", h02);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.f2305e);
        gVar.Z(bundle);
        this.f2369q0 = gVar;
        if (this.A0.isChecked()) {
            d h03 = h0();
            a aVar2 = this.f2368p0;
            yVar = new s<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i2);
            bundle2.putParcelable("DATE_SELECTOR_KEY", h03);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar2);
            yVar.Z(bundle2);
        } else {
            yVar = this.f2369q0;
        }
        this.f2367o0 = yVar;
        m0();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(i());
        aVar3.e(R.id.mtrl_calendar_frame, this.f2367o0, (String) null, 2);
        if (!aVar3.f1332g) {
            aVar3.f1196p.D(aVar3, false);
            this.f2367o0.e0(new c());
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void m0() {
        String d2 = h0().d(j());
        this.f2378z0.setContentDescription(String.format(A(R.string.mtrl_picker_announce_current_selection), new Object[]{d2}));
        this.f2378z0.setText(d2);
    }

    public final void n0(CheckableImageButton checkableImageButton) {
        this.A0.setContentDescription(checkableImageButton.getContext().getString(this.A0.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f2363k0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f2364l0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.F;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
