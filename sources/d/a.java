package d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

public abstract class a {

    /* renamed from: d.a$a  reason: collision with other inner class name */
    public static class C0025a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f2689a;

        public C0025a(int i2, int i3) {
            super(i2, i3);
            this.f2689a = 0;
            this.f2689a = 8388627;
        }

        public C0025a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2689a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.c.f2039b);
            this.f2689a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0025a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2689a = 0;
        }

        public C0025a(C0025a aVar) {
            super(aVar);
            this.f2689a = 0;
            this.f2689a = aVar.f2689a;
        }
    }

    public interface b {
        void a(boolean z2);
    }

    @Deprecated
    public static abstract class c {
        public abstract void a();
    }

    public abstract void a(boolean z2);

    public abstract Context b();

    public abstract void c(boolean z2);
}
