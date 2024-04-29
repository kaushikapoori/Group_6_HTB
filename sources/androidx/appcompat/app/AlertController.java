package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.example.supermarket.R;
import d.p;
import java.lang.ref.WeakReference;

public class AlertController {
    public NestedScrollView A;
    public int B = 0;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I = -1;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public Handler Q;
    public final View.OnClickListener R = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f83a;

    /* renamed from: b  reason: collision with root package name */
    public final p f84b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f85c;

    /* renamed from: d  reason: collision with root package name */
    public final int f86d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f87e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f88f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f89g;

    /* renamed from: h  reason: collision with root package name */
    public View f90h;

    /* renamed from: i  reason: collision with root package name */
    public int f91i;

    /* renamed from: j  reason: collision with root package name */
    public int f92j;

    /* renamed from: k  reason: collision with root package name */
    public int f93k;

    /* renamed from: l  reason: collision with root package name */
    public int f94l;

    /* renamed from: m  reason: collision with root package name */
    public int f95m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f96n = false;

    /* renamed from: o  reason: collision with root package name */
    public Button f97o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f98p;

    /* renamed from: q  reason: collision with root package name */
    public Message f99q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f100r;

    /* renamed from: s  reason: collision with root package name */
    public Button f101s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f102t;

    /* renamed from: u  reason: collision with root package name */
    public Message f103u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f104v;

    /* renamed from: w  reason: collision with root package name */
    public Button f105w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f106x;

    /* renamed from: y  reason: collision with root package name */
    public Message f107y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f108z;

    public static class RecycleListView extends ListView {

        /* renamed from: b  reason: collision with root package name */
        public final int f109b;

        /* renamed from: c  reason: collision with root package name */
        public final int f110c;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.c.f2057t);
            this.f110c = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f109b = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r3 = r0.f107y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f97o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f99q
                if (r1 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x000f:
                android.widget.Button r1 = r0.f101s
                if (r3 != r1) goto L_0x0018
                android.os.Message r1 = r0.f103u
                if (r1 == 0) goto L_0x0018
                goto L_0x000a
            L_0x0018:
                android.widget.Button r1 = r0.f105w
                if (r3 != r1) goto L_0x0025
                android.os.Message r3 = r0.f107y
                if (r3 == 0) goto L_0x0025
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x002b
                r3.sendToTarget()
            L_0x002b:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.Q
                r1 = 1
                d.p r3 = r3.f84b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f112a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f113b;

        /* renamed from: c  reason: collision with root package name */
        public Drawable f114c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f115d;

        /* renamed from: e  reason: collision with root package name */
        public View f116e;

        /* renamed from: f  reason: collision with root package name */
        public DialogInterface.OnKeyListener f117f;

        /* renamed from: g  reason: collision with root package name */
        public ListAdapter f118g;

        /* renamed from: h  reason: collision with root package name */
        public DialogInterface.OnClickListener f119h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f120i;

        /* renamed from: j  reason: collision with root package name */
        public int f121j = -1;

        public b(Context context) {
            this.f112a = context;
            this.f113b = (LayoutInflater) context.getSystemService("layout_inflater");
        }
    }

    public static final class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DialogInterface> f122a;

        public c(DialogInterface dialogInterface) {
            this.f122a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == -3 || i2 == -2 || i2 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f122a.get(), message.what);
            } else if (i2 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i2, int i3, CharSequence[] charSequenceArr) {
            super(context, i2, i3, (Object[]) null);
        }

        public long getItemId(int i2) {
            return (long) i2;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, p pVar, Window window) {
        this.f83a = context;
        this.f84b = pVar;
        this.f85c = window;
        this.Q = new c(pVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, c.c.f2042e, R.attr.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(0, 0);
        this.K = obtainStyledAttributes.getResourceId(2, 0);
        this.L = obtainStyledAttributes.getResourceId(4, 0);
        this.M = obtainStyledAttributes.getResourceId(5, 0);
        this.N = obtainStyledAttributes.getResourceId(7, 0);
        this.O = obtainStyledAttributes.getResourceId(3, 0);
        this.P = obtainStyledAttributes.getBoolean(6, true);
        this.f86d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        pVar.a().t(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void c(View view, View view2, View view3) {
        int i2 = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i2 = 0;
            }
            view3.setVisibility(i2);
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final ViewGroup d(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
