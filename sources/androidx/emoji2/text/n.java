package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public final class n extends SpannableStringBuilder {

    /* renamed from: b  reason: collision with root package name */
    public final Class<?> f1187b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f1188c = new ArrayList();

    public static class a implements TextWatcher, SpanWatcher {

        /* renamed from: b  reason: collision with root package name */
        public final Object f1189b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicInteger f1190c = new AtomicInteger(0);

        public a(Object obj) {
            this.f1189b = obj;
        }

        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f1189b).afterTextChanged(editable);
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.f1189b).beforeTextChanged(charSequence, i2, i3, i4);
        }

        public void onSpanAdded(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f1190c.get() <= 0 || !(obj instanceof i)) {
                ((SpanWatcher) this.f1189b).onSpanAdded(spannable, obj, i2, i3);
            }
        }

        public void onSpanChanged(Spannable spannable, Object obj, int i2, int i3, int i4, int i5) {
            if (this.f1190c.get() <= 0 || !(obj instanceof i)) {
                ((SpanWatcher) this.f1189b).onSpanChanged(spannable, obj, i2, i3, i4, i5);
            }
        }

        public void onSpanRemoved(Spannable spannable, Object obj, int i2, int i3) {
            if (this.f1190c.get() <= 0 || !(obj instanceof i)) {
                ((SpanWatcher) this.f1189b).onSpanRemoved(spannable, obj, i2, i3);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            ((TextWatcher) this.f1189b).onTextChanged(charSequence, i2, i3, i4);
        }
    }

    public n(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        c.a.d(cls, "watcherClass cannot be null");
        this.f1187b = cls;
    }

    public n(Class<?> cls, CharSequence charSequence, int i2, int i3) {
        super(charSequence, i2, i3);
        c.a.d(cls, "watcherClass cannot be null");
        this.f1187b = cls;
    }

    public final void a() {
        for (int i2 = 0; i2 < this.f1188c.size(); i2++) {
            this.f1188c.get(i2).f1190c.incrementAndGet();
        }
    }

    public Editable append(char c2) {
        super.append(c2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public SpannableStringBuilder m2append(char c2) {
        super.append(c2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public SpannableStringBuilder m3append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public SpannableStringBuilder m4append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i2) {
        super.append(charSequence, obj, i2);
        return this;
    }

    public void b() {
        e();
        for (int i2 = 0; i2 < this.f1188c.size(); i2++) {
            ((TextWatcher) this.f1188c.get(i2).f1189b).onTextChanged(this, 0, length(), length());
        }
    }

    public final a c(Object obj) {
        for (int i2 = 0; i2 < this.f1188c.size(); i2++) {
            a aVar = this.f1188c.get(i2);
            if (aVar.f1189b == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f1187b == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"UnknownNullness"})
    public Editable delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: delete  reason: collision with other method in class */
    public SpannableStringBuilder m8delete(int i2, int i3) {
        super.delete(i2, i3);
        return this;
    }

    public final void e() {
        for (int i2 = 0; i2 < this.f1188c.size(); i2++) {
            this.f1188c.get(i2).f1190c.decrementAndGet();
        }
    }

    public int getSpanEnd(Object obj) {
        a c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        a c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        a c2;
        if (d(obj) && (c2 = c(obj)) != null) {
            obj = c2;
        }
        return super.getSpanStart(obj);
    }

    @SuppressLint({"UnknownNullness"})
    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        if (!(this.f1187b == cls)) {
            return super.getSpans(i2, i3, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i2, i3, a.class);
        T[] tArr = (Object[]) Array.newInstance(cls, aVarArr.length);
        for (int i4 = 0; i4 < aVarArr.length; i4++) {
            tArr[i4] = aVarArr[i4].f1189b;
        }
        return tArr;
    }

    @SuppressLint({"UnknownNullness"})
    public Editable insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: insert  reason: collision with other method in class */
    public SpannableStringBuilder m9insert(int i2, CharSequence charSequence) {
        super.insert(i2, charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: insert  reason: collision with other method in class */
    public SpannableStringBuilder m10insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        if ((r1.f1187b == r4) != false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int nextSpanTransition(int r2, int r3, java.lang.Class<androidx.emoji2.text.n.a> r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x000b
            java.lang.Class<?> r0 = r1.f1187b
            if (r0 != r4) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            if (r0 == 0) goto L_0x000d
        L_0x000b:
            java.lang.Class<androidx.emoji2.text.n$a> r4 = androidx.emoji2.text.n.a.class
        L_0x000d:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.n.nextSpanTransition(int, int, java.lang.Class):int");
    }

    public void removeSpan(Object obj) {
        a aVar;
        if (d(obj)) {
            aVar = c(obj);
            if (aVar != null) {
                obj = aVar;
            }
        } else {
            aVar = null;
        }
        super.removeSpan(obj);
        if (aVar != null) {
            this.f1188c.remove(aVar);
        }
    }

    @SuppressLint({"UnknownNullness"})
    public Editable replace(int i2, int i3, CharSequence charSequence) {
        a();
        super.replace(i2, i3, charSequence);
        e();
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: replace  reason: collision with other method in class */
    public SpannableStringBuilder m11replace(int i2, int i3, CharSequence charSequence) {
        a();
        super.replace(i2, i3, charSequence);
        e();
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    /* renamed from: replace  reason: collision with other method in class */
    public SpannableStringBuilder m12replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        a();
        super.replace(i2, i3, charSequence, i4, i5);
        e();
        return this;
    }

    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (d(obj)) {
            a aVar = new a(obj);
            this.f1188c.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i2, i3, i4);
    }

    @SuppressLint({"UnknownNullness"})
    public CharSequence subSequence(int i2, int i3) {
        return new n(this.f1187b, this, i2, i3);
    }

    public Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public Editable insert(int i2, CharSequence charSequence, int i3, int i4) {
        super.insert(i2, charSequence, i3, i4);
        return this;
    }

    @SuppressLint({"UnknownNullness"})
    public Editable replace(int i2, int i3, CharSequence charSequence, int i4, int i5) {
        a();
        super.replace(i2, i3, charSequence, i4, i5);
        e();
        return this;
    }

    public Editable append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m5append(char c2) {
        super.append(c2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m6append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public Appendable m7append(@SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i2, int i3) {
        super.append(charSequence, i2, i3);
        return this;
    }
}
