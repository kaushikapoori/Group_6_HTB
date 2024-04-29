package y;

import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int[] f4337a;

    /* renamed from: b  reason: collision with root package name */
    public final float[] f4338b;

    public f(int i2, int i3) {
        this.f4337a = new int[]{i2, i3};
        this.f4338b = new float[]{0.0f, 1.0f};
    }

    public f(int i2, int i3, int i4) {
        this.f4337a = new int[]{i2, i3, i4};
        this.f4338b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public f(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f4337a = new int[size];
        this.f4338b = new float[size];
        for (int i2 = 0; i2 < size; i2++) {
            this.f4337a[i2] = list.get(i2).intValue();
            this.f4338b[i2] = list2.get(i2).floatValue();
        }
    }
}
