package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

public class c extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public int f3093a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f3094b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f3095c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f3096d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f3097e;

    public c() {
        super((Context) null);
    }

    public c(Context context, int i2) {
        super(context);
        this.f3093a = i2;
    }

    public void a(Configuration configuration) {
        if (this.f3097e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f3096d == null) {
            this.f3096d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f3094b == null) {
            this.f3094b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3094b.setTo(theme);
            }
        }
        this.f3094b.applyStyle(this.f3093a, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        if (this.f3097e == null) {
            Configuration configuration = this.f3096d;
            this.f3097e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f3097e;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3095c == null) {
            this.f3095c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3095c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f3094b;
        if (theme != null) {
            return theme;
        }
        if (this.f3093a == 0) {
            this.f3093a = 2131755526;
        }
        b();
        return this.f3094b;
    }

    public void setTheme(int i2) {
        if (this.f3093a != i2) {
            this.f3093a = i2;
            b();
        }
    }
}
