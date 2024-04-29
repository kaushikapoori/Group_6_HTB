package k0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import k0.b;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: b  reason: collision with root package name */
    public boolean f3294b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3295c;

    /* renamed from: d  reason: collision with root package name */
    public Cursor f3296d;

    /* renamed from: e  reason: collision with root package name */
    public Context f3297e;

    /* renamed from: f  reason: collision with root package name */
    public int f3298f;

    /* renamed from: g  reason: collision with root package name */
    public C0039a f3299g;

    /* renamed from: h  reason: collision with root package name */
    public DataSetObserver f3300h;

    /* renamed from: i  reason: collision with root package name */
    public b f3301i;

    /* renamed from: k0.a$a  reason: collision with other inner class name */
    public class C0039a extends ContentObserver {
        public C0039a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z2) {
            Cursor cursor;
            a aVar = a.this;
            if (aVar.f3295c && (cursor = aVar.f3296d) != null && !cursor.isClosed()) {
                aVar.f3294b = aVar.f3296d.requery();
            }
        }
    }

    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f3294b = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f3294b = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z2) {
        b bVar;
        boolean z3 = true;
        char c2 = z2 ? (char) 1 : 2;
        if ((c2 & 1) == 1) {
            c2 |= 2;
            this.f3295c = true;
        } else {
            this.f3295c = false;
        }
        z3 = cursor == null ? false : z3;
        this.f3296d = cursor;
        this.f3294b = z3;
        this.f3297e = context;
        this.f3298f = z3 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((c2 & 2) == 2) {
            this.f3299g = new C0039a();
            bVar = new b();
        } else {
            bVar = null;
            this.f3299g = null;
        }
        this.f3300h = bVar;
        if (z3) {
            C0039a aVar = this.f3299g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f3300h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f3296d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0039a aVar = this.f3299g;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f3300h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f3296d = cursor;
            if (cursor != null) {
                C0039a aVar2 = this.f3299g;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f3300h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f3298f = cursor.getColumnIndexOrThrow("_id");
                this.f3294b = true;
                notifyDataSetChanged();
            } else {
                this.f3298f = -1;
                this.f3294b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f3294b || (cursor = this.f3296d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f3294b) {
            return null;
        }
        this.f3296d.moveToPosition(i2);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.f3307l.inflate(cVar.f3306k, viewGroup, false);
        }
        a(view, this.f3297e, this.f3296d);
        return view;
    }

    public Filter getFilter() {
        if (this.f3301i == null) {
            this.f3301i = new b(this);
        }
        return this.f3301i;
    }

    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f3294b || (cursor = this.f3296d) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f3296d;
    }

    public long getItemId(int i2) {
        Cursor cursor;
        if (!this.f3294b || (cursor = this.f3296d) == null || !cursor.moveToPosition(i2)) {
            return 0;
        }
        return this.f3296d.getLong(this.f3298f);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f3294b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f3296d.moveToPosition(i2)) {
            if (view == null) {
                view = d(this.f3297e, this.f3296d, viewGroup);
            }
            a(view, this.f3297e, this.f3296d);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i2);
        }
    }
}
