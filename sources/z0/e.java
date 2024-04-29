package z0;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public class e extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f4427a = new Matrix();

    public e() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public Object get(Object obj) {
        this.f4427a.set(((ImageView) obj).getImageMatrix());
        return this.f4427a;
    }

    public void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
