package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.b1;
import c.c;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import java.util.Objects;
import java.util.WeakHashMap;

public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b  reason: collision with root package name */
    public g f142b;

    /* renamed from: c  reason: collision with root package name */
    public ImageView f143c;

    /* renamed from: d  reason: collision with root package name */
    public RadioButton f144d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f145e;

    /* renamed from: f  reason: collision with root package name */
    public CheckBox f146f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f147g;

    /* renamed from: h  reason: collision with root package name */
    public ImageView f148h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f149i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayout f150j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f151k;

    /* renamed from: l  reason: collision with root package name */
    public int f152l;

    /* renamed from: m  reason: collision with root package name */
    public Context f153m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f154n;

    /* renamed from: o  reason: collision with root package name */
    public Drawable f155o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f156p;

    /* renamed from: q  reason: collision with root package name */
    public LayoutInflater f157q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f158r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b1 q2 = b1.q(getContext(), attributeSet, c.f2055r, R.attr.listMenuViewStyle, 0);
        this.f151k = q2.g(5);
        this.f152l = q2.l(1, -1);
        this.f154n = q2.a(7, false);
        this.f153m = context;
        this.f155o = q2.g(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.f156p = obtainStyledAttributes.hasValue(0);
        q2.f527b.recycle();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f157q == null) {
            this.f157q = LayoutInflater.from(getContext());
        }
        return this.f157q;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f148h;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    public final void a() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, this, false);
        this.f146f = checkBox;
        LinearLayout linearLayout = this.f150j;
        if (linearLayout != null) {
            linearLayout.addView(checkBox, -1);
        } else {
            addView(checkBox, -1);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f149i;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f149i.getLayoutParams();
            rect.top = this.f149i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    public final void b() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, this, false);
        this.f144d = radioButton;
        LinearLayout linearLayout = this.f150j;
        if (linearLayout != null) {
            linearLayout.addView(radioButton, -1);
        } else {
            addView(radioButton, -1);
        }
    }

    public void d(g gVar, int i2) {
        String str;
        int i3;
        this.f142b = gVar;
        int i4 = 0;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.f247e);
        setCheckable(gVar.isCheckable());
        boolean m2 = gVar.m();
        gVar.e();
        if (!m2 || !this.f142b.m()) {
            i4 = 8;
        }
        if (i4 == 0) {
            TextView textView = this.f147g;
            g gVar2 = this.f142b;
            char e2 = gVar2.e();
            if (e2 == 0) {
                str = "";
            } else {
                Resources resources = gVar2.f256n.f216a.getResources();
                StringBuilder sb = new StringBuilder();
                if (ViewConfiguration.get(gVar2.f256n.f216a).hasPermanentMenuKey()) {
                    sb.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i5 = gVar2.f256n.n() ? gVar2.f253k : gVar2.f251i;
                g.c(sb, i5, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                g.c(sb, i5, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                g.c(sb, i5, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                g.c(sb, i5, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                g.c(sb, i5, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                g.c(sb, i5, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (e2 == 8) {
                    i3 = R.string.abc_menu_delete_shortcut_label;
                } else if (e2 == 10) {
                    i3 = R.string.abc_menu_enter_shortcut_label;
                } else if (e2 != ' ') {
                    sb.append(e2);
                    str = sb.toString();
                } else {
                    i3 = R.string.abc_menu_space_shortcut_label;
                }
                sb.append(resources.getString(i3));
                str = sb.toString();
            }
            textView.setText(str);
        }
        if (this.f147g.getVisibility() != i4) {
            this.f147g.setVisibility(i4);
        }
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.f259q);
    }

    public g getItemData() {
        return this.f142b;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        Drawable drawable = this.f151k;
        WeakHashMap<View, x> weakHashMap = u.f3063a;
        u.d.q(this, drawable);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f145e = textView;
        int i2 = this.f152l;
        if (i2 != -1) {
            textView.setTextAppearance(this.f153m, i2);
        }
        this.f147g = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f148h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f155o);
        }
        this.f149i = (ImageView) findViewById(R.id.group_divider);
        this.f150j = (LinearLayout) findViewById(R.id.content);
    }

    public void onMeasure(int i2, int i3) {
        if (this.f143c != null && this.f154n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f143c.getLayoutParams();
            int i4 = layoutParams.height;
            if (i4 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i4;
            }
        }
        super.onMeasure(i2, i3);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z2 || this.f144d != null || this.f146f != null) {
            if (this.f142b.h()) {
                if (this.f144d == null) {
                    b();
                }
                compoundButton2 = this.f144d;
                compoundButton = this.f146f;
            } else {
                if (this.f146f == null) {
                    a();
                }
                compoundButton2 = this.f146f;
                compoundButton = this.f144d;
            }
            if (z2) {
                compoundButton2.setChecked(this.f142b.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (compoundButton != null && compoundButton.getVisibility() != 8) {
                    compoundButton.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.f146f;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.f144d;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if (this.f142b.h()) {
            if (this.f144d == null) {
                b();
            }
            compoundButton = this.f144d;
        } else {
            if (this.f146f == null) {
                a();
            }
            compoundButton = this.f146f;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f158r = z2;
        this.f154n = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f149i;
        if (imageView != null) {
            imageView.setVisibility((this.f156p || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        Objects.requireNonNull(this.f142b.f256n);
        boolean z2 = this.f158r;
        if (z2 || this.f154n) {
            ImageView imageView = this.f143c;
            if (imageView != null || drawable != null || this.f154n) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, this, false);
                    this.f143c = imageView2;
                    LinearLayout linearLayout = this.f150j;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable != null || this.f154n) {
                    ImageView imageView3 = this.f143c;
                    if (!z2) {
                        drawable = null;
                    }
                    imageView3.setImageDrawable(drawable);
                    if (this.f143c.getVisibility() != 0) {
                        this.f143c.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f143c.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i2;
        if (charSequence != null) {
            this.f145e.setText(charSequence);
            if (this.f145e.getVisibility() != 0) {
                textView = this.f145e;
                i2 = 0;
            } else {
                return;
            }
        } else {
            i2 = 8;
            if (this.f145e.getVisibility() != 8) {
                textView = this.f145e;
            } else {
                return;
            }
        }
        textView.setVisibility(i2);
    }
}
