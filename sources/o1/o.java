package o1;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class o {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<View> f3599a = new a();

    public class a implements Comparator<View> {
        public int compare(Object obj, Object obj2) {
            return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }

    public static List<TextView> a(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < toolbar.getChildCount(); i2++) {
            View childAt = toolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
