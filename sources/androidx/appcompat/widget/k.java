package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import androidx.appcompat.widget.r0;
import com.example.supermarket.R;

public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final PorterDuff.Mode f671b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c  reason: collision with root package name */
    public static k f672c;

    /* renamed from: a  reason: collision with root package name */
    public r0 f673a;

    public class a implements r0.f {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f674a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f675b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f676c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f677d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f678e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f679f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        public final boolean a(int[] iArr, int i2) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList b(Context context, int i2) {
            int c2 = w0.c(context, R.attr.colorControlHighlight);
            int b2 = w0.b(context, R.attr.colorButtonNormal);
            return new ColorStateList(new int[][]{w0.f814b, w0.f816d, w0.f815c, w0.f818f}, new int[]{b2, z.a.b(c2, i2), z.a.b(c2, i2), i2});
        }

        public final LayerDrawable c(r0 r0Var, Context context, int i2) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            Drawable f2 = r0Var.f(context, R.drawable.abc_star_black_48dp);
            Drawable f3 = r0Var.f(context, R.drawable.abc_star_half_black_48dp);
            if ((f2 instanceof BitmapDrawable) && f2.getIntrinsicWidth() == dimensionPixelSize && f2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) f2;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f2.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((f3 instanceof BitmapDrawable) && f3.getIntrinsicWidth() == dimensionPixelSize && f3.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) f3;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                f3.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                f3.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public ColorStateList d(Context context, int i2) {
            if (i2 == R.drawable.abc_edit_text_material) {
                return e.a.a(context, R.color.abc_tint_edittext);
            }
            if (i2 == R.drawable.abc_switch_track_mtrl_alpha) {
                return e.a.a(context, R.color.abc_tint_switch_track);
            }
            if (i2 == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList d2 = w0.d(context, R.attr.colorSwitchThumbNormal);
                if (d2 == null || !d2.isStateful()) {
                    iArr[0] = w0.f814b;
                    iArr2[0] = w0.b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = w0.f817e;
                    iArr2[1] = w0.c(context, R.attr.colorControlActivated);
                    iArr[2] = w0.f818f;
                    iArr2[2] = w0.c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = w0.f814b;
                    iArr2[0] = d2.getColorForState(iArr[0], 0);
                    iArr[1] = w0.f817e;
                    iArr2[1] = w0.c(context, R.attr.colorControlActivated);
                    iArr[2] = w0.f818f;
                    iArr2[2] = d2.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            } else if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return b(context, w0.c(context, R.attr.colorButtonNormal));
            } else {
                if (i2 == R.drawable.abc_btn_borderless_material) {
                    return b(context, 0);
                }
                if (i2 == R.drawable.abc_btn_colored_material) {
                    return b(context, w0.c(context, R.attr.colorAccent));
                }
                if (i2 == R.drawable.abc_spinner_mtrl_am_alpha || i2 == R.drawable.abc_spinner_textfield_background_material) {
                    return e.a.a(context, R.color.abc_tint_spinner);
                }
                if (a(this.f675b, i2)) {
                    return w0.d(context, R.attr.colorControlNormal);
                }
                if (a(this.f678e, i2)) {
                    return e.a.a(context, R.color.abc_tint_default);
                }
                if (a(this.f679f, i2)) {
                    return e.a.a(context, R.color.abc_tint_btn_checkable);
                }
                if (i2 == R.drawable.abc_seekbar_thumb_material) {
                    return e.a.a(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
        }

        public final void e(Drawable drawable, int i2, PorterDuff.Mode mode) {
            if (i0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = k.f671b;
            }
            drawable.setColorFilter(k.c(i2, mode));
        }
    }

    public static synchronized k a() {
        k kVar;
        synchronized (k.class) {
            if (f672c == null) {
                e();
            }
            kVar = f672c;
        }
        return kVar;
    }

    public static synchronized PorterDuffColorFilter c(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter h2;
        synchronized (k.class) {
            h2 = r0.h(i2, mode);
        }
        return h2;
    }

    public static synchronized void e() {
        synchronized (k.class) {
            if (f672c == null) {
                k kVar = new k();
                f672c = kVar;
                kVar.f673a = r0.d();
                r0 r0Var = f672c.f673a;
                a aVar = new a();
                synchronized (r0Var) {
                    r0Var.f773g = aVar;
                }
            }
        }
    }

    public static void f(Drawable drawable, z0 z0Var, int[] iArr) {
        PorterDuff.Mode mode = r0.f764h;
        if (!i0.a(drawable) || drawable.mutate() == drawable) {
            boolean z2 = z0Var.f833d;
            if (z2 || z0Var.f832c) {
                PorterDuffColorFilter porterDuffColorFilter = null;
                ColorStateList colorStateList = z2 ? z0Var.f830a : null;
                PorterDuff.Mode mode2 = z0Var.f832c ? z0Var.f831b : r0.f764h;
                if (!(colorStateList == null || mode2 == null)) {
                    porterDuffColorFilter = r0.h(colorStateList.getColorForState(iArr, 0), mode2);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public synchronized Drawable b(Context context, int i2) {
        return this.f673a.f(context, i2);
    }

    public synchronized ColorStateList d(Context context, int i2) {
        return this.f673a.i(context, i2);
    }
}
