package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.core.widget.NestedScrollView;
import com.example.supermarket.R;
import d.p;
import java.util.Objects;

public class b extends p {

    /* renamed from: d  reason: collision with root package name */
    public final AlertController f125d = new AlertController(getContext(), this, getWindow());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AlertController.b f126a;

        /* renamed from: b  reason: collision with root package name */
        public final int f127b;

        public a(Context context) {
            int d2 = b.d(context, 0);
            this.f126a = new AlertController.b(new ContextThemeWrapper(context, b.d(context, d2)));
            this.f127b = d2;
        }

        public b a() {
            b bVar = new b(this.f126a.f112a, this.f127b);
            AlertController.b bVar2 = this.f126a;
            AlertController alertController = bVar.f125d;
            View view = bVar2.f116e;
            if (view != null) {
                alertController.G = view;
            } else {
                CharSequence charSequence = bVar2.f115d;
                if (charSequence != null) {
                    alertController.f87e = charSequence;
                    TextView textView = alertController.E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = bVar2.f114c;
                if (drawable != null) {
                    alertController.C = drawable;
                    alertController.B = 0;
                    ImageView imageView = alertController.D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.D.setImageDrawable(drawable);
                    }
                }
            }
            if (bVar2.f118g != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) bVar2.f113b.inflate(alertController.L, (ViewGroup) null);
                int i2 = bVar2.f120i ? alertController.N : alertController.O;
                ListAdapter listAdapter = bVar2.f118g;
                if (listAdapter == null) {
                    listAdapter = new AlertController.d(bVar2.f112a, i2, 16908308, (CharSequence[]) null);
                }
                alertController.H = listAdapter;
                alertController.I = bVar2.f121j;
                if (bVar2.f119h != null) {
                    recycleListView.setOnItemClickListener(new a(bVar2, alertController));
                }
                if (bVar2.f120i) {
                    recycleListView.setChoiceMode(1);
                }
                alertController.f89g = recycleListView;
            }
            Objects.requireNonNull(this.f126a);
            bVar.setCancelable(true);
            Objects.requireNonNull(this.f126a);
            bVar.setCanceledOnTouchOutside(true);
            Objects.requireNonNull(this.f126a);
            bVar.setOnCancelListener((DialogInterface.OnCancelListener) null);
            Objects.requireNonNull(this.f126a);
            bVar.setOnDismissListener((DialogInterface.OnDismissListener) null);
            DialogInterface.OnKeyListener onKeyListener = this.f126a.f117f;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }
    }

    public b(Context context, int i2) {
        super(context, d(context, i2));
    }

    public static int d(Context context, int i2) {
        if (((i2 >>> 24) & 255) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02e4, code lost:
        if (r3 != null) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02ee, code lost:
        if (r3 != null) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0353, code lost:
        if (r7 != null) goto L_0x03a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            super.onCreate(r17)
            r0 = r16
            androidx.appcompat.app.AlertController r1 = r0.f125d
            int r2 = r1.K
            int r2 = r1.J
            d.p r3 = r1.f84b
            r3.setContentView((int) r2)
            android.view.Window r2 = r1.f85c
            r3 = 2131231056(0x7f080150, float:1.8078182E38)
            android.view.View r2 = r2.findViewById(r3)
            r3 = 2131231182(0x7f0801ce, float:1.8078438E38)
            android.view.View r4 = r2.findViewById(r3)
            r5 = 2131230853(0x7f080085, float:1.807777E38)
            android.view.View r6 = r2.findViewById(r5)
            r7 = 2131230819(0x7f080063, float:1.8077702E38)
            android.view.View r8 = r2.findViewById(r7)
            r9 = 2131230861(0x7f08008d, float:1.8077787E38)
            android.view.View r2 = r2.findViewById(r9)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.view.View r9 = r1.f90h
            r11 = 0
            if (r9 == 0) goto L_0x003d
            goto L_0x004f
        L_0x003d:
            int r9 = r1.f91i
            if (r9 == 0) goto L_0x004e
            android.content.Context r9 = r1.f83a
            android.view.LayoutInflater r9 = android.view.LayoutInflater.from(r9)
            int r12 = r1.f91i
            android.view.View r9 = r9.inflate(r12, r2, r11)
            goto L_0x004f
        L_0x004e:
            r9 = 0
        L_0x004f:
            if (r9 == 0) goto L_0x0053
            r13 = 1
            goto L_0x0054
        L_0x0053:
            r13 = 0
        L_0x0054:
            if (r13 == 0) goto L_0x005c
            boolean r14 = androidx.appcompat.app.AlertController.a(r9)
            if (r14 != 0) goto L_0x0063
        L_0x005c:
            android.view.Window r14 = r1.f85c
            r15 = 131072(0x20000, float:1.83671E-40)
            r14.setFlags(r15, r15)
        L_0x0063:
            r14 = -1
            r15 = 8
            if (r13 == 0) goto L_0x0098
            android.view.Window r13 = r1.f85c
            r12 = 2131230860(0x7f08008c, float:1.8077785E38)
            android.view.View r12 = r13.findViewById(r12)
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            android.view.ViewGroup$LayoutParams r13 = new android.view.ViewGroup$LayoutParams
            r13.<init>(r14, r14)
            r12.addView(r9, r13)
            boolean r9 = r1.f96n
            if (r9 == 0) goto L_0x008a
            int r9 = r1.f92j
            int r13 = r1.f93k
            int r10 = r1.f94l
            int r14 = r1.f95m
            r12.setPadding(r9, r13, r10, r14)
        L_0x008a:
            android.widget.ListView r9 = r1.f89g
            if (r9 == 0) goto L_0x009b
            android.view.ViewGroup$LayoutParams r9 = r2.getLayoutParams()
            androidx.appcompat.widget.m0$a r9 = (androidx.appcompat.widget.m0.a) r9
            r10 = 0
            r9.weight = r10
            goto L_0x009b
        L_0x0098:
            r2.setVisibility(r15)
        L_0x009b:
            android.view.View r3 = r2.findViewById(r3)
            android.view.View r5 = r2.findViewById(r5)
            android.view.View r7 = r2.findViewById(r7)
            android.view.ViewGroup r3 = r1.d(r3, r4)
            android.view.ViewGroup r4 = r1.d(r5, r6)
            android.view.ViewGroup r5 = r1.d(r7, r8)
            android.view.Window r6 = r1.f85c
            r7 = 2131231087(0x7f08016f, float:1.8078245E38)
            android.view.View r6 = r6.findViewById(r7)
            androidx.core.widget.NestedScrollView r6 = (androidx.core.widget.NestedScrollView) r6
            r1.A = r6
            r6.setFocusable(r11)
            androidx.core.widget.NestedScrollView r6 = r1.A
            r6.setNestedScrollingEnabled(r11)
            r6 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.F = r6
            if (r6 != 0) goto L_0x00d6
            goto L_0x010c
        L_0x00d6:
            java.lang.CharSequence r7 = r1.f88f
            if (r7 == 0) goto L_0x00de
            r6.setText(r7)
            goto L_0x010c
        L_0x00de:
            r6.setVisibility(r15)
            androidx.core.widget.NestedScrollView r6 = r1.A
            android.widget.TextView r7 = r1.F
            r6.removeView(r7)
            android.widget.ListView r6 = r1.f89g
            if (r6 == 0) goto L_0x0109
            androidx.core.widget.NestedScrollView r6 = r1.A
            android.view.ViewParent r6 = r6.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            androidx.core.widget.NestedScrollView r7 = r1.A
            int r7 = r6.indexOfChild(r7)
            r6.removeViewAt(r7)
            android.widget.ListView r8 = r1.f89g
            android.view.ViewGroup$LayoutParams r9 = new android.view.ViewGroup$LayoutParams
            r10 = -1
            r9.<init>(r10, r10)
            r6.addView(r8, r7, r9)
            goto L_0x010c
        L_0x0109:
            r4.setVisibility(r15)
        L_0x010c:
            r6 = 16908313(0x1020019, float:2.38773E-38)
            android.view.View r6 = r5.findViewById(r6)
            android.widget.Button r6 = (android.widget.Button) r6
            r1.f97o = r6
            android.view.View$OnClickListener r7 = r1.R
            r6.setOnClickListener(r7)
            java.lang.CharSequence r6 = r1.f98p
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L_0x012f
            android.graphics.drawable.Drawable r6 = r1.f100r
            if (r6 != 0) goto L_0x012f
            android.widget.Button r6 = r1.f97o
            r6.setVisibility(r15)
            r6 = 0
            goto L_0x014d
        L_0x012f:
            android.widget.Button r6 = r1.f97o
            java.lang.CharSequence r7 = r1.f98p
            r6.setText(r7)
            android.graphics.drawable.Drawable r6 = r1.f100r
            if (r6 == 0) goto L_0x0147
            int r7 = r1.f86d
            r6.setBounds(r11, r11, r7, r7)
            android.widget.Button r6 = r1.f97o
            android.graphics.drawable.Drawable r7 = r1.f100r
            r8 = 0
            r6.setCompoundDrawables(r7, r8, r8, r8)
        L_0x0147:
            android.widget.Button r6 = r1.f97o
            r6.setVisibility(r11)
            r6 = 1
        L_0x014d:
            r7 = 16908314(0x102001a, float:2.3877302E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r1.f101s = r7
            android.view.View$OnClickListener r8 = r1.R
            r7.setOnClickListener(r8)
            java.lang.CharSequence r7 = r1.f102t
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x016f
            android.graphics.drawable.Drawable r7 = r1.f104v
            if (r7 != 0) goto L_0x016f
            android.widget.Button r7 = r1.f101s
            r7.setVisibility(r15)
            goto L_0x018e
        L_0x016f:
            android.widget.Button r7 = r1.f101s
            java.lang.CharSequence r8 = r1.f102t
            r7.setText(r8)
            android.graphics.drawable.Drawable r7 = r1.f104v
            if (r7 == 0) goto L_0x0187
            int r8 = r1.f86d
            r7.setBounds(r11, r11, r8, r8)
            android.widget.Button r7 = r1.f101s
            android.graphics.drawable.Drawable r8 = r1.f104v
            r9 = 0
            r7.setCompoundDrawables(r8, r9, r9, r9)
        L_0x0187:
            android.widget.Button r7 = r1.f101s
            r7.setVisibility(r11)
            r6 = r6 | 2
        L_0x018e:
            r7 = 16908315(0x102001b, float:2.3877305E-38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.Button r7 = (android.widget.Button) r7
            r1.f105w = r7
            android.view.View$OnClickListener r8 = r1.R
            r7.setOnClickListener(r8)
            java.lang.CharSequence r7 = r1.f106x
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x01b1
            android.graphics.drawable.Drawable r7 = r1.f108z
            if (r7 != 0) goto L_0x01b1
            android.widget.Button r7 = r1.f105w
            r7.setVisibility(r15)
            r9 = 0
            goto L_0x01d2
        L_0x01b1:
            android.widget.Button r7 = r1.f105w
            java.lang.CharSequence r8 = r1.f106x
            r7.setText(r8)
            android.graphics.drawable.Drawable r7 = r1.f108z
            if (r7 == 0) goto L_0x01ca
            int r8 = r1.f86d
            r7.setBounds(r11, r11, r8, r8)
            android.widget.Button r7 = r1.f105w
            android.graphics.drawable.Drawable r8 = r1.f108z
            r9 = 0
            r7.setCompoundDrawables(r8, r9, r9, r9)
            goto L_0x01cb
        L_0x01ca:
            r9 = 0
        L_0x01cb:
            android.widget.Button r7 = r1.f105w
            r7.setVisibility(r11)
            r6 = r6 | 4
        L_0x01d2:
            android.content.Context r7 = r1.f83a
            android.util.TypedValue r8 = new android.util.TypedValue
            r8.<init>()
            android.content.res.Resources$Theme r7 = r7.getTheme()
            r10 = 2130903080(0x7f030028, float:1.7412968E38)
            r12 = 1
            r7.resolveAttribute(r10, r8, r12)
            int r7 = r8.data
            if (r7 == 0) goto L_0x01ea
            r7 = 1
            goto L_0x01eb
        L_0x01ea:
            r7 = 0
        L_0x01eb:
            r8 = 2
            if (r7 == 0) goto L_0x0200
            if (r6 != r12) goto L_0x01f3
            android.widget.Button r7 = r1.f97o
            goto L_0x01fd
        L_0x01f3:
            if (r6 != r8) goto L_0x01f8
            android.widget.Button r7 = r1.f101s
            goto L_0x01fd
        L_0x01f8:
            r7 = 4
            if (r6 != r7) goto L_0x0200
            android.widget.Button r7 = r1.f105w
        L_0x01fd:
            r1.b(r7)
        L_0x0200:
            if (r6 == 0) goto L_0x0204
            r6 = 1
            goto L_0x0205
        L_0x0204:
            r6 = 0
        L_0x0205:
            if (r6 != 0) goto L_0x020a
            r5.setVisibility(r15)
        L_0x020a:
            android.view.View r6 = r1.G
            r7 = 2131231179(0x7f0801cb, float:1.8078432E38)
            if (r6 == 0) goto L_0x0228
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r10 = -2
            r12 = -1
            r6.<init>(r12, r10)
            android.view.View r10 = r1.G
            r3.addView(r10, r11, r6)
            android.view.Window r6 = r1.f85c
            android.view.View r6 = r6.findViewById(r7)
            r6.setVisibility(r15)
            goto L_0x029d
        L_0x0228:
            android.view.Window r6 = r1.f85c
            r10 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r6 = r6.findViewById(r10)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r1.D = r6
            java.lang.CharSequence r6 = r1.f87e
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            r10 = 1
            r6 = r6 ^ r10
            if (r6 == 0) goto L_0x028c
            boolean r6 = r1.P
            if (r6 == 0) goto L_0x028c
            android.view.Window r6 = r1.f85c
            r7 = 2131230791(0x7f080047, float:1.8077645E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r1.E = r6
            java.lang.CharSequence r7 = r1.f87e
            r6.setText(r7)
            int r6 = r1.B
            if (r6 == 0) goto L_0x025f
            android.widget.ImageView r7 = r1.D
            r7.setImageResource(r6)
            goto L_0x029d
        L_0x025f:
            android.graphics.drawable.Drawable r6 = r1.C
            if (r6 == 0) goto L_0x0269
            android.widget.ImageView r7 = r1.D
            r7.setImageDrawable(r6)
            goto L_0x029d
        L_0x0269:
            android.widget.TextView r6 = r1.E
            android.widget.ImageView r7 = r1.D
            int r7 = r7.getPaddingLeft()
            android.widget.ImageView r10 = r1.D
            int r10 = r10.getPaddingTop()
            android.widget.ImageView r12 = r1.D
            int r12 = r12.getPaddingRight()
            android.widget.ImageView r13 = r1.D
            int r13 = r13.getPaddingBottom()
            r6.setPadding(r7, r10, r12, r13)
            android.widget.ImageView r6 = r1.D
            r6.setVisibility(r15)
            goto L_0x029d
        L_0x028c:
            android.view.Window r6 = r1.f85c
            android.view.View r6 = r6.findViewById(r7)
            r6.setVisibility(r15)
            android.widget.ImageView r6 = r1.D
            r6.setVisibility(r15)
            r3.setVisibility(r15)
        L_0x029d:
            int r2 = r2.getVisibility()
            if (r2 == r15) goto L_0x02a5
            r12 = 1
            goto L_0x02a6
        L_0x02a5:
            r12 = 0
        L_0x02a6:
            if (r3 == 0) goto L_0x02b0
            int r2 = r3.getVisibility()
            if (r2 == r15) goto L_0x02b0
            r2 = 1
            goto L_0x02b1
        L_0x02b0:
            r2 = 0
        L_0x02b1:
            int r5 = r5.getVisibility()
            if (r5 == r15) goto L_0x02b9
            r5 = 1
            goto L_0x02ba
        L_0x02b9:
            r5 = 0
        L_0x02ba:
            if (r5 != 0) goto L_0x02c8
            r6 = 2131231161(0x7f0801b9, float:1.8078395E38)
            android.view.View r6 = r4.findViewById(r6)
            if (r6 == 0) goto L_0x02c8
            r6.setVisibility(r11)
        L_0x02c8:
            if (r2 == 0) goto L_0x02e7
            androidx.core.widget.NestedScrollView r6 = r1.A
            if (r6 == 0) goto L_0x02d2
            r7 = 1
            r6.setClipToPadding(r7)
        L_0x02d2:
            java.lang.CharSequence r6 = r1.f88f
            if (r6 != 0) goto L_0x02dd
            android.widget.ListView r6 = r1.f89g
            if (r6 == 0) goto L_0x02db
            goto L_0x02dd
        L_0x02db:
            r3 = r9
            goto L_0x02e4
        L_0x02dd:
            r6 = 2131231178(0x7f0801ca, float:1.807843E38)
            android.view.View r3 = r3.findViewById(r6)
        L_0x02e4:
            if (r3 == 0) goto L_0x02f3
            goto L_0x02f0
        L_0x02e7:
            r3 = 2131231162(0x7f0801ba, float:1.8078397E38)
            android.view.View r3 = r4.findViewById(r3)
            if (r3 == 0) goto L_0x02f3
        L_0x02f0:
            r3.setVisibility(r11)
        L_0x02f3:
            android.widget.ListView r3 = r1.f89g
            boolean r6 = r3 instanceof androidx.appcompat.app.AlertController.RecycleListView
            if (r6 == 0) goto L_0x031f
            androidx.appcompat.app.AlertController$RecycleListView r3 = (androidx.appcompat.app.AlertController.RecycleListView) r3
            java.util.Objects.requireNonNull(r3)
            if (r5 == 0) goto L_0x0302
            if (r2 != 0) goto L_0x031f
        L_0x0302:
            int r6 = r3.getPaddingLeft()
            if (r2 == 0) goto L_0x030d
            int r7 = r3.getPaddingTop()
            goto L_0x030f
        L_0x030d:
            int r7 = r3.f109b
        L_0x030f:
            int r10 = r3.getPaddingRight()
            if (r5 == 0) goto L_0x031a
            int r13 = r3.getPaddingBottom()
            goto L_0x031c
        L_0x031a:
            int r13 = r3.f110c
        L_0x031c:
            r3.setPadding(r6, r7, r10, r13)
        L_0x031f:
            if (r12 != 0) goto L_0x03aa
            android.widget.ListView r3 = r1.f89g
            if (r3 == 0) goto L_0x0326
            goto L_0x0328
        L_0x0326:
            androidx.core.widget.NestedScrollView r3 = r1.A
        L_0x0328:
            if (r3 == 0) goto L_0x03aa
            if (r5 == 0) goto L_0x032d
            r11 = 2
        L_0x032d:
            r2 = r2 | r11
            r5 = 3
            android.view.Window r6 = r1.f85c
            r7 = 2131231086(0x7f08016e, float:1.8078243E38)
            android.view.View r6 = r6.findViewById(r7)
            android.view.Window r7 = r1.f85c
            r10 = 2131231085(0x7f08016d, float:1.8078241E38)
            android.view.View r7 = r7.findViewById(r10)
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 23
            if (r10 < r11) goto L_0x0356
            java.util.WeakHashMap<android.view.View, g0.x> r8 = g0.u.f3063a
            if (r10 < r11) goto L_0x034e
            g0.u.j.d(r3, r2, r5)
        L_0x034e:
            if (r6 == 0) goto L_0x0353
            r4.removeView(r6)
        L_0x0353:
            if (r7 == 0) goto L_0x03aa
            goto L_0x03a7
        L_0x0356:
            if (r6 == 0) goto L_0x0360
            r3 = r2 & 1
            if (r3 != 0) goto L_0x0360
            r4.removeView(r6)
            r6 = r9
        L_0x0360:
            if (r7 == 0) goto L_0x036a
            r2 = r2 & r8
            if (r2 != 0) goto L_0x036a
            r4.removeView(r7)
            r10 = r9
            goto L_0x036b
        L_0x036a:
            r10 = r7
        L_0x036b:
            if (r6 != 0) goto L_0x036f
            if (r10 == 0) goto L_0x03aa
        L_0x036f:
            java.lang.CharSequence r2 = r1.f88f
            if (r2 == 0) goto L_0x0388
            androidx.core.widget.NestedScrollView r2 = r1.A
            d.b r3 = new d.b
            r3.<init>(r1, r6, r10)
            r2.setOnScrollChangeListener(r3)
            androidx.core.widget.NestedScrollView r2 = r1.A
            d.c r3 = new d.c
            r3.<init>(r1, r6, r10)
            r2.post(r3)
            goto L_0x03aa
        L_0x0388:
            android.widget.ListView r2 = r1.f89g
            if (r2 == 0) goto L_0x039f
            d.d r3 = new d.d
            r3.<init>(r1, r6, r10)
            r2.setOnScrollListener(r3)
            android.widget.ListView r2 = r1.f89g
            d.e r3 = new d.e
            r3.<init>(r1, r6, r10)
            r2.post(r3)
            goto L_0x03aa
        L_0x039f:
            if (r6 == 0) goto L_0x03a4
            r4.removeView(r6)
        L_0x03a4:
            if (r10 == 0) goto L_0x03aa
            r7 = r10
        L_0x03a7:
            r4.removeView(r7)
        L_0x03aa:
            android.widget.ListView r2 = r1.f89g
            if (r2 == 0) goto L_0x03c1
            android.widget.ListAdapter r3 = r1.H
            if (r3 == 0) goto L_0x03c1
            r2.setAdapter(r3)
            int r1 = r1.I
            r3 = -1
            if (r1 <= r3) goto L_0x03c1
            r3 = 1
            r2.setItemChecked(r1, r3)
            r2.setSelection(r1)
        L_0x03c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.b.onCreate(android.os.Bundle):void");
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f125d.A;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f125d.A;
        if (nestedScrollView != null && nestedScrollView.g(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f125d;
        alertController.f87e = charSequence;
        TextView textView = alertController.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
