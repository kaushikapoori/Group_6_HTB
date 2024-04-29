package u1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;
import t1.a;
import u1.m;

public class l extends m.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f3995b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Matrix f3996c;

    public l(m mVar, List list, Matrix matrix) {
        this.f3995b = list;
        this.f3996c = matrix;
    }

    public void a(Matrix matrix, a aVar, int i2, Canvas canvas) {
        for (m.f a2 : this.f3995b) {
            a2.a(this.f3996c, aVar, i2, canvas);
        }
    }
}
