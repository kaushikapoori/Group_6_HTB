package w1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.supermarket.R;
import com.google.android.material.textfield.TextInputLayout;
import g0.u;
import g0.x;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import r1.c;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4258a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f4259b;

    /* renamed from: c  reason: collision with root package name */
    public LinearLayout f4260c;

    /* renamed from: d  reason: collision with root package name */
    public int f4261d;

    /* renamed from: e  reason: collision with root package name */
    public FrameLayout f4262e;

    /* renamed from: f  reason: collision with root package name */
    public Animator f4263f;

    /* renamed from: g  reason: collision with root package name */
    public final float f4264g;

    /* renamed from: h  reason: collision with root package name */
    public int f4265h;

    /* renamed from: i  reason: collision with root package name */
    public int f4266i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f4267j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4268k;

    /* renamed from: l  reason: collision with root package name */
    public TextView f4269l;

    /* renamed from: m  reason: collision with root package name */
    public CharSequence f4270m;

    /* renamed from: n  reason: collision with root package name */
    public int f4271n;

    /* renamed from: o  reason: collision with root package name */
    public ColorStateList f4272o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f4273p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f4274q;

    /* renamed from: r  reason: collision with root package name */
    public TextView f4275r;

    /* renamed from: s  reason: collision with root package name */
    public int f4276s;

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f4277t;

    /* renamed from: u  reason: collision with root package name */
    public Typeface f4278u;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f4279a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f4280b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f4281c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ TextView f4282d;

        public a(int i2, TextView textView, int i3, TextView textView2) {
            this.f4279a = i2;
            this.f4280b = textView;
            this.f4281c = i3;
            this.f4282d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            TextView textView;
            m mVar = m.this;
            mVar.f4265h = this.f4279a;
            mVar.f4263f = null;
            TextView textView2 = this.f4280b;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.f4281c == 1 && (textView = m.this.f4269l) != null) {
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView3 = this.f4282d;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                this.f4282d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f4282d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public m(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f4258a = context;
        this.f4259b = textInputLayout;
        this.f4264g = (float) context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
    }

    public void a(TextView textView, int i2) {
        if (this.f4260c == null && this.f4262e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f4258a);
            this.f4260c = linearLayout;
            linearLayout.setOrientation(0);
            this.f4259b.addView(this.f4260c, -1, -2);
            this.f4262e = new FrameLayout(this.f4258a);
            this.f4260c.addView(this.f4262e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f4259b.getEditText() != null) {
                b();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.f4262e.setVisibility(0);
            this.f4262e.addView(textView);
        } else {
            this.f4260c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f4260c.setVisibility(0);
        this.f4261d++;
    }

    public void b() {
        if ((this.f4260c == null || this.f4259b.getEditText() == null) ? false : true) {
            EditText editText = this.f4259b.getEditText();
            boolean d2 = c.d(this.f4258a);
            LinearLayout linearLayout = this.f4260c;
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            u.e.k(linearLayout, h(d2, R.dimen.material_helper_text_font_1_3_padding_horizontal, u.e.f(editText)), h(d2, R.dimen.material_helper_text_font_1_3_padding_top, this.f4258a.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), h(d2, R.dimen.material_helper_text_font_1_3_padding_horizontal, u.e.e(editText)), 0);
        }
    }

    public void c() {
        Animator animator = this.f4263f;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(List<Animator> list, boolean z2, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z2) {
            if (i2 == i4 || i2 == i3) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{i4 == i2 ? 1.0f : 0.0f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(z0.a.f4419a);
                list.add(ofFloat);
                if (i4 == i2) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f4264g, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(z0.a.f4422d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public boolean e() {
        return this.f4266i == 1 && this.f4269l != null && !TextUtils.isEmpty(this.f4267j);
    }

    public final TextView f(int i2) {
        if (i2 == 1) {
            return this.f4269l;
        }
        if (i2 != 2) {
            return null;
        }
        return this.f4275r;
    }

    public int g() {
        TextView textView = this.f4269l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int h(boolean z2, int i2, int i3) {
        return z2 ? this.f4258a.getResources().getDimensionPixelSize(i2) : i3;
    }

    public void i() {
        this.f4267j = null;
        c();
        if (this.f4265h == 1) {
            this.f4266i = (!this.f4274q || TextUtils.isEmpty(this.f4273p)) ? 0 : 2;
        }
        l(this.f4265h, this.f4266i, k(this.f4269l, ""));
    }

    public void j(TextView textView, int i2) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f4260c;
        if (linearLayout != null) {
            if (!(i2 == 0 || i2 == 1) || (frameLayout = this.f4262e) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i3 = this.f4261d - 1;
            this.f4261d = i3;
            LinearLayout linearLayout2 = this.f4260c;
            if (i3 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean k(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f4259b;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        return u.g.c(textInputLayout) && this.f4259b.isEnabled() && (this.f4266i != this.f4265h || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public final void l(int i2, int i3, boolean z2) {
        TextView f2;
        TextView f3;
        int i4 = i2;
        int i5 = i3;
        boolean z3 = z2;
        if (i4 != i5) {
            if (z3) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f4263f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i6 = i2;
                int i7 = i3;
                d(arrayList2, this.f4274q, this.f4275r, 2, i6, i7);
                d(arrayList2, this.f4268k, this.f4269l, 1, i6, i7);
                c.a.g(animatorSet, arrayList);
                animatorSet.addListener(new a(i3, f(i2), i2, f(i5)));
                animatorSet.start();
            } else if (i4 != i5) {
                if (!(i5 == 0 || (f3 = f(i5)) == null)) {
                    f3.setVisibility(0);
                    f3.setAlpha(1.0f);
                }
                if (!(i4 == 0 || (f2 = f(i2)) == null)) {
                    f2.setVisibility(4);
                    if (i4 == 1) {
                        f2.setText((CharSequence) null);
                    }
                }
                this.f4265h = i5;
            }
            this.f4259b.v();
            this.f4259b.z(z3, false);
            this.f4259b.E();
        }
    }
}
