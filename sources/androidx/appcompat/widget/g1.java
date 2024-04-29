package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.example.supermarket.R;

public class g1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f629a;

    /* renamed from: b  reason: collision with root package name */
    public final View f630b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f631c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f632d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f633e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f634f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f635g = new int[2];

    public g1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f632d = layoutParams;
        this.f629a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f630b = inflate;
        this.f631c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(g1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 2131755013;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.f630b.getParent() != null) {
            ((WindowManager) this.f629a.getSystemService("window")).removeView(this.f630b);
        }
    }
}
