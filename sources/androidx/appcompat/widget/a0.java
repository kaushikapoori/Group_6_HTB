package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.b;
import g0.u;
import g0.x;
import java.util.Objects;
import java.util.WeakHashMap;

public class a0 extends Spinner {

    /* renamed from: j  reason: collision with root package name */
    public static final int[] f487j = {16843505};

    /* renamed from: b  reason: collision with root package name */
    public final e f488b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f489c;

    /* renamed from: d  reason: collision with root package name */
    public l0 f490d;

    /* renamed from: e  reason: collision with root package name */
    public SpinnerAdapter f491e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f492f;

    /* renamed from: g  reason: collision with root package name */
    public f f493g;

    /* renamed from: h  reason: collision with root package name */
    public int f494h;

    /* renamed from: i  reason: collision with root package name */
    public final Rect f495i = new Rect();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (!a0.this.getInternalPopup().a()) {
                a0.this.b();
            }
            ViewTreeObserver viewTreeObserver = a0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    public class b implements f, DialogInterface.OnClickListener {

        /* renamed from: b  reason: collision with root package name */
        public androidx.appcompat.app.b f497b;

        /* renamed from: c  reason: collision with root package name */
        public ListAdapter f498c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f499d;

        public b() {
        }

        public boolean a() {
            androidx.appcompat.app.b bVar = this.f497b;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        public CharSequence b() {
            return this.f499d;
        }

        public void c(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        public int d() {
            return 0;
        }

        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f497b;
            if (bVar != null) {
                bVar.dismiss();
                this.f497b = null;
            }
        }

        public void f(int i2, int i3) {
            if (this.f498c != null) {
                b.a aVar = new b.a(a0.this.getPopupContext());
                CharSequence charSequence = this.f499d;
                if (charSequence != null) {
                    aVar.f126a.f115d = charSequence;
                }
                ListAdapter listAdapter = this.f498c;
                int selectedItemPosition = a0.this.getSelectedItemPosition();
                AlertController.b bVar = aVar.f126a;
                bVar.f118g = listAdapter;
                bVar.f119h = this;
                bVar.f121j = selectedItemPosition;
                bVar.f120i = true;
                androidx.appcompat.app.b a2 = aVar.a();
                this.f497b = a2;
                ListView listView = a2.f125d.f89g;
                listView.setTextDirection(i2);
                listView.setTextAlignment(i3);
                this.f497b.show();
            }
        }

        public void h(CharSequence charSequence) {
            this.f499d = charSequence;
        }

        public int j() {
            return 0;
        }

        public void l(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public void m(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public Drawable n() {
            return null;
        }

        public void o(ListAdapter listAdapter) {
            this.f498c = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            a0.this.setSelection(i2);
            if (a0.this.getOnItemClickListener() != null) {
                a0.this.performItemClick((View) null, i2, this.f498c.getItemId(i2));
            }
            androidx.appcompat.app.b bVar = this.f497b;
            if (bVar != null) {
                bVar.dismiss();
                this.f497b = null;
            }
        }

        public void p(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }
    }

    public static class c implements ListAdapter, SpinnerAdapter {

        /* renamed from: b  reason: collision with root package name */
        public SpinnerAdapter f501b;

        /* renamed from: c  reason: collision with root package name */
        public ListAdapter f502c;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f501b = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f502c = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof x0) {
                x0 x0Var = (x0) spinnerAdapter;
                if (x0Var.getDropDownViewTheme() == null) {
                    x0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f502c;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f501b;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f501b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.f501b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.f501b;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i2);
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f501b;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f501b;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f502c;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f501b;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f501b;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    public class d extends o0 implements f {
        public CharSequence D;
        public ListAdapter E;
        public final Rect F = new Rect();
        public int G;

        public class a implements AdapterView.OnItemClickListener {
            public a(a0 a0Var) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                a0.this.setSelection(i2);
                if (a0.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    a0.this.performItemClick(view, i2, dVar.E.getItemId(i2));
                }
                d.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public void onGlobalLayout() {
                d dVar = d.this;
                a0 a0Var = a0.this;
                Objects.requireNonNull(dVar);
                WeakHashMap<View, x> weakHashMap = u.f3063a;
                if (!(u.g.b(a0Var) && a0Var.getGlobalVisibleRect(dVar.F))) {
                    d.this.dismiss();
                    return;
                }
                d.this.t();
                d.this.i();
            }
        }

        public class c implements PopupWindow.OnDismissListener {

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f505b;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f505b = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = a0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f505b);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2, 0);
            this.f733p = a0.this;
            s(true);
            this.f734q = new a(a0.this);
        }

        public CharSequence b() {
            return this.D;
        }

        public void f(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean a2 = a();
            t();
            this.f743z.setInputMethodMode(2);
            i();
            j0 j0Var = this.f721d;
            j0Var.setChoiceMode(1);
            j0Var.setTextDirection(i2);
            j0Var.setTextAlignment(i3);
            int selectedItemPosition = a0.this.getSelectedItemPosition();
            j0 j0Var2 = this.f721d;
            if (a() && j0Var2 != null) {
                j0Var2.setListSelectionHidden(false);
                j0Var2.setSelection(selectedItemPosition);
                if (j0Var2.getChoiceMode() != 0) {
                    j0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!a2 && (viewTreeObserver = a0.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.f743z.setOnDismissListener(new c(bVar));
            }
        }

        public void h(CharSequence charSequence) {
            this.D = charSequence;
        }

        public void o(ListAdapter listAdapter) {
            super.o(listAdapter);
            this.E = listAdapter;
        }

        public void p(int i2) {
            this.G = i2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void t() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.n()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.a0 r1 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r1 = r1.f495i
                r0.getPadding(r1)
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                boolean r0 = androidx.appcompat.widget.i1.b(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r0 = r0.f495i
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r0 = r0.f495i
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r0 = r0.f495i
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.a0 r0 = androidx.appcompat.widget.a0.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.a0 r2 = androidx.appcompat.widget.a0.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.a0 r3 = androidx.appcompat.widget.a0.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.a0 r4 = androidx.appcompat.widget.a0.this
                int r5 = r4.f494h
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.E
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.n()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.a0 r5 = androidx.appcompat.widget.a0.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.a0 r6 = androidx.appcompat.widget.a0.this
                android.graphics.Rect r6 = r6.f495i
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.r(r4)
                goto L_0x0085
            L_0x0082:
                r8.r(r5)
            L_0x0085:
                androidx.appcompat.widget.a0 r4 = androidx.appcompat.widget.a0.this
                boolean r4 = androidx.appcompat.widget.i1.b(r4)
                if (r4 == 0) goto L_0x0096
                int r3 = r3 - r2
                int r0 = r8.f723f
                int r3 = r3 - r0
                int r0 = r8.G
                int r3 = r3 - r0
                int r3 = r3 + r1
                goto L_0x009b
            L_0x0096:
                int r2 = r8.G
                int r0 = r0 + r2
                int r3 = r0 + r1
            L_0x009b:
                r8.f724g = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.d.t():void");
        }
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b  reason: collision with root package name */
        public boolean f507b;

        public class a implements Parcelable.Creator<e> {
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public Object[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f507b = parcel.readByte() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f507b ? (byte) 1 : 0);
        }
    }

    public interface f {
        boolean a();

        CharSequence b();

        void c(int i2);

        int d();

        void dismiss();

        void f(int i2, int i3);

        void h(CharSequence charSequence);

        int j();

        void l(Drawable drawable);

        void m(int i2);

        Drawable n();

        void o(ListAdapter listAdapter);

        void p(int i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r4 != null) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a0(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            r9.<init>(r10, r11, r12)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.f495i = r0
            android.content.Context r0 = r9.getContext()
            androidx.appcompat.widget.w0.a(r9, r0)
            int[] r0 = c.c.f2059v
            r1 = 0
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r11, r0, r12, r1)
            androidx.appcompat.widget.e r2 = new androidx.appcompat.widget.e
            r2.<init>(r9)
            r9.f488b = r2
            r2 = 4
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L_0x002e
            h.c r3 = new h.c
            r3.<init>(r10, r2)
            r9.f489c = r3
            goto L_0x0030
        L_0x002e:
            r9.f489c = r10
        L_0x0030:
            r2 = 0
            r3 = -1
            int[] r4 = f487j     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            android.content.res.TypedArray r4 = r10.obtainStyledAttributes(r11, r4, r12, r1)     // Catch:{ Exception -> 0x004c, all -> 0x0049 }
            boolean r5 = r4.hasValue(r1)     // Catch:{ Exception -> 0x0047 }
            if (r5 == 0) goto L_0x0058
            int r3 = r4.getInt(r1, r1)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0058
        L_0x0043:
            r10 = move-exception
            r2 = r4
            goto L_0x00d0
        L_0x0047:
            r5 = move-exception
            goto L_0x004f
        L_0x0049:
            r10 = move-exception
            goto L_0x00d0
        L_0x004c:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L_0x004f:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x005b
        L_0x0058:
            r4.recycle()
        L_0x005b:
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0097
            if (r3 == r5) goto L_0x0062
            goto L_0x00a5
        L_0x0062:
            androidx.appcompat.widget.a0$d r3 = new androidx.appcompat.widget.a0$d
            android.content.Context r6 = r9.f489c
            r3.<init>(r6, r11, r12)
            android.content.Context r6 = r9.f489c
            int[] r7 = c.c.f2059v
            androidx.appcompat.widget.b1 r6 = androidx.appcompat.widget.b1.q(r6, r11, r7, r12, r1)
            r7 = 3
            r8 = -2
            int r7 = r6.k(r7, r8)
            r9.f494h = r7
            android.graphics.drawable.Drawable r7 = r6.g(r5)
            android.widget.PopupWindow r8 = r3.f743z
            r8.setBackgroundDrawable(r7)
            java.lang.String r4 = r0.getString(r4)
            r3.D = r4
            android.content.res.TypedArray r4 = r6.f527b
            r4.recycle()
            r9.f493g = r3
            androidx.appcompat.widget.z r4 = new androidx.appcompat.widget.z
            r4.<init>(r9, r9, r3)
            r9.f490d = r4
            goto L_0x00a5
        L_0x0097:
            androidx.appcompat.widget.a0$b r3 = new androidx.appcompat.widget.a0$b
            r3.<init>()
            r9.f493g = r3
            java.lang.String r4 = r0.getString(r4)
            r3.h(r4)
        L_0x00a5:
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto L_0x00bc
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r4 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r10, r4, r1)
            r10 = 2131427430(0x7f0b0066, float:1.8476476E38)
            r3.setDropDownViewResource(r10)
            r9.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00bc:
            r0.recycle()
            r9.f492f = r5
            android.widget.SpinnerAdapter r10 = r9.f491e
            if (r10 == 0) goto L_0x00ca
            r9.setAdapter((android.widget.SpinnerAdapter) r10)
            r9.f491e = r2
        L_0x00ca:
            androidx.appcompat.widget.e r10 = r9.f488b
            r10.d(r11, r12)
            return
        L_0x00d0:
            if (r2 == 0) goto L_0x00d5
            r2.recycle()
        L_0x00d5:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.a0.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.f495i);
        Rect rect = this.f495i;
        return i3 + rect.left + rect.right;
    }

    public void b() {
        this.f493g.f(getTextDirection(), getTextAlignment());
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f488b;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        f fVar = this.f493g;
        return fVar != null ? fVar.d() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        f fVar = this.f493g;
        return fVar != null ? fVar.j() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.f493g != null ? this.f494h : super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f493g;
    }

    public Drawable getPopupBackground() {
        f fVar = this.f493g;
        return fVar != null ? fVar.n() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f489c;
    }

    public CharSequence getPrompt() {
        f fVar = this.f493g;
        return fVar != null ? fVar.b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f488b;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f488b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f493g;
        if (fVar != null && fVar.a()) {
            this.f493g.dismiss();
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f493g != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (eVar.f507b && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.f493g;
        eVar.f507b = fVar != null && fVar.a();
        return eVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        l0 l0Var = this.f490d;
        if (l0Var == null || !l0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        f fVar = this.f493g;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.a()) {
            return true;
        }
        b();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f492f) {
            this.f491e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f493g != null) {
            Context context = this.f489c;
            if (context == null) {
                context = getContext();
            }
            this.f493g.o(new c(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f488b;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f488b;
        if (eVar != null) {
            eVar.f(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        f fVar = this.f493g;
        if (fVar != null) {
            fVar.p(i2);
            this.f493g.c(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    public void setDropDownVerticalOffset(int i2) {
        f fVar = this.f493g;
        if (fVar != null) {
            fVar.m(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.f493g != null) {
            this.f494h = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f493g;
        if (fVar != null) {
            fVar.l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(e.a.b(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f493g;
        if (fVar != null) {
            fVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f488b;
        if (eVar != null) {
            eVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f488b;
        if (eVar != null) {
            eVar.i(mode);
        }
    }
}
