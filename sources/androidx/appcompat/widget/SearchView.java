package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.supermarket.R;
import g0.u;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

public class SearchView extends m0 implements h.b {

    /* renamed from: n0  reason: collision with root package name */
    public static final n f388n0 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    public Rect A;
    public Rect B;
    public int[] C;
    public int[] D;
    public final ImageView E;
    public final Drawable F;
    public final int G;
    public final int H;
    public final Intent I;
    public final Intent J;
    public final CharSequence K;
    public l L;
    public k M;
    public View.OnFocusChangeListener N;
    public m O;
    public View.OnClickListener P;
    public boolean Q;
    public boolean R;
    public k0.a S;
    public boolean T;
    public CharSequence U;
    public boolean V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public int f389a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f390b0;

    /* renamed from: c0  reason: collision with root package name */
    public CharSequence f391c0;

    /* renamed from: d0  reason: collision with root package name */
    public CharSequence f392d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f393e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f394f0;

    /* renamed from: g0  reason: collision with root package name */
    public SearchableInfo f395g0;

    /* renamed from: h0  reason: collision with root package name */
    public Bundle f396h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Runnable f397i0;

    /* renamed from: j0  reason: collision with root package name */
    public Runnable f398j0;

    /* renamed from: k0  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f399k0;

    /* renamed from: l0  reason: collision with root package name */
    public View.OnKeyListener f400l0;

    /* renamed from: m0  reason: collision with root package name */
    public TextWatcher f401m0;

    /* renamed from: q  reason: collision with root package name */
    public final SearchAutoComplete f402q;

    /* renamed from: r  reason: collision with root package name */
    public final View f403r;

    /* renamed from: s  reason: collision with root package name */
    public final View f404s;

    /* renamed from: t  reason: collision with root package name */
    public final View f405t;

    /* renamed from: u  reason: collision with root package name */
    public final ImageView f406u;

    /* renamed from: v  reason: collision with root package name */
    public final ImageView f407v;

    /* renamed from: w  reason: collision with root package name */
    public final ImageView f408w;

    /* renamed from: x  reason: collision with root package name */
    public final ImageView f409x;

    /* renamed from: y  reason: collision with root package name */
    public final View f410y;

    /* renamed from: z  reason: collision with root package name */
    public p f411z;

    public static class SearchAutoComplete extends d {

        /* renamed from: f  reason: collision with root package name */
        public int f412f = getThreshold();

        /* renamed from: g  reason: collision with root package name */
        public SearchView f413g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f414h;

