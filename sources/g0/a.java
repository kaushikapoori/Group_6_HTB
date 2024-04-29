package g0;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.example.supermarket.R;
import g0.u;
import h0.d;
import h0.e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final View.AccessibilityDelegate f2993c = new View.AccessibilityDelegate();

    /* renamed from: a  reason: collision with root package name */
    public final View.AccessibilityDelegate f2994a;

    /* renamed from: b  reason: collision with root package name */
    public final View.AccessibilityDelegate f2995b;

    /* renamed from: g0.a$a  reason: collision with other inner class name */
    public static final class C0031a extends View.AccessibilityDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final a f2996a;

        public C0031a(a aVar) {
            this.f2996a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2996a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            e b2 = this.f2996a.b(view);
            if (b2 != null) {
                return (AccessibilityNodeProvider) b2.f3177a;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2996a.c(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            Object obj;
            Object obj2;
            int i2;
            View view2 = view;
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
            Class<Boolean> cls = Boolean.class;
            d dVar = new d(accessibilityNodeInfo2);
            WeakHashMap<View, x> weakHashMap = u.f3063a;
            int i3 = Build.VERSION.SDK_INT;
            boolean z2 = true;
            Object obj3 = null;
            if (i3 >= 28) {
                obj = Boolean.valueOf(u.l.d(view));
            } else {
                obj = view2.getTag(R.id.tag_screen_reader_focusable);
                if (!cls.isInstance(obj)) {
                    obj = null;
                }
            }
            Boolean bool = (Boolean) obj;
            boolean z3 = bool != null && bool.booleanValue();
            if (i3 >= 28) {
                accessibilityNodeInfo2.setScreenReaderFocusable(z3);
            } else {
                dVar.h(1, z3);
            }
            if (i3 >= 28) {
                obj2 = Boolean.valueOf(u.l.c(view));
            } else {
                Object tag = view2.getTag(R.id.tag_accessibility_heading);
                obj2 = cls.isInstance(tag) ? tag : null;
            }
            Boolean bool2 = (Boolean) obj2;
            boolean z4 = bool2 != null && bool2.booleanValue();
            if (i3 >= 28) {
                accessibilityNodeInfo2.setHeading(z4);
            } else {
                dVar.h(2, z4);
            }
            CharSequence i4 = u.i(view);
            if (i3 >= 28) {
                accessibilityNodeInfo2.setPaneTitle(i4);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", i4);
            }
            Class<CharSequence> cls2 = CharSequence.class;
            if (i3 >= 30) {
                obj3 = u.n.a(view);
            } else {
                Object tag2 = view2.getTag(R.id.tag_state_description);
                if (cls2.isInstance(tag2)) {
                    obj3 = tag2;
                }
            }
            CharSequence charSequence = (CharSequence) obj3;
            if (i3 < 30) {
                z2 = false;
            }
            if (z2) {
                accessibilityNodeInfo2.setStateDescription(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.f2996a.d(view2, dVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i3 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                        if (((WeakReference) sparseArray.valueAt(i5)).get() == null) {
                            arrayList.add(Integer.valueOf(i5));
                        }
                    }
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        sparseArray.remove(((Integer) arrayList.get(i6)).intValue());
                    }
                }
                ClickableSpan[] d2 = d.d(text);
                if (d2 != null && d2.length > 0) {
                    dVar.f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    SparseArray sparseArray2 = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view2.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                    }
                    for (int i7 = 0; i7 < d2.length; i7++) {
                        ClickableSpan clickableSpan = d2[i7];
                        int i8 = 0;
                        while (true) {
                            if (i8 >= sparseArray2.size()) {
                                i2 = d.f3159d;
                                d.f3159d = i2 + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i8)).get())) {
                                i2 = sparseArray2.keyAt(i8);
                                break;
                            } else {
                                i8++;
                            }
                        }
                        sparseArray2.put(i2, new WeakReference(d2[i7]));
                        ClickableSpan clickableSpan2 = d2[i7];
                        Spanned spanned = (Spanned) text;
                        dVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        dVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        dVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        dVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
                    }
                }
            }
            List list = (List) view2.getTag(R.id.tag_accessibility_actions);
            if (list == null) {
                list = Collections.emptyList();
            }
            for (int i9 = 0; i9 < list.size(); i9++) {
                dVar.a((d.a) list.get(i9));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2996a.e(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2996a.f(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            return this.f2996a.g(view, i2, bundle);
        }

        public void sendAccessibilityEvent(View view, int i2) {
            this.f2996a.h(view, i2);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2996a.i(view, accessibilityEvent);
        }
    }

    public a() {
        this.f2994a = f2993c;
        this.f2995b = new C0031a(this);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2994a = accessibilityDelegate;
        this.f2995b = new C0031a(this);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2994a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public e b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2994a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new e(accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2994a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, d dVar) {
        this.f2994a.onInitializeAccessibilityNodeInfo(view, dVar.f3160a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2994a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2994a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            r0 = 2131231141(0x7f0801a5, float:1.8078355E38)
            java.lang.Object r0 = r9.getTag(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x000f
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x000f:
            r1 = 0
            r2 = 0
        L_0x0011:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x0070
            java.lang.Object r3 = r0.get(r2)
            h0.d$a r3 = (h0.d.a) r3
            int r4 = r3.a()
            if (r4 != r10) goto L_0x006d
            h0.f r0 = r3.f3174d
            if (r0 == 0) goto L_0x0070
            r0 = 0
            java.lang.Class<? extends h0.f$a> r2 = r3.f3173c
            if (r2 == 0) goto L_0x0066
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0040 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch:{ Exception -> 0x0040 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0040 }
            java.lang.Object r2 = r2.newInstance(r4)     // Catch:{ Exception -> 0x0040 }
            h0.f$a r2 = (h0.f.a) r2     // Catch:{ Exception -> 0x0040 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ Exception -> 0x003e }
            goto L_0x0065
        L_0x003e:
            r0 = move-exception
            goto L_0x0044
        L_0x0040:
            r2 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
        L_0x0044:
            java.lang.Class<? extends h0.f$a> r4 = r3.f3173c
            if (r4 != 0) goto L_0x004b
            java.lang.String r4 = "null"
            goto L_0x004f
        L_0x004b:
            java.lang.String r4 = r4.getName()
        L_0x004f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to execute command with argument class ViewCommandArgument: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "A11yActionCompat"
            android.util.Log.e(r5, r4, r0)
        L_0x0065:
            r0 = r2
        L_0x0066:
            h0.f r2 = r3.f3174d
            boolean r0 = r2.a(r9, r0)
            goto L_0x0071
        L_0x006d:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0070:
            r0 = 0
        L_0x0071:
            if (r0 != 0) goto L_0x0079
            android.view.View$AccessibilityDelegate r0 = r8.f2994a
            boolean r0 = r0.performAccessibilityAction(r9, r10, r11)
        L_0x0079:
            if (r0 != 0) goto L_0x00ca
            r2 = 2131230735(0x7f08000f, float:1.8077531E38)
            if (r10 != r2) goto L_0x00ca
            r10 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r10 = r11.getInt(r0, r10)
            r11 = 2131231142(0x7f0801a6, float:1.8078357E38)
            java.lang.Object r11 = r9.getTag(r11)
            android.util.SparseArray r11 = (android.util.SparseArray) r11
            r0 = 1
            if (r11 == 0) goto L_0x00c9
            java.lang.Object r10 = r11.get(r10)
            java.lang.ref.WeakReference r10 = (java.lang.ref.WeakReference) r10
            if (r10 == 0) goto L_0x00c9
            java.lang.Object r10 = r10.get()
            android.text.style.ClickableSpan r10 = (android.text.style.ClickableSpan) r10
            if (r10 == 0) goto L_0x00c2
            android.view.accessibility.AccessibilityNodeInfo r11 = r9.createAccessibilityNodeInfo()
            java.lang.CharSequence r11 = r11.getText()
            android.text.style.ClickableSpan[] r11 = h0.d.d(r11)
            r2 = 0
        L_0x00b0:
            if (r11 == 0) goto L_0x00c2
            int r3 = r11.length
            if (r2 >= r3) goto L_0x00c2
            r3 = r11[r2]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x00bf
            r11 = 1
            goto L_0x00c3
        L_0x00bf:
            int r2 = r2 + 1
            goto L_0x00b0
        L_0x00c2:
            r11 = 0
        L_0x00c3:
            if (r11 == 0) goto L_0x00c9
            r10.onClick(r9)
            r1 = 1
        L_0x00c9:
            r0 = r1
        L_0x00ca:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.a.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public void h(View view, int i2) {
        this.f2994a.sendAccessibilityEvent(view, i2);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2994a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
