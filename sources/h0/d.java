package h0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import h0.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class d {

    /* renamed from: d  reason: collision with root package name */
    public static int f3159d;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f3160a;

    /* renamed from: b  reason: collision with root package name */
    public int f3161b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f3162c = -1;

    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f3163e = new a(16, (CharSequence) null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f3164f = new a(4096, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f3165g = new a(8192, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f3166h = new a(262144, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f3167i = new a(524288, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f3168j = new a(1048576, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f3169k;

        /* renamed from: l  reason: collision with root package name */
        public static final a f3170l;

        /* renamed from: a  reason: collision with root package name */
        public final Object f3171a;

        /* renamed from: b  reason: collision with root package name */
        public final int f3172b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends f.a> f3173c;

        /* renamed from: d  reason: collision with root package name */
        public final f f3174d;

        static {
            Class<f.c> cls = f.c.class;
            Class<f.b> cls2 = f.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            new a(1, (CharSequence) null);
            new a(2, (CharSequence) null);
            new a(4, (CharSequence) null);
            new a(8, (CharSequence) null);
            new a(32, (CharSequence) null);
            new a(64, (CharSequence) null);
            new a(128, (CharSequence) null);
            new a(256, (CharSequence) null, cls2);
            new a(512, (CharSequence) null, cls2);
            new a(1024, (CharSequence) null, cls);
            new a(2048, (CharSequence) null, cls);
            new a(16384, (CharSequence) null);
            new a(32768, (CharSequence) null);
            new a(65536, (CharSequence) null);
            new a(131072, (CharSequence) null, f.g.class);
            new a(2097152, (CharSequence) null, f.h.class);
            int i2 = Build.VERSION.SDK_INT;
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, (CharSequence) null, (f) null, f.e.class);
            f3169k = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            f3170l = new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(i2 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(i2 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (f) null, f.C0034f.class);
            new a(i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (f) null, f.d.class);
            new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            new a(i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
            if (i2 >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            new a(accessibilityAction, 16908372, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        }

        public a(int i2, CharSequence charSequence) {
            this((Object) null, i2, (CharSequence) null, (f) null, (Class<? extends f.a>) null);
        }

        public a(int i2, CharSequence charSequence, Class<? extends f.a> cls) {
            this((Object) null, i2, (CharSequence) null, (f) null, cls);
        }

        public a(Object obj, int i2, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f3172b = i2;
            this.f3174d = fVar;
            this.f3171a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence) : obj;
            this.f3173c = cls;
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3171a).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f3171a).getLabel();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f3171a;
            Object obj3 = ((a) obj).f3171a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f3171a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Object f3175a;

        public b(Object obj) {
            this.f3175a = obj;
        }

        public static b a(int i2, int i3, boolean z2, int i4) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i3, z2, i4));
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f3176a;

        public c(Object obj) {
            this.f3176a = obj;
        }

        public static c a(int i2, int i3, int i4, int i5, boolean z2, boolean z3) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i3, i4, i5, z2, z3));
        }
    }

    public d(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3160a = accessibilityNodeInfo;
    }

    public static String c(int i2) {
        if (i2 == 1) {
            return "ACTION_FOCUS";
        }
        if (i2 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i2) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i2) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i2) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static ClickableSpan[] d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void a(a aVar) {
        this.f3160a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f3171a);
    }

    public final List<Integer> b(String str) {
        ArrayList<Integer> integerArrayList = this.f3160a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f3160a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public CharSequence e() {
        return this.f3160a.getContentDescription();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3160a;
        if (accessibilityNodeInfo == null) {
            if (dVar.f3160a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(dVar.f3160a)) {
            return false;
        }
        return this.f3162c == dVar.f3162c && this.f3161b == dVar.f3161b;
    }

    public Bundle f() {
        return this.f3160a.getExtras();
    }

    public CharSequence g() {
        if (!(!b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f3160a.getText();
        }
        List<Integer> b2 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> b3 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> b4 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> b5 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f3160a.getText(), 0, this.f3160a.getText().length()));
        for (int i2 = 0; i2 < b2.size(); i2++) {
            spannableString.setSpan(new a(b5.get(i2).intValue(), this, f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), b2.get(i2).intValue(), b3.get(i2).intValue(), b4.get(i2).intValue());
        }
        return spannableString;
    }

    public final void h(int i2, boolean z2) {
        Bundle f2 = f();
        if (f2 != null) {
            int i3 = f2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i2);
            if (!z2) {
                i2 = 0;
            }
            f2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i2 | i3);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f3160a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(Object obj) {
        this.f3160a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f3175a);
    }

    public void j(Object obj) {
        this.f3160a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f3176a);
    }

    public void k(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3160a.setHintText(charSequence);
        } else {
            this.f3160a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void l(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f3160a.setTraversalAfter(view);
        }
    }

    public String toString() {
        ArrayList arrayList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.f3160a.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.f3160a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f3160a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f3160a.getClassName());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; contentDescription: ");
        sb.append(e());
        sb.append("; viewId: ");
        sb.append(this.f3160a.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.f3160a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f3160a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f3160a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f3160a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f3160a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f3160a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f3160a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f3160a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f3160a.isPassword());
        sb.append("; scrollable: " + this.f3160a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f3160a.getActionList();
        if (actionList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(new a(actionList.get(i2), 0, (CharSequence) null, (f) null, (Class<? extends f.a>) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            a aVar = (a) arrayList.get(i3);
            String c2 = c(aVar.a());
            if (c2.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                c2 = aVar.b().toString();
            }
            sb.append(c2);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
