package o1;

import android.widget.Checkable;
import o1.i;

public interface i<T extends i<T>> extends Checkable {

    public interface a<C> {
    }

    int getId();

    void setInternalOnCheckedChangeListener(a<T> aVar);
}
