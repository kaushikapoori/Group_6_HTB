package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.e;
import c.c;
import com.example.supermarket.R;
import g0.u;
import g0.x;
import g0.y;

public abstract class a extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    public final C0001a f476b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f477c;

    /* renamed from: d  reason: collision with root package name */
    public ActionMenuView f478d;

    /* renamed from: e  reason: collision with root package name */
    public c f479e;

    /* renamed from: f  reason: collision with root package name */
    public int f480f;

    /* renamed from: g  reason: collision with root package name */
    public x f481g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f482h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f483i;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    public class C0001a implements y {

        /* renamed from: a  reason: collision with root package name */
        public boolean f484a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f485b;

        public C0001a() {
        }

        public void a(View view) {
            if (!this.f484a) {
                a aVar = a.this;
                aVar.f481g = null;
                a.super.setVisibility(this.f485b);
            }
        }

        public void b(View view) {
            a.super.setVisibility(0);
            this.f484a = false;
        }

        public void c(View view) {
            this.f484a = true;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f476b = new C0001a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f477c = context;
        } else {
            this.f477c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int c(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    public int d(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public x e(int i2, long j2) {
        x xVar = this.f481g;
        if (xVar != null) {
            xVar.b();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            x b2 = u.b(this);
            b2.a(1.0f);
            b2.c(j2);
            C0001a aVar = this.f476b;
            a.this.f481g = b2;
            aVar.f485b = i2;
            View view = (View) b2.f3085a.get();
            if (view != null) {
                b2.e(view, aVar);
            }
            return b2;
        }
        x b3 = u.b(this);
        b3.a(0.0f);
        b3.c(j2);
        C0001a aVar2 = this.f476b;
        a.this.f481g = b3;
        aVar2.f485b = i2;
        View view2 = (View) b3.f3085a.get();
        if (view2 != null) {
            b3.e(view2, aVar2);
        }
        return b3;
    }

    public int getAnimatedVisibility() {
        return this.f481g != null ? this.f476b.f485b : getVisibility();
    }

    public int getContentHeight() {
        return this.f480f;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, c.f2038a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f479e;
        if (cVar != null) {
            Configuration configuration2 = cVar.f160c.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            cVar.f536q = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            e eVar = cVar.f161d;
            if (eVar != null) {
                eVar.p(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f483i = false;
        }
        if (!this.f483i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f483i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f483i = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f482h = false;
        }
        if (!this.f482h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f482h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f482h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            x xVar = this.f481g;
            if (xVar != null) {
                xVar.b();
            }
            super.setVisibility(i2);
        }
    }
}
