package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import java.lang.reflect.Method;

public class q0 extends o0 implements p0 {
    public static Method E;
    public p0 D;

    public static class a extends j0 {

        /* renamed from: o  reason: collision with root package name */
        public final int f756o;

        /* renamed from: p  reason: collision with root package name */
        public final int f757p;

        /* renamed from: q  reason: collision with root package name */
        public p0 f758q;

        /* renamed from: r  reason: collision with root package name */
        public MenuItem f759r;

        public a(Context context, boolean z2) {
            super(context, z2);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f756o = 21;
                this.f757p = 22;
                return;
            }
            this.f756o = 22;
            this.f757p = 21;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i2;
            int pointToPosition;
            int i3;
            if (this.f758q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i2 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i2 = 0;
                }
                d dVar = (d) adapter;
                g gVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i3 = pointToPosition - i2) >= 0 && i3 < dVar.getCount()) {
                    gVar = dVar.getItem(i3);
                }
                MenuItem menuItem = this.f759r;
                if (menuItem != gVar) {
                    e eVar = dVar.f209b;
                    if (menuItem != null) {
                        this.f758q.k(eVar, menuItem);
                    }
                    this.f759r = gVar;
                    if (gVar != null) {
                        this.f758q.g(eVar, gVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.f756o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i2 != this.f757p) {
                return super.onKeyDown(i2, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((d) adapter).f209b.c(false);
                return true;
            }
        }

        public void setHoverListener(p0 p0Var) {
            this.f758q = p0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                E = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public q0(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, (AttributeSet) null, i2, i3);
    }

    public void g(e eVar, MenuItem menuItem) {
        p0 p0Var = this.D;
        if (p0Var != null) {
            p0Var.g(eVar, menuItem);
        }
    }

    public void k(e eVar, MenuItem menuItem) {
        p0 p0Var = this.D;
        if (p0Var != null) {
            p0Var.k(eVar, menuItem);
        }
    }

    public j0 q(Context context, boolean z2) {
        a aVar = new a(context, z2);
        aVar.setHoverListener(this);
        return aVar;
    }
}