        /* renamed from: i  reason: collision with root package name */
        public final Runnable f415i = new a();

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f414h) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f414h = false;
                }
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            n nVar = SearchView.f388n0;
            Objects.requireNonNull(nVar);
            n.a();
            Method method = nVar.f429c;
            if (method != null) {
                try {
                    method.invoke(this, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }

        public boolean enoughToFilter() {
            return this.f412f <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f414h) {
                removeCallbacks(this.f415i);
                post(this.f415i);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z2, int i2, Rect rect) {
            super.onFocusChanged(z2, i2, rect);
            SearchView searchView = this.f413g;
            searchView.A(searchView.R);
            searchView.post(searchView.f397i0);
            if (searchView.f402q.hasFocus()) {
                searchView.n();
            }
        }

        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f413g.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        public void onWindowFocusChanged(boolean z2) {
            super.onWindowFocusChanged(z2);
            if (z2 && this.f413g.hasFocus() && getVisibility() == 0) {
                boolean z3 = true;
                this.f414h = true;
                Context context = getContext();
                n nVar = SearchView.f388n0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z3 = false;
                }
                if (z3) {
                    a();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z2) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z2) {
                this.f414h = false;
                removeCallbacks(this.f415i);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f414h = false;
                removeCallbacks(this.f415i);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f414h = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f413g = searchView;
        }

        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f412f = i2;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.f402q.getText();
            searchView.f392d0 = text;
            boolean z2 = !TextUtils.isEmpty(text);
            searchView.z(z2);
            searchView.B(!z2);
            searchView.v();
            searchView.y();
            if (searchView.L != null && !TextUtils.equals(charSequence, searchView.f391c0)) {
                searchView.L.b(charSequence.toString());
            }
            searchView.f391c0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.w();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            k0.a aVar = SearchView.this.S;
            if (aVar instanceof v0) {
                aVar.b((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View view, boolean z2) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z2);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            SearchView searchView = SearchView.this;
            if (searchView.f410y.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.f404s.getPaddingLeft();
                Rect rect = new Rect();
                boolean b2 = i1.b(searchView);
                int dimensionPixelSize = searchView.Q ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) : 0;
                searchView.f402q.getDropDownBackground().getPadding(rect);
                searchView.f402q.setDropDownHorizontalOffset(b2 ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize));
                searchView.f402q.setDropDownWidth((((searchView.f410y.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f406u) {
                searchView.t();
            } else if (view == searchView.f408w) {
                searchView.p();
            } else if (view == searchView.f407v) {
                searchView.u();
            } else if (view == searchView.f409x) {
                SearchableInfo searchableInfo = searchView.f395g0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.I);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.m(searchView.J, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.f402q) {
                searchView.n();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f395g0 == null) {
                return false;
            }
            if (!searchView.f402q.isPopupShowing() || SearchView.this.f402q.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.f402q.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.o(0, (String) null, searchView2.f402q.getText().toString());
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.f395g0 == null || searchView3.S == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return searchView3.q(searchView3.f402q.getListSelection());
            }
            if (i2 == 21 || i2 == 22) {
                searchView3.f402q.setSelection(i2 == 21 ? 0 : searchView3.f402q.length());
                searchView3.f402q.setListSelection(0);
                searchView3.f402q.clearListSelection();
                searchView3.f402q.a();
                return true;
            } else if (i2 != 19) {
                return false;
            } else {
                searchView3.f402q.getListSelection();
                return false;
            }
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.u();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.q(i2);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.r(i2);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public Method f427a = null;

        /* renamed from: b  reason: collision with root package name */
        public Method f428b = null;

        /* renamed from: c  reason: collision with root package name */
        public Method f429c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f427a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f428b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f429c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class o extends l0.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        public boolean f430d;

        public class a implements Parcelable.ClassLoaderCreator<o> {
            public Object createFromParcel(Parcel parcel) {
                return new o(parcel, (ClassLoader) null);
            }

            public Object[] newArray(int i2) {
                return new o[i2];
            }

            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f430d = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = androidx.activity.result.a.a("SearchView.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" isIconified=");
            a2.append(this.f430d);
            a2.append("}");
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.f3321b, i2);
            parcel.writeValue(Boolean.valueOf(this.f430d));
        }
    }

    public static class p extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f431a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f432b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final Rect f433c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        public final Rect f434d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        public final int f435e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f436f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f435e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f431a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f432b.set(rect);
            this.f434d.set(rect);
            Rect rect3 = this.f434d;
            int i2 = this.f435e;
            rect3.inset(-i2, -i2);
            this.f433c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f436f
                r7.f436f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f436f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.f434d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f432b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f436f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x006e
                if (r2 == 0) goto L_0x005b
                android.graphics.Rect r2 = r7.f433c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005b
                android.view.View r0 = r7.f431a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.f431a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0064
            L_0x005b:
                android.graphics.Rect r2 = r7.f433c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0064:
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                android.view.View r0 = r7.f431a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x006e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Context context2 = context;
        this.A = new Rect();
        this.B = new Rect();
        this.C = new int[2];
        this.D = new int[2];
        this.f397i0 = new b();
        this.f398j0 = new c();
        this.f399k0 = new WeakHashMap<>();
        f fVar = new f();
        this.f400l0 = new g();
        h hVar = new h();
        i iVar = new i();
        j jVar = new j();
        this.f401m0 = new a();
        int[] iArr = c.c.f2058u;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i2;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i3, 0);
        b1 b1Var = new b1(context2, obtainStyledAttributes);
        TypedArray typedArray = obtainStyledAttributes;
        u.t(this, context, iArr, attributeSet2, obtainStyledAttributes, i3, 0);
        LayoutInflater.from(context).inflate(b1Var.l(9, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f402q = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f403r = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f404s = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f405t = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f406u = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f407v = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f408w = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f409x = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.E = imageView5;
        u.d.q(findViewById, b1Var.g(10));
        u.d.q(findViewById2, b1Var.g(14));
        imageView.setImageDrawable(b1Var.g(13));
        imageView2.setImageDrawable(b1Var.g(7));
        imageView3.setImageDrawable(b1Var.g(4));
        imageView4.setImageDrawable(b1Var.g(16));
        imageView5.setImageDrawable(b1Var.g(13));
        this.F = b1Var.g(12);
        e1.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.G = b1Var.l(15, R.layout.abc_search_dropdown_item_icons_2line);
        this.H = b1Var.l(5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f401m0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f400l0);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(b1Var.a(8, true));
        int f2 = b1Var.f(1, -1);
        if (f2 != -1) {
            setMaxWidth(f2);
        }
        this.K = b1Var.n(6);
        this.U = b1Var.n(11);
        int j2 = b1Var.j(3, -1);
        if (j2 != -1) {
            setImeOptions(j2);
        }
        int j3 = b1Var.j(2, -1);
        if (j3 != -1) {
            setInputType(j3);
        }
        setFocusable(b1Var.a(0, true));
        typedArray.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.I = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.J = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f410y = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        A(this.Q);
        x();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f402q.setText(charSequence);
        this.f402q.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public final void A(boolean z2) {
        this.R = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f402q.getText());
        this.f406u.setVisibility(i3);
        z(z3);
        this.f403r.setVisibility(z2 ? 8 : 0);
        if (this.E.getDrawable() == null || this.Q) {
            i2 = 8;
        }
        this.E.setVisibility(i2);
        v();
        B(!z3);
        y();
    }

    public final void B(boolean z2) {
        int i2 = 8;
        if (this.f390b0 && !this.R && z2) {
            this.f407v.setVisibility(8);
            i2 = 0;
        }
        this.f409x.setVisibility(i2);
    }

    public void a() {
        if (!this.f393e0) {
            this.f393e0 = true;
            int imeOptions = this.f402q.getImeOptions();
            this.f394f0 = imeOptions;
            this.f402q.setImeOptions(imeOptions | 33554432);
            this.f402q.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.W = true;
        super.clearFocus();
        this.f402q.clearFocus();
        this.f402q.setImeVisibility(false);
        this.W = false;
    }

    public void e() {
        this.f402q.setText("");
        SearchAutoComplete searchAutoComplete = this.f402q;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f392d0 = "";
        clearFocus();
        A(true);
        this.f402q.setImeOptions(this.f394f0);
        this.f393e0 = false;
    }

    public int getImeOptions() {
        return this.f402q.getImeOptions();
    }

    public int getInputType() {
        return this.f402q.getInputType();
    }

    public int getMaxWidth() {
        return this.f389a0;
    }

    public CharSequence getQuery() {
        return this.f402q.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.U;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f395g0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.K : getContext().getText(this.f395g0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.H;
    }

    public int getSuggestionRowLayout() {
        return this.G;
    }

    public k0.a getSuggestionsAdapter() {
        return this.S;
    }

    public final Intent l(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f392d0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f396h0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f395g0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f396h0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public void n() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f402q.refreshAutoCompleteResults();
            return;
        }
        n nVar = f388n0;
        SearchAutoComplete searchAutoComplete = this.f402q;
        Objects.requireNonNull(nVar);
        n.a();
        Method method = nVar.f427a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        n nVar2 = f388n0;
        SearchAutoComplete searchAutoComplete2 = this.f402q;
        Objects.requireNonNull(nVar2);
        n.a();
        Method method2 = nVar2.f428b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete2, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public void o(int i2, String str, String str2) {
        getContext().startActivity(l("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i2, (String) null));
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f397i0);
        post(this.f398j0);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.f402q;
            Rect rect = this.A;
            searchAutoComplete.getLocationInWindow(this.C);
            getLocationInWindow(this.D);
            int[] iArr = this.C;
            int i6 = iArr[1];
            int[] iArr2 = this.D;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.B;
            Rect rect3 = this.A;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            p pVar = this.f411z;
            if (pVar == null) {
                p pVar2 = new p(this.B, this.A, this.f402q);
                this.f411z = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.B, this.A);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r0 <= 0) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.R
            if (r0 == 0) goto L_0x0008
            super.onMeasure(r4, r5)
            return
        L_0x0008:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002a
            if (r0 == 0) goto L_0x0020
            if (r0 == r2) goto L_0x001b
            goto L_0x0037
        L_0x001b:
            int r0 = r3.f389a0
            if (r0 <= 0) goto L_0x0037
            goto L_0x002e
        L_0x0020:
            int r4 = r3.f389a0
            if (r4 <= 0) goto L_0x0025
            goto L_0x0037
        L_0x0025:
            int r4 = r3.getPreferredWidth()
            goto L_0x0037
        L_0x002a:
            int r0 = r3.f389a0
            if (r0 <= 0) goto L_0x002f
        L_0x002e:
            goto L_0x0033
        L_0x002f:
            int r0 = r3.getPreferredWidth()
        L_0x0033:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0037:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x0049
            if (r0 == 0) goto L_0x0044
            goto L_0x0051
        L_0x0044:
            int r5 = r3.getPreferredHeight()
            goto L_0x0051
        L_0x0049:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0051:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.f3321b);
        A(oVar.f430d);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f430d = this.R;
        return oVar;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.f397i0);
    }

    public void p() {
        if (!TextUtils.isEmpty(this.f402q.getText())) {
            this.f402q.setText("");
            this.f402q.requestFocus();
            this.f402q.setImeVisibility(true);
        } else if (this.Q) {
            k kVar = this.M;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                A(true);
            }
        }
    }

    public boolean q(int i2) {
        int i3;
        String h2;
        m mVar = this.O;
        if (mVar != null && mVar.b(i2)) {
            return false;
        }
        Cursor cursor = this.S.f3296d;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i4 = v0.f794z;
                String h3 = v0.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h3 == null) {
                    h3 = this.f395g0.getSuggestIntentAction();
                }
                if (h3 == null) {
                    h3 = "android.intent.action.SEARCH";
                }
                String str = h3;
                String h4 = v0.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h4 == null) {
                    h4 = this.f395g0.getSuggestIntentData();
                }
                if (!(h4 == null || (h2 = v0.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    h4 = h4 + "/" + Uri.encode(h2);
                }
                intent = l(str, h4 == null ? null : Uri.parse(h4), v0.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), v0.h(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, (String) null);
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        this.f402q.setImeVisibility(false);
        this.f402q.dismissDropDown();
        return true;
    }

    public boolean r(int i2) {
        CharSequence c2;
        m mVar = this.O;
        if (mVar != null && mVar.a(i2)) {
            return false;
        }
        Editable text = this.f402q.getText();
        Cursor cursor = this.S.f3296d;
        if (cursor == null) {
            return true;
        }
        if (!cursor.moveToPosition(i2) || (c2 = this.S.c(cursor)) == null) {
            setQuery(text);
            return true;
        }
        setQuery(c2);
        return true;
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.W || !isFocusable()) {
            return false;
        }
        if (this.R) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.f402q.requestFocus(i2, rect);
        if (requestFocus) {
            A(false);
        }
        return requestFocus;
    }

    public void s(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void setAppSearchData(Bundle bundle) {
        this.f396h0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            p();
        } else {
            t();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.Q != z2) {
            this.Q = z2;
            A(z2);
            x();
        }
    }

    public void setImeOptions(int i2) {
        this.f402q.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f402q.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.f389a0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.M = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.L = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.O = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.U = charSequence;
        x();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.V = z2;
        k0.a aVar = this.S;
        if (aVar instanceof v0) {
            ((v0) aVar).f800r = z2 ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, 65536) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.f395g0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f402q
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f402q
            android.app.SearchableInfo r3 = r6.f395g0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.f395g0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.f395g0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f402q
            r3.setInputType(r7)
            k0.a r7 = r6.S
            if (r7 == 0) goto L_0x0042
            r7.b(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.f395g0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            androidx.appcompat.widget.v0 r7 = new androidx.appcompat.widget.v0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.f395g0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.f399k0
            r7.<init>(r3, r6, r4, r5)
            r6.S = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.f402q
            r3.setAdapter(r7)
            k0.a r7 = r6.S
            androidx.appcompat.widget.v0 r7 = (androidx.appcompat.widget.v0) r7
            boolean r3 = r6.V
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            r7.f800r = r3
        L_0x006b:
            r6.x()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.f395g0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.f395g0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.I
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.f395g0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.J
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            r6.f390b0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.f402q
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.R
            r6.A(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.T = z2;
        A(this.R);
    }

    public void setSuggestionsAdapter(k0.a aVar) {
        this.S = aVar;
        this.f402q.setAdapter(aVar);
    }

    public void t() {
        A(false);
        this.f402q.requestFocus();
        this.f402q.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void u() {
        Editable text = this.f402q.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            l lVar = this.L;
            if (lVar == null || !lVar.a(text.toString())) {
                if (this.f395g0 != null) {
                    o(0, (String) null, text.toString());
                }
                this.f402q.setImeVisibility(false);
                this.f402q.dismissDropDown();
            }
        }
    }

    public final void v() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f402q.getText());
        int i2 = 0;
        if (!z3 && (!this.Q || this.f393e0)) {
            z2 = false;
        }
        ImageView imageView = this.f408w;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.f408w.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void w() {
        int[] iArr = this.f402q.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f404s.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f405t.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void x() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f402q;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.Q && this.F != null) {
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            this.F.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void y() {
        int i2 = 0;
        if (!((this.T || this.f390b0) && !this.R) || !(this.f407v.getVisibility() == 0 || this.f409x.getVisibility() == 0)) {
            i2 = 8;
        }
        this.f405t.setVisibility(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.f390b0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.T
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.f390b0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.R
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.f390b0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.f407v
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.z(boolean):void");
    }
}
